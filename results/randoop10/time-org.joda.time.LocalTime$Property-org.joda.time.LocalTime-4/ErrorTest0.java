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
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay.Property property1 = timeOfDay0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone3);
        org.joda.time.LocalTime localTime6 = localTime4.withMillisOfDay(15);
        org.joda.time.LocalTime localTime8 = localTime6.withHourOfDay(0);
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfDay();
        org.joda.time.LocalTime localTime10 = property9.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.year();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay0.withChronologyRetainFields(chronology11);
        org.joda.time.DurationField durationField15 = chronology11.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField15, and durationField12", !(durationField12.compareTo(durationField15) == 0) || (Math.signum(durationField12.compareTo(durationField12)) == Math.signum(durationField15.compareTo(durationField12))));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.millisOfSecond();
        org.joda.time.DurationField durationField7 = chronology5.weekyears();
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(10L, chronology5);
        org.joda.time.TimeOfDay.Property property9 = timeOfDay8.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay10 = property9.withMaximumValue();
        org.joda.time.DateTimeField dateTimeField11 = property9.getField();
        int int14 = dateTimeField11.getDifference((long) 521, 70919999992L);
        java.util.Locale locale16 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str17 = dateTimeField11.getAsShortText(2, locale16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = dateTimeField11.getType();
        org.joda.time.TimeOfDay timeOfDay19 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay.Property property20 = timeOfDay19.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone22);
        org.joda.time.LocalTime localTime25 = localTime23.withMillisOfDay(15);
        org.joda.time.LocalTime localTime27 = localTime25.withHourOfDay(0);
        org.joda.time.LocalTime.Property property28 = localTime27.millisOfDay();
        org.joda.time.LocalTime localTime29 = property28.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology30 = localTime29.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.eras();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.year();
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay19.withChronologyRetainFields(chronology30);
        boolean boolean34 = dateTimeFieldType18.isSupported(chronology30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField31", Math.signum(durationField7.compareTo(durationField31)) == -Math.signum(durationField31.compareTo(durationField7)));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Interval interval6 = new org.joda.time.Interval(obj4, chronology5);
        org.joda.time.MutableInterval mutableInterval7 = interval6.toMutableInterval();
        org.joda.time.Chronology chronology8 = mutableInterval7.getChronology();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 0, chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.halfdayOfDay();
        org.joda.time.DurationField durationField11 = chronology8.halfdays();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 13, chronology8);
        mutableDateTime12.setHourOfDay(7);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime12.year();
        mutableDateTime12.setDayOfMonth(4);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        mutableDateTime12.setZone(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 100, dateTimeZone18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(43200000L, dateTimeZone18);
        org.joda.time.DateMidnight.Property property22 = dateMidnight21.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight21.minusMonths(31);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight21.plusDays(6);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.lang.String str29 = dateTimeZone28.getID();
        org.joda.time.MutableDateTime mutableDateTime30 = dateMidnight21.toMutableDateTime(dateTimeZone28);
        long long34 = dateTimeZone28.convertLocalToUTC((long) 14, false, (long) 'x');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight21 and mutableDateTime30", (dateMidnight21.compareTo(mutableDateTime30) == 0) == dateMidnight21.equals(mutableDateTime30));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        int int9 = dateTime8.getMinuteOfDay();
        int int10 = dateTime8.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime8.getZone();
        org.joda.time.Instant instant12 = dateTime8.toInstant();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Interval interval19 = new org.joda.time.Interval(obj17, chronology18);
        org.joda.time.MutableInterval mutableInterval20 = interval19.toMutableInterval();
        org.joda.time.Chronology chronology21 = mutableInterval20.getChronology();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) (short) 0, chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.halfdayOfDay();
        org.joda.time.DurationField durationField24 = chronology21.halfdays();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 13, chronology21);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) ' ', chronology21);
        org.joda.time.DateTimeField dateTimeField27 = chronology21.yearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 19, chronology21);
        org.joda.time.DateTimeField dateTimeField29 = chronology21.yearOfCentury();
        org.joda.time.DateTime dateTime30 = dateTime8.toDateTime(chronology21);
        org.joda.time.DateTime dateTime32 = dateTime8.withMinuteOfHour(4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime8", (instant12.compareTo(dateTime8) == 0) == instant12.equals(dateTime8));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTimeField dateTimeField7 = chronology5.halfdayOfDay();
        int int9 = dateTimeField7.getMaximumValue((long) 11);
        boolean boolean11 = dateTimeField7.isLeap((-1L));
        int int13 = dateTimeField7.getMaximumValue(0L);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Interval interval17 = new org.joda.time.Interval(obj15, chronology16);
        org.joda.time.MutableInterval mutableInterval18 = interval17.toMutableInterval();
        org.joda.time.Chronology chronology19 = mutableInterval18.getChronology();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 0, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight(dateTimeZone21);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Interval interval26 = new org.joda.time.Interval(obj24, chronology25);
        org.joda.time.MutableInterval mutableInterval27 = interval26.toMutableInterval();
        org.joda.time.Chronology chronology28 = mutableInterval27.getChronology();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) (short) 0, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localDate29.toDateTimeAtMidnight(dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localDate29.toDateTimeAtStartOfDay(dateTimeZone32);
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType35 = periodType34.withSecondsRemoved();
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate20, (org.joda.time.ReadablePartial) localDate29, periodType35);
        org.joda.time.LocalDate.Property property37 = localDate20.era();
        int[] intArray38 = new int[] {};
        int int39 = dateTimeField7.getMinimumValue((org.joda.time.ReadablePartial) localDate20, intArray38);
        org.joda.time.DateTime dateTime40 = localDate20.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime41 = localDate20.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime43 = dateTime41.plusMinutes(50400000);
        org.joda.time.DateTime dateTime44 = dateTime43.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.DateTime dateTime47 = dateTime44.withZone(dateTimeZone46);
        int int48 = dateTime44.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and dateTime47", (dateTime44.compareTo(dateTime47) == 0) == dateTime44.equals(dateTime47));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTime dateTime7 = localDate6.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate9 = localDate6.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(obj10, chronology11);
        org.joda.time.MutableInterval mutableInterval13 = interval12.toMutableInterval();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Interval interval17 = new org.joda.time.Interval(obj15, chronology16);
        org.joda.time.MutableInterval mutableInterval18 = interval17.toMutableInterval();
        org.joda.time.Chronology chronology19 = mutableInterval18.getChronology();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 0, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.Interval interval23 = interval12.withStart((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime24 = localDate6.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Interval interval28 = new org.joda.time.Interval(obj26, chronology27);
        org.joda.time.MutableInterval mutableInterval29 = interval28.toMutableInterval();
        org.joda.time.Chronology chronology30 = mutableInterval29.getChronology();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 0, chronology30);
        org.joda.time.DateTime dateTime32 = localDate31.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate34 = localDate31.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Interval interval37 = new org.joda.time.Interval(obj35, chronology36);
        org.joda.time.MutableInterval mutableInterval38 = interval37.toMutableInterval();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Interval interval42 = new org.joda.time.Interval(obj40, chronology41);
        org.joda.time.MutableInterval mutableInterval43 = interval42.toMutableInterval();
        org.joda.time.Chronology chronology44 = mutableInterval43.getChronology();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) (short) 0, chronology44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = localDate45.toDateTimeAtMidnight(dateTimeZone46);
        org.joda.time.Interval interval48 = interval37.withStart((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime49 = localDate31.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        boolean boolean50 = localDate6.isEqual((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.LocalDate.Property property51 = localDate31.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(7);
        org.joda.time.DateMidnight dateMidnight54 = localDate31.toDateMidnight(dateTimeZone53);
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight54.plus(readableDuration55);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight54.minusWeeks(13);
        org.joda.time.Interval interval59 = dateMidnight54.toInterval();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateMidnight dateMidnight63 = new org.joda.time.DateMidnight((long) 10, dateTimeZone62);
        java.lang.String str64 = dateTimeZone62.toString();
        int int66 = dateTimeZone62.getStandardOffset((long) 10);
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime(dateTimeZone62);
        org.joda.time.Chronology chronology68 = dateTime67.getChronology();
        org.joda.time.MutableDateTime mutableDateTime69 = dateMidnight54.toMutableDateTime(chronology68);
        org.joda.time.LocalTime localTime70 = new org.joda.time.LocalTime(chronology68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and mutableDateTime69", (dateTime7.compareTo(mutableDateTime69) == 0) == dateTime7.equals(mutableDateTime69));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate6.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDate.Property property12 = localDate6.property(dateTimeFieldType11);
        org.joda.time.LocalDate localDate14 = localDate6.withYear(6);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.lang.String str16 = dateTimeFieldType15.toString();
        boolean boolean17 = localDate6.isSupported(dateTimeFieldType15);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Interval interval21 = new org.joda.time.Interval(obj19, chronology20);
        org.joda.time.MutableInterval mutableInterval22 = interval21.toMutableInterval();
        org.joda.time.Chronology chronology23 = mutableInterval22.getChronology();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (short) 0, chronology23);
        org.joda.time.DurationField durationField25 = chronology23.eras();
        boolean boolean26 = dateTimeFieldType15.isSupported(chronology23);
        org.joda.time.DateTimeField dateTimeField27 = chronology23.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(chronology23);
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(chronology23);
        org.joda.time.DateTimeField dateTimeField30 = chronology23.minuteOfHour();
        org.joda.time.DurationField durationField31 = chronology23.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField31, and durationField25", !(durationField25.compareTo(durationField31) == 0) || (Math.signum(durationField25.compareTo(durationField25)) == Math.signum(durationField31.compareTo(durationField25))));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.millisOfSecond();
        org.joda.time.DurationField durationField7 = chronology5.weekyears();
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(10L, chronology5);
        org.joda.time.TimeOfDay.Property property9 = timeOfDay8.secondOfMinute();
        java.lang.String str10 = property9.getAsString();
        org.joda.time.DateTimeField dateTimeField11 = property9.getField();
        int int12 = property9.get();
        org.joda.time.TimeOfDay timeOfDay13 = property9.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay14 = property9.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(readableInstant15, readableInstant16, periodType17);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.years();
        mutablePeriod18.set(durationFieldType19, 2);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Interval interval25 = new org.joda.time.Interval(obj23, chronology24);
        org.joda.time.MutableInterval mutableInterval26 = interval25.toMutableInterval();
        org.joda.time.Chronology chronology27 = mutableInterval26.getChronology();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) (short) 0, chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localDate28.toDateTimeAtMidnight(dateTimeZone29);
        int int31 = dateTime30.getMinuteOfDay();
        org.joda.time.Interval interval32 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod18, (org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.PeriodType periodType35 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(readableInstant33, readableInstant34, periodType35);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.years();
        mutablePeriod36.set(durationFieldType37, 2);
        int int40 = mutablePeriod18.indexOf(durationFieldType37);
        int int41 = mutablePeriod18.getWeeks();
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Interval interval46 = new org.joda.time.Interval(obj44, chronology45);
        org.joda.time.MutableInterval mutableInterval47 = interval46.toMutableInterval();
        org.joda.time.Chronology chronology48 = mutableInterval47.getChronology();
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((long) (short) 0, chronology48);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = localDate49.toDateTimeAtMidnight(dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = localDate49.toDateTimeAtStartOfDay(dateTimeZone52);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDate.Property property55 = localDate49.property(dateTimeFieldType54);
        org.joda.time.LocalDate localDate57 = localDate49.withYear(6);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.lang.String str59 = dateTimeFieldType58.toString();
        boolean boolean60 = localDate49.isSupported(dateTimeFieldType58);
        java.lang.Object obj62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.Interval interval64 = new org.joda.time.Interval(obj62, chronology63);
        org.joda.time.MutableInterval mutableInterval65 = interval64.toMutableInterval();
        org.joda.time.Chronology chronology66 = mutableInterval65.getChronology();
        org.joda.time.LocalDate localDate67 = new org.joda.time.LocalDate((long) (short) 0, chronology66);
        org.joda.time.DurationField durationField68 = chronology66.eras();
        boolean boolean69 = dateTimeFieldType58.isSupported(chronology66);
        mutablePeriod18.setPeriod((long) 2, chronology66);
        mutablePeriod18.setPeriod(260236800000L);
        org.joda.time.TimeOfDay timeOfDay73 = timeOfDay14.plus((org.joda.time.ReadablePeriod) mutablePeriod18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField68", Math.signum(durationField7.compareTo(durationField68)) == -Math.signum(durationField68.compareTo(durationField7)));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTime dateTime7 = localDate6.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate9 = localDate6.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(obj10, chronology11);
        org.joda.time.MutableInterval mutableInterval13 = interval12.toMutableInterval();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Interval interval17 = new org.joda.time.Interval(obj15, chronology16);
        org.joda.time.MutableInterval mutableInterval18 = interval17.toMutableInterval();
        org.joda.time.Chronology chronology19 = mutableInterval18.getChronology();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 0, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.Interval interval23 = interval12.withStart((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime24 = localDate6.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Interval interval28 = new org.joda.time.Interval(obj26, chronology27);
        org.joda.time.MutableInterval mutableInterval29 = interval28.toMutableInterval();
        org.joda.time.Chronology chronology30 = mutableInterval29.getChronology();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 0, chronology30);
        org.joda.time.DateTime dateTime32 = localDate31.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate34 = localDate31.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Interval interval37 = new org.joda.time.Interval(obj35, chronology36);
        org.joda.time.MutableInterval mutableInterval38 = interval37.toMutableInterval();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Interval interval42 = new org.joda.time.Interval(obj40, chronology41);
        org.joda.time.MutableInterval mutableInterval43 = interval42.toMutableInterval();
        org.joda.time.Chronology chronology44 = mutableInterval43.getChronology();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) (short) 0, chronology44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = localDate45.toDateTimeAtMidnight(dateTimeZone46);
        org.joda.time.Interval interval48 = interval37.withStart((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime49 = localDate31.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        boolean boolean50 = localDate6.isEqual((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.LocalDate.Property property51 = localDate31.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(7);
        org.joda.time.DateMidnight dateMidnight54 = localDate31.toDateMidnight(dateTimeZone53);
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight54.plus(readableDuration55);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight54.minusWeeks(13);
        org.joda.time.DateMidnight dateMidnight60 = dateMidnight58.minus((long) 11);
        org.joda.time.DateMidnight dateMidnight62 = dateMidnight58.withYearOfEra(22);
        java.lang.Object obj66 = null;
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.Interval interval68 = new org.joda.time.Interval(obj66, chronology67);
        org.joda.time.MutableInterval mutableInterval69 = interval68.toMutableInterval();
        org.joda.time.Chronology chronology70 = mutableInterval69.getChronology();
        org.joda.time.LocalDate localDate71 = new org.joda.time.LocalDate((long) (short) 0, chronology70);
        org.joda.time.DateTimeField dateTimeField72 = chronology70.halfdayOfDay();
        org.joda.time.DurationField durationField73 = chronology70.halfdays();
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime((long) 13, chronology70);
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime((long) ' ', chronology70);
        org.joda.time.DateTimeField dateTimeField76 = chronology70.yearOfCentury();
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime(chronology70);
        org.joda.time.DateMidnight dateMidnight78 = org.joda.time.DateMidnight.now(chronology70);
        org.joda.time.MutableDateTime mutableDateTime79 = dateMidnight62.toMutableDateTime(chronology70);
        org.joda.time.DateTimeField dateTimeField80 = chronology70.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight62 and mutableDateTime79", (dateMidnight62.compareTo(mutableDateTime79) == 0) == dateMidnight62.equals(mutableDateTime79));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTime dateTime7 = localDate6.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate9 = localDate6.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(obj10, chronology11);
        org.joda.time.MutableInterval mutableInterval13 = interval12.toMutableInterval();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Interval interval17 = new org.joda.time.Interval(obj15, chronology16);
        org.joda.time.MutableInterval mutableInterval18 = interval17.toMutableInterval();
        org.joda.time.Chronology chronology19 = mutableInterval18.getChronology();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 0, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.Interval interval23 = interval12.withStart((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime24 = localDate6.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Interval interval28 = new org.joda.time.Interval(obj26, chronology27);
        org.joda.time.MutableInterval mutableInterval29 = interval28.toMutableInterval();
        org.joda.time.Chronology chronology30 = mutableInterval29.getChronology();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 0, chronology30);
        org.joda.time.DateTime dateTime32 = localDate31.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate34 = localDate31.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Interval interval37 = new org.joda.time.Interval(obj35, chronology36);
        org.joda.time.MutableInterval mutableInterval38 = interval37.toMutableInterval();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Interval interval42 = new org.joda.time.Interval(obj40, chronology41);
        org.joda.time.MutableInterval mutableInterval43 = interval42.toMutableInterval();
        org.joda.time.Chronology chronology44 = mutableInterval43.getChronology();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) (short) 0, chronology44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = localDate45.toDateTimeAtMidnight(dateTimeZone46);
        org.joda.time.Interval interval48 = interval37.withStart((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime49 = localDate31.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        boolean boolean50 = localDate6.isEqual((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.LocalDate.Property property51 = localDate31.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(7);
        org.joda.time.DateMidnight dateMidnight54 = localDate31.toDateMidnight(dateTimeZone53);
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight54.plus(readableDuration55);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight54.minusWeeks(13);
        org.joda.time.DateMidnight dateMidnight60 = dateMidnight58.minus((long) 11);
        org.joda.time.DateMidnight dateMidnight62 = dateMidnight58.withYearOfEra(22);
        java.lang.Object obj66 = null;
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.Interval interval68 = new org.joda.time.Interval(obj66, chronology67);
        org.joda.time.MutableInterval mutableInterval69 = interval68.toMutableInterval();
        org.joda.time.Chronology chronology70 = mutableInterval69.getChronology();
        org.joda.time.LocalDate localDate71 = new org.joda.time.LocalDate((long) (short) 0, chronology70);
        org.joda.time.DateTimeField dateTimeField72 = chronology70.halfdayOfDay();
        org.joda.time.DurationField durationField73 = chronology70.halfdays();
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime((long) 13, chronology70);
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime((long) ' ', chronology70);
        org.joda.time.DateTimeField dateTimeField76 = chronology70.yearOfCentury();
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime(chronology70);
        org.joda.time.DateMidnight dateMidnight78 = org.joda.time.DateMidnight.now(chronology70);
        org.joda.time.MutableDateTime mutableDateTime79 = dateMidnight62.toMutableDateTime(chronology70);
        org.joda.time.DateMidnight dateMidnight81 = dateMidnight62.plusWeeks(97);
        org.joda.time.DateMidnight dateMidnight83 = dateMidnight62.withWeekyear(3600);
        org.joda.time.DateMidnight dateMidnight85 = dateMidnight83.withDayOfYear(250);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight62 and mutableDateTime79", (dateMidnight62.compareTo(mutableDateTime79) == 0) == dateMidnight62.equals(mutableDateTime79));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.years();
        mutablePeriod3.set(durationFieldType4, 2);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Interval interval10 = new org.joda.time.Interval(obj8, chronology9);
        org.joda.time.MutableInterval mutableInterval11 = interval10.toMutableInterval();
        org.joda.time.Chronology chronology12 = mutableInterval11.getChronology();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 0, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtMidnight(dateTimeZone14);
        int int16 = dateTime15.getMinuteOfDay();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod3, (org.joda.time.ReadableInstant) dateTime15);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Interval interval21 = new org.joda.time.Interval(obj19, chronology20);
        org.joda.time.MutableInterval mutableInterval22 = interval21.toMutableInterval();
        org.joda.time.Chronology chronology23 = mutableInterval22.getChronology();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (short) 0, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localDate24.toDateTimeAtMidnight(dateTimeZone25);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Interval interval30 = new org.joda.time.Interval(obj28, chronology29);
        org.joda.time.MutableInterval mutableInterval31 = interval30.toMutableInterval();
        org.joda.time.Chronology chronology32 = mutableInterval31.getChronology();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) (short) 0, chronology32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localDate33.toDateTimeAtMidnight(dateTimeZone34);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Interval interval39 = new org.joda.time.Interval(obj37, chronology38);
        org.joda.time.MutableInterval mutableInterval40 = interval39.toMutableInterval();
        org.joda.time.Chronology chronology41 = mutableInterval40.getChronology();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) (short) 0, chronology41);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = localDate42.toDateTimeAtMidnight(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = localDate42.toDateTimeAtStartOfDay(dateTimeZone45);
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType48 = periodType47.withSecondsRemoved();
        org.joda.time.Period period49 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate33, (org.joda.time.ReadablePartial) localDate42, periodType48);
        org.joda.time.DateTime dateTime50 = dateTime26.minus((org.joda.time.ReadablePeriod) period49);
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Interval interval54 = new org.joda.time.Interval(obj52, chronology53);
        org.joda.time.MutableInterval mutableInterval55 = interval54.toMutableInterval();
        org.joda.time.Chronology chronology56 = mutableInterval55.getChronology();
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate((long) (short) 0, chronology56);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = localDate57.toDateTimeAtMidnight(dateTimeZone58);
        int int60 = dateTime59.getMinuteOfDay();
        int int61 = dateTime59.getYearOfEra();
        mutablePeriod3.setPeriod((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.LocalDate localDate63 = dateTime59.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetMillis(7);
        org.joda.time.DateTime dateTime66 = dateTime59.toDateTime(dateTimeZone65);
        java.util.GregorianCalendar gregorianCalendar67 = dateTime66.toGregorianCalendar();
        gregorianCalendar67.setMinimalDaysInFirstWeek(71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime66", (dateTime15.compareTo(dateTime66) == 0) == dateTime15.equals(dateTime66));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        int int9 = dateTime8.getMinuteOfDay();
        int int10 = dateTime8.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime8.getZone();
        org.joda.time.Instant instant12 = dateTime8.toInstant();
        java.util.Date date13 = instant12.toDate();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.fromDateFields(date13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant12", (dateTime8.compareTo(instant12) == 0) == dateTime8.equals(instant12));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Interval interval6 = new org.joda.time.Interval(obj4, chronology5);
        org.joda.time.MutableInterval mutableInterval7 = interval6.toMutableInterval();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Interval interval11 = new org.joda.time.Interval(obj9, chronology10);
        org.joda.time.MutableInterval mutableInterval12 = interval11.toMutableInterval();
        org.joda.time.Chronology chronology13 = mutableInterval12.getChronology();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (short) 0, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate14.toDateTimeAtMidnight(dateTimeZone15);
        org.joda.time.Interval interval17 = interval6.withStart((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.Interval interval19 = interval17.withEndMillis((long) 17);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Interval interval24 = new org.joda.time.Interval(obj22, chronology23);
        org.joda.time.MutableInterval mutableInterval25 = interval24.toMutableInterval();
        org.joda.time.Chronology chronology26 = mutableInterval25.getChronology();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) (short) 0, chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.halfdayOfDay();
        org.joda.time.DurationField durationField29 = chronology26.halfdays();
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) 13, chronology26);
        org.joda.time.Interval interval31 = interval17.withChronology(chronology26);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 19, chronology26);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) 42, chronology26);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((-44791089328655000L), 2042L, chronology26);
        org.joda.time.DurationField durationField35 = chronology26.eras();
        org.joda.time.DateTimeField dateTimeField36 = chronology26.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField29 and durationField35", Math.signum(durationField29.compareTo(durationField35)) == -Math.signum(durationField35.compareTo(durationField29)));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.years();
        mutablePeriod3.set(durationFieldType4, 2);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Interval interval10 = new org.joda.time.Interval(obj8, chronology9);
        org.joda.time.MutableInterval mutableInterval11 = interval10.toMutableInterval();
        org.joda.time.Chronology chronology12 = mutableInterval11.getChronology();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 0, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtMidnight(dateTimeZone14);
        int int16 = dateTime15.getMinuteOfDay();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod3, (org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime.Property property18 = dateTime15.dayOfWeek();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Interval interval22 = new org.joda.time.Interval(obj20, chronology21);
        org.joda.time.MutableInterval mutableInterval23 = interval22.toMutableInterval();
        org.joda.time.Chronology chronology24 = mutableInterval23.getChronology();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) (short) 0, chronology24);
        org.joda.time.DateTimeField dateTimeField26 = chronology24.halfdayOfDay();
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime15.toMutableDateTime(chronology24);
        org.joda.time.DateTime dateTime29 = dateTime15.plusMinutes((int) (byte) 1);
        org.joda.time.Period period31 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Period period33 = period31.multipliedBy(0);
        org.joda.time.Period period35 = period33.withDays((int) (short) 0);
        org.joda.time.Period period37 = period33.withMillis(17);
        org.joda.time.DateTime dateTime38 = dateTime15.plus((org.joda.time.ReadablePeriod) period37);
        org.joda.time.DateMidnight dateMidnight39 = dateTime15.toDateMidnight();
        org.joda.time.DateTime dateTime40 = dateMidnight39.toDateTimeISO();
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight39.withCenturyOfEra(447);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(dateTimeZone44);
        long long47 = dateTimeZone44.previousTransition((long) (short) -1);
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight(dateTimeZone44);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone44);
        org.joda.time.Instant instant50 = dateTime49.toInstant();
        org.joda.time.Period period52 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType54 = period52.getFieldType((int) (short) 1);
        org.joda.time.Period period56 = period52.minusWeeks((int) (byte) 1);
        org.joda.time.Period period58 = period52.multipliedBy(33);
        org.joda.time.DurationFieldType durationFieldType59 = org.joda.time.DurationFieldType.weeks();
        int int60 = period52.get(durationFieldType59);
        org.joda.time.DateTime dateTime62 = dateTime49.withFieldAdded(durationFieldType59, 24);
        org.joda.time.ReadableDuration readableDuration63 = null;
        java.lang.Object obj65 = null;
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.Interval interval67 = new org.joda.time.Interval(obj65, chronology66);
        org.joda.time.MutableInterval mutableInterval68 = interval67.toMutableInterval();
        org.joda.time.Chronology chronology69 = mutableInterval68.getChronology();
        org.joda.time.LocalDate localDate70 = new org.joda.time.LocalDate((long) (short) 0, chronology69);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateTime dateTime72 = localDate70.toDateTimeAtMidnight(dateTimeZone71);
        int int73 = dateTime72.getMinuteOfDay();
        int int74 = dateTime72.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone75 = dateTime72.getZone();
        org.joda.time.PeriodType periodType76 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType77 = periodType76.withSecondsRemoved();
        java.lang.String str78 = periodType77.getName();
        org.joda.time.PeriodType periodType79 = periodType77.withSecondsRemoved();
        org.joda.time.Period period80 = new org.joda.time.Period(readableDuration63, (org.joda.time.ReadableInstant) dateTime72, periodType79);
        org.joda.time.PeriodType periodType81 = period80.getPeriodType();
        int int82 = period80.getYears();
        org.joda.time.DateTimeZone dateTimeZone84 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime85 = new org.joda.time.MutableDateTime(dateTimeZone84);
        long long87 = dateTimeZone84.previousTransition((long) (short) -1);
        org.joda.time.DateMidnight dateMidnight88 = new org.joda.time.DateMidnight(dateTimeZone84);
        org.joda.time.DateTime dateTime89 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone84);
        org.joda.time.Instant instant90 = dateTime89.toInstant();
        org.joda.time.Duration duration91 = period80.toDurationTo((org.joda.time.ReadableInstant) instant90);
        org.joda.time.DateTime dateTime93 = dateTime49.withDurationAdded((org.joda.time.ReadableDuration) duration91, 5);
        org.joda.time.DateMidnight dateMidnight94 = dateMidnight42.plus((org.joda.time.ReadableDuration) duration91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime49 and instant50", (dateTime49.compareTo(instant50) == 0) == dateTime49.equals(instant50));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Interval interval4 = new org.joda.time.Interval(obj2, chronology3);
        org.joda.time.MutableInterval mutableInterval5 = interval4.toMutableInterval();
        org.joda.time.Chronology chronology6 = mutableInterval5.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtMidnight(dateTimeZone8);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Interval interval13 = new org.joda.time.Interval(obj11, chronology12);
        org.joda.time.MutableInterval mutableInterval14 = interval13.toMutableInterval();
        org.joda.time.Chronology chronology15 = mutableInterval14.getChronology();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 0, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localDate16.toDateTimeAtMidnight(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate16.toDateTimeAtStartOfDay(dateTimeZone19);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType22 = periodType21.withSecondsRemoved();
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate7, (org.joda.time.ReadablePartial) localDate16, periodType22);
        java.util.Locale locale26 = new java.util.Locale("hi!", "");
        boolean boolean27 = localDate7.equals((java.lang.Object) locale26);
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone0, locale26);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Interval interval32 = new org.joda.time.Interval(obj30, chronology31);
        org.joda.time.MutableInterval mutableInterval33 = interval32.toMutableInterval();
        org.joda.time.Chronology chronology34 = mutableInterval33.getChronology();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) (short) 0, chronology34);
        org.joda.time.DateTime dateTime36 = localDate35.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate38 = localDate35.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Interval interval41 = new org.joda.time.Interval(obj39, chronology40);
        org.joda.time.MutableInterval mutableInterval42 = interval41.toMutableInterval();
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Interval interval46 = new org.joda.time.Interval(obj44, chronology45);
        org.joda.time.MutableInterval mutableInterval47 = interval46.toMutableInterval();
        org.joda.time.Chronology chronology48 = mutableInterval47.getChronology();
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((long) (short) 0, chronology48);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = localDate49.toDateTimeAtMidnight(dateTimeZone50);
        org.joda.time.Interval interval52 = interval41.withStart((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTime dateTime53 = localDate35.toDateTime((org.joda.time.ReadableInstant) dateTime51);
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.Interval interval57 = new org.joda.time.Interval(obj55, chronology56);
        org.joda.time.MutableInterval mutableInterval58 = interval57.toMutableInterval();
        org.joda.time.Chronology chronology59 = mutableInterval58.getChronology();
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate((long) (short) 0, chronology59);
        org.joda.time.DateTime dateTime61 = localDate60.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate63 = localDate60.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj64 = null;
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.Interval interval66 = new org.joda.time.Interval(obj64, chronology65);
        org.joda.time.MutableInterval mutableInterval67 = interval66.toMutableInterval();
        java.lang.Object obj69 = null;
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.Interval interval71 = new org.joda.time.Interval(obj69, chronology70);
        org.joda.time.MutableInterval mutableInterval72 = interval71.toMutableInterval();
        org.joda.time.Chronology chronology73 = mutableInterval72.getChronology();
        org.joda.time.LocalDate localDate74 = new org.joda.time.LocalDate((long) (short) 0, chronology73);
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.DateTime dateTime76 = localDate74.toDateTimeAtMidnight(dateTimeZone75);
        org.joda.time.Interval interval77 = interval66.withStart((org.joda.time.ReadableInstant) dateTime76);
        org.joda.time.DateTime dateTime78 = localDate60.toDateTime((org.joda.time.ReadableInstant) dateTime76);
        boolean boolean79 = localDate35.isEqual((org.joda.time.ReadablePartial) localDate60);
        int int80 = localDate60.getDayOfWeek();
        org.joda.time.LocalDate localDate82 = localDate60.plusYears(10);
        org.joda.time.LocalDate.Property property83 = localDate82.era();
        org.joda.time.LocalDate localDate84 = property83.getLocalDate();
        java.util.Locale locale85 = java.util.Locale.ITALY;
        java.lang.String str86 = property83.getAsShortText(locale85);
        java.util.Calendar calendar87 = java.util.Calendar.getInstance(timeZone0, locale85);
        java.util.TimeZone timeZone88 = java.util.TimeZone.getDefault();
        int int90 = timeZone88.getOffset((long) 51);
        java.util.Calendar calendar91 = java.util.Calendar.getInstance(timeZone88);
        java.util.TimeZone timeZone92 = calendar91.getTimeZone();
        calendar87.setTimeZone(timeZone92);
        java.lang.String str94 = timeZone92.getDisplayName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar28 and calendar87", (calendar28.compareTo(calendar87) == 0) == calendar28.equals(calendar87));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(1439, 5, 52, 6, 0, 52, 11, (int) (short) 0);
        org.joda.time.Period period10 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType12 = period10.getFieldType((int) (short) 1);
        org.joda.time.Period period14 = period10.minusWeeks((int) (byte) 1);
        int int15 = period14.getMillis();
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.hours();
        boolean boolean17 = period14.isSupported(durationFieldType16);
        int int18 = mutablePeriod8.indexOf(durationFieldType16);
        org.joda.time.TimeOfDay timeOfDay20 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay.Property property21 = timeOfDay20.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone23);
        org.joda.time.LocalTime localTime26 = localTime24.withMillisOfDay(15);
        org.joda.time.LocalTime localTime28 = localTime26.withHourOfDay(0);
        org.joda.time.LocalTime.Property property29 = localTime28.millisOfDay();
        org.joda.time.LocalTime localTime30 = property29.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology31 = localTime30.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.eras();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.year();
        org.joda.time.TimeOfDay timeOfDay34 = timeOfDay20.withChronologyRetainFields(chronology31);
        mutablePeriod8.setPeriod((long) 10022, chronology31);
        org.joda.time.DateTimeField dateTimeField36 = chronology31.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(chronology31);
        org.joda.time.DurationField durationField38 = chronology31.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField32, durationField38, and durationField32", !(durationField32.compareTo(durationField38) == 0) || (Math.signum(durationField32.compareTo(durationField32)) == Math.signum(durationField38.compareTo(durationField32))));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Interval interval6 = new org.joda.time.Interval(obj4, chronology5);
        org.joda.time.MutableInterval mutableInterval7 = interval6.toMutableInterval();
        org.joda.time.Chronology chronology8 = mutableInterval7.getChronology();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 0, chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.halfdayOfDay();
        org.joda.time.DurationField durationField11 = chronology8.halfdays();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 13, chronology8);
        mutableDateTime12.setHourOfDay(7);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime12.year();
        mutableDateTime12.setDayOfMonth(4);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        mutableDateTime12.setZone(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 100, dateTimeZone18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(43200000L, dateTimeZone18);
        org.joda.time.DateMidnight.Property property22 = dateMidnight21.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight21.minusMonths(31);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight21.plusDays(6);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.lang.String str29 = dateTimeZone28.getID();
        org.joda.time.MutableDateTime mutableDateTime30 = dateMidnight21.toMutableDateTime(dateTimeZone28);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(readableInstant31, readableInstant32, periodType33);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.years();
        mutablePeriod34.set(durationFieldType35, 2);
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Interval interval41 = new org.joda.time.Interval(obj39, chronology40);
        org.joda.time.MutableInterval mutableInterval42 = interval41.toMutableInterval();
        org.joda.time.Chronology chronology43 = mutableInterval42.getChronology();
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) (short) 0, chronology43);
        org.joda.time.DurationField durationField45 = durationFieldType35.getField(chronology43);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight21.withFieldAdded(durationFieldType35, 28);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DurationField durationField49 = durationFieldType35.getField(chronology48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight21 and mutableDateTime30", (dateMidnight21.compareTo(mutableDateTime30) == 0) == dateMidnight21.equals(mutableDateTime30));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Interval interval2 = new org.joda.time.Interval(obj0, chronology1);
        boolean boolean4 = interval2.contains((-1L));
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime();
        int int6 = mutableDateTime5.getSecondOfMinute();
        java.lang.Object obj7 = mutableDateTime5.clone();
        org.joda.time.Interval interval8 = interval2.withEnd((org.joda.time.ReadableInstant) mutableDateTime5);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(obj10, chronology11);
        org.joda.time.MutableInterval mutableInterval13 = interval12.toMutableInterval();
        org.joda.time.Chronology chronology14 = mutableInterval13.getChronology();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 0, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate15.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDate.Property property21 = localDate15.property(dateTimeFieldType20);
        org.joda.time.LocalDate localDate23 = localDate15.withYear(6);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.lang.String str25 = dateTimeFieldType24.toString();
        boolean boolean26 = localDate15.isSupported(dateTimeFieldType24);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Interval interval30 = new org.joda.time.Interval(obj28, chronology29);
        org.joda.time.MutableInterval mutableInterval31 = interval30.toMutableInterval();
        org.joda.time.Chronology chronology32 = mutableInterval31.getChronology();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) (short) 0, chronology32);
        org.joda.time.DurationField durationField34 = chronology32.eras();
        boolean boolean35 = dateTimeFieldType24.isSupported(chronology32);
        org.joda.time.DateTimeField dateTimeField36 = chronology32.secondOfDay();
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(readableInstant37, readableInstant38, periodType39);
        mutablePeriod40.addMonths(0);
        int[] intArray45 = chronology32.get((org.joda.time.ReadablePeriod) mutablePeriod40, 97700357000L, (long) 26205);
        org.joda.time.Period period46 = new org.joda.time.Period((java.lang.Object) interval8, chronology32);
        org.joda.time.DurationField durationField47 = chronology32.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField34, durationField47, and durationField34", !(durationField34.compareTo(durationField47) == 0) || (Math.signum(durationField34.compareTo(durationField34)) == Math.signum(durationField47.compareTo(durationField34))));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Interval interval6 = new org.joda.time.Interval(obj4, chronology5);
        org.joda.time.MutableInterval mutableInterval7 = interval6.toMutableInterval();
        org.joda.time.Chronology chronology8 = mutableInterval7.getChronology();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 0, chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.halfdayOfDay();
        org.joda.time.DurationField durationField11 = chronology8.halfdays();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 13, chronology8);
        mutableDateTime12.setHourOfDay(7);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime12.year();
        mutableDateTime12.setDayOfMonth(4);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        mutableDateTime12.setZone(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 100, dateTimeZone18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(43200000L, dateTimeZone18);
        org.joda.time.DateMidnight.Property property22 = dateMidnight21.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight21.minusMonths(31);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight21.plusDays(6);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.lang.String str29 = dateTimeZone28.getID();
        org.joda.time.MutableDateTime mutableDateTime30 = dateMidnight21.toMutableDateTime(dateTimeZone28);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(readableInstant31, readableInstant32, periodType33);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.years();
        mutablePeriod34.set(durationFieldType35, 2);
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Interval interval41 = new org.joda.time.Interval(obj39, chronology40);
        org.joda.time.MutableInterval mutableInterval42 = interval41.toMutableInterval();
        org.joda.time.Chronology chronology43 = mutableInterval42.getChronology();
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) (short) 0, chronology43);
        org.joda.time.DurationField durationField45 = durationFieldType35.getField(chronology43);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight21.withFieldAdded(durationFieldType35, 28);
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.Interval interval52 = new org.joda.time.Interval(obj50, chronology51);
        org.joda.time.MutableInterval mutableInterval53 = interval52.toMutableInterval();
        org.joda.time.Chronology chronology54 = mutableInterval53.getChronology();
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((long) (short) 0, chronology54);
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate((long) (short) -1, chronology54);
        org.joda.time.DateTimeField dateTimeField57 = chronology54.hourOfHalfday();
        org.joda.time.DurationField durationField58 = chronology54.minutes();
        boolean boolean59 = durationFieldType35.isSupported(chronology54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight21 and mutableDateTime30", (dateMidnight21.compareTo(mutableDateTime30) == 0) == dateMidnight21.equals(mutableDateTime30));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTimeField dateTimeField7 = chronology5.halfdayOfDay();
        org.joda.time.DurationField durationField8 = chronology5.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology5);
        org.joda.time.DurationField durationField11 = chronology5.eras();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(chronology5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField11", Math.signum(durationField8.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField8)));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTimeField dateTimeField7 = chronology5.halfdayOfDay();
        int int9 = dateTimeField7.getMaximumValue((long) 11);
        boolean boolean11 = dateTimeField7.isLeap((-1L));
        int int13 = dateTimeField7.getMaximumValue(0L);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Interval interval17 = new org.joda.time.Interval(obj15, chronology16);
        org.joda.time.MutableInterval mutableInterval18 = interval17.toMutableInterval();
        org.joda.time.Chronology chronology19 = mutableInterval18.getChronology();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 0, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight(dateTimeZone21);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Interval interval26 = new org.joda.time.Interval(obj24, chronology25);
        org.joda.time.MutableInterval mutableInterval27 = interval26.toMutableInterval();
        org.joda.time.Chronology chronology28 = mutableInterval27.getChronology();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) (short) 0, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localDate29.toDateTimeAtMidnight(dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localDate29.toDateTimeAtStartOfDay(dateTimeZone32);
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType35 = periodType34.withSecondsRemoved();
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate20, (org.joda.time.ReadablePartial) localDate29, periodType35);
        org.joda.time.LocalDate.Property property37 = localDate20.era();
        int[] intArray38 = new int[] {};
        int int39 = dateTimeField7.getMinimumValue((org.joda.time.ReadablePartial) localDate20, intArray38);
        org.joda.time.DateTime dateTime40 = localDate20.toDateTimeAtMidnight();
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Interval interval44 = new org.joda.time.Interval(obj42, chronology43);
        org.joda.time.MutableInterval mutableInterval45 = interval44.toMutableInterval();
        org.joda.time.Chronology chronology46 = mutableInterval45.getChronology();
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) (short) 0, chronology46);
        org.joda.time.DateTimeField dateTimeField48 = chronology46.halfdayOfDay();
        org.joda.time.DurationField durationField49 = chronology46.halfdays();
        org.joda.time.DateTimeField dateTimeField50 = chronology46.yearOfCentury();
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(chronology46);
        org.joda.time.DateTimeField dateTimeField52 = chronology46.clockhourOfDay();
        org.joda.time.Chronology chronology53 = chronology46.withUTC();
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight(chronology53);
        org.joda.time.DateTime dateTime55 = dateTime40.withChronology(chronology53);
        org.joda.time.Period period57 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Period period59 = period57.multipliedBy(0);
        int int60 = period57.getMonths();
        int[] intArray63 = chronology53.get((org.joda.time.ReadablePeriod) period57, 46859981L, 38022032L);
        org.joda.time.DateTimeField dateTimeField64 = chronology53.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime55", (dateTime22.compareTo(dateTime55) == 0) == dateTime22.equals(dateTime55));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(37);
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(852076799993L, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.weeks();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Interval interval11 = new org.joda.time.Interval(obj9, chronology10);
        org.joda.time.MutableInterval mutableInterval12 = interval11.toMutableInterval();
        org.joda.time.Chronology chronology13 = mutableInterval12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.millisOfSecond();
        org.joda.time.DurationField durationField15 = chronology13.weekyears();
        org.joda.time.TimeOfDay timeOfDay16 = org.joda.time.TimeOfDay.fromMillisOfDay(10L, chronology13);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) ' ', periodType7, chronology13);
        org.joda.time.DateTimeField dateTimeField18 = chronology13.era();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(345599993L, chronology13);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.DurationField durationField21 = chronology13.weekyears();
        org.joda.time.DateTime dateTime22 = dateTime4.toDateTime(chronology13);
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(1439, 5, 52, 6, 0, 52, 11, (int) (short) 0);
        org.joda.time.Period period33 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType35 = period33.getFieldType((int) (short) 1);
        org.joda.time.Period period37 = period33.minusWeeks((int) (byte) 1);
        int int38 = period37.getMillis();
        org.joda.time.DurationFieldType durationFieldType39 = org.joda.time.DurationFieldType.hours();
        boolean boolean40 = period37.isSupported(durationFieldType39);
        int int41 = mutablePeriod31.indexOf(durationFieldType39);
        org.joda.time.TimeOfDay timeOfDay43 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay.Property property44 = timeOfDay43.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone46);
        org.joda.time.LocalTime localTime49 = localTime47.withMillisOfDay(15);
        org.joda.time.LocalTime localTime51 = localTime49.withHourOfDay(0);
        org.joda.time.LocalTime.Property property52 = localTime51.millisOfDay();
        org.joda.time.LocalTime localTime53 = property52.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology54 = localTime53.getChronology();
        org.joda.time.DurationField durationField55 = chronology54.eras();
        org.joda.time.DateTimeField dateTimeField56 = chronology54.year();
        org.joda.time.TimeOfDay timeOfDay57 = timeOfDay43.withChronologyRetainFields(chronology54);
        mutablePeriod31.setPeriod((long) 10022, chronology54);
        long long62 = chronology54.add(23131245600000L, 16732313999999L, 26353);
        org.joda.time.DateTime dateTime63 = dateTime4.withChronology(chronology54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField55", Math.signum(durationField15.compareTo(durationField55)) == -Math.signum(durationField55.compareTo(durationField15)));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 51);
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone0);
        java.util.TimeZone timeZone4 = calendar3.getTimeZone();
        java.lang.String str5 = timeZone4.getID();
        boolean boolean6 = timeZone4.observesDaylightTime();
        java.util.Locale locale7 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str8 = locale7.getISO3Language();
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone4, locale7);
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(timeZone4);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Interval interval14 = new org.joda.time.Interval(obj12, chronology13);
        org.joda.time.MutableInterval mutableInterval15 = interval14.toMutableInterval();
        org.joda.time.Chronology chronology16 = mutableInterval15.getChronology();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (short) 0, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate17.toDateTimeAtMidnight(dateTimeZone18);
        int int20 = dateTime19.getMinuteOfDay();
        int int21 = dateTime19.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime19.getZone();
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone22);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Interval interval27 = new org.joda.time.Interval(obj25, chronology26);
        org.joda.time.MutableInterval mutableInterval28 = interval27.toMutableInterval();
        org.joda.time.Chronology chronology29 = mutableInterval28.getChronology();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) (short) 0, chronology29);
        org.joda.time.DateTimeField dateTimeField31 = chronology29.halfdayOfDay();
        org.joda.time.YearMonthDay yearMonthDay32 = yearMonthDay23.withChronologyRetainFields(chronology29);
        org.joda.time.YearMonthDay yearMonthDay34 = yearMonthDay23.withYear((int) 'x');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.PeriodType periodType37 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(readableInstant35, readableInstant36, periodType37);
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType43 = periodType42.withHoursRemoved();
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Interval interval47 = new org.joda.time.Interval(obj45, chronology46);
        org.joda.time.MutableInterval mutableInterval48 = interval47.toMutableInterval();
        org.joda.time.Chronology chronology49 = mutableInterval48.getChronology();
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((long) (short) 0, chronology49);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(0L, periodType42, chronology49);
        org.joda.time.DateTimeField dateTimeField52 = chronology49.weekyearOfCentury();
        mutablePeriod38.setPeriod((long) (byte) -1, (long) 'a', chronology49);
        java.lang.String str54 = chronology49.toString();
        org.joda.time.YearMonthDay yearMonthDay55 = yearMonthDay34.withChronologyRetainFields(chronology49);
        java.lang.Object obj58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.Interval interval60 = new org.joda.time.Interval(obj58, chronology59);
        org.joda.time.MutableInterval mutableInterval61 = interval60.toMutableInterval();
        org.joda.time.Chronology chronology62 = mutableInterval61.getChronology();
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate((long) (short) 0, chronology62);
        org.joda.time.DateTimeField dateTimeField64 = chronology62.halfdayOfDay();
        org.joda.time.DurationField durationField65 = chronology62.halfdays();
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime((long) 13, chronology62);
        java.lang.String str67 = mutableDateTime66.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime66.property(dateTimeFieldType68);
        org.joda.time.MutableDateTime mutableDateTime70 = property69.roundFloor();
        org.joda.time.MutableDateTime.Property property71 = mutableDateTime70.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime72 = property71.getMutableDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.MutableDateTime.Property property74 = mutableDateTime72.property(dateTimeFieldType73);
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime72.year();
        mutableDateTime72.setSecondOfDay(18);
        org.joda.time.MutableDateTime.Property property78 = mutableDateTime72.yearOfEra();
        org.joda.time.DateTime dateTime79 = yearMonthDay34.toDateTime((org.joda.time.ReadableInstant) mutableDateTime72);
        boolean boolean80 = calendar10.after((java.lang.Object) dateTime79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar9", (calendar3.compareTo(calendar9) == 0) == calendar3.equals(calendar9));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.Chronology chronology6 = dateTimeFormatter5.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter5.getZone();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((java.lang.Object) dateTimeZone7);
        org.joda.time.Chronology chronology9 = dateMidnight8.getChronology();
        org.joda.time.DateMidnight.Property property10 = dateMidnight8.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight8.withDurationAdded(readableDuration11, 100);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight8.withYearOfEra(837);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.withYear(121);
        org.joda.time.Interval interval18 = dateMidnight15.toInterval();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone20);
        org.joda.time.LocalTime localTime23 = localTime21.withMillisOfDay(15);
        org.joda.time.LocalTime localTime25 = localTime23.withHourOfDay(0);
        org.joda.time.LocalTime.Property property26 = localTime25.millisOfDay();
        org.joda.time.LocalTime localTime27 = property26.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology28 = localTime27.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.eras();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone31);
        org.joda.time.LocalTime localTime34 = localTime32.withMillisOfDay(15);
        org.joda.time.LocalTime.Property property35 = localTime32.hourOfDay();
        org.joda.time.LocalTime localTime37 = property35.addCopy(5);
        int int38 = property35.getMinimumValue();
        org.joda.time.LocalTime localTime39 = property35.getLocalTime();
        org.joda.time.LocalTime localTime40 = property35.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime41 = property35.roundFloorCopy();
        int int42 = localTime41.getMillisOfSecond();
        long long44 = chronology28.set((org.joda.time.ReadablePartial) localTime41, (long) 20);
        org.joda.time.Interval interval45 = interval18.withChronology(chronology28);
        org.joda.time.DurationField durationField46 = chronology28.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField29, durationField46, and durationField29", !(durationField29.compareTo(durationField46) == 0) || (Math.signum(durationField29.compareTo(durationField29)) == Math.signum(durationField46.compareTo(durationField29))));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime();
        mutableDateTime8.addMonths(86399999);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        mutableDateTime8.setZone(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime8.copy();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long18 = dateTimeZone16.previousTransition((long) 'x');
        mutableDateTime8.setZone(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = localTime6.toDateTimeToday(dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and mutableDateTime14", (mutableDateTime8.compareTo(mutableDateTime14) == 0) == mutableDateTime8.equals(mutableDateTime14));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Interval interval4 = new org.joda.time.Interval(obj2, chronology3);
        org.joda.time.MutableInterval mutableInterval5 = interval4.toMutableInterval();
        org.joda.time.Chronology chronology6 = mutableInterval5.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) -1, chronology6);
        org.joda.time.DateTimeField dateTimeField9 = chronology6.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = chronology6.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = chronology6.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology6.monthOfYear();
        org.joda.time.DurationField durationField13 = chronology6.days();
        org.joda.time.DurationField durationField14 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField15 = chronology6.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField14", Math.signum(durationField13.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField13)));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTimeField dateTimeField7 = chronology5.halfdayOfDay();
        int int9 = dateTimeField7.getMaximumValue((long) 11);
        boolean boolean11 = dateTimeField7.isLeap((-1L));
        int int12 = dateTimeField7.getMaximumValue();
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.lang.String str15 = locale13.getDisplayCountry(locale14);
        int int16 = dateTimeField7.getMaximumShortTextLength(locale13);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Interval interval20 = new org.joda.time.Interval(obj18, chronology19);
        org.joda.time.MutableInterval mutableInterval21 = interval20.toMutableInterval();
        org.joda.time.Chronology chronology22 = mutableInterval21.getChronology();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) (short) 0, chronology22);
        org.joda.time.DateTime dateTime24 = localDate23.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate26 = localDate23.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Interval interval29 = new org.joda.time.Interval(obj27, chronology28);
        org.joda.time.MutableInterval mutableInterval30 = interval29.toMutableInterval();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Interval interval34 = new org.joda.time.Interval(obj32, chronology33);
        org.joda.time.MutableInterval mutableInterval35 = interval34.toMutableInterval();
        org.joda.time.Chronology chronology36 = mutableInterval35.getChronology();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) (short) 0, chronology36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = localDate37.toDateTimeAtMidnight(dateTimeZone38);
        org.joda.time.Interval interval40 = interval29.withStart((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime dateTime41 = localDate23.toDateTime((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = localDate23.toDateTimeAtCurrentTime(dateTimeZone42);
        int int44 = dateTimeField7.getMaximumValue((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate(dateTimeZone46);
        org.joda.time.DateTime dateTime48 = localDate23.toDateTimeAtCurrentTime(dateTimeZone46);
        java.util.TimeZone timeZone49 = java.util.TimeZone.getDefault();
        int int51 = timeZone49.getOffset((long) 51);
        java.util.Calendar calendar52 = java.util.Calendar.getInstance(timeZone49);
        int int53 = calendar52.getWeekYear();
        calendar52.clear();
        calendar52.setTimeInMillis((long) (-431));
        long long57 = calendar52.getTimeInMillis();
        org.joda.time.LocalTime localTime58 = org.joda.time.LocalTime.fromCalendarFields(calendar52);
        org.joda.time.DateTime dateTime59 = localDate23.toDateTime(localTime58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime43 and dateTime48", (dateTime43.compareTo(dateTime48) == 0) == dateTime43.equals(dateTime48));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale0);
        java.util.TimeZone timeZone3 = calendar2.getTimeZone();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        int int6 = timeZone4.getOffset((long) 51);
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(timeZone4);
        int int8 = calendar7.getWeekYear();
        calendar7.roll((int) (short) 0, false);
        int int12 = calendar7.getMinimalDaysInFirstWeek();
        calendar7.setLenient(true);
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.fromCalendarFields(calendar7);
        int int17 = calendar7.getMaximum((int) (byte) 0);
        java.util.TimeZone timeZone18 = null;
        calendar7.setTimeZone(timeZone18);
        java.util.TimeZone timeZone20 = java.util.TimeZone.getDefault();
        int int22 = timeZone20.getOffset((long) 51);
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone20);
        java.util.TimeZone timeZone24 = java.util.TimeZone.getDefault();
        calendar23.setTimeZone(timeZone24);
        calendar7.setTimeZone(timeZone24);
        boolean boolean27 = timeZone3.hasSameRules(timeZone24);
        int int29 = timeZone3.getOffset((-59010940799901L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar23", (calendar2.compareTo(calendar23) == 0) == calendar2.equals(calendar23));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        org.joda.time.LocalTime localTime8 = property7.roundHalfCeilingCopy();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        org.joda.time.LocalTime localTime11 = property7.addCopy((long) (byte) 1);
        org.joda.time.LocalTime localTime12 = property7.roundHalfCeilingCopy();
        org.joda.time.Period period14 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Period period16 = period14.withHours((int) '4');
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.years();
        org.joda.time.Period period19 = period14.withFieldAdded(durationFieldType17, (int) (byte) 10);
        org.joda.time.LocalTime localTime20 = localTime12.plus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.LocalTime localTime22 = localTime20.withSecondOfMinute(0);
        org.joda.time.LocalTime.Property property23 = localTime20.millisOfDay();
        org.joda.time.Chronology chronology24 = localTime20.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.minutes();
        org.joda.time.DurationField durationField26 = chronology24.eras();
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(chronology24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField25 and durationField26", Math.signum(durationField25.compareTo(durationField26)) == -Math.signum(durationField26.compareTo(durationField25)));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTimeField dateTimeField7 = chronology5.halfdayOfDay();
        org.joda.time.DurationField durationField8 = chronology5.halfdays();
        long long9 = durationField8.getUnitMillis();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(obj10, chronology11);
        org.joda.time.MutableInterval mutableInterval13 = interval12.toMutableInterval();
        org.joda.time.Chronology chronology14 = mutableInterval13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.millisOfSecond();
        org.joda.time.DurationField durationField16 = chronology14.weekyears();
        java.lang.String str17 = durationField16.getName();
        long long20 = durationField16.add((long) 5, 0L);
        int int21 = durationField8.compareTo(durationField16);
        long long23 = durationField16.getValueAsLong((long) (short) 1);
        long long26 = durationField16.getMillis(8, (long) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType27 = durationField16.getType();
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(readableInstant28, readableInstant29, periodType30);
        org.joda.time.PeriodType periodType35 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType36 = periodType35.withHoursRemoved();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Interval interval40 = new org.joda.time.Interval(obj38, chronology39);
        org.joda.time.MutableInterval mutableInterval41 = interval40.toMutableInterval();
        org.joda.time.Chronology chronology42 = mutableInterval41.getChronology();
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((long) (short) 0, chronology42);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(0L, periodType35, chronology42);
        org.joda.time.DateTimeField dateTimeField45 = chronology42.weekyearOfCentury();
        mutablePeriod31.setPeriod((long) (byte) -1, (long) 'a', chronology42);
        java.lang.String str47 = chronology42.toString();
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(chronology42);
        org.joda.time.DateTimeField dateTimeField49 = chronology42.weekOfWeekyear();
        org.joda.time.Chronology chronology50 = chronology42.withUTC();
        org.joda.time.DurationField durationField51 = durationFieldType27.getField(chronology50);
        java.lang.Object obj54 = null;
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.Interval interval56 = new org.joda.time.Interval(obj54, chronology55);
        org.joda.time.MutableInterval mutableInterval57 = interval56.toMutableInterval();
        org.joda.time.Chronology chronology58 = mutableInterval57.getChronology();
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((long) (short) 0, chronology58);
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate((long) (short) -1, chronology58);
        org.joda.time.DateTimeField dateTimeField61 = chronology58.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField62 = chronology58.weekyear();
        org.joda.time.Period period64 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Period period66 = period64.multipliedBy(0);
        org.joda.time.DurationFieldType durationFieldType67 = org.joda.time.DurationFieldType.years();
        org.joda.time.Period period69 = period64.withFieldAdded(durationFieldType67, 2);
        org.joda.time.Period period71 = period64.minusMinutes(13);
        int[] intArray74 = chronology58.get((org.joda.time.ReadablePeriod) period64, 15L, (long) (short) 10);
        org.joda.time.Chronology chronology75 = chronology58.withUTC();
        org.joda.time.DateTimeField dateTimeField76 = chronology75.weekyearOfCentury();
        boolean boolean77 = durationFieldType27.isSupported(chronology75);
        java.lang.String str78 = durationFieldType27.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField51", (durationField16.compareTo(durationField51) == 0) == durationField16.equals(durationField51));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        long long4 = dateTimeZone1.previousTransition((long) (short) -1);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone1);
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Interval interval11 = new org.joda.time.Interval(obj9, chronology10);
        org.joda.time.MutableInterval mutableInterval12 = interval11.toMutableInterval();
        org.joda.time.Chronology chronology13 = mutableInterval12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.millisOfSecond();
        org.joda.time.DurationField durationField15 = chronology13.weekyears();
        org.joda.time.TimeOfDay timeOfDay16 = org.joda.time.TimeOfDay.fromMillisOfDay(10L, chronology13);
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.now(chronology13);
        org.joda.time.Chronology chronology18 = chronology13.withUTC();
        org.joda.time.DurationField durationField19 = chronology13.weekyears();
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime6.toMutableDateTime(chronology13);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant7", (dateTime6.compareTo(instant7) == 0) == dateTime6.equals(instant7));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.years();
        mutablePeriod3.set(durationFieldType4, 2);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Interval interval10 = new org.joda.time.Interval(obj8, chronology9);
        org.joda.time.MutableInterval mutableInterval11 = interval10.toMutableInterval();
        org.joda.time.Chronology chronology12 = mutableInterval11.getChronology();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 0, chronology12);
        org.joda.time.DurationField durationField14 = durationFieldType4.getField(chronology12);
        org.joda.time.DateTimeField dateTimeField15 = chronology12.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.centuryOfEra();
        org.joda.time.DurationField durationField17 = chronology12.weekyears();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.now(chronology12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField17", (durationField14.compareTo(durationField17) == 0) == durationField14.equals(durationField17));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Interval interval4 = new org.joda.time.Interval(obj2, chronology3);
        org.joda.time.MutableInterval mutableInterval5 = interval4.toMutableInterval();
        org.joda.time.Chronology chronology6 = mutableInterval5.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.halfdayOfDay();
        org.joda.time.DurationField durationField9 = chronology6.halfdays();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 13, chronology6);
        java.lang.String str11 = mutableDateTime10.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime10.property(dateTimeFieldType12);
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundFloor();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.getMutableDateTime();
        mutableDateTime16.addWeekyears(70);
        mutableDateTime16.addMonths((int) 'x');
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.minuteOfHour();
        int int22 = mutableDateTime16.getCenturyOfEra();
        long long23 = mutableDateTime16.getMillis();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Interval interval27 = new org.joda.time.Interval(obj25, chronology26);
        org.joda.time.MutableInterval mutableInterval28 = interval27.toMutableInterval();
        org.joda.time.Chronology chronology29 = mutableInterval28.getChronology();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) (short) 0, chronology29);
        org.joda.time.DateTime dateTime31 = localDate30.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate33 = localDate30.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Interval interval36 = new org.joda.time.Interval(obj34, chronology35);
        org.joda.time.MutableInterval mutableInterval37 = interval36.toMutableInterval();
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Interval interval41 = new org.joda.time.Interval(obj39, chronology40);
        org.joda.time.MutableInterval mutableInterval42 = interval41.toMutableInterval();
        org.joda.time.Chronology chronology43 = mutableInterval42.getChronology();
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) (short) 0, chronology43);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = localDate44.toDateTimeAtMidnight(dateTimeZone45);
        org.joda.time.Interval interval47 = interval36.withStart((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTime dateTime48 = localDate30.toDateTime((org.joda.time.ReadableInstant) dateTime46);
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.Interval interval52 = new org.joda.time.Interval(obj50, chronology51);
        org.joda.time.MutableInterval mutableInterval53 = interval52.toMutableInterval();
        org.joda.time.Chronology chronology54 = mutableInterval53.getChronology();
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((long) (short) 0, chronology54);
        org.joda.time.DateTime dateTime56 = localDate55.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate58 = localDate55.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.Interval interval61 = new org.joda.time.Interval(obj59, chronology60);
        org.joda.time.MutableInterval mutableInterval62 = interval61.toMutableInterval();
        java.lang.Object obj64 = null;
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.Interval interval66 = new org.joda.time.Interval(obj64, chronology65);
        org.joda.time.MutableInterval mutableInterval67 = interval66.toMutableInterval();
        org.joda.time.Chronology chronology68 = mutableInterval67.getChronology();
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate((long) (short) 0, chronology68);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateTime dateTime71 = localDate69.toDateTimeAtMidnight(dateTimeZone70);
        org.joda.time.Interval interval72 = interval61.withStart((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.DateTime dateTime73 = localDate55.toDateTime((org.joda.time.ReadableInstant) dateTime71);
        boolean boolean74 = localDate30.isEqual((org.joda.time.ReadablePartial) localDate55);
        org.joda.time.LocalDate.Property property75 = localDate55.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.forOffsetMillis(7);
        org.joda.time.DateMidnight dateMidnight78 = localDate55.toDateMidnight(dateTimeZone77);
        org.joda.time.DateMidnight dateMidnight80 = dateMidnight78.minusYears(6);
        org.joda.time.DateMidnight dateMidnight82 = dateMidnight78.minus((long) 10);
        org.joda.time.DateMidnight dateMidnight84 = dateMidnight82.minusWeeks(8);
        org.joda.time.DateTime dateTime85 = dateMidnight84.toDateTimeISO();
        org.joda.time.DateMidnight.Property property86 = dateMidnight84.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight88 = dateMidnight84.plus(2720L);
        mutableDateTime16.setMillis((org.joda.time.ReadableInstant) dateMidnight84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and dateTime85", (mutableDateTime16.compareTo(dateTime85) == 0) == mutableDateTime16.equals(dateTime85));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Interval interval6 = new org.joda.time.Interval(obj4, chronology5);
        org.joda.time.MutableInterval mutableInterval7 = interval6.toMutableInterval();
        org.joda.time.Chronology chronology8 = mutableInterval7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.millisOfSecond();
        org.joda.time.DurationField durationField10 = chronology8.weekyears();
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay(10L, chronology8);
        org.joda.time.DurationField durationField12 = chronology8.months();
        org.joda.time.Period period13 = new org.joda.time.Period((long) 12, 0L, chronology8);
        long long17 = chronology8.add((long) 15, (long) 12, 5);
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay((-62104612278985L), chronology8);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Interval interval22 = new org.joda.time.Interval(obj20, chronology21);
        org.joda.time.MutableInterval mutableInterval23 = interval22.toMutableInterval();
        org.joda.time.Chronology chronology24 = mutableInterval23.getChronology();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) (short) 0, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localDate25.toDateTimeAtMidnight(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = localDate25.toDateTimeAtStartOfDay(dateTimeZone28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDate.Property property31 = localDate25.property(dateTimeFieldType30);
        org.joda.time.LocalDate localDate33 = localDate25.withYear(6);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.lang.String str35 = dateTimeFieldType34.toString();
        boolean boolean36 = localDate25.isSupported(dateTimeFieldType34);
        org.joda.time.LocalDate.Property property37 = localDate25.yearOfCentury();
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.PeriodType periodType40 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(readableInstant38, readableInstant39, periodType40);
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.years();
        mutablePeriod41.set(durationFieldType42, 2);
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Interval interval48 = new org.joda.time.Interval(obj46, chronology47);
        org.joda.time.MutableInterval mutableInterval49 = interval48.toMutableInterval();
        org.joda.time.Chronology chronology50 = mutableInterval49.getChronology();
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) (short) 0, chronology50);
        org.joda.time.DurationField durationField52 = durationFieldType42.getField(chronology50);
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.Interval interval57 = new org.joda.time.Interval(obj55, chronology56);
        org.joda.time.MutableInterval mutableInterval58 = interval57.toMutableInterval();
        org.joda.time.Chronology chronology59 = mutableInterval58.getChronology();
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate((long) (short) 0, chronology59);
        org.joda.time.DateTimeField dateTimeField61 = chronology59.halfdayOfDay();
        org.joda.time.DurationField durationField62 = chronology59.halfdays();
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime((long) 13, chronology59);
        org.joda.time.DurationField durationField64 = chronology59.millis();
        boolean boolean65 = durationFieldType42.isSupported(chronology59);
        boolean boolean66 = localDate25.isSupported(durationFieldType42);
        boolean boolean67 = localTime18.isSupported(durationFieldType42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField52", (durationField10.compareTo(durationField52) == 0) == durationField10.equals(durationField52));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.millisOfSecond();
        org.joda.time.DurationField durationField7 = chronology5.weekyears();
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(10L, chronology5);
        org.joda.time.TimeOfDay.Property property9 = timeOfDay8.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay11 = property9.addWrapFieldToCopy(1980);
        org.joda.time.TimeOfDay timeOfDay12 = property9.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.minusMinutes((int) (byte) 10);
        org.joda.time.TimeOfDay.Property property15 = timeOfDay12.minuteOfHour();
        org.joda.time.TimeOfDay.Property property16 = timeOfDay12.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay12.minusMinutes(733);
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.plusSeconds((-52));
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone22);
        org.joda.time.LocalTime localTime25 = localTime23.withMillisOfDay(15);
        org.joda.time.LocalTime localTime27 = localTime25.withHourOfDay(0);
        org.joda.time.LocalTime.Property property28 = localTime27.millisOfDay();
        org.joda.time.LocalTime localTime29 = property28.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology30 = localTime29.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.eras();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone33);
        org.joda.time.LocalTime localTime36 = localTime34.withMillisOfDay(15);
        org.joda.time.LocalTime.Property property37 = localTime34.hourOfDay();
        org.joda.time.LocalTime localTime39 = property37.addCopy(5);
        int int40 = property37.getMinimumValue();
        org.joda.time.LocalTime localTime41 = property37.getLocalTime();
        org.joda.time.LocalTime localTime42 = property37.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime43 = property37.roundFloorCopy();
        int int44 = localTime43.getMillisOfSecond();
        long long46 = chronology30.set((org.joda.time.ReadablePartial) localTime43, (long) 20);
        org.joda.time.DateTimeZone dateTimeZone47 = chronology30.getZone();
        org.joda.time.DateTime dateTime48 = timeOfDay18.toDateTimeToday(dateTimeZone47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField31", Math.signum(durationField7.compareTo(durationField31)) == -Math.signum(durationField31.compareTo(durationField7)));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Interval interval5 = new org.joda.time.Interval(obj3, chronology4);
        org.joda.time.MutableInterval mutableInterval6 = interval5.toMutableInterval();
        org.joda.time.Chronology chronology7 = mutableInterval6.getChronology();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) 0, chronology7);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) -1, chronology7);
        org.joda.time.DateTimeField dateTimeField10 = chronology7.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = chronology7.weekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology7.year();
        org.joda.time.DateTimeField dateTimeField13 = chronology7.monthOfYear();
        org.joda.time.DurationField durationField14 = chronology7.days();
        org.joda.time.DurationField durationField15 = chronology7.eras();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((-149828L), chronology7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField15", Math.signum(durationField14.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField14)));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 51);
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone0);
        int int4 = calendar3.getWeekYear();
        calendar3.clear();
        java.util.TimeZone timeZone6 = calendar3.getTimeZone();
        java.lang.String str7 = timeZone6.getID();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone6);
        timeZone6.setRawOffset(31);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone6, locale11);
        int int13 = timeZone6.getRawOffset();
        java.lang.String str14 = timeZone6.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar12", (calendar8.compareTo(calendar12) == 0) == calendar8.equals(calendar12));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Interval interval4 = new org.joda.time.Interval(obj2, chronology3);
        org.joda.time.MutableInterval mutableInterval5 = interval4.toMutableInterval();
        org.joda.time.Chronology chronology6 = mutableInterval5.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtMidnight(dateTimeZone8);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Interval interval13 = new org.joda.time.Interval(obj11, chronology12);
        org.joda.time.MutableInterval mutableInterval14 = interval13.toMutableInterval();
        org.joda.time.Chronology chronology15 = mutableInterval14.getChronology();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 0, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localDate16.toDateTimeAtMidnight(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate16.toDateTimeAtStartOfDay(dateTimeZone19);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType22 = periodType21.withSecondsRemoved();
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate7, (org.joda.time.ReadablePartial) localDate16, periodType22);
        java.util.Locale locale26 = new java.util.Locale("hi!", "");
        boolean boolean27 = localDate7.equals((java.lang.Object) locale26);
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone0, locale26);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone0);
        java.util.TimeZone.setDefault(timeZone0);
        timeZone0.setRawOffset(120);
        int int34 = timeZone0.getOffset(1645574399993L);
        java.lang.String str35 = timeZone0.getDisplayName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar28 and calendar29", (calendar28.compareTo(calendar29) == 0) == calendar28.equals(calendar29));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.joda.time.Period period1 = org.joda.time.Period.days(6);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.millis();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Interval interval9 = new org.joda.time.Interval(obj7, chronology8);
        org.joda.time.MutableInterval mutableInterval10 = interval9.toMutableInterval();
        org.joda.time.Chronology chronology11 = mutableInterval10.getChronology();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) 0, chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.halfdayOfDay();
        org.joda.time.DurationField durationField14 = chronology11.halfdays();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) 13, chronology11);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) ' ', chronology11);
        org.joda.time.DateTimeField dateTimeField17 = chronology11.yearOfCentury();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology11);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((-62135596800007L), chronology11);
        boolean boolean20 = durationFieldType2.isSupported(chronology11);
        int int21 = period1.get(durationFieldType2);
        org.joda.time.Period period33 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Period period35 = period33.multipliedBy(0);
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.years();
        org.joda.time.Period period38 = period33.withFieldAdded(durationFieldType36, 2);
        int int39 = period38.getMinutes();
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Interval interval44 = new org.joda.time.Interval(obj42, chronology43);
        org.joda.time.MutableInterval mutableInterval45 = interval44.toMutableInterval();
        org.joda.time.Chronology chronology46 = mutableInterval45.getChronology();
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) (short) 0, chronology46);
        org.joda.time.DateTimeField dateTimeField48 = chronology46.halfdayOfDay();
        org.joda.time.DurationField durationField49 = chronology46.halfdays();
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) 13, chronology46);
        java.lang.String str51 = mutableDateTime50.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime50.property(dateTimeFieldType52);
        org.joda.time.Period period55 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType57 = period55.getFieldType((int) (short) 1);
        org.joda.time.Period period59 = period55.minusWeeks((int) (byte) 1);
        mutableDateTime50.add((org.joda.time.ReadablePeriod) period59);
        org.joda.time.PeriodType periodType61 = period59.getPeriodType();
        org.joda.time.Period period62 = period38.withPeriodType(periodType61);
        java.lang.Object obj65 = null;
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.Interval interval67 = new org.joda.time.Interval(obj65, chronology66);
        org.joda.time.MutableInterval mutableInterval68 = interval67.toMutableInterval();
        org.joda.time.Chronology chronology69 = mutableInterval68.getChronology();
        org.joda.time.LocalDate localDate70 = new org.joda.time.LocalDate((long) (short) 0, chronology69);
        org.joda.time.LocalDate localDate71 = new org.joda.time.LocalDate((long) (short) -1, chronology69);
        org.joda.time.DateTimeField dateTimeField72 = chronology69.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField73 = chronology69.weekyear();
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateMidnight dateMidnight77 = new org.joda.time.DateMidnight((long) 10, dateTimeZone76);
        java.lang.String str78 = dateTimeZone76.toString();
        int int80 = dateTimeZone76.getStandardOffset((long) 10);
        org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime(dateTimeZone76);
        org.joda.time.Chronology chronology82 = chronology69.withZone(dateTimeZone76);
        org.joda.time.DateTimeField dateTimeField83 = chronology82.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField84 = chronology82.era();
        org.joda.time.Period period85 = new org.joda.time.Period(0L, 1645514307969L, periodType61, chronology82);
        org.joda.time.PeriodType periodType86 = periodType61.withMinutesRemoved();
        org.joda.time.Period period87 = new org.joda.time.Period(33079, 26909, 26458, 2040, 2070, 204270, 0, 9844, periodType61);
        org.joda.time.Period period88 = period1.normalizedStandard(periodType61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime81", (dateTime18.compareTo(dateTime81) == 0) == dateTime18.equals(dateTime81));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Interval interval4 = new org.joda.time.Interval(obj2, chronology3);
        org.joda.time.MutableInterval mutableInterval5 = interval4.toMutableInterval();
        org.joda.time.Chronology chronology6 = mutableInterval5.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        org.joda.time.DateTime dateTime8 = localDate7.toDateTimeAtStartOfDay();
        org.joda.time.DateTime.Property property9 = dateTime8.secondOfMinute();
        int int10 = property9.getMinimumValueOverall();
        org.joda.time.DateTime dateTime11 = property9.roundCeilingCopy();
        org.joda.time.DateTime dateTime13 = dateTime11.plus((long) 19);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime11.minus(readableDuration14);
        org.joda.time.DateTime.Property property16 = dateTime15.dayOfWeek();
        org.joda.time.DateTime dateTime17 = property16.roundCeilingCopy();
        int int18 = dateTime17.getEra();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(66143405);
        org.joda.time.DateTime dateTime21 = dateTime17.toDateTime(dateTimeZone20);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((-2113899533000L), dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime21", (dateTime8.compareTo(dateTime21) == 0) == dateTime8.equals(dateTime21));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.joda.time.ReadableDuration readableDuration0 = null;
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Interval interval4 = new org.joda.time.Interval(obj2, chronology3);
        org.joda.time.MutableInterval mutableInterval5 = interval4.toMutableInterval();
        org.joda.time.Chronology chronology6 = mutableInterval5.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtMidnight(dateTimeZone8);
        int int10 = dateTime9.getMinuteOfDay();
        int int11 = dateTime9.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime9.getZone();
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType14 = periodType13.withSecondsRemoved();
        java.lang.String str15 = periodType14.getName();
        org.joda.time.PeriodType periodType16 = periodType14.withSecondsRemoved();
        org.joda.time.Period period17 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateTime9, periodType16);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Interval interval21 = new org.joda.time.Interval(obj19, chronology20);
        org.joda.time.MutableInterval mutableInterval22 = interval21.toMutableInterval();
        org.joda.time.Chronology chronology23 = mutableInterval22.getChronology();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (short) 0, chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.halfdayOfDay();
        org.joda.time.DurationField durationField26 = chronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField27 = chronology23.yearOfCentury();
        org.joda.time.DateTime dateTime28 = dateTime9.toDateTime(chronology23);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(chronology23);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(readableInstant30, readableInstant31, periodType32);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.years();
        mutablePeriod33.set(durationFieldType34, 2);
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Interval interval40 = new org.joda.time.Interval(obj38, chronology39);
        org.joda.time.MutableInterval mutableInterval41 = interval40.toMutableInterval();
        org.joda.time.Chronology chronology42 = mutableInterval41.getChronology();
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((long) (short) 0, chronology42);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = localDate43.toDateTimeAtMidnight(dateTimeZone44);
        int int46 = dateTime45.getMinuteOfDay();
        org.joda.time.Interval interval47 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod33, (org.joda.time.ReadableInstant) dateTime45);
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Interval interval51 = new org.joda.time.Interval(obj49, chronology50);
        org.joda.time.MutableInterval mutableInterval52 = interval51.toMutableInterval();
        org.joda.time.Chronology chronology53 = mutableInterval52.getChronology();
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate((long) (short) 0, chronology53);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = localDate54.toDateTimeAtMidnight(dateTimeZone55);
        java.lang.Object obj58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.Interval interval60 = new org.joda.time.Interval(obj58, chronology59);
        org.joda.time.MutableInterval mutableInterval61 = interval60.toMutableInterval();
        org.joda.time.Chronology chronology62 = mutableInterval61.getChronology();
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate((long) (short) 0, chronology62);
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTime dateTime65 = localDate63.toDateTimeAtMidnight(dateTimeZone64);
        java.lang.Object obj67 = null;
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.Interval interval69 = new org.joda.time.Interval(obj67, chronology68);
        org.joda.time.MutableInterval mutableInterval70 = interval69.toMutableInterval();
        org.joda.time.Chronology chronology71 = mutableInterval70.getChronology();
        org.joda.time.LocalDate localDate72 = new org.joda.time.LocalDate((long) (short) 0, chronology71);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.DateTime dateTime74 = localDate72.toDateTimeAtMidnight(dateTimeZone73);
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.DateTime dateTime76 = localDate72.toDateTimeAtStartOfDay(dateTimeZone75);
        org.joda.time.PeriodType periodType77 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType78 = periodType77.withSecondsRemoved();
        org.joda.time.Period period79 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate63, (org.joda.time.ReadablePartial) localDate72, periodType78);
        org.joda.time.DateTime dateTime80 = dateTime56.minus((org.joda.time.ReadablePeriod) period79);
        java.lang.Object obj82 = null;
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.Interval interval84 = new org.joda.time.Interval(obj82, chronology83);
        org.joda.time.MutableInterval mutableInterval85 = interval84.toMutableInterval();
        org.joda.time.Chronology chronology86 = mutableInterval85.getChronology();
        org.joda.time.LocalDate localDate87 = new org.joda.time.LocalDate((long) (short) 0, chronology86);
        org.joda.time.DateTimeZone dateTimeZone88 = null;
        org.joda.time.DateTime dateTime89 = localDate87.toDateTimeAtMidnight(dateTimeZone88);
        int int90 = dateTime89.getMinuteOfDay();
        int int91 = dateTime89.getYearOfEra();
        mutablePeriod33.setPeriod((org.joda.time.ReadableInstant) dateTime56, (org.joda.time.ReadableInstant) dateTime89);
        org.joda.time.LocalDate localDate93 = dateTime89.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone95 = org.joda.time.DateTimeZone.forOffsetMillis(7);
        org.joda.time.DateTime dateTime96 = dateTime89.toDateTime(dateTimeZone95);
        org.joda.time.MutableDateTime mutableDateTime97 = mutableDateTime29.toMutableDateTime(dateTimeZone95);
        org.joda.time.LocalTime localTime98 = new org.joda.time.LocalTime(dateTimeZone95);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime96", (dateTime9.compareTo(dateTime96) == 0) == dateTime9.equals(dateTime96));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Interval interval4 = new org.joda.time.Interval(obj2, chronology3);
        org.joda.time.MutableInterval mutableInterval5 = interval4.toMutableInterval();
        org.joda.time.Chronology chronology6 = mutableInterval5.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.halfdayOfDay();
        org.joda.time.DurationField durationField9 = chronology6.halfdays();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 13, chronology6);
        mutableDateTime10.setHourOfDay(7);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime10.year();
        mutableDateTime10.setHourOfDay(1);
        mutableDateTime10.setYear((int) '4');
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime20 = property18.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime22 = property18.add((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours(37);
        org.joda.time.DateTime dateTime25 = mutableDateTime22.toDateTime(dateTimeZone24);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and dateTime25", (mutableDateTime10.compareTo(dateTime25) == 0) == mutableDateTime10.equals(dateTime25));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Interval interval4 = new org.joda.time.Interval(obj2, chronology3);
        org.joda.time.MutableInterval mutableInterval5 = interval4.toMutableInterval();
        org.joda.time.Chronology chronology6 = mutableInterval5.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.halfdayOfDay();
        org.joda.time.DurationField durationField9 = chronology6.halfdays();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 13, chronology6);
        java.lang.String str11 = mutableDateTime10.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime10.property(dateTimeFieldType12);
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundFloor();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.getMutableDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.property(dateTimeFieldType17);
        org.joda.time.Instant instant19 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime16.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and instant19", (mutableDateTime16.compareTo(instant19) == 0) == mutableDateTime16.equals(instant19));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Interval interval6 = new org.joda.time.Interval(obj4, chronology5);
        org.joda.time.MutableInterval mutableInterval7 = interval6.toMutableInterval();
        org.joda.time.Chronology chronology8 = mutableInterval7.getChronology();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 0, chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.halfdayOfDay();
        org.joda.time.DurationField durationField11 = chronology8.halfdays();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 13, chronology8);
        mutableDateTime12.setHourOfDay(7);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime12.year();
        mutableDateTime12.setDayOfMonth(4);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        mutableDateTime12.setZone(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 100, dateTimeZone18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(43200000L, dateTimeZone18);
        org.joda.time.DateMidnight.Property property22 = dateMidnight21.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight21.minusMonths(31);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight21.plusDays(6);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.lang.String str29 = dateTimeZone28.getID();
        org.joda.time.MutableDateTime mutableDateTime30 = dateMidnight21.toMutableDateTime(dateTimeZone28);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(readableInstant31, readableInstant32, periodType33);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.years();
        mutablePeriod34.set(durationFieldType35, 2);
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Interval interval41 = new org.joda.time.Interval(obj39, chronology40);
        org.joda.time.MutableInterval mutableInterval42 = interval41.toMutableInterval();
        org.joda.time.Chronology chronology43 = mutableInterval42.getChronology();
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) (short) 0, chronology43);
        org.joda.time.DurationField durationField45 = durationFieldType35.getField(chronology43);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight21.withFieldAdded(durationFieldType35, 28);
        org.joda.time.DateMidnight.Property property48 = dateMidnight21.weekyear();
        org.joda.time.DateMidnight dateMidnight50 = property48.addToCopy(212);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight21 and mutableDateTime30", (dateMidnight21.compareTo(mutableDateTime30) == 0) == dateMidnight21.equals(mutableDateTime30));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.joda.time.ReadableDuration readableDuration1 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Interval interval5 = new org.joda.time.Interval(obj3, chronology4);
        org.joda.time.MutableInterval mutableInterval6 = interval5.toMutableInterval();
        org.joda.time.Chronology chronology7 = mutableInterval6.getChronology();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) 0, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate8.toDateTimeAtMidnight(dateTimeZone9);
        int int11 = dateTime10.getMinuteOfDay();
        int int12 = dateTime10.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime10.getZone();
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType15 = periodType14.withSecondsRemoved();
        java.lang.String str16 = periodType15.getName();
        org.joda.time.PeriodType periodType17 = periodType15.withSecondsRemoved();
        org.joda.time.Period period18 = new org.joda.time.Period(readableDuration1, (org.joda.time.ReadableInstant) dateTime10, periodType17);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Interval interval22 = new org.joda.time.Interval(obj20, chronology21);
        org.joda.time.MutableInterval mutableInterval23 = interval22.toMutableInterval();
        org.joda.time.Chronology chronology24 = mutableInterval23.getChronology();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) (short) 0, chronology24);
        org.joda.time.DateTimeField dateTimeField26 = chronology24.halfdayOfDay();
        org.joda.time.DurationField durationField27 = chronology24.halfdays();
        org.joda.time.DateTimeField dateTimeField28 = chronology24.yearOfCentury();
        org.joda.time.DateTime dateTime29 = dateTime10.toDateTime(chronology24);
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay((long) 32770, chronology24);
        org.joda.time.YearMonthDay yearMonthDay32 = yearMonthDay30.withYear((int) 'x');
        org.joda.time.YearMonthDay.Property property33 = yearMonthDay30.monthOfYear();
        org.joda.time.DurationField durationField34 = property33.getRangeDurationField();
        int int35 = property33.getMaximumValueOverall();
        org.joda.time.YearMonthDay yearMonthDay37 = property33.addWrapFieldToCopy(1969);
        int int38 = yearMonthDay37.getYear();
        org.joda.time.DateTime dateTime39 = yearMonthDay37.toDateTimeAtCurrentTime();
        org.joda.time.DateTime.Property property40 = dateTime39.era();
        org.joda.time.DurationField durationField41 = property40.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField41, durationField27, and durationField34", !(durationField41.compareTo(durationField27) == 0) || (Math.signum(durationField41.compareTo(durationField34)) == Math.signum(durationField27.compareTo(durationField34))));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(readableInstant5, readableInstant6, periodType7);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.years();
        mutablePeriod8.set(durationFieldType9, 2);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Interval interval15 = new org.joda.time.Interval(obj13, chronology14);
        org.joda.time.MutableInterval mutableInterval16 = interval15.toMutableInterval();
        org.joda.time.Chronology chronology17 = mutableInterval16.getChronology();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) (short) 0, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate18.toDateTimeAtMidnight(dateTimeZone19);
        int int21 = dateTime20.getMinuteOfDay();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod8, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime.Property property23 = dateTime20.dayOfWeek();
        org.joda.time.DateTime dateTime24 = property23.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime25 = property23.getDateTime();
        mutablePeriod3.setPeriod(readableInstant4, (org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Period period28 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Period period30 = period28.multipliedBy(0);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.years();
        org.joda.time.Period period33 = period28.withFieldAdded(durationFieldType31, 2);
        int int34 = period33.getMinutes();
        boolean boolean35 = dateTime25.equals((java.lang.Object) period33);
        int int36 = dateTime25.getYearOfEra();
        org.joda.time.Instant instant37 = dateTime25.toInstant();
        int int38 = dateTime25.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant37", (dateTime25.compareTo(instant37) == 0) == dateTime25.equals(instant37));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Interval interval4 = new org.joda.time.Interval(obj2, chronology3);
        org.joda.time.MutableInterval mutableInterval5 = interval4.toMutableInterval();
        org.joda.time.Chronology chronology6 = mutableInterval5.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.halfdayOfDay();
        org.joda.time.DurationField durationField9 = chronology6.halfdays();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 13, chronology6);
        java.lang.String str11 = mutableDateTime10.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime10.property(dateTimeFieldType12);
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundFloor();
        int int15 = mutableDateTime14.getSecondOfDay();
        boolean boolean16 = mutableDateTime14.isAfterNow();
        mutableDateTime14.add(43200000L);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.year();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Interval interval23 = new org.joda.time.Interval(obj21, chronology22);
        org.joda.time.MutableInterval mutableInterval24 = interval23.toMutableInterval();
        org.joda.time.Chronology chronology25 = mutableInterval24.getChronology();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) (short) 0, chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.halfdayOfDay();
        org.joda.time.DurationField durationField28 = chronology25.halfdays();
        org.joda.time.DateTimeField dateTimeField29 = chronology25.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = chronology25.yearOfEra();
        mutableDateTime14.setChronology(chronology25);
        org.joda.time.Instant instant32 = mutableDateTime14.toInstant();
        int int33 = mutableDateTime14.getCenturyOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant32", (mutableDateTime14.compareTo(instant32) == 0) == mutableDateTime14.equals(instant32));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.years();
        mutablePeriod3.set(durationFieldType4, 2);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Interval interval9 = new org.joda.time.Interval(obj7, chronology8);
        org.joda.time.MutableInterval mutableInterval10 = interval9.toMutableInterval();
        org.joda.time.Chronology chronology11 = mutableInterval10.getChronology();
        mutablePeriod3.setPeriod((org.joda.time.ReadableInterval) mutableInterval10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(readableInstant13, readableInstant14, periodType15);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.years();
        mutablePeriod16.set(durationFieldType17, 2);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Interval interval23 = new org.joda.time.Interval(obj21, chronology22);
        org.joda.time.MutableInterval mutableInterval24 = interval23.toMutableInterval();
        org.joda.time.Chronology chronology25 = mutableInterval24.getChronology();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) (short) 0, chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = localDate26.toDateTimeAtMidnight(dateTimeZone27);
        int int29 = dateTime28.getMinuteOfDay();
        org.joda.time.Interval interval30 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod16, (org.joda.time.ReadableInstant) dateTime28);
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Interval interval34 = new org.joda.time.Interval(obj32, chronology33);
        org.joda.time.MutableInterval mutableInterval35 = interval34.toMutableInterval();
        org.joda.time.Chronology chronology36 = mutableInterval35.getChronology();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) (short) 0, chronology36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = localDate37.toDateTimeAtMidnight(dateTimeZone38);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Interval interval43 = new org.joda.time.Interval(obj41, chronology42);
        org.joda.time.MutableInterval mutableInterval44 = interval43.toMutableInterval();
        org.joda.time.Chronology chronology45 = mutableInterval44.getChronology();
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) (short) 0, chronology45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = localDate46.toDateTimeAtMidnight(dateTimeZone47);
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.Interval interval52 = new org.joda.time.Interval(obj50, chronology51);
        org.joda.time.MutableInterval mutableInterval53 = interval52.toMutableInterval();
        org.joda.time.Chronology chronology54 = mutableInterval53.getChronology();
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((long) (short) 0, chronology54);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = localDate55.toDateTimeAtMidnight(dateTimeZone56);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = localDate55.toDateTimeAtStartOfDay(dateTimeZone58);
        org.joda.time.PeriodType periodType60 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType61 = periodType60.withSecondsRemoved();
        org.joda.time.Period period62 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate46, (org.joda.time.ReadablePartial) localDate55, periodType61);
        org.joda.time.DateTime dateTime63 = dateTime39.minus((org.joda.time.ReadablePeriod) period62);
        java.lang.Object obj65 = null;
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.Interval interval67 = new org.joda.time.Interval(obj65, chronology66);
        org.joda.time.MutableInterval mutableInterval68 = interval67.toMutableInterval();
        org.joda.time.Chronology chronology69 = mutableInterval68.getChronology();
        org.joda.time.LocalDate localDate70 = new org.joda.time.LocalDate((long) (short) 0, chronology69);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateTime dateTime72 = localDate70.toDateTimeAtMidnight(dateTimeZone71);
        int int73 = dateTime72.getMinuteOfDay();
        int int74 = dateTime72.getYearOfEra();
        mutablePeriod16.setPeriod((org.joda.time.ReadableInstant) dateTime39, (org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.LocalDate localDate76 = dateTime72.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.forOffsetMillis(7);
        org.joda.time.DateTime dateTime79 = dateTime72.toDateTime(dateTimeZone78);
        boolean boolean80 = mutableInterval10.contains((org.joda.time.ReadableInstant) dateTime79);
        long long81 = mutableInterval10.toDurationMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and dateTime79", (dateTime28.compareTo(dateTime79) == 0) == dateTime28.equals(dateTime79));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Interval interval6 = new org.joda.time.Interval(obj4, chronology5);
        org.joda.time.MutableInterval mutableInterval7 = interval6.toMutableInterval();
        org.joda.time.Chronology chronology8 = mutableInterval7.getChronology();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 0, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate9.toDateTimeAtMidnight(dateTimeZone10);
        int int12 = dateTime11.getMinuteOfDay();
        int int13 = dateTime11.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime11.getZone();
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone14);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Interval interval19 = new org.joda.time.Interval(obj17, chronology18);
        org.joda.time.MutableInterval mutableInterval20 = interval19.toMutableInterval();
        org.joda.time.Chronology chronology21 = mutableInterval20.getChronology();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) (short) 0, chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.halfdayOfDay();
        org.joda.time.YearMonthDay yearMonthDay24 = yearMonthDay15.withChronologyRetainFields(chronology21);
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(5L, chronology21);
        org.joda.time.DurationField durationField26 = chronology21.seconds();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((long) ' ', 432000000L, chronology21);
        org.joda.time.DurationField durationField28 = chronology21.eras();
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(chronology21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField26 and durationField28", Math.signum(durationField26.compareTo(durationField28)) == -Math.signum(durationField28.compareTo(durationField26)));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTime dateTime7 = localDate6.toDateTimeAtStartOfDay();
        org.joda.time.DateTime.Property property8 = dateTime7.secondOfMinute();
        int int9 = property8.getMinimumValueOverall();
        org.joda.time.DateTime dateTime10 = property8.roundCeilingCopy();
        org.joda.time.DateTime dateTime12 = dateTime10.plus((long) 19);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime10.minus(readableDuration13);
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfWeek();
        org.joda.time.DateTime dateTime16 = property15.roundCeilingCopy();
        int int17 = dateTime16.getEra();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(66143405);
        org.joda.time.DateTime dateTime20 = dateTime16.toDateTime(dateTimeZone19);
        long long22 = dateTimeZone19.previousTransition(215999999L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime20", (dateTime7.compareTo(dateTime20) == 0) == dateTime7.equals(dateTime20));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(obj1, chronology2);
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Chronology chronology5 = mutableInterval4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 0, chronology5);
        org.joda.time.DateTime dateTime7 = localDate6.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate9 = localDate6.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval(obj10, chronology11);
        org.joda.time.MutableInterval mutableInterval13 = interval12.toMutableInterval();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Interval interval17 = new org.joda.time.Interval(obj15, chronology16);
        org.joda.time.MutableInterval mutableInterval18 = interval17.toMutableInterval();
        org.joda.time.Chronology chronology19 = mutableInterval18.getChronology();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 0, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.Interval interval23 = interval12.withStart((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime24 = localDate6.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Interval interval28 = new org.joda.time.Interval(obj26, chronology27);
        org.joda.time.MutableInterval mutableInterval29 = interval28.toMutableInterval();
        org.joda.time.Chronology chronology30 = mutableInterval29.getChronology();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 0, chronology30);
        org.joda.time.DateTime dateTime32 = localDate31.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate34 = localDate31.withWeekOfWeekyear((int) (short) 1);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Interval interval37 = new org.joda.time.Interval(obj35, chronology36);
        org.joda.time.MutableInterval mutableInterval38 = interval37.toMutableInterval();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Interval interval42 = new org.joda.time.Interval(obj40, chronology41);
        org.joda.time.MutableInterval mutableInterval43 = interval42.toMutableInterval();
        org.joda.time.Chronology chronology44 = mutableInterval43.getChronology();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) (short) 0, chronology44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = localDate45.toDateTimeAtMidnight(dateTimeZone46);
        org.joda.time.Interval interval48 = interval37.withStart((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime49 = localDate31.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        boolean boolean50 = localDate6.isEqual((org.joda.time.ReadablePartial) localDate31);
        int int51 = localDate31.getDayOfWeek();
        org.joda.time.LocalDate localDate53 = localDate31.plusYears(10);
        org.joda.time.LocalDate.Property property54 = localDate53.era();
        org.joda.time.LocalDate localDate55 = property54.getLocalDate();
        java.util.Locale locale56 = java.util.Locale.TAIWAN;
        java.util.Locale locale57 = java.util.Locale.CHINA;
        java.lang.String str58 = locale56.getDisplayCountry(locale57);
        java.lang.String str59 = property54.getAsText(locale57);
        boolean boolean60 = property54.isLeap();
        org.joda.time.LocalDate localDate61 = property54.getLocalDate();
        org.joda.time.LocalDate.Property property62 = localDate61.monthOfYear();
        org.joda.time.LocalDate.Property property63 = localDate61.yearOfCentury();
        org.joda.time.LocalDate localDate64 = property63.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate65 = property63.roundHalfFloorCopy();
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime();
        mutableDateTime66.addMonths(86399999);
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime(dateTimeZone69);
        mutableDateTime66.setZone(dateTimeZone69);
        java.util.GregorianCalendar gregorianCalendar72 = mutableDateTime66.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime66.year();
        int int74 = property63.compareTo((org.joda.time.ReadableInstant) mutableDateTime66);
        java.lang.Object obj77 = null;
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.Interval interval79 = new org.joda.time.Interval(obj77, chronology78);
        org.joda.time.MutableInterval mutableInterval80 = interval79.toMutableInterval();
        org.joda.time.Chronology chronology81 = mutableInterval80.getChronology();
        org.joda.time.LocalDate localDate82 = new org.joda.time.LocalDate((long) (short) 0, chronology81);
        org.joda.time.LocalDate localDate83 = new org.joda.time.LocalDate((long) (short) -1, chronology81);
        org.joda.time.DateTimeField dateTimeField84 = chronology81.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField85 = chronology81.weekyear();
        org.joda.time.DateTimeZone dateTimeZone88 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateMidnight dateMidnight89 = new org.joda.time.DateMidnight((long) 10, dateTimeZone88);
        java.lang.String str90 = dateTimeZone88.toString();
        int int92 = dateTimeZone88.getStandardOffset((long) 10);
        org.joda.time.DateTime dateTime93 = new org.joda.time.DateTime(dateTimeZone88);
        org.joda.time.Chronology chronology94 = chronology81.withZone(dateTimeZone88);
        org.joda.time.DateTimeField dateTimeField95 = chronology94.hourOfHalfday();
        mutableDateTime66.setRounding(dateTimeField95);
        mutableDateTime66.setWeekyear(1968);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime70 and dateTime93", (mutableDateTime70.compareTo(dateTime93) == 0) == mutableDateTime70.equals(dateTime93));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone6);
        org.joda.time.LocalTime localTime9 = localTime7.withMillisOfDay(15);
        org.joda.time.LocalTime localTime11 = localTime9.withHourOfDay(0);
        org.joda.time.LocalTime.Property property12 = localTime11.millisOfDay();
        org.joda.time.Period period13 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime4, (org.joda.time.ReadablePartial) localTime11);
        org.joda.time.Chronology chronology14 = localTime11.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.eras();
        org.joda.time.DurationField durationField16 = chronology14.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField16, and durationField15", !(durationField15.compareTo(durationField16) == 0) || (Math.signum(durationField15.compareTo(durationField15)) == Math.signum(durationField16.compareTo(durationField15))));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Interval interval4 = new org.joda.time.Interval(obj2, chronology3);
        org.joda.time.MutableInterval mutableInterval5 = interval4.toMutableInterval();
        org.joda.time.Chronology chronology6 = mutableInterval5.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 0, chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.halfdayOfDay();
        org.joda.time.DurationField durationField9 = chronology6.millis();
        org.joda.time.DurationField durationField10 = chronology6.eras();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(292279003L, chronology6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField10", Math.signum(durationField9.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField9)));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(70919999999L, (long) 1);
        org.joda.time.PeriodType periodType4 = mutablePeriod3.getPeriodType();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Interval interval9 = new org.joda.time.Interval(obj7, chronology8);
        org.joda.time.MutableInterval mutableInterval10 = interval9.toMutableInterval();
        org.joda.time.Chronology chronology11 = mutableInterval10.getChronology();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) 0, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTimeAtMidnight(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate12.toDateTimeAtStartOfDay(dateTimeZone15);
        org.joda.time.LocalDate.Property property17 = localDate12.year();
        org.joda.time.Chronology chronology18 = localDate12.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.halfdays();
        org.joda.time.Chronology chronology20 = chronology18.withUTC();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(120L, chronology18);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(164064614400000L, periodType4, chronology18);
        mutablePeriod22.clear();
        mutablePeriod22.addDays(26);
        org.joda.time.MutablePeriod mutablePeriod26 = mutablePeriod22.copy();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Interval interval34 = new org.joda.time.Interval(obj32, chronology33);
        org.joda.time.MutableInterval mutableInterval35 = interval34.toMutableInterval();
        org.joda.time.Chronology chronology36 = mutableInterval35.getChronology();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) (short) 0, chronology36);
        org.joda.time.DateTimeField dateTimeField38 = chronology36.halfdayOfDay();
        org.joda.time.DurationField durationField39 = chronology36.halfdays();
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) 13, chronology36);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) ' ', chronology36);
        org.joda.time.DateTimeField dateTimeField42 = chronology36.yearOfCentury();
        org.joda.time.DurationField durationField43 = chronology36.days();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(129600117L, chronology36);
        org.joda.time.DateTimeField dateTimeField45 = chronology36.weekyear();
        mutablePeriod22.add((-189388798561L), chronology36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField39", (durationField19.compareTo(durationField39) == 0) == durationField19.equals(durationField39));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(1771200075L);
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime();
        mutableDateTime2.addMonths(86399999);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        mutableDateTime2.setZone(dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.copy();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long12 = dateTimeZone10.previousTransition((long) 'x');
        mutableDateTime2.setZone(dateTimeZone10);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(readableInstant14, readableInstant15, periodType16);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.years();
        mutablePeriod17.set(durationFieldType18, 2);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Interval interval24 = new org.joda.time.Interval(obj22, chronology23);
        org.joda.time.MutableInterval mutableInterval25 = interval24.toMutableInterval();
        org.joda.time.Chronology chronology26 = mutableInterval25.getChronology();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) (short) 0, chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = localDate27.toDateTimeAtMidnight(dateTimeZone28);
        int int30 = dateTime29.getMinuteOfDay();
        org.joda.time.Interval interval31 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod17, (org.joda.time.ReadableInstant) dateTime29);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Interval interval35 = new org.joda.time.Interval(obj33, chronology34);
        org.joda.time.MutableInterval mutableInterval36 = interval35.toMutableInterval();
        org.joda.time.Chronology chronology37 = mutableInterval36.getChronology();
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) (short) 0, chronology37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = localDate38.toDateTimeAtMidnight(dateTimeZone39);
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Interval interval44 = new org.joda.time.Interval(obj42, chronology43);
        org.joda.time.MutableInterval mutableInterval45 = interval44.toMutableInterval();
        org.joda.time.Chronology chronology46 = mutableInterval45.getChronology();
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) (short) 0, chronology46);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTime dateTime49 = localDate47.toDateTimeAtMidnight(dateTimeZone48);
        java.lang.Object obj51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.Interval interval53 = new org.joda.time.Interval(obj51, chronology52);
        org.joda.time.MutableInterval mutableInterval54 = interval53.toMutableInterval();
        org.joda.time.Chronology chronology55 = mutableInterval54.getChronology();
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate((long) (short) 0, chronology55);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = localDate56.toDateTimeAtMidnight(dateTimeZone57);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = localDate56.toDateTimeAtStartOfDay(dateTimeZone59);
        org.joda.time.PeriodType periodType61 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType62 = periodType61.withSecondsRemoved();
        org.joda.time.Period period63 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate47, (org.joda.time.ReadablePartial) localDate56, periodType62);
        org.joda.time.DateTime dateTime64 = dateTime40.minus((org.joda.time.ReadablePeriod) period63);
        java.lang.Object obj66 = null;
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.Interval interval68 = new org.joda.time.Interval(obj66, chronology67);
        org.joda.time.MutableInterval mutableInterval69 = interval68.toMutableInterval();
        org.joda.time.Chronology chronology70 = mutableInterval69.getChronology();
        org.joda.time.LocalDate localDate71 = new org.joda.time.LocalDate((long) (short) 0, chronology70);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.DateTime dateTime73 = localDate71.toDateTimeAtMidnight(dateTimeZone72);
        int int74 = dateTime73.getMinuteOfDay();
        int int75 = dateTime73.getYearOfEra();
        mutablePeriod17.setPeriod((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = org.joda.time.DateTimeFieldType.weekyear();
        int int78 = dateTime73.get(dateTimeFieldType77);
        java.lang.String str79 = dateTimeFieldType77.toString();
        org.joda.time.MutableDateTime.Property property80 = mutableDateTime2.property(dateTimeFieldType77);
        int int81 = localTime1.indexOf(dateTimeFieldType77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime8", (mutableDateTime2.compareTo(mutableDateTime8) == 0) == mutableDateTime2.equals(mutableDateTime8));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.years();
        mutablePeriod3.set(durationFieldType4, 2);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Interval interval10 = new org.joda.time.Interval(obj8, chronology9);
        org.joda.time.MutableInterval mutableInterval11 = interval10.toMutableInterval();
        org.joda.time.Chronology chronology12 = mutableInterval11.getChronology();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 0, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtMidnight(dateTimeZone14);
        int int16 = dateTime15.getMinuteOfDay();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod3, (org.joda.time.ReadableInstant) dateTime15);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Interval interval21 = new org.joda.time.Interval(obj19, chronology20);
        org.joda.time.MutableInterval mutableInterval22 = interval21.toMutableInterval();
        org.joda.time.Chronology chronology23 = mutableInterval22.getChronology();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (short) 0, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localDate24.toDateTimeAtMidnight(dateTimeZone25);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Interval interval30 = new org.joda.time.Interval(obj28, chronology29);
        org.joda.time.MutableInterval mutableInterval31 = interval30.toMutableInterval();
        org.joda.time.Chronology chronology32 = mutableInterval31.getChronology();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) (short) 0, chronology32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localDate33.toDateTimeAtMidnight(dateTimeZone34);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Interval interval39 = new org.joda.time.Interval(obj37, chronology38);
        org.joda.time.MutableInterval mutableInterval40 = interval39.toMutableInterval();
        org.joda.time.Chronology chronology41 = mutableInterval40.getChronology();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) (short) 0, chronology41);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = localDate42.toDateTimeAtMidnight(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = localDate42.toDateTimeAtStartOfDay(dateTimeZone45);
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType48 = periodType47.withSecondsRemoved();
        org.joda.time.Period period49 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate33, (org.joda.time.ReadablePartial) localDate42, periodType48);
        org.joda.time.DateTime dateTime50 = dateTime26.minus((org.joda.time.ReadablePeriod) period49);
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Interval interval54 = new org.joda.time.Interval(obj52, chronology53);
        org.joda.time.MutableInterval mutableInterval55 = interval54.toMutableInterval();
        org.joda.time.Chronology chronology56 = mutableInterval55.getChronology();
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate((long) (short) 0, chronology56);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = localDate57.toDateTimeAtMidnight(dateTimeZone58);
        int int60 = dateTime59.getMinuteOfDay();
        int int61 = dateTime59.getYearOfEra();
        mutablePeriod3.setPeriod((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.LocalDate localDate63 = dateTime59.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetMillis(7);
        org.joda.time.DateTime dateTime66 = dateTime59.toDateTime(dateTimeZone65);
        org.joda.time.DateTime dateTime68 = dateTime66.withCenturyOfEra((int) (byte) 1);
        org.joda.time.DateTime.Property property69 = dateTime68.year();
        org.joda.time.DateTime dateTime70 = property69.withMaximumValue();
        org.joda.time.DateTime dateTime71 = property69.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime66", (dateTime15.compareTo(dateTime66) == 0) == dateTime15.equals(dateTime66));
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (byte) 100);
        int int2 = dateTime1.getYear();
        boolean boolean4 = dateTime1.isAfter(62164800075L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) 10, dateTimeZone7);
        java.lang.String str9 = dateTimeZone7.toString();
        int int11 = dateTimeZone7.getStandardOffset((long) 10);
        java.util.Locale locale13 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str14 = dateTimeZone7.getShortName(432000000L, locale13);
        long long17 = dateTimeZone7.adjustOffset((long) 120, false);
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(dateTimeZone7);
        org.joda.time.DateTime dateTime19 = dateTime1.toDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone21);
        org.joda.time.LocalTime localTime24 = localTime22.withMillisOfDay(15);
        org.joda.time.LocalTime.Property property25 = localTime22.hourOfDay();
        org.joda.time.LocalTime localTime27 = property25.addCopy(5);
        org.joda.time.LocalTime localTime29 = localTime27.minusMillis(50400000);
        org.joda.time.LocalTime localTime31 = localTime27.withMinuteOfHour(14);
        org.joda.time.LocalTime localTime33 = localTime27.minusMillis((-70919999));
        org.joda.time.LocalTime localTime35 = localTime27.minusMillis(20);
        org.joda.time.DateTime dateTime36 = dateTime19.withFields((org.joda.time.ReadablePartial) localTime35);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(70919999999L, (long) 1);
        org.joda.time.PeriodType periodType41 = mutablePeriod40.getPeriodType();
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Interval interval46 = new org.joda.time.Interval(obj44, chronology45);
        org.joda.time.MutableInterval mutableInterval47 = interval46.toMutableInterval();
        org.joda.time.Chronology chronology48 = mutableInterval47.getChronology();
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((long) (short) 0, chronology48);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = localDate49.toDateTimeAtMidnight(dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = localDate49.toDateTimeAtStartOfDay(dateTimeZone52);
        org.joda.time.LocalDate.Property property54 = localDate49.year();
        org.joda.time.Chronology chronology55 = localDate49.getChronology();
        org.joda.time.DurationField durationField56 = chronology55.halfdays();
        org.joda.time.Chronology chronology57 = chronology55.withUTC();
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(120L, chronology55);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod(164064614400000L, periodType41, chronology55);
        mutablePeriod59.clear();
        mutablePeriod59.addDays(26);
        org.joda.time.MutablePeriod mutablePeriod63 = mutablePeriod59.copy();
        java.lang.Object obj66 = null;
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.Interval interval68 = new org.joda.time.Interval(obj66, chronology67);
        org.joda.time.MutableInterval mutableInterval69 = interval68.toMutableInterval();
        org.joda.time.Chronology chronology70 = mutableInterval69.getChronology();
        org.joda.time.LocalDate localDate71 = new org.joda.time.LocalDate((long) (short) 0, chronology70);
        org.joda.time.DateTimeField dateTimeField72 = chronology70.halfdayOfDay();
        org.joda.time.DurationField durationField73 = chronology70.halfdays();
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime((long) 13, chronology70);
        java.lang.String str75 = mutableDateTime74.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime74.property(dateTimeFieldType76);
        org.joda.time.MutableDateTime mutableDateTime78 = property77.roundCeiling();
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime80 = mutableDateTime78.toMutableDateTime(dateTimeZone79);
        mutableDateTime78.setMillisOfSecond(25);
        org.joda.time.Duration duration83 = mutablePeriod59.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime78);
        org.joda.time.DateTime dateTime85 = dateTime36.withDurationAdded((org.joda.time.ReadableDuration) duration83, (-143));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime19", (dateTime1.compareTo(dateTime19) == 0) == dateTime1.equals(dateTime19));
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(15);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay(0);
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        org.joda.time.LocalTime localTime9 = property7.addWrapFieldToCopy(6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = localTime9.toDateTimeToday(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay13 = dateTime12.toTimeOfDay();
        org.joda.time.DateTime dateTime15 = dateTime12.minusDays(26288141);
        org.joda.time.DateTime.Property property16 = dateTime15.weekyear();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime();
        int int18 = mutableDateTime17.getSecondOfMinute();
        java.lang.Object obj19 = mutableDateTime17.clone();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone22);
        org.joda.time.LocalTime localTime25 = localTime23.withMillisOfDay(15);
        org.joda.time.LocalTime localTime27 = localTime25.withHourOfDay(0);
        org.joda.time.LocalTime.Property property28 = localTime27.millisOfDay();
        org.joda.time.LocalTime localTime29 = property28.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology30 = localTime29.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.seconds();
        org.joda.time.DurationField durationField32 = chronology30.halfdays();
        mutableDateTime17.setChronology(chronology30);
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight((java.lang.Object) dateTime15, chronology30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and mutableDateTime17", (mutableDateTime11.compareTo(mutableDateTime17) == 0) == mutableDateTime11.equals(mutableDateTime17));
    }
}

