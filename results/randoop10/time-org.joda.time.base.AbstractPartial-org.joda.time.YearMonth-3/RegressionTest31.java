import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest31 {

    public static boolean debug = false;

    @Test
    public void test15501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15501");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod9 = mutablePeriod8.copy();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.withChronologyRetainFields(chronology15);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = timeOfDay16.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay16.plusHours((-1));
        org.joda.time.Chronology chronology20 = timeOfDay19.getChronology();
        mutablePeriod8.setPeriod((long) (byte) 1, 845L, chronology20);
        mutablePeriod4.setPeriod((long) 4, chronology20);
        org.joda.time.Interval interval23 = new org.joda.time.Interval(994L, (long) 86399999, chronology20);
        org.joda.time.Duration duration24 = interval23.toDuration();
        long long25 = interval23.getStartMillis();
        org.joda.time.Period period26 = interval23.toPeriod();
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 994L + "'", long25 == 994L);
        org.junit.Assert.assertNotNull(period26);
    }

    @Test
    public void test15502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15502");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod5 = mutablePeriod4.copy();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.yearOfCentury();
        org.joda.time.Duration duration9 = mutablePeriod5.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight7);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableDuration10, (org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType14 = periodType13.withWeeksRemoved();
        org.joda.time.DurationFieldType durationFieldType16 = periodType14.getFieldType(0);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration9, (org.joda.time.ReadableInstant) mutableDateTime11, periodType14);
        org.joda.time.Period period18 = new org.joda.time.Period((long) 2027, (long) 23, periodType14);
        org.joda.time.Period period20 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period22 = period20.plusHours((int) '#');
        org.joda.time.Hours hours23 = period22.toStandardHours();
        org.joda.time.Period period24 = period22.toPeriod();
        java.lang.String str25 = period24.toString();
        org.joda.time.Hours hours26 = period24.toStandardHours();
        org.joda.time.Period period27 = period18.withFields((org.joda.time.ReadablePeriod) hours26);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone30);
        org.joda.time.DateTime dateTime32 = dateTime31.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime32.toMutableDateTime();
        org.joda.time.DateTime dateTime35 = dateTime32.withYear((int) (short) -1);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.TimeOfDay timeOfDay38 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology37);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay38.withChronologyRetainFields(chronology39);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray41 = timeOfDay40.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay40.plusHours((-1));
        org.joda.time.Chronology chronology44 = timeOfDay43.getChronology();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.TimeOfDay timeOfDay47 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology46);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.TimeOfDay timeOfDay49 = timeOfDay47.withChronologyRetainFields(chronology48);
        long long51 = chronology44.set((org.joda.time.ReadablePartial) timeOfDay47, (long) (byte) -1);
        org.joda.time.DateTimeField dateTimeField52 = chronology44.millisOfSecond();
        org.joda.time.DurationField durationField53 = chronology44.years();
        org.joda.time.DateTime dateTime54 = dateTime32.withChronology(chronology44);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.TimeOfDay timeOfDay57 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology56);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.TimeOfDay timeOfDay59 = timeOfDay57.withChronologyRetainFields(chronology58);
        org.joda.time.DateTime dateTime60 = timeOfDay59.toDateTimeToday();
        org.joda.time.DateTime dateTime62 = dateTime60.plusYears((int) 'u');
        org.joda.time.DateTime dateTime64 = dateTime60.minusHours(2027);
        int int65 = dateTime54.compareTo((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.Duration duration66 = period27.toDurationTo((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.DateMidnight dateMidnight67 = dateTime54.toDateMidnight();
        org.joda.time.ReadableDuration readableDuration68 = null;
        org.joda.time.DateTime dateTime70 = dateTime54.withDurationAdded(readableDuration68, 2021);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PT35H0.052S" + "'", str25, "PT35H0.052S");
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray41);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertNotNull(timeOfDay49);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-86399999L) + "'", long51 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(timeOfDay57);
        org.junit.Assert.assertNotNull(timeOfDay59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(dateMidnight67);
        org.junit.Assert.assertNotNull(dateTime70);
    }

    @Test
    public void test15503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15503");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType4 = periodType3.withWeeksRemoved();
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight1, readableDuration2, periodType3);
        org.joda.time.Period period7 = period5.withSeconds(0);
        org.joda.time.Period period9 = period7.plusMinutes((int) (byte) 1);
        org.joda.time.Period period11 = period7.withSeconds((int) (byte) 10);
        org.joda.time.Period period12 = period7.toPeriod();
        int int13 = period7.getHours();
        org.joda.time.MutablePeriod mutablePeriod14 = period7.toMutablePeriod();
        mutablePeriod14.setDays((int) (short) -1);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod14);
    }

    @Test
    public void test15504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15504");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime3 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval4 = yearMonthDay0.toInterval();
        org.joda.time.Chronology chronology5 = interval4.getChronology();
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay6.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval10 = yearMonthDay6.toInterval();
        org.joda.time.Period period11 = interval10.toPeriod();
        org.joda.time.Chronology chronology12 = interval10.getChronology();
        boolean boolean13 = interval4.isAfter((org.joda.time.ReadableInterval) interval10);
        org.joda.time.Duration duration14 = interval4.toDuration();
        org.joda.time.Period period15 = interval4.toPeriod();
        org.joda.time.format.PeriodFormatter periodFormatter16 = null;
        java.lang.String str17 = period15.toString(periodFormatter16);
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "P1D" + "'", str17, "P1D");
    }

    @Test
    public void test15505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15505");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        int int3 = localDate2.getYearOfCentury();
        org.joda.time.LocalDate.Property property4 = localDate2.centuryOfEra();
        org.joda.time.LocalDate localDate5 = property4.roundFloorCopy();
        org.joda.time.LocalDate localDate6 = property4.roundCeilingCopy();
        org.joda.time.LocalDate.Property property7 = localDate6.era();
        org.joda.time.LocalDate localDate9 = localDate6.plusDays(53);
        int int10 = localDate9.getMonthOfYear();
        org.joda.time.LocalDate localDate12 = localDate9.withWeekyear(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69 + "'", int3 == 69);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test15506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15506");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        int int3 = localDate2.getYearOfCentury();
        org.joda.time.LocalDate.Property property4 = localDate2.centuryOfEra();
        org.joda.time.LocalDate localDate5 = property4.roundFloorCopy();
        org.joda.time.LocalDate localDate6 = property4.roundCeilingCopy();
        org.joda.time.LocalDate localDate8 = localDate6.minusWeeks(1975);
        org.joda.time.DateTime dateTime9 = localDate6.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property10 = localDate6.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay11.minusMonths((int) (byte) 10);
        org.joda.time.YearMonthDay.Property property14 = yearMonthDay11.year();
        org.joda.time.YearMonthDay yearMonthDay16 = property14.addToCopy(0);
        org.joda.time.YearMonthDay yearMonthDay18 = property14.setCopy((int) 'u');
        java.lang.String str19 = property14.getAsShortText();
        java.lang.String str20 = property14.getName();
        org.joda.time.YearMonthDay yearMonthDay21 = property14.withMaximumValue();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (short) -1, chronology23);
        int int25 = localDate24.getYearOfCentury();
        org.joda.time.LocalDate.Property property26 = localDate24.centuryOfEra();
        org.joda.time.LocalDate localDate28 = property26.addWrapFieldToCopy(9);
        org.joda.time.LocalDate localDate30 = property26.addWrapFieldToCopy(17);
        org.joda.time.LocalDate localDate31 = property26.withMaximumValue();
        org.joda.time.LocalDate localDate32 = property26.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        long long38 = dateTimeZone34.convertLocalToUTC((-1L), false, 10L);
        int int40 = dateTimeZone34.getOffset(0L);
        org.joda.time.DateTime dateTime41 = localDate32.toDateTimeAtStartOfDay(dateTimeZone34);
        org.joda.time.Interval interval42 = yearMonthDay21.toInterval(dateTimeZone34);
        org.joda.time.YearMonthDay yearMonthDay44 = yearMonthDay21.minusDays((int) (byte) -1);
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate6, (org.joda.time.ReadablePartial) yearMonthDay21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69 + "'", int3 == 69);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2022" + "'", str19, "2022");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "year" + "'", str20, "year");
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 69 + "'", int25 == 69);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(yearMonthDay44);
    }

    @Test
    public void test15507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15507");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.era();
        java.lang.String str3 = dateMidnight1.toString();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight1.minusDays(17);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusMonths((int) (byte) 100);
        org.joda.time.DateTime dateTime8 = dateMidnight7.toDateTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2022-02-21T00:00:00.000Z" + "'", str3, "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test15508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15508");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withYear((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.minusWeeks(366);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withSecondOfMinute(1722);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1722 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test15509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15509");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setTimeInMillis(845L);
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.util.Locale locale6 = locale5.stripExtensions();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int10 = dateTimeZone8.getOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(dateTimeZone8);
        java.util.Locale locale13 = java.util.Locale.PRC;
        java.lang.String str14 = locale13.getDisplayScript();
        java.lang.String str15 = dateTimeZone8.getName(845L, locale13);
        java.lang.String str16 = locale13.getLanguage();
        java.lang.String str17 = locale6.getDisplayName(locale13);
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(locale6);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.monthOfYear();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(chronology21);
        org.joda.time.DateMidnight.Property property23 = dateMidnight22.yearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime19, (org.joda.time.ReadableInstant) dateMidnight22);
        int int25 = dateMidnight22.getMinuteOfHour();
        org.joda.time.Instant instant26 = dateMidnight22.toInstant();
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property30 = localTime29.millisOfDay();
        org.joda.time.LocalTime localTime32 = property30.addNoWrapToCopy(11);
        java.util.Locale locale33 = java.util.Locale.PRC;
        java.lang.String str34 = locale33.getDisplayScript();
        java.lang.String str35 = property30.getAsShortText(locale33);
        boolean boolean36 = locale33.hasExtensions();
        java.lang.String str37 = locale33.getISO3Country();
        java.lang.String str38 = dateMidnight22.toString("14:51:49.030", locale33);
        java.lang.String str39 = locale6.getDisplayName(locale33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = calendar0.getDisplayName(172, (-31), locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=845,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=845,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh" + "'", str16, "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str17, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(calendar18);
// flaky:         org.junit.Assert.assertEquals(calendar18.toString(), "java.util.GregorianCalendar[time=1645455428366,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=8,MILLISECOND=366,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1" + "'", str35, "1");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "CHN" + "'", str37, "CHN");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "14:51:49.030" + "'", str38, "14:51:49.030");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str39, "\u4e2d\u6587\u4e2d\u56fd)");
    }

    @Test
    public void test15510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15510");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime3 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime5 = property2.addWrapFieldToCopy(58);
        org.joda.time.LocalTime localTime6 = property2.roundFloorCopy();
        org.joda.time.Period period9 = new org.joda.time.Period(99L, (long) 19);
        org.joda.time.LocalTime localTime10 = localTime6.minus((org.joda.time.ReadablePeriod) period9);
        int int11 = localTime6.getSecondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test15511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15511");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.dayOfYear();
        org.joda.time.DateMidnight dateMidnight3 = property2.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight.Property property5 = dateMidnight3.property(dateTimeFieldType4);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDurationAdded((long) 10, 5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone11);
        org.joda.time.DateTime dateTime13 = dateTime12.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.year();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime18 = property15.add(799L);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone21);
        org.joda.time.DateTime dateTime23 = dateTime22.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime23.toMutableDateTime();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay27.withChronologyRetainFields(chronology28);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray30 = timeOfDay29.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay29.plusHours((-1));
        org.joda.time.Chronology chronology33 = timeOfDay32.getChronology();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.TimeOfDay timeOfDay36 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay36.withChronologyRetainFields(chronology37);
        long long40 = chronology33.set((org.joda.time.ReadablePartial) timeOfDay36, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay41 = new org.joda.time.TimeOfDay(chronology33);
        org.joda.time.DateTime dateTime42 = dateTime23.toDateTime(chronology33);
        org.joda.time.DateTimeField dateTimeField43 = chronology33.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = dateTimeField43.getType();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime18.property(dateTimeFieldType44);
        org.joda.time.DateMidnight.Property property46 = dateMidnight3.property(dateTimeFieldType44);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight3.withDayOfYear(310);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) 1967);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight(chronology51);
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.PeriodType periodType54 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType55 = periodType54.withWeeksRemoved();
        org.joda.time.Period period56 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight52, readableDuration53, periodType54);
        org.joda.time.Period period58 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period60 = period58.plusHours((int) '#');
        org.joda.time.Period period61 = period56.minus((org.joda.time.ReadablePeriod) period58);
        org.joda.time.Period period62 = period56.toPeriod();
        int int63 = period56.size();
        org.joda.time.format.PeriodFormatter periodFormatter64 = null;
        java.lang.String str65 = period56.toString(periodFormatter64);
        mutableDateTime50.add((org.joda.time.ReadablePeriod) period56, (-325));
        org.joda.time.PeriodType periodType68 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType69 = null;
        boolean boolean70 = periodType68.isSupported(durationFieldType69);
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod(periodType68);
        java.lang.String str72 = periodType68.toString();
        org.joda.time.PeriodType periodType73 = periodType68.withDaysRemoved();
        org.joda.time.Period period74 = period56.withPeriodType(periodType73);
        org.joda.time.Period period76 = period56.minusDays(86399999);
        org.joda.time.Duration duration77 = period76.toStandardDuration();
        org.joda.time.DateMidnight dateMidnight78 = dateMidnight3.minus((org.joda.time.ReadableDuration) duration77);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-86399999L) + "'", long40 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateMidnight48);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 7 + "'", int63 == 7);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "PT0S" + "'", str65, "PT0S");
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "PeriodType[YearMonthDayTime]" + "'", str72, "PeriodType[YearMonthDayTime]");
        org.junit.Assert.assertNotNull(periodType73);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(duration77);
        org.junit.Assert.assertNotNull(dateMidnight78);
    }

    @Test
    public void test15512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15512");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = timeOfDay4.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.plusHours((-1));
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.weekyearOfCentury();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property13 = localTime12.millisOfDay();
        org.joda.time.LocalTime localTime15 = property13.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime16 = property13.roundHalfFloorCopy();
        org.joda.time.LocalTime.Property property17 = localTime16.minuteOfHour();
        org.joda.time.LocalTime localTime18 = property17.roundFloorCopy();
        org.joda.time.LocalTime localTime19 = property17.roundCeilingCopy();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.TimeOfDay timeOfDay22 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay22.withChronologyRetainFields(chronology23);
        org.joda.time.DateTime dateTime25 = timeOfDay24.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay24.minusHours((int) (byte) 1);
        java.util.Locale locale29 = java.util.Locale.getDefault();
        java.lang.String str30 = timeOfDay24.toString("1", locale29);
        int int31 = localTime19.compareTo((org.joda.time.ReadablePartial) timeOfDay24);
        org.joda.time.Period period33 = org.joda.time.Period.hours((int) (byte) 10);
        int[] intArray34 = period33.getValues();
        org.joda.time.TimeOfDay timeOfDay36 = timeOfDay24.withPeriodAdded((org.joda.time.ReadablePeriod) period33, 2022);
        int int37 = period33.getMinutes();
        long long40 = chronology8.add((org.joda.time.ReadablePeriod) period33, (long) 272, 818);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((java.lang.Object) 272);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(locale29);
// flaky:         org.junit.Assert.assertEquals(locale29.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1" + "'", str30, "1");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 0, 0, 0, 10, 0, 0, 0]");
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 29448000272L + "'", long40 == 29448000272L);
    }

    @Test
    public void test15513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15513");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfCeilingCopy();
        int int5 = localDateTime4.getYearOfCentury();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray6 = localDateTime4.getFieldTypes();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray6);
    }

    @Test
    public void test15514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15514");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 58);
        org.joda.time.MutablePeriod mutablePeriod2 = mutablePeriod1.copy();
        mutablePeriod1.setWeeks(310);
        mutablePeriod1.addMonths(184);
        int int7 = mutablePeriod1.getYears();
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test15515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15515");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.plusDays(2022);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay3.withMonthOfYear(4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int7 = yearMonthDay3.get(dateTimeFieldType6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay3.toDateTimeAtMidnight(dateTimeZone8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.year();
        int int11 = dateTime9.get(dateTimeFieldType10);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime9.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime();
        int int14 = mutableDateTime13.getDayOfMonth();
        org.joda.time.Instant instant15 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTime();
        org.joda.time.Instant instant17 = instant15.toInstant();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime();
        int int19 = mutableDateTime18.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone22);
        org.joda.time.DateTime dateTime24 = dateTime23.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType26 = periodType25.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime18, (org.joda.time.ReadableInstant) dateTime23, periodType26);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod31 = mutablePeriod30.copy();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(chronology32);
        org.joda.time.DateMidnight.Property property34 = dateMidnight33.yearOfCentury();
        org.joda.time.Duration duration35 = mutablePeriod31.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight33);
        mutablePeriod27.setPeriod((org.joda.time.ReadableDuration) duration35);
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant17, (org.joda.time.ReadableDuration) duration35);
        org.joda.time.Interval interval38 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableDuration) duration35);
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration35);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime40.monthOfYear();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight(chronology42);
        org.joda.time.DateMidnight.Property property44 = dateMidnight43.yearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime40, (org.joda.time.ReadableInstant) dateMidnight43);
        int int46 = mutableDateTime40.getEra();
        org.joda.time.DateTimeZone dateTimeZone47 = mutableDateTime40.getZone();
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay50 = yearMonthDay48.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime51 = yearMonthDay48.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval52 = yearMonthDay48.toInterval();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod56 = mutablePeriod55.copy();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateMidnight dateMidnight58 = new org.joda.time.DateMidnight(chronology57);
        org.joda.time.DateMidnight.Property property59 = dateMidnight58.yearOfCentury();
        org.joda.time.Duration duration60 = mutablePeriod56.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight58);
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod64 = mutablePeriod63.copy();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateMidnight dateMidnight66 = new org.joda.time.DateMidnight(chronology65);
        org.joda.time.DateMidnight.Property property67 = dateMidnight66.yearOfCentury();
        org.joda.time.Duration duration68 = mutablePeriod64.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight66);
        boolean boolean69 = duration60.isEqual((org.joda.time.ReadableDuration) duration68);
        org.joda.time.Interval interval70 = interval52.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration68);
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime40, (org.joda.time.ReadableDuration) duration68);
        boolean boolean72 = duration35.isShorterThan((org.joda.time.ReadableDuration) duration68);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2027 + "'", int11 == 2027);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 21 + "'", int14 == 21);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 21 + "'", int19 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(mutablePeriod31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(yearMonthDay50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(mutablePeriod56);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertNotNull(mutablePeriod64);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(interval70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test15516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15516");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.minuteOfHour();
        int int4 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.minusSeconds(8);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusDays(698);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test15517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15517");
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod7 = mutablePeriod6.copy();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(chronology8);
        org.joda.time.DateMidnight.Property property10 = dateMidnight9.yearOfCentury();
        org.joda.time.Duration duration11 = mutablePeriod7.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight9);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(readableDuration12, (org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType16 = periodType15.withWeeksRemoved();
        org.joda.time.DurationFieldType durationFieldType18 = periodType16.getFieldType(0);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration11, (org.joda.time.ReadableInstant) mutableDateTime13, periodType16);
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.parse("22");
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate25 = localDate23.plusWeeks(9);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int27 = localDate23.get(dateTimeFieldType26);
        org.joda.time.DateTime dateTime28 = dateTime21.withFields((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.minutes();
        org.joda.time.DurationFieldType durationFieldType30 = null;
        int int31 = periodType29.indexOf(durationFieldType30);
        org.joda.time.Period period32 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime13, (org.joda.time.ReadableInstant) dateTime21, periodType29);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) (-6), 429L, periodType29);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(10098345600205L, 694364148613L, periodType29);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test15518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15518");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(dateTimeZone1);
        org.joda.time.YearMonth yearMonth4 = yearMonth2.minusMonths((int) (byte) 100);
        org.joda.time.YearMonth.Property property5 = yearMonth2.monthOfYear();
        int int6 = yearMonth2.getYear();
        org.joda.time.YearMonth.Property property7 = yearMonth2.monthOfYear();
        int int8 = property7.get();
        int int9 = property7.get();
        org.joda.time.YearMonth yearMonth11 = property7.addToCopy(12);
        java.lang.String str12 = property7.toString();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property16 = localTime15.millisOfDay();
        org.joda.time.LocalTime localTime17 = property16.withMaximumValue();
        int int18 = property16.getMaximumValue();
        org.joda.time.LocalTime localTime19 = property16.roundHalfFloorCopy();
        org.joda.time.LocalTime.Property property20 = localTime19.millisOfSecond();
        java.util.Locale.Category category21 = java.util.Locale.Category.FORMAT;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property24 = localTime23.millisOfDay();
        org.joda.time.LocalTime localTime26 = property24.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime27 = property24.roundHalfFloorCopy();
        org.joda.time.LocalTime.Property property28 = localTime27.minuteOfHour();
        org.joda.time.LocalTime localTime29 = property28.roundFloorCopy();
        org.joda.time.LocalTime localTime31 = property28.addCopy((int) '#');
        java.util.Locale locale33 = java.util.Locale.TAIWAN;
        java.lang.String str34 = localTime31.toString("1970", locale33);
        java.util.Locale.setDefault(category21, locale33);
        java.util.Locale locale36 = java.util.Locale.getDefault(category21);
        java.util.Set<java.lang.Character> charSet37 = locale36.getExtensionKeys();
        int int38 = property20.getMaximumTextLength(locale36);
        java.lang.String str39 = locale36.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth40 = property7.setCopy("T00:00:36.860", locale36);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"T00:00:36.860\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(yearMonth4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[monthOfYear]" + "'", str12, "Property[monthOfYear]");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86399999 + "'", int18 == 86399999);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + category21 + "' != '" + java.util.Locale.Category.FORMAT + "'", category21.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970" + "'", str34, "1970");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "chinois (Taiwan)" + "'", str39, "chinois (Taiwan)");
    }

    @Test
    public void test15519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15519");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.year();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.addWrapField(6);
        org.joda.time.MutableDateTime mutableDateTime9 = property6.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property6.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime11 = property6.roundFloor();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.weekOfWeekyear();
        org.joda.time.Period period14 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period16 = period14.minusHours((int) '4');
        org.joda.time.Period period18 = period14.minusYears(10);
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime11, (org.joda.time.ReadablePeriod) period14);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime();
        int int21 = mutableDateTime20.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone24);
        org.joda.time.DateTime dateTime26 = dateTime25.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType28 = periodType27.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime20, (org.joda.time.ReadableInstant) dateTime25, periodType28);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod33 = mutablePeriod32.copy();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(chronology34);
        org.joda.time.DateMidnight.Property property36 = dateMidnight35.yearOfCentury();
        org.joda.time.Duration duration37 = mutablePeriod33.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight35);
        mutablePeriod29.setPeriod((org.joda.time.ReadableDuration) duration37);
        long long39 = duration37.getMillis();
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Interval interval41 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration37, readableInstant40);
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay44 = yearMonthDay42.plusDays(2022);
        org.joda.time.YearMonthDay yearMonthDay46 = yearMonthDay44.withMonthOfYear(4);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int48 = yearMonthDay44.get(dateTimeFieldType47);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = yearMonthDay44.toDateTimeAtMidnight(dateTimeZone49);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.year();
        int int52 = dateTime50.get(dateTimeFieldType51);
        org.joda.time.MutableDateTime mutableDateTime53 = dateTime50.toMutableDateTimeISO();
        org.joda.time.PeriodType periodType54 = org.joda.time.PeriodType.standard();
        java.lang.String str55 = periodType54.toString();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) dateTime50, periodType54);
        org.joda.time.DateTime dateTime57 = dateTime50.withTimeAtStartOfDay();
        org.joda.time.Instant instant58 = new org.joda.time.Instant((java.lang.Object) dateTime50);
        org.joda.time.Duration duration59 = period14.toDurationTo((org.joda.time.ReadableInstant) dateTime50);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 21 + "'", int21 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(mutablePeriod33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 99L + "'", long39 == 99L);
        org.junit.Assert.assertNotNull(yearMonthDay44);
        org.junit.Assert.assertNotNull(yearMonthDay46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 5 + "'", int48 == 5);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2027 + "'", int52 == 2027);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "PeriodType[Standard]" + "'", str55, "PeriodType[Standard]");
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(duration59);
    }

    @Test
    public void test15520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15520");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone7);
        org.joda.time.DateTime dateTime9 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime9.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.year();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.addWrapField(6);
        org.joda.time.MutableDateTime mutableDateTime14 = property11.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime15 = property11.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime17 = property11.add(0L);
        org.joda.time.DateTime dateTime18 = mutableDateTime17.toDateTime();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime17.era();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.yearOfCentury();
        int int21 = mutableDateTime17.getMinuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = dateTimeFormatter2.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime17, "21 Feb 2022 14:47:50 GMT", 9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test15521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15521");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        int int3 = localDate2.getYearOfCentury();
        org.joda.time.LocalDate.Property property4 = localDate2.centuryOfEra();
        org.joda.time.LocalDate localDate5 = property4.roundFloorCopy();
        org.joda.time.LocalDate localDate6 = property4.roundCeilingCopy();
        org.joda.time.LocalDate localDate8 = localDate6.minusWeeks(1975);
        org.joda.time.DateTime dateTime9 = localDate6.toDateTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime9.secondOfMinute();
        org.joda.time.DateTime dateTime12 = dateTime9.withYearOfEra(857);
        org.joda.time.PeriodType periodType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) dateTime12, periodType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69 + "'", int3 == 69);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test15522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15522");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int3 = dateTimeZone1.getOffset(0L);
        int int5 = dateTimeZone1.getOffset(0L);
        boolean boolean6 = dateTimeZone1.isFixed();
        java.lang.String str8 = dateTimeZone1.getName((-35643L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
    }

    @Test
    public void test15523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15523");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(1);
        org.joda.time.LocalDate.Property property5 = localDate2.year();
        int int6 = localDate2.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate2.isSupported(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = localDate2.toDateTimeAtMidnight();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(chronology10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType14 = periodType13.withWeeksRemoved();
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight11, readableDuration12, periodType13);
        org.joda.time.Period period17 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period19 = period17.plusHours((int) '#');
        org.joda.time.Period period20 = period15.minus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Period period21 = period15.toPeriod();
        org.joda.time.Period period22 = period15.normalizedStandard();
        org.joda.time.Period period24 = period22.minusSeconds(21);
        org.joda.time.LocalDate localDate26 = localDate2.withPeriodAdded((org.joda.time.ReadablePeriod) period24, 365);
        org.joda.time.LocalDate.Property property27 = localDate2.dayOfWeek();
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int32 = dateTimeZone30.getOffset(0L);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone30);
        org.joda.time.DateTime.Property property34 = dateTime33.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean37 = dateTimeZone36.isFixed();
        org.joda.time.DateTime dateTime38 = dateTime33.toDateTime(dateTimeZone36);
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant28, (org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.LocalDate localDate40 = localDate2.plus((org.joda.time.ReadablePeriod) period39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((java.lang.Object) localDate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1969 + "'", int6 == 1969);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(localDate40);
    }

    @Test
    public void test15524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15524");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.adjustOffset((long) ' ', true);
        java.lang.Object obj4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(obj4, dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.secondOfMinute();
        long long8 = property7.remainder();
        org.joda.time.LocalDateTime localDateTime9 = property7.getLocalDateTime();
        boolean boolean11 = property7.equals((java.lang.Object) 1.0f);
        org.joda.time.LocalDateTime localDateTime13 = property7.setCopy((int) (short) 1);
        boolean boolean14 = dateTimeZone0.isLocalDateTimeGap(localDateTime13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusWeeks(1900);
        java.lang.Object obj17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(obj17, dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.minus((org.joda.time.ReadablePeriod) mutablePeriod24);
        boolean boolean27 = localDateTime25.equals((java.lang.Object) 14);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.plusDays(10);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime25.withFieldAdded(durationFieldType30, (int) (short) -1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusMillis(999);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean36 = localDateTime34.isSupported(dateTimeFieldType35);
        int int37 = localDateTime16.get(dateTimeFieldType35);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime16.plusSeconds((int) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 703L + "'", long8 == 703L);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(localDateTime39);
    }

    @Test
    public void test15525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15525");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.util.Locale locale2 = java.util.Locale.ITALY;
        java.lang.String str3 = locale2.getDisplayCountry();
        java.lang.String str4 = locale2.getDisplayLanguage();
        java.lang.String str7 = nameProvider0.getName(locale2, "und", "1970-01");
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.withChronologyRetainFields(chronology11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = timeOfDay12.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay12.plusHours((-1));
        org.joda.time.TimeOfDay.Property property16 = timeOfDay12.millisOfSecond();
        org.joda.time.DurationField durationField17 = property16.getDurationField();
        java.lang.String str18 = property16.getAsShortText();
        int int19 = property16.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone22);
        org.joda.time.DateTime dateTime24 = dateTime23.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime24.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.year();
        org.joda.time.DateTimeField dateTimeField27 = property26.getField();
        long long30 = dateTimeField27.add((long) 21, (long) ' ');
        org.joda.time.DurationField durationField31 = dateTimeField27.getRangeDurationField();
        java.util.Locale locale33 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.Character> charSet34 = locale33.getExtensionKeys();
        java.lang.String str35 = dateTimeField27.getAsText(21, locale33);
        int int36 = property16.getMaximumShortTextLength(locale33);
        java.util.Locale locale37 = locale33.stripExtensions();
        java.lang.String str40 = nameProvider0.getShortName(locale33, "PT0.035S", "ISOChronology[UTC]");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Italie" + "'", str3, "Italie");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "italien" + "'", str4, "italien");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1" + "'", str18, "1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 999 + "'", int19 == 999);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1009843200021L + "'", long30 == 1009843200021L);
        org.junit.Assert.assertNull(durationField31);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(charSet34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "21" + "'", str35, "21");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "fr_FR");
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test15526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15526");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime3.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime7 = dateTime5.plusSeconds((int) (short) 10);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillisOfDay(120);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(821L);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.plus(41L);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight.Property property16 = dateMidnight15.dayOfYear();
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight15.withDurationAdded((long) 17, 1);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight15.withEra((int) (byte) 0);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight15.withWeekyear(2022);
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight11, (org.joda.time.ReadableInstant) dateMidnight23);
        int int25 = dateMidnight11.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight11.minus((-86399999L));
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.standard();
        java.lang.String str33 = periodType32.getName();
        org.joda.time.PeriodType periodType34 = periodType32.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(periodType34);
        org.joda.time.Period period36 = new org.joda.time.Period((long) (short) 1, (long) 69, periodType34);
        org.joda.time.Period period37 = new org.joda.time.Period((-1480331900000L), 1645487999901L, periodType34);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight11.plus((org.joda.time.ReadablePeriod) period37);
        org.joda.time.Period period39 = period37.negated();
        org.joda.time.DateTime dateTime40 = dateTime7.minus((org.joda.time.ReadablePeriod) period37);
        org.joda.time.DateTime dateTime42 = dateTime7.minusMonths(53770002);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Standard" + "'", str33, "Standard");
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
    }

    @Test
    public void test15527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15527");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(838, 141, 2940100, 625);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 838 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15528");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.YearMonthDay yearMonthDay4 = yearMonthDay2.plusYears(4);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = yearMonthDay4.getFieldTypes();
        int[] intArray6 = yearMonthDay4.getValues();
        org.joda.time.DateMidnight dateMidnight7 = yearMonthDay4.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.withYearOfEra(2);
        int int10 = dateMidnight7.getSecondOfDay();
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[2025, 4, 21]");
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test15529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15529");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        int int6 = localDateTime2.getValue(2);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone9);
        int int11 = dateTime10.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = dateTime10.toDateTime(dateTimeZone13);
        org.joda.time.DateTime.Property property16 = dateTime10.weekyear();
        org.joda.time.DateTime dateTime17 = property16.roundHalfEvenCopy();
        boolean boolean18 = localDateTime2.equals((java.lang.Object) property16);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime2.withMillisOfDay(272);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime2.minusWeeks(12);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime2.plusYears(28);
        org.joda.time.ReadablePartial readablePartial25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withFields(readablePartial25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime24.year();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
    }

    @Test
    public void test15530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15530");
        java.io.IOException iOException3 = new java.io.IOException();
        java.io.IOException iOException4 = new java.io.IOException("1970", (java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException("\u4e8c\u6708", (java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException();
        iOException5.addSuppressed((java.lang.Throwable) iOException6);
        java.io.IOException iOException8 = new java.io.IOException("P-20D", (java.lang.Throwable) iOException6);
        java.lang.Throwable[] throwableArray9 = iOException6.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test15531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15531");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.secondOfMinute();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusSeconds(11);
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundFloorCopy();
        int int10 = localDateTime9.getMinuteOfHour();
        java.util.Date date11 = localDateTime9.toDate();
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 800L + "'", long4 == 800L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 57 + "'", int10 == 57);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Feb 21 14:57:00 UTC 2022");
    }

    @Test
    public void test15532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15532");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(1999, 794, 2005, 5, 53683789, (-55), 86399999, 52);
    }

    @Test
    public void test15533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15533");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        org.joda.time.MutableDateTime mutableDateTime3 = instant2.toMutableDateTime();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.minusYears((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime4.toMutableDateTime();
        mutableDateTime7.setMillisOfSecond(2);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) instant2, (org.joda.time.ReadableInstant) mutableDateTime7);
        org.joda.time.Instant instant12 = instant2.withMillis(1645454860172L);
        org.joda.time.DateTime dateTime13 = instant2.toDateTimeISO();
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay16 = yearMonthDay14.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval18 = yearMonthDay14.toInterval();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime();
        int int20 = mutableDateTime19.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone23);
        org.joda.time.DateTime dateTime25 = dateTime24.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType27 = periodType26.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime19, (org.joda.time.ReadableInstant) dateTime24, periodType27);
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod32 = mutablePeriod31.copy();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(chronology33);
        org.joda.time.DateMidnight.Property property35 = dateMidnight34.yearOfCentury();
        org.joda.time.Duration duration36 = mutablePeriod32.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight34);
        mutablePeriod28.setPeriod((org.joda.time.ReadableDuration) duration36);
        org.joda.time.Interval interval38 = interval18.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration36);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime();
        org.joda.time.Instant instant40 = dateTime39.toInstant();
        org.joda.time.Instant instant42 = instant40.plus(41L);
        org.joda.time.MutableDateTime mutableDateTime43 = instant42.toMutableDateTime();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod47 = mutablePeriod46.copy();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight(chronology48);
        org.joda.time.DateMidnight.Property property50 = dateMidnight49.yearOfCentury();
        org.joda.time.Duration duration51 = mutablePeriod47.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight49);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod55 = mutablePeriod54.copy();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateMidnight dateMidnight57 = new org.joda.time.DateMidnight(chronology56);
        org.joda.time.DateMidnight.Property property58 = dateMidnight57.yearOfCentury();
        org.joda.time.Duration duration59 = mutablePeriod55.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight57);
        boolean boolean60 = duration51.isEqual((org.joda.time.ReadableDuration) duration59);
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod64 = mutablePeriod63.copy();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateMidnight dateMidnight66 = new org.joda.time.DateMidnight(chronology65);
        org.joda.time.DateMidnight.Property property67 = dateMidnight66.yearOfCentury();
        org.joda.time.Duration duration68 = mutablePeriod64.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight66);
        boolean boolean69 = duration59.isShorterThan((org.joda.time.ReadableDuration) duration68);
        org.joda.time.PeriodType periodType70 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType71 = null;
        boolean boolean72 = periodType70.isSupported(durationFieldType71);
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod(periodType70);
        java.lang.String str74 = periodType70.toString();
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime43, (org.joda.time.ReadableDuration) duration59, periodType70);
        int int76 = duration36.compareTo((org.joda.time.ReadableDuration) duration59);
        org.joda.time.Duration duration77 = duration36.toDuration();
        org.joda.time.Instant instant78 = instant2.minus((org.joda.time.ReadableDuration) duration36);
        org.joda.time.Instant instant80 = org.joda.time.Instant.parse("1900-01-01");
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = org.joda.time.DateTimeFieldType.yearOfCentury();
        boolean boolean82 = instant80.isSupported(dateTimeFieldType81);
        int int83 = instant2.get(dateTimeFieldType81);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 21 + "'", int20 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(mutablePeriod32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(instant40);
        org.junit.Assert.assertNotNull(instant42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(mutablePeriod47);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(mutablePeriod55);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(mutablePeriod64);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "PeriodType[YearMonthDayTime]" + "'", str74, "PeriodType[YearMonthDayTime]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(duration77);
        org.junit.Assert.assertNotNull(instant78);
        org.junit.Assert.assertNotNull(instant80);
        org.junit.Assert.assertNotNull(dateTimeFieldType81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 22 + "'", int83 == 22);
    }

    @Test
    public void test15534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15534");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        int int3 = localDate2.getYearOfCentury();
        org.joda.time.LocalDate.Property property4 = localDate2.centuryOfEra();
        org.joda.time.LocalDate localDate5 = property4.roundFloorCopy();
        org.joda.time.LocalDate localDate6 = property4.roundCeilingCopy();
        org.joda.time.LocalDate localDate8 = localDate6.minusWeeks(1975);
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfEra();
        org.joda.time.LocalDate localDate10 = property9.roundHalfEvenCopy();
        org.joda.time.LocalDate.Property property11 = localDate10.yearOfCentury();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69 + "'", int3 == 69);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test15535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15535");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime localTime3 = localTime1.plusHours((int) (short) 10);
        org.joda.time.LocalTime localTime5 = localTime1.minusHours(8);
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes(1900);
        org.joda.time.LocalTime localTime9 = localTime7.withMillisOfDay((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = localTime9.toString("DurationField[weekyears]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: u");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test15536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15536");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType4 = periodType3.withWeeksRemoved();
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight1, readableDuration2, periodType3);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withChronologyRetainFields(chronology9);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = timeOfDay10.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay10.plusHours((-1));
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.withChronologyRetainFields(chronology18);
        long long21 = chronology14.set((org.joda.time.ReadablePartial) timeOfDay17, (long) (byte) -1);
        org.joda.time.DateTimeField dateTimeField22 = chronology14.millisOfSecond();
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight1.withChronology(chronology14);
        org.joda.time.DateMidnight.Property property24 = dateMidnight23.era();
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-86399999L) + "'", long21 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test15537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15537");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusYears((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime();
        int int4 = mutableDateTime3.getDayOfMonth();
        org.joda.time.Instant instant5 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime mutableDateTime6 = instant5.toMutableDateTime();
        boolean boolean7 = dateTime0.isEqual((org.joda.time.ReadableInstant) instant5);
        int int8 = dateTime0.getDayOfYear();
        long long9 = dateTime0.getMillis();
        org.joda.time.DateTime dateTime11 = dateTime0.withMillisOfDay(100);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime14 = dateTime12.minusYears((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime12.toMutableDateTime();
        mutableDateTime15.setMillisOfSecond(2);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod21 = mutablePeriod20.copy();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(chronology22);
        org.joda.time.DateMidnight.Property property24 = dateMidnight23.yearOfCentury();
        org.joda.time.Duration duration25 = mutablePeriod21.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight23);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod29 = mutablePeriod28.copy();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(chronology30);
        org.joda.time.DateMidnight.Property property32 = dateMidnight31.yearOfCentury();
        org.joda.time.Duration duration33 = mutablePeriod29.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight31);
        boolean boolean34 = duration25.isEqual((org.joda.time.ReadableDuration) duration33);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod38 = mutablePeriod37.copy();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight(chronology39);
        org.joda.time.DateMidnight.Property property41 = dateMidnight40.yearOfCentury();
        org.joda.time.Duration duration42 = mutablePeriod38.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight40);
        boolean boolean43 = duration33.isShorterThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType45 = periodType44.withWeeksRemoved();
        org.joda.time.Period period46 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime15, (org.joda.time.ReadableDuration) duration42, periodType45);
        org.joda.time.DateTime dateTime47 = dateTime0.plus((org.joda.time.ReadableDuration) duration42);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int51 = dateTimeZone49.getOffset(0L);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(dateTimeZone49);
        org.joda.time.DateTime.Property property53 = dateTime52.minuteOfDay();
        org.joda.time.DateTime dateTime55 = dateTime52.withSecondOfMinute(23);
        org.joda.time.YearMonth yearMonth57 = new org.joda.time.YearMonth((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int61 = dateTimeZone59.getOffset(0L);
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(dateTimeZone59);
        org.joda.time.DateTime.Property property63 = dateTime62.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean66 = dateTimeZone65.isFixed();
        org.joda.time.DateTime dateTime67 = dateTime62.toDateTime(dateTimeZone65);
        org.joda.time.Interval interval68 = yearMonth57.toInterval(dateTimeZone65);
        java.lang.String str69 = dateTimeZone65.toString();
        org.joda.time.DateTime dateTime70 = dateTime55.withZoneRetainFields(dateTimeZone65);
        org.joda.time.DateTime dateTime71 = dateTime47.withZoneRetainFields(dateTimeZone65);
        long long73 = dateTimeZone65.nextTransition(282L);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1645455428928L + "'", long9 == 1645455428928L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(mutablePeriod21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(mutablePeriod29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(mutablePeriod38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(interval68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "UTC" + "'", str69, "UTC");
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 282L + "'", long73 == 282L);
    }

    @Test
    public void test15538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15538");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.DurationFieldType durationFieldType5 = periodType3.getFieldType(0);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone9);
        org.joda.time.DateTime dateTime11 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime11.toMutableDateTime();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.withChronologyRetainFields(chronology16);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray18 = timeOfDay17.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay17.plusHours((-1));
        org.joda.time.Chronology chronology21 = timeOfDay20.getChronology();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.TimeOfDay timeOfDay24 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay24.withChronologyRetainFields(chronology25);
        long long28 = chronology21.set((org.joda.time.ReadablePartial) timeOfDay24, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(chronology21);
        org.joda.time.DateTime dateTime30 = dateTime11.toDateTime(chronology21);
        org.joda.time.DateTimeField dateTimeField31 = chronology21.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField32 = chronology21.millisOfDay();
        org.joda.time.DurationField durationField33 = chronology21.centuries();
        org.joda.time.DurationField durationField34 = durationFieldType6.getField(chronology21);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((-86399999L), 311L, periodType3, chronology21);
        mutablePeriod35.addMinutes(17);
        int int38 = mutablePeriod35.getMonths();
        org.joda.time.MutablePeriod mutablePeriod39 = mutablePeriod35.toMutablePeriod();
        mutablePeriod35.addMillis(10957);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-86399999L) + "'", long28 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod39);
    }

    @Test
    public void test15539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15539");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean5 = dateTimeFormatter4.isPrinter();
        java.lang.Character[] charArray12 = new java.lang.Character[] { '#', 'x', '#', 'u', ' ', '#' };
        java.util.LinkedHashSet<java.lang.Character> charSet13 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet13, charArray12);
        java.lang.Object[] objArray15 = charSet13.toArray();
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.minutes();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone20);
        org.joda.time.DateTime dateTime22 = dateTime21.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime22.toMutableDateTime();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.TimeOfDay timeOfDay26 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay26.withChronologyRetainFields(chronology27);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray29 = timeOfDay28.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay28.plusHours((-1));
        org.joda.time.Chronology chronology32 = timeOfDay31.getChronology();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.TimeOfDay timeOfDay35 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay35.withChronologyRetainFields(chronology36);
        long long39 = chronology32.set((org.joda.time.ReadablePartial) timeOfDay35, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay40 = new org.joda.time.TimeOfDay(chronology32);
        org.joda.time.DateTime dateTime41 = dateTime22.toDateTime(chronology32);
        org.joda.time.DateTimeField dateTimeField42 = chronology32.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField43 = chronology32.millisOfDay();
        org.joda.time.DurationField durationField44 = chronology32.centuries();
        org.joda.time.Period period45 = new org.joda.time.Period(818L, periodType17, chronology32);
        org.joda.time.DateTimeField dateTimeField46 = chronology32.secondOfDay();
        boolean boolean47 = charSet13.remove((java.lang.Object) chronology32);
        org.joda.time.DateTimeField dateTimeField48 = chronology32.millisOfDay();
        org.joda.time.DateMidnight dateMidnight49 = org.joda.time.DateMidnight.now(chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter4.withChronology(chronology32);
        java.util.Locale locale51 = dateTimeFormatter4.getLocale();
        org.joda.time.DateTimeZone dateTimeZone52 = dateTimeFormatter4.getZone();
        org.joda.time.Chronology chronology53 = dateTimeFormatter4.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter4.withZoneUTC();
        boolean boolean55 = dateTimeFormatter4.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone56 = dateTimeFormatter4.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter4.withDefaultYear(53694186);
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime();
        int int60 = mutableDateTime59.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone63);
        org.joda.time.DateTime dateTime65 = dateTime64.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType66 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType67 = periodType66.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime59, (org.joda.time.ReadableInstant) dateTime64, periodType67);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.era();
        int int70 = mutableDateTime59.get(dateTimeFieldType69);
        mutableDateTime59.addYears(6);
        java.util.Locale locale74 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str75 = mutableDateTime59.toString("14:49:16.869", locale74);
        java.lang.String str76 = locale74.getISO3Language();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter77 = dateTimeFormatter58.withLocale(locale74);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[#, x, u,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[#, x, u,  ]");
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray29);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-86399999L) + "'", long39 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateMidnight49);
        org.junit.Assert.assertNotNull(dateTimeFormatter50);
        org.junit.Assert.assertNull(locale51);
        org.junit.Assert.assertNull(dateTimeZone52);
        org.junit.Assert.assertNull(chronology53);
        org.junit.Assert.assertNotNull(dateTimeFormatter54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(dateTimeFormatter58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 21 + "'", int60 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(periodType66);
        org.junit.Assert.assertNotNull(periodType67);
        org.junit.Assert.assertNotNull(dateTimeFieldType69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "14:49:16.869" + "'", str75, "14:49:16.869");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "zho" + "'", str76, "zho");
        org.junit.Assert.assertNotNull(dateTimeFormatter77);
    }

    @Test
    public void test15540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15540");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableDuration4, (org.joda.time.ReadableInstant) mutableDateTime5);
        int[] intArray8 = chronology3.get((org.joda.time.ReadablePeriod) mutablePeriod6, (long) 100);
        java.util.Calendar.Builder builder9 = builder0.setFields(intArray8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone12);
        org.joda.time.DateTime dateTime14 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime14.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.year();
        org.joda.time.DateTimeField dateTimeField17 = property16.getField();
        java.util.Locale locale18 = java.util.Locale.PRC;
        java.lang.String str19 = locale18.getDisplayScript();
        java.util.Locale.setDefault(locale18);
        java.lang.String str21 = locale18.getISO3Language();
        java.util.Locale locale22 = java.util.Locale.ENGLISH;
        java.lang.String str23 = locale18.getDisplayScript(locale22);
        int int24 = dateTimeField17.getMaximumShortTextLength(locale22);
        java.util.Calendar.Builder builder25 = builder0.setLocale(locale22);
        java.util.Calendar.Builder builder29 = builder0.setTimeOfDay(47, 0, (int) (short) -1);
        java.util.Locale locale30 = java.util.Locale.JAPAN;
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Chronology chronology34 = localDate33.getChronology();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology34);
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType31.getField(chronology34);
        long long38 = dateTimeField36.roundFloor((long) (short) 100);
        java.util.Locale locale42 = new java.util.Locale("hi!", "hi!");
        java.lang.String str43 = locale42.getCountry();
        java.lang.String str44 = dateTimeField36.getAsShortText(7, locale42);
        java.lang.String str45 = locale30.getDisplayName(locale42);
        org.joda.time.YearMonthDay yearMonthDay46 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay48 = yearMonthDay46.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime49 = yearMonthDay46.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval50 = yearMonthDay46.toInterval();
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = chronology51.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField53 = chronology51.weekyearOfCentury();
        boolean boolean54 = dateTimeField53.isSupported();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone58);
        org.joda.time.DateTime dateTime60 = dateTime59.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime61 = dateTime60.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime61.year();
        org.joda.time.DateTimeField dateTimeField63 = property62.getField();
        long long66 = dateTimeField63.add((long) 21, (long) ' ');
        org.joda.time.DurationField durationField67 = dateTimeField63.getRangeDurationField();
        java.util.Locale locale69 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.Character> charSet70 = locale69.getExtensionKeys();
        java.lang.String str71 = dateTimeField63.getAsText(21, locale69);
        java.lang.String str72 = dateTimeField53.getAsShortText((long) 1969, locale69);
        java.lang.String str73 = locale30.getDisplayVariant(locale69);
        java.util.Calendar.Builder builder74 = builder0.setLocale(locale30);
        java.util.Calendar.Builder builder78 = builder0.setDate(857, 55388261, 15);
        java.util.Date date82 = new java.util.Date(0, (int) '4', 1);
        int int83 = date82.getTimezoneOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder84 = builder0.setInstant(date82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zho" + "'", str21, "zho");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
        org.junit.Assert.assertEquals(locale42.toString(), "hi!_HI!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "HI!" + "'", str43, "HI!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "7" + "'", str44, "7");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Japanese (Japan)" + "'", str45, "Japanese (Japan)");
        org.junit.Assert.assertNotNull(yearMonthDay48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(mutableDateTime61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1009843200021L + "'", long66 == 1009843200021L);
        org.junit.Assert.assertNull(durationField67);
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(charSet70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "21" + "'", str71, "21");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "70" + "'", str72, "70");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertEquals(date82.toString(), "Sun May 01 00:00:00 UTC 1904");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
    }

    @Test
    public void test15541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15541");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        int int3 = yearMonthDay0.getDayOfMonth();
        java.lang.String str5 = yearMonthDay0.toString("\u610f\u5927\u5229");
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay6.minusMonths((int) (byte) 10);
        int int9 = yearMonthDay6.getDayOfMonth();
        int int10 = yearMonthDay6.getDayOfMonth();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod14 = mutablePeriod13.copy();
        org.joda.time.format.PeriodFormatter periodFormatter15 = null;
        java.lang.String str16 = mutablePeriod14.toString(periodFormatter15);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay6.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod14, (-1));
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(184L);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.weekyears();
        int int22 = mutablePeriod20.get(durationFieldType21);
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay18.plus((org.joda.time.ReadablePeriod) mutablePeriod20);
        org.joda.time.YearMonthDay yearMonthDay24 = yearMonthDay0.minus((org.joda.time.ReadablePeriod) mutablePeriod20);
        org.joda.time.YearMonthDay.Property property25 = yearMonthDay0.monthOfYear();
        java.lang.String str26 = property25.getAsText();
        org.joda.time.YearMonthDay yearMonthDay27 = property25.getYearMonthDay();
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u610f\u5927\u5229" + "'", str5, "\u610f\u5927\u5229");
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 21 + "'", int10 == 21);
        org.junit.Assert.assertNotNull(mutablePeriod14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PT0.099S" + "'", str16, "PT0.099S");
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u4e8c\u6708" + "'", str26, "\u4e8c\u6708");
        org.junit.Assert.assertNotNull(yearMonthDay27);
    }

    @Test
    public void test15542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15542");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone4);
        org.joda.time.DateTime dateTime6 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime0, (org.joda.time.ReadableInstant) dateTime5, periodType8);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod13 = mutablePeriod12.copy();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight.Property property16 = dateMidnight15.yearOfCentury();
        org.joda.time.Duration duration17 = mutablePeriod13.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight15);
        mutablePeriod9.setPeriod((org.joda.time.ReadableDuration) duration17);
        long long19 = duration17.getMillis();
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Interval interval21 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration17, readableInstant20);
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay24 = yearMonthDay22.plusDays(2022);
        org.joda.time.YearMonthDay yearMonthDay26 = yearMonthDay24.withMonthOfYear(4);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int28 = yearMonthDay24.get(dateTimeFieldType27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = yearMonthDay24.toDateTimeAtMidnight(dateTimeZone29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.year();
        int int32 = dateTime30.get(dateTimeFieldType31);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime30.toMutableDateTimeISO();
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.standard();
        java.lang.String str35 = periodType34.toString();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration17, (org.joda.time.ReadableInstant) dateTime30, periodType34);
        org.joda.time.DurationFieldType[] durationFieldTypeArray37 = mutablePeriod36.getFieldTypes();
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.forFields(durationFieldTypeArray37);
        org.joda.time.Instant instant39 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime40 = instant39.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime40.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime42 = property41.roundHalfEven();
        int int43 = mutableDateTime42.getSecondOfDay();
        boolean boolean44 = periodType38.equals((java.lang.Object) int43);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(mutablePeriod13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 99L + "'", long19 == 99L);
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2027 + "'", int32 == 2027);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PeriodType[Standard]" + "'", str35, "PeriodType[Standard]");
        org.junit.Assert.assertNotNull(durationFieldTypeArray37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test15543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15543");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.monthOfYear();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight.Property property4 = dateMidnight3.yearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime0, (org.joda.time.ReadableInstant) dateMidnight3);
        int int6 = dateMidnight3.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property7 = dateMidnight3.yearOfEra();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight3.minusDays(3);
        org.joda.time.DateMidnight.Property property10 = dateMidnight9.weekyear();
        int int11 = dateMidnight9.getDayOfMonth();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 18 + "'", int11 == 18);
    }

    @Test
    public void test15544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15544");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(11);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone4);
        org.joda.time.DateTime dateTime6 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime6.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime8 = dateTime6.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfYear((int) '#');
        org.joda.time.LocalDateTime.Property property11 = localDateTime8.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime13 = property11.addToCopy(886L);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusMonths(0);
        boolean boolean16 = dateTimeZone1.isLocalDateTimeGap(localDateTime15);
        int int18 = dateTimeZone1.getStandardOffset(851L);
        int int20 = dateTimeZone1.getOffset(254L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
    }

    @Test
    public void test15545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15545");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int3 = dateTimeZone1.getOffset(0L);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime.Property property5 = dateTime4.minuteOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(23);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) (short) -1, chronology9);
        int int11 = localDate10.getYearOfCentury();
        org.joda.time.LocalDate.Property property12 = localDate10.centuryOfEra();
        org.joda.time.LocalDate localDate14 = property12.addWrapFieldToCopy(9);
        org.joda.time.LocalDate localDate16 = localDate14.withCenturyOfEra(818);
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay17.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime20 = yearMonthDay17.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval21 = yearMonthDay17.toInterval();
        org.joda.time.Period period22 = interval21.toPeriod();
        org.joda.time.LocalDate localDate23 = localDate14.minus((org.joda.time.ReadablePeriod) period22);
        org.joda.time.LocalDate localDate25 = localDate14.withYearOfEra(292278993);
        org.joda.time.DateTime dateTime26 = dateTime7.withFields((org.joda.time.ReadablePartial) localDate25);
        org.joda.time.DateTime dateTime27 = dateTime7.withLaterOffsetAtOverlap();
        org.joda.time.Instant instant28 = new org.joda.time.Instant((java.lang.Object) dateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 69 + "'", int11 == 69);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test15546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15546");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.year();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.addWrapField(6);
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        org.joda.time.MutableDateTime mutableDateTime11 = property6.set("1", locale10);
        org.joda.time.MutableDateTime mutableDateTime13 = property6.addWrapField(21);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime();
        int int15 = mutableDateTime14.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone18);
        org.joda.time.DateTime dateTime20 = dateTime19.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType22 = periodType21.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime14, (org.joda.time.ReadableInstant) dateTime19, periodType22);
        org.joda.time.DateTime dateTime24 = dateTime19.toDateTimeISO();
        boolean boolean25 = mutableDateTime13.isBefore((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime13.dayOfMonth();
        java.lang.String str27 = mutableDateTime13.toString();
        int int28 = mutableDateTime13.getSecondOfMinute();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21 + "'", int15 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0022-01-01T00:00:00.000Z" + "'", str27, "0022-01-01T00:00:00.000Z");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test15547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15547");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(864L);
    }

    @Test
    public void test15548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15548");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime();
        int int2 = mutableDateTime1.getDayOfMonth();
        org.joda.time.Instant instant3 = mutableDateTime1.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTime();
        org.joda.time.Instant instant5 = instant3.toInstant();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withChronologyRetainFields(chronology9);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = timeOfDay10.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay10.plusHours((-1));
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.centuryOfEra();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType20 = periodType19.withWeeksRemoved();
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight17, readableDuration18, periodType19);
        org.joda.time.Period period23 = period21.withSeconds(0);
        org.joda.time.Period period25 = period23.plusMinutes((int) (byte) 1);
        org.joda.time.Period period27 = period23.withSeconds((int) (byte) 10);
        org.joda.time.Period period29 = period27.withMillis((int) 'x');
        int[] intArray32 = chronology14.get((org.joda.time.ReadablePeriod) period29, (long) 2022, (long) 6);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime();
        int int34 = mutableDateTime33.getDayOfMonth();
        org.joda.time.Instant instant35 = mutableDateTime33.toInstant();
        boolean boolean37 = mutableDateTime33.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int41 = dateTimeZone39.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime33.setZone(dateTimeZone39);
        mutableDateTime33.setMillisOfDay((int) ' ');
        org.joda.time.Duration duration45 = period29.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime33);
        org.joda.time.Instant instant46 = instant3.minus((org.joda.time.ReadableDuration) duration45);
        org.joda.time.Chronology chronology47 = instant46.getChronology();
        mutableDateTime0.setChronology(chronology47);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(chronology47);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime49.hourOfDay();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 0, 0, 0, 0, -2, -16]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 21 + "'", int34 == 21);
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(instant46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(property50);
    }

    @Test
    public void test15549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15549");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType0.getField(chronology3);
        long long7 = dateTimeField5.roundFloor((long) (short) 100);
        long long10 = dateTimeField5.set(1404L, 28);
        long long13 = dateTimeField5.add((-18748799880L), (long) 8607001);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1028L + "'", long10 == 1028L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-18740192879L) + "'", long13 == (-18740192879L));
    }

    @Test
    public void test15550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15550");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.year();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundHalfFloor();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
    }

    @Test
    public void test15551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15551");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setTimeInMillis(845L);
        java.util.TimeZone timeZone3 = null;
        calendar0.setTimeZone(timeZone3);
        int int6 = calendar0.getGreatestMinimum(9);
        java.util.TimeZone timeZone8 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        calendar0.setTimeZone(timeZone8);
        boolean boolean10 = calendar0.isWeekDateSupported();
        java.util.Date date16 = new java.util.Date(58, 52, 2022, (int) (byte) 10, 21);
        java.lang.String str17 = date16.toLocaleString();
        date16.setYear(0);
        java.lang.String str20 = date16.toGMTString();
        int int21 = date16.getSeconds();
        int int22 = date16.getMonth();
        calendar0.setTime(date16);
        java.util.TimeZone timeZone24 = calendar0.getTimeZone();
        int int25 = timeZone24.getRawOffset();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone24);
        int int27 = timeZone24.getDSTSavings();
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=-2181735540000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1900,MONTH=10,WEEK_OF_YEAR=46,WEEK_OF_MONTH=3,DAY_OF_MONTH=12,DAY_OF_YEAR=316,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=21,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals(date16.toString(), "Mon Nov 12 10:21:00 UTC 1900");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1967-11-12 10:21:00" + "'", str17, "1967-11-12 10:21:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "12 Nov 1900 10:21:00 GMT" + "'", str20, "12 Nov 1900 10:21:00 GMT");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(calendar26);
// flaky:         org.junit.Assert.assertEquals(calendar26.toString(), "java.util.GregorianCalendar[time=1645455429240,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=9,MILLISECOND=240,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test15552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15552");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.yearOfCentury();
        java.lang.String str3 = property2.getAsShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(obj5, dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusYears((int) (short) 0);
        int int11 = localDateTime7.getValue(2);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone14);
        int int16 = dateTime15.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = dateTime15.toDateTime(dateTimeZone18);
        org.joda.time.DateTime.Property property21 = dateTime15.weekyear();
        org.joda.time.DateTime dateTime22 = property21.roundHalfEvenCopy();
        boolean boolean23 = localDateTime7.equals((java.lang.Object) property21);
        int int24 = localDateTime7.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime7.withHourOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusHours(0);
        int int29 = localDateTime28.getEra();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.plusSeconds(184);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.centuryOfEra();
        boolean boolean34 = dateTimeFieldType4.isSupported(chronology32);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "22" + "'", str3, "22");
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 21 + "'", int11 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test15553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15553");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        int int3 = yearMonthDay0.getDayOfMonth();
        int int4 = yearMonthDay0.getDayOfMonth();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod8 = mutablePeriod7.copy();
        org.joda.time.format.PeriodFormatter periodFormatter9 = null;
        java.lang.String str10 = mutablePeriod8.toString(periodFormatter9);
        org.joda.time.YearMonthDay yearMonthDay12 = yearMonthDay0.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod8, (-1));
        int int13 = mutablePeriod8.getYears();
        org.joda.time.Period period22 = new org.joda.time.Period((int) (short) 0, 887, 10, (-1898), 53251426, 2032, 11, 2023);
        int int23 = period22.getMonths();
        org.joda.time.Period period25 = period22.minusMinutes(753);
        int int26 = period25.size();
        mutablePeriod8.mergePeriod((org.joda.time.ReadablePeriod) period25);
        org.joda.time.format.PeriodFormatter periodFormatter28 = null;
        java.lang.String str29 = mutablePeriod8.toString(periodFormatter28);
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT0.099S" + "'", str10, "PT0.099S");
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 887 + "'", int23 == 887);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "P887M10W-1898DT53251426H1279M13.023S" + "'", str29, "P887M10W-1898DT53251426H1279M13.023S");
    }

    @Test
    public void test15554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15554");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(11, (int) ' ');
        java.util.Date date9 = new java.util.Date(58, 52, 2022, (int) (byte) 10, 21);
        date9.setMonth(0);
        calendar0.setTime(date9);
        org.joda.time.YearMonthDay yearMonthDay13 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        java.util.TimeZone timeZone14 = calendar0.getTimeZone();
        int int15 = calendar0.getFirstDayOfWeek();
        java.util.Date date16 = calendar0.getTime();
        int int17 = date16.getDay();
        java.util.Date date23 = new java.util.Date(294, 870, (-1970), (int) (short) 1, 838);
        long long24 = date23.getTime();
        boolean boolean25 = date16.after(date23);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=-93706740000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1967,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=12,DAY_OF_YEAR=12,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=21,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 12 10:21:00 UTC 1967");
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 12 10:21:00 UTC 1967");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Feb 06 14:58:00 UTC 2261");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9186274680000L + "'", long24 == 9186274680000L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test15555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15555");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property2.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime7 = property6.roundFloorCopy();
        org.joda.time.LocalTime localTime8 = property6.roundCeilingCopy();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.withChronologyRetainFields(chronology12);
        org.joda.time.DateTime dateTime14 = timeOfDay13.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay13.minusHours((int) (byte) 1);
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.lang.String str19 = timeOfDay13.toString("1", locale18);
        int int20 = localTime8.compareTo((org.joda.time.ReadablePartial) timeOfDay13);
        org.joda.time.Period period22 = org.joda.time.Period.hours((int) (byte) 10);
        int[] intArray23 = period22.getValues();
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay13.withPeriodAdded((org.joda.time.ReadablePeriod) period22, 2022);
        int int26 = timeOfDay13.getMinuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime();
        int int28 = mutableDateTime27.getDayOfMonth();
        org.joda.time.Instant instant29 = mutableDateTime27.toInstant();
        org.joda.time.Instant instant31 = instant29.plus((long) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime32 = instant31.toMutableDateTimeISO();
        mutableDateTime32.setSecondOfDay(9);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime32.getZone();
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone35);
        org.joda.time.DateTime dateTime37 = timeOfDay13.toDateTimeToday(dateTimeZone35);
        int int38 = timeOfDay13.getHourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1" + "'", str19, "1");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 0, 0, 10, 0, 0, 0]");
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 21 + "'", int28 == 21);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test15556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15556");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = timeOfDay4.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.plusHours((-1));
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.withChronologyRetainFields(chronology12);
        long long15 = chronology8.set((org.joda.time.ReadablePartial) timeOfDay11, (long) (byte) -1);
        org.joda.time.TimeOfDay.Property property16 = timeOfDay11.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay11.withMillisOfSecond(17);
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minusMillis(21);
        org.joda.time.TimeOfDay.Property property21 = timeOfDay18.secondOfMinute();
        java.lang.String str22 = timeOfDay18.toString();
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-86399999L) + "'", long15 == (-86399999L));
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "T00:00:00.017" + "'", str22, "T00:00:00.017");
    }

    @Test
    public void test15557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15557");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.era();
        org.joda.time.DateMidnight dateMidnight3 = property2.withMaximumValue();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.withChronologyRetainFields(chronology8);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray10 = timeOfDay9.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay9.plusHours((-1));
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        int int14 = dateTimeField4.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay12);
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay12.minusMillis(69);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone21);
        org.joda.time.DateTime dateTime23 = dateTime22.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime23.toMutableDateTime();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay27.withChronologyRetainFields(chronology28);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray30 = timeOfDay29.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay29.plusHours((-1));
        org.joda.time.Chronology chronology33 = timeOfDay32.getChronology();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.TimeOfDay timeOfDay36 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay36.withChronologyRetainFields(chronology37);
        long long40 = chronology33.set((org.joda.time.ReadablePartial) timeOfDay36, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay41 = new org.joda.time.TimeOfDay(chronology33);
        org.joda.time.DateTime dateTime42 = dateTime23.toDateTime(chronology33);
        org.joda.time.DateTimeField dateTimeField43 = chronology33.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((long) 1, chronology33);
        org.joda.time.DateTimeZone dateTimeZone45 = chronology33.getZone();
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(845L, chronology33);
        org.joda.time.DateTimeField dateTimeField47 = chronology33.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone48 = chronology33.getZone();
        org.joda.time.LocalTime localTime49 = org.joda.time.LocalTime.now(dateTimeZone48);
        org.joda.time.DateTime dateTime50 = timeOfDay16.toDateTimeToday(dateTimeZone48);
        org.joda.time.DateTime dateTime52 = dateTime50.minusMonths(53377138);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone56);
        org.joda.time.DateTime dateTime58 = dateTime57.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime58.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime59.year();
        org.joda.time.DateTimeField dateTimeField61 = property60.getField();
        java.util.Locale locale62 = java.util.Locale.PRC;
        java.lang.String str63 = locale62.getDisplayScript();
        java.util.Locale.setDefault(locale62);
        java.lang.String str65 = locale62.getISO3Language();
        java.util.Locale locale66 = java.util.Locale.ENGLISH;
        java.lang.String str67 = locale62.getDisplayScript(locale66);
        int int68 = dateTimeField61.getMaximumShortTextLength(locale66);
        java.util.Locale locale69 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str70 = locale66.getDisplayScript(locale69);
        java.lang.String str71 = dateTime50.toString("540", locale66);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-86399999L) + "'", long40 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(mutableDateTime59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "zho" + "'", str65, "zho");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "en");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 9 + "'", int68 == 9);
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "540" + "'", str71, "540");
    }

    @Test
    public void test15558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15558");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(1);
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay5.plusDays(2022);
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay7.withMonthOfYear(4);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateMidnight dateMidnight11 = yearMonthDay9.toDateMidnight(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime();
        int int13 = mutableDateTime12.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone16);
        org.joda.time.DateTime dateTime18 = dateTime17.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType20 = periodType19.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime12, (org.joda.time.ReadableInstant) dateTime17, periodType20);
        int int22 = dateTimeZone10.getOffset((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.Interval interval23 = localDate4.toInterval(dateTimeZone10);
        int int24 = localDate4.getDayOfMonth();
        org.joda.time.LocalDate localDate26 = localDate4.withYearOfEra(49);
        org.joda.time.DateMidnight dateMidnight27 = localDate26.toDateMidnight();
        org.joda.time.LocalDate.Property property28 = localDate26.dayOfYear();
        org.joda.time.LocalDate localDate29 = property28.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate30 = property28.roundHalfCeilingCopy();
        int int31 = localDate30.getCenturyOfEra();
        int[] intArray32 = localDate30.getValues();
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 21 + "'", int13 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 31 + "'", int24 == 31);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[49, 12, 31]");
    }

    @Test
    public void test15559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15559");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("ISOChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"ISOChronology[UTC]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15560");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int3 = dateTimeZone1.getOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone1);
        int int5 = mutableDateTime4.getYear();
        org.joda.time.Period period7 = org.joda.time.Period.hours(117);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod10.copy();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(chronology12);
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.yearOfCentury();
        org.joda.time.Duration duration15 = mutablePeriod11.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight13);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod19 = mutablePeriod18.copy();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(chronology20);
        org.joda.time.DateMidnight.Property property22 = dateMidnight21.yearOfCentury();
        org.joda.time.Duration duration23 = mutablePeriod19.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight21);
        boolean boolean24 = duration15.isEqual((org.joda.time.ReadableDuration) duration23);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod28 = mutablePeriod27.copy();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(chronology29);
        org.joda.time.DateMidnight.Property property31 = dateMidnight30.yearOfCentury();
        org.joda.time.Duration duration32 = mutablePeriod28.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight30);
        boolean boolean33 = duration23.isShorterThan((org.joda.time.ReadableDuration) duration32);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod37 = mutablePeriod36.copy();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(chronology38);
        org.joda.time.DateMidnight.Property property40 = dateMidnight39.yearOfCentury();
        org.joda.time.Duration duration41 = mutablePeriod37.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight39);
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod48 = mutablePeriod47.copy();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.TimeOfDay timeOfDay53 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology52);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.TimeOfDay timeOfDay55 = timeOfDay53.withChronologyRetainFields(chronology54);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray56 = timeOfDay55.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay58 = timeOfDay55.plusHours((-1));
        org.joda.time.Chronology chronology59 = timeOfDay58.getChronology();
        mutablePeriod47.setPeriod((long) (byte) 1, 845L, chronology59);
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime(41L, chronology59);
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((long) '4', periodType43, chronology59);
        org.joda.time.Period period63 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration23, (org.joda.time.ReadableInstant) dateMidnight39, periodType43);
        org.joda.time.DateTime dateTime64 = dateMidnight39.toDateTimeISO();
        org.joda.time.Interval interval65 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period7, (org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.Minutes minutes66 = period7.toStandardMinutes();
        org.joda.time.Period period68 = period7.plusWeeks(588);
        mutableDateTime4.add((org.joda.time.ReadablePeriod) period7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(mutablePeriod19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(mutablePeriod28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(mutablePeriod37);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(mutablePeriod48);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertNotNull(timeOfDay55);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray56);
        org.junit.Assert.assertNotNull(timeOfDay58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(minutes66);
        org.junit.Assert.assertNotNull(period68);
    }

    @Test
    public void test15561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15561");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone4);
        org.joda.time.DateTime dateTime6 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime6.toMutableDateTime();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.withChronologyRetainFields(chronology11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = timeOfDay12.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay12.plusHours((-1));
        org.joda.time.Chronology chronology16 = timeOfDay15.getChronology();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay19.withChronologyRetainFields(chronology20);
        long long23 = chronology16.set((org.joda.time.ReadablePartial) timeOfDay19, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay(chronology16);
        org.joda.time.DateTime dateTime25 = dateTime6.toDateTime(chronology16);
        org.joda.time.DateTimeField dateTimeField26 = chronology16.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = chronology16.millisOfDay();
        org.joda.time.DurationField durationField28 = chronology16.centuries();
        org.joda.time.Period period29 = new org.joda.time.Period(818L, periodType1, chronology16);
        org.joda.time.DateTimeField dateTimeField30 = chronology16.secondOfDay();
        org.joda.time.DurationField durationField31 = dateTimeField30.getRangeDurationField();
        long long33 = dateTimeField30.roundHalfFloor(506L);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-86399999L) + "'", long23 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1000L + "'", long33 == 1000L);
    }

    @Test
    public void test15562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15562");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = mutablePeriod2.copy();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(chronology4);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.yearOfCentury();
        org.joda.time.Duration duration7 = mutablePeriod3.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime();
        int int9 = mutableDateTime8.getDayOfMonth();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate13 = localDate11.plusWeeks(9);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int15 = localDate11.get(dateTimeFieldType14);
        mutableDateTime8.set(dateTimeFieldType14, 2);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.minutes();
        mutableDateTime8.add(durationFieldType18, (int) '4');
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight5.withFieldAdded(durationFieldType18, 17);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.monthOfYear();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight.Property property27 = dateMidnight26.yearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime23, (org.joda.time.ReadableInstant) dateMidnight26);
        int int29 = dateMidnight26.getMinuteOfHour();
        org.joda.time.Instant instant30 = dateMidnight26.toInstant();
        org.joda.time.Period period31 = org.joda.time.Period.ZERO;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(chronology32);
        org.joda.time.DateMidnight.Property property34 = dateMidnight33.dayOfYear();
        org.joda.time.DateMidnight dateMidnight35 = property34.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight.Property property37 = dateMidnight35.property(dateTimeFieldType36);
        org.joda.time.DateMidnight.Property property38 = dateMidnight35.year();
        org.joda.time.Duration duration39 = period31.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight35);
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight26, (org.joda.time.ReadableDuration) duration39);
        org.joda.time.DateMidnight.Property property41 = dateMidnight26.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight26.plus(514L);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight26.minus((long) 2022);
        boolean boolean46 = dateMidnight5.isEqual((org.joda.time.ReadableInstant) dateMidnight45);
        int int47 = dateMidnight45.getYearOfEra();
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateMidnight35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateMidnight43);
        org.junit.Assert.assertNotNull(dateMidnight45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2022 + "'", int47 == 2022);
    }

    @Test
    public void test15563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15563");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.era();
        java.lang.String str3 = dateMidnight1.toString();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight1.withDurationAdded((-1L), 20);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.plusMonths(53345483);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean12 = dateTimeZone10.isStandardOffset((long) 'u');
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime15 = dateTime13.withHourOfDay((int) (short) 10);
        org.joda.time.DateTime dateTime17 = dateTime13.withMillis((long) (-1));
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay((-1), 3, 11);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = yearMonthDay21.getFieldType((int) (short) 0);
        java.lang.String str24 = dateTimeFieldType23.getName();
        org.joda.time.DateTime.Property property25 = dateTime17.property(dateTimeFieldType23);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight6.withField(dateTimeFieldType23, 597);
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay((java.lang.Object) dateMidnight6);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight6.plus(10L);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2022-02-21T00:00:00.000Z" + "'", str3, "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "year" + "'", str24, "year");
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertNotNull(dateMidnight30);
    }

    @Test
    public void test15564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15564");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minus((org.joda.time.ReadablePeriod) mutablePeriod7);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod12 = mutablePeriod11.copy();
        mutablePeriod7.add((org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType18 = periodType17.withWeeksRemoved();
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight15, readableDuration16, periodType17);
        org.joda.time.Period period21 = period19.withSeconds(0);
        boolean boolean22 = mutablePeriod12.equals((java.lang.Object) period19);
        org.joda.time.Duration duration23 = period19.toStandardDuration();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime();
        int int25 = mutableDateTime24.getDayOfMonth();
        org.joda.time.Instant instant26 = mutableDateTime24.toInstant();
        boolean boolean28 = mutableDateTime24.isBefore((long) 2);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone32);
        org.joda.time.DateTime dateTime34 = dateTime33.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime34.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.year();
        org.joda.time.DateTimeField dateTimeField37 = property36.getField();
        java.util.Locale locale38 = java.util.Locale.PRC;
        java.lang.String str39 = locale38.getDisplayScript();
        java.util.Locale.setDefault(locale38);
        java.lang.String str41 = locale38.getISO3Language();
        java.util.Locale locale42 = java.util.Locale.ENGLISH;
        java.lang.String str43 = locale38.getDisplayScript(locale42);
        int int44 = dateTimeField37.getMaximumShortTextLength(locale42);
        mutableDateTime24.setRounding(dateTimeField37);
        int int46 = mutableDateTime24.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime24.dayOfYear();
        mutableDateTime24.setMinuteOfDay(19);
        org.joda.time.PeriodType periodType50 = org.joda.time.PeriodType.standard();
        java.lang.String str51 = periodType50.getName();
        org.joda.time.PeriodType periodType52 = periodType50.withMillisRemoved();
        org.joda.time.Period period53 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration23, (org.joda.time.ReadableInstant) mutableDateTime24, periodType52);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime24.weekOfWeekyear();
        int int55 = property54.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 21 + "'", int25 == 21);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "zho" + "'", str41, "zho");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 9 + "'", int44 == 9);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Standard" + "'", str51, "Standard");
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 53 + "'", int55 == 53);
    }

    @Test
    public void test15565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15565");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = timeOfDay4.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.plusHours((-1));
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.withChronologyRetainFields(chronology12);
        long long15 = chronology8.set((org.joda.time.ReadablePartial) timeOfDay11, (long) (byte) -1);
        org.joda.time.TimeOfDay.Property property16 = timeOfDay11.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay18 = property16.addWrapFieldToCopy(14);
        int int19 = property16.getMaximumValue();
        java.lang.String str20 = property16.toString();
        org.joda.time.TimeOfDay timeOfDay22 = property16.setCopy(117);
        int int23 = property16.getMinimumValue();
        java.util.Locale locale25 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.Character> charSet26 = locale25.getExtensionKeys();
        org.joda.time.TimeOfDay timeOfDay27 = property16.setCopy("540", locale25);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-86399999L) + "'", long15 == (-86399999L));
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 999 + "'", int19 == 999);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Property[millisOfSecond]" + "'", str20, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(charSet26);
        org.junit.Assert.assertNotNull(timeOfDay27);
    }

    @Test
    public void test15566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15566");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.monthOfYear();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight.Property property4 = dateMidnight3.yearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime0, (org.joda.time.ReadableInstant) dateMidnight3);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone10);
        org.joda.time.DateTime dateTime12 = dateTime11.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime12.toMutableDateTime();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.withChronologyRetainFields(chronology17);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = timeOfDay18.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay18.plusHours((-1));
        org.joda.time.Chronology chronology22 = timeOfDay21.getChronology();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.TimeOfDay timeOfDay25 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay25.withChronologyRetainFields(chronology26);
        long long29 = chronology22.set((org.joda.time.ReadablePartial) timeOfDay25, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(chronology22);
        org.joda.time.DateTime dateTime31 = dateTime12.toDateTime(chronology22);
        org.joda.time.DateTimeField dateTimeField32 = chronology22.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField33 = chronology22.millisOfDay();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(152L, chronology22);
        mutablePeriod5.setPeriod(1645454970550L, chronology22);
        org.joda.time.DurationField durationField36 = chronology22.days();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-86399999L) + "'", long29 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField36);
    }

    @Test
    public void test15567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15567");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minus((org.joda.time.ReadablePeriod) mutablePeriod7);
        boolean boolean10 = localDateTime8.equals((java.lang.Object) 14);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plusDays(10);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime8.withFieldAdded(durationFieldType13, (int) (short) -1);
        java.lang.Object obj16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(obj16, dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusYears((int) (short) 0);
        int int22 = localDateTime18.getValue(2);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone25);
        int int27 = dateTime26.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime31 = dateTime26.toDateTime(dateTimeZone29);
        org.joda.time.DateTime.Property property32 = dateTime26.weekyear();
        org.joda.time.DateTime dateTime33 = property32.roundHalfEvenCopy();
        boolean boolean34 = localDateTime18.equals((java.lang.Object) property32);
        boolean boolean35 = localDateTime15.isBefore((org.joda.time.ReadablePartial) localDateTime18);
        java.util.Date date36 = localDateTime15.toDate();
        org.joda.time.LocalDateTime.Property property37 = localDateTime15.monthOfYear();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime15.minusDays(54);
        java.util.Locale.Builder builder41 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder43 = builder41.addUnicodeLocaleAttribute("PT10S");
        java.util.Locale.Builder builder44 = builder41.clearExtensions();
        java.util.Locale.Builder builder45 = builder41.clearExtensions();
        java.util.Locale.Builder builder47 = builder45.removeUnicodeLocaleAttribute("2000");
        java.util.Locale locale48 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str49 = locale48.getDisplayLanguage();
        java.lang.String str50 = locale48.toLanguageTag();
        java.lang.String str51 = locale48.getISO3Language();
        java.util.Locale.Builder builder52 = builder45.setLocale(locale48);
        java.lang.String str53 = localDateTime39.toString("\u4e0a\u5348", locale48);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone56);
        org.joda.time.DateTime dateTime58 = dateTime57.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime58.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime60 = dateTime58.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.withDayOfYear((int) '#');
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime64 = localDateTime62.toDateTime(dateTimeZone63);
        java.util.Locale locale66 = java.util.Locale.CHINA;
        java.util.Locale locale67 = locale66.stripExtensions();
        java.util.Locale locale68 = java.util.Locale.PRC;
        java.lang.String str69 = locale68.getDisplayScript();
        java.util.Locale.setDefault(locale68);
        java.lang.String str71 = locale68.getISO3Language();
        java.util.Locale locale72 = java.util.Locale.ENGLISH;
        java.lang.String str73 = locale68.getDisplayScript(locale72);
        java.lang.String str74 = locale67.getDisplayCountry(locale68);
        java.lang.String str75 = dateTime64.toString("zh", locale68);
        java.lang.String str76 = locale68.getDisplayVariant();
        java.lang.String str77 = locale48.getDisplayScript(locale68);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 21 + "'", int22 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Mon Feb 14 14:57:09 UTC 2022");
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\u4e2d\u6587" + "'", str49, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "zh-TW" + "'", str50, "zh-TW");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "zho" + "'", str51, "zho");
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\u4e0a\u5348" + "'", str53, "\u4e0a\u5348");
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(mutableDateTime59);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "zho" + "'", str71, "zho");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "en");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "\u4e2d\u56fd" + "'", str74, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "+00:0012" + "'", str75, "+00:0012");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
    }

    @Test
    public void test15568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15568");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minus((org.joda.time.ReadablePeriod) mutablePeriod7);
        boolean boolean10 = localDateTime8.equals((java.lang.Object) 14);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plusDays(10);
        java.lang.String str13 = localDateTime8.toString();
        int int14 = localDateTime8.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property15 = localDateTime8.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime8.plusMillis(53);
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.parse("21");
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int23 = dateTimeZone21.getOffset(0L);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone27);
        org.joda.time.DateTime dateTime29 = dateTime28.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime30 = dateTime28.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime32 = dateTime30.plusSeconds((int) (short) 10);
        int int33 = dateTime24.compareTo((org.joda.time.ReadableInstant) dateTime30);
        java.util.Calendar calendar34 = java.util.Calendar.getInstance();
        calendar34.add(11, (int) ' ');
        java.util.Date date43 = new java.util.Date(58, 52, 2022, (int) (byte) 10, 21);
        date43.setMonth(0);
        calendar34.setTime(date43);
        boolean boolean47 = dateTime24.equals((java.lang.Object) calendar34);
        org.joda.time.DateTimeZone dateTimeZone48 = dateTime24.getZone();
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime19, dateTimeZone48);
        org.joda.time.DateTime dateTime51 = dateTime19.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone54);
        int int56 = dateTime55.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(dateTimeZone58);
        org.joda.time.DateTime dateTime60 = dateTime55.toDateTime(dateTimeZone58);
        org.joda.time.DateTime dateTime62 = dateTime60.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateMidnight dateMidnight64 = new org.joda.time.DateMidnight(chronology63);
        org.joda.time.DateMidnight.Property property65 = dateMidnight64.dayOfYear();
        org.joda.time.DateMidnight dateMidnight66 = property65.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight.Property property68 = dateMidnight66.property(dateTimeFieldType67);
        org.joda.time.DateTime.Property property69 = dateTime62.property(dateTimeFieldType67);
        int int70 = dateTime19.get(dateTimeFieldType67);
        org.joda.time.DurationFieldType durationFieldType71 = dateTimeFieldType67.getRangeDurationType();
        org.joda.time.LocalDateTime localDateTime73 = localDateTime8.withField(dateTimeFieldType67, 735);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime73.plusDays((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime75.plusSeconds(64);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022-02-21T14:57:09.523" + "'", str13, "2022-02-21T14:57:09.523");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 22 + "'", int14 == 22);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(calendar34);
// flaky:         org.junit.Assert.assertEquals(calendar34.toString(), "java.util.GregorianCalendar[time=-93706740000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1967,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=12,DAY_OF_YEAR=12,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=21,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 12 10:21:00 UTC 1967");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(dateMidnight66);
        org.junit.Assert.assertNotNull(dateTimeFieldType67);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 21 + "'", int70 == 21);
        org.junit.Assert.assertNull(durationFieldType71);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertNotNull(localDateTime77);
    }

    @Test
    public void test15569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15569");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(11, (int) ' ');
        java.util.Date date9 = new java.util.Date(58, 52, 2022, (int) (byte) 10, 21);
        date9.setMonth(0);
        calendar0.setTime(date9);
        org.joda.time.YearMonthDay yearMonthDay13 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek(2022);
        java.time.Instant instant16 = calendar0.toInstant();
        calendar0.setLenient(false);
        calendar0.setFirstDayOfWeek(0);
        int int21 = calendar0.getMinimalDaysInFirstWeek();
        calendar0.setLenient(false);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=-93706740000,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=0,minimalDaysInFirstWeek=1,ERA=1,YEAR=1967,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=12,DAY_OF_YEAR=12,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=21,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 12 10:21:00 UTC 1967");
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test15570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15570");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime localTime3 = localTime1.plusHours((int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.LocalTime.Property property5 = localTime3.property(dateTimeFieldType4);
        org.joda.time.LocalTime localTime7 = localTime3.withMinuteOfHour(16);
        org.joda.time.LocalTime localTime9 = localTime7.plusMillis(292278174);
        int int10 = localTime9.getMillisOfDay();
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 70038175 + "'", int10 == 70038175);
    }

    @Test
    public void test15571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15571");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.Object obj1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(obj1, dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.secondOfMinute();
        long long5 = property4.remainder();
        java.util.Locale locale6 = java.util.Locale.ENGLISH;
        int int7 = property4.getMaximumShortTextLength(locale6);
        java.util.Locale locale10 = new java.util.Locale("hi!", "hi!");
        java.lang.String str11 = locale10.getCountry();
        java.lang.String str12 = locale6.getDisplayVariant(locale10);
        java.lang.String str13 = locale0.getDisplayLanguage(locale6);
        java.lang.String str14 = locale0.getDisplayName();
        java.util.Set<java.lang.Character> charSet15 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(property4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 682L + "'", long5 == 682L);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals(locale10.toString(), "hi!_HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chinese" + "'", str13, "Chinese");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str14, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(charSet15);
    }

    @Test
    public void test15572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15572");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight.Property property5 = dateMidnight4.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight6 = property5.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone9);
        org.joda.time.DateTime dateTime11 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime11.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.year();
        org.joda.time.DateTimeField dateTimeField14 = property13.getField();
        long long17 = dateTimeField14.add((long) 21, (long) ' ');
        org.joda.time.DurationField durationField18 = dateTimeField14.getRangeDurationField();
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.lang.String str22 = dateTimeField14.getAsText(21, locale20);
        java.lang.String str23 = locale20.getLanguage();
        int int24 = property5.getMaximumTextLength(locale20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withLocale(locale20);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime();
        int int27 = mutableDateTime26.getDayOfMonth();
        org.joda.time.Instant instant28 = mutableDateTime26.toInstant();
        boolean boolean30 = mutableDateTime26.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int34 = dateTimeZone32.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime26.setZone(dateTimeZone32);
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Chronology chronology38 = localDate37.getChronology();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(chronology38);
        org.joda.time.DateTimeZone dateTimeZone40 = dateTime39.getZone();
        org.joda.time.MutableDateTime mutableDateTime41 = mutableDateTime26.toMutableDateTime(dateTimeZone40);
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate(dateTimeZone40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter2.withZone(dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int47 = dateTimeZone45.getOffsetFromLocal((long) (byte) 1);
        int int49 = dateTimeZone45.getOffset((long) 14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter43.withZone(dateTimeZone45);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone53);
        org.joda.time.DateTime dateTime55 = dateTime54.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime56 = dateTime55.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime56.year();
        org.joda.time.MutableDateTime mutableDateTime59 = property57.set("22");
        java.lang.Object obj60 = mutableDateTime59.clone();
        // The following exception was thrown during execution in test generation
        try {
            int int63 = dateTimeFormatter43.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime59, "20", 53593846);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1009843200021L + "'", long17 == 1009843200021L);
        org.junit.Assert.assertNull(durationField18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "21" + "'", str22, "21");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "fr" + "'", str23, "fr");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 21 + "'", int27 == 21);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatter50);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(mutableDateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(mutableDateTime59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertEquals(obj60.toString(), "0022-01-01T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj60), "0022-01-01T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj60), "0022-01-01T00:00:00.000Z");
    }

    @Test
    public void test15573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15573");
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.standard();
        java.lang.String str6 = periodType5.getName();
        org.joda.time.PeriodType periodType7 = periodType5.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(periodType7);
        org.joda.time.PeriodType periodType9 = periodType7.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(0L, 44L, periodType7);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 21, periodType7);
        org.joda.time.Period period12 = new org.joda.time.Period(492L, (long) 156, periodType7);
        org.joda.time.MutablePeriod mutablePeriod13 = period12.toMutablePeriod();
        int int14 = mutablePeriod13.getMillis();
        org.joda.time.Period period16 = org.joda.time.Period.weeks((int) (byte) 10);
        mutablePeriod13.mergePeriod((org.joda.time.ReadablePeriod) period16);
        int int18 = period16.getMonths();
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Standard" + "'", str6, "Standard");
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(mutablePeriod13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test15574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15574");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        int int3 = localDate2.getYearOfCentury();
        org.joda.time.LocalDate.Property property4 = localDate2.centuryOfEra();
        org.joda.time.LocalDate localDate5 = property4.roundFloorCopy();
        boolean boolean6 = property4.isLeap();
        org.joda.time.LocalDate localDate7 = property4.roundFloorCopy();
        org.joda.time.LocalDate localDate9 = property4.addWrapFieldToCopy(20);
        org.joda.time.Period period11 = new org.joda.time.Period((long) 55);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate9.withPeriodAdded((org.joda.time.ReadablePeriod) period11, 53766037);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 55 * 53766037");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69 + "'", int3 == 69);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test15575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15575");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(821L);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.plus(41L);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(chronology4);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.dayOfYear();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight5.withDurationAdded((long) 17, 1);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight5.withEra((int) (byte) 0);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight5.withWeekyear(2022);
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight1, (org.joda.time.ReadableInstant) dateMidnight13);
        org.joda.time.DateMidnight.Property property15 = dateMidnight13.yearOfCentury();
        int int16 = property15.getMaximumValueOverall();
        org.joda.time.DateMidnight dateMidnight17 = property15.roundFloorCopy();
        org.joda.time.DateMidnight dateMidnight19 = property15.addWrapFieldToCopy(53740666);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 99 + "'", int16 == 99);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(dateMidnight19);
    }

    @Test
    public void test15576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15576");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks(9);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int5 = localDate1.get(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusDays((int) (byte) 0);
        int int8 = localDate7.getEra();
        int int9 = localDate7.size();
        int[] intArray10 = localDate7.getValues();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1970, 1, 1]");
    }

    @Test
    public void test15577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15577");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType4 = periodType3.withWeeksRemoved();
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight1, readableDuration2, periodType3);
        org.joda.time.Period period7 = period5.withSeconds(0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone10);
        org.joda.time.DateTime dateTime12 = dateTime11.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime13 = dateTime11.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.withChronologyRetainFields(chronology17);
        org.joda.time.DateTime dateTime19 = timeOfDay18.toDateTimeToday();
        boolean boolean20 = dateTime13.isEqual((org.joda.time.ReadableInstant) dateTime19);
        int int21 = dateTime19.getWeekyear();
        org.joda.time.DateTime dateTime23 = dateTime19.plusHours(4);
        org.joda.time.Duration duration24 = period5.toDurationFrom((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Period period26 = period5.plusDays(999);
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = period5.normalizedStandard(periodType27);
        int int29 = period28.getYears();
        org.joda.time.Period period31 = period28.plusSeconds(1645454970);
        org.joda.time.Period period33 = period31.plusMinutes(53354664);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2022 + "'", int21 == 2022);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
    }

    @Test
    public void test15578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15578");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.ReadableInterval readableInterval5 = null;
        mutablePeriod4.add(readableInterval5);
        org.joda.time.PeriodType periodType7 = mutablePeriod4.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.weeks();
        int int9 = periodType7.indexOf(durationFieldType8);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod15 = mutablePeriod14.copy();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.TimeOfDay timeOfDay20 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.withChronologyRetainFields(chronology21);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray23 = timeOfDay22.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay22.plusHours((-1));
        org.joda.time.Chronology chronology26 = timeOfDay25.getChronology();
        mutablePeriod14.setPeriod((long) (byte) 1, 845L, chronology26);
        org.joda.time.Period period28 = new org.joda.time.Period((long) (byte) 1, chronology26);
        org.joda.time.Period period30 = period28.withMinutes((int) ' ');
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.years();
        org.joda.time.Period period32 = period28.normalizedStandard(periodType31);
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.minutes();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone37);
        org.joda.time.DateTime dateTime39 = dateTime38.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime39.toMutableDateTime();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.TimeOfDay timeOfDay43 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.TimeOfDay timeOfDay45 = timeOfDay43.withChronologyRetainFields(chronology44);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray46 = timeOfDay45.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay48 = timeOfDay45.plusHours((-1));
        org.joda.time.Chronology chronology49 = timeOfDay48.getChronology();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.TimeOfDay timeOfDay52 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology51);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.TimeOfDay timeOfDay54 = timeOfDay52.withChronologyRetainFields(chronology53);
        long long56 = chronology49.set((org.joda.time.ReadablePartial) timeOfDay52, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay57 = new org.joda.time.TimeOfDay(chronology49);
        org.joda.time.DateTime dateTime58 = dateTime39.toDateTime(chronology49);
        org.joda.time.DateTimeField dateTimeField59 = chronology49.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField60 = chronology49.millisOfDay();
        org.joda.time.DurationField durationField61 = chronology49.centuries();
        org.joda.time.Period period62 = new org.joda.time.Period(818L, periodType34, chronology49);
        org.joda.time.DateTimeField dateTimeField63 = chronology49.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone64 = chronology49.getZone();
        org.joda.time.Period period65 = new org.joda.time.Period(1028L, periodType31, chronology49);
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod(368L, 0L, periodType7, chronology49);
        org.joda.time.DateTimeField dateTimeField67 = chronology49.monthOfYear();
        org.joda.time.DateTimeField dateTimeField68 = chronology49.clockhourOfHalfday();
        long long71 = dateTimeField68.addWrapField((long) (-79847), 339);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(mutablePeriod15);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray46);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(timeOfDay52);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-86399999L) + "'", long56 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(durationField61);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(dateTimeZone64);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-32479847L) + "'", long71 == (-32479847L));
    }

    @Test
    public void test15579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15579");
        java.io.IOException iOException1 = new java.io.IOException("\u65e5\u672c");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException4 = new java.io.IOException("70");
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        iOException1.addSuppressed((java.lang.Throwable) iOException4);
    }

    @Test
    public void test15580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15580");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        int int3 = yearMonthDay0.getDayOfMonth();
        int int4 = yearMonthDay0.getDayOfMonth();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod8 = mutablePeriod7.copy();
        org.joda.time.format.PeriodFormatter periodFormatter9 = null;
        java.lang.String str10 = mutablePeriod8.toString(periodFormatter9);
        org.joda.time.YearMonthDay yearMonthDay12 = yearMonthDay0.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod8, (-1));
        org.joda.time.YearMonthDay.Property property13 = yearMonthDay12.year();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray14 = yearMonthDay12.getFieldTypes();
        org.joda.time.YearMonthDay yearMonthDay16 = yearMonthDay12.minusYears(1);
        org.joda.time.DateTime dateTime17 = yearMonthDay12.toDateTimeAtMidnight();
        int[] intArray18 = yearMonthDay12.getValues();
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay19.plusDays(2022);
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay21.withMonthOfYear(4);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateMidnight dateMidnight25 = yearMonthDay23.toDateMidnight(dateTimeZone24);
        java.util.Locale locale27 = java.util.Locale.GERMANY;
        java.lang.String str28 = dateTimeZone24.getShortName(781L, locale27);
        org.joda.time.DateMidnight dateMidnight29 = yearMonthDay12.toDateMidnight(dateTimeZone24);
        org.joda.time.LocalDate localDate30 = yearMonthDay12.toLocalDate();
        int int31 = yearMonthDay12.getYear();
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT0.099S" + "'", str10, "PT0.099S");
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray14);
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[2022, 2, 21]");
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2022 + "'", int31 == 2022);
    }

    @Test
    public void test15581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15581");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(chronology4);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight7 = property6.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone10);
        org.joda.time.DateTime dateTime12 = dateTime11.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime12.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.year();
        org.joda.time.DateTimeField dateTimeField15 = property14.getField();
        long long18 = dateTimeField15.add((long) 21, (long) ' ');
        org.joda.time.DurationField durationField19 = dateTimeField15.getRangeDurationField();
        java.util.Locale locale21 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.Character> charSet22 = locale21.getExtensionKeys();
        java.lang.String str23 = dateTimeField15.getAsText(21, locale21);
        java.lang.String str24 = locale21.getLanguage();
        int int25 = property6.getMaximumTextLength(locale21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter3.withLocale(locale21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter26.withPivotYear((java.lang.Integer) 1975);
        org.joda.time.format.DateTimePrinter dateTimePrinter29 = dateTimeFormatter26.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant30 = org.joda.time.Instant.parse("\u97d3\u6587\u5357\u97d3)", dateTimeFormatter26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1009843200021L + "'", long18 == 1009843200021L);
        org.junit.Assert.assertNull(durationField19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(charSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "21" + "'", str23, "21");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "fr" + "'", str24, "fr");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNull(dateTimePrinter29);
    }

    @Test
    public void test15582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15582");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(1);
        org.joda.time.LocalDate.Property property5 = localDate2.year();
        org.joda.time.LocalDate localDate6 = property5.withMaximumValue();
        org.joda.time.LocalDate localDate8 = property5.addToCopy((int) 'u');
        int int9 = localDate8.getDayOfMonth();
        org.joda.time.LocalDate localDate11 = localDate8.withCenturyOfEra(1900);
        org.joda.time.LocalDate localDate13 = localDate11.withWeekyear(53442580);
        int int14 = localDate11.getWeekyear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.withChronologyRetainFields(chronology18);
        org.joda.time.TimeOfDay.Property property20 = timeOfDay19.hourOfDay();
        int int21 = property20.get();
        java.lang.String str22 = property20.getAsText();
        org.joda.time.TimeOfDay timeOfDay23 = property20.withMaximumValue();
        org.joda.time.DateTimeField dateTimeField24 = property20.getField();
        java.lang.String str25 = property20.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property20.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            int int27 = localDate11.get(dateTimeFieldType26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 190087 + "'", int14 == 190087);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hourOfDay" + "'", str25, "hourOfDay");
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
    }

    @Test
    public void test15583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15583");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.year();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.addWrapField(6);
        org.joda.time.MutableDateTime mutableDateTime9 = property6.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property6.roundHalfFloor();
        int int11 = mutableDateTime10.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long15 = dateTimeZone12.adjustOffset((long) ' ', true);
        java.lang.Object obj16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(obj16, dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.secondOfMinute();
        long long20 = property19.remainder();
        org.joda.time.LocalDateTime localDateTime21 = property19.getLocalDateTime();
        boolean boolean23 = property19.equals((java.lang.Object) 1.0f);
        org.joda.time.LocalDateTime localDateTime25 = property19.setCopy((int) (short) 1);
        boolean boolean26 = dateTimeZone12.isLocalDateTimeGap(localDateTime25);
        mutableDateTime10.setZoneRetainFields(dateTimeZone12);
        int int28 = mutableDateTime10.getMillisOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1976 + "'", int11 == 1976);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(property19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 861L + "'", long20 == 861L);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test15584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15584");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        int int6 = localDateTime2.getValue(2);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone9);
        int int11 = dateTime10.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = dateTime10.toDateTime(dateTimeZone13);
        org.joda.time.DateTime.Property property16 = dateTime10.weekyear();
        org.joda.time.DateTime dateTime17 = property16.roundHalfEvenCopy();
        boolean boolean18 = localDateTime2.equals((java.lang.Object) property16);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime2.withMillisOfDay(272);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime2.minusWeeks(12);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime2.plusYears(28);
        org.joda.time.ReadablePartial readablePartial25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withFields(readablePartial25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.minusSeconds((-79847));
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
    }

    @Test
    public void test15585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15585");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(dateTimeZone1);
        org.joda.time.YearMonth yearMonth4 = yearMonth2.minusMonths((int) (byte) 100);
        org.joda.time.YearMonth yearMonth6 = yearMonth2.plusYears(100);
        org.joda.time.Period period9 = new org.joda.time.Period((long) (byte) 0, 0L);
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period11 = period9.withPeriodType(periodType10);
        org.joda.time.Period period13 = period9.minusMinutes((int) 'x');
        org.joda.time.YearMonth yearMonth14 = yearMonth2.plus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType19 = periodType18.withWeeksRemoved();
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight16, readableDuration17, periodType18);
        org.joda.time.Period period22 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period24 = period22.plusHours((int) '#');
        org.joda.time.Period period25 = period20.minus((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Period period26 = period20.toPeriod();
        org.joda.time.YearMonth yearMonth27 = yearMonth14.plus((org.joda.time.ReadablePeriod) period26);
        org.joda.time.Period period29 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period31 = period29.minusHours((int) '4');
        org.joda.time.Period period33 = period29.minusYears(10);
        org.joda.time.YearMonth yearMonth34 = yearMonth27.minus((org.joda.time.ReadablePeriod) period29);
        int int35 = yearMonth27.getMonthOfYear();
        int int36 = yearMonth27.getYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(yearMonth4);
        org.junit.Assert.assertNotNull(yearMonth6);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(yearMonth27);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(yearMonth34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2022 + "'", int36 == 2022);
    }

    @Test
    public void test15586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15586");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("PT10S");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setScript("");
        java.util.Locale.Builder builder7 = builder4.clear();
        java.util.Locale.Builder builder8 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.setExtension('#', "292278969-12-31");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test15587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15587");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        boolean boolean4 = mutableDateTime0.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int8 = dateTimeZone6.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime0.setZone(dateTimeZone6);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(dateTimeZone6);
        org.joda.time.LocalDate.Property property12 = localDate11.era();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        org.joda.time.LocalDate localDate15 = property12.addWrapFieldToCopy(0);
        org.joda.time.DateTimeField dateTimeField16 = property12.getField();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test15588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15588");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int3 = dateTimeZone1.getOffset(0L);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime5 = dateTime4.toDateTime();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withChronologyRetainFields(chronology9);
        org.joda.time.DateTime dateTime11 = timeOfDay10.toDateTimeToday();
        org.joda.time.DateTime dateTime13 = dateTime11.plusYears((int) 'u');
        org.joda.time.Chronology chronology14 = dateTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.era();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekOfWeekyear();
        org.joda.time.DateTime dateTime17 = dateTime5.toDateTime(chronology14);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime();
        int int19 = mutableDateTime18.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone22);
        org.joda.time.DateTime dateTime24 = dateTime23.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType26 = periodType25.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime18, (org.joda.time.ReadableInstant) dateTime23, periodType26);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod31 = mutablePeriod30.copy();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(chronology32);
        org.joda.time.DateMidnight.Property property34 = dateMidnight33.yearOfCentury();
        org.joda.time.Duration duration35 = mutablePeriod31.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight33);
        mutablePeriod27.setPeriod((org.joda.time.ReadableDuration) duration35);
        mutablePeriod27.setHours(1975);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone41);
        org.joda.time.DateTime dateTime43 = dateTime42.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime43.toMutableDateTime();
        org.joda.time.Interval interval45 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod27, (org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone48);
        org.joda.time.DateTime dateTime50 = dateTime49.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime51 = dateTime50.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime51.year();
        org.joda.time.MutableDateTime mutableDateTime54 = property52.addWrapField(6);
        java.util.Locale locale56 = java.util.Locale.FRANCE;
        org.joda.time.MutableDateTime mutableDateTime57 = property52.set("1", locale56);
        org.joda.time.Interval interval58 = interval45.withStart((org.joda.time.ReadableInstant) mutableDateTime57);
        org.joda.time.Interval interval61 = new org.joda.time.Interval((long) 2027, 1645454849969L);
        org.joda.time.Chronology chronology62 = interval61.getChronology();
        org.joda.time.YearMonthDay yearMonthDay63 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay65 = yearMonthDay63.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime66 = yearMonthDay63.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval67 = yearMonthDay63.toInterval();
        org.joda.time.MutableInterval mutableInterval68 = interval67.toMutableInterval();
        boolean boolean69 = mutableInterval68.isAfterNow();
        boolean boolean70 = interval61.overlaps((org.joda.time.ReadableInterval) mutableInterval68);
        boolean boolean71 = interval45.overlaps((org.joda.time.ReadableInterval) interval61);
        org.joda.time.Chronology chronology72 = interval61.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period73 = new org.joda.time.Period((java.lang.Object) dateTime5, chronology72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 21 + "'", int19 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(mutablePeriod31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(mutableDateTime54);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(mutableDateTime57);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(yearMonthDay65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertNotNull(mutableInterval68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(chronology72);
    }

    @Test
    public void test15589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15589");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withChronologyRetainFields(chronology9);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = timeOfDay10.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay10.plusHours((-1));
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.withChronologyRetainFields(chronology18);
        long long21 = chronology14.set((org.joda.time.ReadablePartial) timeOfDay17, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(chronology14);
        org.joda.time.DateTime dateTime23 = dateTime4.toDateTime(chronology14);
        org.joda.time.DateTimeField dateTimeField24 = chronology14.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = chronology14.yearOfCentury();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(chronology14);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-86399999L) + "'", long21 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
    }

    @Test
    public void test15590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15590");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        int int3 = yearMonthDay0.getDayOfMonth();
        int int4 = yearMonthDay0.getDayOfMonth();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = yearMonthDay0.getFieldTypes();
        int int6 = yearMonthDay0.size();
        org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay0.minusDays(6000001);
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(yearMonthDay8);
    }

    @Test
    public void test15591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15591");
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.ReadableInterval readableInterval14 = null;
        mutablePeriod13.add(readableInterval14);
        org.joda.time.PeriodType periodType16 = mutablePeriod13.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.weeks();
        int int18 = periodType16.indexOf(durationFieldType17);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(214L, periodType16);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(24, 59, 184, 0, 21, 81, 0, (int) 'u', periodType16);
        org.joda.time.Period period21 = new org.joda.time.Period((long) 554, periodType16);
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime();
        int int24 = mutableDateTime23.getDayOfMonth();
        org.joda.time.Instant instant25 = mutableDateTime23.toInstant();
        org.joda.time.MutableDateTime mutableDateTime26 = instant25.toMutableDateTime();
        org.joda.time.Instant instant27 = instant25.toInstant();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.TimeOfDay timeOfDay30 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay30.withChronologyRetainFields(chronology31);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray33 = timeOfDay32.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay32.plusHours((-1));
        org.joda.time.Chronology chronology36 = timeOfDay35.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.centuryOfEra();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(chronology38);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.PeriodType periodType41 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType42 = periodType41.withWeeksRemoved();
        org.joda.time.Period period43 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight39, readableDuration40, periodType41);
        org.joda.time.Period period45 = period43.withSeconds(0);
        org.joda.time.Period period47 = period45.plusMinutes((int) (byte) 1);
        org.joda.time.Period period49 = period45.withSeconds((int) (byte) 10);
        org.joda.time.Period period51 = period49.withMillis((int) 'x');
        int[] intArray54 = chronology36.get((org.joda.time.ReadablePeriod) period51, (long) 2022, (long) 6);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime();
        int int56 = mutableDateTime55.getDayOfMonth();
        org.joda.time.Instant instant57 = mutableDateTime55.toInstant();
        boolean boolean59 = mutableDateTime55.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int63 = dateTimeZone61.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime55.setZone(dateTimeZone61);
        mutableDateTime55.setMillisOfDay((int) ' ');
        org.joda.time.Duration duration67 = period51.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime55);
        org.joda.time.Instant instant68 = instant25.minus((org.joda.time.ReadableDuration) duration67);
        org.joda.time.Chronology chronology69 = instant68.getChronology();
        mutableDateTime22.setChronology(chronology69);
        org.joda.time.Period period71 = new org.joda.time.Period(41L, periodType16, chronology69);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 21 + "'", int24 == 21);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[0, 0, 0, 0, 0, -2, -16]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 21 + "'", int56 == 21);
        org.junit.Assert.assertNotNull(instant57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(instant68);
        org.junit.Assert.assertNotNull(chronology69);
    }

    @Test
    public void test15592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15592");
        org.joda.time.YearMonth yearMonth1 = org.joda.time.YearMonth.parse("190087");
        org.junit.Assert.assertNotNull(yearMonth1);
    }

    @Test
    public void test15593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15593");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime3.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths((int) '#');
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32770);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone12);
        org.joda.time.DateTime dateTime14 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime14.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.year();
        org.joda.time.MutableDateTime mutableDateTime18 = property16.addWrapField(6);
        org.joda.time.MutableDateTime mutableDateTime19 = property16.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime20 = property16.roundHalfFloor();
        int int21 = mutableDateTime20.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        long long25 = dateTimeZone22.adjustOffset((long) ' ', true);
        java.lang.Object obj26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(obj26, dateTimeZone27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.secondOfMinute();
        long long30 = property29.remainder();
        org.joda.time.LocalDateTime localDateTime31 = property29.getLocalDateTime();
        boolean boolean33 = property29.equals((java.lang.Object) 1.0f);
        org.joda.time.LocalDateTime localDateTime35 = property29.setCopy((int) (short) 1);
        boolean boolean36 = dateTimeZone22.isLocalDateTimeGap(localDateTime35);
        mutableDateTime20.setZoneRetainFields(dateTimeZone22);
        boolean boolean38 = dateTime7.isEqual((org.joda.time.ReadableInstant) mutableDateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1976 + "'", int21 == 1976);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertNotNull(property29);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 63L + "'", long30 == 63L);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test15594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15594");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks(9);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int5 = localDate1.get(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusDays((int) (byte) 0);
        org.joda.time.DateTime dateTime8 = localDate1.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds(346);
        org.joda.time.DateTime dateTime12 = dateTime8.plusMonths(86399);
        java.util.Locale locale13 = null;
        java.util.Calendar calendar14 = dateTime8.toCalendar(locale13);
        org.joda.time.DateTime dateTime15 = dateTime8.toDateTime();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test15595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15595");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("22");
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate5 = localDate3.plusWeeks(9);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int7 = localDate3.get(dateTimeFieldType6);
        org.joda.time.DateTime dateTime8 = dateTime1.withFields((org.joda.time.ReadablePartial) localDate3);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = yearMonthDay9.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.DateTime dateTime15 = dateTime1.withChronology(chronology14);
        org.joda.time.DateTime dateTime16 = dateTime1.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property17 = dateTime1.secondOfDay();
        org.joda.time.DateTime dateTime18 = property17.withMaximumValue();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (short) -1, chronology20);
        int int22 = localDate21.getYearOfCentury();
        org.joda.time.LocalDate.Property property23 = localDate21.centuryOfEra();
        org.joda.time.LocalDate localDate25 = property23.addWrapFieldToCopy(9);
        org.joda.time.LocalDate localDate27 = property23.addWrapFieldToCopy(17);
        org.joda.time.LocalDate localDate28 = property23.roundFloorCopy();
        org.joda.time.LocalDate localDate29 = property23.withMaximumValue();
        boolean boolean30 = dateTime18.equals((java.lang.Object) property23);
        org.joda.time.LocalDate localDate31 = property23.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate32 = property23.roundCeilingCopy();
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 69 + "'", int22 == 69);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate32);
    }

    @Test
    public void test15596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15596");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime3 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval4 = yearMonthDay0.toInterval();
        org.joda.time.Period period5 = interval4.toPeriod();
        org.joda.time.Interval interval6 = interval4.toInterval();
        org.joda.time.MutableInterval mutableInterval7 = interval4.toMutableInterval();
        org.joda.time.Period period8 = interval4.toPeriod();
        long long9 = interval4.getStartMillis();
        org.joda.time.Interval interval11 = interval4.withStartMillis(348L);
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(mutableInterval7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1645401600000L + "'", long9 == 1645401600000L);
        org.junit.Assert.assertNotNull(interval11);
    }

    @Test
    public void test15597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15597");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(chronology4);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight7 = property6.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone10);
        org.joda.time.DateTime dateTime12 = dateTime11.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime12.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.year();
        org.joda.time.DateTimeField dateTimeField15 = property14.getField();
        long long18 = dateTimeField15.add((long) 21, (long) ' ');
        org.joda.time.DurationField durationField19 = dateTimeField15.getRangeDurationField();
        java.util.Locale locale21 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.Character> charSet22 = locale21.getExtensionKeys();
        java.lang.String str23 = dateTimeField15.getAsText(21, locale21);
        java.lang.String str24 = locale21.getLanguage();
        int int25 = property6.getMaximumTextLength(locale21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter3.withLocale(locale21);
        org.joda.time.Chronology chronology27 = dateTimeFormatter3.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter3.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight29 = org.joda.time.DateMidnight.parse("T00:00:00.017", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1009843200021L + "'", long18 == 1009843200021L);
        org.junit.Assert.assertNull(durationField19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(charSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "21" + "'", str23, "21");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "fr" + "'", str24, "fr");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
    }

    @Test
    public void test15598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15598");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.year();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime10 = property6.addWrapField(12);
        org.joda.time.MutableDateTime mutableDateTime11 = property6.getMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime11.setDayOfYear(533764);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 533764 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
    }

    @Test
    public void test15599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15599");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.withChronologyRetainFields(chronology4);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray6 = timeOfDay5.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay5.plusHours((-1));
        org.joda.time.TimeOfDay.Property property9 = timeOfDay5.millisOfSecond();
        org.joda.time.DurationField durationField10 = property9.getDurationField();
        java.lang.String str11 = property9.getAsShortText();
        int int12 = property9.getMaximumValue();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.withChronologyRetainFields(chronology16);
        org.joda.time.DateTime dateTime18 = timeOfDay17.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay17.minusHours((int) (byte) 1);
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = timeOfDay17.toString("1", locale22);
        java.lang.String str24 = property9.getAsShortText(locale22);
        java.util.Locale.setDefault(category0, locale22);
        java.util.Locale locale26 = java.util.Locale.getDefault(category0);
        java.util.Locale locale30 = new java.util.Locale("\u5fb7\u6587\u5fb7\u56fd)", "java.io.IOException: 22", "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
        java.lang.String str31 = locale26.getDisplayScript(locale30);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 999 + "'", int12 == 999);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1" + "'", str23, "1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1" + "'", str24, "1");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "\u5fb7\u6587\u5fb7\u56fd\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test15600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15600");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(149L, dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((-1645415999), 972, 0, 365, 2508705, (int) (short) -1, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
    }

    @Test
    public void test15601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15601");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        org.joda.time.YearMonthDay yearMonthDay4 = property3.withMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay6 = property3.setCopy(20);
        int int7 = property3.getMinimumValueOverall();
        int int8 = property3.getMaximumValueOverall();
        org.joda.time.YearMonthDay yearMonthDay9 = property3.withMaximumValue();
        org.joda.time.YearMonthDay yearMonthDay11 = property3.setCopy(53741000);
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-292275054) + "'", int7 == (-292275054));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 292278993 + "'", int8 == 292278993);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
    }

    @Test
    public void test15602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15602");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime3 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval4 = yearMonthDay0.toInterval();
        org.joda.time.Period period5 = interval4.toPeriod();
        org.joda.time.Interval interval6 = interval4.toInterval();
        org.joda.time.MutableInterval mutableInterval7 = interval4.toMutableInterval();
        org.joda.time.Period period8 = interval4.toPeriod();
        org.joda.time.MutableInterval mutableInterval9 = interval4.toMutableInterval();
        org.joda.time.Chronology chronology10 = interval4.getChronology();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime();
        int int12 = mutableDateTime11.getDayOfMonth();
        org.joda.time.Instant instant13 = mutableDateTime11.toInstant();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        boolean boolean16 = mutableDateTime11.isBefore((org.joda.time.ReadableInstant) mutableDateTime15);
        boolean boolean17 = interval4.contains((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(chronology18);
        org.joda.time.DateMidnight.Property property20 = dateMidnight19.dayOfYear();
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight19.withDurationAdded((long) 17, 1);
        int int24 = dateMidnight19.getYearOfEra();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime11, (org.joda.time.ReadableInstant) dateMidnight19);
        org.joda.time.DateMidnight.Property property26 = dateMidnight19.dayOfMonth();
        int int27 = property26.getMinimumValue();
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(mutableInterval7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(mutableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2022 + "'", int24 == 2022);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test15603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15603");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.minusYears((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime();
        int int7 = mutableDateTime6.getDayOfMonth();
        org.joda.time.Instant instant8 = mutableDateTime6.toInstant();
        org.joda.time.MutableDateTime mutableDateTime9 = instant8.toMutableDateTime();
        boolean boolean10 = dateTime3.isEqual((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Instant instant12 = instant8.plus((long) 15);
        org.joda.time.Instant instant13 = instant8.toInstant();
        org.joda.time.Chronology chronology14 = instant13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.millis();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(83721600845L, (long) (short) 1, periodType2, chronology14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(chronology17);
        org.joda.time.DateMidnight.Property property19 = dateMidnight18.era();
        java.lang.String str20 = dateMidnight18.toString();
        org.joda.time.DateTimeZone dateTimeZone21 = dateMidnight18.getZone();
        org.joda.time.DateMidnight.Property property22 = dateMidnight18.weekyear();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime();
        int int24 = mutableDateTime23.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int28 = dateTimeZone26.getOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime23.toMutableDateTime(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime();
        int int31 = mutableDateTime30.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone34);
        org.joda.time.DateTime dateTime36 = dateTime35.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType37 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType38 = periodType37.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime30, (org.joda.time.ReadableInstant) dateTime35, periodType38);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod43 = mutablePeriod42.copy();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight(chronology44);
        org.joda.time.DateMidnight.Property property46 = dateMidnight45.yearOfCentury();
        org.joda.time.Duration duration47 = mutablePeriod43.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight45);
        mutablePeriod39.setPeriod((org.joda.time.ReadableDuration) duration47);
        org.joda.time.Period period49 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime23, (org.joda.time.ReadableDuration) duration47);
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight18.minus((org.joda.time.ReadableDuration) duration47);
        java.lang.String str51 = duration47.toString();
        mutablePeriod16.add((org.joda.time.ReadableDuration) duration47);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 21 + "'", int7 == 21);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2022-02-21T00:00:00.000Z" + "'", str20, "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 21 + "'", int24 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 21 + "'", int31 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(mutablePeriod43);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(dateMidnight50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "PT0.099S" + "'", str51, "PT0.099S");
    }

    @Test
    public void test15604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15604");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("27", (double) 25295244969599949L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=2.5295244969599948E16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15605");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.plusDays(2022);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay2.withField(dateTimeFieldType3, 69);
        java.lang.String str6 = yearMonthDay5.toString();
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.lang.String str9 = yearMonthDay5.toString("46800010", locale8);
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0069-09-05" + "'", str6, "0069-09-05");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "46800010" + "'", str9, "46800010");
    }

    @Test
    public void test15606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15606");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        int int3 = localDate2.getYearOfCentury();
        org.joda.time.LocalDate.Property property4 = localDate2.centuryOfEra();
        org.joda.time.LocalDate localDate6 = property4.addWrapFieldToCopy(9);
        org.joda.time.LocalDate localDate8 = localDate6.withCenturyOfEra(818);
        org.joda.time.DateMidnight dateMidnight9 = localDate8.toDateMidnight();
        org.joda.time.LocalDate localDate11 = localDate8.plusDays(9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(chronology12);
        org.joda.time.LocalDate localDate14 = dateMidnight13.toLocalDate();
        org.joda.time.LocalDate.Property property15 = localDate14.monthOfYear();
        org.joda.time.LocalDate localDate17 = localDate14.plusYears((-1898));
        org.joda.time.LocalDate.Property property18 = localDate17.dayOfMonth();
        org.joda.time.LocalDate localDate20 = localDate17.minusMonths(12);
        org.joda.time.LocalDate localDate22 = localDate17.plusYears(465);
        boolean boolean23 = localDate11.equals((java.lang.Object) localDate17);
        org.joda.time.LocalDate localDate25 = localDate17.plusWeeks(53800000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69 + "'", int3 == 69);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localDate25);
    }

    @Test
    public void test15607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15607");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.year();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.addWrapField(6);
        mutableDateTime8.addDays((int) (byte) -1);
        int int11 = mutableDateTime8.getYear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(chronology12);
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.dayOfYear();
        org.joda.time.DateMidnight dateMidnight15 = property14.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight.Property property17 = dateMidnight15.property(dateTimeFieldType16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime8.property(dateTimeFieldType16);
        org.joda.time.DateTimeField dateTimeField19 = property18.getField();
        org.joda.time.MutableDateTime mutableDateTime21 = property18.add((long) 2139);
        org.joda.time.MutableDateTime mutableDateTime22 = property18.roundFloor();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1975 + "'", int11 == 1975);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
    }

    @Test
    public void test15608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15608");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone3);
        org.joda.time.DateTime dateTime5 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.withChronologyRetainFields(chronology10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = timeOfDay11.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay11.plusHours((-1));
        org.joda.time.Chronology chronology15 = timeOfDay14.getChronology();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.withChronologyRetainFields(chronology19);
        long long22 = chronology15.set((org.joda.time.ReadablePartial) timeOfDay18, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(chronology15);
        org.joda.time.DateTime dateTime24 = dateTime5.toDateTime(chronology15);
        org.joda.time.DateTimeField dateTimeField25 = chronology15.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 1, chronology15);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.hourOfDay();
        java.lang.Object obj28 = mutableDateTime26.clone();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone31);
        org.joda.time.DateTime dateTime33 = dateTime32.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime33.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime34.year();
        org.joda.time.MutableDateTime mutableDateTime37 = property35.addWrapField(6);
        java.util.Locale locale39 = java.util.Locale.FRANCE;
        org.joda.time.MutableDateTime mutableDateTime40 = property35.set("1", locale39);
        org.joda.time.MutableDateTime mutableDateTime42 = property35.addWrapField(21);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime();
        int int44 = mutableDateTime43.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone47);
        org.joda.time.DateTime dateTime49 = dateTime48.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType50 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType51 = periodType50.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime43, (org.joda.time.ReadableInstant) dateTime48, periodType51);
        org.joda.time.DateTime dateTime53 = dateTime48.toDateTimeISO();
        boolean boolean54 = mutableDateTime42.isBefore((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime();
        int int56 = mutableDateTime55.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int60 = dateTimeZone58.getOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime61 = mutableDateTime55.toMutableDateTime(dateTimeZone58);
        int int63 = dateTimeZone58.getOffsetFromLocal(1650865L);
        org.joda.time.DateTime dateTime64 = dateTime53.withZoneRetainFields(dateTimeZone58);
        boolean boolean65 = mutableDateTime26.isBefore((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateMidnight dateMidnight66 = dateTime53.toDateMidnight();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-86399999L) + "'", long22 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 21 + "'", int44 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 21 + "'", int56 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(dateMidnight66);
    }

    @Test
    public void test15609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15609");
        org.joda.time.Period period1 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period3 = period1.plusHours((int) '#');
        org.joda.time.Period period4 = period1.toPeriod();
        org.joda.time.Duration duration5 = period4.toStandardDuration();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.dayOfYear();
        org.joda.time.DateMidnight dateMidnight9 = property8.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight.Property property11 = dateMidnight9.property(dateTimeFieldType10);
        org.joda.time.Interval interval12 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration5, (org.joda.time.ReadableInstant) dateMidnight9);
        long long13 = interval12.getStartMillis();
        org.joda.time.Duration duration14 = interval12.toDuration();
        java.lang.String str15 = duration14.toString();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone18);
        org.joda.time.DateTime dateTime20 = dateTime19.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime21 = dateTime19.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.monthOfYear();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight.Property property27 = dateMidnight26.yearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime23, (org.joda.time.ReadableInstant) dateMidnight26);
        int int29 = dateMidnight26.getMinuteOfHour();
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.minutes();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone34);
        org.joda.time.DateTime dateTime36 = dateTime35.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime36.toMutableDateTime();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.TimeOfDay timeOfDay40 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology39);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.TimeOfDay timeOfDay42 = timeOfDay40.withChronologyRetainFields(chronology41);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray43 = timeOfDay42.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay45 = timeOfDay42.plusHours((-1));
        org.joda.time.Chronology chronology46 = timeOfDay45.getChronology();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.TimeOfDay timeOfDay49 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology48);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.TimeOfDay timeOfDay51 = timeOfDay49.withChronologyRetainFields(chronology50);
        long long53 = chronology46.set((org.joda.time.ReadablePartial) timeOfDay49, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay54 = new org.joda.time.TimeOfDay(chronology46);
        org.joda.time.DateTime dateTime55 = dateTime36.toDateTime(chronology46);
        org.joda.time.DateTimeField dateTimeField56 = chronology46.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField57 = chronology46.millisOfDay();
        org.joda.time.DurationField durationField58 = chronology46.centuries();
        org.joda.time.Period period59 = new org.joda.time.Period(818L, periodType31, chronology46);
        org.joda.time.Period period60 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableInstant) dateMidnight26, periodType31);
        org.joda.time.Interval interval61 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration14, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime62 = dateTime19.toDateTime();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1645401599948L + "'", long13 == 1645401599948L);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT0.052S" + "'", str15, "PT0.052S");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray43);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(timeOfDay49);
        org.junit.Assert.assertNotNull(timeOfDay51);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-86399999L) + "'", long53 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(dateTime62);
    }

    @Test
    public void test15610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15610");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 0, 0L);
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period4 = period2.withPeriodType(periodType3);
        org.joda.time.Period period6 = period2.withDays((int) (short) 100);
        int int7 = period2.size();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.standard();
        java.lang.String str9 = periodType8.getName();
        org.joda.time.PeriodType periodType10 = periodType8.withMillisRemoved();
        org.joda.time.Period period11 = period2.normalizedStandard(periodType8);
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType15 = null;
        boolean boolean16 = periodType14.isSupported(durationFieldType15);
        org.joda.time.Period period17 = new org.joda.time.Period((long) (byte) 1, 0L, periodType14);
        org.joda.time.Period period19 = period17.minusMinutes((int) ' ');
        org.joda.time.Period period20 = period17.toPeriod();
        int int21 = period20.getSeconds();
        org.joda.time.Period period22 = period11.plus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Period period24 = period20.minusSeconds(32770);
        org.joda.time.Period period25 = period24.toPeriod();
        org.joda.time.Duration duration26 = period24.toStandardDuration();
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Standard" + "'", str9, "Standard");
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration26);
    }

    @Test
    public void test15611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15611");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(141, 25);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test15612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15612");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType3 = periodType2.withSecondsRemoved();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone6);
        org.joda.time.DateTime dateTime8 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTime();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.TimeOfDay timeOfDay12 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.withChronologyRetainFields(chronology13);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = timeOfDay14.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay14.plusHours((-1));
        org.joda.time.Chronology chronology18 = timeOfDay17.getChronology();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.TimeOfDay timeOfDay21 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay21.withChronologyRetainFields(chronology22);
        long long25 = chronology18.set((org.joda.time.ReadablePartial) timeOfDay21, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(chronology18);
        org.joda.time.DateTime dateTime27 = dateTime8.toDateTime(chronology18);
        org.joda.time.DateTimeField dateTimeField28 = chronology18.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField29 = chronology18.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = chronology18.minuteOfDay();
        org.joda.time.DurationField durationField31 = chronology18.days();
        org.joda.time.DurationField durationField32 = chronology18.halfdays();
        org.joda.time.DateTimeField dateTimeField33 = chronology18.centuryOfEra();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(470L, 0L, periodType2, chronology18);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(184L);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.weekyears();
        int int38 = mutablePeriod36.get(durationFieldType37);
        org.joda.time.PeriodType periodType39 = mutablePeriod36.getPeriodType();
        org.joda.time.PeriodType periodType40 = periodType39.withSecondsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((java.lang.Object) chronology18, periodType40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-86399999L) + "'", long25 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType40);
    }

    @Test
    public void test15613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15613");
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod4 = mutablePeriod3.copy();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.withChronologyRetainFields(chronology10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = timeOfDay11.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay11.plusHours((-1));
        org.joda.time.Chronology chronology15 = timeOfDay14.getChronology();
        mutablePeriod3.setPeriod((long) (byte) 1, 845L, chronology15);
        org.joda.time.Period period17 = new org.joda.time.Period((long) (byte) 1, chronology15);
        org.joda.time.DurationField durationField18 = chronology15.seconds();
        org.joda.time.DurationField durationField19 = chronology15.centuries();
        org.joda.time.DurationField durationField20 = chronology15.halfdays();
        int int22 = durationField20.getValue(376L);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test15614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15614");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale5 = new java.util.Locale("hi!", "hi!");
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale9 = new java.util.Locale("hi!", "hi!");
        java.util.Locale[] localeArray10 = new java.util.Locale[] { locale5, locale6, locale9 };
        java.util.ArrayList<java.util.Locale> localeList11 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList11, localeArray10);
        java.util.Locale.FilteringMode filteringMode13 = null;
        java.util.List<java.util.Locale> localeList14 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList11, filteringMode13);
        java.util.Locale locale15 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList17 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet16);
        java.util.Locale locale20 = new java.util.Locale("2022-02-21T14:47:24.813", "zho");
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList22 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet21);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap23 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap23);
        java.util.Calendar.Builder builder25 = new java.util.Calendar.Builder();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(readableDuration29, (org.joda.time.ReadableInstant) mutableDateTime30);
        int[] intArray33 = chronology28.get((org.joda.time.ReadablePeriod) mutablePeriod31, (long) 100);
        java.util.Calendar.Builder builder34 = builder25.setFields(intArray33);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone37);
        org.joda.time.DateTime dateTime39 = dateTime38.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime39.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime40.year();
        org.joda.time.DateTimeField dateTimeField42 = property41.getField();
        java.util.Locale locale43 = java.util.Locale.PRC;
        java.lang.String str44 = locale43.getDisplayScript();
        java.util.Locale.setDefault(locale43);
        java.lang.String str46 = locale43.getISO3Language();
        java.util.Locale locale47 = java.util.Locale.ENGLISH;
        java.lang.String str48 = locale43.getDisplayScript(locale47);
        int int49 = dateTimeField42.getMaximumShortTextLength(locale47);
        java.util.Calendar.Builder builder50 = builder25.setLocale(locale47);
        java.util.Set<java.lang.String> strSet51 = locale47.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray52 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList53 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList53, languageRangeArray52);
        java.util.Locale locale57 = new java.util.Locale("hi!", "hi!");
        java.util.Locale locale58 = java.util.Locale.FRANCE;
        java.util.Locale locale61 = new java.util.Locale("hi!", "hi!");
        java.util.Locale[] localeArray62 = new java.util.Locale[] { locale57, locale58, locale61 };
        java.util.ArrayList<java.util.Locale> localeList63 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList63, localeArray62);
        java.util.Locale.FilteringMode filteringMode65 = null;
        java.util.List<java.util.Locale> localeList66 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList53, (java.util.Collection<java.util.Locale>) localeList63, filteringMode65);
        java.lang.String[] strArray77 = new java.lang.String[] { "1", "12 Nov 1900 10:21:00 GMT", "PeriodType[Standard]", "", "", "1967-11-12 10:21:00", "2022-02-21T00:00:00.000Z", "PeriodType[Standard]", "\u4e2d\u6587", "PeriodType[Standard]" };
        java.util.ArrayList<java.lang.String> strList78 = new java.util.ArrayList<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList78, strArray77);
        java.util.List<java.lang.String> strList80 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList53, (java.util.Collection<java.lang.String>) strList78);
        java.util.Locale.LanguageRange[] languageRangeArray81 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList82 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList82, languageRangeArray81);
        java.util.Locale locale86 = new java.util.Locale("hi!", "hi!");
        java.util.Locale locale87 = java.util.Locale.FRANCE;
        java.util.Locale locale90 = new java.util.Locale("hi!", "hi!");
        java.util.Locale[] localeArray91 = new java.util.Locale[] { locale86, locale87, locale90 };
        java.util.ArrayList<java.util.Locale> localeList92 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList92, localeArray91);
        java.util.Locale.FilteringMode filteringMode94 = null;
        java.util.List<java.util.Locale> localeList95 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList82, (java.util.Collection<java.util.Locale>) localeList92, filteringMode94);
        java.util.Locale.FilteringMode filteringMode96 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList97 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList53, (java.util.Collection<java.util.Locale>) localeList95, filteringMode96);
        java.util.List<java.lang.String> strList98 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet51, filteringMode96);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!_HI!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale9.toString(), "hi!_HI!");
        org.junit.Assert.assertNotNull(localeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(localeList14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals(locale20.toString(), "2022-02-21t14:47:24.813_ZHO");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(languageRangeList24);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "zho" + "'", str46, "zho");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 9 + "'", int49 == 9);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertNotNull(languageRangeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals(locale57.toString(), "hi!_HI!");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale61.toString(), "hi!_HI!");
        org.junit.Assert.assertNotNull(localeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(localeList66);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(strList80);
        org.junit.Assert.assertNotNull(languageRangeArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals(locale86.toString(), "hi!_HI!");
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale90.toString(), "hi!_HI!");
        org.junit.Assert.assertNotNull(localeArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(localeList95);
        org.junit.Assert.assertTrue("'" + filteringMode96 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode96.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList97);
        org.junit.Assert.assertNotNull(strList98);
    }

    @Test
    public void test15615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15615");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(119L);
    }

    @Test
    public void test15616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15616");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.year();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.set("22");
        mutableDateTime8.setSecondOfDay(0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(chronology11);
        org.joda.time.DateMidnight.Property property13 = dateMidnight12.era();
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight12.minusWeeks((int) (short) 0);
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime8, (org.joda.time.ReadableInstant) dateMidnight15);
        java.lang.Object obj17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(obj17, dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.minus((org.joda.time.ReadablePeriod) mutablePeriod24);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod29 = mutablePeriod28.copy();
        mutablePeriod24.add((org.joda.time.ReadablePeriod) mutablePeriod29);
        org.joda.time.MutablePeriod mutablePeriod31 = mutablePeriod29.toMutablePeriod();
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight15.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod29, (int) (byte) 10);
        org.joda.time.DateMidnight.Property property34 = dateMidnight15.yearOfCentury();
        int int35 = dateMidnight15.getMinuteOfHour();
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight15.withDayOfMonth(4);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(mutablePeriod29);
        org.junit.Assert.assertNotNull(mutablePeriod31);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(dateMidnight37);
    }

    @Test
    public void test15617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15617");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone4);
        org.joda.time.DateTime dateTime6 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime6.toMutableDateTime();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.withChronologyRetainFields(chronology11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = timeOfDay12.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay12.plusHours((-1));
        org.joda.time.Chronology chronology16 = timeOfDay15.getChronology();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay19.withChronologyRetainFields(chronology20);
        long long23 = chronology16.set((org.joda.time.ReadablePartial) timeOfDay19, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay(chronology16);
        org.joda.time.DateTime dateTime25 = dateTime6.toDateTime(chronology16);
        org.joda.time.DateTimeField dateTimeField26 = chronology16.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = chronology16.millisOfDay();
        org.joda.time.DurationField durationField28 = chronology16.centuries();
        org.joda.time.Period period29 = new org.joda.time.Period(818L, periodType1, chronology16);
        org.joda.time.DateTimeField dateTimeField30 = chronology16.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone31 = chronology16.getZone();
        long long35 = chronology16.add((long) 32770, 818L, 5);
        org.joda.time.DateTimeField dateTimeField36 = chronology16.monthOfYear();
        boolean boolean37 = dateTimeField36.isSupported();
        long long39 = dateTimeField36.roundHalfEven(290L);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-86399999L) + "'", long23 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 36860L + "'", long35 == 36860L);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    }

    @Test
    public void test15618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15618");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int3 = dateTimeZone1.getOffset(0L);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime.Property property5 = dateTime4.minuteOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(23);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType9 = dateTimeFieldType8.getRangeDurationType();
        org.joda.time.DateTime.Property property10 = dateTime4.property(dateTimeFieldType8);
        org.joda.time.DateTime dateTime11 = property10.withMaximumValue();
        org.joda.time.DateTime dateTime13 = dateTime11.withDayOfYear(52);
        org.joda.time.DateTime dateTime14 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(chronology15);
        org.joda.time.DateMidnight.Property property17 = dateMidnight16.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight18 = property17.roundHalfEvenCopy();
        org.joda.time.DateMidnight.Property property19 = dateMidnight18.monthOfYear();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(chronology20);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType24 = periodType23.withWeeksRemoved();
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight21, readableDuration22, periodType23);
        org.joda.time.Period period27 = period25.withSeconds(0);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone30);
        org.joda.time.DateTime dateTime32 = dateTime31.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime33 = dateTime31.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.TimeOfDay timeOfDay36 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay36.withChronologyRetainFields(chronology37);
        org.joda.time.DateTime dateTime39 = timeOfDay38.toDateTimeToday();
        boolean boolean40 = dateTime33.isEqual((org.joda.time.ReadableInstant) dateTime39);
        int int41 = dateTime39.getWeekyear();
        org.joda.time.DateTime dateTime43 = dateTime39.plusHours(4);
        org.joda.time.Duration duration44 = period25.toDurationFrom((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Period period46 = period25.withMillis(69);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight18.withPeriodAdded((org.joda.time.ReadablePeriod) period25, 11);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime();
        org.joda.time.Instant instant50 = dateTime49.toInstant();
        org.joda.time.Instant instant52 = instant50.plus(41L);
        org.joda.time.MutableDateTime mutableDateTime53 = instant52.toMutableDateTime();
        org.joda.time.Period period55 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period57 = period55.plusHours((int) '#');
        org.joda.time.Period period58 = period55.toPeriod();
        org.joda.time.Duration duration59 = period58.toStandardDuration();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight(chronology60);
        org.joda.time.DateMidnight.Property property62 = dateMidnight61.dayOfYear();
        org.joda.time.DateMidnight dateMidnight63 = property62.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight.Property property65 = dateMidnight63.property(dateTimeFieldType64);
        org.joda.time.Interval interval66 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration59, (org.joda.time.ReadableInstant) dateMidnight63);
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.ReadableInterval readableInterval70 = null;
        mutablePeriod69.add(readableInterval70);
        org.joda.time.PeriodType periodType72 = mutablePeriod69.getPeriodType();
        org.joda.time.Period period73 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime53, (org.joda.time.ReadableDuration) duration59, periodType72);
        org.joda.time.Period period74 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight48, (org.joda.time.ReadableDuration) duration59);
        org.joda.time.Period period75 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableDuration) duration59);
        java.lang.String str76 = period75.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2022 + "'", int41 == 2022);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(dateMidnight48);
        org.junit.Assert.assertNotNull(instant50);
        org.junit.Assert.assertNotNull(instant52);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(dateMidnight63);
        org.junit.Assert.assertNotNull(dateTimeFieldType64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(periodType72);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "PT0.052S" + "'", str76, "PT0.052S");
    }

    @Test
    public void test15619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15619");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        int int3 = localDateTime2.getCenturyOfEra();
        int int4 = localDateTime2.getCenturyOfEra();
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(obj5, dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusYears((int) (short) 0);
        int int11 = localDateTime7.getValue(2);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone14);
        int int16 = dateTime15.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = dateTime15.toDateTime(dateTimeZone18);
        org.joda.time.DateTime.Property property21 = dateTime15.weekyear();
        org.joda.time.DateTime dateTime22 = property21.roundHalfEvenCopy();
        boolean boolean23 = localDateTime7.equals((java.lang.Object) property21);
        int int24 = localDateTime7.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime7.withHourOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusHours(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime.Property property30 = localDateTime28.property(dateTimeFieldType29);
        int int31 = localDateTime2.indexOf(dateTimeFieldType29);
        org.joda.time.LocalDateTime.Property property32 = localDateTime2.weekyear();
        org.joda.time.DurationField durationField33 = property32.getDurationField();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 21 + "'", int11 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(durationField33);
    }

    @Test
    public void test15620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15620");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusYears((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime0.toMutableDateTime();
        int int4 = mutableDateTime3.getRoundingMode();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundCeiling();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
    }

    @Test
    public void test15621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15621");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks(9);
        org.joda.time.Period period5 = new org.joda.time.Period((long) '4');
        org.joda.time.LocalDate localDate6 = localDate3.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.LocalDate.Property property7 = localDate3.centuryOfEra();
        org.joda.time.LocalDate localDate9 = property7.addToCopy(10);
        org.joda.time.LocalDate.Property property10 = localDate9.era();
        java.util.Date date11 = localDate9.toDate();
        org.joda.time.LocalDate localDate13 = localDate9.minusWeeks(13);
        org.joda.time.LocalDate.Property property14 = localDate13.dayOfWeek();
        org.joda.time.LocalDate localDate16 = localDate13.withWeekyear(339);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localDate13.getValue((-40));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -40");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Mon Mar 05 00:00:00 UTC 2970");
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test15622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15622");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks(9);
        org.joda.time.Period period5 = new org.joda.time.Period((long) '4');
        org.joda.time.LocalDate localDate6 = localDate3.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.LocalDate.Property property7 = localDate3.centuryOfEra();
        org.joda.time.LocalDate localDate9 = property7.setCopy(58);
        org.joda.time.LocalDate localDate11 = localDate9.minusDays(0);
        int int12 = localDate11.getDayOfMonth();
        org.joda.time.LocalDate.Property property13 = localDate11.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField14 = property13.getField();
        org.joda.time.LocalDate localDate16 = property13.addToCopy(2021);
        int int17 = property13.getLeapAmount();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test15623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15623");
        org.joda.time.YearMonth yearMonth0 = new org.joda.time.YearMonth();
        org.joda.time.Period period2 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period4 = period2.minusHours((int) '4');
        org.joda.time.YearMonth yearMonth5 = yearMonth0.plus((org.joda.time.ReadablePeriod) period2);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType10 = periodType9.withWeeksRemoved();
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight7, readableDuration8, periodType9);
        org.joda.time.Period period13 = period11.withSeconds(0);
        org.joda.time.Period period15 = period13.plusMinutes((int) (byte) 1);
        org.joda.time.Period period17 = period13.withSeconds((int) (byte) 10);
        org.joda.time.Period period19 = period17.withMillis((int) 'x');
        boolean boolean20 = yearMonth5.equals((java.lang.Object) 'x');
        org.joda.time.YearMonth yearMonth22 = yearMonth5.minusMonths(8);
        java.lang.String str23 = yearMonth22.toString();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime();
        int int25 = mutableDateTime24.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone28);
        org.joda.time.DateTime dateTime30 = dateTime29.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType32 = periodType31.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime24, (org.joda.time.ReadableInstant) dateTime29, periodType32);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod37 = mutablePeriod36.copy();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(chronology38);
        org.joda.time.DateMidnight.Property property40 = dateMidnight39.yearOfCentury();
        org.joda.time.Duration duration41 = mutablePeriod37.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight39);
        mutablePeriod33.setPeriod((org.joda.time.ReadableDuration) duration41);
        mutablePeriod33.setHours(1975);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone47);
        org.joda.time.DateTime dateTime49 = dateTime48.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime49.toMutableDateTime();
        org.joda.time.Interval interval51 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod33, (org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone54);
        org.joda.time.DateTime dateTime56 = dateTime55.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime57 = dateTime56.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime57.year();
        org.joda.time.MutableDateTime mutableDateTime60 = property58.addWrapField(6);
        java.util.Locale locale62 = java.util.Locale.FRANCE;
        org.joda.time.MutableDateTime mutableDateTime63 = property58.set("1", locale62);
        org.joda.time.Interval interval64 = interval51.withStart((org.joda.time.ReadableInstant) mutableDateTime63);
        long long65 = interval64.getEndMillis();
        org.joda.time.DateTime dateTime66 = interval64.getStart();
        org.joda.time.PeriodType periodType67 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType68 = null;
        boolean boolean69 = periodType67.isSupported(durationFieldType68);
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod(periodType67);
        java.lang.String str71 = periodType67.toString();
        org.joda.time.PeriodType periodType72 = periodType67.withHoursRemoved();
        org.joda.time.Period period73 = interval64.toPeriod(periodType67);
        org.joda.time.Period period75 = period73.minusHours((-1510304491));
        boolean boolean76 = yearMonth22.equals((java.lang.Object) period75);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(yearMonth22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2021-06" + "'", str23, "2021-06");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 21 + "'", int25 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(mutablePeriod37);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(mutableDateTime57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(mutableDateTime60);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(mutableDateTime63);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(periodType67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "PeriodType[YearMonthDayTime]" + "'", str71, "PeriodType[YearMonthDayTime]");
        org.junit.Assert.assertNotNull(periodType72);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test15624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15624");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks(9);
        org.joda.time.Period period5 = new org.joda.time.Period((long) '4');
        org.joda.time.LocalDate localDate6 = localDate3.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.LocalDate.Property property7 = localDate3.centuryOfEra();
        org.joda.time.LocalDate localDate9 = property7.addToCopy(10);
        org.joda.time.LocalDate.Property property10 = localDate9.era();
        org.joda.time.LocalDate localDate11 = property10.roundCeilingCopy();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test15625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15625");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone4);
        org.joda.time.DateTime dateTime6 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime0, (org.joda.time.ReadableInstant) dateTime5, periodType8);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod13 = mutablePeriod12.copy();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight.Property property16 = dateMidnight15.yearOfCentury();
        org.joda.time.Duration duration17 = mutablePeriod13.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight15);
        mutablePeriod9.setPeriod((org.joda.time.ReadableDuration) duration17);
        mutablePeriod9.setHours(1975);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone23);
        org.joda.time.DateTime dateTime25 = dateTime24.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime25.toMutableDateTime();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod9, (org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay30 = yearMonthDay28.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime31 = yearMonthDay28.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval32 = yearMonthDay28.toInterval();
        org.joda.time.Period period33 = interval32.toPeriod();
        org.joda.time.Interval interval34 = interval32.toInterval();
        org.joda.time.MutableInterval mutableInterval35 = interval32.toMutableInterval();
        org.joda.time.Period period36 = interval32.toPeriod();
        org.joda.time.MutableInterval mutableInterval37 = interval32.toMutableInterval();
        boolean boolean38 = interval27.isAfter((org.joda.time.ReadableInterval) mutableInterval37);
        boolean boolean39 = interval27.isBeforeNow();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(mutablePeriod13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(yearMonthDay30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(mutableInterval35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(mutableInterval37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test15626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15626");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime5 = property3.withMinimumValue();
        int int6 = localDateTime5.getYearOfCentury();
        int int7 = localDateTime5.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.minusDays((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.minusDays((-31));
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 22 + "'", int6 == 22);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 22 + "'", int7 == 22);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test15627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15627");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("PT10S");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setLanguageTag("de_DE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: de_DE [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test15628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15628");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone3);
        org.joda.time.DateTime dateTime5 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.withChronologyRetainFields(chronology10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = timeOfDay11.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay11.plusHours((-1));
        org.joda.time.Chronology chronology15 = timeOfDay14.getChronology();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.withChronologyRetainFields(chronology19);
        long long22 = chronology15.set((org.joda.time.ReadablePartial) timeOfDay18, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(chronology15);
        org.joda.time.DateTime dateTime24 = dateTime5.toDateTime(chronology15);
        org.joda.time.DateTimeField dateTimeField25 = chronology15.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField26 = chronology15.millisOfDay();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(152L, chronology15);
        mutablePeriod27.setMillis(53413000);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-86399999L) + "'", long22 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test15629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15629");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.year();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.set("22");
        mutableDateTime8.setSecondOfDay(0);
        int int11 = mutableDateTime8.getWeekyear();
        org.joda.time.YearMonth yearMonth13 = new org.joda.time.YearMonth((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int17 = dateTimeZone15.getOffset(0L);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.DateTime.Property property19 = dateTime18.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean22 = dateTimeZone21.isFixed();
        org.joda.time.DateTime dateTime23 = dateTime18.toDateTime(dateTimeZone21);
        org.joda.time.Interval interval24 = yearMonth13.toInterval(dateTimeZone21);
        mutableDateTime8.setZoneRetainFields(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime();
        int int27 = mutableDateTime26.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int31 = dateTimeZone29.getOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime26.toMutableDateTime(dateTimeZone29);
        int int34 = dateTimeZone29.getOffsetFromLocal(1650865L);
        mutableDateTime8.setZoneRetainFields(dateTimeZone29);
        java.lang.String str36 = dateTimeZone29.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 21 + "'", int11 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 21 + "'", int27 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
    }

    @Test
    public void test15630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15630");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone4);
        org.joda.time.DateTime dateTime6 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime0, (org.joda.time.ReadableInstant) dateTime5, periodType8);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod13 = mutablePeriod12.copy();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight.Property property16 = dateMidnight15.yearOfCentury();
        org.joda.time.Duration duration17 = mutablePeriod13.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight15);
        mutablePeriod9.setPeriod((org.joda.time.ReadableDuration) duration17);
        mutablePeriod9.setHours(1975);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone23);
        org.joda.time.DateTime dateTime25 = dateTime24.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime25.toMutableDateTime();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod9, (org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone30);
        org.joda.time.DateTime dateTime32 = dateTime31.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime32.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime33.year();
        org.joda.time.MutableDateTime mutableDateTime36 = property34.addWrapField(6);
        java.util.Locale locale38 = java.util.Locale.FRANCE;
        org.joda.time.MutableDateTime mutableDateTime39 = property34.set("1", locale38);
        org.joda.time.Interval interval40 = interval27.withStart((org.joda.time.ReadableInstant) mutableDateTime39);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod44 = mutablePeriod43.copy();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.TimeOfDay timeOfDay49 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology48);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.TimeOfDay timeOfDay51 = timeOfDay49.withChronologyRetainFields(chronology50);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray52 = timeOfDay51.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay54 = timeOfDay51.plusHours((-1));
        org.joda.time.Chronology chronology55 = timeOfDay54.getChronology();
        mutablePeriod43.setPeriod((long) (byte) 1, 845L, chronology55);
        org.joda.time.DateTimeField dateTimeField57 = chronology55.dayOfYear();
        org.joda.time.DurationField durationField58 = chronology55.weekyears();
        org.joda.time.DateTimeField dateTimeField59 = chronology55.dayOfWeek();
        org.joda.time.Interval interval60 = interval40.withChronology(chronology55);
        org.joda.time.DateTimeField dateTimeField61 = chronology55.hourOfDay();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(mutablePeriod13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(mutablePeriod44);
        org.junit.Assert.assertNotNull(timeOfDay49);
        org.junit.Assert.assertNotNull(timeOfDay51);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray52);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(dateTimeField61);
    }

    @Test
    public void test15631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15631");
        org.joda.time.Period period1 = org.joda.time.Period.years(2139);
        org.joda.time.Period period3 = period1.minusHours(53253396);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test15632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15632");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = timeOfDay4.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.plusHours((-1));
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay7.minusMinutes((int) 'u');
        org.joda.time.Period period13 = new org.joda.time.Period((long) (byte) 0, 0L);
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period15 = period13.withPeriodType(periodType14);
        org.joda.time.Period period17 = period13.withDays((int) (short) 100);
        org.joda.time.Period period18 = period13.negated();
        org.joda.time.Period period20 = period13.withMinutes(9);
        org.joda.time.Period period22 = period13.withMillis((int) '#');
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay10.withPeriodAdded((org.joda.time.ReadablePeriod) period22, 54);
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.standard();
        java.lang.String str27 = periodType26.getName();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod31 = mutablePeriod30.copy();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.TimeOfDay timeOfDay36 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay36.withChronologyRetainFields(chronology37);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray39 = timeOfDay38.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay38.plusHours((-1));
        org.joda.time.Chronology chronology42 = timeOfDay41.getChronology();
        mutablePeriod30.setPeriod((long) (byte) 1, 845L, chronology42);
        org.joda.time.DateTimeField dateTimeField44 = chronology42.dayOfYear();
        org.joda.time.DurationField durationField45 = chronology42.weekyears();
        org.joda.time.DurationField durationField46 = chronology42.hours();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod(603L, periodType26, chronology42);
        boolean boolean48 = period22.equals((java.lang.Object) periodType26);
        org.joda.time.PeriodType periodType49 = periodType26.withMinutesRemoved();
        org.joda.time.PeriodType periodType50 = periodType49.withWeeksRemoved();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.TimeOfDay timeOfDay53 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology52);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.TimeOfDay timeOfDay55 = timeOfDay53.withChronologyRetainFields(chronology54);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray56 = timeOfDay55.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay58 = timeOfDay55.plusHours((-1));
        org.joda.time.Chronology chronology59 = timeOfDay58.getChronology();
        org.joda.time.TimeOfDay timeOfDay61 = timeOfDay58.plusHours(28);
        org.joda.time.TimeOfDay timeOfDay63 = timeOfDay61.minusHours(272);
        org.joda.time.TimeOfDay timeOfDay65 = timeOfDay61.plusMillis(1656);
        org.joda.time.LocalTime localTime67 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property68 = localTime67.millisOfDay();
        org.joda.time.LocalTime localTime70 = property68.setCopy((int) (short) 10);
        org.joda.time.LocalTime localTime71 = property68.getLocalTime();
        org.joda.time.LocalTime localTime72 = property68.roundFloorCopy();
        java.lang.String str73 = localTime72.toString();
        int int74 = timeOfDay65.compareTo((org.joda.time.ReadablePartial) localTime72);
        boolean boolean75 = periodType49.equals((java.lang.Object) localTime72);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Standard" + "'", str27, "Standard");
        org.junit.Assert.assertNotNull(mutablePeriod31);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray39);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertNotNull(timeOfDay55);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray56);
        org.junit.Assert.assertNotNull(timeOfDay58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(timeOfDay61);
        org.junit.Assert.assertNotNull(timeOfDay63);
        org.junit.Assert.assertNotNull(timeOfDay65);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(localTime70);
        org.junit.Assert.assertNotNull(localTime71);
        org.junit.Assert.assertNotNull(localTime72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "00:00:00.001" + "'", str73, "00:00:00.001");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test15633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15633");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod6 = mutablePeriod5.copy();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.withChronologyRetainFields(chronology12);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray14 = timeOfDay13.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay13.plusHours((-1));
        org.joda.time.Chronology chronology17 = timeOfDay16.getChronology();
        mutablePeriod5.setPeriod((long) (byte) 1, 845L, chronology17);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(41L, chronology17);
        org.joda.time.DateTimeField dateTimeField20 = chronology17.millisOfSecond();
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property24 = localTime23.millisOfDay();
        org.joda.time.LocalTime localTime26 = property24.addNoWrapToCopy(11);
        java.util.Locale locale27 = java.util.Locale.PRC;
        java.lang.String str28 = locale27.getDisplayScript();
        java.lang.String str29 = property24.getAsShortText(locale27);
        java.lang.String str30 = locale27.getDisplayName();
        java.lang.String str31 = dateTimeField20.getAsShortText((long) 14, locale27);
        java.lang.String str34 = nameProvider0.getName(locale27, "14:47:32.840", "Thu Jan 01 00:00:00 UTC 1970");
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(chronology35);
        org.joda.time.DateMidnight.Property property37 = dateMidnight36.era();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone40);
        org.joda.time.DateTime dateTime42 = dateTime41.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime43 = dateTime42.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime43.year();
        org.joda.time.DateTimeField dateTimeField45 = property44.getField();
        java.util.Locale locale46 = java.util.Locale.PRC;
        java.lang.String str47 = locale46.getDisplayScript();
        java.util.Locale.setDefault(locale46);
        java.lang.String str49 = locale46.getISO3Language();
        java.util.Locale locale50 = java.util.Locale.ENGLISH;
        java.lang.String str51 = locale46.getDisplayScript(locale50);
        int int52 = dateTimeField45.getMaximumShortTextLength(locale50);
        java.lang.String str53 = property37.getAsText(locale50);
        java.lang.String str54 = locale50.getDisplayVariant();
        java.lang.String str57 = nameProvider0.getShortName(locale50, "Thu Jan 01 00:00:00 UTC 1970", "DurationField[centuries]");
        java.lang.String str58 = locale50.getISO3Language();
        java.lang.String str59 = locale50.getLanguage();
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1" + "'", str29, "1");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str30, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "14" + "'", str31, "14");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "zho" + "'", str49, "zho");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 9 + "'", int52 == 9);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "AD" + "'", str53, "AD");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "eng" + "'", str58, "eng");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "en" + "'", str59, "en");
    }

    @Test
    public void test15634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15634");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.yearOfCentury();
        org.joda.time.DateMidnight.Property property3 = dateMidnight1.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight4 = property3.withMinimumValue();
        org.joda.time.DateMidnight.Property property5 = dateMidnight4.dayOfMonth();
        int int6 = property5.getMinimumValueOverall();
        org.joda.time.DateMidnight dateMidnight8 = property5.addToCopy(2L);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(dateMidnight8);
    }

    @Test
    public void test15635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15635");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(11, (int) ' ');
        java.util.Date date9 = new java.util.Date(58, 52, 2022, (int) (byte) 10, 21);
        date9.setMonth(0);
        calendar0.setTime(date9);
        org.joda.time.YearMonthDay yearMonthDay13 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.set((-292275054), 1969, 9, 887, 1975, 2027);
        long long21 = calendar0.getTimeInMillis();
        calendar0.set(2023, 45, (int) (byte) -1, 0, 28);
        boolean boolean28 = calendar0.isWeekDateSupported();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2023,MONTH=45,WEEK_OF_YEAR=42,WEEK_OF_MONTH=3,DAY_OF_MONTH=-1,DAY_OF_YEAR=292,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=10,HOUR_OF_DAY=0,MINUTE=28,SECOND=38,MILLISECOND=616,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 12 10:21:00 UTC 1967");
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9223187844380078616L + "'", long21 == 9223187844380078616L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test15636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15636");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay(2022, 7, 5, 4);
        java.util.Calendar.Builder builder6 = new java.util.Calendar.Builder();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableDuration10, (org.joda.time.ReadableInstant) mutableDateTime11);
        int[] intArray14 = chronology9.get((org.joda.time.ReadablePeriod) mutablePeriod12, (long) 100);
        java.util.Calendar.Builder builder15 = builder6.setFields(intArray14);
        java.util.Calendar.Builder builder16 = builder0.setFields(intArray14);
        java.util.Calendar.Builder builder18 = builder0.setLenient(false);
        java.util.Calendar.Builder builder22 = builder18.setTimeOfDay(86399999, 22, 69);
        java.util.Calendar.Builder builder26 = builder22.setWeekDate(53436, 0, (int) (byte) 100);
        java.util.Calendar.Builder builder30 = builder22.setTimeOfDay(120, 99, 911);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test15637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15637");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((-6), 53746022, 594, 2955, 972, 794);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2955 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15638");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.Chronology chronology3 = localTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.clockhourOfDay();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime localTime8 = localTime6.plusHours((int) (short) 10);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        int int10 = localTime8.size();
        org.joda.time.LocalTime localTime12 = localTime8.plusMinutes((int) '4');
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType17 = periodType16.withWeeksRemoved();
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight14, readableDuration15, periodType16);
        org.joda.time.Period period20 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period22 = period20.plusHours((int) '#');
        org.joda.time.Period period23 = period18.minus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.LocalTime localTime24 = localTime8.minus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime();
        int int28 = mutableDateTime27.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone31);
        org.joda.time.DateTime dateTime33 = dateTime32.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType35 = periodType34.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime27, (org.joda.time.ReadableInstant) dateTime32, periodType35);
        org.joda.time.PeriodType periodType37 = periodType35.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod41 = mutablePeriod40.copy();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.TimeOfDay timeOfDay46 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.TimeOfDay timeOfDay48 = timeOfDay46.withChronologyRetainFields(chronology47);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray49 = timeOfDay48.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay51 = timeOfDay48.plusHours((-1));
        org.joda.time.Chronology chronology52 = timeOfDay51.getChronology();
        mutablePeriod40.setPeriod((long) (byte) 1, 845L, chronology52);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(1009843200021L, periodType35, chronology52);
        org.joda.time.DateTimeField dateTimeField55 = chronology52.monthOfYear();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateMidnight dateMidnight57 = new org.joda.time.DateMidnight(chronology56);
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.PeriodType periodType59 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType60 = periodType59.withWeeksRemoved();
        org.joda.time.Period period61 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight57, readableDuration58, periodType59);
        org.joda.time.Period period63 = period61.withSeconds(0);
        org.joda.time.Period period65 = period63.plusMinutes((int) (byte) 1);
        org.joda.time.Period period67 = period63.withSeconds((int) (byte) 10);
        org.joda.time.Period period68 = period63.toPeriod();
        int int69 = period63.getMillis();
        int[] intArray71 = chronology52.get((org.joda.time.ReadablePeriod) period63, (long) 16);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray73 = dateTimeField4.set((org.joda.time.ReadablePartial) localTime24, 310, intArray71, 122);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 122 for clockhourOfDay must be in the range [1,24]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 21 + "'", int28 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(mutablePeriod41);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray49);
        org.junit.Assert.assertNotNull(timeOfDay51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[0, 0, 0, 0, 0, 0, 16]");
    }

    @Test
    public void test15639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15639");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        int int4 = timeZone1.getOffset(0L);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone1, locale5);
        org.joda.time.YearMonth yearMonth7 = org.joda.time.YearMonth.fromCalendarFields(calendar6);
        int int8 = calendar6.getMinimalDaysInFirstWeek();
        java.util.TimeZone timeZone9 = calendar6.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = calendar6.getMinimum(2005);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2005");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1645455430956,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=10,MILLISECOND=956,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonth7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
    }

    @Test
    public void test15640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15640");
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableDuration4, (org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.ReadableInterval readableInterval7 = null;
        mutablePeriod6.setPeriod(readableInterval7);
        org.joda.time.DurationFieldType[] durationFieldTypeArray9 = mutablePeriod6.getFieldTypes();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.forFields(durationFieldTypeArray9);
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.forFields(durationFieldTypeArray9);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.forFields(durationFieldTypeArray9);
        org.joda.time.Period period13 = new org.joda.time.Period(211L, 126000804L, periodType12);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.Instant instant15 = dateTime14.toInstant();
        org.joda.time.Instant instant17 = instant15.plus(41L);
        org.joda.time.MutableDateTime mutableDateTime18 = instant17.toMutableDateTime();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod22 = mutablePeriod21.copy();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(chronology23);
        org.joda.time.DateMidnight.Property property25 = dateMidnight24.yearOfCentury();
        org.joda.time.Duration duration26 = mutablePeriod22.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod30 = mutablePeriod29.copy();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight.Property property33 = dateMidnight32.yearOfCentury();
        org.joda.time.Duration duration34 = mutablePeriod30.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight32);
        boolean boolean35 = duration26.isEqual((org.joda.time.ReadableDuration) duration34);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod39 = mutablePeriod38.copy();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(chronology40);
        org.joda.time.DateMidnight.Property property42 = dateMidnight41.yearOfCentury();
        org.joda.time.Duration duration43 = mutablePeriod39.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight41);
        boolean boolean44 = duration34.isShorterThan((org.joda.time.ReadableDuration) duration43);
        org.joda.time.PeriodType periodType45 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType46 = null;
        boolean boolean47 = periodType45.isSupported(durationFieldType46);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(periodType45);
        java.lang.String str49 = periodType45.toString();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime18, (org.joda.time.ReadableDuration) duration34, periodType45);
        org.joda.time.Period period51 = period13.withPeriodType(periodType45);
        org.joda.time.PeriodType periodType53 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod58 = mutablePeriod57.copy();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.TimeOfDay timeOfDay63 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology62);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.TimeOfDay timeOfDay65 = timeOfDay63.withChronologyRetainFields(chronology64);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray66 = timeOfDay65.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay68 = timeOfDay65.plusHours((-1));
        org.joda.time.Chronology chronology69 = timeOfDay68.getChronology();
        mutablePeriod57.setPeriod((long) (byte) 1, 845L, chronology69);
        org.joda.time.LocalTime localTime71 = new org.joda.time.LocalTime(41L, chronology69);
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((long) '4', periodType53, chronology69);
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        long long76 = chronology69.add(readablePeriod73, (long) 9, 11);
        org.joda.time.DateTimeField dateTimeField77 = chronology69.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField78 = chronology69.clockhourOfDay();
        org.joda.time.Period period79 = new org.joda.time.Period((-2114380799956L), 1645455018880L, periodType45, chronology69);
        org.joda.time.TimeOfDay timeOfDay80 = new org.joda.time.TimeOfDay(chronology69);
        org.junit.Assert.assertNotNull(durationFieldTypeArray9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(mutablePeriod22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(mutablePeriod30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(mutablePeriod39);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PeriodType[YearMonthDayTime]" + "'", str49, "PeriodType[YearMonthDayTime]");
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(mutablePeriod58);
        org.junit.Assert.assertNotNull(timeOfDay63);
        org.junit.Assert.assertNotNull(timeOfDay65);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray66);
        org.junit.Assert.assertNotNull(timeOfDay68);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 9L + "'", long76 == 9L);
        org.junit.Assert.assertNotNull(dateTimeField77);
        org.junit.Assert.assertNotNull(dateTimeField78);
    }

    @Test
    public void test15641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15641");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(821L);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.plus(41L);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(chronology4);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.dayOfYear();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight5.withDurationAdded((long) 17, 1);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight5.withEra((int) (byte) 0);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight5.withWeekyear(2022);
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight1, (org.joda.time.ReadableInstant) dateMidnight13);
        int int15 = dateMidnight1.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight1.minus((-86399999L));
        int int18 = dateMidnight17.getDayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay((-1), 3, 11);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = yearMonthDay22.getFieldType((int) (short) 0);
        org.joda.time.DateMidnight.Property property25 = dateMidnight17.property(dateTimeFieldType24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(chronology26);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType30 = periodType29.withWeeksRemoved();
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight27, readableDuration28, periodType29);
        org.joda.time.Period period33 = period31.withSeconds(0);
        org.joda.time.Period period35 = period33.plusMinutes((int) (byte) 1);
        org.joda.time.Period period37 = period33.withSeconds((int) (byte) 10);
        org.joda.time.Period period38 = period33.toPeriod();
        org.joda.time.Period period40 = period33.plusHours(58);
        org.joda.time.PeriodType periodType41 = org.joda.time.PeriodType.standard();
        java.lang.String str42 = periodType41.toString();
        org.joda.time.Period period43 = period33.normalizedStandard(periodType41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight17.plus((org.joda.time.ReadablePeriod) period43);
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight17.plusWeeks((-52));
        org.joda.time.Chronology chronology47 = dateMidnight46.getChronology();
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PeriodType[Standard]" + "'", str42, "PeriodType[Standard]");
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertNotNull(dateMidnight46);
        org.junit.Assert.assertNotNull(chronology47);
    }

    @Test
    public void test15642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15642");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime localTime3 = localTime1.plusHours((int) (short) 10);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime();
        int int5 = mutableDateTime4.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone8);
        org.joda.time.DateTime dateTime10 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType12 = periodType11.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime4, (org.joda.time.ReadableInstant) dateTime9, periodType12);
        org.joda.time.PeriodType periodType14 = periodType12.withDaysRemoved();
        boolean boolean15 = localTime3.equals((java.lang.Object) periodType14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean17 = localTime3.isSupported(dateTimeFieldType16);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone20);
        org.joda.time.DateTime dateTime22 = dateTime21.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime22.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.year();
        org.joda.time.MutableDateTime mutableDateTime26 = property24.addWrapField(6);
        org.joda.time.MutableDateTime mutableDateTime27 = property24.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime28 = property24.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime29 = property24.roundFloor();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.weekOfWeekyear();
        org.joda.time.Period period32 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period34 = period32.minusHours((int) '4');
        org.joda.time.Period period36 = period32.minusYears(10);
        org.joda.time.Interval interval37 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime29, (org.joda.time.ReadablePeriod) period32);
        org.joda.time.Period period39 = period32.plusMonths(292278174);
        org.joda.time.LocalTime localTime40 = localTime3.plus((org.joda.time.ReadablePeriod) period32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime42 = localTime3.withHourOfDay(97);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(localTime40);
    }

    @Test
    public void test15643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15643");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType4 = periodType3.withWeeksRemoved();
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight1, readableDuration2, periodType3);
        org.joda.time.Period period7 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period9 = period7.plusHours((int) '#');
        org.joda.time.Period period10 = period5.minus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period5.toPeriod();
        org.joda.time.Period period12 = period5.normalizedStandard();
        org.joda.time.Period period14 = period12.withWeeks(15);
        int int15 = period12.getSeconds();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime.Property property17 = localTime16.millisOfDay();
        org.joda.time.LocalTime localTime19 = property17.addNoWrapToCopy(0);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalTime localTime22 = localTime19.withFieldAdded(durationFieldType20, 1975);
        int int23 = period12.get(durationFieldType20);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test15644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15644");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.year();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.set("22");
        org.joda.time.MutableDateTime mutableDateTime10 = property6.addWrapField(5);
        org.joda.time.Chronology chronology11 = mutableDateTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.era();
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(chronology11);
        int int15 = localDateTime14.getSecondOfMinute();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
    }

    @Test
    public void test15645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15645");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property2.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType10 = periodType9.withWeeksRemoved();
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight7, readableDuration8, periodType9);
        org.joda.time.Period period13 = period11.withSeconds(0);
        org.joda.time.Period period15 = period13.plusMinutes((int) (byte) 1);
        org.joda.time.Period period17 = period13.withSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Period period20 = period13.withField(durationFieldType18, 14);
        org.joda.time.LocalTime localTime22 = localTime5.withPeriodAdded((org.joda.time.ReadablePeriod) period13, (int) (short) 1);
        org.joda.time.LocalTime localTime24 = localTime22.withSecondOfMinute(10);
        org.joda.time.LocalTime.Property property25 = localTime24.hourOfDay();
        org.joda.time.LocalTime localTime27 = property25.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.LocalTime.Property property28 = localTime27.millisOfDay();
        int int29 = property28.get();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 14410001 + "'", int29 == 14410001);
    }

    @Test
    public void test15646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15646");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.DateTime dateTime7 = dateTime5.plusYears((int) 'u');
        org.joda.time.Chronology chronology8 = dateTime5.getChronology();
        org.joda.time.DateTime dateTime10 = dateTime5.minusWeeks(3);
        org.joda.time.DateTime dateTime12 = dateTime10.withYear(1);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.withChronologyRetainFields(chronology16);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray18 = timeOfDay17.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay17.plusHours((-1));
        org.joda.time.Chronology chronology21 = timeOfDay20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.centuryOfEra();
        org.joda.time.DurationField durationField24 = chronology21.weekyears();
        org.joda.time.DateTimeField dateTimeField25 = chronology21.dayOfMonth();
        org.joda.time.DateTime dateTime26 = dateTime10.toDateTime(chronology21);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(chronology27);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType31 = periodType30.withWeeksRemoved();
        org.joda.time.Period period32 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight28, readableDuration29, periodType30);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.TimeOfDay timeOfDay35 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay35.withChronologyRetainFields(chronology36);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray38 = timeOfDay37.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay37.plusHours((-1));
        org.joda.time.Chronology chronology41 = timeOfDay40.getChronology();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.TimeOfDay timeOfDay44 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology43);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.TimeOfDay timeOfDay46 = timeOfDay44.withChronologyRetainFields(chronology45);
        long long48 = chronology41.set((org.joda.time.ReadablePartial) timeOfDay44, (long) (byte) -1);
        org.joda.time.DateTimeField dateTimeField49 = chronology41.millisOfSecond();
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight28.withChronology(chronology41);
        java.util.Date date51 = dateMidnight50.toDate();
        org.joda.time.LocalTime localTime52 = org.joda.time.LocalTime.fromDateFields(date51);
        org.joda.time.PeriodType periodType55 = org.joda.time.PeriodType.weeks();
        org.joda.time.DurationFieldType durationFieldType56 = org.joda.time.DurationFieldType.weekyears();
        int int57 = periodType55.indexOf(durationFieldType56);
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 70, 255L, periodType55);
        org.joda.time.LocalTime localTime59 = localTime52.plus((org.joda.time.ReadablePeriod) mutablePeriod58);
        org.joda.time.Interval interval60 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadablePeriod) mutablePeriod58);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod58.setMinutes(19047);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray38);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(timeOfDay44);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-86399999L) + "'", long48 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateMidnight50);
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Mon Feb 21 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertNotNull(durationFieldType56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(localTime59);
    }

    @Test
    public void test15647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15647");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks(9);
        org.joda.time.Period period5 = new org.joda.time.Period((long) '4');
        org.joda.time.LocalDate localDate6 = localDate3.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.millis();
        boolean boolean8 = localDate6.isSupported(durationFieldType7);
        org.joda.time.LocalDate.Property property9 = localDate6.yearOfCentury();
        org.joda.time.Chronology chronology10 = localDate6.getChronology();
        org.joda.time.LocalDate localDate12 = localDate6.withCenturyOfEra(109);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test15648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15648");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        org.joda.time.YearMonthDay yearMonthDay5 = property3.addToCopy(0);
        org.joda.time.YearMonthDay yearMonthDay7 = property3.setCopy((int) 'u');
        java.lang.String str8 = property3.getAsShortText();
        java.lang.String str9 = property3.getName();
        org.joda.time.YearMonthDay yearMonthDay10 = property3.withMaximumValue();
        org.joda.time.YearMonthDay yearMonthDay12 = property3.addWrapFieldToCopy(184);
        org.joda.time.YearMonthDay yearMonthDay13 = property3.withMaximumValue();
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2022" + "'", str8, "2022");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "year" + "'", str9, "year");
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(yearMonthDay13);
    }

    @Test
    public void test15649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15649");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setTimeInMillis(845L);
        java.util.TimeZone timeZone3 = null;
        calendar0.setTimeZone(timeZone3);
        int int6 = calendar0.getGreatestMinimum(9);
        java.util.TimeZone timeZone8 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        calendar0.setTimeZone(timeZone8);
        boolean boolean10 = calendar0.isWeekDateSupported();
        calendar0.add(0, 15);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = calendar0.getActualMaximum(250);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 250");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=845,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test15650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15650");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate.Property property2 = localDate1.era();
        int[] intArray3 = localDate1.getValues();
        org.joda.time.LocalDate localDate5 = localDate1.withYear(53527715);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1970, 1, 1]");
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test15651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15651");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime3 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval4 = yearMonthDay0.toInterval();
        org.joda.time.Period period5 = interval4.toPeriod();
        org.joda.time.Interval interval6 = interval4.toInterval();
        org.joda.time.Interval interval7 = interval6.toInterval();
        org.joda.time.Duration duration8 = interval7.toDuration();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight.Property property11 = dateMidnight10.era();
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight10.minusWeeks((int) (short) 0);
        org.joda.time.DateMidnight.Property property14 = dateMidnight10.centuryOfEra();
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight10.minusYears(1975);
        java.lang.String str17 = dateMidnight16.toString();
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight16.plusMonths(969);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusWeeks(28);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight19.plus(0L);
        boolean boolean24 = interval7.isAfter((org.joda.time.ReadableInstant) dateMidnight23);
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0047-02-21T00:00:00.000Z" + "'", str17, "0047-02-21T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test15652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15652");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        java.lang.Integer int4 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withZoneUTC();
        java.util.Locale locale7 = dateTimeFormatter5.getLocale();
        java.lang.Appendable appendable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(appendable8, 131487300000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void test15653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15653");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        int int6 = localDateTime2.getValue(2);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone9);
        int int11 = dateTime10.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = dateTime10.toDateTime(dateTimeZone13);
        org.joda.time.DateTime.Property property16 = dateTime10.weekyear();
        org.joda.time.DateTime dateTime17 = property16.roundHalfEvenCopy();
        boolean boolean18 = localDateTime2.equals((java.lang.Object) property16);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime2.withMillisOfDay(272);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime2.minusWeeks(12);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.yearOfEra();
        org.joda.time.LocalDateTime.Property property24 = localDateTime22.yearOfCentury();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test15654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15654");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(473L);
        org.joda.time.LocalTime localTime3 = localTime1.plusHours(96);
        org.joda.time.LocalTime localTime5 = localTime1.withMinuteOfHour(11);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test15655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15655");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1969, 52, (int) '#', 0);
        mutablePeriod4.addDays(25);
    }

    @Test
    public void test15656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15656");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.LocalDate localDate5 = localDate2.withField(dateTimeFieldType3, 10);
        org.joda.time.DateTime dateTime6 = localDate2.toDateTimeAtStartOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.withChronologyRetainFields(chronology10);
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.minusMinutes(10);
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay13.minusMinutes(2);
        int int16 = timeOfDay13.getMinuteOfHour();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = timeOfDay13.getFieldTypes();
        int int18 = timeOfDay13.getMinuteOfHour();
        org.joda.time.Period period21 = new org.joda.time.Period((long) (byte) 0, 0L);
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period23 = period21.withPeriodType(periodType22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) timeOfDay13, periodType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 50 + "'", int16 == 50);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(period23);
    }

    @Test
    public void test15657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15657");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        boolean boolean4 = mutableDateTime0.isBefore((long) 2);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone8);
        org.joda.time.DateTime dateTime10 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime10.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.year();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        java.util.Locale locale14 = java.util.Locale.PRC;
        java.lang.String str15 = locale14.getDisplayScript();
        java.util.Locale.setDefault(locale14);
        java.lang.String str17 = locale14.getISO3Language();
        java.util.Locale locale18 = java.util.Locale.ENGLISH;
        java.lang.String str19 = locale14.getDisplayScript(locale18);
        int int20 = dateTimeField13.getMaximumShortTextLength(locale18);
        mutableDateTime0.setRounding(dateTimeField13);
        org.joda.time.DurationField durationField22 = dateTimeField13.getDurationField();
        java.lang.String str24 = dateTimeField13.getAsShortText(1645454901984L);
        java.lang.Object obj25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(obj25, dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.secondOfMinute();
        long long29 = property28.remainder();
        java.util.Locale locale30 = java.util.Locale.ENGLISH;
        int int31 = property28.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = locale30.stripExtensions();
        int int33 = dateTimeField13.getMaximumTextLength(locale30);
        java.lang.Object obj34 = locale30.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zho" + "'", str17, "zho");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2022" + "'", str24, "2022");
        org.junit.Assert.assertNotNull(property28);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 206L + "'", long29 == 206L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9 + "'", int33 == 9);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "en");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "en");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "en");
    }

    @Test
    public void test15658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15658");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minus((org.joda.time.ReadablePeriod) mutablePeriod7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusMinutes((int) (byte) 10);
        int int11 = localDateTime10.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusMonths(2970);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test15659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15659");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("PT10S");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.removeUnicodeLocaleAttribute("2000");
        java.util.Locale locale7 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str8 = locale7.getDisplayLanguage();
        java.lang.String str9 = locale7.toLanguageTag();
        java.lang.String str10 = locale7.getISO3Language();
        java.util.Locale.Builder builder11 = builder4.setLocale(locale7);
        org.joda.time.tz.NameProvider nameProvider12 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone15);
        org.joda.time.DateTime dateTime17 = dateTime16.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime17.toMutableDateTime();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.TimeOfDay timeOfDay21 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay21.withChronologyRetainFields(chronology22);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray24 = timeOfDay23.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay23.plusHours((-1));
        org.joda.time.Chronology chronology27 = timeOfDay26.getChronology();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.TimeOfDay timeOfDay30 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay30.withChronologyRetainFields(chronology31);
        long long34 = chronology27.set((org.joda.time.ReadablePartial) timeOfDay30, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(chronology27);
        org.joda.time.DateTime dateTime36 = dateTime17.toDateTime(chronology27);
        org.joda.time.DateTimeField dateTimeField37 = chronology27.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField38 = chronology27.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int43 = dateTimeZone41.getOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now(dateTimeZone41);
        java.util.Locale locale46 = java.util.Locale.PRC;
        java.lang.String str47 = locale46.getDisplayScript();
        java.lang.String str48 = dateTimeZone41.getName(845L, locale46);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property51 = localTime50.millisOfDay();
        org.joda.time.LocalTime localTime53 = property51.addNoWrapToCopy(11);
        java.lang.String str54 = property51.getAsShortText();
        java.util.Locale locale55 = java.util.Locale.PRC;
        java.lang.String str56 = property51.getAsText(locale55);
        java.lang.String str57 = locale46.getDisplayScript(locale55);
        java.lang.String str58 = dateTimeField38.getAsShortText((int) (short) 0, locale55);
        java.lang.String str61 = nameProvider12.getName(locale55, "1969-12-31", "2022-02-21T14:49:39.884");
        java.util.Locale.Builder builder62 = builder11.setLocale(locale55);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder64 = builder62.setRegion("2022-02-21T14:51:47.438Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 2022-02-21T14:51:47.438Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u6587" + "'", str8, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh-TW" + "'", str9, "zh-TW");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zho" + "'", str10, "zho");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(nameProvider12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-86399999L) + "'", long34 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00" + "'", str48, "+00:00");
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1" + "'", str54, "1");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1" + "'", str56, "1");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "0" + "'", str58, "0");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(builder62);
    }

    @Test
    public void test15660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15660");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = timeOfDay4.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.plusHours((-1));
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.withChronologyRetainFields(chronology12);
        long long15 = chronology8.set((org.joda.time.ReadablePartial) timeOfDay11, (long) (byte) -1);
        org.joda.time.TimeOfDay.Property property16 = timeOfDay11.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay18 = property16.addToCopy(23);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property16.getFieldType();
        java.lang.String str20 = dateTimeFieldType19.toString();
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-86399999L) + "'", long15 == (-86399999L));
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "millisOfSecond" + "'", str20, "millisOfSecond");
    }

    @Test
    public void test15661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15661");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test15662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15662");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 58);
        org.joda.time.MutablePeriod mutablePeriod2 = mutablePeriod1.copy();
        mutablePeriod2.setDays((int) (short) 0);
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod2.add((long) 447, chronology6);
        org.junit.Assert.assertNotNull(mutablePeriod2);
    }

    @Test
    public void test15663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15663");
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime();
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(readableDuration2, (org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.ReadableInterval readableInterval5 = null;
        mutablePeriod4.setPeriod(readableInterval5);
        org.joda.time.DurationFieldType[] durationFieldTypeArray7 = mutablePeriod4.getFieldTypes();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.forFields(durationFieldTypeArray7);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.forFields(durationFieldTypeArray7);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone12);
        org.joda.time.DateTime dateTime14 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime14.toMutableDateTime();
        org.joda.time.DateTime dateTime17 = dateTime14.withYear((int) (short) -1);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.TimeOfDay timeOfDay20 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.withChronologyRetainFields(chronology21);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray23 = timeOfDay22.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay22.plusHours((-1));
        org.joda.time.Chronology chronology26 = timeOfDay25.getChronology();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.TimeOfDay timeOfDay29 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay29.withChronologyRetainFields(chronology30);
        long long33 = chronology26.set((org.joda.time.ReadablePartial) timeOfDay29, (long) (byte) -1);
        org.joda.time.DateTimeField dateTimeField34 = chronology26.millisOfSecond();
        org.joda.time.DurationField durationField35 = chronology26.years();
        org.joda.time.DateTime dateTime36 = dateTime14.withChronology(chronology26);
        org.joda.time.Period period37 = new org.joda.time.Period(0L, 714L, periodType9, chronology26);
        org.joda.time.PeriodType periodType38 = periodType9.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(periodType9);
        mutablePeriod39.setMinutes(48);
        org.junit.Assert.assertNotNull(durationFieldTypeArray7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-86399999L) + "'", long33 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(periodType38);
    }

    @Test
    public void test15664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15664");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(dateTimeZone1);
        org.joda.time.YearMonth yearMonth4 = yearMonth2.minusMonths((int) (byte) 100);
        org.joda.time.YearMonth yearMonth6 = yearMonth4.minusMonths(20);
        org.joda.time.Period period8 = org.joda.time.Period.seconds((int) (short) 10);
        org.joda.time.Period period11 = new org.joda.time.Period(1645488000000L, (long) 90);
        java.lang.Object obj12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj12, dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.minus((org.joda.time.ReadablePeriod) mutablePeriod19);
        mutablePeriod19.setHours((int) (byte) 0);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod26 = mutablePeriod25.copy();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(chronology27);
        org.joda.time.DateMidnight.Property property29 = dateMidnight28.yearOfCentury();
        org.joda.time.Duration duration30 = mutablePeriod26.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType35 = periodType34.withWeeksRemoved();
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight32, readableDuration33, periodType34);
        org.joda.time.Period period38 = period36.withSeconds(0);
        org.joda.time.Period period40 = period38.plusMinutes((int) (byte) 1);
        org.joda.time.Period period42 = period38.withSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Period period45 = period38.withField(durationFieldType43, 14);
        mutablePeriod26.set(durationFieldType43, 5);
        mutablePeriod19.add(durationFieldType43, 1);
        java.lang.String str50 = durationFieldType43.toString();
        boolean boolean51 = period11.isSupported(durationFieldType43);
        org.joda.time.Period period53 = period8.withFieldAdded(durationFieldType43, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth55 = yearMonth6.withFieldAdded(durationFieldType43, 687);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minutes' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(yearMonth4);
        org.junit.Assert.assertNotNull(yearMonth6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(mutablePeriod26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "minutes" + "'", str50, "minutes");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(period53);
    }

    @Test
    public void test15665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15665");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        int int3 = localDate2.getYearOfCentury();
        org.joda.time.LocalDate.Property property4 = localDate2.centuryOfEra();
        org.joda.time.LocalDate localDate6 = property4.addWrapFieldToCopy(9);
        org.joda.time.LocalDate localDate8 = property4.addWrapFieldToCopy(17);
        org.joda.time.LocalDate localDate9 = property4.roundFloorCopy();
        int int10 = localDate9.getYearOfCentury();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69 + "'", int3 == 69);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test15666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15666");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withChronologyRetainFields(chronology9);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = timeOfDay10.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay10.plusHours((-1));
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.withChronologyRetainFields(chronology18);
        long long21 = chronology14.set((org.joda.time.ReadablePartial) timeOfDay17, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(chronology14);
        org.joda.time.DateTime dateTime23 = dateTime4.toDateTime(chronology14);
        org.joda.time.DateTimeField dateTimeField24 = chronology14.yearOfCentury();
        org.joda.time.DurationField durationField25 = chronology14.centuries();
        org.joda.time.DateTimeField dateTimeField26 = chronology14.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = chronology14.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField28 = chronology14.yearOfCentury();
        org.joda.time.DurationField durationField29 = chronology14.millis();
        java.lang.String str30 = durationField29.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-86399999L) + "'", long21 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "DurationField[millis]" + "'", str30, "DurationField[millis]");
    }

    @Test
    public void test15667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15667");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(dateTimeZone1);
        org.joda.time.YearMonth yearMonth4 = yearMonth2.minusMonths((int) (byte) 100);
        org.joda.time.YearMonth.Property property5 = yearMonth2.monthOfYear();
        java.lang.String str6 = property5.getAsString();
        java.lang.String str7 = property5.getName();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(yearMonth4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2" + "'", str6, "2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "monthOfYear" + "'", str7, "monthOfYear");
    }

    @Test
    public void test15668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15668");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime3 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval4 = yearMonthDay0.toInterval();
        org.joda.time.Period period5 = interval4.toPeriod();
        org.joda.time.Interval interval6 = interval4.toInterval();
        boolean boolean7 = interval6.isBeforeNow();
        org.joda.time.Duration duration8 = interval6.toDuration();
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(duration8);
    }

    @Test
    public void test15669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15669");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone3);
        org.joda.time.DateTime dateTime5 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime7 = dateTime5.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfYear((int) '#');
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.centuryOfEra();
        boolean boolean11 = dateTimeZone0.isLocalDateTimeGap(localDateTime7);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone14);
        org.joda.time.DateTime dateTime16 = dateTime15.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime16.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime18 = dateTime16.toLocalDateTime();
        boolean boolean19 = dateTimeZone0.isLocalDateTimeGap(localDateTime18);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test15670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15670");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.secondOfMinute();
        long long4 = property3.remainder();
        java.util.Locale locale5 = java.util.Locale.ENGLISH;
        int int6 = property3.getMaximumShortTextLength(locale5);
        org.joda.time.LocalDateTime localDateTime8 = property3.addWrapFieldToCopy(6);
        java.util.Locale locale12 = new java.util.Locale("Chinese", "\u4e8c\u6708", "PeriodType[Standard]");
        int int13 = property3.getMaximumTextLength(locale12);
        java.util.Locale.setDefault(locale12);
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 375L + "'", long4 == 375L);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "\u4e8c\u6708_PeriodType[Standard]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test15671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15671");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime6 = dateTime4.toLocalDateTime();
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        java.lang.Object obj8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(obj8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.secondOfMinute();
        long long12 = property11.remainder();
        org.joda.time.LocalDateTime localDateTime13 = property11.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusSeconds(11);
        int[] intArray17 = chronology7.get((org.joda.time.ReadablePartial) localDateTime13, 117448L);
        org.joda.time.DurationField durationField18 = chronology7.years();
        java.lang.String str19 = chronology7.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(property11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 388L + "'", long12 == 388L);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1970, 1, 1, 117448]");
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ISOChronology[UTC]" + "'", str19, "ISOChronology[UTC]");
    }

    @Test
    public void test15672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15672");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getHourOfDay();
        java.util.Date date2 = mutableDateTime0.toDate();
        int int3 = date2.getMinutes();
        java.lang.Object obj4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(obj4, dateTimeZone5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.minus((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withWeekyear((int) '4');
        java.util.Date date15 = localDateTime12.toDate();
        date15.setHours((int) (byte) 1);
        boolean boolean18 = date2.before(date15);
        int int19 = date15.getSeconds();
        int int20 = date15.getSeconds();
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.yearMonthDayTime();
        java.util.Date date27 = new java.util.Date(58, 52, 2022, (int) (byte) 10, 21);
        int int28 = date27.getYear();
        boolean boolean29 = periodType21.equals((java.lang.Object) date27);
        boolean boolean30 = date15.after(date27);
        int int31 = date15.getHours();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        long long35 = dateTimeZone32.adjustOffset((long) ' ', true);
        java.lang.Object obj36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(obj36, dateTimeZone37);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.secondOfMinute();
        long long40 = property39.remainder();
        org.joda.time.LocalDateTime localDateTime41 = property39.getLocalDateTime();
        boolean boolean43 = property39.equals((java.lang.Object) 1.0f);
        org.joda.time.LocalDateTime localDateTime45 = property39.setCopy((int) (short) 1);
        boolean boolean46 = dateTimeZone32.isLocalDateTimeGap(localDateTime45);
        org.joda.time.Chronology chronology47 = localDateTime45.getChronology();
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((java.lang.Object) date15, chronology47);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Mon Feb 21 14:57:11 UTC 2022");
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 57 + "'", int3 == 57);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Mon Feb 21 01:57:11 UTC 2022");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertEquals(date27.toString(), "Sun Nov 12 10:21:00 UTC 1967");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 67 + "'", int28 == 67);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertNotNull(property39);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 401L + "'", long40 == 401L);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(chronology47);
    }

    @Test
    public void test15673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15673");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(dateTimeZone1);
        org.joda.time.YearMonth yearMonth4 = yearMonth2.minusMonths((int) (byte) 100);
        org.joda.time.YearMonth yearMonth6 = yearMonth2.plusYears(100);
        org.joda.time.Period period9 = new org.joda.time.Period((long) (byte) 0, 0L);
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period11 = period9.withPeriodType(periodType10);
        org.joda.time.Period period13 = period9.minusMinutes((int) 'x');
        org.joda.time.YearMonth yearMonth14 = yearMonth2.plus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.YearMonth yearMonth16 = yearMonth2.withYear(6);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(chronology17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType21 = periodType20.withWeeksRemoved();
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight18, readableDuration19, periodType20);
        org.joda.time.Period period24 = period22.withSeconds(0);
        org.joda.time.Period period26 = period24.plusMinutes((int) (byte) 1);
        org.joda.time.Period period28 = period24.withSeconds((int) (byte) 10);
        org.joda.time.Period period30 = period28.multipliedBy(47);
        org.joda.time.Period period32 = period28.minusHours((-292275054));
        org.joda.time.YearMonth yearMonth33 = yearMonth16.minus((org.joda.time.ReadablePeriod) period32);
        org.joda.time.YearMonth.Property property34 = yearMonth16.year();
        int int35 = property34.get();
        java.lang.String str36 = property34.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(yearMonth4);
        org.junit.Assert.assertNotNull(yearMonth6);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(yearMonth14);
        org.junit.Assert.assertNotNull(yearMonth16);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(yearMonth33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 6 + "'", int35 == 6);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Property[year]" + "'", str36, "Property[year]");
    }

    @Test
    public void test15674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15674");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.years();
        org.joda.time.Period period7 = new org.joda.time.Period((long) (byte) 0, 0L);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period9 = period7.withPeriodType(periodType8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone12);
        org.joda.time.DateTime dateTime14 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime14.toMutableDateTime();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.withChronologyRetainFields(chronology19);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray21 = timeOfDay20.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay20.plusHours((-1));
        org.joda.time.Chronology chronology24 = timeOfDay23.getChronology();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay27.withChronologyRetainFields(chronology28);
        long long31 = chronology24.set((org.joda.time.ReadablePartial) timeOfDay27, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(chronology24);
        org.joda.time.DateTime dateTime33 = dateTime14.toDateTime(chronology24);
        org.joda.time.DateTimeField dateTimeField34 = chronology24.yearOfCentury();
        org.joda.time.DurationField durationField35 = chronology24.centuries();
        org.joda.time.DateTimeField dateTimeField36 = chronology24.dayOfYear();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 'a', (long) 7, periodType8, chronology24);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) '4', chronology24);
        org.joda.time.Period period39 = new org.joda.time.Period(58L, periodType1, chronology24);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(periodType1);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-86399999L) + "'", long31 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
    }

    @Test
    public void test15675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15675");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(1);
        int int5 = localDate2.getMonthOfYear();
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
    }

    @Test
    public void test15676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15676");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int3 = dateTimeZone1.getOffset(0L);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime.Property property5 = dateTime4.minuteOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(23);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType9 = dateTimeFieldType8.getRangeDurationType();
        org.joda.time.DateTime.Property property10 = dateTime4.property(dateTimeFieldType8);
        org.joda.time.DateTime dateTime11 = property10.withMinimumValue();
        org.joda.time.DateTime dateTime12 = property10.withMaximumValue();
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfSecond();
        org.joda.time.DateTime dateTime15 = dateTime12.minusYears(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime12.withEra(895);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 895 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test15677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15677");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        org.joda.time.YearMonthDay yearMonthDay4 = property3.withMinimumValue();
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.lang.String str6 = property3.getAsText(locale5);
        org.joda.time.YearMonthDay yearMonthDay7 = property3.withMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay9 = property3.setCopy(1969);
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.withYear(857);
        org.joda.time.YearMonthDay.Property property12 = yearMonthDay9.monthOfYear();
        org.joda.time.LocalDate localDate13 = yearMonthDay9.toLocalDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate13.withWeekOfWeekyear(878);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 878 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test15678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15678");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.lang.String str2 = locale1.getDisplayScript();
        java.util.Locale.setDefault(locale1);
        java.lang.String str4 = locale1.getISO3Language();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.withChronologyRetainFields(chronology8);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray10 = timeOfDay9.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay9.plusHours((-1));
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.withChronologyRetainFields(chronology17);
        long long20 = chronology13.set((org.joda.time.ReadablePartial) timeOfDay16, (long) (byte) -1);
        org.joda.time.TimeOfDay.Property property21 = timeOfDay16.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay23 = property21.addToCopy(23);
        java.util.Locale locale24 = java.util.Locale.CHINESE;
        int int25 = property21.getMaximumShortTextLength(locale24);
        java.util.Locale locale26 = java.util.Locale.ITALY;
        int int27 = property21.getMaximumShortTextLength(locale26);
        java.lang.String str28 = locale1.getDisplayScript(locale26);
        java.lang.String str29 = locale1.getDisplayName();
        java.util.Locale.Builder builder30 = builder0.setLocale(locale1);
        java.util.Locale locale31 = builder0.build();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zho" + "'", str4, "zho");
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-86399999L) + "'", long20 == (-86399999L));
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str29, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
    }

    @Test
    public void test15679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15679");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        mutableDateTime0.setDayOfMonth((int) (short) 10);
        mutableDateTime0.setMillis(0L);
        mutableDateTime0.setDayOfYear((int) (byte) 10);
        java.lang.Object obj8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(obj8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.secondOfMinute();
        long long12 = property11.remainder();
        org.joda.time.LocalDateTime localDateTime13 = property11.getLocalDateTime();
        boolean boolean15 = property11.equals((java.lang.Object) 1.0f);
        org.joda.time.LocalDateTime localDateTime17 = property11.setCopy((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusYears((int) 'u');
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withYear(69);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime24 = dateTime22.minusYears((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime();
        int int26 = mutableDateTime25.getDayOfMonth();
        org.joda.time.Instant instant27 = mutableDateTime25.toInstant();
        org.joda.time.MutableDateTime mutableDateTime28 = instant27.toMutableDateTime();
        boolean boolean29 = dateTime22.isEqual((org.joda.time.ReadableInstant) instant27);
        int int30 = dateTime22.getDayOfYear();
        long long31 = dateTime22.getMillis();
        org.joda.time.DateTime dateTime33 = dateTime22.withMillisOfDay(100);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime36 = dateTime34.minusYears((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime34.toMutableDateTime();
        mutableDateTime37.setMillisOfSecond(2);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod43 = mutablePeriod42.copy();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight(chronology44);
        org.joda.time.DateMidnight.Property property46 = dateMidnight45.yearOfCentury();
        org.joda.time.Duration duration47 = mutablePeriod43.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight45);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod51 = mutablePeriod50.copy();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight.Property property54 = dateMidnight53.yearOfCentury();
        org.joda.time.Duration duration55 = mutablePeriod51.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight53);
        boolean boolean56 = duration47.isEqual((org.joda.time.ReadableDuration) duration55);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod60 = mutablePeriod59.copy();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight(chronology61);
        org.joda.time.DateMidnight.Property property63 = dateMidnight62.yearOfCentury();
        org.joda.time.Duration duration64 = mutablePeriod60.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight62);
        boolean boolean65 = duration55.isShorterThan((org.joda.time.ReadableDuration) duration64);
        org.joda.time.PeriodType periodType66 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType67 = periodType66.withWeeksRemoved();
        org.joda.time.Period period68 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime37, (org.joda.time.ReadableDuration) duration64, periodType67);
        org.joda.time.DateTime dateTime69 = dateTime22.plus((org.joda.time.ReadableDuration) duration64);
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime();
        int int71 = mutableDateTime70.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone74);
        org.joda.time.DateTime dateTime76 = dateTime75.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType77 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType78 = periodType77.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime70, (org.joda.time.ReadableInstant) dateTime75, periodType78);
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod83 = mutablePeriod82.copy();
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.DateMidnight dateMidnight85 = new org.joda.time.DateMidnight(chronology84);
        org.joda.time.DateMidnight.Property property86 = dateMidnight85.yearOfCentury();
        org.joda.time.Duration duration87 = mutablePeriod83.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight85);
        mutablePeriod79.setPeriod((org.joda.time.ReadableDuration) duration87);
        boolean boolean89 = duration64.isEqual((org.joda.time.ReadableDuration) duration87);
        org.joda.time.LocalDateTime localDateTime90 = localDateTime21.plus((org.joda.time.ReadableDuration) duration64);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration64);
        org.joda.time.MutableDateTime mutableDateTime92 = mutableDateTime0.copy();
        int int93 = mutableDateTime0.getEra();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(property11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 503L + "'", long12 == 503L);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 21 + "'", int26 == 21);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1645455431503L + "'", long31 == 1645455431503L);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(mutablePeriod43);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(mutablePeriod51);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(mutablePeriod60);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(periodType66);
        org.junit.Assert.assertNotNull(periodType67);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 21 + "'", int71 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone74);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(periodType77);
        org.junit.Assert.assertNotNull(periodType78);
        org.junit.Assert.assertNotNull(mutablePeriod83);
        org.junit.Assert.assertNotNull(property86);
        org.junit.Assert.assertNotNull(duration87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(localDateTime90);
        org.junit.Assert.assertNotNull(mutableDateTime92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
    }

    @Test
    public void test15680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15680");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime6 = dateTime4.toLocalDateTime();
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period11 = period9.plusHours((int) '#');
        org.joda.time.Hours hours12 = period11.toStandardHours();
        long long15 = chronology7.add((org.joda.time.ReadablePeriod) hours12, 0L, (int) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology7);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.minuteOfDay();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.dayOfMonth();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test15681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15681");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        boolean boolean4 = mutableDateTime0.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int8 = dateTimeZone6.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime0.setZone(dateTimeZone6);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime0.toMutableDateTime(dateTimeZone14);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = localDate16.getFieldType(0);
        org.joda.time.LocalTime localTime19 = null;
        org.joda.time.DateTime dateTime20 = localDate16.toDateTime(localTime19);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate24 = localDate22.plusWeeks(9);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int26 = localDate22.get(dateTimeFieldType25);
        org.joda.time.LocalDate localDate28 = localDate22.plusDays((int) (byte) 0);
        int int29 = localDate28.getEra();
        int int30 = localDate28.size();
        int int31 = localDate16.compareTo((org.joda.time.ReadablePartial) localDate28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test15682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15682");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minus((org.joda.time.ReadablePeriod) mutablePeriod7);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod12 = mutablePeriod11.copy();
        mutablePeriod7.add((org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.MutablePeriod mutablePeriod14 = mutablePeriod12.toMutablePeriod();
        org.joda.time.PeriodType periodType15 = mutablePeriod14.getPeriodType();
        mutablePeriod14.addYears(2022);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime();
        int int19 = mutableDateTime18.getDayOfMonth();
        org.joda.time.Instant instant20 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime mutableDateTime21 = instant20.toMutableDateTime();
        org.joda.time.Instant instant22 = instant20.toInstant();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime();
        int int24 = mutableDateTime23.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone27);
        org.joda.time.DateTime dateTime29 = dateTime28.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType31 = periodType30.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime23, (org.joda.time.ReadableInstant) dateTime28, periodType31);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod36 = mutablePeriod35.copy();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(chronology37);
        org.joda.time.DateMidnight.Property property39 = dateMidnight38.yearOfCentury();
        org.joda.time.Duration duration40 = mutablePeriod36.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight38);
        mutablePeriod32.setPeriod((org.joda.time.ReadableDuration) duration40);
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant22, (org.joda.time.ReadableDuration) duration40);
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType45 = null;
        boolean boolean46 = periodType44.isSupported(durationFieldType45);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((-369216316799883L), periodType44);
        org.joda.time.Period period48 = period42.normalizedStandard(periodType44);
        mutablePeriod14.add((org.joda.time.ReadablePeriod) period42);
        org.joda.time.Period period51 = period42.minusYears(55388261);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(mutablePeriod14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 21 + "'", int19 == 21);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 21 + "'", int24 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(mutablePeriod36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period51);
    }

    @Test
    public void test15683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15683");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2022-02-21T14:55:44.628");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test15684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15684");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2027, 1645454849969L);
        org.joda.time.Chronology chronology3 = interval2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.junit.Assert.assertNotNull(chronology3);
    }

    @Test
    public void test15685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15685");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(821L);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.plus(41L);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(chronology4);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.dayOfYear();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight5.withDurationAdded((long) 17, 1);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight5.withEra((int) (byte) 0);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight5.withWeekyear(2022);
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight1, (org.joda.time.ReadableInstant) dateMidnight13);
        int int15 = dateMidnight1.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight1.minus((-86399999L));
        int int18 = dateMidnight17.getDayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay((-1), 3, 11);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = yearMonthDay22.getFieldType((int) (short) 0);
        org.joda.time.DateMidnight.Property property25 = dateMidnight17.property(dateTimeFieldType24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight27 = property25.setCopy("2023-05-31");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2023-05-31\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test15686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15686");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setTimeInMillis(845L);
        java.util.TimeZone timeZone3 = null;
        calendar0.setTimeZone(timeZone3);
        int int5 = calendar0.getMinimalDaysInFirstWeek();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        calendar0.setTimeZone(timeZone7);
        java.time.Instant instant9 = calendar0.toInstant();
        calendar0.roll(11, (int) '4');
        java.lang.String str13 = calendar0.getCalendarType();
        java.util.TimeZone timeZone14 = calendar0.getTimeZone();
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.fromCalendarFields(calendar0);
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=14400845,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=0,SECOND=0,MILLISECOND=845,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "gregory" + "'", str13, "gregory");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(timeOfDay15);
    }

    @Test
    public void test15687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15687");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withOffsetParsed();
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateTimeFormatter7.print(123077577600000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test15688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15688");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(816, 38, 67);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 38 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15689");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime3 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval4 = yearMonthDay0.toInterval();
        org.joda.time.Period period5 = interval4.toPeriod();
        org.joda.time.Interval interval6 = interval4.toInterval();
        java.lang.Object obj7 = null;
        boolean boolean8 = interval6.equals(obj7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone11);
        org.joda.time.DateTime dateTime13 = dateTime12.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime14 = dateTime12.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime16 = dateTime14.plusMonths((int) '#');
        boolean boolean17 = interval6.isAfter((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Period period18 = interval6.toPeriod();
        org.joda.time.Period period20 = period18.minusSeconds(0);
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.standard();
        java.lang.String str24 = periodType23.getName();
        org.joda.time.PeriodType periodType25 = periodType23.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 109, (long) (byte) 10, periodType25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period27 = period20.withPeriodType(periodType25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Standard" + "'", str24, "Standard");
        org.junit.Assert.assertNotNull(periodType25);
    }

    @Test
    public void test15690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15690");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        java.lang.String str4 = localTime1.toString("22");
        org.joda.time.LocalTime localTime6 = localTime1.withMillisOfSecond((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localTime1.toDateTimeToday(dateTimeZone7);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.ReadableInterval readableInterval12 = null;
        mutablePeriod11.add(readableInterval12);
        org.joda.time.PeriodType periodType14 = mutablePeriod11.getPeriodType();
        org.joda.time.LocalTime localTime15 = localTime1.minus((org.joda.time.ReadablePeriod) mutablePeriod11);
        int int16 = mutablePeriod11.getYears();
        mutablePeriod11.addMillis(802);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "22" + "'", str4, "22");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test15691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15691");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withLocale(locale4);
        boolean boolean6 = dateTimeFormatter5.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.parse("PT6048000S", dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test15692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15692");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        org.joda.time.YearMonthDay yearMonthDay4 = property3.withMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay6 = property3.setCopy(20);
        org.joda.time.YearMonthDay yearMonthDay8 = property3.addToCopy(47);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.minusMonths((int) (byte) 10);
        int int12 = yearMonthDay9.getDayOfMonth();
        int int13 = yearMonthDay9.getDayOfMonth();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod17 = mutablePeriod16.copy();
        org.joda.time.format.PeriodFormatter periodFormatter18 = null;
        java.lang.String str19 = mutablePeriod17.toString(periodFormatter18);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay9.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod17, (-1));
        org.joda.time.YearMonthDay.Property property22 = yearMonthDay21.year();
        java.lang.String str23 = property22.getName();
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.util.Locale locale25 = locale24.stripExtensions();
        java.lang.String str26 = property22.getAsShortText(locale25);
        java.util.Locale locale27 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str28 = locale25.getDisplayLanguage(locale27);
        int int29 = property3.getMaximumShortTextLength(locale25);
        org.joda.time.YearMonthDay yearMonthDay31 = property3.addToCopy(53766768);
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 21 + "'", int13 == 21);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT0.099S" + "'", str19, "PT0.099S");
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "year" + "'", str23, "year");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2022" + "'", str26, "2022");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "chinois" + "'", str28, "chinois");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 9 + "'", int29 == 9);
        org.junit.Assert.assertNotNull(yearMonthDay31);
    }

    @Test
    public void test15693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15693");
        java.util.Date date5 = new java.util.Date(58, 52, 2022, (int) (byte) 10, 21);
        java.lang.String str6 = date5.toLocaleString();
        java.time.Instant instant7 = date5.toInstant();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance();
        calendar8.add(11, (int) ' ');
        java.util.Date date17 = new java.util.Date(58, 52, 2022, (int) (byte) 10, 21);
        date17.setMonth(0);
        calendar8.setTime(date17);
        int int21 = date17.getYear();
        date17.setYear(15);
        boolean boolean24 = date5.before(date17);
        date5.setHours(887);
        java.lang.Object obj27 = date5.clone();
        org.junit.Assert.assertEquals(date5.toString(), "Mon Dec 18 23:21:00 UTC 1967");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1967-11-12 10:21:00" + "'", str6, "1967-11-12 10:21:00");
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=-93706740000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1967,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=12,DAY_OF_YEAR=12,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=21,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date17.toString(), "Tue Jan 12 10:21:00 UTC 1915");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 67 + "'", int21 == 67);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "Mon Dec 18 23:21:00 UTC 1967");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "Mon Dec 18 23:21:00 UTC 1967");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "Mon Dec 18 23:21:00 UTC 1967");
    }

    @Test
    public void test15694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15694");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = dateTimeZone2.getName((long) (-1), locale5);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone11);
        org.joda.time.DateTime dateTime13 = dateTime12.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.year();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime18 = property15.add(799L);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone21);
        org.joda.time.DateTime dateTime23 = dateTime22.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime23.toMutableDateTime();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay27.withChronologyRetainFields(chronology28);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray30 = timeOfDay29.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay29.plusHours((-1));
        org.joda.time.Chronology chronology33 = timeOfDay32.getChronology();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.TimeOfDay timeOfDay36 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay36.withChronologyRetainFields(chronology37);
        long long40 = chronology33.set((org.joda.time.ReadablePartial) timeOfDay36, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay41 = new org.joda.time.TimeOfDay(chronology33);
        org.joda.time.DateTime dateTime42 = dateTime23.toDateTime(chronology33);
        org.joda.time.DateTimeField dateTimeField43 = chronology33.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = dateTimeField43.getType();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime18.property(dateTimeFieldType44);
        int int46 = localTime8.get(dateTimeFieldType44);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime48 = localTime8.withMinuteOfHour(895);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 895 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-86399999L) + "'", long40 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(property45);
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 53831763 + "'", int46 == 53831763);
    }

    @Test
    public void test15695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15695");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale5 = new java.util.Locale("hi!", "hi!");
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale9 = new java.util.Locale("hi!", "hi!");
        java.util.Locale[] localeArray10 = new java.util.Locale[] { locale5, locale6, locale9 };
        java.util.ArrayList<java.util.Locale> localeList11 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList11, localeArray10);
        java.util.Locale.FilteringMode filteringMode13 = null;
        java.util.List<java.util.Locale> localeList14 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList11, filteringMode13);
        java.lang.String[] strArray25 = new java.lang.String[] { "1", "12 Nov 1900 10:21:00 GMT", "PeriodType[Standard]", "", "", "1967-11-12 10:21:00", "2022-02-21T00:00:00.000Z", "PeriodType[Standard]", "\u4e2d\u6587", "PeriodType[Standard]" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList26);
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.util.Locale locale34 = new java.util.Locale("hi!", "hi!");
        java.util.Locale locale35 = java.util.Locale.FRANCE;
        java.util.Locale locale38 = new java.util.Locale("hi!", "hi!");
        java.util.Locale[] localeArray39 = new java.util.Locale[] { locale34, locale35, locale38 };
        java.util.ArrayList<java.util.Locale> localeList40 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList40, localeArray39);
        java.util.Locale.FilteringMode filteringMode42 = null;
        java.util.List<java.util.Locale> localeList43 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.util.Locale>) localeList40, filteringMode42);
        java.util.Locale.FilteringMode filteringMode44 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList45 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList43, filteringMode44);
        java.util.stream.Stream<java.util.Locale> localeStream46 = localeList43.stream();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!_HI!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale9.toString(), "hi!_HI!");
        org.junit.Assert.assertNotNull(localeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(localeList14);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals(locale34.toString(), "hi!_HI!");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale38.toString(), "hi!_HI!");
        org.junit.Assert.assertNotNull(localeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(localeList43);
        org.junit.Assert.assertTrue("'" + filteringMode44 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode44.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList45);
        org.junit.Assert.assertNotNull(localeStream46);
    }

    @Test
    public void test15696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15696");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime3 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval4 = yearMonthDay0.toInterval();
        org.joda.time.Period period6 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period8 = period6.plusHours((int) '#');
        org.joda.time.Period period9 = period6.toPeriod();
        org.joda.time.Interval interval10 = interval4.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period6);
        org.joda.time.DateTime dateTime11 = interval10.getEnd();
        org.joda.time.Interval interval12 = interval10.toInterval();
        org.joda.time.MutableInterval mutableInterval13 = interval10.toMutableInterval();
        long long14 = interval10.getStartMillis();
        org.joda.time.Interval interval15 = interval10.toInterval();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.minusYears((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime16.toMutableDateTime();
        mutableDateTime19.setMillisOfSecond(2);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod25 = mutablePeriod24.copy();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(chronology26);
        org.joda.time.DateMidnight.Property property28 = dateMidnight27.yearOfCentury();
        org.joda.time.Duration duration29 = mutablePeriod25.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight27);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod33 = mutablePeriod32.copy();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(chronology34);
        org.joda.time.DateMidnight.Property property36 = dateMidnight35.yearOfCentury();
        org.joda.time.Duration duration37 = mutablePeriod33.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight35);
        boolean boolean38 = duration29.isEqual((org.joda.time.ReadableDuration) duration37);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod42 = mutablePeriod41.copy();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight(chronology43);
        org.joda.time.DateMidnight.Property property45 = dateMidnight44.yearOfCentury();
        org.joda.time.Duration duration46 = mutablePeriod42.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight44);
        boolean boolean47 = duration37.isShorterThan((org.joda.time.ReadableDuration) duration46);
        org.joda.time.PeriodType periodType48 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType49 = periodType48.withWeeksRemoved();
        org.joda.time.Period period50 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime19, (org.joda.time.ReadableDuration) duration46, periodType49);
        org.joda.time.Interval interval51 = interval10.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration46);
        long long52 = interval51.getStartMillis();
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.Interval interval54 = interval51.withPeriodAfterStart(readablePeriod53);
        long long55 = interval54.getStartMillis();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateMidnight dateMidnight57 = new org.joda.time.DateMidnight(chronology56);
        org.joda.time.DateMidnight.Property property58 = dateMidnight57.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight59 = property58.withMinimumValue();
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight59.plusWeeks(20);
        org.joda.time.DateMidnight.Property property62 = dateMidnight61.centuryOfEra();
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight61.plusWeeks((int) (byte) 100);
        org.joda.time.DateMidnight.Property property65 = dateMidnight64.dayOfWeek();
        org.joda.time.YearMonthDay yearMonthDay66 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay68 = yearMonthDay66.minusMonths((int) (byte) 10);
        org.joda.time.YearMonthDay.Property property69 = yearMonthDay66.year();
        org.joda.time.YearMonthDay yearMonthDay71 = property69.addToCopy(0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray72 = yearMonthDay71.getFieldTypes();
        org.joda.time.Period period74 = org.joda.time.Period.months(292278174);
        org.joda.time.YearMonthDay yearMonthDay75 = yearMonthDay71.plus((org.joda.time.ReadablePeriod) period74);
        org.joda.time.PeriodType periodType76 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType77 = null;
        boolean boolean78 = periodType76.isSupported(durationFieldType77);
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod(periodType76);
        java.lang.String str80 = periodType76.toString();
        org.joda.time.PeriodType periodType81 = periodType76.withDaysRemoved();
        org.joda.time.Period period82 = period74.withPeriodType(periodType81);
        org.joda.time.Interval interval83 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight64, (org.joda.time.ReadablePeriod) period74);
        boolean boolean84 = interval54.isAfter((org.joda.time.ReadableInterval) interval83);
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(mutableInterval13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1645487999948L + "'", long14 == 1645487999948L);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(mutablePeriod25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(mutablePeriod33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(mutablePeriod42);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1645487999901L + "'", long52 == 1645487999901L);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1645487999901L + "'", long55 == 1645487999901L);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(dateMidnight59);
        org.junit.Assert.assertNotNull(dateMidnight61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(dateMidnight64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(yearMonthDay68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(yearMonthDay71);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray72);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(yearMonthDay75);
        org.junit.Assert.assertNotNull(periodType76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "PeriodType[YearMonthDayTime]" + "'", str80, "PeriodType[YearMonthDayTime]");
        org.junit.Assert.assertNotNull(periodType81);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test15697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15697");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("PT10S");
        java.util.Locale.Builder builder4 = builder0.setVariant("1971");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = builder5.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
    }

    @Test
    public void test15698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15698");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(0L);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.add(39);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.weekOfWeekyear();
        int int6 = mutableDateTime4.getYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.YearMonthDay.Property property9 = yearMonthDay8.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay10 = property9.withMaximumValue();
        org.joda.time.DurationField durationField11 = property9.getRangeDurationField();
        long long12 = durationField11.getUnitMillis();
        long long15 = durationField11.getMillis((long) 86399901, 36L);
        boolean boolean16 = mutableDateTime4.equals((java.lang.Object) 36L);
        int int17 = mutableDateTime4.getRoundingMode();
        mutableDateTime4.addYears((-52));
        mutableDateTime4.addDays((-1));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2629746000L + "'", long12 == 2629746000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 227209793990400000L + "'", long15 == 227209793990400000L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test15699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15699");
        org.joda.time.Period period1 = org.joda.time.Period.years(888);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Period period4 = period1.withFieldAdded(durationFieldType2, (int) (byte) 1);
        org.joda.time.Period period6 = period1.withDays(53613597);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test15700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15700");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = timeOfDay4.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.plusHours((-1));
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.withChronologyRetainFields(chronology12);
        long long15 = chronology8.set((org.joda.time.ReadablePartial) timeOfDay11, (long) (byte) -1);
        org.joda.time.TimeOfDay.Property property16 = timeOfDay11.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay18 = property16.addWrapFieldToCopy(14);
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        int int20 = property16.getMaximumShortTextLength(locale19);
        org.joda.time.DateTimeField dateTimeField21 = property16.getField();
        org.joda.time.DurationField durationField22 = dateTimeField21.getDurationField();
        int int24 = dateTimeField21.get((long) 2598);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-86399999L) + "'", long15 == (-86399999L));
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 598 + "'", int24 == 598);
    }

    @Test
    public void test15701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15701");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(1);
        org.joda.time.LocalDate.Property property5 = localDate2.year();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType10 = periodType9.withWeeksRemoved();
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight7, readableDuration8, periodType9);
        org.joda.time.Period period13 = period11.withSeconds(0);
        org.joda.time.Period period15 = period13.plusMinutes((int) (byte) 1);
        org.joda.time.Period period17 = period13.withSeconds((int) (byte) 10);
        org.joda.time.Period period18 = period13.toPeriod();
        org.joda.time.LocalDate localDate19 = localDate2.minus((org.joda.time.ReadablePeriod) period18);
        int int20 = localDate19.getDayOfWeek();
        org.joda.time.LocalDate localDate22 = localDate19.plusWeeks(32769);
        int int23 = localDate22.getDayOfMonth();
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test15702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15702");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime3.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withChronologyRetainFields(chronology9);
        org.joda.time.DateTime dateTime11 = timeOfDay10.toDateTimeToday();
        boolean boolean12 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime11);
        int int13 = dateTime11.getWeekyear();
        org.joda.time.DateTime.Property property14 = dateTime11.year();
        org.joda.time.DateTime dateTime16 = property14.addToCopy((long) (byte) 100);
        org.joda.time.DateTime dateTime18 = property14.setCopy(1);
        org.joda.time.DateTime dateTime20 = property14.addToCopy(470L);
        org.joda.time.DateTime dateTime22 = property14.addToCopy(0);
        org.joda.time.Instant instant23 = dateTime22.toInstant();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(instant23);
    }

    @Test
    public void test15703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15703");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        int int3 = yearMonthDay0.getDayOfMonth();
        int int4 = yearMonthDay0.getDayOfMonth();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod8 = mutablePeriod7.copy();
        org.joda.time.format.PeriodFormatter periodFormatter9 = null;
        java.lang.String str10 = mutablePeriod8.toString(periodFormatter9);
        org.joda.time.YearMonthDay yearMonthDay12 = yearMonthDay0.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod8, (-1));
        org.joda.time.YearMonthDay.Property property13 = yearMonthDay12.year();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray14 = yearMonthDay12.getFieldTypes();
        org.joda.time.YearMonthDay yearMonthDay16 = yearMonthDay12.minusYears(1);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int20 = dateTimeZone18.getOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        long long24 = dateTimeZone18.convertLocalToUTC(0L, false);
        org.joda.time.DateTime dateTime25 = yearMonthDay12.toDateTimeAtCurrentTime(dateTimeZone18);
        int int26 = dateTime25.getMinuteOfDay();
        org.joda.time.DateTime.Property property27 = dateTime25.millisOfDay();
        org.joda.time.DateTime dateTime28 = dateTime25.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT0.099S" + "'", str10, "PT0.099S");
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray14);
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(dateTime25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 897 + "'", int26 == 897);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime28);
    }

    @Test
    public void test15704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15704");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("1970-01-01T00:00:00.052Z", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15705");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        int int3 = yearMonthDay0.getDayOfMonth();
        int int4 = yearMonthDay0.getDayOfMonth();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod8 = mutablePeriod7.copy();
        org.joda.time.format.PeriodFormatter periodFormatter9 = null;
        java.lang.String str10 = mutablePeriod8.toString(periodFormatter9);
        org.joda.time.YearMonthDay yearMonthDay12 = yearMonthDay0.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod8, (-1));
        mutablePeriod8.setMillis(9);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod8.setValue(897, 53469);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 897");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT0.099S" + "'", str10, "PT0.099S");
        org.junit.Assert.assertNotNull(yearMonthDay12);
    }

    @Test
    public void test15706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15706");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 969);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withDefaultYear(878);
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter10.getParser();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimeParser11);
    }

    @Test
    public void test15707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15707");
        org.joda.time.Period period1 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period3 = period1.plusHours((int) '#');
        org.joda.time.Period period4 = period1.toPeriod();
        org.joda.time.Duration duration5 = period4.toStandardDuration();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.dayOfYear();
        org.joda.time.DateMidnight dateMidnight9 = property8.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight.Property property11 = dateMidnight9.property(dateTimeFieldType10);
        org.joda.time.Interval interval12 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration5, (org.joda.time.ReadableInstant) dateMidnight9);
        org.joda.time.ReadableInstant readableInstant13 = null;
        boolean boolean14 = interval12.contains(readableInstant13);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property17 = localTime16.millisOfDay();
        org.joda.time.LocalTime localTime19 = property17.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime20 = property17.roundHalfFloorCopy();
        int int21 = localTime20.size();
        org.joda.time.LocalTime localTime23 = localTime20.minusSeconds(100);
        org.joda.time.LocalTime localTime25 = localTime23.minusMillis(100);
        org.joda.time.Chronology chronology26 = localTime25.getChronology();
        org.joda.time.Interval interval27 = interval12.withChronology(chronology26);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(interval27);
    }

    @Test
    public void test15708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15708");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(1);
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay5.plusDays(2022);
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay7.withMonthOfYear(4);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateMidnight dateMidnight11 = yearMonthDay9.toDateMidnight(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime();
        int int13 = mutableDateTime12.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone16);
        org.joda.time.DateTime dateTime18 = dateTime17.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType20 = periodType19.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime12, (org.joda.time.ReadableInstant) dateTime17, periodType20);
        int int22 = dateTimeZone10.getOffset((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.Interval interval23 = localDate4.toInterval(dateTimeZone10);
        int int24 = localDate4.getDayOfMonth();
        org.joda.time.LocalDate localDate26 = localDate4.withYearOfEra(49);
        org.joda.time.DateMidnight dateMidnight27 = localDate26.toDateMidnight();
        org.joda.time.LocalDate.Property property28 = localDate26.dayOfYear();
        org.joda.time.LocalDate localDate29 = property28.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate30 = property28.roundHalfCeilingCopy();
        int int31 = localDate30.getYearOfCentury();
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 21 + "'", int13 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 31 + "'", int24 == 31);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 49 + "'", int31 == 49);
    }

    @Test
    public void test15709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15709");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(53718921, 671, 20, 802, 2720, 6, 53324166);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 802 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15710");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone4);
        org.joda.time.DateTime dateTime6 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime0, (org.joda.time.ReadableInstant) dateTime5, periodType8);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod13 = mutablePeriod12.copy();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight.Property property16 = dateMidnight15.yearOfCentury();
        org.joda.time.Duration duration17 = mutablePeriod13.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight15);
        mutablePeriod9.setPeriod((org.joda.time.ReadableDuration) duration17);
        mutablePeriod9.setHours(1975);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone23);
        org.joda.time.DateTime dateTime25 = dateTime24.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime25.toMutableDateTime();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod9, (org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay30 = yearMonthDay28.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime31 = yearMonthDay28.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval32 = yearMonthDay28.toInterval();
        org.joda.time.Period period33 = interval32.toPeriod();
        org.joda.time.Interval interval34 = interval32.toInterval();
        org.joda.time.MutableInterval mutableInterval35 = interval32.toMutableInterval();
        org.joda.time.Period period36 = interval32.toPeriod();
        org.joda.time.MutableInterval mutableInterval37 = interval32.toMutableInterval();
        boolean boolean38 = interval27.isAfter((org.joda.time.ReadableInterval) mutableInterval37);
        org.joda.time.YearMonthDay yearMonthDay39 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay41 = yearMonthDay39.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime42 = yearMonthDay39.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval43 = yearMonthDay39.toInterval();
        org.joda.time.Period period44 = interval43.toPeriod();
        org.joda.time.Interval interval45 = interval43.toInterval();
        org.joda.time.MutableInterval mutableInterval46 = interval43.toMutableInterval();
        org.joda.time.Period period47 = interval43.toPeriod();
        java.lang.String str48 = interval43.toString();
        long long49 = interval43.getEndMillis();
        boolean boolean50 = mutableInterval37.isBefore((org.joda.time.ReadableInterval) interval43);
        org.joda.time.Period period51 = mutableInterval37.toPeriod();
        org.joda.time.MutableInterval mutableInterval52 = mutableInterval37.toMutableInterval();
        org.joda.time.YearMonthDay yearMonthDay53 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay55 = yearMonthDay53.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime56 = yearMonthDay53.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval57 = yearMonthDay53.toInterval();
        org.joda.time.Period period58 = interval57.toPeriod();
        org.joda.time.Interval interval59 = interval57.toInterval();
        org.joda.time.MutableInterval mutableInterval60 = interval57.toMutableInterval();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight(chronology61);
        org.joda.time.ReadableDuration readableDuration63 = null;
        org.joda.time.PeriodType periodType64 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType65 = periodType64.withWeeksRemoved();
        org.joda.time.Period period66 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight62, readableDuration63, periodType64);
        org.joda.time.Interval interval67 = dateMidnight62.toInterval();
        org.joda.time.Interval interval68 = interval57.gap((org.joda.time.ReadableInterval) interval67);
        boolean boolean70 = interval67.contains(47L);
        boolean boolean71 = mutableInterval37.contains((org.joda.time.ReadableInterval) interval67);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(mutablePeriod13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(yearMonthDay30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(mutableInterval35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(mutableInterval37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(yearMonthDay41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(mutableInterval46);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "2022-02-21T00:00:00.000Z/2022-02-22T00:00:00.000Z" + "'", str48, "2022-02-21T00:00:00.000Z/2022-02-22T00:00:00.000Z");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1645488000000L + "'", long49 == 1645488000000L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(mutableInterval52);
        org.junit.Assert.assertNotNull(yearMonthDay55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(mutableInterval60);
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(periodType65);
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertNull(interval68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test15711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15711");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        int int6 = localDateTime2.getValue(2);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone9);
        int int11 = dateTime10.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = dateTime10.toDateTime(dateTimeZone13);
        org.joda.time.DateTime.Property property16 = dateTime10.weekyear();
        org.joda.time.DateTime dateTime17 = property16.roundHalfEvenCopy();
        boolean boolean18 = localDateTime2.equals((java.lang.Object) property16);
        int int19 = localDateTime2.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime2.plusDays(14);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime();
        int int23 = mutableDateTime22.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone26);
        org.joda.time.DateTime dateTime28 = dateTime27.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType30 = periodType29.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime22, (org.joda.time.ReadableInstant) dateTime27, periodType30);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod35 = mutablePeriod34.copy();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight(chronology36);
        org.joda.time.DateMidnight.Property property38 = dateMidnight37.yearOfCentury();
        org.joda.time.Duration duration39 = mutablePeriod35.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight37);
        mutablePeriod31.setPeriod((org.joda.time.ReadableDuration) duration39);
        long long41 = duration39.getMillis();
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Interval interval43 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration39, readableInstant42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime21.withDurationAdded((org.joda.time.ReadableDuration) duration39, (int) (byte) 100);
        int int46 = localDateTime21.getDayOfWeek();
        int int47 = localDateTime21.getHourOfDay();
        int int48 = localDateTime21.getDayOfMonth();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 21 + "'", int23 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(mutablePeriod35);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 99L + "'", long41 == 99L);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 14 + "'", int47 == 14);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 7 + "'", int48 == 7);
    }

    @Test
    public void test15712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15712");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime3.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withChronologyRetainFields(chronology9);
        org.joda.time.DateTime dateTime11 = timeOfDay10.toDateTimeToday();
        boolean boolean12 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime11);
        int int13 = dateTime11.getWeekyear();
        org.joda.time.DateTime.Property property14 = dateTime11.year();
        org.joda.time.DateTime dateTime16 = dateTime11.plusDays(272);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod21 = mutablePeriod20.copy();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.TimeOfDay timeOfDay26 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay26.withChronologyRetainFields(chronology27);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray29 = timeOfDay28.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay28.plusHours((-1));
        org.joda.time.Chronology chronology32 = timeOfDay31.getChronology();
        mutablePeriod20.setPeriod((long) (byte) 1, 845L, chronology32);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(41L, chronology32);
        org.joda.time.DateTimeField dateTimeField35 = chronology32.millisOfSecond();
        int int36 = dateTime16.get(dateTimeField35);
        org.joda.time.DateTime dateTime38 = dateTime16.withYearOfEra(51);
        org.joda.time.DateTime.Property property39 = dateTime38.minuteOfDay();
        org.joda.time.DateTime dateTime41 = dateTime38.withMillisOfDay(2023);
        org.joda.time.DateTime dateTime42 = dateTime38.toDateTime();
        org.joda.time.DateTime.Property property43 = dateTime42.secondOfMinute();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(mutablePeriod21);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray29);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property43);
    }

    @Test
    public void test15713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15713");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone3);
        org.joda.time.DateTime dateTime5 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.year();
        org.joda.time.DateTime dateTime8 = property7.roundFloorCopy();
        org.joda.time.DateTime.Property property9 = dateTime8.dayOfMonth();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(chronology10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType14 = periodType13.withWeeksRemoved();
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight11, readableDuration12, periodType13);
        org.joda.time.Period period17 = period15.withSeconds(0);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone20);
        org.joda.time.DateTime dateTime22 = dateTime21.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime23 = dateTime21.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.TimeOfDay timeOfDay26 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay26.withChronologyRetainFields(chronology27);
        org.joda.time.DateTime dateTime29 = timeOfDay28.toDateTimeToday();
        boolean boolean30 = dateTime23.isEqual((org.joda.time.ReadableInstant) dateTime29);
        int int31 = dateTime29.getWeekyear();
        org.joda.time.DateTime dateTime33 = dateTime29.plusHours(4);
        org.joda.time.Duration duration34 = period15.toDurationFrom((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod38 = mutablePeriod37.copy();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight(chronology39);
        org.joda.time.DateMidnight.Property property41 = dateMidnight40.yearOfCentury();
        org.joda.time.Duration duration42 = mutablePeriod38.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight40);
        boolean boolean43 = duration34.isEqual((org.joda.time.ReadableDuration) duration42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight(chronology44);
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType48 = periodType47.withWeeksRemoved();
        org.joda.time.Period period49 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight45, readableDuration46, periodType47);
        org.joda.time.Period period51 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period53 = period51.plusHours((int) '#');
        org.joda.time.Period period54 = period49.minus((org.joda.time.ReadablePeriod) period51);
        org.joda.time.Period period55 = period49.toPeriod();
        org.joda.time.PeriodType periodType56 = period55.getPeriodType();
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableDuration) duration42, periodType56);
        org.joda.time.DateTime.Property property58 = dateTime8.centuryOfEra();
        org.joda.time.DateTime dateTime59 = property58.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime60 = dateTime59.withLaterOffsetAtOverlap();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableInstant) dateTime59);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2022 + "'", int31 == 2022);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(mutablePeriod38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime60);
    }

    @Test
    public void test15714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15714");
        org.joda.time.YearMonth yearMonth0 = new org.joda.time.YearMonth();
        org.joda.time.Interval interval1 = yearMonth0.toInterval();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = yearMonth0.getFieldTypes();
        org.joda.time.YearMonth yearMonth4 = yearMonth0.plusYears(6);
        org.joda.time.YearMonth.Property property5 = yearMonth0.monthOfYear();
        org.junit.Assert.assertNotNull(interval1);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray2);
        org.junit.Assert.assertNotNull(yearMonth4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test15715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15715");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.monthOfYear();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight.Property property4 = dateMidnight3.yearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime0, (org.joda.time.ReadableInstant) dateMidnight3);
        org.joda.time.DateMidnight.Property property6 = dateMidnight3.dayOfYear();
        org.joda.time.DateMidnight dateMidnight7 = property6.roundHalfCeilingCopy();
        java.lang.Object obj8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(obj8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.secondOfMinute();
        long long12 = property11.remainder();
        org.joda.time.LocalDateTime localDateTime13 = property11.getLocalDateTime();
        boolean boolean15 = property11.equals((java.lang.Object) 1.0f);
        org.joda.time.LocalDateTime localDateTime17 = property11.setCopy((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusYears((int) 'u');
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.plusSeconds(53);
        int int22 = localDateTime17.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime17.plusMillis(2139);
        org.joda.time.Period period26 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period28 = period26.plusHours((int) '#');
        org.joda.time.Period period29 = period26.toPeriod();
        org.joda.time.Duration duration30 = period29.toStandardDuration();
        org.joda.time.Period period31 = duration30.toPeriod();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime17.minus((org.joda.time.ReadableDuration) duration30);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight7.minus((org.joda.time.ReadableDuration) duration30);
        org.joda.time.DateMidnight.Property property34 = dateMidnight7.centuryOfEra();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(property11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 154L + "'", long12 == 154L);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(property34);
    }

    @Test
    public void test15716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15716");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        boolean boolean4 = mutableDateTime0.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int8 = dateTimeZone6.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime0.setZone(dateTimeZone6);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime0.toMutableDateTime(dateTimeZone14);
        mutableDateTime15.setTime(2, 2, 20, 7);
        mutableDateTime15.addWeeks((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
    }

    @Test
    public void test15717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15717");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.plusDays(2022);
        org.joda.time.YearMonthDay yearMonthDay4 = yearMonthDay2.withMonthOfYear(4);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int6 = yearMonthDay2.get(dateTimeFieldType5);
        org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay2.plusYears(32772);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = yearMonthDay8.getValue(99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 99");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(yearMonthDay8);
    }

    @Test
    public void test15718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15718");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = dateTime0.toString("2022-02-21T14:53:33.460Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
    }

    @Test
    public void test15719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15719");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis(328L);
        org.joda.time.Instant instant4 = instant2.withMillis(376L);
        org.joda.time.MutableDateTime mutableDateTime5 = instant4.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        mutableDateTime5.addDays(1999);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
    }

    @Test
    public void test15720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15720");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        int int3 = yearMonthDay0.getDayOfMonth();
        int int4 = yearMonthDay0.getDayOfMonth();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = yearMonthDay0.getFieldTypes();
        int int6 = yearMonthDay0.size();
        org.joda.time.DateTime dateTime7 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis(1975);
        org.joda.time.DateTime dateTime10 = dateTime7.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test15721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15721");
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.standard();
        java.lang.String str4 = periodType3.getName();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod8 = mutablePeriod7.copy();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay13.withChronologyRetainFields(chronology14);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = timeOfDay15.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay15.plusHours((-1));
        org.joda.time.Chronology chronology19 = timeOfDay18.getChronology();
        mutablePeriod7.setPeriod((long) (byte) 1, 845L, chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology19.dayOfYear();
        org.joda.time.DurationField durationField22 = chronology19.weekyears();
        org.joda.time.DurationField durationField23 = chronology19.hours();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(603L, periodType3, chronology19);
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.now(chronology19);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 2970, 63840268800000L, chronology19);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Standard" + "'", str4, "Standard");
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(localTime25);
    }

    @Test
    public void test15722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15722");
        java.lang.Object obj1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(obj1, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.minus((org.joda.time.ReadablePeriod) mutablePeriod8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withWeekyear((int) '4');
        java.util.Date date12 = localDateTime9.toDate();
        org.joda.time.LocalDateTime.Property property13 = localDateTime9.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime14 = property13.getLocalDateTime();
        org.joda.time.DateTimeField dateTimeField15 = property13.getField();
        org.joda.time.LocalDateTime localDateTime16 = property13.withMaximumValue();
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.years();
        org.joda.time.Period period19 = new org.joda.time.Period(436L, chronology17);
        org.joda.time.Seconds seconds20 = period19.toStandardSeconds();
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Feb 21 14:57:12 UTC 2022");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(seconds20);
    }

    @Test
    public void test15723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15723");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 53766768, 940L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15724");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.minusMonths((int) (byte) 10);
        org.joda.time.YearMonthDay.Property property4 = yearMonthDay1.year();
        org.joda.time.YearMonthDay yearMonthDay6 = property4.addToCopy(0);
        org.joda.time.Chronology chronology7 = yearMonthDay6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) 2922789, chronology7);
        org.joda.time.DateMidnight dateMidnight9 = yearMonthDay8.toDateMidnight();
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay12 = yearMonthDay10.minusMonths((int) (byte) 10);
        org.joda.time.YearMonthDay.Property property13 = yearMonthDay10.year();
        org.joda.time.YearMonthDay yearMonthDay15 = yearMonthDay10.withDayOfMonth(23);
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay15.withYear(53305126);
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay17.minusMonths(292278994);
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadablePartial) yearMonthDay8, (org.joda.time.ReadablePartial) yearMonthDay19);
        org.joda.time.Period period22 = period20.minusDays(53410232);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertNotNull(yearMonthDay17);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertNotNull(period22);
    }

    @Test
    public void test15725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15725");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        boolean boolean4 = mutableDateTime0.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int8 = dateTimeZone6.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime0.setZone(dateTimeZone6);
        long long11 = dateTimeZone6.previousTransition((long) (short) -1);
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now(dateTimeZone6);
        int int14 = dateTimeZone6.getOffsetFromLocal(1645488000000L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test15726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15726");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setTimeInMillis(845L);
        java.util.TimeZone timeZone3 = null;
        calendar0.setTimeZone(timeZone3);
        int int5 = calendar0.getMinimalDaysInFirstWeek();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        calendar0.setTimeZone(timeZone7);
        int int10 = calendar0.getLeastMaximum(1);
        java.util.Date date11 = calendar0.getTime();
        org.joda.time.TimeOfDay timeOfDay12 = org.joda.time.TimeOfDay.fromCalendarFields(calendar0);
        int int13 = calendar0.getWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = calendar0.getActualMinimum(794);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 794");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=845,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=845,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292269054 + "'", int10 == 292269054);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
    }

    @Test
    public void test15727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15727");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone7);
        org.joda.time.DateTime dateTime9 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime9.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.year();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        java.util.Locale locale13 = java.util.Locale.PRC;
        java.lang.String str14 = locale13.getDisplayScript();
        java.util.Locale.setDefault(locale13);
        java.lang.String str16 = locale13.getISO3Language();
        java.util.Locale locale17 = java.util.Locale.ENGLISH;
        java.lang.String str18 = locale13.getDisplayScript(locale17);
        int int19 = dateTimeField12.getMaximumShortTextLength(locale17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter4.withLocale(locale17);
        org.joda.time.Period period26 = new org.joda.time.Period((long) (byte) 0, 0L);
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period28 = period26.withPeriodType(periodType27);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone31);
        org.joda.time.DateTime dateTime33 = dateTime32.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime33.toMutableDateTime();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.TimeOfDay timeOfDay37 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay37.withChronologyRetainFields(chronology38);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray40 = timeOfDay39.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay42 = timeOfDay39.plusHours((-1));
        org.joda.time.Chronology chronology43 = timeOfDay42.getChronology();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.TimeOfDay timeOfDay46 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.TimeOfDay timeOfDay48 = timeOfDay46.withChronologyRetainFields(chronology47);
        long long50 = chronology43.set((org.joda.time.ReadablePartial) timeOfDay46, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay51 = new org.joda.time.TimeOfDay(chronology43);
        org.joda.time.DateTime dateTime52 = dateTime33.toDateTime(chronology43);
        org.joda.time.DateTimeField dateTimeField53 = chronology43.yearOfCentury();
        org.joda.time.DurationField durationField54 = chronology43.centuries();
        org.joda.time.DateTimeField dateTimeField55 = chronology43.dayOfYear();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) 'a', (long) 7, periodType27, chronology43);
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime((long) '4', chronology43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter4.withChronology(chronology43);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        long long64 = dateTimeZone60.convertLocalToUTC((long) (short) 10, true, 0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = dateTimeFormatter4.withZone(dateTimeZone60);
        org.joda.time.Chronology chronology66 = dateTimeFormatter65.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = dateTimeFormatter65.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = dateTimeFormatter65.withPivotYear(1439);
        java.util.Locale locale70 = dateTimeFormatter65.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter72 = dateTimeFormatter65.withPivotYear(899);
        org.joda.time.LocalTime localTime74 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property75 = localTime74.millisOfDay();
        org.joda.time.LocalTime localTime77 = property75.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime78 = property75.roundHalfFloorCopy();
        org.joda.time.LocalTime.Property property79 = localTime78.minuteOfHour();
        org.joda.time.LocalTime localTime81 = localTime78.plusHours(5);
        org.joda.time.LocalTime localTime83 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property84 = localTime83.millisOfDay();
        org.joda.time.LocalTime localTime85 = property84.withMaximumValue();
        int int86 = property84.getMaximumValue();
        org.joda.time.LocalTime localTime87 = property84.getLocalTime();
        org.joda.time.LocalTime localTime88 = localTime81.withFields((org.joda.time.ReadablePartial) localTime87);
        org.joda.time.DateTimeZone dateTimeZone90 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean92 = dateTimeZone90.isStandardOffset((long) 'u');
        org.joda.time.LocalTime localTime93 = new org.joda.time.LocalTime(dateTimeZone90);
        org.joda.time.DateTime dateTime94 = localTime88.toDateTimeToday(dateTimeZone90);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter95 = dateTimeFormatter65.withZone(dateTimeZone90);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zho" + "'", str16, "zho");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray40);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-86399999L) + "'", long50 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeFormatter58);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-125999990L) + "'", long64 == (-125999990L));
        org.junit.Assert.assertNotNull(dateTimeFormatter65);
        org.junit.Assert.assertNull(chronology66);
        org.junit.Assert.assertNotNull(dateTimeFormatter67);
        org.junit.Assert.assertNotNull(dateTimeFormatter69);
        org.junit.Assert.assertNull(locale70);
        org.junit.Assert.assertNotNull(dateTimeFormatter72);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertNotNull(localTime77);
        org.junit.Assert.assertNotNull(localTime78);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertNotNull(localTime81);
        org.junit.Assert.assertNotNull(property84);
        org.junit.Assert.assertNotNull(localTime85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 86399999 + "'", int86 == 86399999);
        org.junit.Assert.assertNotNull(localTime87);
        org.junit.Assert.assertNotNull(localTime88);
        org.junit.Assert.assertNotNull(dateTimeZone90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(dateTime94);
        org.junit.Assert.assertNotNull(dateTimeFormatter95);
    }
}
