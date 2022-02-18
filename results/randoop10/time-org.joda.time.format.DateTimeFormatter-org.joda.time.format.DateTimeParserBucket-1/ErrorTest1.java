import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        long long3 = property2.remainder();
        org.joda.time.MutableDateTime mutableDateTime5 = property2.set((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfCeiling();
        java.util.Locale locale10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = property7.set("1", locale10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        mutableDateTime11.setMillis(readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime11.getZone();
        long long16 = dateTimeZone14.previousTransition(1644573073768L);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone14);
        long long19 = dateTimeZone14.nextTransition((long) 42841140);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now(dateTimeZone21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = localDateTime22.toDateTime(dateTimeZone25);
        org.joda.time.Chronology chronology28 = localDateTime22.getChronology();
        org.joda.time.LocalDateTime.Property property29 = localDateTime22.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime30 = property29.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime31 = property29.roundCeilingCopy();
        int int32 = localDateTime31.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withMillisOfDay(35466617);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime31.plus(readableDuration35);
        org.joda.time.Chronology chronology37 = localDateTime31.getChronology();
        boolean boolean38 = dateTimeZone14.isLocalDateTimeGap(localDateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime27", (mutableDateTime1.compareTo(dateTime27) == 0) == mutableDateTime1.equals(dateTime27));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        mutableDateTime0.addSeconds((-292275054));
        int int3 = mutableDateTime0.getDayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) 0);
        int int6 = mutableDateTime5.getEra();
        java.lang.String str7 = mutableDateTime5.toString();
        int int8 = mutableDateTime5.getWeekyear();
        int int9 = mutableDateTime0.compareTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 0, chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 0, chronology15);
        boolean boolean17 = localDate13.isEqual((org.joda.time.ReadablePartial) localDate16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate13.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime22 = dateTime19.toDateTimeISO();
        org.joda.time.DateTime.Property property23 = dateTime19.weekyear();
        org.joda.time.DateTime dateTime24 = dateTime19.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime26 = dateTime24.minusWeeks((int) (short) 100);
        org.joda.time.DateTime dateTime28 = dateTime24.withWeekOfWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime30 = dateTime28.minusYears(52);
        int int31 = dateTime28.getCenturyOfEra();
        org.joda.time.DateTime.Property property32 = dateTime28.yearOfCentury();
        org.joda.time.Interval interval33 = property32.toInterval();
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.dayOfYear();
        boolean boolean37 = mutableDateTime35.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime35.setZone(dateTimeZone39);
        long long42 = dateTimeZone39.nextTransition((long) '4');
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(dateTimeZone39);
        int int44 = property32.compareTo((org.joda.time.ReadableInstant) mutableDateTime43);
        java.lang.Object obj45 = mutableDateTime43.clone();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours(32);
        mutableDateTime43.setZone(dateTimeZone47);
        java.util.TimeZone timeZone49 = dateTimeZone47.toTimeZone();
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(1L, dateTimeZone47);
        mutableDateTime0.setZone(dateTimeZone47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and mutableDateTime35", (mutableDateTime5.compareTo(mutableDateTime35) == 0) == mutableDateTime5.equals(mutableDateTime35));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        mutableDateTime1.setTime((long) (short) 10);
        int int12 = mutableDateTime1.getEra();
        org.joda.time.DateTime dateTime13 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfYear();
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.era();
        java.lang.String str18 = chronology16.toString();
        org.joda.time.DateTime dateTime19 = dateTime13.withChronology(chronology16);
        org.joda.time.DateTime dateTime21 = dateTime13.minusWeeks(35516787);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime19", (mutableDateTime1.compareTo(dateTime19) == 0) == mutableDateTime1.equals(dateTime19));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withChronology(chronology13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime14.withWeekyear(0);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (short) 0, chronology20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (short) 0, chronology23);
        boolean boolean25 = localDate21.isEqual((org.joda.time.ReadablePartial) localDate24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localDate21.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime31 = dateTime27.plus(readableDuration30);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.withChronology(chronology32);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = dateTime31.withChronology(chronology34);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime37.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property38.getFieldType();
        org.joda.time.DateTime.Property property40 = dateTime35.property(dateTimeFieldType39);
        org.joda.time.DateTimeField dateTimeField41 = property40.getField();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) (short) 0, chronology43);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) (short) 0, chronology46);
        boolean boolean48 = localDate44.isEqual((org.joda.time.ReadablePartial) localDate47);
        int int49 = localDate47.getDayOfWeek();
        org.joda.time.LocalDate.Property property50 = localDate47.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval53 = localDate47.toInterval(dateTimeZone52);
        int[] intArray55 = new int[] { 'a' };
        int int56 = dateTimeField41.getMaximumValue((org.joda.time.ReadablePartial) localDate47, intArray55);
        org.joda.time.Chronology chronology59 = null;
        java.util.Locale locale60 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket62 = new org.joda.time.format.DateTimeParserBucket(0L, chronology59, locale60, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale65 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket62.saveField(dateTimeFieldType63, "1970-01-01T00:00:00.000Z", locale65);
        java.util.Set<java.lang.String> strSet67 = locale65.getUnicodeLocaleAttributes();
        java.lang.String str68 = localDate47.toString("1", locale65);
        org.joda.time.LocalDate localDate70 = localDate47.withMonthOfYear(5);
        org.joda.time.Chronology chronology71 = localDate70.getChronology();
        org.joda.time.DateTimeField dateTimeField72 = chronology71.yearOfEra();
        org.joda.time.DateTime dateTime73 = dateTime18.withChronology(chronology71);
        int int74 = dateTime18.getHourOfDay();
        org.joda.time.DateTime dateTime77 = dateTime18.withDurationAdded((long) 49, 14701);
        org.joda.time.MutableDateTime mutableDateTime78 = new org.joda.time.MutableDateTime();
        mutableDateTime78.addWeeks(2);
        org.joda.time.DateTimeField dateTimeField81 = mutableDateTime78.getRoundingField();
        org.joda.time.MutableDateTime.Property property82 = mutableDateTime78.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration83 = null;
        mutableDateTime78.add(readableDuration83);
        mutableDateTime78.setMillis(117L);
        boolean boolean87 = dateTime18.isAfter((org.joda.time.ReadableInstant) mutableDateTime78);
        boolean boolean88 = mutableDateTime78.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime73", (dateTime18.compareTo(dateTime73) == 0) == dateTime18.equals(dateTime73));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.clockhourOfHalfday();
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology6, locale7, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket9.saveField(dateTimeFieldType10, "1970-01-01T00:00:00.000Z", locale12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology3, locale12);
        java.lang.String str15 = chronology3.toString();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(chronology3);
        org.joda.time.DateTimeField dateTimeField17 = chronology3.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        org.joda.time.Chronology chronology21 = chronology3.withZone(dateTimeZone20);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(31L, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and dateTime23", (mutableDateTime16.compareTo(dateTime23) == 0) == mutableDateTime16.equals(dateTime23));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property9.getFieldType();
        org.joda.time.LocalDate.Property property11 = localDate5.property(dateTimeFieldType10);
        org.joda.time.LocalDate localDate13 = property11.addToCopy((int) (byte) 10);
        org.joda.time.LocalDate.Property property14 = localDate13.dayOfWeek();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = localDate13.getFieldTypes();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) (short) 0, chronology17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (short) 0, chronology20);
        boolean boolean22 = localDate18.isEqual((org.joda.time.ReadablePartial) localDate21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate18.toDateTimeAtStartOfDay(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime28 = dateTime24.plus(readableDuration27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.withChronology(chronology29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = dateTime28.withChronology(chronology31);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime34.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property35.getFieldType();
        org.joda.time.DateTime.Property property37 = dateTime32.property(dateTimeFieldType36);
        org.joda.time.DateTime.Property property38 = dateTime32.minuteOfDay();
        long long39 = property38.remainder();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = property38.getFieldType();
        org.joda.time.DurationFieldType durationFieldType41 = dateTimeFieldType40.getRangeDurationType();
        boolean boolean42 = localDate13.isSupported(durationFieldType41);
        org.joda.time.LocalDate localDate44 = localDate13.plusYears(2039);
        int int45 = localDate13.getEra();
        org.joda.time.DateTime dateTime46 = localDate13.toDateTimeAtMidnight();
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime49.dayOfYear();
        boolean boolean51 = mutableDateTime49.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime49.setZone(dateTimeZone53);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(6048000000L, dateTimeZone53);
        org.joda.time.DateTime dateTime56 = org.joda.time.DateTime.now(dateTimeZone53);
        java.lang.String str58 = dateTimeZone53.getShortName(1965L);
        org.joda.time.LocalDate localDate59 = org.joda.time.LocalDate.now(dateTimeZone53);
        org.joda.time.DateTime dateTime60 = dateTime46.toDateTime(dateTimeZone53);
        org.joda.time.DateTime.Property property61 = dateTime60.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and mutableDateTime49", (mutableDateTime8.compareTo(mutableDateTime49) == 0) == mutableDateTime8.equals(mutableDateTime49));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("2022");
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 26);
        org.joda.time.DateTime dateTime7 = dateTime1.toDateTime(dateTimeZone6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) (short) 0, chronology9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 0, chronology12);
        boolean boolean14 = localDate10.isEqual((org.joda.time.ReadablePartial) localDate13);
        int int15 = localDate13.getDayOfWeek();
        org.joda.time.LocalDate.Property property16 = localDate13.weekOfWeekyear();
        org.joda.time.LocalDate localDate17 = property16.roundFloorCopy();
        int int18 = localDate17.size();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate20 = localDate17.minus(readablePeriod19);
        org.joda.time.DateTime dateTime21 = localDate17.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate23 = localDate17.minusYears(1);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.Interval interval25 = localDate23.toInterval(dateTimeZone24);
        org.joda.time.LocalDate localDate27 = localDate23.plusWeeks((int) (short) 1);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate30 = localDate28.plusYears(29);
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        org.joda.time.DateMidnight dateMidnight33 = localDate30.toDateMidnight(dateTimeZone32);
        long long37 = dateTimeZone32.convertLocalToUTC(3602022L, false, 25260000L);
        int int39 = dateTimeZone32.getOffsetFromLocal(1644746014531L);
        org.joda.time.Interval interval40 = localDate27.toInterval(dateTimeZone32);
        boolean boolean41 = dateTimeZone6.equals((java.lang.Object) localDate27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime7", (dateTime1.compareTo(dateTime7) == 0) == dateTime1.equals(dateTime7));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withChronology(chronology13);
        org.joda.time.DateTime.Property property15 = dateTime12.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.minus(readableDuration16);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) 0);
        int int20 = mutableDateTime19.getEra();
        org.joda.time.Chronology chronology21 = null;
        mutableDateTime19.setChronology(chronology21);
        boolean boolean23 = dateTime12.isBefore((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.DateTime dateTime25 = dateTime12.minusYears(3600000);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) (short) 0, chronology27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 0, chronology30);
        boolean boolean32 = localDate28.isEqual((org.joda.time.ReadablePartial) localDate31);
        int int33 = localDate31.getDayOfWeek();
        org.joda.time.LocalDate.Property property34 = localDate31.weekOfWeekyear();
        org.joda.time.LocalDate localDate35 = property34.roundFloorCopy();
        org.joda.time.LocalDate localDate36 = property34.roundCeilingCopy();
        org.joda.time.LocalDate localDate37 = property34.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.Interval interval40 = localDate37.toInterval(dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime25.toMutableDateTime(dateTimeZone39);
        long long44 = dateTimeZone39.convertLocalToUTC(1644573437226L, true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and mutableDateTime41", (dateTime25.compareTo(mutableDateTime41) == 0) == dateTime25.equals(mutableDateTime41));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("2022");
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 26);
        org.joda.time.DateTime dateTime7 = dateTime1.toDateTime(dateTimeZone6);
        long long9 = dateTimeZone6.previousTransition(32928877987200000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime7", (dateTime1.compareTo(dateTime7) == 0) == dateTime1.equals(dateTime7));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        org.joda.time.Instant instant10 = mutableDateTime1.toInstant();
        mutableDateTime1.addYears((int) (short) 10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundFloor();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology17 = localTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.clockhourOfHalfday();
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket(0L, chronology20, locale21, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale26 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket23.saveField(dateTimeFieldType24, "1970-01-01T00:00:00.000Z", locale26);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology17, locale26);
        org.joda.time.DateTimeField dateTimeField29 = chronology17.millisOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology17.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime14.toMutableDateTime(chronology17);
        org.joda.time.DateTimeField dateTimeField32 = chronology17.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime31", (mutableDateTime1.compareTo(mutableDateTime31) == 0) == mutableDateTime1.equals(mutableDateTime31));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now(dateTimeZone5);
        org.joda.time.DateTime dateTime7 = localDateTime2.toDateTime(dateTimeZone5);
        org.joda.time.Chronology chronology8 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.hourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(chronology8);
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = null;
        org.joda.time.format.DateTimeParser dateTimeParser15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter16.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter17.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter17.withZoneUTC();
        java.lang.Integer int20 = dateTimeFormatter19.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeFormatter19.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now(dateTimeZone24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone28);
        org.joda.time.DateTime dateTime30 = localDateTime25.toDateTime(dateTimeZone28);
        org.joda.time.Chronology chronology31 = localDateTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.hourOfHalfday();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) '4', chronology31);
        org.joda.time.DateTimeField dateTimeField34 = chronology31.weekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter19.withChronology(chronology31);
        boolean boolean36 = dateTimeFormatter19.isParser();
        org.joda.time.DateTimeZone dateTimeZone37 = dateTimeFormatter19.getZone();
        mutableDateTime13.setZoneRetainFields(dateTimeZone37);
        int int40 = dateTimeZone37.getOffset((-176205600000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and mutableDateTime13", (dateTime7.compareTo(mutableDateTime13) == 0) == dateTime7.equals(mutableDateTime13));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        org.joda.time.Instant instant10 = mutableDateTime1.toInstant();
        boolean boolean12 = mutableDateTime1.isAfter((long) (byte) 1);
        mutableDateTime1.addWeekyears(69);
        int int15 = mutableDateTime1.getYear();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime1.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime19 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfEra();
        org.joda.time.Instant instant21 = dateTime19.toInstant();
        org.joda.time.DateTime.Property property22 = dateTime19.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant21", (mutableDateTime1.compareTo(instant21) == 0) == mutableDateTime1.equals(instant21));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("1970-01-05T00:00:00.000Z");
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.dayOfYear();
        boolean boolean5 = mutableDateTime3.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime3.setZone(dateTimeZone7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        mutableDateTime3.add(readablePeriod9, 4);
        mutableDateTime3.setTime((long) (short) 10);
        int int14 = mutableDateTime3.getEra();
        org.joda.time.DateTime dateTime15 = mutableDateTime3.toDateTimeISO();
        boolean boolean16 = mutableDateTime1.isEqual((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale23 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket(0L, chronology22, locale23, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale28 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket25.saveField(dateTimeFieldType26, "1970-01-01T00:00:00.000Z", locale28);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology19, locale28);
        org.joda.time.DateTimeField dateTimeField31 = chronology19.millisOfDay();
        org.joda.time.DateTimeField dateTimeField32 = chronology19.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField33 = chronology19.weekyear();
        org.joda.time.DateTime dateTime34 = dateTime15.toDateTime(chronology19);
        org.joda.time.DateTime dateTime36 = dateTime34.withYear((int) (byte) 1);
        org.joda.time.DateTime dateTime38 = dateTime34.plusYears((int) ' ');
        org.joda.time.LocalTime localTime41 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology42 = localTime41.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.clockhourOfHalfday();
        org.joda.time.Chronology chronology45 = null;
        java.util.Locale locale46 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket(0L, chronology45, locale46, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale51 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket48.saveField(dateTimeFieldType49, "1970-01-01T00:00:00.000Z", locale51);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology42, locale51);
        org.joda.time.DateTimeField dateTimeField54 = chronology42.millisOfDay();
        org.joda.time.DateTimeField dateTimeField55 = chronology42.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField56 = chronology42.weekyear();
        org.joda.time.LocalTime localTime57 = new org.joda.time.LocalTime((long) ' ', chronology42);
        long long61 = chronology42.add(0L, 32L, 22);
        org.joda.time.DateTimeField dateTimeField62 = chronology42.dayOfWeek();
        int int63 = dateTime34.get(dateTimeField62);
        int int66 = dateTimeField62.getDifference(381442028L, (long) 35650);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and dateTime34", (mutableDateTime3.compareTo(dateTime34) == 0) == mutableDateTime3.equals(dateTime34));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now(dateTimeZone5);
        org.joda.time.DateTime dateTime7 = localDateTime2.toDateTime(dateTimeZone5);
        org.joda.time.Chronology chronology8 = localDateTime2.getChronology();
        org.joda.time.LocalDateTime.Property property9 = localDateTime2.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime11 = property9.addToCopy((long) 4);
        org.joda.time.LocalDateTime localDateTime13 = property9.setCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusWeeks(11);
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 26);
        org.joda.time.DateTime dateTime21 = dateTime16.toDateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime16.plusWeeks(51);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.dayOfYear();
        boolean boolean29 = mutableDateTime27.isAfterNow();
        boolean boolean30 = mutableDateTime25.isBefore((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.ReadableDuration readableDuration31 = null;
        mutableDateTime25.add(readableDuration31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime25.era();
        java.util.GregorianCalendar gregorianCalendar34 = mutableDateTime25.toGregorianCalendar();
        int int35 = mutableDateTime25.getYearOfCentury();
        boolean boolean36 = dateTime23.isAfter((org.joda.time.ReadableInstant) mutableDateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime21", (dateTime16.compareTo(dateTime21) == 0) == dateTime16.equals(dateTime21));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = property2.getFieldType();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.roundFloor();
        mutableDateTime4.addDays(6);
        mutableDateTime4.setMillis(381044902L);
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.parse("1970-01-05T00:00:00.000Z");
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.dayOfYear();
        boolean boolean14 = mutableDateTime12.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime12.setZone(dateTimeZone16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime12.add(readablePeriod18, 4);
        mutableDateTime12.setTime((long) (short) 10);
        int int23 = mutableDateTime12.getEra();
        org.joda.time.DateTime dateTime24 = mutableDateTime12.toDateTimeISO();
        boolean boolean25 = mutableDateTime10.isEqual((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology28 = localTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.clockhourOfHalfday();
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket(0L, chronology31, locale32, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale37 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket34.saveField(dateTimeFieldType35, "1970-01-01T00:00:00.000Z", locale37);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology28, locale37);
        org.joda.time.DateTimeField dateTimeField40 = chronology28.millisOfDay();
        org.joda.time.DateTimeField dateTimeField41 = chronology28.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField42 = chronology28.weekyear();
        org.joda.time.DateTime dateTime43 = dateTime24.toDateTime(chronology28);
        org.joda.time.DateTimeZone dateTimeZone44 = dateTime43.getZone();
        org.joda.time.DateTime dateTime45 = mutableDateTime4.toDateTime(dateTimeZone44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and dateTime43", (mutableDateTime12.compareTo(dateTime43) == 0) == mutableDateTime12.equals(dateTime43));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime11 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime13 = dateTime11.plusSeconds(1);
        org.joda.time.DateTime.Property property14 = dateTime13.monthOfYear();
        org.joda.time.DateTime dateTime15 = property14.getDateTime();
        org.joda.time.DateTime dateTime16 = property14.roundHalfCeilingCopy();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.millisOfSecond();
        boolean boolean21 = property20.isLeap();
        org.joda.time.MutableDateTime mutableDateTime23 = property20.addWrapField(35449917);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.dayOfYear();
        boolean boolean29 = mutableDateTime27.isAfterNow();
        boolean boolean30 = mutableDateTime25.isBefore((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) (short) 0, chronology32);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) (short) 0, chronology35);
        boolean boolean37 = localDate33.isEqual((org.joda.time.ReadablePartial) localDate36);
        int int38 = localDate36.getDayOfWeek();
        org.joda.time.LocalDate.Property property39 = localDate36.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval42 = localDate36.toInterval(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime27.toMutableDateTime(dateTimeZone41);
        mutableDateTime27.add((long) 59);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        mutableDateTime27.add(readablePeriod46, 1970);
        mutableDateTime23.setMillis((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.DateTimeZone dateTimeZone50 = mutableDateTime27.getZone();
        org.joda.time.MutableDateTime mutableDateTime51 = org.joda.time.MutableDateTime.now(dateTimeZone50);
        org.joda.time.DateTime dateTime52 = dateTime16.toDateTime(dateTimeZone50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime25 and mutableDateTime43", (mutableDateTime25.compareTo(mutableDateTime43) == 0) == mutableDateTime25.equals(mutableDateTime43));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.getMutableDateTime();
        org.joda.time.Chronology chronology4 = null;
        mutableDateTime3.setChronology(chronology4);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime3.year();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.monthOfYear();
        mutableDateTime3.setYear((int) (short) 100);
        long long10 = mutableDateTime3.getMillis();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 0, chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 0, chronology15);
        boolean boolean17 = localDate13.isEqual((org.joda.time.ReadablePartial) localDate16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate13.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime19.plus(readableDuration22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = dateTime23.withChronology(chronology24);
        org.joda.time.DateTime.Property property26 = dateTime23.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime28 = dateTime23.minus(readableDuration27);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) 0);
        int int31 = mutableDateTime30.getEra();
        org.joda.time.Chronology chronology32 = null;
        mutableDateTime30.setChronology(chronology32);
        boolean boolean34 = dateTime23.isBefore((org.joda.time.ReadableInstant) mutableDateTime30);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime36.secondOfMinute();
        boolean boolean38 = dateTime23.isAfter((org.joda.time.ReadableInstant) mutableDateTime36);
        org.joda.time.DateTime.Property property39 = dateTime23.era();
        mutableDateTime3.setDate((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime42.getZone();
        org.joda.time.ReadableDuration readableDuration44 = null;
        mutableDateTime42.add(readableDuration44, 3);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime42.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime42.toMutableDateTime();
        org.joda.time.LocalTime localTime49 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology50 = localTime49.getChronology();
        org.joda.time.DurationField durationField51 = chronology50.millis();
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime48, chronology50);
        mutableDateTime3.setDate((org.joda.time.ReadableInstant) mutableDateTime48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime52", (mutableDateTime3.compareTo(mutableDateTime52) == 0) == mutableDateTime3.equals(mutableDateTime52));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withChronology(chronology13);
        org.joda.time.DateTime.Property property15 = dateTime12.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.minus(readableDuration16);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.dayOfYear();
        boolean boolean21 = mutableDateTime19.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime19.setZone(dateTimeZone23);
        long long26 = dateTimeZone23.nextTransition((long) '4');
        java.lang.String str28 = dateTimeZone23.getShortName(35L);
        org.joda.time.DateTime dateTime29 = dateTime12.withZone(dateTimeZone23);
        long long31 = dateTimeZone23.previousTransition((long) 2051);
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime29", (dateTime8.compareTo(dateTime29) == 0) == dateTime8.equals(dateTime29));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.getMutableDateTime();
        java.util.GregorianCalendar gregorianCalendar4 = mutableDateTime3.toGregorianCalendar();
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime3.toGregorianCalendar();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromCalendarFields((java.util.Calendar) gregorianCalendar5);
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar8 = mutableDateTime7.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withMillis((long) 366);
        org.joda.time.DateTime dateTime14 = dateTime13.toDateTimeISO();
        boolean boolean15 = mutableDateTime7.isAfter((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime19 = localTime16.withPeriodAdded(readablePeriod17, (int) (short) 0);
        org.joda.time.LocalTime.Property property20 = localTime16.secondOfMinute();
        org.joda.time.LocalTime localTime21 = property20.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime22 = property20.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime24 = property20.addCopy((int) 'u');
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology28 = localTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.clockhourOfHalfday();
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket(0L, chronology31, locale32, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale37 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket34.saveField(dateTimeFieldType35, "1970-01-01T00:00:00.000Z", locale37);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology28, locale37);
        java.lang.String str40 = chronology28.toString();
        org.joda.time.DurationField durationField41 = chronology28.eras();
        org.joda.time.LocalTime localTime42 = org.joda.time.LocalTime.now(chronology28);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(3940L, chronology28);
        boolean boolean45 = dateTime43.isBefore((long) (-1));
        org.joda.time.DateTime.Property property46 = dateTime43.weekyear();
        org.joda.time.DateTime.Property property47 = dateTime43.secondOfDay();
        org.joda.time.DateTime dateTime48 = property47.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime49 = dateTime48.withEarlierOffsetAtOverlap();
        org.joda.time.LocalTime localTime50 = org.joda.time.LocalTime.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime.Property property52 = localTime50.property(dateTimeFieldType51);
        org.joda.time.DateTime.Property property53 = dateTime49.property(dateTimeFieldType51);
        boolean boolean54 = localTime24.isSupported(dateTimeFieldType51);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime7.property(dateTimeFieldType51);
        int int56 = localTime6.get(dateTimeFieldType51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and dateTime11", (mutableDateTime7.compareTo(dateTime11) == 0) == mutableDateTime7.equals(dateTime11));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        org.joda.time.Instant instant10 = mutableDateTime1.toInstant();
        boolean boolean12 = mutableDateTime1.isAfter((long) (byte) 1);
        mutableDateTime1.addWeekyears(69);
        int int15 = mutableDateTime1.getWeekOfWeekyear();
        int int16 = mutableDateTime1.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime19 = property17.add(784);
        java.lang.Object obj20 = mutableDateTime19.clone();
        org.joda.time.ReadableDuration readableDuration21 = null;
        mutableDateTime19.add(readableDuration21, 759);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        mutableDateTime25.addMonths((int) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.dayOfYear();
        boolean boolean34 = mutableDateTime32.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime32.setZone(dateTimeZone36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(6048000000L, dateTimeZone36);
        mutableDateTime25.setZone(dateTimeZone36);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((java.lang.Object) readableDuration21, dateTimeZone36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime32", (instant10.compareTo(mutableDateTime32) == 0) == instant10.equals(mutableDateTime32));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property9.getFieldType();
        org.joda.time.LocalDate.Property property11 = localDate5.property(dateTimeFieldType10);
        org.joda.time.LocalDate.Property property12 = localDate5.dayOfYear();
        org.joda.time.LocalDate localDate14 = property12.setCopy("70");
        org.joda.time.LocalDate.Property property15 = localDate14.monthOfYear();
        org.joda.time.LocalDate localDate16 = property15.roundHalfEvenCopy();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.dayOfYear();
        boolean boolean22 = mutableDateTime20.isAfterNow();
        boolean boolean23 = mutableDateTime18.isBefore((org.joda.time.ReadableInstant) mutableDateTime20);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) (short) 0, chronology25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) (short) 0, chronology28);
        boolean boolean30 = localDate26.isEqual((org.joda.time.ReadablePartial) localDate29);
        int int31 = localDate29.getDayOfWeek();
        org.joda.time.LocalDate.Property property32 = localDate29.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval35 = localDate29.toInterval(dateTimeZone34);
        org.joda.time.MutableDateTime mutableDateTime36 = mutableDateTime20.toMutableDateTime(dateTimeZone34);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime36.millisOfSecond();
        int int38 = property15.getDifference((org.joda.time.ReadableInstant) mutableDateTime36);
        org.joda.time.LocalDate localDate39 = property15.withMaximumValue();
        org.joda.time.LocalDate localDate40 = property15.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and mutableDateTime36", (mutableDateTime8.compareTo(mutableDateTime36) == 0) == mutableDateTime8.equals(mutableDateTime36));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        int int7 = localDate5.getDayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate9 = localDate5.plus(readablePeriod8);
        org.joda.time.LocalDate localDate11 = localDate9.withCenturyOfEra((int) 'a');
        org.joda.time.DateTime dateTime12 = localDate9.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime14 = dateTime12.withMillisOfSecond(100);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime14.toMutableDateTime();
        mutableDateTime15.addWeekyears((int) (byte) 100);
        org.joda.time.Instant instant18 = mutableDateTime15.toInstant();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (short) 0, chronology20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (short) 0, chronology23);
        boolean boolean25 = localDate21.isEqual((org.joda.time.ReadablePartial) localDate24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localDate21.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.YearMonthDay yearMonthDay28 = dateTime27.toYearMonthDay();
        org.joda.time.DateTime.Property property29 = dateTime27.minuteOfDay();
        int int30 = dateTime27.getWeekyear();
        org.joda.time.DateTime dateTime32 = dateTime27.minusSeconds((int) (short) 0);
        boolean boolean33 = mutableDateTime15.isBefore((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime.Property property34 = dateTime27.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and instant18", (mutableDateTime15.compareTo(instant18) == 0) == mutableDateTime15.equals(instant18));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now(dateTimeZone5);
        org.joda.time.DateTime dateTime7 = localDateTime2.toDateTime(dateTimeZone5);
        org.joda.time.Chronology chronology8 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology8);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = chronology8.add(readablePeriod15, (long) 866, 97);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and mutableDateTime14", (dateTime7.compareTo(mutableDateTime14) == 0) == dateTime7.equals(mutableDateTime14));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 0, chronology3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        boolean boolean8 = localDate4.isEqual((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate4.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime13 = dateTime10.toDateTimeISO();
        org.joda.time.DateTime.Property property14 = dateTime13.weekOfWeekyear();
        boolean boolean15 = dateTimeZone1.equals((java.lang.Object) property14);
        org.joda.time.DateTime dateTime16 = property14.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime17 = property14.roundFloorCopy();
        org.joda.time.DateTime dateTime19 = property14.addWrapFieldToCopy(35449917);
        org.joda.time.DateTime dateTime20 = property14.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime22 = dateTime20.withYearOfEra(4);
        org.joda.time.DateTime dateTime24 = dateTime20.withMillisOfDay(48);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) (short) 0, chronology26);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) (short) 0, chronology29);
        boolean boolean31 = localDate27.isEqual((org.joda.time.ReadablePartial) localDate30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localDate27.toDateTimeAtStartOfDay(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime37 = dateTime33.plus(readableDuration36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.withChronology(chronology38);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = dateTime37.withChronology(chronology40);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime43.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property44.getFieldType();
        org.joda.time.DateTime.Property property46 = dateTime41.property(dateTimeFieldType45);
        org.joda.time.DateTimeField dateTimeField47 = property46.getField();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((long) (short) 0, chronology49);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((long) (short) 0, chronology52);
        boolean boolean54 = localDate50.isEqual((org.joda.time.ReadablePartial) localDate53);
        int int55 = localDate53.getDayOfWeek();
        org.joda.time.LocalDate.Property property56 = localDate53.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval59 = localDate53.toInterval(dateTimeZone58);
        int[] intArray61 = new int[] { 'a' };
        int int62 = dateTimeField47.getMaximumValue((org.joda.time.ReadablePartial) localDate53, intArray61);
        org.joda.time.Interval interval63 = localDate53.toInterval();
        java.util.Date date64 = localDate53.toDate();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.LocalDate localDate67 = new org.joda.time.LocalDate((long) (short) 0, chronology66);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.LocalDate localDate70 = new org.joda.time.LocalDate((long) (short) 0, chronology69);
        boolean boolean71 = localDate67.isEqual((org.joda.time.ReadablePartial) localDate70);
        int int72 = localDate70.getDayOfWeek();
        org.joda.time.LocalDate.Property property73 = localDate70.weekOfWeekyear();
        org.joda.time.LocalDate localDate74 = property73.roundFloorCopy();
        org.joda.time.LocalDate localDate75 = property73.roundCeilingCopy();
        org.joda.time.LocalDate localDate76 = property73.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.Interval interval79 = localDate76.toInterval(dateTimeZone78);
        int int80 = localDate53.compareTo((org.joda.time.ReadablePartial) localDate76);
        org.joda.time.LocalDate localDate82 = localDate53.plusMonths(5);
        org.joda.time.Chronology chronology83 = localDate53.getChronology();
        org.joda.time.DateTimeField dateTimeField84 = chronology83.minuteOfDay();
        org.joda.time.DateTime dateTime85 = dateTime20.toDateTime(chronology83);
        org.joda.time.DateTime dateTime86 = org.joda.time.DateTime.now(chronology83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime85", (dateTime16.compareTo(dateTime85) == 0) == dateTime16.equals(dateTime85));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(381044902L);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.year();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.dayOfYear();
        boolean boolean6 = mutableDateTime4.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        mutableDateTime4.setZoneRetainFields(dateTimeZone7);
        mutableDateTime4.setTime(0, (int) (byte) 0, (int) (short) 1, (int) (short) 1);
        org.joda.time.DateTime dateTime14 = mutableDateTime4.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.getMutableDateTime();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (short) 0, chronology20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (short) 0, chronology23);
        boolean boolean25 = localDate21.isEqual((org.joda.time.ReadablePartial) localDate24);
        int int26 = localDate24.getDayOfWeek();
        org.joda.time.LocalDate.Property property27 = localDate24.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval30 = localDate24.toInterval(dateTimeZone29);
        long long32 = dateTimeZone29.convertUTCToLocal((long) 0);
        mutableDateTime18.setZone(dateTimeZone29);
        mutableDateTime4.setZone(dateTimeZone29);
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone29);
        mutableDateTime1.setZoneRetainFields(dateTimeZone29);
        mutableDateTime1.addWeeks((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalTime localTime43 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology44 = localTime43.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.clockhourOfHalfday();
        org.joda.time.Chronology chronology47 = null;
        java.util.Locale locale48 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket(0L, chronology47, locale48, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale53 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket50.saveField(dateTimeFieldType51, "1970-01-01T00:00:00.000Z", locale53);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket55 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology44, locale53);
        java.lang.String str56 = chronology44.toString();
        org.joda.time.MutableDateTime mutableDateTime57 = org.joda.time.MutableDateTime.now(chronology44);
        org.joda.time.DateTimeField dateTimeField58 = chronology44.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField59 = chronology44.yearOfCentury();
        org.joda.time.LocalTime localTime60 = new org.joda.time.LocalTime((long) 69, chronology44);
        org.joda.time.DateTimeField dateTimeField61 = dateTimeFieldType40.getField(chronology44);
        java.util.Locale locale62 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology44, locale62);
        org.joda.time.DateTimeZone dateTimeZone64 = chronology44.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and dateTime14", (mutableDateTime4.compareTo(dateTime14) == 0) == mutableDateTime4.equals(dateTime14));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        long long3 = property2.remainder();
        org.joda.time.MutableDateTime mutableDateTime5 = property2.set((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfCeiling();
        java.util.Locale locale10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = property7.set("1", locale10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        mutableDateTime11.setMillis(readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime11.getZone();
        long long16 = dateTimeZone14.previousTransition(1644573073768L);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long23 = dateTimeZone19.convertLocalToUTC((long) 2039, true, (long) (byte) 100);
        mutableDateTime17.setZone(dateTimeZone19);
        java.util.TimeZone timeZone25 = dateTimeZone19.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime17", (mutableDateTime1.compareTo(mutableDateTime17) == 0) == mutableDateTime1.equals(mutableDateTime17));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        mutableDateTime1.setTime((long) (short) 10);
        int int12 = mutableDateTime1.getEra();
        org.joda.time.DateTime dateTime13 = mutableDateTime1.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime1.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime16 = property14.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime16.toMutableDateTime();
        mutableDateTime16.setMillis(0L);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime16.dayOfYear();
        int int21 = mutableDateTime16.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) (short) 0, chronology26);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) (short) 0, chronology29);
        boolean boolean31 = localDate27.isEqual((org.joda.time.ReadablePartial) localDate30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localDate27.toDateTimeAtStartOfDay(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime37 = dateTime33.plus(readableDuration36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.withChronology(chronology38);
        org.joda.time.DateTime.Property property40 = dateTime37.secondOfMinute();
        int int41 = dateTimeZone24.getOffset((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime42 = dateTime37.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime43 = dateTime42.toDateTime();
        mutableDateTime16.setMillis((org.joda.time.ReadableInstant) dateTime42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and dateTime33", (mutableDateTime16.compareTo(dateTime33) == 0) == mutableDateTime16.equals(dateTime33));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = localDateTime4.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = localDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 'a', chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.clockhourOfDay();
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        boolean boolean15 = locale14.hasExtensions();
        java.util.Locale locale17 = new java.util.Locale("DateTimeField[weekyear]");
        java.lang.String str18 = locale14.getDisplayCountry(locale17);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(69L, chronology10, locale14, (java.lang.Integer) 35557);
        org.joda.time.DateTimeField dateTimeField21 = chronology10.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(chronology10);
        org.joda.time.DurationField durationField23 = chronology10.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and mutableDateTime22", (dateTime9.compareTo(mutableDateTime22) == 0) == dateTime9.equals(mutableDateTime22));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = null;
        java.lang.String str3 = mutableDateTime1.toString(dateTimeFormatter2);
        mutableDateTime1.addMonths((int) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfYear();
        boolean boolean10 = mutableDateTime8.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime8.setZone(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(6048000000L, dateTimeZone12);
        mutableDateTime1.setZone(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = localDateTime18.toDateTime(dateTimeZone21);
        org.joda.time.Chronology chronology24 = localDateTime18.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.months();
        mutableDateTime1.setChronology(chronology24);
        org.joda.time.DateTimeZone dateTimeZone27 = chronology24.getZone();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone27);
        int int30 = dateTimeZone27.getOffset(3578092752L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and mutableDateTime28", (dateTime23.compareTo(mutableDateTime28) == 0) == dateTime23.equals(mutableDateTime28));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        org.joda.time.DurationField durationField3 = property2.getLeapDurationField();
        java.lang.String str4 = property2.getAsText();
        org.joda.time.MutableDateTime mutableDateTime5 = property2.roundFloor();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = localDateTime9.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology15 = localDateTime9.getChronology();
        org.joda.time.LocalDateTime.Property property16 = localDateTime9.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime18 = property16.addToCopy((long) 4);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusMinutes((int) 'x');
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTime dateTime23 = localDateTime20.toDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(3577992076L, dateTimeZone22);
        boolean boolean27 = dateTimeZone22.isStandardOffset((long) 18130);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone22);
        mutableDateTime5.setZoneRetainFields(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and mutableDateTime28", (dateTime14.compareTo(mutableDateTime28) == 0) == dateTime14.equals(mutableDateTime28));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        mutableDateTime1.setTime((long) (short) 10);
        int int12 = mutableDateTime1.getEra();
        org.joda.time.DateTime dateTime13 = mutableDateTime1.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime1.minuteOfHour();
        org.joda.time.DurationField durationField15 = property14.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime17 = property14.add(36);
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime17.add(readableDuration18);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        long long24 = mutableDateTime21.getMillis();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.getMutableDateTime();
        org.joda.time.Chronology chronology29 = null;
        mutableDateTime28.setChronology(chronology29);
        mutableDateTime28.addDays(0);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        mutableDateTime28.add(readablePeriod33);
        mutableDateTime21.setTime((org.joda.time.ReadableInstant) mutableDateTime28);
        mutableDateTime28.setYear((int) (short) 10);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime28.secondOfDay();
        java.lang.String str39 = mutableDateTime28.toString();
        org.joda.time.LocalTime localTime42 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology43 = localTime42.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.clockhourOfHalfday();
        org.joda.time.Chronology chronology46 = null;
        java.util.Locale locale47 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket(0L, chronology46, locale47, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale52 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket49.saveField(dateTimeFieldType50, "1970-01-01T00:00:00.000Z", locale52);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology43, locale52);
        java.lang.String str55 = chronology43.toString();
        org.joda.time.Chronology chronology56 = chronology43.withUTC();
        org.joda.time.DurationField durationField57 = chronology43.seconds();
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        long long61 = chronology43.add(readablePeriod58, (long) (byte) 1, 0);
        org.joda.time.LocalTime localTime62 = new org.joda.time.LocalTime(1644573054796L, chronology43);
        org.joda.time.DateTimeField dateTimeField63 = chronology43.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField64 = chronology43.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone65 = chronology43.getZone();
        mutableDateTime28.setZone(dateTimeZone65);
        mutableDateTime17.setMillis((org.joda.time.ReadableInstant) mutableDateTime28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and mutableDateTime28", (mutableDateTime17.compareTo(mutableDateTime28) == 0) == mutableDateTime17.equals(mutableDateTime28));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        org.joda.time.Instant instant10 = mutableDateTime1.toInstant();
        boolean boolean12 = mutableDateTime1.isAfter((long) (byte) 1);
        mutableDateTime1.addWeekyears(69);
        mutableDateTime1.setSecondOfDay(3);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime19 = property17.addWrapField(2000);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.yearOfCentury();
        mutableDateTime19.addSeconds(35493088);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) (short) 0, chronology24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) (short) 0, chronology27);
        boolean boolean29 = localDate25.isEqual((org.joda.time.ReadablePartial) localDate28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localDate25.toDateTimeAtStartOfDay(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime35 = dateTime31.plus(readableDuration34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = dateTime35.withChronology(chronology36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = dateTime35.withChronology(chronology38);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime41.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = property42.getFieldType();
        org.joda.time.DateTime.Property property44 = dateTime39.property(dateTimeFieldType43);
        org.joda.time.DateTimeField dateTimeField45 = property44.getField();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((long) (short) 0, chronology47);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) (short) 0, chronology50);
        boolean boolean52 = localDate48.isEqual((org.joda.time.ReadablePartial) localDate51);
        int int53 = localDate51.getDayOfWeek();
        org.joda.time.LocalDate.Property property54 = localDate51.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval57 = localDate51.toInterval(dateTimeZone56);
        int[] intArray59 = new int[] { 'a' };
        int int60 = dateTimeField45.getMaximumValue((org.joda.time.ReadablePartial) localDate51, intArray59);
        org.joda.time.Interval interval61 = localDate51.toInterval();
        java.util.Date date62 = localDate51.toDate();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate((long) (short) 0, chronology64);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate((long) (short) 0, chronology67);
        boolean boolean69 = localDate65.isEqual((org.joda.time.ReadablePartial) localDate68);
        int int70 = localDate68.getDayOfWeek();
        org.joda.time.LocalDate.Property property71 = localDate68.weekOfWeekyear();
        org.joda.time.LocalDate localDate72 = property71.roundFloorCopy();
        org.joda.time.LocalDate localDate73 = property71.roundCeilingCopy();
        org.joda.time.LocalDate localDate74 = property71.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.Interval interval77 = localDate74.toInterval(dateTimeZone76);
        int int78 = localDate51.compareTo((org.joda.time.ReadablePartial) localDate74);
        org.joda.time.LocalDate localDate80 = localDate51.plusMonths(5);
        org.joda.time.Chronology chronology81 = localDate51.getChronology();
        org.joda.time.DateTimeField dateTimeField82 = chronology81.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone83 = chronology81.getZone();
        org.joda.time.DateTimeField dateTimeField84 = chronology81.clockhourOfDay();
        mutableDateTime19.setRounding(dateTimeField84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime41", (instant10.compareTo(mutableDateTime41) == 0) == instant10.equals(mutableDateTime41));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        int int7 = localDate5.getDayOfWeek();
        org.joda.time.LocalDate.Property property8 = localDate5.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property8.roundFloorCopy();
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths((int) (short) 100);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (short) 0, chronology13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (short) 0, chronology16);
        boolean boolean18 = localDate14.isEqual((org.joda.time.ReadablePartial) localDate17);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property21.getFieldType();
        org.joda.time.LocalDate.Property property23 = localDate17.property(dateTimeFieldType22);
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType22.getRangeDurationType();
        boolean boolean25 = localDate9.isSupported(durationFieldType24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) (short) 0, chronology27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 0, chronology30);
        boolean boolean32 = localDate28.isEqual((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = localDate28.toDateTimeAtStartOfDay(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime38 = dateTime34.plus(readableDuration37);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = dateTime38.withChronology(chronology39);
        org.joda.time.DateTime dateTime42 = dateTime40.withWeekOfWeekyear(4);
        org.joda.time.DateTime.Property property43 = dateTime40.monthOfYear();
        org.joda.time.DateTime.Property property44 = dateTime40.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        int int49 = dateTimeZone47.getOffset((long) '4');
        long long51 = dateTimeZone47.nextTransition((long) 70);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = null;
        java.lang.String str55 = mutableDateTime53.toString(dateTimeFormatter54);
        mutableDateTime53.addMonths((int) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime60.dayOfYear();
        boolean boolean62 = mutableDateTime60.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime60.setZone(dateTimeZone64);
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime(6048000000L, dateTimeZone64);
        mutableDateTime53.setZone(dateTimeZone64);
        long long69 = dateTimeZone47.getMillisKeepLocal(dateTimeZone64, (long) 'u');
        int int71 = dateTimeZone64.getStandardOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime72 = dateTime40.toMutableDateTime(dateTimeZone64);
        org.joda.time.DateMidnight dateMidnight73 = localDate9.toDateMidnight(dateTimeZone64);
        int int74 = localDate9.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime20 and mutableDateTime60", (mutableDateTime20.compareTo(mutableDateTime60) == 0) == mutableDateTime20.equals(mutableDateTime60));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.dayOfYear();
        boolean boolean5 = mutableDateTime3.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime3.setZone(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(6048000000L, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone7);
        long long12 = dateTimeZone7.convertUTCToLocal((long) 0);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 1, dateTimeZone7);
        int int14 = dateTime13.getDayOfMonth();
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology18 = localTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.clockhourOfHalfday();
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket(0L, chronology21, locale22, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale27 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket24.saveField(dateTimeFieldType25, "1970-01-01T00:00:00.000Z", locale27);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology18, locale27);
        java.lang.String str30 = chronology18.toString();
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(chronology18);
        org.joda.time.DateTimeField dateTimeField32 = chronology18.weekyear();
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(chronology18);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime35.getZone();
        org.joda.time.ReadableDuration readableDuration37 = null;
        mutableDateTime35.add(readableDuration37, 3);
        org.joda.time.DateTimeZone dateTimeZone40 = mutableDateTime35.getZone();
        int int42 = dateTimeZone40.getOffset((long) (byte) 1);
        org.joda.time.Chronology chronology43 = chronology18.withZone(dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField44 = chronology18.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField45 = chronology18.secondOfDay();
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(36000000L, chronology18);
        org.joda.time.DateTimeField dateTimeField47 = chronology18.centuryOfEra();
        org.joda.time.Chronology chronology48 = chronology18.withUTC();
        org.joda.time.MutableDateTime mutableDateTime49 = dateTime13.toMutableDateTime(chronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime31", (dateTime10.compareTo(mutableDateTime31) == 0) == dateTime10.equals(mutableDateTime31));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 0);
        java.util.Locale locale5 = dateTimeParserBucket4.getLocale();
        java.lang.Integer int6 = dateTimeParserBucket4.getPivotYear();
        long long7 = dateTimeParserBucket4.computeMillis();
        java.lang.Object obj8 = dateTimeParserBucket4.saveState();
        long long10 = dateTimeParserBucket4.computeMillis(false);
        java.lang.Object obj11 = dateTimeParserBucket4.saveState();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.dayOfYear();
        boolean boolean15 = mutableDateTime13.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime13.setZone(dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime13.add(readablePeriod19, 4);
        org.joda.time.Instant instant22 = mutableDateTime13.toInstant();
        boolean boolean24 = mutableDateTime13.isAfter((long) (byte) 1);
        mutableDateTime13.addWeekyears(69);
        int int27 = mutableDateTime13.getWeekOfWeekyear();
        org.joda.time.Instant instant28 = mutableDateTime13.toInstant();
        org.joda.time.ReadableDuration readableDuration29 = null;
        mutableDateTime13.add(readableDuration29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime13.weekyear();
        boolean boolean32 = dateTimeParserBucket4.restoreState((java.lang.Object) property31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and instant28", (mutableDateTime13.compareTo(instant28) == 0) == mutableDateTime13.equals(instant28));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime11 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime.Property property12 = dateTime11.hourOfDay();
        org.joda.time.DateTime dateTime14 = dateTime11.minusSeconds(0);
        org.joda.time.DateTime dateTime16 = dateTime14.plusDays(1);
        boolean boolean17 = dateTime14.isAfterNow();
        org.joda.time.DateTime dateTime18 = dateTime14.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime20 = dateTime14.minusWeeks(69);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) (short) 0, chronology22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) (short) 0, chronology25);
        boolean boolean27 = localDate23.isEqual((org.joda.time.ReadablePartial) localDate26);
        int int28 = localDate26.getDayOfWeek();
        org.joda.time.LocalDate.Property property29 = localDate26.weekOfWeekyear();
        org.joda.time.LocalDate localDate30 = property29.roundFloorCopy();
        int int31 = localDate30.size();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDate localDate33 = localDate30.minus(readablePeriod32);
        org.joda.time.DateTime dateTime34 = localDate30.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate36 = localDate30.minusYears(1);
        int int37 = localDate30.getCenturyOfEra();
        org.joda.time.DateMidnight dateMidnight38 = localDate30.toDateMidnight();
        org.joda.time.LocalDate.Property property39 = localDate30.weekOfWeekyear();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) (short) 0, chronology41);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) (short) 0, chronology44);
        boolean boolean46 = localDate42.isEqual((org.joda.time.ReadablePartial) localDate45);
        int int47 = localDate45.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean49 = localDate45.isSupported(dateTimeFieldType48);
        org.joda.time.LocalDate.Property property50 = localDate30.property(dateTimeFieldType48);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.DateTimeZone dateTimeZone54 = mutableDateTime53.getZone();
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (short) 1, dateTimeZone54);
        org.joda.time.DateTime dateTime56 = localDate30.toDateTimeAtStartOfDay(dateTimeZone54);
        boolean boolean58 = dateTimeZone54.isStandardOffset(1644573054796L);
        int int60 = dateTimeZone54.getOffset(10L);
        org.joda.time.LocalDate localDate61 = org.joda.time.LocalDate.now(dateTimeZone54);
        org.joda.time.MutableDateTime mutableDateTime62 = dateTime20.toMutableDateTime(dateTimeZone54);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate((long) (short) 0, chronology64);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate((long) (short) 0, chronology67);
        boolean boolean69 = localDate65.isEqual((org.joda.time.ReadablePartial) localDate68);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateTime dateTime71 = localDate65.toDateTimeAtStartOfDay(dateTimeZone70);
        org.joda.time.DateTime dateTime73 = dateTime71.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration74 = null;
        org.joda.time.DateTime dateTime75 = dateTime71.plus(readableDuration74);
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.DateTime dateTime77 = dateTime75.withChronology(chronology76);
        org.joda.time.DateTime.Property property78 = dateTime75.secondOfMinute();
        org.joda.time.DateTime dateTime80 = dateTime75.withMinuteOfHour((int) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar81 = dateTime80.toGregorianCalendar();
        org.joda.time.DateTime dateTime83 = dateTime80.withCenturyOfEra(4);
        org.joda.time.DateTimeZone dateTimeZone85 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long89 = dateTimeZone85.convertLocalToUTC((long) 2039, true, (long) (byte) 100);
        org.joda.time.DateTime dateTime90 = dateTime83.toDateTime(dateTimeZone85);
        org.joda.time.DateTime dateTime91 = dateTime90.withLaterOffsetAtOverlap();
        int int92 = mutableDateTime62.compareTo((org.joda.time.ReadableInstant) dateTime90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime83 and dateTime90", (dateTime83.compareTo(dateTime90) == 0) == dateTime83.equals(dateTime90));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        long long8 = dateTimeZone5.nextTransition((long) '4');
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration10 = null;
        mutableDateTime9.add(readableDuration10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.dayOfYear();
        long long16 = property15.remainder();
        org.joda.time.MutableDateTime mutableDateTime18 = property15.set((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime18.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfCeiling();
        java.util.Locale locale23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = property20.set("1", locale23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        mutableDateTime24.setMillis(readableInstant25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime24.getZone();
        long long29 = dateTimeZone27.previousTransition(1644573073768L);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone27);
        mutableDateTime9.setZoneRetainFields(dateTimeZone27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime19", (mutableDateTime1.compareTo(mutableDateTime19) == 0) == mutableDateTime1.equals(mutableDateTime19));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        org.joda.time.Instant instant10 = mutableDateTime1.toInstant();
        int int11 = mutableDateTime1.getWeekyear();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime1.dayOfYear();
        java.util.GregorianCalendar gregorianCalendar13 = mutableDateTime1.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = localDateTime16.toDateTime(dateTimeZone19);
        int int23 = dateTimeZone19.getOffsetFromLocal((long) ' ');
        java.lang.String str24 = dateTimeZone19.toString();
        int int26 = dateTimeZone19.getOffset((long) 2000);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone19);
        mutableDateTime1.setZone(dateTimeZone19);
        java.util.Locale.Builder builder30 = new java.util.Locale.Builder();
        org.joda.time.Chronology chronology32 = null;
        java.util.Locale locale33 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket(0L, chronology32, locale33, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Chronology chronology39 = null;
        java.util.Locale locale40 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket(0L, chronology39, locale40, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale45 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket42.saveField(dateTimeFieldType43, "1970-01-01T00:00:00.000Z", locale45);
        dateTimeParserBucket35.saveField(dateTimeFieldType36, "1970-01-01T00:00:00.000Z", locale45);
        org.joda.time.Chronology chronology49 = null;
        java.util.Locale locale50 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket(0L, chronology49, locale50, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale55 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket52.saveField(dateTimeFieldType53, "1970-01-01T00:00:00.000Z", locale55);
        java.lang.String str57 = locale45.getDisplayCountry(locale55);
        org.joda.time.Chronology chronology59 = null;
        java.util.Locale locale60 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket62 = new org.joda.time.format.DateTimeParserBucket(0L, chronology59, locale60, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Chronology chronology66 = null;
        java.util.Locale locale67 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket69 = new org.joda.time.format.DateTimeParserBucket(0L, chronology66, locale67, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale72 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket69.saveField(dateTimeFieldType70, "1970-01-01T00:00:00.000Z", locale72);
        dateTimeParserBucket62.saveField(dateTimeFieldType63, "1970-01-01T00:00:00.000Z", locale72);
        org.joda.time.Chronology chronology76 = null;
        java.util.Locale locale77 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket79 = new org.joda.time.format.DateTimeParserBucket(0L, chronology76, locale77, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType80 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale82 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket79.saveField(dateTimeFieldType80, "1970-01-01T00:00:00.000Z", locale82);
        java.lang.String str84 = locale72.getDisplayCountry(locale82);
        java.lang.String str85 = locale55.getDisplayVariant(locale72);
        java.lang.String str86 = locale72.getDisplayScript();
        java.util.Locale.Builder builder87 = builder30.setLocale(locale72);
        java.util.Locale locale88 = builder87.build();
        java.lang.String str89 = dateTimeZone19.getName(3577835000L, locale88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant10", (mutableDateTime1.compareTo(instant10) == 0) == mutableDateTime1.equals(instant10));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime11 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime.Property property12 = dateTime8.weekyear();
        org.joda.time.DateTime dateTime13 = property12.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime15 = dateTime13.minusMillis(3);
        org.joda.time.DateTime.Property property16 = dateTime15.year();
        org.joda.time.DateTime dateTime18 = dateTime15.plusSeconds(69);
        org.joda.time.DateTime dateTime20 = dateTime15.minusMonths(0);
        org.joda.time.DateTime dateTime22 = dateTime20.withCenturyOfEra(5);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long28 = dateTimeZone24.convertLocalToUTC((long) 2039, true, (long) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime20.toMutableDateTime(dateTimeZone24);
        java.lang.String str31 = dateTimeZone24.getShortName(28800000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and mutableDateTime29", (dateTime15.compareTo(mutableDateTime29) == 0) == dateTime15.equals(mutableDateTime29));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withChronology(chronology13);
        org.joda.time.DateTime dateTime16 = dateTime14.withWeekOfWeekyear(4);
        org.joda.time.DateTime.Property property17 = dateTime14.monthOfYear();
        org.joda.time.DateTime.Property property18 = dateTime14.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        int int23 = dateTimeZone21.getOffset((long) '4');
        long long25 = dateTimeZone21.nextTransition((long) 70);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        mutableDateTime27.addMonths((int) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime34.dayOfYear();
        boolean boolean36 = mutableDateTime34.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime34.setZone(dateTimeZone38);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(6048000000L, dateTimeZone38);
        mutableDateTime27.setZone(dateTimeZone38);
        long long43 = dateTimeZone21.getMillisKeepLocal(dateTimeZone38, (long) 'u');
        int int45 = dateTimeZone38.getStandardOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime46 = dateTime14.toMutableDateTime(dateTimeZone38);
        org.joda.time.ReadableDuration readableDuration47 = null;
        mutableDateTime46.add(readableDuration47, 35645);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and mutableDateTime34", (dateTime8.compareTo(mutableDateTime34) == 0) == dateTime8.equals(mutableDateTime34));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        long long3 = property2.remainder();
        org.joda.time.MutableDateTime mutableDateTime5 = property2.set((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime6.add(readableDuration7, 100);
        long long10 = mutableDateTime6.getMillis();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 0, chronology15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 0, chronology18);
        boolean boolean20 = localDate16.isEqual((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate16.toDateTimeAtStartOfDay(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime26 = dateTime22.plus(readableDuration25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.withChronology(chronology27);
        org.joda.time.DateTime.Property property29 = dateTime26.secondOfMinute();
        int int30 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime dateTime31 = dateTime26.withTimeAtStartOfDay();
        boolean boolean32 = mutableDateTime6.isBefore((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime.Property property33 = dateTime31.era();
        org.joda.time.DateTime.Property property34 = dateTime31.year();
        org.joda.time.DateTime.Property property35 = dateTime31.millisOfDay();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime37 = dateTime31.plus(readableDuration36);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime40.dayOfYear();
        boolean boolean42 = mutableDateTime40.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime40.setZone(dateTimeZone44);
        long long47 = dateTimeZone44.nextTransition((long) '4');
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) 55, dateTimeZone44);
        org.joda.time.DateTime dateTime49 = dateTime37.toDateTime(dateTimeZone44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime40", (mutableDateTime1.compareTo(mutableDateTime40) == 0) == mutableDateTime1.equals(mutableDateTime40));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.millisOfSecond();
        boolean boolean4 = property3.isLeap();
        org.joda.time.MutableDateTime mutableDateTime6 = property3.addWrapField(35449917);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        boolean boolean12 = mutableDateTime10.isAfterNow();
        boolean boolean13 = mutableDateTime8.isBefore((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 0, chronology15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 0, chronology18);
        boolean boolean20 = localDate16.isEqual((org.joda.time.ReadablePartial) localDate19);
        int int21 = localDate19.getDayOfWeek();
        org.joda.time.LocalDate.Property property22 = localDate19.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval25 = localDate19.toInterval(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime10.toMutableDateTime(dateTimeZone24);
        mutableDateTime10.add((long) 59);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime10.add(readablePeriod29, 1970);
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now(dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime34.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and mutableDateTime26", (mutableDateTime8.compareTo(mutableDateTime26) == 0) == mutableDateTime8.equals(mutableDateTime26));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        java.lang.Integer int4 = dateTimeFormatter3.getPivotYear();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) (short) 0, chronology9);
        boolean boolean11 = localDate7.isEqual((org.joda.time.ReadablePartial) localDate10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate7.toDateTimeAtStartOfDay(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime16 = dateTime13.toDateTimeISO();
        org.joda.time.DateTime dateTime18 = dateTime16.plusSeconds(1);
        org.joda.time.DateTime.Property property19 = dateTime18.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay20 = dateTime18.toYearMonthDay();
        int int21 = dateTime18.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.dayOfYear();
        boolean boolean25 = mutableDateTime23.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime23.setZone(dateTimeZone27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime23.add(readablePeriod29, 4);
        org.joda.time.Instant instant32 = mutableDateTime23.toInstant();
        boolean boolean34 = mutableDateTime23.isAfter((long) (byte) 1);
        mutableDateTime23.addWeekyears(69);
        int int37 = mutableDateTime23.getYear();
        int int38 = mutableDateTime23.getRoundingMode();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis(35454362);
        mutableDateTime23.setZone(dateTimeZone40);
        org.joda.time.DateTime dateTime42 = dateTime18.toDateTime(dateTimeZone40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter3.withZone(dateTimeZone40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime42", (dateTime18.compareTo(dateTime42) == 0) == dateTime18.equals(dateTime42));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime1.add(readableDuration3, 3);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime1.toMutableDateTime();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.millis();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime7, chronology9);
        mutableDateTime7.setMinuteOfDay(1000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime11", (mutableDateTime1.compareTo(mutableDateTime11) == 0) == mutableDateTime1.equals(mutableDateTime11));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime11 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime13 = dateTime11.plusMinutes((int) (byte) 1);
        org.joda.time.DateTime dateTime15 = dateTime11.minusDays(2039);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) (short) 0, chronology17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (short) 0, chronology20);
        boolean boolean22 = localDate18.isEqual((org.joda.time.ReadablePartial) localDate21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate18.toDateTimeAtStartOfDay(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime28 = dateTime24.plus(readableDuration27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.withChronology(chronology29);
        org.joda.time.DateTime.Property property31 = dateTime28.secondOfMinute();
        org.joda.time.DateTime dateTime33 = dateTime28.withMinuteOfHour((int) (byte) 10);
        boolean boolean34 = dateTime15.isBefore((org.joda.time.ReadableInstant) dateTime33);
        int int35 = dateTime15.getMillisOfDay();
        org.joda.time.DateTime dateTime37 = dateTime15.plusDays(7);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        int int42 = dateTimeZone40.getOffset((long) '4');
        long long45 = dateTimeZone40.adjustOffset(100L, false);
        long long48 = dateTimeZone40.convertLocalToUTC((long) 19, true);
        org.joda.time.DateTime dateTime49 = dateTime37.toDateTime(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(dateTimeZone40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime37 and dateTime49", (dateTime37.compareTo(dateTime49) == 0) == dateTime37.equals(dateTime49));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = property2.getFieldType();
        org.joda.time.MutableDateTime mutableDateTime5 = property2.addWrapField(4);
        org.joda.time.MutableDateTime mutableDateTime6 = property2.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfYear();
        boolean boolean10 = mutableDateTime8.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime8.setZone(dateTimeZone12);
        long long15 = dateTimeZone12.nextTransition((long) '4');
        java.lang.String str17 = dateTimeZone12.getShortName((long) 100);
        mutableDateTime6.setZoneRetainFields(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.dayOfYear();
        boolean boolean22 = mutableDateTime20.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime20.setZone(dateTimeZone24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime20.add(readablePeriod26, 4);
        mutableDateTime20.setMillisOfSecond(0);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime34 = property33.getMutableDateTime();
        int int35 = mutableDateTime20.compareTo((org.joda.time.ReadableInstant) mutableDateTime34);
        mutableDateTime34.setDate(45L);
        mutableDateTime34.addHours(11);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now(dateTimeZone41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now(dateTimeZone45);
        org.joda.time.DateTime dateTime47 = localDateTime42.toDateTime(dateTimeZone45);
        org.joda.time.Chronology chronology48 = localDateTime42.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.year();
        int int50 = dateTimeField49.getMaximumValue();
        mutableDateTime34.setRounding(dateTimeField49);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime34.millisOfDay();
        mutableDateTime34.setYear(238);
        boolean boolean55 = mutableDateTime6.isBefore((org.joda.time.ReadableInstant) mutableDateTime34);
        mutableDateTime6.setMillisOfSecond(0);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate((long) (short) 0, chronology59);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate((long) (short) 0, chronology62);
        boolean boolean64 = localDate60.isEqual((org.joda.time.ReadablePartial) localDate63);
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateTime dateTime66 = localDate60.toDateTimeAtStartOfDay(dateTimeZone65);
        org.joda.time.DateTime dateTime68 = dateTime66.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration69 = null;
        org.joda.time.DateTime dateTime70 = dateTime66.plus(readableDuration69);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.DateTime dateTime72 = dateTime70.withChronology(chronology71);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.DateTime dateTime74 = dateTime70.withChronology(chronology73);
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime76.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = property77.getFieldType();
        org.joda.time.DateTime.Property property79 = dateTime74.property(dateTimeFieldType78);
        long long80 = property79.remainder();
        org.joda.time.DateTime dateTime81 = property79.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime83 = dateTime81.plusMonths(35658338);
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateTime83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and mutableDateTime76", (mutableDateTime8.compareTo(mutableDateTime76) == 0) == mutableDateTime8.equals(mutableDateTime76));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 0, chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 0, chronology15);
        boolean boolean17 = localDate13.isEqual((org.joda.time.ReadablePartial) localDate16);
        int int18 = localDate16.getDayOfWeek();
        org.joda.time.LocalDate.Property property19 = localDate16.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval22 = localDate16.toInterval(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = dateTime10.toDateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime25 = dateTime10.minusHours(771);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime25.getZone();
        long long28 = dateTimeZone26.previousTransition((long) 2);
        java.lang.String str30 = dateTimeZone26.getName(1644573314312L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime23", (dateTime10.compareTo(dateTime23) == 0) == dateTime10.equals(dateTime23));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        org.joda.time.Instant instant10 = mutableDateTime1.toInstant();
        int int11 = mutableDateTime1.getWeekyear();
        mutableDateTime1.setDayOfMonth(1);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 0, chronology15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 0, chronology18);
        boolean boolean20 = localDate16.isEqual((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate16.toDateTimeAtStartOfDay(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime26 = dateTime22.plus(readableDuration25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.withChronology(chronology27);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekOfWeekyear(4);
        org.joda.time.DateTime dateTime32 = dateTime28.minusMillis(2022);
        org.joda.time.DateTime.Property property33 = dateTime32.weekOfWeekyear();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) (short) 0, chronology35);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) (short) 0, chronology38);
        boolean boolean40 = localDate36.isEqual((org.joda.time.ReadablePartial) localDate39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = localDate36.toDateTimeAtStartOfDay(dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.DateTime dateTime46 = dateTime42.plus(readableDuration45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTime dateTime48 = dateTime46.withChronology(chronology47);
        org.joda.time.DateTime.Property property49 = dateTime46.secondOfMinute();
        org.joda.time.DateTime dateTime51 = dateTime46.withMinuteOfHour((int) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar52 = dateTime51.toGregorianCalendar();
        org.joda.time.DateTime dateTime54 = dateTime51.withCenturyOfEra(4);
        boolean boolean55 = dateTime32.isEqual((org.joda.time.ReadableInstant) dateTime54);
        boolean boolean56 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = dateTime32.toDateTime(dateTimeZone57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant10", (mutableDateTime1.compareTo(instant10) == 0) == mutableDateTime1.equals(instant10));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology5 = localTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.clockhourOfHalfday();
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket(0L, chronology8, locale9, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket11.saveField(dateTimeFieldType12, "1970-01-01T00:00:00.000Z", locale14);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology5, locale14);
        java.lang.String str17 = chronology5.toString();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology5);
        org.joda.time.DateTimeField dateTimeField19 = chronology5.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = chronology5.yearOfCentury();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) 69, chronology5);
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType1.getField(chronology5);
        java.util.Locale locale23 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology5, locale23);
        dateTimeParserBucket24.setOffset(53);
        java.lang.Integer int27 = dateTimeParserBucket24.getOffsetInteger();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.dayOfYear();
        int int31 = property30.getMinimumValueOverall();
        org.joda.time.DurationField durationField32 = property30.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime34 = property30.add(0);
        mutableDateTime34.setMillis((-36000000L));
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime38.dayOfYear();
        boolean boolean40 = mutableDateTime38.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime38.setZone(dateTimeZone42);
        long long45 = dateTimeZone42.nextTransition((long) '4');
        org.joda.time.MutableDateTime mutableDateTime46 = org.joda.time.MutableDateTime.now(dateTimeZone42);
        org.joda.time.ReadableDuration readableDuration47 = null;
        mutableDateTime46.add(readableDuration47);
        boolean boolean49 = mutableDateTime34.equals((java.lang.Object) readableDuration47);
        int int50 = mutableDateTime34.getMinuteOfDay();
        org.joda.time.ReadableDuration readableDuration51 = null;
        mutableDateTime34.add(readableDuration51);
        boolean boolean53 = dateTimeParserBucket24.restoreState((java.lang.Object) mutableDateTime34);
        mutableDateTime34.add(381460609L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime18 and mutableDateTime46", (mutableDateTime18.compareTo(mutableDateTime46) == 0) == mutableDateTime18.equals(mutableDateTime46));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        boolean boolean4 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime2.setZone(dateTimeZone6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableDateTime2.add(readablePeriod8, 4);
        mutableDateTime2.setTime((long) (short) 10);
        int int13 = mutableDateTime2.getEra();
        org.joda.time.DateTime dateTime14 = mutableDateTime2.toDateTimeISO();
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfYear();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology17 = localTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.era();
        java.lang.String str19 = chronology17.toString();
        org.joda.time.DateTime dateTime20 = dateTime14.withChronology(chronology17);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) (short) 0, chronology22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) (short) 0, chronology25);
        boolean boolean27 = localDate23.isEqual((org.joda.time.ReadablePartial) localDate26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = localDate23.toDateTimeAtStartOfDay(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime32 = dateTime29.toDateTimeISO();
        org.joda.time.DateTime.Property property33 = dateTime32.hourOfDay();
        org.joda.time.DateTime dateTime35 = dateTime32.minusSeconds(0);
        org.joda.time.DateTime dateTime37 = dateTime35.plusDays(1);
        boolean boolean38 = dateTime35.isAfterNow();
        org.joda.time.DateTime dateTime39 = dateTime35.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property40 = dateTime39.dayOfMonth();
        org.joda.time.DateTime dateTime42 = dateTime39.plusYears(3600000);
        org.joda.time.DateTime.Property property43 = dateTime39.dayOfMonth();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) (short) 0, chronology45);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((long) (short) 0, chronology48);
        boolean boolean50 = localDate46.isEqual((org.joda.time.ReadablePartial) localDate49);
        int int51 = localDate49.getDayOfWeek();
        org.joda.time.LocalDate.Property property52 = localDate49.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property52.getFieldType();
        org.joda.time.LocalDate localDate54 = property52.withMinimumValue();
        org.joda.time.LocalDate.Property property55 = localDate54.monthOfYear();
        java.util.Locale locale56 = java.util.Locale.PRC;
        java.lang.String str57 = locale56.getCountry();
        java.lang.String str58 = locale56.getScript();
        java.lang.String str59 = property55.getAsShortText(locale56);
        int int60 = property43.getMaximumTextLength(locale56);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket62 = new org.joda.time.format.DateTimeParserBucket(600015L, chronology17, locale56, (java.lang.Integer) 71444);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime20", (mutableDateTime2.compareTo(dateTime20) == 0) == mutableDateTime2.equals(dateTime20));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        int int1 = localTime0.size();
        org.joda.time.LocalTime localTime3 = localTime0.withMinuteOfHour((int) '#');
        org.joda.time.LocalTime localTime5 = localTime3.withSecondOfMinute(23);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfYear();
        boolean boolean9 = mutableDateTime7.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime7.setZone(dateTimeZone11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime7.add(readablePeriod13, 4);
        mutableDateTime7.setTime((long) (short) 10);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime7.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime20 = mutableDateTime7.toDateTime(dateTimeZone19);
        boolean boolean22 = dateTimeZone19.isStandardOffset((-36L));
        org.joda.time.DateTime dateTime23 = localTime5.toDateTimeToday(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and dateTime20", (mutableDateTime7.compareTo(dateTime20) == 0) == mutableDateTime7.equals(dateTime20));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        mutableDateTime1.setTime((long) (short) 10);
        int int12 = mutableDateTime1.getEra();
        org.joda.time.DateTime dateTime13 = mutableDateTime1.toDateTimeISO();
        int int14 = mutableDateTime1.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime1.minuteOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime1.minuteOfDay();
        mutableDateTime1.setWeekOfWeekyear(11);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime1.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField21 = property20.getField();
        org.joda.time.MutableDateTime mutableDateTime23 = property20.addWrapField(1017);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property26.getFieldType();
        org.joda.time.MutableDateTime mutableDateTime29 = property26.addWrapField(4);
        java.lang.String str30 = mutableDateTime29.toString();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime29.millisOfDay();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime29.minuteOfDay();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) (short) 0, chronology34);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) (short) 0, chronology37);
        boolean boolean39 = localDate35.isEqual((org.joda.time.ReadablePartial) localDate38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = localDate35.toDateTimeAtStartOfDay(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.DateTime dateTime45 = dateTime41.plus(readableDuration44);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = dateTime45.withChronology(chronology46);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = dateTime45.withChronology(chronology48);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime51.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property52.getFieldType();
        org.joda.time.DateTime.Property property54 = dateTime49.property(dateTimeFieldType53);
        org.joda.time.DateTimeField dateTimeField55 = property54.getField();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDate localDate58 = new org.joda.time.LocalDate((long) (short) 0, chronology57);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.LocalDate localDate61 = new org.joda.time.LocalDate((long) (short) 0, chronology60);
        boolean boolean62 = localDate58.isEqual((org.joda.time.ReadablePartial) localDate61);
        int int63 = localDate61.getDayOfWeek();
        org.joda.time.LocalDate.Property property64 = localDate61.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval67 = localDate61.toInterval(dateTimeZone66);
        int[] intArray69 = new int[] { 'a' };
        int int70 = dateTimeField55.getMaximumValue((org.joda.time.ReadablePartial) localDate61, intArray69);
        org.joda.time.Chronology chronology73 = null;
        java.util.Locale locale74 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket76 = new org.joda.time.format.DateTimeParserBucket(0L, chronology73, locale74, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale79 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket76.saveField(dateTimeFieldType77, "1970-01-01T00:00:00.000Z", locale79);
        java.util.Set<java.lang.String> strSet81 = locale79.getUnicodeLocaleAttributes();
        java.lang.String str82 = localDate61.toString("1", locale79);
        org.joda.time.LocalDate localDate84 = localDate61.withMonthOfYear(5);
        org.joda.time.Chronology chronology85 = localDate84.getChronology();
        org.joda.time.Chronology chronology86 = chronology85.withUTC();
        org.joda.time.DateTimeField dateTimeField87 = chronology86.minuteOfDay();
        long long91 = chronology86.add((long) 3548000, (-35L), 9);
        org.joda.time.DateTimeField dateTimeField92 = chronology86.era();
        mutableDateTime29.setChronology(chronology86);
        org.joda.time.MutableDateTime.Property property94 = mutableDateTime29.hourOfDay();
        mutableDateTime29.addMonths(7);
        org.joda.time.MutableDateTime.Property property97 = mutableDateTime29.hourOfDay();
        mutableDateTime23.setMillis((org.joda.time.ReadableInstant) mutableDateTime29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime23 and mutableDateTime29", (mutableDateTime23.compareTo(mutableDateTime29) == 0) == mutableDateTime23.equals(mutableDateTime29));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(0L);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
        mutableDateTime1.setMinuteOfDay(0);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfYear();
        boolean boolean9 = mutableDateTime7.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime7.setZone(dateTimeZone11);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(6048000000L, dateTimeZone11);
        org.joda.time.DateTime dateTime15 = dateTime13.minusSeconds((int) ' ');
        org.joda.time.LocalTime localTime16 = dateTime15.toLocalTime();
        boolean boolean17 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime1.dayOfMonth();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (short) 0, chronology20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (short) 0, chronology23);
        boolean boolean25 = localDate21.isEqual((org.joda.time.ReadablePartial) localDate24);
        int int26 = localDate24.getDayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate28 = localDate24.plus(readablePeriod27);
        int int29 = localDate24.size();
        org.joda.time.LocalDate localDate31 = localDate24.minusDays((int) (byte) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.monthOfYear();
        int int33 = localDate31.get(dateTimeFieldType32);
        int int34 = localDate31.getYearOfEra();
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        org.joda.time.ReadableDuration readableDuration38 = null;
        mutableDateTime36.add(readableDuration38, 3);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime36.getZone();
        int int43 = dateTimeZone41.getOffset((long) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(dateTimeZone41);
        java.lang.String str45 = dateTimeZone41.getID();
        org.joda.time.DateTime dateTime46 = localDate31.toDateTimeAtCurrentTime(dateTimeZone41);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((java.lang.Object) mutableDateTime1, dateTimeZone41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and mutableDateTime36", (mutableDateTime7.compareTo(mutableDateTime36) == 0) == mutableDateTime7.equals(mutableDateTime36));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        mutableDateTime1.setTime((long) (short) 10);
        int int12 = mutableDateTime1.getEra();
        org.joda.time.DateTime dateTime13 = mutableDateTime1.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime1.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundFloor();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) (short) 0, chronology17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (short) 0, chronology20);
        boolean boolean22 = localDate18.isEqual((org.joda.time.ReadablePartial) localDate21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate18.toDateTimeAtStartOfDay(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime27 = dateTime24.toDateTimeISO();
        org.joda.time.DateTime.Property property28 = dateTime24.weekyear();
        org.joda.time.DateTime dateTime29 = property28.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime31 = dateTime29.minusMillis(3);
        org.joda.time.DateTime.Property property32 = dateTime31.year();
        org.joda.time.DateTime dateTime34 = dateTime31.plusSeconds(69);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.DateTime dateTime36 = dateTime31.plus(readablePeriod35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.minus(readablePeriod37);
        long long39 = dateTime36.getMillis();
        org.joda.time.DateTime.Property property40 = dateTime36.year();
        org.joda.time.YearMonthDay yearMonthDay41 = dateTime36.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone42 = dateTime36.getZone();
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime15.toMutableDateTime(dateTimeZone42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        mutableDateTime15.add(readablePeriod44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and mutableDateTime43", (mutableDateTime15.compareTo(mutableDateTime43) == 0) == mutableDateTime15.equals(mutableDateTime43));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.clockhourOfHalfday();
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale6 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology5, locale6, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale11 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket8.saveField(dateTimeFieldType9, "1970-01-01T00:00:00.000Z", locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology2, locale11);
        java.lang.String str14 = chronology2.toString();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(chronology2);
        org.joda.time.DateTimeField dateTimeField16 = chronology2.weekyear();
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(chronology2);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.ReadableDuration readableDuration21 = null;
        mutableDateTime19.add(readableDuration21, 3);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime19.getZone();
        int int26 = dateTimeZone24.getOffset((long) (byte) 1);
        org.joda.time.Chronology chronology27 = chronology2.withZone(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(chronology27);
        org.joda.time.Instant instant29 = mutableDateTime28.toInstant();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        java.lang.String str34 = dateTimeZone32.getNameKey((long) 53);
        mutableDateTime28.setZoneRetainFields(dateTimeZone32);
        int int36 = mutableDateTime28.getDayOfYear();
        org.joda.time.DateTime dateTime37 = mutableDateTime28.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime40.dayOfYear();
        boolean boolean42 = mutableDateTime40.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime40.setZone(dateTimeZone44);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(6048000000L, dateTimeZone44);
        org.joda.time.DateTime.Property property47 = dateTime46.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime.Property property49 = dateTime46.property(dateTimeFieldType48);
        org.joda.time.DurationFieldType durationFieldType50 = dateTimeFieldType48.getRangeDurationType();
        mutableDateTime28.add(durationFieldType50, 283);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime19 and mutableDateTime40", (mutableDateTime19.compareTo(mutableDateTime40) == 0) == mutableDateTime19.equals(mutableDateTime40));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        mutableDateTime1.setTime((long) (short) 10);
        int int12 = mutableDateTime1.getEra();
        org.joda.time.DateTime dateTime13 = mutableDateTime1.toDateTimeISO();
        int int14 = mutableDateTime1.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime1.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withMillisOfDay(100);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.plus(readableDuration21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.era();
        int int24 = localDateTime22.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.minusMillis(36000000);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.plusMonths(41);
        org.joda.time.Chronology chronology29 = localDateTime22.getChronology();
        org.joda.time.DateTimeZone dateTimeZone30 = chronology29.getZone();
        org.joda.time.DateTime dateTime31 = mutableDateTime1.toDateTime(dateTimeZone30);
        mutableDateTime1.addHours(91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime31", (dateTime13.compareTo(dateTime31) == 0) == dateTime13.equals(dateTime31));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withChronology(chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.withChronology(chronology15);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property19.getFieldType();
        org.joda.time.DateTime.Property property21 = dateTime16.property(dateTimeFieldType20);
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) (short) 0, chronology24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) (short) 0, chronology27);
        boolean boolean29 = localDate25.isEqual((org.joda.time.ReadablePartial) localDate28);
        int int30 = localDate28.getDayOfWeek();
        org.joda.time.LocalDate.Property property31 = localDate28.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval34 = localDate28.toInterval(dateTimeZone33);
        int[] intArray36 = new int[] { 'a' };
        int int37 = dateTimeField22.getMaximumValue((org.joda.time.ReadablePartial) localDate28, intArray36);
        org.joda.time.Interval interval38 = localDate28.toInterval();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = localDate28.getFieldType(2);
        org.joda.time.LocalDate.Property property41 = localDate28.weekyear();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) (short) 0, chronology43);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) (short) 0, chronology46);
        boolean boolean48 = localDate44.isEqual((org.joda.time.ReadablePartial) localDate47);
        int int49 = localDate47.getDayOfWeek();
        org.joda.time.LocalDate.Property property50 = localDate47.weekOfWeekyear();
        org.joda.time.LocalDate localDate51 = property50.roundFloorCopy();
        org.joda.time.LocalDate localDate52 = property50.roundCeilingCopy();
        org.joda.time.LocalDate localDate53 = property50.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.Interval interval56 = localDate53.toInterval(dateTimeZone55);
        org.joda.time.DateTime dateTime57 = localDate28.toDateTimeAtStartOfDay(dateTimeZone55);
        int int58 = localDate28.getWeekyear();
        org.joda.time.Chronology chronology59 = localDate28.getChronology();
        org.joda.time.DurationField durationField60 = chronology59.millis();
        org.joda.time.DurationField durationField61 = chronology59.eras();
        org.joda.time.DateTimeField dateTimeField62 = chronology59.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField60 and durationField61", Math.signum(durationField60.compareTo(durationField61)) == -Math.signum(durationField61.compareTo(durationField60)));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket(0L, chronology8, locale9, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket11.saveField(dateTimeFieldType12, "1970-01-01T00:00:00.000Z", locale14);
        dateTimeParserBucket4.saveField(dateTimeFieldType5, "1970-01-01T00:00:00.000Z", locale14);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeParserBucket4.getZone();
        java.lang.Integer int18 = dateTimeParserBucket4.getPivotYear();
        java.util.Locale locale19 = dateTimeParserBucket4.getLocale();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime21.millisOfSecond();
        boolean boolean24 = property23.isLeap();
        org.joda.time.MutableDateTime mutableDateTime26 = property23.addWrapField(35449917);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.dayOfYear();
        boolean boolean32 = mutableDateTime30.isAfterNow();
        boolean boolean33 = mutableDateTime28.isBefore((org.joda.time.ReadableInstant) mutableDateTime30);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) (short) 0, chronology35);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) (short) 0, chronology38);
        boolean boolean40 = localDate36.isEqual((org.joda.time.ReadablePartial) localDate39);
        int int41 = localDate39.getDayOfWeek();
        org.joda.time.LocalDate.Property property42 = localDate39.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval45 = localDate39.toInterval(dateTimeZone44);
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime30.toMutableDateTime(dateTimeZone44);
        mutableDateTime30.add((long) 59);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        mutableDateTime30.add(readablePeriod49, 1970);
        mutableDateTime26.setMillis((org.joda.time.ReadableInstant) mutableDateTime30);
        org.joda.time.DateTimeZone dateTimeZone53 = mutableDateTime30.getZone();
        dateTimeParserBucket4.setZone(dateTimeZone53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime28 and mutableDateTime46", (mutableDateTime28.compareTo(mutableDateTime46) == 0) == mutableDateTime28.equals(mutableDateTime46));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.dayOfYear();
        boolean boolean5 = mutableDateTime3.isAfterNow();
        boolean boolean6 = mutableDateTime1.isBefore((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 0, chronology8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) 0, chronology11);
        boolean boolean13 = localDate9.isEqual((org.joda.time.ReadablePartial) localDate12);
        int int14 = localDate12.getDayOfWeek();
        org.joda.time.LocalDate.Property property15 = localDate12.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval18 = localDate12.toInterval(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime3.toMutableDateTime(dateTimeZone17);
        org.joda.time.ReadableDuration readableDuration20 = null;
        mutableDateTime3.add(readableDuration20);
        org.joda.time.ReadableDuration readableDuration22 = null;
        mutableDateTime3.add(readableDuration22, 2922789);
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology28 = localTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.clockhourOfHalfday();
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket(0L, chronology31, locale32, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale37 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket34.saveField(dateTimeFieldType35, "1970-01-01T00:00:00.000Z", locale37);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology28, locale37);
        java.lang.String str40 = chronology28.toString();
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now(chronology28);
        org.joda.time.DateTimeField dateTimeField42 = chronology28.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField43 = chronology28.yearOfCentury();
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime((long) 69, chronology28);
        org.joda.time.DateTimeField dateTimeField45 = chronology28.hourOfDay();
        org.joda.time.DateTimeField dateTimeField46 = chronology28.year();
        org.joda.time.DurationField durationField47 = chronology28.minutes();
        mutableDateTime3.setChronology(chronology28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime19", (mutableDateTime1.compareTo(mutableDateTime19) == 0) == mutableDateTime1.equals(mutableDateTime19));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        mutableDateTime0.addWeeks(2);
        int int3 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 0, chronology8);
        boolean boolean10 = localDate6.isEqual((org.joda.time.ReadablePartial) localDate9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate6.toDateTimeAtStartOfDay(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusSeconds((int) (byte) 100);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (short) 0, chronology16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 0, chronology19);
        boolean boolean21 = localDate17.isEqual((org.joda.time.ReadablePartial) localDate20);
        int int22 = localDate20.getDayOfWeek();
        org.joda.time.LocalDate.Property property23 = localDate20.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval26 = localDate20.toInterval(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = dateTime14.toDateTime(dateTimeZone25);
        boolean boolean28 = mutableDateTime0.isEqual((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.dayOfYear();
        boolean boolean32 = mutableDateTime30.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime30.setZone(dateTimeZone34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        mutableDateTime30.add(readablePeriod36, 4);
        mutableDateTime30.setTime((long) (short) 10);
        int int41 = mutableDateTime30.getEra();
        org.joda.time.DateTime dateTime42 = mutableDateTime30.toDateTimeISO();
        int int43 = mutableDateTime30.getWeekOfWeekyear();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) (short) 0, chronology45);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((long) (short) 0, chronology48);
        boolean boolean50 = localDate46.isEqual((org.joda.time.ReadablePartial) localDate49);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = localDate46.toDateTimeAtStartOfDay(dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime55 = dateTime52.toDateTimeISO();
        org.joda.time.DateTime dateTime57 = dateTime55.plusMinutes((int) (byte) 1);
        org.joda.time.DateTime dateTime59 = dateTime55.minusDays(2039);
        int int60 = dateTime55.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone61 = dateTime55.getZone();
        int int63 = dateTimeZone61.getStandardOffset(100L);
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime(dateTimeZone61);
        mutableDateTime30.setZoneRetainFields(dateTimeZone61);
        boolean boolean67 = dateTimeZone61.isStandardOffset(11581401599965L);
        org.joda.time.DateTime dateTime68 = dateTime27.withZone(dateTimeZone61);
        long long71 = dateTimeZone61.convertLocalToUTC((long) 35557, true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime27", (dateTime14.compareTo(dateTime27) == 0) == dateTime14.equals(dateTime27));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.millisOfSecond();
        boolean boolean4 = property3.isLeap();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfCeiling();
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        int int11 = property3.compareTo((org.joda.time.ReadableInstant) instant10);
        java.lang.String str12 = property3.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant10", (mutableDateTime1.compareTo(instant10) == 0) == mutableDateTime1.equals(instant10));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.year();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) (short) 0, chronology9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 0, chronology12);
        boolean boolean14 = localDate10.isEqual((org.joda.time.ReadablePartial) localDate13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate10.toDateTimeAtStartOfDay(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime16.plus(readableDuration19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.withChronology(chronology21);
        org.joda.time.DateTime.Property property23 = dateTime20.secondOfMinute();
        org.joda.time.DateTime dateTime25 = dateTime20.withMinuteOfHour((int) (byte) 10);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = dateTime20.withChronology(chronology26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.plus(readablePeriod28);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime27.getZone();
        boolean boolean31 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime1.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime33 = property32.roundFloor();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime33 and dateTime16", (mutableDateTime33.compareTo(dateTime16) == 0) == mutableDateTime33.equals(dateTime16));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withChronology(chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.withChronology(chronology15);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property19.getFieldType();
        org.joda.time.DateTime.Property property21 = dateTime16.property(dateTimeFieldType20);
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) (short) 0, chronology24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) (short) 0, chronology27);
        boolean boolean29 = localDate25.isEqual((org.joda.time.ReadablePartial) localDate28);
        int int30 = localDate28.getDayOfWeek();
        org.joda.time.LocalDate.Property property31 = localDate28.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval34 = localDate28.toInterval(dateTimeZone33);
        int[] intArray36 = new int[] { 'a' };
        int int37 = dateTimeField22.getMaximumValue((org.joda.time.ReadablePartial) localDate28, intArray36);
        org.joda.time.Interval interval38 = localDate28.toInterval();
        java.util.Date date39 = localDate28.toDate();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) (short) 0, chronology41);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) (short) 0, chronology44);
        boolean boolean46 = localDate42.isEqual((org.joda.time.ReadablePartial) localDate45);
        int int47 = localDate45.getDayOfWeek();
        org.joda.time.LocalDate.Property property48 = localDate45.weekOfWeekyear();
        org.joda.time.LocalDate localDate49 = property48.roundFloorCopy();
        org.joda.time.LocalDate localDate50 = property48.roundCeilingCopy();
        org.joda.time.LocalDate localDate51 = property48.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.Interval interval54 = localDate51.toInterval(dateTimeZone53);
        int int55 = localDate28.compareTo((org.joda.time.ReadablePartial) localDate51);
        org.joda.time.LocalDate localDate57 = localDate28.plusMonths(5);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.year();
        boolean boolean59 = localDate28.isSupported(dateTimeFieldType58);
        org.joda.time.LocalDate.Property property60 = localDate28.yearOfEra();
        int int61 = localDate28.getCenturyOfEra();
        org.joda.time.Chronology chronology62 = localDate28.getChronology();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate((long) (short) 0, chronology64);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate((long) (short) 0, chronology67);
        boolean boolean69 = localDate65.isEqual((org.joda.time.ReadablePartial) localDate68);
        int int70 = localDate68.getDayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        org.joda.time.LocalDate localDate72 = localDate68.plus(readablePeriod71);
        int int73 = localDate68.size();
        org.joda.time.LocalDate localDate75 = localDate68.minusDays((int) (byte) -1);
        org.joda.time.MutableDateTime mutableDateTime77 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property78 = mutableDateTime77.dayOfYear();
        boolean boolean79 = mutableDateTime77.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime77.setZone(dateTimeZone81);
        long long84 = dateTimeZone81.nextTransition((long) '4');
        java.lang.String str86 = dateTimeZone81.getShortName(35L);
        boolean boolean87 = dateTimeZone81.isFixed();
        org.joda.time.DateTime dateTime88 = localDate75.toDateTimeAtCurrentTime(dateTimeZone81);
        org.joda.time.DateTime dateTime89 = localDate28.toDateTimeAtStartOfDay(dateTimeZone81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and mutableDateTime77", (dateTime8.compareTo(mutableDateTime77) == 0) == dateTime8.equals(mutableDateTime77));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withChronology(chronology13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime16.minus(381044902L);
        org.joda.time.DateTime dateTime20 = dateTime16.withWeekyear(0);
        org.joda.time.DateTime dateTime22 = dateTime16.withMinuteOfHour(53);
        org.joda.time.DateTime dateTime24 = dateTime22.withMinuteOfHour(32);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) (short) 0, chronology26);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) (short) 0, chronology29);
        boolean boolean31 = localDate27.isEqual((org.joda.time.ReadablePartial) localDate30);
        int int32 = localDate30.getDayOfWeek();
        org.joda.time.LocalDate.Property property33 = localDate30.weekOfWeekyear();
        org.joda.time.LocalDate localDate34 = property33.roundFloorCopy();
        int int35 = localDate34.size();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDate localDate37 = localDate34.minus(readablePeriod36);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime39.dayOfYear();
        boolean boolean41 = mutableDateTime39.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime39.setZone(dateTimeZone43);
        long long46 = dateTimeZone43.nextTransition((long) '4');
        org.joda.time.DateTime dateTime47 = localDate37.toDateTimeAtCurrentTime(dateTimeZone43);
        org.joda.time.LocalDate localDate49 = localDate37.plusYears((-1));
        org.joda.time.DateTime dateTime50 = dateTime22.withFields((org.joda.time.ReadablePartial) localDate49);
        org.joda.time.DateTime dateTime52 = dateTime22.plusHours(142);
        int int53 = dateTime22.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and mutableDateTime39", (dateTime8.compareTo(mutableDateTime39) == 0) == dateTime8.equals(mutableDateTime39));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.millisOfSecond();
        boolean boolean4 = property3.isLeap();
        org.joda.time.MutableDateTime mutableDateTime6 = property3.addWrapField(35449917);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        boolean boolean12 = mutableDateTime10.isAfterNow();
        boolean boolean13 = mutableDateTime8.isBefore((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 0, chronology15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 0, chronology18);
        boolean boolean20 = localDate16.isEqual((org.joda.time.ReadablePartial) localDate19);
        int int21 = localDate19.getDayOfWeek();
        org.joda.time.LocalDate.Property property22 = localDate19.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval25 = localDate19.toInterval(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime10.toMutableDateTime(dateTimeZone24);
        mutableDateTime10.add((long) 59);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime10.add(readablePeriod29, 1970);
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime10.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime35 = property34.roundHalfEven();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and mutableDateTime26", (mutableDateTime8.compareTo(mutableDateTime26) == 0) == mutableDateTime8.equals(mutableDateTime26));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.clockhourOfHalfday();
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology6, locale7, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket9.saveField(dateTimeFieldType10, "1970-01-01T00:00:00.000Z", locale12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology3, locale12);
        java.lang.String str15 = chronology3.toString();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(chronology3);
        org.joda.time.DateTimeField dateTimeField17 = chronology3.weekyear();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.ReadableDuration readableDuration22 = null;
        mutableDateTime20.add(readableDuration22, 3);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime20.getZone();
        int int27 = dateTimeZone25.getOffset((long) (byte) 1);
        org.joda.time.Chronology chronology28 = chronology3.withZone(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField29 = chronology3.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField30 = chronology3.secondOfDay();
        org.joda.time.DurationField durationField31 = chronology3.halfdays();
        org.joda.time.DateTimeZone dateTimeZone32 = chronology3.getZone();
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((java.lang.Object) 1644573063088L, chronology3);
        org.joda.time.DateTimeField dateTimeField34 = chronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField35 = chronology3.centuryOfEra();
        org.joda.time.DurationField durationField36 = chronology3.eras();
        org.joda.time.DateTimeField dateTimeField37 = chronology3.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField31 and durationField36", Math.signum(durationField31.compareTo(durationField36)) == -Math.signum(durationField36.compareTo(durationField31)));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.clockhourOfHalfday();
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology6, locale7, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket9.saveField(dateTimeFieldType10, "1970-01-01T00:00:00.000Z", locale12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology3, locale12);
        java.lang.String str15 = chronology3.toString();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(chronology3);
        org.joda.time.DateTimeField dateTimeField17 = chronology3.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField18 = chronology3.yearOfCentury();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) 69, chronology3);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalTime localTime21 = localTime19.minus(readablePeriod20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalTime localTime24 = localTime21.withPeriodAdded(readablePeriod22, 15);
        org.joda.time.LocalTime localTime26 = localTime24.plusHours(1980);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.dayOfYear();
        boolean boolean30 = mutableDateTime28.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime28.setZone(dateTimeZone32);
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(dateTimeZone32);
        org.joda.time.DateTime.Property property35 = dateTime34.dayOfWeek();
        org.joda.time.Instant instant36 = dateTime34.toInstant();
        org.joda.time.DateTime dateTime38 = dateTime34.plusWeeks(724);
        int int39 = dateTime34.getMinuteOfHour();
        boolean boolean40 = localTime24.equals((java.lang.Object) int39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and dateTime34", (mutableDateTime16.compareTo(dateTime34) == 0) == mutableDateTime16.equals(dateTime34));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.minuteOfHour();
        int int4 = property3.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime6 = property3.add((int) 'x');
        org.joda.time.MutableDateTime mutableDateTime7 = property3.roundCeiling();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.clockhourOfHalfday();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology13, locale14, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale19 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket16.saveField(dateTimeFieldType17, "1970-01-01T00:00:00.000Z", locale19);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology10, locale19);
        java.lang.String str22 = chronology10.toString();
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(chronology10);
        org.joda.time.DateTimeField dateTimeField24 = chronology10.weekyear();
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(chronology10);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        org.joda.time.ReadableDuration readableDuration29 = null;
        mutableDateTime27.add(readableDuration29, 3);
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime27.getZone();
        int int34 = dateTimeZone32.getOffset((long) (byte) 1);
        org.joda.time.Chronology chronology35 = chronology10.withZone(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField36 = chronology10.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField37 = chronology10.secondOfDay();
        org.joda.time.Chronology chronology38 = chronology10.withUTC();
        org.joda.time.DurationField durationField39 = chronology10.years();
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime7, chronology10);
        org.joda.time.LocalTime localTime41 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology42 = localTime41.getChronology();
        org.joda.time.LocalTime.Property property43 = localTime41.millisOfSecond();
        org.joda.time.LocalTime localTime44 = property43.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology47 = null;
        java.util.Locale locale48 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket(0L, chronology47, locale48, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Chronology chronology54 = null;
        java.util.Locale locale55 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket(0L, chronology54, locale55, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale60 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket57.saveField(dateTimeFieldType58, "1970-01-01T00:00:00.000Z", locale60);
        dateTimeParserBucket50.saveField(dateTimeFieldType51, "1970-01-01T00:00:00.000Z", locale60);
        org.joda.time.LocalTime localTime63 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology64 = localTime63.getChronology();
        org.joda.time.DurationField durationField65 = chronology64.weekyears();
        org.joda.time.LocalTime localTime66 = new org.joda.time.LocalTime(chronology64);
        boolean boolean67 = dateTimeFieldType51.isSupported(chronology64);
        org.joda.time.DateTime dateTime68 = org.joda.time.DateTime.now(chronology64);
        boolean boolean69 = dateTimeFieldType45.isSupported(chronology64);
        java.lang.String str70 = dateTimeFieldType45.getName();
        boolean boolean71 = localTime44.isSupported(dateTimeFieldType45);
        mutableDateTime40.set(dateTimeFieldType45, 35696280);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField39 and durationField65", (durationField39.compareTo(durationField65) == 0) == durationField39.equals(durationField65));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        int int7 = localDate5.getDayOfWeek();
        org.joda.time.LocalDate.Property property8 = localDate5.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property8.roundFloorCopy();
        int int10 = localDate9.size();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate9.minus(readablePeriod11);
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate15 = localDate9.withMonthOfYear(10);
        org.joda.time.LocalDate localDate17 = localDate15.withYear((int) '4');
        org.joda.time.LocalDate localDate19 = localDate15.withEra((int) (short) 1);
        org.joda.time.LocalDate localDate21 = localDate19.plusYears(51);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localDate21.toDateTime(readableInstant22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) (short) 0, chronology25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) (short) 0, chronology28);
        boolean boolean30 = localDate26.isEqual((org.joda.time.ReadablePartial) localDate29);
        int int31 = localDate29.getDayOfWeek();
        org.joda.time.LocalDate.Property property32 = localDate29.weekOfWeekyear();
        org.joda.time.LocalDate localDate33 = property32.roundFloorCopy();
        org.joda.time.LocalDate localDate34 = property32.roundCeilingCopy();
        org.joda.time.LocalDate localDate35 = property32.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.Interval interval38 = localDate35.toInterval(dateTimeZone37);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((long) (short) 0, chronology40);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) (short) 0, chronology43);
        boolean boolean45 = localDate41.isEqual((org.joda.time.ReadablePartial) localDate44);
        int int46 = localDate44.getDayOfWeek();
        org.joda.time.LocalDate.Property property47 = localDate44.weekOfWeekyear();
        org.joda.time.LocalDate localDate48 = property47.roundFloorCopy();
        org.joda.time.LocalDate localDate49 = property47.roundCeilingCopy();
        org.joda.time.LocalDate localDate50 = property47.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.Interval interval53 = localDate50.toInterval(dateTimeZone52);
        org.joda.time.LocalDate.Property property54 = localDate50.dayOfMonth();
        org.joda.time.LocalDate.Property property55 = localDate50.yearOfEra();
        org.joda.time.LocalDate localDate57 = property55.addToCopy(2);
        org.joda.time.LocalDate localDate59 = localDate57.withYear(14);
        org.joda.time.DateMidnight dateMidnight60 = localDate57.toDateMidnight();
        int int61 = dateTimeZone37.getOffset((org.joda.time.ReadableInstant) dateMidnight60);
        org.joda.time.LocalDate localDate63 = org.joda.time.LocalDate.parse("0052-10-29");
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.LocalDate localDate66 = new org.joda.time.LocalDate((long) (short) 0, chronology65);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate((long) (short) 0, chronology68);
        boolean boolean70 = localDate66.isEqual((org.joda.time.ReadablePartial) localDate69);
        org.joda.time.LocalDate.Property property71 = localDate69.centuryOfEra();
        int int72 = localDate69.getCenturyOfEra();
        org.joda.time.LocalDate localDate73 = localDate63.withFields((org.joda.time.ReadablePartial) localDate69);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forOffsetHours(32);
        org.joda.time.DateTime dateTime76 = localDate73.toDateTimeAtCurrentTime(dateTimeZone75);
        long long78 = dateTimeZone37.getMillisKeepLocal(dateTimeZone75, 31536000000L);
        org.joda.time.MutableDateTime mutableDateTime79 = dateTime23.toMutableDateTime(dateTimeZone37);
        org.joda.time.LocalTime localTime80 = org.joda.time.LocalTime.now(dateTimeZone37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and mutableDateTime79", (dateTime23.compareTo(mutableDateTime79) == 0) == dateTime23.equals(mutableDateTime79));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        mutableDateTime1.add(readableDuration2, 35449917);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime1.add(readablePeriod5, 71745824);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = localDateTime10.toDateTime(dateTimeZone13);
        long long17 = dateTimeZone13.convertUTCToLocal((long) 10);
        boolean boolean18 = dateTimeZone13.isFixed();
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone13);
        boolean boolean22 = dateTimeZone13.isStandardOffset(3578400000L);
        long long24 = dateTimeZone13.nextTransition(147599965L);
        org.joda.time.DateTime dateTime25 = mutableDateTime1.toDateTime(dateTimeZone13);
        java.lang.String str27 = dateTimeZone13.getShortName(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime25", (mutableDateTime1.compareTo(dateTime25) == 0) == mutableDateTime1.equals(dateTime25));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.year();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) (short) 0, chronology9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 0, chronology12);
        boolean boolean14 = localDate10.isEqual((org.joda.time.ReadablePartial) localDate13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate10.toDateTimeAtStartOfDay(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime16.plus(readableDuration19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.withChronology(chronology21);
        org.joda.time.DateTime.Property property23 = dateTime20.secondOfMinute();
        org.joda.time.DateTime dateTime25 = dateTime20.withMinuteOfHour((int) (byte) 10);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = dateTime20.withChronology(chronology26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.plus(readablePeriod28);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime27.getZone();
        boolean boolean31 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime dateTime33 = dateTime27.plusYears(238);
        int int34 = dateTime33.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime16", (mutableDateTime1.compareTo(dateTime16) == 0) == mutableDateTime1.equals(dateTime16));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withChronology(chronology13);
        org.joda.time.DateTime.Property property15 = dateTime12.secondOfMinute();
        org.joda.time.DateTime dateTime17 = dateTime12.withMinuteOfHour((int) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar18 = dateTime17.toGregorianCalendar();
        org.joda.time.DateTime dateTime20 = dateTime17.withCenturyOfEra(4);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long26 = dateTimeZone22.convertLocalToUTC((long) 2039, true, (long) (byte) 100);
        org.joda.time.DateTime dateTime27 = dateTime20.toDateTime(dateTimeZone22);
        java.lang.String str29 = dateTimeZone22.getName((long) 43047342);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime27", (dateTime20.compareTo(dateTime27) == 0) == dateTime20.equals(dateTime27));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(381044902L);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.year();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.dayOfYear();
        boolean boolean6 = mutableDateTime4.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        mutableDateTime4.setZoneRetainFields(dateTimeZone7);
        mutableDateTime4.setTime(0, (int) (byte) 0, (int) (short) 1, (int) (short) 1);
        org.joda.time.DateTime dateTime14 = mutableDateTime4.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.getMutableDateTime();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (short) 0, chronology20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (short) 0, chronology23);
        boolean boolean25 = localDate21.isEqual((org.joda.time.ReadablePartial) localDate24);
        int int26 = localDate24.getDayOfWeek();
        org.joda.time.LocalDate.Property property27 = localDate24.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval30 = localDate24.toInterval(dateTimeZone29);
        long long32 = dateTimeZone29.convertUTCToLocal((long) 0);
        mutableDateTime18.setZone(dateTimeZone29);
        mutableDateTime4.setZone(dateTimeZone29);
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone29);
        mutableDateTime1.setZoneRetainFields(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime1.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now(dateTimeZone40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.now(dateTimeZone44);
        org.joda.time.DateTime dateTime46 = localDateTime41.toDateTime(dateTimeZone44);
        int int48 = dateTimeZone44.getOffsetFromLocal((long) ' ');
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) 9, dateTimeZone44);
        org.joda.time.MutableDateTime mutableDateTime50 = org.joda.time.MutableDateTime.now(dateTimeZone44);
        mutableDateTime37.setZoneRetainFields(dateTimeZone44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and dateTime14", (mutableDateTime4.compareTo(dateTime14) == 0) == mutableDateTime4.equals(dateTime14));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusDays((int) 'a');
        int int9 = localDateTime6.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withMillisOfDay(9);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.lang.String str13 = dateTimeFieldType12.getName();
        int int14 = localDateTime11.indexOf(dateTimeFieldType12);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime1.property(dateTimeFieldType12);
        java.lang.String str16 = property15.getName();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.dayOfYear();
        boolean boolean20 = mutableDateTime18.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime18.setZone(dateTimeZone22);
        long long25 = dateTimeZone22.nextTransition((long) '4');
        java.lang.String str27 = dateTimeZone22.getShortName(35L);
        boolean boolean28 = dateTimeZone22.isFixed();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(dateTimeZone22);
        int int30 = property15.getDifference((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.LocalDate localDate31 = dateTime29.toLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime18", (mutableDateTime1.compareTo(mutableDateTime18) == 0) == mutableDateTime1.equals(mutableDateTime18));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withChronology(chronology13);
        org.joda.time.DateTime.Property property15 = dateTime12.secondOfMinute();
        org.joda.time.DateTime dateTime17 = dateTime12.withMinuteOfHour((int) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar18 = dateTime17.toGregorianCalendar();
        org.joda.time.DateTime dateTime20 = dateTime17.withCenturyOfEra(4);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long26 = dateTimeZone22.convertLocalToUTC((long) 2039, true, (long) (byte) 100);
        org.joda.time.DateTime dateTime27 = dateTime20.toDateTime(dateTimeZone22);
        java.util.Date date28 = dateTime20.toDate();
        org.joda.time.DateTime dateTime30 = dateTime20.withMillis(1644796800036L);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) (short) 0, chronology32);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) (short) 0, chronology35);
        boolean boolean37 = localDate33.isEqual((org.joda.time.ReadablePartial) localDate36);
        int int38 = localDate36.getDayOfWeek();
        int int39 = localDate36.getMonthOfYear();
        int int40 = localDate36.getCenturyOfEra();
        org.joda.time.LocalDate localDate42 = localDate36.minusWeeks(42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) (short) 0, chronology44);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((long) (short) 0, chronology47);
        boolean boolean49 = localDate45.isEqual((org.joda.time.ReadablePartial) localDate48);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = localDate45.toDateTimeAtStartOfDay(dateTimeZone50);
        org.joda.time.DateTime dateTime53 = dateTime51.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.DateTime dateTime55 = dateTime51.plus(readableDuration54);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTime dateTime57 = dateTime55.withChronology(chronology56);
        org.joda.time.DateTime.Property property58 = dateTime55.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.DateTime dateTime60 = dateTime55.minus(readableDuration59);
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime((long) 0);
        int int63 = mutableDateTime62.getEra();
        org.joda.time.Chronology chronology64 = null;
        mutableDateTime62.setChronology(chronology64);
        boolean boolean66 = dateTime55.isBefore((org.joda.time.ReadableInstant) mutableDateTime62);
        org.joda.time.DateTime dateTime68 = dateTime55.minusYears(3600000);
        int int69 = dateTime55.getDayOfWeek();
        org.joda.time.DateTime dateTime70 = localDate42.toDateTime((org.joda.time.ReadableInstant) dateTime55);
        int int71 = dateTime70.getMinuteOfDay();
        org.joda.time.DateTime.Property property72 = dateTime70.millisOfDay();
        int int73 = dateTime20.compareTo((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.DateTime dateTime76 = dateTime20.withDurationAdded(0L, 90000000);
        org.joda.time.DateTime.Property property77 = dateTime20.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime20", (dateTime27.compareTo(dateTime20) == 0) == dateTime27.equals(dateTime20));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(0L);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 0, chronology3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        boolean boolean8 = localDate4.isEqual((org.joda.time.ReadablePartial) localDate7);
        int int9 = localDate7.getDayOfWeek();
        org.joda.time.LocalDate.Property property10 = localDate7.weekOfWeekyear();
        org.joda.time.LocalDate localDate12 = property10.setCopy((int) (byte) 1);
        boolean boolean13 = mutableDateTime1.equals((java.lang.Object) property10);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.dayOfYear();
        boolean boolean24 = mutableDateTime22.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime22.setZone(dateTimeZone26);
        long long29 = dateTimeZone26.nextTransition((long) '4');
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((int) (byte) -1, 2, 5, 4, (int) (short) 0, 0, 100, dateTimeZone26);
        org.joda.time.Chronology chronology31 = dateTime30.getChronology();
        org.joda.time.DateTime dateTime32 = mutableDateTime1.toDateTime(chronology31);
        mutableDateTime1.addMillis(69);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        mutableDateTime36.addMonths((int) (byte) 1);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.year();
        org.joda.time.MutableDateTime mutableDateTime42 = property41.getMutableDateTime();
        int int43 = property41.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime45 = property41.add(2100005L);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime45);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime45.era();
        mutableDateTime45.setMonthOfYear((int) (short) 10);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime51.dayOfYear();
        boolean boolean53 = mutableDateTime51.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        mutableDateTime51.setZoneRetainFields(dateTimeZone54);
        mutableDateTime51.setTime(0, (int) (byte) 0, (int) (short) 1, (int) (short) 1);
        org.joda.time.DateTime dateTime61 = mutableDateTime51.toDateTimeISO();
        java.lang.Object obj62 = mutableDateTime51.clone();
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime51.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        long long68 = dateTimeZone66.convertUTCToLocal(2100000L);
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime(100L, dateTimeZone66);
        int int71 = dateTimeZone66.getOffsetFromLocal(1644573051593L);
        java.lang.String str73 = dateTimeZone66.getNameKey((long) 20);
        mutableDateTime51.setZone(dateTimeZone66);
        mutableDateTime45.setZone(dateTimeZone66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime51 and dateTime61", (mutableDateTime51.compareTo(dateTime61) == 0) == mutableDateTime51.equals(dateTime61));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("1969-12-29T00:00:00.000Z");
        java.lang.Object obj2 = mutableDateTime1.clone();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfEven();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) (short) 0, chronology9);
        boolean boolean11 = localDate7.isEqual((org.joda.time.ReadablePartial) localDate10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate7.toDateTimeAtStartOfDay(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime13.plus(readableDuration16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withChronology(chronology18);
        org.joda.time.DateTime dateTime21 = dateTime19.withWeekOfWeekyear(4);
        org.joda.time.DateTime.Property property22 = dateTime19.monthOfYear();
        org.joda.time.DateTime.Property property23 = dateTime19.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        int int28 = dateTimeZone26.getOffset((long) '4');
        long long30 = dateTimeZone26.nextTransition((long) 70);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        mutableDateTime32.addMonths((int) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime39.dayOfYear();
        boolean boolean41 = mutableDateTime39.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime39.setZone(dateTimeZone43);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(6048000000L, dateTimeZone43);
        mutableDateTime32.setZone(dateTimeZone43);
        long long48 = dateTimeZone26.getMillisKeepLocal(dateTimeZone43, (long) 'u');
        int int50 = dateTimeZone43.getStandardOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime51 = dateTime19.toMutableDateTime(dateTimeZone43);
        mutableDateTime4.setTime((org.joda.time.ReadableInstant) mutableDateTime51);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime4.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and mutableDateTime39", (dateTime13.compareTo(mutableDateTime39) == 0) == dateTime13.equals(mutableDateTime39));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.clockhourOfHalfday();
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale6 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology5, locale6, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale11 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket8.saveField(dateTimeFieldType9, "1970-01-01T00:00:00.000Z", locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology2, locale11);
        org.joda.time.DateTimeField dateTimeField14 = chronology2.millisOfDay();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology2);
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology18 = localTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.clockhourOfHalfday();
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket(0L, chronology21, locale22, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale27 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket24.saveField(dateTimeFieldType25, "1970-01-01T00:00:00.000Z", locale27);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology18, locale27);
        java.lang.String str30 = chronology18.toString();
        org.joda.time.DurationField durationField31 = chronology18.eras();
        org.joda.time.LocalTime localTime32 = org.joda.time.LocalTime.now(chronology18);
        int[] intArray34 = chronology2.get((org.joda.time.ReadablePartial) localTime32, (long) 35449917);
        org.joda.time.DateTimeField dateTimeField35 = chronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField36 = chronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField37 = chronology2.year();
        org.joda.time.DateTimeField dateTimeField38 = chronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField39 = dateTimeField38.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField39, and durationField31", !(durationField31.compareTo(durationField39) == 0) || (Math.signum(durationField31.compareTo(durationField31)) == Math.signum(durationField39.compareTo(durationField31))));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter3.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withDefaultYear(2022);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = localDateTime10.toDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 365, dateTimeZone13);
        int int17 = localDateTime16.getCenturyOfEra();
        org.joda.time.Chronology chronology18 = localDateTime16.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.months();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter6.withChronology(chronology18);
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = null;
        org.joda.time.format.DateTimeParser dateTimeParser22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter21, dateTimeParser22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter23.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter24.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter24.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now(dateTimeZone32);
        org.joda.time.DateTime dateTime34 = localDateTime29.toDateTime(dateTimeZone32);
        org.joda.time.Chronology chronology35 = localDateTime29.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.months();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter26.withChronology(chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter26.withPivotYear((java.lang.Integer) 12);
        org.joda.time.DateTimeZone dateTimeZone40 = dateTimeFormatter39.getZone();
        org.joda.time.Chronology chronology41 = chronology18.withZone(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime42 = org.joda.time.MutableDateTime.now(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(1644573257357L, dateTimeZone40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime34 and mutableDateTime42", (dateTime34.compareTo(mutableDateTime42) == 0) == dateTime34.equals(mutableDateTime42));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime11 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime.Property property12 = dateTime11.hourOfDay();
        org.joda.time.DateTime dateTime14 = dateTime11.minusSeconds(0);
        org.joda.time.DateTime dateTime16 = dateTime14.plusDays(1);
        org.joda.time.DateTime.Property property17 = dateTime16.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        int int22 = dateTimeZone20.getOffset((long) '4');
        long long24 = dateTimeZone20.previousTransition((long) ' ');
        org.joda.time.DateTime dateTime25 = dateTime16.toDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime25", (dateTime16.compareTo(dateTime25) == 0) == dateTime16.equals(dateTime25));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = property2.getFieldType();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.roundHalfEven();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.dayOfMonth();
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket(0L, chronology7, locale8, (java.lang.Integer) 0);
        long long12 = dateTimeParserBucket10.computeMillis(true);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 0, chronology14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) (short) 0, chronology17);
        boolean boolean19 = localDate15.isEqual((org.joda.time.ReadablePartial) localDate18);
        int int20 = localDate18.getDayOfWeek();
        org.joda.time.LocalDate.Property property21 = localDate18.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval24 = localDate18.toInterval(dateTimeZone23);
        long long26 = dateTimeZone23.convertUTCToLocal((long) 0);
        dateTimeParserBucket10.setZone(dateTimeZone23);
        long long30 = dateTimeZone23.convertLocalToUTC(0L, false);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime4.toMutableDateTime(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime33.dayOfYear();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) (short) 0, chronology36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long) (short) 0, chronology39);
        boolean boolean41 = localDate37.isEqual((org.joda.time.ReadablePartial) localDate40);
        int int42 = localDate40.getDayOfWeek();
        org.joda.time.LocalDate.Property property43 = localDate40.weekOfWeekyear();
        org.joda.time.LocalDate localDate44 = property43.roundFloorCopy();
        org.joda.time.LocalDate localDate45 = property43.roundCeilingCopy();
        org.joda.time.LocalDate localDate46 = property43.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.Interval interval49 = localDate46.toInterval(dateTimeZone48);
        mutableDateTime33.setZoneRetainFields(dateTimeZone48);
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime33.copy();
        org.joda.time.DateTimeZone dateTimeZone52 = mutableDateTime51.getZone();
        org.joda.time.MutableDateTime mutableDateTime53 = mutableDateTime31.toMutableDateTime(dateTimeZone52);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime53.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime31", (mutableDateTime1.compareTo(mutableDateTime31) == 0) == mutableDateTime1.equals(mutableDateTime31));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        org.joda.time.Instant instant10 = mutableDateTime1.toInstant();
        int int11 = mutableDateTime1.getWeekyear();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime1.dayOfYear();
        java.util.GregorianCalendar gregorianCalendar13 = mutableDateTime1.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = localDateTime16.toDateTime(dateTimeZone19);
        int int23 = dateTimeZone19.getOffsetFromLocal((long) ' ');
        java.lang.String str24 = dateTimeZone19.toString();
        int int26 = dateTimeZone19.getOffset((long) 2000);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone19);
        mutableDateTime1.setZone(dateTimeZone19);
        long long32 = dateTimeZone19.convertLocalToUTC((long) 516, true, (long) 392);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant10", (mutableDateTime1.compareTo(instant10) == 0) == mutableDateTime1.equals(instant10));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime11 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime.Property property12 = dateTime8.weekyear();
        org.joda.time.DateTime dateTime13 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime15 = dateTime13.minusWeeks((int) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime13.withWeekOfWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime19 = dateTime17.minusYears(52);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.ReadableDuration readableDuration23 = null;
        mutableDateTime21.add(readableDuration23, 3);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime21.millisOfSecond();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) (short) 0, chronology28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) (short) 0, chronology31);
        boolean boolean33 = localDate29.isEqual((org.joda.time.ReadablePartial) localDate32);
        int int34 = localDate32.getDayOfWeek();
        org.joda.time.LocalDate.Property property35 = localDate32.weekOfWeekyear();
        org.joda.time.LocalDate localDate36 = property35.roundFloorCopy();
        org.joda.time.LocalDate localDate37 = property35.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalDate localDate39 = localDate37.plus(readablePeriod38);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDate localDate41 = localDate37.minus(readablePeriod40);
        org.joda.time.LocalDate localDate43 = localDate41.withDayOfYear(100);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime46.dayOfYear();
        boolean boolean48 = mutableDateTime46.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime46.setZone(dateTimeZone50);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(6048000000L, dateTimeZone50);
        org.joda.time.DateTime dateTime53 = org.joda.time.DateTime.now(dateTimeZone50);
        long long55 = dateTimeZone50.convertUTCToLocal((long) 0);
        org.joda.time.DateTime dateTime56 = localDate43.toDateTimeAtCurrentTime(dateTimeZone50);
        mutableDateTime21.setZone(dateTimeZone50);
        boolean boolean58 = dateTime17.isBefore((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime21.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and mutableDateTime46", (dateTime8.compareTo(mutableDateTime46) == 0) == dateTime8.equals(mutableDateTime46));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        int int4 = dateTimeZone2.getOffset((long) '4');
        long long6 = dateTimeZone2.nextTransition((long) 70);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        mutableDateTime8.addMonths((int) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.dayOfYear();
        boolean boolean17 = mutableDateTime15.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime15.setZone(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(6048000000L, dateTimeZone19);
        mutableDateTime8.setZone(dateTimeZone19);
        long long24 = dateTimeZone2.getMillisKeepLocal(dateTimeZone19, (long) 'u');
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone19);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) (short) 0, chronology27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 0, chronology30);
        boolean boolean32 = localDate28.isEqual((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = localDate28.toDateTimeAtStartOfDay(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime37 = dateTime34.toDateTimeISO();
        org.joda.time.DateTime.Property property38 = dateTime37.hourOfDay();
        org.joda.time.DateTime dateTime40 = property38.addToCopy((long) (byte) -1);
        int int41 = dateTime40.getWeekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight42 = dateTime40.toDateMidnight();
        org.joda.time.Chronology chronology44 = null;
        java.util.Locale locale45 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket(0L, chronology44, locale45, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Chronology chronology51 = null;
        java.util.Locale locale52 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket(0L, chronology51, locale52, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale57 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket54.saveField(dateTimeFieldType55, "1970-01-01T00:00:00.000Z", locale57);
        dateTimeParserBucket47.saveField(dateTimeFieldType48, "1970-01-01T00:00:00.000Z", locale57);
        boolean boolean60 = dateMidnight42.isSupported(dateTimeFieldType48);
        boolean boolean61 = dateTime25.isSupported(dateTimeFieldType48);
        org.joda.time.LocalTime localTime62 = dateTime25.toLocalTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and dateTime34", (mutableDateTime15.compareTo(dateTime34) == 0) == mutableDateTime15.equals(dateTime34));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        mutableDateTime1.setMillis((long) (-1));
        mutableDateTime1.setMillis(1644573073768L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 0, chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 0, chronology15);
        boolean boolean17 = localDate13.isEqual((org.joda.time.ReadablePartial) localDate16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate13.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime22 = dateTime19.toDateTimeISO();
        org.joda.time.DateTime dateTime24 = dateTime22.plusSeconds(1);
        org.joda.time.DateTime.Property property25 = dateTime24.monthOfYear();
        org.joda.time.DateTime.Property property26 = dateTime24.monthOfYear();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime30 = dateTime24.withPeriodAdded(readablePeriod28, 2071);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) (short) 0, chronology32);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) (short) 0, chronology35);
        boolean boolean37 = localDate33.isEqual((org.joda.time.ReadablePartial) localDate36);
        int int38 = localDate36.getDayOfWeek();
        int int39 = localDate36.getMonthOfYear();
        int[] intArray40 = localDate36.getValues();
        int int41 = localDate36.getDayOfYear();
        org.joda.time.LocalDate localDate43 = localDate36.minusWeeks(3522);
        org.joda.time.Interval interval44 = localDate36.toInterval();
        org.joda.time.DateTime dateTime45 = localDate36.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime47 = dateTime45.plusMillis((int) '#');
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime49.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime51 = property50.getMutableDateTime();
        java.util.GregorianCalendar gregorianCalendar52 = mutableDateTime51.toGregorianCalendar();
        java.util.GregorianCalendar gregorianCalendar53 = mutableDateTime51.toGregorianCalendar();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType55 = dateTimeFieldType54.getRangeDurationType();
        boolean boolean56 = mutableDateTime51.isSupported(dateTimeFieldType54);
        java.lang.String str57 = dateTimeFieldType54.getName();
        java.lang.String str58 = dateTimeFieldType54.getName();
        org.joda.time.DateTime dateTime60 = dateTime45.withField(dateTimeFieldType54, (-15382));
        int int61 = dateTime45.getMillisOfSecond();
        boolean boolean62 = dateTime30.equals((java.lang.Object) dateTime45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime30", (mutableDateTime1.compareTo(dateTime30) == 0) == mutableDateTime1.equals(dateTime30));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 0, chronology3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        boolean boolean8 = localDate4.isEqual((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate4.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime13 = dateTime10.toDateTimeISO();
        org.joda.time.DateTime.Property property14 = dateTime13.weekOfWeekyear();
        boolean boolean15 = dateTimeZone1.equals((java.lang.Object) property14);
        org.joda.time.DateTime dateTime16 = property14.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime17 = property14.roundFloorCopy();
        org.joda.time.DateTime dateTime19 = property14.addWrapFieldToCopy(35449917);
        org.joda.time.DateTime dateTime20 = property14.roundHalfFloorCopy();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.minus(readableDuration21);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.dayOfYear();
        boolean boolean26 = mutableDateTime24.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime24.setZone(dateTimeZone28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableDateTime24.add(readablePeriod30, 4);
        mutableDateTime24.setTime((long) (short) 10);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime24.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = mutableDateTime24.toDateTime(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.minusWeeks(771);
        int int40 = dateTime20.compareTo((org.joda.time.ReadableInstant) dateTime39);
        java.util.GregorianCalendar gregorianCalendar41 = dateTime20.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime24 and dateTime37", (mutableDateTime24.compareTo(dateTime37) == 0) == mutableDateTime24.equals(dateTime37));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("1970-01-05T00:00:00.000Z");
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.dayOfYear();
        boolean boolean5 = mutableDateTime3.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime3.setZone(dateTimeZone7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        mutableDateTime3.add(readablePeriod9, 4);
        mutableDateTime3.setTime((long) (short) 10);
        int int14 = mutableDateTime3.getEra();
        org.joda.time.DateTime dateTime15 = mutableDateTime3.toDateTimeISO();
        boolean boolean16 = mutableDateTime1.isEqual((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale23 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket(0L, chronology22, locale23, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale28 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket25.saveField(dateTimeFieldType26, "1970-01-01T00:00:00.000Z", locale28);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology19, locale28);
        org.joda.time.DateTimeField dateTimeField31 = chronology19.millisOfDay();
        org.joda.time.DateTimeField dateTimeField32 = chronology19.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField33 = chronology19.weekyear();
        org.joda.time.DateTime dateTime34 = dateTime15.toDateTime(chronology19);
        org.joda.time.DateTime dateTime36 = dateTime34.withYear((int) (byte) 1);
        int int37 = dateTime36.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and dateTime34", (mutableDateTime3.compareTo(dateTime34) == 0) == mutableDateTime3.equals(dateTime34));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.getMutableDateTime();
        org.joda.time.Chronology chronology4 = null;
        mutableDateTime3.setChronology(chronology4);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime3.year();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        boolean boolean12 = mutableDateTime10.isAfterNow();
        boolean boolean13 = mutableDateTime8.isBefore((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime10.add(readableDuration14, (int) (short) 1);
        boolean boolean17 = mutableDateTime3.equals((java.lang.Object) readableDuration14);
        mutableDateTime3.addMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.dayOfYear();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) (short) 0, chronology25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) (short) 0, chronology28);
        boolean boolean30 = localDate26.isEqual((org.joda.time.ReadablePartial) localDate29);
        int int31 = localDate29.getDayOfWeek();
        org.joda.time.LocalDate.Property property32 = localDate29.weekOfWeekyear();
        org.joda.time.LocalDate localDate33 = property32.roundFloorCopy();
        org.joda.time.LocalDate localDate34 = property32.roundCeilingCopy();
        org.joda.time.LocalDate localDate35 = property32.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.Interval interval38 = localDate35.toInterval(dateTimeZone37);
        mutableDateTime22.setZoneRetainFields(dateTimeZone37);
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate(1646992302977L, dateTimeZone37);
        int int42 = dateTimeZone37.getOffset((long) 11);
        mutableDateTime3.setZone(dateTimeZone37);
        mutableDateTime3.setMillis((long) 53);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime47.dayOfYear();
        boolean boolean49 = mutableDateTime47.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime47.setZone(dateTimeZone51);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        mutableDateTime47.add(readablePeriod53, 4);
        mutableDateTime47.setTime((long) (short) 10);
        int int58 = mutableDateTime47.getEra();
        org.joda.time.DateTime dateTime59 = mutableDateTime47.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime47.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime61 = property60.roundHalfFloor();
        org.joda.time.ReadablePeriod readablePeriod62 = null;
        mutableDateTime61.add(readablePeriod62, 29);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        mutableDateTime61.add(readablePeriod65, 376);
        org.joda.time.LocalTime localTime69 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology70 = localTime69.getChronology();
        org.joda.time.DateTimeField dateTimeField71 = chronology70.clockhourOfHalfday();
        org.joda.time.Chronology chronology73 = null;
        java.util.Locale locale74 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket76 = new org.joda.time.format.DateTimeParserBucket(0L, chronology73, locale74, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale79 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket76.saveField(dateTimeFieldType77, "1970-01-01T00:00:00.000Z", locale79);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket81 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology70, locale79);
        java.lang.String str82 = chronology70.toString();
        org.joda.time.MutableDateTime mutableDateTime83 = org.joda.time.MutableDateTime.now(chronology70);
        org.joda.time.DateTimeField dateTimeField84 = chronology70.weekyear();
        int int86 = dateTimeField84.getMaximumValue(10L);
        int int88 = dateTimeField84.getMinimumValue((long) 6814);
        int int89 = mutableDateTime61.get(dateTimeField84);
        java.lang.String str90 = mutableDateTime61.toString();
        org.joda.time.MutableDateTime.Property property91 = mutableDateTime61.secondOfMinute();
        mutableDateTime3.setMillis((org.joda.time.ReadableInstant) mutableDateTime61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime61", (mutableDateTime3.compareTo(mutableDateTime61) == 0) == mutableDateTime3.equals(mutableDateTime61));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withChronology(chronology13);
        org.joda.time.DateTime.Property property15 = dateTime12.secondOfMinute();
        org.joda.time.DateTime dateTime17 = dateTime12.withMinuteOfHour((int) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar18 = dateTime17.toGregorianCalendar();
        org.joda.time.DateTime dateTime20 = dateTime17.withCenturyOfEra(4);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long26 = dateTimeZone22.convertLocalToUTC((long) 2039, true, (long) (byte) 100);
        org.joda.time.DateTime dateTime27 = dateTime20.toDateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime28 = dateTime27.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime29 = dateTime28.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime28", (dateTime20.compareTo(dateTime28) == 0) == dateTime20.equals(dateTime28));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = property2.getFieldType();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.roundFloor();
        boolean boolean5 = mutableDateTime4.isEqualNow();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.centuryOfEra();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.clockhourOfHalfday();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(0L, chronology15, locale16, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale21 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket18.saveField(dateTimeFieldType19, "1970-01-01T00:00:00.000Z", locale21);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology12, locale21);
        java.lang.String str24 = chronology12.toString();
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(chronology12);
        org.joda.time.DateTimeField dateTimeField26 = chronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField27 = chronology12.yearOfCentury();
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) 69, chronology12);
        org.joda.time.DateTimeField dateTimeField29 = chronology12.hourOfDay();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 70, chronology12);
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(chronology12);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(32928877987200403L, chronology12);
        mutableDateTime4.setChronology(chronology12);
        org.joda.time.DurationField durationField34 = chronology12.eras();
        org.joda.time.DurationField durationField35 = chronology12.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField34, durationField35, and durationField34", !(durationField34.compareTo(durationField35) == 0) || (Math.signum(durationField34.compareTo(durationField34)) == Math.signum(durationField35.compareTo(durationField34))));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        mutableDateTime1.setTime((long) (short) 10);
        int int12 = mutableDateTime1.getEra();
        org.joda.time.DateTime dateTime13 = mutableDateTime1.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime1.minuteOfHour();
        org.joda.time.DurationField durationField15 = property14.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime17 = property14.add(36);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.parse("1969-12-29T00:00:00.000Z");
        java.lang.Object obj20 = mutableDateTime19.clone();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundHalfEven();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) (short) 0, chronology24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) (short) 0, chronology27);
        boolean boolean29 = localDate25.isEqual((org.joda.time.ReadablePartial) localDate28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localDate25.toDateTimeAtStartOfDay(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime35 = dateTime31.plus(readableDuration34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = dateTime35.withChronology(chronology36);
        org.joda.time.DateTime dateTime39 = dateTime37.withWeekOfWeekyear(4);
        org.joda.time.DateTime.Property property40 = dateTime37.monthOfYear();
        org.joda.time.DateTime.Property property41 = dateTime37.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        int int46 = dateTimeZone44.getOffset((long) '4');
        long long48 = dateTimeZone44.nextTransition((long) 70);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = null;
        java.lang.String str52 = mutableDateTime50.toString(dateTimeFormatter51);
        mutableDateTime50.addMonths((int) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime57.dayOfYear();
        boolean boolean59 = mutableDateTime57.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime57.setZone(dateTimeZone61);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(6048000000L, dateTimeZone61);
        mutableDateTime50.setZone(dateTimeZone61);
        long long66 = dateTimeZone44.getMillisKeepLocal(dateTimeZone61, (long) 'u');
        int int68 = dateTimeZone61.getStandardOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime69 = dateTime37.toMutableDateTime(dateTimeZone61);
        mutableDateTime22.setTime((org.joda.time.ReadableInstant) mutableDateTime69);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        mutableDateTime69.setZone(dateTimeZone71);
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        mutableDateTime69.add(readablePeriod73, 303);
        mutableDateTime17.setMillis((org.joda.time.ReadableInstant) mutableDateTime69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and dateTime31", (mutableDateTime17.compareTo(dateTime31) == 0) == mutableDateTime17.equals(dateTime31));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        boolean boolean4 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime2.setZone(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(6048000000L, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = localDateTime13.toDateTime(dateTimeZone16);
        org.joda.time.Chronology chronology19 = localDateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.hourOfHalfday();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) '4', chronology19);
        org.joda.time.DurationField durationField22 = chronology19.years();
        org.joda.time.DurationField durationField23 = chronology19.halfdays();
        org.joda.time.DateTime dateTime24 = dateTime9.withChronology(chronology19);
        org.joda.time.DurationField durationField25 = chronology19.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime24", (dateTime9.compareTo(dateTime24) == 0) == dateTime9.equals(dateTime24));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(0L);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 0, chronology3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        boolean boolean8 = localDate4.isEqual((org.joda.time.ReadablePartial) localDate7);
        int int9 = localDate7.getDayOfWeek();
        org.joda.time.LocalDate.Property property10 = localDate7.weekOfWeekyear();
        org.joda.time.LocalDate localDate12 = property10.setCopy((int) (byte) 1);
        boolean boolean13 = mutableDateTime1.equals((java.lang.Object) property10);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.dayOfYear();
        boolean boolean24 = mutableDateTime22.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime22.setZone(dateTimeZone26);
        long long29 = dateTimeZone26.nextTransition((long) '4');
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((int) (byte) -1, 2, 5, 4, (int) (short) 0, 0, 100, dateTimeZone26);
        org.joda.time.Chronology chronology31 = dateTime30.getChronology();
        org.joda.time.DateTime dateTime32 = mutableDateTime1.toDateTime(chronology31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime1.minuteOfDay();
        java.util.Date date34 = mutableDateTime1.toDate();
        org.joda.time.LocalDate localDate35 = org.joda.time.LocalDate.fromDateFields(date34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime22", (mutableDateTime1.compareTo(mutableDateTime22) == 0) == mutableDateTime1.equals(mutableDateTime22));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.minuteOfHour();
        int int4 = property3.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime6 = property3.add((int) 'x');
        org.joda.time.MutableDateTime mutableDateTime7 = property3.roundCeiling();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.clockhourOfHalfday();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology13, locale14, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale19 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket16.saveField(dateTimeFieldType17, "1970-01-01T00:00:00.000Z", locale19);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology10, locale19);
        java.lang.String str22 = chronology10.toString();
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(chronology10);
        org.joda.time.DateTimeField dateTimeField24 = chronology10.weekyear();
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(chronology10);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        org.joda.time.ReadableDuration readableDuration29 = null;
        mutableDateTime27.add(readableDuration29, 3);
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime27.getZone();
        int int34 = dateTimeZone32.getOffset((long) (byte) 1);
        org.joda.time.Chronology chronology35 = chronology10.withZone(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField36 = chronology10.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField37 = chronology10.secondOfDay();
        org.joda.time.Chronology chronology38 = chronology10.withUTC();
        org.joda.time.DurationField durationField39 = chronology10.years();
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime7, chronology10);
        org.joda.time.DateTimeField dateTimeField41 = chronology10.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime40", (mutableDateTime2.compareTo(mutableDateTime40) == 0) == mutableDateTime2.equals(mutableDateTime40));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withChronology(chronology13);
        org.joda.time.DateTime.Property property15 = dateTime12.secondOfMinute();
        org.joda.time.DateTime dateTime17 = dateTime12.withMinuteOfHour((int) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar18 = dateTime17.toGregorianCalendar();
        org.joda.time.DateTime dateTime20 = dateTime17.withCenturyOfEra(4);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long26 = dateTimeZone22.convertLocalToUTC((long) 2039, true, (long) (byte) 100);
        org.joda.time.DateTime dateTime27 = dateTime20.toDateTime(dateTimeZone22);
        java.util.Date date28 = dateTime20.toDate();
        org.joda.time.DateTime dateTime30 = dateTime20.withMillis(1644796800036L);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) (short) 0, chronology32);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) (short) 0, chronology35);
        boolean boolean37 = localDate33.isEqual((org.joda.time.ReadablePartial) localDate36);
        int int38 = localDate36.getDayOfWeek();
        int int39 = localDate36.getMonthOfYear();
        int int40 = localDate36.getCenturyOfEra();
        org.joda.time.LocalDate localDate42 = localDate36.minusWeeks(42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) (short) 0, chronology44);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((long) (short) 0, chronology47);
        boolean boolean49 = localDate45.isEqual((org.joda.time.ReadablePartial) localDate48);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = localDate45.toDateTimeAtStartOfDay(dateTimeZone50);
        org.joda.time.DateTime dateTime53 = dateTime51.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.DateTime dateTime55 = dateTime51.plus(readableDuration54);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTime dateTime57 = dateTime55.withChronology(chronology56);
        org.joda.time.DateTime.Property property58 = dateTime55.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.DateTime dateTime60 = dateTime55.minus(readableDuration59);
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime((long) 0);
        int int63 = mutableDateTime62.getEra();
        org.joda.time.Chronology chronology64 = null;
        mutableDateTime62.setChronology(chronology64);
        boolean boolean66 = dateTime55.isBefore((org.joda.time.ReadableInstant) mutableDateTime62);
        org.joda.time.DateTime dateTime68 = dateTime55.minusYears(3600000);
        int int69 = dateTime55.getDayOfWeek();
        org.joda.time.DateTime dateTime70 = localDate42.toDateTime((org.joda.time.ReadableInstant) dateTime55);
        int int71 = dateTime70.getMinuteOfDay();
        org.joda.time.DateTime.Property property72 = dateTime70.millisOfDay();
        int int73 = dateTime20.compareTo((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.DateTime.Property property74 = dateTime70.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime27", (dateTime20.compareTo(dateTime27) == 0) == dateTime20.equals(dateTime27));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime3.toDateTime(dateTimeZone6);
        org.joda.time.Chronology chronology9 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.hours();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.era();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone14 = chronology9.getZone();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 365, dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone14);
        long long19 = dateTimeZone14.adjustOffset((long) 35654, true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and mutableDateTime16", (dateTime8.compareTo(mutableDateTime16) == 0) == dateTime8.equals(mutableDateTime16));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology5 = localTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.clockhourOfHalfday();
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket(0L, chronology8, locale9, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket11.saveField(dateTimeFieldType12, "1970-01-01T00:00:00.000Z", locale14);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology5, locale14);
        java.lang.String str17 = chronology5.toString();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology5);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = chronology5.add(readablePeriod19, 345600050L, (int) (short) 0);
        mutableDateTime1.setChronology(chronology5);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        int int29 = dateTimeZone27.getOffset((long) '4');
        long long31 = dateTimeZone27.nextTransition((long) 70);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        mutableDateTime33.addMonths((int) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime40.dayOfYear();
        boolean boolean42 = mutableDateTime40.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime40.setZone(dateTimeZone44);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(6048000000L, dateTimeZone44);
        mutableDateTime33.setZone(dateTimeZone44);
        long long49 = dateTimeZone27.getMillisKeepLocal(dateTimeZone44, (long) 'u');
        org.joda.time.DateTime dateTime50 = org.joda.time.DateTime.now(dateTimeZone44);
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime1.toMutableDateTime(dateTimeZone44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime18 and dateTime50", (mutableDateTime18.compareTo(dateTime50) == 0) == mutableDateTime18.equals(dateTime50));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        int int2 = mutableDateTime1.getEra();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.year();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 0, chronology8);
        boolean boolean10 = localDate6.isEqual((org.joda.time.ReadablePartial) localDate9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate6.toDateTimeAtStartOfDay(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime15 = dateTime12.toDateTimeISO();
        org.joda.time.DateTime.Property property16 = dateTime12.weekyear();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.Instant instant18 = mutableDateTime1.toInstant();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        mutableDateTime20.addMonths((int) (byte) 1);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.year();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) (short) 0, chronology27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 0, chronology30);
        boolean boolean32 = localDate28.isEqual((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime34.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property35.getFieldType();
        org.joda.time.LocalDate.Property property37 = localDate31.property(dateTimeFieldType36);
        org.joda.time.DurationFieldType durationFieldType38 = dateTimeFieldType36.getRangeDurationType();
        mutableDateTime20.add(durationFieldType38, (int) (byte) 1);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime20.yearOfCentury();
        mutableDateTime20.addHours(32);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime20.monthOfYear();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) (short) 0, chronology46);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((long) (short) 0, chronology49);
        boolean boolean51 = localDate47.isEqual((org.joda.time.ReadablePartial) localDate50);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime53.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property54.getFieldType();
        org.joda.time.LocalDate.Property property56 = localDate50.property(dateTimeFieldType55);
        org.joda.time.LocalDate localDate58 = property56.addToCopy((int) (byte) 10);
        java.util.Locale locale60 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str61 = localDate58.toString("1970", locale60);
        int int62 = property44.getMaximumShortTextLength(locale60);
        int int63 = property44.getMinimumValue();
        boolean boolean64 = mutableDateTime1.equals((java.lang.Object) property44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant18", (dateTime12.compareTo(instant18) == 0) == dateTime12.equals(instant18));
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) 0, chronology7);
        boolean boolean9 = localDate5.isEqual((org.joda.time.ReadablePartial) localDate8);
        int int10 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate.Property property11 = localDate8.weekOfWeekyear();
        org.joda.time.LocalDate localDate12 = property11.roundFloorCopy();
        org.joda.time.LocalDate localDate13 = property11.roundCeilingCopy();
        org.joda.time.LocalDate localDate14 = property11.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.Interval interval17 = localDate14.toInterval(dateTimeZone16);
        mutableDateTime1.setZoneRetainFields(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime19.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime22 = dateTime20.minusMillis(52);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime31.dayOfYear();
        boolean boolean33 = mutableDateTime31.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime31.setZone(dateTimeZone35);
        long long38 = dateTimeZone35.nextTransition((long) '4');
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((int) (byte) -1, 2, 5, 4, (int) (short) 0, 0, 100, dateTimeZone35);
        java.lang.String str41 = dateTimeZone35.getNameKey((long) (byte) 100);
        long long44 = dateTimeZone35.adjustOffset(25260020L, true);
        long long47 = dateTimeZone35.adjustOffset(0L, true);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(dateTimeZone35);
        boolean boolean49 = dateTime20.isAfter((org.joda.time.ReadableInstant) mutableDateTime48);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate((long) (short) 0, chronology51);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((long) (short) 0, chronology54);
        boolean boolean56 = localDate52.isEqual((org.joda.time.ReadablePartial) localDate55);
        int int57 = localDate55.getDayOfWeek();
        org.joda.time.LocalDate.Property property58 = localDate55.weekOfWeekyear();
        org.joda.time.LocalDate localDate59 = property58.roundFloorCopy();
        int int60 = localDate59.size();
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.LocalDate localDate62 = localDate59.minus(readablePeriod61);
        org.joda.time.DateTime dateTime63 = localDate59.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate65 = localDate59.minusYears(1);
        int int66 = localDate59.getCenturyOfEra();
        org.joda.time.DateMidnight dateMidnight67 = localDate59.toDateMidnight();
        org.joda.time.Chronology chronology68 = localDate59.getChronology();
        org.joda.time.DateTimeField dateTimeField69 = chronology68.halfdayOfDay();
        org.joda.time.Chronology chronology70 = chronology68.withUTC();
        org.joda.time.MutableDateTime mutableDateTime71 = org.joda.time.MutableDateTime.now(chronology70);
        org.joda.time.DateTimeField dateTimeField72 = chronology70.hourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime(chronology70);
        org.joda.time.DateTime dateTime74 = dateTime20.withChronology(chronology70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and mutableDateTime48", (dateTime20.compareTo(mutableDateTime48) == 0) == dateTime20.equals(mutableDateTime48));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now(dateTimeZone5);
        org.joda.time.DateTime dateTime7 = localDateTime2.toDateTime(dateTimeZone5);
        org.joda.time.Chronology chronology8 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.hourOfHalfday();
        org.joda.time.DurationField durationField10 = chronology8.seconds();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.hourOfHalfday();
        org.joda.time.Chronology chronology12 = chronology8.withUTC();
        org.joda.time.DurationField durationField13 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField13", Math.signum(durationField10.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField10)));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        mutableDateTime1.setMillisOfSecond(0);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.getMutableDateTime();
        int int16 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime15);
        int int17 = mutableDateTime1.getSecondOfDay();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime1.year();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.clockhourOfHalfday();
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket(0L, chronology24, locale25, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket27.saveField(dateTimeFieldType28, "1970-01-01T00:00:00.000Z", locale30);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology21, locale30);
        java.lang.String str33 = chronology21.toString();
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now(chronology21);
        org.joda.time.DateTimeField dateTimeField35 = chronology21.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        org.joda.time.Chronology chronology39 = chronology21.withZone(dateTimeZone38);
        org.joda.time.DurationField durationField40 = chronology39.hours();
        org.joda.time.DateTimeField dateTimeField41 = chronology39.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime1, chronology39);
        org.joda.time.DateTime dateTime43 = mutableDateTime1.toDateTime();
        org.joda.time.ReadableInstant readableInstant44 = null;
        boolean boolean45 = mutableDateTime1.isEqual(readableInstant44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime42 and dateTime43", (mutableDateTime42.compareTo(dateTime43) == 0) == mutableDateTime42.equals(dateTime43));
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology5 = localTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.clockhourOfHalfday();
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket(0L, chronology8, locale9, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket11.saveField(dateTimeFieldType12, "1970-01-01T00:00:00.000Z", locale14);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology5, locale14);
        java.lang.String str17 = chronology5.toString();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology5);
        org.joda.time.DateTimeField dateTimeField19 = chronology5.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = chronology5.yearOfCentury();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) 69, chronology5);
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType1.getField(chronology5);
        java.util.Locale locale23 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology5, locale23);
        dateTimeParserBucket24.setOffset(53);
        java.lang.Integer int27 = dateTimeParserBucket24.getOffsetInteger();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.dayOfYear();
        int int31 = property30.getMinimumValueOverall();
        org.joda.time.DurationField durationField32 = property30.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime34 = property30.add(0);
        mutableDateTime34.setMillis((-36000000L));
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime38.dayOfYear();
        boolean boolean40 = mutableDateTime38.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime38.setZone(dateTimeZone42);
        long long45 = dateTimeZone42.nextTransition((long) '4');
        org.joda.time.MutableDateTime mutableDateTime46 = org.joda.time.MutableDateTime.now(dateTimeZone42);
        org.joda.time.ReadableDuration readableDuration47 = null;
        mutableDateTime46.add(readableDuration47);
        boolean boolean49 = mutableDateTime34.equals((java.lang.Object) readableDuration47);
        int int50 = mutableDateTime34.getMinuteOfDay();
        org.joda.time.ReadableDuration readableDuration51 = null;
        mutableDateTime34.add(readableDuration51);
        boolean boolean53 = dateTimeParserBucket24.restoreState((java.lang.Object) mutableDateTime34);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime34.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime18 and mutableDateTime46", (mutableDateTime18.compareTo(mutableDateTime46) == 0) == mutableDateTime18.equals(mutableDateTime46));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket(0L, chronology9, locale10, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale15 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket12.saveField(dateTimeFieldType13, "1970-01-01T00:00:00.000Z", locale15);
        dateTimeParserBucket5.saveField(dateTimeFieldType6, "1970-01-01T00:00:00.000Z", locale15);
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(0L, chronology19, locale20, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale25 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket22.saveField(dateTimeFieldType23, "1970-01-01T00:00:00.000Z", locale25);
        java.lang.String str27 = locale15.getDisplayCountry(locale25);
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology29, locale30, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Chronology chronology36 = null;
        java.util.Locale locale37 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket(0L, chronology36, locale37, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale42 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket39.saveField(dateTimeFieldType40, "1970-01-01T00:00:00.000Z", locale42);
        dateTimeParserBucket32.saveField(dateTimeFieldType33, "1970-01-01T00:00:00.000Z", locale42);
        org.joda.time.Chronology chronology46 = null;
        java.util.Locale locale47 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket(0L, chronology46, locale47, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale52 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket49.saveField(dateTimeFieldType50, "1970-01-01T00:00:00.000Z", locale52);
        java.lang.String str54 = locale42.getDisplayCountry(locale52);
        java.lang.String str55 = locale25.getDisplayVariant(locale42);
        java.util.Locale.setDefault(category0, locale25);
        java.util.Locale locale57 = java.util.Locale.getDefault(category0);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate((long) (short) 0, chronology59);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate((long) (short) 0, chronology62);
        boolean boolean64 = localDate60.isEqual((org.joda.time.ReadablePartial) localDate63);
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateTime dateTime66 = localDate60.toDateTimeAtStartOfDay(dateTimeZone65);
        org.joda.time.DateTime dateTime68 = dateTime66.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration69 = null;
        org.joda.time.DateTime dateTime70 = dateTime66.plus(readableDuration69);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.DateTime dateTime72 = dateTime70.withChronology(chronology71);
        org.joda.time.DateTime.Property property73 = dateTime70.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration74 = null;
        org.joda.time.DateTime dateTime75 = dateTime70.minus(readableDuration74);
        org.joda.time.DateTime.Property property76 = dateTime70.centuryOfEra();
        org.joda.time.DateTime dateTime77 = property76.roundCeilingCopy();
        org.joda.time.DateTime dateTime78 = property76.roundFloorCopy();
        org.joda.time.DateTime dateTime80 = dateTime78.plusMonths((int) (byte) 100);
        org.joda.time.Instant instant81 = dateTime80.toInstant();
        org.joda.time.Instant instant82 = instant81.toInstant();
        boolean boolean83 = locale57.equals((java.lang.Object) instant81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime80 and instant81", (dateTime80.compareTo(instant81) == 0) == dateTime80.equals(instant81));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        org.joda.time.DurationField durationField3 = property2.getLeapDurationField();
        java.lang.String str4 = property2.getAsText();
        org.joda.time.MutableDateTime mutableDateTime5 = property2.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = property2.roundCeiling();
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime6.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime6.set(dateTimeFieldType8, 6694);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = localDateTime14.toDateTime(dateTimeZone17);
        org.joda.time.Chronology chronology20 = localDateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.hourOfHalfday();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) '4', chronology20);
        org.joda.time.DurationField durationField23 = chronology20.days();
        org.joda.time.DateTimeField dateTimeField24 = chronology20.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime6.toMutableDateTime(chronology20);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime6.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and mutableDateTime25", (mutableDateTime6.compareTo(mutableDateTime25) == 0) == mutableDateTime6.equals(mutableDateTime25));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 0);
        int int5 = dateTimeParserBucket4.getOffset();
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 23);
        java.util.Locale locale8 = dateTimeParserBucket4.getLocale();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        boolean boolean12 = mutableDateTime10.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime10.setZone(dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime10.add(readablePeriod16, 4);
        mutableDateTime10.setTime((long) (short) 10);
        int int21 = mutableDateTime10.getEra();
        org.joda.time.DateTime dateTime22 = mutableDateTime10.toDateTimeISO();
        int int23 = mutableDateTime10.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime10.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withMillisOfDay(100);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.plus(readableDuration30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.era();
        int int33 = localDateTime31.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime31.minusMillis(36000000);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime31.plusMonths(41);
        org.joda.time.Chronology chronology38 = localDateTime31.getChronology();
        org.joda.time.DateTimeZone dateTimeZone39 = chronology38.getZone();
        org.joda.time.DateTime dateTime40 = mutableDateTime10.toDateTime(dateTimeZone39);
        dateTimeParserBucket4.setZone(dateTimeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and dateTime40", (mutableDateTime10.compareTo(dateTime40) == 0) == mutableDateTime10.equals(dateTime40));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        mutableDateTime1.setMillisOfSecond(0);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.getMutableDateTime();
        int int16 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime15);
        java.lang.Object obj17 = mutableDateTime15.clone();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.clockhourOfHalfday();
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket(0L, chronology24, locale25, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket27.saveField(dateTimeFieldType28, "1970-01-01T00:00:00.000Z", locale30);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology21, locale30);
        java.lang.String str33 = chronology21.toString();
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now(chronology21);
        org.joda.time.DateTimeField dateTimeField35 = chronology21.weekyear();
        org.joda.time.Chronology chronology36 = chronology21.withUTC();
        org.joda.time.DurationField durationField37 = chronology21.minutes();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalTime localTime41 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology42 = localTime41.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.clockhourOfHalfday();
        org.joda.time.Chronology chronology45 = null;
        java.util.Locale locale46 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket(0L, chronology45, locale46, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale51 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket48.saveField(dateTimeFieldType49, "1970-01-01T00:00:00.000Z", locale51);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology42, locale51);
        java.lang.String str54 = locale51.getISO3Country();
        java.lang.String str55 = locale51.getISO3Country();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket(0L, chronology39, locale51, (java.lang.Integer) 3);
        java.lang.String str58 = locale51.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket(0L, chronology21, locale51);
        org.joda.time.DateTimeField dateTimeField60 = chronology21.year();
        org.joda.time.DateTimeField dateTimeField61 = chronology21.dayOfWeek();
        org.joda.time.DateTime dateTime62 = org.joda.time.DateTime.now(chronology21);
        org.joda.time.DateTime dateTime64 = dateTime62.plusWeeks(35602255);
        mutableDateTime15.setMillis((org.joda.time.ReadableInstant) dateTime62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and mutableDateTime34", (mutableDateTime15.compareTo(mutableDateTime34) == 0) == mutableDateTime15.equals(mutableDateTime34));
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(29, (int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(3602022L, dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundCeiling();
        org.joda.time.Instant instant7 = mutableDateTime6.toInstant();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and instant7", (mutableDateTime6.compareTo(instant7) == 0) == mutableDateTime6.equals(instant7));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        org.joda.time.Instant instant10 = mutableDateTime1.toInstant();
        mutableDateTime1.addYears((int) (short) 10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.centuryOfEra();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 0, chronology15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 0, chronology18);
        boolean boolean20 = localDate16.isEqual((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate16.toDateTimeAtStartOfDay(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime25 = dateTime22.toDateTimeISO();
        org.joda.time.DateTime.Property property26 = dateTime25.weekOfWeekyear();
        org.joda.time.DateTime dateTime27 = property26.roundFloorCopy();
        int int28 = property26.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property26.getFieldType();
        org.joda.time.DateTime dateTime30 = property26.getDateTime();
        org.joda.time.DateTime dateTime32 = property26.addToCopy((long) 42870637);
        int int33 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.parse("1969-12-29T00:00:00.000Z");
        mutableDateTime35.setMillisOfDay(51);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime39.dayOfYear();
        boolean boolean41 = mutableDateTime39.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime39.setZone(dateTimeZone43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        mutableDateTime39.add(readablePeriod45, 4);
        mutableDateTime39.setMillisOfSecond(0);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime51.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime53 = property52.getMutableDateTime();
        int int54 = mutableDateTime39.compareTo((org.joda.time.ReadableInstant) mutableDateTime53);
        int int55 = mutableDateTime39.getSecondOfDay();
        java.util.Date date56 = mutableDateTime39.toDate();
        java.lang.String str57 = mutableDateTime39.toString();
        int int58 = mutableDateTime39.getWeekyear();
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime39.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType61 = dateTimeFieldType60.getRangeDurationType();
        mutableDateTime39.set(dateTimeFieldType60, 18);
        mutableDateTime35.set(dateTimeFieldType60, 100);
        java.lang.String str66 = dateTimeFieldType60.getName();
        boolean boolean67 = mutableDateTime1.isSupported(dateTimeFieldType60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime51", (instant10.compareTo(mutableDateTime51) == 0) == instant10.equals(mutableDateTime51));
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withChronology(chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.withChronology(chronology15);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property19.getFieldType();
        org.joda.time.DateTime.Property property21 = dateTime16.property(dateTimeFieldType20);
        org.joda.time.DateTime dateTime22 = property21.withMaximumValue();
        org.joda.time.DateTime dateTime24 = dateTime22.withMillisOfDay((int) 'a');
        int int25 = dateTime24.getMillisOfSecond();
        org.joda.time.DateTime.Property property26 = dateTime24.dayOfYear();
        org.joda.time.DateTime dateTime27 = property26.roundHalfEvenCopy();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.dayOfYear();
        boolean boolean31 = mutableDateTime29.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime29.setZone(dateTimeZone33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime29.add(readablePeriod35, 4);
        org.joda.time.Instant instant38 = mutableDateTime29.toInstant();
        boolean boolean40 = mutableDateTime29.isAfter((long) (byte) 1);
        mutableDateTime29.addWeekyears(69);
        mutableDateTime29.setSecondOfDay(3);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime29.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime47 = property45.addWrapField(2000);
        org.joda.time.MutableDateTime mutableDateTime48 = property45.roundHalfCeiling();
        org.joda.time.Chronology chronology50 = null;
        java.util.Locale locale51 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket(0L, chronology50, locale51, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Chronology chronology57 = null;
        java.util.Locale locale58 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket(0L, chronology57, locale58, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale63 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket60.saveField(dateTimeFieldType61, "1970-01-01T00:00:00.000Z", locale63);
        dateTimeParserBucket53.saveField(dateTimeFieldType54, "1970-01-01T00:00:00.000Z", locale63);
        java.lang.Integer int66 = dateTimeParserBucket53.getPivotYear();
        java.util.Locale locale67 = dateTimeParserBucket53.getLocale();
        java.lang.String str68 = locale67.getVariant();
        int int69 = property45.getMaximumTextLength(locale67);
        java.lang.String str70 = property26.getAsText(locale67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime18 and instant38", (mutableDateTime18.compareTo(instant38) == 0) == mutableDateTime18.equals(instant38));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser5 = dateTimeFormatter2.getParser();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = localDateTime9.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology15 = localDateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.hourOfHalfday();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) '4', chronology15);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now(dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withMillisOfDay(100);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.plus(readableDuration23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.era();
        long long27 = chronology15.set((org.joda.time.ReadablePartial) localDateTime24, (long) 22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter2.withChronology(chronology15);
        org.joda.time.DateTimeField dateTimeField29 = chronology15.weekOfWeekyear();
        long long33 = chronology15.add((-67L), 3601987L, 238);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(chronology15);
        org.joda.time.DateTime dateTime35 = dateTime34.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property36 = dateTime34.dayOfWeek();
        int int37 = property36.getMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime34", (dateTime14.compareTo(dateTime34) == 0) == dateTime14.equals(dateTime34));
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0);
        int int3 = mutableDateTime2.getEra();
        org.joda.time.Chronology chronology4 = null;
        mutableDateTime2.setChronology(chronology4);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property8.getFieldType();
        mutableDateTime2.set(dateTimeFieldType9, (int) '4');
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology14 = localTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.clockhourOfHalfday();
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(0L, chronology17, locale18, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket20.saveField(dateTimeFieldType21, "1970-01-01T00:00:00.000Z", locale23);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology14, locale23);
        java.lang.String str26 = chronology14.toString();
        org.joda.time.DurationField durationField27 = chronology14.eras();
        boolean boolean28 = dateTimeFieldType9.isSupported(chronology14);
        org.joda.time.DateTimeField dateTimeField29 = chronology14.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField30 = chronology14.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) 52, chronology14);
        org.joda.time.DurationField durationField32 = chronology14.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField32, and durationField27", !(durationField27.compareTo(durationField32) == 0) || (Math.signum(durationField27.compareTo(durationField27)) == Math.signum(durationField32.compareTo(durationField27))));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        mutableDateTime1.setMillisOfSecond(0);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.getMutableDateTime();
        int int16 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 0, chronology18);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) (short) 0, chronology21);
        boolean boolean23 = localDate19.isEqual((org.joda.time.ReadablePartial) localDate22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDate19.toDateTimeAtStartOfDay(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime28 = dateTime25.toDateTimeISO();
        org.joda.time.DateTime.Property property29 = dateTime28.hourOfDay();
        org.joda.time.DateTime dateTime31 = property29.addToCopy((long) (byte) -1);
        int int32 = dateTime31.getWeekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight33 = dateTime31.toDateMidnight();
        mutableDateTime15.setMillis((org.joda.time.ReadableInstant) dateMidnight33);
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime15.toMutableDateTime();
        org.joda.time.Instant instant36 = mutableDateTime15.toInstant();
        org.joda.time.LocalDate localDate37 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property38 = localDate37.era();
        org.joda.time.LocalDate localDate39 = property38.roundFloorCopy();
        org.joda.time.LocalDate localDate41 = localDate39.minusDays(45);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(238, (int) (byte) 10);
        long long47 = dateTimeZone44.adjustOffset((long) 97, true);
        org.joda.time.DateTime dateTime48 = localDate39.toDateTimeAtMidnight(dateTimeZone44);
        org.joda.time.YearMonthDay yearMonthDay49 = dateTime48.toYearMonthDay();
        org.joda.time.DateTime dateTime51 = dateTime48.plusHours(258);
        boolean boolean52 = mutableDateTime15.isBefore((org.joda.time.ReadableInstant) dateTime51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and instant36", (mutableDateTime15.compareTo(instant36) == 0) == mutableDateTime15.equals(instant36));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = property2.getFieldType();
        org.joda.time.MutableDateTime mutableDateTime5 = property2.addWrapField(4);
        java.lang.String str6 = mutableDateTime5.toString();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfYear();
        long long10 = property9.remainder();
        org.joda.time.MutableDateTime mutableDateTime12 = property9.set((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime12.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.monthOfYear();
        org.joda.time.DateTimeField dateTimeField19 = property18.getField();
        org.joda.time.LocalDateTime localDateTime20 = property18.withMaximumValue();
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.minusSeconds(35471531);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minus(readablePeriod26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusDays((int) 'a');
        int int30 = localDateTime27.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.minusSeconds(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType34 = dateTimeFieldType33.getRangeDurationType();
        boolean boolean35 = localDateTime27.isSupported(durationFieldType34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime20.withFieldAdded(durationFieldType34, 25);
        mutableDateTime12.add(durationFieldType34, (-15382));
        mutableDateTime5.setMillis((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        long long45 = dateTimeZone43.convertUTCToLocal(2100000L);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(100L, dateTimeZone43);
        int int48 = dateTimeZone43.getOffsetFromLocal(1644573051593L);
        java.lang.String str50 = dateTimeZone43.getNameKey((long) 20);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime53 = org.joda.time.LocalDateTime.now(dateTimeZone52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.monthOfYear();
        org.joda.time.LocalDateTime.Property property55 = localDateTime53.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.LocalDateTime localDateTime57 = localDateTime53.plus(readablePeriod56);
        org.joda.time.Chronology chronology59 = null;
        java.util.Locale locale60 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket62 = new org.joda.time.format.DateTimeParserBucket(0L, chronology59, locale60, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale65 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket62.saveField(dateTimeFieldType63, "1970-01-01T00:00:00.000Z", locale65);
        org.joda.time.LocalDateTime.Property property67 = localDateTime57.property(dateTimeFieldType63);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime57.minusYears(53);
        org.joda.time.LocalDateTime.Property property70 = localDateTime57.secondOfMinute();
        boolean boolean71 = dateTimeZone43.isLocalDateTimeGap(localDateTime57);
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime((java.lang.Object) mutableDateTime12, dateTimeZone43);
        int int73 = mutableDateTime12.getCenturyOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime72", (mutableDateTime1.compareTo(dateTime72) == 0) == mutableDateTime1.equals(dateTime72));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime3.toDateTime(dateTimeZone6);
        org.joda.time.Chronology chronology9 = localDateTime3.getChronology();
        org.joda.time.LocalDateTime.Property property10 = localDateTime3.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime12 = property10.addToCopy((long) 4);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusMinutes((int) 'x');
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTime dateTime17 = localDateTime14.toDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(3577992076L, dateTimeZone16);
        boolean boolean21 = dateTimeZone16.isStandardOffset((long) 18130);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone16);
        int int24 = dateTimeZone16.getOffsetFromLocal(1L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and mutableDateTime22", (dateTime8.compareTo(mutableDateTime22) == 0) == dateTime8.equals(mutableDateTime22));
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        mutableDateTime1.setZoneRetainFields(dateTimeZone4);
        mutableDateTime1.addMillis(0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        int int12 = dateTimeZone10.getOffset((long) '4');
        mutableDateTime1.setZoneRetainFields(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.parse("1969-12-29T00:00:00.000Z");
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.minuteOfHour();
        int int18 = property17.getMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime15", (mutableDateTime1.compareTo(mutableDateTime15) == 0) == mutableDateTime1.equals(mutableDateTime15));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.weekOfWeekyear();
        org.joda.time.LocalDate localDate3 = property1.addWrapFieldToCopy(1970);
        org.joda.time.DateTime dateTime4 = localDate3.toDateTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime();
        mutableDateTime5.addWeeks(2);
        int int8 = mutableDateTime5.getDayOfMonth();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) (short) 0, chronology10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (short) 0, chronology13);
        boolean boolean15 = localDate11.isEqual((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate11.toDateTimeAtStartOfDay(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.minusSeconds((int) (byte) 100);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) (short) 0, chronology21);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) (short) 0, chronology24);
        boolean boolean26 = localDate22.isEqual((org.joda.time.ReadablePartial) localDate25);
        int int27 = localDate25.getDayOfWeek();
        org.joda.time.LocalDate.Property property28 = localDate25.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval31 = localDate25.toInterval(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = dateTime19.toDateTime(dateTimeZone30);
        boolean boolean33 = mutableDateTime5.isEqual((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.dayOfYear();
        boolean boolean37 = mutableDateTime35.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime35.setZone(dateTimeZone39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        mutableDateTime35.add(readablePeriod41, 4);
        mutableDateTime35.setTime((long) (short) 10);
        int int46 = mutableDateTime35.getEra();
        org.joda.time.DateTime dateTime47 = mutableDateTime35.toDateTimeISO();
        int int48 = mutableDateTime35.getWeekOfWeekyear();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) (short) 0, chronology50);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate((long) (short) 0, chronology53);
        boolean boolean55 = localDate51.isEqual((org.joda.time.ReadablePartial) localDate54);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = localDate51.toDateTimeAtStartOfDay(dateTimeZone56);
        org.joda.time.DateTime dateTime59 = dateTime57.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime60 = dateTime57.toDateTimeISO();
        org.joda.time.DateTime dateTime62 = dateTime60.plusMinutes((int) (byte) 1);
        org.joda.time.DateTime dateTime64 = dateTime60.minusDays(2039);
        int int65 = dateTime60.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone66 = dateTime60.getZone();
        int int68 = dateTimeZone66.getStandardOffset(100L);
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime(dateTimeZone66);
        mutableDateTime35.setZoneRetainFields(dateTimeZone66);
        boolean boolean72 = dateTimeZone66.isStandardOffset(11581401599965L);
        org.joda.time.DateTime dateTime73 = dateTime32.withZone(dateTimeZone66);
        org.joda.time.DateTime dateTime74 = localDate3.toDateTimeAtStartOfDay(dateTimeZone66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime32", (dateTime19.compareTo(dateTime32) == 0) == dateTime19.equals(dateTime32));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withChronology(chronology13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime14.withWeekyear(0);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (short) 0, chronology20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (short) 0, chronology23);
        boolean boolean25 = localDate21.isEqual((org.joda.time.ReadablePartial) localDate24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localDate21.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime31 = dateTime27.plus(readableDuration30);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.withChronology(chronology32);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = dateTime31.withChronology(chronology34);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime37.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property38.getFieldType();
        org.joda.time.DateTime.Property property40 = dateTime35.property(dateTimeFieldType39);
        org.joda.time.DateTimeField dateTimeField41 = property40.getField();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) (short) 0, chronology43);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) (short) 0, chronology46);
        boolean boolean48 = localDate44.isEqual((org.joda.time.ReadablePartial) localDate47);
        int int49 = localDate47.getDayOfWeek();
        org.joda.time.LocalDate.Property property50 = localDate47.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval53 = localDate47.toInterval(dateTimeZone52);
        int[] intArray55 = new int[] { 'a' };
        int int56 = dateTimeField41.getMaximumValue((org.joda.time.ReadablePartial) localDate47, intArray55);
        org.joda.time.Chronology chronology59 = null;
        java.util.Locale locale60 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket62 = new org.joda.time.format.DateTimeParserBucket(0L, chronology59, locale60, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale65 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket62.saveField(dateTimeFieldType63, "1970-01-01T00:00:00.000Z", locale65);
        java.util.Set<java.lang.String> strSet67 = locale65.getUnicodeLocaleAttributes();
        java.lang.String str68 = localDate47.toString("1", locale65);
        org.joda.time.LocalDate localDate70 = localDate47.withMonthOfYear(5);
        org.joda.time.Chronology chronology71 = localDate70.getChronology();
        org.joda.time.DateTimeField dateTimeField72 = chronology71.yearOfEra();
        org.joda.time.DateTime dateTime73 = dateTime18.withChronology(chronology71);
        org.joda.time.DateTimeField dateTimeField74 = chronology71.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime73", (dateTime18.compareTo(dateTime73) == 0) == dateTime18.equals(dateTime73));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.getMutableDateTime();
        org.joda.time.Chronology chronology4 = null;
        mutableDateTime3.setChronology(chronology4);
        mutableDateTime3.addDays(0);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableDateTime3.add(readablePeriod8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime3.yearOfEra();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime3.secondOfDay();
        org.joda.time.DateTime dateTime12 = mutableDateTime3.toDateTime();
        org.joda.time.DateTime dateTime14 = dateTime12.minusHours(600);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology17 = localTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.clockhourOfHalfday();
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket(0L, chronology20, locale21, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale26 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket23.saveField(dateTimeFieldType24, "1970-01-01T00:00:00.000Z", locale26);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology17, locale26);
        org.joda.time.DateTimeField dateTimeField29 = chronology17.millisOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology17.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField31 = chronology17.weekyear();
        org.joda.time.Chronology chronology32 = chronology17.withUTC();
        org.joda.time.DateTime dateTime33 = dateTime12.toDateTime(chronology17);
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate(chronology17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime33", (mutableDateTime1.compareTo(dateTime33) == 0) == mutableDateTime1.equals(dateTime33));
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        mutableDateTime1.setMillisOfSecond(0);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.getMutableDateTime();
        int int16 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime15);
        int int17 = mutableDateTime1.getSecondOfDay();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime1.year();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.clockhourOfHalfday();
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket(0L, chronology24, locale25, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket27.saveField(dateTimeFieldType28, "1970-01-01T00:00:00.000Z", locale30);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology21, locale30);
        java.lang.String str33 = chronology21.toString();
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now(chronology21);
        org.joda.time.DateTimeField dateTimeField35 = chronology21.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        org.joda.time.Chronology chronology39 = chronology21.withZone(dateTimeZone38);
        org.joda.time.DurationField durationField40 = chronology39.hours();
        org.joda.time.DateTimeField dateTimeField41 = chronology39.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime1, chronology39);
        org.joda.time.DateTime dateTime43 = mutableDateTime1.toDateTime();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) (short) 0, chronology45);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((long) (short) 0, chronology48);
        boolean boolean50 = localDate46.isEqual((org.joda.time.ReadablePartial) localDate49);
        int int51 = localDate49.getDayOfWeek();
        org.joda.time.LocalDate.Property property52 = localDate49.weekOfWeekyear();
        org.joda.time.LocalDate localDate53 = property52.roundFloorCopy();
        int int54 = localDate53.size();
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.LocalDate localDate56 = localDate53.minus(readablePeriod55);
        org.joda.time.DateTime dateTime57 = localDate53.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate59 = localDate53.minusYears(1);
        int int60 = localDate53.getCenturyOfEra();
        org.joda.time.DateMidnight dateMidnight61 = localDate53.toDateMidnight();
        org.joda.time.LocalDate.Property property62 = localDate53.weekOfWeekyear();
        org.joda.time.LocalDate localDate63 = property62.roundHalfEvenCopy();
        org.joda.time.LocalDate.Property property64 = localDate63.dayOfWeek();
        org.joda.time.LocalDate localDate65 = property64.withMaximumValue();
        int int66 = localDate65.getMonthOfYear();
        org.joda.time.LocalDate localDate68 = localDate65.plusWeeks(26);
        org.joda.time.LocalDate.Property property69 = localDate68.dayOfYear();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.LocalDate localDate72 = new org.joda.time.LocalDate((long) (short) 0, chronology71);
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.LocalDate localDate75 = new org.joda.time.LocalDate((long) (short) 0, chronology74);
        boolean boolean76 = localDate72.isEqual((org.joda.time.ReadablePartial) localDate75);
        int int77 = localDate75.getDayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod78 = null;
        org.joda.time.LocalDate localDate79 = localDate75.plus(readablePeriod78);
        org.joda.time.MutableDateTime mutableDateTime81 = new org.joda.time.MutableDateTime((long) 0);
        int int82 = mutableDateTime81.getEra();
        org.joda.time.Chronology chronology83 = null;
        mutableDateTime81.setChronology(chronology83);
        org.joda.time.MutableDateTime mutableDateTime86 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property87 = mutableDateTime86.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType88 = property87.getFieldType();
        mutableDateTime81.set(dateTimeFieldType88, (int) '4');
        int int91 = localDate79.get(dateTimeFieldType88);
        org.joda.time.Interval interval92 = localDate79.toInterval();
        org.joda.time.LocalDate.Property property93 = localDate79.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType94 = property93.getFieldType();
        int int95 = localDate68.indexOf(dateTimeFieldType94);
        org.joda.time.DateTime.Property property96 = dateTime43.property(dateTimeFieldType94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime42", (mutableDateTime1.compareTo(mutableDateTime42) == 0) == mutableDateTime1.equals(mutableDateTime42));
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = property2.getFieldType();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.roundHalfEven();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.dayOfMonth();
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket(0L, chronology7, locale8, (java.lang.Integer) 0);
        long long12 = dateTimeParserBucket10.computeMillis(true);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 0, chronology14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) (short) 0, chronology17);
        boolean boolean19 = localDate15.isEqual((org.joda.time.ReadablePartial) localDate18);
        int int20 = localDate18.getDayOfWeek();
        org.joda.time.LocalDate.Property property21 = localDate18.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval24 = localDate18.toInterval(dateTimeZone23);
        long long26 = dateTimeZone23.convertUTCToLocal((long) 0);
        dateTimeParserBucket10.setZone(dateTimeZone23);
        long long30 = dateTimeZone23.convertLocalToUTC(0L, false);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime4.toMutableDateTime(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime33.dayOfYear();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) (short) 0, chronology36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long) (short) 0, chronology39);
        boolean boolean41 = localDate37.isEqual((org.joda.time.ReadablePartial) localDate40);
        int int42 = localDate40.getDayOfWeek();
        org.joda.time.LocalDate.Property property43 = localDate40.weekOfWeekyear();
        org.joda.time.LocalDate localDate44 = property43.roundFloorCopy();
        org.joda.time.LocalDate localDate45 = property43.roundCeilingCopy();
        org.joda.time.LocalDate localDate46 = property43.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.Interval interval49 = localDate46.toInterval(dateTimeZone48);
        mutableDateTime33.setZoneRetainFields(dateTimeZone48);
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime33.copy();
        org.joda.time.DateTimeZone dateTimeZone52 = mutableDateTime51.getZone();
        org.joda.time.MutableDateTime mutableDateTime53 = mutableDateTime31.toMutableDateTime(dateTimeZone52);
        mutableDateTime31.setSecondOfDay(64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime53", (mutableDateTime1.compareTo(mutableDateTime53) == 0) == mutableDateTime1.equals(mutableDateTime53));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        long long3 = property2.remainder();
        org.joda.time.MutableDateTime mutableDateTime5 = property2.set((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfCeiling();
        java.util.Locale locale10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = property7.set("1", locale10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        mutableDateTime11.setMillis(readableInstant12);
        mutableDateTime11.setDate((-1L));
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) (short) 0, chronology17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (short) 0, chronology20);
        boolean boolean22 = localDate18.isEqual((org.joda.time.ReadablePartial) localDate21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate18.toDateTimeAtStartOfDay(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime27 = dateTime24.toDateTimeISO();
        org.joda.time.DateTime dateTime29 = dateTime27.plusMinutes((int) (byte) 1);
        org.joda.time.DateTime dateTime30 = dateTime27.toDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.DateTime dateTime32 = dateTime30.plus(readablePeriod31);
        org.joda.time.DateTime dateTime34 = dateTime32.withDayOfYear(97);
        mutableDateTime11.setTime((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime37.dayOfYear();
        long long39 = property38.remainder();
        org.joda.time.MutableDateTime mutableDateTime41 = property38.set((int) (short) 1);
        mutableDateTime41.addHours((int) (byte) 1);
        org.joda.time.ReadableDuration readableDuration44 = null;
        mutableDateTime41.add(readableDuration44);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime47.dayOfYear();
        boolean boolean49 = mutableDateTime47.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime47.setZone(dateTimeZone51);
        java.lang.String str53 = mutableDateTime47.toString();
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        mutableDateTime47.add(readablePeriod54);
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime65.dayOfYear();
        boolean boolean67 = mutableDateTime65.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime65.setZone(dateTimeZone69);
        long long72 = dateTimeZone69.nextTransition((long) '4');
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime((int) (byte) -1, 2, 5, 4, (int) (short) 0, 0, 100, dateTimeZone69);
        java.lang.String str75 = dateTimeZone69.getNameKey((long) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime(0L, dateTimeZone69);
        org.joda.time.LocalDateTime localDateTime78 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.ReadablePeriod readablePeriod79 = null;
        org.joda.time.LocalDateTime localDateTime80 = localDateTime78.minus(readablePeriod79);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime80.plusDays((int) 'a');
        int int83 = localDateTime80.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime85 = localDateTime80.withMillisOfDay(2022);
        boolean boolean86 = dateTimeZone69.isLocalDateTimeGap(localDateTime80);
        mutableDateTime47.setZoneRetainFields(dateTimeZone69);
        long long89 = dateTimeZone69.nextTransition(1644573094923L);
        mutableDateTime41.setZone(dateTimeZone69);
        mutableDateTime11.setZoneRetainFields(dateTimeZone69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and mutableDateTime47", (mutableDateTime6.compareTo(mutableDateTime47) == 0) == mutableDateTime6.equals(mutableDateTime47));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        mutableDateTime1.setZoneRetainFields(dateTimeZone4);
        mutableDateTime1.addMillis(0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        int int12 = dateTimeZone10.getOffset((long) '4');
        mutableDateTime1.setZoneRetainFields(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.parse("1969-12-29T00:00:00.000Z");
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 0, chronology18);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) (short) 0, chronology21);
        boolean boolean23 = localDate19.isEqual((org.joda.time.ReadablePartial) localDate22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDate19.toDateTimeAtStartOfDay(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.DateTime dateTime29 = dateTime25.plus(readableDuration28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = dateTime29.withChronology(chronology30);
        org.joda.time.DateTime.Property property32 = dateTime29.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.DateTime dateTime34 = dateTime29.minus(readableDuration33);
        org.joda.time.DateTime.Property property35 = dateTime29.centuryOfEra();
        org.joda.time.DateTime dateTime36 = property35.roundCeilingCopy();
        mutableDateTime1.setDate((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTime dateTime39 = dateTime36.withYearOfCentury(0);
        java.lang.Object obj40 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime42.dayOfYear();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) (short) 0, chronology45);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((long) (short) 0, chronology48);
        boolean boolean50 = localDate46.isEqual((org.joda.time.ReadablePartial) localDate49);
        int int51 = localDate49.getDayOfWeek();
        org.joda.time.LocalDate.Property property52 = localDate49.weekOfWeekyear();
        org.joda.time.LocalDate localDate53 = property52.roundFloorCopy();
        org.joda.time.LocalDate localDate54 = property52.roundCeilingCopy();
        org.joda.time.LocalDate localDate55 = property52.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.Interval interval58 = localDate55.toInterval(dateTimeZone57);
        mutableDateTime42.setZoneRetainFields(dateTimeZone57);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(dateTimeZone57);
        int int62 = dateTimeZone57.getStandardOffset((long) 'u');
        boolean boolean64 = dateTimeZone57.isStandardOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(obj40, dateTimeZone57);
        org.joda.time.DateTime dateTime66 = dateTime39.toDateTime(dateTimeZone57);
        org.joda.time.LocalDate localDate67 = org.joda.time.LocalDate.now(dateTimeZone57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and dateTime66", (dateTime36.compareTo(dateTime66) == 0) == dateTime36.equals(dateTime66));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.clockhourOfHalfday();
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology6, locale7, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket9.saveField(dateTimeFieldType10, "1970-01-01T00:00:00.000Z", locale12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology3, locale12);
        java.lang.String str15 = chronology3.toString();
        org.joda.time.DurationField durationField16 = chronology3.eras();
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.now(chronology3);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(3940L, chronology3);
        long long22 = chronology3.add(10108800365L, (long) 1970, 9);
        org.joda.time.DateTimeField dateTimeField23 = chronology3.monthOfYear();
        org.joda.time.DurationField durationField24 = dateTimeField23.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField24, and durationField16", !(durationField16.compareTo(durationField24) == 0) || (Math.signum(durationField16.compareTo(durationField16)) == Math.signum(durationField24.compareTo(durationField16))));
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.dayOfYear();
        boolean boolean5 = mutableDateTime3.isAfterNow();
        boolean boolean6 = mutableDateTime1.isBefore((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 0, chronology8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) 0, chronology11);
        boolean boolean13 = localDate9.isEqual((org.joda.time.ReadablePartial) localDate12);
        int int14 = localDate12.getDayOfWeek();
        org.joda.time.LocalDate.Property property15 = localDate12.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval18 = localDate12.toInterval(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime3.toMutableDateTime(dateTimeZone17);
        mutableDateTime3.add((long) 59);
        int int22 = mutableDateTime3.getMillisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime19", (mutableDateTime1.compareTo(mutableDateTime19) == 0) == mutableDateTime1.equals(mutableDateTime19));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        mutableDateTime1.add(readablePeriod3, 100);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) 0, chronology7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) (short) 0, chronology10);
        boolean boolean12 = localDate8.isEqual((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate8.toDateTimeAtStartOfDay(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime14.plus(readableDuration17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.withChronology(chronology19);
        org.joda.time.DateTime.Property property21 = dateTime18.secondOfMinute();
        org.joda.time.DateTime dateTime23 = dateTime18.withMinuteOfHour((int) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar24 = dateTime23.toGregorianCalendar();
        org.joda.time.DateTime dateTime26 = dateTime23.withCenturyOfEra(4);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long32 = dateTimeZone28.convertLocalToUTC((long) 2039, true, (long) (byte) 100);
        org.joda.time.DateTime dateTime33 = dateTime26.toDateTime(dateTimeZone28);
        org.joda.time.DateTime dateTime34 = dateTime33.withLaterOffsetAtOverlap();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and dateTime33", (dateTime26.compareTo(dateTime33) == 0) == dateTime26.equals(dateTime33));
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.getMutableDateTime();
        java.util.GregorianCalendar gregorianCalendar4 = mutableDateTime3.toGregorianCalendar();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.yearOfCentury();
        boolean boolean6 = mutableDateTime3.isSupported(dateTimeFieldType5);
        java.lang.String str7 = dateTimeFieldType5.getName();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = localDateTime11.toDateTime(dateTimeZone14);
        org.joda.time.Chronology chronology17 = localDateTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.hourOfHalfday();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '4', chronology17);
        org.joda.time.DateTimeField dateTimeField20 = chronology17.yearOfCentury();
        org.joda.time.DurationField durationField21 = chronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField22 = chronology17.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField23 = chronology17.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(chronology17);
        boolean boolean25 = dateTimeFieldType5.isSupported(chronology17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and mutableDateTime24", (dateTime16.compareTo(mutableDateTime24) == 0) == dateTime16.equals(mutableDateTime24));
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withChronology(chronology13);
        org.joda.time.DateTime.Property property15 = dateTime12.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.minus(readableDuration16);
        org.joda.time.DateTime.Property property18 = dateTime12.centuryOfEra();
        org.joda.time.DateTime dateTime19 = property18.roundCeilingCopy();
        org.joda.time.DateTime dateTime21 = dateTime19.withMillisOfSecond(31);
        org.joda.time.DateTime dateTime23 = dateTime19.plusHours(19);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime27 = property26.getMutableDateTime();
        org.joda.time.Chronology chronology28 = null;
        mutableDateTime27.setChronology(chronology28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime27.year();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime34.dayOfYear();
        boolean boolean36 = mutableDateTime34.isAfterNow();
        boolean boolean37 = mutableDateTime32.isBefore((org.joda.time.ReadableInstant) mutableDateTime34);
        org.joda.time.ReadableDuration readableDuration38 = null;
        mutableDateTime34.add(readableDuration38, (int) (short) 1);
        boolean boolean41 = mutableDateTime27.equals((java.lang.Object) readableDuration38);
        mutableDateTime27.addMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime46.dayOfYear();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((long) (short) 0, chronology49);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((long) (short) 0, chronology52);
        boolean boolean54 = localDate50.isEqual((org.joda.time.ReadablePartial) localDate53);
        int int55 = localDate53.getDayOfWeek();
        org.joda.time.LocalDate.Property property56 = localDate53.weekOfWeekyear();
        org.joda.time.LocalDate localDate57 = property56.roundFloorCopy();
        org.joda.time.LocalDate localDate58 = property56.roundCeilingCopy();
        org.joda.time.LocalDate localDate59 = property56.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.Interval interval62 = localDate59.toInterval(dateTimeZone61);
        mutableDateTime46.setZoneRetainFields(dateTimeZone61);
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate(1646992302977L, dateTimeZone61);
        int int66 = dateTimeZone61.getOffset((long) 11);
        mutableDateTime27.setZone(dateTimeZone61);
        boolean boolean68 = dateTime23.equals((java.lang.Object) dateTimeZone61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime25 and mutableDateTime32", (mutableDateTime25.compareTo(mutableDateTime32) == 0) == mutableDateTime25.equals(mutableDateTime32));
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        mutableDateTime1.setZoneRetainFields(dateTimeZone4);
        mutableDateTime1.addMillis(0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        int int12 = dateTimeZone10.getOffset((long) '4');
        mutableDateTime1.setZoneRetainFields(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.parse("1969-12-29T00:00:00.000Z");
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 0, chronology18);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) (short) 0, chronology21);
        boolean boolean23 = localDate19.isEqual((org.joda.time.ReadablePartial) localDate22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDate19.toDateTimeAtStartOfDay(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.DateTime dateTime29 = dateTime25.plus(readableDuration28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = dateTime29.withChronology(chronology30);
        org.joda.time.DateTime.Property property32 = dateTime29.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.DateTime dateTime34 = dateTime29.minus(readableDuration33);
        org.joda.time.DateTime.Property property35 = dateTime29.centuryOfEra();
        org.joda.time.DateTime dateTime36 = property35.roundCeilingCopy();
        mutableDateTime1.setDate((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTime dateTime39 = dateTime36.withYearOfCentury(0);
        java.lang.Object obj40 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime42.dayOfYear();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) (short) 0, chronology45);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((long) (short) 0, chronology48);
        boolean boolean50 = localDate46.isEqual((org.joda.time.ReadablePartial) localDate49);
        int int51 = localDate49.getDayOfWeek();
        org.joda.time.LocalDate.Property property52 = localDate49.weekOfWeekyear();
        org.joda.time.LocalDate localDate53 = property52.roundFloorCopy();
        org.joda.time.LocalDate localDate54 = property52.roundCeilingCopy();
        org.joda.time.LocalDate localDate55 = property52.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.Interval interval58 = localDate55.toInterval(dateTimeZone57);
        mutableDateTime42.setZoneRetainFields(dateTimeZone57);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(dateTimeZone57);
        int int62 = dateTimeZone57.getStandardOffset((long) 'u');
        boolean boolean64 = dateTimeZone57.isStandardOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(obj40, dateTimeZone57);
        org.joda.time.DateTime dateTime66 = dateTime39.toDateTime(dateTimeZone57);
        org.joda.time.ReadableDuration readableDuration67 = null;
        org.joda.time.DateTime dateTime68 = dateTime39.plus(readableDuration67);
        org.joda.time.DateTime dateTime70 = dateTime68.minusMonths(181);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime68 and dateTime66", (dateTime68.compareTo(dateTime66) == 0) == dateTime68.equals(dateTime66));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        org.joda.time.Instant instant10 = mutableDateTime1.toInstant();
        int int11 = mutableDateTime1.getWeekyear();
        mutableDateTime1.setDayOfMonth(1);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime1.era();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime1.yearOfCentury();
        java.lang.String str16 = property15.getAsString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant10", (mutableDateTime1.compareTo(instant10) == 0) == mutableDateTime1.equals(instant10));
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = localDateTime4.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = localDateTime4.getChronology();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(0L, chronology19, locale20, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale25 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket22.saveField(dateTimeFieldType23, "1970-01-01T00:00:00.000Z", locale25);
        dateTimeParserBucket15.saveField(dateTimeFieldType16, "1970-01-01T00:00:00.000Z", locale25);
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology29, locale30, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale35 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket32.saveField(dateTimeFieldType33, "1970-01-01T00:00:00.000Z", locale35);
        java.lang.String str37 = locale25.getDisplayCountry(locale35);
        org.joda.time.Chronology chronology39 = null;
        java.util.Locale locale40 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket(0L, chronology39, locale40, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Chronology chronology46 = null;
        java.util.Locale locale47 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket(0L, chronology46, locale47, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale52 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket49.saveField(dateTimeFieldType50, "1970-01-01T00:00:00.000Z", locale52);
        dateTimeParserBucket42.saveField(dateTimeFieldType43, "1970-01-01T00:00:00.000Z", locale52);
        org.joda.time.Chronology chronology56 = null;
        java.util.Locale locale57 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket(0L, chronology56, locale57, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale62 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket59.saveField(dateTimeFieldType60, "1970-01-01T00:00:00.000Z", locale62);
        java.lang.String str64 = locale52.getDisplayCountry(locale62);
        java.lang.String str65 = locale35.getDisplayVariant(locale52);
        java.lang.String str66 = locale52.getDisplayScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket67 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology10, locale52);
        org.joda.time.Chronology chronology68 = chronology10.withUTC();
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime(3592236916L, chronology10);
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime(chronology10);
        org.joda.time.DurationField durationField71 = chronology10.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and mutableDateTime70", (dateTime9.compareTo(mutableDateTime70) == 0) == dateTime9.equals(mutableDateTime70));
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.dayOfYear();
        boolean boolean5 = mutableDateTime3.isAfterNow();
        boolean boolean6 = mutableDateTime1.isBefore((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime1.add(readableDuration7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.era();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket(0L, chronology11, locale12, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale17 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket14.saveField(dateTimeFieldType15, "1970-01-01T00:00:00.000Z", locale17);
        int int19 = mutableDateTime1.get(dateTimeFieldType15);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime1.centuryOfEra();
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology25 = localTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.clockhourOfHalfday();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket31.saveField(dateTimeFieldType32, "1970-01-01T00:00:00.000Z", locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology25, locale34);
        java.lang.String str37 = chronology25.toString();
        org.joda.time.MutableDateTime mutableDateTime38 = org.joda.time.MutableDateTime.now(chronology25);
        org.joda.time.DateTimeField dateTimeField39 = chronology25.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField40 = chronology25.yearOfCentury();
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((long) 69, chronology25);
        org.joda.time.DateTimeField dateTimeField42 = chronology25.hourOfDay();
        org.joda.time.LocalTime localTime43 = org.joda.time.LocalTime.fromMillisOfDay(2100000L, chronology25);
        mutableDateTime1.setChronology(chronology25);
        org.joda.time.DateTimeField dateTimeField45 = chronology25.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime3", (mutableDateTime1.compareTo(mutableDateTime3) == 0) == mutableDateTime1.equals(mutableDateTime3));
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        org.joda.time.Instant instant10 = mutableDateTime1.toInstant();
        int int11 = mutableDateTime1.getWeekyear();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime1.dayOfYear();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.yearOfCentury();
        java.lang.String str14 = property13.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant10", (mutableDateTime1.compareTo(instant10) == 0) == mutableDateTime1.equals(instant10));
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        org.joda.time.Instant instant10 = mutableDateTime1.toInstant();
        boolean boolean12 = mutableDateTime1.isAfter((long) (byte) 1);
        mutableDateTime1.addWeekyears(69);
        mutableDateTime1.setSecondOfDay(3);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime19 = property17.addWrapField(2000);
        org.joda.time.DateTimeField dateTimeField20 = null;
        mutableDateTime19.setRounding(dateTimeField20);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) (short) 0, chronology24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) (short) 0, chronology27);
        boolean boolean29 = localDate25.isEqual((org.joda.time.ReadablePartial) localDate28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localDate25.toDateTimeAtStartOfDay(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime35 = dateTime31.plus(readableDuration34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = dateTime35.withChronology(chronology36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = dateTime35.withChronology(chronology38);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime41.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = property42.getFieldType();
        org.joda.time.DateTime.Property property44 = dateTime39.property(dateTimeFieldType43);
        org.joda.time.DateTimeField dateTimeField45 = property44.getField();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((long) (short) 0, chronology47);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) (short) 0, chronology50);
        boolean boolean52 = localDate48.isEqual((org.joda.time.ReadablePartial) localDate51);
        int int53 = localDate51.getDayOfWeek();
        org.joda.time.LocalDate.Property property54 = localDate51.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval57 = localDate51.toInterval(dateTimeZone56);
        int[] intArray59 = new int[] { 'a' };
        int int60 = dateTimeField45.getMaximumValue((org.joda.time.ReadablePartial) localDate51, intArray59);
        org.joda.time.Interval interval61 = localDate51.toInterval();
        java.util.Date date62 = localDate51.toDate();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate((long) (short) 0, chronology64);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate((long) (short) 0, chronology67);
        boolean boolean69 = localDate65.isEqual((org.joda.time.ReadablePartial) localDate68);
        int int70 = localDate68.getDayOfWeek();
        org.joda.time.LocalDate.Property property71 = localDate68.weekOfWeekyear();
        org.joda.time.LocalDate localDate72 = property71.roundFloorCopy();
        org.joda.time.LocalDate localDate73 = property71.roundCeilingCopy();
        org.joda.time.LocalDate localDate74 = property71.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.Interval interval77 = localDate74.toInterval(dateTimeZone76);
        int int78 = localDate51.compareTo((org.joda.time.ReadablePartial) localDate74);
        org.joda.time.LocalDate localDate80 = localDate51.plusMonths(5);
        org.joda.time.Chronology chronology81 = localDate51.getChronology();
        org.joda.time.DateTimeField dateTimeField82 = chronology81.minuteOfHour();
        org.joda.time.DateTime dateTime83 = new org.joda.time.DateTime((long) 51, chronology81);
        org.joda.time.DateTime.Property property84 = dateTime83.millisOfDay();
        org.joda.time.DateTime dateTime85 = dateTime83.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime87 = dateTime85.withMillisOfDay(1964);
        org.joda.time.DateTime dateTime89 = dateTime87.minusYears(28818095);
        mutableDateTime19.setMillis((org.joda.time.ReadableInstant) dateTime89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime41", (instant10.compareTo(mutableDateTime41) == 0) == instant10.equals(mutableDateTime41));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology1 = localTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.era();
        org.joda.time.DurationField durationField3 = chronology1.weeks();
        org.joda.time.DateTimeField dateTimeField4 = chronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = chronology1.centuryOfEra();
        org.joda.time.DurationField durationField6 = chronology1.eras();
        org.joda.time.Chronology chronology7 = chronology1.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now(dateTimeZone5);
        org.joda.time.DateTime dateTime7 = localDateTime2.toDateTime(dateTimeZone5);
        org.joda.time.Chronology chronology8 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.hours();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = chronology8.getZone();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.monthOfYear();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.plus(readablePeriod20);
        int int22 = localDateTime21.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property23 = localDateTime21.millisOfSecond();
        org.joda.time.LocalDateTime.Property property24 = localDateTime21.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.minusHours(0);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withMillisOfDay(100);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.plus(readableDuration32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plusMinutes(3);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime33.plusSeconds(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean39 = localDateTime33.isSupported(dateTimeFieldType38);
        java.lang.String str40 = dateTimeFieldType38.getName();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime26.withField(dateTimeFieldType38, 99);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.now(dateTimeZone44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.withMillisOfDay(100);
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.LocalDateTime localDateTime49 = localDateTime45.plus(readableDuration48);
        org.joda.time.DateTime dateTime50 = localDateTime45.toDateTime();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime45.withYearOfEra((int) (short) 1);
        org.joda.time.Chronology chronology53 = localDateTime52.getChronology();
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.LocalDateTime localDateTime55 = localDateTime52.minus(readableDuration54);
        org.joda.time.Chronology chronology56 = localDateTime55.getChronology();
        org.joda.time.DurationField durationField57 = chronology56.weekyears();
        org.joda.time.DateTimeField dateTimeField58 = chronology56.monthOfYear();
        boolean boolean59 = dateTimeFieldType38.isSupported(chronology56);
        org.joda.time.DateTime dateTime60 = dateTime14.toDateTime(chronology56);
        org.joda.time.DateTime dateTime62 = dateTime14.plusSeconds(14701);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime14", (dateTime7.compareTo(dateTime14) == 0) == dateTime7.equals(dateTime14));
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withChronology(chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.withChronology(chronology15);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property19.getFieldType();
        org.joda.time.DateTime.Property property21 = dateTime16.property(dateTimeFieldType20);
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        org.joda.time.DateTime dateTime24 = property21.addToCopy(2100000);
        org.joda.time.DateTime dateTime26 = property21.addWrapFieldToCopy(69);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours(32);
        int int30 = dateTimeZone28.getOffsetFromLocal((long) 14);
        org.joda.time.format.DateTimePrinter dateTimePrinter31 = null;
        org.joda.time.format.DateTimeParser dateTimeParser32 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter31, dateTimeParser32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter33.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter34.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter34.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter37 = dateTimeFormatter34.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter34.withPivotYear(0);
        org.joda.time.Chronology chronology41 = null;
        java.util.Locale locale42 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket(0L, chronology41, locale42, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Chronology chronology48 = null;
        java.util.Locale locale49 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket(0L, chronology48, locale49, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale54 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket51.saveField(dateTimeFieldType52, "1970-01-01T00:00:00.000Z", locale54);
        dateTimeParserBucket44.saveField(dateTimeFieldType45, "1970-01-01T00:00:00.000Z", locale54);
        java.lang.Integer int57 = dateTimeParserBucket44.getPivotYear();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate((long) (short) 0, chronology59);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate((long) (short) 0, chronology62);
        boolean boolean64 = localDate60.isEqual((org.joda.time.ReadablePartial) localDate63);
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateTime dateTime66 = localDate60.toDateTimeAtStartOfDay(dateTimeZone65);
        org.joda.time.DateTime dateTime68 = dateTime66.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime69 = dateTime66.toDateTimeISO();
        org.joda.time.DateTime.Property property70 = dateTime69.hourOfDay();
        org.joda.time.DateTime dateTime72 = property70.addToCopy((long) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone73 = dateTime72.getZone();
        dateTimeParserBucket44.setZone(dateTimeZone73);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter75 = dateTimeFormatter34.withZone(dateTimeZone73);
        long long77 = dateTimeZone28.getMillisKeepLocal(dateTimeZone73, (long) 64);
        org.joda.time.DateTime dateTime78 = dateTime26.toDateTime(dateTimeZone28);
        int int79 = dateTime26.getMonthOfYear();
        org.joda.time.ReadableDuration readableDuration80 = null;
        org.joda.time.DateTime dateTime81 = dateTime26.plus(readableDuration80);
        org.joda.time.DateTime dateTime83 = dateTime81.minusDays(198970);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime81 and dateTime78", (dateTime81.compareTo(dateTime78) == 0) == dateTime81.equals(dateTime78));
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = null;
        java.lang.String str3 = mutableDateTime1.toString(dateTimeFormatter2);
        mutableDateTime1.addMonths((int) (byte) 1);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.year();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundHalfFloor();
        int int8 = mutableDateTime7.getRoundingMode();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.getMutableDateTime();
        int int13 = mutableDateTime12.getHourOfDay();
        mutableDateTime7.setDate((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.dayOfYear();
        boolean boolean18 = mutableDateTime16.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime16.setZone(dateTimeZone20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime16.add(readablePeriod22, 4);
        org.joda.time.Instant instant25 = mutableDateTime16.toInstant();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now(dateTimeZone27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = localDateTime28.toDateTime(dateTimeZone31);
        org.joda.time.Chronology chronology34 = localDateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField36 = chronology34.hourOfDay();
        org.joda.time.DurationField durationField37 = chronology34.seconds();
        org.joda.time.DateTimeField dateTimeField38 = chronology34.weekOfWeekyear();
        mutableDateTime16.setChronology(chronology34);
        org.joda.time.DateTimeField dateTimeField40 = chronology34.monthOfYear();
        mutableDateTime7.setRounding(dateTimeField40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and mutableDateTime16", (mutableDateTime10.compareTo(mutableDateTime16) == 0) == mutableDateTime10.equals(mutableDateTime16));
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.era();
        org.joda.time.DurationField durationField4 = chronology2.weeks();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.year();
        org.joda.time.DurationField durationField6 = chronology2.eras();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 999, chronology2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField6", Math.signum(durationField4.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField4)));
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Integer int3 = dateTimeFormatter2.getPivotYear();
        int int4 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = localDateTime9.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology15 = localDateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.hourOfHalfday();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) '4', chronology15);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now(dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withMillisOfDay(100);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.plus(readableDuration23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.era();
        long long27 = chronology15.set((org.joda.time.ReadablePartial) localDateTime24, (long) 22);
        java.util.Locale.Category category28 = java.util.Locale.Category.FORMAT;
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket(0L, chronology30, locale31, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Chronology chronology37 = null;
        java.util.Locale locale38 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket(0L, chronology37, locale38, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale43 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket40.saveField(dateTimeFieldType41, "1970-01-01T00:00:00.000Z", locale43);
        dateTimeParserBucket33.saveField(dateTimeFieldType34, "1970-01-01T00:00:00.000Z", locale43);
        org.joda.time.Chronology chronology47 = null;
        java.util.Locale locale48 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket(0L, chronology47, locale48, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale53 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket50.saveField(dateTimeFieldType51, "1970-01-01T00:00:00.000Z", locale53);
        java.lang.String str55 = locale43.getDisplayCountry(locale53);
        org.joda.time.Chronology chronology57 = null;
        java.util.Locale locale58 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket(0L, chronology57, locale58, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Chronology chronology64 = null;
        java.util.Locale locale65 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket67 = new org.joda.time.format.DateTimeParserBucket(0L, chronology64, locale65, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale70 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket67.saveField(dateTimeFieldType68, "1970-01-01T00:00:00.000Z", locale70);
        dateTimeParserBucket60.saveField(dateTimeFieldType61, "1970-01-01T00:00:00.000Z", locale70);
        org.joda.time.Chronology chronology74 = null;
        java.util.Locale locale75 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket77 = new org.joda.time.format.DateTimeParserBucket(0L, chronology74, locale75, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale80 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket77.saveField(dateTimeFieldType78, "1970-01-01T00:00:00.000Z", locale80);
        java.lang.String str82 = locale70.getDisplayCountry(locale80);
        java.lang.String str83 = locale53.getDisplayVariant(locale70);
        java.util.Locale.setDefault(category28, locale53);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket86 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology15, locale53, (java.lang.Integer) 7);
        org.joda.time.DurationField durationField87 = chronology15.hours();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter88 = dateTimeFormatter2.withChronology(chronology15);
        org.joda.time.DateTime dateTime89 = new org.joda.time.DateTime(chronology15);
        org.joda.time.DateTime dateTime90 = org.joda.time.DateTime.now(chronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime89", (dateTime14.compareTo(dateTime89) == 0) == dateTime14.equals(dateTime89));
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime11 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime.Property property12 = dateTime8.weekyear();
        org.joda.time.DateTime dateTime13 = property12.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime15 = dateTime13.minusMillis(3);
        int int16 = dateTime13.getYearOfCentury();
        org.joda.time.DateTime dateTime18 = dateTime13.withYearOfEra(14);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (short) 0, chronology20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (short) 0, chronology23);
        boolean boolean25 = localDate21.isEqual((org.joda.time.ReadablePartial) localDate24);
        int int26 = localDate24.getDayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate28 = localDate24.plus(readablePeriod27);
        int int29 = localDate24.size();
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket(0L, chronology31, locale32, (java.lang.Integer) 0);
        long long36 = dateTimeParserBucket34.computeMillis(true);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) (short) 0, chronology38);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) (short) 0, chronology41);
        boolean boolean43 = localDate39.isEqual((org.joda.time.ReadablePartial) localDate42);
        int int44 = localDate42.getDayOfWeek();
        org.joda.time.LocalDate.Property property45 = localDate42.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval48 = localDate42.toInterval(dateTimeZone47);
        long long50 = dateTimeZone47.convertUTCToLocal((long) 0);
        dateTimeParserBucket34.setZone(dateTimeZone47);
        java.lang.String str53 = dateTimeZone47.getName((long) ' ');
        boolean boolean55 = dateTimeZone47.isStandardOffset((long) 6);
        org.joda.time.Interval interval56 = localDate24.toInterval(dateTimeZone47);
        java.util.TimeZone timeZone57 = dateTimeZone47.toTimeZone();
        org.joda.time.DateTime dateTime58 = dateTime18.toDateTime(dateTimeZone47);
        org.joda.time.DateTime.Property property59 = dateTime58.yearOfEra();
        int int60 = property59.get();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime58", (dateTime18.compareTo(dateTime58) == 0) == dateTime18.equals(dateTime58));
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        mutableDateTime1.setZoneRetainFields(dateTimeZone4);
        mutableDateTime1.setTime(0, (int) (byte) 0, (int) (short) 1, (int) (short) 1);
        org.joda.time.DateTime dateTime11 = mutableDateTime1.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.getMutableDateTime();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) (short) 0, chronology17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (short) 0, chronology20);
        boolean boolean22 = localDate18.isEqual((org.joda.time.ReadablePartial) localDate21);
        int int23 = localDate21.getDayOfWeek();
        org.joda.time.LocalDate.Property property24 = localDate21.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval27 = localDate21.toInterval(dateTimeZone26);
        long long29 = dateTimeZone26.convertUTCToLocal((long) 0);
        mutableDateTime15.setZone(dateTimeZone26);
        mutableDateTime1.setZone(dateTimeZone26);
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone26);
        org.joda.time.DateTime dateTime34 = dateTime32.minusMinutes(198970);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTime dateTime37 = dateTime32.withDurationAdded(readableDuration35, 68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime11", (mutableDateTime1.compareTo(dateTime11) == 0) == mutableDateTime1.equals(dateTime11));
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        int int7 = localDate5.getDayOfWeek();
        org.joda.time.LocalDate.Property property8 = localDate5.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property8.roundFloorCopy();
        int int10 = localDate9.size();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate9.minus(readablePeriod11);
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate15 = localDate9.withMonthOfYear(10);
        org.joda.time.LocalDate localDate17 = localDate15.withYear((int) '4');
        org.joda.time.LocalDate localDate19 = localDate15.withEra((int) (short) 1);
        org.joda.time.LocalDate localDate21 = localDate19.plusYears(51);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localDate21.toDateTime(readableInstant22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) (short) 0, chronology25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) (short) 0, chronology28);
        boolean boolean30 = localDate26.isEqual((org.joda.time.ReadablePartial) localDate29);
        int int31 = localDate29.getDayOfWeek();
        org.joda.time.LocalDate.Property property32 = localDate29.weekOfWeekyear();
        org.joda.time.LocalDate localDate33 = property32.roundFloorCopy();
        org.joda.time.LocalDate localDate34 = property32.roundCeilingCopy();
        org.joda.time.LocalDate localDate35 = property32.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.Interval interval38 = localDate35.toInterval(dateTimeZone37);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((long) (short) 0, chronology40);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) (short) 0, chronology43);
        boolean boolean45 = localDate41.isEqual((org.joda.time.ReadablePartial) localDate44);
        int int46 = localDate44.getDayOfWeek();
        org.joda.time.LocalDate.Property property47 = localDate44.weekOfWeekyear();
        org.joda.time.LocalDate localDate48 = property47.roundFloorCopy();
        org.joda.time.LocalDate localDate49 = property47.roundCeilingCopy();
        org.joda.time.LocalDate localDate50 = property47.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.Interval interval53 = localDate50.toInterval(dateTimeZone52);
        org.joda.time.LocalDate.Property property54 = localDate50.dayOfMonth();
        org.joda.time.LocalDate.Property property55 = localDate50.yearOfEra();
        org.joda.time.LocalDate localDate57 = property55.addToCopy(2);
        org.joda.time.LocalDate localDate59 = localDate57.withYear(14);
        org.joda.time.DateMidnight dateMidnight60 = localDate57.toDateMidnight();
        int int61 = dateTimeZone37.getOffset((org.joda.time.ReadableInstant) dateMidnight60);
        org.joda.time.LocalDate localDate63 = org.joda.time.LocalDate.parse("0052-10-29");
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.LocalDate localDate66 = new org.joda.time.LocalDate((long) (short) 0, chronology65);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate((long) (short) 0, chronology68);
        boolean boolean70 = localDate66.isEqual((org.joda.time.ReadablePartial) localDate69);
        org.joda.time.LocalDate.Property property71 = localDate69.centuryOfEra();
        int int72 = localDate69.getCenturyOfEra();
        org.joda.time.LocalDate localDate73 = localDate63.withFields((org.joda.time.ReadablePartial) localDate69);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forOffsetHours(32);
        org.joda.time.DateTime dateTime76 = localDate73.toDateTimeAtCurrentTime(dateTimeZone75);
        long long78 = dateTimeZone37.getMillisKeepLocal(dateTimeZone75, 31536000000L);
        org.joda.time.MutableDateTime mutableDateTime79 = dateTime23.toMutableDateTime(dateTimeZone37);
        java.lang.String str81 = dateTimeZone37.getShortName(1644573145448L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and mutableDateTime79", (dateTime23.compareTo(mutableDateTime79) == 0) == dateTime23.equals(mutableDateTime79));
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now(dateTimeZone5);
        org.joda.time.DateTime dateTime7 = localDateTime2.toDateTime(dateTimeZone5);
        org.joda.time.Chronology chronology8 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.hours();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = chronology8.getZone();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.monthOfYear();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.plus(readablePeriod20);
        int int22 = localDateTime21.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property23 = localDateTime21.millisOfSecond();
        org.joda.time.LocalDateTime.Property property24 = localDateTime21.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.minusHours(0);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withMillisOfDay(100);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.plus(readableDuration32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plusMinutes(3);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime33.plusSeconds(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean39 = localDateTime33.isSupported(dateTimeFieldType38);
        java.lang.String str40 = dateTimeFieldType38.getName();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime26.withField(dateTimeFieldType38, 99);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.now(dateTimeZone44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.withMillisOfDay(100);
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.LocalDateTime localDateTime49 = localDateTime45.plus(readableDuration48);
        org.joda.time.DateTime dateTime50 = localDateTime45.toDateTime();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime45.withYearOfEra((int) (short) 1);
        org.joda.time.Chronology chronology53 = localDateTime52.getChronology();
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.LocalDateTime localDateTime55 = localDateTime52.minus(readableDuration54);
        org.joda.time.Chronology chronology56 = localDateTime55.getChronology();
        org.joda.time.DurationField durationField57 = chronology56.weekyears();
        org.joda.time.DateTimeField dateTimeField58 = chronology56.monthOfYear();
        boolean boolean59 = dateTimeFieldType38.isSupported(chronology56);
        org.joda.time.DateTime dateTime60 = dateTime14.toDateTime(chronology56);
        org.joda.time.DateTime dateTime62 = dateTime14.minusMinutes(35958175);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime14", (dateTime7.compareTo(dateTime14) == 0) == dateTime7.equals(dateTime14));
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime3.toDateTime(dateTimeZone6);
        org.joda.time.Chronology chronology9 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.months();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(chronology9);
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("0070-01-01");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(3940L, chronology9, locale13, (java.lang.Integer) 134, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and mutableDateTime11", (dateTime8.compareTo(mutableDateTime11) == 0) == dateTime8.equals(mutableDateTime11));
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(100L);
        boolean boolean3 = mutableDateTime1.isAfter((long) 22);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = mutableDateTime5.toString(dateTimeFormatter6);
        mutableDateTime5.addMonths((int) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.dayOfYear();
        boolean boolean14 = mutableDateTime12.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime12.setZone(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(6048000000L, dateTimeZone16);
        mutableDateTime5.setZone(dateTimeZone16);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) (short) 0, chronology21);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) (short) 0, chronology24);
        boolean boolean26 = localDate22.isEqual((org.joda.time.ReadablePartial) localDate25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = localDate22.toDateTimeAtStartOfDay(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime31 = dateTime28.toDateTimeISO();
        org.joda.time.DateTime.Property property32 = dateTime28.weekyear();
        org.joda.time.DateTime dateTime33 = dateTime28.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property34 = dateTime33.secondOfDay();
        org.joda.time.DateTime dateTime36 = dateTime33.withMinuteOfHour((int) (byte) 10);
        org.joda.time.DateTime dateTime38 = dateTime33.withWeekyear(0);
        org.joda.time.DateTime.Property property39 = dateTime38.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime41.dayOfYear();
        boolean boolean43 = mutableDateTime41.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime41.setZone(dateTimeZone45);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        mutableDateTime41.add(readablePeriod47, 4);
        mutableDateTime41.setMillisOfSecond(0);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime53.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime55 = property54.getMutableDateTime();
        int int56 = mutableDateTime41.compareTo((org.joda.time.ReadableInstant) mutableDateTime55);
        mutableDateTime55.setDate(45L);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime55.minuteOfHour();
        boolean boolean60 = dateTime38.isEqual((org.joda.time.ReadableInstant) mutableDateTime55);
        org.joda.time.DateTime dateTime62 = dateTime38.plusMinutes(17);
        org.joda.time.DateTime.Property property63 = dateTime38.secondOfMinute();
        boolean boolean64 = mutableDateTime5.isEqual((org.joda.time.ReadableInstant) dateTime38);
        int int65 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and mutableDateTime53", (mutableDateTime12.compareTo(mutableDateTime53) == 0) == mutableDateTime12.equals(mutableDateTime53));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime11 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime13 = dateTime11.plusSeconds(1);
        org.joda.time.DateTime dateTime15 = dateTime13.withMillis((long) 69);
        org.joda.time.DateTime.Property property16 = dateTime15.millisOfSecond();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 0, chronology18);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) (short) 0, chronology21);
        boolean boolean23 = localDate19.isEqual((org.joda.time.ReadablePartial) localDate22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDate19.toDateTimeAtStartOfDay(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.DateTime dateTime29 = dateTime25.plus(readableDuration28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = dateTime29.withChronology(chronology30);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = dateTime29.withChronology(chronology32);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property36.getFieldType();
        org.joda.time.DateTime.Property property38 = dateTime33.property(dateTimeFieldType37);
        org.joda.time.DateTimeField dateTimeField39 = property38.getField();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) (short) 0, chronology41);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) (short) 0, chronology44);
        boolean boolean46 = localDate42.isEqual((org.joda.time.ReadablePartial) localDate45);
        int int47 = localDate45.getDayOfWeek();
        org.joda.time.LocalDate.Property property48 = localDate45.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval51 = localDate45.toInterval(dateTimeZone50);
        int[] intArray53 = new int[] { 'a' };
        int int54 = dateTimeField39.getMaximumValue((org.joda.time.ReadablePartial) localDate45, intArray53);
        org.joda.time.Chronology chronology57 = null;
        java.util.Locale locale58 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket(0L, chronology57, locale58, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale63 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket60.saveField(dateTimeFieldType61, "1970-01-01T00:00:00.000Z", locale63);
        java.util.Set<java.lang.String> strSet65 = locale63.getUnicodeLocaleAttributes();
        java.lang.String str66 = localDate45.toString("1", locale63);
        org.joda.time.LocalDate localDate68 = localDate45.withMonthOfYear(5);
        org.joda.time.Chronology chronology69 = localDate68.getChronology();
        org.joda.time.DateTimeField dateTimeField70 = chronology69.secondOfDay();
        org.joda.time.DurationField durationField71 = chronology69.years();
        org.joda.time.DateTimeField dateTimeField72 = chronology69.era();
        org.joda.time.DateTimeField dateTimeField73 = chronology69.secondOfMinute();
        org.joda.time.DateTime dateTime74 = dateTime15.withChronology(chronology69);
        org.joda.time.DateTimeField dateTimeField75 = chronology69.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime74", (dateTime15.compareTo(dateTime74) == 0) == dateTime15.equals(dateTime74));
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now(dateTimeZone5);
        org.joda.time.DateTime dateTime7 = localDateTime2.toDateTime(dateTimeZone5);
        org.joda.time.Chronology chronology8 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.hours();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = chronology8.getZone();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone13);
        java.lang.String str15 = dateTimeZone13.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime14", (dateTime7.compareTo(dateTime14) == 0) == dateTime7.equals(dateTime14));
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(2000);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.dayOfYear();
        boolean boolean15 = mutableDateTime13.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime13.setZone(dateTimeZone17);
        long long20 = dateTimeZone17.nextTransition((long) '4');
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((int) (byte) -1, 2, 5, 4, (int) (short) 0, 0, 100, dateTimeZone17);
        int int23 = dateTimeZone17.getOffset((long) 35677);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter4.withZone(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        int int29 = dateTimeZone27.getOffset((long) '4');
        long long31 = dateTimeZone27.previousTransition((long) ' ');
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(dateTimeZone27);
        int int34 = dateTimeZone27.getStandardOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime36.dayOfYear();
        long long38 = property37.remainder();
        org.joda.time.MutableDateTime mutableDateTime40 = property37.set((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime41 = mutableDateTime40.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime40.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime40.copy();
        int int44 = dateTimeZone27.getOffset((org.joda.time.ReadableInstant) mutableDateTime40);
        java.lang.String str45 = dateTimeZone27.getID();
        boolean boolean47 = dateTimeZone27.isStandardOffset(1644573263560L);
        long long49 = dateTimeZone17.getMillisKeepLocal(dateTimeZone27, 147599965L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and mutableDateTime36", (mutableDateTime13.compareTo(mutableDateTime36) == 0) == mutableDateTime13.equals(mutableDateTime36));
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        org.joda.time.Instant instant10 = mutableDateTime1.toInstant();
        int int11 = mutableDateTime1.getWeekyear();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime1.dayOfYear();
        java.util.GregorianCalendar gregorianCalendar13 = mutableDateTime1.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = localDateTime16.toDateTime(dateTimeZone19);
        int int23 = dateTimeZone19.getOffsetFromLocal((long) ' ');
        java.lang.String str24 = dateTimeZone19.toString();
        int int26 = dateTimeZone19.getOffset((long) 2000);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone19);
        mutableDateTime1.setZone(dateTimeZone19);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant10", (mutableDateTime1.compareTo(instant10) == 0) == mutableDateTime1.equals(instant10));
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = localDateTime4.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = localDateTime4.getChronology();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(0L, chronology19, locale20, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale25 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket22.saveField(dateTimeFieldType23, "1970-01-01T00:00:00.000Z", locale25);
        dateTimeParserBucket15.saveField(dateTimeFieldType16, "1970-01-01T00:00:00.000Z", locale25);
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology29, locale30, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale35 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket32.saveField(dateTimeFieldType33, "1970-01-01T00:00:00.000Z", locale35);
        java.lang.String str37 = locale25.getDisplayCountry(locale35);
        org.joda.time.Chronology chronology39 = null;
        java.util.Locale locale40 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket(0L, chronology39, locale40, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Chronology chronology46 = null;
        java.util.Locale locale47 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket(0L, chronology46, locale47, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale52 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket49.saveField(dateTimeFieldType50, "1970-01-01T00:00:00.000Z", locale52);
        dateTimeParserBucket42.saveField(dateTimeFieldType43, "1970-01-01T00:00:00.000Z", locale52);
        org.joda.time.Chronology chronology56 = null;
        java.util.Locale locale57 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket(0L, chronology56, locale57, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale62 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket59.saveField(dateTimeFieldType60, "1970-01-01T00:00:00.000Z", locale62);
        java.lang.String str64 = locale52.getDisplayCountry(locale62);
        java.lang.String str65 = locale35.getDisplayVariant(locale52);
        java.lang.String str66 = locale52.getDisplayScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket67 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology10, locale52);
        org.joda.time.Chronology chronology68 = chronology10.withUTC();
        java.util.Locale locale69 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str71 = locale69.getExtension('a');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket73 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology68, locale69, (java.lang.Integer) 2022);
        dateTimeParserBucket73.setOffset((java.lang.Integer) 10);
        org.joda.time.Chronology chronology76 = dateTimeParserBucket73.getChronology();
        org.joda.time.Chronology chronology77 = dateTimeParserBucket73.getChronology();
        org.joda.time.DateTime dateTime78 = org.joda.time.DateTime.now(chronology77);
        org.joda.time.DurationField durationField79 = chronology77.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime78", (dateTime9.compareTo(dateTime78) == 0) == dateTime9.equals(dateTime78));
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.getMutableDateTime();
        org.joda.time.Chronology chronology4 = null;
        mutableDateTime3.setChronology(chronology4);
        mutableDateTime3.addDays(0);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableDateTime3.add(readablePeriod8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime3.yearOfEra();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime3.secondOfDay();
        org.joda.time.DateTime dateTime12 = mutableDateTime3.toDateTime();
        org.joda.time.DateTime dateTime14 = dateTime12.minusHours(600);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology17 = localTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.clockhourOfHalfday();
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket(0L, chronology20, locale21, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale26 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket23.saveField(dateTimeFieldType24, "1970-01-01T00:00:00.000Z", locale26);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology17, locale26);
        org.joda.time.DateTimeField dateTimeField29 = chronology17.millisOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology17.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField31 = chronology17.weekyear();
        org.joda.time.Chronology chronology32 = chronology17.withUTC();
        org.joda.time.DateTime dateTime33 = dateTime12.toDateTime(chronology17);
        org.joda.time.DateTimeField dateTimeField34 = chronology17.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime33", (mutableDateTime1.compareTo(dateTime33) == 0) == mutableDateTime1.equals(dateTime33));
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime3.toDateTime(dateTimeZone6);
        org.joda.time.Chronology chronology9 = localDateTime3.getChronology();
        org.joda.time.LocalDateTime.Property property10 = localDateTime3.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime12 = property10.addToCopy((long) 4);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusMinutes((int) 'x');
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTime dateTime17 = localDateTime14.toDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(3577992076L, dateTimeZone16);
        boolean boolean21 = dateTimeZone16.isStandardOffset((long) 18130);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and mutableDateTime22", (dateTime8.compareTo(mutableDateTime22) == 0) == dateTime8.equals(mutableDateTime22));
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime3.toDateTime(dateTimeZone6);
        org.joda.time.Chronology chronology9 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.hours();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.era();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone14 = chronology9.getZone();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 365, dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime16.toMutableDateTime();
        int int18 = mutableDateTime17.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and mutableDateTime16", (dateTime8.compareTo(mutableDateTime16) == 0) == dateTime8.equals(mutableDateTime16));
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        org.joda.time.Instant instant10 = mutableDateTime1.toInstant();
        mutableDateTime1.addYears((int) (short) 10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime14 = mutableDateTime1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withMillisOfDay(100);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.plus(readableDuration20);
        org.joda.time.DateTime dateTime22 = localDateTime17.toDateTime();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime17.withYearOfEra((int) (short) 1);
        org.joda.time.Chronology chronology25 = localDateTime24.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.millis();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.secondOfDay();
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now(chronology25);
        mutableDateTime1.setChronology(chronology25);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableDateTime1.add(readablePeriod30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now(dateTimeZone34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.withMillisOfDay(100);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.LocalDateTime localDateTime39 = localDateTime35.plus(readableDuration38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plusMinutes(3);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime39.plusSeconds(2);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.weekOfWeekyear();
        org.joda.time.DateTime dateTime45 = localDateTime43.toDateTime();
        org.joda.time.LocalDateTime.Property property46 = localDateTime43.hourOfDay();
        org.joda.time.LocalDateTime.Property property47 = localDateTime43.yearOfEra();
        int int48 = property32.compareTo((org.joda.time.ReadablePartial) localDateTime43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime14", (mutableDateTime1.compareTo(dateTime14) == 0) == mutableDateTime1.equals(dateTime14));
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfDay(100);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.plus(readableDuration6);
        org.joda.time.DateTime dateTime8 = localDateTime3.toDateTime();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime3.withYearOfEra((int) (short) 1);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.millis();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType0.getField(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(chronology11);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(chronology11);
        org.joda.time.DateTimeField dateTimeField16 = chronology11.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime15", (dateTime8.compareTo(dateTime15) == 0) == dateTime8.equals(dateTime15));
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(1644573073768L);
        org.joda.time.DateTime dateTime2 = dateTime1.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime4 = dateTime1.withMillisOfSecond(52);
        java.util.Date date5 = dateTime4.toDate();
        int int6 = dateTime4.getHourOfDay();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.clockhourOfHalfday();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology13, locale14, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale19 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket16.saveField(dateTimeFieldType17, "1970-01-01T00:00:00.000Z", locale19);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology10, locale19);
        java.lang.String str22 = chronology10.toString();
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(chronology10);
        org.joda.time.DurationField durationField24 = chronology10.seconds();
        org.joda.time.DurationField durationField25 = chronology10.centuries();
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.fromMillisOfDay((long) 12, chronology10);
        org.joda.time.DateTime dateTime27 = dateTime4.toDateTime(chronology10);
        org.joda.time.DurationField durationField28 = chronology10.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime27", (dateTime4.compareTo(dateTime27) == 0) == dateTime4.equals(dateTime27));
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        mutableDateTime1.setTime((long) (short) 10);
        int int12 = mutableDateTime1.getEra();
        org.joda.time.DateTime dateTime13 = mutableDateTime1.toDateTimeISO();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(0L, chronology15, locale16, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale23 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket(0L, chronology22, locale23, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale28 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket25.saveField(dateTimeFieldType26, "1970-01-01T00:00:00.000Z", locale28);
        dateTimeParserBucket18.saveField(dateTimeFieldType19, "1970-01-01T00:00:00.000Z", locale28);
        mutableDateTime1.set(dateTimeFieldType19, (int) ' ');
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime1.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime1.millisOfSecond();
        int int35 = mutableDateTime1.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        int int40 = dateTimeZone38.getOffset((long) '4');
        long long43 = dateTimeZone38.adjustOffset(100L, false);
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime1.toMutableDateTime(dateTimeZone38);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((long) (short) 0, chronology47);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) (short) 0, chronology50);
        boolean boolean52 = localDate48.isEqual((org.joda.time.ReadablePartial) localDate51);
        int int53 = localDate51.getDayOfWeek();
        org.joda.time.LocalDate.Property property54 = localDate51.weekOfWeekyear();
        org.joda.time.LocalDate localDate55 = property54.roundFloorCopy();
        org.joda.time.LocalDate localDate56 = property54.roundCeilingCopy();
        org.joda.time.LocalDate localDate57 = property54.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.Interval interval60 = localDate57.toInterval(dateTimeZone59);
        long long62 = dateTimeZone59.previousTransition((long) 2100000);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((-2208988800000L), dateTimeZone59);
        org.joda.time.MutableDateTime mutableDateTime64 = mutableDateTime1.toMutableDateTime(dateTimeZone59);
        org.joda.time.DateTimeField dateTimeField65 = mutableDateTime64.getRoundingField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime44", (mutableDateTime1.compareTo(mutableDateTime44) == 0) == mutableDateTime1.equals(mutableDateTime44));
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.monthOfYear();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime6 = property5.withMaximumValue();
        long long7 = property5.remainder();
        int int8 = property5.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(0L);
        mutableDateTime10.setMinuteOfDay(4);
        int int13 = property5.compareTo((org.joda.time.ReadableInstant) mutableDateTime10);
        java.lang.String str14 = mutableDateTime10.toString();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime10.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.dayOfYear();
        boolean boolean20 = mutableDateTime18.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime18.setZone(dateTimeZone22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(6048000000L, dateTimeZone22);
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone22);
        long long27 = dateTimeZone22.convertUTCToLocal((long) 0);
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone22.getShortName(3940L, locale29);
        mutableDateTime15.setZone(dateTimeZone22);
        int int33 = dateTimeZone22.getStandardOffset(381472230L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and mutableDateTime15", (mutableDateTime10.compareTo(mutableDateTime15) == 0) == mutableDateTime10.equals(mutableDateTime15));
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withChronology(chronology13);
        org.joda.time.DateTime.Property property15 = dateTime12.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.minus(readableDuration16);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) 0);
        int int20 = mutableDateTime19.getEra();
        org.joda.time.Chronology chronology21 = null;
        mutableDateTime19.setChronology(chronology21);
        boolean boolean23 = dateTime12.isBefore((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.DateTime dateTime25 = dateTime12.minusYears(3600000);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) (short) 0, chronology27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 0, chronology30);
        boolean boolean32 = localDate28.isEqual((org.joda.time.ReadablePartial) localDate31);
        int int33 = localDate31.getDayOfWeek();
        org.joda.time.LocalDate.Property property34 = localDate31.weekOfWeekyear();
        org.joda.time.LocalDate localDate35 = property34.roundFloorCopy();
        org.joda.time.LocalDate localDate36 = property34.roundCeilingCopy();
        org.joda.time.LocalDate localDate37 = property34.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.Interval interval40 = localDate37.toInterval(dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime25.toMutableDateTime(dateTimeZone39);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime41.dayOfYear();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) (short) 0, chronology44);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((long) (short) 0, chronology47);
        boolean boolean49 = localDate45.isEqual((org.joda.time.ReadablePartial) localDate48);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = localDate45.toDateTimeAtStartOfDay(dateTimeZone50);
        org.joda.time.DateTime dateTime53 = dateTime51.minusSeconds((int) (byte) 100);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate((long) (short) 0, chronology55);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((long) (short) 0, chronology58);
        boolean boolean60 = localDate56.isEqual((org.joda.time.ReadablePartial) localDate59);
        int int61 = localDate59.getDayOfWeek();
        org.joda.time.LocalDate.Property property62 = localDate59.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval65 = localDate59.toInterval(dateTimeZone64);
        org.joda.time.DateTime dateTime66 = dateTime53.toDateTime(dateTimeZone64);
        long long68 = dateTimeZone64.previousTransition((long) 333);
        mutableDateTime41.setZone(dateTimeZone64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime66", (dateTime10.compareTo(dateTime66) == 0) == dateTime10.equals(dateTime66));
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime3.toDateTime(dateTimeZone6);
        org.joda.time.Chronology chronology9 = localDateTime3.getChronology();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket(0L, chronology11, locale12, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale19, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale24 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket21.saveField(dateTimeFieldType22, "1970-01-01T00:00:00.000Z", locale24);
        dateTimeParserBucket14.saveField(dateTimeFieldType15, "1970-01-01T00:00:00.000Z", locale24);
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket31.saveField(dateTimeFieldType32, "1970-01-01T00:00:00.000Z", locale34);
        java.lang.String str36 = locale24.getDisplayCountry(locale34);
        org.joda.time.Chronology chronology38 = null;
        java.util.Locale locale39 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket(0L, chronology38, locale39, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Chronology chronology45 = null;
        java.util.Locale locale46 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket(0L, chronology45, locale46, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale51 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket48.saveField(dateTimeFieldType49, "1970-01-01T00:00:00.000Z", locale51);
        dateTimeParserBucket41.saveField(dateTimeFieldType42, "1970-01-01T00:00:00.000Z", locale51);
        org.joda.time.Chronology chronology55 = null;
        java.util.Locale locale56 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket(0L, chronology55, locale56, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale61 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket58.saveField(dateTimeFieldType59, "1970-01-01T00:00:00.000Z", locale61);
        java.lang.String str63 = locale51.getDisplayCountry(locale61);
        java.lang.String str64 = locale34.getDisplayVariant(locale51);
        java.lang.String str65 = locale51.getDisplayScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket66 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology9, locale51);
        org.joda.time.Chronology chronology67 = chronology9.withUTC();
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime(chronology67);
        org.joda.time.DateTime.Property property69 = dateTime68.millisOfSecond();
        org.joda.time.Interval interval70 = property69.toInterval();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime68", (dateTime8.compareTo(dateTime68) == 0) == dateTime8.equals(dateTime68));
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        org.joda.time.Instant instant10 = mutableDateTime1.toInstant();
        boolean boolean12 = mutableDateTime1.isAfter((long) (byte) 1);
        mutableDateTime1.addWeekyears(69);
        int int15 = mutableDateTime1.getWeekOfWeekyear();
        org.joda.time.Instant instant16 = mutableDateTime1.toInstant();
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutableDateTime1.add(readableDuration17);
        mutableDateTime1.setMillisOfDay(1964);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) (short) 0, chronology22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) (short) 0, chronology25);
        boolean boolean27 = localDate23.isEqual((org.joda.time.ReadablePartial) localDate26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = localDate23.toDateTimeAtStartOfDay(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime32 = dateTime29.toDateTimeISO();
        org.joda.time.DateTime dateTime34 = dateTime32.plusMinutes((int) (byte) 1);
        org.joda.time.DateTime dateTime35 = dateTime32.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime37 = dateTime32.withYearOfEra((int) (short) 10);
        boolean boolean38 = dateTime32.isBeforeNow();
        int int39 = dateTime32.getDayOfYear();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) (short) 0, chronology41);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) (short) 0, chronology44);
        boolean boolean46 = localDate42.isEqual((org.joda.time.ReadablePartial) localDate45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = localDate42.toDateTimeAtStartOfDay(dateTimeZone47);
        org.joda.time.DateTime dateTime50 = dateTime48.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.DateTime dateTime52 = dateTime48.plus(readableDuration51);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = dateTime52.withChronology(chronology53);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate((long) (short) 0, chronology56);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate((long) (short) 0, chronology59);
        boolean boolean61 = localDate57.isEqual((org.joda.time.ReadablePartial) localDate60);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateTime dateTime63 = localDate57.toDateTimeAtStartOfDay(dateTimeZone62);
        org.joda.time.DateTime dateTime65 = dateTime63.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration66 = null;
        org.joda.time.DateTime dateTime67 = dateTime63.plus(readableDuration66);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.DateTime dateTime69 = dateTime67.withChronology(chronology68);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.DateTime dateTime71 = dateTime67.withChronology(chronology70);
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property74 = mutableDateTime73.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = property74.getFieldType();
        org.joda.time.DateTime.Property property76 = dateTime71.property(dateTimeFieldType75);
        boolean boolean77 = dateTime54.equals((java.lang.Object) property76);
        org.joda.time.DateTime.Property property78 = dateTime54.weekOfWeekyear();
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.DateTime dateTime80 = dateTime54.toDateTime(chronology79);
        boolean boolean81 = dateTime32.isAfter((org.joda.time.ReadableInstant) dateTime80);
        org.joda.time.DateTime dateTime82 = dateTime32.toDateTime();
        boolean boolean83 = mutableDateTime1.isBefore((org.joda.time.ReadableInstant) dateTime82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime73", (instant10.compareTo(mutableDateTime73) == 0) == instant10.equals(mutableDateTime73));
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        int int7 = localDate5.getDayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate9 = localDate5.plus(readablePeriod8);
        int int10 = localDate5.size();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 0);
        long long17 = dateTimeParserBucket15.computeMillis(true);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 0, chronology19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) (short) 0, chronology22);
        boolean boolean24 = localDate20.isEqual((org.joda.time.ReadablePartial) localDate23);
        int int25 = localDate23.getDayOfWeek();
        org.joda.time.LocalDate.Property property26 = localDate23.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval29 = localDate23.toInterval(dateTimeZone28);
        long long31 = dateTimeZone28.convertUTCToLocal((long) 0);
        dateTimeParserBucket15.setZone(dateTimeZone28);
        java.lang.String str34 = dateTimeZone28.getName((long) ' ');
        boolean boolean36 = dateTimeZone28.isStandardOffset((long) 6);
        org.joda.time.Interval interval37 = localDate5.toInterval(dateTimeZone28);
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.DateTime dateTime41 = dateTime38.toDateTime(dateTimeZone40);
        org.joda.time.LocalDate localDate42 = org.joda.time.LocalDate.now(dateTimeZone40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime38 and dateTime41", (dateTime38.compareTo(dateTime41) == 0) == dateTime38.equals(dateTime41));
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        int int5 = localDateTime2.get(dateTimeFieldType4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusSeconds((-1));
        org.joda.time.LocalDateTime.Property property8 = localDateTime2.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime2.withMinuteOfHour(48);
        org.joda.time.LocalDateTime.Property property11 = localDateTime2.era();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withMillisOfDay(100);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.plus(readableDuration17);
        org.joda.time.DateTime dateTime19 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime21 = dateTime19.minusMonths((int) (byte) -1);
        org.joda.time.DateTime dateTime23 = dateTime19.plusDays(365);
        org.joda.time.DateTime dateTime24 = localDateTime2.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime26 = dateTime23.plus(1123456902278400000L);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.dayOfYear();
        boolean boolean30 = mutableDateTime28.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime28.setZone(dateTimeZone32);
        java.lang.String str34 = mutableDateTime28.toString();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime28.add(readablePeriod35);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime46.dayOfYear();
        boolean boolean48 = mutableDateTime46.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime46.setZone(dateTimeZone50);
        long long53 = dateTimeZone50.nextTransition((long) '4');
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((int) (byte) -1, 2, 5, 4, (int) (short) 0, 0, 100, dateTimeZone50);
        java.lang.String str56 = dateTimeZone50.getNameKey((long) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(0L, dateTimeZone50);
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.minus(readablePeriod60);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime61.plusDays((int) 'a');
        int int64 = localDateTime61.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime61.withMillisOfDay(2022);
        boolean boolean67 = dateTimeZone50.isLocalDateTimeGap(localDateTime61);
        mutableDateTime28.setZoneRetainFields(dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime71 = org.joda.time.LocalDateTime.now(dateTimeZone70);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.withMillisOfDay(100);
        org.joda.time.ReadableDuration readableDuration74 = null;
        org.joda.time.LocalDateTime localDateTime75 = localDateTime71.plus(readableDuration74);
        org.joda.time.DateTime dateTime76 = localDateTime71.toDateTime();
        org.joda.time.LocalDateTime localDateTime78 = localDateTime71.withYearOfEra((int) (short) 1);
        org.joda.time.Chronology chronology79 = localDateTime78.getChronology();
        org.joda.time.ReadableDuration readableDuration80 = null;
        org.joda.time.LocalDateTime localDateTime81 = localDateTime78.minus(readableDuration80);
        org.joda.time.LocalDateTime.Property property82 = localDateTime81.millisOfDay();
        boolean boolean83 = dateTimeZone50.isLocalDateTimeGap(localDateTime81);
        org.joda.time.LocalDateTime localDateTime84 = new org.joda.time.LocalDateTime(dateTimeZone50);
        org.joda.time.MutableDateTime mutableDateTime85 = dateTime23.toMutableDateTime(dateTimeZone50);
        int int87 = dateTimeZone50.getOffset(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and mutableDateTime85", (dateTime23.compareTo(mutableDateTime85) == 0) == dateTime23.equals(mutableDateTime85));
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 25);
        org.joda.time.DateTime dateTime3 = dateTime1.plus(0L);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property6.getFieldType();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundHalfEven();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfMonth();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket(0L, chronology11, locale12, (java.lang.Integer) 0);
        long long16 = dateTimeParserBucket14.computeMillis(true);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 0, chronology18);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) (short) 0, chronology21);
        boolean boolean23 = localDate19.isEqual((org.joda.time.ReadablePartial) localDate22);
        int int24 = localDate22.getDayOfWeek();
        org.joda.time.LocalDate.Property property25 = localDate22.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval28 = localDate22.toInterval(dateTimeZone27);
        long long30 = dateTimeZone27.convertUTCToLocal((long) 0);
        dateTimeParserBucket14.setZone(dateTimeZone27);
        long long34 = dateTimeZone27.convertLocalToUTC(0L, false);
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime8.toMutableDateTime(dateTimeZone27);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) (short) 0, chronology37);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((long) (short) 0, chronology40);
        boolean boolean42 = localDate38.isEqual((org.joda.time.ReadablePartial) localDate41);
        int int43 = localDate41.getDayOfWeek();
        org.joda.time.LocalDate.Property property44 = localDate41.weekOfWeekyear();
        int int45 = localDate41.getDayOfWeek();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((long) (short) 0, chronology47);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) (short) 0, chronology50);
        boolean boolean52 = localDate48.isEqual((org.joda.time.ReadablePartial) localDate51);
        int int53 = localDate51.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean55 = localDate51.isSupported(dateTimeFieldType54);
        int int56 = localDate41.get(dateTimeFieldType54);
        int int57 = mutableDateTime35.get(dateTimeFieldType54);
        org.joda.time.DateTime.Property property58 = dateTime3.property(dateTimeFieldType54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and mutableDateTime35", (mutableDateTime5.compareTo(mutableDateTime35) == 0) == mutableDateTime5.equals(mutableDateTime35));
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 0, chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        boolean boolean7 = localDate3.isEqual((org.joda.time.ReadablePartial) localDate6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate3.toDateTimeAtStartOfDay(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.plus(readableDuration12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.withChronology(chronology14);
        org.joda.time.DateTime.Property property16 = dateTime13.secondOfMinute();
        org.joda.time.DateTime dateTime18 = dateTime13.withMinuteOfHour((int) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar19 = dateTime18.toGregorianCalendar();
        org.joda.time.DateTime dateTime21 = dateTime18.withCenturyOfEra(4);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 2039, true, (long) (byte) 100);
        org.joda.time.DateTime dateTime28 = dateTime21.toDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(0L, dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime28", (dateTime21.compareTo(dateTime28) == 0) == dateTime21.equals(dateTime28));
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.clockhourOfHalfday();
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale6 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology5, locale6, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale11 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket8.saveField(dateTimeFieldType9, "1970-01-01T00:00:00.000Z", locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology2, locale11);
        java.lang.String str14 = chronology2.toString();
        org.joda.time.DurationField durationField15 = chronology2.eras();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DurationField durationField17 = chronology2.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField17, and durationField15", !(durationField15.compareTo(durationField17) == 0) || (Math.signum(durationField15.compareTo(durationField15)) == Math.signum(durationField17.compareTo(durationField15))));
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 0, chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 0, chronology15);
        boolean boolean17 = localDate13.isEqual((org.joda.time.ReadablePartial) localDate16);
        int int18 = localDate16.getDayOfWeek();
        org.joda.time.LocalDate.Property property19 = localDate16.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval22 = localDate16.toInterval(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = dateTime10.toDateTime(dateTimeZone21);
        long long25 = dateTimeZone21.previousTransition((long) 333);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime26.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime23", (dateTime10.compareTo(dateTime23) == 0) == dateTime10.equals(dateTime23));
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 0, chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 0, chronology15);
        boolean boolean17 = localDate13.isEqual((org.joda.time.ReadablePartial) localDate16);
        int int18 = localDate16.getDayOfWeek();
        org.joda.time.LocalDate.Property property19 = localDate16.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval22 = localDate16.toInterval(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = dateTime10.toDateTime(dateTimeZone21);
        long long25 = dateTimeZone21.previousTransition((long) 333);
        int int27 = dateTimeZone21.getOffset(3578366831L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime23", (dateTime10.compareTo(dateTime23) == 0) == dateTime10.equals(dateTime23));
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withChronology(chronology13);
        org.joda.time.DateTime.Property property15 = dateTime12.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.minus(readableDuration16);
        org.joda.time.DateTime.Property property18 = dateTime12.centuryOfEra();
        org.joda.time.DateTime dateTime19 = property18.roundCeilingCopy();
        org.joda.time.DateTime dateTime20 = property18.roundFloorCopy();
        org.joda.time.DateTime dateTime22 = dateTime20.plusMonths((int) (byte) 100);
        org.joda.time.Instant instant23 = dateTime22.toInstant();
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime();
        org.joda.time.DateTime.Property property25 = dateTime22.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant23 and dateTime22", (instant23.compareTo(dateTime22) == 0) == instant23.equals(dateTime22));
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.clockhourOfHalfday();
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale6 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology5, locale6, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale11 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket8.saveField(dateTimeFieldType9, "1970-01-01T00:00:00.000Z", locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology2, locale11);
        java.lang.String str14 = chronology2.toString();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(chronology2);
        org.joda.time.DateTimeField dateTimeField16 = chronology2.weekyear();
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(chronology2);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.ReadableDuration readableDuration21 = null;
        mutableDateTime19.add(readableDuration21, 3);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime19.getZone();
        int int26 = dateTimeZone24.getOffset((long) (byte) 1);
        org.joda.time.Chronology chronology27 = chronology2.withZone(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField28 = chronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField29 = chronology2.secondOfDay();
        org.joda.time.DurationField durationField30 = chronology2.halfdays();
        org.joda.time.DateTimeZone dateTimeZone31 = chronology2.getZone();
        org.joda.time.DateTimeField dateTimeField32 = chronology2.minuteOfHour();
        org.joda.time.DurationField durationField33 = chronology2.centuries();
        org.joda.time.DateTimeField dateTimeField34 = chronology2.clockhourOfDay();
        org.joda.time.Chronology chronology36 = null;
        java.util.Locale locale37 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket(0L, chronology36, locale37, (java.lang.Integer) 0);
        java.util.Locale locale40 = dateTimeParserBucket39.getLocale();
        java.lang.Object obj41 = null;
        boolean boolean42 = dateTimeParserBucket39.restoreState(obj41);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((long) 0);
        int int45 = mutableDateTime44.getEra();
        org.joda.time.ReadableDuration readableDuration46 = null;
        mutableDateTime44.add(readableDuration46);
        java.util.GregorianCalendar gregorianCalendar48 = mutableDateTime44.toGregorianCalendar();
        mutableDateTime44.setMillisOfSecond(25);
        org.joda.time.LocalTime localTime51 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.LocalTime localTime54 = localTime51.withPeriodAdded(readablePeriod52, (int) (short) 0);
        org.joda.time.LocalTime.Property property55 = localTime51.secondOfMinute();
        org.joda.time.LocalTime localTime56 = property55.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime57 = property55.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime59 = property55.addCopy((int) 'u');
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = property55.getFieldType();
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime44.property(dateTimeFieldType60);
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime65.dayOfYear();
        boolean boolean67 = mutableDateTime65.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime65.setZone(dateTimeZone69);
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime(6048000000L, dateTimeZone69);
        org.joda.time.DateTime dateTime72 = org.joda.time.DateTime.now(dateTimeZone69);
        java.util.Locale locale75 = new java.util.Locale("FR");
        java.lang.String str76 = dateTimeZone69.getName((-259200000L), locale75);
        dateTimeParserBucket39.saveField(dateTimeFieldType60, "janv.", locale75);
        int int78 = dateTimeField34.getMaximumTextLength(locale75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and dateTime72", (mutableDateTime15.compareTo(dateTime72) == 0) == mutableDateTime15.equals(dateTime72));
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        mutableDateTime1.setTime((long) (short) 10);
        int int12 = mutableDateTime1.getEra();
        org.joda.time.DateTime dateTime13 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfYear();
        org.joda.time.DateTime.Property property15 = dateTime13.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.withPeriodAdded(readablePeriod16, 35);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now(dateTimeZone25);
        boolean boolean28 = dateTimeZone25.isStandardOffset((long) 3);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone25);
        boolean boolean30 = dateTimeZone22.equals((java.lang.Object) dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) 9, dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime18.toMutableDateTime(dateTimeZone22);
        boolean boolean33 = dateTimeZone22.isFixed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime32", (mutableDateTime1.compareTo(mutableDateTime32) == 0) == mutableDateTime1.equals(mutableDateTime32));
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime11 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime.Property property12 = dateTime8.weekyear();
        org.joda.time.DateTime dateTime13 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime15 = dateTime13.minusWeeks((int) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime13.withWeekOfWeekyear((int) (short) 1);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 0, chronology19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) (short) 0, chronology22);
        boolean boolean24 = localDate20.isEqual((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localDate20.toDateTimeAtStartOfDay(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime30 = dateTime26.plus(readableDuration29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = dateTime30.withChronology(chronology31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = dateTime30.withChronology(chronology33);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime36.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property37.getFieldType();
        org.joda.time.DateTime.Property property39 = dateTime34.property(dateTimeFieldType38);
        org.joda.time.DateTimeField dateTimeField40 = property39.getField();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((long) (short) 0, chronology42);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) (short) 0, chronology45);
        boolean boolean47 = localDate43.isEqual((org.joda.time.ReadablePartial) localDate46);
        int int48 = localDate46.getDayOfWeek();
        org.joda.time.LocalDate.Property property49 = localDate46.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval52 = localDate46.toInterval(dateTimeZone51);
        int[] intArray54 = new int[] { 'a' };
        int int55 = dateTimeField40.getMaximumValue((org.joda.time.ReadablePartial) localDate46, intArray54);
        org.joda.time.Chronology chronology58 = null;
        java.util.Locale locale59 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket61 = new org.joda.time.format.DateTimeParserBucket(0L, chronology58, locale59, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale64 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket61.saveField(dateTimeFieldType62, "1970-01-01T00:00:00.000Z", locale64);
        java.util.Set<java.lang.String> strSet66 = locale64.getUnicodeLocaleAttributes();
        java.lang.String str67 = localDate46.toString("1", locale64);
        org.joda.time.LocalDate localDate69 = localDate46.withMonthOfYear(5);
        org.joda.time.Chronology chronology70 = localDate69.getChronology();
        org.joda.time.Chronology chronology71 = chronology70.withUTC();
        org.joda.time.DateTimeField dateTimeField72 = chronology71.minuteOfDay();
        org.joda.time.DateTime dateTime73 = org.joda.time.DateTime.now(chronology71);
        org.joda.time.ReadablePeriod readablePeriod74 = null;
        long long77 = chronology71.add(readablePeriod74, (long) 'a', 292278993);
        org.joda.time.DateTime dateTime78 = dateTime13.toDateTime(chronology71);
        org.joda.time.DateTime dateTime79 = org.joda.time.DateTime.now(chronology71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime78", (dateTime8.compareTo(dateTime78) == 0) == dateTime8.equals(dateTime78));
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = property2.getFieldType();
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale6 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology5, locale6, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale18 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket15.saveField(dateTimeFieldType16, "1970-01-01T00:00:00.000Z", locale18);
        dateTimeParserBucket8.saveField(dateTimeFieldType9, "1970-01-01T00:00:00.000Z", locale18);
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale23 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket(0L, chronology22, locale23, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale28 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket25.saveField(dateTimeFieldType26, "1970-01-01T00:00:00.000Z", locale28);
        java.lang.String str30 = locale18.getDisplayCountry(locale28);
        java.lang.String str31 = property2.getAsText(locale18);
        org.joda.time.MutableDateTime mutableDateTime32 = property2.roundHalfCeiling();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) (short) 0, chronology35);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) (short) 0, chronology38);
        boolean boolean40 = localDate36.isEqual((org.joda.time.ReadablePartial) localDate39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = localDate36.toDateTimeAtStartOfDay(dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.DateTime dateTime46 = dateTime42.plus(readableDuration45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTime dateTime48 = dateTime46.withChronology(chronology47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = dateTime46.withChronology(chronology49);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime52.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = property53.getFieldType();
        org.joda.time.DateTime.Property property55 = dateTime50.property(dateTimeFieldType54);
        org.joda.time.DateTimeField dateTimeField56 = property55.getField();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((long) (short) 0, chronology58);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate((long) (short) 0, chronology61);
        boolean boolean63 = localDate59.isEqual((org.joda.time.ReadablePartial) localDate62);
        int int64 = localDate62.getDayOfWeek();
        org.joda.time.LocalDate.Property property65 = localDate62.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval68 = localDate62.toInterval(dateTimeZone67);
        int[] intArray70 = new int[] { 'a' };
        int int71 = dateTimeField56.getMaximumValue((org.joda.time.ReadablePartial) localDate62, intArray70);
        org.joda.time.Chronology chronology74 = null;
        java.util.Locale locale75 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket77 = new org.joda.time.format.DateTimeParserBucket(0L, chronology74, locale75, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale80 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket77.saveField(dateTimeFieldType78, "1970-01-01T00:00:00.000Z", locale80);
        java.util.Set<java.lang.String> strSet82 = locale80.getUnicodeLocaleAttributes();
        java.lang.String str83 = localDate62.toString("1", locale80);
        org.joda.time.LocalDate localDate85 = localDate62.withMonthOfYear(5);
        org.joda.time.Chronology chronology86 = localDate85.getChronology();
        org.joda.time.DateTimeField dateTimeField87 = chronology86.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime88 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology86);
        org.joda.time.Chronology chronology89 = chronology86.withUTC();
        mutableDateTime32.setChronology(chronology89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime32 and dateTime42", (mutableDateTime32.compareTo(dateTime42) == 0) == mutableDateTime32.equals(dateTime42));
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.millisOfSecond();
        boolean boolean4 = property3.isLeap();
        org.joda.time.MutableDateTime mutableDateTime6 = property3.addWrapField(35449917);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        boolean boolean12 = mutableDateTime10.isAfterNow();
        boolean boolean13 = mutableDateTime8.isBefore((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 0, chronology15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 0, chronology18);
        boolean boolean20 = localDate16.isEqual((org.joda.time.ReadablePartial) localDate19);
        int int21 = localDate19.getDayOfWeek();
        org.joda.time.LocalDate.Property property22 = localDate19.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval25 = localDate19.toInterval(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime10.toMutableDateTime(dateTimeZone24);
        mutableDateTime10.add((long) 59);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime10.add(readablePeriod29, 1970);
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime10.getZone();
        long long35 = dateTimeZone33.nextTransition(0L);
        int int37 = dateTimeZone33.getOffsetFromLocal((long) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and mutableDateTime26", (mutableDateTime8.compareTo(mutableDateTime26) == 0) == mutableDateTime8.equals(mutableDateTime26));
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) 0, chronology7);
        boolean boolean9 = localDate5.isEqual((org.joda.time.ReadablePartial) localDate8);
        int int10 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate.Property property11 = localDate8.weekOfWeekyear();
        org.joda.time.LocalDate localDate12 = property11.roundFloorCopy();
        org.joda.time.LocalDate localDate13 = property11.roundCeilingCopy();
        org.joda.time.LocalDate localDate14 = property11.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.Interval interval17 = localDate14.toInterval(dateTimeZone16);
        mutableDateTime1.setZoneRetainFields(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime19.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime22 = dateTime20.minusMillis(52);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime31.dayOfYear();
        boolean boolean33 = mutableDateTime31.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime31.setZone(dateTimeZone35);
        long long38 = dateTimeZone35.nextTransition((long) '4');
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((int) (byte) -1, 2, 5, 4, (int) (short) 0, 0, 100, dateTimeZone35);
        java.lang.String str41 = dateTimeZone35.getNameKey((long) (byte) 100);
        long long44 = dateTimeZone35.adjustOffset(25260020L, true);
        long long47 = dateTimeZone35.adjustOffset(0L, true);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(dateTimeZone35);
        boolean boolean49 = dateTime20.isAfter((org.joda.time.ReadableInstant) mutableDateTime48);
        org.joda.time.DateTime dateTime51 = dateTime20.minusSeconds(33600);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and mutableDateTime48", (dateTime20.compareTo(mutableDateTime48) == 0) == dateTime20.equals(mutableDateTime48));
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        int int5 = dateTimeZone3.getOffset((long) '4');
        long long7 = dateTimeZone3.nextTransition((long) 70);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        mutableDateTime9.addMonths((int) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.dayOfYear();
        boolean boolean18 = mutableDateTime16.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime16.setZone(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(6048000000L, dateTimeZone20);
        mutableDateTime9.setZone(dateTimeZone20);
        long long25 = dateTimeZone3.getMillisKeepLocal(dateTimeZone20, (long) 'u');
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(62L, dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.dayOfYear();
        mutableDateTime28.setMinuteOfHour(10);
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime28.copy();
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime34.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime36 = property35.getMutableDateTime();
        org.joda.time.Chronology chronology37 = null;
        mutableDateTime36.setChronology(chronology37);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime36.year();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        mutableDateTime36.add(readablePeriod40);
        mutableDateTime32.setMillis((org.joda.time.ReadableInstant) mutableDateTime36);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) (short) 0, chronology44);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((long) (short) 0, chronology47);
        boolean boolean49 = localDate45.isEqual((org.joda.time.ReadablePartial) localDate48);
        int int50 = localDate48.getDayOfWeek();
        org.joda.time.LocalDate.Property property51 = localDate48.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = property51.getFieldType();
        org.joda.time.LocalDate localDate53 = property51.withMinimumValue();
        org.joda.time.LocalDate localDate55 = property51.addWrapFieldToCopy(0);
        org.joda.time.DurationField durationField56 = property51.getLeapDurationField();
        java.lang.String str57 = property51.toString();
        org.joda.time.LocalDate localDate58 = property51.roundHalfFloorCopy();
        org.joda.time.LocalDate.Property property59 = localDate58.yearOfCentury();
        org.joda.time.LocalDate localDate61 = property59.addToCopy(44);
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean63 = localDate61.isSupported(dateTimeFieldType62);
        int int64 = mutableDateTime32.get(dateTimeFieldType62);
        boolean boolean65 = dateTime26.isSupported(dateTimeFieldType62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and mutableDateTime32", (mutableDateTime16.compareTo(mutableDateTime32) == 0) == mutableDateTime16.equals(mutableDateTime32));
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        org.joda.time.Instant instant10 = mutableDateTime1.toInstant();
        mutableDateTime1.addSeconds(10);
        int int13 = mutableDateTime1.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) 0);
        int int16 = mutableDateTime15.getEra();
        org.joda.time.Chronology chronology17 = null;
        mutableDateTime15.setChronology(chronology17);
        int int19 = mutableDateTime15.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField21 = property20.getField();
        boolean boolean23 = dateTimeField21.isLeap((long) 1438);
        int int24 = mutableDateTime1.get(dateTimeField21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime15", (instant10.compareTo(mutableDateTime15) == 0) == instant10.equals(mutableDateTime15));
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay(100);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.plus(readableDuration5);
        org.joda.time.DateTime dateTime7 = localDateTime2.toDateTime();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.withYearOfEra((int) (short) 1);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.minuteOfDay();
        org.joda.time.DurationField durationField13 = chronology10.seconds();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.dayOfYear();
        org.joda.time.DurationField durationField15 = chronology10.eras();
        org.joda.time.DateTimeField dateTimeField16 = chronology10.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField15", Math.signum(durationField13.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField13)));
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime11 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime.Property property12 = dateTime11.hourOfDay();
        org.joda.time.DateTime dateTime14 = dateTime11.minusSeconds(0);
        org.joda.time.DateTime dateTime16 = dateTime14.plusDays(1);
        boolean boolean17 = dateTime14.isAfterNow();
        org.joda.time.DateTime dateTime18 = dateTime14.withTimeAtStartOfDay();
        int int19 = dateTime18.getMillisOfDay();
        org.joda.time.DateTime.Property property20 = dateTime18.year();
        org.joda.time.DateTime.Property property21 = dateTime18.monthOfYear();
        org.joda.time.DateTime dateTime23 = dateTime18.withYear(2);
        org.joda.time.DateTime.Property property24 = dateTime18.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime27 = dateTime18.withPeriodAdded(readablePeriod25, 9);
        org.joda.time.DateTime dateTime29 = dateTime27.withYear(270000000);
        org.joda.time.Instant instant30 = dateTime29.toInstant();
        org.joda.time.DateTime.Property property31 = dateTime29.weekOfWeekyear();
        int int32 = property31.getMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and instant30", (dateTime29.compareTo(instant30) == 0) == dateTime29.equals(instant30));
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        mutableDateTime0.addWeeks(2);
        int int3 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 0, chronology8);
        boolean boolean10 = localDate6.isEqual((org.joda.time.ReadablePartial) localDate9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate6.toDateTimeAtStartOfDay(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusSeconds((int) (byte) 100);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (short) 0, chronology16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 0, chronology19);
        boolean boolean21 = localDate17.isEqual((org.joda.time.ReadablePartial) localDate20);
        int int22 = localDate20.getDayOfWeek();
        org.joda.time.LocalDate.Property property23 = localDate20.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval26 = localDate20.toInterval(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = dateTime14.toDateTime(dateTimeZone25);
        boolean boolean28 = mutableDateTime0.isEqual((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.dayOfYear();
        boolean boolean32 = mutableDateTime30.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime30.setZone(dateTimeZone34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        mutableDateTime30.add(readablePeriod36, 4);
        mutableDateTime30.setTime((long) (short) 10);
        int int41 = mutableDateTime30.getEra();
        org.joda.time.DateTime dateTime42 = mutableDateTime30.toDateTimeISO();
        int int43 = mutableDateTime30.getWeekOfWeekyear();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) (short) 0, chronology45);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((long) (short) 0, chronology48);
        boolean boolean50 = localDate46.isEqual((org.joda.time.ReadablePartial) localDate49);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = localDate46.toDateTimeAtStartOfDay(dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime55 = dateTime52.toDateTimeISO();
        org.joda.time.DateTime dateTime57 = dateTime55.plusMinutes((int) (byte) 1);
        org.joda.time.DateTime dateTime59 = dateTime55.minusDays(2039);
        int int60 = dateTime55.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone61 = dateTime55.getZone();
        int int63 = dateTimeZone61.getStandardOffset(100L);
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime(dateTimeZone61);
        mutableDateTime30.setZoneRetainFields(dateTimeZone61);
        boolean boolean67 = dateTimeZone61.isStandardOffset(11581401599965L);
        org.joda.time.DateTime dateTime68 = dateTime27.withZone(dateTimeZone61);
        long long70 = dateTimeZone61.convertUTCToLocal(59997L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime27", (dateTime14.compareTo(dateTime27) == 0) == dateTime14.equals(dateTime27));
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        org.joda.time.Instant instant10 = mutableDateTime1.toInstant();
        int int11 = mutableDateTime1.getWeekyear();
        mutableDateTime1.setDayOfMonth(1);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime1.yearOfEra();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (short) 0, chronology16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 0, chronology19);
        boolean boolean21 = localDate17.isEqual((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localDate17.toDateTimeAtStartOfDay(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime27 = dateTime23.plus(readableDuration26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.withChronology(chronology28);
        org.joda.time.DateTime.Property property30 = dateTime27.secondOfMinute();
        org.joda.time.DateTime dateTime32 = dateTime27.withMinuteOfHour((int) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar33 = dateTime32.toGregorianCalendar();
        org.joda.time.DateTime dateTime35 = dateTime32.withCenturyOfEra(4);
        mutableDateTime1.setDate((org.joda.time.ReadableInstant) dateTime35);
        mutableDateTime1.addMillis((int) 'x');
        boolean boolean39 = mutableDateTime1.isAfterNow();
        mutableDateTime1.addSeconds(238);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime1.year();
        org.joda.time.DateTimeField dateTimeField43 = mutableDateTime1.getRoundingField();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now(dateTimeZone45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.monthOfYear();
        org.joda.time.LocalDateTime.Property property48 = localDateTime46.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property49 = localDateTime46.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime55.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property56.getFieldType();
        org.joda.time.Chronology chronology59 = null;
        java.util.Locale locale60 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket62 = new org.joda.time.format.DateTimeParserBucket(0L, chronology59, locale60, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Chronology chronology66 = null;
        java.util.Locale locale67 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket69 = new org.joda.time.format.DateTimeParserBucket(0L, chronology66, locale67, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale72 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket69.saveField(dateTimeFieldType70, "1970-01-01T00:00:00.000Z", locale72);
        dateTimeParserBucket62.saveField(dateTimeFieldType63, "1970-01-01T00:00:00.000Z", locale72);
        org.joda.time.Chronology chronology76 = null;
        java.util.Locale locale77 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket79 = new org.joda.time.format.DateTimeParserBucket(0L, chronology76, locale77, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType80 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale82 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket79.saveField(dateTimeFieldType80, "1970-01-01T00:00:00.000Z", locale82);
        java.lang.String str84 = locale72.getDisplayCountry(locale82);
        java.lang.String str85 = property56.getAsText(locale72);
        java.lang.String str86 = dateTimeZone52.getShortName((long) 3, locale72);
        org.joda.time.LocalTime localTime87 = new org.joda.time.LocalTime((java.lang.Object) localDateTime46, dateTimeZone52);
        mutableDateTime1.setZoneRetainFields(dateTimeZone52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime55", (instant10.compareTo(mutableDateTime55) == 0) == instant10.equals(mutableDateTime55));
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime11 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime.Property property12 = dateTime11.hourOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 0, chronology14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) (short) 0, chronology17);
        boolean boolean19 = localDate15.isEqual((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property22.getFieldType();
        org.joda.time.LocalDate.Property property24 = localDate18.property(dateTimeFieldType23);
        org.joda.time.DurationFieldType durationFieldType25 = dateTimeFieldType23.getRangeDurationType();
        org.joda.time.DateTime dateTime27 = dateTime11.withFieldAdded(durationFieldType25, 5);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) (short) 0, chronology29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) (short) 0, chronology32);
        boolean boolean34 = localDate30.isEqual((org.joda.time.ReadablePartial) localDate33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = localDate30.toDateTimeAtStartOfDay(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime39 = dateTime36.toDateTimeISO();
        org.joda.time.DateTime.Property property40 = dateTime39.hourOfDay();
        org.joda.time.DateTime dateTime42 = dateTime39.minusSeconds(0);
        org.joda.time.DateTime dateTime44 = dateTime42.plusDays(1);
        org.joda.time.DateTime.Property property45 = dateTime44.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        int int50 = dateTimeZone48.getOffset((long) '4');
        long long52 = dateTimeZone48.previousTransition((long) ' ');
        org.joda.time.DateTime dateTime53 = dateTime44.toDateTime(dateTimeZone48);
        boolean boolean54 = dateTime11.isAfter((org.joda.time.ReadableInstant) dateTime44);
        int int55 = dateTime11.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and dateTime53", (dateTime44.compareTo(dateTime53) == 0) == dateTime44.equals(dateTime53));
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now(dateTimeZone5);
        org.joda.time.DateTime dateTime7 = localDateTime2.toDateTime(dateTimeZone5);
        org.joda.time.Chronology chronology8 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.hourOfHalfday();
        org.joda.time.DurationField durationField10 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.year();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusMillis((int) 'u');
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withMillisOfDay(9);
        long long20 = chronology8.set((org.joda.time.ReadablePartial) localDateTime18, (long) 653);
        org.joda.time.Chronology chronology21 = localDateTime18.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField22, and durationField10", !(durationField10.compareTo(durationField22) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField22.compareTo(durationField10))));
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withChronology(chronology13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime14.withWeekyear(0);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (short) 0, chronology20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (short) 0, chronology23);
        boolean boolean25 = localDate21.isEqual((org.joda.time.ReadablePartial) localDate24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localDate21.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime31 = dateTime27.plus(readableDuration30);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.withChronology(chronology32);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = dateTime31.withChronology(chronology34);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime37.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property38.getFieldType();
        org.joda.time.DateTime.Property property40 = dateTime35.property(dateTimeFieldType39);
        org.joda.time.DateTimeField dateTimeField41 = property40.getField();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) (short) 0, chronology43);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) (short) 0, chronology46);
        boolean boolean48 = localDate44.isEqual((org.joda.time.ReadablePartial) localDate47);
        int int49 = localDate47.getDayOfWeek();
        org.joda.time.LocalDate.Property property50 = localDate47.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval53 = localDate47.toInterval(dateTimeZone52);
        int[] intArray55 = new int[] { 'a' };
        int int56 = dateTimeField41.getMaximumValue((org.joda.time.ReadablePartial) localDate47, intArray55);
        org.joda.time.Chronology chronology59 = null;
        java.util.Locale locale60 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket62 = new org.joda.time.format.DateTimeParserBucket(0L, chronology59, locale60, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale65 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket62.saveField(dateTimeFieldType63, "1970-01-01T00:00:00.000Z", locale65);
        java.util.Set<java.lang.String> strSet67 = locale65.getUnicodeLocaleAttributes();
        java.lang.String str68 = localDate47.toString("1", locale65);
        org.joda.time.LocalDate localDate70 = localDate47.withMonthOfYear(5);
        org.joda.time.Chronology chronology71 = localDate70.getChronology();
        org.joda.time.DateTimeField dateTimeField72 = chronology71.yearOfEra();
        org.joda.time.DateTime dateTime73 = dateTime18.withChronology(chronology71);
        org.joda.time.DateTime dateTime75 = dateTime18.withYearOfEra(35471531);
        int int76 = dateTime75.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime73", (dateTime18.compareTo(dateTime73) == 0) == dateTime18.equals(dateTime73));
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 0);
        java.util.Locale locale5 = dateTimeParserBucket4.getLocale();
        java.lang.Integer int6 = dateTimeParserBucket4.getOffsetInteger();
        java.lang.Object obj7 = dateTimeParserBucket4.saveState();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) (short) 0, chronology9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 0, chronology12);
        boolean boolean14 = localDate10.isEqual((org.joda.time.ReadablePartial) localDate13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate10.toDateTimeAtStartOfDay(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime16.plus(readableDuration19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.withChronology(chronology21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = dateTime20.withChronology(chronology23);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property27.getFieldType();
        org.joda.time.DateTime.Property property29 = dateTime24.property(dateTimeFieldType28);
        org.joda.time.DateTimeField dateTimeField30 = property29.getField();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) (short) 0, chronology32);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) (short) 0, chronology35);
        boolean boolean37 = localDate33.isEqual((org.joda.time.ReadablePartial) localDate36);
        int int38 = localDate36.getDayOfWeek();
        org.joda.time.LocalDate.Property property39 = localDate36.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval42 = localDate36.toInterval(dateTimeZone41);
        int[] intArray44 = new int[] { 'a' };
        int int45 = dateTimeField30.getMaximumValue((org.joda.time.ReadablePartial) localDate36, intArray44);
        org.joda.time.Interval interval46 = localDate36.toInterval();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = localDate36.getFieldType(2);
        org.joda.time.LocalDate.Property property49 = localDate36.weekyear();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate((long) (short) 0, chronology51);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((long) (short) 0, chronology54);
        boolean boolean56 = localDate52.isEqual((org.joda.time.ReadablePartial) localDate55);
        int int57 = localDate55.getDayOfWeek();
        org.joda.time.LocalDate.Property property58 = localDate55.weekOfWeekyear();
        org.joda.time.LocalDate localDate59 = property58.roundFloorCopy();
        org.joda.time.LocalDate localDate60 = property58.roundCeilingCopy();
        org.joda.time.LocalDate localDate61 = property58.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.Interval interval64 = localDate61.toInterval(dateTimeZone63);
        org.joda.time.DateTime dateTime65 = localDate36.toDateTimeAtStartOfDay(dateTimeZone63);
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(dateTimeZone63);
        dateTimeParserBucket4.setZone(dateTimeZone63);
        org.joda.time.Chronology chronology68 = dateTimeParserBucket4.getChronology();
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(chronology68);
        org.joda.time.DateTimeField dateTimeField70 = chronology68.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime66 and mutableDateTime69", (mutableDateTime66.compareTo(mutableDateTime69) == 0) == mutableDateTime66.equals(mutableDateTime69));
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        mutableDateTime0.addWeeks(2);
        int int3 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 0, chronology8);
        boolean boolean10 = localDate6.isEqual((org.joda.time.ReadablePartial) localDate9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate6.toDateTimeAtStartOfDay(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusSeconds((int) (byte) 100);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (short) 0, chronology16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 0, chronology19);
        boolean boolean21 = localDate17.isEqual((org.joda.time.ReadablePartial) localDate20);
        int int22 = localDate20.getDayOfWeek();
        org.joda.time.LocalDate.Property property23 = localDate20.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval26 = localDate20.toInterval(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = dateTime14.toDateTime(dateTimeZone25);
        boolean boolean28 = mutableDateTime0.isEqual((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.dayOfYear();
        boolean boolean32 = mutableDateTime30.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime30.setZone(dateTimeZone34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        mutableDateTime30.add(readablePeriod36, 4);
        mutableDateTime30.setTime((long) (short) 10);
        int int41 = mutableDateTime30.getEra();
        org.joda.time.DateTime dateTime42 = mutableDateTime30.toDateTimeISO();
        int int43 = mutableDateTime30.getWeekOfWeekyear();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) (short) 0, chronology45);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((long) (short) 0, chronology48);
        boolean boolean50 = localDate46.isEqual((org.joda.time.ReadablePartial) localDate49);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = localDate46.toDateTimeAtStartOfDay(dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime55 = dateTime52.toDateTimeISO();
        org.joda.time.DateTime dateTime57 = dateTime55.plusMinutes((int) (byte) 1);
        org.joda.time.DateTime dateTime59 = dateTime55.minusDays(2039);
        int int60 = dateTime55.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone61 = dateTime55.getZone();
        int int63 = dateTimeZone61.getStandardOffset(100L);
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime(dateTimeZone61);
        mutableDateTime30.setZoneRetainFields(dateTimeZone61);
        boolean boolean67 = dateTimeZone61.isStandardOffset(11581401599965L);
        org.joda.time.DateTime dateTime68 = dateTime27.withZone(dateTimeZone61);
        org.joda.time.DateTime dateTime70 = dateTime68.plusYears(2100019);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime27", (dateTime14.compareTo(dateTime27) == 0) == dateTime14.equals(dateTime27));
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.clockhourOfHalfday();
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale6 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology5, locale6, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale11 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket8.saveField(dateTimeFieldType9, "1970-01-01T00:00:00.000Z", locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology2, locale11);
        org.joda.time.DateTimeField dateTimeField14 = chronology2.millisOfDay();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology2);
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology18 = localTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.clockhourOfHalfday();
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket(0L, chronology21, locale22, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale27 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket24.saveField(dateTimeFieldType25, "1970-01-01T00:00:00.000Z", locale27);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology18, locale27);
        java.lang.String str30 = chronology18.toString();
        org.joda.time.DurationField durationField31 = chronology18.eras();
        org.joda.time.LocalTime localTime32 = org.joda.time.LocalTime.now(chronology18);
        int[] intArray34 = chronology2.get((org.joda.time.ReadablePartial) localTime32, (long) 35449917);
        org.joda.time.DateTimeField dateTimeField35 = chronology2.yearOfEra();
        org.joda.time.Chronology chronology36 = chronology2.withUTC();
        java.lang.String str37 = chronology36.toString();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.centuryOfEra();
        org.joda.time.DurationField durationField39 = chronology36.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField39, and durationField31", !(durationField31.compareTo(durationField39) == 0) || (Math.signum(durationField31.compareTo(durationField31)) == Math.signum(durationField39.compareTo(durationField31))));
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 771);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 0, chronology3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        boolean boolean8 = localDate4.isEqual((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate4.toDateTimeAtStartOfDay(dateTimeZone9);
        int int11 = localDate4.getWeekyear();
        org.joda.time.Chronology chronology12 = localDate4.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.days();
        org.joda.time.DateTime dateTime14 = dateTime1.toDateTime(chronology12);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.minus(readableDuration15);
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay(0L);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalTime localTime20 = localTime18.minus(readablePeriod19);
        org.joda.time.LocalTime.Property property21 = localTime20.minuteOfHour();
        org.joda.time.LocalTime localTime23 = property21.addCopy(315507540000L);
        org.joda.time.LocalTime localTime24 = property21.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime25 = property21.getLocalTime();
        java.util.Locale locale30 = new java.util.Locale("dayOfYear", "TW", "");
        java.lang.String str31 = locale30.getLanguage();
        org.joda.time.LocalTime localTime32 = property21.setCopy("50", locale30);
        java.util.Calendar calendar33 = dateTime16.toCalendar(locale30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime16", (dateTime1.compareTo(dateTime16) == 0) == dateTime1.equals(dateTime16));
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = null;
        java.lang.String str3 = mutableDateTime1.toString(dateTimeFormatter2);
        long long4 = mutableDateTime1.getMillis();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.getMutableDateTime();
        org.joda.time.Chronology chronology9 = null;
        mutableDateTime8.setChronology(chronology9);
        mutableDateTime8.addDays(0);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime8.add(readablePeriod13);
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime8);
        mutableDateTime8.setYear((int) (short) 10);
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        org.joda.time.Chronology chronology20 = localTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(chronology20);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime8.toMutableDateTime(chronology20);
        org.joda.time.ReadableDuration readableDuration23 = null;
        mutableDateTime8.add(readableDuration23, 38071);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and mutableDateTime22", (mutableDateTime8.compareTo(mutableDateTime22) == 0) == mutableDateTime8.equals(mutableDateTime22));
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.plusYears(29);
        org.joda.time.LocalDate localDate4 = localDate2.plusWeeks(3);
        org.joda.time.LocalDate localDate6 = localDate4.minusWeeks(759);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.dayOfYear();
        boolean boolean17 = mutableDateTime15.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime15.setZone(dateTimeZone19);
        long long22 = dateTimeZone19.nextTransition((long) '4');
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((int) (byte) -1, 2, 5, 4, (int) (short) 0, 0, 100, dateTimeZone19);
        java.lang.String str25 = dateTimeZone19.getNameKey((long) (byte) 100);
        long long28 = dateTimeZone19.adjustOffset(25260020L, true);
        long long31 = dateTimeZone19.adjustOffset(0L, true);
        long long34 = dateTimeZone19.adjustOffset(3940L, true);
        java.lang.String str35 = dateTimeZone19.toString();
        org.joda.time.DateTime dateTime36 = localDate6.toDateTimeAtCurrentTime(dateTimeZone19);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) (short) 0, chronology38);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) (short) 0, chronology41);
        boolean boolean43 = localDate39.isEqual((org.joda.time.ReadablePartial) localDate42);
        int int44 = localDate42.getDayOfWeek();
        int int45 = localDate42.getMonthOfYear();
        int int46 = localDate42.getEra();
        org.joda.time.Chronology chronology48 = null;
        java.util.Locale locale49 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket(0L, chronology48, locale49, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Chronology chronology55 = null;
        java.util.Locale locale56 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket(0L, chronology55, locale56, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale61 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket58.saveField(dateTimeFieldType59, "1970-01-01T00:00:00.000Z", locale61);
        dateTimeParserBucket51.saveField(dateTimeFieldType52, "1970-01-01T00:00:00.000Z", locale61);
        java.lang.Integer int64 = dateTimeParserBucket51.getPivotYear();
        java.util.Locale locale65 = dateTimeParserBucket51.getLocale();
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property68 = mutableDateTime67.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = property68.getFieldType();
        org.joda.time.Chronology chronology72 = null;
        java.util.Locale locale73 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket75 = new org.joda.time.format.DateTimeParserBucket(0L, chronology72, locale73, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Chronology chronology79 = null;
        java.util.Locale locale80 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket82 = new org.joda.time.format.DateTimeParserBucket(0L, chronology79, locale80, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType83 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale85 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket82.saveField(dateTimeFieldType83, "1970-01-01T00:00:00.000Z", locale85);
        dateTimeParserBucket75.saveField(dateTimeFieldType76, "1970-01-01T00:00:00.000Z", locale85);
        dateTimeParserBucket51.saveField(dateTimeFieldType69, "", locale85);
        int int89 = localDate42.indexOf(dateTimeFieldType69);
        org.joda.time.DurationFieldType durationFieldType90 = dateTimeFieldType69.getDurationType();
        org.joda.time.DateTime dateTime92 = dateTime36.withFieldAdded(durationFieldType90, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and mutableDateTime67", (mutableDateTime15.compareTo(mutableDateTime67) == 0) == mutableDateTime15.equals(mutableDateTime67));
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        int int3 = localDate2.getYearOfCentury();
        int int4 = localDate2.getCenturyOfEra();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) (short) 0, chronology9);
        boolean boolean11 = localDate7.isEqual((org.joda.time.ReadablePartial) localDate10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate7.toDateTimeAtStartOfDay(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.minusSeconds((int) (byte) 100);
        org.joda.time.DateTime dateTime16 = dateTime13.toDateTimeISO();
        org.joda.time.DateTime.Property property17 = dateTime13.weekyear();
        org.joda.time.DateTime dateTime18 = dateTime13.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime20 = dateTime18.minusWeeks((int) (short) 100);
        org.joda.time.DateTime dateTime22 = dateTime18.withWeekOfWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime24 = dateTime22.minusYears(52);
        int int25 = dateTime22.getCenturyOfEra();
        org.joda.time.DateTime.Property property26 = dateTime22.yearOfCentury();
        org.joda.time.Interval interval27 = property26.toInterval();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.dayOfYear();
        boolean boolean31 = mutableDateTime29.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime29.setZone(dateTimeZone33);
        long long36 = dateTimeZone33.nextTransition((long) '4');
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(dateTimeZone33);
        int int38 = property26.compareTo((org.joda.time.ReadableInstant) mutableDateTime37);
        java.lang.Object obj39 = mutableDateTime37.clone();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours(32);
        mutableDateTime37.setZone(dateTimeZone41);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone41);
        org.joda.time.DateTime dateTime44 = localDate2.toDateTimeAtStartOfDay(dateTimeZone41);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) (short) 0, chronology46);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((long) (short) 0, chronology49);
        boolean boolean51 = localDate47.isEqual((org.joda.time.ReadablePartial) localDate50);
        int int52 = localDate50.getDayOfWeek();
        org.joda.time.LocalDate.Property property53 = localDate50.weekOfWeekyear();
        org.joda.time.LocalDate localDate54 = property53.roundFloorCopy();
        int int55 = localDate54.size();
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.LocalDate localDate57 = localDate54.minus(readablePeriod56);
        org.joda.time.DateTime dateTime58 = localDate54.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate60 = localDate54.minusYears(1);
        int int61 = localDate54.getCenturyOfEra();
        org.joda.time.DateMidnight dateMidnight62 = localDate54.toDateMidnight();
        org.joda.time.LocalDate.Property property63 = localDate54.weekOfWeekyear();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.LocalDate localDate66 = new org.joda.time.LocalDate((long) (short) 0, chronology65);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate((long) (short) 0, chronology68);
        boolean boolean70 = localDate66.isEqual((org.joda.time.ReadablePartial) localDate69);
        int int71 = localDate69.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean73 = localDate69.isSupported(dateTimeFieldType72);
        org.joda.time.LocalDate.Property property74 = localDate54.property(dateTimeFieldType72);
        org.joda.time.MutableDateTime mutableDateTime77 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.DateTimeZone dateTimeZone78 = mutableDateTime77.getZone();
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime((long) (short) 1, dateTimeZone78);
        org.joda.time.DateTime dateTime80 = localDate54.toDateTimeAtStartOfDay(dateTimeZone78);
        org.joda.time.DateTime dateTime81 = dateTime44.withZoneRetainFields(dateTimeZone78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime29 and mutableDateTime77", (mutableDateTime29.compareTo(mutableDateTime77) == 0) == mutableDateTime29.equals(mutableDateTime77));
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 0, chronology4);
        boolean boolean6 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withChronology(chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.withChronology(chronology15);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property19.getFieldType();
        org.joda.time.DateTime.Property property21 = dateTime16.property(dateTimeFieldType20);
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) (short) 0, chronology24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) (short) 0, chronology27);
        boolean boolean29 = localDate25.isEqual((org.joda.time.ReadablePartial) localDate28);
        int int30 = localDate28.getDayOfWeek();
        org.joda.time.LocalDate.Property property31 = localDate28.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval34 = localDate28.toInterval(dateTimeZone33);
        int[] intArray36 = new int[] { 'a' };
        int int37 = dateTimeField22.getMaximumValue((org.joda.time.ReadablePartial) localDate28, intArray36);
        org.joda.time.Interval interval38 = localDate28.toInterval();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = localDate28.getFieldType(2);
        org.joda.time.LocalDate.Property property41 = localDate28.weekyear();
        org.joda.time.LocalDate localDate42 = property41.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate44 = property41.addToCopy(6813);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) (short) 0, chronology46);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((long) (short) 0, chronology49);
        boolean boolean51 = localDate47.isEqual((org.joda.time.ReadablePartial) localDate50);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = localDate47.toDateTimeAtStartOfDay(dateTimeZone52);
        org.joda.time.DateTime dateTime55 = dateTime53.minusSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.DateTime dateTime57 = dateTime53.plus(readableDuration56);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTime dateTime59 = dateTime57.withChronology(chronology58);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateTime dateTime62 = dateTime59.withField(dateTimeFieldType60, (int) 'u');
        org.joda.time.DateTime dateTime65 = dateTime62.withDurationAdded((long) 238, 35);
        org.joda.time.DateTime dateTime67 = dateTime62.plusYears(25);
        org.joda.time.format.DateTimePrinter dateTimePrinter68 = null;
        org.joda.time.format.DateTimeParser dateTimeParser69 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter70 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter68, dateTimeParser69);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = dateTimeFormatter70.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter72 = dateTimeFormatter71.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter74 = dateTimeFormatter72.withDefaultYear((int) (byte) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter76 = dateTimeFormatter72.withPivotYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter77 = dateTimeFormatter76.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter78 = dateTimeFormatter77.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(238, (int) (byte) 10);
        long long84 = dateTimeZone81.adjustOffset((long) 97, true);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter85 = dateTimeFormatter77.withZone(dateTimeZone81);
        org.joda.time.DateTime dateTime86 = dateTime67.toDateTime(dateTimeZone81);
        org.joda.time.DateTime dateTime87 = localDate44.toDateTimeAtMidnight(dateTimeZone81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime67 and dateTime86", (dateTime67.compareTo(dateTime86) == 0) == dateTime67.equals(dateTime86));
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(0, (int) (short) 10, (int) (short) 1);
        org.joda.time.LocalTime.Property property4 = localTime3.millisOfSecond();
        org.joda.time.LocalTime localTime5 = property4.roundHalfFloorCopy();
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.clockhourOfHalfday();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(0L, chronology15, locale16, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale21 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket18.saveField(dateTimeFieldType19, "1970-01-01T00:00:00.000Z", locale21);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology12, locale21);
        java.lang.String str24 = chronology12.toString();
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(chronology12);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        long long29 = chronology12.add(readablePeriod26, 345600050L, (int) (short) 0);
        mutableDateTime8.setChronology(chronology12);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime8.monthOfYear();
        java.lang.String str32 = mutableDateTime8.toString();
        org.joda.time.Chronology chronology34 = null;
        java.util.Locale locale35 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket(0L, chronology34, locale35, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Chronology chronology41 = null;
        java.util.Locale locale42 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket(0L, chronology41, locale42, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale47 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket44.saveField(dateTimeFieldType45, "1970-01-01T00:00:00.000Z", locale47);
        dateTimeParserBucket37.saveField(dateTimeFieldType38, "1970-01-01T00:00:00.000Z", locale47);
        java.lang.Integer int50 = dateTimeParserBucket37.getPivotYear();
        java.util.Locale locale51 = dateTimeParserBucket37.getLocale();
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime53.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property54.getFieldType();
        org.joda.time.Chronology chronology58 = null;
        java.util.Locale locale59 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket61 = new org.joda.time.format.DateTimeParserBucket(0L, chronology58, locale59, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Chronology chronology65 = null;
        java.util.Locale locale66 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket68 = new org.joda.time.format.DateTimeParserBucket(0L, chronology65, locale66, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale71 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket68.saveField(dateTimeFieldType69, "1970-01-01T00:00:00.000Z", locale71);
        dateTimeParserBucket61.saveField(dateTimeFieldType62, "1970-01-01T00:00:00.000Z", locale71);
        dateTimeParserBucket37.saveField(dateTimeFieldType55, "", locale71);
        org.joda.time.DurationFieldType durationFieldType75 = dateTimeFieldType55.getDurationType();
        org.joda.time.MutableDateTime.Property property76 = mutableDateTime8.property(dateTimeFieldType55);
        boolean boolean77 = localTime5.isSupported(dateTimeFieldType55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and mutableDateTime53", (mutableDateTime8.compareTo(mutableDateTime53) == 0) == mutableDateTime8.equals(mutableDateTime53));
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        mutableDateTime1.setTime((long) (short) 10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = mutableDateTime1.toDateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusWeeks(771);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withMillisOfDay(100);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.plus(readableDuration22);
        org.joda.time.DateTime dateTime24 = localDateTime19.toDateTime();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime19.withYearOfEra((int) (short) 1);
        org.joda.time.Chronology chronology27 = localDateTime26.getChronology();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minus(readableDuration28);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.minuteOfHour();
        long long34 = dateTimeField31.addWrapField((long) 10, 70);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = dateTimeField31.getType();
        org.joda.time.DateTime.Property property36 = dateTime16.property(dateTimeFieldType35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime14", (mutableDateTime1.compareTo(dateTime14) == 0) == mutableDateTime1.equals(dateTime14));
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.clockhourOfHalfday();
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale6 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology5, locale6, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale11 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket8.saveField(dateTimeFieldType9, "1970-01-01T00:00:00.000Z", locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology2, locale11);
        java.lang.String str14 = chronology2.toString();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(chronology2);
        org.joda.time.DateTimeField dateTimeField16 = chronology2.weekyear();
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(chronology2);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.ReadableDuration readableDuration21 = null;
        mutableDateTime19.add(readableDuration21, 3);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime19.getZone();
        int int26 = dateTimeZone24.getOffset((long) (byte) 1);
        org.joda.time.Chronology chronology27 = chronology2.withZone(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(chronology27);
        org.joda.time.DurationField durationField29 = chronology27.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and mutableDateTime28", (mutableDateTime15.compareTo(mutableDateTime28) == 0) == mutableDateTime15.equals(mutableDateTime28));
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime3.toDateTime(dateTimeZone6);
        org.joda.time.Chronology chronology9 = localDateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(1538045366402039L, chronology9);
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(chronology9);
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(chronology9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime16", (dateTime8.compareTo(dateTime16) == 0) == dateTime8.equals(dateTime16));
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(381044902L);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.year();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.dayOfYear();
        boolean boolean6 = mutableDateTime4.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        mutableDateTime4.setZoneRetainFields(dateTimeZone7);
        mutableDateTime4.setTime(0, (int) (byte) 0, (int) (short) 1, (int) (short) 1);
        org.joda.time.DateTime dateTime14 = mutableDateTime4.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.getMutableDateTime();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (short) 0, chronology20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (short) 0, chronology23);
        boolean boolean25 = localDate21.isEqual((org.joda.time.ReadablePartial) localDate24);
        int int26 = localDate24.getDayOfWeek();
        org.joda.time.LocalDate.Property property27 = localDate24.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval30 = localDate24.toInterval(dateTimeZone29);
        long long32 = dateTimeZone29.convertUTCToLocal((long) 0);
        mutableDateTime18.setZone(dateTimeZone29);
        mutableDateTime4.setZone(dateTimeZone29);
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone29);
        mutableDateTime1.setZoneRetainFields(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime1.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime37.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and dateTime14", (mutableDateTime4.compareTo(dateTime14) == 0) == mutableDateTime4.equals(dateTime14));
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(381044902L);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.year();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.dayOfYear();
        boolean boolean6 = mutableDateTime4.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        mutableDateTime4.setZoneRetainFields(dateTimeZone7);
        mutableDateTime4.setTime(0, (int) (byte) 0, (int) (short) 1, (int) (short) 1);
        org.joda.time.DateTime dateTime14 = mutableDateTime4.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.getMutableDateTime();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (short) 0, chronology20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (short) 0, chronology23);
        boolean boolean25 = localDate21.isEqual((org.joda.time.ReadablePartial) localDate24);
        int int26 = localDate24.getDayOfWeek();
        org.joda.time.LocalDate.Property property27 = localDate24.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.Interval interval30 = localDate24.toInterval(dateTimeZone29);
        long long32 = dateTimeZone29.convertUTCToLocal((long) 0);
        mutableDateTime18.setZone(dateTimeZone29);
        mutableDateTime4.setZone(dateTimeZone29);
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone29);
        mutableDateTime1.setZoneRetainFields(dateTimeZone29);
        long long39 = dateTimeZone29.adjustOffset((long) 454, false);
        java.lang.String str41 = dateTimeZone29.getNameKey((long) 606);
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and dateTime14", (mutableDateTime4.compareTo(dateTime14) == 0) == mutableDateTime4.equals(dateTime14));
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.clockhourOfHalfday();
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(0L, chronology6, locale7, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket9.saveField(dateTimeFieldType10, "1970-01-01T00:00:00.000Z", locale12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology3, locale12);
        java.lang.String str15 = chronology3.toString();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(chronology3);
        org.joda.time.DateTimeField dateTimeField17 = chronology3.weekyear();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.ReadableDuration readableDuration22 = null;
        mutableDateTime20.add(readableDuration22, 3);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime20.getZone();
        int int27 = dateTimeZone25.getOffset((long) (byte) 1);
        org.joda.time.Chronology chronology28 = chronology3.withZone(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField29 = chronology3.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField30 = chronology3.secondOfDay();
        org.joda.time.DurationField durationField31 = chronology3.halfdays();
        org.joda.time.DateTimeZone dateTimeZone32 = chronology3.getZone();
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((java.lang.Object) 1644573063088L, chronology3);
        org.joda.time.DateTimeField dateTimeField34 = chronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField35 = chronology3.centuryOfEra();
        org.joda.time.DurationField durationField36 = chronology3.eras();
        org.joda.time.DateTimeField dateTimeField37 = chronology3.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField31 and durationField36", Math.signum(durationField31.compareTo(durationField36)) == -Math.signum(durationField36.compareTo(durationField31)));
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        boolean boolean3 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7, 4);
        mutableDateTime1.setMillisOfSecond(0);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.getMutableDateTime();
        int int16 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime15);
        java.lang.Object obj17 = mutableDateTime15.clone();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj17);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now(dateTimeZone21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = localDateTime22.toDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 365, dateTimeZone25);
        int int29 = localDateTime28.getCenturyOfEra();
        org.joda.time.Chronology chronology30 = localDateTime28.getChronology();
        mutableDateTime18.setChronology(chronology30);
        org.joda.time.DurationField durationField32 = chronology30.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and mutableDateTime18", (mutableDateTime13.compareTo(mutableDateTime18) == 0) == mutableDateTime13.equals(mutableDateTime18));
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withDefaultYear(2022);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = localDateTime9.toDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 365, dateTimeZone12);
        int int16 = localDateTime15.getCenturyOfEra();
        org.joda.time.Chronology chronology17 = localDateTime15.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.months();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter5.withChronology(chronology17);
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = null;
        org.joda.time.format.DateTimeParser dateTimeParser21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter22.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter23.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter23.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now(dateTimeZone27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = localDateTime28.toDateTime(dateTimeZone31);
        org.joda.time.Chronology chronology34 = localDateTime28.getChronology();
        org.joda.time.DurationField durationField35 = chronology34.months();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter25.withChronology(chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter25.withPivotYear((java.lang.Integer) 12);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeFormatter38.getZone();
        org.joda.time.Chronology chronology40 = chronology17.withZone(dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now(dateTimeZone39);
        org.joda.time.LocalDate localDate42 = org.joda.time.LocalDate.now(dateTimeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and mutableDateTime41", (dateTime14.compareTo(mutableDateTime41) == 0) == dateTime14.equals(mutableDateTime41));
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.getMutableDateTime();
        org.joda.time.Chronology chronology4 = null;
        mutableDateTime3.setChronology(chronology4);
        mutableDateTime3.addDays(0);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableDateTime3.add(readablePeriod8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime3.yearOfEra();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime3.secondOfDay();
        org.joda.time.DateTime dateTime12 = mutableDateTime3.toDateTime();
        java.util.Locale locale15 = new java.util.Locale("+00:00:00.035", "1970-01-01T00:00:00.000Z");
        java.lang.String str16 = locale15.getDisplayName();
        java.util.Calendar calendar17 = dateTime12.toCalendar(locale15);
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.clockhourOfHalfday();
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket(0L, chronology24, locale25, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        dateTimeParserBucket27.saveField(dateTimeFieldType28, "1970-01-01T00:00:00.000Z", locale30);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology21, locale30);
        java.lang.String str33 = chronology21.toString();
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now(chronology21);
        org.joda.time.DateTimeField dateTimeField35 = chronology21.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        org.joda.time.Chronology chronology39 = chronology21.withZone(dateTimeZone38);
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(31L, dateTimeZone38);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(dateTimeZone38);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((java.lang.Object) calendar17, dateTimeZone38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime34 and dateTime41", (mutableDateTime34.compareTo(dateTime41) == 0) == mutableDateTime34.equals(dateTime41));
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((-441853200035L), dateTimeZone2);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.dayOfYear();
        boolean boolean8 = mutableDateTime6.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        mutableDateTime6.setZone(dateTimeZone10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime6.add(readablePeriod12, 4);
        mutableDateTime6.setTime((long) (short) 10);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime6.secondOfMinute();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime6.year();
        int int19 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone2);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) 0);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.dayOfYear();
        int int24 = property23.getMinimumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime25 = property23.roundHalfCeiling();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.weekyear();
        org.joda.time.Chronology chronology27 = mutableDateTime25.getChronology();
        mutableDateTime20.setMillis((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime25.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime20 and mutableDateTime25", (mutableDateTime20.compareTo(mutableDateTime25) == 0) == mutableDateTime20.equals(mutableDateTime25));
    }
}

