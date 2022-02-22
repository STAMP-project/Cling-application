import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1001");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.withWeekyear(2122);
        org.joda.time.Chronology chronology7 = dateTime1.getChronology();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(chronology7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        int int2 = mutableDateTime1.getCenturyOfEra();
        int int3 = mutableDateTime1.getDayOfYear();
        org.joda.time.Instant instant4 = mutableDateTime1.toInstant();
        org.joda.time.Instant instant6 = instant4.minus(0L);
        org.joda.time.MutableDateTime mutableDateTime7 = instant4.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant4", (mutableDateTime1.compareTo(instant4) == 0) == mutableDateTime1.equals(instant4));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(chronology2);
        org.joda.time.DateTimeField dateTimeField4 = chronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(1L);
        int int10 = mutableDateTime9.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.era();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime12.add(readablePeriod14, (int) (byte) 100);
        mutableDateTime9.setTime((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType18.getField(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.secondOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.hourOfDay();
        org.joda.time.DurationField durationField25 = dateTimeField24.getLeapDurationField();
        int int26 = mutableDateTime12.get(dateTimeField24);
        long long29 = dateTimeField24.add((long) 14, 1645455690);
        long long32 = dateTimeField24.add(0L, 54101692);
        long long34 = dateTimeField24.remainder((long) 32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(dateTimeZone37);
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime(dateTimeZone37);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DurationFieldType durationFieldType41 = dateTimeFieldType40.getDurationType();
        boolean boolean42 = localTime39.isSupported(durationFieldType41);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime46 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology47 = localTime46.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = dateTimeFieldType44.getField(chronology47);
        org.joda.time.DateTimeField dateTimeField49 = chronology47.secondOfDay();
        java.util.Locale locale51 = java.util.Locale.FRANCE;
        java.lang.String str52 = dateTimeField49.getAsText(7, locale51);
        java.lang.String str53 = dateTimeField24.getAsText((org.joda.time.ReadablePartial) localTime39, 0, locale51);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(dateTimeZone54);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime55.millisOfDay();
        java.lang.String str58 = mutableDateTime55.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        int int59 = mutableDateTime55.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime55.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime62 = property60.add(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime65 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology66 = localTime65.getChronology();
        org.joda.time.DateTimeField dateTimeField67 = dateTimeFieldType63.getField(chronology66);
        org.joda.time.DateTimeField dateTimeField68 = chronology66.secondOfDay();
        java.lang.String str70 = dateTimeField68.getAsShortText(10L);
        long long72 = dateTimeField68.roundHalfEven((long) 1);
        boolean boolean73 = dateTimeField68.isSupported();
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = dateTimeField68.getType();
        org.joda.time.DurationFieldType durationFieldType75 = dateTimeFieldType74.getRangeDurationType();
        mutableDateTime62.set(dateTimeFieldType74, 1439);
        boolean boolean78 = localTime39.isSupported(dateTimeFieldType74);
        int int79 = localTime39.getHourOfDay();
        org.joda.time.DateTime dateTime80 = localDate6.toDateTime(localTime39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime12", (mutableDateTime3.compareTo(mutableDateTime12) == 0) == mutableDateTime3.equals(mutableDateTime12));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus((long) 13);
        org.joda.time.Instant instant4 = instant2.minus((long) 901);
        org.joda.time.Instant instant7 = instant4.withDurationAdded((long) '#', 16);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant7.withDurationAdded(readableDuration8, 54137);
        org.joda.time.Instant instant11 = instant10.toInstant();
        org.joda.time.MutableDateTime mutableDateTime12 = instant10.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime13 = instant10.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime12", (instant10.compareTo(mutableDateTime12) == 0) == instant10.equals(mutableDateTime12));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((java.lang.Integer) (-3600000));
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        boolean boolean6 = mutableDateTime4.isAfter((long) 21);
        org.joda.time.Instant instant7 = mutableDateTime4.toInstant();
        mutableDateTime4.addMinutes(32769);
        int int12 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime4, "01/01/70 15:01", 8);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        long long21 = dateTimeZone16.convertLocalToUTC((long) 0, true, (long) 32772);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.millisOfSecond();
        boolean boolean24 = localTime22.isSupported(dateTimeFieldType23);
        org.joda.time.DurationFieldType durationFieldType25 = dateTimeFieldType23.getDurationType();
        mutableDateTime4.add(durationFieldType25, 81558000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and mutableDateTime15", (instant7.compareTo(mutableDateTime15) == 0) == instant7.equals(mutableDateTime15));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.withHourOfDay(13);
        org.joda.time.DateTime.Property property6 = dateTime1.centuryOfEra();
        org.joda.time.DateTime dateTime8 = dateTime1.withYearOfEra(12);
        org.joda.time.Instant instant10 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology11 = instant10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.weekyears();
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now(chronology11);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = chronology11.add(readablePeriod14, (long) 48, 2122);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology11);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) dateTime1, chronology11);
        org.joda.time.DateTimeField dateTimeField20 = chronology11.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withCenturyOfEra((int) '#');
        int int5 = dateTime1.getSecondOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withPivotYear(13);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter6.getPrinter();
        java.lang.String str10 = dateTime1.toString(dateTimeFormatter6);
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        int int12 = localDate11.getDayOfMonth();
        org.joda.time.LocalDate localDate14 = localDate11.plusYears((int) (byte) 100);
        org.joda.time.LocalDate localDate16 = localDate11.minusMonths(17);
        org.joda.time.DateTime dateTime17 = dateTime1.withFields((org.joda.time.ReadablePartial) localDate16);
        int int18 = localDate16.getYearOfEra();
        org.joda.time.LocalDate localDate20 = localDate16.plusYears(54410309);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale1 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withLocale(locale1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 121);
        boolean boolean5 = dateTimeFormatter4.isPrinter();
        java.lang.String str7 = dateTimeFormatter4.print((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        mutableDateTime9.setMinuteOfDay(100);
        boolean boolean12 = mutableDateTime9.isAfterNow();
        mutableDateTime9.add((long) 'a');
        boolean boolean15 = mutableDateTime9.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime9.setZoneRetainFields(dateTimeZone16);
        java.lang.String str19 = dateTimeZone16.getName((long) 54110417);
        org.joda.time.Instant instant20 = new org.joda.time.Instant();
        org.joda.time.Instant instant22 = instant20.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant25 = instant22.withDurationAdded(readableDuration23, (int) (short) 0);
        boolean boolean27 = instant22.isBefore((long) 5);
        java.util.Date date28 = instant22.toDate();
        int int29 = date28.getYear();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 0);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((java.lang.Object) date28, dateTimeZone32);
        boolean boolean34 = dateTimeZone16.equals((java.lang.Object) date28);
        java.util.Calendar.Builder builder35 = new java.util.Calendar.Builder();
        java.util.Calendar calendar36 = builder35.build();
        java.util.Calendar.Builder builder40 = builder35.setTimeOfDay((int) 'x', (int) 'u', 11);
        boolean boolean41 = dateTimeZone16.equals((java.lang.Object) 11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter4.withZone(dateTimeZone16);
        org.joda.time.LocalDate localDate43 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.Interval interval45 = localDate43.toInterval(dateTimeZone44);
        org.joda.time.LocalDate localDate47 = localDate43.plusMonths(0);
        org.joda.time.LocalDate.Property property48 = localDate47.year();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(dateTimeZone49);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime50.getZone();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(dateTimeZone52);
        org.joda.time.DateTimeZone dateTimeZone54 = mutableDateTime53.getZone();
        long long56 = dateTimeZone51.getMillisKeepLocal(dateTimeZone54, (long) 10);
        org.joda.time.DateMidnight dateMidnight57 = localDate47.toDateMidnight(dateTimeZone51);
        java.util.Locale locale59 = java.util.Locale.ENGLISH;
        java.util.Locale locale60 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet61 = locale60.getExtensionKeys();
        java.lang.String str62 = locale59.getDisplayScript(locale60);
        java.lang.String str63 = localDate47.toString("54127921", locale59);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = dateTimeFormatter4.withLocale(locale59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant20 and mutableDateTime50", (instant20.compareTo(mutableDateTime50) == 0) == instant20.equals(mutableDateTime50));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withWeekyear(3);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        int int5 = localDate4.getDayOfMonth();
        org.joda.time.LocalDate localDate7 = localDate4.plusYears((int) (byte) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Interval interval11 = localDate9.toInterval(dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate9.plusMonths(0);
        org.joda.time.LocalDate.Property property14 = localDate13.year();
        int int15 = localDate13.size();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        long long23 = dateTimeZone18.getMillisKeepLocal(dateTimeZone21, (long) 10);
        org.joda.time.DateTime dateTime24 = localDate13.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime.Property property26 = dateTime24.property(dateTimeFieldType25);
        int int27 = localDate4.get(dateTimeFieldType25);
        org.joda.time.LocalDate.Property property28 = localDate4.dayOfMonth();
        java.util.Locale locale30 = java.util.Locale.forLanguageTag("hi!");
        int int31 = property28.getMaximumTextLength(locale30);
        java.lang.String str32 = localDate2.toString("2022-02-21", locale30);
        java.lang.String str33 = localDate2.toString();
        org.joda.time.LocalDate localDate35 = localDate2.withMonthOfYear(7);
        org.joda.time.LocalDate.Property property36 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate37 = property36.getLocalDate();
        org.joda.time.Instant instant38 = org.joda.time.Instant.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean40 = instant38.isSupported(dateTimeFieldType39);
        org.joda.time.DurationFieldType durationFieldType41 = dateTimeFieldType39.getDurationType();
        boolean boolean42 = localDate37.isSupported(durationFieldType41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and instant38", (mutableDateTime17.compareTo(instant38) == 0) == mutableDateTime17.equals(instant38));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.withYear(8);
        org.joda.time.DateTime dateTime8 = dateTime1.withWeekyear(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DateTime.Property property10 = dateTime1.property(dateTimeFieldType9);
        java.lang.String str11 = dateTimeFieldType9.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        int int2 = mutableDateTime1.getRoundingMode();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.yearOfCentury();
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology6 = instant5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology6.weeks();
        org.joda.time.DateTimeField dateTimeField10 = chronology6.year();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        mutableDateTime12.setMinuteOfDay(100);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Interval interval17 = localDate15.toInterval(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate15.plusMonths(0);
        org.joda.time.LocalDate.Property property20 = localDate19.year();
        int int21 = localDate19.size();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        long long29 = dateTimeZone24.getMillisKeepLocal(dateTimeZone27, (long) 10);
        org.joda.time.DateTime dateTime30 = localDate19.toDateTimeAtMidnight(dateTimeZone27);
        int int31 = mutableDateTime12.compareTo((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        long long39 = dateTimeZone34.getMillisKeepLocal(dateTimeZone37, (long) 10);
        java.lang.String str40 = dateTimeZone37.toString();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now(dateTimeZone37);
        java.lang.String str42 = dateTimeZone37.toString();
        mutableDateTime12.setZone(dateTimeZone37);
        org.joda.time.Chronology chronology44 = chronology6.withZone(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField45 = chronology44.minuteOfDay();
        mutableDateTime1.setChronology(chronology44);
        org.joda.time.LocalDate localDate47 = org.joda.time.LocalDate.now();
        int int48 = localDate47.getDayOfMonth();
        org.joda.time.LocalDate localDate50 = localDate47.plusYears((int) (byte) 100);
        org.joda.time.Interval interval51 = localDate50.toInterval();
        org.joda.time.Chronology chronology52 = localDate50.getChronology();
        org.joda.time.DateTimeField dateTimeField53 = chronology52.centuryOfEra();
        org.joda.time.DateTime dateTime54 = mutableDateTime1.toDateTime(chronology52);
        int int55 = mutableDateTime1.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime23 and dateTime54", (mutableDateTime23.compareTo(dateTime54) == 0) == mutableDateTime23.equals(dateTime54));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfMinute();
        org.joda.time.DurationField durationField6 = dateTimeField5.getDurationField();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.years();
        java.lang.String str10 = durationFieldType9.toString();
        boolean boolean11 = localTime8.isSupported(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime14 = localTime8.withFieldAdded(durationFieldType12, 32772);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean18 = localTime16.equals((java.lang.Object) dateTimeFieldType17);
        org.joda.time.LocalTime.Property property19 = localTime8.property(dateTimeFieldType17);
        org.joda.time.LocalTime localTime20 = property19.withMaximumValue();
        int int21 = dateTimeField5.getMinimumValue((org.joda.time.ReadablePartial) localTime20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        org.joda.time.DateTime dateTime25 = localTime20.toDateTimeToday(dateTimeZone24);
        org.joda.time.DateTime.Property property26 = dateTime25.minuteOfHour();
        int int27 = dateTime25.getMillisOfDay();
        org.joda.time.Instant instant28 = dateTime25.toInstant();
        org.joda.time.Instant instant29 = instant28.toInstant();
        long long30 = instant28.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant28", (dateTime25.compareTo(instant28) == 0) == dateTime25.equals(instant28));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.weekOfWeekyear();
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        long long7 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) instant6);
        org.joda.time.DateTime dateTime8 = instant6.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        boolean boolean13 = dateTimeZone11.isStandardOffset((long) 11);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(dateTimeZone11);
        org.joda.time.DateTime dateTime15 = dateTime8.withZone(dateTimeZone11);
        org.joda.time.DateTime.Property property16 = dateTime8.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and dateTime15", (instant6.compareTo(dateTime15) == 0) == instant6.equals(dateTime15));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withPeriodAdded(readablePeriod5, (int) (short) 100);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.plus(readablePeriod9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.plusDays(100);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusDays(32770);
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.yearOfEra();
        java.util.Calendar calendar16 = java.util.Calendar.getInstance();
        boolean boolean17 = calendar16.isWeekDateSupported();
        java.util.Date date18 = calendar16.getTime();
        int int19 = calendar16.getMinimalDaysInFirstWeek();
        calendar16.setMinimalDaysInFirstWeek(21);
        calendar16.setFirstDayOfWeek(54185283);
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.fromCalendarFields(calendar16);
        java.util.Date date25 = localDate24.toDate();
        date25.setHours(32769);
        boolean boolean28 = localDateTime12.equals((java.lang.Object) 32769);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar16", (calendar0.compareTo(calendar16) == 0) == calendar0.equals(calendar16));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromMillisOfDay((long) 20, chronology3);
        org.joda.time.DurationField durationField5 = chronology3.eras();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.year();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField9 = dateTimeField8.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField9, and durationField5", !(durationField5.compareTo(durationField9) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField9.compareTo(durationField5))));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        int int2 = mutableDateTime1.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.era();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime4.add(readablePeriod6, (int) (byte) 100);
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType10.getField(chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.hourOfDay();
        org.joda.time.DurationField durationField17 = dateTimeField16.getLeapDurationField();
        int int18 = mutableDateTime4.get(dateTimeField16);
        mutableDateTime4.addHours(54092146);
        mutableDateTime4.setMillis((long) ' ');
        int int23 = mutableDateTime4.getMinuteOfDay();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime4.dayOfWeek();
        java.lang.Object obj25 = mutableDateTime4.clone();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        boolean boolean29 = mutableDateTime27.isAfter((long) 21);
        boolean boolean30 = mutableDateTime27.isBeforeNow();
        org.joda.time.Chronology chronology31 = mutableDateTime27.getChronology();
        int int32 = mutableDateTime4.compareTo((org.joda.time.ReadableInstant) mutableDateTime27);
        mutableDateTime4.addMillis(0);
        org.joda.time.Instant instant37 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology38 = instant37.getChronology();
        org.joda.time.LocalTime localTime39 = org.joda.time.LocalTime.fromMillisOfDay((long) 20, chronology38);
        org.joda.time.DateTimeField dateTimeField40 = chronology38.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField41 = chronology38.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField42 = chronology38.dayOfMonth();
        org.joda.time.DurationField durationField43 = chronology38.centuries();
        org.joda.time.DateTime dateTime44 = mutableDateTime4.toDateTime(chronology38);
        org.joda.time.DateTime dateTime46 = dateTime44.minusWeeks(54218359);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(dateTimeZone47);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime48.era();
        org.joda.time.MutableDateTime mutableDateTime50 = property49.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime52 = property49.addWrapField((-1));
        java.lang.String str53 = mutableDateTime52.toString();
        org.joda.time.MutableDateTime mutableDateTime55 = org.joda.time.MutableDateTime.parse("2022-02-21T14:02:50.892-01:00");
        mutableDateTime52.setMillis((org.joda.time.ReadableInstant) mutableDateTime55);
        boolean boolean57 = dateTime46.isEqual((org.joda.time.ReadableInstant) mutableDateTime52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime52 and mutableDateTime55", (mutableDateTime52.compareTo(mutableDateTime55) == 0) == mutableDateTime52.equals(mutableDateTime55));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale4.getDisplayScript(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone1, locale3);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean15 = timeZone1.observesDaylightTime();
        int int17 = timeZone1.getOffset((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.years();
        java.lang.String str23 = durationFieldType22.toString();
        boolean boolean24 = localTime21.isSupported(durationFieldType22);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime27 = localTime21.withFieldAdded(durationFieldType25, 32772);
        java.lang.String str28 = durationFieldType25.toString();
        java.lang.String str29 = durationFieldType25.toString();
        mutableDateTime19.add(durationFieldType25, 54264513);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.fromCalendarFields(calendar32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.plusSeconds(0);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.era();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.plusSeconds((int) 'a');
        java.util.Date date41 = localDateTime40.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = localDateTime40.getFieldType(0);
        mutableDateTime19.set(dateTimeFieldType43, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar32", (calendar13.compareTo(calendar32) == 0) == calendar13.equals(calendar32));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        int int4 = dateTimeZone2.getStandardOffset(0L);
        java.util.TimeZone timeZone5 = dateTimeZone2.toTimeZone();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("years");
        boolean boolean8 = timeZone5.hasSameRules(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(timeZone5);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.fromCalendarFields(calendar11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.plusWeeks(100);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.withDurationAdded(readableDuration18, 14);
        org.joda.time.ReadablePartial readablePartial21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime14.withFields(readablePartial21);
        boolean boolean23 = calendar10.before((java.lang.Object) localDateTime22);
        int int24 = localDateTime22.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar10 and calendar11", (calendar10.compareTo(calendar11) == 0) == calendar10.equals(calendar11));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getGreatestMinimum((int) (byte) 0);
        java.util.TimeZone timeZone3 = calendar0.getTimeZone();
        java.lang.String str4 = timeZone3.getID();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("years");
        java.time.ZoneId zoneId7 = timeZone6.toZoneId();
        boolean boolean8 = timeZone3.hasSameRules(timeZone6);
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("2022-02-21T15:00:33.584");
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        long long19 = dateTimeZone14.getMillisKeepLocal(dateTimeZone17, (long) 10);
        java.lang.String str20 = dateTimeZone17.toString();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone17);
        java.util.TimeZone timeZone22 = dateTimeZone17.toTimeZone();
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone22);
        calendar11.setTimeZone(timeZone22);
        java.util.TimeZone.setDefault(timeZone22);
        boolean boolean26 = timeZone6.hasSameRules(timeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar11", (calendar0.compareTo(calendar11) == 0) == calendar0.equals(calendar11));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        boolean boolean4 = mutableDateTime2.isAfter((long) 21);
        boolean boolean6 = mutableDateTime2.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        mutableDateTime2.setZone(dateTimeZone9);
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.lang.String str14 = locale12.getDisplayScript(locale13);
        java.lang.String str15 = locale12.getDisplayScript();
        java.lang.String str16 = dateTimeZone9.getShortName((long) 13, locale12);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.fromCalendarFields(calendar17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusSeconds(0);
        boolean boolean23 = dateTimeZone9.isLocalDateTimeGap(localDateTime20);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.plus(readablePeriod24);
        java.util.Date date26 = localDateTime25.toDate();
        int int27 = localDateTime25.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property28 = localDateTime25.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime29 = property28.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime30 = localDateTime29.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 0);
        java.lang.String str35 = dateTimeZone33.getShortName((long) 1645455690);
        org.joda.time.DateTime dateTime36 = dateTime30.withZone(dateTimeZone33);
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime(obj0, dateTimeZone33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and dateTime36", (dateTime30.compareTo(dateTime36) == 0) == dateTime30.equals(dateTime36));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.monthOfYear();
        org.joda.time.DateTime dateTime2 = property1.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime3 = dateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(7);
        org.joda.time.DateTime dateTime7 = dateTime3.minusYears(32770);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        boolean boolean9 = dateTime7.isSupported(dateTimeFieldType8);
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Interval interval12 = localDate10.toInterval(dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate10.plusMonths(0);
        org.joda.time.LocalDate.Property property15 = localDate14.year();
        int int16 = localDate14.size();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        long long24 = dateTimeZone19.getMillisKeepLocal(dateTimeZone22, (long) 10);
        org.joda.time.DateTime dateTime25 = localDate14.toDateTimeAtMidnight(dateTimeZone22);
        org.joda.time.DateTime.Property property26 = dateTime25.yearOfEra();
        org.joda.time.DateTime dateTime27 = property26.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        long long36 = dateTimeZone31.getMillisKeepLocal(dateTimeZone34, (long) 10);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(10L, dateTimeZone31);
        long long39 = dateTimeZone31.nextTransition((long) 12);
        org.joda.time.DateTime dateTime40 = dateTime27.withZone(dateTimeZone31);
        org.joda.time.DateTime dateTime41 = dateTime7.toDateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime43 = dateTime41.minusYears(54112697);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(6055);
        org.joda.time.DateTime dateTime46 = dateTime43.toDateTime(dateTimeZone45);
        java.util.GregorianCalendar gregorianCalendar47 = dateTime43.toGregorianCalendar();
        org.joda.time.DateTime.Property property48 = dateTime43.year();
        org.joda.time.DateTime dateTime49 = property48.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime43 and dateTime46", (dateTime43.compareTo(dateTime46) == 0) == dateTime43.equals(dateTime46));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.years();
        java.lang.String str4 = durationFieldType3.toString();
        boolean boolean5 = localTime2.isSupported(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime8 = localTime2.withFieldAdded(durationFieldType6, 32772);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        boolean boolean12 = mutableDateTime10.isAfter((long) 21);
        boolean boolean14 = mutableDateTime10.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        mutableDateTime10.setZone(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = localTime2.toDateTimeToday(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(19L, dateTimeZone17);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType21.getField(chronology24);
        mutableDateTime20.set(dateTimeFieldType21, (int) '#');
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime20.millisOfDay();
        mutableDateTime20.setWeekyear((int) ' ');
        org.joda.time.ReadableDuration readableDuration31 = null;
        mutableDateTime20.add(readableDuration31, 54107938);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime20.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis((-292275054));
        org.joda.time.LocalTime localTime37 = org.joda.time.LocalTime.now(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime20.toMutableDateTime(dateTimeZone36);
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now(dateTimeZone36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime20 and mutableDateTime38", (mutableDateTime20.compareTo(mutableDateTime38) == 0) == mutableDateTime20.equals(mutableDateTime38));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DurationField durationField6 = chronology3.seconds();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField10 = chronology3.dayOfWeek();
        int int11 = dateTimeField10.getMaximumValue();
        long long13 = dateTimeField10.roundHalfFloor(1646096400000L);
        org.joda.time.DurationField durationField14 = dateTimeField10.getRangeDurationField();
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology17 = instant16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.eras();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(chronology17);
        org.joda.time.LocalTime localTime21 = localTime19.withMillisOfDay((int) (short) 1);
        org.joda.time.LocalTime localTime23 = localTime19.withMinuteOfHour(8);
        org.joda.time.DateTimeField[] dateTimeFieldArray24 = localTime19.getFields();
        int int25 = dateTimeField10.getMinimumValue((org.joda.time.ReadablePartial) localTime19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField18", Math.signum(durationField6.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField6)));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.weekOfWeekyear();
        java.lang.String str6 = property5.toString();
        org.joda.time.LocalDate localDate7 = property5.roundHalfFloorCopy();
        int int8 = localDate7.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.era();
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.years();
        mutableDateTime10.add(durationFieldType12, (int) (short) 1);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.monthOfYear();
        org.joda.time.DurationField durationField16 = property15.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.roundCeiling();
        boolean boolean18 = localDate7.equals((java.lang.Object) mutableDateTime17);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.Interval interval21 = localDate19.toInterval(dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate19.plusMonths(0);
        org.joda.time.LocalDate.Property property24 = localDate23.year();
        int int25 = localDate23.size();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        long long33 = dateTimeZone28.getMillisKeepLocal(dateTimeZone31, (long) 10);
        org.joda.time.DateTime dateTime34 = localDate23.toDateTimeAtMidnight(dateTimeZone31);
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.lang.String str36 = locale35.toLanguageTag();
        boolean boolean37 = localDate23.equals((java.lang.Object) str36);
        org.joda.time.LocalDate localDate39 = localDate23.minusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDate localDate42 = localDate39.withPeriodAdded(readablePeriod40, 12);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = localDate42.toDateTimeAtCurrentTime(dateTimeZone43);
        boolean boolean45 = localDate7.equals((java.lang.Object) dateTime44);
        org.joda.time.DateTime dateTime46 = dateTime44.withTimeAtStartOfDay();
        java.util.Date date49 = new java.util.Date((-3600000L));
        org.joda.time.LocalDate localDate50 = org.joda.time.LocalDate.fromDateFields(date49);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone53 = mutableDateTime52.getZone();
        long long55 = dateTimeZone53.previousTransition((-431366460000L));
        java.lang.String str57 = dateTimeZone53.getNameKey((long) (byte) 10);
        org.joda.time.Interval interval58 = localDate50.toInterval(dateTimeZone53);
        java.lang.String str60 = dateTimeZone53.getName((long) 21235014);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetHours(276);
        long long64 = dateTimeZone53.getMillisKeepLocal(dateTimeZone62, 36275968667000L);
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(2380791384193590000L, dateTimeZone62);
        org.joda.time.DateTime dateTime66 = dateTime44.toDateTime(dateTimeZone62);
        org.joda.time.MutableDateTime mutableDateTime67 = dateTime66.toMutableDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        mutableDateTime67.add(readablePeriod68, 21362259);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime27 and dateTime66", (mutableDateTime27.compareTo(dateTime66) == 0) == mutableDateTime27.equals(dateTime66));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.year();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology2.getZone();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.minuteOfDay();
        org.joda.time.DurationField durationField8 = chronology2.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField8, and durationField3", !(durationField3.compareTo(durationField8) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField8.compareTo(durationField3))));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now();
        int int4 = localDate3.getDayOfMonth();
        org.joda.time.LocalDate localDate6 = localDate3.plusYears((int) (byte) 100);
        org.joda.time.Interval interval7 = localDate6.toInterval();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        long long15 = dateTimeZone10.getMillisKeepLocal(dateTimeZone13, (long) 10);
        java.lang.String str16 = dateTimeZone10.toString();
        org.joda.time.DateTime dateTime17 = localDate6.toDateTimeAtMidnight(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime1.toMutableDateTime(dateTimeZone10);
        java.lang.String str19 = mutableDateTime18.toString();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.yearOfCentury();
        org.joda.time.Chronology chronology21 = mutableDateTime18.getChronology();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        mutableDateTime23.setMinuteOfDay(100);
        boolean boolean26 = mutableDateTime23.isAfterNow();
        boolean boolean27 = mutableDateTime23.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        mutableDateTime23.setZoneRetainFields(dateTimeZone30);
        mutableDateTime23.setMillisOfSecond((int) '4');
        mutableDateTime18.setMillis((org.joda.time.ReadableInstant) mutableDateTime23);
        org.joda.time.Instant instant35 = mutableDateTime18.toInstant();
        org.joda.time.ReadableDuration readableDuration36 = null;
        mutableDateTime18.add(readableDuration36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime23 and instant35", (mutableDateTime23.compareTo(instant35) == 0) == mutableDateTime23.equals(instant35));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        int int6 = localDate4.size();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        long long14 = dateTimeZone9.getMillisKeepLocal(dateTimeZone12, (long) 10);
        org.joda.time.DateTime dateTime15 = localDate4.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DateTime dateTime18 = dateTime15.withField(dateTimeFieldType16, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        long long26 = dateTimeZone21.getMillisKeepLocal(dateTimeZone24, (long) 10);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime18.toMutableDateTime(dateTimeZone21);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.era();
        org.joda.time.LocalDate localDate32 = org.joda.time.LocalDate.now();
        int int33 = localDate32.getDayOfMonth();
        org.joda.time.LocalDate localDate35 = localDate32.plusYears((int) (byte) 100);
        org.joda.time.Interval interval36 = localDate35.toInterval();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone39 = mutableDateTime38.getZone();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone42 = mutableDateTime41.getZone();
        long long44 = dateTimeZone39.getMillisKeepLocal(dateTimeZone42, (long) 10);
        java.lang.String str45 = dateTimeZone39.toString();
        org.joda.time.DateTime dateTime46 = localDate35.toDateTimeAtMidnight(dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime30.toMutableDateTime(dateTimeZone39);
        mutableDateTime27.setZoneRetainFields(dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(dateTimeZone49);
        boolean boolean52 = mutableDateTime50.isAfter((long) 21);
        boolean boolean54 = mutableDateTime50.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 0);
        org.joda.time.DateTime dateTime58 = mutableDateTime50.toDateTime(dateTimeZone57);
        long long60 = dateTimeZone39.getMillisKeepLocal(dateTimeZone57, (-75657078L));
        long long64 = dateTimeZone57.convertLocalToUTC((long) 52185046, true, 3166408813931L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime50 and dateTime58", (mutableDateTime50.compareTo(dateTime58) == 0) == mutableDateTime50.equals(dateTime58));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.hourOfDay();
        org.joda.time.DurationField durationField7 = chronology3.weeks();
        org.joda.time.DurationField durationField8 = chronology3.days();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = chronology3.minuteOfHour();
        org.joda.time.DurationField durationField11 = chronology3.weeks();
        org.joda.time.DateTimeField dateTimeField12 = chronology3.weekyearOfCentury();
        org.joda.time.DurationField durationField13 = chronology3.weekyears();
        org.joda.time.DurationField durationField14 = chronology3.millis();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = org.joda.time.format.DateTimeFormat.mediumTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter15.withPivotYear((java.lang.Integer) (-3600000));
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology20 = instant19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.eras();
        org.joda.time.DateTimeZone dateTimeZone22 = chronology20.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter17.withZone(dateTimeZone22);
        org.joda.time.Chronology chronology24 = chronology3.withZone(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField21", Math.signum(durationField7.compareTo(durationField21)) == -Math.signum(durationField21.compareTo(durationField7)));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        mutableDateTime1.setMillis(12L);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime1.add(readablePeriod5, 3);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime1.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime1.add(readablePeriod10);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology14 = instant13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.yearOfEra();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.DateTimeField dateTimeField18 = chronology14.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField19 = chronology14.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime1.toMutableDateTime(chronology14);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime23 = property21.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime24 = property21.roundCeiling();
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now();
        int int26 = localDate25.getDayOfMonth();
        org.joda.time.LocalDate localDate28 = localDate25.plusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone29);
        boolean boolean32 = mutableDateTime30.isAfter((long) 21);
        boolean boolean34 = mutableDateTime30.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        mutableDateTime30.setZone(dateTimeZone37);
        org.joda.time.DateTime dateTime39 = localDate25.toDateTimeAtStartOfDay(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(dateTimeZone37);
        org.joda.time.LocalDate localDate41 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate43 = localDate41.withWeekyear(3);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(dateTimeZone45);
        org.joda.time.DateTimeZone dateTimeZone47 = mutableDateTime46.getZone();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone48);
        org.joda.time.DateTimeZone dateTimeZone50 = mutableDateTime49.getZone();
        long long52 = dateTimeZone47.getMillisKeepLocal(dateTimeZone50, (long) 10);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(10L, dateTimeZone47);
        long long55 = dateTimeZone47.nextTransition((long) 12);
        org.joda.time.DateTime dateTime56 = localDate41.toDateTimeAtMidnight(dateTimeZone47);
        long long58 = dateTimeZone37.getMillisKeepLocal(dateTimeZone47, (long) '#');
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime60 = mutableDateTime59.copy();
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime59.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime62 = property61.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime63 = property61.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime65 = property61.add((long) 54195816);
        mutableDateTime24.setMillis((org.joda.time.ReadableInstant) mutableDateTime65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime24 and mutableDateTime65", (mutableDateTime24.compareTo(mutableDateTime65) == 0) == mutableDateTime24.equals(mutableDateTime65));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, (int) (short) 0);
        boolean boolean7 = instant2.isBefore((long) 5);
        java.util.Date date8 = instant2.toDate();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant2.withDurationAdded(readableDuration9, (int) ' ');
        org.joda.time.Instant instant13 = instant2.withMillis(1646092800000L);
        org.joda.time.MutableDateTime mutableDateTime14 = instant2.toMutableDateTime();
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Interval interval17 = localDate15.toInterval(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate15.plusMonths(0);
        org.joda.time.LocalDate.Property property20 = localDate19.year();
        int int21 = localDate19.size();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        long long29 = dateTimeZone24.getMillisKeepLocal(dateTimeZone27, (long) 10);
        org.joda.time.DateTime dateTime30 = localDate19.toDateTimeAtMidnight(dateTimeZone27);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime.Property property32 = dateTime30.property(dateTimeFieldType31);
        org.joda.time.DateTime dateTime33 = property32.roundCeilingCopy();
        mutableDateTime14.setMillis((org.joda.time.ReadableInstant) dateTime33);
        mutableDateTime14.addMillis(54503131);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime23", (instant0.compareTo(mutableDateTime23) == 0) == instant0.equals(mutableDateTime23));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        java.lang.Object obj2 = mutableDateTime1.clone();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.weekyear();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now();
        boolean boolean5 = mutableDateTime4.isAfterNow();
        org.joda.time.ReadableDuration readableDuration6 = null;
        mutableDateTime4.add(readableDuration6, (int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfHour();
        java.lang.String str10 = dateTimeFieldType9.toString();
        mutableDateTime4.set(dateTimeFieldType9, 21);
        boolean boolean13 = mutableDateTime1.isSupported(dateTimeFieldType9);
        org.joda.time.Instant instant14 = new org.joda.time.Instant();
        org.joda.time.Instant instant16 = instant14.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Instant instant19 = instant16.withDurationAdded(readableDuration17, (int) (short) 0);
        boolean boolean21 = instant16.isBefore((long) 5);
        org.joda.time.Instant instant22 = instant16.toInstant();
        org.joda.time.Instant instant24 = instant22.minus(32769L);
        org.joda.time.Instant instant27 = instant24.withDurationAdded((long) 54152000, 54139233);
        org.joda.time.Instant instant28 = instant27.toInstant();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant27);
        org.joda.time.LocalDate localDate30 = org.joda.time.LocalDate.now();
        int int31 = localDate30.getDayOfMonth();
        org.joda.time.LocalDate localDate33 = localDate30.plusYears((int) (byte) 100);
        org.joda.time.LocalDate.Property property34 = localDate33.centuryOfEra();
        int int35 = property34.getMaximumValueOverall();
        org.joda.time.LocalDate localDate36 = property34.roundFloorCopy();
        org.joda.time.LocalDate localDate38 = localDate36.minusDays(12);
        org.joda.time.LocalDate localDate40 = localDate36.withWeekyear(10);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalDate localDate43 = localDate40.withPeriodAdded(readablePeriod41, 2922789);
        org.joda.time.LocalDate.Property property44 = localDate40.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(dateTimeZone45);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime46.era();
        int int48 = property44.compareTo((org.joda.time.ReadableInstant) mutableDateTime46);
        org.joda.time.LocalDate localDate50 = property44.addWrapFieldToCopy(21171558);
        org.joda.time.LocalDate localDate52 = localDate50.minusMonths(54113409);
        org.joda.time.LocalDate localDate53 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.Interval interval55 = localDate53.toInterval(dateTimeZone54);
        org.joda.time.LocalDate localDate57 = localDate53.plusMonths(0);
        org.joda.time.LocalDate.Property property58 = localDate57.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.LocalDate localDate60 = localDate57.minus(readablePeriod59);
        org.joda.time.LocalDate localDate61 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate63 = localDate61.withYearOfEra((int) '4');
        boolean boolean64 = localDate60.isBefore((org.joda.time.ReadablePartial) localDate61);
        org.joda.time.LocalDate localDate66 = localDate61.minusDays((int) (byte) 100);
        org.joda.time.LocalDate.Property property67 = localDate61.dayOfMonth();
        org.joda.time.LocalDate localDate69 = property67.setCopy(9);
        org.joda.time.DateTimeField dateTimeField70 = property67.getField();
        org.joda.time.LocalDate localDate71 = property67.roundFloorCopy();
        int int72 = localDate50.compareTo((org.joda.time.ReadablePartial) localDate71);
        org.joda.time.LocalDate localDate74 = localDate50.plusYears(54405);
        boolean boolean75 = instant27.equals((java.lang.Object) localDate74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant27", (mutableDateTime1.compareTo(instant27) == 0) == mutableDateTime1.equals(instant27));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        int int2 = localDate1.getDayOfMonth();
        org.joda.time.LocalDate localDate4 = localDate1.plusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        boolean boolean8 = mutableDateTime6.isAfter((long) 21);
        boolean boolean10 = mutableDateTime6.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        mutableDateTime6.setZone(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = localDate1.toDateTimeAtStartOfDay(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime0.withFields((org.joda.time.ReadablePartial) localDate1);
        org.joda.time.DateTime dateTime18 = dateTime16.withHourOfDay(0);
        org.joda.time.DateMidnight dateMidnight19 = dateTime16.toDateMidnight();
        org.joda.time.DateTime.Property property20 = dateTime16.yearOfCentury();
        org.joda.time.Instant instant21 = org.joda.time.Instant.now();
        org.joda.time.Instant instant23 = instant21.minus((long) 13);
        org.joda.time.Instant instant25 = instant23.minus((long) 901);
        org.joda.time.DateTime dateTime26 = instant25.toDateTime();
        org.joda.time.Instant instant29 = instant25.withDurationAdded(894L, 202365);
        long long30 = property20.getDifferenceAsLong((org.joda.time.ReadableInstant) instant25);
        org.joda.time.MutableDateTime mutableDateTime31 = instant25.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant21", (dateTime0.compareTo(instant21) == 0) == dateTime0.equals(instant21));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.years();
        java.lang.String str6 = durationFieldType5.toString();
        boolean boolean7 = localTime4.isSupported(durationFieldType5);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime10 = localTime4.withFieldAdded(durationFieldType8, 32772);
        org.joda.time.LocalTime.Property property11 = localTime4.hourOfDay();
        org.joda.time.LocalTime localTime12 = property11.roundCeilingCopy();
        org.joda.time.LocalTime localTime13 = property11.withMinimumValue();
        org.joda.time.LocalTime localTime14 = property11.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime16 = localTime14.plusHours(11);
        org.joda.time.LocalTime localTime18 = localTime16.minusMinutes((-1));
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = localTime16.getFieldType((int) (short) 0);
        boolean boolean21 = dateTime1.isSupported(dateTimeFieldType20);
        org.joda.time.DateTime dateTime23 = dateTime1.plus(2380791384193590000L);
        org.joda.time.DateTime dateTime24 = dateTime1.withLaterOffsetAtOverlap();
        org.joda.time.YearMonthDay yearMonthDay25 = dateTime1.toYearMonthDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder3 = builder0.setLenient(true);
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("years");
        boolean boolean6 = timeZone5.observesDaylightTime();
        java.util.Locale locale7 = java.util.Locale.UK;
        java.util.Locale locale8 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale10 = java.util.Locale.KOREA;
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = locale10.getDisplayScript(locale11);
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.util.Locale locale14 = java.util.Locale.UK;
        java.lang.String str15 = locale8.getDisplayScript(locale14);
        java.lang.String str16 = locale7.getDisplayLanguage(locale14);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone5, locale7);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        timeZone5.setRawOffset(0);
        java.time.ZoneId zoneId21 = timeZone5.toZoneId();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone(zoneId21);
        timeZone22.setRawOffset((int) (byte) 0);
        java.lang.String str25 = timeZone22.getID();
        java.util.Calendar.Builder builder26 = builder0.setTimeZone(timeZone22);
        org.joda.time.Instant instant27 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime28 = instant27.toDateTime();
        org.joda.time.DateTime.Property property29 = dateTime28.weekOfWeekyear();
        org.joda.time.DateTime dateTime31 = dateTime28.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime33 = dateTime28.withYear(8);
        org.joda.time.DateTime dateTime35 = dateTime28.withWeekyear(1);
        java.util.Date date36 = dateTime28.toDate();
        java.util.Calendar calendar37 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.fromCalendarFields(calendar37);
        calendar37.set(13, (int) (byte) -1, 2);
        java.time.Instant instant43 = calendar37.toInstant();
        java.util.Date date44 = java.util.Date.from(instant43);
        java.time.Instant instant45 = date44.toInstant();
        int int46 = date44.getYear();
        boolean boolean47 = date36.after(date44);
        java.util.Calendar.Builder builder48 = builder26.setInstant(date36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant27 and dateTime28", (instant27.compareTo(dateTime28) == 0) == instant27.equals(dateTime28));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundHalfCeiling();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime5.add(readableDuration7, 0);
        mutableDateTime3.setTime((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime3.era();
        java.util.Calendar calendar12 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.fromCalendarFields(calendar12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.plusWeeks(100);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plus(readablePeriod19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusYears(54092146);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.era();
        boolean boolean24 = mutableDateTime3.equals((java.lang.Object) property23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime3.add(readablePeriod25, 0);
        org.joda.time.Instant instant28 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime29 = instant28.toDateTime();
        org.joda.time.DateTime.Property property30 = dateTime29.weekOfWeekyear();
        org.joda.time.DateTime dateTime32 = dateTime29.withCenturyOfEra((int) '#');
        int int33 = dateTime29.getSecondOfDay();
        org.joda.time.Chronology chronology34 = dateTime29.getChronology();
        org.joda.time.DateTime.Property property35 = dateTime29.yearOfCentury();
        int int36 = mutableDateTime3.compareTo((org.joda.time.ReadableInstant) dateTime29);
        mutableDateTime3.setTime((long) 21227);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and instant28", (mutableDateTime5.compareTo(instant28) == 0) == mutableDateTime5.equals(instant28));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        boolean boolean7 = mutableDateTime5.isAfter((long) 21);
        boolean boolean9 = mutableDateTime5.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        mutableDateTime5.setZone(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = localDate0.toDateTimeAtStartOfDay(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate18 = localDate16.withWeekyear(3);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        long long27 = dateTimeZone22.getMillisKeepLocal(dateTimeZone25, (long) 10);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(10L, dateTimeZone22);
        long long30 = dateTimeZone22.nextTransition((long) 12);
        org.joda.time.DateTime dateTime31 = localDate16.toDateTimeAtMidnight(dateTimeZone22);
        long long33 = dateTimeZone12.getMillisKeepLocal(dateTimeZone22, (long) '#');
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(dateTimeZone12);
        org.joda.time.LocalDate localDate36 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.Interval interval38 = localDate36.toInterval(dateTimeZone37);
        org.joda.time.LocalDate localDate40 = localDate36.plusMonths(0);
        org.joda.time.LocalDate.Property property41 = localDate40.year();
        int int42 = localDate40.size();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone45 = mutableDateTime44.getZone();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone48 = mutableDateTime47.getZone();
        long long50 = dateTimeZone45.getMillisKeepLocal(dateTimeZone48, (long) 10);
        org.joda.time.DateTime dateTime51 = localDate40.toDateTimeAtMidnight(dateTimeZone48);
        org.joda.time.DateTime.Property property52 = dateTime51.yearOfEra();
        org.joda.time.DateTime dateTime53 = property52.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime55 = property52.addToCopy((int) 'u');
        org.joda.time.DateTime dateTime57 = property52.setCopy(19);
        org.joda.time.DateTime dateTime59 = dateTime57.plusMonths(2922789);
        org.joda.time.DateTime.Property property60 = dateTime57.dayOfMonth();
        org.joda.time.Instant instant61 = dateTime57.toInstant();
        org.joda.time.MutableDateTime mutableDateTime62 = instant61.toMutableDateTimeISO();
        int int63 = dateTimeZone12.getOffset((org.joda.time.ReadableInstant) instant61);
        org.joda.time.Chronology chronology64 = instant61.getChronology();
        org.joda.time.DateTimeField dateTimeField65 = chronology64.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime57 and instant61", (dateTime57.compareTo(instant61) == 0) == dateTime57.equals(instant61));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        mutableDateTime1.setMillis(12L);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime1.add(readablePeriod5, 3);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime1.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime1.add(readablePeriod10);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology14 = instant13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.yearOfEra();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.DateTimeField dateTimeField18 = chronology14.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField19 = chronology14.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime1.toMutableDateTime(chronology14);
        int int21 = mutableDateTime1.getMinuteOfDay();
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology24 = instant23.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.eras();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(chronology24);
        org.joda.time.DateTimeField dateTimeField27 = chronology24.clockhourOfDay();
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(chronology24);
        org.joda.time.DateTimeZone dateTimeZone29 = chronology24.getZone();
        mutableDateTime1.setZone(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField25", Math.signum(durationField15.compareTo(durationField25)) == -Math.signum(durationField25.compareTo(durationField15)));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay();
        org.joda.time.DateTime.Property property5 = dateTime4.secondOfDay();
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.util.Locale locale10 = java.util.Locale.KOREA;
        java.lang.String str11 = locale10.toLanguageTag();
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.lang.String str13 = locale10.getDisplayCountry(locale12);
        java.lang.String str14 = locale8.getDisplayCountry(locale10);
        org.joda.time.DateTime dateTime15 = property5.setCopy("22", locale8);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone16);
        mutableDateTime17.setMinuteOfDay(100);
        boolean boolean20 = mutableDateTime17.isAfterNow();
        mutableDateTime17.add((long) 'a');
        boolean boolean23 = mutableDateTime17.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime17.setZoneRetainFields(dateTimeZone24);
        java.lang.String str27 = dateTimeZone24.getName((long) 54110417);
        org.joda.time.Instant instant28 = new org.joda.time.Instant();
        org.joda.time.Instant instant30 = instant28.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Instant instant33 = instant30.withDurationAdded(readableDuration31, (int) (short) 0);
        boolean boolean35 = instant30.isBefore((long) 5);
        java.util.Date date36 = instant30.toDate();
        int int37 = date36.getYear();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 0);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((java.lang.Object) date36, dateTimeZone40);
        boolean boolean42 = dateTimeZone24.equals((java.lang.Object) date36);
        java.util.Calendar.Builder builder43 = new java.util.Calendar.Builder();
        java.util.Calendar calendar44 = builder43.build();
        java.util.Calendar.Builder builder48 = builder43.setTimeOfDay((int) 'x', (int) 'u', 11);
        boolean boolean49 = dateTimeZone24.equals((java.lang.Object) 11);
        org.joda.time.DateTime dateTime50 = dateTime15.toDateTime(dateTimeZone24);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.DateTime dateTime53 = dateTime50.withPeriodAdded(readablePeriod51, 54211751);
        java.lang.String str54 = dateTime53.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime53", (dateTime15.compareTo(dateTime53) == 0) == dateTime15.equals(dateTime53));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime1.toMutableDateTime();
        mutableDateTime1.addDays(19);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.dayOfMonth();
        mutableDateTime1.addMonths(21);
        int int10 = mutableDateTime1.getMinuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime1.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property12.addWrapField(9);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.LocalTime localTime18 = localTime16.minusHours(32772);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.months();
        mutableDateTime19.add(durationFieldType21, 2023);
        boolean boolean24 = localTime18.isSupported(durationFieldType21);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.years();
        java.lang.String str28 = durationFieldType27.toString();
        boolean boolean29 = localTime26.isSupported(durationFieldType27);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime32 = localTime26.withFieldAdded(durationFieldType30, 32772);
        org.joda.time.LocalTime.Property property33 = localTime26.hourOfDay();
        org.joda.time.LocalTime localTime35 = localTime26.minusMinutes(2922789);
        org.joda.time.Instant instant37 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology38 = instant37.getChronology();
        org.joda.time.MutableDateTime mutableDateTime39 = org.joda.time.MutableDateTime.now(chronology38);
        boolean boolean40 = localTime26.equals((java.lang.Object) chronology38);
        org.joda.time.DateTimeField dateTimeField41 = chronology38.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField42 = chronology38.year();
        org.joda.time.DateTimeField dateTimeField43 = chronology38.dayOfYear();
        org.joda.time.DateTimeField dateTimeField44 = chronology38.millisOfDay();
        boolean boolean45 = durationFieldType21.isSupported(chronology38);
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType48 = org.joda.time.DurationFieldType.years();
        java.lang.String str49 = durationFieldType48.toString();
        boolean boolean50 = localTime47.isSupported(durationFieldType48);
        org.joda.time.DurationFieldType durationFieldType51 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime53 = localTime47.withFieldAdded(durationFieldType51, 32772);
        org.joda.time.LocalTime.Property property54 = localTime47.hourOfDay();
        org.joda.time.LocalTime localTime55 = property54.roundCeilingCopy();
        org.joda.time.LocalTime localTime56 = property54.withMinimumValue();
        org.joda.time.LocalTime localTime57 = property54.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime58 = property54.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime60 = property54.addWrapFieldToCopy(54100989);
        org.joda.time.LocalTime localTime62 = localTime60.plusSeconds(292278994);
        org.joda.time.LocalTime localTime64 = localTime60.withHourOfDay(13);
        org.joda.time.DurationFieldType durationFieldType65 = org.joda.time.DurationFieldType.eras();
        java.lang.String str66 = durationFieldType65.getName();
        boolean boolean67 = localTime64.isSupported(durationFieldType65);
        java.lang.String str68 = durationFieldType65.toString();
        org.joda.time.Instant instant69 = new org.joda.time.Instant();
        org.joda.time.Instant instant71 = instant69.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration72 = null;
        org.joda.time.Instant instant74 = instant71.withDurationAdded(readableDuration72, (int) (short) 0);
        boolean boolean76 = instant71.isBefore((long) 5);
        java.util.Date date77 = instant71.toDate();
        org.joda.time.ReadableDuration readableDuration78 = null;
        org.joda.time.Instant instant80 = instant71.withDurationAdded(readableDuration78, (int) ' ');
        org.joda.time.Instant instant81 = instant71.toInstant();
        org.joda.time.Chronology chronology82 = instant81.getChronology();
        org.joda.time.Chronology chronology83 = chronology82.withUTC();
        boolean boolean84 = durationFieldType65.isSupported(chronology82);
        org.joda.time.DurationField durationField85 = durationFieldType21.getField(chronology82);
        mutableDateTime14.add(durationFieldType21, 54304029);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and mutableDateTime39", (mutableDateTime4.compareTo(mutableDateTime39) == 0) == mutableDateTime4.equals(mutableDateTime39));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.DateTime dateTime7 = dateTime1.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime1.minus(1707456419961249298L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withCenturyOfEra((int) '#');
        int int5 = dateTime1.getSecondOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withPivotYear(13);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter6.getPrinter();
        java.lang.String str10 = dateTime1.toString(dateTimeFormatter6);
        int int11 = dateTime1.getYear();
        org.joda.time.LocalDate localDate12 = dateTime1.toLocalDate();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.parse("2122-02-21T00:00:00.000Z");
        org.joda.time.LocalDate localDate15 = dateTime14.toLocalDate();
        org.joda.time.DateTime dateTime16 = localDate12.toDateTime((org.joda.time.ReadableInstant) dateTime14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.years();
        java.lang.String str4 = durationFieldType3.toString();
        boolean boolean5 = localTime2.isSupported(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime8 = localTime2.withFieldAdded(durationFieldType6, 32772);
        org.joda.time.LocalTime.Property property9 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime11 = localTime2.minusMinutes(19);
        org.joda.time.Chronology chronology12 = localTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType0.getField(chronology12);
        org.joda.time.DateTimeField dateTimeField15 = chronology12.hourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.DateTimeField dateTimeField17 = chronology12.clockhourOfHalfday();
        long long19 = dateTimeField17.roundFloor((long) 564);
        java.util.Locale locale21 = java.util.Locale.KOREA;
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.lang.String str23 = locale21.getDisplayScript(locale22);
        java.util.Locale locale24 = java.util.Locale.KOREA;
        java.lang.String str25 = locale24.toLanguageTag();
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.lang.String str27 = locale24.getDisplayCountry(locale26);
        java.lang.String str28 = locale22.getDisplayCountry(locale24);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        long long36 = dateTimeZone31.getMillisKeepLocal(dateTimeZone34, (long) 10);
        java.lang.String str37 = dateTimeZone31.toString();
        java.util.Locale locale39 = java.util.Locale.KOREA;
        java.lang.String str40 = locale39.toLanguageTag();
        java.util.Locale locale41 = java.util.Locale.KOREA;
        java.lang.String str42 = locale39.getDisplayCountry(locale41);
        java.lang.String str43 = dateTimeZone31.getName((long) 54089980, locale41);
        java.lang.String str44 = locale41.getDisplayLanguage();
        java.lang.String str45 = locale24.getDisplayName(locale41);
        java.lang.String str46 = locale24.toLanguageTag();
        java.util.Locale locale47 = locale24.stripExtensions();
        boolean boolean48 = locale24.hasExtensions();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime51 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology52 = localTime51.getChronology();
        org.joda.time.DateTimeField dateTimeField53 = dateTimeFieldType49.getField(chronology52);
        org.joda.time.DateTimeField dateTimeField54 = chronology52.secondOfDay();
        int int57 = dateTimeField54.getDifference(1645455690671L, (long) (short) 100);
        long long59 = dateTimeField54.remainder((long) (short) 0);
        java.util.Locale locale60 = java.util.Locale.ITALIAN;
        int int61 = dateTimeField54.getMaximumTextLength(locale60);
        java.lang.String str62 = locale24.getDisplayCountry(locale60);
        java.lang.String str63 = dateTimeField17.getAsText(1645456076147L, locale24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and mutableDateTime30", (mutableDateTime13.compareTo(mutableDateTime30) == 0) == mutableDateTime13.equals(mutableDateTime30));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Instant instant5 = instant3.plus(19L);
        org.joda.time.DateTime dateTime6 = instant5.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime7 = instant5.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime7.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime6", (instant5.compareTo(dateTime6) == 0) == instant5.equals(dateTime6));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        long long7 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 10);
        java.lang.String str8 = dateTimeZone5.toString();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone5);
        java.util.TimeZone timeZone10 = dateTimeZone5.toTimeZone();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone10, locale12);
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone10);
        java.util.Calendar calendar15 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.fromCalendarFields(calendar15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.hourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = property19.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withMillisOfDay(54096794);
        org.joda.time.tz.NameProvider nameProvider23 = org.joda.time.DateTimeZone.getNameProvider();
        boolean boolean24 = localDateTime22.equals((java.lang.Object) nameProvider23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.millisOfDay();
        java.util.Locale locale28 = java.util.Locale.GERMANY;
        java.lang.String str29 = property27.getAsText(locale28);
        java.lang.String str30 = locale28.getISO3Language();
        java.lang.String str33 = nameProvider23.getShortName(locale28, "3:01 PM", "7");
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(timeZone10, locale28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar15", (calendar13.compareTo(calendar15) == 0) == calendar13.equals(calendar15));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.LocalDate.Property property4 = localDate3.centuryOfEra();
        int int5 = property4.getMaximumValueOverall();
        org.joda.time.LocalDate localDate6 = property4.roundFloorCopy();
        org.joda.time.LocalDate localDate8 = localDate6.minusDays(12);
        org.joda.time.LocalDate localDate10 = localDate6.withWeekyear(10);
        org.joda.time.DateTime dateTime11 = localDate10.toDateTimeAtStartOfDay();
        org.joda.time.DateTime dateTime12 = dateTime11.toDateTimeISO();
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekyear(54112697);
        org.joda.time.DateTime dateTime16 = dateTime14.withCenturyOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.now();
        int int18 = localDate17.getDayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate20 = localDate17.plus(readablePeriod19);
        org.joda.time.LocalDate localDate22 = localDate17.withCenturyOfEra(21);
        int int23 = localDate17.getEra();
        int int24 = localDate17.getWeekyear();
        org.joda.time.Chronology chronology25 = localDate17.getChronology();
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.Interval interval28 = localDate26.toInterval(dateTimeZone27);
        org.joda.time.LocalDate localDate30 = localDate26.plusMonths(0);
        org.joda.time.LocalDate.Property property31 = localDate30.year();
        int int32 = localDate30.size();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        long long40 = dateTimeZone35.getMillisKeepLocal(dateTimeZone38, (long) 10);
        org.joda.time.DateTime dateTime41 = localDate30.toDateTimeAtMidnight(dateTimeZone38);
        org.joda.time.DateTime.Property property42 = dateTime41.yearOfEra();
        org.joda.time.DateTime dateTime43 = property42.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate44 = dateTime43.toLocalDate();
        int[] intArray46 = chronology25.get((org.joda.time.ReadablePartial) localDate44, (long) 3277222);
        org.joda.time.DurationField durationField47 = chronology25.seconds();
        org.joda.time.DateTimeField dateTimeField48 = chronology25.monthOfYear();
        org.joda.time.DateTimeField dateTimeField49 = chronology25.minuteOfHour();
        org.joda.time.DateTime dateTime50 = dateTime16.withChronology(chronology25);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(chronology25);
        org.joda.time.DurationField durationField52 = chronology25.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime50", (dateTime16.compareTo(dateTime50) == 0) == dateTime16.equals(dateTime50));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfMinute();
        org.joda.time.DurationField durationField6 = dateTimeField5.getDurationField();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.years();
        java.lang.String str10 = durationFieldType9.toString();
        boolean boolean11 = localTime8.isSupported(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime14 = localTime8.withFieldAdded(durationFieldType12, 32772);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean18 = localTime16.equals((java.lang.Object) dateTimeFieldType17);
        org.joda.time.LocalTime.Property property19 = localTime8.property(dateTimeFieldType17);
        org.joda.time.LocalTime localTime20 = property19.withMaximumValue();
        int int21 = dateTimeField5.getMinimumValue((org.joda.time.ReadablePartial) localTime20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        org.joda.time.DateTime dateTime25 = localTime20.toDateTimeToday(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.withYear((int) (byte) -1);
        org.joda.time.DateTime.Property property28 = dateTime25.minuteOfDay();
        org.joda.time.Instant instant29 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime30 = instant29.toDateTime();
        org.joda.time.DateTime.Property property31 = dateTime30.minuteOfHour();
        org.joda.time.DateTime dateTime32 = dateTime30.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime34 = dateTime30.withHourOfDay(13);
        org.joda.time.DateTime.Property property35 = dateTime30.centuryOfEra();
        org.joda.time.DateTime dateTime37 = dateTime30.withWeekyear(0);
        org.joda.time.DateTime.Property property38 = dateTime30.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone44 = mutableDateTime43.getZone();
        long long46 = dateTimeZone41.getMillisKeepLocal(dateTimeZone44, (long) 10);
        boolean boolean48 = dateTimeZone44.equals((java.lang.Object) 32772);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone44);
        long long52 = dateTimeZone44.convertLocalToUTC(0L, false);
        org.joda.time.DateTime dateTime53 = dateTime30.toDateTime(dateTimeZone44);
        org.joda.time.DateTime dateTime54 = dateTime25.withZoneRetainFields(dateTimeZone44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant29 and dateTime30", (instant29.compareTo(dateTime30) == 0) == instant29.equals(dateTime30));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale4.getDisplayScript(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone1, locale3);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        timeZone1.setRawOffset(0);
        java.time.ZoneId zoneId17 = timeZone1.toZoneId();
        java.util.TimeZone timeZone18 = java.util.TimeZone.getTimeZone(zoneId17);
        timeZone18.setRawOffset((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType21.getField(chronology24);
        org.joda.time.DateTimeField dateTimeField26 = chronology24.secondOfDay();
        org.joda.time.DurationField durationField27 = chronology24.seconds();
        org.joda.time.DateTimeField dateTimeField28 = chronology24.secondOfDay();
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.years();
        java.lang.String str32 = durationFieldType31.toString();
        boolean boolean33 = localTime30.isSupported(durationFieldType31);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime36 = localTime30.withFieldAdded(durationFieldType34, 32772);
        org.joda.time.LocalTime.Property property37 = localTime30.hourOfDay();
        org.joda.time.LocalTime localTime38 = property37.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalTime localTime40 = localTime38.minus(readablePeriod39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalTime localTime42 = localTime40.plus(readablePeriod41);
        java.util.Locale locale44 = java.util.Locale.KOREA;
        java.lang.String str45 = locale44.toLanguageTag();
        java.util.Locale locale46 = java.util.Locale.KOREA;
        java.lang.String str47 = locale44.getDisplayCountry(locale46);
        java.lang.String str48 = locale46.getISO3Country();
        java.lang.String str49 = dateTimeField28.getAsText((org.joda.time.ReadablePartial) localTime40, 32, locale46);
        java.util.Locale locale50 = locale46.stripExtensions();
        java.util.Calendar calendar51 = java.util.Calendar.getInstance(timeZone18, locale46);
        int int52 = timeZone18.getDSTSavings();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar51", (calendar13.compareTo(calendar51) == 0) == calendar13.equals(calendar51));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus((long) 13);
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Interval interval5 = localDate3.toInterval(dateTimeZone4);
        org.joda.time.LocalDate localDate7 = localDate3.plusMonths(0);
        org.joda.time.LocalDate.Property property8 = localDate7.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate10 = localDate7.minus(readablePeriod9);
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate13 = localDate11.withYearOfEra((int) '4');
        boolean boolean14 = localDate10.isBefore((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale16 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter15.withLocale(locale16);
        java.lang.String str18 = localDate11.toString(dateTimeFormatter15);
        java.lang.String str19 = instant2.toString(dateTimeFormatter15);
        int int20 = dateTimeFormatter15.getDefaultYear();
        boolean boolean21 = dateTimeFormatter15.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter15.withPivotYear(21245603);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone24);
        mutableDateTime25.setMinuteOfDay(100);
        boolean boolean28 = mutableDateTime25.isAfterNow();
        mutableDateTime25.add((long) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str32 = dateTimeFieldType31.toString();
        org.joda.time.DurationFieldType durationFieldType33 = dateTimeFieldType31.getDurationType();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime25.property(dateTimeFieldType31);
        org.joda.time.MutableDateTime mutableDateTime36 = property34.add((long) 1);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(dateTimeZone37);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime38.millisOfDay();
        java.lang.String str41 = mutableDateTime38.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        int int42 = mutableDateTime38.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime38.secondOfMinute();
        org.joda.time.Chronology chronology44 = mutableDateTime38.getChronology();
        org.joda.time.DurationField durationField45 = chronology44.millis();
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((java.lang.Object) mutableDateTime36, chronology44);
        boolean boolean47 = mutableDateTime36.isEqualNow();
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        mutableDateTime36.add(readablePeriod48);
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime36.toMutableDateTimeISO();
        int int53 = dateTimeFormatter15.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime36, "2022-02-18T05:57:36.611-81:11:15.054", 54540019);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime38", (instant0.compareTo(mutableDateTime38) == 0) == instant0.equals(mutableDateTime38));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        long long8 = dateTimeZone3.getMillisKeepLocal(dateTimeZone6, (long) 10);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(10L, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.era();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfCeiling();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutableDateTime15.add(readableDuration17, 0);
        mutableDateTime13.setTime((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.years();
        java.lang.String str24 = durationFieldType23.toString();
        boolean boolean25 = localTime22.isSupported(durationFieldType23);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime28 = localTime22.withFieldAdded(durationFieldType26, 32772);
        org.joda.time.LocalTime.Property property29 = localTime22.hourOfDay();
        org.joda.time.LocalTime localTime30 = property29.roundCeilingCopy();
        org.joda.time.LocalTime localTime32 = property29.addCopy(19);
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean36 = localTime34.equals((java.lang.Object) dateTimeFieldType35);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime39 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology40 = localTime39.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = dateTimeFieldType37.getField(chronology40);
        org.joda.time.DateTimeField dateTimeField42 = chronology40.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField43 = chronology40.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType35.getField(chronology40);
        boolean boolean45 = localTime32.isSupported(dateTimeFieldType35);
        org.joda.time.DurationFieldType durationFieldType46 = dateTimeFieldType35.getDurationType();
        int int47 = mutableDateTime15.get(dateTimeFieldType35);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime15.yearOfEra();
        int int49 = dateTimeZone3.getOffset((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((long) 0, dateTimeZone51);
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType55 = org.joda.time.DurationFieldType.years();
        java.lang.String str56 = durationFieldType55.toString();
        boolean boolean57 = localTime54.isSupported(durationFieldType55);
        org.joda.time.DurationFieldType durationFieldType58 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime60 = localTime54.withFieldAdded(durationFieldType58, 32772);
        org.joda.time.LocalTime localTime62 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean64 = localTime62.equals((java.lang.Object) dateTimeFieldType63);
        org.joda.time.LocalTime.Property property65 = localTime54.property(dateTimeFieldType63);
        org.joda.time.DurationFieldType durationFieldType66 = dateTimeFieldType63.getDurationType();
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime52.property(dateTimeFieldType63);
        int int68 = mutableDateTime15.get(dateTimeFieldType63);
        org.joda.time.Instant instant70 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology71 = instant70.getChronology();
        org.joda.time.DurationField durationField72 = chronology71.weekyears();
        org.joda.time.DateTimeField dateTimeField73 = chronology71.yearOfEra();
        org.joda.time.DateTimeField dateTimeField74 = chronology71.yearOfEra();
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime((java.lang.Object) mutableDateTime15, chronology71);
        org.joda.time.DateTimeField dateTimeField76 = chronology71.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime75", (mutableDateTime2.compareTo(dateTime75) == 0) == mutableDateTime2.equals(dateTime75));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekyear(0);
        org.joda.time.DateTime.Property property7 = dateTime6.weekyear();
        org.joda.time.DateTime.Property property8 = dateTime6.monthOfYear();
        org.joda.time.DateTime dateTime9 = property8.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        mutableDateTime11.setMinuteOfDay(100);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Interval interval16 = localDate14.toInterval(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate14.plusMonths(0);
        org.joda.time.LocalDate.Property property19 = localDate18.year();
        int int20 = localDate18.size();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        long long28 = dateTimeZone23.getMillisKeepLocal(dateTimeZone26, (long) 10);
        org.joda.time.DateTime dateTime29 = localDate18.toDateTimeAtMidnight(dateTimeZone26);
        int int30 = mutableDateTime11.compareTo((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.DateTime dateTime33 = dateTime29.withPeriodAdded(readablePeriod31, 21);
        org.joda.time.DateTime dateTime35 = dateTime29.withYearOfEra(54118926);
        org.joda.time.DateTime dateTime37 = dateTime35.plusDays(2);
        org.joda.time.DateTime.Property property38 = dateTime37.year();
        boolean boolean39 = dateTime9.isBefore((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Instant instant40 = dateTime37.toInstant();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(dateTimeZone41);
        boolean boolean44 = mutableDateTime42.isAfter((long) 21);
        boolean boolean45 = mutableDateTime42.isBeforeNow();
        org.joda.time.Chronology chronology46 = mutableDateTime42.getChronology();
        org.joda.time.DurationFieldType durationFieldType47 = org.joda.time.DurationFieldType.hours();
        mutableDateTime42.add(durationFieldType47, 75380019);
        org.joda.time.DateTime dateTime51 = dateTime37.withFieldAdded(durationFieldType47, 112);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(dateTimeZone52);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime53.millisOfDay();
        mutableDateTime53.setMillis(12L);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        mutableDateTime53.add(readablePeriod57, 3);
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime53.dayOfWeek();
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime53.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod62 = null;
        mutableDateTime53.add(readablePeriod62);
        org.joda.time.Instant instant65 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology66 = instant65.getChronology();
        org.joda.time.DurationField durationField67 = chronology66.weekyears();
        org.joda.time.DateTimeField dateTimeField68 = chronology66.yearOfEra();
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate(chronology66);
        org.joda.time.DateTimeField dateTimeField70 = chronology66.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField71 = chronology66.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime72 = mutableDateTime53.toMutableDateTime(chronology66);
        int int73 = mutableDateTime53.getMinuteOfDay();
        mutableDateTime53.setWeekyear(32772);
        mutableDateTime53.addMinutes(21287543);
        org.joda.time.MutableDateTime.Property property78 = mutableDateTime53.millisOfDay();
        boolean boolean79 = dateTime51.isBefore((org.joda.time.ReadableInstant) mutableDateTime53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime37 and instant40", (dateTime37.compareTo(instant40) == 0) == dateTime37.equals(instant40));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.Instant instant8 = instant2.withDurationAdded((long) 'a', (int) (byte) 10);
        boolean boolean9 = instant2.isAfterNow();
        long long10 = instant2.getMillis();
        boolean boolean12 = instant2.isEqual((long) 31);
        long long13 = instant2.getMillis();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Instant instant16 = instant2.withDurationAdded(readableDuration14, 54287533);
        org.joda.time.MutableDateTime mutableDateTime17 = instant16.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant16", (mutableDateTime1.compareTo(instant16) == 0) == mutableDateTime1.equals(instant16));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        long long7 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 10);
        java.lang.String str8 = dateTimeZone5.toString();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone5);
        java.util.TimeZone timeZone10 = dateTimeZone5.toTimeZone();
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone10);
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("years");
        java.util.TimeZone.setDefault(timeZone13);
        calendar11.setTimeZone(timeZone13);
        calendar11.clear();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime();
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology20 = instant19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.weekyears();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.yearOfEra();
        mutableDateTime17.setChronology(chronology20);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime17.secondOfDay();
        java.util.Date date25 = mutableDateTime17.toDate();
        calendar11.setTime(date25);
        java.lang.String str27 = date25.toGMTString();
        date25.setSeconds(54604477);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime17", (mutableDateTime1.compareTo(mutableDateTime17) == 0) == mutableDateTime1.equals(mutableDateTime17));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.years();
        java.lang.String str4 = durationFieldType3.toString();
        boolean boolean5 = localTime2.isSupported(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime8 = localTime2.withFieldAdded(durationFieldType6, 32772);
        org.joda.time.LocalTime.Property property9 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime10 = property9.roundCeilingCopy();
        org.joda.time.LocalTime localTime12 = localTime10.withMillisOfDay(20);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean17 = localTime15.equals((java.lang.Object) dateTimeFieldType16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType18.getField(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType16.getField(chronology21);
        org.joda.time.LocalTime localTime27 = localTime12.withField(dateTimeFieldType16, 9);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology30 = instant29.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.weekyears();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.clockhourOfHalfday();
        org.joda.time.DurationField durationField33 = chronology30.weeks();
        org.joda.time.DateTimeField dateTimeField34 = chronology30.clockhourOfHalfday();
        boolean boolean35 = dateTimeFieldType16.isSupported(chronology30);
        org.joda.time.DateTimeField dateTimeField36 = chronology30.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(63800402568702L, chronology30);
        org.joda.time.DateTimeField dateTimeField38 = chronology30.year();
        org.joda.time.DurationField durationField39 = chronology30.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField39, durationField31, and durationField33", !(durationField39.compareTo(durationField31) == 0) || (Math.signum(durationField39.compareTo(durationField33)) == Math.signum(durationField31.compareTo(durationField33))));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withCenturyOfEra((int) '#');
        int int5 = dateTime1.getSecondOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withPivotYear(13);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter6.getPrinter();
        java.lang.String str10 = dateTime1.toString(dateTimeFormatter6);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime13 = dateTime1.withDurationAdded(readableDuration11, 54118926);
        org.joda.time.DateTime.Property property14 = dateTime1.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundHalfCeiling();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime5.add(readableDuration7, 0);
        mutableDateTime3.setTime((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.Chronology chronology11 = mutableDateTime3.getChronology();
        boolean boolean12 = mutableDateTime3.isEqualNow();
        mutableDateTime3.setSecondOfMinute(0);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now();
        int int17 = localDate16.getDayOfMonth();
        org.joda.time.LocalDate localDate19 = localDate16.plusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone20);
        boolean boolean23 = mutableDateTime21.isAfter((long) 21);
        boolean boolean25 = mutableDateTime21.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        mutableDateTime21.setZone(dateTimeZone28);
        org.joda.time.DateTime dateTime30 = localDate16.toDateTimeAtStartOfDay(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime15.withFields((org.joda.time.ReadablePartial) localDate16);
        org.joda.time.DateTime dateTime33 = dateTime31.withHourOfDay(0);
        org.joda.time.DateMidnight dateMidnight34 = dateTime31.toDateMidnight();
        org.joda.time.DateTime.Property property35 = dateTime31.yearOfCentury();
        mutableDateTime3.setMillis((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone38);
        mutableDateTime39.setMinuteOfDay(100);
        org.joda.time.LocalDate localDate42 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.Interval interval44 = localDate42.toInterval(dateTimeZone43);
        org.joda.time.LocalDate localDate46 = localDate42.plusMonths(0);
        org.joda.time.LocalDate.Property property47 = localDate46.year();
        int int48 = localDate46.size();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(dateTimeZone49);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime50.getZone();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(dateTimeZone52);
        org.joda.time.DateTimeZone dateTimeZone54 = mutableDateTime53.getZone();
        long long56 = dateTimeZone51.getMillisKeepLocal(dateTimeZone54, (long) 10);
        org.joda.time.DateTime dateTime57 = localDate46.toDateTimeAtMidnight(dateTimeZone54);
        int int58 = mutableDateTime39.compareTo((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.LocalDate localDate59 = dateTime57.toLocalDate();
        org.joda.time.DateTime dateTime60 = dateTime57.toDateTime();
        org.joda.time.DateTime.Property property61 = dateTime57.weekyear();
        org.joda.time.DateTime dateTime62 = dateTime57.toDateTime();
        org.joda.time.DateTime dateTime64 = dateTime57.minusYears(2030);
        org.joda.time.DateTime dateTime66 = dateTime57.minusDays(54113901);
        org.joda.time.DateTime dateTime68 = dateTime57.plusMinutes(54);
        mutableDateTime3.setTime((org.joda.time.ReadableInstant) dateTime57);
        java.util.Calendar calendar70 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime71 = org.joda.time.LocalDateTime.fromCalendarFields(calendar70);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property74 = localDateTime73.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime76 = localDateTime73.plusWeeks(100);
        org.joda.time.ReadableDuration readableDuration77 = null;
        org.joda.time.LocalDateTime localDateTime79 = localDateTime73.withDurationAdded(readableDuration77, 14);
        int int80 = localDateTime73.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime82 = localDateTime73.withMillisOfSecond((int) 'a');
        int int83 = localDateTime82.getCenturyOfEra();
        org.joda.time.Instant instant84 = org.joda.time.Instant.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType85 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean86 = instant84.isSupported(dateTimeFieldType85);
        org.joda.time.DurationFieldType durationFieldType87 = dateTimeFieldType85.getDurationType();
        boolean boolean88 = localDateTime82.isSupported(durationFieldType87);
        boolean boolean89 = mutableDateTime3.equals((java.lang.Object) boolean88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and instant84", (mutableDateTime5.compareTo(instant84) == 0) == mutableDateTime5.equals(instant84));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        java.lang.String str4 = mutableDateTime1.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        int int5 = mutableDateTime1.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundHalfFloor();
        int int8 = mutableDateTime7.getMillisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now();
        boolean boolean10 = mutableDateTime9.isAfterNow();
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime9.add(readableDuration11, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        long long21 = dateTimeZone16.getMillisKeepLocal(dateTimeZone19, (long) 10);
        boolean boolean22 = dateTimeZone19.isFixed();
        mutableDateTime9.setZoneRetainFields(dateTimeZone19);
        int int24 = mutableDateTime9.getRoundingMode();
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean28 = localTime26.equals((java.lang.Object) dateTimeFieldType27);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime31 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology32 = localTime31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = dateTimeFieldType29.getField(chronology32);
        org.joda.time.DateTimeField dateTimeField34 = chronology32.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField35 = chronology32.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType27.getField(chronology32);
        mutableDateTime9.setChronology(chronology32);
        int int38 = mutableDateTime9.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime40.era();
        org.joda.time.MutableDateTime mutableDateTime42 = property41.roundHalfCeiling();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone45 = mutableDateTime44.getZone();
        org.joda.time.ReadableDuration readableDuration46 = null;
        mutableDateTime44.add(readableDuration46, 0);
        mutableDateTime42.setTime((org.joda.time.ReadableInstant) mutableDateTime44);
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType52 = org.joda.time.DurationFieldType.years();
        java.lang.String str53 = durationFieldType52.toString();
        boolean boolean54 = localTime51.isSupported(durationFieldType52);
        org.joda.time.DurationFieldType durationFieldType55 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime57 = localTime51.withFieldAdded(durationFieldType55, 32772);
        org.joda.time.LocalTime.Property property58 = localTime51.hourOfDay();
        org.joda.time.LocalTime localTime59 = property58.roundCeilingCopy();
        org.joda.time.LocalTime localTime61 = property58.addCopy(19);
        org.joda.time.LocalTime localTime63 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean65 = localTime63.equals((java.lang.Object) dateTimeFieldType64);
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime68 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology69 = localTime68.getChronology();
        org.joda.time.DateTimeField dateTimeField70 = dateTimeFieldType66.getField(chronology69);
        org.joda.time.DateTimeField dateTimeField71 = chronology69.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField72 = chronology69.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField73 = dateTimeFieldType64.getField(chronology69);
        boolean boolean74 = localTime61.isSupported(dateTimeFieldType64);
        org.joda.time.DurationFieldType durationFieldType75 = dateTimeFieldType64.getDurationType();
        int int76 = mutableDateTime44.get(dateTimeFieldType64);
        boolean boolean77 = mutableDateTime9.isSupported(dateTimeFieldType64);
        org.joda.time.MutableDateTime.Property property78 = mutableDateTime7.property(dateTimeFieldType64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and mutableDateTime15", (mutableDateTime9.compareTo(mutableDateTime15) == 0) == mutableDateTime9.equals(mutableDateTime15));
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter4.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withOffsetParsed();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.years();
        java.lang.String str10 = durationFieldType9.toString();
        boolean boolean11 = localTime8.isSupported(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime14 = localTime8.withFieldAdded(durationFieldType12, 32772);
        java.lang.String str15 = durationFieldType12.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType16.getField(chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology19.secondOfDay();
        org.joda.time.DateTimeField dateTimeField22 = chronology19.hourOfDay();
        boolean boolean23 = durationFieldType12.isSupported(chronology19);
        org.joda.time.DateTimeField dateTimeField24 = chronology19.weekyearOfCentury();
        java.util.Locale locale28 = new java.util.Locale("21 June 0130 15:01:38 ", "en_GB");
        java.lang.String str29 = dateTimeField24.getAsShortText((int) '4', locale28);
        java.util.Locale locale30 = locale28.stripExtensions();
        java.util.Set<java.lang.String> strSet31 = locale28.getUnicodeLocaleKeys();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter6.withLocale(locale28);
        org.joda.time.Instant instant33 = new org.joda.time.Instant();
        org.joda.time.Instant instant35 = instant33.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Instant instant38 = instant35.withDurationAdded(readableDuration36, (int) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime39 = instant35.toMutableDateTime();
        int int42 = dateTimeFormatter32.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime39, "English (United Kingdom)", 2019);
        java.lang.String str44 = dateTimeFormatter32.print(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant35 and mutableDateTime39", (instant35.compareTo(mutableDateTime39) == 0) == instant35.equals(mutableDateTime39));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMonths((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withCenturyOfEra(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.joda.time.format.DateTimeFormat.shortTime();
        java.lang.String str11 = localDateTime9.toString(dateTimeFormatter10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.longDateTime();
        java.lang.String str13 = localDateTime9.toString(dateTimeFormatter12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withZoneUTC();
        org.joda.time.Instant instant16 = org.joda.time.Instant.parse("2022-02-21T15:01:34.312Z");
        java.lang.String str17 = dateTimeFormatter14.print((org.joda.time.ReadableInstant) instant16);
        org.joda.time.DateTime dateTime18 = instant16.toDateTime();
        org.joda.time.Instant instant20 = instant16.withMillis((long) 54134127);
        org.joda.time.MutableDateTime mutableDateTime21 = instant20.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and dateTime18", (instant16.compareTo(dateTime18) == 0) == instant16.equals(dateTime18));
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        boolean boolean5 = mutableDateTime1.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 0);
        org.joda.time.DateTime dateTime9 = mutableDateTime1.toDateTime(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withYearOfEra(54206558);
        int int12 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        int int18 = dateTimeZone16.getStandardOffset(0L);
        java.util.TimeZone timeZone19 = dateTimeZone16.toTimeZone();
        long long21 = dateTimeZone16.nextTransition((long) 111);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 54129499, dateTimeZone16);
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.now();
        int int24 = localDate23.getDayOfMonth();
        org.joda.time.LocalDate localDate26 = localDate23.plusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone27);
        boolean boolean30 = mutableDateTime28.isAfter((long) 21);
        boolean boolean32 = mutableDateTime28.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        mutableDateTime28.setZone(dateTimeZone35);
        org.joda.time.DateTime dateTime37 = localDate23.toDateTimeAtStartOfDay(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(dateTimeZone35);
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(dateTimeZone35);
        long long41 = dateTimeZone35.nextTransition(0L);
        org.joda.time.LocalDate localDate42 = org.joda.time.LocalDate.now();
        int int43 = localDate42.getDayOfMonth();
        org.joda.time.LocalDate localDate45 = localDate42.plusYears((int) (byte) 100);
        org.joda.time.LocalDate.Property property46 = localDate45.centuryOfEra();
        int int47 = property46.getMaximumValueOverall();
        org.joda.time.LocalDate localDate48 = property46.roundFloorCopy();
        boolean boolean49 = dateTimeZone35.equals((java.lang.Object) property46);
        long long51 = dateTimeZone16.getMillisKeepLocal(dateTimeZone35, (long) 28);
        org.joda.time.DateTime dateTime52 = dateTime9.withZone(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime53 = org.joda.time.LocalDateTime.now(dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime9", (mutableDateTime1.compareTo(dateTime9) == 0) == mutableDateTime1.equals(dateTime9));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.Interval interval4 = localDate3.toInterval();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime6.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        long long12 = dateTimeZone7.getMillisKeepLocal(dateTimeZone10, (long) 10);
        java.lang.String str13 = dateTimeZone7.toString();
        org.joda.time.DateTime dateTime14 = localDate3.toDateTimeAtMidnight(dateTimeZone7);
        org.joda.time.DateTime dateTime16 = dateTime14.withMillisOfDay((int) (short) 10);
        int int17 = dateTime16.getYearOfEra();
        org.joda.time.DateTime.Property property18 = dateTime16.weekyear();
        org.joda.time.Instant instant19 = dateTime16.toInstant();
        org.joda.time.DateTime dateTime20 = instant19.toDateTime();
        org.joda.time.Chronology chronology21 = instant19.getChronology();
        org.joda.time.Instant instant23 = instant19.withMillis(1645456004608L);
        org.joda.time.Instant instant24 = instant23.toInstant();
        org.joda.time.Chronology chronology25 = instant24.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant19", (dateTime16.compareTo(instant19) == 0) == dateTime16.equals(instant19));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.DateTime dateTime8 = dateTime1.minus(1645455973054L);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        int int10 = localDate9.getDayOfMonth();
        org.joda.time.LocalDate localDate12 = localDate9.plusYears((int) (byte) 100);
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtStartOfDay();
        org.joda.time.DateTime dateTime15 = dateTime13.withMillis((long) 20);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((java.lang.Object) dateTime13);
        boolean boolean17 = dateTime8.isBefore((org.joda.time.ReadableInstant) dateTime13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property5 = dateTime1.monthOfYear();
        org.joda.time.DateTime.Property property6 = dateTime1.dayOfYear();
        org.joda.time.DateTime dateTime8 = dateTime1.withDayOfYear(14);
        org.joda.time.DateTime.Property property9 = dateTime1.hourOfDay();
        org.joda.time.DateTime dateTime10 = property9.withMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus((long) 13);
        org.joda.time.Instant instant4 = instant2.minus((long) 901);
        org.joda.time.Instant instant7 = instant4.withDurationAdded((long) '#', 16);
        org.joda.time.MutableDateTime mutableDateTime8 = instant7.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime9 = instant7.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and mutableDateTime8", (instant7.compareTo(mutableDateTime8) == 0) == instant7.equals(mutableDateTime8));
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, (int) (short) 0);
        boolean boolean7 = instant2.isBefore((long) 5);
        java.util.Date date8 = instant2.toDate();
        org.joda.time.Instant instant9 = new org.joda.time.Instant((java.lang.Object) instant2);
        org.joda.time.Instant instant10 = instant2.toInstant();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        mutableDateTime12.setMinuteOfDay(100);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Interval interval17 = localDate15.toInterval(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate15.plusMonths(0);
        org.joda.time.LocalDate.Property property20 = localDate19.year();
        int int21 = localDate19.size();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        long long29 = dateTimeZone24.getMillisKeepLocal(dateTimeZone27, (long) 10);
        org.joda.time.DateTime dateTime30 = localDate19.toDateTimeAtMidnight(dateTimeZone27);
        int int31 = mutableDateTime12.compareTo((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.LocalDate localDate32 = dateTime30.toLocalDate();
        org.joda.time.DateTime dateTime33 = dateTime30.toDateTime();
        org.joda.time.DateTime.Property property34 = dateTime30.weekyear();
        org.joda.time.DateTime dateTime35 = dateTime30.toDateTime();
        org.joda.time.DateTime dateTime37 = dateTime30.minusYears(2030);
        org.joda.time.DateTime dateTime39 = dateTime30.minusDays(54113901);
        org.joda.time.DateTime dateTime41 = dateTime39.minusHours(58);
        org.joda.time.Instant instant42 = dateTime39.toInstant();
        int int43 = instant10.compareTo((org.joda.time.ReadableInstant) dateTime39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime23", (instant0.compareTo(mutableDateTime23) == 0) == instant0.equals(mutableDateTime23));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMonths((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withCenturyOfEra(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.joda.time.format.DateTimeFormat.shortTime();
        java.lang.String str11 = localDateTime9.toString(dateTimeFormatter10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.longDateTime();
        java.lang.String str13 = localDateTime9.toString(dateTimeFormatter12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withZoneUTC();
        org.joda.time.Instant instant16 = org.joda.time.Instant.parse("2022-02-21T15:01:34.312Z");
        java.lang.String str17 = dateTimeFormatter14.print((org.joda.time.ReadableInstant) instant16);
        org.joda.time.MutableDateTime mutableDateTime18 = instant16.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.secondOfDay();
        int int20 = property19.getMinimumValueOverall();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and mutableDateTime18", (instant16.compareTo(mutableDateTime18) == 0) == instant16.equals(mutableDateTime18));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setMinuteOfDay(100);
        boolean boolean4 = mutableDateTime1.isAfterNow();
        mutableDateTime1.add((long) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.DurationFieldType durationFieldType9 = dateTimeFieldType7.getDurationType();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime1.property(dateTimeFieldType7);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(1L);
        int int13 = mutableDateTime12.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.era();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime15.add(readablePeriod17, (int) (byte) 100);
        mutableDateTime12.setTime((org.joda.time.ReadableInstant) mutableDateTime15);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now();
        int int23 = localDate22.getDayOfMonth();
        org.joda.time.LocalDate localDate25 = localDate22.plusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        boolean boolean29 = mutableDateTime27.isAfter((long) 21);
        boolean boolean31 = mutableDateTime27.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        mutableDateTime27.setZone(dateTimeZone34);
        org.joda.time.DateTime dateTime36 = localDate22.toDateTimeAtStartOfDay(dateTimeZone34);
        org.joda.time.LocalDateTime localDateTime37 = null;
        boolean boolean38 = dateTimeZone34.isLocalDateTimeGap(localDateTime37);
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime12.toMutableDateTime(dateTimeZone34);
        java.util.TimeZone timeZone41 = java.util.TimeZone.getTimeZone("years");
        boolean boolean42 = timeZone41.observesDaylightTime();
        java.util.Locale locale43 = java.util.Locale.UK;
        java.util.Locale locale44 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet45 = locale44.getExtensionKeys();
        java.util.Locale locale46 = java.util.Locale.KOREA;
        java.util.Locale locale47 = java.util.Locale.KOREA;
        java.lang.String str48 = locale46.getDisplayScript(locale47);
        java.lang.String str49 = locale44.getDisplayScript(locale47);
        java.util.Locale locale50 = java.util.Locale.UK;
        java.lang.String str51 = locale44.getDisplayScript(locale50);
        java.lang.String str52 = locale43.getDisplayLanguage(locale50);
        java.util.Calendar calendar53 = java.util.Calendar.getInstance(timeZone41, locale43);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        int int56 = dateTimeZone54.getStandardOffset(54196265499L);
        org.joda.time.LocalDate localDate57 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.Interval interval59 = localDate57.toInterval(dateTimeZone58);
        org.joda.time.LocalDate localDate61 = localDate57.plusMonths(0);
        org.joda.time.LocalDate.Property property62 = localDate61.year();
        org.joda.time.LocalDate localDate63 = property62.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate65 = property62.addToCopy((int) (short) 100);
        boolean boolean66 = dateTimeZone54.equals((java.lang.Object) property62);
        org.joda.time.LocalDate localDate67 = new org.joda.time.LocalDate(dateTimeZone54);
        long long70 = dateTimeZone54.convertLocalToUTC(1645455720309L, true);
        mutableDateTime12.setZone(dateTimeZone54);
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime(dateTimeZone54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime12", (mutableDateTime1.compareTo(mutableDateTime12) == 0) == mutableDateTime1.equals(mutableDateTime12));
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus((long) 13);
        org.joda.time.DateTime dateTime3 = instant0.toDateTime();
        org.joda.time.Instant instant5 = instant0.withMillis((long) 32);
        org.joda.time.DateTimeZone dateTimeZone6 = instant5.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology9 = instant8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.yearOfEra();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(chronology9);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((java.lang.Object) instant5, chronology9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType1.getField(chronology4);
        org.joda.time.DateTimeField dateTimeField6 = chronology4.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology4.millisOfSecond();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 985, chronology4);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.plus(readablePeriod10);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 54106168);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) 11);
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime13.toMutableDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime11.toDateTime(dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and mutableDateTime19", (dateTime13.compareTo(mutableDateTime19) == 0) == dateTime13.equals(mutableDateTime19));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        long long7 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 10);
        java.lang.String str8 = dateTimeZone5.toString();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone5);
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology12 = instant11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.weekyears();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now(chronology12);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = chronology12.add(readablePeriod15, (long) 48, 2122);
        org.joda.time.DurationField durationField19 = chronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = chronology12.weekyear();
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime9.toMutableDateTime(chronology12);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.Interval interval24 = localDate22.toInterval(dateTimeZone23);
        org.joda.time.LocalDate localDate26 = localDate22.plusMonths(0);
        org.joda.time.LocalDate.Property property27 = localDate26.year();
        int int28 = localDate26.size();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        long long36 = dateTimeZone31.getMillisKeepLocal(dateTimeZone34, (long) 10);
        org.joda.time.DateTime dateTime37 = localDate26.toDateTimeAtMidnight(dateTimeZone34);
        org.joda.time.DateTime.Property property38 = dateTime37.yearOfEra();
        org.joda.time.DateTime dateTime39 = property38.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime41 = property38.addToCopy((int) 'u');
        org.joda.time.DateTime.Property property42 = dateTime41.hourOfDay();
        org.joda.time.DateTime dateTime43 = property42.roundFloorCopy();
        org.joda.time.DateTime dateTime45 = property42.addToCopy(1645455729170L);
        int int46 = dateTime45.getMillisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime47 = dateTime45.toMutableDateTime();
        mutableDateTime21.setTime((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(1L);
        int int51 = mutableDateTime50.getCenturyOfEra();
        int int52 = mutableDateTime50.getDayOfYear();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime50.minuteOfHour();
        int int54 = property53.getMaximumValueOverall();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property53.getFieldType();
        org.joda.time.DurationFieldType durationFieldType56 = dateTimeFieldType55.getDurationType();
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType59 = org.joda.time.DurationFieldType.years();
        java.lang.String str60 = durationFieldType59.toString();
        boolean boolean61 = localTime58.isSupported(durationFieldType59);
        org.joda.time.DurationFieldType durationFieldType62 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime64 = localTime58.withFieldAdded(durationFieldType62, 32772);
        org.joda.time.LocalTime.Property property65 = localTime58.hourOfDay();
        org.joda.time.LocalTime localTime67 = localTime58.minusMinutes(2922789);
        org.joda.time.Instant instant69 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology70 = instant69.getChronology();
        org.joda.time.MutableDateTime mutableDateTime71 = org.joda.time.MutableDateTime.now(chronology70);
        boolean boolean72 = localTime58.equals((java.lang.Object) chronology70);
        org.joda.time.DateTimeField dateTimeField73 = chronology70.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField74 = chronology70.year();
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime(chronology70);
        org.joda.time.DateTimeField dateTimeField76 = chronology70.monthOfYear();
        boolean boolean77 = durationFieldType56.isSupported(chronology70);
        mutableDateTime21.add(durationFieldType56, 21425246);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime71", (mutableDateTime1.compareTo(mutableDateTime71) == 0) == mutableDateTime1.equals(mutableDateTime71));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.monthOfYear();
        org.joda.time.DurationField durationField2 = property1.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType3.getField(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.secondOfDay();
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.lang.String str11 = dateTimeField8.getAsText(7, locale10);
        java.util.Locale locale12 = java.util.Locale.UK;
        java.util.Locale locale13 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet14 = locale13.getExtensionKeys();
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.lang.String str17 = locale15.getDisplayScript(locale16);
        java.lang.String str18 = locale13.getDisplayScript(locale16);
        java.util.Locale locale19 = java.util.Locale.UK;
        java.lang.String str20 = locale13.getDisplayScript(locale19);
        java.lang.String str21 = locale12.getDisplayLanguage(locale19);
        java.lang.String str22 = locale10.getDisplayVariant(locale19);
        java.util.Locale locale23 = locale19.stripExtensions();
        java.lang.String str25 = locale19.getExtension('a');
        int int26 = property1.getMaximumShortTextLength(locale19);
        org.joda.time.DateTime dateTime28 = property1.addWrapFieldToCopy(53);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology31 = instant30.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.weekyears();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.yearOfEra();
        org.joda.time.DateTimeField dateTimeField34 = chronology31.yearOfEra();
        org.joda.time.DateTime dateTime35 = dateTime28.toDateTime(chronology31);
        org.joda.time.DateTime dateTime37 = dateTime28.minusMonths(54142876);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.DateTime dateTime40 = dateTime37.withPeriodAdded(readablePeriod38, 2124);
        boolean boolean42 = dateTime40.isBefore(63800406441071L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and dateTime35", (dateTime28.compareTo(dateTime35) == 0) == dateTime28.equals(dateTime35));
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) -1);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime3 = instant2.toDateTime();
        org.joda.time.DateTime.Property property4 = dateTime3.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone5 = dateTime3.getZone();
        boolean boolean6 = localTime1.equals((java.lang.Object) dateTime3);
        org.joda.time.DateTime dateTime7 = dateTime3.toDateTime();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.minus(readableDuration8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime9", (instant2.compareTo(dateTime9) == 0) == instant2.equals(dateTime9));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        int int6 = localDate4.size();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        long long14 = dateTimeZone9.getMillisKeepLocal(dateTimeZone12, (long) 10);
        org.joda.time.DateTime dateTime15 = localDate4.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfEra();
        org.joda.time.DateTime dateTime17 = property16.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime19 = property16.addToCopy((int) 'u');
        org.joda.time.DateTime dateTime21 = property16.setCopy(19);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMonths(2922789);
        org.joda.time.DateTime.Property property24 = dateTime21.dayOfMonth();
        org.joda.time.DateTime dateTime26 = property24.addToCopy((int) 'x');
        org.joda.time.DateTime dateTime27 = property24.roundFloorCopy();
        org.joda.time.LocalDate localDate28 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.Interval interval30 = localDate28.toInterval(dateTimeZone29);
        org.joda.time.LocalDate localDate32 = localDate28.plusMonths(0);
        org.joda.time.LocalDate.Property property33 = localDate32.year();
        int int34 = localDate32.size();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone40 = mutableDateTime39.getZone();
        long long42 = dateTimeZone37.getMillisKeepLocal(dateTimeZone40, (long) 10);
        org.joda.time.DateTime dateTime43 = localDate32.toDateTimeAtMidnight(dateTimeZone40);
        java.util.Locale locale44 = java.util.Locale.KOREA;
        java.lang.String str45 = locale44.toLanguageTag();
        boolean boolean46 = localDate32.equals((java.lang.Object) str45);
        org.joda.time.LocalDate localDate48 = localDate32.minusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalDate localDate51 = localDate48.withPeriodAdded(readablePeriod49, 12);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = localDate51.toDateTimeAtCurrentTime(dateTimeZone52);
        org.joda.time.Chronology chronology54 = localDate51.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.yearOfEra();
        org.joda.time.DateTime dateTime56 = dateTime27.toDateTime(chronology54);
        org.joda.time.DateTime dateTime58 = dateTime27.minusYears(25200000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime56", (dateTime27.compareTo(dateTime56) == 0) == dateTime27.equals(dateTime56));
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withMillisOfDay(54096794);
        org.joda.time.tz.NameProvider nameProvider8 = org.joda.time.DateTimeZone.getNameProvider();
        boolean boolean9 = localDateTime7.equals((java.lang.Object) nameProvider8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.millisOfDay();
        java.util.Locale locale13 = java.util.Locale.GERMANY;
        java.lang.String str14 = property12.getAsText(locale13);
        java.lang.String str15 = locale13.getISO3Language();
        java.lang.String str18 = nameProvider8.getShortName(locale13, "3:01 PM", "7");
        java.util.Locale locale19 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet20 = locale19.getExtensionKeys();
        java.util.Locale locale21 = java.util.Locale.KOREA;
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.lang.String str23 = locale21.getDisplayScript(locale22);
        java.lang.String str24 = locale19.getDisplayScript(locale22);
        java.lang.String str27 = nameProvider8.getShortName(locale19, "3:01 PM", "2022-02-21T15:02:31.934");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider8);
        java.util.Locale.Category category29 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.lang.String str31 = locale30.toLanguageTag();
        java.util.Locale locale32 = java.util.Locale.KOREA;
        java.lang.String str33 = locale30.getDisplayCountry(locale32);
        java.lang.String str34 = locale30.getDisplayCountry();
        java.util.Locale.setDefault(category29, locale30);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        long long43 = dateTimeZone38.getMillisKeepLocal(dateTimeZone41, (long) 10);
        java.lang.String str44 = dateTimeZone41.toString();
        org.joda.time.DateTime dateTime45 = org.joda.time.DateTime.now(dateTimeZone41);
        java.util.TimeZone timeZone46 = dateTimeZone41.toTimeZone();
        java.util.Locale locale48 = java.util.Locale.forLanguageTag("hi!");
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(timeZone46, locale48);
        java.lang.String str50 = locale48.getLanguage();
        java.lang.String str51 = locale48.getDisplayScript();
        java.util.Locale.setDefault(category29, locale48);
        java.lang.String str53 = locale48.getLanguage();
        java.lang.String str56 = nameProvider8.getShortName(locale48, "2022-02-21T15:06:42.049Z", "property[dayofweek]");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar49", (calendar0.compareTo(calendar49) == 0) == calendar0.equals(calendar49));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.withWeekyear(2122);
        org.joda.time.DateTime dateTime8 = dateTime1.plusHours(54100989);
        boolean boolean9 = dateTime1.isEqualNow();
        boolean boolean11 = dateTime1.isEqual(48L);
        org.joda.time.Instant instant12 = dateTime1.toInstant();
        org.joda.time.Chronology chronology13 = instant12.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.monthOfYear();
        org.joda.time.DateTime dateTime2 = property1.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime3 = property1.roundFloorCopy();
        org.joda.time.DateTime dateTime5 = property1.addToCopy((int) (short) 100);
        org.joda.time.DateTime dateTime7 = dateTime5.minusYears(21144578);
        org.joda.time.Instant instant8 = dateTime7.toInstant();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) instant8, dateTimeZone9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withPeriodAdded(readablePeriod11, 21248496);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant8", (dateTime7.compareTo(instant8) == 0) == dateTime7.equals(instant8));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale1 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withLocale(locale1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter0.getParser();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.years();
        java.lang.String str8 = durationFieldType7.toString();
        boolean boolean9 = localTime6.isSupported(durationFieldType7);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime12 = localTime6.withFieldAdded(durationFieldType10, 32772);
        org.joda.time.LocalTime.Property property13 = localTime6.hourOfDay();
        org.joda.time.LocalTime localTime15 = localTime6.minusMinutes(2922789);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology18 = instant17.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(chronology18);
        boolean boolean20 = localTime6.equals((java.lang.Object) chronology18);
        org.joda.time.DateTimeField dateTimeField21 = chronology18.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField22 = chronology18.weekyearOfCentury();
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.fromMillisOfDay((long) 123, chronology18);
        java.lang.String str24 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localTime23);
        int int25 = dateTimeFormatter0.getDefaultYear();
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology28 = instant27.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.eras();
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(chronology28);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(chronology28);
        org.joda.time.DateTimeField dateTimeField32 = chronology28.dayOfWeek();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter0.withChronology(chronology28);
        org.joda.time.DurationField durationField34 = chronology28.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField29, durationField34, and durationField29", !(durationField29.compareTo(durationField34) == 0) || (Math.signum(durationField29.compareTo(durationField29)) == Math.signum(durationField34.compareTo(durationField29))));
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, (int) (short) 0);
        boolean boolean7 = instant2.isBefore((long) 5);
        java.util.Date date8 = instant2.toDate();
        org.joda.time.Instant instant9 = new org.joda.time.Instant((java.lang.Object) instant2);
        org.joda.time.Instant instant10 = instant2.toInstant();
        org.joda.time.DateTime dateTime11 = instant10.toDateTimeISO();
        java.util.Calendar calendar12 = java.util.Calendar.getInstance();
        boolean boolean13 = calendar12.isWeekDateSupported();
        java.util.Date date14 = calendar12.getTime();
        int int15 = calendar12.getMinimalDaysInFirstWeek();
        calendar12.setMinimalDaysInFirstWeek(21);
        calendar12.setFirstDayOfWeek(54185283);
        boolean boolean20 = instant10.equals((java.lang.Object) 54185283);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime11", (instant10.compareTo(dateTime11) == 0) == instant10.equals(dateTime11));
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withCenturyOfEra((int) '#');
        int int5 = dateTime1.getSecondOfDay();
        org.joda.time.Chronology chronology6 = dateTime1.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        java.lang.String str4 = mutableDateTime1.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        int int5 = mutableDateTime1.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundHalfFloor();
        org.joda.time.ReadableDuration readableDuration8 = null;
        mutableDateTime7.add(readableDuration8);
        mutableDateTime7.setTime(100L);
        mutableDateTime7.setSecondOfDay(51);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime7.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime16 = property14.addWrapField(2022);
        mutableDateTime16.setMillis((-1762764938182L));
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.millisOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale21 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter20.withLocale(locale21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter22.withChronology(chronology23);
        java.util.Locale locale25 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet26 = locale25.getExtensionKeys();
        java.util.Locale locale27 = java.util.Locale.KOREA;
        java.util.Locale locale28 = java.util.Locale.KOREA;
        java.lang.String str29 = locale27.getDisplayScript(locale28);
        java.lang.String str30 = locale25.getDisplayScript(locale28);
        java.util.Locale locale31 = java.util.Locale.UK;
        java.lang.String str32 = locale25.getDisplayScript(locale31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter22.withLocale(locale25);
        org.joda.time.LocalDate localDate34 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.Interval interval36 = localDate34.toInterval(dateTimeZone35);
        org.joda.time.LocalDate localDate38 = localDate34.plusMonths(0);
        org.joda.time.LocalDate.Property property39 = localDate38.year();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone42 = mutableDateTime41.getZone();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone45 = mutableDateTime44.getZone();
        long long47 = dateTimeZone42.getMillisKeepLocal(dateTimeZone45, (long) 10);
        org.joda.time.DateMidnight dateMidnight48 = localDate38.toDateMidnight(dateTimeZone42);
        java.util.Locale locale50 = java.util.Locale.ENGLISH;
        java.util.Locale locale51 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet52 = locale51.getExtensionKeys();
        java.lang.String str53 = locale50.getDisplayScript(locale51);
        java.lang.String str54 = localDate38.toString("54127921", locale50);
        java.util.TimeZone timeZone55 = java.util.TimeZone.getDefault();
        java.util.Locale locale56 = java.util.Locale.KOREA;
        java.lang.String str57 = locale56.toLanguageTag();
        java.util.Calendar calendar58 = java.util.Calendar.getInstance(timeZone55, locale56);
        java.lang.String str59 = locale56.getISO3Country();
        java.lang.String str60 = locale50.getDisplayCountry(locale56);
        java.lang.String str61 = locale25.getDisplayScript(locale50);
        java.lang.String str62 = property19.getAsText(locale25);
        org.joda.time.MutableDateTime mutableDateTime64 = property19.add((long) 43695);
        org.joda.time.ReadableDuration readableDuration65 = null;
        mutableDateTime64.add(readableDuration65);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDate localDate68 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.Interval interval70 = localDate68.toInterval(dateTimeZone69);
        org.joda.time.LocalDate localDate72 = localDate68.plusMonths(0);
        org.joda.time.LocalDate.Property property73 = localDate72.weekOfWeekyear();
        org.joda.time.Instant instant74 = new org.joda.time.Instant();
        long long75 = property73.getDifferenceAsLong((org.joda.time.ReadableInstant) instant74);
        org.joda.time.Chronology chronology76 = instant74.getChronology();
        org.joda.time.DateTimeField dateTimeField77 = dateTimeFieldType67.getField(chronology76);
        org.joda.time.DateTimeField dateTimeField78 = chronology76.halfdayOfDay();
        org.joda.time.MutableDateTime mutableDateTime79 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime64, chronology76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime41 and instant74", (mutableDateTime41.compareTo(instant74) == 0) == mutableDateTime41.equals(instant74));
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        boolean boolean2 = calendar0.isWeekDateSupported();
        calendar0.setFirstDayOfWeek(5);
        calendar0.setMinimalDaysInFirstWeek(54098460);
        java.util.TimeZone timeZone7 = calendar0.getTimeZone();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property9 = dateTime8.monthOfYear();
        org.joda.time.DateTime dateTime10 = property9.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime11 = dateTime10.toDateTime();
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar13 = dateTime11.toCalendar(locale12);
        boolean boolean14 = calendar0.after((java.lang.Object) calendar13);
        calendar13.setMinimalDaysInFirstWeek(54138);
        boolean boolean17 = calendar13.isWeekDateSupported();
        java.util.Calendar.Builder builder18 = new java.util.Calendar.Builder();
        java.util.Calendar calendar19 = builder18.build();
        java.util.Calendar.Builder builder23 = builder18.setTimeOfDay((int) 'x', (int) 'u', 11);
        java.util.Calendar.Builder builder27 = builder18.setTimeOfDay(54142876, 82800100, 54134127);
        java.util.Calendar.Builder builder29 = builder27.setLenient(false);
        java.util.Calendar.Builder builder31 = builder27.setLenient(true);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance();
        int int34 = calendar32.getGreatestMinimum((int) (byte) 0);
        java.util.TimeZone timeZone35 = calendar32.getTimeZone();
        java.lang.String str36 = timeZone35.getID();
        boolean boolean37 = timeZone35.observesDaylightTime();
        java.util.Calendar.Builder builder38 = builder27.setTimeZone(timeZone35);
        calendar13.setTimeZone(timeZone35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar32", (calendar0.compareTo(calendar32) == 0) == calendar0.equals(calendar32));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Instant instant5 = instant3.plus(19L);
        org.joda.time.DateTime dateTime6 = instant5.toDateTime();
        org.joda.time.Instant instant8 = instant5.withMillis((long) 54192915);
        org.joda.time.MutableDateTime mutableDateTime9 = instant8.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime6", (instant5.compareTo(dateTime6) == 0) == instant5.equals(dateTime6));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        boolean boolean5 = mutableDateTime1.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 0);
        org.joda.time.DateTime dateTime9 = mutableDateTime1.toDateTime(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withYearOfEra(54206558);
        org.joda.time.DateTime dateTime13 = dateTime11.plusMillis(54419220);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime9", (mutableDateTime1.compareTo(dateTime9) == 0) == mutableDateTime1.equals(dateTime9));
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.weekOfWeekyear();
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        long long7 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) instant6);
        org.joda.time.DateTime dateTime8 = instant6.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        boolean boolean13 = dateTimeZone11.isStandardOffset((long) 11);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(dateTimeZone11);
        org.joda.time.DateTime dateTime15 = dateTime8.withZone(dateTimeZone11);
        int int17 = dateTimeZone11.getOffset((long) 54352360);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and dateTime8", (instant6.compareTo(dateTime8) == 0) == instant6.equals(dateTime8));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        int int4 = dateTimeZone2.getStandardOffset(0L);
        java.util.TimeZone timeZone5 = dateTimeZone2.toTimeZone();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("years");
        boolean boolean8 = timeZone5.hasSameRules(timeZone7);
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone5);
        java.util.TimeZone timeZone11 = java.util.TimeZone.getTimeZone("years");
        boolean boolean12 = timeZone11.observesDaylightTime();
        java.util.Locale locale13 = java.util.Locale.UK;
        java.util.Locale locale14 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet15 = locale14.getExtensionKeys();
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.util.Locale locale17 = java.util.Locale.KOREA;
        java.lang.String str18 = locale16.getDisplayScript(locale17);
        java.lang.String str19 = locale14.getDisplayScript(locale17);
        java.util.Locale locale20 = java.util.Locale.UK;
        java.lang.String str21 = locale14.getDisplayScript(locale20);
        java.lang.String str22 = locale13.getDisplayLanguage(locale20);
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone11, locale13);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property25 = dateTime24.monthOfYear();
        org.joda.time.DateTime dateTime26 = property25.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime27 = dateTime26.toDateTime();
        java.util.Locale locale28 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar29 = dateTime27.toCalendar(locale28);
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone11, locale28);
        java.lang.String str31 = timeZone11.getID();
        boolean boolean32 = timeZone5.hasSameRules(timeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar9 and calendar23", (calendar9.compareTo(calendar23) == 0) == calendar9.equals(calendar23));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) -1);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime3 = instant2.toDateTime();
        org.joda.time.DateTime.Property property4 = dateTime3.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone5 = dateTime3.getZone();
        boolean boolean6 = localTime1.equals((java.lang.Object) dateTime3);
        org.joda.time.DateTime dateTime7 = dateTime3.toDateTime();
        org.joda.time.DateTime.Property property8 = dateTime3.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime3", (instant2.compareTo(dateTime3) == 0) == instant2.equals(dateTime3));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime.Property property8 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalTime localTime11 = localTime9.withMillisOfDay(20);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime14 = localTime11.minusMinutes((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.era();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.year();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        boolean boolean22 = mutableDateTime20.isAfter((long) 21);
        boolean boolean24 = mutableDateTime20.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        mutableDateTime20.setZone(dateTimeZone27);
        mutableDateTime16.setZoneRetainFields(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = localTime14.toDateTimeToday(dateTimeZone27);
        org.joda.time.DateTime dateTime32 = dateTime30.minusHours(54148676);
        org.joda.time.DateTime dateTime34 = dateTime32.withMillisOfDay(23);
        org.joda.time.Instant instant35 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime36 = instant35.toDateTime();
        org.joda.time.DateTime.Property property37 = dateTime36.minuteOfHour();
        org.joda.time.DateTime dateTime38 = dateTime36.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime41 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology42 = localTime41.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType39.getField(chronology42);
        org.joda.time.DateTime dateTime44 = dateTime36.toDateTime(chronology42);
        org.joda.time.DateTime dateTime46 = dateTime36.plusWeeks(7);
        org.joda.time.DateTime.Property property47 = dateTime36.secondOfMinute();
        org.joda.time.LocalTime localTime49 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean51 = localTime49.equals((java.lang.Object) dateTimeFieldType50);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime54 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology55 = localTime54.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = dateTimeFieldType52.getField(chronology55);
        org.joda.time.DateTimeField dateTimeField57 = chronology55.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField58 = chronology55.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField59 = dateTimeFieldType50.getField(chronology55);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(chronology55);
        org.joda.time.LocalTime localTime61 = org.joda.time.LocalTime.now(chronology55);
        org.joda.time.DateTimeField dateTimeField62 = chronology55.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime(chronology55);
        org.joda.time.LocalTime localTime64 = new org.joda.time.LocalTime((java.lang.Object) dateTime36, chronology55);
        org.joda.time.DateTime dateTime65 = dateTime32.withChronology(chronology55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime26 and instant35", (mutableDateTime26.compareTo(instant35) == 0) == mutableDateTime26.equals(instant35));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus((long) 13);
        org.joda.time.Instant instant4 = instant2.minus((long) 901);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.centuries();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.centuryOfEra();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(chronology5);
        org.joda.time.DateTimeField dateTimeField9 = chronology5.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        long long17 = dateTimeZone12.getMillisKeepLocal(dateTimeZone15, (long) 10);
        java.lang.String str18 = dateTimeZone15.toString();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology22 = instant21.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.weekyears();
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.now(chronology22);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = chronology22.add(readablePeriod25, (long) 48, 2122);
        org.joda.time.DurationField durationField29 = chronology22.weekyears();
        org.joda.time.DateTimeField dateTimeField30 = chronology22.weekyear();
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime19.toMutableDateTime(chronology22);
        org.joda.time.LocalDate localDate32 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.Interval interval34 = localDate32.toInterval(dateTimeZone33);
        org.joda.time.LocalDate localDate36 = localDate32.plusMonths(0);
        org.joda.time.LocalDate.Property property37 = localDate36.year();
        int int38 = localDate36.size();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone44 = mutableDateTime43.getZone();
        long long46 = dateTimeZone41.getMillisKeepLocal(dateTimeZone44, (long) 10);
        org.joda.time.DateTime dateTime47 = localDate36.toDateTimeAtMidnight(dateTimeZone44);
        mutableDateTime31.setZone(dateTimeZone44);
        java.util.Locale locale49 = java.util.Locale.UK;
        java.util.Locale locale50 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet51 = locale50.getExtensionKeys();
        java.util.Locale locale52 = java.util.Locale.KOREA;
        java.util.Locale locale53 = java.util.Locale.KOREA;
        java.lang.String str54 = locale52.getDisplayScript(locale53);
        java.lang.String str55 = locale50.getDisplayScript(locale53);
        java.util.Locale locale56 = java.util.Locale.UK;
        java.lang.String str57 = locale50.getDisplayScript(locale56);
        java.lang.String str58 = locale49.getDisplayLanguage(locale56);
        java.util.Locale locale59 = java.util.Locale.ENGLISH;
        java.util.Locale locale60 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet61 = locale60.getExtensionKeys();
        java.lang.String str62 = locale59.getDisplayScript(locale60);
        java.lang.String str63 = locale56.getDisplayCountry(locale59);
        boolean boolean64 = dateTimeZone44.equals((java.lang.Object) locale56);
        org.joda.time.LocalDate localDate65 = org.joda.time.LocalDate.now(dateTimeZone44);
        int int66 = localDate65.getDayOfWeek();
        int int67 = dateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localDate65);
        int int68 = localDate65.getYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime11", (instant0.compareTo(mutableDateTime11) == 0) == instant0.equals(mutableDateTime11));
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        int int2 = mutableDateTime1.getCenturyOfEra();
        int int3 = mutableDateTime1.getDayOfYear();
        org.joda.time.Instant instant4 = mutableDateTime1.toInstant();
        org.joda.time.Instant instant6 = instant4.minus(0L);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.plus(readableDuration7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant8", (mutableDateTime1.compareTo(instant8) == 0) == mutableDateTime1.equals(instant8));
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        int int4 = dateTimeZone2.getStandardOffset(0L);
        java.util.TimeZone timeZone5 = dateTimeZone2.toTimeZone();
        int int6 = timeZone5.getRawOffset();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear(13);
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter7.getParser();
        java.util.Locale locale11 = dateTimeFormatter7.getLocale();
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology14 = instant13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.clockhourOfHalfday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter7.withChronology(chronology14);
        org.joda.time.DateTimeZone dateTimeZone18 = chronology14.getZone();
        org.joda.time.DateTimeField dateTimeField19 = chronology14.year();
        int int21 = dateTimeField19.getMaximumValue(1645455765944L);
        long long24 = dateTimeField19.getDifferenceAsLong((long) 50557, (long) 53326913);
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.Interval interval27 = localDate25.toInterval(dateTimeZone26);
        org.joda.time.LocalDate localDate29 = localDate25.plusMonths(0);
        org.joda.time.LocalDate.Property property30 = localDate29.year();
        org.joda.time.LocalDate localDate31 = org.joda.time.LocalDate.now();
        int int32 = localDate31.getDayOfMonth();
        org.joda.time.LocalDate localDate34 = localDate31.plusYears((int) (byte) 100);
        org.joda.time.Interval interval35 = localDate34.toInterval();
        boolean boolean36 = property30.equals((java.lang.Object) interval35);
        org.joda.time.LocalDate localDate37 = property30.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate38 = org.joda.time.LocalDate.now();
        int int39 = localDate38.getDayOfMonth();
        org.joda.time.LocalDate localDate41 = localDate38.plusYears((int) (byte) 100);
        org.joda.time.DateTime dateTime42 = localDate38.toDateTimeAtStartOfDay();
        org.joda.time.DateTime.Property property43 = dateTime42.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DateTime.Property property45 = dateTime42.property(dateTimeFieldType44);
        org.joda.time.DateTime dateTime47 = property45.addToCopy(2030);
        org.joda.time.DateTime dateTime48 = property45.getDateTime();
        org.joda.time.DateTime.Property property49 = dateTime48.hourOfDay();
        org.joda.time.DateTime dateTime50 = property49.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime51 = property49.roundHalfFloorCopy();
        java.util.Locale locale52 = java.util.Locale.KOREA;
        java.util.Locale locale53 = java.util.Locale.KOREA;
        java.lang.String str54 = locale52.getDisplayScript(locale53);
        java.util.Locale locale55 = java.util.Locale.KOREA;
        java.lang.String str56 = locale55.toLanguageTag();
        java.util.Locale locale57 = java.util.Locale.KOREA;
        java.lang.String str58 = locale55.getDisplayCountry(locale57);
        java.lang.String str59 = locale53.getDisplayCountry(locale55);
        java.lang.String str60 = locale55.toLanguageTag();
        java.util.Set<java.lang.String> strSet61 = locale55.getUnicodeLocaleKeys();
        java.lang.String str62 = property49.getAsText(locale55);
        java.lang.String str63 = dateTimeField19.getAsShortText((org.joda.time.ReadablePartial) localDate37, locale55);
        java.util.Locale locale69 = new java.util.Locale("4", "2022-10-03T20:56:20.110", "weeks");
        java.util.Set<java.lang.String> strSet70 = locale69.getUnicodeLocaleAttributes();
        long long71 = dateTimeField19.set((-3540000L), "21368194", locale69);
        java.util.Calendar calendar72 = java.util.Calendar.getInstance(timeZone5, locale69);
        calendar72.setFirstDayOfWeek(50813544);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime15", (mutableDateTime1.compareTo(mutableDateTime15) == 0) == mutableDateTime1.equals(mutableDateTime15));
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus((long) 13);
        org.joda.time.Instant instant4 = instant2.minus((long) 901);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.centuries();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.centuryOfEra();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(chronology5);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.era();
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        int int14 = localDate13.getDayOfMonth();
        org.joda.time.LocalDate localDate16 = localDate13.plusYears((int) (byte) 100);
        org.joda.time.Interval interval17 = localDate16.toInterval();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        long long25 = dateTimeZone20.getMillisKeepLocal(dateTimeZone23, (long) 10);
        java.lang.String str26 = dateTimeZone20.toString();
        org.joda.time.DateTime dateTime27 = localDate16.toDateTimeAtMidnight(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime11.toMutableDateTime(dateTimeZone20);
        long long30 = dateTimeZone20.previousTransition((long) 54136);
        mutableDateTime9.setZoneRetainFields(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime11", (instant0.compareTo(mutableDateTime11) == 0) == instant0.equals(mutableDateTime11));
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.withHourOfDay(13);
        org.joda.time.DateTime.Property property6 = dateTime1.centuryOfEra();
        org.joda.time.DateTime dateTime8 = dateTime1.withWeekyear(0);
        org.joda.time.DateTime.Property property9 = dateTime1.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        long long17 = dateTimeZone12.getMillisKeepLocal(dateTimeZone15, (long) 10);
        boolean boolean19 = dateTimeZone15.equals((java.lang.Object) 32772);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        long long23 = dateTimeZone15.convertLocalToUTC(0L, false);
        org.joda.time.DateTime dateTime24 = dateTime1.toDateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime26 = dateTime1.minusSeconds(919);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime11", (instant0.compareTo(mutableDateTime11) == 0) == instant0.equals(mutableDateTime11));
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.era();
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.years();
        mutableDateTime2.add(durationFieldType4, (int) (short) 1);
        mutableDateTime0.add(durationFieldType4, 54127);
        java.lang.String str9 = durationFieldType4.getName();
        java.lang.Object obj10 = null;
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology14 = instant13.getChronology();
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay((long) 20, chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(obj10, chronology14);
        boolean boolean18 = durationFieldType4.isSupported(chronology14);
        org.joda.time.Instant instant19 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime20 = instant19.toDateTime();
        org.joda.time.DateTime.Property property21 = dateTime20.minuteOfHour();
        org.joda.time.DateTime dateTime22 = dateTime20.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology26 = localTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType23.getField(chronology26);
        org.joda.time.DateTime dateTime28 = dateTime20.toDateTime(chronology26);
        boolean boolean29 = durationFieldType4.isSupported(chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime20", (dateTime17.compareTo(dateTime20) == 0) == dateTime17.equals(dateTime20));
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setMinuteOfDay(100);
        boolean boolean4 = mutableDateTime1.isAfterNow();
        boolean boolean5 = mutableDateTime1.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        mutableDateTime1.setZoneRetainFields(dateTimeZone8);
        mutableDateTime1.setMillisOfSecond((int) '4');
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        int int13 = localDate12.getDayOfMonth();
        org.joda.time.LocalDate localDate15 = localDate12.plusYears((int) (byte) 100);
        org.joda.time.DateTime dateTime16 = localDate12.toDateTimeAtStartOfDay();
        org.joda.time.DateTime.Property property17 = dateTime16.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DateTime.Property property19 = dateTime16.property(dateTimeFieldType18);
        org.joda.time.DateTime dateTime21 = property19.addToCopy(2030);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime24 = dateTime21.plusWeeks(21156);
        org.joda.time.DateTime dateTime26 = dateTime24.withWeekyear(52867);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime21", (mutableDateTime1.compareTo(dateTime21) == 0) == mutableDateTime1.equals(dateTime21));
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getGreatestMinimum((int) (byte) 0);
        java.util.TimeZone timeZone3 = calendar0.getTimeZone();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) calendar0);
        calendar0.setMinimalDaysInFirstWeek(54092146);
        java.util.Calendar calendar7 = java.util.Calendar.getInstance();
        boolean boolean8 = calendar7.isWeekDateSupported();
        java.util.Date date9 = calendar7.getTime();
        int int10 = calendar7.getMinimalDaysInFirstWeek();
        java.util.TimeZone timeZone11 = calendar7.getTimeZone();
        calendar0.setTimeZone(timeZone11);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.fromCalendarFields(calendar13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusSeconds(0);
        int int19 = localDateTime18.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.era();
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.years();
        mutableDateTime21.add(durationFieldType23, (int) (short) 1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime18.withFieldAdded(durationFieldType23, (int) 'a');
        java.util.Date date28 = localDateTime18.toDate();
        int int29 = date28.getHours();
        calendar0.setTime(date28);
        java.lang.String str31 = date28.toLocaleString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDateTime4 and localDateTime14", (localDateTime4.compareTo(localDateTime14) == 0) == localDateTime4.equals(localDateTime14));
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DurationField durationField6 = chronology3.seconds();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.millisOfSecond();
        org.joda.time.Chronology chronology10 = chronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology3.getZone();
        org.joda.time.DurationField durationField12 = chronology3.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology3.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField12", Math.signum(durationField6.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField6)));
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        int int2 = mutableDateTime1.getCenturyOfEra();
        mutableDateTime1.setMillisOfDay(5);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.secondOfDay();
        mutableDateTime1.set(dateTimeFieldType5, 111);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        long long15 = dateTimeZone10.getMillisKeepLocal(dateTimeZone13, (long) 10);
        java.lang.String str16 = dateTimeZone10.toString();
        mutableDateTime1.setZoneRetainFields(dateTimeZone10);
        mutableDateTime1.addMonths(351);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.years();
        java.lang.String str23 = durationFieldType22.toString();
        boolean boolean24 = localTime21.isSupported(durationFieldType22);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime27 = localTime21.withFieldAdded(durationFieldType25, 32772);
        org.joda.time.LocalTime.Property property28 = localTime21.hourOfDay();
        org.joda.time.LocalTime localTime30 = localTime21.minusMinutes(19);
        org.joda.time.Chronology chronology31 = localTime21.getChronology();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.parse("0");
        boolean boolean34 = localTime21.equals((java.lang.Object) dateTime33);
        org.joda.time.DateTime dateTime35 = dateTime33.toDateTimeISO();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType39 = org.joda.time.DurationFieldType.years();
        java.lang.String str40 = durationFieldType39.toString();
        boolean boolean41 = localTime38.isSupported(durationFieldType39);
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime44 = localTime38.withFieldAdded(durationFieldType42, 32772);
        org.joda.time.LocalTime.Property property45 = localTime38.hourOfDay();
        org.joda.time.LocalTime localTime46 = property45.roundCeilingCopy();
        org.joda.time.LocalTime localTime48 = localTime46.withMillisOfDay(20);
        org.joda.time.LocalTime.Property property49 = localTime48.secondOfMinute();
        org.joda.time.LocalTime localTime51 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean53 = localTime51.equals((java.lang.Object) dateTimeFieldType52);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime56 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology57 = localTime56.getChronology();
        org.joda.time.DateTimeField dateTimeField58 = dateTimeFieldType54.getField(chronology57);
        org.joda.time.DateTimeField dateTimeField59 = chronology57.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField60 = chronology57.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField61 = dateTimeFieldType52.getField(chronology57);
        org.joda.time.LocalTime localTime63 = localTime48.withField(dateTimeFieldType52, 9);
        org.joda.time.Instant instant65 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology66 = instant65.getChronology();
        org.joda.time.DurationField durationField67 = chronology66.weekyears();
        org.joda.time.DateTimeField dateTimeField68 = chronology66.clockhourOfHalfday();
        org.joda.time.DurationField durationField69 = chronology66.weeks();
        org.joda.time.DateTimeField dateTimeField70 = chronology66.clockhourOfHalfday();
        boolean boolean71 = dateTimeFieldType52.isSupported(chronology66);
        org.joda.time.DateTimeField dateTimeField72 = chronology66.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime(63800402568702L, chronology66);
        org.joda.time.DateTime dateTime74 = dateTime35.toDateTime(chronology66);
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) dateTime35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and dateTime74", (dateTime35.compareTo(dateTime74) == 0) == dateTime35.equals(dateTime74));
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale4.getDisplayScript(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone1, locale3);
        java.util.Calendar calendar14 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.fromCalendarFields(calendar14);
        boolean boolean16 = calendar14.isWeekDateSupported();
        calendar14.setFirstDayOfWeek(5);
        calendar14.setMinimalDaysInFirstWeek((-1));
        java.util.Date date21 = calendar14.getTime();
        java.time.Instant instant22 = date21.toInstant();
        boolean boolean23 = timeZone1.inDaylightTime(date21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar14", (calendar13.compareTo(calendar14) == 0) == calendar13.equals(calendar14));
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.DateTimeZone dateTimeZone1 = dateTimeFormatter0.getZone();
        boolean boolean2 = dateTimeFormatter0.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter4.withZoneUTC();
        java.lang.Integer int6 = dateTimeFormatter4.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int11 = dateTimeZone9.getStandardOffset(0L);
        java.util.TimeZone timeZone12 = dateTimeZone9.toTimeZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter4.withZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeFormatter4.getZone();
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Interval interval17 = localDate15.toInterval(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate15.plusMonths(0);
        org.joda.time.LocalDate localDate21 = localDate15.withYearOfCentury(0);
        org.joda.time.Chronology chronology22 = localDate15.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter4.withChronology(chronology22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and mutableDateTime23", (mutableDateTime8.compareTo(mutableDateTime23) == 0) == mutableDateTime8.equals(mutableDateTime23));
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.plusWeeks(100);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withDurationAdded(readableDuration7, 14);
        int int10 = localDateTime3.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime3.withMillisOfSecond((int) 'a');
        int int13 = localDateTime12.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int16 = localDateTime12.indexOf(dateTimeFieldType15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.millisOfDay();
        java.lang.String str21 = mutableDateTime18.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        int int22 = mutableDateTime18.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.secondOfMinute();
        org.joda.time.Chronology chronology24 = mutableDateTime18.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.millis();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.fromCalendarFields(calendar26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime33 = localDateTime27.plusHours(2922789);
        long long35 = chronology24.set((org.joda.time.ReadablePartial) localDateTime27, (long) 1960);
        org.joda.time.DateTimeZone dateTimeZone36 = chronology24.getZone();
        org.joda.time.DateTimeField dateTimeField37 = dateTimeFieldType15.getField(chronology24);
        boolean boolean39 = dateTimeField37.isLeap(1645455753641L);
        java.util.Locale.Builder builder41 = new java.util.Locale.Builder();
        java.util.Locale locale42 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder43 = builder41.setLocale(locale42);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime46 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology47 = localTime46.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = dateTimeFieldType44.getField(chronology47);
        java.util.Locale locale49 = java.util.Locale.KOREA;
        java.util.Locale locale50 = java.util.Locale.KOREA;
        java.lang.String str51 = locale49.getDisplayScript(locale50);
        java.util.Locale locale52 = java.util.Locale.KOREA;
        java.lang.String str53 = locale52.toLanguageTag();
        java.util.Locale locale54 = java.util.Locale.KOREA;
        java.lang.String str55 = locale52.getDisplayCountry(locale54);
        java.lang.String str56 = locale50.getDisplayCountry(locale52);
        int int57 = dateTimeField48.getMaximumTextLength(locale50);
        java.lang.String str58 = locale50.getVariant();
        org.joda.time.LocalTime localTime60 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType61 = org.joda.time.DurationFieldType.years();
        java.lang.String str62 = durationFieldType61.toString();
        boolean boolean63 = localTime60.isSupported(durationFieldType61);
        org.joda.time.DurationFieldType durationFieldType64 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime66 = localTime60.withFieldAdded(durationFieldType64, 32772);
        org.joda.time.LocalTime.Property property67 = localTime60.hourOfDay();
        org.joda.time.LocalTime localTime68 = property67.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        org.joda.time.LocalTime localTime70 = localTime68.minus(readablePeriod69);
        org.joda.time.Instant instant71 = new org.joda.time.Instant();
        org.joda.time.Instant instant73 = instant71.withMillis((long) (short) 100);
        org.joda.time.Instant instant74 = instant73.toInstant();
        boolean boolean75 = localTime70.equals((java.lang.Object) instant73);
        java.util.TimeZone timeZone78 = java.util.TimeZone.getTimeZone("years");
        boolean boolean79 = timeZone78.observesDaylightTime();
        java.util.Locale locale80 = java.util.Locale.UK;
        java.util.Locale locale81 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet82 = locale81.getExtensionKeys();
        java.util.Locale locale83 = java.util.Locale.KOREA;
        java.util.Locale locale84 = java.util.Locale.KOREA;
        java.lang.String str85 = locale83.getDisplayScript(locale84);
        java.lang.String str86 = locale81.getDisplayScript(locale84);
        java.util.Locale locale87 = java.util.Locale.UK;
        java.lang.String str88 = locale81.getDisplayScript(locale87);
        java.lang.String str89 = locale80.getDisplayLanguage(locale87);
        java.util.Calendar calendar90 = java.util.Calendar.getInstance(timeZone78, locale80);
        java.lang.String str91 = localTime70.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc", locale80);
        java.lang.String str92 = locale50.getDisplayName(locale80);
        java.lang.String str93 = locale80.getISO3Country();
        java.util.Locale.Builder builder94 = builder43.setLocale(locale80);
        java.util.Set<java.lang.Character> charSet95 = locale80.getExtensionKeys();
        java.lang.String str96 = locale80.getDisplayScript();
        java.lang.String str97 = dateTimeField37.getAsShortText(590, locale80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar90", (calendar0.compareTo(calendar90) == 0) == calendar0.equals(calendar90));
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone("years");
        boolean boolean4 = timeZone3.observesDaylightTime();
        boolean boolean5 = timeZone1.hasSameRules(timeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long9 = dateTimeZone6.convertLocalToUTC(194766091200000L, false);
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone6);
        long long12 = dateTimeZone6.previousTransition(1645458130947L);
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        long long22 = dateTimeZone17.convertLocalToUTC((long) 0, true, (long) 32772);
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone17);
        int int24 = localTime23.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology28 = localTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType25.getField(chronology28);
        org.joda.time.DateTimeField dateTimeField30 = chronology28.secondOfDay();
        java.lang.String str32 = dateTimeField30.getAsShortText(10L);
        long long34 = dateTimeField30.roundHalfEven((long) 1);
        boolean boolean35 = dateTimeField30.isSupported();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = dateTimeField30.getType();
        org.joda.time.LocalTime localTime38 = localTime23.withField(dateTimeFieldType36, 12);
        java.lang.String str39 = dateTimeFieldType36.toString();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime14.property(dateTimeFieldType36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and mutableDateTime16", (mutableDateTime13.compareTo(mutableDateTime16) == 0) == mutableDateTime13.equals(mutableDateTime16));
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.monthOfYear();
        org.joda.time.DurationField durationField2 = property1.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType3.getField(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.secondOfDay();
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.lang.String str11 = dateTimeField8.getAsText(7, locale10);
        java.util.Locale locale12 = java.util.Locale.UK;
        java.util.Locale locale13 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet14 = locale13.getExtensionKeys();
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.lang.String str17 = locale15.getDisplayScript(locale16);
        java.lang.String str18 = locale13.getDisplayScript(locale16);
        java.util.Locale locale19 = java.util.Locale.UK;
        java.lang.String str20 = locale13.getDisplayScript(locale19);
        java.lang.String str21 = locale12.getDisplayLanguage(locale19);
        java.lang.String str22 = locale10.getDisplayVariant(locale19);
        java.util.Locale locale23 = locale19.stripExtensions();
        java.lang.String str25 = locale19.getExtension('a');
        int int26 = property1.getMaximumShortTextLength(locale19);
        org.joda.time.DateTime dateTime28 = property1.addWrapFieldToCopy(53);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology31 = instant30.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.weekyears();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.yearOfEra();
        org.joda.time.DateTimeField dateTimeField34 = chronology31.yearOfEra();
        org.joda.time.DateTime dateTime35 = dateTime28.toDateTime(chronology31);
        int int36 = dateTime28.getDayOfWeek();
        org.joda.time.DateTime dateTime38 = dateTime28.withCenturyOfEra(459);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime41 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology42 = localTime41.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType39.getField(chronology42);
        org.joda.time.DateTimeField dateTimeField44 = chronology42.secondOfDay();
        org.joda.time.DateTimeField dateTimeField45 = chronology42.hourOfDay();
        org.joda.time.DurationField durationField46 = chronology42.weeks();
        org.joda.time.DurationField durationField47 = chronology42.days();
        org.joda.time.DateTimeField dateTimeField48 = chronology42.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField49 = chronology42.dayOfYear();
        org.joda.time.DurationField durationField50 = chronology42.millis();
        org.joda.time.DateTimeField dateTimeField51 = chronology42.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime52 = dateTime38.toMutableDateTime(chronology42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and dateTime35", (dateTime28.compareTo(dateTime35) == 0) == dateTime28.equals(dateTime35));
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.lang.String str4 = locale2.getDisplayScript(locale3);
        java.lang.String str5 = locale0.getDisplayScript(locale3);
        java.util.Locale locale6 = java.util.Locale.UK;
        java.lang.String str7 = locale0.getDisplayScript(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        boolean boolean12 = mutableDateTime10.isAfter((long) 21);
        boolean boolean14 = mutableDateTime10.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        mutableDateTime10.setZone(dateTimeZone17);
        java.lang.String str20 = dateTimeZone17.getName((long) 32772);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.fromCalendarFields(calendar22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.hourOfDay();
        org.joda.time.LocalDateTime localDateTime27 = property26.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withMillisOfDay(54096794);
        org.joda.time.tz.NameProvider nameProvider30 = org.joda.time.DateTimeZone.getNameProvider();
        boolean boolean31 = localDateTime29.equals((java.lang.Object) nameProvider30);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider30);
        java.util.Locale locale34 = java.util.Locale.forLanguageTag("\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        java.lang.String str37 = nameProvider30.getName(locale34, "\ub300\ud55c\ubbfc\uad6d", "\uc138\uacc4\ud45c\uc900\uc2dc");
        java.lang.String str38 = dateTimeZone17.getShortName(1645455917506L, locale34);
        java.lang.String str39 = locale6.getDisplayScript(locale34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar22", (calendar8.compareTo(calendar22) == 0) == calendar8.equals(calendar22));
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        int int6 = localDate4.size();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        long long14 = dateTimeZone9.getMillisKeepLocal(dateTimeZone12, (long) 10);
        org.joda.time.DateTime dateTime15 = localDate4.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime dateTime17 = dateTime15.minusDays(0);
        org.joda.time.DateTime dateTime19 = dateTime17.minusMinutes(0);
        org.joda.time.DateTime dateTime21 = dateTime19.minusMonths(121);
        org.joda.time.DateTime dateTime23 = dateTime21.withMillisOfDay(2022);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) (-1));
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate27 = localDate25.minus(readablePeriod26);
        org.joda.time.DateTime dateTime28 = localDate25.toDateTimeAtStartOfDay();
        org.joda.time.DateTime.Property property29 = dateTime28.secondOfMinute();
        boolean boolean30 = dateTime21.isAfter((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(dateTimeZone32);
        mutableDateTime33.setMinuteOfDay(100);
        boolean boolean36 = mutableDateTime33.isAfterNow();
        boolean boolean37 = mutableDateTime33.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        mutableDateTime33.setZoneRetainFields(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(1645455722283L, dateTimeZone40);
        org.joda.time.DateTime dateTime44 = dateTime28.withZoneRetainFields(dateTimeZone40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and mutableDateTime42", (mutableDateTime8.compareTo(mutableDateTime42) == 0) == mutableDateTime8.equals(mutableDateTime42));
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) (byte) -1);
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now();
        int int4 = localDate3.getDayOfMonth();
        org.joda.time.LocalDate localDate6 = localDate3.plusYears((int) (byte) 100);
        org.joda.time.Interval interval7 = localDate6.toInterval();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        long long15 = dateTimeZone10.getMillisKeepLocal(dateTimeZone13, (long) 10);
        java.lang.String str16 = dateTimeZone10.toString();
        org.joda.time.DateTime dateTime17 = localDate6.toDateTimeAtMidnight(dateTimeZone10);
        long long19 = dateTimeZone10.convertUTCToLocal((-87L));
        long long21 = dateTimeZone10.convertUTCToLocal(100L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter0.withZone(dateTimeZone10);
        boolean boolean23 = dateTimeFormatter0.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter0.withDefaultYear((-10076576));
        org.joda.time.format.DateTimePrinter dateTimePrinter26 = dateTimeFormatter25.getPrinter();
        org.joda.time.Instant instant27 = new org.joda.time.Instant();
        org.joda.time.Instant instant29 = instant27.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Instant instant32 = instant29.withDurationAdded(readableDuration30, (int) (short) 0);
        boolean boolean34 = instant29.isBefore((long) 5);
        java.util.Date date35 = instant29.toDate();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Instant instant38 = instant29.withDurationAdded(readableDuration36, (int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter39.withPivotYear(13);
        java.lang.String str42 = instant29.toString(dateTimeFormatter39);
        org.joda.time.format.DateTimeParser dateTimeParser43 = dateTimeFormatter39.getParser();
        int int44 = dateTimeParser43.estimateParsedLength();
        int int45 = dateTimeParser43.estimateParsedLength();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter26, dateTimeParser43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant27", (mutableDateTime9.compareTo(instant27) == 0) == mutableDateTime9.equals(instant27));
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withCenturyOfEra((int) '#');
        int int5 = dateTime1.getEra();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.years();
        java.lang.String str9 = durationFieldType8.toString();
        boolean boolean10 = localTime7.isSupported(durationFieldType8);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime13 = localTime7.withFieldAdded(durationFieldType11, 32772);
        org.joda.time.LocalTime.Property property14 = localTime7.hourOfDay();
        org.joda.time.LocalTime localTime16 = localTime7.minusMinutes(2922789);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology19 = instant18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(chronology19);
        boolean boolean21 = localTime7.equals((java.lang.Object) chronology19);
        org.joda.time.DateTimeField dateTimeField22 = chronology19.minuteOfHour();
        long long25 = dateTimeField22.add(7254121L, 1645455744611L);
        int int26 = dateTime1.get(dateTimeField22);
        java.lang.String str28 = dateTimeField22.getAsShortText((-12956702274714L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 100);
        int int2 = localTime1.size();
        org.joda.time.LocalTime localTime4 = localTime1.plusMinutes(6);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime6 = instant5.toDateTime();
        org.joda.time.DateTime.Property property7 = dateTime6.minuteOfHour();
        org.joda.time.DateTime dateTime8 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime10 = dateTime6.withHourOfDay(13);
        org.joda.time.DateTime.Property property11 = dateTime6.centuryOfEra();
        boolean boolean12 = localTime1.equals((java.lang.Object) dateTime6);
        org.joda.time.DateTime.Property property13 = dateTime6.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime6.toMutableDateTime();
        mutableDateTime14.setMinuteOfDay(278);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime6", (instant5.compareTo(dateTime6) == 0) == instant5.equals(dateTime6));
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setMinuteOfDay(100);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = localDate4.toInterval(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate4.plusMonths(0);
        org.joda.time.LocalDate.Property property9 = localDate8.year();
        int int10 = localDate8.size();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        long long18 = dateTimeZone13.getMillisKeepLocal(dateTimeZone16, (long) 10);
        org.joda.time.DateTime dateTime19 = localDate8.toDateTimeAtMidnight(dateTimeZone16);
        int int20 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.LocalDate localDate21 = dateTime19.toLocalDate();
        org.joda.time.DateTime dateTime22 = dateTime19.toDateTime();
        org.joda.time.DateTime.Property property23 = dateTime19.weekyear();
        org.joda.time.DateTime dateTime25 = property23.addToCopy(2000);
        org.joda.time.DateTimeField dateTimeField26 = property23.getField();
        org.joda.time.DateTime dateTime27 = property23.roundCeilingCopy();
        org.joda.time.DateTime dateTime29 = dateTime27.plusWeeks(21187);
        org.joda.time.Instant instant30 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime31 = instant30.toDateTime();
        org.joda.time.DateTime.Property property32 = dateTime31.weekOfWeekyear();
        org.joda.time.DateTime dateTime34 = dateTime31.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime36 = dateTime31.withWeekyear(2122);
        org.joda.time.DateTime dateTime38 = dateTime31.plusHours(54100989);
        org.joda.time.DateTime dateTime40 = dateTime31.withYearOfEra(2);
        org.joda.time.DateTime dateTime42 = dateTime40.withWeekyear(30749);
        boolean boolean43 = dateTime27.isEqual((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.Chronology chronology44 = dateTime40.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and instant30", (mutableDateTime12.compareTo(instant30) == 0) == mutableDateTime12.equals(instant30));
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.Instant instant8 = instant2.withDurationAdded((long) 'a', (int) (byte) 10);
        boolean boolean9 = instant2.isAfterNow();
        long long10 = instant2.getMillis();
        boolean boolean12 = instant2.isEqual((long) 31);
        long long13 = instant2.getMillis();
        org.joda.time.Instant instant15 = instant2.minus(10L);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology19 = instant18.getChronology();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromMillisOfDay((long) 20, chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology19.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField22 = chronology19.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField23 = chronology19.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField24 = chronology19.year();
        boolean boolean25 = instant2.equals((java.lang.Object) dateTimeField24);
        java.util.Calendar calendar26 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.fromCalendarFields(calendar26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusMonths((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withCenturyOfEra(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = org.joda.time.format.DateTimeFormat.shortTime();
        java.lang.String str37 = localDateTime35.toString(dateTimeFormatter36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime35.minusSeconds(12);
        org.joda.time.Chronology chronology40 = localDateTime39.getChronology();
        org.joda.time.LocalDateTime.Property property41 = localDateTime39.dayOfWeek();
        org.joda.time.LocalDate localDate42 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.Interval interval44 = localDate42.toInterval(dateTimeZone43);
        org.joda.time.LocalDate localDate46 = localDate42.plusMonths(0);
        org.joda.time.LocalDate.Property property47 = localDate46.year();
        int int48 = localDate46.size();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(dateTimeZone49);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime50.getZone();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(dateTimeZone52);
        org.joda.time.DateTimeZone dateTimeZone54 = mutableDateTime53.getZone();
        long long56 = dateTimeZone51.getMillisKeepLocal(dateTimeZone54, (long) 10);
        org.joda.time.DateTime dateTime57 = localDate46.toDateTimeAtMidnight(dateTimeZone54);
        org.joda.time.DateTime.Property property58 = dateTime57.yearOfEra();
        org.joda.time.DateTime dateTime59 = property58.getDateTime();
        int int60 = property58.getMinimumValueOverall();
        org.joda.time.DateTime dateTime61 = property58.withMinimumValue();
        org.joda.time.DateTime dateTime63 = dateTime61.minusYears(54110417);
        org.joda.time.Chronology chronology64 = dateTime61.getChronology();
        org.joda.time.DateTimeField dateTimeField65 = chronology64.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField66 = chronology64.centuryOfEra();
        boolean boolean67 = dateTimeField66.isSupported();
        org.joda.time.LocalDate localDate68 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate70 = localDate68.withWeekyear(3);
        org.joda.time.LocalDate localDate71 = org.joda.time.LocalDate.now();
        int int72 = localDate71.getDayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        org.joda.time.LocalDate localDate74 = localDate71.plus(readablePeriod73);
        org.joda.time.LocalDate localDate76 = localDate71.withCenturyOfEra(21);
        org.joda.time.LocalDate localDate78 = localDate71.withYear(19);
        int[] intArray79 = localDate78.getValues();
        int int80 = dateTimeField66.getMinimumValue((org.joda.time.ReadablePartial) localDate70, intArray79);
        int int81 = dateTimeField24.getMinimumValue((org.joda.time.ReadablePartial) localDateTime39, intArray79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant2", (mutableDateTime1.compareTo(instant2) == 0) == mutableDateTime1.equals(instant2));
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.DateTime.Property property10 = dateTime1.hourOfDay();
        org.joda.time.DateTime dateTime12 = dateTime1.withYearOfEra(21246826);
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.weekOfWeekyear();
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        long long7 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Instant instant9 = instant6.minus((long) (byte) 1);
        long long10 = instant9.getMillis();
        org.joda.time.MutableDateTime mutableDateTime11 = instant9.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime11.add(readableDuration12, (int) '4');
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime11.yearOfEra();
        org.joda.time.DurationField durationField16 = property15.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and mutableDateTime11", (instant9.compareTo(mutableDateTime11) == 0) == instant9.equals(mutableDateTime11));
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getGreatestMinimum((int) (byte) 0);
        java.util.TimeZone timeZone3 = calendar0.getTimeZone();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) calendar0);
        java.lang.String str5 = calendar0.getCalendarType();
        java.util.Date date6 = calendar0.getTime();
        java.util.TimeZone timeZone7 = calendar0.getTimeZone();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(1L);
        int int10 = mutableDateTime9.getRoundingMode();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.year();
        mutableDateTime9.addHours(40);
        java.util.Calendar calendar14 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.fromCalendarFields(calendar14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusSeconds(0);
        int int20 = localDateTime19.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType22 = dateTimeFieldType21.getRangeDurationType();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.withFieldAdded(durationFieldType22, (int) (byte) 1);
        org.joda.time.DateTime dateTime25 = localDateTime19.toDateTime();
        boolean boolean26 = mutableDateTime9.isBefore((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime9.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime9.getZone();
        java.util.TimeZone timeZone29 = dateTimeZone28.toTimeZone();
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.lang.String str31 = locale30.toLanguageTag();
        java.util.Locale locale32 = java.util.Locale.KOREA;
        java.lang.String str33 = locale30.getDisplayCountry(locale32);
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(timeZone29, locale32);
        calendar0.setTimeZone(timeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar34", (calendar14.compareTo(calendar34) == 0) == calendar14.equals(calendar34));
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.withWeekyear(2122);
        org.joda.time.DateTime dateTime8 = dateTime1.plusHours(54100989);
        boolean boolean9 = dateTime1.isEqualNow();
        boolean boolean11 = dateTime1.isEqual(48L);
        org.joda.time.Instant instant12 = dateTime1.toInstant();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant12.plus(readableDuration13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        org.joda.time.LocalDate localDate6 = property5.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate7 = property5.getLocalDate();
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now();
        int int9 = localDate8.getDayOfMonth();
        org.joda.time.LocalDate localDate11 = localDate8.plusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        boolean boolean15 = mutableDateTime13.isAfter((long) 21);
        boolean boolean17 = mutableDateTime13.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        mutableDateTime13.setZone(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = localDate8.toDateTimeAtStartOfDay(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone20);
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate26 = localDate24.withWeekyear(3);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        long long35 = dateTimeZone30.getMillisKeepLocal(dateTimeZone33, (long) 10);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(10L, dateTimeZone30);
        long long38 = dateTimeZone30.nextTransition((long) 12);
        org.joda.time.DateTime dateTime39 = localDate24.toDateTimeAtMidnight(dateTimeZone30);
        long long41 = dateTimeZone20.getMillisKeepLocal(dateTimeZone30, (long) '#');
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime43 = localDate7.toDateTimeAtCurrentTime(dateTimeZone20);
        org.joda.time.Instant instant45 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology46 = instant45.getChronology();
        org.joda.time.DurationField durationField47 = chronology46.weekyears();
        org.joda.time.DateTimeField dateTimeField48 = chronology46.clockhourOfHalfday();
        org.joda.time.DurationField durationField49 = chronology46.weeks();
        org.joda.time.DateTimeField dateTimeField50 = chronology46.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField51 = chronology46.weekOfWeekyear();
        java.lang.String str52 = chronology46.toString();
        org.joda.time.DateTime dateTime53 = dateTime43.toDateTime(chronology46);
        org.joda.time.DurationField durationField54 = chronology46.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and dateTime53", (mutableDateTime13.compareTo(dateTime53) == 0) == mutableDateTime13.equals(dateTime53));
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        org.joda.time.LocalDate localDate6 = property5.roundHalfEvenCopy();
        org.joda.time.Instant instant7 = new org.joda.time.Instant();
        org.joda.time.Instant instant9 = instant7.withMillis((long) (short) 100);
        org.joda.time.Instant instant10 = instant9.toInstant();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant13 = instant10.withDurationAdded(readableDuration11, 5);
        org.joda.time.Instant instant14 = instant10.toInstant();
        org.joda.time.DateTime dateTime15 = localDate6.toDateTime((org.joda.time.ReadableInstant) instant10);
        org.joda.time.DateTime dateTime16 = instant10.toDateTimeISO();
        org.joda.time.Chronology chronology17 = instant10.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime16", (instant9.compareTo(dateTime16) == 0) == instant9.equals(dateTime16));
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType1.getField(chronology4);
        org.joda.time.DateTimeField dateTimeField6 = chronology4.secondOfDay();
        org.joda.time.DurationField durationField7 = chronology4.seconds();
        org.joda.time.DateTimeField dateTimeField8 = chronology4.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology4.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology4.millisOfSecond();
        org.joda.time.Chronology chronology11 = chronology4.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = chronology4.hourOfHalfday();
        org.joda.time.DurationField durationField13 = chronology4.eras();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) 257, chronology4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField13", Math.signum(durationField7.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField7)));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        boolean boolean7 = mutableDateTime5.isAfter((long) 21);
        boolean boolean9 = mutableDateTime5.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        mutableDateTime5.setZone(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = localDate0.toDateTimeAtStartOfDay(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate18 = localDate16.withWeekyear(3);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        long long27 = dateTimeZone22.getMillisKeepLocal(dateTimeZone25, (long) 10);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(10L, dateTimeZone22);
        long long30 = dateTimeZone22.nextTransition((long) 12);
        org.joda.time.DateTime dateTime31 = localDate16.toDateTimeAtMidnight(dateTimeZone22);
        long long33 = dateTimeZone12.getMillisKeepLocal(dateTimeZone22, (long) '#');
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(dateTimeZone12);
        org.joda.time.LocalDate localDate36 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.Interval interval38 = localDate36.toInterval(dateTimeZone37);
        org.joda.time.LocalDate localDate40 = localDate36.plusMonths(0);
        org.joda.time.LocalDate.Property property41 = localDate40.year();
        int int42 = localDate40.size();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone45 = mutableDateTime44.getZone();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone48 = mutableDateTime47.getZone();
        long long50 = dateTimeZone45.getMillisKeepLocal(dateTimeZone48, (long) 10);
        org.joda.time.DateTime dateTime51 = localDate40.toDateTimeAtMidnight(dateTimeZone48);
        org.joda.time.DateTime.Property property52 = dateTime51.yearOfEra();
        org.joda.time.DateTime dateTime53 = property52.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime55 = property52.addToCopy((int) 'u');
        org.joda.time.DateTime dateTime57 = property52.setCopy(19);
        org.joda.time.DateTime dateTime59 = dateTime57.plusMonths(2922789);
        org.joda.time.DateTime.Property property60 = dateTime57.dayOfMonth();
        org.joda.time.Instant instant61 = dateTime57.toInstant();
        org.joda.time.MutableDateTime mutableDateTime62 = instant61.toMutableDateTimeISO();
        int int63 = dateTimeZone12.getOffset((org.joda.time.ReadableInstant) instant61);
        org.joda.time.LocalTime localTime64 = org.joda.time.LocalTime.now(dateTimeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime57 and instant61", (dateTime57.compareTo(instant61) == 0) == dateTime57.equals(instant61));
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMaximumValue();
        org.joda.time.Chronology chronology6 = localDateTime5.getChronology();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusYears((int) (byte) 10);
        org.joda.time.Chronology chronology9 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("years");
        boolean boolean15 = timeZone14.observesDaylightTime();
        java.util.Locale locale16 = java.util.Locale.UK;
        java.util.Locale locale17 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet18 = locale17.getExtensionKeys();
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.lang.String str21 = locale19.getDisplayScript(locale20);
        java.lang.String str22 = locale17.getDisplayScript(locale20);
        java.util.Locale locale23 = java.util.Locale.UK;
        java.lang.String str24 = locale17.getDisplayScript(locale23);
        java.lang.String str25 = locale16.getDisplayLanguage(locale23);
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone14, locale16);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        timeZone14.setRawOffset(0);
        java.time.ZoneId zoneId30 = timeZone14.toZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime33 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology34 = localTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = dateTimeFieldType31.getField(chronology34);
        org.joda.time.DateTimeField dateTimeField36 = chronology34.secondOfDay();
        java.lang.String str38 = dateTimeField36.getAsShortText(10L);
        org.joda.time.DurationField durationField39 = dateTimeField36.getDurationField();
        java.util.Locale locale41 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet42 = locale41.getExtensionKeys();
        java.util.Locale locale43 = java.util.Locale.KOREA;
        java.util.Locale locale44 = java.util.Locale.KOREA;
        java.lang.String str45 = locale43.getDisplayScript(locale44);
        java.lang.String str46 = locale41.getDisplayScript(locale44);
        java.util.Locale locale47 = java.util.Locale.UK;
        java.lang.String str48 = locale41.getDisplayScript(locale47);
        java.lang.String str49 = dateTimeField36.getAsShortText(100, locale41);
        java.util.Calendar calendar50 = java.util.Calendar.getInstance(timeZone14, locale41);
        java.lang.String str51 = dateTimeField11.getAsShortText((-21239558), locale41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar26", (calendar0.compareTo(calendar26) == 0) == calendar0.equals(calendar26));
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfMinute();
        org.joda.time.DurationField durationField6 = dateTimeField5.getDurationField();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.years();
        java.lang.String str10 = durationFieldType9.toString();
        boolean boolean11 = localTime8.isSupported(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime14 = localTime8.withFieldAdded(durationFieldType12, 32772);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean18 = localTime16.equals((java.lang.Object) dateTimeFieldType17);
        org.joda.time.LocalTime.Property property19 = localTime8.property(dateTimeFieldType17);
        org.joda.time.LocalTime localTime20 = property19.withMaximumValue();
        int int21 = dateTimeField5.getMinimumValue((org.joda.time.ReadablePartial) localTime20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        org.joda.time.DateTime dateTime25 = localTime20.toDateTimeToday(dateTimeZone24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology29 = localTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType26.getField(chronology29);
        org.joda.time.DateTimeField dateTimeField31 = chronology29.secondOfDay();
        org.joda.time.DurationField durationField32 = chronology29.seconds();
        org.joda.time.LocalTime localTime33 = org.joda.time.LocalTime.now(chronology29);
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now(chronology29);
        org.joda.time.DurationField durationField35 = chronology29.weeks();
        org.joda.time.DateTimeField dateTimeField36 = chronology29.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField37 = chronology29.year();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(chronology29);
        org.joda.time.DateTimeField dateTimeField39 = chronology29.era();
        org.joda.time.DateTimeField dateTimeField40 = chronology29.hourOfDay();
        org.joda.time.DateTime dateTime41 = dateTime25.toDateTime(chronology29);
        org.joda.time.DateTimeField dateTimeField42 = chronology29.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and dateTime41", (dateTime25.compareTo(dateTime41) == 0) == dateTime25.equals(dateTime41));
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        boolean boolean7 = mutableDateTime5.isAfter((long) 21);
        boolean boolean9 = mutableDateTime5.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        mutableDateTime5.setZone(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = localDate0.toDateTimeAtStartOfDay(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(1L);
        int int17 = mutableDateTime16.getCenturyOfEra();
        int int18 = mutableDateTime16.getDayOfYear();
        org.joda.time.Instant instant19 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime16.weekOfWeekyear();
        java.lang.String str21 = mutableDateTime16.toString();
        boolean boolean22 = localDate0.equals((java.lang.Object) str21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and instant19", (mutableDateTime16.compareTo(instant19) == 0) == mutableDateTime16.equals(instant19));
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        int int2 = mutableDateTime1.getCenturyOfEra();
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Calendar calendar4 = mutableDateTime1.toCalendar(locale3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.yearOfEra();
        boolean boolean6 = mutableDateTime1.isSupported(dateTimeFieldType5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int11 = dateTimeZone9.getStandardOffset(0L);
        long long13 = dateTimeZone9.nextTransition((long) '#');
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(dateTimeZone9);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minus(readablePeriod15);
        int int18 = localDateTime14.getValue((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.minusDays(54126);
        java.lang.String str21 = localDateTime20.toString();
        org.joda.time.Chronology chronology22 = localDateTime20.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(chronology22);
        boolean boolean24 = dateTimeFieldType5.isSupported(chronology22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and mutableDateTime23", (mutableDateTime8.compareTo(mutableDateTime23) == 0) == mutableDateTime8.equals(mutableDateTime23));
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, (int) (short) 0);
        boolean boolean7 = instant2.isBefore((long) 5);
        java.util.Date date8 = instant2.toDate();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant2.withDurationAdded(readableDuration9, (int) ' ');
        org.joda.time.Instant instant13 = instant2.withMillis(1646092800000L);
        org.joda.time.DateTime dateTime14 = instant13.toDateTime();
        org.joda.time.DateTime dateTime16 = dateTime14.plusYears(54240497);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime19 = dateTime16.withPeriodAdded(readablePeriod17, (-292275036));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and dateTime14", (instant13.compareTo(dateTime14) == 0) == instant13.equals(dateTime14));
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        boolean boolean5 = mutableDateTime1.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        mutableDateTime1.setZone(dateTimeZone8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.lang.String str13 = locale11.getDisplayScript(locale12);
        java.lang.String str14 = locale11.getDisplayScript();
        java.lang.String str15 = dateTimeZone8.getShortName((long) 13, locale11);
        java.util.TimeZone timeZone17 = java.util.TimeZone.getDefault();
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.lang.String str19 = locale18.toLanguageTag();
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(timeZone17, locale18);
        java.lang.String str21 = locale18.getISO3Country();
        java.lang.String str22 = dateTimeZone8.getShortName(0L, locale18);
        java.lang.String str23 = locale18.getISO3Language();
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.now();
        int int25 = localDate24.getDayOfMonth();
        org.joda.time.LocalDate localDate27 = localDate24.plusYears((int) (byte) 100);
        org.joda.time.LocalDate.Property property28 = localDate27.centuryOfEra();
        int int29 = property28.getMaximumValueOverall();
        java.util.Locale locale30 = java.util.Locale.UK;
        java.util.Locale locale31 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet32 = locale31.getExtensionKeys();
        java.util.Locale locale33 = java.util.Locale.KOREA;
        java.util.Locale locale34 = java.util.Locale.KOREA;
        java.lang.String str35 = locale33.getDisplayScript(locale34);
        java.lang.String str36 = locale31.getDisplayScript(locale34);
        java.util.Locale locale37 = java.util.Locale.UK;
        java.lang.String str38 = locale31.getDisplayScript(locale37);
        java.lang.String str39 = locale30.getDisplayLanguage(locale37);
        java.util.Locale.setDefault(locale30);
        int int41 = property28.getMaximumTextLength(locale30);
        java.lang.String str42 = locale30.getScript();
        java.lang.String str43 = locale30.getDisplayVariant();
        java.util.Set<java.lang.String> strSet44 = locale30.getUnicodeLocaleKeys();
        java.lang.String str45 = locale30.getLanguage();
        java.util.TimeZone timeZone47 = java.util.TimeZone.getTimeZone("Italian");
        org.joda.time.LocalDate localDate48 = org.joda.time.LocalDate.now();
        int int49 = localDate48.getDayOfMonth();
        org.joda.time.LocalDate localDate51 = localDate48.plusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(dateTimeZone52);
        boolean boolean55 = mutableDateTime53.isAfter((long) 21);
        boolean boolean57 = mutableDateTime53.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(dateTimeZone58);
        org.joda.time.DateTimeZone dateTimeZone60 = mutableDateTime59.getZone();
        mutableDateTime53.setZone(dateTimeZone60);
        org.joda.time.DateTime dateTime62 = localDate48.toDateTimeAtStartOfDay(dateTimeZone60);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(dateTimeZone60);
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate(dateTimeZone60);
        long long66 = dateTimeZone60.nextTransition(0L);
        org.joda.time.LocalDate localDate67 = org.joda.time.LocalDate.now();
        int int68 = localDate67.getDayOfMonth();
        org.joda.time.LocalDate localDate70 = localDate67.plusYears((int) (byte) 100);
        org.joda.time.LocalDate.Property property71 = localDate70.centuryOfEra();
        int int72 = property71.getMaximumValueOverall();
        org.joda.time.LocalDate localDate73 = property71.roundFloorCopy();
        boolean boolean74 = dateTimeZone60.equals((java.lang.Object) property71);
        java.util.Locale locale75 = java.util.Locale.KOREAN;
        java.lang.String str76 = property71.getAsShortText(locale75);
        java.lang.String str77 = locale75.toLanguageTag();
        java.util.Calendar calendar78 = java.util.Calendar.getInstance(timeZone47, locale75);
        java.lang.String str79 = locale30.getDisplayName(locale75);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter80 = org.joda.time.format.DateTimeFormat.shortDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter81 = dateTimeFormatter80.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter82 = dateTimeFormatter81.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone83 = dateTimeFormatter82.getZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter84 = dateTimeFormatter82.getPrinter();
        java.util.Locale locale87 = new java.util.Locale("2022-02-21T15:01:18.351", "2022");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter88 = dateTimeFormatter82.withLocale(locale87);
        java.lang.String str89 = locale30.getDisplayScript(locale87);
        java.lang.String str90 = locale30.getDisplayCountry();
        java.lang.String str91 = locale18.getDisplayVariant(locale30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar20 and calendar78", (calendar20.compareTo(calendar78) == 0) == calendar20.equals(calendar78));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime4.withMillis((long) 20);
        org.joda.time.DateTime dateTime7 = dateTime4.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekyear(54126);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekyear(13);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.Instant instant14 = instant12.minus((long) 13);
        long long15 = instant12.getMillis();
        org.joda.time.Instant instant17 = instant12.plus(0L);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant12.minus(readableDuration18);
        boolean boolean20 = dateTime9.isBefore((org.joda.time.ReadableInstant) instant12);
        org.joda.time.MutableDateTime mutableDateTime21 = instant12.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime22 = instant12.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and mutableDateTime21", (instant12.compareTo(mutableDateTime21) == 0) == instant12.equals(mutableDateTime21));
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Instant instant5 = instant3.plus(19L);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Instant instant8 = instant3.withDurationAdded(readableDuration6, 46);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant10 = instant8.plus(readableDuration9);
        org.joda.time.Instant instant11 = instant10.toInstant();
        org.joda.time.DateTime dateTime12 = instant10.toDateTime();
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Interval interval15 = localDate13.toInterval(dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate13.plusMonths(0);
        org.joda.time.LocalDate.Property property18 = localDate17.year();
        int int19 = localDate17.size();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        long long27 = dateTimeZone22.getMillisKeepLocal(dateTimeZone25, (long) 10);
        org.joda.time.DateTime dateTime28 = localDate17.toDateTimeAtMidnight(dateTimeZone25);
        java.util.Locale locale29 = java.util.Locale.KOREA;
        java.lang.String str30 = locale29.toLanguageTag();
        boolean boolean31 = localDate17.equals((java.lang.Object) str30);
        org.joda.time.LocalDate localDate33 = localDate17.minusWeeks(0);
        org.joda.time.LocalDate localDate35 = localDate17.withYearOfEra(5);
        int int36 = localDate17.getYearOfEra();
        org.joda.time.LocalDate.Property property37 = localDate17.centuryOfEra();
        org.joda.time.LocalDate.Property property38 = localDate17.year();
        boolean boolean39 = dateTime12.equals((java.lang.Object) property38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime21", (instant0.compareTo(mutableDateTime21) == 0) == instant0.equals(mutableDateTime21));
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.era();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        int int5 = localDate4.getDayOfMonth();
        org.joda.time.LocalDate localDate7 = localDate4.plusYears((int) (byte) 100);
        org.joda.time.Interval interval8 = localDate7.toInterval();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        long long16 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        java.lang.String str17 = dateTimeZone11.toString();
        org.joda.time.DateTime dateTime18 = localDate7.toDateTimeAtMidnight(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime2.toMutableDateTime(dateTimeZone11);
        java.lang.String str20 = mutableDateTime19.toString();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.yearOfCentury();
        org.joda.time.DateTime dateTime22 = localDate0.toDateTime((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.Instant instant23 = mutableDateTime19.toInstant();
        mutableDateTime19.addHours(21177087);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant23", (mutableDateTime2.compareTo(instant23) == 0) == mutableDateTime2.equals(instant23));
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        org.joda.time.Instant instant4 = mutableDateTime1.toInstant();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant6 = instant4.plus(readableDuration5);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        long long16 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(10L, dateTimeZone11);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone11);
        long long22 = dateTimeZone11.convertLocalToUTC((long) 19, false, (long) 32772);
        java.util.Locale locale24 = java.util.Locale.KOREA;
        java.lang.String str25 = locale24.toLanguageTag();
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.lang.String str27 = locale24.getDisplayCountry(locale26);
        java.lang.String str28 = dateTimeZone11.getShortName((long) 54121, locale24);
        long long31 = dateTimeZone11.adjustOffset((long) 54148676, false);
        org.joda.time.DateTime dateTime32 = instant6.toDateTime(dateTimeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant6", (mutableDateTime1.compareTo(instant6) == 0) == mutableDateTime1.equals(instant6));
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus((long) 13);
        long long3 = instant0.getMillis();
        org.joda.time.Instant instant5 = instant0.plus(0L);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Instant instant7 = instant0.minus(readableDuration6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant9 = instant7.plus(readableDuration8);
        org.joda.time.MutableDateTime mutableDateTime10 = instant9.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        mutableDateTime13.setMinuteOfDay(100);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.Interval interval18 = localDate16.toInterval(dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate16.plusMonths(0);
        org.joda.time.LocalDate.Property property21 = localDate20.year();
        int int22 = localDate20.size();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        long long30 = dateTimeZone25.getMillisKeepLocal(dateTimeZone28, (long) 10);
        org.joda.time.DateTime dateTime31 = localDate20.toDateTimeAtMidnight(dateTimeZone28);
        int int32 = mutableDateTime13.compareTo((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.LocalDate localDate33 = dateTime31.toLocalDate();
        org.joda.time.DateTime dateTime34 = dateTime31.toDateTime();
        org.joda.time.DateTime.Property property35 = dateTime31.millisOfSecond();
        boolean boolean36 = property35.isLeap();
        org.joda.time.DateTime dateTime37 = property35.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property35.getFieldType();
        org.joda.time.DateTime dateTime39 = property35.getDateTime();
        org.joda.time.DateTime dateTime41 = dateTime39.minusMonths(48);
        org.joda.time.DateTime dateTime43 = dateTime41.minusWeeks(22);
        org.joda.time.DateTime.Property property44 = dateTime43.hourOfDay();
        boolean boolean45 = mutableDateTime10.equals((java.lang.Object) dateTime43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime24", (instant0.compareTo(mutableDateTime24) == 0) == instant0.equals(mutableDateTime24));
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        long long7 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 10);
        java.lang.String str8 = dateTimeZone5.toString();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone5);
        java.util.TimeZone timeZone10 = dateTimeZone5.toTimeZone();
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone10);
        long long12 = calendar11.getTimeInMillis();
        calendar11.setMinimalDaysInFirstWeek(54303307);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.years();
        java.lang.String str18 = durationFieldType17.toString();
        boolean boolean19 = localTime16.isSupported(durationFieldType17);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime22 = localTime16.withFieldAdded(durationFieldType20, 32772);
        java.lang.String str23 = durationFieldType20.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology27 = localTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType24.getField(chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology27.hourOfDay();
        boolean boolean31 = durationFieldType20.isSupported(chronology27);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology35 = instant34.getChronology();
        org.joda.time.LocalTime localTime36 = org.joda.time.LocalTime.fromMillisOfDay((long) 20, chronology35);
        org.joda.time.DateTimeField dateTimeField37 = chronology35.clockhourOfHalfday();
        boolean boolean38 = durationFieldType20.isSupported(chronology35);
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(chronology35);
        org.joda.time.DateTime.Property property40 = dateTime39.hourOfDay();
        java.util.GregorianCalendar gregorianCalendar41 = dateTime39.toGregorianCalendar();
        int int42 = calendar11.compareTo((java.util.Calendar) gregorianCalendar41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime39", (mutableDateTime1.compareTo(dateTime39) == 0) == mutableDateTime1.equals(dateTime39));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType1.getField(chronology4);
        org.joda.time.DateTimeField dateTimeField6 = chronology4.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology4.millisOfSecond();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 120, chronology4);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        long long14 = dateTimeZone12.previousTransition((-431366460000L));
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        long long23 = dateTimeZone18.getMillisKeepLocal(dateTimeZone21, (long) 10);
        java.lang.String str24 = dateTimeZone18.toString();
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.lang.String str27 = locale26.toLanguageTag();
        java.util.Locale locale28 = java.util.Locale.KOREA;
        java.lang.String str29 = locale26.getDisplayCountry(locale28);
        java.lang.String str30 = dateTimeZone18.getName((long) 54089980, locale28);
        java.lang.String str31 = locale28.getDisplayLanguage();
        java.lang.String str32 = locale28.getScript();
        java.lang.String str33 = dateTimeZone12.getName((long) 52, locale28);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.DateTime dateTime35 = dateTime9.toDateTime(dateTimeZone12);
        org.joda.time.DateTime dateTime37 = dateTime35.plusSeconds(54121716);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        long long42 = dateTimeZone39.convertLocalToUTC((long) 53325046, false);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime37.toMutableDateTime(dateTimeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime35", (dateTime9.compareTo(dateTime35) == 0) == dateTime9.equals(dateTime35));
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        java.util.Date date2 = calendar0.getTime();
        int int3 = calendar0.getMinimalDaysInFirstWeek();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = localDate4.toInterval(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate4.plusMonths(0);
        org.joda.time.LocalDate.Property property9 = localDate8.year();
        int int10 = localDate8.size();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        long long18 = dateTimeZone13.getMillisKeepLocal(dateTimeZone16, (long) 10);
        org.joda.time.DateTime dateTime19 = localDate8.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfEra();
        org.joda.time.DateTime dateTime21 = property20.roundHalfFloorCopy();
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.months();
        mutableDateTime22.add(durationFieldType24, 2023);
        int int27 = dateTime21.compareTo((org.joda.time.ReadableInstant) mutableDateTime22);
        boolean boolean28 = calendar0.before((java.lang.Object) mutableDateTime22);
        org.joda.time.Instant instant29 = mutableDateTime22.toInstant();
        org.joda.time.MutableDateTime mutableDateTime30 = instant29.toMutableDateTime();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property32 = dateTime31.monthOfYear();
        org.joda.time.DateTime dateTime33 = property32.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime34 = dateTime33.toDateTime();
        org.joda.time.DateTime dateTime36 = dateTime34.minusMinutes(7);
        org.joda.time.LocalDate localDate37 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate39 = localDate37.withWeekyear(3);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime42.getZone();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone46 = mutableDateTime45.getZone();
        long long48 = dateTimeZone43.getMillisKeepLocal(dateTimeZone46, (long) 10);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(10L, dateTimeZone43);
        long long51 = dateTimeZone43.nextTransition((long) 12);
        org.joda.time.DateTime dateTime52 = localDate37.toDateTimeAtMidnight(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(dateTimeZone53);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime54.era();
        org.joda.time.LocalDate localDate56 = org.joda.time.LocalDate.now();
        int int57 = localDate56.getDayOfMonth();
        org.joda.time.LocalDate localDate59 = localDate56.plusYears((int) (byte) 100);
        org.joda.time.Interval interval60 = localDate59.toInterval();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(dateTimeZone61);
        org.joda.time.DateTimeZone dateTimeZone63 = mutableDateTime62.getZone();
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(dateTimeZone64);
        org.joda.time.DateTimeZone dateTimeZone66 = mutableDateTime65.getZone();
        long long68 = dateTimeZone63.getMillisKeepLocal(dateTimeZone66, (long) 10);
        java.lang.String str69 = dateTimeZone63.toString();
        org.joda.time.DateTime dateTime70 = localDate59.toDateTimeAtMidnight(dateTimeZone63);
        org.joda.time.MutableDateTime mutableDateTime71 = mutableDateTime54.toMutableDateTime(dateTimeZone63);
        mutableDateTime54.addDays(0);
        mutableDateTime54.addMillis(9);
        boolean boolean76 = dateTimeZone43.equals((java.lang.Object) 9);
        org.joda.time.DateTime dateTime77 = dateTime36.toDateTime(dateTimeZone43);
        java.lang.String str78 = dateTimeZone43.getID();
        java.util.TimeZone timeZone79 = dateTimeZone43.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime80 = new org.joda.time.MutableDateTime(dateTimeZone43);
        boolean boolean82 = dateTimeZone43.isStandardOffset((long) 408);
        mutableDateTime30.setZone(dateTimeZone43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime22 and instant29", (mutableDateTime22.compareTo(instant29) == 0) == mutableDateTime22.equals(instant29));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withCenturyOfEra((int) '#');
        int int5 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime7 = dateTime1.withMillisOfSecond(120);
        int int8 = dateTime7.getMillisOfSecond();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.years();
        java.lang.String str13 = durationFieldType12.toString();
        boolean boolean14 = localTime11.isSupported(durationFieldType12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime17 = localTime11.withFieldAdded(durationFieldType15, 32772);
        java.lang.String str18 = durationFieldType15.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType19.getField(chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.secondOfDay();
        org.joda.time.DateTimeField dateTimeField25 = chronology22.hourOfDay();
        boolean boolean26 = durationFieldType15.isSupported(chronology22);
        org.joda.time.DateTimeField dateTimeField27 = chronology22.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(0L, chronology22);
        org.joda.time.Chronology chronology29 = chronology22.withUTC();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        long long33 = chronology22.add(readablePeriod30, (long) 21284218, 54246026);
        org.joda.time.DateTimeField dateTimeField34 = chronology22.year();
        org.joda.time.DateTime dateTime35 = dateTime7.toDateTime(chronology22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, (int) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime6 = instant2.toMutableDateTime();
        org.joda.time.DateTime dateTime7 = mutableDateTime6.toDateTimeISO();
        mutableDateTime6.addWeekyears(21126);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime7", (instant2.compareTo(dateTime7) == 0) == instant2.equals(dateTime7));
    }
}

