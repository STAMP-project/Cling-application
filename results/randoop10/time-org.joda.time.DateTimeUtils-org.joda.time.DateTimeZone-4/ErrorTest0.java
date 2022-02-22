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
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.DateTimeField dateTimeField11 = chronology7.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        long long14 = chronology7.add((long) (byte) 100, (long) 1439, (-292275054));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant4 = dateTime3.toInstant();
        org.joda.time.MutableDateTime mutableDateTime5 = instant4.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology8.hourOfHalfday();
        org.joda.time.DurationField durationField10 = durationFieldType6.getField(chronology8);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) instant4, chronology8);
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType0.getField(chronology8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant4", (dateTime3.compareTo(instant4) == 0) == dateTime3.equals(instant4));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology12.hourOfHalfday();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.now(chronology12);
        boolean boolean15 = localTime10.isBefore((org.joda.time.ReadablePartial) localTime14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant13 = instant3.withDurationAdded(1645514154223L, 100);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant13, (org.joda.time.ReadableInstant) dateTime15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant13 = instant3.withDurationAdded(1645514154223L, 100);
        org.joda.time.Instant instant15 = instant3.minus((long) (byte) -1);
        long long16 = instant15.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime4 = instant3.toDateTime();
        org.joda.time.LocalDate localDate5 = dateTime4.toLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        java.util.GregorianCalendar gregorianCalendar4 = dateTime2.toGregorianCalendar();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("zh_TW");
        java.time.ZoneId zoneId7 = timeZone6.toZoneId();
        gregorianCalendar4.setTimeZone(timeZone6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime4 = instant3.toDateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.plusSeconds(70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant13 = instant3.withDurationAdded(1645514154223L, 100);
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType17 = periodType16.withSecondsRemoved();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.Interval interval20 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Chronology chronology22 = org.joda.time.DateTimeUtils.getChronology(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology22.hourOfHalfday();
        org.joda.time.DateTime dateTime24 = dateTime18.toDateTime(chronology22);
        org.joda.time.Period period25 = new org.joda.time.Period((long) 1, (long) ' ', periodType17, chronology22);
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) instant13, (org.joda.time.ReadablePeriod) period25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        java.util.GregorianCalendar gregorianCalendar4 = dateTime2.toGregorianCalendar();
        int int5 = gregorianCalendar4.getMinimalDaysInFirstWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(10L, chronology4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekyear();
        int int7 = dateTime5.get(dateTimeFieldType6);
        boolean boolean8 = localTime2.isSupported(dateTimeFieldType6);
        org.joda.time.LocalTime.Property property9 = localTime2.minuteOfHour();
        org.joda.time.LocalTime localTime10 = property9.withMaximumValue();
        org.joda.time.LocalTime localTime11 = property9.roundHalfCeilingCopy();
        boolean boolean12 = calendar1.after((java.lang.Object) property9);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime15 = dateTime13.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant16 = dateTime15.toInstant();
        java.util.GregorianCalendar gregorianCalendar17 = dateTime15.toGregorianCalendar();
        int int18 = calendar1.compareTo((java.util.Calendar) gregorianCalendar17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant16", (dateTime15.compareTo(instant16) == 0) == dateTime15.equals(instant16));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        java.lang.String str8 = dateTimeZone6.getName((long) ' ');
        java.lang.String str10 = dateTimeZone6.getName((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(0L, dateTimeZone6);
        org.joda.time.DateTime dateTime12 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime dateTime16 = interval15.getEnd();
        org.joda.time.Chronology chronology17 = dateTime16.getChronology();
        int int18 = dateTime16.getDayOfYear();
        org.joda.time.Instant instant19 = dateTime16.toInstant();
        boolean boolean20 = dateTime12.isEqual((org.joda.time.ReadableInstant) dateTime16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant19", (dateTime0.compareTo(instant19) == 0) == dateTime0.equals(instant19));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant4 = dateTime3.toInstant();
        org.joda.time.MutableDateTime mutableDateTime5 = instant4.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology8.hourOfHalfday();
        org.joda.time.DurationField durationField10 = durationFieldType6.getField(chronology8);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) instant4, chronology8);
        org.joda.time.DateTimeZone dateTimeZone12 = instant4.getZone();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(1645514170762L, dateTimeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant4", (dateTime3.compareTo(instant4) == 0) == dateTime3.equals(instant4));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime4 = instant3.toDateTime();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.eras();
        org.joda.time.Duration duration8 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.hourOfHalfday();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.now(chronology10);
        org.joda.time.Period period13 = duration8.toPeriod(chronology10);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(327L, chronology10);
        org.joda.time.DurationField durationField15 = durationFieldType5.getField(chronology10);
        org.joda.time.DateTime dateTime17 = dateTime4.withFieldAdded(durationFieldType5, (int) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.DateTimeField dateTimeField11 = chronology7.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) 54);
        org.joda.time.Minutes minutes2 = duration1.toStandardMinutes();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant6 = dateTime5.toInstant();
        org.joda.time.MutableDateTime mutableDateTime7 = instant6.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.hourOfHalfday();
        org.joda.time.DurationField durationField12 = durationFieldType8.getField(chronology10);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((java.lang.Object) instant6, chronology10);
        org.joda.time.Instant instant16 = instant6.withDurationAdded(1645514154223L, 100);
        org.joda.time.Interval interval17 = duration1.toIntervalTo((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Duration duration19 = duration1.withMillis(1645513200000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant6", (dateTime5.compareTo(instant6) == 0) == dateTime5.equals(instant6));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant13 = instant3.withDurationAdded(1645514154223L, 100);
        org.joda.time.Instant instant15 = instant3.minus((long) (byte) -1);
        org.joda.time.Instant instant18 = instant15.withDurationAdded((long) 0, 435);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.LocalTime localTime12 = localTime10.minusMillis(24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = dateTime3.getChronology();
        int int5 = dateTime3.getDayOfYear();
        org.joda.time.Instant instant6 = dateTime3.toInstant();
        org.joda.time.DateTime.Property property7 = dateTime3.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant6", (dateTime0.compareTo(instant6) == 0) == dateTime0.equals(instant6));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant11 = dateTime10.toInstant();
        org.joda.time.MutableDateTime mutableDateTime12 = instant11.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getChronology(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.hourOfHalfday();
        org.joda.time.DurationField durationField17 = durationFieldType13.getField(chronology15);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((java.lang.Object) instant11, chronology15);
        org.joda.time.DateTimeZone dateTimeZone19 = instant11.getZone();
        org.joda.time.DateTime dateTime20 = dateTime7.toDateTime(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant11", (dateTime10.compareTo(instant11) == 0) == dateTime10.equals(instant11));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) 54);
        org.joda.time.Minutes minutes2 = duration1.toStandardMinutes();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant6 = dateTime5.toInstant();
        org.joda.time.MutableDateTime mutableDateTime7 = instant6.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.hourOfHalfday();
        org.joda.time.DurationField durationField12 = durationFieldType8.getField(chronology10);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((java.lang.Object) instant6, chronology10);
        org.joda.time.Instant instant16 = instant6.withDurationAdded(1645514154223L, 100);
        org.joda.time.Interval interval17 = duration1.toIntervalTo((org.joda.time.ReadableInstant) instant6);
        long long18 = interval17.getStartMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant6", (dateTime5.compareTo(instant6) == 0) == dateTime5.equals(instant6));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant13 = instant3.withDurationAdded(1645514154223L, 100);
        long long14 = instant3.getMillis();
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getInstantChronology((org.joda.time.ReadableInstant) instant3);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(10L, chronology17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.weekyear();
        int int20 = dateTime18.get(dateTimeFieldType19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 10, chronology22);
        boolean boolean24 = dateTime18.isEqual((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property26 = dateTime25.era();
        boolean boolean27 = dateTime23.isBefore((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType31 = periodType30.withSecondsRemoved();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Chronology chronology36 = org.joda.time.DateTimeUtils.getChronology(chronology35);
        org.joda.time.DateTimeField dateTimeField37 = chronology36.hourOfHalfday();
        org.joda.time.DateTime dateTime38 = dateTime32.toDateTime(chronology36);
        org.joda.time.Period period39 = new org.joda.time.Period((long) 1, (long) ' ', periodType31, chronology36);
        org.joda.time.DateTime dateTime40 = dateTime25.plus((org.joda.time.ReadablePeriod) period39);
        org.joda.time.Period period42 = period39.withDays(999);
        int[] intArray44 = chronology15.get((org.joda.time.ReadablePeriod) period42, (long) 38270);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime4 = instant3.toDateTime();
        int int5 = dateTime4.getCenturyOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(10L, chronology2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        int int5 = dateTime3.get(dateTimeFieldType4);
        boolean boolean6 = localTime0.isSupported(dateTimeFieldType4);
        org.joda.time.LocalTime.Property property7 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime8 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime9 = property7.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getChronology(chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology14.hourOfHalfday();
        org.joda.time.DateTime dateTime16 = dateTime10.toDateTime(chronology14);
        org.joda.time.DurationField durationField17 = chronology14.millis();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology14);
        org.joda.time.Instant instant19 = dateTime18.toInstant();
        long long20 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant19", (dateTime10.compareTo(instant19) == 0) == dateTime10.equals(instant19));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.Interval interval1 = org.joda.time.Interval.parse("2022-02-22T07:16:05.197Z/2022-02-22T07:16:05.197Z");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval();
        boolean boolean3 = interval1.isAfter((org.joda.time.ReadableInterval) mutableInterval2);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        org.joda.time.MutableDateTime mutableDateTime8 = instant7.toMutableDateTimeISO();
        org.joda.time.Duration duration10 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.Interval interval13 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) dateTime12);
        int int14 = dateTime11.getMinuteOfDay();
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime17 = dateTime11.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = dateTime11.toDateTime(chronology18);
        org.joda.time.DateTime dateTime21 = dateTime11.minus((long) 10);
        org.joda.time.Period period22 = duration10.toPeriodFrom((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property24 = dateTime23.era();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime27 = dateTime25.plusWeeks((int) (byte) 1);
        int int28 = property24.compareTo((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime();
        org.joda.time.Interval interval31 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime30);
        boolean boolean33 = interval31.isAfter((long) 10);
        org.joda.time.Duration duration34 = interval31.toDuration();
        org.joda.time.Duration duration37 = duration34.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval38 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableDuration) duration37);
        org.joda.time.Duration duration40 = duration10.withDurationAdded((org.joda.time.ReadableDuration) duration37, 26160257);
        org.joda.time.Instant instant41 = instant7.plus((org.joda.time.ReadableDuration) duration37);
        long long42 = instant7.getMillis();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime();
        org.joda.time.Interval interval45 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) dateTime44);
        int int46 = dateTime43.getMinuteOfDay();
        org.joda.time.DateTime dateTime48 = dateTime43.minusHours((int) 'a');
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate51 = localDate49.withCenturyOfEra(382);
        org.joda.time.LocalDate localDate53 = localDate51.plusDays((int) (byte) 10);
        org.joda.time.Interval interval54 = localDate53.toInterval();
        org.joda.time.DateTime dateTime55 = localDate53.toDateTimeAtStartOfDay();
        boolean boolean56 = dateTime48.isBefore((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.DateTime dateTime58 = dateTime48.plusMinutes(26151451);
        mutableInterval2.setInterval((org.joda.time.ReadableInstant) instant7, (org.joda.time.ReadableInstant) dateTime58);
        int int60 = dateTime58.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant7", (dateTime6.compareTo(instant7) == 0) == dateTime6.equals(instant7));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime.Property property1 = localTime0.hourOfDay();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = localDateTime6.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears(26151451);
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#');
        int int14 = period12.getValue(0);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.Duration duration18 = period12.toDurationTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime10.withPeriodAdded((org.joda.time.ReadablePeriod) period12, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean22 = localDateTime10.isSupported(dateTimeFieldType21);
        int int23 = instant5.get(dateTimeFieldType21);
        boolean boolean24 = localTime0.isSupported(dateTimeFieldType21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant5", (dateTime4.compareTo(instant5) == 0) == dateTime4.equals(instant5));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        org.joda.time.DateTime dateTime5 = dateTime0.minusHours((int) 'a');
        org.joda.time.DateTime dateTime6 = dateTime5.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime8 = dateTime5.withYear(38222);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getChronology(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology13.hourOfHalfday();
        org.joda.time.DateTime dateTime15 = dateTime9.toDateTime(chronology13);
        org.joda.time.DurationField durationField16 = chronology13.millis();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology13);
        org.joda.time.Instant instant18 = dateTime17.toInstant();
        java.lang.String str19 = instant18.toString();
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusWeeks((int) (byte) 10);
        org.joda.time.Period period25 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationFrom(readableInstant26);
        long long28 = duration27.getMillis();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime23.plus((org.joda.time.ReadableDuration) duration27);
        mutableInterval20.setDurationAfterStart((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Duration duration31 = mutableInterval20.toDuration();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minusWeeks((int) (byte) 10);
        org.joda.time.Period period36 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period36.toDurationFrom(readableInstant37);
        long long39 = duration38.getMillis();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime34.plus((org.joda.time.ReadableDuration) duration38);
        long long41 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration38);
        boolean boolean42 = duration31.isShorterThan((org.joda.time.ReadableDuration) duration38);
        long long43 = duration38.getStandardDays();
        org.joda.time.Duration duration45 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime();
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime46, (org.joda.time.ReadableInstant) dateTime47);
        int int49 = dateTime46.getMinuteOfDay();
        org.joda.time.Period period51 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime52 = dateTime46.plus((org.joda.time.ReadablePeriod) period51);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = dateTime46.toDateTime(chronology53);
        org.joda.time.DateTime dateTime56 = dateTime46.minus((long) 10);
        org.joda.time.Period period57 = duration45.toPeriodFrom((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property59 = dateTime58.era();
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime62 = dateTime60.plusWeeks((int) (byte) 1);
        int int63 = property59.compareTo((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime();
        org.joda.time.Interval interval66 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime64, (org.joda.time.ReadableInstant) dateTime65);
        boolean boolean68 = interval66.isAfter((long) 10);
        org.joda.time.Duration duration69 = interval66.toDuration();
        org.joda.time.Duration duration72 = duration69.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval73 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime60, (org.joda.time.ReadableDuration) duration72);
        org.joda.time.Duration duration75 = duration45.withDurationAdded((org.joda.time.ReadableDuration) duration72, 26160257);
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime();
        org.joda.time.Interval interval78 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime76, (org.joda.time.ReadableInstant) dateTime77);
        boolean boolean80 = interval78.isAfter((long) 10);
        org.joda.time.Duration duration81 = interval78.toDuration();
        boolean boolean82 = duration75.isLongerThan((org.joda.time.ReadableDuration) duration81);
        int int83 = duration38.compareTo((org.joda.time.ReadableDuration) duration75);
        long long84 = duration75.getStandardDays();
        org.joda.time.Instant instant86 = instant18.withDurationAdded((org.joda.time.ReadableDuration) duration75, 70);
        boolean boolean87 = dateTime5.isBefore((org.joda.time.ReadableInstant) instant86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant18", (dateTime0.compareTo(instant18) == 0) == dateTime0.equals(instant18));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) 54);
        org.joda.time.Minutes minutes6 = duration5.toStandardMinutes();
        long long7 = duration5.getStandardMinutes();
        org.joda.time.Instant instant9 = instant3.withDurationAdded((org.joda.time.ReadableDuration) duration5, 26171);
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusWeeks((int) (byte) 10);
        org.joda.time.Period period15 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationFrom(readableInstant16);
        long long18 = duration17.getMillis();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.plus((org.joda.time.ReadableDuration) duration17);
        mutableInterval10.setDurationAfterStart((org.joda.time.ReadableDuration) duration17);
        org.joda.time.Duration duration21 = mutableInterval10.toDuration();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusWeeks((int) (byte) 10);
        org.joda.time.Period period26 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = period26.toDurationFrom(readableInstant27);
        long long29 = duration28.getMillis();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.plus((org.joda.time.ReadableDuration) duration28);
        long long31 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration28);
        boolean boolean32 = duration21.isShorterThan((org.joda.time.ReadableDuration) duration28);
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusWeeks((int) (byte) 10);
        org.joda.time.Period period38 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = period38.toDurationFrom(readableInstant39);
        long long41 = duration40.getMillis();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime36.plus((org.joda.time.ReadableDuration) duration40);
        mutableInterval33.setDurationAfterStart((org.joda.time.ReadableDuration) duration40);
        org.joda.time.Duration duration44 = mutableInterval33.toDuration();
        boolean boolean45 = duration28.isShorterThan((org.joda.time.ReadableDuration) duration44);
        boolean boolean46 = duration5.isEqual((org.joda.time.ReadableDuration) duration44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.era();
        org.joda.time.DateTime dateTime3 = dateTime0.plusWeeks(100);
        org.joda.time.Period period12 = new org.joda.time.Period(22, (int) (short) 10, (int) '#', (int) (short) 100, 32772, 3, 0, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime0.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property15 = dateTime14.millisOfDay();
        org.joda.time.DateTime dateTime16 = dateTime14.withTimeAtStartOfDay();
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#');
        int int20 = period18.getValue(0);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Duration duration24 = period18.toDurationTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Chronology chronology25 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime26 = dateTime13.toDateTime(chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.year();
        org.joda.time.DurationField durationField28 = chronology25.eras();
        org.joda.time.DurationField durationField29 = chronology25.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField29, and durationField28", !(durationField28.compareTo(durationField29) == 0) || (Math.signum(durationField28.compareTo(durationField28)) == Math.signum(durationField29.compareTo(durationField28))));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.millisOfDay();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#');
        int int7 = period5.getValue(0);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.Interval interval10 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Duration duration11 = period5.toDurationTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTimeField dateTimeField13 = chronology12.millisOfDay();
        org.joda.time.Period period14 = new org.joda.time.Period(obj0, chronology12);
        org.joda.time.Period period16 = period14.withMonths(474);
        org.joda.time.Period period17 = period14.toPeriod();
        org.joda.time.Period period19 = period14.withDays(52);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime22 = dateTime20.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant23 = dateTime22.toInstant();
        org.joda.time.DateTime dateTime24 = instant23.toDateTime();
        org.joda.time.Interval interval25 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period19, (org.joda.time.ReadableInstant) dateTime24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant23", (dateTime22.compareTo(instant23) == 0) == dateTime22.equals(instant23));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Instant instant7 = instant3.withDurationAdded((-1L), 21);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.Interval interval10 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime9);
        boolean boolean12 = interval10.isAfter((long) 10);
        org.joda.time.Duration duration13 = interval10.toDuration();
        org.joda.time.Duration duration16 = duration13.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Instant instant18 = instant7.withDurationAdded((org.joda.time.ReadableDuration) duration16, 57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Duration duration6 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        int int10 = dateTime7.getMinuteOfDay();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime13 = dateTime7.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime7.toDateTime(chronology14);
        org.joda.time.DateTime dateTime17 = dateTime7.minus((long) 10);
        org.joda.time.Period period18 = duration6.toPeriodFrom((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property20 = dateTime19.era();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.plusWeeks((int) (byte) 1);
        int int24 = property20.compareTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime26);
        boolean boolean29 = interval27.isAfter((long) 10);
        org.joda.time.Duration duration30 = interval27.toDuration();
        org.joda.time.Duration duration33 = duration30.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableDuration) duration33);
        org.joda.time.Duration duration36 = duration6.withDurationAdded((org.joda.time.ReadableDuration) duration33, 26160257);
        org.joda.time.Instant instant37 = instant3.plus((org.joda.time.ReadableDuration) duration33);
        org.joda.time.DateTime dateTime38 = instant3.toDateTime();
        org.joda.time.Instant instant39 = new org.joda.time.Instant();
        int int40 = instant3.compareTo((org.joda.time.ReadableInstant) instant39);
        org.joda.time.Duration duration42 = org.joda.time.Duration.standardMinutes((long) 54);
        org.joda.time.Minutes minutes43 = duration42.toStandardMinutes();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime46 = dateTime44.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant47 = dateTime46.toInstant();
        org.joda.time.MutableDateTime mutableDateTime48 = instant47.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType49 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Chronology chronology51 = org.joda.time.DateTimeUtils.getChronology(chronology50);
        org.joda.time.DateTimeField dateTimeField52 = chronology51.hourOfHalfday();
        org.joda.time.DurationField durationField53 = durationFieldType49.getField(chronology51);
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime((java.lang.Object) instant47, chronology51);
        org.joda.time.Instant instant57 = instant47.withDurationAdded(1645514154223L, 100);
        org.joda.time.Interval interval58 = duration42.toIntervalTo((org.joda.time.ReadableInstant) instant47);
        org.joda.time.Instant instant60 = instant3.withDurationAdded((org.joda.time.ReadableDuration) duration42, (int) ' ');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant39", (dateTime0.compareTo(instant39) == 0) == dateTime0.equals(instant39));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        java.util.GregorianCalendar gregorianCalendar4 = dateTime2.toGregorianCalendar();
        boolean boolean6 = gregorianCalendar4.after((java.lang.Object) 26183771);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        boolean boolean4 = interval2.isAfter((long) 10);
        org.joda.time.Duration duration5 = interval2.toDuration();
        org.joda.time.Duration duration8 = duration5.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime10);
        int int12 = dateTime9.getMinuteOfDay();
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime15 = dateTime9.plus((org.joda.time.ReadablePeriod) period14);
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.Period period17 = duration5.toPeriodFrom((org.joda.time.ReadableInstant) dateTime9, periodType16);
        org.joda.time.DateTime dateTime19 = dateTime9.plusSeconds(2036);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime22 = dateTime20.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant23 = dateTime22.toInstant();
        org.joda.time.MutableDateTime mutableDateTime24 = instant23.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Chronology chronology27 = org.joda.time.DateTimeUtils.getChronology(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology27.hourOfHalfday();
        org.joda.time.DurationField durationField29 = durationFieldType25.getField(chronology27);
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((java.lang.Object) instant23, chronology27);
        org.joda.time.Instant instant33 = instant23.withDurationAdded(1645514154223L, 100);
        int int34 = dateTime19.compareTo((org.joda.time.ReadableInstant) instant23);
        org.joda.time.Instant instant35 = dateTime19.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant23", (dateTime22.compareTo(instant23) == 0) == dateTime22.equals(instant23));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant12 = instant3.plus(1645514151873L);
        org.joda.time.DateTime dateTime13 = instant3.toDateTimeISO();
        org.joda.time.DateTime dateTime15 = dateTime13.minusSeconds(1692);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = instant0.getChronology();
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        org.joda.time.Duration duration9 = duration5.withDurationAdded((long) 32772, (int) (byte) 10);
        java.lang.String str10 = duration5.toString();
        org.joda.time.Period period11 = duration5.toPeriod();
        org.joda.time.Instant instant12 = instant0.plus((org.joda.time.ReadableDuration) duration5);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) ' ', dateTimeZone14);
        int int16 = dateTime15.getYearOfCentury();
        org.joda.time.DateTime.Property property17 = dateTime15.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property17.getFieldType();
        org.joda.time.Interval interval19 = property17.toInterval();
        org.joda.time.MutableInterval mutableInterval20 = interval19.toMutableInterval();
        org.joda.time.Duration duration21 = interval19.toDuration();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime24 = dateTime22.plusWeeks((int) (byte) 1);
        org.joda.time.DateTime.Property property25 = dateTime24.secondOfDay();
        org.joda.time.Chronology chronology26 = dateTime24.getChronology();
        org.joda.time.Interval interval27 = duration21.toIntervalTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Instant instant28 = instant12.plus((org.joda.time.ReadableDuration) duration21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime22", (instant0.compareTo(dateTime22) == 0) == instant0.equals(dateTime22));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Instant instant7 = instant3.withDurationAdded((-1L), 21);
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusWeeks((int) (byte) 10);
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationFrom(readableInstant14);
        long long16 = duration15.getMillis();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plus((org.joda.time.ReadableDuration) duration15);
        mutableInterval8.setDurationAfterStart((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Duration duration19 = mutableInterval8.toDuration();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minusWeeks((int) (byte) 10);
        org.joda.time.Period period24 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period24.toDurationFrom(readableInstant25);
        long long27 = duration26.getMillis();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.plus((org.joda.time.ReadableDuration) duration26);
        long long29 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration26);
        boolean boolean30 = duration19.isShorterThan((org.joda.time.ReadableDuration) duration26);
        long long31 = duration26.getStandardDays();
        org.joda.time.Duration duration33 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime();
        org.joda.time.Interval interval36 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime34, (org.joda.time.ReadableInstant) dateTime35);
        int int37 = dateTime34.getMinuteOfDay();
        org.joda.time.Period period39 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime40 = dateTime34.plus((org.joda.time.ReadablePeriod) period39);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = dateTime34.toDateTime(chronology41);
        org.joda.time.DateTime dateTime44 = dateTime34.minus((long) 10);
        org.joda.time.Period period45 = duration33.toPeriodFrom((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property47 = dateTime46.era();
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime50 = dateTime48.plusWeeks((int) (byte) 1);
        int int51 = property47.compareTo((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime();
        org.joda.time.Interval interval54 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime52, (org.joda.time.ReadableInstant) dateTime53);
        boolean boolean56 = interval54.isAfter((long) 10);
        org.joda.time.Duration duration57 = interval54.toDuration();
        org.joda.time.Duration duration60 = duration57.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval61 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime48, (org.joda.time.ReadableDuration) duration60);
        org.joda.time.Duration duration63 = duration33.withDurationAdded((org.joda.time.ReadableDuration) duration60, 26160257);
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime();
        org.joda.time.Interval interval66 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime64, (org.joda.time.ReadableInstant) dateTime65);
        boolean boolean68 = interval66.isAfter((long) 10);
        org.joda.time.Duration duration69 = interval66.toDuration();
        boolean boolean70 = duration63.isLongerThan((org.joda.time.ReadableDuration) duration69);
        int int71 = duration26.compareTo((org.joda.time.ReadableDuration) duration63);
        long long72 = duration63.getStandardDays();
        org.joda.time.Instant instant73 = instant7.minus((org.joda.time.ReadableDuration) duration63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) 54);
        org.joda.time.Minutes minutes6 = duration5.toStandardMinutes();
        long long7 = duration5.getStandardMinutes();
        org.joda.time.Instant instant9 = instant3.withDurationAdded((org.joda.time.ReadableDuration) duration5, 26171);
        org.joda.time.Duration duration12 = duration5.withDurationAdded((long) 26181277, 26183771);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        java.util.GregorianCalendar gregorianCalendar4 = dateTime2.toGregorianCalendar();
        boolean boolean5 = gregorianCalendar4.isLenient();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant13 = instant3.withDurationAdded((long) 459, 0);
        boolean boolean14 = instant13.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant13", (dateTime2.compareTo(instant13) == 0) == dateTime2.equals(instant13));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant13 = instant3.withDurationAdded((long) 459, 0);
        org.joda.time.DateTime dateTime14 = instant13.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant13", (dateTime2.compareTo(instant13) == 0) == dateTime2.equals(instant13));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Duration duration6 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        int int10 = dateTime7.getMinuteOfDay();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime13 = dateTime7.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime7.toDateTime(chronology14);
        org.joda.time.DateTime dateTime17 = dateTime7.minus((long) 10);
        org.joda.time.Period period18 = duration6.toPeriodFrom((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property20 = dateTime19.era();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.plusWeeks((int) (byte) 1);
        int int24 = property20.compareTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime26);
        boolean boolean29 = interval27.isAfter((long) 10);
        org.joda.time.Duration duration30 = interval27.toDuration();
        org.joda.time.Duration duration33 = duration30.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableDuration) duration33);
        org.joda.time.Duration duration36 = duration6.withDurationAdded((org.joda.time.ReadableDuration) duration33, 26160257);
        org.joda.time.Instant instant37 = instant3.plus((org.joda.time.ReadableDuration) duration33);
        org.joda.time.DateTime dateTime38 = instant3.toDateTime();
        org.joda.time.DateTime dateTime40 = dateTime38.plusDays(26227837);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) 54);
        org.joda.time.Minutes minutes6 = duration5.toStandardMinutes();
        long long7 = duration5.getStandardMinutes();
        org.joda.time.Instant instant9 = instant3.withDurationAdded((org.joda.time.ReadableDuration) duration5, 26171);
        org.joda.time.DateTime dateTime10 = instant9.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays(21L);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime4 = localTime2.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial5 = null;
        org.joda.time.LocalTime localTime6 = localTime4.withFields(readablePartial5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology8);
        int int10 = localTime9.getSecondOfMinute();
        org.joda.time.Period period11 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime4, (org.joda.time.ReadablePartial) localTime9);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.Period period13 = period11.plus(readablePeriod12);
        org.joda.time.Period period15 = period11.withSeconds(53);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant19 = dateTime18.toInstant();
        org.joda.time.Duration duration20 = period11.toDurationTo((org.joda.time.ReadableInstant) instant19);
        org.joda.time.Duration duration22 = duration1.withDurationAdded((org.joda.time.ReadableDuration) duration20, 703);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant19", (dateTime18.compareTo(instant19) == 0) == dateTime18.equals(instant19));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        java.lang.String str3 = interval2.toString();
        boolean boolean4 = interval2.isAfterNow();
        org.joda.time.Duration duration5 = interval2.toDuration();
        org.joda.time.Interval interval7 = org.joda.time.Interval.parse("2022-02-22T07:16:05.197Z/2022-02-22T07:16:05.197Z");
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval();
        boolean boolean9 = interval7.isAfter((org.joda.time.ReadableInterval) mutableInterval8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime12 = dateTime10.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant13 = dateTime12.toInstant();
        org.joda.time.MutableDateTime mutableDateTime14 = instant13.toMutableDateTimeISO();
        org.joda.time.Duration duration16 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime18);
        int int20 = dateTime17.getMinuteOfDay();
        org.joda.time.Period period22 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime23 = dateTime17.plus((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = dateTime17.toDateTime(chronology24);
        org.joda.time.DateTime dateTime27 = dateTime17.minus((long) 10);
        org.joda.time.Period period28 = duration16.toPeriodFrom((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property30 = dateTime29.era();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime33 = dateTime31.plusWeeks((int) (byte) 1);
        int int34 = property30.compareTo((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime();
        org.joda.time.Interval interval37 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateTime36);
        boolean boolean39 = interval37.isAfter((long) 10);
        org.joda.time.Duration duration40 = interval37.toDuration();
        org.joda.time.Duration duration43 = duration40.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval44 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableDuration) duration43);
        org.joda.time.Duration duration46 = duration16.withDurationAdded((org.joda.time.ReadableDuration) duration43, 26160257);
        org.joda.time.Instant instant47 = instant13.plus((org.joda.time.ReadableDuration) duration43);
        long long48 = instant13.getMillis();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime();
        org.joda.time.Interval interval51 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime49, (org.joda.time.ReadableInstant) dateTime50);
        int int52 = dateTime49.getMinuteOfDay();
        org.joda.time.DateTime dateTime54 = dateTime49.minusHours((int) 'a');
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate57 = localDate55.withCenturyOfEra(382);
        org.joda.time.LocalDate localDate59 = localDate57.plusDays((int) (byte) 10);
        org.joda.time.Interval interval60 = localDate59.toInterval();
        org.joda.time.DateTime dateTime61 = localDate59.toDateTimeAtStartOfDay();
        boolean boolean62 = dateTime54.isBefore((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.DateTime dateTime64 = dateTime54.plusMinutes(26151451);
        mutableInterval8.setInterval((org.joda.time.ReadableInstant) instant13, (org.joda.time.ReadableInstant) dateTime64);
        boolean boolean66 = interval2.isBefore((org.joda.time.ReadableInstant) instant13);
        org.joda.time.MutableInterval mutableInterval67 = interval2.toMutableInterval();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant13", (dateTime12.compareTo(instant13) == 0) == dateTime12.equals(instant13));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Duration duration6 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        int int10 = dateTime7.getMinuteOfDay();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime13 = dateTime7.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime7.toDateTime(chronology14);
        org.joda.time.DateTime dateTime17 = dateTime7.minus((long) 10);
        org.joda.time.Period period18 = duration6.toPeriodFrom((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property20 = dateTime19.era();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.plusWeeks((int) (byte) 1);
        int int24 = property20.compareTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime26);
        boolean boolean29 = interval27.isAfter((long) 10);
        org.joda.time.Duration duration30 = interval27.toDuration();
        org.joda.time.Duration duration33 = duration30.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableDuration) duration33);
        org.joda.time.Duration duration36 = duration6.withDurationAdded((org.joda.time.ReadableDuration) duration33, 26160257);
        org.joda.time.Instant instant37 = instant3.plus((org.joda.time.ReadableDuration) duration33);
        org.joda.time.DateTime dateTime38 = instant3.toDateTime();
        org.joda.time.Instant instant39 = new org.joda.time.Instant();
        int int40 = instant3.compareTo((org.joda.time.ReadableInstant) instant39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeUtils.getZone(dateTimeZone41);
        boolean boolean44 = dateTimeZone42.equals((java.lang.Object) 1645514161708L);
        org.joda.time.DateTime dateTime45 = instant3.toDateTime(dateTimeZone42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant39", (dateTime0.compareTo(instant39) == 0) == dateTime0.equals(instant39));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant13 = instant3.withDurationAdded(1645514154223L, 100);
        long long14 = instant3.getMillis();
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getInstantChronology((org.joda.time.ReadableInstant) instant3);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = localDateTime1.getFieldType((int) (short) 1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        boolean boolean7 = dateTimeFieldType3.isSupported(chronology5);
        org.joda.time.DurationField durationField8 = durationFieldType0.getField(chronology5);
        org.joda.time.DurationField durationField9 = chronology5.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField9, and durationField8", !(durationField8.compareTo(durationField9) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField9.compareTo(durationField8))));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        java.lang.String str3 = interval2.toString();
        org.joda.time.DateTime dateTime4 = interval2.getEnd();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusWeeks((int) (byte) 10);
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        long long12 = duration11.getMillis();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.plus((org.joda.time.ReadableDuration) duration11);
        boolean boolean14 = interval2.equals((java.lang.Object) duration11);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime16);
        boolean boolean19 = interval17.isAfter((long) 10);
        org.joda.time.Interval interval20 = interval2.overlap((org.joda.time.ReadableInterval) interval17);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.months();
        org.joda.time.Period period22 = interval2.toPeriod(periodType21);
        org.joda.time.DateTime dateTime23 = interval2.getStart();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.Interval interval26 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime27 = interval26.getEnd();
        org.joda.time.Interval interval28 = interval26.toInterval();
        org.joda.time.MutableInterval mutableInterval29 = interval28.toMutableInterval();
        boolean boolean30 = interval2.isBefore((org.joda.time.ReadableInterval) interval28);
        org.joda.time.Chronology chronology31 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInterval) interval28);
        org.joda.time.MutableInterval mutableInterval32 = interval28.toMutableInterval();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime35 = dateTime33.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant36 = dateTime35.toInstant();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = localDateTime37.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime37.plusYears(26151451);
        org.joda.time.Period period43 = new org.joda.time.Period((long) '#');
        int int45 = period43.getValue(0);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime();
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime46, (org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Duration duration49 = period43.toDurationTo((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime41.withPeriodAdded((org.joda.time.ReadablePeriod) period43, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean53 = localDateTime41.isSupported(dateTimeFieldType52);
        int int54 = instant36.get(dateTimeFieldType52);
        org.joda.time.MutableDateTime mutableDateTime55 = instant36.toMutableDateTimeISO();
        boolean boolean56 = mutableInterval32.contains((org.joda.time.ReadableInstant) mutableDateTime55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and instant36", (dateTime35.compareTo(instant36) == 0) == dateTime35.equals(instant36));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.LocalTime localTime4 = localTime2.withFields(readablePartial3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology6);
        int int8 = localTime7.getSecondOfMinute();
        org.joda.time.Period period9 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime2, (org.joda.time.ReadablePartial) localTime7);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.Period period11 = period9.plus(readablePeriod10);
        org.joda.time.Period period13 = period9.withSeconds(53);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime16 = dateTime14.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant17 = dateTime16.toInstant();
        org.joda.time.Duration duration18 = period9.toDurationTo((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Hours hours19 = duration18.toStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant17", (dateTime16.compareTo(instant17) == 0) == dateTime16.equals(instant17));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) ' ', dateTimeZone1);
        int int3 = dateTime2.getYearOfCentury();
        org.joda.time.DateTime.Property property4 = dateTime2.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property4.getFieldType();
        org.joda.time.Interval interval6 = property4.toInterval();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant10 = dateTime9.toInstant();
        org.joda.time.MutableDateTime mutableDateTime11 = instant10.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getChronology(chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology14.hourOfHalfday();
        org.joda.time.DurationField durationField16 = durationFieldType12.getField(chronology14);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((java.lang.Object) instant10, chronology14);
        boolean boolean18 = interval6.isBefore((org.joda.time.ReadableInstant) instant10);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(10L, chronology20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.weekyear();
        int int23 = dateTime21.get(dateTimeFieldType22);
        org.joda.time.Period period25 = new org.joda.time.Period((long) '#');
        int int27 = period25.getValue(0);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        org.joda.time.Interval interval30 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Duration duration31 = period25.toDurationTo((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadablePeriod) period25);
        mutableInterval32.setStartMillis((long) (short) 0);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime();
        org.joda.time.Interval interval37 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getChronology(chronology38);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.hourOfHalfday();
        org.joda.time.DateTime dateTime41 = dateTime35.toDateTime(chronology39);
        org.joda.time.DateTime.Property property42 = dateTime35.monthOfYear();
        boolean boolean43 = mutableInterval32.contains((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime();
        org.joda.time.Interval interval46 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTime dateTime47 = interval46.getEnd();
        org.joda.time.Interval interval48 = interval46.toInterval();
        org.joda.time.Interval interval50 = interval48.withStartMillis((long) (short) 1);
        boolean boolean51 = mutableInterval32.equals((java.lang.Object) interval50);
        boolean boolean52 = interval6.abuts((org.joda.time.ReadableInterval) mutableInterval32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant10", (dateTime9.compareTo(instant10) == 0) == dateTime9.equals(instant10));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime4.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusYears(26151451);
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#');
        int int12 = period10.getValue(0);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Duration duration16 = period10.toDurationTo((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime8.withPeriodAdded((org.joda.time.ReadablePeriod) period10, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean20 = localDateTime8.isSupported(dateTimeFieldType19);
        int int21 = instant3.get(dateTimeFieldType19);
        org.joda.time.Duration duration23 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.Interval interval26 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime25);
        int int27 = dateTime24.getMinuteOfDay();
        org.joda.time.Period period29 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime30 = dateTime24.plus((org.joda.time.ReadablePeriod) period29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = dateTime24.toDateTime(chronology31);
        org.joda.time.DateTime dateTime34 = dateTime24.minus((long) 10);
        org.joda.time.Period period35 = duration23.toPeriodFrom((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Instant instant36 = instant3.plus((org.joda.time.ReadableDuration) duration23);
        java.lang.String str37 = instant36.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant13 = instant3.withDurationAdded(1645514154223L, 100);
        long long14 = instant3.getMillis();
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getInstantChronology((org.joda.time.ReadableInstant) instant3);
        org.joda.time.DateTime dateTime16 = instant3.toDateTimeISO();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(10L, chronology18);
        org.joda.time.DateTime dateTime21 = dateTime19.minus(100L);
        org.joda.time.Duration duration23 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.Interval interval26 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime25);
        int int27 = dateTime24.getMinuteOfDay();
        org.joda.time.Period period29 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime30 = dateTime24.plus((org.joda.time.ReadablePeriod) period29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = dateTime24.toDateTime(chronology31);
        org.joda.time.DateTime dateTime34 = dateTime24.minus((long) 10);
        org.joda.time.Period period35 = duration23.toPeriodFrom((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property37 = dateTime36.era();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime40 = dateTime38.plusWeeks((int) (byte) 1);
        int int41 = property37.compareTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime();
        org.joda.time.Interval interval44 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime42, (org.joda.time.ReadableInstant) dateTime43);
        boolean boolean46 = interval44.isAfter((long) 10);
        org.joda.time.Duration duration47 = interval44.toDuration();
        org.joda.time.Duration duration50 = duration47.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval51 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime38, (org.joda.time.ReadableDuration) duration50);
        org.joda.time.Duration duration53 = duration23.withDurationAdded((org.joda.time.ReadableDuration) duration50, 26160257);
        org.joda.time.Period period54 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableDuration) duration23);
        org.joda.time.DateTime dateTime55 = dateTime16.plus((org.joda.time.ReadablePeriod) period54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.hourOfHalfday();
        org.joda.time.DateTime dateTime6 = dateTime0.toDateTime(chronology4);
        org.joda.time.DurationField durationField7 = chronology4.millis();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology4);
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withFieldAdded(durationFieldType12, 1970);
        int int15 = localDateTime14.getEra();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.minusSeconds(26171);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.Interval interval20 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime21 = interval20.getEnd();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeUtils.getZone(dateTimeZone23);
        java.lang.String str26 = dateTimeZone24.getName((long) ' ');
        java.lang.String str28 = dateTimeZone24.getName((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(0L, dateTimeZone24);
        org.joda.time.DateTime dateTime30 = dateTime21.withZone(dateTimeZone24);
        java.lang.String str32 = dateTimeZone24.getNameKey(1645514153208L);
        org.joda.time.DateTime dateTime33 = localDateTime14.toDateTime(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime34 = instant9.toMutableDateTime(dateTimeZone24);
        java.lang.String str35 = dateTimeZone24.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant9", (dateTime0.compareTo(instant9) == 0) == dateTime0.equals(instant9));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property8 = dateTime0.minuteOfHour();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime10);
        int int12 = dateTime9.getMinuteOfDay();
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime15 = dateTime9.plus((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = dateTime9.toDateTime(chronology16);
        org.joda.time.DateTime dateTime19 = dateTime9.minus((long) 10);
        org.joda.time.DateTime dateTime21 = dateTime9.minusHours(7);
        int int22 = dateTime9.getMinuteOfHour();
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime26 = dateTime24.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant27 = dateTime26.toInstant();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = localDateTime28.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.plusYears(26151451);
        org.joda.time.Period period34 = new org.joda.time.Period((long) '#');
        int int36 = period34.getValue(0);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime();
        org.joda.time.Interval interval39 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Duration duration40 = period34.toDurationTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime32.withPeriodAdded((org.joda.time.ReadablePeriod) period34, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean44 = localDateTime32.isSupported(dateTimeFieldType43);
        int int45 = instant27.get(dateTimeFieldType43);
        org.joda.time.MutableDateTime mutableDateTime46 = instant27.toMutableDateTimeISO();
        mutableInterval23.setEnd((org.joda.time.ReadableInstant) mutableDateTime46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and instant27", (dateTime26.compareTo(instant27) == 0) == dateTime26.equals(instant27));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getChronology(chronology0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.hourOfHalfday();
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.dayOfMonth();
        org.joda.time.DurationField durationField5 = chronology3.eras();
        org.joda.time.DurationField durationField6 = chronology3.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField6, and durationField5", !(durationField5.compareTo(durationField6) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField6.compareTo(durationField5))));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime6 = dateTime0.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = dateTime0.toDateTime(chronology7);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime9, (org.joda.time.ReadablePartial) localTime10, periodType11);
        int int13 = localTime10.getMillisOfDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(10L, chronology15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.weekyear();
        int int18 = dateTime16.get(dateTimeFieldType17);
        boolean boolean19 = localTime10.equals((java.lang.Object) dateTimeFieldType17);
        int int20 = dateTime0.get(dateTimeFieldType17);
        org.joda.time.DateTime dateTime22 = dateTime0.minusYears((int) 'a');
        org.joda.time.DateTime.Property property23 = dateTime0.dayOfWeek();
        java.util.Locale locale24 = null;
        java.lang.String str25 = property23.getAsShortText(locale24);
        org.joda.time.DateTime dateTime27 = property23.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime30 = dateTime28.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant31 = dateTime30.toInstant();
        org.joda.time.MutableDateTime mutableDateTime32 = instant31.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Chronology chronology35 = org.joda.time.DateTimeUtils.getChronology(chronology34);
        org.joda.time.DateTimeField dateTimeField36 = chronology35.hourOfHalfday();
        org.joda.time.DurationField durationField37 = durationFieldType33.getField(chronology35);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((java.lang.Object) instant31, chronology35);
        org.joda.time.Instant instant41 = instant31.withDurationAdded(1645514154223L, 100);
        org.joda.time.Instant instant43 = instant31.minus((long) (byte) -1);
        int int44 = property23.getDifference((org.joda.time.ReadableInstant) instant43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and instant31", (dateTime30.compareTo(instant31) == 0) == dateTime30.equals(instant31));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withCenturyOfEra(382);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays((int) (byte) 10);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        org.joda.time.DateTime dateTime6 = localDate4.toDateTimeAtStartOfDay();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime6, readableInstant7);
        org.joda.time.Duration duration10 = org.joda.time.Duration.millis((long) (short) -1);
        int int11 = duration8.compareTo((org.joda.time.ReadableDuration) duration10);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime14 = dateTime12.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant15 = dateTime14.toInstant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTimeISO();
        org.joda.time.Duration duration18 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.Interval interval21 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableInstant) dateTime20);
        int int22 = dateTime19.getMinuteOfDay();
        org.joda.time.Period period24 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime25 = dateTime19.plus((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = dateTime19.toDateTime(chronology26);
        org.joda.time.DateTime dateTime29 = dateTime19.minus((long) 10);
        org.joda.time.Period period30 = duration18.toPeriodFrom((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property32 = dateTime31.era();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime35 = dateTime33.plusWeeks((int) (byte) 1);
        int int36 = property32.compareTo((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime();
        org.joda.time.Interval interval39 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadableInstant) dateTime38);
        boolean boolean41 = interval39.isAfter((long) 10);
        org.joda.time.Duration duration42 = interval39.toDuration();
        org.joda.time.Duration duration45 = duration42.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval46 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableDuration) duration45);
        org.joda.time.Duration duration48 = duration18.withDurationAdded((org.joda.time.ReadableDuration) duration45, 26160257);
        org.joda.time.Instant instant49 = instant15.plus((org.joda.time.ReadableDuration) duration45);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property51 = dateTime50.era();
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime54 = dateTime52.plusWeeks((int) (byte) 1);
        int int55 = property51.compareTo((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime();
        org.joda.time.Interval interval58 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime56, (org.joda.time.ReadableInstant) dateTime57);
        boolean boolean60 = interval58.isAfter((long) 10);
        org.joda.time.Duration duration61 = interval58.toDuration();
        org.joda.time.Duration duration64 = duration61.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval65 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime52, (org.joda.time.ReadableDuration) duration64);
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime68 = dateTime66.plusWeeks((int) (byte) 1);
        org.joda.time.DateTime.Property property69 = dateTime68.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeUtils.getZone(dateTimeZone70);
        java.lang.String str73 = dateTimeZone71.getName((long) ' ');
        org.joda.time.DateTime dateTime74 = dateTime68.toDateTime(dateTimeZone71);
        org.joda.time.PeriodType periodType75 = org.joda.time.PeriodType.time();
        org.joda.time.Period period76 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration64, (org.joda.time.ReadableInstant) dateTime74, periodType75);
        org.joda.time.Period period77 = duration10.toPeriodFrom((org.joda.time.ReadableInstant) instant49, periodType75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant15", (dateTime14.compareTo(instant15) == 0) == dateTime14.equals(instant15));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.Interval interval1 = org.joda.time.Interval.parse("2022-02-22T07:16:05.197Z/2022-02-22T07:16:05.197Z");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval();
        boolean boolean3 = interval1.isAfter((org.joda.time.ReadableInterval) mutableInterval2);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        org.joda.time.MutableDateTime mutableDateTime8 = instant7.toMutableDateTimeISO();
        org.joda.time.Duration duration10 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.Interval interval13 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) dateTime12);
        int int14 = dateTime11.getMinuteOfDay();
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime17 = dateTime11.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = dateTime11.toDateTime(chronology18);
        org.joda.time.DateTime dateTime21 = dateTime11.minus((long) 10);
        org.joda.time.Period period22 = duration10.toPeriodFrom((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property24 = dateTime23.era();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime27 = dateTime25.plusWeeks((int) (byte) 1);
        int int28 = property24.compareTo((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime();
        org.joda.time.Interval interval31 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime30);
        boolean boolean33 = interval31.isAfter((long) 10);
        org.joda.time.Duration duration34 = interval31.toDuration();
        org.joda.time.Duration duration37 = duration34.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval38 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableDuration) duration37);
        org.joda.time.Duration duration40 = duration10.withDurationAdded((org.joda.time.ReadableDuration) duration37, 26160257);
        org.joda.time.Instant instant41 = instant7.plus((org.joda.time.ReadableDuration) duration37);
        long long42 = instant7.getMillis();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime();
        org.joda.time.Interval interval45 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) dateTime44);
        int int46 = dateTime43.getMinuteOfDay();
        org.joda.time.DateTime dateTime48 = dateTime43.minusHours((int) 'a');
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate51 = localDate49.withCenturyOfEra(382);
        org.joda.time.LocalDate localDate53 = localDate51.plusDays((int) (byte) 10);
        org.joda.time.Interval interval54 = localDate53.toInterval();
        org.joda.time.DateTime dateTime55 = localDate53.toDateTimeAtStartOfDay();
        boolean boolean56 = dateTime48.isBefore((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.DateTime dateTime58 = dateTime48.plusMinutes(26151451);
        mutableInterval2.setInterval((org.joda.time.ReadableInstant) instant7, (org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTime dateTime61 = dateTime58.minusMinutes(52492086);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant7", (dateTime6.compareTo(instant7) == 0) == dateTime6.equals(instant7));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.DateTimeField dateTimeField11 = chronology7.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.Interval interval3 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) dateTime2);
        boolean boolean5 = interval3.isAfter((long) 10);
        org.joda.time.Duration duration6 = interval3.toDuration();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(10L, chronology8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        int int11 = dateTime9.get(dateTimeFieldType10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 10, chronology13);
        boolean boolean15 = dateTime9.isEqual((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property17 = dateTime16.era();
        boolean boolean18 = dateTime14.isBefore((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType22 = periodType21.withSecondsRemoved();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.Interval interval25 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Chronology chronology27 = org.joda.time.DateTimeUtils.getChronology(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology27.hourOfHalfday();
        org.joda.time.DateTime dateTime29 = dateTime23.toDateTime(chronology27);
        org.joda.time.Period period30 = new org.joda.time.Period((long) 1, (long) ' ', periodType22, chronology27);
        org.joda.time.DateTime dateTime31 = dateTime16.plus((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Interval interval32 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration6, (org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Instant instant33 = instant0.minus((org.joda.time.ReadableDuration) duration6);
        org.joda.time.Days days34 = duration6.toStandardDays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) 54);
        org.joda.time.Minutes minutes6 = duration5.toStandardMinutes();
        long long7 = duration5.getStandardMinutes();
        org.joda.time.Instant instant9 = instant3.withDurationAdded((org.joda.time.ReadableDuration) duration5, 26171);
        org.joda.time.MutableDateTime mutableDateTime10 = instant9.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.lang.String str2 = locale1.getDisplayScript();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.hourOfHalfday();
        int int7 = dateTimeField5.getLeapAmount((long) 26151451);
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
        int int10 = dateTimeField5.getMaximumShortTextLength(locale9);
        java.lang.String str11 = locale1.getDisplayCountry(locale9);
        java.util.Set<java.lang.Character> charSet12 = locale9.getExtensionKeys();
        java.util.Locale locale13 = locale9.stripExtensions();
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.text.DateFormatSymbols dateFormatSymbols15 = new java.text.DateFormatSymbols(locale14);
        java.lang.String str16 = locale13.getDisplayCountry(locale14);
        java.lang.String str19 = nameProvider0.getShortName(locale13, "2022-02-22T07:16:55.338Z/2022-02-22T07:16:55.338Z", "UnsupportedDurationField[eras]");
        java.util.Locale locale20 = java.util.Locale.CHINA;
        java.lang.String str23 = nameProvider0.getShortName(locale20, "2074-04-15T14:34:22.536Z/2074-04-15T14:34:22.536Z", "2074-04-15T14:34:12.989Z/2074-04-15T14:34:12.989Z");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.util.TimeZone timeZone26 = java.util.TimeZone.getTimeZone("2022-02-22T07:16:00.256Z/2022-02-22T07:16:00.256Z");
        timeZone26.setID("2022-02-22T07:16:17.690Z/2022-02-22T07:16:17.690Z");
        java.util.TimeZone timeZone30 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime32);
        int int34 = dateTime31.getMinuteOfDay();
        int int35 = dateTime31.getYearOfCentury();
        int int36 = dateTime31.getDayOfMonth();
        org.joda.time.DateTime dateTime38 = dateTime31.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property39 = dateTime38.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField40 = property39.getField();
        int int41 = dateTimeField40.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minusWeeks((int) (byte) 10);
        org.joda.time.Period period46 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Duration duration48 = period46.toDurationFrom(readableInstant47);
        long long49 = duration48.getMillis();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime44.plus((org.joda.time.ReadableDuration) duration48);
        java.util.Locale locale52 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str53 = dateTimeField40.getAsText((org.joda.time.ReadablePartial) localDateTime44, (int) (short) 1, locale52);
        java.util.Locale locale54 = java.util.Locale.getDefault();
        java.lang.String str55 = locale52.getDisplayLanguage(locale54);
        java.util.Calendar calendar56 = java.util.Calendar.getInstance(timeZone30, locale54);
        int int57 = timeZone30.getRawOffset();
        timeZone30.setID("2022-02-22T07:16:22.943Z/2022-02-22T07:16:22.943Z");
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime();
        org.joda.time.Interval interval62 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime60, (org.joda.time.ReadableInstant) dateTime61);
        int int63 = dateTime60.getMinuteOfDay();
        int int64 = dateTime60.getYearOfCentury();
        int int65 = dateTime60.getDayOfMonth();
        org.joda.time.DateTime dateTime67 = dateTime60.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property68 = dateTime67.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField69 = property68.getField();
        int int70 = dateTimeField69.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.minusWeeks((int) (byte) 10);
        org.joda.time.Period period75 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.Duration duration77 = period75.toDurationFrom(readableInstant76);
        long long78 = duration77.getMillis();
        org.joda.time.LocalDateTime localDateTime79 = localDateTime73.plus((org.joda.time.ReadableDuration) duration77);
        java.util.Locale locale81 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str82 = dateTimeField69.getAsText((org.joda.time.ReadablePartial) localDateTime73, (int) (short) 1, locale81);
        java.util.Calendar calendar83 = java.util.Calendar.getInstance(timeZone30, locale81);
        java.util.Calendar calendar84 = java.util.Calendar.getInstance(timeZone26, locale81);
        java.lang.String str87 = nameProvider0.getShortName(locale81, "millisOfSecond", "2022-02-22T07:18:22.901Z/2022-02-22T07:18:22.901Z");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar56 and calendar84", (calendar56.compareTo(calendar84) == 0) == calendar56.equals(calendar84));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        boolean boolean4 = interval2.isAfter((long) 10);
        org.joda.time.Duration duration5 = interval2.toDuration();
        org.joda.time.Duration duration8 = duration5.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant12 = dateTime11.toInstant();
        org.joda.time.MutableDateTime mutableDateTime13 = instant12.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Chronology chronology16 = org.joda.time.DateTimeUtils.getChronology(chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfHalfday();
        org.joda.time.DurationField durationField18 = durationFieldType14.getField(chronology16);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((java.lang.Object) instant12, chronology16);
        org.joda.time.Instant instant22 = instant12.withDurationAdded(1645514154223L, 100);
        long long23 = instant12.getMillis();
        org.joda.time.Chronology chronology24 = instant12.getChronology();
        org.joda.time.Interval interval25 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration5, (org.joda.time.ReadableInstant) instant12);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime();
        org.joda.time.Interval interval28 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableInstant) dateTime27);
        java.lang.String str29 = interval28.toString();
        boolean boolean30 = interval28.isAfterNow();
        org.joda.time.Duration duration31 = interval28.toDuration();
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime32, (org.joda.time.ReadablePartial) localTime33, periodType34);
        org.joda.time.Period period36 = period35.negated();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((long) (-1), chronology38);
        org.joda.time.Period period40 = period39.toPeriod();
        org.joda.time.Period period41 = period36.withFields((org.joda.time.ReadablePeriod) period39);
        org.joda.time.Period period43 = new org.joda.time.Period((long) (short) 10);
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.days();
        org.joda.time.Period period45 = period43.normalizedStandard(periodType44);
        boolean boolean47 = periodType44.equals((java.lang.Object) 6);
        org.joda.time.Period period48 = period41.normalizedStandard(periodType44);
        org.joda.time.Interval interval49 = interval28.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period48);
        boolean boolean50 = interval25.contains((org.joda.time.ReadableInterval) interval49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant12", (dateTime11.compareTo(instant12) == 0) == dateTime11.equals(instant12));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.era();
        org.joda.time.DateTime dateTime3 = dateTime0.plusWeeks(100);
        org.joda.time.Period period12 = new org.joda.time.Period(22, (int) (short) 10, (int) '#', (int) (short) 100, 32772, 3, 0, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime0.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property15 = dateTime14.millisOfDay();
        org.joda.time.DateTime dateTime16 = dateTime14.withTimeAtStartOfDay();
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#');
        int int20 = period18.getValue(0);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Duration duration24 = period18.toDurationTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Chronology chronology25 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime26 = dateTime13.toDateTime(chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.year();
        org.joda.time.DurationField durationField28 = chronology25.eras();
        org.joda.time.Period period30 = new org.joda.time.Period((long) '#');
        int int32 = period30.getValue(0);
        org.joda.time.Period period34 = period30.plusWeeks(1969);
        org.joda.time.Duration duration35 = period34.toStandardDuration();
        org.joda.time.Hours hours36 = period34.toStandardHours();
        int[] intArray38 = chronology25.get((org.joda.time.ReadablePeriod) period34, (-60000L));
        org.joda.time.Period period40 = period34.plusHours(0);
        org.joda.time.Period period42 = new org.joda.time.Period((long) (short) 10);
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.days();
        org.joda.time.Period period44 = period42.normalizedStandard(periodType43);
        org.joda.time.PeriodType periodType45 = periodType43.withYearsRemoved();
        org.joda.time.PeriodType periodType46 = periodType45.withYearsRemoved();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period((long) (-1), chronology48);
        org.joda.time.Period period50 = period49.toPeriod();
        int int51 = period50.size();
        int int52 = period50.getMinutes();
        int[] intArray53 = period50.getValues();
        org.joda.time.Period period55 = period50.withMonths(26155103);
        org.joda.time.Period period57 = period55.minusDays((-292275054));
        int int58 = period55.getHours();
        org.joda.time.Period period60 = period55.withMinutes(914);
        org.joda.time.DurationFieldType durationFieldType61 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.Chronology chronology63 = org.joda.time.DateTimeUtils.getChronology(chronology62);
        org.joda.time.DateTimeField dateTimeField64 = chronology63.hourOfHalfday();
        org.joda.time.DurationField durationField65 = durationFieldType61.getField(chronology63);
        boolean boolean66 = period55.isSupported(durationFieldType61);
        boolean boolean67 = periodType45.isSupported(durationFieldType61);
        boolean boolean68 = period40.isSupported(durationFieldType61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField28 and durationField65", Math.signum(durationField28.compareTo(durationField65)) == -Math.signum(durationField65.compareTo(durationField28)));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant13 = instant3.withDurationAdded(1645514154223L, 100);
        long long14 = instant3.getMillis();
        org.joda.time.Chronology chronology15 = instant3.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.Interval interval1 = org.joda.time.Interval.parse("2022-02-22T07:16:05.197Z/2022-02-22T07:16:05.197Z");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval();
        boolean boolean3 = interval1.isAfter((org.joda.time.ReadableInterval) mutableInterval2);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        org.joda.time.MutableDateTime mutableDateTime8 = instant7.toMutableDateTimeISO();
        org.joda.time.Duration duration10 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.Interval interval13 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) dateTime12);
        int int14 = dateTime11.getMinuteOfDay();
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime17 = dateTime11.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = dateTime11.toDateTime(chronology18);
        org.joda.time.DateTime dateTime21 = dateTime11.minus((long) 10);
        org.joda.time.Period period22 = duration10.toPeriodFrom((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property24 = dateTime23.era();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime27 = dateTime25.plusWeeks((int) (byte) 1);
        int int28 = property24.compareTo((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime();
        org.joda.time.Interval interval31 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime30);
        boolean boolean33 = interval31.isAfter((long) 10);
        org.joda.time.Duration duration34 = interval31.toDuration();
        org.joda.time.Duration duration37 = duration34.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval38 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableDuration) duration37);
        org.joda.time.Duration duration40 = duration10.withDurationAdded((org.joda.time.ReadableDuration) duration37, 26160257);
        org.joda.time.Instant instant41 = instant7.plus((org.joda.time.ReadableDuration) duration37);
        long long42 = instant7.getMillis();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime();
        org.joda.time.Interval interval45 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) dateTime44);
        int int46 = dateTime43.getMinuteOfDay();
        org.joda.time.DateTime dateTime48 = dateTime43.minusHours((int) 'a');
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate51 = localDate49.withCenturyOfEra(382);
        org.joda.time.LocalDate localDate53 = localDate51.plusDays((int) (byte) 10);
        org.joda.time.Interval interval54 = localDate53.toInterval();
        org.joda.time.DateTime dateTime55 = localDate53.toDateTimeAtStartOfDay();
        boolean boolean56 = dateTime48.isBefore((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.DateTime dateTime58 = dateTime48.plusMinutes(26151451);
        mutableInterval2.setInterval((org.joda.time.ReadableInstant) instant7, (org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.MutableInterval mutableInterval60 = mutableInterval2.toMutableInterval();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant7", (dateTime6.compareTo(instant7) == 0) == dateTime6.equals(instant7));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        boolean boolean4 = interval2.isAfter((long) 10);
        org.joda.time.Duration duration5 = interval2.toDuration();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfDay();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.Interval interval10 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime9);
        int int11 = dateTime8.getMinuteOfDay();
        int int12 = dateTime8.getYearOfCentury();
        int int13 = dateTime8.getDayOfMonth();
        org.joda.time.DateTime dateTime15 = dateTime8.minusWeeks((int) (short) 0);
        boolean boolean16 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateTime8);
        boolean boolean17 = interval2.isAfter((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.Interval interval18 = interval2.toInterval();
        org.joda.time.Duration duration19 = interval2.toDuration();
        org.joda.time.Instant instant20 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology21 = instant20.getChronology();
        org.joda.time.Period period23 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationFrom(readableInstant24);
        org.joda.time.Seconds seconds26 = duration25.toStandardSeconds();
        org.joda.time.Duration duration29 = duration25.withDurationAdded((long) 32772, (int) (byte) 10);
        java.lang.String str30 = duration25.toString();
        org.joda.time.Period period31 = duration25.toPeriod();
        org.joda.time.Instant instant32 = instant20.plus((org.joda.time.ReadableDuration) duration25);
        boolean boolean33 = duration19.isEqual((org.joda.time.ReadableDuration) duration25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant20", (dateTime0.compareTo(instant20) == 0) == dateTime0.equals(instant20));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.hourOfHalfday();
        org.joda.time.DateTime dateTime6 = dateTime0.toDateTime(chronology4);
        org.joda.time.DurationField durationField7 = chronology4.millis();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology4);
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withFieldAdded(durationFieldType12, 1970);
        int int15 = localDateTime14.getEra();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.minusSeconds(26171);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.Interval interval20 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime21 = interval20.getEnd();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeUtils.getZone(dateTimeZone23);
        java.lang.String str26 = dateTimeZone24.getName((long) ' ');
        java.lang.String str28 = dateTimeZone24.getName((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(0L, dateTimeZone24);
        org.joda.time.DateTime dateTime30 = dateTime21.withZone(dateTimeZone24);
        java.lang.String str32 = dateTimeZone24.getNameKey(1645514153208L);
        org.joda.time.DateTime dateTime33 = localDateTime14.toDateTime(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime34 = instant9.toMutableDateTime(dateTimeZone24);
        org.joda.time.Instant instant35 = instant9.toInstant();
        org.joda.time.Instant instant36 = instant35.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant36", (dateTime0.compareTo(instant36) == 0) == dateTime0.equals(instant36));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = instant0.getChronology();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withFieldAdded(durationFieldType4, 1970);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime12 = interval11.getEnd();
        org.joda.time.Interval interval13 = interval11.toInterval();
        long long14 = interval11.getEndMillis();
        java.lang.String str15 = interval11.toString();
        org.joda.time.DateTime dateTime16 = interval11.getStart();
        org.joda.time.Chronology chronology17 = interval11.getChronology();
        org.joda.time.Period period18 = new org.joda.time.Period(0L, 1645514152681L, chronology17);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime6.minus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusDays(100);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusHours((int) 'a');
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType27 = periodType26.withSecondsRemoved();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        org.joda.time.Interval interval30 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Chronology chronology32 = org.joda.time.DateTimeUtils.getChronology(chronology31);
        org.joda.time.DateTimeField dateTimeField33 = chronology32.hourOfHalfday();
        org.joda.time.DateTime dateTime34 = dateTime28.toDateTime(chronology32);
        org.joda.time.Period period35 = new org.joda.time.Period((long) 1, (long) ' ', periodType27, chronology32);
        org.joda.time.Period period36 = period35.negated();
        org.joda.time.Period period38 = new org.joda.time.Period((long) '#');
        int int40 = period38.getValue(0);
        org.joda.time.DurationFieldType durationFieldType41 = org.joda.time.DurationFieldType.hours();
        int int42 = period38.get(durationFieldType41);
        boolean boolean43 = period36.isSupported(durationFieldType41);
        boolean boolean44 = localDateTime21.isSupported(durationFieldType41);
        int int45 = localDateTime21.getDayOfYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter46 = null;
        org.joda.time.format.DateTimeParser dateTimeParser47 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter46, dateTimeParser47);
        org.joda.time.Chronology chronology49 = dateTimeFormatter48.getChronolgy();
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime();
        org.joda.time.Interval interval52 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime50, (org.joda.time.ReadableInstant) dateTime51);
        int int53 = dateTime50.getMinuteOfDay();
        org.joda.time.Period period55 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime56 = dateTime50.plus((org.joda.time.ReadablePeriod) period55);
        org.joda.time.DateTime dateTime58 = dateTime56.withDayOfYear((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone59 = dateTime56.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter48.withZone(dateTimeZone59);
        org.joda.time.DateTime dateTime61 = localDateTime21.toDateTime(dateTimeZone59);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime();
        org.joda.time.Interval interval65 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) dateTime64);
        int int66 = dateTime63.getMinuteOfDay();
        int int67 = dateTime63.getYearOfCentury();
        int int68 = dateTime63.getDayOfMonth();
        org.joda.time.DateTime dateTime70 = dateTime63.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property71 = dateTime70.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField72 = property71.getField();
        int int73 = dateTimeField72.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime76 = localDateTime74.minusWeeks((int) (byte) 10);
        org.joda.time.Period period78 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.Duration duration80 = period78.toDurationFrom(readableInstant79);
        long long81 = duration80.getMillis();
        org.joda.time.LocalDateTime localDateTime82 = localDateTime76.plus((org.joda.time.ReadableDuration) duration80);
        java.util.Locale locale84 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str85 = dateTimeField72.getAsText((org.joda.time.ReadablePartial) localDateTime76, (int) (short) 1, locale84);
        java.util.Locale locale86 = java.util.Locale.getDefault();
        java.lang.String str87 = locale84.getDisplayLanguage(locale86);
        java.lang.String str88 = dateTimeZone59.getName(1645514222375L, locale86);
        org.joda.time.MutableDateTime mutableDateTime89 = instant0.toMutableDateTime(dateTimeZone59);
        java.lang.String str91 = dateTimeZone59.getShortName(3291028461146L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime9", (instant0.compareTo(dateTime9) == 0) == instant0.equals(dateTime9));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant13 = instant3.withDurationAdded(1645514154223L, 100);
        org.joda.time.DateTime dateTime14 = instant3.toDateTimeISO();
        boolean boolean16 = instant3.isBefore((long) 53);
        org.joda.time.Instant instant18 = instant3.minus((long) 3);
        org.joda.time.Chronology chronology19 = instant18.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime4 = instant3.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime5 = instant3.toMutableDateTimeISO();
        int int6 = mutableDateTime5.getMillisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant4 = dateTime3.toInstant();
        org.joda.time.MutableDateTime mutableDateTime5 = instant4.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology8.hourOfHalfday();
        org.joda.time.DurationField durationField10 = durationFieldType6.getField(chronology8);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) instant4, chronology8);
        org.joda.time.Instant instant14 = instant4.withDurationAdded(1645514154223L, 100);
        long long15 = instant4.getMillis();
        org.joda.time.Chronology chronology16 = instant4.getChronology();
        org.joda.time.Period period17 = new org.joda.time.Period(1645514220000L, chronology16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant4", (dateTime3.compareTo(instant4) == 0) == dateTime3.equals(instant4));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) 54);
        org.joda.time.Minutes minutes2 = duration1.toStandardMinutes();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant6 = dateTime5.toInstant();
        org.joda.time.MutableDateTime mutableDateTime7 = instant6.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.hourOfHalfday();
        org.joda.time.DurationField durationField12 = durationFieldType8.getField(chronology10);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((java.lang.Object) instant6, chronology10);
        org.joda.time.Instant instant16 = instant6.withDurationAdded(1645514154223L, 100);
        org.joda.time.Interval interval17 = duration1.toIntervalTo((org.joda.time.ReadableInstant) instant6);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) ' ', dateTimeZone19);
        int int21 = dateTime20.getYearOfCentury();
        org.joda.time.YearMonthDay yearMonthDay22 = dateTime20.toYearMonthDay();
        org.joda.time.Chronology chronology23 = dateTime20.getChronology();
        int int24 = dateTime20.getWeekOfWeekyear();
        boolean boolean25 = dateTime20.isEqualNow();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property27 = dateTime26.millisOfDay();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        org.joda.time.Interval interval30 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableInstant) dateTime29);
        int int31 = dateTime28.getMinuteOfDay();
        int int32 = dateTime28.getYearOfCentury();
        int int33 = dateTime28.getDayOfMonth();
        org.joda.time.DateTime dateTime35 = dateTime28.minusWeeks((int) (short) 0);
        boolean boolean36 = dateTime26.isAfter((org.joda.time.ReadableInstant) dateTime28);
        java.lang.String str37 = dateTime26.toString();
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType40 = periodType39.withDaysRemoved();
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime();
        org.joda.time.Interval interval43 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime41, (org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime dateTime44 = interval43.getEnd();
        org.joda.time.Chronology chronology45 = dateTime44.getChronology();
        org.joda.time.Period period46 = new org.joda.time.Period(1645514161529L, periodType40, chronology45);
        org.joda.time.DurationField durationField47 = chronology45.years();
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime26.toMutableDateTime(chronology45);
        int int49 = dateTime20.compareTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Period period50 = duration1.toPeriodTo((org.joda.time.ReadableInstant) dateTime20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant6", (dateTime5.compareTo(instant6) == 0) == dateTime5.equals(instant6));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime4 = instant3.toDateTime();
        org.joda.time.DateTime dateTime7 = dateTime4.withDurationAdded(1645514283632L, 6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-22T07:16:00.256Z/2022-02-22T07:16:00.256Z");
        timeZone1.setID("2022-02-22T07:16:17.690Z/2022-02-22T07:16:17.690Z");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.Interval interval8 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime7);
        int int9 = dateTime6.getMinuteOfDay();
        int int10 = dateTime6.getYearOfCentury();
        int int11 = dateTime6.getDayOfMonth();
        org.joda.time.DateTime dateTime13 = dateTime6.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property14 = dateTime13.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField15 = property14.getField();
        int int16 = dateTimeField15.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusWeeks((int) (byte) 10);
        org.joda.time.Period period21 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period21.toDurationFrom(readableInstant22);
        long long24 = duration23.getMillis();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.plus((org.joda.time.ReadableDuration) duration23);
        java.util.Locale locale27 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str28 = dateTimeField15.getAsText((org.joda.time.ReadablePartial) localDateTime19, (int) (short) 1, locale27);
        java.util.Locale locale29 = java.util.Locale.getDefault();
        java.lang.String str30 = locale27.getDisplayLanguage(locale29);
        java.util.Calendar calendar31 = java.util.Calendar.getInstance(timeZone5, locale29);
        int int32 = timeZone5.getRawOffset();
        timeZone5.setID("2022-02-22T07:16:22.943Z/2022-02-22T07:16:22.943Z");
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime();
        org.joda.time.Interval interval37 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateTime36);
        int int38 = dateTime35.getMinuteOfDay();
        int int39 = dateTime35.getYearOfCentury();
        int int40 = dateTime35.getDayOfMonth();
        org.joda.time.DateTime dateTime42 = dateTime35.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property43 = dateTime42.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField44 = property43.getField();
        int int45 = dateTimeField44.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.minusWeeks((int) (byte) 10);
        org.joda.time.Period period50 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Duration duration52 = period50.toDurationFrom(readableInstant51);
        long long53 = duration52.getMillis();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime48.plus((org.joda.time.ReadableDuration) duration52);
        java.util.Locale locale56 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str57 = dateTimeField44.getAsText((org.joda.time.ReadablePartial) localDateTime48, (int) (short) 1, locale56);
        java.util.Calendar calendar58 = java.util.Calendar.getInstance(timeZone5, locale56);
        java.util.Calendar calendar59 = java.util.Calendar.getInstance(timeZone1, locale56);
        int int60 = timeZone1.getDSTSavings();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar31 and calendar59", (calendar31.compareTo(calendar59) == 0) == calendar31.equals(calendar59));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant13 = instant3.withDurationAdded((long) 459, 0);
        org.joda.time.Chronology chronology14 = instant3.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.MutableInterval mutableInterval0 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks((int) (byte) 10);
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationFrom(readableInstant6);
        long long8 = duration7.getMillis();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.plus((org.joda.time.ReadableDuration) duration7);
        mutableInterval0.setDurationAfterStart((org.joda.time.ReadableDuration) duration7);
        org.joda.time.Duration duration11 = mutableInterval0.toDuration();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusWeeks((int) (byte) 10);
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationFrom(readableInstant17);
        long long19 = duration18.getMillis();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.plus((org.joda.time.ReadableDuration) duration18);
        long long21 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration18);
        boolean boolean22 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration18);
        long long23 = duration18.getStandardDays();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.Interval interval26 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime25);
        int int27 = dateTime24.getMinuteOfDay();
        org.joda.time.Period period29 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime30 = dateTime24.plus((org.joda.time.ReadablePeriod) period29);
        org.joda.time.Period period31 = duration18.toPeriodFrom((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Duration duration32 = period31.toStandardDuration();
        org.joda.time.Instant instant33 = new org.joda.time.Instant();
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.minusWeeks((int) (byte) 10);
        org.joda.time.Period period39 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = period39.toDurationFrom(readableInstant40);
        long long42 = duration41.getMillis();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime37.plus((org.joda.time.ReadableDuration) duration41);
        mutableInterval34.setDurationAfterStart((org.joda.time.ReadableDuration) duration41);
        org.joda.time.Duration duration45 = mutableInterval34.toDuration();
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.minusWeeks((int) (byte) 10);
        org.joda.time.Period period50 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Duration duration52 = period50.toDurationFrom(readableInstant51);
        long long53 = duration52.getMillis();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime48.plus((org.joda.time.ReadableDuration) duration52);
        long long55 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration52);
        boolean boolean56 = duration45.isShorterThan((org.joda.time.ReadableDuration) duration52);
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.minusWeeks((int) (byte) 10);
        org.joda.time.Period period62 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Duration duration64 = period62.toDurationFrom(readableInstant63);
        long long65 = duration64.getMillis();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime60.plus((org.joda.time.ReadableDuration) duration64);
        mutableInterval57.setDurationAfterStart((org.joda.time.ReadableDuration) duration64);
        org.joda.time.Duration duration68 = mutableInterval57.toDuration();
        boolean boolean69 = duration52.isShorterThan((org.joda.time.ReadableDuration) duration68);
        org.joda.time.Instant instant71 = instant33.withDurationAdded((org.joda.time.ReadableDuration) duration52, 20);
        org.joda.time.MutableDateTime mutableDateTime72 = instant33.toMutableDateTime();
        org.joda.time.Interval interval73 = duration32.toIntervalFrom((org.joda.time.ReadableInstant) mutableDateTime72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and instant33", (dateTime24.compareTo(instant33) == 0) == dateTime24.equals(instant33));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant13 = instant3.withDurationAdded(1645514154223L, 100);
        org.joda.time.Instant instant15 = instant3.minus((long) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withFieldAdded(durationFieldType18, 1970);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.Interval interval25 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime26 = interval25.getEnd();
        org.joda.time.Interval interval27 = interval25.toInterval();
        long long28 = interval25.getEndMillis();
        java.lang.String str29 = interval25.toString();
        org.joda.time.DateTime dateTime30 = interval25.getStart();
        org.joda.time.Chronology chronology31 = interval25.getChronology();
        org.joda.time.Period period32 = new org.joda.time.Period(0L, 1645514152681L, chronology31);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime20.minus((org.joda.time.ReadablePeriod) period32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plusDays(100);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.minusHours((int) 'a');
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.LocalDateTime localDateTime40 = localDateTime35.plus((org.joda.time.ReadableDuration) duration39);
        org.joda.time.Duration duration43 = duration39.withDurationAdded((long) 1, 6);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime();
        org.joda.time.Interval interval46 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableInstant) dateTime45);
        int int47 = dateTime44.getMinuteOfDay();
        int int48 = dateTime44.getYearOfCentury();
        int int49 = dateTime44.getDayOfMonth();
        org.joda.time.DateTime dateTime51 = dateTime44.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property52 = dateTime51.minuteOfDay();
        int int53 = dateTime51.getYear();
        int int54 = dateTime51.getEra();
        org.joda.time.DateTime dateTime56 = dateTime51.withYearOfCentury(21);
        org.joda.time.DateTime dateTime58 = dateTime51.withDayOfYear(90);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property60 = dateTime59.millisOfDay();
        org.joda.time.DateTime dateTime61 = dateTime59.withTimeAtStartOfDay();
        org.joda.time.Period period63 = new org.joda.time.Period((long) '#');
        int int65 = period63.getValue(0);
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime();
        org.joda.time.Interval interval68 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime66, (org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.Duration duration69 = period63.toDurationTo((org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.Chronology chronology70 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime61, (org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.DateTimeField dateTimeField71 = chronology70.millisOfDay();
        java.util.Locale locale73 = java.util.Locale.JAPAN;
        java.util.Locale.setDefault(locale73);
        java.util.Set<java.lang.String> strSet75 = locale73.getUnicodeLocaleKeys();
        java.lang.String str76 = dateTimeField71.getAsShortText(26167, locale73);
        int int77 = dateTime58.get(dateTimeField71);
        org.joda.time.Period period78 = duration39.toPeriodTo((org.joda.time.ReadableInstant) dateTime58);
        boolean boolean79 = instant15.isBefore((org.joda.time.ReadableInstant) dateTime58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        boolean boolean4 = interval2.isAfter((long) 10);
        org.joda.time.Duration duration5 = interval2.toDuration();
        org.joda.time.Duration duration8 = duration5.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant12 = dateTime11.toInstant();
        org.joda.time.MutableDateTime mutableDateTime13 = instant12.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Chronology chronology16 = org.joda.time.DateTimeUtils.getChronology(chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfHalfday();
        org.joda.time.DurationField durationField18 = durationFieldType14.getField(chronology16);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((java.lang.Object) instant12, chronology16);
        org.joda.time.Instant instant22 = instant12.withDurationAdded(1645514154223L, 100);
        long long23 = instant12.getMillis();
        org.joda.time.Chronology chronology24 = instant12.getChronology();
        org.joda.time.Interval interval25 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration5, (org.joda.time.ReadableInstant) instant12);
        org.joda.time.Period period27 = new org.joda.time.Period((long) '#');
        int int29 = period27.getValue(0);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        org.joda.time.Interval interval32 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Duration duration33 = period27.toDurationTo((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Period period35 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Duration duration37 = period35.toDurationFrom(readableInstant36);
        org.joda.time.Seconds seconds38 = duration37.toStandardSeconds();
        boolean boolean39 = duration33.isEqual((org.joda.time.ReadableDuration) duration37);
        org.joda.time.Interval interval40 = interval25.withDurationAfterStart((org.joda.time.ReadableDuration) duration33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant12", (dateTime11.compareTo(instant12) == 0) == dateTime11.equals(instant12));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.DateTimeZone dateTimeZone11 = instant3.getZone();
        boolean boolean12 = instant3.isAfterNow();
        org.joda.time.Instant instant14 = instant3.minus((long) 52);
        org.joda.time.DateTime dateTime15 = instant3.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean17 = dateTime15.isSupported(dateTimeFieldType16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.DateTimeZone dateTimeZone11 = instant3.getZone();
        boolean boolean12 = instant3.isAfterNow();
        org.joda.time.Instant instant14 = instant3.minus((long) 52);
        org.joda.time.Instant instant17 = instant3.withDurationAdded((-58312716247319L), 0);
        boolean boolean18 = instant3.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        java.util.GregorianCalendar gregorianCalendar4 = dateTime2.toGregorianCalendar();
        org.joda.time.DateTime dateTime6 = dateTime2.withMillisOfSecond(19);
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant13 = instant3.withDurationAdded(1645514154223L, 100);
        org.joda.time.Instant instant15 = instant3.minus((long) (byte) -1);
        org.joda.time.DateTime dateTime16 = instant3.toDateTimeISO();
        org.joda.time.DateTime dateTime17 = dateTime16.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Duration duration6 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        int int10 = dateTime7.getMinuteOfDay();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime13 = dateTime7.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime7.toDateTime(chronology14);
        org.joda.time.DateTime dateTime17 = dateTime7.minus((long) 10);
        org.joda.time.Period period18 = duration6.toPeriodFrom((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property20 = dateTime19.era();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.plusWeeks((int) (byte) 1);
        int int24 = property20.compareTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime26);
        boolean boolean29 = interval27.isAfter((long) 10);
        org.joda.time.Duration duration30 = interval27.toDuration();
        org.joda.time.Duration duration33 = duration30.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableDuration) duration33);
        org.joda.time.Duration duration36 = duration6.withDurationAdded((org.joda.time.ReadableDuration) duration33, 26160257);
        org.joda.time.Instant instant37 = instant3.plus((org.joda.time.ReadableDuration) duration33);
        org.joda.time.DateTime dateTime38 = instant3.toDateTime();
        org.joda.time.Instant instant39 = new org.joda.time.Instant();
        int int40 = instant3.compareTo((org.joda.time.ReadableInstant) instant39);
        org.joda.time.MutableDateTime mutableDateTime41 = instant3.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant39", (dateTime0.compareTo(instant39) == 0) == dateTime0.equals(instant39));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Instant instant7 = instant3.withDurationAdded((-1L), 21);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((java.lang.Object) instant3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.era();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.plusWeeks((int) (byte) 1);
        int int5 = property1.compareTo((org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.Interval interval8 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime7);
        boolean boolean10 = interval8.isAfter((long) 10);
        org.joda.time.Duration duration11 = interval8.toDuration();
        org.joda.time.Duration duration14 = duration11.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval15 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableDuration) duration14);
        long long16 = interval15.getStartMillis();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime19 = dateTime17.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant20 = dateTime19.toInstant();
        org.joda.time.MutableDateTime mutableDateTime21 = instant20.toMutableDateTimeISO();
        org.joda.time.Duration duration23 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.Interval interval26 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime25);
        int int27 = dateTime24.getMinuteOfDay();
        org.joda.time.Period period29 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime30 = dateTime24.plus((org.joda.time.ReadablePeriod) period29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = dateTime24.toDateTime(chronology31);
        org.joda.time.DateTime dateTime34 = dateTime24.minus((long) 10);
        org.joda.time.Period period35 = duration23.toPeriodFrom((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property37 = dateTime36.era();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime40 = dateTime38.plusWeeks((int) (byte) 1);
        int int41 = property37.compareTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime();
        org.joda.time.Interval interval44 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime42, (org.joda.time.ReadableInstant) dateTime43);
        boolean boolean46 = interval44.isAfter((long) 10);
        org.joda.time.Duration duration47 = interval44.toDuration();
        org.joda.time.Duration duration50 = duration47.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval51 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime38, (org.joda.time.ReadableDuration) duration50);
        org.joda.time.Duration duration53 = duration23.withDurationAdded((org.joda.time.ReadableDuration) duration50, 26160257);
        org.joda.time.Instant instant54 = instant20.plus((org.joda.time.ReadableDuration) duration50);
        boolean boolean55 = interval15.isAfter((org.joda.time.ReadableInstant) instant54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant20", (dateTime4.compareTo(instant20) == 0) == dateTime4.equals(instant20));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime4.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusYears(26151451);
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#');
        int int12 = period10.getValue(0);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Duration duration16 = period10.toDurationTo((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime8.withPeriodAdded((org.joda.time.ReadablePeriod) period10, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean20 = localDateTime8.isSupported(dateTimeFieldType19);
        int int21 = instant3.get(dateTimeFieldType19);
        org.joda.time.Duration duration23 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.Interval interval26 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime25);
        int int27 = dateTime24.getMinuteOfDay();
        org.joda.time.Period period29 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime30 = dateTime24.plus((org.joda.time.ReadablePeriod) period29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = dateTime24.toDateTime(chronology31);
        org.joda.time.DateTime dateTime34 = dateTime24.minus((long) 10);
        org.joda.time.Period period35 = duration23.toPeriodFrom((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Instant instant36 = instant3.plus((org.joda.time.ReadableDuration) duration23);
        org.joda.time.MutableDateTime mutableDateTime37 = instant36.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.DateTimeZone dateTimeZone11 = instant3.getZone();
        boolean boolean12 = instant3.isAfterNow();
        org.joda.time.DateTime dateTime13 = instant3.toDateTimeISO();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime15);
        int int17 = dateTime14.getMinuteOfDay();
        int int18 = dateTime14.getYearOfCentury();
        int int19 = dateTime14.getDayOfMonth();
        org.joda.time.DateTime dateTime21 = dateTime14.minusWeeks((int) (short) 0);
        int int22 = dateTime14.getYear();
        org.joda.time.DateTime dateTime24 = dateTime14.plusYears(14);
        org.joda.time.Duration duration25 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.hourOfHalfday();
        org.joda.time.DateTime dateTime6 = dateTime0.toDateTime(chronology4);
        org.joda.time.DurationField durationField7 = chronology4.millis();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology4);
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.DateTime dateTime11 = dateTime8.minusYears(52445959);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant9", (dateTime0.compareTo(instant9) == 0) == dateTime0.equals(instant9));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        java.lang.String str3 = interval2.toString();
        boolean boolean4 = interval2.isAfterNow();
        org.joda.time.Duration duration5 = interval2.toDuration();
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#');
        int int9 = period7.getValue(0);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.Duration duration13 = period7.toDurationTo((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.Period period15 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationFrom(readableInstant16);
        org.joda.time.Seconds seconds18 = duration17.toStandardSeconds();
        boolean boolean19 = duration13.isEqual((org.joda.time.ReadableDuration) duration17);
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType23 = periodType22.withSecondsRemoved();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.Interval interval26 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Chronology chronology28 = org.joda.time.DateTimeUtils.getChronology(chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology28.hourOfHalfday();
        org.joda.time.DateTime dateTime30 = dateTime24.toDateTime(chronology28);
        org.joda.time.Period period31 = new org.joda.time.Period((long) 1, (long) ' ', periodType23, chronology28);
        org.joda.time.DurationField durationField32 = chronology28.weeks();
        boolean boolean33 = duration17.equals((java.lang.Object) chronology28);
        boolean boolean35 = duration17.equals((java.lang.Object) 1L);
        boolean boolean36 = duration5.isEqual((org.joda.time.ReadableDuration) duration17);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime();
        org.joda.time.Interval interval39 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadableInstant) dateTime38);
        int int40 = dateTime37.getMinuteOfDay();
        org.joda.time.Interval interval41 = duration5.toIntervalTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Interval interval42 = interval41.toInterval();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime45 = dateTime43.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant46 = dateTime45.toInstant();
        org.joda.time.MutableDateTime mutableDateTime47 = instant46.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType48 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Chronology chronology50 = org.joda.time.DateTimeUtils.getChronology(chronology49);
        org.joda.time.DateTimeField dateTimeField51 = chronology50.hourOfHalfday();
        org.joda.time.DurationField durationField52 = durationFieldType48.getField(chronology50);
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime((java.lang.Object) instant46, chronology50);
        org.joda.time.DateTimeZone dateTimeZone54 = instant46.getZone();
        boolean boolean55 = instant46.isAfterNow();
        org.joda.time.Instant instant57 = instant46.minus((long) 52);
        org.joda.time.DateTime dateTime58 = instant46.toDateTime();
        boolean boolean59 = interval42.isAfter((org.joda.time.ReadableInstant) instant46);
        org.joda.time.Instant instant61 = instant46.minus(3291028436225L);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.Chronology chronology63 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) instant61, readableInstant62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime45 and instant46", (dateTime45.compareTo(instant46) == 0) == dateTime45.equals(instant46));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.millisOfDay();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#');
        int int7 = period5.getValue(0);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.Interval interval10 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Duration duration11 = period5.toDurationTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTimeField dateTimeField13 = chronology12.millisOfDay();
        org.joda.time.Period period14 = new org.joda.time.Period(obj0, chronology12);
        org.joda.time.Period period16 = period14.withMonths(474);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime19 = dateTime17.plusWeeks((int) (byte) 1);
        org.joda.time.Duration duration20 = period16.toDurationFrom((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (-1), chronology22);
        org.joda.time.Period period24 = period23.toPeriod();
        int int25 = period24.size();
        int int26 = period24.getMinutes();
        int[] intArray27 = period24.getValues();
        org.joda.time.Duration duration28 = period24.toStandardDuration();
        boolean boolean30 = duration28.equals((java.lang.Object) "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        boolean boolean31 = period16.equals((java.lang.Object) duration28);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Chronology chronology36 = org.joda.time.DateTimeUtils.getChronology(chronology35);
        org.joda.time.DateTimeField dateTimeField37 = chronology36.hourOfHalfday();
        org.joda.time.DateTime dateTime38 = dateTime32.toDateTime(chronology36);
        org.joda.time.DurationField durationField39 = chronology36.millis();
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(chronology36);
        org.joda.time.Instant instant41 = dateTime40.toInstant();
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) period16, (org.joda.time.ReadableInstant) dateTime40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant41", (dateTime1.compareTo(instant41) == 0) == dateTime1.equals(instant41));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        org.joda.time.DateTime.Property property5 = dateTime0.year();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime dateTime7 = dateTime6.withEarlierOffsetAtOverlap();
        org.joda.time.Instant instant8 = dateTime7.toInstant();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        long long12 = dateTimeZone10.convertUTCToLocal((long) 1970);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(1375201439L, dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime14 = instant8.toMutableDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusWeeks((int) (byte) 10);
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationFrom(readableInstant20);
        long long22 = duration21.getMillis();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.plus((org.joda.time.ReadableDuration) duration21);
        int int24 = localDateTime17.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime17.withWeekyear(3);
        boolean boolean27 = dateTimeZone10.isLocalDateTimeGap(localDateTime26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant8", (dateTime6.compareTo(instant8) == 0) == dateTime6.equals(instant8));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        boolean boolean4 = interval2.isAfter((long) 10);
        org.joda.time.Duration duration5 = interval2.toDuration();
        org.joda.time.Duration duration8 = duration5.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant12 = dateTime11.toInstant();
        org.joda.time.MutableDateTime mutableDateTime13 = instant12.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Chronology chronology16 = org.joda.time.DateTimeUtils.getChronology(chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfHalfday();
        org.joda.time.DurationField durationField18 = durationFieldType14.getField(chronology16);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((java.lang.Object) instant12, chronology16);
        org.joda.time.Instant instant22 = instant12.withDurationAdded(1645514154223L, 100);
        long long23 = instant12.getMillis();
        org.joda.time.Chronology chronology24 = instant12.getChronology();
        org.joda.time.Interval interval25 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration5, (org.joda.time.ReadableInstant) instant12);
        java.lang.String str26 = duration5.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant12", (dateTime11.compareTo(instant12) == 0) == dateTime11.equals(instant12));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.era();
        org.joda.time.DateTime dateTime3 = dateTime0.plusWeeks(100);
        org.joda.time.Period period12 = new org.joda.time.Period(22, (int) (short) 10, (int) '#', (int) (short) 100, 32772, 3, 0, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime0.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property15 = dateTime14.millisOfDay();
        org.joda.time.DateTime dateTime16 = dateTime14.withTimeAtStartOfDay();
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#');
        int int20 = period18.getValue(0);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Duration duration24 = period18.toDurationTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Chronology chronology25 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime26 = dateTime13.toDateTime(chronology25);
        java.lang.String str27 = chronology25.toString();
        org.joda.time.DurationField durationField28 = chronology25.seconds();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate31 = localDate29.withCenturyOfEra(382);
        org.joda.time.LocalDate localDate33 = localDate31.plusDays((int) (byte) 10);
        org.joda.time.Interval interval34 = localDate33.toInterval();
        org.joda.time.DateTime dateTime35 = localDate33.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property36 = localDate33.yearOfEra();
        int int37 = localDate33.getDayOfMonth();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property39 = dateTime38.millisOfDay();
        java.util.Locale locale40 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet41 = locale40.getExtensionKeys();
        java.lang.String str42 = property39.getAsText(locale40);
        org.joda.time.DateTime dateTime43 = property39.withMinimumValue();
        org.joda.time.DateTime dateTime44 = localDate33.toDateTime((org.joda.time.ReadableInstant) dateTime43);
        java.util.TimeZone timeZone46 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone46);
        org.joda.time.DateMidnight dateMidnight48 = localDate33.toDateMidnight(dateTimeZone47);
        org.joda.time.Chronology chronology49 = chronology25.withZone(dateTimeZone47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and dateMidnight48", (dateTime35.compareTo(dateMidnight48) == 0) == dateTime35.equals(dateMidnight48));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.MutableDateTime mutableDateTime6 = instant5.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology9.hourOfHalfday();
        org.joda.time.DurationField durationField11 = durationFieldType7.getField(chronology9);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((java.lang.Object) instant5, chronology9);
        org.joda.time.Interval interval13 = new org.joda.time.Interval(3291028454L, 1645514205307L, chronology9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant5", (dateTime4.compareTo(instant5) == 0) == dateTime4.equals(instant5));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant13 = instant3.withDurationAdded(1645514154223L, 100);
        org.joda.time.Instant instant15 = instant3.minus((long) (byte) -1);
        org.joda.time.Instant instant17 = instant3.minus((long) 0);
        org.joda.time.MutableDateTime mutableDateTime18 = instant3.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.DateTimeZone dateTimeZone11 = instant3.getZone();
        boolean boolean12 = instant3.isAfterNow();
        org.joda.time.Instant instant14 = instant3.minus((long) 52);
        org.joda.time.Instant instant17 = instant3.withDurationAdded((-58312716247319L), 0);
        org.joda.time.Instant instant20 = instant3.withDurationAdded((long) 32772, 26176);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime0, (org.joda.time.ReadablePartial) localTime1, periodType2);
        int int4 = localTime1.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime1.toDateTimeToday(dateTimeZone5);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean8 = localTime1.isSupported(durationFieldType7);
        org.joda.time.Interval interval10 = org.joda.time.Interval.parse("2022-02-22T07:16:05.197Z/2022-02-22T07:16:05.197Z");
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval();
        boolean boolean12 = interval10.isAfter((org.joda.time.ReadableInterval) mutableInterval11);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.eras();
        org.joda.time.Duration duration18 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Chronology chronology20 = org.joda.time.DateTimeUtils.getChronology(chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology20.hourOfHalfday();
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.now(chronology20);
        org.joda.time.Period period23 = duration18.toPeriod(chronology20);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(327L, chronology20);
        org.joda.time.DurationField durationField25 = durationFieldType15.getField(chronology20);
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) 12, 436L, chronology20);
        mutableInterval11.setChronology(chronology20);
        org.joda.time.DurationField durationField28 = durationFieldType7.getField(chronology20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField28, and durationField25", !(durationField25.compareTo(durationField28) == 0) || (Math.signum(durationField25.compareTo(durationField25)) == Math.signum(durationField28.compareTo(durationField25))));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = dateTime3.getChronology();
        int int5 = dateTime3.getDayOfYear();
        org.joda.time.Instant instant6 = dateTime3.toInstant();
        org.joda.time.Instant instant9 = instant6.withDurationAdded(0L, 26207293);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property11 = dateTime10.millisOfDay();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime13);
        int int15 = dateTime12.getMinuteOfDay();
        int int16 = dateTime12.getYearOfCentury();
        int int17 = dateTime12.getDayOfMonth();
        org.joda.time.DateTime dateTime19 = dateTime12.minusWeeks((int) (short) 0);
        boolean boolean20 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(10L, chronology23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekyear();
        int int26 = dateTime24.get(dateTimeFieldType25);
        boolean boolean27 = localTime21.isSupported(dateTimeFieldType25);
        org.joda.time.LocalTime.Property property28 = localTime21.minuteOfHour();
        org.joda.time.LocalTime localTime29 = property28.withMaximumValue();
        org.joda.time.LocalTime localTime31 = localTime29.minusSeconds(2782);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((long) (-1), chronology33);
        org.joda.time.Period period35 = period34.toPeriod();
        int int36 = period35.size();
        int int37 = period35.getMinutes();
        int[] intArray38 = period35.getValues();
        org.joda.time.Duration duration39 = period35.toStandardDuration();
        org.joda.time.LocalTime localTime41 = localTime29.withPeriodAdded((org.joda.time.ReadablePeriod) period35, 0);
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime42, (org.joda.time.ReadablePartial) localTime43, periodType44);
        org.joda.time.Period period46 = period45.negated();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period((long) (-1), chronology48);
        org.joda.time.Period period50 = period49.toPeriod();
        org.joda.time.Period period51 = period46.withFields((org.joda.time.ReadablePeriod) period49);
        org.joda.time.DurationFieldType durationFieldType52 = org.joda.time.DurationFieldType.hours();
        boolean boolean53 = period46.isSupported(durationFieldType52);
        org.joda.time.Period period55 = period46.withDays((int) (short) 0);
        org.joda.time.LocalTime localTime56 = localTime29.plus((org.joda.time.ReadablePeriod) period46);
        org.joda.time.LocalTime.Property property57 = localTime29.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        int int59 = localTime29.indexOf(dateTimeFieldType58);
        org.joda.time.DateTime.Property property60 = dateTime12.property(dateTimeFieldType58);
        org.joda.time.DateTime dateTime62 = dateTime12.minusMinutes(52442703);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'u');
        org.joda.time.MutableDateTime mutableDateTime65 = dateTime62.toMutableDateTime(dateTimeZone64);
        org.joda.time.MutableDateTime mutableDateTime66 = mutableDateTime65.toMutableDateTimeISO();
        boolean boolean67 = instant6.isAfter((org.joda.time.ReadableInstant) mutableDateTime65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime62 and mutableDateTime66", (dateTime62.compareTo(mutableDateTime66) == 0) == dateTime62.equals(mutableDateTime66));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) 54);
        org.joda.time.Minutes minutes6 = duration5.toStandardMinutes();
        long long7 = duration5.getStandardMinutes();
        org.joda.time.Instant instant9 = instant3.withDurationAdded((org.joda.time.ReadableDuration) duration5, 26171);
        org.joda.time.Instant instant11 = instant9.minus(1830297600034L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1645514176563L);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        java.lang.String str5 = interval4.toString();
        org.joda.time.DateTime dateTime6 = interval4.getEnd();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusWeeks((int) (byte) 10);
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationFrom(readableInstant12);
        long long14 = duration13.getMillis();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.plus((org.joda.time.ReadableDuration) duration13);
        boolean boolean16 = interval4.equals((java.lang.Object) duration13);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime20 = interval19.getEnd();
        org.joda.time.Interval interval21 = interval19.toInterval();
        org.joda.time.MutableInterval mutableInterval22 = interval21.toMutableInterval();
        org.joda.time.Interval interval23 = interval4.gap((org.joda.time.ReadableInterval) interval21);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime();
        int int25 = localDateTime24.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minusWeeks((int) (byte) 10);
        org.joda.time.Period period30 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period30.toDurationFrom(readableInstant31);
        long long33 = duration32.getMillis();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.plus((org.joda.time.ReadableDuration) duration32);
        long long35 = duration32.getMillis();
        java.lang.String str36 = duration32.toString();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusWeeks((int) (byte) 10);
        org.joda.time.Period period41 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Duration duration43 = period41.toDurationFrom(readableInstant42);
        long long44 = duration43.getMillis();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime39.plus((org.joda.time.ReadableDuration) duration43);
        java.lang.String str46 = duration43.toString();
        boolean boolean47 = duration32.isShorterThan((org.joda.time.ReadableDuration) duration43);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime24.withDurationAdded((org.joda.time.ReadableDuration) duration43, 1970);
        org.joda.time.Interval interval50 = interval4.withDurationAfterStart((org.joda.time.ReadableDuration) duration43);
        org.joda.time.Instant instant51 = instant1.plus((org.joda.time.ReadableDuration) duration43);
        org.joda.time.Instant instant52 = instant1.toInstant();
        org.joda.time.DateTime dateTime53 = instant1.toDateTime();
        org.joda.time.Chronology chronology54 = instant1.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime53", (instant1.compareTo(dateTime53) == 0) == instant1.equals(dateTime53));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Interval interval4 = interval2.toInterval();
        org.joda.time.MutableInterval mutableInterval5 = interval4.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval6 = mutableInterval5.toMutableInterval();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant10 = dateTime9.toInstant();
        org.joda.time.MutableDateTime mutableDateTime11 = instant10.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getChronology(chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology14.hourOfHalfday();
        org.joda.time.DurationField durationField16 = durationFieldType12.getField(chronology14);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((java.lang.Object) instant10, chronology14);
        org.joda.time.Instant instant19 = instant10.plus(1645514151873L);
        org.joda.time.Instant instant21 = instant19.plus((long) 26217);
        boolean boolean22 = mutableInterval5.isAfter((org.joda.time.ReadableInstant) instant21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant10", (dateTime9.compareTo(instant10) == 0) == dateTime9.equals(instant10));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.millisOfDay();
        org.joda.time.DateTime dateTime2 = dateTime0.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property3 = dateTime2.millisOfSecond();
        org.joda.time.DateTime dateTime4 = property3.withMinimumValue();
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.DateTime.Property property6 = dateTime4.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant5", (dateTime4.compareTo(instant5) == 0) == dateTime4.equals(instant5));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) 54);
        org.joda.time.Minutes minutes6 = duration5.toStandardMinutes();
        long long7 = duration5.getStandardMinutes();
        org.joda.time.Instant instant9 = instant3.withDurationAdded((org.joda.time.ReadableDuration) duration5, 26171);
        org.joda.time.DateTime dateTime10 = instant9.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.hourOfHalfday();
        org.joda.time.DateTime dateTime6 = dateTime0.toDateTime(chronology4);
        org.joda.time.DurationField durationField7 = chronology4.millis();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology4);
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withFieldAdded(durationFieldType12, 1970);
        int int15 = localDateTime14.getEra();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.minusSeconds(26171);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.Interval interval20 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime21 = interval20.getEnd();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeUtils.getZone(dateTimeZone23);
        java.lang.String str26 = dateTimeZone24.getName((long) ' ');
        java.lang.String str28 = dateTimeZone24.getName((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(0L, dateTimeZone24);
        org.joda.time.DateTime dateTime30 = dateTime21.withZone(dateTimeZone24);
        java.lang.String str32 = dateTimeZone24.getNameKey(1645514153208L);
        org.joda.time.DateTime dateTime33 = localDateTime14.toDateTime(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime34 = instant9.toMutableDateTime(dateTimeZone24);
        org.joda.time.Instant instant35 = instant9.toInstant();
        org.joda.time.DateTime dateTime36 = instant35.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant35", (dateTime0.compareTo(instant35) == 0) == dateTime0.equals(instant35));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusWeeks((int) (byte) 10);
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        long long7 = duration6.getMillis();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.plus((org.joda.time.ReadableDuration) duration6);
        org.joda.time.Duration duration10 = duration6.minus((long) 38222);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.Interval interval13 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getChronology(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.hourOfHalfday();
        org.joda.time.DateTime dateTime17 = dateTime11.toDateTime(chronology15);
        org.joda.time.DurationField durationField18 = chronology15.millis();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology15);
        org.joda.time.Instant instant20 = dateTime19.toInstant();
        java.lang.String str21 = instant20.toString();
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusWeeks((int) (byte) 10);
        org.joda.time.Period period27 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationFrom(readableInstant28);
        long long30 = duration29.getMillis();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.plus((org.joda.time.ReadableDuration) duration29);
        mutableInterval22.setDurationAfterStart((org.joda.time.ReadableDuration) duration29);
        org.joda.time.Duration duration33 = mutableInterval22.toDuration();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusWeeks((int) (byte) 10);
        org.joda.time.Period period38 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = period38.toDurationFrom(readableInstant39);
        long long41 = duration40.getMillis();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime36.plus((org.joda.time.ReadableDuration) duration40);
        long long43 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration40);
        boolean boolean44 = duration33.isShorterThan((org.joda.time.ReadableDuration) duration40);
        long long45 = duration40.getStandardDays();
        org.joda.time.Duration duration47 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime();
        org.joda.time.Interval interval50 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime48, (org.joda.time.ReadableInstant) dateTime49);
        int int51 = dateTime48.getMinuteOfDay();
        org.joda.time.Period period53 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime54 = dateTime48.plus((org.joda.time.ReadablePeriod) period53);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = dateTime48.toDateTime(chronology55);
        org.joda.time.DateTime dateTime58 = dateTime48.minus((long) 10);
        org.joda.time.Period period59 = duration47.toPeriodFrom((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property61 = dateTime60.era();
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime64 = dateTime62.plusWeeks((int) (byte) 1);
        int int65 = property61.compareTo((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime();
        org.joda.time.Interval interval68 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime66, (org.joda.time.ReadableInstant) dateTime67);
        boolean boolean70 = interval68.isAfter((long) 10);
        org.joda.time.Duration duration71 = interval68.toDuration();
        org.joda.time.Duration duration74 = duration71.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval75 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime62, (org.joda.time.ReadableDuration) duration74);
        org.joda.time.Duration duration77 = duration47.withDurationAdded((org.joda.time.ReadableDuration) duration74, 26160257);
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime();
        org.joda.time.Interval interval80 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime78, (org.joda.time.ReadableInstant) dateTime79);
        boolean boolean82 = interval80.isAfter((long) 10);
        org.joda.time.Duration duration83 = interval80.toDuration();
        boolean boolean84 = duration77.isLongerThan((org.joda.time.ReadableDuration) duration83);
        int int85 = duration40.compareTo((org.joda.time.ReadableDuration) duration77);
        long long86 = duration77.getStandardDays();
        org.joda.time.Instant instant88 = instant20.withDurationAdded((org.joda.time.ReadableDuration) duration77, 70);
        org.joda.time.MutableDateTime mutableDateTime89 = instant20.toMutableDateTimeISO();
        org.joda.time.Interval interval90 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration6, (org.joda.time.ReadableInstant) instant20);
        long long91 = duration6.getStandardSeconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant20", (dateTime11.compareTo(instant20) == 0) == dateTime11.equals(instant20));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withYearOfEra(3);
        int int3 = localDateTime2.getDayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.property(dateTimeFieldType4);
        org.joda.time.LocalDateTime localDateTime6 = property5.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime7 = property5.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusMillis(16);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusMillis(122);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusSeconds(52675);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime16 = dateTime14.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant17 = dateTime16.toInstant();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = localDateTime18.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.plusYears(26151451);
        org.joda.time.Period period24 = new org.joda.time.Period((long) '#');
        int int26 = period24.getValue(0);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime();
        org.joda.time.Interval interval29 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Duration duration30 = period24.toDurationTo((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime22.withPeriodAdded((org.joda.time.ReadablePeriod) period24, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean34 = localDateTime22.isSupported(dateTimeFieldType33);
        int int35 = instant17.get(dateTimeFieldType33);
        int int36 = localDateTime13.get(dateTimeFieldType33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant17", (dateTime16.compareTo(instant17) == 0) == dateTime16.equals(instant17));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes(435L);
        long long6 = duration5.getMillis();
        org.joda.time.Duration duration8 = duration5.minus((long) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime2.minus((org.joda.time.ReadableDuration) duration5);
        org.joda.time.DateTime dateTime11 = dateTime9.withMillis(1645514304836L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = instant0.getChronology();
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        org.joda.time.Duration duration9 = duration5.withDurationAdded((long) 32772, (int) (byte) 10);
        java.lang.String str10 = duration5.toString();
        org.joda.time.Period period11 = duration5.toPeriod();
        org.joda.time.Instant instant12 = instant0.plus((org.joda.time.ReadableDuration) duration5);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property14 = dateTime13.millisOfDay();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime16);
        int int18 = dateTime15.getMinuteOfDay();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(10L, chronology20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.weekyear();
        int int23 = dateTime21.get(dateTimeFieldType22);
        int int24 = dateTime15.get(dateTimeFieldType22);
        boolean boolean25 = dateTime13.isEqual((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime.Property property26 = dateTime15.weekyear();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeUtils.getZone(dateTimeZone27);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((java.lang.Object) dateTime15, dateTimeZone28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(10L, chronology31);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.weekyear();
        int int34 = dateTime32.get(dateTimeFieldType33);
        org.joda.time.DateMidnight dateMidnight35 = dateTime32.toDateMidnight();
        org.joda.time.DateTime dateTime36 = localDate29.toDateTime((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.LocalDate localDate38 = localDate29.plusYears((int) '4');
        org.joda.time.DateTime dateTime39 = localDate38.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime40 = localDate38.toDateTimeAtStartOfDay();
        org.joda.time.Duration duration41 = new org.joda.time.Duration((org.joda.time.ReadableInstant) instant12, (org.joda.time.ReadableInstant) dateTime40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime13", (instant0.compareTo(dateTime13) == 0) == instant0.equals(dateTime13));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        java.lang.String str8 = dateTimeZone6.getName((long) ' ');
        java.lang.String str10 = dateTimeZone6.getName((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(0L, dateTimeZone6);
        org.joda.time.DateTime dateTime12 = dateTime3.withZone(dateTimeZone6);
        long long14 = dateTimeZone6.convertUTCToLocal((long) 26153423);
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusWeeks((int) (byte) 10);
        org.joda.time.Period period21 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period21.toDurationFrom(readableInstant22);
        long long24 = duration23.getMillis();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.plus((org.joda.time.ReadableDuration) duration23);
        mutableInterval16.setDurationAfterStart((org.joda.time.ReadableDuration) duration23);
        org.joda.time.Duration duration27 = mutableInterval16.toDuration();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusWeeks((int) (byte) 10);
        org.joda.time.Period period32 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = period32.toDurationFrom(readableInstant33);
        long long35 = duration34.getMillis();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.plus((org.joda.time.ReadableDuration) duration34);
        long long37 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration34);
        boolean boolean38 = duration27.isShorterThan((org.joda.time.ReadableDuration) duration34);
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.minusWeeks((int) (byte) 10);
        org.joda.time.Period period44 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = period44.toDurationFrom(readableInstant45);
        long long47 = duration46.getMillis();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime42.plus((org.joda.time.ReadableDuration) duration46);
        mutableInterval39.setDurationAfterStart((org.joda.time.ReadableDuration) duration46);
        org.joda.time.Duration duration50 = mutableInterval39.toDuration();
        boolean boolean51 = duration34.isShorterThan((org.joda.time.ReadableDuration) duration50);
        org.joda.time.Instant instant53 = instant15.withDurationAdded((org.joda.time.ReadableDuration) duration34, 20);
        org.joda.time.PeriodType periodType54 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType55 = periodType54.withDaysRemoved();
        org.joda.time.PeriodType periodType56 = periodType54.withDaysRemoved();
        org.joda.time.PeriodType periodType57 = periodType54.withMinutesRemoved();
        org.joda.time.Period period58 = duration34.toPeriod(periodType57);
        boolean boolean59 = dateTimeZone6.equals((java.lang.Object) period58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant15", (dateTime0.compareTo(instant15) == 0) == dateTime0.equals(instant15));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime6 = dateTime0.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = dateTime0.toDateTime(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime0.minus((long) 10);
        org.joda.time.DateTime dateTime12 = dateTime0.minusHours(7);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime dateTime16 = interval15.getEnd();
        org.joda.time.Interval interval17 = interval15.toInterval();
        long long18 = interval15.getEndMillis();
        java.lang.String str19 = interval15.toString();
        org.joda.time.DateTime dateTime20 = interval15.getStart();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property22 = dateTime21.era();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime25 = dateTime23.plusWeeks((int) (byte) 1);
        int int26 = property22.compareTo((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property29 = dateTime28.era();
        org.joda.time.DateTime.Property property30 = dateTime28.weekyear();
        org.joda.time.DateTime dateTime32 = dateTime28.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.Period period33 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Chronology chronology36 = org.joda.time.DateTimeUtils.getChronology(chronology35);
        org.joda.time.DateTimeField dateTimeField37 = chronology36.hourOfHalfday();
        org.joda.time.DurationField durationField38 = durationFieldType34.getField(chronology36);
        org.joda.time.PeriodType periodType41 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType42 = periodType41.withSecondsRemoved();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime();
        org.joda.time.Interval interval45 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Chronology chronology47 = org.joda.time.DateTimeUtils.getChronology(chronology46);
        org.joda.time.DateTimeField dateTimeField48 = chronology47.hourOfHalfday();
        org.joda.time.DateTime dateTime49 = dateTime43.toDateTime(chronology47);
        org.joda.time.Period period50 = new org.joda.time.Period((long) 1, (long) ' ', periodType42, chronology47);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(dateTimeZone51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.withCenturyOfEra(2);
        long long56 = chronology47.set((org.joda.time.ReadablePartial) localDateTime52, (long) (short) 10);
        org.joda.time.DurationField durationField57 = chronology47.seconds();
        org.joda.time.DateTimeField dateTimeField58 = chronology47.millisOfDay();
        boolean boolean59 = durationFieldType34.isSupported(chronology47);
        org.joda.time.DateTimeField dateTimeField60 = chronology47.hourOfHalfday();
        long long64 = chronology47.add((long) 22, 1645514153096L, (int) ' ');
        org.joda.time.DateTimeField dateTimeField65 = chronology47.year();
        org.joda.time.DateTime dateTime66 = dateTime20.toDateTime(chronology47);
        org.joda.time.DurationField durationField67 = chronology47.weekyears();
        org.joda.time.DateTime dateTime68 = dateTime0.toDateTime(chronology47);
        org.joda.time.DurationField durationField69 = chronology47.centuries();
        org.joda.time.DurationField durationField70 = chronology47.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField70, durationField38, and durationField57", !(durationField70.compareTo(durationField38) == 0) || (Math.signum(durationField70.compareTo(durationField57)) == Math.signum(durationField38.compareTo(durationField57))));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        java.lang.String str3 = interval2.toString();
        org.joda.time.DateTime dateTime4 = interval2.getEnd();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusWeeks((int) (byte) 10);
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        long long12 = duration11.getMillis();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.plus((org.joda.time.ReadableDuration) duration11);
        boolean boolean14 = interval2.equals((java.lang.Object) duration11);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property16 = dateTime15.era();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime19 = dateTime17.plusWeeks((int) (byte) 1);
        int int20 = property16.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableInstant) dateTime22);
        boolean boolean25 = interval23.isAfter((long) 10);
        org.joda.time.Duration duration26 = interval23.toDuration();
        org.joda.time.Duration duration29 = duration26.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval30 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableDuration) duration29);
        boolean boolean31 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration29);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime34 = dateTime32.plusWeeks((int) (byte) 1);
        org.joda.time.DateTime.Property property35 = dateTime34.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeUtils.getZone(dateTimeZone36);
        java.lang.String str39 = dateTimeZone37.getName((long) ' ');
        org.joda.time.DateTime dateTime40 = dateTime34.toDateTime(dateTimeZone37);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property42 = dateTime41.era();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime45 = dateTime43.plusWeeks((int) (byte) 1);
        int int46 = property42.compareTo((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime();
        org.joda.time.Interval interval49 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime47, (org.joda.time.ReadableInstant) dateTime48);
        boolean boolean51 = interval49.isAfter((long) 10);
        org.joda.time.Duration duration52 = interval49.toDuration();
        org.joda.time.Duration duration55 = duration52.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval56 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableDuration) duration55);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime59 = dateTime57.plusWeeks((int) (byte) 1);
        org.joda.time.DateTime.Property property60 = dateTime59.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeUtils.getZone(dateTimeZone61);
        java.lang.String str64 = dateTimeZone62.getName((long) ' ');
        org.joda.time.DateTime dateTime65 = dateTime59.toDateTime(dateTimeZone62);
        org.joda.time.PeriodType periodType66 = org.joda.time.PeriodType.time();
        org.joda.time.Period period67 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration55, (org.joda.time.ReadableInstant) dateTime65, periodType66);
        org.joda.time.PeriodType periodType68 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType69 = periodType68.withDaysRemoved();
        org.joda.time.Period period70 = period67.normalizedStandard(periodType69);
        org.joda.time.Period period71 = duration29.toPeriodTo((org.joda.time.ReadableInstant) dateTime40, periodType69);
        org.joda.time.DateTime dateTime73 = dateTime40.minusMinutes(51);
        org.joda.time.MutableDateTime mutableDateTime74 = dateTime73.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetHours(35);
        org.joda.time.DateTime dateTime77 = dateTime73.toDateTime(dateTimeZone76);
        long long78 = dateTime73.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime74 and dateTime77", (mutableDateTime74.compareTo(dateTime77) == 0) == mutableDateTime74.equals(dateTime77));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime10);
        int int12 = dateTime9.getMinuteOfDay();
        int int13 = dateTime9.getYearOfCentury();
        int int14 = dateTime9.getDayOfMonth();
        org.joda.time.DateTime dateTime16 = dateTime9.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property17 = dateTime16.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField18 = property17.getField();
        int int19 = dateTimeField18.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minusWeeks((int) (byte) 10);
        org.joda.time.Period period24 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period24.toDurationFrom(readableInstant25);
        long long27 = duration26.getMillis();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.plus((org.joda.time.ReadableDuration) duration26);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str31 = dateTimeField18.getAsText((org.joda.time.ReadablePartial) localDateTime22, (int) (short) 1, locale30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime22.withYear(26151451);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withField(dateTimeFieldType34, (int) '#');
        org.joda.time.DateTime dateTime38 = dateTime7.withField(dateTimeFieldType34, 100);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime41 = dateTime39.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant42 = dateTime41.toInstant();
        org.joda.time.MutableDateTime mutableDateTime43 = instant42.toMutableDateTimeISO();
        org.joda.time.Duration duration45 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime();
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime46, (org.joda.time.ReadableInstant) dateTime47);
        int int49 = dateTime46.getMinuteOfDay();
        org.joda.time.Period period51 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime52 = dateTime46.plus((org.joda.time.ReadablePeriod) period51);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = dateTime46.toDateTime(chronology53);
        org.joda.time.DateTime dateTime56 = dateTime46.minus((long) 10);
        org.joda.time.Period period57 = duration45.toPeriodFrom((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property59 = dateTime58.era();
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime62 = dateTime60.plusWeeks((int) (byte) 1);
        int int63 = property59.compareTo((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime();
        org.joda.time.Interval interval66 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime64, (org.joda.time.ReadableInstant) dateTime65);
        boolean boolean68 = interval66.isAfter((long) 10);
        org.joda.time.Duration duration69 = interval66.toDuration();
        org.joda.time.Duration duration72 = duration69.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval73 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime60, (org.joda.time.ReadableDuration) duration72);
        org.joda.time.Duration duration75 = duration45.withDurationAdded((org.joda.time.ReadableDuration) duration72, 26160257);
        org.joda.time.Instant instant76 = instant42.plus((org.joda.time.ReadableDuration) duration72);
        org.joda.time.PeriodType periodType77 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.PeriodType periodType78 = org.joda.time.DateTimeUtils.getPeriodType(periodType77);
        org.joda.time.PeriodType periodType79 = periodType77.withYearsRemoved();
        org.joda.time.PeriodType periodType80 = periodType77.withSecondsRemoved();
        org.joda.time.Period period81 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime38, (org.joda.time.ReadableInstant) instant76, periodType80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and instant42", (dateTime41.compareTo(instant42) == 0) == dateTime41.equals(instant42));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.Interval interval3 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) dateTime2);
        boolean boolean5 = interval3.isAfter((long) 10);
        org.joda.time.Duration duration6 = interval3.toDuration();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(10L, chronology8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        int int11 = dateTime9.get(dateTimeFieldType10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 10, chronology13);
        boolean boolean15 = dateTime9.isEqual((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property17 = dateTime16.era();
        boolean boolean18 = dateTime14.isBefore((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType22 = periodType21.withSecondsRemoved();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.Interval interval25 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Chronology chronology27 = org.joda.time.DateTimeUtils.getChronology(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology27.hourOfHalfday();
        org.joda.time.DateTime dateTime29 = dateTime23.toDateTime(chronology27);
        org.joda.time.Period period30 = new org.joda.time.Period((long) 1, (long) ' ', periodType22, chronology27);
        org.joda.time.DateTime dateTime31 = dateTime16.plus((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Interval interval32 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration6, (org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Instant instant33 = instant0.minus((org.joda.time.ReadableDuration) duration6);
        org.joda.time.Chronology chronology34 = instant0.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes(435L);
        long long6 = duration5.getMillis();
        org.joda.time.Duration duration8 = duration5.minus((long) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime2.minus((org.joda.time.ReadableDuration) duration5);
        org.joda.time.Minutes minutes10 = duration5.toStandardMinutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = instant0.getChronology();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withFieldAdded(durationFieldType4, 1970);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime12 = interval11.getEnd();
        org.joda.time.Interval interval13 = interval11.toInterval();
        long long14 = interval11.getEndMillis();
        java.lang.String str15 = interval11.toString();
        org.joda.time.DateTime dateTime16 = interval11.getStart();
        org.joda.time.Chronology chronology17 = interval11.getChronology();
        org.joda.time.Period period18 = new org.joda.time.Period(0L, 1645514152681L, chronology17);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime6.minus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusDays(100);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusHours((int) 'a');
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType27 = periodType26.withSecondsRemoved();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        org.joda.time.Interval interval30 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Chronology chronology32 = org.joda.time.DateTimeUtils.getChronology(chronology31);
        org.joda.time.DateTimeField dateTimeField33 = chronology32.hourOfHalfday();
        org.joda.time.DateTime dateTime34 = dateTime28.toDateTime(chronology32);
        org.joda.time.Period period35 = new org.joda.time.Period((long) 1, (long) ' ', periodType27, chronology32);
        org.joda.time.Period period36 = period35.negated();
        org.joda.time.Period period38 = new org.joda.time.Period((long) '#');
        int int40 = period38.getValue(0);
        org.joda.time.DurationFieldType durationFieldType41 = org.joda.time.DurationFieldType.hours();
        int int42 = period38.get(durationFieldType41);
        boolean boolean43 = period36.isSupported(durationFieldType41);
        boolean boolean44 = localDateTime21.isSupported(durationFieldType41);
        int int45 = localDateTime21.getDayOfYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter46 = null;
        org.joda.time.format.DateTimeParser dateTimeParser47 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter46, dateTimeParser47);
        org.joda.time.Chronology chronology49 = dateTimeFormatter48.getChronolgy();
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime();
        org.joda.time.Interval interval52 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime50, (org.joda.time.ReadableInstant) dateTime51);
        int int53 = dateTime50.getMinuteOfDay();
        org.joda.time.Period period55 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime56 = dateTime50.plus((org.joda.time.ReadablePeriod) period55);
        org.joda.time.DateTime dateTime58 = dateTime56.withDayOfYear((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone59 = dateTime56.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter48.withZone(dateTimeZone59);
        org.joda.time.DateTime dateTime61 = localDateTime21.toDateTime(dateTimeZone59);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime();
        org.joda.time.Interval interval65 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) dateTime64);
        int int66 = dateTime63.getMinuteOfDay();
        int int67 = dateTime63.getYearOfCentury();
        int int68 = dateTime63.getDayOfMonth();
        org.joda.time.DateTime dateTime70 = dateTime63.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property71 = dateTime70.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField72 = property71.getField();
        int int73 = dateTimeField72.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime76 = localDateTime74.minusWeeks((int) (byte) 10);
        org.joda.time.Period period78 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.Duration duration80 = period78.toDurationFrom(readableInstant79);
        long long81 = duration80.getMillis();
        org.joda.time.LocalDateTime localDateTime82 = localDateTime76.plus((org.joda.time.ReadableDuration) duration80);
        java.util.Locale locale84 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str85 = dateTimeField72.getAsText((org.joda.time.ReadablePartial) localDateTime76, (int) (short) 1, locale84);
        java.util.Locale locale86 = java.util.Locale.getDefault();
        java.lang.String str87 = locale84.getDisplayLanguage(locale86);
        java.lang.String str88 = dateTimeZone59.getName(1645514222375L, locale86);
        org.joda.time.MutableDateTime mutableDateTime89 = instant0.toMutableDateTime(dateTimeZone59);
        org.joda.time.LocalDate localDate90 = org.joda.time.LocalDate.now(dateTimeZone59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime9", (instant0.compareTo(dateTime9) == 0) == instant0.equals(dateTime9));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Interval interval4 = interval2.toInterval();
        long long5 = interval2.getEndMillis();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = dateTime6.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = localDateTime10.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.plusYears(26151451);
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#');
        int int18 = period16.getValue(0);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.Interval interval21 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.Duration duration22 = period16.toDurationTo((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime14.withPeriodAdded((org.joda.time.ReadablePeriod) period16, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean26 = localDateTime14.isSupported(dateTimeFieldType25);
        int int27 = instant9.get(dateTimeFieldType25);
        org.joda.time.Interval interval28 = interval2.withEnd((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Instant instant31 = instant9.withDurationAdded(1645514206304L, 917);
        boolean boolean33 = instant31.isEqual(3291028681705L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant9", (dateTime8.compareTo(instant9) == 0) == dateTime8.equals(instant9));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        int int10 = dateTimeField9.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusWeeks((int) (byte) 10);
        org.joda.time.Period period15 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationFrom(readableInstant16);
        long long18 = duration17.getMillis();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.plus((org.joda.time.ReadableDuration) duration17);
        java.util.Locale locale21 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str22 = dateTimeField9.getAsText((org.joda.time.ReadablePartial) localDateTime13, (int) (short) 1, locale21);
        org.joda.time.ReadablePartial readablePartial23 = null;
        int int24 = dateTimeField9.getMaximumValue(readablePartial23);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = localDateTime25.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.plusYears(26151451);
        org.joda.time.Period period31 = new org.joda.time.Period((long) '#');
        int int33 = period31.getValue(0);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime();
        org.joda.time.Interval interval36 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime34, (org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Duration duration37 = period31.toDurationTo((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime29.withPeriodAdded((org.joda.time.ReadablePeriod) period31, 0);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) (-1), chronology41);
        org.joda.time.Period period43 = period42.toPeriod();
        int int44 = period43.size();
        int int45 = period43.getMinutes();
        int[] intArray46 = period43.getValues();
        int int47 = dateTimeField9.getMinimumValue((org.joda.time.ReadablePartial) localDateTime39, intArray46);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime39.minusSeconds(382);
        org.joda.time.Period period51 = new org.joda.time.Period((long) '#');
        int int53 = period51.getValue(0);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime();
        org.joda.time.Interval interval56 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime54, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Duration duration57 = period51.toDurationTo((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Period period59 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Duration duration61 = period59.toDurationFrom(readableInstant60);
        org.joda.time.Seconds seconds62 = duration61.toStandardSeconds();
        boolean boolean63 = duration57.isEqual((org.joda.time.ReadableDuration) duration61);
        org.joda.time.PeriodType periodType66 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType67 = periodType66.withSecondsRemoved();
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime();
        org.joda.time.Interval interval70 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime68, (org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.Chronology chronology72 = org.joda.time.DateTimeUtils.getChronology(chronology71);
        org.joda.time.DateTimeField dateTimeField73 = chronology72.hourOfHalfday();
        org.joda.time.DateTime dateTime74 = dateTime68.toDateTime(chronology72);
        org.joda.time.Period period75 = new org.joda.time.Period((long) 1, (long) ' ', periodType67, chronology72);
        org.joda.time.DurationField durationField76 = chronology72.weeks();
        boolean boolean77 = duration61.equals((java.lang.Object) chronology72);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime39.plus((org.joda.time.ReadableDuration) duration61);
        org.joda.time.LocalDateTime localDateTime80 = localDateTime78.minusDays((-604800000));
        org.joda.time.DurationFieldType durationFieldType81 = org.joda.time.DurationFieldType.eras();
        org.joda.time.LocalDateTime localDateTime82 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = localDateTime82.getFieldType((int) (short) 1);
        org.joda.time.Chronology chronology85 = null;
        org.joda.time.Chronology chronology86 = org.joda.time.DateTimeUtils.getChronology(chronology85);
        org.joda.time.DateTimeField dateTimeField87 = chronology86.hourOfHalfday();
        boolean boolean88 = dateTimeFieldType84.isSupported(chronology86);
        org.joda.time.DurationField durationField89 = durationFieldType81.getField(chronology86);
        boolean boolean90 = localDateTime80.isSupported(durationFieldType81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField76 and durationField89", Math.signum(durationField76.compareTo(durationField89)) == -Math.signum(durationField89.compareTo(durationField76)));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getChronology(chronology0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.hourOfHalfday();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.now(chronology1);
        org.joda.time.DurationField durationField4 = chronology1.years();
        org.joda.time.DurationField durationField5 = chronology1.eras();
        long long9 = chronology1.add(1645514333327L, (-60480000000L), 26302939);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField5", Math.signum(durationField4.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField4)));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.millisOfDay();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        int int5 = dateTime2.getMinuteOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(10L, chronology7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        int int10 = dateTime8.get(dateTimeFieldType9);
        int int11 = dateTime2.get(dateTimeFieldType9);
        boolean boolean12 = dateTime0.isEqual((org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.DateTime.Property property13 = dateTime2.weekyear();
        org.joda.time.DateTime.Property property14 = dateTime2.monthOfYear();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime17 = dateTime15.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant18 = dateTime17.toInstant();
        org.joda.time.MutableDateTime mutableDateTime19 = instant18.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Chronology chronology22 = org.joda.time.DateTimeUtils.getChronology(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology22.hourOfHalfday();
        org.joda.time.DurationField durationField24 = durationFieldType20.getField(chronology22);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((java.lang.Object) instant18, chronology22);
        org.joda.time.Instant instant28 = instant18.withDurationAdded(1645514154223L, 100);
        org.joda.time.DateTime dateTime29 = instant18.toDateTimeISO();
        boolean boolean31 = instant18.isBefore((long) 53);
        int int32 = property14.getDifference((org.joda.time.ReadableInstant) instant18);
        org.joda.time.DurationField durationField33 = property14.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and instant18", (dateTime17.compareTo(instant18) == 0) == dateTime17.equals(instant18));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.LocalTime localTime12 = localTime10.minusHours(62365);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) 54);
        org.joda.time.Minutes minutes2 = duration1.toStandardMinutes();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant6 = dateTime5.toInstant();
        org.joda.time.MutableDateTime mutableDateTime7 = instant6.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.hourOfHalfday();
        org.joda.time.DurationField durationField12 = durationFieldType8.getField(chronology10);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((java.lang.Object) instant6, chronology10);
        org.joda.time.Instant instant16 = instant6.withDurationAdded(1645514154223L, 100);
        org.joda.time.Interval interval17 = duration1.toIntervalTo((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Instant instant20 = instant6.withDurationAdded(830200320000000L, 1097);
        org.joda.time.DateTime dateTime21 = instant6.toDateTimeISO();
        java.lang.Object obj22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property24 = dateTime23.millisOfDay();
        org.joda.time.DateTime dateTime25 = dateTime23.withTimeAtStartOfDay();
        org.joda.time.Period period27 = new org.joda.time.Period((long) '#');
        int int29 = period27.getValue(0);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        org.joda.time.Interval interval32 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Duration duration33 = period27.toDurationTo((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.millisOfDay();
        org.joda.time.Period period36 = new org.joda.time.Period(obj22, chronology34);
        org.joda.time.Period period38 = period36.withMonths(474);
        org.joda.time.Period period39 = period36.toPeriod();
        org.joda.time.Period period41 = period39.withMillis(26228534);
        org.joda.time.Period period43 = period41.minusWeeks(52445959);
        org.joda.time.Period period44 = period43.toPeriod();
        boolean boolean45 = dateTime21.equals((java.lang.Object) period43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant6", (dateTime5.compareTo(instant6) == 0) == dateTime5.equals(instant6));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant13 = instant3.withDurationAdded(1645514154223L, 100);
        org.joda.time.Instant instant15 = instant3.minus((long) (byte) -1);
        org.joda.time.DateTime dateTime16 = instant3.toDateTimeISO();
        org.joda.time.DateTime dateTime17 = instant3.toDateTimeISO();
        org.joda.time.DateTime.Property property18 = dateTime17.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.DateTimeZone dateTimeZone11 = instant3.getZone();
        boolean boolean12 = instant3.isAfterNow();
        org.joda.time.Instant instant14 = instant3.minus((long) 52);
        org.joda.time.Interval interval16 = org.joda.time.Interval.parse("2022-02-22T07:16:05.197Z/2022-02-22T07:16:05.197Z");
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval();
        boolean boolean18 = interval16.isAfter((org.joda.time.ReadableInterval) mutableInterval17);
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minusWeeks((int) (byte) 10);
        org.joda.time.Period period24 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period24.toDurationFrom(readableInstant25);
        long long27 = duration26.getMillis();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.plus((org.joda.time.ReadableDuration) duration26);
        mutableInterval19.setDurationAfterStart((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Period period31 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = period31.toDurationFrom(readableInstant32);
        org.joda.time.Seconds seconds34 = duration33.toStandardSeconds();
        long long35 = duration33.getStandardSeconds();
        mutableInterval19.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration33);
        mutableInterval17.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration33);
        org.joda.time.Instant instant38 = instant14.minus((org.joda.time.ReadableDuration) duration33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.hourOfHalfday();
        org.joda.time.DateTime dateTime6 = dateTime0.toDateTime(chronology4);
        org.joda.time.DurationField durationField7 = chronology4.millis();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology4);
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withFieldAdded(durationFieldType12, 1970);
        int int15 = localDateTime14.getEra();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.minusSeconds(26171);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.Interval interval20 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime21 = interval20.getEnd();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeUtils.getZone(dateTimeZone23);
        java.lang.String str26 = dateTimeZone24.getName((long) ' ');
        java.lang.String str28 = dateTimeZone24.getName((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(0L, dateTimeZone24);
        org.joda.time.DateTime dateTime30 = dateTime21.withZone(dateTimeZone24);
        java.lang.String str32 = dateTimeZone24.getNameKey(1645514153208L);
        org.joda.time.DateTime dateTime33 = localDateTime14.toDateTime(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime34 = instant9.toMutableDateTime(dateTimeZone24);
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant9", (dateTime0.compareTo(instant9) == 0) == dateTime0.equals(instant9));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Duration duration6 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        int int10 = dateTime7.getMinuteOfDay();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime13 = dateTime7.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime7.toDateTime(chronology14);
        org.joda.time.DateTime dateTime17 = dateTime7.minus((long) 10);
        org.joda.time.Period period18 = duration6.toPeriodFrom((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property20 = dateTime19.era();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.plusWeeks((int) (byte) 1);
        int int24 = property20.compareTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime26);
        boolean boolean29 = interval27.isAfter((long) 10);
        org.joda.time.Duration duration30 = interval27.toDuration();
        org.joda.time.Duration duration33 = duration30.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableDuration) duration33);
        org.joda.time.Duration duration36 = duration6.withDurationAdded((org.joda.time.ReadableDuration) duration33, 26160257);
        org.joda.time.Instant instant37 = instant3.plus((org.joda.time.ReadableDuration) duration33);
        org.joda.time.DateTime dateTime38 = instant3.toDateTime();
        org.joda.time.DateTime dateTime40 = dateTime38.minusYears(52681525);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("2022-02-22T07:16:00.256Z/2022-02-22T07:16:00.256Z");
        timeZone2.setID("2022-02-22T07:16:17.690Z/2022-02-22T07:16:17.690Z");
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        int int10 = dateTime7.getMinuteOfDay();
        int int11 = dateTime7.getYearOfCentury();
        int int12 = dateTime7.getDayOfMonth();
        org.joda.time.DateTime dateTime14 = dateTime7.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        int int17 = dateTimeField16.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusWeeks((int) (byte) 10);
        org.joda.time.Period period22 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationFrom(readableInstant23);
        long long25 = duration24.getMillis();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.plus((org.joda.time.ReadableDuration) duration24);
        java.util.Locale locale28 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str29 = dateTimeField16.getAsText((org.joda.time.ReadablePartial) localDateTime20, (int) (short) 1, locale28);
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.lang.String str31 = locale28.getDisplayLanguage(locale30);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(timeZone6, locale30);
        int int33 = timeZone6.getRawOffset();
        timeZone6.setID("2022-02-22T07:16:22.943Z/2022-02-22T07:16:22.943Z");
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime();
        org.joda.time.Interval interval38 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime36, (org.joda.time.ReadableInstant) dateTime37);
        int int39 = dateTime36.getMinuteOfDay();
        int int40 = dateTime36.getYearOfCentury();
        int int41 = dateTime36.getDayOfMonth();
        org.joda.time.DateTime dateTime43 = dateTime36.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property44 = dateTime43.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField45 = property44.getField();
        int int46 = dateTimeField45.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.minusWeeks((int) (byte) 10);
        org.joda.time.Period period51 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Duration duration53 = period51.toDurationFrom(readableInstant52);
        long long54 = duration53.getMillis();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime49.plus((org.joda.time.ReadableDuration) duration53);
        java.util.Locale locale57 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str58 = dateTimeField45.getAsText((org.joda.time.ReadablePartial) localDateTime49, (int) (short) 1, locale57);
        java.util.Calendar calendar59 = java.util.Calendar.getInstance(timeZone6, locale57);
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(timeZone2, locale57);
        java.util.Locale.setDefault(category0, locale57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar32 and calendar60", (calendar32.compareTo(calendar60) == 0) == calendar32.equals(calendar60));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(10L, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.weekyear();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 10, chronology6);
        boolean boolean8 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property10 = dateTime9.era();
        boolean boolean11 = dateTime7.isBefore((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType15 = periodType14.withSecondsRemoved();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.Interval interval18 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Chronology chronology20 = org.joda.time.DateTimeUtils.getChronology(chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology20.hourOfHalfday();
        org.joda.time.DateTime dateTime22 = dateTime16.toDateTime(chronology20);
        org.joda.time.Period period23 = new org.joda.time.Period((long) 1, (long) ' ', periodType15, chronology20);
        org.joda.time.DateTime dateTime24 = dateTime9.plus((org.joda.time.ReadablePeriod) period23);
        org.joda.time.DateTime.Property property25 = dateTime9.era();
        org.joda.time.DurationField durationField26 = property25.getDurationField();
        org.joda.time.DateTime dateTime27 = property25.roundCeilingCopy();
        java.lang.Object obj28 = null;
        org.joda.time.Instant instant29 = new org.joda.time.Instant(obj28);
        int int30 = dateTime27.compareTo((org.joda.time.ReadableInstant) instant29);
        long long31 = dateTime27.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant29", (dateTime9.compareTo(instant29) == 0) == dateTime9.equals(instant29));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant4 = dateTime3.toInstant();
        org.joda.time.MutableDateTime mutableDateTime5 = instant4.toMutableDateTimeISO();
        org.joda.time.Duration duration7 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.Interval interval10 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime9);
        int int11 = dateTime8.getMinuteOfDay();
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime14 = dateTime8.plus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime8.toDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime8.minus((long) 10);
        org.joda.time.Period period19 = duration7.toPeriodFrom((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property21 = dateTime20.era();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime24 = dateTime22.plusWeeks((int) (byte) 1);
        int int25 = property21.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime();
        org.joda.time.Interval interval28 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableInstant) dateTime27);
        boolean boolean30 = interval28.isAfter((long) 10);
        org.joda.time.Duration duration31 = interval28.toDuration();
        org.joda.time.Duration duration34 = duration31.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval35 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableDuration) duration34);
        org.joda.time.Duration duration37 = duration7.withDurationAdded((org.joda.time.ReadableDuration) duration34, 26160257);
        org.joda.time.Instant instant38 = instant4.plus((org.joda.time.ReadableDuration) duration34);
        long long39 = instant4.getMillis();
        org.joda.time.MutableDateTime mutableDateTime40 = instant4.toMutableDateTime();
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property42 = dateTime41.millisOfDay();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime();
        org.joda.time.Interval interval45 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) dateTime44);
        int int46 = dateTime43.getMinuteOfDay();
        int int47 = dateTime43.getYearOfCentury();
        int int48 = dateTime43.getDayOfMonth();
        org.joda.time.DateTime dateTime50 = dateTime43.minusWeeks((int) (short) 0);
        boolean boolean51 = dateTime41.isAfter((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTime.Property property52 = dateTime41.weekOfWeekyear();
        org.joda.time.DateTime dateTime54 = dateTime41.minus((long) 7);
        org.joda.time.Duration duration56 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.Chronology chronology58 = org.joda.time.DateTimeUtils.getChronology(chronology57);
        org.joda.time.DateTimeField dateTimeField59 = chronology58.hourOfHalfday();
        org.joda.time.LocalTime localTime60 = org.joda.time.LocalTime.now(chronology58);
        org.joda.time.Period period61 = duration56.toPeriod(chronology58);
        org.joda.time.LocalTime localTime62 = org.joda.time.LocalTime.now(chronology58);
        org.joda.time.LocalTime localTime63 = org.joda.time.LocalTime.now(chronology58);
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeUtils.getZone(dateTimeZone64);
        boolean boolean67 = dateTimeZone65.equals((java.lang.Object) 1645514161708L);
        org.joda.time.Chronology chronology68 = chronology58.withZone(dateTimeZone65);
        org.joda.time.DateTime dateTime69 = dateTime41.toDateTime(chronology68);
        org.joda.time.DateTimeZone dateTimeZone70 = dateTime41.getZone();
        org.joda.time.MutableDateTime mutableDateTime71 = instant4.toMutableDateTime(dateTimeZone70);
        org.joda.time.LocalDate localDate72 = new org.joda.time.LocalDate(3291028667408L, dateTimeZone70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant4", (dateTime3.compareTo(instant4) == 0) == dateTime3.equals(instant4));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType5 = periodType4.withSecondsRemoved();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.Interval interval8 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.hourOfHalfday();
        org.joda.time.DateTime dateTime12 = dateTime6.toDateTime(chronology10);
        org.joda.time.Period period13 = new org.joda.time.Period((long) 1, (long) ' ', periodType5, chronology10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withCenturyOfEra(2);
        long long19 = chronology10.set((org.joda.time.ReadablePartial) localDateTime15, (long) (short) 10);
        org.joda.time.DurationField durationField20 = chronology10.seconds();
        org.joda.time.Period period21 = new org.joda.time.Period((long) 2782, 60000L, chronology10);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) dateTime23);
        int int25 = dateTime22.getMinuteOfDay();
        org.joda.time.Period period27 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime28 = dateTime22.plus((org.joda.time.ReadablePeriod) period27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime22, chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withMonthOfYear(5);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.minusMonths(999);
        int[] intArray36 = chronology10.get((org.joda.time.ReadablePartial) localDateTime30, (long) (byte) 100);
        org.joda.time.DateTimeField dateTimeField37 = chronology10.clockhourOfDay();
        org.joda.time.DurationField durationField38 = dateTimeField37.getDurationField();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(10L, chronology40);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.weekyear();
        int int43 = dateTime41.get(dateTimeFieldType42);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) 10, chronology45);
        boolean boolean47 = dateTime41.isEqual((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property49 = dateTime48.era();
        boolean boolean50 = dateTime46.isBefore((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.PeriodType periodType53 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType54 = periodType53.withSecondsRemoved();
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime();
        org.joda.time.Interval interval57 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime55, (org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.Chronology chronology59 = org.joda.time.DateTimeUtils.getChronology(chronology58);
        org.joda.time.DateTimeField dateTimeField60 = chronology59.hourOfHalfday();
        org.joda.time.DateTime dateTime61 = dateTime55.toDateTime(chronology59);
        org.joda.time.Period period62 = new org.joda.time.Period((long) 1, (long) ' ', periodType54, chronology59);
        org.joda.time.DateTime dateTime63 = dateTime48.plus((org.joda.time.ReadablePeriod) period62);
        org.joda.time.DateTime.Property property64 = dateTime48.era();
        org.joda.time.DurationField durationField65 = property64.getDurationField();
        org.joda.time.DateTime dateTime66 = property64.roundCeilingCopy();
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property68 = dateTime67.millisOfDay();
        org.joda.time.DateTime dateTime69 = dateTime67.withTimeAtStartOfDay();
        org.joda.time.Period period71 = new org.joda.time.Period((long) '#');
        int int73 = period71.getValue(0);
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime();
        org.joda.time.Interval interval76 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime74, (org.joda.time.ReadableInstant) dateTime75);
        org.joda.time.Duration duration77 = period71.toDurationTo((org.joda.time.ReadableInstant) dateTime75);
        org.joda.time.Chronology chronology78 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime69, (org.joda.time.ReadableInstant) dateTime75);
        org.joda.time.DateTimeField dateTimeField79 = chronology78.millisOfDay();
        java.util.Locale locale81 = java.util.Locale.JAPAN;
        java.util.Locale.setDefault(locale81);
        java.util.Set<java.lang.String> strSet83 = locale81.getUnicodeLocaleKeys();
        java.lang.String str84 = dateTimeField79.getAsShortText(26167, locale81);
        java.lang.String str85 = locale81.getVariant();
        int int86 = property64.getMaximumTextLength(locale81);
        java.lang.String str88 = locale81.getExtension('a');
        int int89 = dateTimeField37.getMaximumShortTextLength(locale81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField20 and durationField65", Math.signum(durationField20.compareTo(durationField65)) == -Math.signum(durationField65.compareTo(durationField20)));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Duration duration6 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        int int10 = dateTime7.getMinuteOfDay();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime13 = dateTime7.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime7.toDateTime(chronology14);
        org.joda.time.DateTime dateTime17 = dateTime7.minus((long) 10);
        org.joda.time.Period period18 = duration6.toPeriodFrom((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property20 = dateTime19.era();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.plusWeeks((int) (byte) 1);
        int int24 = property20.compareTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime26);
        boolean boolean29 = interval27.isAfter((long) 10);
        org.joda.time.Duration duration30 = interval27.toDuration();
        org.joda.time.Duration duration33 = duration30.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableDuration) duration33);
        org.joda.time.Duration duration36 = duration6.withDurationAdded((org.joda.time.ReadableDuration) duration33, 26160257);
        org.joda.time.Instant instant37 = instant3.plus((org.joda.time.ReadableDuration) duration33);
        long long38 = instant3.getMillis();
        org.joda.time.DateTime dateTime39 = instant3.toDateTime();
        org.joda.time.Instant instant40 = instant3.toInstant();
        org.joda.time.DateTime dateTime41 = instant3.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getChronology(chronology0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.hourOfHalfday();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
        java.lang.String str6 = dateTimeField2.getAsShortText(1645514151873L, locale5);
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.lang.String str9 = dateTimeField2.getAsShortText(26153877, locale8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology11);
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) 26167, chronology12);
        org.joda.time.LocalTime localTime16 = localTime14.withMillisOfDay(17);
        java.util.Calendar.Builder builder18 = new java.util.Calendar.Builder();
        java.util.Locale locale19 = java.util.Locale.PRC;
        java.lang.String str20 = locale19.getDisplayScript();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Chronology chronology22 = org.joda.time.DateTimeUtils.getChronology(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology22.hourOfHalfday();
        int int25 = dateTimeField23.getLeapAmount((long) 26151451);
        java.util.Locale locale27 = java.util.Locale.forLanguageTag("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
        int int28 = dateTimeField23.getMaximumShortTextLength(locale27);
        java.lang.String str29 = locale19.getDisplayCountry(locale27);
        java.lang.String str30 = locale19.getISO3Language();
        java.util.Calendar.Builder builder31 = builder18.setLocale(locale19);
        java.util.Set<java.lang.String> strSet32 = locale19.getUnicodeLocaleKeys();
        java.lang.String str33 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localTime14, 26184703, locale19);
        org.joda.time.Period period35 = new org.joda.time.Period((long) (short) 10);
        org.joda.time.Weeks weeks36 = period35.toStandardWeeks();
        int int37 = period35.getDays();
        org.joda.time.LocalTime localTime39 = localTime14.withPeriodAdded((org.joda.time.ReadablePeriod) period35, 46);
        org.joda.time.Period period41 = new org.joda.time.Period((long) (short) 10);
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.days();
        org.joda.time.Period period43 = period41.normalizedStandard(periodType42);
        org.joda.time.PeriodType periodType44 = periodType42.withYearsRemoved();
        org.joda.time.PeriodType periodType45 = periodType44.withYearsRemoved();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((long) (-1), chronology47);
        org.joda.time.Period period49 = period48.toPeriod();
        int int50 = period49.size();
        int int51 = period49.getMinutes();
        int[] intArray52 = period49.getValues();
        org.joda.time.Period period54 = period49.withMonths(26155103);
        org.joda.time.Period period56 = period54.minusDays((-292275054));
        int int57 = period54.getHours();
        org.joda.time.Period period59 = period54.withMinutes(914);
        org.joda.time.DurationFieldType durationFieldType60 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.Chronology chronology62 = org.joda.time.DateTimeUtils.getChronology(chronology61);
        org.joda.time.DateTimeField dateTimeField63 = chronology62.hourOfHalfday();
        org.joda.time.DurationField durationField64 = durationFieldType60.getField(chronology62);
        boolean boolean65 = period54.isSupported(durationFieldType60);
        boolean boolean66 = periodType44.isSupported(durationFieldType60);
        org.joda.time.LocalTime localTime68 = localTime39.withFieldAdded(durationFieldType60, 366);
        org.joda.time.LocalTime localTime69 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime70 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType71 = null;
        org.joda.time.Period period72 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime69, (org.joda.time.ReadablePartial) localTime70, periodType71);
        org.joda.time.Period period74 = org.joda.time.Period.years(10);
        org.joda.time.LocalTime localTime76 = localTime69.withPeriodAdded((org.joda.time.ReadablePeriod) period74, 1);
        org.joda.time.Chronology chronology77 = localTime69.getChronology();
        org.joda.time.DateTimeZone dateTimeZone78 = chronology77.getZone();
        org.joda.time.DurationField durationField79 = durationFieldType60.getField(chronology77);
        java.lang.String str80 = durationFieldType60.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField64 and durationField79", (durationField64.compareTo(durationField79) == 0) == durationField64.equals(durationField79));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.LocalTime localTime4 = localTime2.withFields(readablePartial3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology6);
        int int8 = localTime7.getSecondOfMinute();
        org.joda.time.Period period9 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime2, (org.joda.time.ReadablePartial) localTime7);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.Period period11 = period9.plus(readablePeriod10);
        org.joda.time.Period period13 = period9.withSeconds(53);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime16 = dateTime14.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant17 = dateTime16.toInstant();
        org.joda.time.Duration duration18 = period9.toDurationTo((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Duration duration20 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableInstant) dateTime22);
        int int24 = dateTime21.getMinuteOfDay();
        org.joda.time.Period period26 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime27 = dateTime21.plus((org.joda.time.ReadablePeriod) period26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = dateTime21.toDateTime(chronology28);
        org.joda.time.DateTime dateTime31 = dateTime21.minus((long) 10);
        org.joda.time.Period period32 = duration20.toPeriodFrom((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Seconds seconds33 = duration20.toStandardSeconds();
        long long34 = duration20.getStandardSeconds();
        long long35 = duration20.getStandardSeconds();
        org.joda.time.Instant instant36 = instant17.plus((org.joda.time.ReadableDuration) duration20);
        org.joda.time.Minutes minutes37 = duration20.toStandardMinutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant17", (dateTime16.compareTo(instant17) == 0) == dateTime16.equals(instant17));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = dateTime3.getChronology();
        int int5 = dateTime3.getDayOfYear();
        org.joda.time.Instant instant6 = dateTime3.toInstant();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        int int10 = dateTime7.getMinuteOfDay();
        int int11 = dateTime7.getYearOfCentury();
        int int12 = dateTime7.getDayOfMonth();
        org.joda.time.DateTime dateTime14 = dateTime7.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        int int17 = dateTimeField16.getMaximumValue();
        java.lang.String str19 = dateTimeField16.getAsShortText((long) (byte) 1);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) dateTime21);
        int int23 = dateTime20.getMinuteOfDay();
        int int24 = dateTime20.getYearOfCentury();
        int int25 = dateTime20.getDayOfMonth();
        org.joda.time.DateTime dateTime27 = dateTime20.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property28 = dateTime27.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField29 = property28.getField();
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.now();
        int int31 = dateTimeField29.getMaximumValue((org.joda.time.ReadablePartial) localTime30);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getChronology(chronology33);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.hourOfHalfday();
        java.util.Locale locale38 = java.util.Locale.forLanguageTag("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
        java.lang.String str39 = dateTimeField35.getAsShortText(1645514151873L, locale38);
        java.lang.String str40 = dateTimeField16.getAsText((org.joda.time.ReadablePartial) localTime30, 0, locale38);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(10L, chronology42);
        boolean boolean44 = localTime30.equals((java.lang.Object) dateTime43);
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant6, (org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Period period47 = period45.multipliedBy(174);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(dateTimeZone48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.withCenturyOfEra(2);
        org.joda.time.Period period53 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Duration duration55 = period53.toDurationFrom(readableInstant54);
        org.joda.time.Seconds seconds56 = duration55.toStandardSeconds();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime49.withDurationAdded((org.joda.time.ReadableDuration) duration55, 2022);
        org.joda.time.LocalDateTime.Property property59 = localDateTime49.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime61 = property59.addToCopy(0);
        org.joda.time.PeriodType periodType62 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType63 = periodType62.withSecondsRemoved();
        org.joda.time.PeriodType periodType64 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType65 = periodType64.withSecondsRemoved();
        org.joda.time.Period period67 = new org.joda.time.Period((long) (short) 10);
        org.joda.time.PeriodType periodType68 = org.joda.time.PeriodType.days();
        org.joda.time.Period period69 = period67.normalizedStandard(periodType68);
        org.joda.time.Period period71 = new org.joda.time.Period((long) (short) 10);
        org.joda.time.PeriodType periodType72 = org.joda.time.PeriodType.days();
        org.joda.time.Period period73 = period71.normalizedStandard(periodType72);
        org.joda.time.DurationFieldType durationFieldType74 = org.joda.time.DurationFieldType.hours();
        int int75 = periodType72.indexOf(durationFieldType74);
        boolean boolean76 = periodType68.isSupported(durationFieldType74);
        int int77 = periodType64.indexOf(durationFieldType74);
        int int78 = periodType63.indexOf(durationFieldType74);
        org.joda.time.LocalDateTime localDateTime80 = localDateTime61.withFieldAdded(durationFieldType74, 10074);
        org.joda.time.Period period82 = period45.withField(durationFieldType74, 538);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant6", (dateTime0.compareTo(instant6) == 0) == dateTime0.equals(instant6));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        boolean boolean4 = interval2.isAfter((long) 10);
        org.joda.time.Duration duration5 = interval2.toDuration();
        org.joda.time.Duration duration8 = duration5.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant12 = dateTime11.toInstant();
        org.joda.time.MutableDateTime mutableDateTime13 = instant12.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Chronology chronology16 = org.joda.time.DateTimeUtils.getChronology(chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfHalfday();
        org.joda.time.DurationField durationField18 = durationFieldType14.getField(chronology16);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((java.lang.Object) instant12, chronology16);
        org.joda.time.Instant instant22 = instant12.withDurationAdded(1645514154223L, 100);
        long long23 = instant12.getMillis();
        org.joda.time.Chronology chronology24 = instant12.getChronology();
        org.joda.time.Interval interval25 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration5, (org.joda.time.ReadableInstant) instant12);
        long long26 = duration5.getStandardMinutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant12", (dateTime11.compareTo(instant12) == 0) == dateTime11.equals(instant12));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.DateTimeField dateTimeField11 = chronology7.minuteOfDay();
        java.lang.String str13 = dateTimeField11.getAsShortText((long) 165);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.hourOfHalfday();
        org.joda.time.DateTime dateTime6 = dateTime0.toDateTime(chronology4);
        org.joda.time.DurationField durationField7 = chronology4.millis();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology4);
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.Instant instant10 = instant9.toInstant();
        org.joda.time.Instant instant12 = instant9.withMillis(1645514153096L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant9", (dateTime0.compareTo(instant9) == 0) == dateTime0.equals(instant9));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getChronology(chronology0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.hourOfHalfday();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.now(chronology1);
        org.joda.time.DurationField durationField4 = chronology1.years();
        org.joda.time.DurationField durationField5 = chronology1.minutes();
        org.joda.time.DurationField durationField6 = chronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField4, and durationField5", !(durationField6.compareTo(durationField4) == 0) || (Math.signum(durationField6.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant13 = instant3.withDurationAdded((long) 459, 0);
        org.joda.time.Instant instant15 = instant13.plus(457080L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant13", (dateTime2.compareTo(instant13) == 0) == dateTime2.equals(instant13));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Duration duration6 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        int int10 = dateTime7.getMinuteOfDay();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime13 = dateTime7.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime7.toDateTime(chronology14);
        org.joda.time.DateTime dateTime17 = dateTime7.minus((long) 10);
        org.joda.time.Period period18 = duration6.toPeriodFrom((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property20 = dateTime19.era();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.plusWeeks((int) (byte) 1);
        int int24 = property20.compareTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime26);
        boolean boolean29 = interval27.isAfter((long) 10);
        org.joda.time.Duration duration30 = interval27.toDuration();
        org.joda.time.Duration duration33 = duration30.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableDuration) duration33);
        org.joda.time.Duration duration36 = duration6.withDurationAdded((org.joda.time.ReadableDuration) duration33, 26160257);
        org.joda.time.Instant instant37 = instant3.plus((org.joda.time.ReadableDuration) duration33);
        long long38 = instant3.getMillis();
        org.joda.time.MutableDateTime mutableDateTime39 = instant3.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime40 = instant3.toMutableDateTime();
        org.joda.time.Instant instant42 = instant3.plus(1645514200745L);
        org.joda.time.DateTime dateTime43 = instant42.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusWeeks((int) (byte) 10);
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        long long7 = duration6.getMillis();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.plus((org.joda.time.ReadableDuration) duration6);
        org.joda.time.Duration duration10 = duration6.minus((long) 38222);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.Interval interval13 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getChronology(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.hourOfHalfday();
        org.joda.time.DateTime dateTime17 = dateTime11.toDateTime(chronology15);
        org.joda.time.DurationField durationField18 = chronology15.millis();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology15);
        org.joda.time.Instant instant20 = dateTime19.toInstant();
        java.lang.String str21 = instant20.toString();
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusWeeks((int) (byte) 10);
        org.joda.time.Period period27 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationFrom(readableInstant28);
        long long30 = duration29.getMillis();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.plus((org.joda.time.ReadableDuration) duration29);
        mutableInterval22.setDurationAfterStart((org.joda.time.ReadableDuration) duration29);
        org.joda.time.Duration duration33 = mutableInterval22.toDuration();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusWeeks((int) (byte) 10);
        org.joda.time.Period period38 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = period38.toDurationFrom(readableInstant39);
        long long41 = duration40.getMillis();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime36.plus((org.joda.time.ReadableDuration) duration40);
        long long43 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration40);
        boolean boolean44 = duration33.isShorterThan((org.joda.time.ReadableDuration) duration40);
        long long45 = duration40.getStandardDays();
        org.joda.time.Duration duration47 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime();
        org.joda.time.Interval interval50 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime48, (org.joda.time.ReadableInstant) dateTime49);
        int int51 = dateTime48.getMinuteOfDay();
        org.joda.time.Period period53 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime54 = dateTime48.plus((org.joda.time.ReadablePeriod) period53);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = dateTime48.toDateTime(chronology55);
        org.joda.time.DateTime dateTime58 = dateTime48.minus((long) 10);
        org.joda.time.Period period59 = duration47.toPeriodFrom((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property61 = dateTime60.era();
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime64 = dateTime62.plusWeeks((int) (byte) 1);
        int int65 = property61.compareTo((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime();
        org.joda.time.Interval interval68 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime66, (org.joda.time.ReadableInstant) dateTime67);
        boolean boolean70 = interval68.isAfter((long) 10);
        org.joda.time.Duration duration71 = interval68.toDuration();
        org.joda.time.Duration duration74 = duration71.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval75 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime62, (org.joda.time.ReadableDuration) duration74);
        org.joda.time.Duration duration77 = duration47.withDurationAdded((org.joda.time.ReadableDuration) duration74, 26160257);
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime();
        org.joda.time.Interval interval80 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime78, (org.joda.time.ReadableInstant) dateTime79);
        boolean boolean82 = interval80.isAfter((long) 10);
        org.joda.time.Duration duration83 = interval80.toDuration();
        boolean boolean84 = duration77.isLongerThan((org.joda.time.ReadableDuration) duration83);
        int int85 = duration40.compareTo((org.joda.time.ReadableDuration) duration77);
        long long86 = duration77.getStandardDays();
        org.joda.time.Instant instant88 = instant20.withDurationAdded((org.joda.time.ReadableDuration) duration77, 70);
        org.joda.time.MutableDateTime mutableDateTime89 = instant20.toMutableDateTimeISO();
        org.joda.time.Interval interval90 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration6, (org.joda.time.ReadableInstant) instant20);
        org.joda.time.DateTime dateTime91 = interval90.getStart();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant20", (dateTime11.compareTo(instant20) == 0) == dateTime11.equals(instant20));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant13 = instant3.withDurationAdded(1645514154223L, 100);
        org.joda.time.MutableDateTime mutableDateTime14 = instant3.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime15 = instant3.toDateTime();
        org.joda.time.DateTime dateTime17 = dateTime15.plusMillis(171);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Interval interval4 = interval2.toInterval();
        org.joda.time.MutableInterval mutableInterval5 = interval4.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval6 = mutableInterval5.toMutableInterval();
        boolean boolean8 = mutableInterval5.isBefore(1645514177812L);
        long long9 = mutableInterval5.getEndMillis();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime11);
        int int13 = dateTime10.getMinuteOfDay();
        org.joda.time.Period period15 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime16 = dateTime10.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.lang.String str18 = dateTimeFieldType17.toString();
        int int19 = dateTime16.get(dateTimeFieldType17);
        boolean boolean20 = mutableInterval5.equals((java.lang.Object) dateTimeFieldType17);
        mutableInterval5.setStartMillis((long) 538);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime25 = dateTime23.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant26 = dateTime25.toInstant();
        org.joda.time.MutableDateTime mutableDateTime27 = instant26.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Chronology chronology30 = org.joda.time.DateTimeUtils.getChronology(chronology29);
        org.joda.time.DateTimeField dateTimeField31 = chronology30.hourOfHalfday();
        org.joda.time.DurationField durationField32 = durationFieldType28.getField(chronology30);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((java.lang.Object) instant26, chronology30);
        org.joda.time.DateTimeField dateTimeField34 = chronology30.minuteOfDay();
        mutableInterval5.setChronology(chronology30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant26", (dateTime25.compareTo(instant26) == 0) == dateTime25.equals(instant26));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.hourOfHalfday();
        org.joda.time.DateTime dateTime6 = dateTime0.toDateTime(chronology4);
        org.joda.time.DurationField durationField7 = chronology4.millis();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology4);
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.Instant instant10 = instant9.toInstant();
        org.joda.time.Chronology chronology11 = instant9.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant9", (dateTime0.compareTo(instant9) == 0) == dateTime0.equals(instant9));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime4.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusYears(26151451);
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#');
        int int12 = period10.getValue(0);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Duration duration16 = period10.toDurationTo((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime8.withPeriodAdded((org.joda.time.ReadablePeriod) period10, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean20 = localDateTime8.isSupported(dateTimeFieldType19);
        int int21 = instant3.get(dateTimeFieldType19);
        org.joda.time.Duration duration23 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.Interval interval26 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime25);
        int int27 = dateTime24.getMinuteOfDay();
        org.joda.time.Period period29 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime30 = dateTime24.plus((org.joda.time.ReadablePeriod) period29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = dateTime24.toDateTime(chronology31);
        org.joda.time.DateTime dateTime34 = dateTime24.minus((long) 10);
        org.joda.time.Period period35 = duration23.toPeriodFrom((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Instant instant36 = instant3.plus((org.joda.time.ReadableDuration) duration23);
        org.joda.time.Days days37 = duration23.toStandardDays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Instant instant7 = instant3.withDurationAdded((-1L), 21);
        org.joda.time.MutableDateTime mutableDateTime8 = instant7.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = instant0.getChronology();
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusWeeks((int) (byte) 10);
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period7.toDurationFrom(readableInstant8);
        long long10 = duration9.getMillis();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.plus((org.joda.time.ReadableDuration) duration9);
        mutableInterval2.setDurationAfterStart((org.joda.time.ReadableDuration) duration9);
        org.joda.time.Duration duration13 = mutableInterval2.toDuration();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusWeeks((int) (byte) 10);
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = period18.toDurationFrom(readableInstant19);
        long long21 = duration20.getMillis();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.plus((org.joda.time.ReadableDuration) duration20);
        long long23 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration20);
        boolean boolean24 = duration13.isShorterThan((org.joda.time.ReadableDuration) duration20);
        long long25 = duration20.getStandardDays();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime();
        org.joda.time.Interval interval28 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableInstant) dateTime27);
        int int29 = dateTime26.getMinuteOfDay();
        org.joda.time.Period period31 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime32 = dateTime26.plus((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Period period33 = duration20.toPeriodFrom((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Duration duration34 = duration20.toDuration();
        org.joda.time.Instant instant35 = instant0.minus((org.joda.time.ReadableDuration) duration20);
        org.joda.time.MutableDateTime mutableDateTime36 = instant35.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime26", (instant0.compareTo(dateTime26) == 0) == instant0.equals(dateTime26));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.joda.time.Interval interval1 = org.joda.time.Interval.parse("2022-02-22T07:16:05.197Z/2022-02-22T07:16:05.197Z");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval();
        boolean boolean3 = interval1.isAfter((org.joda.time.ReadableInterval) mutableInterval2);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        org.joda.time.MutableDateTime mutableDateTime8 = instant7.toMutableDateTimeISO();
        org.joda.time.Duration duration10 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.Interval interval13 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) dateTime12);
        int int14 = dateTime11.getMinuteOfDay();
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime17 = dateTime11.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = dateTime11.toDateTime(chronology18);
        org.joda.time.DateTime dateTime21 = dateTime11.minus((long) 10);
        org.joda.time.Period period22 = duration10.toPeriodFrom((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property24 = dateTime23.era();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime27 = dateTime25.plusWeeks((int) (byte) 1);
        int int28 = property24.compareTo((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime();
        org.joda.time.Interval interval31 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime30);
        boolean boolean33 = interval31.isAfter((long) 10);
        org.joda.time.Duration duration34 = interval31.toDuration();
        org.joda.time.Duration duration37 = duration34.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval38 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableDuration) duration37);
        org.joda.time.Duration duration40 = duration10.withDurationAdded((org.joda.time.ReadableDuration) duration37, 26160257);
        org.joda.time.Instant instant41 = instant7.plus((org.joda.time.ReadableDuration) duration37);
        long long42 = instant7.getMillis();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime();
        org.joda.time.Interval interval45 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) dateTime44);
        int int46 = dateTime43.getMinuteOfDay();
        org.joda.time.DateTime dateTime48 = dateTime43.minusHours((int) 'a');
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate51 = localDate49.withCenturyOfEra(382);
        org.joda.time.LocalDate localDate53 = localDate51.plusDays((int) (byte) 10);
        org.joda.time.Interval interval54 = localDate53.toInterval();
        org.joda.time.DateTime dateTime55 = localDate53.toDateTimeAtStartOfDay();
        boolean boolean56 = dateTime48.isBefore((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.DateTime dateTime58 = dateTime48.plusMinutes(26151451);
        mutableInterval2.setInterval((org.joda.time.ReadableInstant) instant7, (org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.MutableDateTime mutableDateTime60 = dateTime58.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant7", (dateTime6.compareTo(instant7) == 0) == dateTime6.equals(instant7));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.millisOfDay();
        org.joda.time.DateTime dateTime2 = dateTime0.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime4 = dateTime0.minusDays(12);
        org.joda.time.DateTime dateTime6 = dateTime4.minusYears(382);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.DateTime dateTime9 = dateTime6.withField(dateTimeFieldType7, 21);
        org.joda.time.Duration duration11 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getChronology(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology13.hourOfHalfday();
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.now(chronology13);
        org.joda.time.Period period16 = duration11.toPeriod(chronology13);
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.now(chronology13);
        org.joda.time.Chronology chronology18 = localTime17.getChronology();
        boolean boolean19 = dateTimeFieldType7.isSupported(chronology18);
        org.joda.time.DurationField durationField20 = chronology18.eras();
        org.joda.time.DurationField durationField21 = chronology18.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField21, and durationField20", !(durationField20.compareTo(durationField21) == 0) || (Math.signum(durationField20.compareTo(durationField20)) == Math.signum(durationField21.compareTo(durationField20))));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(10L, chronology4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekyear();
        int int7 = dateTime5.get(dateTimeFieldType6);
        boolean boolean8 = localTime2.isSupported(dateTimeFieldType6);
        org.joda.time.LocalTime.Property property9 = localTime2.minuteOfHour();
        org.joda.time.LocalTime localTime10 = property9.withMaximumValue();
        org.joda.time.LocalTime localTime11 = property9.roundHalfCeilingCopy();
        boolean boolean12 = calendar1.after((java.lang.Object) property9);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("zh_TW");
        java.time.ZoneId zoneId15 = timeZone14.toZoneId();
        int int16 = timeZone14.getRawOffset();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone14);
        calendar1.setTimeZone(timeZone14);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property20 = dateTime19.era();
        org.joda.time.DateTime.Property property21 = dateTime19.weekyear();
        org.joda.time.DateTime dateTime23 = property21.setCopy(453);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeUtils.getZone(dateTimeZone24);
        java.lang.String str27 = dateTimeZone25.getName((long) ' ');
        java.lang.String str29 = dateTimeZone25.getName((long) (short) -1);
        org.joda.time.DateTime dateTime30 = dateTime23.withZoneRetainFields(dateTimeZone25);
        java.util.TimeZone timeZone31 = dateTimeZone25.toTimeZone();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime33);
        int int35 = dateTime32.getMinuteOfDay();
        int int36 = dateTime32.getYearOfCentury();
        int int37 = dateTime32.getDayOfMonth();
        org.joda.time.DateTime dateTime39 = dateTime32.minusWeeks((int) (short) 0);
        int int40 = dateTime32.getYear();
        java.util.Locale.Builder builder41 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder42 = builder41.clearExtensions();
        java.util.Locale.Builder builder43 = builder42.clearExtensions();
        java.util.Locale locale44 = builder43.build();
        java.util.Calendar calendar45 = dateTime32.toCalendar(locale44);
        java.util.Locale.setDefault(locale44);
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(timeZone31, locale44);
        calendar1.setTimeZone(timeZone31);
        timeZone31.setRawOffset(122);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar17 and calendar47", (calendar17.compareTo(calendar47) == 0) == calendar17.equals(calendar47));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.joda.time.Interval interval1 = org.joda.time.Interval.parse("2022-02-22T07:16:05.197Z/2022-02-22T07:16:05.197Z");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval();
        boolean boolean3 = interval1.isAfter((org.joda.time.ReadableInterval) mutableInterval2);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.eras();
        org.joda.time.Duration duration9 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology11.hourOfHalfday();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.now(chronology11);
        org.joda.time.Period period14 = duration9.toPeriod(chronology11);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(327L, chronology11);
        org.joda.time.DurationField durationField16 = durationFieldType6.getField(chronology11);
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) 12, 436L, chronology11);
        mutableInterval2.setChronology(chronology11);
        org.joda.time.DurationField durationField19 = chronology11.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField19, and durationField16", !(durationField16.compareTo(durationField19) == 0) || (Math.signum(durationField16.compareTo(durationField16)) == Math.signum(durationField19.compareTo(durationField16))));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        org.joda.time.DateTime.Property property5 = dateTime0.year();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime dateTime7 = dateTime6.withEarlierOffsetAtOverlap();
        org.joda.time.Instant instant8 = dateTime7.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime7.plusWeeks((int) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant8", (dateTime7.compareTo(instant8) == 0) == dateTime7.equals(instant8));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration2 = duration0.minus(1645514201717L);
        org.joda.time.Duration duration3 = duration2.toDuration();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        org.joda.time.MutableDateTime mutableDateTime8 = instant7.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology11.hourOfHalfday();
        org.joda.time.DurationField durationField13 = durationFieldType9.getField(chronology11);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((java.lang.Object) instant7, chronology11);
        org.joda.time.Instant instant17 = instant7.withDurationAdded(1645514154223L, 100);
        org.joda.time.Instant instant19 = instant7.minus((long) (byte) -1);
        org.joda.time.Instant instant21 = instant7.minus((long) 0);
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration2, (org.joda.time.ReadableInstant) instant7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant7", (dateTime6.compareTo(instant7) == 0) == dateTime6.equals(instant7));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.hourOfHalfday();
        org.joda.time.DateTime dateTime6 = dateTime0.toDateTime(chronology4);
        org.joda.time.DurationField durationField7 = chronology4.millis();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology4);
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withFieldAdded(durationFieldType12, 1970);
        int int15 = localDateTime14.getEra();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.minusSeconds(26171);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.Interval interval20 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime21 = interval20.getEnd();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeUtils.getZone(dateTimeZone23);
        java.lang.String str26 = dateTimeZone24.getName((long) ' ');
        java.lang.String str28 = dateTimeZone24.getName((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(0L, dateTimeZone24);
        org.joda.time.DateTime dateTime30 = dateTime21.withZone(dateTimeZone24);
        java.lang.String str32 = dateTimeZone24.getNameKey(1645514153208L);
        org.joda.time.DateTime dateTime33 = localDateTime14.toDateTime(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime34 = instant9.toMutableDateTime(dateTimeZone24);
        long long37 = dateTimeZone24.adjustOffset((long) 2456, true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant9", (dateTime0.compareTo(instant9) == 0) == dateTime0.equals(instant9));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'u');
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#');
        int int6 = period4.getValue(0);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.Duration duration10 = period4.toDurationTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationFrom(readableInstant13);
        org.joda.time.Seconds seconds15 = duration14.toStandardSeconds();
        boolean boolean16 = duration10.isEqual((org.joda.time.ReadableDuration) duration14);
        long long17 = duration10.getStandardDays();
        org.joda.time.DateTime dateTime19 = dateTime2.withDurationAdded((org.joda.time.ReadableDuration) duration10, 2782);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(18);
        org.joda.time.DateTime dateTime22 = dateTime19.toDateTime(dateTimeZone21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime7", (dateTime2.compareTo(dateTime7) == 0) == dateTime2.equals(dateTime7));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.hourOfHalfday();
        org.joda.time.DateTime dateTime6 = dateTime0.toDateTime(chronology4);
        org.joda.time.DurationField durationField7 = chronology4.millis();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology4);
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withFieldAdded(durationFieldType12, 1970);
        int int15 = localDateTime14.getEra();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.minusSeconds(26171);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.Interval interval20 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime21 = interval20.getEnd();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeUtils.getZone(dateTimeZone23);
        java.lang.String str26 = dateTimeZone24.getName((long) ' ');
        java.lang.String str28 = dateTimeZone24.getName((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(0L, dateTimeZone24);
        org.joda.time.DateTime dateTime30 = dateTime21.withZone(dateTimeZone24);
        java.lang.String str32 = dateTimeZone24.getNameKey(1645514153208L);
        org.joda.time.DateTime dateTime33 = localDateTime14.toDateTime(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime34 = instant9.toMutableDateTime(dateTimeZone24);
        long long36 = dateTimeZone24.nextTransition(1645566856333L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant9", (dateTime0.compareTo(instant9) == 0) == dateTime0.equals(instant9));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1645514176563L);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        java.lang.String str5 = interval4.toString();
        org.joda.time.DateTime dateTime6 = interval4.getEnd();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusWeeks((int) (byte) 10);
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationFrom(readableInstant12);
        long long14 = duration13.getMillis();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.plus((org.joda.time.ReadableDuration) duration13);
        boolean boolean16 = interval4.equals((java.lang.Object) duration13);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime20 = interval19.getEnd();
        org.joda.time.Interval interval21 = interval19.toInterval();
        org.joda.time.MutableInterval mutableInterval22 = interval21.toMutableInterval();
        org.joda.time.Interval interval23 = interval4.gap((org.joda.time.ReadableInterval) interval21);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime();
        int int25 = localDateTime24.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minusWeeks((int) (byte) 10);
        org.joda.time.Period period30 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period30.toDurationFrom(readableInstant31);
        long long33 = duration32.getMillis();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.plus((org.joda.time.ReadableDuration) duration32);
        long long35 = duration32.getMillis();
        java.lang.String str36 = duration32.toString();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusWeeks((int) (byte) 10);
        org.joda.time.Period period41 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Duration duration43 = period41.toDurationFrom(readableInstant42);
        long long44 = duration43.getMillis();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime39.plus((org.joda.time.ReadableDuration) duration43);
        java.lang.String str46 = duration43.toString();
        boolean boolean47 = duration32.isShorterThan((org.joda.time.ReadableDuration) duration43);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime24.withDurationAdded((org.joda.time.ReadableDuration) duration43, 1970);
        org.joda.time.Interval interval50 = interval4.withDurationAfterStart((org.joda.time.ReadableDuration) duration43);
        org.joda.time.Instant instant51 = instant1.plus((org.joda.time.ReadableDuration) duration43);
        org.joda.time.MutableDateTime mutableDateTime52 = instant1.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime53 = instant1.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property55 = dateTime54.era();
        org.joda.time.DateTime dateTime57 = dateTime54.plusWeeks(100);
        org.joda.time.Period period66 = new org.joda.time.Period(22, (int) (short) 10, (int) '#', (int) (short) 100, 32772, 3, 0, (int) ' ');
        org.joda.time.DateTime dateTime67 = dateTime54.plus((org.joda.time.ReadablePeriod) period66);
        org.joda.time.DateTime.Property property68 = dateTime67.dayOfMonth();
        boolean boolean69 = mutableDateTime53.isAfter((org.joda.time.ReadableInstant) dateTime67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime52", (instant1.compareTo(mutableDateTime52) == 0) == instant1.equals(mutableDateTime52));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime6 = dateTime0.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = dateTime0.toDateTime(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime0.minus((long) 10);
        org.joda.time.DateTime dateTime12 = dateTime0.minusHours(7);
        org.joda.time.DateTime.Property property13 = dateTime0.dayOfWeek();
        org.joda.time.DateTime dateTime15 = dateTime0.minusHours(96);
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusWeeks((int) (byte) 10);
        org.joda.time.Period period21 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period21.toDurationFrom(readableInstant22);
        long long24 = duration23.getMillis();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.plus((org.joda.time.ReadableDuration) duration23);
        mutableInterval16.setDurationAfterStart((org.joda.time.ReadableDuration) duration23);
        org.joda.time.Duration duration27 = mutableInterval16.toDuration();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusWeeks((int) (byte) 10);
        org.joda.time.Period period32 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = period32.toDurationFrom(readableInstant33);
        long long35 = duration34.getMillis();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.plus((org.joda.time.ReadableDuration) duration34);
        long long37 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration34);
        boolean boolean38 = duration27.isShorterThan((org.joda.time.ReadableDuration) duration34);
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.minusWeeks((int) (byte) 10);
        org.joda.time.Period period44 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = period44.toDurationFrom(readableInstant45);
        long long47 = duration46.getMillis();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime42.plus((org.joda.time.ReadableDuration) duration46);
        mutableInterval39.setDurationAfterStart((org.joda.time.ReadableDuration) duration46);
        org.joda.time.Duration duration50 = mutableInterval39.toDuration();
        boolean boolean51 = duration34.isShorterThan((org.joda.time.ReadableDuration) duration50);
        org.joda.time.Duration duration52 = duration50.toDuration();
        long long53 = duration52.getMillis();
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property55 = dateTime54.era();
        org.joda.time.DateTime dateTime57 = dateTime54.plusWeeks(100);
        org.joda.time.Period period66 = new org.joda.time.Period(22, (int) (short) 10, (int) '#', (int) (short) 100, 32772, 3, 0, (int) ' ');
        org.joda.time.DateTime dateTime67 = dateTime54.plus((org.joda.time.ReadablePeriod) period66);
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property69 = dateTime68.millisOfDay();
        org.joda.time.DateTime dateTime70 = dateTime68.withTimeAtStartOfDay();
        org.joda.time.Period period72 = new org.joda.time.Period((long) '#');
        int int74 = period72.getValue(0);
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime();
        org.joda.time.Interval interval77 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime75, (org.joda.time.ReadableInstant) dateTime76);
        org.joda.time.Duration duration78 = period72.toDurationTo((org.joda.time.ReadableInstant) dateTime76);
        org.joda.time.Chronology chronology79 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime70, (org.joda.time.ReadableInstant) dateTime76);
        org.joda.time.DateTime dateTime80 = dateTime67.toDateTime(chronology79);
        org.joda.time.DateTimeField dateTimeField81 = chronology79.year();
        org.joda.time.Period period82 = duration52.toPeriod(chronology79);
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime(10L, chronology84);
        org.joda.time.DateTimeFieldType dateTimeFieldType86 = org.joda.time.DateTimeFieldType.weekyear();
        int int87 = dateTime85.get(dateTimeFieldType86);
        org.joda.time.Period period89 = new org.joda.time.Period((long) '#');
        int int91 = period89.getValue(0);
        org.joda.time.DateTime dateTime92 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime93 = new org.joda.time.DateTime();
        org.joda.time.Interval interval94 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime92, (org.joda.time.ReadableInstant) dateTime93);
        org.joda.time.Duration duration95 = period89.toDurationTo((org.joda.time.ReadableInstant) dateTime93);
        org.joda.time.MutableInterval mutableInterval96 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime85, (org.joda.time.ReadablePeriod) period89);
        org.joda.time.Instant instant97 = dateTime85.toInstant();
        org.joda.time.Period period98 = duration52.toPeriodTo((org.joda.time.ReadableInstant) instant97);
        org.joda.time.MutableInterval mutableInterval99 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableDuration) duration52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime85 and instant97", (dateTime85.compareTo(instant97) == 0) == dateTime85.equals(instant97));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) ' ', dateTimeZone1);
        int int3 = dateTime2.getYearOfCentury();
        org.joda.time.DateTime.Property property4 = dateTime2.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property4.getFieldType();
        org.joda.time.Interval interval6 = property4.toInterval();
        org.joda.time.MutableInterval mutableInterval7 = interval6.toMutableInterval();
        org.joda.time.Duration duration8 = interval6.toDuration();
        org.joda.time.Period period9 = duration8.toPeriod();
        org.joda.time.Instant instant11 = new org.joda.time.Instant(1645514176563L);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime13);
        java.lang.String str15 = interval14.toString();
        org.joda.time.DateTime dateTime16 = interval14.getEnd();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusWeeks((int) (byte) 10);
        org.joda.time.Period period21 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period21.toDurationFrom(readableInstant22);
        long long24 = duration23.getMillis();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.plus((org.joda.time.ReadableDuration) duration23);
        boolean boolean26 = interval14.equals((java.lang.Object) duration23);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime();
        org.joda.time.Interval interval29 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime dateTime30 = interval29.getEnd();
        org.joda.time.Interval interval31 = interval29.toInterval();
        org.joda.time.MutableInterval mutableInterval32 = interval31.toMutableInterval();
        org.joda.time.Interval interval33 = interval14.gap((org.joda.time.ReadableInterval) interval31);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime();
        int int35 = localDateTime34.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minusWeeks((int) (byte) 10);
        org.joda.time.Period period40 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = period40.toDurationFrom(readableInstant41);
        long long43 = duration42.getMillis();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime38.plus((org.joda.time.ReadableDuration) duration42);
        long long45 = duration42.getMillis();
        java.lang.String str46 = duration42.toString();
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.minusWeeks((int) (byte) 10);
        org.joda.time.Period period51 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Duration duration53 = period51.toDurationFrom(readableInstant52);
        long long54 = duration53.getMillis();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime49.plus((org.joda.time.ReadableDuration) duration53);
        java.lang.String str56 = duration53.toString();
        boolean boolean57 = duration42.isShorterThan((org.joda.time.ReadableDuration) duration53);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime34.withDurationAdded((org.joda.time.ReadableDuration) duration53, 1970);
        org.joda.time.Interval interval60 = interval14.withDurationAfterStart((org.joda.time.ReadableDuration) duration53);
        org.joda.time.Instant instant61 = instant11.plus((org.joda.time.ReadableDuration) duration53);
        org.joda.time.MutableDateTime mutableDateTime62 = instant61.toMutableDateTimeISO();
        org.joda.time.Duration duration63 = period9.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime62);
        org.joda.time.DurationFieldType[] durationFieldTypeArray64 = period9.getFieldTypes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant61 and mutableDateTime62", (instant61.compareTo(mutableDateTime62) == 0) == instant61.equals(mutableDateTime62));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        java.lang.String str3 = interval2.toString();
        boolean boolean4 = interval2.isAfterNow();
        org.joda.time.Duration duration5 = interval2.toDuration();
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#');
        int int9 = period7.getValue(0);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.Duration duration13 = period7.toDurationTo((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.Period period15 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationFrom(readableInstant16);
        org.joda.time.Seconds seconds18 = duration17.toStandardSeconds();
        boolean boolean19 = duration13.isEqual((org.joda.time.ReadableDuration) duration17);
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType23 = periodType22.withSecondsRemoved();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.Interval interval26 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Chronology chronology28 = org.joda.time.DateTimeUtils.getChronology(chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology28.hourOfHalfday();
        org.joda.time.DateTime dateTime30 = dateTime24.toDateTime(chronology28);
        org.joda.time.Period period31 = new org.joda.time.Period((long) 1, (long) ' ', periodType23, chronology28);
        org.joda.time.DurationField durationField32 = chronology28.weeks();
        boolean boolean33 = duration17.equals((java.lang.Object) chronology28);
        boolean boolean35 = duration17.equals((java.lang.Object) 1L);
        boolean boolean36 = duration5.isEqual((org.joda.time.ReadableDuration) duration17);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime();
        org.joda.time.Interval interval39 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadableInstant) dateTime38);
        int int40 = dateTime37.getMinuteOfDay();
        org.joda.time.Interval interval41 = duration5.toIntervalTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Interval interval42 = interval41.toInterval();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime45 = dateTime43.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant46 = dateTime45.toInstant();
        org.joda.time.MutableDateTime mutableDateTime47 = instant46.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType48 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Chronology chronology50 = org.joda.time.DateTimeUtils.getChronology(chronology49);
        org.joda.time.DateTimeField dateTimeField51 = chronology50.hourOfHalfday();
        org.joda.time.DurationField durationField52 = durationFieldType48.getField(chronology50);
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime((java.lang.Object) instant46, chronology50);
        org.joda.time.DateTimeZone dateTimeZone54 = instant46.getZone();
        boolean boolean55 = instant46.isAfterNow();
        org.joda.time.Instant instant57 = instant46.minus((long) 52);
        org.joda.time.DateTime dateTime58 = instant46.toDateTime();
        boolean boolean59 = interval42.isAfter((org.joda.time.ReadableInstant) instant46);
        boolean boolean61 = interval42.isBefore(3291028678025L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime45 and instant46", (dateTime45.compareTo(instant46) == 0) == dateTime45.equals(instant46));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(0L);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate4 = localDate2.withCenturyOfEra(382);
        java.util.Locale locale6 = java.util.Locale.JAPANESE;
        java.lang.String str7 = localDate4.toString("\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642", locale6);
        org.joda.time.LocalDate localDate9 = localDate4.withYear(21);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone10);
        java.lang.String str13 = dateTimeZone11.getName((long) ' ');
        long long15 = dateTimeZone11.previousTransition((long) (short) 1);
        org.joda.time.Interval interval16 = localDate4.toInterval(dateTimeZone11);
        long long18 = dateTimeZone11.previousTransition(35L);
        long long20 = dateTimeZone11.convertUTCToLocal(3291028448537L);
        org.joda.time.Interval interval21 = localDate1.toInterval(dateTimeZone11);
        org.joda.time.LocalDate.Property property22 = localDate1.weekOfWeekyear();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime25 = dateTime23.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant26 = dateTime25.toInstant();
        java.util.GregorianCalendar gregorianCalendar27 = dateTime25.toGregorianCalendar();
        org.joda.time.DateTime dateTime29 = dateTime25.withMillisOfSecond(19);
        org.joda.time.DateTime dateTime30 = localDate1.toDateTime((org.joda.time.ReadableInstant) dateTime29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant26", (dateTime25.compareTo(instant26) == 0) == dateTime25.equals(instant26));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.joda.time.Duration duration3 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.now(chronology5);
        org.joda.time.Period period8 = duration3.toPeriod(chronology5);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(327L, chronology5);
        org.joda.time.DurationField durationField10 = durationFieldType0.getField(chronology5);
        org.joda.time.DateTimeField dateTimeField11 = chronology5.clockhourOfDay();
        org.joda.time.Chronology chronology12 = chronology5.withUTC();
        org.joda.time.DurationField durationField13 = chronology12.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField13, and durationField10", !(durationField10.compareTo(durationField13) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField13.compareTo(durationField10))));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) 54);
        org.joda.time.Minutes minutes2 = duration1.toStandardMinutes();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant6 = dateTime5.toInstant();
        org.joda.time.MutableDateTime mutableDateTime7 = instant6.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.hourOfHalfday();
        org.joda.time.DurationField durationField12 = durationFieldType8.getField(chronology10);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((java.lang.Object) instant6, chronology10);
        org.joda.time.Instant instant16 = instant6.withDurationAdded(1645514154223L, 100);
        org.joda.time.Interval interval17 = duration1.toIntervalTo((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Instant instant20 = instant6.withDurationAdded(830200320000000L, 1097);
        org.joda.time.DateTime dateTime21 = instant6.toDateTimeISO();
        org.joda.time.Duration duration22 = org.joda.time.Duration.ZERO;
        org.joda.time.Instant instant24 = instant6.withDurationAdded((org.joda.time.ReadableDuration) duration22, 157);
        org.joda.time.DateTime dateTime25 = instant24.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant24", (dateTime5.compareTo(instant24) == 0) == dateTime5.equals(instant24));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1645514176563L);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        java.lang.String str5 = interval4.toString();
        org.joda.time.DateTime dateTime6 = interval4.getEnd();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusWeeks((int) (byte) 10);
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationFrom(readableInstant12);
        long long14 = duration13.getMillis();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.plus((org.joda.time.ReadableDuration) duration13);
        boolean boolean16 = interval4.equals((java.lang.Object) duration13);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime20 = interval19.getEnd();
        org.joda.time.Interval interval21 = interval19.toInterval();
        org.joda.time.MutableInterval mutableInterval22 = interval21.toMutableInterval();
        org.joda.time.Interval interval23 = interval4.gap((org.joda.time.ReadableInterval) interval21);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime();
        int int25 = localDateTime24.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minusWeeks((int) (byte) 10);
        org.joda.time.Period period30 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period30.toDurationFrom(readableInstant31);
        long long33 = duration32.getMillis();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.plus((org.joda.time.ReadableDuration) duration32);
        long long35 = duration32.getMillis();
        java.lang.String str36 = duration32.toString();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusWeeks((int) (byte) 10);
        org.joda.time.Period period41 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Duration duration43 = period41.toDurationFrom(readableInstant42);
        long long44 = duration43.getMillis();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime39.plus((org.joda.time.ReadableDuration) duration43);
        java.lang.String str46 = duration43.toString();
        boolean boolean47 = duration32.isShorterThan((org.joda.time.ReadableDuration) duration43);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime24.withDurationAdded((org.joda.time.ReadableDuration) duration43, 1970);
        org.joda.time.Interval interval50 = interval4.withDurationAfterStart((org.joda.time.ReadableDuration) duration43);
        org.joda.time.Instant instant51 = instant1.plus((org.joda.time.ReadableDuration) duration43);
        long long52 = instant1.getMillis();
        org.joda.time.DateTime dateTime53 = instant1.toDateTimeISO();
        org.joda.time.DateTime dateTime55 = dateTime53.plusSeconds(26228534);
        org.joda.time.DateTime.Property property56 = dateTime53.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property56.getFieldType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime53", (instant1.compareTo(dateTime53) == 0) == instant1.equals(dateTime53));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.LocalTime localTime4 = localTime2.withFields(readablePartial3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology6);
        int int8 = localTime7.getSecondOfMinute();
        org.joda.time.Period period9 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime2, (org.joda.time.ReadablePartial) localTime7);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.Period period11 = period9.plus(readablePeriod10);
        org.joda.time.Period period13 = period9.withSeconds(53);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime16 = dateTime14.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant17 = dateTime16.toInstant();
        org.joda.time.Duration duration18 = period9.toDurationTo((org.joda.time.ReadableInstant) instant17);
        long long19 = duration18.getStandardDays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant17", (dateTime16.compareTo(instant17) == 0) == dateTime16.equals(instant17));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.millisOfDay();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        int int5 = dateTime2.getMinuteOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(10L, chronology7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        int int10 = dateTime8.get(dateTimeFieldType9);
        int int11 = dateTime2.get(dateTimeFieldType9);
        boolean boolean12 = dateTime0.isEqual((org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.DateTime.Property property13 = dateTime2.weekyear();
        org.joda.time.DateTime.Property property14 = dateTime2.monthOfYear();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime17 = dateTime15.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant18 = dateTime17.toInstant();
        org.joda.time.MutableDateTime mutableDateTime19 = instant18.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Chronology chronology22 = org.joda.time.DateTimeUtils.getChronology(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology22.hourOfHalfday();
        org.joda.time.DurationField durationField24 = durationFieldType20.getField(chronology22);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((java.lang.Object) instant18, chronology22);
        org.joda.time.Instant instant28 = instant18.withDurationAdded(1645514154223L, 100);
        org.joda.time.DateTime dateTime29 = instant18.toDateTimeISO();
        boolean boolean31 = instant18.isBefore((long) 53);
        int int32 = property14.getDifference((org.joda.time.ReadableInstant) instant18);
        org.joda.time.DateTime dateTime33 = property14.roundHalfEvenCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and instant18", (dateTime17.compareTo(instant18) == 0) == dateTime17.equals(instant18));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        java.lang.Character[] charArray3 = new java.lang.Character[] { '#', ' ', '4' };
        java.util.LinkedHashSet<java.lang.Character> charSet4 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet4, charArray3);
        boolean boolean7 = charSet4.add((java.lang.Character) ' ');
        boolean boolean8 = charSet4.isEmpty();
        boolean boolean10 = charSet4.contains((java.lang.Object) "DateTimeField[minuteOfDay]");
        java.util.Spliterator<java.lang.Character> charSpliterator11 = charSet4.spliterator();
        java.lang.Character[] charArray15 = new java.lang.Character[] { '#', ' ', '4' };
        java.util.LinkedHashSet<java.lang.Character> charSet16 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet16, charArray15);
        boolean boolean19 = charSet16.add((java.lang.Character) ' ');
        java.lang.Object[] objArray20 = charSet16.toArray();
        java.lang.Character[] charArray24 = new java.lang.Character[] { '#', ' ', '4' };
        java.util.LinkedHashSet<java.lang.Character> charSet25 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet25, charArray24);
        boolean boolean28 = charSet25.add((java.lang.Character) ' ');
        boolean boolean29 = charSet25.isEmpty();
        boolean boolean30 = charSet16.addAll((java.util.Collection<java.lang.Character>) charSet25);
        boolean boolean31 = charSet4.containsAll((java.util.Collection<java.lang.Character>) charSet16);
        boolean boolean33 = charSet16.add((java.lang.Character) ' ');
        java.util.stream.Stream<java.lang.Character> charStream34 = charSet16.parallelStream();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime();
        org.joda.time.Interval interval37 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getChronology(chronology38);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.hourOfHalfday();
        org.joda.time.DateTime dateTime41 = dateTime35.toDateTime(chronology39);
        org.joda.time.DurationField durationField42 = chronology39.millis();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(chronology39);
        org.joda.time.Instant instant44 = dateTime43.toInstant();
        java.lang.String str45 = instant44.toString();
        boolean boolean46 = charSet16.contains((java.lang.Object) instant44);
        int int47 = charSet16.size();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and instant44", (dateTime35.compareTo(instant44) == 0) == dateTime35.equals(instant44));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant13 = instant3.withDurationAdded(1645514154223L, 100);
        org.joda.time.DateTime dateTime14 = instant3.toDateTimeISO();
        boolean boolean16 = instant3.isBefore((long) 53);
        org.joda.time.Instant instant18 = instant3.minus((long) 3);
        org.joda.time.Instant instant21 = instant3.withDurationAdded((long) 100, 292278993);
        org.joda.time.Instant instant23 = instant21.withMillis(80090516L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology1);
        int int3 = localTime2.getSecondOfMinute();
        org.joda.time.LocalTime.Property property4 = localTime2.millisOfSecond();
        org.joda.time.LocalTime localTime5 = property4.roundHalfEvenCopy();
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DurationField durationField9 = chronology6.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField9, and durationField8", !(durationField8.compareTo(durationField9) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField9.compareTo(durationField8))));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 26176);
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes((long) 54);
        org.joda.time.Minutes minutes4 = duration3.toStandardMinutes();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = dateTime5.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant8 = dateTime7.toInstant();
        org.joda.time.MutableDateTime mutableDateTime9 = instant8.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology12.hourOfHalfday();
        org.joda.time.DurationField durationField14 = durationFieldType10.getField(chronology12);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((java.lang.Object) instant8, chronology12);
        org.joda.time.Instant instant18 = instant8.withDurationAdded(1645514154223L, 100);
        org.joda.time.Interval interval19 = duration3.toIntervalTo((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Duration duration20 = period1.toDurationFrom((org.joda.time.ReadableInstant) instant8);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime.Property property24 = dateTime22.millisOfDay();
        org.joda.time.DateTime dateTime25 = property24.roundCeilingCopy();
        int int26 = dateTime25.getSecondOfDay();
        int int27 = dateTime25.getSecondOfDay();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property29 = dateTime28.millisOfDay();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        org.joda.time.Interval interval32 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) dateTime31);
        int int33 = dateTime30.getMinuteOfDay();
        int int34 = dateTime30.getYearOfCentury();
        int int35 = dateTime30.getDayOfMonth();
        org.joda.time.DateTime dateTime37 = dateTime30.minusWeeks((int) (short) 0);
        boolean boolean38 = dateTime28.isAfter((org.joda.time.ReadableInstant) dateTime30);
        int int39 = dateTime30.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property40 = dateTime30.dayOfYear();
        org.joda.time.DateTime dateTime42 = dateTime30.withEra(0);
        org.joda.time.DateTime dateTime44 = dateTime30.withDayOfYear((int) '#');
        org.joda.time.Duration duration45 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime();
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime46, (org.joda.time.ReadableInstant) dateTime47);
        int int49 = dateTime46.getMinuteOfDay();
        org.joda.time.Period period51 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime52 = dateTime46.plus((org.joda.time.ReadablePeriod) period51);
        int int53 = dateTime46.getSecondOfMinute();
        org.joda.time.DateTime dateTime54 = dateTime46.toDateTimeISO();
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.minusWeeks((int) (byte) 10);
        org.joda.time.Period period60 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Duration duration62 = period60.toDurationFrom(readableInstant61);
        long long63 = duration62.getMillis();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime58.plus((org.joda.time.ReadableDuration) duration62);
        mutableInterval55.setDurationAfterStart((org.joda.time.ReadableDuration) duration62);
        org.joda.time.Duration duration66 = mutableInterval55.toDuration();
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.minusWeeks((int) (byte) 10);
        org.joda.time.Period period71 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.Duration duration73 = period71.toDurationFrom(readableInstant72);
        long long74 = duration73.getMillis();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime69.plus((org.joda.time.ReadableDuration) duration73);
        long long76 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration73);
        boolean boolean77 = duration66.isShorterThan((org.joda.time.ReadableDuration) duration73);
        org.joda.time.Interval interval78 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime54, (org.joda.time.ReadableDuration) duration73);
        org.joda.time.DateTime dateTime80 = dateTime54.minusWeeks((int) (byte) 100);
        org.joda.time.MutableInterval mutableInterval81 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration45, (org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.Duration duration83 = org.joda.time.Duration.standardSeconds((long) 86399999);
        boolean boolean84 = duration45.isShorterThan((org.joda.time.ReadableDuration) duration83);
        org.joda.time.Duration duration86 = duration83.minus((long) 26171);
        boolean boolean87 = duration20.isLongerThan((org.joda.time.ReadableDuration) duration86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant8", (dateTime7.compareTo(instant8) == 0) == dateTime7.equals(instant8));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType2 = periodType1.withMillisRemoved();
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime();
        int int4 = localTime3.getMinuteOfHour();
        int int5 = localTime3.size();
        org.joda.time.LocalTime localTime7 = localTime3.minusMinutes((int) (byte) -1);
        org.joda.time.LocalTime.Property property8 = localTime3.minuteOfHour();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        org.joda.time.LocalTime localTime11 = property8.addCopy(122);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime12, (org.joda.time.ReadablePartial) localTime13, periodType14);
        org.joda.time.Period period16 = period15.negated();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) (-1), chronology18);
        org.joda.time.Period period20 = period19.toPeriod();
        org.joda.time.Period period21 = period16.withFields((org.joda.time.ReadablePeriod) period19);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Chronology chronology24 = org.joda.time.DateTimeUtils.getChronology(chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology24.hourOfHalfday();
        org.joda.time.DurationField durationField26 = durationFieldType22.getField(chronology24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Chronology chronology28 = org.joda.time.DateTimeUtils.getChronology(chronology27);
        boolean boolean29 = durationFieldType22.isSupported(chronology28);
        boolean boolean30 = period16.isSupported(durationFieldType22);
        org.joda.time.LocalTime localTime32 = localTime11.withFieldAdded(durationFieldType22, 9);
        int int33 = periodType2.indexOf(durationFieldType22);
        org.joda.time.PeriodType periodType34 = periodType2.withWeeksRemoved();
        org.joda.time.PeriodType periodType35 = periodType2.withMillisRemoved();
        org.joda.time.Interval interval37 = org.joda.time.Interval.parse("2022-02-22T07:16:05.197Z/2022-02-22T07:16:05.197Z");
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval();
        boolean boolean39 = interval37.isAfter((org.joda.time.ReadableInterval) mutableInterval38);
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.eras();
        org.joda.time.Duration duration45 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Chronology chronology47 = org.joda.time.DateTimeUtils.getChronology(chronology46);
        org.joda.time.DateTimeField dateTimeField48 = chronology47.hourOfHalfday();
        org.joda.time.LocalTime localTime49 = org.joda.time.LocalTime.now(chronology47);
        org.joda.time.Period period50 = duration45.toPeriod(chronology47);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(327L, chronology47);
        org.joda.time.DurationField durationField52 = durationFieldType42.getField(chronology47);
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((long) 12, 436L, chronology47);
        mutableInterval38.setChronology(chronology47);
        org.joda.time.Chronology chronology55 = org.joda.time.DateTimeUtils.getChronology(chronology47);
        org.joda.time.Period period56 = new org.joda.time.Period((-52L), periodType35, chronology47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField26 and durationField52", Math.signum(durationField26.compareTo(durationField52)) == -Math.signum(durationField52.compareTo(durationField26)));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1645514176563L);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        java.lang.String str5 = interval4.toString();
        org.joda.time.DateTime dateTime6 = interval4.getEnd();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusWeeks((int) (byte) 10);
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationFrom(readableInstant12);
        long long14 = duration13.getMillis();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.plus((org.joda.time.ReadableDuration) duration13);
        boolean boolean16 = interval4.equals((java.lang.Object) duration13);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime20 = interval19.getEnd();
        org.joda.time.Interval interval21 = interval19.toInterval();
        org.joda.time.MutableInterval mutableInterval22 = interval21.toMutableInterval();
        org.joda.time.Interval interval23 = interval4.gap((org.joda.time.ReadableInterval) interval21);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime();
        int int25 = localDateTime24.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minusWeeks((int) (byte) 10);
        org.joda.time.Period period30 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period30.toDurationFrom(readableInstant31);
        long long33 = duration32.getMillis();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.plus((org.joda.time.ReadableDuration) duration32);
        long long35 = duration32.getMillis();
        java.lang.String str36 = duration32.toString();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusWeeks((int) (byte) 10);
        org.joda.time.Period period41 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Duration duration43 = period41.toDurationFrom(readableInstant42);
        long long44 = duration43.getMillis();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime39.plus((org.joda.time.ReadableDuration) duration43);
        java.lang.String str46 = duration43.toString();
        boolean boolean47 = duration32.isShorterThan((org.joda.time.ReadableDuration) duration43);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime24.withDurationAdded((org.joda.time.ReadableDuration) duration43, 1970);
        org.joda.time.Interval interval50 = interval4.withDurationAfterStart((org.joda.time.ReadableDuration) duration43);
        org.joda.time.Instant instant51 = instant1.plus((org.joda.time.ReadableDuration) duration43);
        long long52 = instant1.getMillis();
        org.joda.time.DateTime dateTime53 = instant1.toDateTimeISO();
        org.joda.time.DateTime dateTime55 = dateTime53.plusSeconds(26228534);
        org.joda.time.Instant instant56 = dateTime55.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime53", (instant1.compareTo(dateTime53) == 0) == instant1.equals(dateTime53));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withCenturyOfEra(382);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays((int) (byte) 10);
        int int5 = localDate2.getYearOfEra();
        int int6 = localDate2.getYear();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) (-1), chronology8);
        org.joda.time.Period period10 = period9.toPeriod();
        org.joda.time.Period period11 = period9.toPeriod();
        org.joda.time.Period period13 = period9.plusMillis((int) (byte) 1);
        org.joda.time.LocalDate localDate15 = localDate2.withPeriodAdded((org.joda.time.ReadablePeriod) period9, 52435277);
        org.joda.time.DurationFieldType[] durationFieldTypeArray16 = period9.getFieldTypes();
        org.joda.time.Period period18 = period9.plusHours(26179754);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.Interval interval21 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableInstant) dateTime20);
        int int22 = dateTime19.getMinuteOfDay();
        int int23 = dateTime19.getYearOfCentury();
        int int24 = dateTime19.getDayOfMonth();
        org.joda.time.DateTime dateTime26 = dateTime19.minusWeeks((int) (short) 0);
        int int27 = dateTime19.getDayOfMonth();
        org.joda.time.Duration duration28 = period9.toDurationFrom((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime31 = dateTime29.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant32 = dateTime31.toInstant();
        org.joda.time.Instant instant33 = instant32.toInstant();
        boolean boolean34 = dateTime19.isAfter((org.joda.time.ReadableInstant) instant33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and instant33", (dateTime31.compareTo(instant33) == 0) == dateTime31.equals(instant33));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(10L, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.weekyear();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#');
        int int8 = period6.getValue(0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Duration duration12 = period6.toDurationTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadablePeriod) period6);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime15);
        int int17 = dateTime14.getMinuteOfDay();
        int int18 = dateTime14.getYearOfCentury();
        org.joda.time.DateTime.Property property19 = dateTime14.year();
        org.joda.time.DateTime dateTime20 = property19.withMinimumValue();
        org.joda.time.DateTime dateTime21 = dateTime20.withEarlierOffsetAtOverlap();
        org.joda.time.Instant instant22 = dateTime21.toInstant();
        mutableInterval13.setStart((org.joda.time.ReadableInstant) instant22);
        mutableInterval13.setDurationAfterStart(1645514433098L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and instant22", (dateTime20.compareTo(instant22) == 0) == dateTime20.equals(instant22));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.hourOfHalfday();
        org.joda.time.DateTime dateTime6 = dateTime0.toDateTime(chronology4);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) 995, 59);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime11);
        int int13 = dateTime10.getMinuteOfDay();
        int int14 = dateTime10.getYearOfCentury();
        int int15 = dateTime10.getDayOfMonth();
        org.joda.time.DateTime dateTime17 = dateTime10.minusWeeks((int) (short) 0);
        int int18 = dateTime10.getYear();
        org.joda.time.DateTime dateTime20 = dateTime10.plusYears(14);
        int int21 = dateTime20.getMillisOfDay();
        boolean boolean23 = dateTime20.isAfter(302L);
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.Instant instant25 = dateTime6.toInstant();
        int int26 = dateTime6.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant25", (dateTime6.compareTo(instant25) == 0) == dateTime6.equals(instant25));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant13 = instant3.withDurationAdded(1645514154223L, 100);
        long long14 = instant3.getMillis();
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getInstantChronology((org.joda.time.ReadableInstant) instant3);
        org.joda.time.DateTime dateTime16 = instant3.toDateTimeISO();
        org.joda.time.DateTime dateTime18 = dateTime16.withWeekyear(278);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getChronology(chronology0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.hourOfHalfday();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.now(chronology1);
        org.joda.time.DurationField durationField4 = chronology1.years();
        org.joda.time.DurationField durationField5 = chronology1.eras();
        org.joda.time.DateTimeField dateTimeField6 = chronology1.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField5", Math.signum(durationField4.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField4)));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        java.util.GregorianCalendar gregorianCalendar4 = dateTime2.toGregorianCalendar();
        org.joda.time.DateTime dateTime6 = dateTime2.withMillisOfSecond(19);
        org.joda.time.LocalTime localTime7 = dateTime6.toLocalTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        java.util.GregorianCalendar gregorianCalendar4 = dateTime2.toGregorianCalendar();
        boolean boolean5 = gregorianCalendar4.isWeekDateSupported();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.millisOfDay();
        org.joda.time.DateTime dateTime2 = dateTime0.withTimeAtStartOfDay();
        int int3 = dateTime0.getMinuteOfHour();
        org.joda.time.DateTime dateTime5 = dateTime0.plusMinutes(52485607);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = dateTime6.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.MutableDateTime mutableDateTime10 = instant9.toMutableDateTimeISO();
        org.joda.time.Instant instant13 = instant9.withDurationAdded((-1L), 21);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) instant9);
        java.lang.Object obj15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property17 = dateTime16.millisOfDay();
        org.joda.time.DateTime dateTime18 = dateTime16.withTimeAtStartOfDay();
        org.joda.time.Period period20 = new org.joda.time.Period((long) '#');
        int int22 = period20.getValue(0);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.Interval interval25 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Duration duration26 = period20.toDurationTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Chronology chronology27 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTimeField dateTimeField28 = chronology27.millisOfDay();
        org.joda.time.Period period29 = new org.joda.time.Period(obj15, chronology27);
        org.joda.time.Period period31 = period29.withMonths(474);
        org.joda.time.Period period32 = period29.toPeriod();
        org.joda.time.Period period34 = period32.withMillis(26228534);
        org.joda.time.PeriodType periodType35 = period32.getPeriodType();
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) instant9, periodType35);
        int int37 = period36.getMonths();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant9", (dateTime8.compareTo(instant9) == 0) == dateTime8.equals(instant9));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Duration duration6 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        int int10 = dateTime7.getMinuteOfDay();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime13 = dateTime7.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime7.toDateTime(chronology14);
        org.joda.time.DateTime dateTime17 = dateTime7.minus((long) 10);
        org.joda.time.Period period18 = duration6.toPeriodFrom((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property20 = dateTime19.era();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.plusWeeks((int) (byte) 1);
        int int24 = property20.compareTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime26);
        boolean boolean29 = interval27.isAfter((long) 10);
        org.joda.time.Duration duration30 = interval27.toDuration();
        org.joda.time.Duration duration33 = duration30.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableDuration) duration33);
        org.joda.time.Duration duration36 = duration6.withDurationAdded((org.joda.time.ReadableDuration) duration33, 26160257);
        org.joda.time.Instant instant37 = instant3.plus((org.joda.time.ReadableDuration) duration33);
        long long38 = instant3.getMillis();
        org.joda.time.DateTime dateTime39 = instant3.toDateTime();
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime();
        org.joda.time.Interval interval42 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime dateTime43 = interval42.getEnd();
        org.joda.time.Interval interval44 = interval42.toInterval();
        org.joda.time.MutableInterval mutableInterval45 = interval44.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval46 = mutableInterval45.toMutableInterval();
        org.joda.time.Chronology chronology47 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInterval) mutableInterval46);
        org.joda.time.DateTimeField dateTimeField48 = chronology47.secondOfDay();
        int int49 = dateTime39.get(dateTimeField48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) 54);
        org.joda.time.Minutes minutes2 = duration1.toStandardMinutes();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant6 = dateTime5.toInstant();
        org.joda.time.MutableDateTime mutableDateTime7 = instant6.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.hourOfHalfday();
        org.joda.time.DurationField durationField12 = durationFieldType8.getField(chronology10);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((java.lang.Object) instant6, chronology10);
        org.joda.time.Instant instant16 = instant6.withDurationAdded(1645514154223L, 100);
        org.joda.time.Interval interval17 = duration1.toIntervalTo((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Instant instant20 = instant6.withDurationAdded(830200320000000L, 1097);
        org.joda.time.DateTime dateTime21 = instant6.toDateTimeISO();
        org.joda.time.DateTime dateTime22 = instant6.toDateTime();
        org.joda.time.DateTime dateTime24 = dateTime22.minusMillis(5869503);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant6", (dateTime5.compareTo(instant6) == 0) == dateTime5.equals(instant6));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant12 = instant3.plus(1645514151873L);
        org.joda.time.Instant instant14 = instant12.plus((long) 26217);
        org.joda.time.Instant instant16 = instant12.withMillis(3291028667296L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.joda.time.Period period1 = new org.joda.time.Period((long) '#');
        int int3 = period1.getValue(0);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Duration duration7 = period1.toDurationTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime9 = dateTime5.minus(3291028457896L);
        org.joda.time.Instant instant11 = new org.joda.time.Instant(1645514176563L);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime13);
        java.lang.String str15 = interval14.toString();
        org.joda.time.DateTime dateTime16 = interval14.getEnd();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusWeeks((int) (byte) 10);
        org.joda.time.Period period21 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period21.toDurationFrom(readableInstant22);
        long long24 = duration23.getMillis();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.plus((org.joda.time.ReadableDuration) duration23);
        boolean boolean26 = interval14.equals((java.lang.Object) duration23);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime();
        org.joda.time.Interval interval29 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime dateTime30 = interval29.getEnd();
        org.joda.time.Interval interval31 = interval29.toInterval();
        org.joda.time.MutableInterval mutableInterval32 = interval31.toMutableInterval();
        org.joda.time.Interval interval33 = interval14.gap((org.joda.time.ReadableInterval) interval31);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime();
        int int35 = localDateTime34.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minusWeeks((int) (byte) 10);
        org.joda.time.Period period40 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = period40.toDurationFrom(readableInstant41);
        long long43 = duration42.getMillis();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime38.plus((org.joda.time.ReadableDuration) duration42);
        long long45 = duration42.getMillis();
        java.lang.String str46 = duration42.toString();
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.minusWeeks((int) (byte) 10);
        org.joda.time.Period period51 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Duration duration53 = period51.toDurationFrom(readableInstant52);
        long long54 = duration53.getMillis();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime49.plus((org.joda.time.ReadableDuration) duration53);
        java.lang.String str56 = duration53.toString();
        boolean boolean57 = duration42.isShorterThan((org.joda.time.ReadableDuration) duration53);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime34.withDurationAdded((org.joda.time.ReadableDuration) duration53, 1970);
        org.joda.time.Interval interval60 = interval14.withDurationAfterStart((org.joda.time.ReadableDuration) duration53);
        org.joda.time.Instant instant61 = instant11.plus((org.joda.time.ReadableDuration) duration53);
        org.joda.time.MutableDateTime mutableDateTime62 = instant11.toMutableDateTime();
        boolean boolean63 = dateTime5.isBefore((org.joda.time.ReadableInstant) mutableDateTime62);
        org.joda.time.LocalTime localTime64 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime66 = localTime64.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial67 = null;
        org.joda.time.LocalTime localTime68 = localTime66.withFields(readablePartial67);
        org.joda.time.Period period70 = new org.joda.time.Period((long) (short) 10);
        org.joda.time.PeriodType periodType71 = org.joda.time.PeriodType.days();
        org.joda.time.Period period72 = period70.normalizedStandard(periodType71);
        org.joda.time.DurationFieldType durationFieldType73 = org.joda.time.DurationFieldType.hours();
        int int74 = periodType71.indexOf(durationFieldType73);
        boolean boolean75 = localTime68.isSupported(durationFieldType73);
        org.joda.time.DateTime dateTime77 = dateTime5.withFieldAdded(durationFieldType73, (-914139));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and mutableDateTime62", (instant11.compareTo(mutableDateTime62) == 0) == instant11.equals(mutableDateTime62));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        java.lang.String str3 = interval2.toString();
        org.joda.time.DateTime dateTime4 = interval2.getEnd();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusWeeks((int) (byte) 10);
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        long long12 = duration11.getMillis();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.plus((org.joda.time.ReadableDuration) duration11);
        boolean boolean14 = interval2.equals((java.lang.Object) duration11);
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationFrom(readableInstant17);
        org.joda.time.Seconds seconds19 = duration18.toStandardSeconds();
        org.joda.time.Duration duration22 = duration18.withDurationAdded((long) 32772, (int) (byte) 10);
        long long23 = duration22.getStandardSeconds();
        int int24 = duration11.compareTo((org.joda.time.ReadableDuration) duration22);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusWeeks((int) (byte) 10);
        org.joda.time.Period period29 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period29.toDurationFrom(readableInstant30);
        long long32 = duration31.getMillis();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime27.plus((org.joda.time.ReadableDuration) duration31);
        org.joda.time.Duration duration35 = duration31.minus((long) 38222);
        org.joda.time.Duration duration37 = duration22.withDurationAdded((org.joda.time.ReadableDuration) duration31, 52460890);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime();
        org.joda.time.Interval interval40 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime38, (org.joda.time.ReadableInstant) dateTime39);
        int int41 = dateTime38.getMinuteOfDay();
        org.joda.time.Period period43 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime44 = dateTime38.plus((org.joda.time.ReadablePeriod) period43);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime38, chronology45);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property48 = dateTime47.millisOfDay();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime();
        org.joda.time.Interval interval51 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime49, (org.joda.time.ReadableInstant) dateTime50);
        int int52 = dateTime49.getMinuteOfDay();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(10L, chronology54);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.weekyear();
        int int57 = dateTime55.get(dateTimeFieldType56);
        int int58 = dateTime49.get(dateTimeFieldType56);
        boolean boolean59 = dateTime47.isEqual((org.joda.time.ReadableInstant) dateTime49);
        int int60 = dateTime38.compareTo((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = dateTime38.toMutableDateTime(dateTimeZone61);
        org.joda.time.Period period63 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration31, (org.joda.time.ReadableInstant) mutableDateTime62);
        org.joda.time.Instant instant64 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology65 = instant64.getChronology();
        org.joda.time.Period period67 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Duration duration69 = period67.toDurationFrom(readableInstant68);
        org.joda.time.Seconds seconds70 = duration69.toStandardSeconds();
        org.joda.time.Duration duration73 = duration69.withDurationAdded((long) 32772, (int) (byte) 10);
        java.lang.String str74 = duration69.toString();
        org.joda.time.Period period75 = duration69.toPeriod();
        org.joda.time.Instant instant76 = instant64.plus((org.joda.time.ReadableDuration) duration69);
        org.joda.time.Instant instant77 = instant76.toInstant();
        org.joda.time.Instant instant79 = instant77.minus(3291028669696L);
        org.joda.time.Period period81 = org.joda.time.Period.millis(814);
        org.joda.time.LocalTime localTime82 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime84 = localTime82.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial85 = null;
        org.joda.time.LocalTime localTime86 = localTime84.withFields(readablePartial85);
        org.joda.time.Chronology chronology88 = null;
        org.joda.time.LocalTime localTime89 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology88);
        int int90 = localTime89.getSecondOfMinute();
        org.joda.time.Period period91 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime84, (org.joda.time.ReadablePartial) localTime89);
        org.joda.time.PeriodType periodType92 = period91.getPeriodType();
        org.joda.time.Period period93 = period81.normalizedStandard(periodType92);
        org.joda.time.PeriodType periodType94 = periodType92.withWeeksRemoved();
        org.joda.time.Period period95 = duration31.toPeriodFrom((org.joda.time.ReadableInstant) instant79, periodType94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant64", (dateTime0.compareTo(instant64) == 0) == dateTime0.equals(instant64));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Duration duration6 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        int int10 = dateTime7.getMinuteOfDay();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime13 = dateTime7.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime7.toDateTime(chronology14);
        org.joda.time.DateTime dateTime17 = dateTime7.minus((long) 10);
        org.joda.time.Period period18 = duration6.toPeriodFrom((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property20 = dateTime19.era();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.plusWeeks((int) (byte) 1);
        int int24 = property20.compareTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime26);
        boolean boolean29 = interval27.isAfter((long) 10);
        org.joda.time.Duration duration30 = interval27.toDuration();
        org.joda.time.Duration duration33 = duration30.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableDuration) duration33);
        org.joda.time.Duration duration36 = duration6.withDurationAdded((org.joda.time.ReadableDuration) duration33, 26160257);
        org.joda.time.Instant instant37 = instant3.plus((org.joda.time.ReadableDuration) duration33);
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardDays(21L);
        org.joda.time.Instant instant41 = instant37.withDurationAdded((org.joda.time.ReadableDuration) duration39, 26308);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime4.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusYears(26151451);
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#');
        int int12 = period10.getValue(0);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Duration duration16 = period10.toDurationTo((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime8.withPeriodAdded((org.joda.time.ReadablePeriod) period10, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean20 = localDateTime8.isSupported(dateTimeFieldType19);
        int int21 = instant3.get(dateTimeFieldType19);
        org.joda.time.Duration duration23 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.Interval interval26 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime25);
        int int27 = dateTime24.getMinuteOfDay();
        org.joda.time.Period period29 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime30 = dateTime24.plus((org.joda.time.ReadablePeriod) period29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = dateTime24.toDateTime(chronology31);
        org.joda.time.DateTime dateTime34 = dateTime24.minus((long) 10);
        org.joda.time.Period period35 = duration23.toPeriodFrom((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Instant instant36 = instant3.plus((org.joda.time.ReadableDuration) duration23);
        java.lang.String str37 = instant36.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant13 = instant3.withDurationAdded(1645514154223L, 100);
        long long14 = instant3.getMillis();
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getInstantChronology((org.joda.time.ReadableInstant) instant3);
        org.joda.time.DateTime dateTime16 = instant3.toDateTimeISO();
        org.joda.time.LocalDate localDate17 = dateTime16.toLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) ' ', dateTimeZone1);
        int int3 = dateTime2.getYearOfCentury();
        org.joda.time.DateTime.Property property4 = dateTime2.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property4.getFieldType();
        org.joda.time.Interval interval6 = property4.toInterval();
        org.joda.time.MutableInterval mutableInterval7 = interval6.toMutableInterval();
        org.joda.time.Duration duration8 = interval6.toDuration();
        org.joda.time.Period period9 = duration8.toPeriod();
        org.joda.time.Instant instant11 = new org.joda.time.Instant(1645514176563L);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime13);
        java.lang.String str15 = interval14.toString();
        org.joda.time.DateTime dateTime16 = interval14.getEnd();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusWeeks((int) (byte) 10);
        org.joda.time.Period period21 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period21.toDurationFrom(readableInstant22);
        long long24 = duration23.getMillis();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.plus((org.joda.time.ReadableDuration) duration23);
        boolean boolean26 = interval14.equals((java.lang.Object) duration23);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime();
        org.joda.time.Interval interval29 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime dateTime30 = interval29.getEnd();
        org.joda.time.Interval interval31 = interval29.toInterval();
        org.joda.time.MutableInterval mutableInterval32 = interval31.toMutableInterval();
        org.joda.time.Interval interval33 = interval14.gap((org.joda.time.ReadableInterval) interval31);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime();
        int int35 = localDateTime34.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minusWeeks((int) (byte) 10);
        org.joda.time.Period period40 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = period40.toDurationFrom(readableInstant41);
        long long43 = duration42.getMillis();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime38.plus((org.joda.time.ReadableDuration) duration42);
        long long45 = duration42.getMillis();
        java.lang.String str46 = duration42.toString();
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.minusWeeks((int) (byte) 10);
        org.joda.time.Period period51 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Duration duration53 = period51.toDurationFrom(readableInstant52);
        long long54 = duration53.getMillis();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime49.plus((org.joda.time.ReadableDuration) duration53);
        java.lang.String str56 = duration53.toString();
        boolean boolean57 = duration42.isShorterThan((org.joda.time.ReadableDuration) duration53);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime34.withDurationAdded((org.joda.time.ReadableDuration) duration53, 1970);
        org.joda.time.Interval interval60 = interval14.withDurationAfterStart((org.joda.time.ReadableDuration) duration53);
        org.joda.time.Instant instant61 = instant11.plus((org.joda.time.ReadableDuration) duration53);
        org.joda.time.MutableDateTime mutableDateTime62 = instant61.toMutableDateTimeISO();
        org.joda.time.Duration duration63 = period9.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime62);
        org.joda.time.MutableDateTime mutableDateTime64 = mutableDateTime62.toMutableDateTime();
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property66 = dateTime65.millisOfDay();
        org.joda.time.DateTime dateTime67 = dateTime65.withTimeAtStartOfDay();
        int int68 = dateTime65.getEra();
        org.joda.time.DateTime dateTime70 = dateTime65.plus(3291028490522L);
        org.joda.time.Period period71 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime64, (org.joda.time.ReadableInstant) dateTime65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant61 and mutableDateTime62", (instant61.compareTo(mutableDateTime62) == 0) == instant61.equals(mutableDateTime62));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.hourOfHalfday();
        org.joda.time.DateTime dateTime6 = dateTime0.toDateTime(chronology4);
        org.joda.time.DurationField durationField7 = chronology4.millis();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology4);
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withFieldAdded(durationFieldType12, 1970);
        int int15 = localDateTime14.getEra();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.minusSeconds(26171);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.Interval interval20 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime21 = interval20.getEnd();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeUtils.getZone(dateTimeZone23);
        java.lang.String str26 = dateTimeZone24.getName((long) ' ');
        java.lang.String str28 = dateTimeZone24.getName((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(0L, dateTimeZone24);
        org.joda.time.DateTime dateTime30 = dateTime21.withZone(dateTimeZone24);
        java.lang.String str32 = dateTimeZone24.getNameKey(1645514153208L);
        org.joda.time.DateTime dateTime33 = localDateTime14.toDateTime(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime34 = instant9.toMutableDateTime(dateTimeZone24);
        org.joda.time.Instant instant35 = instant9.toInstant();
        org.joda.time.Instant instant37 = instant9.withMillis(3291028679053L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant9", (dateTime0.compareTo(instant9) == 0) == dateTime0.equals(instant9));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        long long2 = calendar1.getTimeInMillis();
        int int4 = calendar1.getGreatestMinimum(6);
        java.util.Date date5 = calendar1.getTime();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromCalendarFields(calendar1);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(1645514178053L);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial12 = null;
        org.joda.time.LocalTime localTime13 = localTime11.withFields(readablePartial12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology15);
        int int17 = localTime16.getSecondOfMinute();
        org.joda.time.Period period18 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime11, (org.joda.time.ReadablePartial) localTime16);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.Period period20 = period18.plus(readablePeriod19);
        org.joda.time.Period period21 = period20.negated();
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime22, (org.joda.time.ReadablePartial) localTime23, periodType24);
        org.joda.time.Period period26 = period21.minus((org.joda.time.ReadablePeriod) period25);
        org.joda.time.DateTime dateTime27 = dateTime8.plus((org.joda.time.ReadablePeriod) period25);
        org.joda.time.DateTime dateTime28 = localTime6.toDateTime((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.Instant instant29 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology30 = instant29.getChronology();
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime8.toMutableDateTime(chronology30);
        org.joda.time.Period period33 = org.joda.time.Period.minutes(13);
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.PeriodType periodType35 = periodType34.withMinutesRemoved();
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime36, (org.joda.time.ReadablePartial) localTime37, periodType38);
        org.joda.time.Period period40 = period39.negated();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) (-1), chronology42);
        org.joda.time.Period period44 = period43.toPeriod();
        org.joda.time.Period period45 = period40.withFields((org.joda.time.ReadablePeriod) period43);
        org.joda.time.DurationFieldType durationFieldType46 = org.joda.time.DurationFieldType.hours();
        boolean boolean47 = period40.isSupported(durationFieldType46);
        int int48 = periodType35.indexOf(durationFieldType46);
        int int49 = period33.indexOf(durationFieldType46);
        org.joda.time.PeriodType periodType54 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType55 = periodType54.withSecondsRemoved();
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime();
        org.joda.time.Interval interval58 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime56, (org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.Chronology chronology60 = org.joda.time.DateTimeUtils.getChronology(chronology59);
        org.joda.time.DateTimeField dateTimeField61 = chronology60.hourOfHalfday();
        org.joda.time.DateTime dateTime62 = dateTime56.toDateTime(chronology60);
        org.joda.time.Period period63 = new org.joda.time.Period((long) 1, (long) ' ', periodType55, chronology60);
        org.joda.time.DurationField durationField64 = chronology60.weeks();
        org.joda.time.Interval interval65 = new org.joda.time.Interval((long) 10, 1645514153096L, chronology60);
        boolean boolean66 = durationFieldType46.isSupported(chronology60);
        org.joda.time.DateTime dateTime68 = dateTime8.withFieldAdded(durationFieldType46, 46);
        org.joda.time.DateTime dateTime70 = dateTime68.plusMillis(65967598);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and mutableDateTime31", (dateTime8.compareTo(mutableDateTime31) == 0) == dateTime8.equals(mutableDateTime31));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 26176);
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes((long) 54);
        org.joda.time.Minutes minutes4 = duration3.toStandardMinutes();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = dateTime5.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant8 = dateTime7.toInstant();
        org.joda.time.MutableDateTime mutableDateTime9 = instant8.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology12.hourOfHalfday();
        org.joda.time.DurationField durationField14 = durationFieldType10.getField(chronology12);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((java.lang.Object) instant8, chronology12);
        org.joda.time.Instant instant18 = instant8.withDurationAdded(1645514154223L, 100);
        org.joda.time.Interval interval19 = duration3.toIntervalTo((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Duration duration20 = period1.toDurationFrom((org.joda.time.ReadableInstant) instant8);
        long long21 = duration20.getStandardMinutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant8", (dateTime7.compareTo(instant8) == 0) == dateTime7.equals(instant8));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime4 = dateTime1.minusMonths(26165);
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#');
        int int8 = period6.getValue(0);
        org.joda.time.Period period9 = period6.normalizedStandard();
        org.joda.time.Period period11 = period6.plusSeconds((int) ' ');
        org.joda.time.DateTime dateTime12 = dateTime4.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.DateTime dateTime14 = dateTime4.withYearOfCentury(34);
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology16 = instant15.getChronology();
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = period18.toDurationFrom(readableInstant19);
        org.joda.time.Seconds seconds21 = duration20.toStandardSeconds();
        org.joda.time.Duration duration24 = duration20.withDurationAdded((long) 32772, (int) (byte) 10);
        java.lang.String str25 = duration20.toString();
        org.joda.time.Period period26 = duration20.toPeriod();
        org.joda.time.Instant instant27 = instant15.plus((org.joda.time.ReadableDuration) duration20);
        org.joda.time.Instant instant28 = instant27.toInstant();
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) instant28);
        java.lang.String str30 = mutableInterval29.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant15", (dateTime0.compareTo(instant15) == 0) == dateTime0.equals(instant15));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-1), chronology1);
        org.joda.time.Period period3 = period2.toPeriod();
        int int4 = period3.size();
        int int5 = period3.getMinutes();
        int[] intArray6 = period3.getValues();
        java.lang.String str7 = period3.toString();
        org.joda.time.Period period9 = period3.plusSeconds(122);
        org.joda.time.Period period10 = period3.toPeriod();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.eras();
        org.joda.time.Duration duration14 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Chronology chronology16 = org.joda.time.DateTimeUtils.getChronology(chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfHalfday();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.now(chronology16);
        org.joda.time.Period period19 = duration14.toPeriod(chronology16);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(327L, chronology16);
        org.joda.time.DurationField durationField21 = durationFieldType11.getField(chronology16);
        java.lang.String str22 = durationFieldType11.toString();
        int int23 = period3.get(durationFieldType11);
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType26 = periodType25.withDaysRemoved();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime();
        org.joda.time.Interval interval29 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime dateTime30 = interval29.getEnd();
        org.joda.time.Chronology chronology31 = dateTime30.getChronology();
        org.joda.time.Period period32 = new org.joda.time.Period(1645514161529L, periodType26, chronology31);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime33, (org.joda.time.ReadablePartial) localTime34, periodType35);
        org.joda.time.Period period37 = period36.negated();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((long) (-1), chronology39);
        org.joda.time.Period period41 = period40.toPeriod();
        int int42 = period41.size();
        int int43 = period41.getMinutes();
        int[] intArray44 = period41.getValues();
        org.joda.time.Period period46 = period41.withMonths(26155103);
        org.joda.time.Period period48 = period46.minusDays((-292275054));
        int int49 = period46.getHours();
        org.joda.time.Period period51 = period46.withMinutes(914);
        org.joda.time.DurationFieldType durationFieldType52 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Chronology chronology54 = org.joda.time.DateTimeUtils.getChronology(chronology53);
        org.joda.time.DateTimeField dateTimeField55 = chronology54.hourOfHalfday();
        org.joda.time.DurationField durationField56 = durationFieldType52.getField(chronology54);
        boolean boolean57 = period46.isSupported(durationFieldType52);
        boolean boolean58 = period36.isSupported(durationFieldType52);
        boolean boolean59 = period32.isSupported(durationFieldType52);
        java.lang.String str60 = durationFieldType52.getName();
        org.joda.time.Period period62 = period3.withField(durationFieldType52, 25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField21 and durationField56", Math.signum(durationField21.compareTo(durationField56)) == -Math.signum(durationField56.compareTo(durationField21)));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.era();
        org.joda.time.DateTime dateTime3 = dateTime0.plusWeeks(100);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfCentury(0);
        org.joda.time.Instant instant6 = dateTime3.toInstant();
        org.joda.time.Duration duration8 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.Period period9 = duration8.toPeriod();
        org.joda.time.Instant instant10 = instant6.minus((org.joda.time.ReadableDuration) duration8);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType14 = periodType13.withSecondsRemoved();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Chronology chronology19 = org.joda.time.DateTimeUtils.getChronology(chronology18);
        org.joda.time.DateTimeField dateTimeField20 = chronology19.hourOfHalfday();
        org.joda.time.DateTime dateTime21 = dateTime15.toDateTime(chronology19);
        org.joda.time.Period period22 = new org.joda.time.Period((long) 1, (long) ' ', periodType14, chronology19);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withCenturyOfEra(2);
        long long28 = chronology19.set((org.joda.time.ReadablePartial) localDateTime24, (long) (short) 10);
        org.joda.time.DurationField durationField29 = chronology19.seconds();
        org.joda.time.DurationField durationField30 = chronology19.days();
        org.joda.time.DateTimeField dateTimeField31 = chronology19.monthOfYear();
        org.joda.time.Period period32 = duration8.toPeriod(chronology19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant6", (dateTime3.compareTo(instant6) == 0) == dateTime3.equals(instant6));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.DateTimeZone dateTimeZone11 = instant3.getZone();
        boolean boolean12 = instant3.isAfterNow();
        org.joda.time.Instant instant14 = instant3.minus((long) 52);
        org.joda.time.Instant instant16 = instant14.minus(3291028462605L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.days();
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.days();
        int int4 = periodType2.indexOf(durationFieldType3);
        org.joda.time.PeriodType periodType5 = periodType2.withMinutesRemoved();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.millis();
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType12 = periodType11.withSecondsRemoved();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Chronology chronology17 = org.joda.time.DateTimeUtils.getChronology(chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology17.hourOfHalfday();
        org.joda.time.DateTime dateTime19 = dateTime13.toDateTime(chronology17);
        org.joda.time.Period period20 = new org.joda.time.Period((long) 1, (long) ' ', periodType12, chronology17);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withCenturyOfEra(2);
        long long26 = chronology17.set((org.joda.time.ReadablePartial) localDateTime22, (long) (short) 10);
        org.joda.time.DurationField durationField27 = chronology17.seconds();
        org.joda.time.Period period28 = new org.joda.time.Period((long) 2782, 60000L, chronology17);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime();
        org.joda.time.Interval interval31 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime30);
        int int32 = dateTime29.getMinuteOfDay();
        org.joda.time.Period period34 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime35 = dateTime29.plus((org.joda.time.ReadablePeriod) period34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime29, chronology36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.withMonthOfYear(5);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime37.minusMonths(999);
        int[] intArray43 = chronology17.get((org.joda.time.ReadablePartial) localDateTime37, (long) (byte) 100);
        org.joda.time.DurationField durationField44 = chronology17.minutes();
        boolean boolean45 = durationFieldType6.isSupported(chronology17);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(dateTimeZone46);
        org.joda.time.DurationFieldType durationFieldType48 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.withFieldAdded(durationFieldType48, 1970);
        org.joda.time.Chronology chronology51 = localDateTime50.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = chronology51.centuryOfEra();
        boolean boolean53 = durationFieldType6.isSupported(chronology51);
        org.joda.time.DateTimeField dateTimeField54 = chronology51.minuteOfHour();
        org.joda.time.Period period55 = new org.joda.time.Period(3291028438583L, 0L, periodType2, chronology51);
        org.joda.time.Instant instant56 = new org.joda.time.Instant();
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.minusWeeks((int) (byte) 10);
        org.joda.time.Period period62 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Duration duration64 = period62.toDurationFrom(readableInstant63);
        long long65 = duration64.getMillis();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime60.plus((org.joda.time.ReadableDuration) duration64);
        mutableInterval57.setDurationAfterStart((org.joda.time.ReadableDuration) duration64);
        org.joda.time.Duration duration68 = mutableInterval57.toDuration();
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime71 = localDateTime69.minusWeeks((int) (byte) 10);
        org.joda.time.Period period73 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.Duration duration75 = period73.toDurationFrom(readableInstant74);
        long long76 = duration75.getMillis();
        org.joda.time.LocalDateTime localDateTime77 = localDateTime71.plus((org.joda.time.ReadableDuration) duration75);
        long long78 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration75);
        boolean boolean79 = duration68.isShorterThan((org.joda.time.ReadableDuration) duration75);
        org.joda.time.MutableInterval mutableInterval80 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime81 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime83 = localDateTime81.minusWeeks((int) (byte) 10);
        org.joda.time.Period period85 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant86 = null;
        org.joda.time.Duration duration87 = period85.toDurationFrom(readableInstant86);
        long long88 = duration87.getMillis();
        org.joda.time.LocalDateTime localDateTime89 = localDateTime83.plus((org.joda.time.ReadableDuration) duration87);
        mutableInterval80.setDurationAfterStart((org.joda.time.ReadableDuration) duration87);
        org.joda.time.Duration duration91 = mutableInterval80.toDuration();
        boolean boolean92 = duration75.isShorterThan((org.joda.time.ReadableDuration) duration91);
        org.joda.time.Instant instant94 = instant56.withDurationAdded((org.joda.time.ReadableDuration) duration75, 20);
        org.joda.time.Instant instant96 = instant94.minus((long) 'x');
        org.joda.time.MutableDateTime mutableDateTime97 = instant96.toMutableDateTimeISO();
        boolean boolean98 = periodType2.equals((java.lang.Object) instant96);
        org.joda.time.Chronology chronology99 = instant96.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant56", (dateTime13.compareTo(instant56) == 0) == dateTime13.equals(instant56));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) 54);
        org.joda.time.Minutes minutes2 = duration1.toStandardMinutes();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant6 = dateTime5.toInstant();
        org.joda.time.MutableDateTime mutableDateTime7 = instant6.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.hourOfHalfday();
        org.joda.time.DurationField durationField12 = durationFieldType8.getField(chronology10);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((java.lang.Object) instant6, chronology10);
        org.joda.time.Instant instant16 = instant6.withDurationAdded(1645514154223L, 100);
        org.joda.time.Interval interval17 = duration1.toIntervalTo((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Instant instant20 = instant6.withDurationAdded(830200320000000L, 1097);
        org.joda.time.DateTime dateTime21 = instant6.toDateTimeISO();
        org.joda.time.Duration duration22 = org.joda.time.Duration.ZERO;
        org.joda.time.Instant instant24 = instant6.withDurationAdded((org.joda.time.ReadableDuration) duration22, 157);
        org.joda.time.Instant instant25 = new org.joda.time.Instant();
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusWeeks((int) (byte) 10);
        org.joda.time.Period period31 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = period31.toDurationFrom(readableInstant32);
        long long34 = duration33.getMillis();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime29.plus((org.joda.time.ReadableDuration) duration33);
        mutableInterval26.setDurationAfterStart((org.joda.time.ReadableDuration) duration33);
        org.joda.time.Duration duration37 = mutableInterval26.toDuration();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minusWeeks((int) (byte) 10);
        org.joda.time.Period period42 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Duration duration44 = period42.toDurationFrom(readableInstant43);
        long long45 = duration44.getMillis();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime40.plus((org.joda.time.ReadableDuration) duration44);
        long long47 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration44);
        boolean boolean48 = duration37.isShorterThan((org.joda.time.ReadableDuration) duration44);
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.minusWeeks((int) (byte) 10);
        org.joda.time.Period period54 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Duration duration56 = period54.toDurationFrom(readableInstant55);
        long long57 = duration56.getMillis();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime52.plus((org.joda.time.ReadableDuration) duration56);
        mutableInterval49.setDurationAfterStart((org.joda.time.ReadableDuration) duration56);
        org.joda.time.Duration duration60 = mutableInterval49.toDuration();
        boolean boolean61 = duration44.isShorterThan((org.joda.time.ReadableDuration) duration60);
        org.joda.time.Instant instant63 = instant25.withDurationAdded((org.joda.time.ReadableDuration) duration44, 20);
        org.joda.time.Instant instant65 = instant24.withDurationAdded((org.joda.time.ReadableDuration) duration44, 209);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant25", (dateTime3.compareTo(instant25) == 0) == dateTime3.equals(instant25));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("zh_TW");
        java.time.ZoneId zoneId3 = timeZone2.toZoneId();
        int int4 = timeZone2.getRawOffset();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("zh_TW");
        java.time.ZoneId zoneId7 = timeZone6.toZoneId();
        java.util.TimeZone timeZone8 = java.util.TimeZone.getTimeZone(zoneId7);
        boolean boolean9 = timeZone2.hasSameRules(timeZone8);
        java.util.Calendar.Builder builder10 = builder0.setTimeZone(timeZone2);
        java.util.TimeZone timeZone12 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime14);
        int int16 = dateTime13.getMinuteOfDay();
        int int17 = dateTime13.getYearOfCentury();
        int int18 = dateTime13.getDayOfMonth();
        org.joda.time.DateTime dateTime20 = dateTime13.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property21 = dateTime20.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        int int23 = dateTimeField22.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minusWeeks((int) (byte) 10);
        org.joda.time.Period period28 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = period28.toDurationFrom(readableInstant29);
        long long31 = duration30.getMillis();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime26.plus((org.joda.time.ReadableDuration) duration30);
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str35 = dateTimeField22.getAsText((org.joda.time.ReadablePartial) localDateTime26, (int) (short) 1, locale34);
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.lang.String str37 = locale34.getDisplayLanguage(locale36);
        java.util.Calendar calendar38 = java.util.Calendar.getInstance(timeZone12, locale36);
        int int39 = timeZone12.getRawOffset();
        int int41 = timeZone12.getOffset(1645514154223L);
        java.util.TimeZone timeZone42 = java.util.TimeZone.getDefault();
        java.util.Locale locale43 = java.util.Locale.US;
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(timeZone42, locale43);
        boolean boolean45 = timeZone12.hasSameRules(timeZone42);
        java.util.Calendar.Builder builder46 = builder10.setTimeZone(timeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar38 and calendar44", (calendar38.compareTo(calendar44) == 0) == calendar38.equals(calendar44));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 26176);
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes((long) 54);
        org.joda.time.Minutes minutes4 = duration3.toStandardMinutes();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = dateTime5.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant8 = dateTime7.toInstant();
        org.joda.time.MutableDateTime mutableDateTime9 = instant8.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology12.hourOfHalfday();
        org.joda.time.DurationField durationField14 = durationFieldType10.getField(chronology12);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((java.lang.Object) instant8, chronology12);
        org.joda.time.Instant instant18 = instant8.withDurationAdded(1645514154223L, 100);
        org.joda.time.Interval interval19 = duration3.toIntervalTo((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Duration duration20 = period1.toDurationFrom((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Period period22 = period1.withWeeks(26181277);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant8", (dateTime7.compareTo(instant8) == 0) == dateTime7.equals(instant8));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(10L, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.weekyear();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusSeconds(3);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths(74);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate11 = localDate9.withCenturyOfEra(382);
        org.joda.time.LocalDate localDate13 = localDate11.plusDays((int) (byte) 10);
        int int14 = localDate11.getMonthOfYear();
        java.lang.Character[] charArray18 = new java.lang.Character[] { '#', ' ', '4' };
        java.util.LinkedHashSet<java.lang.Character> charSet19 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet19, charArray18);
        boolean boolean22 = charSet19.add((java.lang.Character) ' ');
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate25 = localDate23.withCenturyOfEra(382);
        org.joda.time.LocalDate localDate27 = localDate25.plusDays((int) (byte) 10);
        org.joda.time.Interval interval28 = localDate27.toInterval();
        org.joda.time.LocalDate localDate30 = localDate27.withYear(38270);
        boolean boolean31 = charSet19.contains((java.lang.Object) localDate27);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int33 = localDate27.get(dateTimeFieldType32);
        int int34 = localDate11.get(dateTimeFieldType32);
        int int35 = localDate11.getDayOfYear();
        org.joda.time.Chronology chronology36 = localDate11.getChronology();
        org.joda.time.DateTime dateTime37 = dateTime2.toDateTime(chronology36);
        org.joda.time.DurationField durationField38 = chronology36.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime37", (dateTime2.compareTo(dateTime37) == 0) == dateTime2.equals(dateTime37));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) 54);
        org.joda.time.Minutes minutes2 = duration1.toStandardMinutes();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant6 = dateTime5.toInstant();
        org.joda.time.MutableDateTime mutableDateTime7 = instant6.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.hourOfHalfday();
        org.joda.time.DurationField durationField12 = durationFieldType8.getField(chronology10);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((java.lang.Object) instant6, chronology10);
        org.joda.time.Instant instant16 = instant6.withDurationAdded(1645514154223L, 100);
        org.joda.time.Interval interval17 = duration1.toIntervalTo((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Instant instant20 = instant6.withDurationAdded(830200320000000L, 1097);
        org.joda.time.DateTime dateTime21 = instant6.toDateTimeISO();
        org.joda.time.Instant instant23 = instant6.minus(2267033150282738L);
        org.joda.time.Instant instant24 = instant23.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant6", (dateTime5.compareTo(instant6) == 0) == dateTime5.equals(instant6));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant12 = instant3.plus(1645514151873L);
        org.joda.time.DateTime dateTime13 = instant3.toDateTime();
        org.joda.time.DateTime dateTime14 = instant3.toDateTime();
        long long15 = org.joda.time.DateTimeUtils.getInstantMillis((org.joda.time.ReadableInstant) dateTime14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant13 = instant3.withDurationAdded(1645514154223L, 100);
        org.joda.time.DateTime dateTime14 = instant13.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) 54);
        org.joda.time.Minutes minutes6 = duration5.toStandardMinutes();
        long long7 = duration5.getStandardMinutes();
        org.joda.time.Instant instant9 = instant3.withDurationAdded((org.joda.time.ReadableDuration) duration5, 26171);
        org.joda.time.Duration duration12 = new org.joda.time.Duration((long) 453, (long) 10022);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardMinutes((long) 54);
        org.joda.time.Minutes minutes15 = duration14.toStandardMinutes();
        org.joda.time.Duration duration16 = duration12.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Chronology chronology21 = org.joda.time.DateTimeUtils.getChronology(chronology20);
        org.joda.time.DateTimeField dateTimeField22 = chronology21.hourOfHalfday();
        org.joda.time.DateTime dateTime23 = dateTime17.toDateTime(chronology21);
        org.joda.time.DateTime.Property property24 = dateTime17.monthOfYear();
        org.joda.time.DateTime dateTime26 = dateTime17.plusMonths(38);
        java.lang.Object obj27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property29 = dateTime28.millisOfDay();
        org.joda.time.DateTime dateTime30 = dateTime28.withTimeAtStartOfDay();
        org.joda.time.Period period32 = new org.joda.time.Period((long) '#');
        int int34 = period32.getValue(0);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime();
        org.joda.time.Interval interval37 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Duration duration38 = period32.toDurationTo((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.millisOfDay();
        org.joda.time.Period period41 = new org.joda.time.Period(obj27, chronology39);
        org.joda.time.Period period43 = period41.withMonths(474);
        org.joda.time.Period period44 = period41.toPeriod();
        org.joda.time.Period period46 = period41.withDays(52);
        org.joda.time.Period period47 = period41.toPeriod();
        org.joda.time.Period period49 = period47.withHours((-292275054));
        org.joda.time.Period period50 = period47.toPeriod();
        org.joda.time.DateTime dateTime52 = dateTime26.withPeriodAdded((org.joda.time.ReadablePeriod) period47, 0);
        org.joda.time.Interval interval53 = duration14.toIntervalFrom((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Instant instant54 = instant9.plus((org.joda.time.ReadableDuration) duration14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Duration duration6 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        int int10 = dateTime7.getMinuteOfDay();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime13 = dateTime7.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime7.toDateTime(chronology14);
        org.joda.time.DateTime dateTime17 = dateTime7.minus((long) 10);
        org.joda.time.Period period18 = duration6.toPeriodFrom((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property20 = dateTime19.era();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.plusWeeks((int) (byte) 1);
        int int24 = property20.compareTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime26);
        boolean boolean29 = interval27.isAfter((long) 10);
        org.joda.time.Duration duration30 = interval27.toDuration();
        org.joda.time.Duration duration33 = duration30.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableDuration) duration33);
        org.joda.time.Duration duration36 = duration6.withDurationAdded((org.joda.time.ReadableDuration) duration33, 26160257);
        org.joda.time.Instant instant37 = instant3.plus((org.joda.time.ReadableDuration) duration33);
        org.joda.time.DateTime dateTime38 = instant3.toDateTime();
        org.joda.time.Instant instant39 = new org.joda.time.Instant();
        int int40 = instant3.compareTo((org.joda.time.ReadableInstant) instant39);
        org.joda.time.DateTime dateTime41 = instant39.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getWeekOfWeekyear();
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getInstantChronology((org.joda.time.ReadableInstant) dateTime0);
        int int7 = dateTime0.getWeekOfWeekyear();
        org.joda.time.Instant instant8 = dateTime0.toInstant();
        org.joda.time.DateTime dateTime9 = instant8.toDateTime();
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant8", (dateTime0.compareTo(instant8) == 0) == dateTime0.equals(instant8));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.DateTimeField dateTimeField11 = chronology7.minuteOfDay();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime13);
        int int15 = dateTime12.getMinuteOfDay();
        int int16 = dateTime12.getYearOfCentury();
        int int17 = dateTime12.getDayOfMonth();
        org.joda.time.DateTime dateTime19 = dateTime12.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property20 = dateTime19.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField21 = property20.getField();
        int int22 = dateTimeField21.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusWeeks((int) (byte) 10);
        org.joda.time.Period period27 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationFrom(readableInstant28);
        long long30 = duration29.getMillis();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.plus((org.joda.time.ReadableDuration) duration29);
        java.util.Locale locale33 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str34 = dateTimeField21.getAsText((org.joda.time.ReadablePartial) localDateTime25, (int) (short) 1, locale33);
        org.joda.time.ReadablePartial readablePartial35 = null;
        int int36 = dateTimeField21.getMaximumValue(readablePartial35);
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = localDateTime37.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime37.plusYears(26151451);
        org.joda.time.Period period43 = new org.joda.time.Period((long) '#');
        int int45 = period43.getValue(0);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime();
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime46, (org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Duration duration49 = period43.toDurationTo((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime41.withPeriodAdded((org.joda.time.ReadablePeriod) period43, 0);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((long) (-1), chronology53);
        org.joda.time.Period period55 = period54.toPeriod();
        int int56 = period55.size();
        int int57 = period55.getMinutes();
        int[] intArray58 = period55.getValues();
        int int59 = dateTimeField21.getMinimumValue((org.joda.time.ReadablePartial) localDateTime51, intArray58);
        java.util.Locale locale62 = new java.util.Locale("2022-02-22T07:16:06.916Z/2022-02-22T07:16:06.916Z", "millisOfDay");
        java.util.Set<java.lang.Character> charSet63 = locale62.getExtensionKeys();
        int int64 = dateTimeField21.getMaximumShortTextLength(locale62);
        long long66 = dateTimeField21.roundHalfFloor((long) 873);
        java.util.Locale locale67 = java.util.Locale.PRC;
        java.util.Locale locale68 = java.util.Locale.getDefault();
        java.lang.String str69 = locale67.getDisplayScript(locale68);
        java.lang.String str70 = locale68.getDisplayName();
        int int71 = dateTimeField21.getMaximumShortTextLength(locale68);
        int int72 = dateTimeField11.getMaximumShortTextLength(locale68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        int int8 = dateTime0.getYear();
        org.joda.time.DateTime dateTime10 = dateTime0.minusYears((int) (byte) 1);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeParser dateTimeParser12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser12);
        org.joda.time.Chronology chronology14 = dateTimeFormatter13.getChronolgy();
        java.util.Locale locale15 = java.util.Locale.getDefault();
        java.lang.String str16 = locale15.getDisplayVariant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter13.withLocale(locale15);
        boolean boolean18 = dateTimeFormatter13.isPrinter();
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType23 = periodType22.withSecondsRemoved();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.Interval interval26 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Chronology chronology28 = org.joda.time.DateTimeUtils.getChronology(chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology28.hourOfHalfday();
        org.joda.time.DateTime dateTime30 = dateTime24.toDateTime(chronology28);
        org.joda.time.Period period31 = new org.joda.time.Period((long) 1, (long) ' ', periodType23, chronology28);
        org.joda.time.DurationField durationField32 = chronology28.millis();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(1645514189812L, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter13.withChronology(chronology28);
        org.joda.time.Chronology chronology35 = dateTimeFormatter13.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter13.withZoneUTC();
        boolean boolean37 = dateTimeFormatter36.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone38 = dateTimeFormatter36.getZone();
        org.joda.time.DateTime dateTime39 = dateTime10.toDateTime(dateTimeZone38);
        java.lang.String str41 = dateTimeZone38.getNameKey((-86399895L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime39", (dateTime10.compareTo(dateTime39) == 0) == dateTime10.equals(dateTime39));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.LocalTime localTime4 = localTime2.withFields(readablePartial3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology6);
        int int8 = localTime7.getSecondOfMinute();
        org.joda.time.Period period9 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime2, (org.joda.time.ReadablePartial) localTime7);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.Period period11 = period9.plus(readablePeriod10);
        org.joda.time.Period period13 = period9.withSeconds(53);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime16 = dateTime14.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant17 = dateTime16.toInstant();
        org.joda.time.Duration duration18 = period9.toDurationTo((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Minutes minutes19 = period9.toStandardMinutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant17", (dateTime16.compareTo(instant17) == 0) == dateTime16.equals(instant17));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.millisOfDay();
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.lang.String str4 = property1.getAsText(locale2);
        org.joda.time.DateTime dateTime5 = property1.withMinimumValue();
        org.joda.time.DateTime dateTime7 = property1.setCopy((int) 'a');
        org.joda.time.DateTime dateTime9 = dateTime7.plusDays(10);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        long long12 = dateTimeZone10.convertUTCToLocal((long) 1970);
        long long14 = dateTimeZone10.nextTransition(1645514182234L);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone10);
        boolean boolean16 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime18 = dateTime9.withYear(792);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime15", (dateTime0.compareTo(dateTime15) == 0) == dateTime0.equals(dateTime15));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        java.lang.String str3 = interval2.toString();
        org.joda.time.DateTime dateTime4 = interval2.getEnd();
        java.lang.String str5 = interval2.toString();
        org.joda.time.Interval interval6 = interval2.toInterval();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant10 = dateTime9.toInstant();
        org.joda.time.DateTime dateTime11 = instant10.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime12 = instant10.toMutableDateTimeISO();
        boolean boolean14 = instant10.isAfter((long) 710);
        boolean boolean15 = interval2.contains((org.joda.time.ReadableInstant) instant10);
        org.joda.time.ReadableInterval readableInterval16 = org.joda.time.DateTimeUtils.getReadableInterval((org.joda.time.ReadableInterval) interval2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant10", (dateTime9.compareTo(instant10) == 0) == dateTime9.equals(instant10));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.hourOfHalfday();
        org.joda.time.DateTime dateTime6 = dateTime0.toDateTime(chronology4);
        org.joda.time.DurationField durationField7 = chronology4.millis();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology4);
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.DateTime.Property property10 = dateTime8.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant9", (dateTime0.compareTo(instant9) == 0) == dateTime0.equals(instant9));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.joda.time.Period period1 = new org.joda.time.Period((long) '#');
        int int3 = period1.getValue(0);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Duration duration7 = period1.toDurationTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime.Property property8 = dateTime5.yearOfEra();
        org.joda.time.DateTime dateTime10 = dateTime5.minusMonths((-463503));
        org.joda.time.DateTime dateTime12 = dateTime5.minusMonths(100);
        int int13 = dateTime5.getDayOfWeek();
        org.joda.time.DateTime dateTime15 = dateTime5.plus(3291028496191L);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(26201588);
        boolean boolean19 = dateTimeZone17.isStandardOffset((long) 4044);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime5.toMutableDateTime(dateTimeZone17);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime5, readableDuration21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and mutableDateTime20", (dateTime4.compareTo(mutableDateTime20) == 0) == dateTime4.equals(mutableDateTime20));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Instant instant7 = instant3.withDurationAdded((-1L), 21);
        org.joda.time.Chronology chronology8 = instant7.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        org.joda.time.DateTime.Property property5 = dateTime0.year();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime dateTime7 = dateTime6.withEarlierOffsetAtOverlap();
        org.joda.time.Instant instant8 = dateTime7.toInstant();
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationFrom(readableInstant11);
        org.joda.time.Seconds seconds13 = duration12.toStandardSeconds();
        org.joda.time.DateTime dateTime14 = dateTime7.plus((org.joda.time.ReadablePeriod) seconds13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant8", (dateTime14.compareTo(instant8) == 0) == dateTime14.equals(instant8));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        int int5 = dateTime2.getMinuteOfDay();
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = dateTime2.toDateTime(chronology9);
        org.joda.time.DateTime dateTime12 = dateTime2.minus((long) 10);
        org.joda.time.Period period13 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property15 = dateTime14.era();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.plusWeeks((int) (byte) 1);
        int int19 = property15.compareTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) dateTime21);
        boolean boolean24 = interval22.isAfter((long) 10);
        org.joda.time.Duration duration25 = interval22.toDuration();
        org.joda.time.Duration duration28 = duration25.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval29 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableDuration) duration28);
        org.joda.time.Duration duration31 = duration1.withDurationAdded((org.joda.time.ReadableDuration) duration28, 26160257);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime33);
        int int35 = dateTime32.getMinuteOfDay();
        int int36 = dateTime32.getYearOfCentury();
        int int37 = dateTime32.getDayOfMonth();
        org.joda.time.DateTime dateTime39 = dateTime32.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property40 = dateTime39.minuteOfDay();
        int int41 = dateTime39.getYear();
        int int42 = dateTime39.getEra();
        org.joda.time.DateTime dateTime44 = dateTime39.withYearOfCentury(21);
        org.joda.time.PeriodType periodType45 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType46 = periodType45.withDaysRemoved();
        org.joda.time.PeriodType periodType47 = periodType45.withDaysRemoved();
        org.joda.time.PeriodType periodType48 = periodType45.withMinutesRemoved();
        org.joda.time.Period period49 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateTime39, periodType45);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime52 = dateTime50.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant53 = dateTime52.toInstant();
        org.joda.time.MutableDateTime mutableDateTime54 = instant53.toMutableDateTimeISO();
        org.joda.time.Instant instant57 = instant53.withDurationAdded((-1L), 21);
        org.joda.time.DurationFieldType durationFieldType58 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.Chronology chronology60 = org.joda.time.DateTimeUtils.getChronology(chronology59);
        org.joda.time.DateTimeField dateTimeField61 = chronology60.hourOfHalfday();
        org.joda.time.DurationField durationField62 = durationFieldType58.getField(chronology60);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.Chronology chronology64 = org.joda.time.DateTimeUtils.getChronology(chronology63);
        boolean boolean65 = durationFieldType58.isSupported(chronology64);
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(chronology64);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.withMillisOfDay((int) ' ');
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = localDateTime69.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime69.plusYears(26151451);
        boolean boolean74 = localDateTime68.isAfter((org.joda.time.ReadablePartial) localDateTime69);
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime77 = localDateTime75.minusWeeks((int) (byte) 10);
        org.joda.time.Period period79 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant80 = null;
        org.joda.time.Duration duration81 = period79.toDurationFrom(readableInstant80);
        long long82 = duration81.getMillis();
        org.joda.time.LocalDateTime localDateTime83 = localDateTime77.plus((org.joda.time.ReadableDuration) duration81);
        org.joda.time.Duration duration85 = duration81.minus((long) 38222);
        org.joda.time.LocalDateTime localDateTime86 = localDateTime68.plus((org.joda.time.ReadableDuration) duration85);
        org.joda.time.Instant instant88 = instant53.withDurationAdded((org.joda.time.ReadableDuration) duration85, 175);
        org.joda.time.Period period89 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime39, (org.joda.time.ReadableInstant) instant88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant53", (dateTime18.compareTo(instant53) == 0) == dateTime18.equals(instant53));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withFieldAdded(durationFieldType2, 1970);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime10 = interval9.getEnd();
        org.joda.time.Interval interval11 = interval9.toInterval();
        long long12 = interval9.getEndMillis();
        java.lang.String str13 = interval9.toString();
        org.joda.time.DateTime dateTime14 = interval9.getStart();
        org.joda.time.Chronology chronology15 = interval9.getChronology();
        org.joda.time.Period period16 = new org.joda.time.Period(0L, 1645514152681L, chronology15);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime4.minus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusDays(100);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours((int) 'a');
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.plus((org.joda.time.ReadableDuration) duration23);
        long long25 = duration23.getStandardHours();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime28 = dateTime26.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant29 = dateTime28.toInstant();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = localDateTime30.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.plusYears(26151451);
        org.joda.time.Period period36 = new org.joda.time.Period((long) '#');
        int int38 = period36.getValue(0);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime();
        org.joda.time.Interval interval41 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime39, (org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.Duration duration42 = period36.toDurationTo((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime34.withPeriodAdded((org.joda.time.ReadablePeriod) period36, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean46 = localDateTime34.isSupported(dateTimeFieldType45);
        int int47 = instant29.get(dateTimeFieldType45);
        org.joda.time.Duration duration49 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime();
        org.joda.time.Interval interval52 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime50, (org.joda.time.ReadableInstant) dateTime51);
        int int53 = dateTime50.getMinuteOfDay();
        org.joda.time.Period period55 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime56 = dateTime50.plus((org.joda.time.ReadablePeriod) period55);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = dateTime50.toDateTime(chronology57);
        org.joda.time.DateTime dateTime60 = dateTime50.minus((long) 10);
        org.joda.time.Period period61 = duration49.toPeriodFrom((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.Instant instant62 = instant29.plus((org.joda.time.ReadableDuration) duration49);
        boolean boolean63 = duration23.isLongerThan((org.joda.time.ReadableDuration) duration49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and instant29", (dateTime28.compareTo(instant29) == 0) == dateTime28.equals(instant29));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getWeekOfWeekyear();
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getInstantChronology((org.joda.time.ReadableInstant) dateTime0);
        int int7 = dateTime0.getWeekOfWeekyear();
        org.joda.time.Instant instant8 = dateTime0.toInstant();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimeParser dateTimeParser10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser10);
        org.joda.time.Chronology chronology12 = dateTimeFormatter11.getChronolgy();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate15 = localDate13.withCenturyOfEra(382);
        org.joda.time.LocalDate localDate17 = localDate13.minusYears((int) '#');
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeUtils.getZone(dateTimeZone18);
        java.lang.String str21 = dateTimeZone19.getName((long) ' ');
        org.joda.time.Interval interval22 = localDate13.toInterval(dateTimeZone19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter11.withZone(dateTimeZone19);
        org.joda.time.format.DateTimeParser dateTimeParser24 = dateTimeFormatter23.getParser();
        org.joda.time.format.DateTimeParser dateTimeParser25 = dateTimeFormatter23.getParser();
        org.joda.time.Chronology chronology26 = dateTimeFormatter23.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter23.withDefaultYear(2787);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate31 = localDate29.withCenturyOfEra(100);
        int int32 = localDate29.getEra();
        org.joda.time.LocalDate.Property property33 = localDate29.year();
        org.joda.time.LocalDate localDate34 = property33.getLocalDate();
        org.joda.time.format.DateTimePrinter dateTimePrinter35 = null;
        org.joda.time.format.DateTimeParser dateTimeParser36 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter35, dateTimeParser36);
        org.joda.time.Chronology chronology38 = dateTimeFormatter37.getChronolgy();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime();
        org.joda.time.Interval interval41 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime39, (org.joda.time.ReadableInstant) dateTime40);
        int int42 = dateTime39.getMinuteOfDay();
        org.joda.time.Period period44 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime45 = dateTime39.plus((org.joda.time.ReadablePeriod) period44);
        org.joda.time.DateTime dateTime47 = dateTime45.withDayOfYear((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone48 = dateTime45.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter37.withZone(dateTimeZone48);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.Chronology chronology52 = org.joda.time.DateTimeUtils.getChronology(chronology51);
        org.joda.time.DurationField durationField53 = chronology52.years();
        org.joda.time.DateTimeField dateTimeField54 = chronology52.centuryOfEra();
        java.util.Locale locale56 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet57 = locale56.getExtensionKeys();
        java.lang.String str58 = dateTimeField54.getAsText((int) (byte) 0, locale56);
        java.lang.String str59 = dateTimeZone48.getName(1645514178829L, locale56);
        org.joda.time.DateMidnight dateMidnight60 = localDate34.toDateMidnight(dateTimeZone48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = dateTimeFormatter23.withZone(dateTimeZone48);
        org.joda.time.DateTime dateTime62 = dateTime0.withZone(dateTimeZone48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant8", (dateTime1.compareTo(instant8) == 0) == dateTime1.equals(instant8));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant13 = instant3.withDurationAdded(1645514154223L, 100);
        long long14 = instant3.getMillis();
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getInstantChronology((org.joda.time.ReadableInstant) instant3);
        org.joda.time.Instant instant16 = instant3.toInstant();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) instant3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getWeekOfWeekyear();
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getInstantChronology((org.joda.time.ReadableInstant) dateTime0);
        int int7 = dateTime0.getWeekOfWeekyear();
        org.joda.time.Instant instant8 = dateTime0.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime0.plusWeeks(26198934);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant8", (dateTime1.compareTo(instant8) == 0) == dateTime1.equals(instant8));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.lang.String str2 = locale1.getDisplayScript();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.hourOfHalfday();
        int int7 = dateTimeField5.getLeapAmount((long) 26151451);
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
        int int10 = dateTimeField5.getMaximumShortTextLength(locale9);
        java.lang.String str11 = locale1.getDisplayCountry(locale9);
        java.lang.String str12 = locale1.getISO3Language();
        java.util.Calendar.Builder builder13 = builder0.setLocale(locale1);
        java.util.Calendar.Builder builder17 = builder0.setDate(20, 26160257, 16);
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(locale18);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(10L, chronology22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekyear();
        int int25 = dateTime23.get(dateTimeFieldType24);
        boolean boolean26 = localTime20.isSupported(dateTimeFieldType24);
        org.joda.time.LocalTime.Property property27 = localTime20.minuteOfHour();
        org.joda.time.LocalTime localTime28 = property27.withMaximumValue();
        org.joda.time.LocalTime localTime29 = property27.roundHalfCeilingCopy();
        boolean boolean30 = calendar19.after((java.lang.Object) property27);
        java.util.TimeZone timeZone32 = java.util.TimeZone.getTimeZone("zh_TW");
        java.time.ZoneId zoneId33 = timeZone32.toZoneId();
        int int34 = timeZone32.getRawOffset();
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(timeZone32);
        calendar19.setTimeZone(timeZone32);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property38 = dateTime37.era();
        org.joda.time.DateTime.Property property39 = dateTime37.weekyear();
        org.joda.time.DateTime dateTime41 = property39.setCopy(453);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeUtils.getZone(dateTimeZone42);
        java.lang.String str45 = dateTimeZone43.getName((long) ' ');
        java.lang.String str47 = dateTimeZone43.getName((long) (short) -1);
        org.joda.time.DateTime dateTime48 = dateTime41.withZoneRetainFields(dateTimeZone43);
        java.util.TimeZone timeZone49 = dateTimeZone43.toTimeZone();
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime();
        org.joda.time.Interval interval52 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime50, (org.joda.time.ReadableInstant) dateTime51);
        int int53 = dateTime50.getMinuteOfDay();
        int int54 = dateTime50.getYearOfCentury();
        int int55 = dateTime50.getDayOfMonth();
        org.joda.time.DateTime dateTime57 = dateTime50.minusWeeks((int) (short) 0);
        int int58 = dateTime50.getYear();
        java.util.Locale.Builder builder59 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder60 = builder59.clearExtensions();
        java.util.Locale.Builder builder61 = builder60.clearExtensions();
        java.util.Locale locale62 = builder61.build();
        java.util.Calendar calendar63 = dateTime50.toCalendar(locale62);
        java.util.Locale.setDefault(locale62);
        java.util.Calendar calendar65 = java.util.Calendar.getInstance(timeZone49, locale62);
        calendar19.setTimeZone(timeZone49);
        java.util.Calendar.Builder builder67 = builder0.setTimeZone(timeZone49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar19 and calendar35", (calendar19.compareTo(calendar35) == 0) == calendar19.equals(calendar35));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.era();
        org.joda.time.DateTime.Property property2 = dateTime0.weekyear();
        org.joda.time.DateTime dateTime4 = property2.setCopy(453);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        java.lang.String str8 = dateTimeZone6.getName((long) ' ');
        java.lang.String str10 = dateTimeZone6.getName((long) (short) -1);
        org.joda.time.DateTime dateTime11 = dateTime4.withZoneRetainFields(dateTimeZone6);
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(22);
        int int14 = dateTime11.getHourOfDay();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime17 = dateTime15.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant18 = dateTime17.toInstant();
        org.joda.time.MutableDateTime mutableDateTime19 = instant18.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Chronology chronology22 = org.joda.time.DateTimeUtils.getChronology(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology22.hourOfHalfday();
        org.joda.time.DurationField durationField24 = durationFieldType20.getField(chronology22);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((java.lang.Object) instant18, chronology22);
        org.joda.time.Instant instant28 = instant18.withDurationAdded(1645514154223L, 100);
        long long29 = instant18.getMillis();
        org.joda.time.Chronology chronology30 = instant18.getChronology();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime32);
        int int34 = dateTime31.getMinuteOfDay();
        org.joda.time.Period period36 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime37 = dateTime31.plus((org.joda.time.ReadablePeriod) period36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = dateTime31.toDateTime(chronology38);
        org.joda.time.DateTime dateTime41 = dateTime31.minus((long) 10);
        org.joda.time.DateTime.Property property42 = dateTime41.centuryOfEra();
        org.joda.time.DateTime dateTime44 = dateTime41.minusHours(0);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime();
        org.joda.time.Interval interval47 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime45, (org.joda.time.ReadableInstant) dateTime46);
        int int48 = dateTime45.getMinuteOfDay();
        org.joda.time.Period period50 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime51 = dateTime45.plus((org.joda.time.ReadablePeriod) period50);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.lang.String str53 = dateTimeFieldType52.toString();
        int int54 = dateTime51.get(dateTimeFieldType52);
        int int55 = dateTime41.get(dateTimeFieldType52);
        boolean boolean56 = instant18.isSupported(dateTimeFieldType52);
        int int57 = dateTime11.get(dateTimeFieldType52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and instant18", (dateTime17.compareTo(instant18) == 0) == dateTime17.equals(instant18));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType4 = periodType3.withSecondsRemoved();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology9.hourOfHalfday();
        org.joda.time.DateTime dateTime11 = dateTime5.toDateTime(chronology9);
        org.joda.time.Period period12 = new org.joda.time.Period((long) 1, (long) ' ', periodType4, chronology9);
        org.joda.time.DateTimeField dateTimeField13 = chronology9.yearOfEra();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(0L);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime18);
        int int20 = dateTime17.getMinuteOfDay();
        int int21 = dateTime17.getYearOfCentury();
        int int22 = dateTime17.getDayOfMonth();
        org.joda.time.DateTime dateTime24 = dateTime17.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property25 = dateTime24.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField26 = property25.getField();
        int int27 = dateTimeField26.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusWeeks((int) (byte) 10);
        org.joda.time.Period period32 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = period32.toDurationFrom(readableInstant33);
        long long35 = duration34.getMillis();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.plus((org.joda.time.ReadableDuration) duration34);
        java.util.Locale locale38 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str39 = dateTimeField26.getAsText((org.joda.time.ReadablePartial) localDateTime30, (int) (short) 1, locale38);
        org.joda.time.ReadablePartial readablePartial40 = null;
        int int41 = dateTimeField26.getMaximumValue(readablePartial40);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = localDateTime42.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.plusYears(26151451);
        org.joda.time.Period period48 = new org.joda.time.Period((long) '#');
        int int50 = period48.getValue(0);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime();
        org.joda.time.Interval interval53 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime51, (org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.Duration duration54 = period48.toDurationTo((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime46.withPeriodAdded((org.joda.time.ReadablePeriod) period48, 0);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period((long) (-1), chronology58);
        org.joda.time.Period period60 = period59.toPeriod();
        int int61 = period60.size();
        int int62 = period60.getMinutes();
        int[] intArray63 = period60.getValues();
        int int64 = dateTimeField26.getMinimumValue((org.joda.time.ReadablePartial) localDateTime56, intArray63);
        int[] intArray66 = dateTimeField13.addWrapPartial((org.joda.time.ReadablePartial) localDateTime15, 6, intArray63, 0);
        java.util.Calendar.Builder builder67 = builder0.setFields(intArray66);
        java.util.TimeZone timeZone69 = java.util.TimeZone.getTimeZone("\u706b\u66dc\u65e5");
        java.util.Calendar.Builder builder70 = builder0.setTimeZone(timeZone69);
        java.util.Locale.Category category71 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale72 = java.util.Locale.getDefault();
        java.util.Calendar calendar73 = java.util.Calendar.getInstance(locale72);
        java.util.Locale.setDefault(category71, locale72);
        java.util.Locale locale75 = java.util.Locale.getDefault(category71);
        java.util.Calendar calendar76 = java.util.Calendar.getInstance(timeZone69, locale75);
        int int77 = timeZone69.getRawOffset();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar73 and calendar76", (calendar73.compareTo(calendar76) == 0) == calendar73.equals(calendar76));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        int int5 = dateTime2.getMinuteOfDay();
        int int6 = dateTime2.getYearOfCentury();
        int int7 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime9 = dateTime2.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = property10.getField();
        int int12 = dateTimeField11.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusWeeks((int) (byte) 10);
        org.joda.time.Period period17 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period17.toDurationFrom(readableInstant18);
        long long20 = duration19.getMillis();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.plus((org.joda.time.ReadableDuration) duration19);
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str24 = dateTimeField11.getAsText((org.joda.time.ReadablePartial) localDateTime15, (int) (short) 1, locale23);
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = locale23.getDisplayLanguage(locale25);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone1, locale25);
        int int28 = timeZone1.getRawOffset();
        int int30 = timeZone1.getOffset(1645514154223L);
        java.util.TimeZone timeZone31 = java.util.TimeZone.getDefault();
        java.util.Locale locale32 = java.util.Locale.US;
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone31, locale32);
        boolean boolean34 = timeZone1.hasSameRules(timeZone31);
        boolean boolean35 = timeZone31.observesDaylightTime();
        int int37 = timeZone31.getOffset(0L);
        int int38 = timeZone31.getDSTSavings();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar27 and calendar33", (calendar27.compareTo(calendar33) == 0) == calendar27.equals(calendar33));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) 54);
        org.joda.time.Minutes minutes2 = duration1.toStandardMinutes();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant6 = dateTime5.toInstant();
        org.joda.time.MutableDateTime mutableDateTime7 = instant6.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.hourOfHalfday();
        org.joda.time.DurationField durationField12 = durationFieldType8.getField(chronology10);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((java.lang.Object) instant6, chronology10);
        org.joda.time.Instant instant16 = instant6.withDurationAdded(1645514154223L, 100);
        org.joda.time.Interval interval17 = duration1.toIntervalTo((org.joda.time.ReadableInstant) instant6);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.Interval interval20 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) dateTime19);
        int int21 = dateTime18.getMinuteOfDay();
        org.joda.time.Period period23 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime24 = dateTime18.plus((org.joda.time.ReadablePeriod) period23);
        int int25 = dateTime18.getSecondOfMinute();
        org.joda.time.DateTime dateTime26 = dateTime18.toDateTimeISO();
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusWeeks((int) (byte) 10);
        org.joda.time.Period period32 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = period32.toDurationFrom(readableInstant33);
        long long35 = duration34.getMillis();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.plus((org.joda.time.ReadableDuration) duration34);
        mutableInterval27.setDurationAfterStart((org.joda.time.ReadableDuration) duration34);
        org.joda.time.Duration duration38 = mutableInterval27.toDuration();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.minusWeeks((int) (byte) 10);
        org.joda.time.Period period43 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = period43.toDurationFrom(readableInstant44);
        long long46 = duration45.getMillis();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime41.plus((org.joda.time.ReadableDuration) duration45);
        long long48 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration45);
        boolean boolean49 = duration38.isShorterThan((org.joda.time.ReadableDuration) duration45);
        org.joda.time.Interval interval50 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableDuration) duration45);
        org.joda.time.DateTime dateTime52 = dateTime26.minusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone53 = dateTime52.getZone();
        java.util.GregorianCalendar gregorianCalendar54 = dateTime52.toGregorianCalendar();
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateTime52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant6", (dateTime5.compareTo(instant6) == 0) == dateTime5.equals(instant6));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime6 = dateTime0.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = dateTime0.toDateTime(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime0.minus((long) 10);
        org.joda.time.DateTime dateTime12 = dateTime0.minusHours(7);
        org.joda.time.DateTime.Property property13 = dateTime0.dayOfWeek();
        org.joda.time.DateTime dateTime14 = property13.withMinimumValue();
        org.joda.time.DateTime dateTime15 = property13.roundCeilingCopy();
        org.joda.time.DateTime dateTime17 = dateTime15.plusMinutes(122);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'u');
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.Period period22 = new org.joda.time.Period((long) '#');
        int int24 = period22.getValue(0);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Duration duration28 = period22.toDurationTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Period period30 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period30.toDurationFrom(readableInstant31);
        org.joda.time.Seconds seconds33 = duration32.toStandardSeconds();
        boolean boolean34 = duration28.isEqual((org.joda.time.ReadableDuration) duration32);
        long long35 = duration28.getStandardDays();
        org.joda.time.DateTime dateTime37 = dateTime20.withDurationAdded((org.joda.time.ReadableDuration) duration28, 2782);
        boolean boolean38 = dateTime15.isBefore((org.joda.time.ReadableInstant) dateTime37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime20", (dateTime0.compareTo(dateTime20) == 0) == dateTime0.equals(dateTime20));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        long long2 = calendar1.getTimeInMillis();
        long long3 = calendar1.getTimeInMillis();
        int int5 = calendar1.getMinimum(0);
        org.joda.time.Duration duration7 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology9.hourOfHalfday();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(chronology9);
        org.joda.time.Period period12 = duration7.toPeriod(chronology9);
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.now(chronology9);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.now(chronology9);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeUtils.getZone(dateTimeZone15);
        boolean boolean18 = dateTimeZone16.equals((java.lang.Object) 1645514161708L);
        org.joda.time.Chronology chronology19 = chronology9.withZone(dateTimeZone16);
        boolean boolean20 = calendar1.after((java.lang.Object) chronology9);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(chronology9);
        java.lang.String str22 = localTime21.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        boolean boolean24 = localTime21.isSupported(dateTimeFieldType23);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime27 = localTime25.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial28 = null;
        org.joda.time.LocalTime localTime29 = localTime27.withFields(readablePartial28);
        org.joda.time.Period period31 = new org.joda.time.Period((long) (short) 10);
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.days();
        org.joda.time.Period period33 = period31.normalizedStandard(periodType32);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.hours();
        int int35 = periodType32.indexOf(durationFieldType34);
        boolean boolean36 = localTime29.isSupported(durationFieldType34);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Chronology chronology40 = org.joda.time.DateTimeUtils.getChronology(chronology39);
        org.joda.time.DurationField durationField41 = chronology40.years();
        org.joda.time.DateTimeField dateTimeField42 = chronology40.hourOfDay();
        org.joda.time.Period period43 = new org.joda.time.Period((long) 10074, 1645514199442L, chronology40);
        org.joda.time.DurationField durationField44 = durationFieldType34.getField(chronology40);
        java.lang.String str45 = durationFieldType34.getName();
        boolean boolean46 = localTime21.isSupported(durationFieldType34);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime();
        org.joda.time.Interval interval49 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime47, (org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTime dateTime50 = interval49.getEnd();
        org.joda.time.Interval interval51 = interval49.toInterval();
        long long52 = interval49.getEndMillis();
        org.joda.time.Period period53 = interval49.toPeriod();
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime();
        org.joda.time.Interval interval56 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime54, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.DateTime dateTime57 = interval56.getEnd();
        org.joda.time.Interval interval58 = interval56.toInterval();
        org.joda.time.Interval interval60 = interval58.withStartMillis((long) (short) 1);
        org.joda.time.Chronology chronology61 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInterval) interval60);
        boolean boolean62 = interval49.isAfter((org.joda.time.ReadableInterval) interval60);
        org.joda.time.Chronology chronology63 = interval60.getChronology();
        org.joda.time.DurationField durationField64 = chronology63.weekyears();
        boolean boolean65 = durationFieldType34.isSupported(chronology63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField41 and durationField64", (durationField41.compareTo(durationField64) == 0) == durationField41.equals(durationField64));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property8 = dateTime0.minuteOfHour();
        org.joda.time.DateTime dateTime10 = property8.addToCopy(38270);
        org.joda.time.DateTime dateTime11 = property8.roundFloorCopy();
        org.joda.time.DateTime dateTime12 = property8.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime14);
        int int16 = dateTime13.getMinuteOfDay();
        int int17 = dateTime13.getYearOfCentury();
        int int18 = dateTime13.getDayOfMonth();
        org.joda.time.DateTime dateTime20 = dateTime13.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property21 = dateTime20.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        int int23 = dateTimeField22.getMaximumValue();
        java.lang.String str25 = dateTimeField22.getAsShortText((long) (byte) 1);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime();
        org.joda.time.Interval interval28 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableInstant) dateTime27);
        int int29 = dateTime26.getMinuteOfDay();
        int int30 = dateTime26.getYearOfCentury();
        int int31 = dateTime26.getDayOfMonth();
        org.joda.time.DateTime dateTime33 = dateTime26.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property34 = dateTime33.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField35 = property34.getField();
        org.joda.time.LocalTime localTime36 = org.joda.time.LocalTime.now();
        int int37 = dateTimeField35.getMaximumValue((org.joda.time.ReadablePartial) localTime36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Chronology chronology40 = org.joda.time.DateTimeUtils.getChronology(chronology39);
        org.joda.time.DateTimeField dateTimeField41 = chronology40.hourOfHalfday();
        java.util.Locale locale44 = java.util.Locale.forLanguageTag("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
        java.lang.String str45 = dateTimeField41.getAsShortText(1645514151873L, locale44);
        java.lang.String str46 = dateTimeField22.getAsText((org.joda.time.ReadablePartial) localTime36, 0, locale44);
        org.joda.time.Period period48 = new org.joda.time.Period((long) '#');
        int int50 = period48.getValue(0);
        org.joda.time.Period period52 = period48.plusWeeks(1969);
        org.joda.time.LocalTime localTime54 = localTime36.withPeriodAdded((org.joda.time.ReadablePeriod) period48, (int) (byte) 100);
        org.joda.time.Chronology chronology55 = localTime36.getChronology();
        org.joda.time.DurationField durationField56 = chronology55.months();
        org.joda.time.DateTimeField dateTimeField57 = chronology55.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime58 = dateTime12.toMutableDateTime(chronology55);
        org.joda.time.DurationFieldType durationFieldType61 = org.joda.time.DurationFieldType.eras();
        org.joda.time.Duration duration64 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.Chronology chronology66 = org.joda.time.DateTimeUtils.getChronology(chronology65);
        org.joda.time.DateTimeField dateTimeField67 = chronology66.hourOfHalfday();
        org.joda.time.LocalTime localTime68 = org.joda.time.LocalTime.now(chronology66);
        org.joda.time.Period period69 = duration64.toPeriod(chronology66);
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime(327L, chronology66);
        org.joda.time.DurationField durationField71 = durationFieldType61.getField(chronology66);
        org.joda.time.MutableInterval mutableInterval72 = new org.joda.time.MutableInterval((long) 12, 436L, chronology66);
        org.joda.time.Period period73 = mutableInterval72.toPeriod();
        org.joda.time.Interval interval74 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadablePeriod) period73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField56 and durationField71", Math.signum(durationField56.compareTo(durationField71)) == -Math.signum(durationField71.compareTo(durationField56)));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (-1), chronology2);
        org.joda.time.Period period4 = period3.toPeriod();
        org.joda.time.LocalTime localTime5 = localTime0.minus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(10L, chronology7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        int int10 = dateTime8.get(dateTimeFieldType9);
        boolean boolean11 = localTime5.isSupported(dateTimeFieldType9);
        org.joda.time.Chronology chronology12 = localTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.yearOfCentury();
        org.joda.time.DurationField durationField14 = chronology12.eras();
        org.joda.time.DurationField durationField15 = chronology12.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField15, and durationField14", !(durationField14.compareTo(durationField15) == 0) || (Math.signum(durationField14.compareTo(durationField14)) == Math.signum(durationField15.compareTo(durationField14))));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(10L, chronology2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        int int5 = dateTime3.get(dateTimeFieldType4);
        boolean boolean6 = localTime0.isSupported(dateTimeFieldType4);
        org.joda.time.LocalTime.Property property7 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime8 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime9 = property7.roundCeilingCopy();
        java.lang.String str10 = property7.toString();
        org.joda.time.LocalTime localTime11 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime13 = localTime11.plusSeconds(304);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType14.getRangeDurationType();
        boolean boolean16 = localTime13.isSupported(dateTimeFieldType14);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) (-1), chronology18);
        org.joda.time.Period period20 = period19.toPeriod();
        int int21 = period20.size();
        int int22 = period20.getMinutes();
        int[] intArray23 = period20.getValues();
        org.joda.time.Period period25 = period20.withMonths(26155103);
        org.joda.time.MutablePeriod mutablePeriod26 = period20.toMutablePeriod();
        org.joda.time.LocalTime localTime27 = localTime13.minus((org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime();
        org.joda.time.Interval interval31 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime30);
        java.lang.String str32 = interval31.toString();
        org.joda.time.DateTime dateTime33 = interval31.getEnd();
        org.joda.time.Chronology chronology34 = interval31.getChronology();
        org.joda.time.DurationField durationField35 = chronology34.seconds();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(0L, chronology34);
        org.joda.time.DurationField durationField37 = chronology34.eras();
        boolean boolean38 = localTime27.equals((java.lang.Object) chronology34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField35 and durationField37", Math.signum(durationField35.compareTo(durationField37)) == -Math.signum(durationField37.compareTo(durationField35)));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(10L, chronology4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekyear();
        int int7 = dateTime5.get(dateTimeFieldType6);
        boolean boolean8 = localTime2.isSupported(dateTimeFieldType6);
        org.joda.time.LocalTime.Property property9 = localTime2.minuteOfHour();
        org.joda.time.LocalTime localTime10 = property9.withMaximumValue();
        org.joda.time.LocalTime localTime11 = property9.roundHalfCeilingCopy();
        boolean boolean12 = calendar1.after((java.lang.Object) property9);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("zh_TW");
        java.time.ZoneId zoneId15 = timeZone14.toZoneId();
        int int16 = timeZone14.getRawOffset();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone14);
        calendar1.setTimeZone(timeZone14);
        java.lang.String str19 = timeZone14.getID();
        int int21 = timeZone14.getOffset((long) 37433962);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar17", (calendar1.compareTo(calendar17) == 0) == calendar1.equals(calendar17));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        int int5 = dateTime2.getMinuteOfDay();
        int int6 = dateTime2.getYearOfCentury();
        int int7 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime9 = dateTime2.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = property10.getField();
        int int12 = dateTimeField11.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusWeeks((int) (byte) 10);
        org.joda.time.Period period17 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period17.toDurationFrom(readableInstant18);
        long long20 = duration19.getMillis();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.plus((org.joda.time.ReadableDuration) duration19);
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str24 = dateTimeField11.getAsText((org.joda.time.ReadablePartial) localDateTime15, (int) (short) 1, locale23);
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = locale23.getDisplayLanguage(locale25);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone1, locale25);
        int int28 = timeZone1.getRawOffset();
        int int30 = timeZone1.getOffset(1645514154223L);
        java.util.TimeZone timeZone31 = java.util.TimeZone.getDefault();
        java.util.Locale locale32 = java.util.Locale.US;
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone31, locale32);
        boolean boolean34 = timeZone1.hasSameRules(timeZone31);
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(timeZone31);
        int int36 = timeZone31.getDSTSavings();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar27 and calendar33", (calendar27.compareTo(calendar33) == 0) == calendar27.equals(calendar33));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) ' ', dateTimeZone1);
        int int3 = dateTime2.getYearOfCentury();
        org.joda.time.YearMonthDay yearMonthDay4 = dateTime2.toYearMonthDay();
        org.joda.time.Chronology chronology5 = dateTime2.getChronology();
        int int6 = dateTime2.getWeekOfWeekyear();
        boolean boolean7 = dateTime2.isEqualNow();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.Interval interval10 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology12.hourOfHalfday();
        org.joda.time.DateTime dateTime14 = dateTime8.toDateTime(chronology12);
        org.joda.time.DateTime.Property property15 = dateTime8.monthOfYear();
        org.joda.time.DateTime dateTime17 = dateTime8.plusMonths(38);
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime21 = dateTime19.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant22 = dateTime21.toInstant();
        org.joda.time.MutableDateTime mutableDateTime23 = instant22.toMutableDateTimeISO();
        org.joda.time.Duration duration25 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime();
        org.joda.time.Interval interval28 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableInstant) dateTime27);
        int int29 = dateTime26.getMinuteOfDay();
        org.joda.time.Period period31 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime32 = dateTime26.plus((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = dateTime26.toDateTime(chronology33);
        org.joda.time.DateTime dateTime36 = dateTime26.minus((long) 10);
        org.joda.time.Period period37 = duration25.toPeriodFrom((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property39 = dateTime38.era();
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime42 = dateTime40.plusWeeks((int) (byte) 1);
        int int43 = property39.compareTo((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime();
        org.joda.time.Interval interval46 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableInstant) dateTime45);
        boolean boolean48 = interval46.isAfter((long) 10);
        org.joda.time.Duration duration49 = interval46.toDuration();
        org.joda.time.Duration duration52 = duration49.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval53 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableDuration) duration52);
        org.joda.time.Duration duration55 = duration25.withDurationAdded((org.joda.time.ReadableDuration) duration52, 26160257);
        org.joda.time.Instant instant56 = instant22.plus((org.joda.time.ReadableDuration) duration52);
        long long57 = instant22.getMillis();
        org.joda.time.MutableDateTime mutableDateTime58 = instant22.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime59 = instant22.toMutableDateTime();
        org.joda.time.Period period60 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) instant22);
        org.joda.time.DateTime dateTime62 = dateTime8.minus(44280000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant22", (dateTime21.compareTo(instant22) == 0) == dateTime21.equals(instant22));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'u');
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#');
        int int6 = period4.getValue(0);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.Duration duration10 = period4.toDurationTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationFrom(readableInstant13);
        org.joda.time.Seconds seconds15 = duration14.toStandardSeconds();
        boolean boolean16 = duration10.isEqual((org.joda.time.ReadableDuration) duration14);
        long long17 = duration10.getStandardDays();
        org.joda.time.DateTime dateTime19 = dateTime2.withDurationAdded((org.joda.time.ReadableDuration) duration10, 2782);
        long long20 = duration10.getStandardDays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime7", (dateTime2.compareTo(dateTime7) == 0) == dateTime2.equals(dateTime7));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant13 = instant3.withDurationAdded(1645514154223L, 100);
        long long14 = instant3.getMillis();
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getInstantChronology((org.joda.time.ReadableInstant) instant3);
        org.joda.time.Instant instant16 = instant3.toInstant();
        org.joda.time.Instant instant17 = instant3.toInstant();
        org.joda.time.Instant instant20 = instant3.withDurationAdded(13910400000L, 37435440);
        org.joda.time.Instant instant22 = instant3.withMillis(1645514565951L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = dateTime3.getChronology();
        int int5 = dateTime3.getDayOfYear();
        org.joda.time.Instant instant6 = dateTime3.toInstant();
        org.joda.time.Instant instant9 = instant6.withDurationAdded(0L, 26207293);
        org.joda.time.DateTime dateTime10 = instant6.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant6", (dateTime0.compareTo(instant6) == 0) == dateTime0.equals(instant6));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(10L, chronology2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        int int5 = dateTime3.get(dateTimeFieldType4);
        boolean boolean6 = localTime0.isSupported(dateTimeFieldType4);
        org.joda.time.LocalTime.Property property7 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime8 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime10 = localTime8.minusSeconds(2782);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) (-1), chronology12);
        org.joda.time.Period period14 = period13.toPeriod();
        int int15 = period14.size();
        int int16 = period14.getMinutes();
        int[] intArray17 = period14.getValues();
        org.joda.time.Duration duration18 = period14.toStandardDuration();
        org.joda.time.LocalTime localTime20 = localTime8.withPeriodAdded((org.joda.time.ReadablePeriod) period14, 0);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime21, (org.joda.time.ReadablePartial) localTime22, periodType23);
        org.joda.time.Period period25 = period24.negated();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) (-1), chronology27);
        org.joda.time.Period period29 = period28.toPeriod();
        org.joda.time.Period period30 = period25.withFields((org.joda.time.ReadablePeriod) period28);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.hours();
        boolean boolean32 = period25.isSupported(durationFieldType31);
        org.joda.time.Period period34 = period25.withDays((int) (short) 0);
        org.joda.time.LocalTime localTime35 = localTime8.plus((org.joda.time.ReadablePeriod) period25);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property37 = dateTime36.millisOfDay();
        org.joda.time.DateTime dateTime38 = dateTime36.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime40 = dateTime36.minusDays(12);
        org.joda.time.DateTime dateTime42 = dateTime40.minusYears(382);
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime45 = localTime43.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial46 = null;
        org.joda.time.LocalTime localTime47 = localTime45.withFields(readablePartial46);
        org.joda.time.LocalTime localTime49 = localTime47.withMillisOfDay(3);
        org.joda.time.LocalTime localTime50 = org.joda.time.LocalTime.now();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period((long) (-1), chronology52);
        org.joda.time.Period period54 = period53.toPeriod();
        org.joda.time.LocalTime localTime55 = localTime50.minus((org.joda.time.ReadablePeriod) period54);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime(10L, chronology57);
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = org.joda.time.DateTimeFieldType.weekyear();
        int int60 = dateTime58.get(dateTimeFieldType59);
        boolean boolean61 = localTime55.isSupported(dateTimeFieldType59);
        boolean boolean62 = localTime49.isSupported(dateTimeFieldType59);
        int int63 = dateTime42.get(dateTimeFieldType59);
        org.joda.time.TimeOfDay timeOfDay64 = dateTime42.toTimeOfDay();
        org.joda.time.Duration duration66 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime67 = dateTime42.plus((org.joda.time.ReadableDuration) duration66);
        int int68 = dateTime42.getMinuteOfHour();
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) period25, (org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.DateTime dateTime71 = dateTime42.withChronology(chronology70);
        org.joda.time.Instant instant72 = dateTime71.toInstant();
        org.joda.time.Instant instant73 = instant72.toInstant();
        org.joda.time.MutableDateTime mutableDateTime74 = instant73.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime42 and instant73", (dateTime42.compareTo(instant73) == 0) == dateTime42.equals(instant73));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1645514176563L);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        java.lang.String str5 = interval4.toString();
        org.joda.time.DateTime dateTime6 = interval4.getEnd();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusWeeks((int) (byte) 10);
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationFrom(readableInstant12);
        long long14 = duration13.getMillis();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.plus((org.joda.time.ReadableDuration) duration13);
        boolean boolean16 = interval4.equals((java.lang.Object) duration13);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime20 = interval19.getEnd();
        org.joda.time.Interval interval21 = interval19.toInterval();
        org.joda.time.MutableInterval mutableInterval22 = interval21.toMutableInterval();
        org.joda.time.Interval interval23 = interval4.gap((org.joda.time.ReadableInterval) interval21);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime();
        int int25 = localDateTime24.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minusWeeks((int) (byte) 10);
        org.joda.time.Period period30 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period30.toDurationFrom(readableInstant31);
        long long33 = duration32.getMillis();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.plus((org.joda.time.ReadableDuration) duration32);
        long long35 = duration32.getMillis();
        java.lang.String str36 = duration32.toString();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusWeeks((int) (byte) 10);
        org.joda.time.Period period41 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Duration duration43 = period41.toDurationFrom(readableInstant42);
        long long44 = duration43.getMillis();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime39.plus((org.joda.time.ReadableDuration) duration43);
        java.lang.String str46 = duration43.toString();
        boolean boolean47 = duration32.isShorterThan((org.joda.time.ReadableDuration) duration43);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime24.withDurationAdded((org.joda.time.ReadableDuration) duration43, 1970);
        org.joda.time.Interval interval50 = interval4.withDurationAfterStart((org.joda.time.ReadableDuration) duration43);
        org.joda.time.Instant instant51 = instant1.plus((org.joda.time.ReadableDuration) duration43);
        long long52 = instant1.getMillis();
        org.joda.time.Instant instant54 = instant1.plus(3291028486035L);
        org.joda.time.MutableDateTime mutableDateTime55 = instant54.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime56 = instant54.toMutableDateTimeISO();
        org.joda.time.Chronology chronology57 = mutableDateTime56.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant54 and mutableDateTime55", (instant54.compareTo(mutableDateTime55) == 0) == instant54.equals(mutableDateTime55));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getChronology(chronology0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.hourOfHalfday();
        long long5 = dateTimeField2.getDifferenceAsLong(3291028486957L, 3291028498410L);
        int int6 = dateTimeField2.getMaximumValue();
        long long9 = dateTimeField2.getDifferenceAsLong(0L, (-10L));
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.Interval interval13 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) dateTime12);
        int int14 = dateTime11.getMinuteOfDay();
        int int15 = dateTime11.getYearOfCentury();
        int int16 = dateTime11.getDayOfMonth();
        org.joda.time.DateTime dateTime18 = dateTime11.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property19 = dateTime18.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField20 = property19.getField();
        int int21 = dateTimeField20.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusWeeks((int) (byte) 10);
        org.joda.time.Period period26 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = period26.toDurationFrom(readableInstant27);
        long long29 = duration28.getMillis();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.plus((org.joda.time.ReadableDuration) duration28);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str33 = dateTimeField20.getAsText((org.joda.time.ReadablePartial) localDateTime24, (int) (short) 1, locale32);
        org.joda.time.DurationField durationField34 = dateTimeField20.getDurationField();
        long long36 = dateTimeField20.roundHalfFloor((long) (-292275054));
        int int38 = dateTimeField20.getMaximumValue(85751619240000L);
        java.util.TimeZone timeZone41 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime();
        org.joda.time.Interval interval44 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime42, (org.joda.time.ReadableInstant) dateTime43);
        int int45 = dateTime42.getMinuteOfDay();
        int int46 = dateTime42.getYearOfCentury();
        int int47 = dateTime42.getDayOfMonth();
        org.joda.time.DateTime dateTime49 = dateTime42.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property50 = dateTime49.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField51 = property50.getField();
        int int52 = dateTimeField51.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.minusWeeks((int) (byte) 10);
        org.joda.time.Period period57 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.Duration duration59 = period57.toDurationFrom(readableInstant58);
        long long60 = duration59.getMillis();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime55.plus((org.joda.time.ReadableDuration) duration59);
        java.util.Locale locale63 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str64 = dateTimeField51.getAsText((org.joda.time.ReadablePartial) localDateTime55, (int) (short) 1, locale63);
        java.util.Locale locale65 = java.util.Locale.getDefault();
        java.lang.String str66 = locale63.getDisplayLanguage(locale65);
        java.util.Calendar calendar67 = java.util.Calendar.getInstance(timeZone41, locale65);
        int int68 = timeZone41.getRawOffset();
        timeZone41.setID("2022-02-22T07:16:22.943Z/2022-02-22T07:16:22.943Z");
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime();
        org.joda.time.Interval interval73 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime71, (org.joda.time.ReadableInstant) dateTime72);
        int int74 = dateTime71.getMinuteOfDay();
        int int75 = dateTime71.getYearOfCentury();
        int int76 = dateTime71.getDayOfMonth();
        org.joda.time.DateTime dateTime78 = dateTime71.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property79 = dateTime78.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField80 = property79.getField();
        int int81 = dateTimeField80.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime82 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime84 = localDateTime82.minusWeeks((int) (byte) 10);
        org.joda.time.Period period86 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant87 = null;
        org.joda.time.Duration duration88 = period86.toDurationFrom(readableInstant87);
        long long89 = duration88.getMillis();
        org.joda.time.LocalDateTime localDateTime90 = localDateTime84.plus((org.joda.time.ReadableDuration) duration88);
        java.util.Locale locale92 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str93 = dateTimeField80.getAsText((org.joda.time.ReadablePartial) localDateTime84, (int) (short) 1, locale92);
        java.util.Calendar calendar94 = java.util.Calendar.getInstance(timeZone41, locale92);
        java.lang.String str95 = dateTimeField20.getAsText(1645514183741L, locale92);
        java.util.Calendar calendar96 = java.util.Calendar.getInstance(locale92);
        java.lang.String str97 = dateTimeField2.getAsShortText(1645514511147L, locale92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar67 and calendar96", (calendar67.compareTo(calendar96) == 0) == calendar67.equals(calendar96));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        int int9 = dateTime7.getYear();
        int int10 = dateTime7.getEra();
        org.joda.time.DateTime dateTime12 = dateTime7.withYearOfCentury(21);
        org.joda.time.DateTime dateTime14 = dateTime7.withDayOfYear(90);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property16 = dateTime15.millisOfDay();
        org.joda.time.DateTime dateTime17 = dateTime15.withTimeAtStartOfDay();
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#');
        int int21 = period19.getValue(0);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Duration duration25 = period19.toDurationTo((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Chronology chronology26 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTimeField dateTimeField27 = chronology26.millisOfDay();
        java.util.Locale locale29 = java.util.Locale.JAPAN;
        java.util.Locale.setDefault(locale29);
        java.util.Set<java.lang.String> strSet31 = locale29.getUnicodeLocaleKeys();
        java.lang.String str32 = dateTimeField27.getAsShortText(26167, locale29);
        int int33 = dateTime14.get(dateTimeField27);
        org.joda.time.DateTime dateTime36 = dateTime14.withDurationAdded(1645514182943L, 1692);
        org.joda.time.Instant instant37 = dateTime14.toInstant();
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.minusWeeks((int) (byte) 10);
        org.joda.time.Period period43 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = period43.toDurationFrom(readableInstant44);
        long long46 = duration45.getMillis();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime41.plus((org.joda.time.ReadableDuration) duration45);
        mutableInterval38.setDurationAfterStart((org.joda.time.ReadableDuration) duration45);
        org.joda.time.Duration duration49 = mutableInterval38.toDuration();
        org.joda.time.ReadableInstant readableInstant50 = null;
        boolean boolean51 = mutableInterval38.contains(readableInstant50);
        org.joda.time.DateTime dateTime52 = mutableInterval38.getEnd();
        org.joda.time.DateTime.Property property53 = dateTime52.monthOfYear();
        boolean boolean54 = dateTime14.isEqual((org.joda.time.ReadableInstant) dateTime52);
        int int55 = dateTime52.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant37", (dateTime14.compareTo(instant37) == 0) == dateTime14.equals(instant37));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = dateTime3.getChronology();
        int int5 = dateTime3.getDayOfYear();
        org.joda.time.Instant instant6 = dateTime3.toInstant();
        org.joda.time.Instant instant9 = instant6.withDurationAdded(0L, 26207293);
        org.joda.time.Instant instant11 = instant6.plus(57822628L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant6", (dateTime0.compareTo(instant6) == 0) == dateTime0.equals(instant6));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        java.util.GregorianCalendar gregorianCalendar4 = dateTime2.toGregorianCalendar();
        org.joda.time.DateTime dateTime6 = dateTime2.withMillisOfSecond(19);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology8);
        int int10 = localTime9.getSecondOfMinute();
        org.joda.time.LocalTime localTime12 = localTime9.minusMinutes(2022);
        org.joda.time.LocalTime localTime14 = localTime12.minusSeconds(9);
        org.joda.time.LocalTime localTime16 = localTime12.plusSeconds(1970);
        org.joda.time.Duration duration18 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Chronology chronology20 = org.joda.time.DateTimeUtils.getChronology(chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology20.hourOfHalfday();
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.now(chronology20);
        org.joda.time.Period period23 = duration18.toPeriod(chronology20);
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.now(chronology20);
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.now(chronology20);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeUtils.getZone(dateTimeZone26);
        boolean boolean29 = dateTimeZone27.equals((java.lang.Object) 1645514161708L);
        org.joda.time.Chronology chronology30 = chronology20.withZone(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeUtils.getZone(dateTimeZone27);
        org.joda.time.DateTime dateTime32 = localTime12.toDateTimeToday(dateTimeZone31);
        boolean boolean33 = dateTime6.equals((java.lang.Object) localTime12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.millisOfDay();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        int int5 = dateTime2.getMinuteOfDay();
        int int6 = dateTime2.getYearOfCentury();
        int int7 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime9 = dateTime2.minusWeeks((int) (short) 0);
        boolean boolean10 = dateTime0.isAfter((org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.DateTime.Property property11 = dateTime0.weekOfWeekyear();
        org.joda.time.DateTime dateTime13 = dateTime0.minus((long) 7);
        org.joda.time.DateTime dateTime15 = dateTime13.minusHours(26208878);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withCenturyOfEra(2);
        org.joda.time.Period period21 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period21.toDurationFrom(readableInstant22);
        org.joda.time.Seconds seconds24 = duration23.toStandardSeconds();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime17.withDurationAdded((org.joda.time.ReadableDuration) duration23, 2022);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        long long30 = dateTimeZone28.convertUTCToLocal((long) 1970);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(1375201439L, dateTimeZone28);
        boolean boolean32 = localDateTime17.isEqual((org.joda.time.ReadablePartial) localDateTime31);
        int int33 = localDateTime31.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean35 = localDateTime31.isSupported(dateTimeFieldType34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime();
        org.joda.time.Interval interval38 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime36, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime39 = interval38.getEnd();
        org.joda.time.Chronology chronology40 = dateTime39.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField42 = chronology40.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType34.getField(chronology40);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((java.lang.Object) dateTime13, chronology40);
        org.joda.time.Instant instant45 = dateTime44.toInstant();
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime();
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime46, (org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime49 = interval48.getEnd();
        org.joda.time.Interval interval50 = interval48.toInterval();
        org.joda.time.MutableInterval mutableInterval51 = interval50.toMutableInterval();
        org.joda.time.Duration duration53 = org.joda.time.Duration.millis((long) 11);
        mutableInterval51.setDurationAfterStart((org.joda.time.ReadableDuration) duration53);
        org.joda.time.Instant instant56 = instant45.withDurationAdded((org.joda.time.ReadableDuration) duration53, 1640);
        long long57 = duration53.getStandardDays();
        org.joda.time.Duration duration59 = org.joda.time.Duration.standardMinutes(435L);
        org.joda.time.Duration duration61 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime();
        org.joda.time.Interval interval64 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime62, (org.joda.time.ReadableInstant) dateTime63);
        int int65 = dateTime62.getMinuteOfDay();
        org.joda.time.Period period67 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime68 = dateTime62.plus((org.joda.time.ReadablePeriod) period67);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.DateTime dateTime70 = dateTime62.toDateTime(chronology69);
        org.joda.time.DateTime dateTime72 = dateTime62.minus((long) 10);
        org.joda.time.Period period73 = duration61.toPeriodFrom((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.Duration duration75 = duration61.plus((long) 26181277);
        boolean boolean76 = duration59.isShorterThan((org.joda.time.ReadableDuration) duration61);
        java.lang.String str77 = duration61.toString();
        org.joda.time.Duration duration79 = duration61.minus(1645566856589L);
        boolean boolean80 = duration53.isLongerThan((org.joda.time.ReadableDuration) duration79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant45", (dateTime13.compareTo(instant45) == 0) == dateTime13.equals(instant45));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant13 = instant3.withDurationAdded(1645514154223L, 100);
        org.joda.time.DateTime dateTime14 = instant3.toDateTimeISO();
        boolean boolean16 = instant3.isBefore((long) 53);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime18);
        int int20 = dateTime17.getMinuteOfDay();
        int int21 = dateTime17.getYearOfCentury();
        int int22 = dateTime17.getDayOfMonth();
        org.joda.time.DateTime dateTime24 = dateTime17.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property25 = dateTime17.minuteOfHour();
        org.joda.time.Period period27 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationFrom(readableInstant28);
        org.joda.time.Seconds seconds30 = duration29.toStandardSeconds();
        org.joda.time.Duration duration33 = duration29.withDurationAdded((long) 32772, (int) (byte) 10);
        java.lang.String str34 = duration29.toString();
        org.joda.time.Period period35 = duration29.toPeriod();
        org.joda.time.Interval interval36 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableDuration) duration29);
        org.joda.time.Instant instant38 = instant3.withDurationAdded((org.joda.time.ReadableDuration) duration29, 504);
        org.joda.time.Chronology chronology39 = instant38.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-22T07:16:00.256Z/2022-02-22T07:16:00.256Z");
        timeZone1.setID("2022-02-22T07:16:17.690Z/2022-02-22T07:16:17.690Z");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.Interval interval8 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime7);
        int int9 = dateTime6.getMinuteOfDay();
        int int10 = dateTime6.getYearOfCentury();
        int int11 = dateTime6.getDayOfMonth();
        org.joda.time.DateTime dateTime13 = dateTime6.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property14 = dateTime13.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField15 = property14.getField();
        int int16 = dateTimeField15.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusWeeks((int) (byte) 10);
        org.joda.time.Period period21 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period21.toDurationFrom(readableInstant22);
        long long24 = duration23.getMillis();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.plus((org.joda.time.ReadableDuration) duration23);
        java.util.Locale locale27 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str28 = dateTimeField15.getAsText((org.joda.time.ReadablePartial) localDateTime19, (int) (short) 1, locale27);
        java.util.Locale locale29 = java.util.Locale.getDefault();
        java.lang.String str30 = locale27.getDisplayLanguage(locale29);
        java.util.Calendar calendar31 = java.util.Calendar.getInstance(timeZone5, locale29);
        int int32 = timeZone5.getRawOffset();
        timeZone5.setID("2022-02-22T07:16:22.943Z/2022-02-22T07:16:22.943Z");
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime();
        org.joda.time.Interval interval37 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateTime36);
        int int38 = dateTime35.getMinuteOfDay();
        int int39 = dateTime35.getYearOfCentury();
        int int40 = dateTime35.getDayOfMonth();
        org.joda.time.DateTime dateTime42 = dateTime35.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property43 = dateTime42.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField44 = property43.getField();
        int int45 = dateTimeField44.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.minusWeeks((int) (byte) 10);
        org.joda.time.Period period50 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Duration duration52 = period50.toDurationFrom(readableInstant51);
        long long53 = duration52.getMillis();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime48.plus((org.joda.time.ReadableDuration) duration52);
        java.util.Locale locale56 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str57 = dateTimeField44.getAsText((org.joda.time.ReadablePartial) localDateTime48, (int) (short) 1, locale56);
        java.util.Calendar calendar58 = java.util.Calendar.getInstance(timeZone5, locale56);
        java.util.Calendar calendar59 = java.util.Calendar.getInstance(timeZone1, locale56);
        java.util.TimeZone timeZone61 = java.util.TimeZone.getTimeZone("zh_TW");
        java.time.ZoneId zoneId62 = timeZone61.toZoneId();
        calendar59.setTimeZone(timeZone61);
        boolean boolean64 = timeZone61.observesDaylightTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar31 and calendar59", (calendar31.compareTo(calendar59) == 0) == calendar31.equals(calendar59));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes(435L);
        long long6 = duration5.getMillis();
        org.joda.time.Duration duration8 = duration5.minus((long) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime2.minus((org.joda.time.ReadableDuration) duration5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(366);
        org.joda.time.DateTime dateTime12 = dateTime9.toDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime12", (dateTime9.compareTo(dateTime12) == 0) == dateTime9.equals(dateTime12));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-22T07:16:00.256Z/2022-02-22T07:16:00.256Z");
        timeZone1.setID("2022-02-22T07:16:17.690Z/2022-02-22T07:16:17.690Z");
        timeZone1.setRawOffset(52499944);
        boolean boolean6 = timeZone1.observesDaylightTime();
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(timeZone1);
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("zh_TW");
        java.time.ZoneId zoneId10 = timeZone9.toZoneId();
        int int11 = timeZone9.getRawOffset();
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone9);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone9);
        boolean boolean14 = timeZone1.hasSameRules(timeZone9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar7 and calendar12", (calendar7.compareTo(calendar12) == 0) == calendar7.equals(calendar12));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(10L, chronology4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekyear();
        int int7 = dateTime5.get(dateTimeFieldType6);
        boolean boolean8 = localTime2.isSupported(dateTimeFieldType6);
        org.joda.time.LocalTime.Property property9 = localTime2.minuteOfHour();
        org.joda.time.LocalTime localTime10 = property9.withMaximumValue();
        org.joda.time.LocalTime localTime11 = property9.roundHalfCeilingCopy();
        boolean boolean12 = calendar1.after((java.lang.Object) property9);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("zh_TW");
        java.time.ZoneId zoneId15 = timeZone14.toZoneId();
        int int16 = timeZone14.getRawOffset();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone14);
        calendar1.setTimeZone(timeZone14);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property20 = dateTime19.era();
        org.joda.time.DateTime.Property property21 = dateTime19.weekyear();
        org.joda.time.DateTime dateTime23 = property21.setCopy(453);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeUtils.getZone(dateTimeZone24);
        java.lang.String str27 = dateTimeZone25.getName((long) ' ');
        java.lang.String str29 = dateTimeZone25.getName((long) (short) -1);
        org.joda.time.DateTime dateTime30 = dateTime23.withZoneRetainFields(dateTimeZone25);
        java.util.TimeZone timeZone31 = dateTimeZone25.toTimeZone();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime33);
        int int35 = dateTime32.getMinuteOfDay();
        int int36 = dateTime32.getYearOfCentury();
        int int37 = dateTime32.getDayOfMonth();
        org.joda.time.DateTime dateTime39 = dateTime32.minusWeeks((int) (short) 0);
        int int40 = dateTime32.getYear();
        java.util.Locale.Builder builder41 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder42 = builder41.clearExtensions();
        java.util.Locale.Builder builder43 = builder42.clearExtensions();
        java.util.Locale locale44 = builder43.build();
        java.util.Calendar calendar45 = dateTime32.toCalendar(locale44);
        java.util.Locale.setDefault(locale44);
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(timeZone31, locale44);
        calendar1.setTimeZone(timeZone31);
        calendar1.setFirstDayOfWeek(26220876);
        java.util.Date date51 = calendar1.getTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar17 and calendar47", (calendar17.compareTo(calendar47) == 0) == calendar17.equals(calendar47));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.Interval interval3 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) dateTime2);
        int int4 = dateTime1.getMinuteOfDay();
        int int5 = dateTime1.getYearOfCentury();
        int int6 = dateTime1.getDayOfMonth();
        org.joda.time.DateTime dateTime8 = dateTime1.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = property9.getField();
        int int11 = dateTimeField10.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusWeeks((int) (byte) 10);
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationFrom(readableInstant17);
        long long19 = duration18.getMillis();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.plus((org.joda.time.ReadableDuration) duration18);
        java.util.Locale locale22 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str23 = dateTimeField10.getAsText((org.joda.time.ReadablePartial) localDateTime14, (int) (short) 1, locale22);
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.lang.String str25 = locale22.getDisplayLanguage(locale24);
        java.lang.String str28 = nameProvider0.getShortName(locale22, "PT26160256.999S", "2022-02-22T07:15:53.208Z/2022-02-22T07:15:53.208Z");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.util.TimeZone timeZone31 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime33);
        int int35 = dateTime32.getMinuteOfDay();
        int int36 = dateTime32.getYearOfCentury();
        int int37 = dateTime32.getDayOfMonth();
        org.joda.time.DateTime dateTime39 = dateTime32.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property40 = dateTime39.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField41 = property40.getField();
        int int42 = dateTimeField41.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.minusWeeks((int) (byte) 10);
        org.joda.time.Period period47 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Duration duration49 = period47.toDurationFrom(readableInstant48);
        long long50 = duration49.getMillis();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime45.plus((org.joda.time.ReadableDuration) duration49);
        java.util.Locale locale53 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str54 = dateTimeField41.getAsText((org.joda.time.ReadablePartial) localDateTime45, (int) (short) 1, locale53);
        java.util.Locale locale55 = java.util.Locale.getDefault();
        java.lang.String str56 = locale53.getDisplayLanguage(locale55);
        java.util.Calendar calendar57 = java.util.Calendar.getInstance(timeZone31, locale55);
        boolean boolean58 = locale55.hasExtensions();
        java.lang.String str59 = locale55.toLanguageTag();
        java.lang.String str62 = nameProvider0.getName(locale55, "5878866", "2074-04-17T01:39:20.564+35:00/2074-04-17T01:39:20.564+35:00");
        java.util.Locale locale63 = java.util.Locale.CANADA;
        java.text.DateFormatSymbols dateFormatSymbols64 = java.text.DateFormatSymbols.getInstance(locale63);
        java.util.Calendar calendar65 = java.util.Calendar.getInstance(locale63);
        java.lang.String str68 = nameProvider0.getShortName(locale63, "2074-04-17T01:39:26.163+35:00/2074-04-17T01:39:26.163+35:00", "2074-04-15T14:34:58.653Z/2074-04-15T14:34:58.653Z");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar57 and calendar65", (calendar57.compareTo(calendar65) == 0) == calendar57.equals(calendar65));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        long long2 = calendar1.getTimeInMillis();
        int int4 = calendar1.getGreatestMinimum(6);
        java.util.Date date5 = calendar1.getTime();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromCalendarFields(calendar1);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(1645514178053L);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial12 = null;
        org.joda.time.LocalTime localTime13 = localTime11.withFields(readablePartial12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology15);
        int int17 = localTime16.getSecondOfMinute();
        org.joda.time.Period period18 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime11, (org.joda.time.ReadablePartial) localTime16);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.Period period20 = period18.plus(readablePeriod19);
        org.joda.time.Period period21 = period20.negated();
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime22, (org.joda.time.ReadablePartial) localTime23, periodType24);
        org.joda.time.Period period26 = period21.minus((org.joda.time.ReadablePeriod) period25);
        org.joda.time.DateTime dateTime27 = dateTime8.plus((org.joda.time.ReadablePeriod) period25);
        org.joda.time.DateTime dateTime28 = localTime6.toDateTime((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime8.toMutableDateTime(dateTimeZone29);
        int int31 = dateTime8.getYearOfCentury();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime33);
        int int35 = dateTime32.getMinuteOfDay();
        org.joda.time.DateTime dateTime37 = dateTime32.minusHours((int) 'a');
        boolean boolean38 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTime dateTime40 = dateTime32.plusMinutes(52435277);
        org.joda.time.DateTime dateTime42 = dateTime32.minus((long) 26199);
        java.util.Locale locale43 = java.util.Locale.getDefault();
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(locale43);
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(10L, chronology47);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.weekyear();
        int int50 = dateTime48.get(dateTimeFieldType49);
        boolean boolean51 = localTime45.isSupported(dateTimeFieldType49);
        org.joda.time.LocalTime.Property property52 = localTime45.minuteOfHour();
        org.joda.time.LocalTime localTime53 = property52.withMaximumValue();
        org.joda.time.LocalTime localTime54 = property52.roundHalfCeilingCopy();
        boolean boolean55 = calendar44.after((java.lang.Object) property52);
        java.util.TimeZone timeZone57 = java.util.TimeZone.getTimeZone("zh_TW");
        java.time.ZoneId zoneId58 = timeZone57.toZoneId();
        int int59 = timeZone57.getRawOffset();
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(timeZone57);
        calendar44.setTimeZone(timeZone57);
        java.lang.String str62 = timeZone57.getID();
        java.util.TimeZone timeZone64 = java.util.TimeZone.getTimeZone("26226968");
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forTimeZone(timeZone64);
        boolean boolean66 = timeZone57.hasSameRules(timeZone64);
        java.util.Locale locale67 = java.util.Locale.PRC;
        java.lang.String str68 = locale67.getDisplayScript();
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.Chronology chronology70 = org.joda.time.DateTimeUtils.getChronology(chronology69);
        org.joda.time.DateTimeField dateTimeField71 = chronology70.hourOfHalfday();
        int int73 = dateTimeField71.getLeapAmount((long) 26151451);
        java.util.Locale locale75 = java.util.Locale.forLanguageTag("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
        int int76 = dateTimeField71.getMaximumShortTextLength(locale75);
        java.lang.String str77 = locale67.getDisplayCountry(locale75);
        java.lang.String str78 = locale67.toLanguageTag();
        java.util.Set<java.lang.String> strSet79 = locale67.getUnicodeLocaleAttributes();
        java.util.Calendar calendar80 = java.util.Calendar.getInstance(timeZone64, locale67);
        java.util.Calendar calendar81 = dateTime42.toCalendar(locale67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar44", (calendar1.compareTo(calendar44) == 0) == calendar1.equals(calendar44));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'u');
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        org.joda.time.MutableDateTime mutableDateTime8 = instant7.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology11.hourOfHalfday();
        org.joda.time.DurationField durationField13 = durationFieldType9.getField(chronology11);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((java.lang.Object) instant7, chronology11);
        org.joda.time.Instant instant16 = instant7.plus(1645514151873L);
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) instant7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime4", (dateTime2.compareTo(dateTime4) == 0) == dateTime2.equals(dateTime4));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(10L, chronology4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekyear();
        int int7 = dateTime5.get(dateTimeFieldType6);
        boolean boolean8 = localTime2.isSupported(dateTimeFieldType6);
        org.joda.time.LocalTime.Property property9 = localTime2.minuteOfHour();
        org.joda.time.LocalTime localTime10 = property9.withMaximumValue();
        org.joda.time.LocalTime localTime11 = property9.roundHalfCeilingCopy();
        boolean boolean12 = calendar1.after((java.lang.Object) property9);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("zh_TW");
        java.time.ZoneId zoneId15 = timeZone14.toZoneId();
        int int16 = timeZone14.getRawOffset();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone14);
        calendar1.setTimeZone(timeZone14);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property20 = dateTime19.era();
        org.joda.time.DateTime.Property property21 = dateTime19.weekyear();
        org.joda.time.DateTime dateTime23 = property21.setCopy(453);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeUtils.getZone(dateTimeZone24);
        java.lang.String str27 = dateTimeZone25.getName((long) ' ');
        java.lang.String str29 = dateTimeZone25.getName((long) (short) -1);
        org.joda.time.DateTime dateTime30 = dateTime23.withZoneRetainFields(dateTimeZone25);
        java.util.TimeZone timeZone31 = dateTimeZone25.toTimeZone();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime33);
        int int35 = dateTime32.getMinuteOfDay();
        int int36 = dateTime32.getYearOfCentury();
        int int37 = dateTime32.getDayOfMonth();
        org.joda.time.DateTime dateTime39 = dateTime32.minusWeeks((int) (short) 0);
        int int40 = dateTime32.getYear();
        java.util.Locale.Builder builder41 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder42 = builder41.clearExtensions();
        java.util.Locale.Builder builder43 = builder42.clearExtensions();
        java.util.Locale locale44 = builder43.build();
        java.util.Calendar calendar45 = dateTime32.toCalendar(locale44);
        java.util.Locale.setDefault(locale44);
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(timeZone31, locale44);
        calendar1.setTimeZone(timeZone31);
        calendar1.setFirstDayOfWeek(26220876);
        calendar1.setMinimalDaysInFirstWeek(52445959);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar17 and calendar47", (calendar17.compareTo(calendar47) == 0) == calendar17.equals(calendar47));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime6 = dateTime0.plus((org.joda.time.ReadablePeriod) period5);
        int int7 = dateTime0.getSecondOfMinute();
        org.joda.time.DateTime dateTime8 = dateTime0.toDateTimeISO();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusWeeks((int) (byte) 10);
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period14.toDurationFrom(readableInstant15);
        long long17 = duration16.getMillis();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.plus((org.joda.time.ReadableDuration) duration16);
        mutableInterval9.setDurationAfterStart((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Duration duration20 = mutableInterval9.toDuration();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusWeeks((int) (byte) 10);
        org.joda.time.Period period25 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationFrom(readableInstant26);
        long long28 = duration27.getMillis();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime23.plus((org.joda.time.ReadableDuration) duration27);
        long long30 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration27);
        boolean boolean31 = duration20.isShorterThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Interval interval32 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableDuration) duration27);
        org.joda.time.DateTime dateTime34 = dateTime8.withYear(0);
        org.joda.time.Chronology chronology35 = org.joda.time.DateTimeUtils.getInstantChronology((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property37 = dateTime36.millisOfDay();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime();
        org.joda.time.Interval interval40 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime38, (org.joda.time.ReadableInstant) dateTime39);
        int int41 = dateTime38.getMinuteOfDay();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(10L, chronology43);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.weekyear();
        int int46 = dateTime44.get(dateTimeFieldType45);
        int int47 = dateTime38.get(dateTimeFieldType45);
        boolean boolean48 = dateTime36.isEqual((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTime.Property property49 = dateTime38.weekyear();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeUtils.getZone(dateTimeZone50);
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate((java.lang.Object) dateTime38, dateTimeZone51);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(10L, chronology54);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.weekyear();
        int int57 = dateTime55.get(dateTimeFieldType56);
        org.joda.time.DateMidnight dateMidnight58 = dateTime55.toDateMidnight();
        org.joda.time.DateTime dateTime59 = localDate52.toDateTime((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.LocalDate localDate61 = localDate52.plusYears((int) '4');
        org.joda.time.LocalDate localDate63 = localDate61.plusWeeks(16);
        org.joda.time.DateTime dateTime64 = localDate61.toDateTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetMillis(156);
        org.joda.time.DateTime dateTime67 = localDate61.toDateTimeAtStartOfDay(dateTimeZone66);
        org.joda.time.DateTime dateTime68 = org.joda.time.DateTime.now(dateTimeZone66);
        org.joda.time.DateTime dateTime69 = dateTime8.withZone(dateTimeZone66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime68", (dateTime8.compareTo(dateTime68) == 0) == dateTime8.equals(dateTime68));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.millisOfDay();
        org.joda.time.DateTime dateTime2 = dateTime0.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime4 = dateTime0.minusDays(12);
        org.joda.time.DateTime dateTime6 = dateTime4.minusYears(382);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.DateTime dateTime9 = dateTime6.withField(dateTimeFieldType7, 21);
        org.joda.time.Duration duration11 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getChronology(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology13.hourOfHalfday();
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.now(chronology13);
        org.joda.time.Period period16 = duration11.toPeriod(chronology13);
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.now(chronology13);
        org.joda.time.Chronology chronology18 = localTime17.getChronology();
        boolean boolean19 = dateTimeFieldType7.isSupported(chronology18);
        org.joda.time.DurationField durationField20 = chronology18.eras();
        org.joda.time.DurationField durationField21 = chronology18.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField21, and durationField20", !(durationField20.compareTo(durationField21) == 0) || (Math.signum(durationField20.compareTo(durationField20)) == Math.signum(durationField21.compareTo(durationField20))));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.joda.time.Duration duration3 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.now(chronology5);
        org.joda.time.Period period8 = duration3.toPeriod(chronology5);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(327L, chronology5);
        org.joda.time.DurationField durationField10 = durationFieldType0.getField(chronology5);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.eras();
        org.joda.time.Duration duration16 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getChronology(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.hourOfHalfday();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.now(chronology18);
        org.joda.time.Period period21 = duration16.toPeriod(chronology18);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(327L, chronology18);
        org.joda.time.DurationField durationField23 = durationFieldType13.getField(chronology18);
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) 12, 436L, chronology18);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime dateTime28 = interval27.getEnd();
        org.joda.time.Chronology chronology29 = dateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.clockhourOfHalfday();
        mutableInterval24.setChronology(chronology29);
        org.joda.time.DurationField durationField32 = durationFieldType0.getField(chronology29);
        org.joda.time.DurationField durationField33 = chronology29.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField33, and durationField10", !(durationField10.compareTo(durationField33) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField33.compareTo(durationField10))));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.millisOfDay();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        int int5 = dateTime2.getMinuteOfDay();
        int int6 = dateTime2.getYearOfCentury();
        int int7 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime9 = dateTime2.minusWeeks((int) (short) 0);
        boolean boolean10 = dateTime0.isAfter((org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(10L, chronology13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekyear();
        int int16 = dateTime14.get(dateTimeFieldType15);
        boolean boolean17 = localTime11.isSupported(dateTimeFieldType15);
        org.joda.time.LocalTime.Property property18 = localTime11.minuteOfHour();
        org.joda.time.LocalTime localTime19 = property18.withMaximumValue();
        org.joda.time.LocalTime localTime21 = localTime19.minusSeconds(2782);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) (-1), chronology23);
        org.joda.time.Period period25 = period24.toPeriod();
        int int26 = period25.size();
        int int27 = period25.getMinutes();
        int[] intArray28 = period25.getValues();
        org.joda.time.Duration duration29 = period25.toStandardDuration();
        org.joda.time.LocalTime localTime31 = localTime19.withPeriodAdded((org.joda.time.ReadablePeriod) period25, 0);
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime32, (org.joda.time.ReadablePartial) localTime33, periodType34);
        org.joda.time.Period period36 = period35.negated();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((long) (-1), chronology38);
        org.joda.time.Period period40 = period39.toPeriod();
        org.joda.time.Period period41 = period36.withFields((org.joda.time.ReadablePeriod) period39);
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.hours();
        boolean boolean43 = period36.isSupported(durationFieldType42);
        org.joda.time.Period period45 = period36.withDays((int) (short) 0);
        org.joda.time.LocalTime localTime46 = localTime19.plus((org.joda.time.ReadablePeriod) period36);
        org.joda.time.LocalTime.Property property47 = localTime19.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        int int49 = localTime19.indexOf(dateTimeFieldType48);
        org.joda.time.DateTime.Property property50 = dateTime2.property(dateTimeFieldType48);
        org.joda.time.DateTime dateTime52 = dateTime2.minusMinutes(52442703);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'u');
        org.joda.time.MutableDateTime mutableDateTime55 = dateTime52.toMutableDateTime(dateTimeZone54);
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate(dateTimeZone54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime52 and mutableDateTime55", (dateTime52.compareTo(mutableDateTime55) == 0) == dateTime52.equals(mutableDateTime55));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        int int5 = dateTime2.getMinuteOfDay();
        int int6 = dateTime2.getYearOfCentury();
        int int7 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime9 = dateTime2.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = property10.getField();
        int int12 = dateTimeField11.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusWeeks((int) (byte) 10);
        org.joda.time.Period period17 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period17.toDurationFrom(readableInstant18);
        long long20 = duration19.getMillis();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.plus((org.joda.time.ReadableDuration) duration19);
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str24 = dateTimeField11.getAsText((org.joda.time.ReadablePartial) localDateTime15, (int) (short) 1, locale23);
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = locale23.getDisplayLanguage(locale25);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone1, locale25);
        calendar27.setFirstDayOfWeek((int) (short) -1);
        java.util.Date date30 = calendar27.getTime();
        java.util.TimeZone timeZone31 = calendar27.getTimeZone();
        boolean boolean32 = timeZone31.observesDaylightTime();
        java.util.Calendar.Builder builder33 = new java.util.Calendar.Builder();
        java.util.Locale locale34 = java.util.Locale.PRC;
        java.lang.String str35 = locale34.getDisplayScript();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Chronology chronology37 = org.joda.time.DateTimeUtils.getChronology(chronology36);
        org.joda.time.DateTimeField dateTimeField38 = chronology37.hourOfHalfday();
        int int40 = dateTimeField38.getLeapAmount((long) 26151451);
        java.util.Locale locale42 = java.util.Locale.forLanguageTag("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
        int int43 = dateTimeField38.getMaximumShortTextLength(locale42);
        java.lang.String str44 = locale34.getDisplayCountry(locale42);
        java.lang.String str45 = locale34.getISO3Language();
        java.util.Calendar.Builder builder46 = builder33.setLocale(locale34);
        java.lang.String str47 = locale34.getDisplayVariant();
        org.joda.time.tz.NameProvider nameProvider48 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime();
        org.joda.time.Interval interval51 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime49, (org.joda.time.ReadableInstant) dateTime50);
        int int52 = dateTime49.getMinuteOfDay();
        int int53 = dateTime49.getYearOfCentury();
        int int54 = dateTime49.getDayOfMonth();
        org.joda.time.DateTime dateTime56 = dateTime49.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property57 = dateTime56.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField58 = property57.getField();
        int int59 = dateTimeField58.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.minusWeeks((int) (byte) 10);
        org.joda.time.Period period64 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.Duration duration66 = period64.toDurationFrom(readableInstant65);
        long long67 = duration66.getMillis();
        org.joda.time.LocalDateTime localDateTime68 = localDateTime62.plus((org.joda.time.ReadableDuration) duration66);
        java.util.Locale locale70 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str71 = dateTimeField58.getAsText((org.joda.time.ReadablePartial) localDateTime62, (int) (short) 1, locale70);
        java.util.Locale locale72 = java.util.Locale.getDefault();
        java.lang.String str73 = locale70.getDisplayLanguage(locale72);
        java.lang.String str76 = nameProvider48.getShortName(locale70, "PT26160256.999S", "2022-02-22T07:15:53.208Z/2022-02-22T07:15:53.208Z");
        boolean boolean77 = locale70.hasExtensions();
        java.lang.String str78 = locale70.getDisplayScript();
        java.lang.String str79 = locale70.toLanguageTag();
        java.lang.String str80 = locale34.getDisplayScript(locale70);
        java.util.Calendar calendar81 = java.util.Calendar.getInstance(timeZone31, locale70);
        int int82 = timeZone31.getRawOffset();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar27 and calendar81", (calendar27.compareTo(calendar81) == 0) == calendar27.equals(calendar81));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-22T07:16:00.256Z/2022-02-22T07:16:00.256Z");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.Locale locale4 = java.util.Locale.US;
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone3, locale4);
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone3);
        boolean boolean7 = timeZone1.hasSameRules(timeZone3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar5", (calendar2.compareTo(calendar5) == 0) == calendar2.equals(calendar5));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        java.lang.String str3 = interval2.toString();
        org.joda.time.DateTime dateTime4 = interval2.getEnd();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusWeeks((int) (byte) 10);
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        long long12 = duration11.getMillis();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.plus((org.joda.time.ReadableDuration) duration11);
        boolean boolean14 = interval2.equals((java.lang.Object) duration11);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property16 = dateTime15.era();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime19 = dateTime17.plusWeeks((int) (byte) 1);
        int int20 = property16.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableInstant) dateTime22);
        boolean boolean25 = interval23.isAfter((long) 10);
        org.joda.time.Duration duration26 = interval23.toDuration();
        org.joda.time.Duration duration29 = duration26.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval30 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableDuration) duration29);
        boolean boolean31 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration29);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime34 = dateTime32.plusWeeks((int) (byte) 1);
        org.joda.time.DateTime.Property property35 = dateTime34.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeUtils.getZone(dateTimeZone36);
        java.lang.String str39 = dateTimeZone37.getName((long) ' ');
        org.joda.time.DateTime dateTime40 = dateTime34.toDateTime(dateTimeZone37);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property42 = dateTime41.era();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime45 = dateTime43.plusWeeks((int) (byte) 1);
        int int46 = property42.compareTo((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime();
        org.joda.time.Interval interval49 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime47, (org.joda.time.ReadableInstant) dateTime48);
        boolean boolean51 = interval49.isAfter((long) 10);
        org.joda.time.Duration duration52 = interval49.toDuration();
        org.joda.time.Duration duration55 = duration52.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval56 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableDuration) duration55);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime59 = dateTime57.plusWeeks((int) (byte) 1);
        org.joda.time.DateTime.Property property60 = dateTime59.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeUtils.getZone(dateTimeZone61);
        java.lang.String str64 = dateTimeZone62.getName((long) ' ');
        org.joda.time.DateTime dateTime65 = dateTime59.toDateTime(dateTimeZone62);
        org.joda.time.PeriodType periodType66 = org.joda.time.PeriodType.time();
        org.joda.time.Period period67 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration55, (org.joda.time.ReadableInstant) dateTime65, periodType66);
        org.joda.time.PeriodType periodType68 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType69 = periodType68.withDaysRemoved();
        org.joda.time.Period period70 = period67.normalizedStandard(periodType69);
        org.joda.time.Period period71 = duration29.toPeriodTo((org.joda.time.ReadableInstant) dateTime40, periodType69);
        org.joda.time.DateTime dateTime73 = dateTime40.minusMinutes(51);
        org.joda.time.MutableDateTime mutableDateTime74 = dateTime73.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetHours(35);
        org.joda.time.DateTime dateTime77 = dateTime73.toDateTime(dateTimeZone76);
        org.joda.time.LocalDateTime localDateTime78 = org.joda.time.LocalDateTime.now(dateTimeZone76);
        java.lang.String str80 = dateTimeZone76.getShortName(1645514467892L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime73 and dateTime77", (dateTime73.compareTo(dateTime77) == 0) == dateTime73.equals(dateTime77));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        int int5 = dateTime2.getMinuteOfDay();
        int int6 = dateTime2.getYearOfCentury();
        int int7 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime9 = dateTime2.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = property10.getField();
        int int12 = dateTimeField11.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusWeeks((int) (byte) 10);
        org.joda.time.Period period17 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period17.toDurationFrom(readableInstant18);
        long long20 = duration19.getMillis();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.plus((org.joda.time.ReadableDuration) duration19);
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str24 = dateTimeField11.getAsText((org.joda.time.ReadablePartial) localDateTime15, (int) (short) 1, locale23);
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = locale23.getDisplayLanguage(locale25);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone1, locale25);
        int int28 = timeZone1.getRawOffset();
        int int30 = timeZone1.getOffset(1645514154223L);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime32);
        int int34 = dateTime31.getMinuteOfDay();
        int int35 = dateTime31.getYearOfCentury();
        int int36 = dateTime31.getDayOfMonth();
        org.joda.time.DateTime dateTime38 = dateTime31.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property39 = dateTime38.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField40 = property39.getField();
        int int41 = dateTimeField40.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minusWeeks((int) (byte) 10);
        org.joda.time.Period period46 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Duration duration48 = period46.toDurationFrom(readableInstant47);
        long long49 = duration48.getMillis();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime44.plus((org.joda.time.ReadableDuration) duration48);
        java.util.Locale locale52 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str53 = dateTimeField40.getAsText((org.joda.time.ReadablePartial) localDateTime44, (int) (short) 1, locale52);
        java.util.Locale locale54 = java.util.Locale.getDefault();
        java.lang.String str55 = locale52.getDisplayLanguage(locale54);
        java.util.Calendar calendar56 = java.util.Calendar.getInstance(timeZone1, locale52);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.Chronology chronology58 = org.joda.time.DateTimeUtils.getChronology(chronology57);
        org.joda.time.DurationField durationField59 = chronology58.years();
        org.joda.time.DateTimeField dateTimeField60 = chronology58.centuryOfEra();
        java.util.Locale locale62 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet63 = locale62.getExtensionKeys();
        java.lang.String str64 = dateTimeField60.getAsText((int) (byte) 0, locale62);
        java.util.Calendar calendar65 = java.util.Calendar.getInstance(locale62);
        java.lang.String str66 = locale62.getDisplayName();
        java.lang.String str67 = locale52.getDisplayLanguage(locale62);
        java.lang.String str68 = locale62.getLanguage();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar27 and calendar65", (calendar27.compareTo(calendar65) == 0) == calendar27.equals(calendar65));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-22T07:16:00.256Z/2022-02-22T07:16:00.256Z");
        timeZone1.setID("2022-02-22T07:16:17.690Z/2022-02-22T07:16:17.690Z");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("zh_TW");
        java.time.ZoneId zoneId6 = timeZone5.toZoneId();
        int int7 = timeZone5.getRawOffset();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone5);
        boolean boolean9 = timeZone1.hasSameRules(timeZone5);
        java.util.TimeZone timeZone11 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime13);
        int int15 = dateTime12.getMinuteOfDay();
        int int16 = dateTime12.getYearOfCentury();
        int int17 = dateTime12.getDayOfMonth();
        org.joda.time.DateTime dateTime19 = dateTime12.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property20 = dateTime19.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField21 = property20.getField();
        int int22 = dateTimeField21.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusWeeks((int) (byte) 10);
        org.joda.time.Period period27 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationFrom(readableInstant28);
        long long30 = duration29.getMillis();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.plus((org.joda.time.ReadableDuration) duration29);
        java.util.Locale locale33 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str34 = dateTimeField21.getAsText((org.joda.time.ReadablePartial) localDateTime25, (int) (short) 1, locale33);
        java.util.Locale locale35 = java.util.Locale.getDefault();
        java.lang.String str36 = locale33.getDisplayLanguage(locale35);
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone11, locale35);
        boolean boolean38 = timeZone5.hasSameRules(timeZone11);
        java.util.Date date44 = new java.util.Date(0, 54, 6, 0, (int) 'x');
        org.joda.time.LocalTime localTime45 = org.joda.time.LocalTime.fromDateFields(date44);
        org.joda.time.LocalTime.Property property46 = localTime45.secondOfMinute();
        java.util.Locale locale47 = java.util.Locale.KOREAN;
        java.lang.String str48 = property46.getAsText(locale47);
        java.lang.String str49 = locale47.getISO3Language();
        java.util.Locale locale50 = java.util.Locale.CANADA_FRENCH;
        java.util.Calendar calendar51 = java.util.Calendar.getInstance(locale50);
        java.lang.String str52 = locale47.getDisplayCountry(locale50);
        java.util.Calendar calendar53 = java.util.Calendar.getInstance(timeZone5, locale50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar51", (calendar8.compareTo(calendar51) == 0) == calendar8.equals(calendar51));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        int int5 = dateTime2.getMinuteOfDay();
        int int6 = dateTime2.getYearOfCentury();
        int int7 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime9 = dateTime2.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = property10.getField();
        int int12 = dateTimeField11.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusWeeks((int) (byte) 10);
        org.joda.time.Period period17 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period17.toDurationFrom(readableInstant18);
        long long20 = duration19.getMillis();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.plus((org.joda.time.ReadableDuration) duration19);
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str24 = dateTimeField11.getAsText((org.joda.time.ReadablePartial) localDateTime15, (int) (short) 1, locale23);
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = locale23.getDisplayLanguage(locale25);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone1, locale25);
        int int28 = timeZone1.getRawOffset();
        int int30 = timeZone1.getOffset(1645514154223L);
        java.util.TimeZone timeZone31 = java.util.TimeZone.getDefault();
        java.util.Locale locale32 = java.util.Locale.US;
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone31, locale32);
        boolean boolean34 = timeZone1.hasSameRules(timeZone31);
        java.util.Locale.Category category35 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale36 = java.util.Locale.getDefault(category35);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property38 = dateTime37.millisOfDay();
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet40 = locale39.getExtensionKeys();
        java.lang.String str41 = property38.getAsText(locale39);
        java.lang.String str42 = locale39.toLanguageTag();
        java.lang.String str43 = locale36.getDisplayName(locale39);
        java.lang.String str44 = locale36.getLanguage();
        java.lang.String str45 = timeZone1.getDisplayName(locale36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar27 and calendar33", (calendar27.compareTo(calendar33) == 0) == calendar27.equals(calendar33));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = localTime0.toString(dateTimeFormatter3);
        org.joda.time.Chronology chronology5 = localTime0.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.eras();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.now(chronology5);
        org.joda.time.LocalTime localTime9 = localTime7.minusHours(25858444);
        org.joda.time.LocalTime localTime11 = localTime7.plusMinutes(56);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime13);
        int int15 = dateTime12.getMinuteOfDay();
        org.joda.time.Period period17 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime18 = dateTime12.plus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = dateTime12.toDateTime(chronology19);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime21, (org.joda.time.ReadablePartial) localTime22, periodType23);
        int int25 = localTime22.getMillisOfDay();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(10L, chronology27);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.weekyear();
        int int30 = dateTime28.get(dateTimeFieldType29);
        boolean boolean31 = localTime22.equals((java.lang.Object) dateTimeFieldType29);
        int int32 = dateTime12.get(dateTimeFieldType29);
        org.joda.time.DateTime dateTime34 = dateTime12.minusYears((int) 'a');
        org.joda.time.DateTime.Property property35 = dateTime34.monthOfYear();
        org.joda.time.DurationField durationField36 = property35.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property35.getFieldType();
        java.lang.String str38 = dateTimeFieldType37.getName();
        boolean boolean39 = localTime11.isSupported(dateTimeFieldType37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField36", Math.signum(durationField6.compareTo(durationField36)) == -Math.signum(durationField36.compareTo(durationField6)));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes(435L);
        long long6 = duration5.getMillis();
        org.joda.time.Duration duration8 = duration5.minus((long) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime2.minus((org.joda.time.ReadableDuration) duration5);
        org.joda.time.Duration duration12 = duration5.withDurationAdded((long) 61, 873);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 12);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now(dateTimeZone15);
        int int17 = localDate16.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 12);
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now(dateTimeZone20);
        int int22 = localDate21.getMonthOfYear();
        org.joda.time.Chronology chronology23 = localDate21.getChronology();
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate16, (org.joda.time.ReadablePartial) localDate21);
        org.joda.time.DateTime dateTime25 = localDate21.toDateTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime25.toMutableDateTimeISO();
        int int27 = mutableDateTime26.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withFieldAdded(durationFieldType30, 1970);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime();
        org.joda.time.Interval interval37 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTime dateTime38 = interval37.getEnd();
        org.joda.time.Interval interval39 = interval37.toInterval();
        long long40 = interval37.getEndMillis();
        java.lang.String str41 = interval37.toString();
        org.joda.time.DateTime dateTime42 = interval37.getStart();
        org.joda.time.Chronology chronology43 = interval37.getChronology();
        org.joda.time.Period period44 = new org.joda.time.Period(0L, 1645514152681L, chronology43);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime32.minus((org.joda.time.ReadablePeriod) period44);
        org.joda.time.DurationFieldType[] durationFieldTypeArray46 = period44.getFieldTypes();
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.forFields(durationFieldTypeArray46);
        org.joda.time.PeriodType periodType48 = periodType47.withMonthsRemoved();
        org.joda.time.PeriodType periodType49 = org.joda.time.DateTimeUtils.getPeriodType(periodType47);
        org.joda.time.PeriodType periodType50 = periodType47.withSecondsRemoved();
        org.joda.time.Period period51 = duration12.toPeriodFrom((org.joda.time.ReadableInstant) mutableDateTime26, periodType47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant13 = instant3.withDurationAdded(1645514154223L, 100);
        org.joda.time.Instant instant15 = instant3.minus((long) (byte) -1);
        org.joda.time.DateTime dateTime16 = instant3.toDateTimeISO();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getChronology(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.hourOfHalfday();
        org.joda.time.Chronology chronology20 = org.joda.time.DateTimeUtils.getChronology(chronology18);
        org.joda.time.DateTimeField dateTimeField21 = chronology20.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.hourOfDay();
        org.joda.time.DurationField durationField23 = chronology20.years();
        org.joda.time.DateTime dateTime24 = instant3.toDateTime(chronology20);
        long long28 = chronology20.add(27424804L, 1645514614892L, 213);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) ' ', dateTimeZone1);
        int int3 = dateTime2.getYearOfCentury();
        org.joda.time.YearMonthDay yearMonthDay4 = dateTime2.toYearMonthDay();
        org.joda.time.Chronology chronology5 = dateTime2.getChronology();
        int int6 = dateTime2.getWeekOfWeekyear();
        boolean boolean7 = dateTime2.isEqualNow();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.Interval interval10 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology12.hourOfHalfday();
        org.joda.time.DateTime dateTime14 = dateTime8.toDateTime(chronology12);
        org.joda.time.DateTime.Property property15 = dateTime8.monthOfYear();
        org.joda.time.DateTime dateTime17 = dateTime8.plusMonths(38);
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime21 = dateTime19.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant22 = dateTime21.toInstant();
        org.joda.time.MutableDateTime mutableDateTime23 = instant22.toMutableDateTimeISO();
        org.joda.time.Duration duration25 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime();
        org.joda.time.Interval interval28 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableInstant) dateTime27);
        int int29 = dateTime26.getMinuteOfDay();
        org.joda.time.Period period31 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime32 = dateTime26.plus((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = dateTime26.toDateTime(chronology33);
        org.joda.time.DateTime dateTime36 = dateTime26.minus((long) 10);
        org.joda.time.Period period37 = duration25.toPeriodFrom((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property39 = dateTime38.era();
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime42 = dateTime40.plusWeeks((int) (byte) 1);
        int int43 = property39.compareTo((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime();
        org.joda.time.Interval interval46 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableInstant) dateTime45);
        boolean boolean48 = interval46.isAfter((long) 10);
        org.joda.time.Duration duration49 = interval46.toDuration();
        org.joda.time.Duration duration52 = duration49.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval53 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableDuration) duration52);
        org.joda.time.Duration duration55 = duration25.withDurationAdded((org.joda.time.ReadableDuration) duration52, 26160257);
        org.joda.time.Instant instant56 = instant22.plus((org.joda.time.ReadableDuration) duration52);
        long long57 = instant22.getMillis();
        org.joda.time.MutableDateTime mutableDateTime58 = instant22.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime59 = instant22.toMutableDateTime();
        org.joda.time.Period period60 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) instant22);
        org.joda.time.Chronology chronology61 = instant22.getChronology();
        org.joda.time.DurationField durationField62 = chronology61.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant22", (dateTime21.compareTo(instant22) == 0) == dateTime21.equals(instant22));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType5 = periodType4.withSecondsRemoved();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.Interval interval8 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.hourOfHalfday();
        org.joda.time.DateTime dateTime12 = dateTime6.toDateTime(chronology10);
        org.joda.time.Period period13 = new org.joda.time.Period((long) 1, (long) ' ', periodType5, chronology10);
        org.joda.time.DurationField durationField14 = chronology10.weeks();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((long) 10, 1645514153096L, chronology10);
        long long16 = interval15.toDurationMillis();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime21 = dateTime18.minusMonths(26165);
        org.joda.time.Period period23 = new org.joda.time.Period((long) '#');
        int int25 = period23.getValue(0);
        org.joda.time.Period period26 = period23.normalizedStandard();
        org.joda.time.Period period28 = period23.plusSeconds((int) ' ');
        org.joda.time.DateTime dateTime29 = dateTime21.minus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Period period31 = period28.plusYears(0);
        org.joda.time.Interval interval32 = interval15.withPeriodAfterStart((org.joda.time.ReadablePeriod) period31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime35 = dateTime33.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant36 = dateTime35.toInstant();
        org.joda.time.MutableDateTime mutableDateTime37 = instant36.toMutableDateTimeISO();
        org.joda.time.Duration duration39 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime();
        org.joda.time.Interval interval42 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableInstant) dateTime41);
        int int43 = dateTime40.getMinuteOfDay();
        org.joda.time.Period period45 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime46 = dateTime40.plus((org.joda.time.ReadablePeriod) period45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTime dateTime48 = dateTime40.toDateTime(chronology47);
        org.joda.time.DateTime dateTime50 = dateTime40.minus((long) 10);
        org.joda.time.Period period51 = duration39.toPeriodFrom((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property53 = dateTime52.era();
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime56 = dateTime54.plusWeeks((int) (byte) 1);
        int int57 = property53.compareTo((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime();
        org.joda.time.Interval interval60 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime58, (org.joda.time.ReadableInstant) dateTime59);
        boolean boolean62 = interval60.isAfter((long) 10);
        org.joda.time.Duration duration63 = interval60.toDuration();
        org.joda.time.Duration duration66 = duration63.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval67 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime54, (org.joda.time.ReadableDuration) duration66);
        org.joda.time.Duration duration69 = duration39.withDurationAdded((org.joda.time.ReadableDuration) duration66, 26160257);
        org.joda.time.Instant instant70 = instant36.plus((org.joda.time.ReadableDuration) duration66);
        org.joda.time.MutableInterval mutableInterval71 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) period31, (org.joda.time.ReadableInstant) instant70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and instant36", (dateTime35.compareTo(instant36) == 0) == dateTime35.equals(instant36));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Duration duration6 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        int int10 = dateTime7.getMinuteOfDay();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime13 = dateTime7.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime7.toDateTime(chronology14);
        org.joda.time.DateTime dateTime17 = dateTime7.minus((long) 10);
        org.joda.time.Period period18 = duration6.toPeriodFrom((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property20 = dateTime19.era();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.plusWeeks((int) (byte) 1);
        int int24 = property20.compareTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime26);
        boolean boolean29 = interval27.isAfter((long) 10);
        org.joda.time.Duration duration30 = interval27.toDuration();
        org.joda.time.Duration duration33 = duration30.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableDuration) duration33);
        org.joda.time.Duration duration36 = duration6.withDurationAdded((org.joda.time.ReadableDuration) duration33, 26160257);
        org.joda.time.Instant instant37 = instant3.plus((org.joda.time.ReadableDuration) duration33);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime();
        org.joda.time.Interval interval40 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime38, (org.joda.time.ReadableInstant) dateTime39);
        int int41 = dateTime38.getMinuteOfDay();
        org.joda.time.Period period43 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime44 = dateTime38.plus((org.joda.time.ReadablePeriod) period43);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = dateTime38.toDateTime(chronology45);
        org.joda.time.DateTime dateTime48 = dateTime38.minus((long) 10);
        org.joda.time.DateTime dateTime50 = dateTime38.minusHours(7);
        int int51 = dateTime38.getCenturyOfEra();
        org.joda.time.MutableDateTime mutableDateTime52 = dateTime38.toMutableDateTime();
        org.joda.time.Period period54 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Duration duration56 = period54.toDurationFrom(readableInstant55);
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime52, (org.joda.time.ReadableDuration) duration56, periodType57);
        long long59 = duration56.getMillis();
        boolean boolean60 = duration33.isShorterThan((org.joda.time.ReadableDuration) duration56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        java.lang.String str3 = interval2.toString();
        org.joda.time.DateTime dateTime4 = interval2.getEnd();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusWeeks((int) (byte) 10);
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        long long12 = duration11.getMillis();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.plus((org.joda.time.ReadableDuration) duration11);
        boolean boolean14 = interval2.equals((java.lang.Object) duration11);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime16);
        boolean boolean19 = interval17.isAfter((long) 10);
        org.joda.time.Interval interval20 = interval2.overlap((org.joda.time.ReadableInterval) interval17);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.months();
        org.joda.time.Period period22 = interval2.toPeriod(periodType21);
        org.joda.time.DateTime dateTime23 = interval2.getStart();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.Interval interval26 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime27 = interval26.getEnd();
        org.joda.time.Interval interval28 = interval26.toInterval();
        org.joda.time.MutableInterval mutableInterval29 = interval28.toMutableInterval();
        boolean boolean30 = interval2.isBefore((org.joda.time.ReadableInterval) interval28);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime32);
        int int34 = dateTime31.getMinuteOfDay();
        org.joda.time.Period period36 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime37 = dateTime31.plus((org.joda.time.ReadablePeriod) period36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = dateTime31.toDateTime(chronology38);
        org.joda.time.DateTime dateTime41 = dateTime31.plusWeeks(3);
        org.joda.time.DateTime dateTime43 = dateTime41.plusHours(20);
        org.joda.time.Interval interval44 = interval28.withEnd((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.ReadableInterval readableInterval45 = org.joda.time.DateTimeUtils.getReadableInterval((org.joda.time.ReadableInterval) interval28);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) ' ', dateTimeZone47);
        int int49 = dateTime48.getYearOfCentury();
        org.joda.time.DateTime.Property property50 = dateTime48.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = property50.getFieldType();
        org.joda.time.Interval interval52 = property50.toInterval();
        org.joda.time.MutableInterval mutableInterval53 = interval52.toMutableInterval();
        org.joda.time.Duration duration54 = interval52.toDuration();
        org.joda.time.Period period55 = duration54.toPeriod();
        org.joda.time.Interval interval56 = interval28.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration54);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime59 = dateTime57.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant60 = dateTime59.toInstant();
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = localDateTime61.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime61.plusYears(26151451);
        org.joda.time.Period period67 = new org.joda.time.Period((long) '#');
        int int69 = period67.getValue(0);
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime();
        org.joda.time.Interval interval72 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime70, (org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.Duration duration73 = period67.toDurationTo((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime65.withPeriodAdded((org.joda.time.ReadablePeriod) period67, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean77 = localDateTime65.isSupported(dateTimeFieldType76);
        int int78 = instant60.get(dateTimeFieldType76);
        org.joda.time.Duration duration80 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime82 = new org.joda.time.DateTime();
        org.joda.time.Interval interval83 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime81, (org.joda.time.ReadableInstant) dateTime82);
        int int84 = dateTime81.getMinuteOfDay();
        org.joda.time.Period period86 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime87 = dateTime81.plus((org.joda.time.ReadablePeriod) period86);
        org.joda.time.Chronology chronology88 = null;
        org.joda.time.DateTime dateTime89 = dateTime81.toDateTime(chronology88);
        org.joda.time.DateTime dateTime91 = dateTime81.minus((long) 10);
        org.joda.time.Period period92 = duration80.toPeriodFrom((org.joda.time.ReadableInstant) dateTime91);
        org.joda.time.Instant instant93 = instant60.plus((org.joda.time.ReadableDuration) duration80);
        org.joda.time.Interval interval94 = interval28.withEnd((org.joda.time.ReadableInstant) instant93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime59 and instant60", (dateTime59.compareTo(instant60) == 0) == dateTime59.equals(instant60));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.millisOfDay();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        int int5 = dateTime2.getMinuteOfDay();
        int int6 = dateTime2.getYearOfCentury();
        int int7 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime9 = dateTime2.minusWeeks((int) (short) 0);
        boolean boolean10 = dateTime0.isAfter((org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.DateTime.Property property11 = dateTime0.weekOfWeekyear();
        org.joda.time.DateTime dateTime12 = property11.roundHalfFloorCopy();
        org.joda.time.TimeOfDay timeOfDay13 = dateTime12.toTimeOfDay();
        org.joda.time.Instant instant14 = dateTime12.toInstant();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) (-1), chronology16);
        org.joda.time.Period period18 = period17.toPeriod();
        int int19 = period18.size();
        int int20 = period18.getMinutes();
        int[] intArray21 = period18.getValues();
        org.joda.time.Duration duration22 = period18.toStandardDuration();
        org.joda.time.Duration duration24 = duration22.plus(1645514153208L);
        org.joda.time.Instant instant25 = instant14.minus((org.joda.time.ReadableDuration) duration22);
        org.joda.time.Instant instant28 = instant25.withDurationAdded((long) 52665654, 878);
        org.joda.time.Instant instant30 = instant25.plus(1645514466720L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant14", (dateTime12.compareTo(instant14) == 0) == dateTime12.equals(instant14));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(1645514359213L);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.MutableDateTime mutableDateTime6 = instant5.toMutableDateTimeISO();
        org.joda.time.Instant instant9 = instant5.withDurationAdded((-1L), 21);
        org.joda.time.Instant instant11 = instant5.minus((long) 7575);
        org.joda.time.Instant instant12 = instant5.toInstant();
        java.lang.Object obj13 = null;
        org.joda.time.Interval interval14 = new org.joda.time.Interval(obj13);
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.dayTime();
        java.lang.String str16 = periodType15.toString();
        org.joda.time.Period period17 = interval14.toPeriod(periodType15);
        org.joda.time.PeriodType periodType18 = periodType15.withMonthsRemoved();
        org.joda.time.Period period19 = duration1.toPeriodTo((org.joda.time.ReadableInstant) instant12, periodType15);
        org.joda.time.Chronology chronology20 = instant12.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant12", (dateTime4.compareTo(instant12) == 0) == dateTime4.equals(instant12));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) ' ', dateTimeZone1);
        int int3 = dateTime2.getYearOfCentury();
        org.joda.time.YearMonthDay yearMonthDay4 = dateTime2.toYearMonthDay();
        org.joda.time.Chronology chronology5 = dateTime2.getChronology();
        int int6 = dateTime2.getWeekOfWeekyear();
        boolean boolean7 = dateTime2.isEqualNow();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.Interval interval10 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology12.hourOfHalfday();
        org.joda.time.DateTime dateTime14 = dateTime8.toDateTime(chronology12);
        org.joda.time.DateTime.Property property15 = dateTime8.monthOfYear();
        org.joda.time.DateTime dateTime17 = dateTime8.plusMonths(38);
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime21 = dateTime19.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant22 = dateTime21.toInstant();
        org.joda.time.MutableDateTime mutableDateTime23 = instant22.toMutableDateTimeISO();
        org.joda.time.Duration duration25 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime();
        org.joda.time.Interval interval28 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableInstant) dateTime27);
        int int29 = dateTime26.getMinuteOfDay();
        org.joda.time.Period period31 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime32 = dateTime26.plus((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = dateTime26.toDateTime(chronology33);
        org.joda.time.DateTime dateTime36 = dateTime26.minus((long) 10);
        org.joda.time.Period period37 = duration25.toPeriodFrom((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property39 = dateTime38.era();
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime42 = dateTime40.plusWeeks((int) (byte) 1);
        int int43 = property39.compareTo((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime();
        org.joda.time.Interval interval46 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableInstant) dateTime45);
        boolean boolean48 = interval46.isAfter((long) 10);
        org.joda.time.Duration duration49 = interval46.toDuration();
        org.joda.time.Duration duration52 = duration49.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval53 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableDuration) duration52);
        org.joda.time.Duration duration55 = duration25.withDurationAdded((org.joda.time.ReadableDuration) duration52, 26160257);
        org.joda.time.Instant instant56 = instant22.plus((org.joda.time.ReadableDuration) duration52);
        long long57 = instant22.getMillis();
        org.joda.time.MutableDateTime mutableDateTime58 = instant22.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime59 = instant22.toMutableDateTime();
        org.joda.time.Period period60 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) instant22);
        org.joda.time.Days days61 = period60.toStandardDays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant22", (dateTime21.compareTo(instant22) == 0) == dateTime21.equals(instant22));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.Interval interval3 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) dateTime2);
        boolean boolean5 = interval3.isAfter((long) 10);
        org.joda.time.Duration duration6 = interval3.toDuration();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(10L, chronology8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        int int11 = dateTime9.get(dateTimeFieldType10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 10, chronology13);
        boolean boolean15 = dateTime9.isEqual((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property17 = dateTime16.era();
        boolean boolean18 = dateTime14.isBefore((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType22 = periodType21.withSecondsRemoved();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.Interval interval25 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Chronology chronology27 = org.joda.time.DateTimeUtils.getChronology(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology27.hourOfHalfday();
        org.joda.time.DateTime dateTime29 = dateTime23.toDateTime(chronology27);
        org.joda.time.Period period30 = new org.joda.time.Period((long) 1, (long) ' ', periodType22, chronology27);
        org.joda.time.DateTime dateTime31 = dateTime16.plus((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Interval interval32 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration6, (org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Instant instant33 = instant0.minus((org.joda.time.ReadableDuration) duration6);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime();
        org.joda.time.Interval interval36 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime34, (org.joda.time.ReadableInstant) dateTime35);
        int int37 = dateTime34.getMinuteOfDay();
        org.joda.time.Period period39 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime40 = dateTime34.plus((org.joda.time.ReadablePeriod) period39);
        int int41 = dateTime34.getSecondOfMinute();
        org.joda.time.DateTime dateTime42 = dateTime34.toDateTimeISO();
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.minusWeeks((int) (byte) 10);
        org.joda.time.Period period48 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Duration duration50 = period48.toDurationFrom(readableInstant49);
        long long51 = duration50.getMillis();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime46.plus((org.joda.time.ReadableDuration) duration50);
        mutableInterval43.setDurationAfterStart((org.joda.time.ReadableDuration) duration50);
        org.joda.time.Duration duration54 = mutableInterval43.toDuration();
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.minusWeeks((int) (byte) 10);
        org.joda.time.Period period59 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Duration duration61 = period59.toDurationFrom(readableInstant60);
        long long62 = duration61.getMillis();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime57.plus((org.joda.time.ReadableDuration) duration61);
        long long64 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration61);
        boolean boolean65 = duration54.isShorterThan((org.joda.time.ReadableDuration) duration61);
        org.joda.time.Interval interval66 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime42, (org.joda.time.ReadableDuration) duration61);
        org.joda.time.Instant instant67 = instant33.minus((org.joda.time.ReadableDuration) duration61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant33 and dateTime1", (instant33.compareTo(dateTime1) == 0) == instant33.equals(dateTime1));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.millisOfDay();
        org.joda.time.DateTime dateTime2 = dateTime0.withTimeAtStartOfDay();
        int int3 = dateTime0.getMinuteOfHour();
        org.joda.time.DateTime dateTime5 = dateTime0.plusMinutes(52485607);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = dateTime6.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.MutableDateTime mutableDateTime10 = instant9.toMutableDateTimeISO();
        org.joda.time.Instant instant13 = instant9.withDurationAdded((-1L), 21);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) instant9);
        java.lang.Object obj15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property17 = dateTime16.millisOfDay();
        org.joda.time.DateTime dateTime18 = dateTime16.withTimeAtStartOfDay();
        org.joda.time.Period period20 = new org.joda.time.Period((long) '#');
        int int22 = period20.getValue(0);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.Interval interval25 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Duration duration26 = period20.toDurationTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Chronology chronology27 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTimeField dateTimeField28 = chronology27.millisOfDay();
        org.joda.time.Period period29 = new org.joda.time.Period(obj15, chronology27);
        org.joda.time.Period period31 = period29.withMonths(474);
        org.joda.time.Period period32 = period29.toPeriod();
        org.joda.time.Period period34 = period32.withMillis(26228534);
        org.joda.time.PeriodType periodType35 = period32.getPeriodType();
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) instant9, periodType35);
        org.joda.time.PeriodType periodType37 = periodType35.withHoursRemoved();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant9", (dateTime8.compareTo(instant9) == 0) == dateTime8.equals(instant9));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) 54);
        org.joda.time.Minutes minutes6 = duration5.toStandardMinutes();
        long long7 = duration5.getStandardMinutes();
        org.joda.time.Instant instant9 = instant3.withDurationAdded((org.joda.time.ReadableDuration) duration5, 26171);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime.Property property13 = dateTime11.millisOfDay();
        org.joda.time.DateTime dateTime14 = property13.roundCeilingCopy();
        int int15 = dateTime14.getSecondOfDay();
        int int16 = dateTime14.getSecondOfDay();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property18 = dateTime17.millisOfDay();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.Interval interval21 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableInstant) dateTime20);
        int int22 = dateTime19.getMinuteOfDay();
        int int23 = dateTime19.getYearOfCentury();
        int int24 = dateTime19.getDayOfMonth();
        org.joda.time.DateTime dateTime26 = dateTime19.minusWeeks((int) (short) 0);
        boolean boolean27 = dateTime17.isAfter((org.joda.time.ReadableInstant) dateTime19);
        int int28 = dateTime19.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property29 = dateTime19.dayOfYear();
        org.joda.time.DateTime dateTime31 = dateTime19.withEra(0);
        org.joda.time.DateTime dateTime33 = dateTime19.withDayOfYear((int) '#');
        org.joda.time.Duration duration34 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime();
        org.joda.time.Interval interval37 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateTime36);
        int int38 = dateTime35.getMinuteOfDay();
        org.joda.time.Period period40 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime41 = dateTime35.plus((org.joda.time.ReadablePeriod) period40);
        int int42 = dateTime35.getSecondOfMinute();
        org.joda.time.DateTime dateTime43 = dateTime35.toDateTimeISO();
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.minusWeeks((int) (byte) 10);
        org.joda.time.Period period49 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = period49.toDurationFrom(readableInstant50);
        long long52 = duration51.getMillis();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime47.plus((org.joda.time.ReadableDuration) duration51);
        mutableInterval44.setDurationAfterStart((org.joda.time.ReadableDuration) duration51);
        org.joda.time.Duration duration55 = mutableInterval44.toDuration();
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.minusWeeks((int) (byte) 10);
        org.joda.time.Period period60 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Duration duration62 = period60.toDurationFrom(readableInstant61);
        long long63 = duration62.getMillis();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime58.plus((org.joda.time.ReadableDuration) duration62);
        long long65 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration62);
        boolean boolean66 = duration55.isShorterThan((org.joda.time.ReadableDuration) duration62);
        org.joda.time.Interval interval67 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableDuration) duration62);
        org.joda.time.DateTime dateTime69 = dateTime43.minusWeeks((int) (byte) 100);
        org.joda.time.MutableInterval mutableInterval70 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration34, (org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Duration duration72 = org.joda.time.Duration.standardSeconds((long) 86399999);
        boolean boolean73 = duration34.isShorterThan((org.joda.time.ReadableDuration) duration72);
        org.joda.time.Period period74 = duration34.toPeriod();
        org.joda.time.Instant instant75 = instant3.minus((org.joda.time.ReadableDuration) duration34);
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.Period period77 = duration34.toPeriodTo(readableInstant76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.era();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.plusWeeks((int) (byte) 1);
        int int5 = property1.compareTo((org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.Interval interval8 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime7);
        boolean boolean10 = interval8.isAfter((long) 10);
        org.joda.time.Duration duration11 = interval8.toDuration();
        org.joda.time.Duration duration14 = duration11.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval15 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableDuration) duration14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.plusWeeks((int) (byte) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeUtils.getZone(dateTimeZone20);
        java.lang.String str23 = dateTimeZone21.getName((long) ' ');
        org.joda.time.DateTime dateTime24 = dateTime18.toDateTime(dateTimeZone21);
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.time();
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration14, (org.joda.time.ReadableInstant) dateTime24, periodType25);
        org.joda.time.DateTime dateTime28 = dateTime24.plusMonths((int) (byte) 0);
        org.joda.time.DateMidnight dateMidnight29 = dateTime24.toDateMidnight();
        org.joda.time.Instant instant30 = dateMidnight29.toInstant();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime33 = dateTime31.plusWeeks((int) (byte) 1);
        org.joda.time.DateTime.Property property34 = dateTime33.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeUtils.getZone(dateTimeZone35);
        java.lang.String str38 = dateTimeZone36.getName((long) ' ');
        org.joda.time.DateTime dateTime39 = dateTime33.toDateTime(dateTimeZone36);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property41 = dateTime40.millisOfDay();
        org.joda.time.DateTime dateTime42 = dateTime40.withTimeAtStartOfDay();
        boolean boolean43 = dateTime33.isEqual((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime.Property property44 = dateTime42.weekyear();
        long long45 = dateTime42.getMillis();
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property47 = dateTime46.millisOfDay();
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime();
        org.joda.time.Interval interval50 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime48, (org.joda.time.ReadableInstant) dateTime49);
        int int51 = dateTime48.getMinuteOfDay();
        int int52 = dateTime48.getYearOfCentury();
        int int53 = dateTime48.getDayOfMonth();
        org.joda.time.DateTime dateTime55 = dateTime48.minusWeeks((int) (short) 0);
        boolean boolean56 = dateTime46.isAfter((org.joda.time.ReadableInstant) dateTime48);
        int int57 = dateTime48.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property58 = dateTime48.dayOfYear();
        org.joda.time.DateTime dateTime60 = dateTime48.withEra(0);
        org.joda.time.DateTime dateTime62 = dateTime48.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime64 = dateTime48.plusMonths(10074);
        boolean boolean65 = dateTime42.isEqual((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.ReadablePartial readablePartial66 = null;
        org.joda.time.DateTime dateTime67 = dateTime42.withFields(readablePartial66);
        boolean boolean68 = instant30.isAfter((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime();
        org.joda.time.Interval interval71 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime69, (org.joda.time.ReadableInstant) dateTime70);
        int int72 = dateTime69.getMinuteOfDay();
        org.joda.time.Period period74 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime75 = dateTime69.plus((org.joda.time.ReadablePeriod) period74);
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime69, chronology76);
        org.joda.time.DateTimeZone dateTimeZone78 = dateTime69.getZone();
        boolean boolean79 = instant30.isEqual((org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.DateTime dateTime81 = dateTime69.withWeekyear((int) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight29 and instant30", (dateMidnight29.compareTo(instant30) == 0) == dateMidnight29.equals(instant30));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.DateTimeZone dateTimeZone11 = instant3.getZone();
        boolean boolean12 = instant3.isAfterNow();
        org.joda.time.Instant instant14 = instant3.minus((long) 52);
        org.joda.time.DateTime dateTime15 = instant3.toDateTime();
        org.joda.time.Duration duration17 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.Interval interval20 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) dateTime19);
        int int21 = dateTime18.getMinuteOfDay();
        org.joda.time.Period period23 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime24 = dateTime18.plus((org.joda.time.ReadablePeriod) period23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = dateTime18.toDateTime(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime18.minus((long) 10);
        org.joda.time.Period period29 = duration17.toPeriodFrom((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Duration duration31 = org.joda.time.Duration.standardMinutes(3786912000000L);
        org.joda.time.Duration duration32 = duration17.plus((org.joda.time.ReadableDuration) duration31);
        org.joda.time.Instant instant33 = instant3.minus((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Period period35 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Duration duration37 = period35.toDurationFrom(readableInstant36);
        org.joda.time.Seconds seconds38 = duration37.toStandardSeconds();
        org.joda.time.Duration duration41 = duration37.withDurationAdded((long) 32772, (int) (byte) 10);
        java.lang.String str42 = duration37.toString();
        org.joda.time.Period period44 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = period44.toDurationFrom(readableInstant45);
        boolean boolean47 = duration37.isLongerThan((org.joda.time.ReadableDuration) duration46);
        org.joda.time.Duration duration49 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime();
        org.joda.time.Interval interval52 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime50, (org.joda.time.ReadableInstant) dateTime51);
        int int53 = dateTime50.getMinuteOfDay();
        org.joda.time.Period period55 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime56 = dateTime50.plus((org.joda.time.ReadablePeriod) period55);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = dateTime50.toDateTime(chronology57);
        org.joda.time.DateTime dateTime60 = dateTime50.minus((long) 10);
        org.joda.time.Period period61 = duration49.toPeriodFrom((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property63 = dateTime62.era();
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime66 = dateTime64.plusWeeks((int) (byte) 1);
        int int67 = property63.compareTo((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime();
        org.joda.time.Interval interval70 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime68, (org.joda.time.ReadableInstant) dateTime69);
        boolean boolean72 = interval70.isAfter((long) 10);
        org.joda.time.Duration duration73 = interval70.toDuration();
        org.joda.time.Duration duration76 = duration73.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval77 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime64, (org.joda.time.ReadableDuration) duration76);
        org.joda.time.Duration duration79 = duration49.withDurationAdded((org.joda.time.ReadableDuration) duration76, 26160257);
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime();
        org.joda.time.Interval interval82 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime80, (org.joda.time.ReadableInstant) dateTime81);
        boolean boolean84 = interval82.isAfter((long) 10);
        org.joda.time.Duration duration85 = interval82.toDuration();
        boolean boolean86 = duration79.isLongerThan((org.joda.time.ReadableDuration) duration85);
        java.lang.String str87 = duration79.toString();
        int int88 = duration46.compareTo((org.joda.time.ReadableDuration) duration79);
        org.joda.time.Duration duration90 = duration79.withMillis(3291028667875L);
        org.joda.time.Instant instant91 = instant33.minus((org.joda.time.ReadableDuration) duration79);
        org.joda.time.DateTime dateTime92 = instant91.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime4.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusYears(26151451);
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#');
        int int12 = period10.getValue(0);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Duration duration16 = period10.toDurationTo((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime8.withPeriodAdded((org.joda.time.ReadablePeriod) period10, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean20 = localDateTime8.isSupported(dateTimeFieldType19);
        int int21 = instant3.get(dateTimeFieldType19);
        org.joda.time.MutableDateTime mutableDateTime22 = instant3.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime23 = instant3.toDateTimeISO();
        org.joda.time.DateTime dateTime25 = dateTime23.plusSeconds((-775249));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Duration duration6 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        int int10 = dateTime7.getMinuteOfDay();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime13 = dateTime7.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime7.toDateTime(chronology14);
        org.joda.time.DateTime dateTime17 = dateTime7.minus((long) 10);
        org.joda.time.Period period18 = duration6.toPeriodFrom((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property20 = dateTime19.era();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.plusWeeks((int) (byte) 1);
        int int24 = property20.compareTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime26);
        boolean boolean29 = interval27.isAfter((long) 10);
        org.joda.time.Duration duration30 = interval27.toDuration();
        org.joda.time.Duration duration33 = duration30.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableDuration) duration33);
        org.joda.time.Duration duration36 = duration6.withDurationAdded((org.joda.time.ReadableDuration) duration33, 26160257);
        org.joda.time.Instant instant37 = instant3.plus((org.joda.time.ReadableDuration) duration33);
        long long38 = instant3.getMillis();
        long long39 = instant3.getMillis();
        org.joda.time.MutableDateTime mutableDateTime40 = instant3.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime();
        org.joda.time.Interval interval43 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime41, (org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime dateTime44 = interval43.getEnd();
        org.joda.time.Interval interval45 = interval43.toInterval();
        org.joda.time.Interval interval47 = interval45.withStartMillis((long) (short) 1);
        org.joda.time.Chronology chronology48 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInterval) interval47);
        org.joda.time.DateTime dateTime49 = interval47.getEnd();
        org.joda.time.DateTime dateTime51 = dateTime49.withYearOfEra(26226876);
        int int52 = instant3.compareTo((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval((long) 37433962, 3291028772161L);
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property57 = dateTime56.era();
        org.joda.time.DateTime dateTime59 = dateTime56.minusSeconds(13);
        int int60 = dateTime59.getHourOfDay();
        boolean boolean62 = dateTime59.isBefore(26153423L);
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeUtils.getZone(dateTimeZone64);
        java.lang.String str67 = dateTimeZone65.getName((long) ' ');
        java.lang.String str69 = dateTimeZone65.getName((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime(0L, dateTimeZone65);
        long long73 = dateTimeZone65.adjustOffset(1645514153208L, false);
        long long75 = dateTimeZone65.convertUTCToLocal((long) (short) 100);
        boolean boolean76 = dateTimeZone65.isFixed();
        org.joda.time.DateTime dateTime77 = dateTime59.withZoneRetainFields(dateTimeZone65);
        mutableInterval55.setStart((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime(10L, chronology80);
        org.joda.time.DateTimeFieldType dateTimeFieldType82 = org.joda.time.DateTimeFieldType.weekyear();
        int int83 = dateTime81.get(dateTimeFieldType82);
        java.lang.String str84 = dateTimeFieldType82.toString();
        boolean boolean85 = dateTime59.isSupported(dateTimeFieldType82);
        boolean boolean86 = dateTime49.isSupported(dateTimeFieldType82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.era();
        org.joda.time.DateTime.Property property2 = dateTime0.weekyear();
        org.joda.time.DateTime dateTime4 = property2.setCopy(453);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        java.lang.String str8 = dateTimeZone6.getName((long) ' ');
        java.lang.String str10 = dateTimeZone6.getName((long) (short) -1);
        org.joda.time.DateTime dateTime11 = dateTime4.withZoneRetainFields(dateTimeZone6);
        java.util.TimeZone timeZone12 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime14);
        int int16 = dateTime13.getMinuteOfDay();
        int int17 = dateTime13.getYearOfCentury();
        int int18 = dateTime13.getDayOfMonth();
        org.joda.time.DateTime dateTime20 = dateTime13.minusWeeks((int) (short) 0);
        int int21 = dateTime13.getYear();
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder23 = builder22.clearExtensions();
        java.util.Locale.Builder builder24 = builder23.clearExtensions();
        java.util.Locale locale25 = builder24.build();
        java.util.Calendar calendar26 = dateTime13.toCalendar(locale25);
        java.util.Locale.setDefault(locale25);
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone12, locale25);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Chronology chronology30 = org.joda.time.DateTimeUtils.getChronology(chronology29);
        org.joda.time.DurationField durationField31 = chronology30.years();
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(chronology30);
        org.joda.time.DateTimeField dateTimeField33 = chronology30.dayOfWeek();
        java.util.Locale locale35 = java.util.Locale.JAPAN;
        java.lang.String str36 = dateTimeField33.getAsText((long) 'x', locale35);
        org.joda.time.DurationField durationField37 = dateTimeField33.getLeapDurationField();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Chronology chronology40 = org.joda.time.DateTimeUtils.getChronology(chronology39);
        org.joda.time.DurationField durationField41 = chronology40.years();
        org.joda.time.DateTimeField dateTimeField42 = chronology40.centuryOfEra();
        java.util.Locale locale44 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet45 = locale44.getExtensionKeys();
        java.lang.String str46 = dateTimeField42.getAsText((int) (byte) 0, locale44);
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(locale44);
        java.lang.String str48 = locale44.getDisplayName();
        java.lang.String str49 = dateTimeField33.getAsShortText(1645514171443L, locale44);
        java.util.Locale locale50 = java.util.Locale.CANADA;
        java.lang.String str51 = locale50.getISO3Country();
        int int52 = dateTimeField33.getMaximumShortTextLength(locale50);
        java.lang.String str53 = timeZone12.getDisplayName(locale50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar28 and calendar47", (calendar28.compareTo(calendar47) == 0) == calendar28.equals(calendar47));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime6 = dateTime0.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = dateTime0.toDateTime(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime0.minus((long) 10);
        org.joda.time.DateTime dateTime12 = dateTime0.minusHours(7);
        org.joda.time.DateTime.Property property13 = dateTime0.dayOfWeek();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime15);
        int int17 = dateTime14.getMinuteOfDay();
        int int18 = dateTime14.getYearOfCentury();
        int int19 = dateTime14.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property21 = dateTime20.millisOfDay();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) dateTime23);
        int int25 = dateTime22.getMinuteOfDay();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(10L, chronology27);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.weekyear();
        int int30 = dateTime28.get(dateTimeFieldType29);
        int int31 = dateTime22.get(dateTimeFieldType29);
        boolean boolean32 = dateTime20.isEqual((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime.Property property33 = dateTime22.weekyear();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeUtils.getZone(dateTimeZone34);
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((java.lang.Object) dateTime22, dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime14.toMutableDateTime(dateTimeZone35);
        boolean boolean38 = dateTime0.isEqual((org.joda.time.ReadableInstant) mutableDateTime37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        boolean boolean40 = mutableDateTime37.isSupported(dateTimeFieldType39);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime43 = dateTime41.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant44 = dateTime43.toInstant();
        org.joda.time.DateTime dateTime45 = instant44.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime46 = instant44.toMutableDateTimeISO();
        boolean boolean47 = mutableDateTime37.isEqual((org.joda.time.ReadableInstant) instant44);
        org.joda.time.Instant instant48 = instant44.toInstant();
        org.joda.time.Instant instant51 = instant44.withDurationAdded(2880000L, 26299704);
        org.joda.time.MutableDateTime mutableDateTime52 = instant51.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime43 and instant44", (dateTime43.compareTo(instant44) == 0) == dateTime43.equals(instant44));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(10L, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.weekyear();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#');
        int int8 = period6.getValue(0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Duration duration12 = period6.toDurationTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadablePeriod) period6);
        mutableInterval13.setStartMillis((long) (short) 0);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant19 = dateTime18.toInstant();
        org.joda.time.Instant instant20 = instant19.toInstant();
        org.joda.time.Instant instant22 = instant20.minus(1645514397679L);
        org.joda.time.ReadableInstant readableInstant23 = null;
        mutableInterval13.setInterval((org.joda.time.ReadableInstant) instant22, readableInstant23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant19", (dateTime18.compareTo(instant19) == 0) == dateTime18.equals(instant19));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("zh_TW");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        int int5 = dateTime2.getMinuteOfDay();
        int int6 = dateTime2.getYearOfCentury();
        int int7 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime9 = dateTime2.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = property10.getField();
        int int12 = dateTimeField11.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusWeeks((int) (byte) 10);
        org.joda.time.Period period17 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period17.toDurationFrom(readableInstant18);
        long long20 = duration19.getMillis();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.plus((org.joda.time.ReadableDuration) duration19);
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str24 = dateTimeField11.getAsText((org.joda.time.ReadablePartial) localDateTime15, (int) (short) 1, locale23);
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = locale23.getDisplayLanguage(locale25);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone1, locale25);
        int int28 = timeZone1.getRawOffset();
        int int30 = timeZone1.getOffset(1645514154223L);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime32);
        int int34 = dateTime31.getMinuteOfDay();
        int int35 = dateTime31.getYearOfCentury();
        int int36 = dateTime31.getDayOfMonth();
        org.joda.time.DateTime dateTime38 = dateTime31.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property39 = dateTime38.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField40 = property39.getField();
        int int41 = dateTimeField40.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minusWeeks((int) (byte) 10);
        org.joda.time.Period period46 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Duration duration48 = period46.toDurationFrom(readableInstant47);
        long long49 = duration48.getMillis();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime44.plus((org.joda.time.ReadableDuration) duration48);
        java.util.Locale locale52 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str53 = dateTimeField40.getAsText((org.joda.time.ReadablePartial) localDateTime44, (int) (short) 1, locale52);
        java.util.Locale locale54 = java.util.Locale.getDefault();
        java.lang.String str55 = locale52.getDisplayLanguage(locale54);
        java.util.Calendar calendar56 = java.util.Calendar.getInstance(timeZone1, locale52);
        java.lang.String str57 = locale52.getDisplayVariant();
        java.util.Calendar calendar58 = java.util.Calendar.getInstance(locale52);
        java.lang.String str59 = locale52.getISO3Country();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar27 and calendar58", (calendar27.compareTo(calendar58) == 0) == calendar27.equals(calendar58));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant13 = instant3.withDurationAdded((long) 459, 0);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) ' ', dateTimeZone15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(10L, chronology18);
        org.joda.time.DateTime dateTime21 = dateTime19.minus(100L);
        org.joda.time.Duration duration23 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.Interval interval26 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime25);
        int int27 = dateTime24.getMinuteOfDay();
        org.joda.time.Period period29 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime30 = dateTime24.plus((org.joda.time.ReadablePeriod) period29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = dateTime24.toDateTime(chronology31);
        org.joda.time.DateTime dateTime34 = dateTime24.minus((long) 10);
        org.joda.time.Period period35 = duration23.toPeriodFrom((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property37 = dateTime36.era();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime40 = dateTime38.plusWeeks((int) (byte) 1);
        int int41 = property37.compareTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime();
        org.joda.time.Interval interval44 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime42, (org.joda.time.ReadableInstant) dateTime43);
        boolean boolean46 = interval44.isAfter((long) 10);
        org.joda.time.Duration duration47 = interval44.toDuration();
        org.joda.time.Duration duration50 = duration47.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval51 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime38, (org.joda.time.ReadableDuration) duration50);
        org.joda.time.Duration duration53 = duration23.withDurationAdded((org.joda.time.ReadableDuration) duration50, 26160257);
        org.joda.time.Period period54 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableDuration) duration23);
        org.joda.time.DateTime dateTime55 = dateTime16.plus((org.joda.time.ReadableDuration) duration23);
        org.joda.time.Instant instant56 = instant3.plus((org.joda.time.ReadableDuration) duration23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        java.util.GregorianCalendar gregorianCalendar4 = dateTime2.toGregorianCalendar();
        org.joda.time.DateTime dateTime6 = dateTime2.withMillisOfSecond(19);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusWeeks((int) (byte) 10);
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationFrom(readableInstant12);
        long long14 = duration13.getMillis();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.plus((org.joda.time.ReadableDuration) duration13);
        org.joda.time.Duration duration17 = duration13.minus((long) 38222);
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#');
        int int21 = period19.getValue(0);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Duration duration25 = period19.toDurationTo((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Period period27 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationFrom(readableInstant28);
        org.joda.time.Seconds seconds30 = duration29.toStandardSeconds();
        boolean boolean31 = duration25.isEqual((org.joda.time.ReadableDuration) duration29);
        boolean boolean32 = duration17.isLongerThan((org.joda.time.ReadableDuration) duration25);
        org.joda.time.Period period34 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = period34.toDurationFrom(readableInstant35);
        org.joda.time.Seconds seconds37 = duration36.toStandardSeconds();
        org.joda.time.Duration duration40 = duration36.withDurationAdded((long) 32772, (int) (byte) 10);
        java.lang.String str41 = duration36.toString();
        org.joda.time.Period period42 = duration36.toPeriod();
        boolean boolean43 = duration25.isEqual((org.joda.time.ReadableDuration) duration36);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime();
        org.joda.time.Interval interval47 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime45, (org.joda.time.ReadableInstant) dateTime46);
        java.lang.String str48 = interval47.toString();
        org.joda.time.DateTime dateTime49 = interval47.getEnd();
        org.joda.time.Chronology chronology50 = interval47.getChronology();
        org.joda.time.DurationField durationField51 = chronology50.seconds();
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(0L, chronology50);
        long long56 = chronology50.add((long) 52439773, (long) 61, 3992);
        org.joda.time.Period period57 = duration36.toPeriod(chronology50);
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableDuration) duration36);
        org.joda.time.MutableInterval mutableInterval59 = mutableInterval58.copy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        java.lang.String str5 = dateTimeZone3.getName((long) ' ');
        java.lang.String str7 = dateTimeZone3.getName((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(0L, dateTimeZone3);
        long long11 = dateTimeZone3.adjustOffset(1645514153208L, false);
        java.lang.String str12 = dateTimeZone3.toString();
        long long16 = dateTimeZone3.convertLocalToUTC(1645514219549L, false, 1645514160000L);
        java.lang.String str18 = dateTimeZone3.getShortName((long) 30864);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(obj0, dateTimeZone3);
        long long21 = dateTimeZone3.nextTransition(62135596800000L);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'u');
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone23);
        java.lang.String str25 = dateTimeZone23.toString();
        java.lang.String str26 = dateTimeZone23.getID();
        java.util.Locale locale29 = java.util.Locale.forLanguageTag("ja");
        java.lang.String str30 = dateTimeZone23.getShortName(1645514203349L, locale29);
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now(dateTimeZone23);
        long long33 = dateTimeZone3.getMillisKeepLocal(dateTimeZone23, (long) 742);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime24", (dateTime19.compareTo(dateTime24) == 0) == dateTime19.equals(dateTime24));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime6 = dateTime0.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = dateTime0.toDateTime(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime0.minus((long) 10);
        org.joda.time.DateTime dateTime12 = dateTime0.minusHours(7);
        int int13 = dateTime0.getCenturyOfEra();
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime0.toMutableDateTime();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime16);
        java.lang.String str18 = interval17.toString();
        boolean boolean19 = interval17.isAfterNow();
        org.joda.time.Duration duration20 = interval17.toDuration();
        org.joda.time.Period period22 = new org.joda.time.Period((long) '#');
        int int24 = period22.getValue(0);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Duration duration28 = period22.toDurationTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Period period30 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period30.toDurationFrom(readableInstant31);
        org.joda.time.Seconds seconds33 = duration32.toStandardSeconds();
        boolean boolean34 = duration28.isEqual((org.joda.time.ReadableDuration) duration32);
        org.joda.time.PeriodType periodType37 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType38 = periodType37.withSecondsRemoved();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime();
        org.joda.time.Interval interval41 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime39, (org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Chronology chronology43 = org.joda.time.DateTimeUtils.getChronology(chronology42);
        org.joda.time.DateTimeField dateTimeField44 = chronology43.hourOfHalfday();
        org.joda.time.DateTime dateTime45 = dateTime39.toDateTime(chronology43);
        org.joda.time.Period period46 = new org.joda.time.Period((long) 1, (long) ' ', periodType38, chronology43);
        org.joda.time.DurationField durationField47 = chronology43.weeks();
        boolean boolean48 = duration32.equals((java.lang.Object) chronology43);
        boolean boolean50 = duration32.equals((java.lang.Object) 1L);
        boolean boolean51 = duration20.isEqual((org.joda.time.ReadableDuration) duration32);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime();
        org.joda.time.Interval interval54 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime52, (org.joda.time.ReadableInstant) dateTime53);
        int int55 = dateTime52.getMinuteOfDay();
        org.joda.time.Interval interval56 = duration20.toIntervalTo((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.Interval interval57 = interval56.toInterval();
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime60 = dateTime58.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant61 = dateTime60.toInstant();
        org.joda.time.MutableDateTime mutableDateTime62 = instant61.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType63 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.Chronology chronology65 = org.joda.time.DateTimeUtils.getChronology(chronology64);
        org.joda.time.DateTimeField dateTimeField66 = chronology65.hourOfHalfday();
        org.joda.time.DurationField durationField67 = durationFieldType63.getField(chronology65);
        org.joda.time.LocalTime localTime68 = new org.joda.time.LocalTime((java.lang.Object) instant61, chronology65);
        org.joda.time.DateTimeZone dateTimeZone69 = instant61.getZone();
        boolean boolean70 = instant61.isAfterNow();
        org.joda.time.Instant instant72 = instant61.minus((long) 52);
        org.joda.time.DateTime dateTime73 = instant61.toDateTime();
        boolean boolean74 = interval57.isAfter((org.joda.time.ReadableInstant) instant61);
        org.joda.time.Instant instant76 = instant61.minus(3291028436225L);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime(10L, chronology78);
        org.joda.time.DateTimeFieldType dateTimeFieldType80 = org.joda.time.DateTimeFieldType.weekyear();
        int int81 = dateTime79.get(dateTimeFieldType80);
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.DateTime dateTime84 = new org.joda.time.DateTime((long) 10, chronology83);
        boolean boolean85 = dateTime79.isEqual((org.joda.time.ReadableInstant) dateTime84);
        org.joda.time.LocalTime localTime86 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime88 = localTime86.withMillisOfSecond(24);
        org.joda.time.DateTimeFieldType dateTimeFieldType89 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType90 = dateTimeFieldType89.getRangeDurationType();
        int int91 = localTime86.get(dateTimeFieldType89);
        boolean boolean92 = dateTime84.isSupported(dateTimeFieldType89);
        org.joda.time.Chronology chronology93 = null;
        org.joda.time.Chronology chronology94 = org.joda.time.DateTimeUtils.getChronology(chronology93);
        org.joda.time.DurationField durationField95 = chronology94.years();
        org.joda.time.DateTimeField dateTimeField96 = chronology94.hourOfDay();
        boolean boolean97 = dateTimeFieldType89.isSupported(chronology94);
        boolean boolean98 = instant61.isSupported(dateTimeFieldType89);
        int int99 = mutableDateTime14.get(dateTimeFieldType89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime60 and instant61", (dateTime60.compareTo(instant61) == 0) == dateTime60.equals(instant61));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.joda.time.Period period1 = org.joda.time.Period.hours(1439);
        org.joda.time.Period period3 = period1.withSeconds((int) '4');
        int int4 = period1.getSeconds();
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationFrom(readableInstant7);
        org.joda.time.Seconds seconds9 = duration8.toStandardSeconds();
        long long10 = duration8.getStandardMinutes();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property12 = dateTime11.millisOfDay();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime14);
        int int16 = dateTime13.getMinuteOfDay();
        int int17 = dateTime13.getYearOfCentury();
        int int18 = dateTime13.getDayOfMonth();
        org.joda.time.DateTime dateTime20 = dateTime13.minusWeeks((int) (short) 0);
        boolean boolean21 = dateTime11.isAfter((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime.Property property22 = dateTime11.weekOfWeekyear();
        org.joda.time.DateTime dateTime24 = dateTime11.minus((long) 7);
        org.joda.time.DateTime dateTime26 = dateTime24.minusHours(26208878);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withCenturyOfEra(2);
        org.joda.time.Period period32 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = period32.toDurationFrom(readableInstant33);
        org.joda.time.Seconds seconds35 = duration34.toStandardSeconds();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime28.withDurationAdded((org.joda.time.ReadableDuration) duration34, 2022);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.UTC;
        long long41 = dateTimeZone39.convertUTCToLocal((long) 1970);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(1375201439L, dateTimeZone39);
        boolean boolean43 = localDateTime28.isEqual((org.joda.time.ReadablePartial) localDateTime42);
        int int44 = localDateTime42.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean46 = localDateTime42.isSupported(dateTimeFieldType45);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime();
        org.joda.time.Interval interval49 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime47, (org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTime dateTime50 = interval49.getEnd();
        org.joda.time.Chronology chronology51 = dateTime50.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = chronology51.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField53 = chronology51.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField54 = dateTimeFieldType45.getField(chronology51);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((java.lang.Object) dateTime24, chronology51);
        org.joda.time.Instant instant56 = dateTime55.toInstant();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime();
        org.joda.time.Interval interval59 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime57, (org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTime dateTime60 = interval59.getEnd();
        org.joda.time.Interval interval61 = interval59.toInterval();
        org.joda.time.MutableInterval mutableInterval62 = interval61.toMutableInterval();
        org.joda.time.Duration duration64 = org.joda.time.Duration.millis((long) 11);
        mutableInterval62.setDurationAfterStart((org.joda.time.ReadableDuration) duration64);
        org.joda.time.Instant instant67 = instant56.withDurationAdded((org.joda.time.ReadableDuration) duration64, 1640);
        long long68 = duration64.getStandardDays();
        boolean boolean69 = duration8.isShorterThan((org.joda.time.ReadableDuration) duration64);
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime();
        org.joda.time.Interval interval72 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime70, (org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.DateTime.Property property73 = dateTime71.millisOfDay();
        org.joda.time.DateTime dateTime74 = property73.roundCeilingCopy();
        int int75 = dateTime74.getSecondOfDay();
        int int76 = dateTime74.getSecondOfDay();
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property78 = dateTime77.millisOfDay();
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime();
        org.joda.time.Interval interval81 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime79, (org.joda.time.ReadableInstant) dateTime80);
        int int82 = dateTime79.getMinuteOfDay();
        int int83 = dateTime79.getYearOfCentury();
        int int84 = dateTime79.getDayOfMonth();
        org.joda.time.DateTime dateTime86 = dateTime79.minusWeeks((int) (short) 0);
        boolean boolean87 = dateTime77.isAfter((org.joda.time.ReadableInstant) dateTime79);
        int int88 = dateTime79.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property89 = dateTime79.dayOfYear();
        org.joda.time.DateTime dateTime91 = dateTime79.withEra(0);
        org.joda.time.DateTime dateTime93 = dateTime79.withDayOfYear((int) '#');
        org.joda.time.Duration duration94 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime74, (org.joda.time.ReadableInstant) dateTime79);
        boolean boolean95 = duration64.isEqual((org.joda.time.ReadableDuration) duration94);
        boolean boolean96 = period1.equals((java.lang.Object) duration94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and instant56", (dateTime24.compareTo(instant56) == 0) == dateTime24.equals(instant56));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = dateTime3.getChronology();
        int int5 = dateTime3.getDayOfYear();
        org.joda.time.Instant instant6 = dateTime3.toInstant();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        int int10 = dateTime7.getMinuteOfDay();
        int int11 = dateTime7.getYearOfCentury();
        int int12 = dateTime7.getDayOfMonth();
        org.joda.time.DateTime dateTime14 = dateTime7.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        int int17 = dateTimeField16.getMaximumValue();
        java.lang.String str19 = dateTimeField16.getAsShortText((long) (byte) 1);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) dateTime21);
        int int23 = dateTime20.getMinuteOfDay();
        int int24 = dateTime20.getYearOfCentury();
        int int25 = dateTime20.getDayOfMonth();
        org.joda.time.DateTime dateTime27 = dateTime20.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property28 = dateTime27.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField29 = property28.getField();
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.now();
        int int31 = dateTimeField29.getMaximumValue((org.joda.time.ReadablePartial) localTime30);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getChronology(chronology33);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.hourOfHalfday();
        java.util.Locale locale38 = java.util.Locale.forLanguageTag("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
        java.lang.String str39 = dateTimeField35.getAsShortText(1645514151873L, locale38);
        java.lang.String str40 = dateTimeField16.getAsText((org.joda.time.ReadablePartial) localTime30, 0, locale38);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(10L, chronology42);
        boolean boolean44 = localTime30.equals((java.lang.Object) dateTime43);
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant6, (org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Period period47 = period45.multipliedBy(174);
        int int48 = period45.getDays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant6", (dateTime0.compareTo(instant6) == 0) == dateTime0.equals(instant6));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime4 = instant3.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime5 = instant3.toMutableDateTimeISO();
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period7.toDurationFrom(readableInstant8);
        org.joda.time.Period period11 = period7.plusWeeks(1969);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime13);
        int int15 = dateTime12.getMinuteOfDay();
        int int16 = dateTime12.getYearOfCentury();
        int int17 = dateTime12.getDayOfMonth();
        org.joda.time.DateTime dateTime19 = dateTime12.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property20 = dateTime19.minuteOfDay();
        int int21 = dateTime19.getYear();
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime24 = localTime22.minusMillis(3);
        org.joda.time.ReadablePartial readablePartial25 = null;
        org.joda.time.LocalTime localTime26 = localTime24.withFields(readablePartial25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalTime localTime29 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology28);
        int int30 = localTime29.getSecondOfMinute();
        org.joda.time.Period period31 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime24, (org.joda.time.ReadablePartial) localTime29);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.Period period33 = period31.plus(readablePeriod32);
        org.joda.time.DateTime dateTime34 = dateTime19.minus((org.joda.time.ReadablePeriod) period31);
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) period11, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime.Property property36 = dateTime19.dayOfWeek();
        org.joda.time.DateTime dateTime37 = property36.getDateTime();
        boolean boolean38 = instant3.isAfter((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime40 = dateTime37.withWeekyear(659);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        int int5 = dateTime0.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        int int10 = dateTimeField9.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusWeeks((int) (byte) 10);
        org.joda.time.Period period15 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationFrom(readableInstant16);
        long long18 = duration17.getMillis();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.plus((org.joda.time.ReadableDuration) duration17);
        java.util.Locale locale21 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str22 = dateTimeField9.getAsText((org.joda.time.ReadablePartial) localDateTime13, (int) (short) 1, locale21);
        org.joda.time.DurationField durationField23 = dateTimeField9.getDurationField();
        long long24 = durationField23.getUnitMillis();
        long long26 = durationField23.getValueAsLong(327L);
        long long28 = durationField23.getMillis(54);
        long long31 = durationField23.getValueAsLong((-292260000L), (long) 53);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime33);
        int int35 = dateTime32.getMinuteOfDay();
        int int36 = dateTime32.getYearOfCentury();
        int int37 = dateTime32.getDayOfMonth();
        org.joda.time.DateTime dateTime39 = dateTime32.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property40 = dateTime39.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField41 = property40.getField();
        int int42 = dateTimeField41.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.minusWeeks((int) (byte) 10);
        org.joda.time.Period period47 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Duration duration49 = period47.toDurationFrom(readableInstant48);
        long long50 = duration49.getMillis();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime45.plus((org.joda.time.ReadableDuration) duration49);
        java.util.Locale locale53 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str54 = dateTimeField41.getAsText((org.joda.time.ReadablePartial) localDateTime45, (int) (short) 1, locale53);
        org.joda.time.DurationField durationField55 = dateTimeField41.getDurationField();
        long long56 = durationField55.getUnitMillis();
        long long58 = durationField55.getValueAsLong(327L);
        long long60 = durationField55.getMillis(54);
        long long63 = durationField55.getValueAsLong((-292260000L), (long) 53);
        int int64 = durationField23.compareTo(durationField55);
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval();
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.minusWeeks((int) (byte) 10);
        org.joda.time.Period period70 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.Duration duration72 = period70.toDurationFrom(readableInstant71);
        long long73 = duration72.getMillis();
        org.joda.time.LocalDateTime localDateTime74 = localDateTime68.plus((org.joda.time.ReadableDuration) duration72);
        mutableInterval65.setDurationAfterStart((org.joda.time.ReadableDuration) duration72);
        org.joda.time.Period period77 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.Duration duration79 = period77.toDurationFrom(readableInstant78);
        org.joda.time.Seconds seconds80 = duration79.toStandardSeconds();
        mutableInterval65.setDurationAfterStart((org.joda.time.ReadableDuration) duration79);
        org.joda.time.DateTime dateTime82 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property83 = dateTime82.millisOfDay();
        org.joda.time.Period period84 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration79, (org.joda.time.ReadableInstant) dateTime82);
        org.joda.time.Chronology chronology87 = null;
        org.joda.time.Chronology chronology88 = org.joda.time.DateTimeUtils.getChronology(chronology87);
        org.joda.time.DurationField durationField89 = chronology88.years();
        org.joda.time.DateTimeField dateTimeField90 = chronology88.hourOfDay();
        org.joda.time.Period period91 = new org.joda.time.Period((long) 10074, 1645514199442L, chronology88);
        org.joda.time.Period period92 = duration79.toPeriod(chronology88);
        org.joda.time.DurationField durationField93 = chronology88.eras();
        int int94 = durationField55.compareTo(durationField93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField93, durationField55, and durationField89", !(durationField93.compareTo(durationField55) == 0) || (Math.signum(durationField93.compareTo(durationField89)) == Math.signum(durationField55.compareTo(durationField89))));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType3 = periodType2.withSecondsRemoved();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology8.hourOfHalfday();
        org.joda.time.DateTime dateTime10 = dateTime4.toDateTime(chronology8);
        org.joda.time.Period period11 = new org.joda.time.Period((long) 1, (long) ' ', periodType3, chronology8);
        org.joda.time.DurationField durationField12 = chronology8.millis();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.secondOfMinute();
        org.joda.time.Chronology chronology14 = chronology8.withUTC();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology17);
        int int19 = localTime18.getSecondOfMinute();
        org.joda.time.LocalTime.Property property20 = localTime18.millisOfSecond();
        org.joda.time.LocalTime localTime21 = property20.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime22 = property20.roundCeilingCopy();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray23 = localTime22.getFieldTypes();
        org.joda.time.LocalTime localTime25 = localTime22.withMillisOfDay(26153577);
        int[] intArray27 = chronology14.get((org.joda.time.ReadablePartial) localTime22, 1L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime15", (dateTime4.compareTo(dateTime15) == 0) == dateTime4.equals(dateTime15));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant13 = instant3.withDurationAdded(1645514154223L, 100);
        org.joda.time.DateTime dateTime14 = instant3.toDateTimeISO();
        boolean boolean16 = instant3.isBefore((long) 53);
        org.joda.time.Instant instant18 = instant3.minus((long) 3);
        org.joda.time.MutableDateTime mutableDateTime19 = instant18.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.Instant instant13 = instant3.withDurationAdded(1645514154223L, 100);
        org.joda.time.Instant instant15 = instant3.minus((long) (byte) -1);
        org.joda.time.DateTime dateTime16 = instant3.toDateTimeISO();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getChronology(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.hourOfHalfday();
        org.joda.time.Chronology chronology20 = org.joda.time.DateTimeUtils.getChronology(chronology18);
        org.joda.time.DateTimeField dateTimeField21 = chronology20.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.hourOfDay();
        org.joda.time.DurationField durationField23 = chronology20.years();
        org.joda.time.DateTime dateTime24 = instant3.toDateTime(chronology20);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property26 = dateTime25.era();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime29 = dateTime27.plusWeeks((int) (byte) 1);
        int int30 = property26.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime32);
        boolean boolean35 = interval33.isAfter((long) 10);
        org.joda.time.Duration duration36 = interval33.toDuration();
        org.joda.time.Duration duration39 = duration36.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval40 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableDuration) duration39);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime43 = dateTime41.plusWeeks((int) (byte) 1);
        org.joda.time.DateTime.Property property44 = dateTime43.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeUtils.getZone(dateTimeZone45);
        java.lang.String str48 = dateTimeZone46.getName((long) ' ');
        org.joda.time.DateTime dateTime49 = dateTime43.toDateTime(dateTimeZone46);
        org.joda.time.PeriodType periodType50 = org.joda.time.PeriodType.time();
        org.joda.time.Period period51 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration39, (org.joda.time.ReadableInstant) dateTime49, periodType50);
        org.joda.time.DateTime dateTime53 = dateTime49.plusMonths((int) (byte) 0);
        org.joda.time.DateMidnight dateMidnight54 = dateTime49.toDateMidnight();
        org.joda.time.Instant instant55 = dateMidnight54.toInstant();
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime58 = dateTime56.plusWeeks((int) (byte) 1);
        org.joda.time.DateTime.Property property59 = dateTime58.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeUtils.getZone(dateTimeZone60);
        java.lang.String str63 = dateTimeZone61.getName((long) ' ');
        org.joda.time.DateTime dateTime64 = dateTime58.toDateTime(dateTimeZone61);
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property66 = dateTime65.millisOfDay();
        org.joda.time.DateTime dateTime67 = dateTime65.withTimeAtStartOfDay();
        boolean boolean68 = dateTime58.isEqual((org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.DateTime.Property property69 = dateTime67.weekyear();
        long long70 = dateTime67.getMillis();
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property72 = dateTime71.millisOfDay();
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime();
        org.joda.time.Interval interval75 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime73, (org.joda.time.ReadableInstant) dateTime74);
        int int76 = dateTime73.getMinuteOfDay();
        int int77 = dateTime73.getYearOfCentury();
        int int78 = dateTime73.getDayOfMonth();
        org.joda.time.DateTime dateTime80 = dateTime73.minusWeeks((int) (short) 0);
        boolean boolean81 = dateTime71.isAfter((org.joda.time.ReadableInstant) dateTime73);
        int int82 = dateTime73.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property83 = dateTime73.dayOfYear();
        org.joda.time.DateTime dateTime85 = dateTime73.withEra(0);
        org.joda.time.DateTime dateTime87 = dateTime73.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime89 = dateTime73.plusMonths(10074);
        boolean boolean90 = dateTime67.isEqual((org.joda.time.ReadableInstant) dateTime89);
        org.joda.time.ReadablePartial readablePartial91 = null;
        org.joda.time.DateTime dateTime92 = dateTime67.withFields(readablePartial91);
        boolean boolean93 = instant55.isAfter((org.joda.time.ReadableInstant) dateTime67);
        boolean boolean94 = dateTime24.isBefore((org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.DateTime dateTime96 = dateTime67.minus(1645514489233L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(10L, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.weekyear();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 10, chronology6);
        boolean boolean8 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property10 = dateTime9.era();
        boolean boolean11 = dateTime7.isBefore((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Instant instant12 = dateTime7.toInstant();
        long long13 = dateTime7.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant12", (dateTime2.compareTo(instant12) == 0) == dateTime2.equals(instant12));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        java.lang.String str3 = interval2.toString();
        org.joda.time.DateTime dateTime4 = interval2.getEnd();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusWeeks((int) (byte) 10);
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        long long12 = duration11.getMillis();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.plus((org.joda.time.ReadableDuration) duration11);
        boolean boolean14 = interval2.equals((java.lang.Object) duration11);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property16 = dateTime15.era();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime19 = dateTime17.plusWeeks((int) (byte) 1);
        int int20 = property16.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableInstant) dateTime22);
        boolean boolean25 = interval23.isAfter((long) 10);
        org.joda.time.Duration duration26 = interval23.toDuration();
        org.joda.time.Duration duration29 = duration26.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval30 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableDuration) duration29);
        boolean boolean31 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration29);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime34 = dateTime32.plusWeeks((int) (byte) 1);
        org.joda.time.DateTime.Property property35 = dateTime34.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeUtils.getZone(dateTimeZone36);
        java.lang.String str39 = dateTimeZone37.getName((long) ' ');
        org.joda.time.DateTime dateTime40 = dateTime34.toDateTime(dateTimeZone37);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property42 = dateTime41.era();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime45 = dateTime43.plusWeeks((int) (byte) 1);
        int int46 = property42.compareTo((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime();
        org.joda.time.Interval interval49 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime47, (org.joda.time.ReadableInstant) dateTime48);
        boolean boolean51 = interval49.isAfter((long) 10);
        org.joda.time.Duration duration52 = interval49.toDuration();
        org.joda.time.Duration duration55 = duration52.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval56 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableDuration) duration55);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime59 = dateTime57.plusWeeks((int) (byte) 1);
        org.joda.time.DateTime.Property property60 = dateTime59.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeUtils.getZone(dateTimeZone61);
        java.lang.String str64 = dateTimeZone62.getName((long) ' ');
        org.joda.time.DateTime dateTime65 = dateTime59.toDateTime(dateTimeZone62);
        org.joda.time.PeriodType periodType66 = org.joda.time.PeriodType.time();
        org.joda.time.Period period67 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration55, (org.joda.time.ReadableInstant) dateTime65, periodType66);
        org.joda.time.PeriodType periodType68 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType69 = periodType68.withDaysRemoved();
        org.joda.time.Period period70 = period67.normalizedStandard(periodType69);
        org.joda.time.Period period71 = duration29.toPeriodTo((org.joda.time.ReadableInstant) dateTime40, periodType69);
        org.joda.time.DateTime dateTime73 = dateTime40.minusMinutes(51);
        org.joda.time.MutableDateTime mutableDateTime74 = dateTime73.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetHours(35);
        org.joda.time.DateTime dateTime77 = dateTime73.toDateTime(dateTimeZone76);
        org.joda.time.MutableDateTime mutableDateTime78 = dateTime73.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime74 and dateTime77", (mutableDateTime74.compareTo(dateTime77) == 0) == mutableDateTime74.equals(dateTime77));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        java.lang.Character[] charArray3 = new java.lang.Character[] { '#', ' ', '4' };
        java.util.LinkedHashSet<java.lang.Character> charSet4 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet4, charArray3);
        boolean boolean7 = charSet4.add((java.lang.Character) ' ');
        boolean boolean8 = charSet4.isEmpty();
        boolean boolean10 = charSet4.contains((java.lang.Object) "DateTimeField[minuteOfDay]");
        java.util.Spliterator<java.lang.Character> charSpliterator11 = charSet4.spliterator();
        java.lang.Character[] charArray15 = new java.lang.Character[] { '#', ' ', '4' };
        java.util.LinkedHashSet<java.lang.Character> charSet16 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet16, charArray15);
        boolean boolean19 = charSet16.add((java.lang.Character) ' ');
        java.lang.Object[] objArray20 = charSet16.toArray();
        java.lang.Character[] charArray24 = new java.lang.Character[] { '#', ' ', '4' };
        java.util.LinkedHashSet<java.lang.Character> charSet25 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet25, charArray24);
        boolean boolean28 = charSet25.add((java.lang.Character) ' ');
        boolean boolean29 = charSet25.isEmpty();
        boolean boolean30 = charSet16.addAll((java.util.Collection<java.lang.Character>) charSet25);
        boolean boolean31 = charSet4.containsAll((java.util.Collection<java.lang.Character>) charSet16);
        boolean boolean33 = charSet16.add((java.lang.Character) ' ');
        java.util.stream.Stream<java.lang.Character> charStream34 = charSet16.parallelStream();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime();
        org.joda.time.Interval interval37 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getChronology(chronology38);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.hourOfHalfday();
        org.joda.time.DateTime dateTime41 = dateTime35.toDateTime(chronology39);
        org.joda.time.DurationField durationField42 = chronology39.millis();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(chronology39);
        org.joda.time.Instant instant44 = dateTime43.toInstant();
        java.lang.String str45 = instant44.toString();
        boolean boolean46 = charSet16.contains((java.lang.Object) instant44);
        org.joda.time.DateTime dateTime47 = instant44.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeUtils.getZone(dateTimeZone48);
        boolean boolean51 = dateTimeZone49.equals((java.lang.Object) 1645514161708L);
        long long54 = dateTimeZone49.convertLocalToUTC((long) 26184703, false);
        org.joda.time.DateTime dateTime55 = org.joda.time.DateTime.now(dateTimeZone49);
        org.joda.time.MutableDateTime mutableDateTime56 = dateTime47.toMutableDateTime(dateTimeZone49);
        org.joda.time.Chronology chronology57 = dateTime47.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and instant44", (dateTime35.compareTo(instant44) == 0) == dateTime35.equals(instant44));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime4.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusYears(26151451);
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#');
        int int12 = period10.getValue(0);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Duration duration16 = period10.toDurationTo((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime8.withPeriodAdded((org.joda.time.ReadablePeriod) period10, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean20 = localDateTime8.isSupported(dateTimeFieldType19);
        int int21 = instant3.get(dateTimeFieldType19);
        org.joda.time.MutableDateTime mutableDateTime22 = instant3.toMutableDateTimeISO();
        org.joda.time.Instant instant24 = instant3.withMillis(1645514258610L);
        boolean boolean25 = instant24.isAfterNow();
        org.joda.time.MutableDateTime mutableDateTime26 = instant24.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.hourOfHalfday();
        org.joda.time.DateTime dateTime6 = dateTime0.toDateTime(chronology4);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) 995, 59);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime11);
        int int13 = dateTime10.getMinuteOfDay();
        int int14 = dateTime10.getYearOfCentury();
        int int15 = dateTime10.getDayOfMonth();
        org.joda.time.DateTime dateTime17 = dateTime10.minusWeeks((int) (short) 0);
        int int18 = dateTime10.getYear();
        org.joda.time.DateTime dateTime20 = dateTime10.plusYears(14);
        int int21 = dateTime20.getMillisOfDay();
        boolean boolean23 = dateTime20.isAfter(302L);
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.Instant instant25 = dateTime6.toInstant();
        org.joda.time.DateTime dateTime27 = dateTime6.minusYears(32073097);
        org.joda.time.DateTime dateTime29 = dateTime6.withMillisOfDay(5884398);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        org.joda.time.Interval interval32 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) dateTime31);
        int int33 = dateTime30.getMinuteOfDay();
        int int34 = dateTime30.getYearOfCentury();
        int int35 = dateTime30.getDayOfMonth();
        org.joda.time.DateTime dateTime37 = dateTime30.minusWeeks((int) (short) 0);
        int int38 = dateTime30.getYear();
        org.joda.time.DateTime dateTime40 = dateTime30.plusYears(14);
        org.joda.time.DateTime.Property property41 = dateTime40.weekyear();
        org.joda.time.DateTime dateTime42 = property41.withMinimumValue();
        org.joda.time.Period period44 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = period44.toDurationFrom(readableInstant45);
        org.joda.time.Seconds seconds47 = duration46.toStandardSeconds();
        org.joda.time.DateTime dateTime49 = dateTime42.withDurationAdded((org.joda.time.ReadableDuration) duration46, (int) 'a');
        int int50 = dateTime49.getMinuteOfDay();
        boolean boolean51 = dateTime6.isEqual((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Period period53 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Duration duration55 = period53.toDurationFrom(readableInstant54);
        org.joda.time.Seconds seconds56 = duration55.toStandardSeconds();
        org.joda.time.Duration duration59 = duration55.withDurationAdded((long) 32772, (int) (byte) 10);
        org.joda.time.Period period61 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.Duration duration63 = period61.toDurationFrom(readableInstant62);
        org.joda.time.Seconds seconds64 = duration63.toStandardSeconds();
        org.joda.time.Duration duration67 = duration63.withDurationAdded((long) 32772, (int) (byte) 10);
        long long68 = duration67.getStandardSeconds();
        boolean boolean69 = duration55.isShorterThan((org.joda.time.ReadableDuration) duration67);
        org.joda.time.DateTime dateTime70 = dateTime6.plus((org.joda.time.ReadableDuration) duration55);
        org.joda.time.Duration duration72 = duration55.plus((-59958143999604L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant25", (dateTime0.compareTo(instant25) == 0) == dateTime0.equals(instant25));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = dateTime3.getChronology();
        int int5 = dateTime3.getDayOfYear();
        org.joda.time.Instant instant6 = dateTime3.toInstant();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        int int10 = dateTime7.getMinuteOfDay();
        int int11 = dateTime7.getYearOfCentury();
        int int12 = dateTime7.getDayOfMonth();
        org.joda.time.DateTime dateTime14 = dateTime7.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        int int17 = dateTimeField16.getMaximumValue();
        java.lang.String str19 = dateTimeField16.getAsShortText((long) (byte) 1);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) dateTime21);
        int int23 = dateTime20.getMinuteOfDay();
        int int24 = dateTime20.getYearOfCentury();
        int int25 = dateTime20.getDayOfMonth();
        org.joda.time.DateTime dateTime27 = dateTime20.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property28 = dateTime27.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField29 = property28.getField();
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.now();
        int int31 = dateTimeField29.getMaximumValue((org.joda.time.ReadablePartial) localTime30);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getChronology(chronology33);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.hourOfHalfday();
        java.util.Locale locale38 = java.util.Locale.forLanguageTag("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
        java.lang.String str39 = dateTimeField35.getAsShortText(1645514151873L, locale38);
        java.lang.String str40 = dateTimeField16.getAsText((org.joda.time.ReadablePartial) localTime30, 0, locale38);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(10L, chronology42);
        boolean boolean44 = localTime30.equals((java.lang.Object) dateTime43);
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant6, (org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Period period47 = period45.withSeconds(349);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant6", (dateTime0.compareTo(instant6) == 0) == dateTime0.equals(instant6));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.DateTimeZone dateTimeZone11 = instant3.getZone();
        boolean boolean12 = instant3.isAfterNow();
        org.joda.time.Instant instant14 = instant3.minus((long) 52);
        org.joda.time.MutableDateTime mutableDateTime15 = instant14.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) ' ', dateTimeZone1);
        int int3 = dateTime2.getYearOfCentury();
        org.joda.time.DateTime.Property property4 = dateTime2.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property4.getFieldType();
        org.joda.time.Interval interval6 = property4.toInterval();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        java.lang.String str10 = interval9.toString();
        org.joda.time.DateTime dateTime11 = interval9.getEnd();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusWeeks((int) (byte) 10);
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationFrom(readableInstant17);
        long long19 = duration18.getMillis();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.plus((org.joda.time.ReadableDuration) duration18);
        boolean boolean21 = interval9.equals((java.lang.Object) duration18);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) dateTime23);
        boolean boolean26 = interval24.isAfter((long) 10);
        org.joda.time.Interval interval27 = interval9.overlap((org.joda.time.ReadableInterval) interval24);
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.months();
        org.joda.time.Period period29 = interval9.toPeriod(periodType28);
        org.joda.time.DateTime dateTime30 = interval9.getStart();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTime dateTime34 = interval33.getEnd();
        org.joda.time.Interval interval35 = interval33.toInterval();
        org.joda.time.MutableInterval mutableInterval36 = interval35.toMutableInterval();
        boolean boolean37 = interval9.isBefore((org.joda.time.ReadableInterval) interval35);
        org.joda.time.Chronology chronology38 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInterval) interval35);
        org.joda.time.MutableInterval mutableInterval39 = interval35.toMutableInterval();
        boolean boolean40 = interval6.contains((org.joda.time.ReadableInterval) interval35);
        org.joda.time.Period period41 = interval6.toPeriod();
        org.joda.time.Chronology chronology42 = interval6.getChronology();
        org.joda.time.DateTime dateTime43 = interval6.getEnd();
        org.joda.time.Period period45 = org.joda.time.Period.minutes(26197150);
        org.joda.time.Interval interval46 = interval6.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period45);
        org.joda.time.DateTime dateTime47 = interval6.getEnd();
        org.joda.time.Duration duration49 = org.joda.time.Duration.millis(3290261832926L);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime52 = dateTime50.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant53 = dateTime52.toInstant();
        int int54 = dateTime52.getYear();
        org.joda.time.Period period56 = new org.joda.time.Period((long) (short) 10);
        org.joda.time.PeriodType periodType57 = org.joda.time.PeriodType.days();
        org.joda.time.Period period58 = period56.normalizedStandard(periodType57);
        org.joda.time.DurationFieldType durationFieldType59 = org.joda.time.DurationFieldType.hours();
        int int60 = periodType57.indexOf(durationFieldType59);
        org.joda.time.PeriodType periodType61 = periodType57.withMonthsRemoved();
        org.joda.time.Period period62 = duration49.toPeriodTo((org.joda.time.ReadableInstant) dateTime52, periodType61);
        org.joda.time.Interval interval63 = interval6.withDurationAfterStart((org.joda.time.ReadableDuration) duration49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime52 and instant53", (dateTime52.compareTo(instant53) == 0) == dateTime52.equals(instant53));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        java.lang.String str3 = interval2.toString();
        org.joda.time.DateTime dateTime4 = interval2.getEnd();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusWeeks((int) (byte) 10);
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        long long12 = duration11.getMillis();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.plus((org.joda.time.ReadableDuration) duration11);
        boolean boolean14 = interval2.equals((java.lang.Object) duration11);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime16);
        boolean boolean19 = interval17.isAfter((long) 10);
        org.joda.time.Interval interval20 = interval2.overlap((org.joda.time.ReadableInterval) interval17);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.months();
        org.joda.time.Period period22 = interval2.toPeriod(periodType21);
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType24 = periodType23.withMillisRemoved();
        org.joda.time.Period period25 = interval2.toPeriod(periodType24);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime();
        org.joda.time.Interval interval28 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Chronology chronology30 = org.joda.time.DateTimeUtils.getChronology(chronology29);
        org.joda.time.DateTimeField dateTimeField31 = chronology30.hourOfHalfday();
        org.joda.time.DateTime dateTime32 = dateTime26.toDateTime(chronology30);
        org.joda.time.DurationField durationField33 = chronology30.millis();
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(chronology30);
        org.joda.time.Instant instant35 = dateTime34.toInstant();
        org.joda.time.MutableDateTime mutableDateTime36 = instant35.toMutableDateTimeISO();
        boolean boolean37 = interval2.contains((org.joda.time.ReadableInstant) instant35);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime();
        org.joda.time.Interval interval40 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime38, (org.joda.time.ReadableInstant) dateTime39);
        int int41 = dateTime38.getMinuteOfDay();
        int int42 = dateTime38.getYearOfCentury();
        int int43 = dateTime38.getDayOfMonth();
        org.joda.time.DateTime dateTime45 = dateTime38.minusWeeks((int) (short) 0);
        org.joda.time.DateTime dateTime46 = dateTime45.toDateTimeISO();
        java.util.Date date47 = dateTime45.toDate();
        date47.setYear((int) '#');
        org.joda.time.LocalDate localDate50 = org.joda.time.LocalDate.fromDateFields(date47);
        org.joda.time.LocalDate localDate52 = localDate50.withYear(795);
        org.joda.time.Interval interval53 = localDate50.toInterval();
        org.joda.time.Duration duration56 = new org.joda.time.Duration((long) (byte) 10, 0L);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime();
        org.joda.time.Interval interval59 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime57, (org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.Chronology chronology61 = org.joda.time.DateTimeUtils.getChronology(chronology60);
        org.joda.time.DateTimeField dateTimeField62 = chronology61.hourOfHalfday();
        org.joda.time.DateTime dateTime63 = dateTime57.toDateTime(chronology61);
        org.joda.time.Period period64 = duration56.toPeriod(chronology61);
        org.joda.time.Days days65 = duration56.toStandardDays();
        org.joda.time.Period period66 = days65.toPeriod();
        org.joda.time.Period period68 = period66.minusYears(1970);
        org.joda.time.Period period70 = period66.plusYears(26179754);
        int int71 = period66.getMinutes();
        org.joda.time.Period period73 = period66.withMinutes(26303184);
        org.joda.time.Period period75 = period73.minusMillis(26201588);
        org.joda.time.Interval interval76 = interval53.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period73);
        org.joda.time.Period period77 = period73.toPeriod();
        org.joda.time.Interval interval78 = interval2.withPeriodAfterStart((org.joda.time.ReadablePeriod) period77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant35", (dateTime0.compareTo(instant35) == 0) == dateTime0.equals(instant35));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withYearOfEra(3);
        int int3 = localDateTime2.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withYearOfEra(3);
        int int7 = localDateTime6.getDayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.property(dateTimeFieldType8);
        org.joda.time.LocalDateTime localDateTime10 = property9.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks(1439);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withWeekyear(0);
        int int15 = localDateTime10.getEra();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) ' ', dateTimeZone17);
        int int19 = dateTime18.getYearOfCentury();
        org.joda.time.DateTime.Property property20 = dateTime18.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property20.getFieldType();
        org.joda.time.Interval interval22 = property20.toInterval();
        org.joda.time.DateTime dateTime23 = property20.roundHalfCeilingCopy();
        long long24 = dateTime23.getMillis();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime26);
        boolean boolean29 = interval27.isAfter((long) 10);
        org.joda.time.Duration duration30 = interval27.toDuration();
        org.joda.time.Duration duration33 = duration30.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime();
        org.joda.time.Interval interval36 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime34, (org.joda.time.ReadableInstant) dateTime35);
        boolean boolean38 = interval36.isAfter((long) 10);
        org.joda.time.Duration duration39 = interval36.toDuration();
        org.joda.time.Duration duration42 = duration39.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        boolean boolean43 = duration33.isEqual((org.joda.time.ReadableDuration) duration39);
        org.joda.time.DateTime dateTime45 = dateTime23.withDurationAdded((org.joda.time.ReadableDuration) duration39, 304);
        boolean boolean46 = localDateTime10.equals((java.lang.Object) duration39);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime49 = dateTime47.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant50 = dateTime49.toInstant();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = localDateTime51.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime51.plusYears(26151451);
        org.joda.time.Period period57 = new org.joda.time.Period((long) '#');
        int int59 = period57.getValue(0);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime();
        org.joda.time.Interval interval62 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime60, (org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.Duration duration63 = period57.toDurationTo((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime55.withPeriodAdded((org.joda.time.ReadablePeriod) period57, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean67 = localDateTime55.isSupported(dateTimeFieldType66);
        int int68 = instant50.get(dateTimeFieldType66);
        org.joda.time.Duration duration70 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime();
        org.joda.time.Interval interval73 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime71, (org.joda.time.ReadableInstant) dateTime72);
        int int74 = dateTime71.getMinuteOfDay();
        org.joda.time.Period period76 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime77 = dateTime71.plus((org.joda.time.ReadablePeriod) period76);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.DateTime dateTime79 = dateTime71.toDateTime(chronology78);
        org.joda.time.DateTime dateTime81 = dateTime71.minus((long) 10);
        org.joda.time.Period period82 = duration70.toPeriodFrom((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.Instant instant83 = instant50.plus((org.joda.time.ReadableDuration) duration70);
        org.joda.time.DateTime dateTime84 = instant50.toDateTimeISO();
        org.joda.time.Interval interval85 = duration39.toIntervalFrom((org.joda.time.ReadableInstant) instant50);
        org.joda.time.LocalDateTime localDateTime86 = localDateTime2.plus((org.joda.time.ReadableDuration) duration39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime49 and instant50", (dateTime49.compareTo(instant50) == 0) == dateTime49.equals(instant50));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.joda.time.Interval interval1 = org.joda.time.Interval.parse("2022-02-22T07:16:17.534Z/2022-02-22T07:16:17.534Z");
        org.joda.time.Interval interval2 = interval1.toInterval();
        org.joda.time.Chronology chronology3 = interval2.getChronology();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(chronology3);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate7 = localDate5.withCenturyOfEra(382);
        org.joda.time.LocalDate localDate9 = localDate7.plusDays((int) (byte) 10);
        org.joda.time.Interval interval10 = localDate9.toInterval();
        org.joda.time.DateTime dateTime11 = localDate9.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate13 = localDate9.minusYears(331);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property15 = dateTime14.millisOfDay();
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet17 = locale16.getExtensionKeys();
        java.lang.String str18 = property15.getAsText(locale16);
        org.joda.time.DateTime dateTime19 = property15.withMinimumValue();
        org.joda.time.DateTime dateTime21 = property15.setCopy((int) 'a');
        org.joda.time.DateTime dateTime23 = dateTime21.plusDays(10);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        long long26 = dateTimeZone24.convertUTCToLocal((long) 1970);
        long long28 = dateTimeZone24.nextTransition(1645514182234L);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(dateTimeZone24);
        boolean boolean30 = dateTime23.isAfter((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime dateTime31 = localDate9.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime32 = localDateTime4.toDateTime((org.joda.time.ReadableInstant) dateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime29", (dateTime14.compareTo(dateTime29) == 0) == dateTime14.equals(dateTime29));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType3 = periodType2.withSecondsRemoved();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology8.hourOfHalfday();
        org.joda.time.DateTime dateTime10 = dateTime4.toDateTime(chronology8);
        org.joda.time.Period period11 = new org.joda.time.Period((long) 1, (long) ' ', periodType3, chronology8);
        org.joda.time.DurationField durationField12 = chronology8.millis();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.dayOfYear();
        org.joda.time.DurationField durationField15 = chronology8.days();
        long long18 = durationField15.getDifferenceAsLong((long) 875, 1645514299704L);
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = null;
        org.joda.time.format.DateTimeParser dateTimeParser20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter19, dateTimeParser20);
        org.joda.time.Chronology chronology22 = dateTimeFormatter21.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeUtils.getZone(dateTimeZone24);
        java.lang.String str27 = dateTimeZone25.getName((long) ' ');
        java.lang.String str29 = dateTimeZone25.getName((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(0L, dateTimeZone25);
        long long33 = dateTimeZone25.adjustOffset(1645514153208L, false);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now(dateTimeZone25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter21.withZone(dateTimeZone25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter21.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter21.withPivotYear(26220156);
        org.joda.time.Chronology chronology39 = dateTimeFormatter21.getChronology();
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property41 = dateTime40.millisOfDay();
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime();
        org.joda.time.Interval interval44 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime42, (org.joda.time.ReadableInstant) dateTime43);
        int int45 = dateTime42.getMinuteOfDay();
        int int46 = dateTime42.getYearOfCentury();
        int int47 = dateTime42.getDayOfMonth();
        org.joda.time.DateTime dateTime49 = dateTime42.minusWeeks((int) (short) 0);
        boolean boolean50 = dateTime40.isAfter((org.joda.time.ReadableInstant) dateTime42);
        java.lang.String str51 = dateTime40.toString();
        org.joda.time.PeriodType periodType53 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType54 = periodType53.withDaysRemoved();
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime();
        org.joda.time.Interval interval57 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime55, (org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTime dateTime58 = interval57.getEnd();
        org.joda.time.Chronology chronology59 = dateTime58.getChronology();
        org.joda.time.Period period60 = new org.joda.time.Period(1645514161529L, periodType54, chronology59);
        org.joda.time.DurationField durationField61 = chronology59.years();
        org.joda.time.MutableDateTime mutableDateTime62 = dateTime40.toMutableDateTime(chronology59);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = dateTimeFormatter21.withChronology(chronology59);
        org.joda.time.DurationField durationField64 = chronology59.eras();
        int int65 = durationField15.compareTo(durationField64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField64, durationField12, and durationField61", !(durationField64.compareTo(durationField12) == 0) || (Math.signum(durationField64.compareTo(durationField61)) == Math.signum(durationField12.compareTo(durationField61))));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10);
        org.joda.time.Weeks weeks4 = period3.toStandardWeeks();
        org.joda.time.format.PeriodFormatter periodFormatter5 = null;
        java.lang.String str6 = period3.toString(periodFormatter5);
        org.joda.time.PeriodType periodType7 = period3.getPeriodType();
        org.joda.time.Period period8 = new org.joda.time.Period(1645514443702L, 3291028687363L, periodType7);
        org.joda.time.DurationFieldType[] durationFieldTypeArray9 = period8.getFieldTypes();
        org.joda.time.Period period10 = new org.joda.time.Period((java.lang.Object) period8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(10L, chronology12);
        org.joda.time.DateTime dateTime15 = dateTime13.minus(100L);
        int int16 = dateTime15.getYear();
        org.joda.time.DateTime dateTime17 = dateTime15.toDateTime();
        java.util.Date date18 = dateTime15.toDate();
        org.joda.time.DateTime.Property property19 = dateTime15.hourOfDay();
        org.joda.time.Period period21 = org.joda.time.Period.years(10);
        boolean boolean22 = dateTime15.equals((java.lang.Object) period21);
        org.joda.time.Instant instant23 = dateTime15.toInstant();
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) period10, (org.joda.time.ReadableInstant) dateTime15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant23", (dateTime15.compareTo(instant23) == 0) == dateTime15.equals(instant23));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = durationFieldType5.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) instant3, chronology7);
        org.joda.time.DateTimeZone dateTimeZone11 = instant3.getZone();
        boolean boolean12 = instant3.isAfterNow();
        org.joda.time.Instant instant14 = instant3.minus((long) 52);
        org.joda.time.DateTime dateTime15 = instant3.toDateTime();
        java.lang.String str16 = dateTime15.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.hourOfHalfday();
        org.joda.time.DateTime dateTime6 = dateTime0.toDateTime(chronology4);
        org.joda.time.DurationField durationField7 = chronology4.millis();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology4);
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.Instant instant10 = instant9.toInstant();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology12.hourOfHalfday();
        java.util.Locale locale16 = java.util.Locale.forLanguageTag("2022-02-22T07:15:55.265Z/2022-02-22T07:15:55.265Z");
        java.lang.String str17 = dateTimeField13.getAsShortText(1645514151873L, locale16);
        java.util.Locale locale19 = java.util.Locale.PRC;
        java.lang.String str20 = dateTimeField13.getAsShortText(26153877, locale19);
        long long22 = dateTimeField13.roundFloor((long) 1439);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withYearOfEra(3);
        int int26 = localDateTime25.getDayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDateTime.Property property28 = localDateTime25.property(dateTimeFieldType27);
        org.joda.time.LocalDateTime localDateTime29 = property28.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime30 = property28.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minusMillis(16);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime();
        org.joda.time.Interval interval35 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableInstant) dateTime34);
        int int36 = dateTime33.getMinuteOfDay();
        int int37 = dateTime33.getYearOfCentury();
        int int38 = dateTime33.getDayOfMonth();
        org.joda.time.DateTime dateTime40 = dateTime33.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property41 = dateTime40.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField42 = property41.getField();
        int int43 = dateTimeField42.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.minusWeeks((int) (byte) 10);
        org.joda.time.Period period48 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Duration duration50 = period48.toDurationFrom(readableInstant49);
        long long51 = duration50.getMillis();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime46.plus((org.joda.time.ReadableDuration) duration50);
        java.util.Locale locale54 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str55 = dateTimeField42.getAsText((org.joda.time.ReadablePartial) localDateTime46, (int) (short) 1, locale54);
        java.util.Locale locale56 = java.util.Locale.getDefault();
        java.lang.String str57 = locale54.getDisplayLanguage(locale56);
        java.lang.String str58 = dateTimeField13.getAsText((org.joda.time.ReadablePartial) localDateTime32, locale56);
        org.joda.time.Chronology chronology59 = localDateTime32.getChronology();
        org.joda.time.DateTimeField dateTimeField60 = chronology59.clockhourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime61 = instant9.toMutableDateTime(chronology59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant9", (dateTime0.compareTo(instant9) == 0) == dateTime0.equals(instant9));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = instant0.getChronology();
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        org.joda.time.Duration duration9 = duration5.withDurationAdded((long) 32772, (int) (byte) 10);
        java.lang.String str10 = duration5.toString();
        org.joda.time.Period period11 = duration5.toPeriod();
        org.joda.time.Instant instant12 = instant0.plus((org.joda.time.ReadableDuration) duration5);
        org.joda.time.Instant instant13 = instant12.toInstant();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property15 = dateTime14.era();
        org.joda.time.DateTime.Property property16 = dateTime14.weekyear();
        org.joda.time.DateTime dateTime18 = property16.setCopy(453);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeUtils.getZone(dateTimeZone19);
        java.lang.String str22 = dateTimeZone20.getName((long) ' ');
        java.lang.String str24 = dateTimeZone20.getName((long) (short) -1);
        org.joda.time.DateTime dateTime25 = dateTime18.withZoneRetainFields(dateTimeZone20);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        org.joda.time.Interval interval30 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableInstant) dateTime29);
        int int31 = dateTime28.getMinuteOfDay();
        int int32 = dateTime28.getYearOfCentury();
        int int33 = dateTime28.getDayOfMonth();
        org.joda.time.DateTime dateTime35 = dateTime28.minusWeeks((int) (short) 0);
        org.joda.time.DateTime.Property property36 = dateTime35.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField37 = property36.getField();
        int int38 = dateTimeField37.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.minusWeeks((int) (byte) 10);
        org.joda.time.Period period43 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = period43.toDurationFrom(readableInstant44);
        long long46 = duration45.getMillis();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime41.plus((org.joda.time.ReadableDuration) duration45);
        java.util.Locale locale49 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str50 = dateTimeField37.getAsText((org.joda.time.ReadablePartial) localDateTime41, (int) (short) 1, locale49);
        java.util.Locale locale51 = java.util.Locale.getDefault();
        java.lang.String str52 = locale49.getDisplayLanguage(locale51);
        java.lang.String str53 = dateTimeZone20.getShortName((long) (short) 100, locale49);
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.plusWeeks(0);
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.minusWeeks((int) (byte) 10);
        org.joda.time.Period period61 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.Duration duration63 = period61.toDurationFrom(readableInstant62);
        long long64 = duration63.getMillis();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime59.plus((org.joda.time.ReadableDuration) duration63);
        org.joda.time.Duration duration67 = duration63.minus((long) 38222);
        org.joda.time.Period period69 = new org.joda.time.Period((long) '#');
        int int71 = period69.getValue(0);
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime();
        org.joda.time.Interval interval74 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime72, (org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.Duration duration75 = period69.toDurationTo((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.Period period77 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.Duration duration79 = period77.toDurationFrom(readableInstant78);
        org.joda.time.Seconds seconds80 = duration79.toStandardSeconds();
        boolean boolean81 = duration75.isEqual((org.joda.time.ReadableDuration) duration79);
        boolean boolean82 = duration67.isLongerThan((org.joda.time.ReadableDuration) duration75);
        org.joda.time.Period period84 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant85 = null;
        org.joda.time.Duration duration86 = period84.toDurationFrom(readableInstant85);
        org.joda.time.Seconds seconds87 = duration86.toStandardSeconds();
        org.joda.time.Duration duration90 = duration86.withDurationAdded((long) 32772, (int) (byte) 10);
        java.lang.String str91 = duration86.toString();
        org.joda.time.Period period92 = duration86.toPeriod();
        boolean boolean93 = duration75.isEqual((org.joda.time.ReadableDuration) duration86);
        org.joda.time.LocalDateTime localDateTime94 = localDateTime54.plus((org.joda.time.ReadableDuration) duration86);
        org.joda.time.Instant instant96 = instant13.withDurationAdded((org.joda.time.ReadableDuration) duration86, 37434004);
        boolean boolean98 = duration86.equals((java.lang.Object) 51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime14", (instant0.compareTo(dateTime14) == 0) == instant0.equals(dateTime14));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.joda.time.Interval interval1 = org.joda.time.Interval.parse("2022-02-22T07:16:05.197Z/2022-02-22T07:16:05.197Z");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval();
        boolean boolean3 = interval1.isAfter((org.joda.time.ReadableInterval) mutableInterval2);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.plusWeeks((int) (byte) 1);
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        org.joda.time.MutableDateTime mutableDateTime8 = instant7.toMutableDateTimeISO();
        org.joda.time.Duration duration10 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.Interval interval13 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) dateTime12);
        int int14 = dateTime11.getMinuteOfDay();
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime17 = dateTime11.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = dateTime11.toDateTime(chronology18);
        org.joda.time.DateTime dateTime21 = dateTime11.minus((long) 10);
        org.joda.time.Period period22 = duration10.toPeriodFrom((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property24 = dateTime23.era();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime27 = dateTime25.plusWeeks((int) (byte) 1);
        int int28 = property24.compareTo((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime();
        org.joda.time.Interval interval31 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime30);
        boolean boolean33 = interval31.isAfter((long) 10);
        org.joda.time.Duration duration34 = interval31.toDuration();
        org.joda.time.Duration duration37 = duration34.withDurationAdded((long) (byte) 10, (int) (byte) 100);
        org.joda.time.Interval interval38 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableDuration) duration37);
        org.joda.time.Duration duration40 = duration10.withDurationAdded((org.joda.time.ReadableDuration) duration37, 26160257);
        org.joda.time.Instant instant41 = instant7.plus((org.joda.time.ReadableDuration) duration37);
        long long42 = instant7.getMillis();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime();
        org.joda.time.Interval interval45 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) dateTime44);
        int int46 = dateTime43.getMinuteOfDay();
        org.joda.time.DateTime dateTime48 = dateTime43.minusHours((int) 'a');
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate51 = localDate49.withCenturyOfEra(382);
        org.joda.time.LocalDate localDate53 = localDate51.plusDays((int) (byte) 10);
        org.joda.time.Interval interval54 = localDate53.toInterval();
        org.joda.time.DateTime dateTime55 = localDate53.toDateTimeAtStartOfDay();
        boolean boolean56 = dateTime48.isBefore((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.DateTime dateTime58 = dateTime48.plusMinutes(26151451);
        mutableInterval2.setInterval((org.joda.time.ReadableInstant) instant7, (org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.Instant instant61 = instant7.withMillis((long) 58);
        org.joda.time.Instant instant63 = instant61.plus((long) 52677884);
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property65 = dateTime64.millisOfDay();
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime();
        org.joda.time.Interval interval68 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime66, (org.joda.time.ReadableInstant) dateTime67);
        int int69 = dateTime66.getMinuteOfDay();
        int int70 = dateTime66.getYearOfCentury();
        int int71 = dateTime66.getDayOfMonth();
        org.joda.time.DateTime dateTime73 = dateTime66.minusWeeks((int) (short) 0);
        boolean boolean74 = dateTime64.isAfter((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime.Property property75 = dateTime64.weekOfWeekyear();
        org.joda.time.DateTime dateTime76 = property75.roundHalfFloorCopy();
        org.joda.time.TimeOfDay timeOfDay77 = dateTime76.toTimeOfDay();
        org.joda.time.Instant instant78 = dateTime76.toInstant();
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.Period period81 = new org.joda.time.Period((long) (-1), chronology80);
        org.joda.time.Period period82 = period81.toPeriod();
        int int83 = period82.size();
        int int84 = period82.getMinutes();
        int[] intArray85 = period82.getValues();
        org.joda.time.Duration duration86 = period82.toStandardDuration();
        org.joda.time.Duration duration88 = duration86.plus(1645514153208L);
        org.joda.time.Instant instant89 = instant78.minus((org.joda.time.ReadableDuration) duration86);
        org.joda.time.Instant instant92 = instant78.withDurationAdded(3291028467354L, 206);
        org.joda.time.Chronology chronology93 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) instant61, (org.joda.time.ReadableInstant) instant78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant7", (dateTime6.compareTo(instant7) == 0) == dateTime6.equals(instant7));
    }
}

