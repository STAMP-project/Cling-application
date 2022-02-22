import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest34 {

    public static boolean debug = false;

    @Test
    public void test17001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17001");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 18);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test17002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17002");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField6 = localDateTime4.getField((int) (byte) 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime4.getFields();
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 100, 1L, periodType10);
        org.joda.time.Period period13 = period11.minusSeconds((-1));
        org.joda.time.LocalDateTime localDateTime14 = localDateTime4.plus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property18 = localDateTime15.hourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str22 = dateTimeFieldType21.getName();
        int int23 = localDateTime15.indexOf(dateTimeFieldType21);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime15.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime15.minusSeconds((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str29 = dateTimeFieldType28.getName();
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.property(dateTimeFieldType28);
        int int31 = localDateTime27.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime27.withMillisOfDay(1);
        int int34 = localDateTime4.compareTo((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.Duration duration36 = org.joda.time.Duration.standardHours((long) (short) 1);
        org.joda.time.Duration duration38 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period39 = duration38.toPeriod();
        org.joda.time.Duration duration42 = duration38.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration42, readableInstant43);
        org.joda.time.Duration duration45 = duration42.toDuration();
        int int46 = duration36.compareTo((org.joda.time.ReadableDuration) duration45);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime4.plus((org.joda.time.ReadableDuration) duration36);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.secondOfDay();
        boolean boolean49 = localDateTime4.isSupported(dateTimeFieldType48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime4.withYear(53652105);
        int int52 = localDateTime51.getWeekyear();
        org.joda.time.PeriodType periodType53 = org.joda.time.PeriodType.time();
        org.joda.time.PeriodType periodType54 = periodType53.withSecondsRemoved();
        boolean boolean55 = localDateTime51.equals((java.lang.Object) periodType53);
        org.joda.time.DateTimeField[] dateTimeFieldArray56 = localDateTime51.getFields();
        org.joda.time.LocalDateTime.Property property57 = localDateTime51.dayOfYear();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "clockhourOfDay" + "'", str22, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "dayOfMonth" + "'", str29, "dayOfMonth");
        org.junit.Assert.assertNotNull(property30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 53652105 + "'", int52 == 53652105);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray56);
        org.junit.Assert.assertNotNull(property57);
    }

    @Test
    public void test17003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17003");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        int int6 = dateTime5.getSecondOfMinute();
        boolean boolean7 = dateTime5.isEqualNow();
        int int8 = dateTime5.getDayOfYear();
        org.joda.time.Chronology chronology9 = dateTime5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(chronology9);
        org.joda.time.DateTime.Property property13 = dateTime12.hourOfDay();
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTime dateTime16 = dateTime12.withFieldAdded(durationFieldType14, 17);
        boolean boolean17 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) 100, 1L, periodType22);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) 100, 1L, periodType26);
        org.joda.time.Period period28 = period23.plus((org.joda.time.ReadablePeriod) period27);
        org.joda.time.Instant instant29 = new org.joda.time.Instant();
        org.joda.time.Instant instant31 = instant29.withMillis(0L);
        org.joda.time.Duration duration32 = period27.toDurationTo((org.joda.time.ReadableInstant) instant31);
        mutableDateTime19.add((org.joda.time.ReadableDuration) duration32, 39);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime19.secondOfMinute();
        mutableDateTime19.addYears(3);
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period40 = duration39.toPeriod();
        org.joda.time.Duration duration43 = duration39.withDurationAdded((long) 38, (int) 'a');
        long long44 = duration39.getStandardMinutes();
        mutableDateTime19.add((org.joda.time.ReadableDuration) duration39);
        org.joda.time.Duration duration47 = org.joda.time.Duration.standardMinutes((long) 39236);
        org.joda.time.Minutes minutes48 = duration47.toStandardMinutes();
        org.joda.time.Duration duration49 = duration39.minus((org.joda.time.ReadableDuration) duration47);
        org.joda.time.Duration duration52 = duration47.withDurationAdded((long) 916, 393);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (short) 1, chronology54);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalTime localTime57 = new org.joda.time.LocalTime(dateTimeZone56);
        org.joda.time.LocalTime localTime59 = localTime57.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime61 = localTime59.plusMillis((int) (byte) 100);
        org.joda.time.DateTime dateTime62 = dateTime55.withFields((org.joda.time.ReadablePartial) localTime61);
        int int63 = dateTime62.getSecondOfDay();
        boolean boolean65 = dateTime62.isBefore((long) '#');
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration52, (org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        mutablePeriod66.setPeriod(readablePeriod67);
        org.joda.time.DateTime dateTime69 = dateTime1.plus((org.joda.time.ReadablePeriod) mutablePeriod66);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1440L + "'", long44 == 1440L);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(minutes48);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(dateTime62);
// flaky:         org.junit.Assert.assertTrue("'" + int63 + "' != '" + 39811 + "'", int63 == 39811);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(dateTime69);
    }

    @Test
    public void test17004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17004");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(53750160, 751, 39267259, 39321381, 39272321, 27, (int) (byte) 100, 2019);
        mutablePeriod8.setSeconds(39573276);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 100, 1L, periodType15);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 100, 1L, periodType19);
        org.joda.time.Period period21 = period16.plus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Instant instant22 = new org.joda.time.Instant();
        org.joda.time.Instant instant24 = instant22.withMillis(0L);
        org.joda.time.Duration duration25 = period20.toDurationTo((org.joda.time.ReadableInstant) instant24);
        mutableDateTime12.add((org.joda.time.ReadableDuration) duration25, 39);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean29 = mutableDateTime12.isSupported(dateTimeFieldType28);
        boolean boolean30 = mutableDateTime12.isBeforeNow();
        int int31 = mutableDateTime12.getSecondOfDay();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) 100);
        org.joda.time.DateTime.Property property34 = dateTime33.monthOfYear();
        org.joda.time.DateTime dateTime35 = dateTime33.toDateTimeISO();
        mutableDateTime12.setMillis((org.joda.time.ReadableInstant) dateTime33);
        int int37 = mutableDateTime12.getWeekyear();
        int int38 = mutableDateTime12.getYearOfEra();
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        long long43 = dateTimeZone40.adjustOffset(0L, true);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(0L, dateTimeZone45);
        int int47 = dateTimeZone40.getOffset((org.joda.time.ReadableInstant) mutableDateTime46);
        mutableDateTime46.addMillis((int) '#');
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime46.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime46.toMutableDateTime();
        mutableDateTime46.setWeekyear(1439);
        org.joda.time.Duration duration55 = org.joda.time.Duration.millis(1645455600000L);
        org.joda.time.Minutes minutes56 = duration55.toStandardMinutes();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime46, (org.joda.time.ReadableDuration) duration55);
        org.joda.time.PeriodType periodType58 = mutablePeriod57.getPeriodType();
        org.joda.time.Period period59 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime12, readableInstant39, periodType58);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((java.lang.Object) 39573276, periodType58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 86396 + "'", int31 == 86396);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1970 + "'", int37 == 1970);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1970 + "'", int38 == 1970);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(minutes56);
        org.junit.Assert.assertNotNull(periodType58);
    }

    @Test
    public void test17005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17005");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime1.minuteOfHour();
        mutableDateTime1.addYears(39272321);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test17006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17006");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (short) 1, chronology4);
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) instant6, periodType7);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths((int) ' ');
        org.joda.time.Chronology chronology12 = localDate9.getChronology();
        org.joda.time.Period period13 = new org.joda.time.Period((long) (byte) 1, periodType7, chronology12);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate16 = localDate14.minusMonths((int) ' ');
        org.joda.time.Chronology chronology17 = localDate14.getChronology();
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate20 = localDate14.withFieldAdded(durationFieldType18, (int) (byte) 100);
        boolean boolean21 = periodType7.isSupported(durationFieldType18);
        org.joda.time.PeriodType periodType22 = periodType7.withDaysRemoved();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property24 = localDate23.dayOfMonth();
        org.joda.time.Chronology chronology25 = localDate23.getChronology();
        org.joda.time.Period period26 = new org.joda.time.Period((long) 43, periodType7, chronology25);
        org.joda.time.Duration duration28 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period29 = duration28.toPeriod();
        org.joda.time.Duration duration32 = duration28.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Instant instant36 = new org.joda.time.Instant();
        org.joda.time.Instant instant38 = instant36.withMillis(0L);
        org.joda.time.Chronology chronology39 = instant38.getChronology();
        org.joda.time.DurationField durationField40 = chronology39.eras();
        java.util.Locale locale41 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology39, locale41, (java.lang.Integer) 39221019);
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) 53, chronology39);
        org.joda.time.DateTimeField dateTimeField45 = chronology39.dayOfYear();
        org.joda.time.DateTimeField dateTimeField46 = chronology39.monthOfYear();
        org.joda.time.Period period47 = duration28.toPeriod(periodType33, chronology39);
        org.joda.time.Period period48 = new org.joda.time.Period((long) '#', periodType7, chronology39);
        org.joda.time.DateTimeField dateTimeField49 = chronology39.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone50 = chronology39.getZone();
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(chronology39);
        org.joda.time.DateTimeField dateTimeField52 = chronology39.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long58 = chronology39.getDateTimeMillis((long) 39625993, 36168303, 39300, 996, 3284816);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36168303 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(dateTimeField52);
    }

    @Test
    public void test17007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17007");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 1);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate4 = localDate2.minusMonths((int) ' ');
        org.joda.time.Chronology chronology5 = localDate2.getChronology();
        org.joda.time.Period period6 = duration1.toPeriod(chronology5);
        org.joda.time.Hours hours7 = duration1.toStandardHours();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(hours7);
    }

    @Test
    public void test17008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17008");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime2.add((org.joda.time.ReadableDuration) duration4, (int) (short) 100);
        mutableDateTime2.setYear(10);
        mutableDateTime2.addSeconds((int) (short) 0);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.minuteOfHour();
        mutableDateTime2.addWeeks(17);
        org.joda.time.DateTime dateTime14 = mutableDateTime2.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) 518, dateTimeZone15);
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = null;
        org.joda.time.format.DateTimeParser dateTimeParser18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter17, dateTimeParser18);
        org.joda.time.format.DateTimeParser dateTimeParser20 = dateTimeFormatter19.getParser();
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeFormatter19.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter19.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter22.withPivotYear((java.lang.Integer) 121);
        boolean boolean25 = dateTimeFormatter22.isParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = mutableDateTime16.toString(dateTimeFormatter22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNull(dateTimeParser20);
        org.junit.Assert.assertNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test17009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17009");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str7 = dateTimeFieldType6.getName();
        int int8 = localDateTime0.indexOf(dateTimeFieldType6);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str10 = dateTimeFieldType9.getName();
        org.joda.time.LocalDateTime.Property property11 = localDateTime0.property(dateTimeFieldType9);
        org.joda.time.LocalDateTime localDateTime13 = property11.addWrapFieldToCopy(40);
        int int14 = localDateTime13.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property18 = localDateTime15.hourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str22 = dateTimeFieldType21.getName();
        int int23 = localDateTime15.indexOf(dateTimeFieldType21);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime15.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime15.minusSeconds((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str29 = dateTimeFieldType28.getName();
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.property(dateTimeFieldType28);
        int int31 = localDateTime27.getMinuteOfHour();
        int int32 = localDateTime27.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime27.plusMillis((int) '4');
        org.joda.time.Duration duration36 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period37 = duration36.toPeriod();
        org.joda.time.Duration duration40 = duration36.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((long) 100, 1L, periodType45);
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((long) 100, 1L, periodType49);
        org.joda.time.Period period51 = period46.plus((org.joda.time.ReadablePeriod) period50);
        org.joda.time.Instant instant52 = new org.joda.time.Instant();
        org.joda.time.Instant instant54 = instant52.withMillis(0L);
        org.joda.time.Duration duration55 = period50.toDurationTo((org.joda.time.ReadableInstant) instant54);
        mutableDateTime42.add((org.joda.time.ReadableDuration) duration55, 39);
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime42.yearOfEra();
        mutableDateTime42.setDayOfYear((int) ' ');
        mutableDateTime42.addHours(11);
        java.lang.String str63 = mutableDateTime42.toString();
        org.joda.time.PeriodType periodType64 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Period period65 = duration36.toPeriodFrom((org.joda.time.ReadableInstant) mutableDateTime42, periodType64);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime27.withPeriodAdded((org.joda.time.ReadablePeriod) period65, (int) 'a');
        org.joda.time.Period period68 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localDateTime13, (org.joda.time.ReadablePartial) localDateTime67);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period70 = period68.plusSeconds(53803364);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "clockhourOfDay" + "'", str7, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "clockhourOfDay" + "'", str10, "clockhourOfDay");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "clockhourOfDay" + "'", str22, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "dayOfMonth" + "'", str29, "dayOfMonth");
        org.junit.Assert.assertNotNull(property30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 54176640 + "'", int32 == 54176640);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(instant54);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "1969-02-02T10:59:56.191Z" + "'", str63, "1969-02-02T10:59:56.191Z");
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(period68);
    }

    @Test
    public void test17010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17010");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period19 = duration18.toPeriod();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.centuries();
        int int21 = period19.get(durationFieldType20);
        mutableDateTime1.add((org.joda.time.ReadablePeriod) period19, 54);
        mutableDateTime1.addHours(5);
        mutableDateTime1.setYear(588);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test17011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17011");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears(1);
        org.joda.time.DateTime dateTime4 = localDate3.toDateTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.plusSeconds(1);
        int int8 = dateTime7.getMillisOfDay();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
    }

    @Test
    public void test17012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17012");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField8 = localDateTime6.getField((int) (byte) 0);
        long long10 = dateTimeField8.roundHalfEven((long) 1);
        int int11 = dateTime1.get(dateTimeField8);
        int int13 = dateTimeField8.getLeapAmount((long) (byte) 10);
        java.lang.String str15 = dateTimeField8.getAsText((long) 1969);
        boolean boolean17 = dateTimeField8.isLeap(53L);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.monthOfYear();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        int int22 = dateTime21.getSecondOfMinute();
        boolean boolean23 = dateTime21.isEqualNow();
        int int24 = dateTime21.getDayOfYear();
        org.joda.time.Chronology chronology25 = dateTime21.getChronology();
        long long26 = property19.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.LocalDateTime localDateTime27 = property19.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusDays((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withDayOfYear(9);
        org.joda.time.Chronology chronology35 = null;
        java.util.Locale locale36 = java.util.Locale.GERMAN;
        java.util.Locale locale37 = locale36.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology35, locale36, (java.lang.Integer) 45, (int) '4');
        boolean boolean41 = locale36.hasExtensions();
        java.lang.String str42 = dateTimeField8.getAsShortText((org.joda.time.ReadablePartial) localDateTime33, locale36);
        int int43 = localDateTime33.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime33.plusSeconds(2);
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.monthOfYear();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(chronology48);
        int int50 = dateTime49.getSecondOfMinute();
        boolean boolean51 = dateTime49.isEqualNow();
        int int52 = dateTime49.getDayOfYear();
        org.joda.time.Chronology chronology53 = dateTime49.getChronology();
        long long54 = property47.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime49);
        int int55 = property47.getMaximumValue();
        java.util.Locale locale56 = null;
        java.lang.String str57 = property47.getAsText(locale56);
        int int58 = property47.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime60 = property47.addWrapFieldToCopy(46);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.plusWeeks(0);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime45.withFields((org.joda.time.ReadablePartial) localDateTime62);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime45.minusMonths(39577228);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970" + "'", str15, "1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 31 + "'", int22 == 31);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "de");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "de");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "100" + "'", str42, "100");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 15 + "'", int43 == 15);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(property47);
// flaky:         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 31 + "'", int50 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 52 + "'", int52 == 52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 12 + "'", int55 == 12);
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Februar" + "'", str57, "Februar");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(localDateTime65);
    }

    @Test
    public void test17013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17013");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, 1L, periodType2);
        org.joda.time.Period period5 = period3.minusSeconds((-1));
        java.lang.String str6 = period3.toString();
        org.joda.time.Period period7 = period3.negated();
        org.joda.time.DurationFieldType[] durationFieldTypeArray8 = period7.getFieldTypes();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0.099S" + "'", str6, "PT0.099S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldTypeArray8);
    }

    @Test
    public void test17014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17014");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022-02-21T15:02:04.794Z");
        org.junit.Assert.assertNotNull(mutableDateTime1);
    }

    @Test
    public void test17015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17015");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap6);
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Locale locale11 = java.util.Locale.CANADA;
        java.lang.String str12 = locale10.getDisplayVariant(locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology9, locale11);
        java.util.Locale locale14 = java.util.Locale.GERMAN;
        java.util.Locale locale15 = java.util.Locale.CANADA;
        java.lang.String str16 = locale14.getDisplayVariant(locale15);
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.util.Locale locale18 = java.util.Locale.CANADA;
        java.lang.String str19 = locale17.getDisplayVariant(locale18);
        java.lang.String str20 = locale17.getISO3Language();
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.util.Locale locale22 = java.util.Locale.CANADA;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        java.util.Locale locale24 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale25 = java.util.Locale.GERMAN;
        java.lang.String str26 = locale25.getDisplayName();
        java.util.Locale locale27 = java.util.Locale.CANADA;
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = java.util.Locale.GERMAN;
        java.util.Locale locale31 = java.util.Locale.CANADA;
        java.lang.String str32 = locale30.getDisplayVariant(locale31);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology29, locale31, (java.lang.Integer) 10);
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.lang.String str36 = locale35.getDisplayName();
        java.util.Locale locale37 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale38 = java.util.Locale.UK;
        java.util.Locale[] localeArray39 = new java.util.Locale[] { locale11, locale15, locale17, locale21, locale24, locale25, locale27, locale31, locale35, locale37, locale38 };
        java.util.ArrayList<java.util.Locale> localeList40 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList40, localeArray39);
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.util.Locale> localeList43 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList40, filteringMode42);
        boolean boolean44 = strSet2.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4);
        org.joda.time.Duration duration46 = org.joda.time.Duration.standardDays((long) (byte) 1);
        boolean boolean47 = strSet2.remove((java.lang.Object) duration46);
        org.joda.time.Duration duration49 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period50 = duration49.toPeriod();
        org.joda.time.Duration duration52 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period53 = duration52.toPeriod();
        org.joda.time.Duration duration56 = duration52.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.Duration duration58 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period59 = duration58.toPeriod();
        org.joda.time.Duration duration60 = duration52.plus((org.joda.time.ReadableDuration) duration58);
        boolean boolean61 = duration49.isLongerThan((org.joda.time.ReadableDuration) duration52);
        org.joda.time.Duration duration63 = duration46.withDurationAdded((org.joda.time.ReadableDuration) duration52, 32);
        org.joda.time.Duration duration65 = duration46.minus(86500L);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime((long) (short) 1, chronology67);
        org.joda.time.DateTime dateTime69 = dateTime68.toDateTime();
        int int70 = dateTime68.getYear();
        int int71 = dateTime68.getSecondOfDay();
        org.joda.time.DateTime dateTime73 = dateTime68.minusMillis(97);
        org.joda.time.DateTime dateTime75 = dateTime68.withMillis(1645455600000L);
        org.joda.time.DateTime.Property property76 = dateTime68.year();
        org.joda.time.Interval interval77 = duration46.toIntervalTo((org.joda.time.ReadableInstant) dateTime68);
        int int78 = dateTime68.getSecondOfMinute();
        org.joda.time.DateTime dateTime79 = dateTime68.withTimeAtStartOfDay();
        boolean boolean81 = dateTime79.equals((java.lang.Object) "en-GB");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "deu" + "'", str20, "deu");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "German" + "'", str26, "German");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "de");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "de");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "German" + "'", str36, "German");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode42.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(localeList43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1970 + "'", int70 == 1970);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(interval77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test17016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17016");
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.millis();
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) 46, periodType3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(0L, 0L, periodType3, chronology5);
        org.joda.time.MutablePeriod mutablePeriod7 = mutablePeriod6.copy();
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.withMillis(0L);
        org.joda.time.Chronology chronology12 = instant11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.secondOfMinute();
        mutablePeriod6.setPeriod((long) 99, chronology12);
        org.joda.time.DateTimeField dateTimeField15 = chronology12.monthOfYear();
        org.joda.time.DurationField durationField16 = dateTimeField15.getDurationField();
        org.joda.time.tz.NameProvider nameProvider18 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        long long22 = dateTimeZone19.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) 100, 1L, periodType29);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((long) 100, 1L, periodType33);
        org.joda.time.Period period35 = period30.plus((org.joda.time.ReadablePeriod) period34);
        org.joda.time.Instant instant36 = new org.joda.time.Instant();
        org.joda.time.Instant instant38 = instant36.withMillis(0L);
        org.joda.time.Duration duration39 = period34.toDurationTo((org.joda.time.ReadableInstant) instant38);
        mutableDateTime26.add((org.joda.time.ReadableDuration) duration39, 39);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime26.secondOfMinute();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime26.minuteOfHour();
        java.lang.String str44 = property43.getAsShortText();
        java.util.Locale locale45 = java.util.Locale.GERMAN;
        java.util.Locale locale46 = locale45.stripExtensions();
        int int47 = property43.getMaximumTextLength(locale46);
        java.lang.String str48 = dateTimeZone19.getShortName((long) (short) 1, locale46);
        java.lang.String str51 = nameProvider18.getShortName(locale46, "PT86400S", "P90YT0.198S");
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((long) 100, 1L, periodType56);
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period((long) 100, 1L, periodType60);
        org.joda.time.Period period62 = period57.plus((org.joda.time.ReadablePeriod) period61);
        org.joda.time.Instant instant63 = new org.joda.time.Instant();
        org.joda.time.Instant instant65 = instant63.withMillis(0L);
        org.joda.time.Duration duration66 = period61.toDurationTo((org.joda.time.ReadableInstant) instant65);
        mutableDateTime53.add((org.joda.time.ReadableDuration) duration66, 39);
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime53.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime53.setZone(dateTimeZone70);
        int int72 = mutableDateTime53.getYearOfEra();
        mutableDateTime53.addMonths(41);
        org.joda.time.MutableDateTime mutableDateTime75 = mutableDateTime53.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property76 = mutableDateTime75.minuteOfHour();
        java.util.Locale locale78 = new java.util.Locale("en_US");
        int int79 = property76.getMaximumTextLength(locale78);
        java.lang.String str80 = locale78.getLanguage();
        java.lang.String str81 = locale78.getDisplayName();
        java.lang.String str84 = nameProvider18.getName(locale78, "0010-01-01T00:16:40.052Z", "PT0.594S");
        java.lang.String str85 = locale78.getDisplayScript();
        java.lang.String str86 = dateTimeField15.getAsText((long) 840, locale78);
        int int87 = dateTimeField15.getMaximumValue();
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(nameProvider18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "59" + "'", str44, "59");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "de");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "de");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00" + "'", str48, "+00:00");
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(instant65);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(dateTimeZone70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1969 + "'", int72 == 1969);
        org.junit.Assert.assertNotNull(mutableDateTime75);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertEquals(locale78.toString(), "en_us");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2 + "'", int79 == 2);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "en_us" + "'", str80, "en_us");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "en_us" + "'", str81, "en_us");
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "January" + "'", str86, "January");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 12 + "'", int87 == 12);
    }

    @Test
    public void test17017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17017");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.lang.Integer int4 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        boolean boolean6 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeFormatter7.getZone();
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period11 = duration10.toPeriod();
        org.joda.time.Duration duration14 = duration10.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) 100, 1L, periodType17);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) 100, 1L, periodType21);
        org.joda.time.Period period23 = period18.plus((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Instant instant24 = new org.joda.time.Instant();
        org.joda.time.Instant instant26 = instant24.withMillis(0L);
        org.joda.time.Duration duration27 = period22.toDurationTo((org.joda.time.ReadableInstant) instant26);
        long long28 = instant26.getMillis();
        org.joda.time.Interval interval29 = duration10.toIntervalTo((org.joda.time.ReadableInstant) instant26);
        org.joda.time.Instant instant30 = instant26.toInstant();
        org.joda.time.DateTimeZone dateTimeZone31 = instant26.getZone();
        org.joda.time.Instant instant33 = new org.joda.time.Instant();
        org.joda.time.Instant instant35 = instant33.withMillis(0L);
        org.joda.time.Chronology chronology36 = instant35.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.eras();
        java.util.Locale locale38 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology36, locale38, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property44 = localDateTime41.hourOfDay();
        org.joda.time.DateTimeField dateTimeField45 = property44.getField();
        int int46 = property44.get();
        org.joda.time.LocalDateTime localDateTime47 = property44.roundHalfFloorCopy();
        long long49 = chronology36.set((org.joda.time.ReadablePartial) localDateTime47, (long) 2022);
        org.joda.time.LocalDateTime localDateTime50 = org.joda.time.LocalDateTime.now(chronology36);
        org.joda.time.DateTimeField dateTimeField51 = chronology36.era();
        org.joda.time.MutableDateTime mutableDateTime52 = instant26.toMutableDateTime(chronology36);
        org.joda.time.Chronology chronology53 = chronology36.withUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter7.withChronology(chronology53);
        java.lang.StringBuffer stringBuffer55 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (short) 1, chronology57);
        org.joda.time.DateTime dateTime59 = dateTime58.toDateTime();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((long) (short) 1, chronology61);
        org.joda.time.DateTime dateTime63 = dateTime62.toDateTime();
        int int64 = dateTime59.compareTo((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.Duration duration66 = org.joda.time.Duration.standardSeconds(10L);
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime62, (org.joda.time.ReadableDuration) duration66);
        org.joda.time.DateMidnight dateMidnight68 = dateTime62.toDateMidnight();
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate71 = localDate69.minusMonths((int) ' ');
        org.joda.time.Chronology chronology72 = localDate69.getChronology();
        org.joda.time.DurationFieldType durationFieldType73 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate75 = localDate69.withFieldAdded(durationFieldType73, (int) (byte) 100);
        org.joda.time.LocalDate localDate77 = localDate75.minusMonths(55);
        boolean boolean78 = dateTime62.equals((java.lang.Object) localDate75);
        org.joda.time.DateTime dateTime80 = dateTime62.withSecondOfMinute(12);
        org.joda.time.DateTime.Property property81 = dateTime80.era();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter54.printTo(stringBuffer55, (org.joda.time.ReadableInstant) dateTime80);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 15 + "'", int46 == 15);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1645455600000L + "'", long49 == 1645455600000L);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTimeFormatter54);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(dateMidnight68);
        org.junit.Assert.assertNotNull(localDate71);
        org.junit.Assert.assertNotNull(chronology72);
        org.junit.Assert.assertNotNull(durationFieldType73);
        org.junit.Assert.assertNotNull(localDate75);
        org.junit.Assert.assertNotNull(localDate77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(property81);
    }

    @Test
    public void test17018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17018");
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.PeriodType periodType4 = periodType3.withSecondsRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withSecondsRemoved();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) 2, 0L, periodType5);
        org.joda.time.Period period7 = new org.joda.time.Period((long) 53713367, periodType5);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test17019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17019");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableDuration0, readableInstant1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 100, 1L, periodType5);
        org.joda.time.Period period8 = period6.minusSeconds((-1));
        java.lang.String str9 = period6.toString();
        org.joda.time.Period period10 = period6.toPeriod();
        org.joda.time.PeriodType periodType11 = period6.getPeriodType();
        org.joda.time.Period period12 = period2.normalizedStandard(periodType11);
        org.joda.time.Period period14 = period2.plusSeconds(45);
        org.joda.time.Period period16 = period14.minusYears(31);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableDuration19, readableInstant20);
        org.joda.time.Period period23 = period21.withDays((int) (byte) 1);
        org.joda.time.Period period25 = period23.minusWeeks(100);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) 100, 1L, periodType28);
        org.joda.time.Period period31 = period29.minusSeconds((-1));
        java.lang.String str32 = period29.toString();
        org.joda.time.Period period33 = period29.toPeriod();
        org.joda.time.PeriodType periodType34 = period29.getPeriodType();
        org.joda.time.Period period35 = period25.withPeriodType(periodType34);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 41, (long) 'x', periodType34);
        org.joda.time.Period period37 = period14.minus((org.joda.time.ReadablePeriod) mutablePeriod36);
        mutablePeriod36.addMillis(0);
        mutablePeriod36.addMonths(157);
        int int42 = mutablePeriod36.getSeconds();
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT0.099S" + "'", str9, "PT0.099S");
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PT0.099S" + "'", str32, "PT0.099S");
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test17020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17020");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setRawOffset(19);
        int int3 = timeZone0.getRawOffset();
        int int5 = timeZone0.getOffset(53L);
        java.util.TimeZone.setDefault(timeZone0);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) 100, 1L, periodType12);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) 100, 1L, periodType16);
        org.joda.time.Period period18 = period13.plus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Instant instant19 = new org.joda.time.Instant();
        org.joda.time.Instant instant21 = instant19.withMillis(0L);
        org.joda.time.Duration duration22 = period17.toDurationTo((org.joda.time.ReadableInstant) instant21);
        mutableDateTime9.add((org.joda.time.ReadableDuration) duration22, 39);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime9.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime9.setZone(dateTimeZone26);
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = java.util.Locale.GERMAN;
        java.util.Locale locale31 = locale30.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology29, locale30, (java.lang.Integer) 45, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone35 = dateTimeParserBucket34.getZone();
        long long37 = dateTimeZone26.getMillisKeepLocal(dateTimeZone35, 315532800097L);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((long) 31, dateTimeZone26);
        java.util.TimeZone timeZone39 = dateTimeZone26.toTimeZone();
        boolean boolean40 = timeZone0.hasSameRules(timeZone39);
        java.util.TimeZone timeZone42 = java.util.TimeZone.getTimeZone("");
        timeZone42.setRawOffset(39316455);
        boolean boolean45 = timeZone0.hasSameRules(timeZone42);
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "de");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de");
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 315532800097L + "'", long37 == 315532800097L);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test17021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17021");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.monthOfYear();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        int int4 = dateTime3.getSecondOfMinute();
        boolean boolean5 = dateTime3.isEqualNow();
        int int6 = dateTime3.getDayOfYear();
        org.joda.time.Chronology chronology7 = dateTime3.getChronology();
        long long8 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.DateTime dateTime10 = dateTime3.minusYears(0);
        org.joda.time.DateTime dateTime12 = dateTime10.withDayOfMonth((int) (byte) 10);
        int int13 = dateTime12.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property14 = dateTime12.yearOfEra();
        int int15 = dateTime12.getMinuteOfHour();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.toDateTime(chronology16);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test17022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17022");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap6);
        boolean boolean8 = strSet2.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        java.lang.Object[] objArray9 = strSet2.toArray();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "de" + "'", str1, "de");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test17023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17023");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime1.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime20 = property18.addWrapField(6);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str23 = dateTimeZone21.getNameKey((long) (byte) 0);
        mutableDateTime20.setZoneRetainFields(dateTimeZone21);
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) 100, 1L, periodType27);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) 100, 1L, periodType31);
        org.joda.time.Period period33 = period28.plus((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Instant instant34 = new org.joda.time.Instant();
        org.joda.time.Instant instant36 = instant34.withMillis(0L);
        org.joda.time.Duration duration37 = period32.toDurationTo((org.joda.time.ReadableInstant) instant36);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) 100, 1L, periodType40);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period((long) 100, 1L, periodType44);
        org.joda.time.Period period46 = period41.plus((org.joda.time.ReadablePeriod) period45);
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        org.joda.time.Instant instant49 = instant47.withMillis(0L);
        org.joda.time.Duration duration50 = period45.toDurationTo((org.joda.time.ReadableInstant) instant49);
        boolean boolean51 = instant36.isEqual((org.joda.time.ReadableInstant) instant49);
        boolean boolean52 = mutableDateTime20.isEqual((org.joda.time.ReadableInstant) instant36);
        org.joda.time.Chronology chronology53 = instant36.getChronology();
        org.joda.time.DurationField durationField54 = chronology53.minutes();
        boolean boolean55 = durationField54.isPrecise();
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(instant49);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test17024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17024");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime7 = localTime5.plusHours(100);
        org.joda.time.LocalTime localTime9 = localTime7.minusSeconds(53652105);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) 86396191);
        mutableDateTime11.setMinuteOfHour(2);
        int int14 = mutableDateTime11.getYearOfCentury();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate17 = localDate15.plusMonths(43);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.halfdays();
        boolean boolean19 = localDate17.isSupported(durationFieldType18);
        org.joda.time.LocalDate localDate21 = localDate17.plusMonths(52);
        org.joda.time.LocalDate.Property property22 = localDate21.dayOfYear();
        org.joda.time.DateTimeField dateTimeField23 = property22.getField();
        java.lang.String str24 = dateTimeField23.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = dateTimeField23.getType();
        boolean boolean26 = mutableDateTime11.isSupported(dateTimeFieldType25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property27 = localTime9.property(dateTimeFieldType25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 70 + "'", int14 == 70);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "DateTimeField[dayOfYear]" + "'", str24, "DateTimeField[dayOfYear]");
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test17025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17025");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = locale2.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 45, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeParserBucket6.getZone();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = localTime8.toDateTimeToday();
        org.joda.time.LocalTime.Property property10 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime12 = property10.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime13 = property10.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime15 = property10.addWrapFieldToCopy(39757160);
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test17026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17026");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime1.toMutableDateTime(dateTimeZone18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime23 = property20.addWrapField(401);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime23);
    }

    @Test
    public void test17027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17027");
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.eras();
        java.util.Locale locale6 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology4, locale6, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        int int14 = property12.get();
        org.joda.time.LocalDateTime localDateTime15 = property12.roundHalfFloorCopy();
        long long17 = chronology4.set((org.joda.time.ReadablePartial) localDateTime15, (long) 2022);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withWeekyear((int) (short) 10);
        int int20 = localDateTime19.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withSecondOfMinute(39);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.dayOfMonth();
        org.joda.time.LocalDateTime.Property property24 = localDateTime22.year();
        org.joda.time.LocalDateTime localDateTime25 = property24.roundCeilingCopy();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1645455600000L + "'", long17 == 1645455600000L);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test17028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17028");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.Instant instant5 = instant3.withMillis(0L);
        org.joda.time.Chronology chronology6 = instant5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        java.util.Locale locale8 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology6, locale8, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = property14.getField();
        int int16 = property14.get();
        org.joda.time.LocalDateTime localDateTime17 = property14.roundHalfFloorCopy();
        long long19 = chronology6.set((org.joda.time.ReadablePartial) localDateTime17, (long) 2022);
        org.joda.time.DateTime dateTime20 = dateTime1.toDateTime(chronology6);
        org.joda.time.DateTime dateTime22 = dateTime1.plusDays(22);
        java.lang.Object obj23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(obj23);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property28 = localDateTime25.hourOfDay();
        org.joda.time.DateTimeField dateTimeField29 = property28.getField();
        boolean boolean31 = property28.equals((java.lang.Object) '#');
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(chronology32);
        int int34 = dateTime33.getSecondOfMinute();
        int int35 = dateTime33.getYearOfEra();
        int int36 = property28.getDifference((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime dateTime40 = dateTime33.withDurationAdded((long) (byte) 0, 22);
        boolean boolean41 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTime dateTime43 = dateTime1.plusMillis(39469866);
        org.joda.time.DateTime dateTime45 = dateTime1.minusMillis(192);
        int int46 = dateTime45.getMillisOfDay();
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1645455600000L + "'", long19 == 1645455600000L);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 31 + "'", int34 == 31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2022 + "'", int35 == 2022);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(dateTime40);
// flaky:         org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 54211789 + "'", int46 == 54211789);
    }

    @Test
    public void test17029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17029");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 42, (long) 49, chronology2);
        mutablePeriod3.setPeriod((-1511999969L));
        mutablePeriod3.setSeconds(0);
        mutablePeriod3.add((int) 'x', 12022, 41, 86396, 1, 16, 15, (int) ' ');
        mutablePeriod3.add(8, 0, 4, 39338268, 53723651, 35, 367, 276);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableDuration26, readableInstant27);
        org.joda.time.Period period30 = period28.withDays((int) (byte) 1);
        org.joda.time.Period period32 = period30.minusWeeks(100);
        org.joda.time.Period period34 = period32.withMinutes((int) (short) 10);
        int int35 = period34.getMinutes();
        org.joda.time.Period period37 = period34.minusSeconds(53833716);
        mutablePeriod3.setPeriod((org.joda.time.ReadablePeriod) period37);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(period37);
    }

    @Test
    public void test17030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17030");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfWeek();
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = locale4.stripExtensions();
        int int6 = property3.getMaximumTextLength(locale4);
        org.joda.time.DateTime dateTime7 = property3.roundHalfCeilingCopy();
        org.joda.time.DateTime.Property property8 = dateTime7.secondOfDay();
        org.joda.time.DateTime.Property property9 = dateTime7.era();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test17031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17031");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = property5.getField();
        boolean boolean7 = property5.isLeap();
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale locale9 = java.util.Locale.CANADA;
        java.lang.String str10 = locale8.getDisplayVariant(locale9);
        java.lang.String str11 = locale9.getCountry();
        java.lang.String str12 = property5.getAsShortText(locale9);
        java.util.Set<java.lang.String> strSet13 = locale9.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder14 = builder1.setLocale(locale9);
        java.util.Locale locale15 = builder14.build();
        java.util.Locale.Builder builder16 = builder14.clearExtensions();
        java.util.Locale locale17 = builder16.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder16.removeUnicodeLocaleAttribute("2022-02-21T14:59:27.499Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 2022-02-21T14:59:27.499Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CA" + "'", str11, "CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "15" + "'", str12, "15");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_CA");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
    }

    @Test
    public void test17032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17032");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableDuration0, readableInstant1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 100, 1L, periodType5);
        org.joda.time.Period period8 = period6.minusSeconds((-1));
        java.lang.String str9 = period6.toString();
        org.joda.time.Period period10 = period6.toPeriod();
        org.joda.time.PeriodType periodType11 = period6.getPeriodType();
        org.joda.time.Period period12 = period2.normalizedStandard(periodType11);
        org.joda.time.Period period14 = period12.withSeconds(10);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.millis();
        boolean boolean16 = period12.isSupported(durationFieldType15);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        int int21 = dateTime20.getSecondOfMinute();
        boolean boolean22 = dateTime20.isEqualNow();
        int int23 = dateTime20.getDayOfYear();
        org.joda.time.Chronology chronology24 = dateTime20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology24);
        org.joda.time.DateTimeField dateTimeField26 = chronology24.year();
        org.joda.time.DateTimeField dateTimeField27 = chronology24.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now(chronology24);
        org.joda.time.DateTimeField dateTimeField29 = chronology24.minuteOfDay();
        org.joda.time.DurationField durationField30 = durationFieldType15.getField(chronology24);
        org.joda.time.DateTimeField dateTimeField31 = chronology24.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField32 = chronology24.minuteOfHour();
        long long34 = dateTimeField32.roundCeiling(0L);
        long long37 = dateTimeField32.getDifferenceAsLong(347L, (long) 39326483);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT0.099S" + "'", str9, "PT0.099S");
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-655L) + "'", long37 == (-655L));
    }

    @Test
    public void test17033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17033");
        org.joda.time.Period period1 = org.joda.time.Period.millis((-292275054));
        org.joda.time.Period period2 = period1.negated();
        org.joda.time.Period period3 = period1.negated();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test17034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17034");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 100, 1L, periodType5);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) 100, 1L, periodType9);
        org.joda.time.Period period11 = period6.plus((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.Instant instant14 = instant12.withMillis(0L);
        org.joda.time.Duration duration15 = period10.toDurationTo((org.joda.time.ReadableInstant) instant14);
        mutableDateTime2.add((org.joda.time.ReadableDuration) duration15, 39);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime2.secondOfMinute();
        org.joda.time.Instant instant19 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) 100, 1L, periodType24);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) 100, 1L, periodType28);
        org.joda.time.Period period30 = period25.plus((org.joda.time.ReadablePeriod) period29);
        org.joda.time.Instant instant31 = new org.joda.time.Instant();
        org.joda.time.Instant instant33 = instant31.withMillis(0L);
        org.joda.time.Duration duration34 = period29.toDurationTo((org.joda.time.ReadableInstant) instant33);
        mutableDateTime21.add((org.joda.time.ReadableDuration) duration34, 39);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime21.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime21.setZone(dateTimeZone38);
        int int40 = mutableDateTime21.getYearOfEra();
        mutableDateTime21.addMonths(41);
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime21.toMutableDateTimeISO();
        mutableDateTime43.addHours(21);
        boolean boolean47 = mutableDateTime43.isAfter((long) 86396191);
        int int48 = mutableDateTime43.getSecondOfDay();
        org.joda.time.Duration duration50 = org.joda.time.Duration.standardHours((long) (short) 1);
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate53 = localDate51.minusMonths((int) ' ');
        org.joda.time.Chronology chronology54 = localDate51.getChronology();
        org.joda.time.Period period55 = duration50.toPeriod(chronology54);
        mutableDateTime43.add((org.joda.time.ReadablePeriod) period55, 23);
        org.joda.time.Period period59 = period55.minusMillis(56);
        org.joda.time.Weeks weeks60 = period55.toStandardWeeks();
        org.joda.time.PeriodType periodType61 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType62 = periodType61.withDaysRemoved();
        org.joda.time.PeriodType periodType63 = periodType61.withMinutesRemoved();
        org.joda.time.Period period64 = period55.normalizedStandard(periodType63);
        org.joda.time.Period period65 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) mutableDateTime2, periodType63);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1969 + "'", int40 == 1969);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 75596 + "'", int48 == 75596);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(weeks60);
        org.junit.Assert.assertNotNull(periodType61);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertNotNull(period64);
    }

    @Test
    public void test17035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17035");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        org.joda.time.Chronology chronology3 = localDate0.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.LocalDate localDate6 = localDate0.withField(dateTimeFieldType4, 6);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property8 = localDate7.dayOfMonth();
        org.joda.time.Chronology chronology9 = localDate7.getChronology();
        org.joda.time.LocalDate.Property property10 = localDate7.dayOfWeek();
        org.joda.time.LocalDate localDate12 = localDate7.plusWeeks(56);
        org.joda.time.LocalDate localDate14 = localDate7.plusMonths(41);
        org.joda.time.LocalDate localDate16 = localDate14.minusMonths(16);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) 100, 1L, periodType21);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) 100, 1L, periodType25);
        org.joda.time.Period period27 = period22.plus((org.joda.time.ReadablePeriod) period26);
        org.joda.time.Instant instant28 = new org.joda.time.Instant();
        org.joda.time.Instant instant30 = instant28.withMillis(0L);
        org.joda.time.Duration duration31 = period26.toDurationTo((org.joda.time.ReadableInstant) instant30);
        mutableDateTime18.add((org.joda.time.ReadableDuration) duration31, 39);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime18.secondOfMinute();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime18.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime37 = property35.addWrapField(6);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str40 = dateTimeZone38.getNameKey((long) (byte) 0);
        mutableDateTime37.setZoneRetainFields(dateTimeZone38);
        java.lang.String str43 = dateTimeZone38.getNameKey((long) 3);
        org.joda.time.DateTime dateTime44 = localDate14.toDateTimeAtStartOfDay(dateTimeZone38);
        org.joda.time.DateMidnight dateMidnight45 = localDate0.toDateMidnight(dateTimeZone38);
        org.joda.time.LocalDate.Property property46 = localDate0.yearOfCentury();
        int int47 = localDate0.getWeekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField49 = localDate0.getField(785);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 785");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "UTC" + "'", str40, "UTC");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "UTC" + "'", str43, "UTC");
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateMidnight45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 8 + "'", int47 == 8);
    }

    @Test
    public void test17036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17036");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime localTime6 = localTime4.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime8 = localTime6.plusMillis((int) (byte) 100);
        org.joda.time.DateTime dateTime9 = dateTime2.withFields((org.joda.time.ReadablePartial) localTime8);
        org.joda.time.DateTime dateTime10 = dateTime2.toDateTimeISO();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 100);
        org.joda.time.DateTime.Property property13 = dateTime12.monthOfYear();
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTimeISO();
        boolean boolean15 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime dateTime17 = dateTime14.withMillis((long) 39);
        org.joda.time.DateTime.Property property18 = dateTime17.secondOfMinute();
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) 100, 1L, periodType21);
        org.joda.time.Period period24 = period22.minusSeconds((-1));
        java.lang.String str25 = period22.toString();
        org.joda.time.Period period26 = period22.toPeriod();
        org.joda.time.Days days27 = period26.toStandardDays();
        org.joda.time.Period period29 = period26.minusWeeks(22);
        org.joda.time.MutablePeriod mutablePeriod30 = period26.toMutablePeriod();
        boolean boolean31 = dateTime17.equals((java.lang.Object) period26);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) 100, 1L, periodType36);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) 100, 1L, periodType40);
        org.joda.time.Period period42 = period37.plus((org.joda.time.ReadablePeriod) period41);
        org.joda.time.Instant instant43 = new org.joda.time.Instant();
        org.joda.time.Instant instant45 = instant43.withMillis(0L);
        org.joda.time.Duration duration46 = period41.toDurationTo((org.joda.time.ReadableInstant) instant45);
        mutableDateTime33.add((org.joda.time.ReadableDuration) duration46, 39);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime33.yearOfEra();
        mutableDateTime33.setWeekOfWeekyear(14);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime33.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.UTC;
        long long56 = dateTimeZone53.convertLocalToUTC((long) (byte) 100, false);
        mutableDateTime33.setZone(dateTimeZone53);
        long long60 = dateTimeZone53.adjustOffset(315532800097L, true);
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(dateTimeZone53);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) 28);
        org.joda.time.LocalDateTime localDateTime64 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property65 = localDateTime64.monthOfYear();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime(chronology66);
        int int68 = dateTime67.getSecondOfMinute();
        boolean boolean69 = dateTime67.isEqualNow();
        int int70 = dateTime67.getDayOfYear();
        org.joda.time.Chronology chronology71 = dateTime67.getChronology();
        long long72 = property65.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.LocalDateTime localDateTime73 = property65.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime((-1511999969L));
        org.joda.time.LocalDateTime localDateTime76 = localDateTime73.withFields((org.joda.time.ReadablePartial) localDateTime75);
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        java.lang.String str78 = dateTimeFieldType77.toString();
        org.joda.time.LocalDateTime.Property property79 = localDateTime73.property(dateTimeFieldType77);
        int int80 = dateTime63.get(dateTimeFieldType77);
        int int81 = mutableDateTime61.get(dateTimeFieldType77);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime83 = dateTime17.withField(dateTimeFieldType77, 903);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 903 for hourOfHalfday must be in the range [0,11]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PT0.099S" + "'", str25, "PT0.099S");
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(mutablePeriod30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(instant45);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 100L + "'", long56 == 100L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 315532800097L + "'", long60 == 315532800097L);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(property65);
// flaky:         org.junit.Assert.assertTrue("'" + int68 + "' != '" + 32 + "'", int68 == 32);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 52 + "'", int70 == 52);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(localDateTime76);
        org.junit.Assert.assertNotNull(dateTimeFieldType77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hourOfHalfday" + "'", str78, "hourOfHalfday");
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 3 + "'", int81 == 3);
    }

    @Test
    public void test17037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17037");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setRawOffset(19);
        int int3 = timeZone0.getRawOffset();
        int int5 = timeZone0.getOffset(53L);
        java.util.TimeZone.setDefault(timeZone0);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) 100, 1L, periodType12);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) 100, 1L, periodType16);
        org.joda.time.Period period18 = period13.plus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Instant instant19 = new org.joda.time.Instant();
        org.joda.time.Instant instant21 = instant19.withMillis(0L);
        org.joda.time.Duration duration22 = period17.toDurationTo((org.joda.time.ReadableInstant) instant21);
        mutableDateTime9.add((org.joda.time.ReadableDuration) duration22, 39);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime9.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime9.setZone(dateTimeZone26);
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = java.util.Locale.GERMAN;
        java.util.Locale locale31 = locale30.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology29, locale30, (java.lang.Integer) 45, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone35 = dateTimeParserBucket34.getZone();
        long long37 = dateTimeZone26.getMillisKeepLocal(dateTimeZone35, 315532800097L);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((long) 31, dateTimeZone26);
        java.util.TimeZone timeZone39 = dateTimeZone26.toTimeZone();
        boolean boolean40 = timeZone0.hasSameRules(timeZone39);
        timeZone0.setRawOffset(39580809);
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+10:59");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "de");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de");
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 315532800097L + "'", long37 == 315532800097L);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test17038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17038");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTime dateTime3 = dateTime2.toDateTime();
        int int4 = dateTime2.getYear();
        int int5 = dateTime2.getSecondOfDay();
        org.joda.time.DateTime dateTime7 = dateTime2.minusMillis(97);
        org.joda.time.DateTime dateTime9 = dateTime2.withMillis(1645455600000L);
        org.joda.time.DateTime.Property property10 = dateTime2.year();
        org.joda.time.DateTime dateTime12 = dateTime2.withYearOfEra(39251693);
        org.joda.time.DateTime dateTime14 = dateTime12.plusSeconds(53768216);
        org.joda.time.DateTime.Property property15 = dateTime12.yearOfEra();
        org.joda.time.DateTime dateTime17 = dateTime12.withYearOfCentury(37);
        org.joda.time.DateTime dateTime18 = dateTime12.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology19 = dateTime12.getChronology();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1970 + "'", int4 == 1970);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test17039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17039");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(readableInstant1, readableInstant2, periodType3);
        org.joda.time.PeriodType periodType5 = periodType3.withHoursRemoved();
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale locale9 = locale8.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology7, locale8, (java.lang.Integer) 45, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket12.getZone();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = localTime14.toDateTimeToday();
        org.joda.time.LocalTime.Property property16 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime18 = property16.addNoWrapToCopy(46);
        org.joda.time.LocalTime localTime20 = property16.setCopy(2);
        org.joda.time.LocalTime localTime21 = property16.roundFloorCopy();
        org.joda.time.LocalTime localTime23 = property16.addCopy(48L);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        long long29 = dateTimeZone26.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone26);
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = java.util.Locale.GERMAN;
        java.util.Locale locale35 = locale34.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology33, locale34, (java.lang.Integer) 45, (int) '4');
        java.lang.String str39 = dateTimeZone26.getName(31536000000L, locale34);
        java.lang.String str40 = localTime23.toString("10:54:18.439", locale34);
        org.joda.time.LocalTime localTime42 = localTime23.plusMillis((int) '4');
        boolean boolean43 = periodType3.equals((java.lang.Object) localTime23);
        org.joda.time.Period period44 = new org.joda.time.Period((long) 121, periodType3);
        org.joda.time.PeriodType periodType45 = periodType3.withMonthsRemoved();
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "de");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "de");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00" + "'", str39, "+00:00");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "10:54:18.439" + "'", str40, "10:54:18.439");
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(periodType45);
    }

    @Test
    public void test17040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17040");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Calendar calendar4 = mutableDateTime1.toCalendar(locale2);
        mutableDateTime1.addMonths(20);
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period9 = duration8.toPeriod();
        org.joda.time.Duration duration12 = duration8.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration12, readableInstant13);
        org.joda.time.Duration duration15 = duration12.toDuration();
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period18 = duration17.toPeriod();
        org.joda.time.Duration duration21 = duration17.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) 100, 1L, periodType24);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) 100, 1L, periodType28);
        org.joda.time.Period period30 = period25.plus((org.joda.time.ReadablePeriod) period29);
        org.joda.time.Instant instant31 = new org.joda.time.Instant();
        org.joda.time.Instant instant33 = instant31.withMillis(0L);
        org.joda.time.Duration duration34 = period29.toDurationTo((org.joda.time.ReadableInstant) instant33);
        org.joda.time.Instant instant36 = instant33.plus((long) (byte) -1);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (short) 1, chronology38);
        org.joda.time.Instant instant40 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType41 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime39, (org.joda.time.ReadableInstant) instant40, periodType41);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration17, (org.joda.time.ReadableInstant) instant33, periodType41);
        int int44 = duration12.compareTo((org.joda.time.ReadableDuration) duration17);
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.monthOfYear();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (short) 1, chronology48);
        org.joda.time.Instant instant50 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType51 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime49, (org.joda.time.ReadableInstant) instant50, periodType51);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int54 = instant50.get(dateTimeFieldType53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime45.withField(dateTimeFieldType53, 39);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.minusSeconds(52);
        int int59 = localDateTime58.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.plusWeeks(22);
        org.joda.time.ReadableDuration readableDuration62 = null;
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period(readableDuration62, readableInstant63);
        org.joda.time.PeriodType periodType67 = null;
        org.joda.time.Period period68 = new org.joda.time.Period((long) 100, 1L, periodType67);
        org.joda.time.Period period70 = period68.minusSeconds((-1));
        java.lang.String str71 = period68.toString();
        org.joda.time.Period period72 = period68.toPeriod();
        org.joda.time.PeriodType periodType73 = period68.getPeriodType();
        org.joda.time.Period period74 = period64.normalizedStandard(periodType73);
        org.joda.time.Period period76 = period74.withSeconds(10);
        int int77 = period74.size();
        org.joda.time.LocalDateTime localDateTime78 = localDateTime58.plus((org.joda.time.ReadablePeriod) period74);
        org.joda.time.PeriodType periodType79 = period74.getPeriodType();
        org.joda.time.PeriodType periodType80 = periodType79.withMonthsRemoved();
        org.joda.time.Period period81 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, (org.joda.time.ReadableDuration) duration12, periodType80);
        mutableDateTime1.add(100L);
        org.joda.time.Instant instant87 = new org.joda.time.Instant();
        org.joda.time.Instant instant89 = instant87.withMillis(0L);
        org.joda.time.Chronology chronology90 = instant89.getChronology();
        org.joda.time.DurationField durationField91 = chronology90.eras();
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod((long) (short) 10, (long) '#', chronology90);
        org.joda.time.DurationField durationField93 = chronology90.eras();
        org.joda.time.LocalDateTime localDateTime94 = new org.joda.time.LocalDateTime(0L, chronology90);
        org.joda.time.MutableDateTime mutableDateTime95 = mutableDateTime1.toMutableDateTime(chronology90);
        int int96 = mutableDateTime1.getRoundingMode();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "German" + "'", str3, "German");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
// flaky:         org.junit.Assert.assertTrue("'" + int54 + "' != '" + 903 + "'", int54 == 903);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 22 + "'", int59 == 22);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "PT0.099S" + "'", str71, "PT0.099S");
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(periodType73);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 8 + "'", int77 == 8);
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertNotNull(periodType79);
        org.junit.Assert.assertNotNull(periodType80);
        org.junit.Assert.assertNotNull(instant89);
        org.junit.Assert.assertNotNull(chronology90);
        org.junit.Assert.assertNotNull(durationField91);
        org.junit.Assert.assertNotNull(durationField93);
        org.junit.Assert.assertNotNull(mutableDateTime95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
    }

    @Test
    public void test17041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17041");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.centuryOfEra();
        org.joda.time.DateTime dateTime2 = mutableDateTime0.toDateTimeISO();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (short) 1, chronology4);
        org.joda.time.DateTime dateTime6 = dateTime5.toDateTime();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (short) 1, chronology8);
        org.joda.time.DateTime dateTime10 = dateTime9.toDateTime();
        int int11 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardSeconds(10L);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableDuration) duration13);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 100, 1L, periodType19);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) 100, 1L, periodType23);
        org.joda.time.Period period25 = period20.plus((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Instant instant26 = new org.joda.time.Instant();
        org.joda.time.Instant instant28 = instant26.withMillis(0L);
        org.joda.time.Duration duration29 = period24.toDurationTo((org.joda.time.ReadableInstant) instant28);
        mutableDateTime16.add((org.joda.time.ReadableDuration) duration29, 39);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean33 = mutableDateTime16.isSupported(dateTimeFieldType32);
        int int34 = mutableDateTime16.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime16.dayOfWeek();
        org.joda.time.Duration duration37 = org.joda.time.Duration.standardMinutes((long) (short) -1);
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period40 = duration39.toPeriod();
        org.joda.time.Duration duration43 = duration39.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration43, readableInstant44);
        org.joda.time.Duration duration46 = duration43.toDuration();
        org.joda.time.Duration duration48 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period49 = duration48.toPeriod();
        org.joda.time.Duration duration52 = duration48.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((long) 100, 1L, periodType55);
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period((long) 100, 1L, periodType59);
        org.joda.time.Period period61 = period56.plus((org.joda.time.ReadablePeriod) period60);
        org.joda.time.Instant instant62 = new org.joda.time.Instant();
        org.joda.time.Instant instant64 = instant62.withMillis(0L);
        org.joda.time.Duration duration65 = period60.toDurationTo((org.joda.time.ReadableInstant) instant64);
        org.joda.time.Instant instant67 = instant64.plus((long) (byte) -1);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime((long) (short) 1, chronology69);
        org.joda.time.Instant instant71 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType72 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime70, (org.joda.time.ReadableInstant) instant71, periodType72);
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration48, (org.joda.time.ReadableInstant) instant64, periodType72);
        int int75 = duration43.compareTo((org.joda.time.ReadableDuration) duration48);
        boolean boolean76 = duration37.isShorterThan((org.joda.time.ReadableDuration) duration43);
        mutableDateTime16.add((org.joda.time.ReadableDuration) duration37);
        boolean boolean78 = duration13.isEqual((org.joda.time.ReadableDuration) duration37);
        org.joda.time.Duration duration79 = org.joda.time.Duration.ZERO;
        org.joda.time.Hours hours80 = duration79.toStandardHours();
        org.joda.time.Duration duration81 = duration79.toDuration();
        org.joda.time.Duration duration83 = duration37.withDurationAdded((org.joda.time.ReadableDuration) duration81, 43);
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime0, (org.joda.time.ReadableDuration) duration83);
        mutablePeriod84.setPeriod((-1695323999149023L));
        org.joda.time.MutableDateTime mutableDateTime87 = new org.joda.time.MutableDateTime((java.lang.Object) (-1695323999149023L));
        mutableDateTime87.addMillis(39527091);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(instant64);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(instant67);
        org.junit.Assert.assertNotNull(periodType72);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(duration79);
        org.junit.Assert.assertNotNull(hours80);
        org.junit.Assert.assertNotNull(duration81);
        org.junit.Assert.assertNotNull(duration83);
    }

    @Test
    public void test17042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17042");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 32496, (-540032677822L));
    }

    @Test
    public void test17043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17043");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        mutableDateTime1.setDayOfYear((int) ' ');
        mutableDateTime1.addHours(11);
        java.lang.String str22 = mutableDateTime1.toString();
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration27 = duration24.withDurationAdded((long) 20, 0);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Duration duration30 = org.joda.time.Duration.standardDays((-1L));
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardDays((long) (byte) 1);
        java.lang.String str33 = duration32.toString();
        org.joda.time.Duration duration34 = duration30.plus((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(chronology35);
        int int37 = dateTime36.getSecondOfMinute();
        int int38 = dateTime36.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone39 = dateTime36.getZone();
        org.joda.time.DateTime dateTime41 = dateTime36.plusYears(53);
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType43 = periodType42.withSecondsRemoved();
        org.joda.time.Period period44 = duration34.toPeriodFrom((org.joda.time.ReadableInstant) dateTime36, periodType43);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration34, 54100642);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1969-02-02T10:59:56.191Z" + "'", str22, "1969-02-02T10:59:56.191Z");
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PT86400S" + "'", str33, "PT86400S");
        org.junit.Assert.assertNotNull(duration34);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 32 + "'", int37 == 32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2022 + "'", int38 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(period44);
    }

    @Test
    public void test17044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17044");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("53992183", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=53992183");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17045");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter3.getParser();
        java.lang.Integer int5 = dateTimeFormatter3.getPivotYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter3.getPrinter();
        boolean boolean7 = dateTimeFormatter3.isPrinter();
        java.util.Locale locale8 = dateTimeFormatter3.getLocale();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate12 = localDate10.minusMonths((int) ' ');
        org.joda.time.Chronology chronology13 = localDate10.getChronology();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(0L, chronology13, locale14, (java.lang.Integer) 59, 12);
        org.joda.time.DurationField durationField18 = chronology13.years();
        java.lang.String str19 = chronology13.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter3.withChronology(chronology13);
        java.util.Locale locale21 = dateTimeFormatter20.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter20.withPivotYear(39435531);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.parse("54025962", dateTimeFormatter20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ISOChronology[UTC]" + "'", str19, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNull(locale21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
    }

    @Test
    public void test17046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17046");
        org.joda.time.Period period8 = new org.joda.time.Period((-12000), 53773760, 3, 53811508, 39398852, 39246272, 265, 0);
        org.joda.time.DurationFieldType durationFieldType9 = null;
        boolean boolean10 = period8.isSupported(durationFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test17047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17047");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.LocalTime.Property property4 = localTime3.minuteOfHour();
        org.joda.time.LocalTime localTime5 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime6 = property4.roundHalfFloorCopy();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        int int11 = dateTime10.getSecondOfMinute();
        boolean boolean12 = dateTime10.isEqualNow();
        int int13 = dateTime10.getDayOfYear();
        org.joda.time.Chronology chronology14 = dateTime10.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.year();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(chronology14);
        org.joda.time.DateTime.Property property18 = dateTime17.hourOfDay();
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTime dateTime21 = dateTime17.withFieldAdded(durationFieldType19, 17);
        org.joda.time.DateTime.Property property22 = dateTime21.dayOfWeek();
        org.joda.time.DateTime dateTime23 = localTime6.toDateTime((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime25 = dateTime23.withWeekyear(53638420);
        org.joda.time.DateTime.Property property26 = dateTime23.yearOfCentury();
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    public void test17048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17048");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(dateTimeZone1);
        int int4 = localDate3.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate6 = localDate3.minusDays(54144);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test17049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17049");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("UTC");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        java.lang.String str5 = languageRange1.getRange();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property7 = localDate6.dayOfMonth();
        org.joda.time.Chronology chronology8 = localDate6.getChronology();
        org.joda.time.LocalDate.Property property9 = localDate6.dayOfWeek();
        org.joda.time.LocalDate localDate11 = localDate6.plusWeeks(56);
        org.joda.time.LocalDate localDate13 = localDate6.plusMonths(41);
        org.joda.time.LocalDate localDate15 = localDate13.minusMonths(16);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) 100, 1L, periodType20);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) 100, 1L, periodType24);
        org.joda.time.Period period26 = period21.plus((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Instant instant27 = new org.joda.time.Instant();
        org.joda.time.Instant instant29 = instant27.withMillis(0L);
        org.joda.time.Duration duration30 = period25.toDurationTo((org.joda.time.ReadableInstant) instant29);
        mutableDateTime17.add((org.joda.time.ReadableDuration) duration30, 39);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime17.secondOfMinute();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime17.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime36 = property34.addWrapField(6);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str39 = dateTimeZone37.getNameKey((long) (byte) 0);
        mutableDateTime36.setZoneRetainFields(dateTimeZone37);
        java.lang.String str42 = dateTimeZone37.getNameKey((long) 3);
        org.joda.time.DateTime dateTime43 = localDate13.toDateTimeAtStartOfDay(dateTimeZone37);
        org.joda.time.Chronology chronology44 = localDate13.getChronology();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.Interval interval46 = localDate13.toInterval(dateTimeZone45);
        org.joda.time.LocalDate localDate48 = localDate13.withEra(0);
        org.joda.time.LocalDate.Property property49 = localDate48.monthOfYear();
        boolean boolean50 = languageRange1.equals((java.lang.Object) property49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "utc" + "'", str2, "utc");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "utc" + "'", str4, "utc");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "utc" + "'", str5, "utc");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "UTC" + "'", str39, "UTC");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTC" + "'", str42, "UTC");
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test17050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17050");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration3, (int) (short) 100);
        mutableDateTime1.setYear(10);
        mutableDateTime1.addSeconds((int) (short) 0);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime1.minuteOfDay();
        mutableDateTime1.addHours((int) (byte) 100);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) (short) 10, 100, (int) 'a', 21);
        int int18 = mutablePeriod17.getWeeks();
        mutablePeriod17.setMinutes(51);
        mutablePeriod17.add(45747072000022L);
        mutableDateTime1.add((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime1.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) 100, 1L, periodType29);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((long) 100, 1L, periodType33);
        org.joda.time.Period period35 = period30.plus((org.joda.time.ReadablePeriod) period34);
        org.joda.time.Instant instant36 = new org.joda.time.Instant();
        org.joda.time.Instant instant38 = instant36.withMillis(0L);
        org.joda.time.Duration duration39 = period34.toDurationTo((org.joda.time.ReadableInstant) instant38);
        mutableDateTime26.add((org.joda.time.ReadableDuration) duration39, 39);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean43 = mutableDateTime26.isSupported(dateTimeFieldType42);
        org.joda.time.Duration duration45 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) (short) 1, chronology47);
        org.joda.time.DateTime dateTime49 = dateTime48.toDateTime();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (short) 1, chronology51);
        org.joda.time.DateTime dateTime53 = dateTime52.toDateTime();
        int int54 = dateTime49.compareTo((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.Duration duration56 = org.joda.time.Duration.standardSeconds(10L);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime52, (org.joda.time.ReadableDuration) duration56);
        org.joda.time.Duration duration59 = duration45.withDurationAdded((org.joda.time.ReadableDuration) duration56, 10);
        org.joda.time.Duration duration60 = duration59.toDuration();
        mutableDateTime26.add((org.joda.time.ReadableDuration) duration59);
        org.joda.time.LocalDateTime localDateTime62 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property65 = localDateTime62.hourOfDay();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime62.plusMillis((int) (byte) 0);
        org.joda.time.DateTime dateTime68 = localDateTime62.toDateTime();
        org.joda.time.DateTime dateTime70 = dateTime68.withYear(53644753);
        int int71 = dateTime70.getMillisOfSecond();
        org.joda.time.DateTime dateTime73 = dateTime70.minusMinutes(365);
        org.joda.time.Duration duration75 = org.joda.time.Duration.standardSeconds((long) 49);
        org.joda.time.DateTime dateTime76 = dateTime70.minus((org.joda.time.ReadableDuration) duration75);
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime26, (org.joda.time.ReadableDuration) duration75);
        mutableDateTime1.setDate((org.joda.time.ReadableInstant) mutableDateTime26);
        boolean boolean79 = mutableDateTime1.isEqualNow();
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime70);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + 400 + "'", int71 == 400);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(duration75);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test17051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17051");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        int int18 = mutableDateTime1.getSecondOfMinute();
        java.lang.Object obj19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(obj19);
        boolean boolean21 = dateTime20.isBeforeNow();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = dateTime20.withZoneRetainFields(dateTimeZone22);
        int int24 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) dateTime20);
        mutableDateTime1.addSeconds(39537343);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 56 + "'", int18 == 56);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test17052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17052");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime1.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime20 = property18.addWrapField(6);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str23 = dateTimeZone21.getNameKey((long) (byte) 0);
        mutableDateTime20.setZoneRetainFields(dateTimeZone21);
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) 100, 1L, periodType27);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) 100, 1L, periodType31);
        org.joda.time.Period period33 = period28.plus((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Instant instant34 = new org.joda.time.Instant();
        org.joda.time.Instant instant36 = instant34.withMillis(0L);
        org.joda.time.Duration duration37 = period32.toDurationTo((org.joda.time.ReadableInstant) instant36);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) 100, 1L, periodType40);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period((long) 100, 1L, periodType44);
        org.joda.time.Period period46 = period41.plus((org.joda.time.ReadablePeriod) period45);
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        org.joda.time.Instant instant49 = instant47.withMillis(0L);
        org.joda.time.Duration duration50 = period45.toDurationTo((org.joda.time.ReadableInstant) instant49);
        boolean boolean51 = instant36.isEqual((org.joda.time.ReadableInstant) instant49);
        boolean boolean52 = mutableDateTime20.isEqual((org.joda.time.ReadableInstant) instant36);
        org.joda.time.Chronology chronology53 = instant36.getChronology();
        org.joda.time.MutableDateTime mutableDateTime54 = instant36.toMutableDateTime();
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(instant49);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(mutableDateTime54);
    }

    @Test
    public void test17053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17053");
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 100, 1L, periodType10);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) 100, 1L, periodType14);
        org.joda.time.Period period16 = period11.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Instant instant17 = new org.joda.time.Instant();
        org.joda.time.Instant instant19 = instant17.withMillis(0L);
        org.joda.time.Duration duration20 = period15.toDurationTo((org.joda.time.ReadableInstant) instant19);
        mutableDateTime7.add((org.joda.time.ReadableDuration) duration20, 39);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime7.yearOfEra();
        mutableDateTime7.setWeekOfWeekyear(14);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate28 = localDate26.minusMonths((int) ' ');
        org.joda.time.Chronology chronology29 = localDate26.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.minuteOfDay();
        mutableDateTime7.setChronology(chronology29);
        org.joda.time.DurationField durationField32 = chronology29.days();
        org.joda.time.DurationField durationField33 = chronology29.eras();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(39794490, 44, 1135, 99, 638, 72102332, chronology29);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(durationField33);
    }

    @Test
    public void test17054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17054");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Iterator<java.lang.String> strItor3 = strSet2.iterator();
        java.lang.Object[] objArray4 = strSet2.toArray();
        java.util.Spliterator<java.lang.String> strSpliterator5 = strSet2.spliterator();
        strSet2.clear();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(strSpliterator5);
    }

    @Test
    public void test17055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17055");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        long long5 = dateTimeZone1.convertLocalToUTC((long) 3, true);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone1);
        java.lang.String str7 = dateTimeZone1.toString();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone1);
        java.lang.Object obj9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj9);
        org.joda.time.DateTime.Property property11 = dateTime10.millisOfDay();
        org.joda.time.DateTime dateTime12 = property11.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime13 = property11.getDateTime();
        int int14 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3L + "'", long5 == 3L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test17056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17056");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(0, 955, 53677371, 170);
        java.lang.String str5 = mutablePeriod4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT955M53677371.170S" + "'", str5, "PT955M53677371.170S");
    }

    @Test
    public void test17057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17057");
        java.util.Locale locale1 = new java.util.Locale("10:58:57.985");
        org.junit.Assert.assertEquals(locale1.toString(), "10:58:57.985");
    }

    @Test
    public void test17058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17058");
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.eras();
        java.util.Locale locale6 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology4, locale6, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        int int14 = property12.get();
        org.joda.time.LocalDateTime localDateTime15 = property12.roundHalfFloorCopy();
        long long17 = chronology4.set((org.joda.time.ReadablePartial) localDateTime15, (long) 2022);
        org.joda.time.DateTimeField dateTimeField18 = chronology4.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField19 = chronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField20 = chronology4.millisOfSecond();
        long long23 = dateTimeField20.getDifferenceAsLong((long) 48, (long) 28);
        java.lang.String str24 = dateTimeField20.toString();
        long long27 = dateTimeField20.getDifferenceAsLong(0L, (long) 59);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1645455600000L + "'", long17 == 1645455600000L);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 20L + "'", long23 == 20L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "DateTimeField[millisOfSecond]" + "'", str24, "DateTimeField[millisOfSecond]");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-59L) + "'", long27 == (-59L));
    }

    @Test
    public void test17059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17059");
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.millis();
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) 46, periodType3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(0L, 0L, periodType3, chronology5);
        org.joda.time.MutablePeriod mutablePeriod7 = mutablePeriod6.copy();
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.withMillis(0L);
        org.joda.time.Chronology chronology12 = instant11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.secondOfMinute();
        mutablePeriod6.setPeriod((long) 99, chronology12);
        org.joda.time.DurationField durationField15 = chronology12.hours();
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test17060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17060");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getSecondOfMinute();
        int int3 = dateTime1.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone4 = dateTime1.getZone();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) 100, 1L, periodType9);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) 100, 1L, periodType13);
        org.joda.time.Period period15 = period10.plus((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Instant instant16 = new org.joda.time.Instant();
        org.joda.time.Instant instant18 = instant16.withMillis(0L);
        org.joda.time.Duration duration19 = period14.toDurationTo((org.joda.time.ReadableInstant) instant18);
        mutableDateTime6.add((org.joda.time.ReadableDuration) duration19, 39);
        mutableDateTime6.setDayOfYear(22);
        boolean boolean24 = dateTime1.isEqual((org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.DateTime dateTime26 = dateTime1.withYearOfEra(50);
        org.joda.time.LocalTime localTime27 = dateTime1.toLocalTime();
        org.joda.time.LocalTime localTime29 = localTime27.plusSeconds(840);
        int int30 = localTime29.getMillisOfDay();
        org.joda.time.Chronology chronology31 = localTime29.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime33 = localTime29.withHourOfDay(38);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 38 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 55052539 + "'", int30 == 55052539);
        org.junit.Assert.assertNotNull(chronology31);
    }

    @Test
    public void test17061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17061");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getSecondOfMinute();
        boolean boolean3 = dateTime1.isEqualNow();
        int int4 = dateTime1.getDayOfYear();
        org.joda.time.Chronology chronology5 = dateTime1.getChronology();
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardSeconds(10L);
        org.joda.time.DateTime dateTime8 = dateTime1.plus((org.joda.time.ReadableDuration) duration7);
        org.joda.time.Duration duration9 = duration7.toDuration();
        org.joda.time.Period period11 = org.joda.time.Period.hours(44);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(2022, (int) ' ', 6, (int) (short) 100);
        org.joda.time.Period period17 = period11.minus((org.joda.time.ReadablePeriod) mutablePeriod16);
        int[] intArray18 = period11.getValues();
        boolean boolean19 = duration7.equals((java.lang.Object) intArray18);
        org.joda.time.Duration duration21 = duration7.minus(0L);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 0, 0, 44, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(duration21);
    }

    @Test
    public void test17062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17062");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str7 = dateTimeFieldType6.getName();
        int int8 = localDateTime0.indexOf(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime0.minusSeconds((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str14 = dateTimeFieldType13.getName();
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.property(dateTimeFieldType13);
        int int16 = localDateTime12.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withMillisOfDay(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = localDateTime18.toString(dateTimeFormatter19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.plusMonths(53600069);
        org.joda.time.LocalDateTime.Property property23 = localDateTime18.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        long long27 = dateTimeZone24.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusSeconds(39);
        org.joda.time.LocalDateTime.Property property31 = localDateTime28.secondOfMinute();
        org.joda.time.LocalDateTime.Property property32 = localDateTime28.weekOfWeekyear();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (short) 1, chronology34);
        org.joda.time.Instant instant36 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType37 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) instant36, periodType37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int40 = instant36.get(dateTimeFieldType39);
        int int41 = localDateTime28.indexOf(dateTimeFieldType39);
        org.joda.time.LocalDateTime.Property property42 = localDateTime18.property(dateTimeFieldType39);
        org.joda.time.LocalDateTime.Property property43 = localDateTime18.dayOfWeek();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "clockhourOfDay" + "'", str7, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "dayOfMonth" + "'", str14, "dayOfMonth");
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2022-02-21T00:00:00.001" + "'", str20, "2022-02-21T00:00:00.001");
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 903 + "'", int40 == 903);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(property43);
    }

    @Test
    public void test17063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17063");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.lang.String str2 = timeZone0.getID();
        int int3 = timeZone0.getRawOffset();
        int int4 = timeZone0.getRawOffset();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.hourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.plusMillis((int) (byte) 0);
        int int16 = localDateTime9.compareTo((org.joda.time.ReadablePartial) localDateTime10);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime9.minusMonths(44);
        org.joda.time.LocalDateTime.Property property19 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime9);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime9.withYear(52);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableDuration23, readableInstant24);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) 100, 1L, periodType28);
        org.joda.time.Period period31 = period29.minusSeconds((-1));
        java.lang.String str32 = period29.toString();
        org.joda.time.Period period33 = period29.toPeriod();
        org.joda.time.PeriodType periodType34 = period29.getPeriodType();
        org.joda.time.Period period35 = period25.normalizedStandard(periodType34);
        org.joda.time.Period period37 = period35.withSeconds(10);
        org.joda.time.DurationFieldType durationFieldType38 = org.joda.time.DurationFieldType.millis();
        boolean boolean39 = period35.isSupported(durationFieldType38);
        org.joda.time.Period period41 = period35.withWeeks((-3));
        org.joda.time.LocalDateTime localDateTime42 = localDateTime9.minus((org.joda.time.ReadablePeriod) period41);
        java.util.Date date43 = localDateTime9.toDate();
        boolean boolean44 = timeZone0.inDaylightTime(date43);
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+10:59");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT24H" + "'", str2, "PT24H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 39580809 + "'", int3 == 39580809);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 39580809 + "'", int4 == 39580809);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PT0.099S" + "'", str32, "PT0.099S");
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(date43);
// flaky:         org.junit.Assert.assertEquals(date43.toString(), "Mon Feb 21 10:03:32 GMT+10:59 2022");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test17064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17064");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        boolean boolean3 = dateTime1.isBefore((long) (short) 100);
        org.joda.time.Instant instant4 = new org.joda.time.Instant();
        org.joda.time.Instant instant6 = instant4.withMillis(0L);
        org.joda.time.Chronology chronology7 = instant6.getChronology();
        org.joda.time.DateTime dateTime8 = dateTime1.toDateTime(chronology7);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime1.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 100, 1L, periodType15);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 100, 1L, periodType19);
        org.joda.time.Period period21 = period16.plus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Instant instant22 = new org.joda.time.Instant();
        org.joda.time.Instant instant24 = instant22.withMillis(0L);
        org.joda.time.Duration duration25 = period20.toDurationTo((org.joda.time.ReadableInstant) instant24);
        mutableDateTime12.add((org.joda.time.ReadableDuration) duration25, 39);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime12.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime12.toMutableDateTime(dateTimeZone29);
        boolean boolean32 = mutableDateTime12.isBefore((long) 100);
        boolean boolean34 = mutableDateTime12.isAfter(893L);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime12.minuteOfHour();
        org.joda.time.Instant instant36 = mutableDateTime12.toInstant();
        mutableDateTime12.add(118140000L);
        int int39 = mutableDateTime9.compareTo((org.joda.time.ReadableInstant) mutableDateTime12);
        mutableDateTime9.setMillis((long) 258);
        java.lang.Object obj42 = mutableDateTime9.clone();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime9.setDayOfMonth(1435);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1435 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals(obj42.toString(), "1970-01-01T00:00:00.258Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "1970-01-01T00:00:00.258Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "1970-01-01T00:00:00.258Z");
    }

    @Test
    public void test17065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17065");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis((int) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 100, 1L, periodType10);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) 100, 1L, periodType14);
        org.joda.time.Period period16 = period11.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Instant instant17 = new org.joda.time.Instant();
        org.joda.time.Instant instant19 = instant17.withMillis(0L);
        org.joda.time.Duration duration20 = period15.toDurationTo((org.joda.time.ReadableInstant) instant19);
        mutableDateTime7.add((org.joda.time.ReadableDuration) duration20, 39);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime7.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime7.setZone(dateTimeZone24);
        int int26 = mutableDateTime7.getYearOfEra();
        int int27 = mutableDateTime7.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime7.year();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundHalfEven();
        org.joda.time.DateTime dateTime30 = localTime5.toDateTime((org.joda.time.ReadableInstant) mutableDateTime29);
        org.joda.time.Instant instant32 = new org.joda.time.Instant();
        org.joda.time.Instant instant34 = instant32.withMillis(0L);
        org.joda.time.Chronology chronology35 = instant34.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.eras();
        java.util.Locale locale37 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology35, locale37, (java.lang.Integer) 39221019);
        org.joda.time.Chronology chronology41 = null;
        java.util.Locale locale42 = java.util.Locale.GERMAN;
        java.util.Locale locale43 = java.util.Locale.CANADA;
        java.lang.String str44 = locale42.getDisplayVariant(locale43);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology41, locale43);
        org.joda.time.DateTimeZone dateTimeZone46 = dateTimeParserBucket45.getZone();
        org.joda.time.Chronology chronology47 = chronology35.withZone(dateTimeZone46);
        org.joda.time.DateTimeField dateTimeField48 = chronology47.hourOfDay();
        org.joda.time.DateTime dateTime49 = dateTime30.withChronology(chronology47);
        org.joda.time.DateTimeField dateTimeField50 = chronology47.millisOfDay();
        org.joda.time.DateTimeField dateTimeField51 = chronology47.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1969 + "'", int26 == 1969);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 59 + "'", int27 == 59);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "de");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
    }

    @Test
    public void test17066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17066");
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis(0L);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.eras();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (short) 10, (long) '#', chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.dayOfMonth();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) (byte) -1, chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withYear((int) (short) -1);
        int int15 = localDateTime12.getCenturyOfEra();
        int int16 = dateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withDayOfYear(5);
        org.joda.time.DateTimeField[] dateTimeFieldArray19 = localDateTime12.getFields();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime12.withFieldAdded(durationFieldType20, 51);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime12.plusSeconds(893);
        int int25 = localDateTime12.getMonthOfYear();
        int int26 = localDateTime12.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime28 = localDateTime12.withEra(202);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 202 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 31 + "'", int16 == 31);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldArray19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 12 + "'", int25 == 12);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 999 + "'", int26 == 999);
    }

    @Test
    public void test17067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17067");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.plusMonths(43);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.halfdays();
        boolean boolean4 = localDate2.isSupported(durationFieldType3);
        int int5 = localDate2.getWeekyear();
        org.joda.time.LocalDate localDate7 = localDate2.minusDays(0);
        int int8 = localDate7.getMonthOfYear();
        java.lang.String str9 = localDate7.toString();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2025 + "'", int5 == 2025);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2025-09-21" + "'", str9, "2025-09-21");
    }

    @Test
    public void test17068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17068");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str7 = dateTimeFieldType6.getName();
        int int8 = localDateTime0.indexOf(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime0.minusSeconds((int) '#');
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.hourOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str20 = dateTimeFieldType19.getName();
        int int21 = localDateTime13.indexOf(dateTimeFieldType19);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime13.minusSeconds(0);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (short) 1, chronology25);
        org.joda.time.Instant instant27 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableInstant) instant27, periodType28);
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDateTime0, (org.joda.time.ReadablePartial) localDateTime23, periodType28);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        long long34 = dateTimeZone31.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime36 = localDateTime0.toDateTime(dateTimeZone31);
        java.util.TimeZone timeZone37 = dateTimeZone31.toTimeZone();
        timeZone37.setRawOffset((int) (byte) 100);
        java.lang.String str40 = timeZone37.getID();
        org.joda.time.tz.NameProvider nameProvider43 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider43);
        java.util.Locale locale45 = null;
        java.lang.String str48 = nameProvider43.getName(locale45, "DateTimeField[year]", "minuteOfDay");
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((long) 100, 1L, periodType53);
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period((long) 100, 1L, periodType57);
        org.joda.time.Period period59 = period54.plus((org.joda.time.ReadablePeriod) period58);
        org.joda.time.Instant instant60 = new org.joda.time.Instant();
        org.joda.time.Instant instant62 = instant60.withMillis(0L);
        org.joda.time.Duration duration63 = period58.toDurationTo((org.joda.time.ReadableInstant) instant62);
        mutableDateTime50.add((org.joda.time.ReadableDuration) duration63, 39);
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime50.secondOfMinute();
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime50.minuteOfHour();
        java.lang.String str68 = property67.getAsShortText();
        java.util.Locale locale69 = java.util.Locale.GERMAN;
        java.util.Locale locale70 = locale69.stripExtensions();
        int int71 = property67.getMaximumTextLength(locale70);
        java.lang.String str74 = nameProvider43.getName(locale70, "f\351vrier", "2022-02-21T14:56:21.097Z");
        java.util.Locale.Category category75 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale76 = java.util.Locale.getDefault(category75);
        java.lang.String str79 = nameProvider43.getShortName(locale76, "2022-02-21T14:56:06.238Z", "11");
        java.lang.String str80 = locale76.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str81 = timeZone37.getDisplayName(false, 9722, locale76);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 9722");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "clockhourOfDay" + "'", str7, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "clockhourOfDay" + "'", str20, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 100L + "'", long34 == 100L);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "UTC" + "'", str40, "UTC");
        org.junit.Assert.assertNotNull(nameProvider43);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(instant62);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "59" + "'", str68, "59");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "de");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "de");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertTrue("'" + category75 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category75.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale76);
// flaky:         org.junit.Assert.assertEquals(locale76.toString(), "en_CA");
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "eng" + "'", str80, "eng");
    }

    @Test
    public void test17069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17069");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 21);
        org.joda.time.MutableDateTime mutableDateTime2 = dateTime1.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfEven();
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
    }

    @Test
    public void test17070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17070");
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.eras();
        java.util.Locale locale6 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology4, locale6, (java.lang.Integer) 39221019);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.util.Locale locale12 = java.util.Locale.CANADA;
        java.lang.String str13 = locale11.getDisplayVariant(locale12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology10, locale12);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeParserBucket14.getZone();
        org.joda.time.Chronology chronology16 = chronology4.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfDay();
        long long20 = dateTimeField17.getDifferenceAsLong((long) (byte) 1, 10L);
        long long23 = dateTimeField17.add(23879163571200000L, 53677371);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 24072402106800000L + "'", long23 == 24072402106800000L);
    }

    @Test
    public void test17071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17071");
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis(0L);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.eras();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (short) 10, (long) '#', chronology5);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.monthOfYear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (short) 1, chronology11);
        org.joda.time.Instant instant13 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) instant13, periodType14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int17 = instant13.get(dateTimeFieldType16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime8.withField(dateTimeFieldType16, 39);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusSeconds(52);
        int int22 = localDateTime21.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.plusWeeks(22);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableDuration25, readableInstant26);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) 100, 1L, periodType30);
        org.joda.time.Period period33 = period31.minusSeconds((-1));
        java.lang.String str34 = period31.toString();
        org.joda.time.Period period35 = period31.toPeriod();
        org.joda.time.PeriodType periodType36 = period31.getPeriodType();
        org.joda.time.Period period37 = period27.normalizedStandard(periodType36);
        org.joda.time.Period period39 = period37.withSeconds(10);
        int int40 = period37.size();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime21.plus((org.joda.time.ReadablePeriod) period37);
        org.joda.time.Period period43 = period37.plusHours(39250977);
        mutablePeriod7.mergePeriod((org.joda.time.ReadablePeriod) period37);
        org.joda.time.Period period46 = period37.plusMinutes((int) (byte) -1);
        org.joda.time.Minutes minutes47 = period46.toStandardMinutes();
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 903 + "'", int17 == 903);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 22 + "'", int22 == 22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PT0.099S" + "'", str34, "PT0.099S");
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 8 + "'", int40 == 8);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(minutes47);
    }

    @Test
    public void test17072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17072");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        java.util.Locale locale6 = dateTimeFormatter5.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter5.withDefaultYear(737);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.hourOfDay();
        int int14 = localDateTime10.getDayOfMonth();
        int int15 = localDateTime10.getMinuteOfHour();
        org.joda.time.Chronology chronology16 = localDateTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.secondOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter9.withChronology(chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter9.withPivotYear(1431020);
        java.io.Writer writer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(writer22, 35391411508L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 21 + "'", int14 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
    }

    @Test
    public void test17073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17073");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.setRegion("");
        java.util.Locale.Builder builder5 = builder3.setVariant("39272321");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setScript("2022-02-21T14:59:03.845Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 2022-02-21T14:59:03.845Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test17074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17074");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone dateTimeZone4 = provider0.getZone("10:53:59.508");
        java.util.Set<java.lang.String> strSet5 = provider0.getAvailableIDs();
        java.util.Set<java.lang.String> strSet6 = provider0.getAvailableIDs();
        java.util.Set<java.lang.String> strSet7 = provider0.getAvailableIDs();
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test17075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17075");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        mutableDateTime1.setWeekOfWeekyear(14);
        int int20 = mutableDateTime1.getRoundingMode();
        java.util.GregorianCalendar gregorianCalendar21 = mutableDateTime1.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime1.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableDuration23, readableInstant24);
        int int26 = period25.getDays();
        int int27 = period25.getWeeks();
        mutableDateTime22.add((org.joda.time.ReadablePeriod) period25, 42);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime22.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime31 = property30.roundCeiling();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime31.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((long) 100, 1L, periodType37);
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) 100, 1L, periodType41);
        org.joda.time.Period period43 = period38.plus((org.joda.time.ReadablePeriod) period42);
        org.joda.time.Instant instant44 = new org.joda.time.Instant();
        org.joda.time.Instant instant46 = instant44.withMillis(0L);
        org.joda.time.Duration duration47 = period42.toDurationTo((org.joda.time.ReadableInstant) instant46);
        mutableDateTime34.add((org.joda.time.ReadableDuration) duration47, 39);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime34.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime34.setZone(dateTimeZone51);
        int int53 = mutableDateTime34.getYearOfEra();
        mutableDateTime34.addMonths(41);
        org.joda.time.MutableDateTime mutableDateTime56 = mutableDateTime34.toMutableDateTimeISO();
        mutableDateTime56.addHours(21);
        mutableDateTime56.addSeconds(37);
        org.joda.time.Instant instant63 = new org.joda.time.Instant();
        org.joda.time.Instant instant65 = instant63.withMillis(0L);
        org.joda.time.Chronology chronology66 = instant65.getChronology();
        org.joda.time.DurationField durationField67 = chronology66.eras();
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((long) (short) 10, (long) '#', chronology66);
        org.joda.time.DateTimeField dateTimeField69 = chronology66.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = dateTimeField69.getType();
        int int71 = mutableDateTime56.get(dateTimeFieldType70);
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime31.property(dateTimeFieldType70);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(gregorianCalendar21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(instant46);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1969 + "'", int53 == 1969);
        org.junit.Assert.assertNotNull(mutableDateTime56);
        org.junit.Assert.assertNotNull(instant65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(durationField67);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(dateTimeFieldType70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 6 + "'", int71 == 6);
        org.junit.Assert.assertNotNull(property72);
    }

    @Test
    public void test17076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17076");
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period3 = duration2.toPeriod();
        org.joda.time.Duration duration6 = duration2.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) 100, 1L, periodType11);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 100, 1L, periodType15);
        org.joda.time.Period period17 = period12.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Instant instant18 = new org.joda.time.Instant();
        org.joda.time.Instant instant20 = instant18.withMillis(0L);
        org.joda.time.Duration duration21 = period16.toDurationTo((org.joda.time.ReadableInstant) instant20);
        mutableDateTime8.add((org.joda.time.ReadableDuration) duration21, 39);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime8.yearOfEra();
        mutableDateTime8.setDayOfYear((int) ' ');
        mutableDateTime8.addHours(11);
        java.lang.String str29 = mutableDateTime8.toString();
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Period period31 = duration2.toPeriodFrom((org.joda.time.ReadableInstant) mutableDateTime8, periodType30);
        org.joda.time.format.DateTimePrinter dateTimePrinter32 = null;
        org.joda.time.format.DateTimeParser dateTimeParser33 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter32, dateTimeParser33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter34.withPivotYear((java.lang.Integer) 18);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter36.withChronology(chronology37);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate43 = localDate41.minusMonths((int) ' ');
        org.joda.time.Chronology chronology44 = localDate41.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.millisOfDay();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) 27, (long) 'u', chronology44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter36.withChronology(chronology44);
        org.joda.time.Period period48 = new org.joda.time.Period((long) 925, periodType30, chronology44);
        org.joda.time.Period period50 = period48.plusSeconds(53871092);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1969-02-02T10:59:56.191Z" + "'", str29, "1969-02-02T10:59:56.191Z");
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeFormatter47);
        org.junit.Assert.assertNotNull(period50);
    }

    @Test
    public void test17077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17077");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField8 = localDateTime6.getField((int) (byte) 0);
        long long10 = dateTimeField8.roundHalfEven((long) 1);
        int int11 = dateTime1.get(dateTimeField8);
        int int13 = dateTimeField8.getLeapAmount((long) (byte) 10);
        java.lang.String str15 = dateTimeField8.getAsText((long) 1969);
        boolean boolean17 = dateTimeField8.isLeap((long) '4');
        org.joda.time.DurationField durationField18 = dateTimeField8.getLeapDurationField();
        int int21 = durationField18.getValue((long) 32, (long) 1969);
        int int24 = durationField18.getDifference((long) 39560427, (long) 39251693);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970" + "'", str15, "1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test17078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17078");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getYearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = dateTime1.toString(dateTimeFormatter3);
        org.joda.time.DateTime dateTime6 = dateTime1.plusMonths(86396191);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        int int11 = dateTime10.getSecondOfMinute();
        boolean boolean12 = dateTime10.isEqualNow();
        int int13 = dateTime10.getDayOfYear();
        org.joda.time.Chronology chronology14 = dateTime10.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology14);
        org.joda.time.DateTime dateTime16 = dateTime6.toDateTime(chronology14);
        org.joda.time.DurationField durationField17 = chronology14.halfdays();
        boolean boolean18 = durationField17.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = durationField17.add(1634209L, 725846400010L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 725846400010 * 43200000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-21T15:03:32.895Z" + "'", str4, "2022-02-21T15:03:32.895Z");
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test17079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17079");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime1.setZone(dateTimeZone18);
        int int20 = mutableDateTime1.getYearOfEra();
        mutableDateTime1.addMonths(41);
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime1.toMutableDateTimeISO();
        mutableDateTime23.addHours(21);
        mutableDateTime23.addSeconds(37);
        org.joda.time.Instant instant30 = new org.joda.time.Instant();
        org.joda.time.Instant instant32 = instant30.withMillis(0L);
        org.joda.time.Chronology chronology33 = instant32.getChronology();
        org.joda.time.DurationField durationField34 = chronology33.eras();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) (short) 10, (long) '#', chronology33);
        org.joda.time.DateTimeField dateTimeField36 = chronology33.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = dateTimeField36.getType();
        int int38 = mutableDateTime23.get(dateTimeFieldType37);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((long) 100, 1L, periodType43);
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((long) 100, 1L, periodType47);
        org.joda.time.Period period49 = period44.plus((org.joda.time.ReadablePeriod) period48);
        org.joda.time.Instant instant50 = new org.joda.time.Instant();
        org.joda.time.Instant instant52 = instant50.withMillis(0L);
        org.joda.time.Duration duration53 = period48.toDurationTo((org.joda.time.ReadableInstant) instant52);
        mutableDateTime40.add((org.joda.time.ReadableDuration) duration53, 39);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime40.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime40.setZone(dateTimeZone57);
        int int59 = mutableDateTime40.getYearOfEra();
        int int60 = mutableDateTime40.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime40.year();
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate64 = localDate62.minusMonths((int) ' ');
        org.joda.time.Chronology chronology65 = localDate62.getChronology();
        mutableDateTime40.setChronology(chronology65);
        org.joda.time.DateTimeField dateTimeField67 = chronology65.dayOfYear();
        boolean boolean68 = dateTimeFieldType37.isSupported(chronology65);
        org.joda.time.DateTimeField dateTimeField69 = chronology65.millisOfSecond();
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1969 + "'", int20 == 1969);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 6 + "'", int38 == 6);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(instant52);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1969 + "'", int59 == 1969);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 59 + "'", int60 == 59);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(localDate64);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(dateTimeField69);
    }

    @Test
    public void test17080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17080");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.plusMonths(43);
        org.joda.time.LocalDate.Property property3 = localDate0.dayOfMonth();
        org.joda.time.LocalDate localDate4 = property3.withMaximumValue();
        org.joda.time.LocalDate localDate5 = property3.roundFloorCopy();
        org.joda.time.LocalDate localDate6 = property3.getLocalDate();
        org.joda.time.LocalDate.Property property7 = localDate6.weekyear();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test17081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17081");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTime dateTime3 = dateTime2.toDateTime();
        int int4 = dateTime2.getYear();
        org.joda.time.DateTime.Property property5 = dateTime2.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property5.getFieldType();
        org.joda.time.DateTime dateTime8 = property5.addWrapFieldToCopy(9722);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes(40);
        org.joda.time.Period period12 = org.joda.time.Period.weeks(1970);
        int int13 = period12.getYears();
        int int14 = period12.size();
        org.joda.time.DateTime dateTime15 = dateTime10.plus((org.joda.time.ReadablePeriod) period12);
        java.lang.String str16 = period12.toString();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1970 + "'", int4 == 1970);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "P1970W" + "'", str16, "P1970W");
    }

    @Test
    public void test17082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17082");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.lang.String str2 = locale0.getDisplayVariant(locale1);
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap7);
        boolean boolean9 = strSet3.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8);
        org.joda.time.DurationField[] durationFieldArray10 = new org.joda.time.DurationField[] {};
        org.joda.time.DurationField[] durationFieldArray11 = strSet3.toArray(durationFieldArray10);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.hourOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.plusMillis((int) (byte) 0);
        int int23 = localDateTime16.compareTo((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime16.withMillisOfSecond(12);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusWeeks((int) '4');
        java.util.Date date28 = localDateTime25.toDate();
        boolean boolean29 = strSet3.equals((java.lang.Object) localDateTime25);
        int int30 = localDateTime25.getYear();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime25.plusMillis(2);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime25.plusDays((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime25.plusHours(54046842);
        int int37 = localDateTime25.getDayOfYear();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(durationFieldArray10);
        org.junit.Assert.assertNotNull(durationFieldArray11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Mon Feb 21 10:03:32 GMT+10:59 2022");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2022 + "'", int30 == 2022);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 52 + "'", int37 == 52);
    }

    @Test
    public void test17083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17083");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getSecondOfMinute();
        boolean boolean6 = dateTime4.isEqualNow();
        int int7 = dateTime4.getDayOfYear();
        org.joda.time.Chronology chronology8 = dateTime4.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology8.getZone();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(0L, chronology8);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfDay();
        org.joda.time.LocalDateTime localDateTime15 = property13.addToCopy(1645541953265L);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusMonths(86396816);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test17084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17084");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTime dateTime3 = dateTime2.toDateTime();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) 1, chronology5);
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTime();
        int int8 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardSeconds(10L);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableDuration) duration10);
        org.joda.time.DateMidnight dateMidnight12 = dateTime6.toDateMidnight();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate15 = localDate13.minusMonths((int) ' ');
        org.joda.time.Chronology chronology16 = localDate13.getChronology();
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate19 = localDate13.withFieldAdded(durationFieldType17, (int) (byte) 100);
        org.joda.time.LocalDate localDate21 = localDate19.minusMonths(55);
        boolean boolean22 = dateTime6.equals((java.lang.Object) localDate19);
        org.joda.time.DateTime dateTime23 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property24 = dateTime23.hourOfDay();
        org.joda.time.DateTime dateTime25 = property24.withMinimumValue();
        org.joda.time.DateTime dateTime26 = property24.roundCeilingCopy();
        int int27 = dateTime26.getWeekyear();
        org.joda.time.DateTime dateTime29 = dateTime26.minusWeeks(128);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime26.toMutableDateTimeISO();
        int int31 = mutableDateTime30.getCenturyOfEra();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1970 + "'", int27 == 1970);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 19 + "'", int31 == 19);
    }

    @Test
    public void test17085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17085");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getSecondOfMinute();
        int int3 = dateTime1.getYearOfEra();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) 10, 100, (int) 'a', 21);
        java.lang.String str9 = mutablePeriod8.toString();
        org.joda.time.DateTime dateTime10 = dateTime1.plus((org.joda.time.ReadablePeriod) mutablePeriod8);
        org.joda.time.DateTime.Property property11 = dateTime1.weekyear();
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime1.toMutableDateTimeISO();
        int int13 = dateTime1.getMinuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) 100, 1L, periodType18);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) 100, 1L, periodType22);
        org.joda.time.Period period24 = period19.plus((org.joda.time.ReadablePeriod) period23);
        org.joda.time.Instant instant25 = new org.joda.time.Instant();
        org.joda.time.Instant instant27 = instant25.withMillis(0L);
        org.joda.time.Duration duration28 = period23.toDurationTo((org.joda.time.ReadableInstant) instant27);
        mutableDateTime15.add((org.joda.time.ReadableDuration) duration28, 39);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime15.yearOfEra();
        mutableDateTime15.setDayOfYear((int) ' ');
        mutableDateTime15.add((long) 39221019);
        mutableDateTime15.setMinuteOfDay(21);
        org.joda.time.Duration duration38 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) mutableDateTime15);
        mutableDateTime15.addWeekyears((int) '#');
        org.joda.time.MutableDateTime mutableDateTime41 = mutableDateTime15.copy();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT10H100M97.021S" + "'", str9, "PT10H100M97.021S");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 903 + "'", int13 == 903);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(mutableDateTime41);
    }

    @Test
    public void test17086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17086");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        int int2 = mutableDateTime1.getMillisOfSecond();
        mutableDateTime1.setMillisOfSecond(44);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.minuteOfHour();
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = property5.getAsText(locale6);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        boolean boolean15 = property12.equals((java.lang.Object) '#');
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        int int18 = dateTime17.getSecondOfMinute();
        int int19 = dateTime17.getYearOfEra();
        int int20 = property12.getDifference((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        long long24 = dateTimeZone21.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) 100, 1L, periodType31);
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((long) 100, 1L, periodType35);
        org.joda.time.Period period37 = period32.plus((org.joda.time.ReadablePeriod) period36);
        org.joda.time.Instant instant38 = new org.joda.time.Instant();
        org.joda.time.Instant instant40 = instant38.withMillis(0L);
        org.joda.time.Duration duration41 = period36.toDurationTo((org.joda.time.ReadableInstant) instant40);
        mutableDateTime28.add((org.joda.time.ReadableDuration) duration41, 39);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime28.secondOfMinute();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime28.minuteOfHour();
        java.lang.String str46 = property45.getAsShortText();
        java.util.Locale locale47 = java.util.Locale.GERMAN;
        java.util.Locale locale48 = locale47.stripExtensions();
        int int49 = property45.getMaximumTextLength(locale48);
        java.lang.String str50 = dateTimeZone21.getShortName((long) (short) 1, locale48);
        int int51 = property12.getMaximumTextLength(locale48);
        boolean boolean52 = locale48.hasExtensions();
        java.lang.String str53 = locale48.getVariant();
        java.lang.String str54 = property5.getAsText(locale48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "German" + "'", str7, "German");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 33 + "'", int18 == 33);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2022 + "'", int19 == 2022);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(instant40);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "59" + "'", str46, "59");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "de");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "de");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:00" + "'", str50, "+00:00");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "0" + "'", str54, "0");
    }

    @Test
    public void test17087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17087");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        int int3 = localDate0.size();
        org.joda.time.LocalDate.Property property4 = localDate0.era();
        org.joda.time.LocalDate localDate5 = property4.roundCeilingCopy();
        org.joda.time.LocalDate.Property property6 = localDate5.weekyear();
        org.joda.time.LocalDate localDate7 = property6.roundHalfEvenCopy();
        boolean boolean8 = property6.isLeap();
        org.joda.time.LocalDate localDate9 = property6.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate10 = property6.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate12 = property6.setCopy(47);
        org.joda.time.LocalDate localDate13 = property6.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate15 = property6.addToCopy(56);
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimeParser dateTimeParser17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter18.withPivotYear((java.lang.Integer) 18);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter20.withChronology(chronology21);
        java.util.Locale locale23 = dateTimeFormatter20.getLocale();
        java.util.Locale locale24 = dateTimeFormatter20.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = localDate15.toString(dateTimeFormatter20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNull(locale23);
        org.junit.Assert.assertNull(locale24);
    }

    @Test
    public void test17088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17088");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test17089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17089");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) 39221019);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(0L, dateTimeZone3);
        mutableDateTime4.addMillis(50);
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) mutableDateTime4);
        mutableDateTime4.setYear(96);
        mutableDateTime4.addMonths(321);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
    }

    @Test
    public void test17090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17090");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 457070, (long) 909);
    }

    @Test
    public void test17091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17091");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean18 = mutableDateTime1.isSupported(dateTimeFieldType17);
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (short) 1, chronology22);
        org.joda.time.DateTime dateTime24 = dateTime23.toDateTime();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (short) 1, chronology26);
        org.joda.time.DateTime dateTime28 = dateTime27.toDateTime();
        int int29 = dateTime24.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Duration duration31 = org.joda.time.Duration.standardSeconds(10L);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableDuration) duration31);
        org.joda.time.Duration duration34 = duration20.withDurationAdded((org.joda.time.ReadableDuration) duration31, 10);
        org.joda.time.Duration duration35 = duration34.toDuration();
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration34);
        mutableDateTime1.addHours(27);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime1);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(duration35);
    }

    @Test
    public void test17092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17092");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTime dateTime3 = dateTime2.toDateTime();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) 1, chronology5);
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTime();
        int int8 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardSeconds(10L);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableDuration) duration10);
        org.joda.time.Duration duration12 = duration10.toDuration();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) 100, 1L, periodType17);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) 100, 1L, periodType21);
        org.joda.time.Period period23 = period18.plus((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Instant instant24 = new org.joda.time.Instant();
        org.joda.time.Instant instant26 = instant24.withMillis(0L);
        org.joda.time.Duration duration27 = period22.toDurationTo((org.joda.time.ReadableInstant) instant26);
        mutableDateTime14.add((org.joda.time.ReadableDuration) duration27, 39);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean31 = mutableDateTime14.isSupported(dateTimeFieldType30);
        int int32 = mutableDateTime14.getWeekOfWeekyear();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (short) 1, chronology35);
        org.joda.time.Instant instant37 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime36, (org.joda.time.ReadableInstant) instant37, periodType38);
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate42 = localDate40.minusMonths((int) ' ');
        org.joda.time.Chronology chronology43 = localDate40.getChronology();
        org.joda.time.Period period44 = new org.joda.time.Period((long) (byte) 1, periodType38, chronology43);
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate47 = localDate45.minusMonths((int) ' ');
        org.joda.time.Chronology chronology48 = localDate45.getChronology();
        org.joda.time.DurationFieldType durationFieldType49 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate51 = localDate45.withFieldAdded(durationFieldType49, (int) (byte) 100);
        boolean boolean52 = periodType38.isSupported(durationFieldType49);
        org.joda.time.PeriodType periodType53 = periodType38.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration10, (org.joda.time.ReadableInstant) mutableDateTime14, periodType53);
        mutableDateTime14.addWeeks(51);
        java.lang.String str57 = mutableDateTime14.toString();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime14.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime14.setWeekOfWeekyear(110);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 110 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(durationFieldType49);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "1970-12-23T23:59:56.191Z" + "'", str57, "1970-12-23T23:59:56.191Z");
        org.junit.Assert.assertNotNull(property58);
    }

    @Test
    public void test17093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17093");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(39378957, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39378957 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17094");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.lang.Integer int4 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        boolean boolean6 = dateTimeFormatter2.isParser();
        boolean boolean7 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter2.getPrinter();
        boolean boolean9 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeFormatter10.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter13.withZoneUTC();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 100, 1L, periodType19);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) 100, 1L, periodType23);
        org.joda.time.Period period25 = period20.plus((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Instant instant26 = new org.joda.time.Instant();
        org.joda.time.Instant instant28 = instant26.withMillis(0L);
        org.joda.time.Duration duration29 = period24.toDurationTo((org.joda.time.ReadableInstant) instant28);
        mutableDateTime16.add((org.joda.time.ReadableDuration) duration29, 39);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime16.secondOfMinute();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (short) 1, chronology36);
        org.joda.time.Instant instant38 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadableInstant) instant38, periodType39);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate43 = localDate41.minusMonths((int) ' ');
        org.joda.time.Chronology chronology44 = localDate41.getChronology();
        org.joda.time.Period period45 = new org.joda.time.Period((long) (byte) 1, periodType39, chronology44);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate48 = localDate46.minusMonths((int) ' ');
        org.joda.time.Chronology chronology49 = localDate46.getChronology();
        org.joda.time.DurationFieldType durationFieldType50 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate52 = localDate46.withFieldAdded(durationFieldType50, (int) (byte) 100);
        boolean boolean53 = periodType39.isSupported(durationFieldType50);
        org.joda.time.PeriodType periodType54 = periodType39.withDaysRemoved();
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property56 = localDate55.dayOfMonth();
        org.joda.time.Chronology chronology57 = localDate55.getChronology();
        org.joda.time.Period period58 = new org.joda.time.Period((long) 43, periodType39, chronology57);
        mutableDateTime16.setChronology(chronology57);
        mutableDateTime16.add((long) 165);
        // The following exception was thrown during execution in test generation
        try {
            int int64 = dateTimeFormatter13.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime16, "2022-02-21T15:00:20.530Z", 39807835);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dateTimePrinter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(durationFieldType50);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(chronology57);
    }

    @Test
    public void test17095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17095");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getSecondOfMinute();
        boolean boolean3 = dateTime1.isEqualNow();
        int int4 = dateTime1.getDayOfYear();
        org.joda.time.Chronology chronology5 = dateTime1.getChronology();
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardSeconds(10L);
        org.joda.time.DateTime dateTime8 = dateTime1.plus((org.joda.time.ReadableDuration) duration7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        int int11 = dateTime10.getYearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = dateTime10.toString(dateTimeFormatter12);
        org.joda.time.DateTime dateTime15 = dateTime10.plusMonths(86396191);
        org.joda.time.DateTime dateTime18 = dateTime15.withDurationAdded((long) 23, 21);
        org.joda.time.DateTime dateTime20 = dateTime18.minusMillis(44);
        org.joda.time.Interval interval21 = duration7.toIntervalFrom((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(chronology22);
        int int24 = dateTime23.getSecondOfMinute();
        int int25 = dateTime23.getYearOfEra();
        org.joda.time.LocalTime localTime26 = dateTime23.toLocalTime();
        org.joda.time.DateTimeZone dateTimeZone27 = dateTime23.getZone();
        org.joda.time.DateTime dateTime28 = dateTime18.toDateTime(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.plus((long) 166);
        org.joda.time.DateTime.Property property31 = dateTime28.weekyear();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 22 + "'", int11 == 22);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022-02-21T15:03:33.225Z" + "'", str13, "2022-02-21T15:03:33.225Z");
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(interval21);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 33 + "'", int24 == 33);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2022 + "'", int25 == 2022);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
    }

    @Test
    public void test17096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17096");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableDuration2, readableInstant3);
        org.joda.time.Period period6 = period4.withDays((int) (byte) 1);
        org.joda.time.Period period8 = period6.minusWeeks(100);
        org.joda.time.Period period10 = period8.withDays(1);
        org.joda.time.LocalDate localDate12 = localDate0.withPeriodAdded((org.joda.time.ReadablePeriod) period8, 642);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) (short) 10, 100, (int) 'a', 21);
        mutablePeriod17.addYears(59);
        org.joda.time.Instant instant22 = new org.joda.time.Instant();
        org.joda.time.Instant instant24 = instant22.withMillis(0L);
        org.joda.time.Chronology chronology25 = instant24.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.eras();
        java.util.Locale locale27 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology25, locale27, (java.lang.Integer) 39221019);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 53, chronology25);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableDuration31, readableInstant32);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) 100, 1L, periodType36);
        org.joda.time.Period period39 = period37.minusSeconds((-1));
        java.lang.String str40 = period37.toString();
        org.joda.time.Period period41 = period37.toPeriod();
        org.joda.time.PeriodType periodType42 = period37.getPeriodType();
        org.joda.time.Period period43 = period33.normalizedStandard(periodType42);
        boolean boolean44 = localDate30.equals((java.lang.Object) period33);
        org.joda.time.Interval interval45 = localDate30.toInterval();
        mutablePeriod17.add((org.joda.time.ReadableInterval) interval45);
        org.joda.time.LocalDate localDate47 = localDate0.plus((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.LocalDate localDate49 = localDate47.withYearOfEra(893);
        org.joda.time.DateTime dateTime50 = localDate49.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property51 = localDate49.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField52 = property51.getField();
        org.joda.time.DateTimeField dateTimeField53 = property51.getField();
        org.joda.time.DateTimeField dateTimeField54 = property51.getField();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_GB");
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PT0.099S" + "'", str40, "PT0.099S");
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
    }

    @Test
    public void test17097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17097");
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate4 = localDate2.plusMonths(43);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfYear(12);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate9 = localDate7.minusMonths((int) ' ');
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableDuration10, readableInstant11);
        org.joda.time.Period period14 = period12.withDays((int) (byte) 1);
        org.joda.time.LocalDate localDate15 = localDate9.plus((org.joda.time.ReadablePeriod) period14);
        org.joda.time.LocalDate localDate17 = localDate15.minusMonths((-292275054));
        org.joda.time.LocalDate localDate19 = localDate15.minusYears(21);
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.PeriodType periodType21 = periodType20.withMonthsRemoved();
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate6, (org.joda.time.ReadablePartial) localDate19, periodType20);
        org.joda.time.PeriodType periodType23 = period22.getPeriodType();
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        java.util.Locale locale27 = java.util.Locale.CANADA;
        java.lang.String str28 = locale26.getDisplayVariant(locale27);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology25, locale27);
        org.joda.time.Chronology chronology30 = dateTimeParserBucket29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(315532800097L, (long) 39243612, periodType23, chronology30);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) 1, chronology37);
        org.joda.time.Instant instant39 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType40 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime38, (org.joda.time.ReadableInstant) instant39, periodType40);
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate44 = localDate42.minusMonths((int) ' ');
        org.joda.time.Chronology chronology45 = localDate42.getChronology();
        org.joda.time.Period period46 = new org.joda.time.Period((long) (byte) 1, periodType40, chronology45);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate49 = localDate47.minusMonths((int) ' ');
        org.joda.time.Chronology chronology50 = localDate47.getChronology();
        org.joda.time.DurationFieldType durationFieldType51 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate53 = localDate47.withFieldAdded(durationFieldType51, (int) (byte) 100);
        boolean boolean54 = periodType40.isSupported(durationFieldType51);
        org.joda.time.PeriodType periodType55 = periodType40.withDaysRemoved();
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property57 = localDate56.dayOfMonth();
        org.joda.time.Chronology chronology58 = localDate56.getChronology();
        org.joda.time.Period period59 = new org.joda.time.Period((long) 43, periodType40, chronology58);
        org.joda.time.Duration duration61 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period62 = duration61.toPeriod();
        org.joda.time.Duration duration65 = duration61.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.PeriodType periodType66 = null;
        org.joda.time.Instant instant69 = new org.joda.time.Instant();
        org.joda.time.Instant instant71 = instant69.withMillis(0L);
        org.joda.time.Chronology chronology72 = instant71.getChronology();
        org.joda.time.DurationField durationField73 = chronology72.eras();
        java.util.Locale locale74 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket76 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology72, locale74, (java.lang.Integer) 39221019);
        org.joda.time.LocalDate localDate77 = new org.joda.time.LocalDate((long) 53, chronology72);
        org.joda.time.DateTimeField dateTimeField78 = chronology72.dayOfYear();
        org.joda.time.DateTimeField dateTimeField79 = chronology72.monthOfYear();
        org.joda.time.Period period80 = duration61.toPeriod(periodType66, chronology72);
        org.joda.time.Period period81 = new org.joda.time.Period((long) '#', periodType40, chronology72);
        org.joda.time.LocalDate localDate82 = new org.joda.time.LocalDate(chronology72);
        mutablePeriod31.setPeriod((long) '#', chronology72);
        org.joda.time.DateTimeField dateTimeField84 = chronology72.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long90 = chronology72.getDateTimeMillis((long) 917, 292278993, 72099576, 54123140, 39514988);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(instant71);
        org.junit.Assert.assertNotNull(chronology72);
        org.junit.Assert.assertNotNull(durationField73);
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeField78);
        org.junit.Assert.assertNotNull(dateTimeField79);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(dateTimeField84);
    }

    @Test
    public void test17098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17098");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime1.minuteOfHour();
        java.lang.String str19 = property18.getAsShortText();
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = locale20.stripExtensions();
        int int22 = property18.getMaximumTextLength(locale21);
        org.joda.time.MutableDateTime mutableDateTime23 = property18.roundHalfEven();
        mutableDateTime23.addYears(466);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) 100, 1L, periodType28);
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) 100, 1L, periodType32);
        org.joda.time.Period period34 = period29.plus((org.joda.time.ReadablePeriod) period33);
        org.joda.time.Instant instant35 = new org.joda.time.Instant();
        org.joda.time.Instant instant37 = instant35.withMillis(0L);
        org.joda.time.Duration duration38 = period33.toDurationTo((org.joda.time.ReadableInstant) instant37);
        org.joda.time.Instant instant40 = instant37.plus((long) (byte) -1);
        org.joda.time.DateTime dateTime41 = instant37.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType43 = dateTimeFieldType42.getRangeDurationType();
        org.joda.time.DateTime.Property property44 = dateTime41.property(dateTimeFieldType42);
        boolean boolean46 = dateTime41.isEqual((long) 53);
        org.joda.time.Duration duration48 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period49 = duration48.toPeriod();
        org.joda.time.DateTime dateTime51 = dateTime41.withDurationAdded((org.joda.time.ReadableDuration) duration48, (-292275054));
        org.joda.time.Seconds seconds52 = duration48.toStandardSeconds();
        org.joda.time.Duration duration54 = duration48.plus((long) 409);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime23, (org.joda.time.ReadableDuration) duration54);
        org.joda.time.Duration duration56 = duration54.toDuration();
        java.lang.Object obj57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime(obj57);
        org.joda.time.DateTime.Property property59 = dateTime58.millisOfDay();
        org.joda.time.DateTimeField dateTimeField60 = property59.getField();
        org.joda.time.DateTime dateTime61 = property59.withMinimumValue();
        java.util.Locale locale62 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str63 = property59.getAsShortText(locale62);
        org.joda.time.DateTimeField dateTimeField64 = property59.getField();
        org.joda.time.DateTime dateTime65 = property59.roundHalfEvenCopy();
        boolean boolean66 = duration56.equals((java.lang.Object) dateTime65);
        org.joda.time.Duration duration68 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((long) (short) 1, chronology70);
        org.joda.time.DateTime dateTime72 = dateTime71.toDateTime();
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime((long) (short) 1, chronology74);
        org.joda.time.DateTime dateTime76 = dateTime75.toDateTime();
        int int77 = dateTime72.compareTo((org.joda.time.ReadableInstant) dateTime75);
        org.joda.time.Duration duration79 = org.joda.time.Duration.standardSeconds(10L);
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime75, (org.joda.time.ReadableDuration) duration79);
        org.joda.time.Duration duration82 = duration68.withDurationAdded((org.joda.time.ReadableDuration) duration79, 10);
        java.lang.String str83 = duration68.toString();
        org.joda.time.Period period84 = duration68.toPeriod();
        org.joda.time.Chronology chronology85 = null;
        org.joda.time.DateTime dateTime86 = new org.joda.time.DateTime(chronology85);
        int int87 = dateTime86.getYearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter88 = null;
        java.lang.String str89 = dateTime86.toString(dateTimeFormatter88);
        org.joda.time.PeriodType periodType90 = null;
        org.joda.time.Period period91 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration68, (org.joda.time.ReadableInstant) dateTime86, periodType90);
        boolean boolean92 = duration56.isShorterThan((org.joda.time.ReadableDuration) duration68);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "59" + "'", str19, "59");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(instant40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(seconds52);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "54213308" + "'", str63, "54213308");
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(duration79);
        org.junit.Assert.assertNotNull(duration82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "PT86400S" + "'", str83, "PT86400S");
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 22 + "'", int87 == 22);
// flaky:         org.junit.Assert.assertEquals("'" + str89 + "' != '" + "2022-02-21T15:03:33.308Z" + "'", str89, "2022-02-21T15:03:33.308Z");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test17099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17099");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap6);
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Locale locale11 = java.util.Locale.CANADA;
        java.lang.String str12 = locale10.getDisplayVariant(locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology9, locale11);
        java.util.Locale locale14 = java.util.Locale.GERMAN;
        java.util.Locale locale15 = java.util.Locale.CANADA;
        java.lang.String str16 = locale14.getDisplayVariant(locale15);
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.util.Locale locale18 = java.util.Locale.CANADA;
        java.lang.String str19 = locale17.getDisplayVariant(locale18);
        java.lang.String str20 = locale17.getISO3Language();
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.util.Locale locale22 = java.util.Locale.CANADA;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        java.util.Locale locale24 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale25 = java.util.Locale.GERMAN;
        java.lang.String str26 = locale25.getDisplayName();
        java.util.Locale locale27 = java.util.Locale.CANADA;
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = java.util.Locale.GERMAN;
        java.util.Locale locale31 = java.util.Locale.CANADA;
        java.lang.String str32 = locale30.getDisplayVariant(locale31);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology29, locale31, (java.lang.Integer) 10);
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.lang.String str36 = locale35.getDisplayName();
        java.util.Locale locale37 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale38 = java.util.Locale.UK;
        java.util.Locale[] localeArray39 = new java.util.Locale[] { locale11, locale15, locale17, locale21, locale24, locale25, locale27, locale31, locale35, locale37, locale38 };
        java.util.ArrayList<java.util.Locale> localeList40 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList40, localeArray39);
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.util.Locale> localeList43 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList40, filteringMode42);
        java.util.List<java.util.Locale> localeList44 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList43);
        org.joda.time.Chronology chronology46 = null;
        java.util.Locale locale47 = java.util.Locale.GERMAN;
        java.util.Locale locale48 = java.util.Locale.CANADA;
        java.lang.String str49 = locale47.getDisplayVariant(locale48);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology46, locale48, (java.lang.Integer) 10);
        java.util.Set<java.lang.String> strSet52 = locale48.getUnicodeLocaleAttributes();
        boolean boolean54 = strSet52.remove((java.lang.Object) 100L);
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet52);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap56 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList57 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap56);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream58 = languageRangeList57.stream();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "deu" + "'", str20, "deu");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "German" + "'", str26, "German");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "de");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "de");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "German" + "'", str36, "German");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode42.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(localeList43);
        org.junit.Assert.assertNotNull(localeList44);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "de");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(languageRangeList57);
        org.junit.Assert.assertNotNull(languageRangeStream58);
    }

    @Test
    public void test17100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17100");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean18 = mutableDateTime1.isSupported(dateTimeFieldType17);
        int int19 = mutableDateTime1.getWeekOfWeekyear();
        org.joda.time.Instant instant21 = new org.joda.time.Instant();
        org.joda.time.Instant instant23 = instant21.withMillis(0L);
        org.joda.time.Chronology chronology24 = instant23.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.eras();
        java.util.Locale locale26 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology24, locale26, (java.lang.Integer) 39221019);
        mutableDateTime1.setChronology(chronology24);
        mutableDateTime1.setMillis(259200003L);
        int int32 = mutableDateTime1.getDayOfYear();
        mutableDateTime1.setMillisOfDay(0);
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime1.toMutableDateTime();
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertNotNull(mutableDateTime35);
    }

    @Test
    public void test17101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17101");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.plusMonths(43);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.halfdays();
        boolean boolean4 = localDate2.isSupported(durationFieldType3);
        org.joda.time.LocalDate localDate6 = localDate2.plusMonths(52);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate10 = localDate8.minusMonths((int) ' ');
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.seconds();
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate6, (org.joda.time.ReadablePartial) localDate8, periodType11);
        org.joda.time.LocalDate.Property property13 = localDate6.dayOfMonth();
        org.joda.time.LocalDate.Property property14 = localDate6.centuryOfEra();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test17102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17102");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(6, 0);
        org.joda.time.LocalTime localTime4 = localTime2.plusMinutes(3);
        org.joda.time.LocalTime localTime6 = localTime4.minusSeconds(86396);
        org.joda.time.LocalTime.Property property7 = localTime6.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime localTime11 = localTime9.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime13 = localTime11.plusSeconds((int) (byte) 10);
        org.joda.time.LocalTime localTime15 = localTime13.withHourOfDay(16);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = localTime15.getFieldTypes();
        int int18 = localTime15.getValue(0);
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.util.Locale locale22 = java.util.Locale.CANADA;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology20, locale22);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeParserBucket24.getZone();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) 100, 1L, periodType30);
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) 100, 1L, periodType34);
        org.joda.time.Period period36 = period31.plus((org.joda.time.ReadablePeriod) period35);
        org.joda.time.Instant instant37 = new org.joda.time.Instant();
        org.joda.time.Instant instant39 = instant37.withMillis(0L);
        org.joda.time.Duration duration40 = period35.toDurationTo((org.joda.time.ReadableInstant) instant39);
        mutableDateTime27.add((org.joda.time.ReadableDuration) duration40, 39);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean44 = mutableDateTime27.isSupported(dateTimeFieldType43);
        org.joda.time.DurationFieldType durationFieldType45 = dateTimeFieldType43.getDurationType();
        java.util.Locale locale47 = java.util.Locale.CANADA;
        dateTimeParserBucket24.saveField(dateTimeFieldType43, "2022", locale47);
        org.joda.time.LocalTime.Property property49 = localTime15.property(dateTimeFieldType43);
        org.joda.time.LocalTime.Property property50 = localTime6.property(dateTimeFieldType43);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_CA");
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(property50);
    }

    @Test
    public void test17103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17103");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.centuryOfEra();
        org.joda.time.DateTime dateTime2 = mutableDateTime0.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.minusMonths(39409698);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test17104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17104");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTime dateTime3 = dateTime2.toDateTime();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) 1, chronology5);
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTime();
        int int8 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime.Property property9 = dateTime3.hourOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.centuryOfEra();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        int int15 = dateTime14.getSecondOfMinute();
        boolean boolean16 = dateTime14.isEqualNow();
        int int17 = dateTime14.getDayOfYear();
        org.joda.time.Chronology chronology18 = dateTime14.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology18);
        int int20 = mutablePeriod19.getDays();
        org.joda.time.DateTime dateTime21 = dateTime3.minus((org.joda.time.ReadablePeriod) mutablePeriod19);
        org.joda.time.DateTime.Property property22 = dateTime21.weekyear();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate25 = localDate23.minusMonths((int) ' ');
        org.joda.time.Chronology chronology26 = localDate23.getChronology();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 1, chronology31);
        org.joda.time.Instant instant33 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) instant33, periodType34);
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate38 = localDate36.minusMonths((int) ' ');
        org.joda.time.Chronology chronology39 = localDate36.getChronology();
        org.joda.time.Period period40 = new org.joda.time.Period((long) (byte) 1, periodType34, chronology39);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate43 = localDate41.minusMonths((int) ' ');
        org.joda.time.Chronology chronology44 = localDate41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 39251167, (long) 21, periodType34, chronology44);
        int[] intArray47 = chronology26.get((org.joda.time.ReadablePeriod) mutablePeriod45, (long) 1973);
        org.joda.time.DateTime dateTime48 = dateTime21.withChronology(chronology26);
        org.joda.time.DateTime.Property property49 = dateTime48.weekOfWeekyear();
        org.joda.time.DateTime dateTime51 = property49.addWrapFieldToCopy(1971);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[0]");
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(dateTime51);
    }

    @Test
    public void test17105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17105");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((-14), 763, 1447200000, 14400000);
    }

    @Test
    public void test17106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17106");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getCountry();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17107");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        int int3 = localDate0.size();
        org.joda.time.LocalDate.Property property4 = localDate0.era();
        org.joda.time.LocalDate localDate5 = property4.roundCeilingCopy();
        org.joda.time.LocalDate.Property property6 = localDate5.weekyear();
        org.joda.time.LocalDate localDate7 = property6.roundHalfEvenCopy();
        boolean boolean8 = property6.isLeap();
        org.joda.time.LocalDate localDate9 = property6.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate10 = property6.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate11 = property6.withMinimumValue();
        org.joda.time.LocalDate localDate13 = property6.setCopy(12022);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test17108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17108");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 28);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 100, 1L, periodType5);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) 100, 1L, periodType9);
        org.joda.time.Period period11 = period6.plus((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.Instant instant14 = instant12.withMillis(0L);
        org.joda.time.Duration duration15 = period10.toDurationTo((org.joda.time.ReadableInstant) instant14);
        org.joda.time.Instant instant17 = instant14.plus((long) (byte) -1);
        org.joda.time.Instant instant20 = instant17.withDurationAdded(1L, (int) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime22.add((org.joda.time.ReadableDuration) duration24, (int) (short) 100);
        mutableDateTime22.setYear(10);
        mutableDateTime22.addSeconds((int) (short) 0);
        boolean boolean31 = instant17.isEqual((org.joda.time.ReadableInstant) mutableDateTime22);
        org.joda.time.Instant instant32 = instant17.toInstant();
        org.joda.time.MutableDateTime mutableDateTime33 = instant17.toMutableDateTimeISO();
        boolean boolean34 = dateTime1.isEqual((org.joda.time.ReadableInstant) mutableDateTime33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(chronology35);
        int int37 = dateTime36.getSecondOfMinute();
        boolean boolean38 = dateTime36.isEqualNow();
        int int39 = dateTime36.getDayOfYear();
        org.joda.time.Chronology chronology40 = dateTime36.getChronology();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now(chronology40);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(chronology44);
        int int46 = dateTime45.getSecondOfMinute();
        boolean boolean47 = dateTime45.isEqualNow();
        int int48 = dateTime45.getDayOfYear();
        org.joda.time.Chronology chronology49 = dateTime45.getChronology();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology49);
        int int51 = mutablePeriod50.getDays();
        org.joda.time.DateTime dateTime53 = dateTime41.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod50, (int) (byte) 0);
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate58 = localDate56.minusMonths((int) ' ');
        org.joda.time.Chronology chronology59 = localDate56.getChronology();
        org.joda.time.DateTimeField dateTimeField60 = chronology59.minuteOfDay();
        org.joda.time.DurationField durationField61 = chronology59.days();
        org.joda.time.DateTimeField dateTimeField62 = chronology59.hourOfDay();
        mutablePeriod50.setPeriod((-1900799884L), (long) 50, chronology59);
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate(chronology59);
        org.joda.time.MutableDateTime mutableDateTime65 = dateTime1.toMutableDateTime(chronology59);
        org.joda.time.DateTime.Property property66 = dateTime1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField67 = property66.getField();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 33 + "'", int37 == 33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTime41);
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 33 + "'", int46 == 33);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 52 + "'", int48 == 52);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(durationField61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(mutableDateTime65);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(dateTimeField67);
    }

    @Test
    public void test17109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17109");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str7 = dateTimeFieldType6.getName();
        int int8 = localDateTime0.indexOf(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime0.minusSeconds((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str14 = dateTimeFieldType13.getName();
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.property(dateTimeFieldType13);
        int int16 = localDateTime12.getMinuteOfHour();
        org.joda.time.DateTime dateTime17 = localDateTime12.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) 100, 1L, periodType22);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) 100, 1L, periodType26);
        org.joda.time.Period period28 = period23.plus((org.joda.time.ReadablePeriod) period27);
        org.joda.time.Instant instant29 = new org.joda.time.Instant();
        org.joda.time.Instant instant31 = instant29.withMillis(0L);
        org.joda.time.Duration duration32 = period27.toDurationTo((org.joda.time.ReadableInstant) instant31);
        mutableDateTime19.add((org.joda.time.ReadableDuration) duration32, 39);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean36 = mutableDateTime19.isSupported(dateTimeFieldType35);
        org.joda.time.Duration duration38 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (short) 1, chronology40);
        org.joda.time.DateTime dateTime42 = dateTime41.toDateTime();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) (short) 1, chronology44);
        org.joda.time.DateTime dateTime46 = dateTime45.toDateTime();
        int int47 = dateTime42.compareTo((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.Duration duration49 = org.joda.time.Duration.standardSeconds(10L);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime45, (org.joda.time.ReadableDuration) duration49);
        org.joda.time.Duration duration52 = duration38.withDurationAdded((org.joda.time.ReadableDuration) duration49, 10);
        org.joda.time.Duration duration53 = duration52.toDuration();
        mutableDateTime19.add((org.joda.time.ReadableDuration) duration52);
        org.joda.time.DateTime dateTime55 = dateTime17.plus((org.joda.time.ReadableDuration) duration52);
        org.joda.time.Duration duration57 = org.joda.time.Duration.standardMinutes((long) 53838181);
        boolean boolean58 = duration52.isEqual((org.joda.time.ReadableDuration) duration57);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "clockhourOfDay" + "'", str7, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "dayOfMonth" + "'", str14, "dayOfMonth");
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test17110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17110");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = java.util.Locale.GERMAN;
        java.util.Locale locale10 = locale9.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology8, locale9, (java.lang.Integer) 45, (int) '4');
        java.lang.String str14 = dateTimeZone1.getName(31536000000L, locale9);
        java.lang.String str15 = locale9.getDisplayLanguage();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "German" + "'", str15, "German");
    }

    @Test
    public void test17111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17111");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale4);
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeParserBucket6.getZone();
        java.lang.String str8 = dateTimeZone7.toString();
        java.util.TimeZone timeZone9 = dateTimeZone7.toTimeZone();
        int int11 = dateTimeZone7.getStandardOffset((long) 42996291);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 39359862, dateTimeZone7);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate15 = localDate13.minusMonths((int) ' ');
        int int16 = localDate13.size();
        org.joda.time.LocalDate.Property property17 = localDate13.era();
        org.joda.time.LocalDate localDate18 = property17.roundCeilingCopy();
        org.joda.time.LocalDate.Property property19 = localDate18.weekyear();
        org.joda.time.LocalDate localDate21 = localDate18.plusMonths(44);
        org.joda.time.LocalDate.Property property22 = localDate21.dayOfWeek();
        org.joda.time.LocalDate.Property property23 = localDate21.dayOfWeek();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property25 = localDate24.dayOfMonth();
        org.joda.time.Chronology chronology26 = localDate24.getChronology();
        org.joda.time.LocalDate.Property property27 = localDate24.dayOfWeek();
        org.joda.time.LocalDate localDate29 = localDate24.plusWeeks(56);
        org.joda.time.LocalDate localDate31 = localDate24.plusMonths(41);
        org.joda.time.LocalDate localDate33 = localDate31.minusMonths(16);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((long) 100, 1L, periodType38);
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) 100, 1L, periodType42);
        org.joda.time.Period period44 = period39.plus((org.joda.time.ReadablePeriod) period43);
        org.joda.time.Instant instant45 = new org.joda.time.Instant();
        org.joda.time.Instant instant47 = instant45.withMillis(0L);
        org.joda.time.Duration duration48 = period43.toDurationTo((org.joda.time.ReadableInstant) instant47);
        mutableDateTime35.add((org.joda.time.ReadableDuration) duration48, 39);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime35.secondOfMinute();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime35.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime54 = property52.addWrapField(6);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str57 = dateTimeZone55.getNameKey((long) (byte) 0);
        mutableDateTime54.setZoneRetainFields(dateTimeZone55);
        java.lang.String str60 = dateTimeZone55.getNameKey((long) 3);
        org.joda.time.DateTime dateTime61 = localDate31.toDateTimeAtStartOfDay(dateTimeZone55);
        org.joda.time.Chronology chronology63 = null;
        java.util.Locale locale64 = java.util.Locale.GERMAN;
        java.util.Locale locale65 = java.util.Locale.CANADA;
        java.lang.String str66 = locale64.getDisplayVariant(locale65);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket67 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology63, locale65);
        org.joda.time.DateTimeZone dateTimeZone68 = dateTimeParserBucket67.getZone();
        long long70 = dateTimeZone55.getMillisKeepLocal(dateTimeZone68, (long) (short) 0);
        org.joda.time.DateMidnight dateMidnight71 = localDate21.toDateMidnight(dateTimeZone55);
        org.joda.time.DateTime dateTime72 = localDate12.toDateTimeAtMidnight(dateTimeZone55);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(dateTimeZone7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(instant47);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(mutableDateTime54);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "UTC" + "'", str57, "UTC");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "UTC" + "'", str60, "UTC");
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "de");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(dateTimeZone68);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertNotNull(dateMidnight71);
        org.junit.Assert.assertNotNull(dateTime72);
    }

    @Test
    public void test17112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17112");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        int int3 = timeZone0.getOffset((long) (byte) -1);
        int int4 = timeZone0.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+10:59");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 39580809 + "'", int3 == 39580809);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test17113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17113");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = locale2.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 45, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeParserBucket6.getZone();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        int int9 = localTime8.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType11 = localTime8.getFieldType(14396);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 14396");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(dateTimeZone7);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test17114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17114");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis((int) (byte) 100);
        org.joda.time.LocalTime localTime7 = localTime3.plusSeconds(40);
        int int8 = localTime3.getMillisOfSecond();
        org.joda.time.LocalTime localTime10 = localTime3.minusSeconds(86396191);
        boolean boolean12 = localTime10.equals((java.lang.Object) "minutes");
        org.joda.time.LocalTime.Property property13 = localTime10.hourOfDay();
        org.joda.time.LocalTime localTime15 = property13.addWrapFieldToCopy(896);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate19 = localDate17.minusMonths((int) ' ');
        org.joda.time.Chronology chronology20 = localDate17.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.minuteOfHour();
        org.joda.time.DurationField durationField23 = chronology20.weekyears();
        org.joda.time.DateTimeField dateTimeField24 = chronology20.minuteOfDay();
        java.lang.String str25 = chronology20.toString();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 549, chronology20);
        org.joda.time.LocalDate.Property property27 = localDate26.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = localTime15.isAfter((org.joda.time.ReadablePartial) localDate26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 825 + "'", int8 == 825);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ISOChronology[UTC]" + "'", str25, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(property27);
    }

    @Test
    public void test17115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17115");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate3 = localDate1.minusMonths((int) ' ');
        int int4 = localDate1.size();
        org.joda.time.LocalDate.Property property5 = localDate1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(0L, dateTimeZone7);
        long long11 = dateTimeZone7.convertLocalToUTC((long) 3, true);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime13 = localDate1.toDateTimeAtStartOfDay(dateTimeZone7);
        java.lang.String str15 = dateTimeZone7.getShortName((long) 50);
        long long17 = dateTimeZone7.convertUTCToLocal((long) 39251167);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(3600L, dateTimeZone7);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.secondOfDay();
        java.lang.String str24 = dateTimeField22.getAsText((-8120662499L));
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 39251167L + "'", long17 == 39251167L);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "937" + "'", str24, "937");
    }

    @Test
    public void test17116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17116");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis(0L);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.eras();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str12 = dateTimeFieldType11.getName();
        int int13 = localDateTime5.indexOf(dateTimeFieldType11);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime5.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime5.minusSeconds((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str19 = dateTimeFieldType18.getName();
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.property(dateTimeFieldType18);
        int int21 = localDateTime17.getMinuteOfHour();
        org.joda.time.DateTime dateTime22 = localDateTime17.toDateTime();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField29 = localDateTime27.getField((int) (byte) 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray30 = localDateTime27.getFields();
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((long) 100, 1L, periodType33);
        org.joda.time.Period period36 = period34.minusSeconds((-1));
        org.joda.time.LocalDateTime localDateTime37 = localDateTime27.plus((org.joda.time.ReadablePeriod) period36);
        int int38 = localDateTime17.compareTo((org.joda.time.ReadablePartial) localDateTime27);
        int[] intArray40 = chronology3.get((org.joda.time.ReadablePartial) localDateTime27, (long) 39266896);
        org.joda.time.DateTimeField dateTimeField41 = chronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField42 = chronology3.weekyear();
        org.joda.time.DateTimeField dateTimeField43 = chronology3.secondOfDay();
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "clockhourOfDay" + "'", str12, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "dayOfMonth" + "'", str19, "dayOfMonth");
        org.junit.Assert.assertNotNull(property20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeFieldArray30);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1970, 1, 1, 39266896]");
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
    }

    @Test
    public void test17117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17117");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        boolean boolean6 = property3.equals((java.lang.Object) '#');
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        int int9 = dateTime8.getSecondOfMinute();
        int int10 = dateTime8.getYearOfEra();
        int int11 = property3.getDifference((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime8.toMutableDateTimeISO();
        mutableDateTime12.setSecondOfDay(642);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime12.dayOfYear();
        java.lang.Object obj16 = mutableDateTime12.clone();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundHalfFloor();
        org.joda.time.DateTimeField dateTimeField19 = property17.getField();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property23 = localDateTime20.hourOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str27 = dateTimeFieldType26.getName();
        int int28 = localDateTime20.indexOf(dateTimeFieldType26);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.LocalDateTime.Property property31 = localDateTime20.property(dateTimeFieldType29);
        org.joda.time.LocalDateTime localDateTime33 = property31.addWrapFieldToCopy(40);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property37 = localDateTime34.hourOfDay();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime34.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str41 = dateTimeFieldType40.getName();
        int int42 = localDateTime34.indexOf(dateTimeFieldType40);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime34.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime34.minusSeconds((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str48 = dateTimeFieldType47.getName();
        org.joda.time.LocalDateTime.Property property49 = localDateTime46.property(dateTimeFieldType47);
        int int50 = localDateTime46.getMinuteOfHour();
        org.joda.time.DateTime dateTime51 = localDateTime46.toDateTime();
        org.joda.time.DateTime dateTime52 = localDateTime33.toDateTime((org.joda.time.ReadableInstant) dateTime51);
        int int53 = localDateTime33.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property57 = localDateTime54.hourOfDay();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime54.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str61 = dateTimeFieldType60.getName();
        int int62 = localDateTime54.indexOf(dateTimeFieldType60);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime54.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime54.minusSeconds((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str68 = dateTimeFieldType67.getName();
        org.joda.time.LocalDateTime.Property property69 = localDateTime66.property(dateTimeFieldType67);
        int int70 = localDateTime66.getMinuteOfHour();
        boolean boolean71 = localDateTime33.isBefore((org.joda.time.ReadablePartial) localDateTime66);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime66.minusMillis(2019);
        int int74 = property17.compareTo((org.joda.time.ReadablePartial) localDateTime66);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33 + "'", int9 == 33);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(obj16);
// flaky:         org.junit.Assert.assertEquals(obj16.toString(), "2022-02-21T00:10:42.876Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "2022-02-21T00:10:42.876Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "2022-02-21T00:10:42.876Z");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "clockhourOfDay" + "'", str27, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "clockhourOfDay" + "'", str30, "clockhourOfDay");
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "clockhourOfDay" + "'", str41, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "dayOfMonth" + "'", str48, "dayOfMonth");
        org.junit.Assert.assertNotNull(property49);
// flaky:         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime52);
// flaky:         org.junit.Assert.assertTrue("'" + int53 + "' != '" + 876 + "'", int53 == 876);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(dateTimeFieldType60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "clockhourOfDay" + "'", str61, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(dateTimeFieldType67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "dayOfMonth" + "'", str68, "dayOfMonth");
        org.junit.Assert.assertNotNull(property69);
// flaky:         org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
    }

    @Test
    public void test17118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17118");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableDuration0, readableInstant1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 100, 1L, periodType5);
        org.joda.time.Period period8 = period6.minusSeconds((-1));
        java.lang.String str9 = period6.toString();
        org.joda.time.Period period10 = period6.toPeriod();
        org.joda.time.PeriodType periodType11 = period6.getPeriodType();
        org.joda.time.Period period12 = period2.normalizedStandard(periodType11);
        org.joda.time.Period period14 = period2.plusSeconds(45);
        org.joda.time.Period period16 = period14.minusYears(31);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableDuration19, readableInstant20);
        org.joda.time.Period period23 = period21.withDays((int) (byte) 1);
        org.joda.time.Period period25 = period23.minusWeeks(100);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) 100, 1L, periodType28);
        org.joda.time.Period period31 = period29.minusSeconds((-1));
        java.lang.String str32 = period29.toString();
        org.joda.time.Period period33 = period29.toPeriod();
        org.joda.time.PeriodType periodType34 = period29.getPeriodType();
        org.joda.time.Period period35 = period25.withPeriodType(periodType34);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 41, (long) 'x', periodType34);
        org.joda.time.Period period37 = period14.minus((org.joda.time.ReadablePeriod) mutablePeriod36);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) 100, 1L, periodType40);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period((long) 100, 1L, periodType44);
        org.joda.time.Period period46 = period41.plus((org.joda.time.ReadablePeriod) period45);
        org.joda.time.Period period48 = period45.plusDays(53600069);
        org.joda.time.Period period50 = period48.plusMonths(39239);
        org.joda.time.Period period52 = period50.minusSeconds((-1));
        org.joda.time.DurationFieldType durationFieldType54 = period50.getFieldType(0);
        int int55 = mutablePeriod36.get(durationFieldType54);
        java.lang.Object obj56 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(chronology59);
        int int61 = dateTime60.getSecondOfMinute();
        boolean boolean62 = dateTime60.isEqualNow();
        int int63 = dateTime60.getDayOfYear();
        org.joda.time.Chronology chronology64 = dateTime60.getChronology();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology64);
        org.joda.time.DurationField durationField66 = chronology64.hours();
        org.joda.time.DateTimeField dateTimeField67 = chronology64.dayOfWeek();
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate(obj56, chronology64);
        org.joda.time.DurationField durationField69 = durationFieldType54.getField(chronology64);
        org.joda.time.DateTimeField dateTimeField70 = chronology64.hourOfDay();
        java.lang.String str71 = dateTimeField70.toString();
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT0.099S" + "'", str9, "PT0.099S");
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PT0.099S" + "'", str32, "PT0.099S");
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(durationFieldType54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int61 + "' != '" + 33 + "'", int61 == 33);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 52 + "'", int63 == 52);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(durationField66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(durationField69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "DateTimeField[hourOfDay]" + "'", str71, "DateTimeField[hourOfDay]");
    }

    @Test
    public void test17119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17119");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.adjustOffset(0L, true);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(0L, dateTimeZone5);
        int int7 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) mutableDateTime6);
        mutableDateTime6.addMillis((int) '#');
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) 100, 1L, periodType12);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) 100, 1L, periodType16);
        org.joda.time.Period period18 = period13.plus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.MutablePeriod mutablePeriod19 = period18.toMutablePeriod();
        java.lang.Object obj20 = mutablePeriod19.clone();
        org.joda.time.PeriodType periodType21 = mutablePeriod19.getPeriodType();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) 100, 1L, periodType26);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) 100, 1L, periodType30);
        org.joda.time.Period period32 = period27.plus((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Instant instant33 = new org.joda.time.Instant();
        org.joda.time.Instant instant35 = instant33.withMillis(0L);
        org.joda.time.Duration duration36 = period31.toDurationTo((org.joda.time.ReadableInstant) instant35);
        mutableDateTime23.add((org.joda.time.ReadableDuration) duration36, 39);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime23.yearOfEra();
        mutableDateTime23.setWeekOfWeekyear(14);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime23.minuteOfDay();
        org.joda.time.DurationField durationField43 = property42.getRangeDurationField();
        org.joda.time.DurationFieldType durationFieldType44 = durationField43.getType();
        mutablePeriod19.set(durationFieldType44, 120);
        mutableDateTime6.add(durationFieldType44, 0);
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period(readableDuration49, readableInstant50);
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period((long) 100, 1L, periodType54);
        org.joda.time.Period period57 = period55.minusSeconds((-1));
        java.lang.String str58 = period55.toString();
        org.joda.time.Period period59 = period55.toPeriod();
        org.joda.time.PeriodType periodType60 = period55.getPeriodType();
        org.joda.time.Period period61 = period51.normalizedStandard(periodType60);
        org.joda.time.Period period63 = period61.withSeconds(10);
        org.joda.time.DurationFieldType durationFieldType64 = org.joda.time.DurationFieldType.millis();
        boolean boolean65 = period61.isSupported(durationFieldType64);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime(chronology68);
        int int70 = dateTime69.getSecondOfMinute();
        boolean boolean71 = dateTime69.isEqualNow();
        int int72 = dateTime69.getDayOfYear();
        org.joda.time.Chronology chronology73 = dateTime69.getChronology();
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology73);
        org.joda.time.DateTimeField dateTimeField75 = chronology73.year();
        org.joda.time.DateTimeField dateTimeField76 = chronology73.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime77 = org.joda.time.LocalDateTime.now(chronology73);
        org.joda.time.DateTimeField dateTimeField78 = chronology73.minuteOfDay();
        org.joda.time.DurationField durationField79 = durationFieldType64.getField(chronology73);
        org.joda.time.DateTimeField dateTimeField80 = chronology73.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime81 = mutableDateTime6.toMutableDateTime(chronology73);
        mutableDateTime81.setWeekyear(164);
        mutableDateTime81.addHours(57600000);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(mutablePeriod19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "P120DT0.198S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "P120DT0.198S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "P120DT0.198S");
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "PT0.099S" + "'", str58, "PT0.099S");
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(durationFieldType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int70 + "' != '" + 33 + "'", int70 == 33);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 52 + "'", int72 == 52);
        org.junit.Assert.assertNotNull(chronology73);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertNotNull(dateTimeField76);
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertNotNull(dateTimeField78);
        org.junit.Assert.assertNotNull(durationField79);
        org.junit.Assert.assertNotNull(dateTimeField80);
        org.junit.Assert.assertNotNull(mutableDateTime81);
    }

    @Test
    public void test17120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17120");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getSecondOfMinute();
        boolean boolean6 = dateTime4.isEqualNow();
        int int7 = dateTime4.getDayOfYear();
        org.joda.time.Chronology chronology8 = dateTime4.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) (-3268332), chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.dayOfYear();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 19, (long) 1956, chronology8);
        org.joda.time.DateTimeField dateTimeField12 = chronology8.weekOfWeekyear();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        int int17 = dateTime16.getSecondOfMinute();
        boolean boolean18 = dateTime16.isEqualNow();
        int int19 = dateTime16.getDayOfYear();
        org.joda.time.Chronology chronology20 = dateTime16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology20);
        int int22 = mutablePeriod21.getDays();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(chronology25);
        int int27 = dateTime26.getSecondOfMinute();
        boolean boolean28 = dateTime26.isEqualNow();
        int int29 = dateTime26.getDayOfYear();
        org.joda.time.Chronology chronology30 = dateTime26.getChronology();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(chronology30);
        org.joda.time.DurationField durationField32 = chronology30.halfdays();
        mutablePeriod21.setPeriod((long) (byte) -1, 51L, chronology30);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(chronology30);
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.millis();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) 46, periodType39);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(0L, 0L, periodType39, chronology41);
        org.joda.time.MutablePeriod mutablePeriod43 = mutablePeriod42.copy();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(chronology47);
        int int49 = dateTime48.getSecondOfMinute();
        boolean boolean50 = dateTime48.isEqualNow();
        int int51 = dateTime48.getDayOfYear();
        org.joda.time.Chronology chronology52 = dateTime48.getChronology();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology52);
        org.joda.time.DateTimeField dateTimeField54 = chronology52.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(chronology52);
        mutablePeriod43.setPeriod((long) 21, chronology52);
        org.joda.time.DateTimeField dateTimeField57 = chronology52.yearOfEra();
        org.joda.time.Chronology chronology58 = chronology52.withUTC();
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period(readableDuration59, readableInstant60);
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period((long) 100, 1L, periodType64);
        org.joda.time.Period period67 = period65.minusSeconds((-1));
        java.lang.String str68 = period65.toString();
        org.joda.time.Period period69 = period65.toPeriod();
        org.joda.time.PeriodType periodType70 = period65.getPeriodType();
        org.joda.time.Period period71 = period61.normalizedStandard(periodType70);
        org.joda.time.Period period73 = period71.multipliedBy((int) (short) 100);
        org.joda.time.Period period74 = period71.toPeriod();
        org.joda.time.Period period76 = period74.plusDays(53867592);
        int[] intArray78 = chronology52.get((org.joda.time.ReadablePeriod) period74, (long) (-625));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray80 = dateTimeField12.addWrapField((org.joda.time.ReadablePartial) localTime34, 658, intArray78, 348);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 658");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField12);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 33 + "'", int27 == 33);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(mutablePeriod43);
// flaky:         org.junit.Assert.assertTrue("'" + int49 + "' != '" + 33 + "'", int49 == 33);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 52 + "'", int51 == 52);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "PT0.099S" + "'", str68, "PT0.099S");
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[0, 0, 0, 0, 0, 0, 0, -625]");
    }

    @Test
    public void test17121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17121");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str7 = dateTimeFieldType6.getName();
        int int8 = localDateTime0.indexOf(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime0.minusSeconds((int) '#');
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.hourOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str20 = dateTimeFieldType19.getName();
        int int21 = localDateTime13.indexOf(dateTimeFieldType19);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime13.minusSeconds(0);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (short) 1, chronology25);
        org.joda.time.Instant instant27 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableInstant) instant27, periodType28);
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDateTime0, (org.joda.time.ReadablePartial) localDateTime23, periodType28);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        long long34 = dateTimeZone31.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime36 = localDateTime0.toDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime0.minusDays(2);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusWeeks(53750205);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((int) (short) 10, 100, (int) 'a', 21);
        int int46 = mutablePeriod45.getWeeks();
        mutablePeriod45.setMinutes(51);
        mutablePeriod45.setMinutes(52);
        mutablePeriod45.setHours(0);
        mutablePeriod45.addSeconds(5);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime40.minus((org.joda.time.ReadablePeriod) mutablePeriod45);
        java.lang.String str56 = localDateTime55.toString();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "clockhourOfDay" + "'", str7, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "clockhourOfDay" + "'", str20, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 100L + "'", long34 == 100L);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(localDateTime55);
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1032163-07-30T14:09:51.967" + "'", str56, "1032163-07-30T14:09:51.967");
    }

    @Test
    public void test17122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17122");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        int int6 = dateTime5.getSecondOfMinute();
        boolean boolean7 = dateTime5.isEqualNow();
        int int8 = dateTime5.getDayOfYear();
        org.joda.time.Chronology chronology9 = dateTime5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology9);
        org.joda.time.DurationField durationField11 = chronology9.hours();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfWeek();
        org.joda.time.Period period13 = new org.joda.time.Period((long) 39246272, (long) 5, chronology9);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property17 = localDateTime14.hourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = property17.addWrapFieldToCopy(46);
        org.joda.time.LocalDateTime localDateTime20 = property17.withMaximumValue();
        long long22 = chronology9.set((org.joda.time.ReadablePartial) localDateTime20, 1241542006905600000L);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1645484614011L + "'", long22 == 1645484614011L);
    }

    @Test
    public void test17123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17123");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.util.Locale locale4 = dateTimeFormatter2.getLocale();
        java.util.Locale locale5 = dateTimeFormatter2.getLocale();
        boolean boolean6 = dateTimeFormatter2.isPrinter();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test17124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17124");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        org.joda.time.Chronology chronology3 = localDate0.getChronology();
        org.joda.time.LocalDate localDate5 = localDate0.withDayOfMonth((int) (byte) 10);
        org.joda.time.LocalDate localDate7 = localDate5.plusMonths((int) (short) 1);
        org.joda.time.LocalDate localDate9 = localDate5.withYearOfEra((int) (short) 1);
        org.joda.time.DateTimeField[] dateTimeFieldArray10 = localDate5.getFields();
        org.joda.time.LocalDate.Property property11 = localDate5.year();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeFieldArray10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test17125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17125");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis(1645455600000L);
        org.joda.time.Minutes minutes2 = duration1.toStandardMinutes();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period5 = duration4.toPeriod();
        org.joda.time.Duration duration8 = duration4.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime10.add((org.joda.time.ReadableDuration) duration12, (int) (short) 100);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        int int17 = dateTime16.getYearOfCentury();
        org.joda.time.Interval interval18 = duration12.toIntervalTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.Duration duration19 = duration8.minus((org.joda.time.ReadableDuration) duration12);
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period22 = duration21.toPeriod();
        org.joda.time.Duration duration24 = duration8.withDurationAdded((org.joda.time.ReadableDuration) duration21, 54);
        org.joda.time.Duration duration25 = duration1.minus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Duration duration26 = duration1.toDuration();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology27);
        int int29 = dateTime28.getSecondOfMinute();
        boolean boolean30 = dateTime28.isEqualNow();
        int int31 = dateTime28.getDayOfYear();
        org.joda.time.Chronology chronology32 = dateTime28.getChronology();
        org.joda.time.Duration duration34 = org.joda.time.Duration.standardSeconds(10L);
        org.joda.time.DateTime dateTime35 = dateTime28.plus((org.joda.time.ReadableDuration) duration34);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime37.add((org.joda.time.ReadableDuration) duration39, (int) (short) 100);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(chronology42);
        int int44 = dateTime43.getYearOfCentury();
        org.joda.time.Interval interval45 = duration39.toIntervalTo((org.joda.time.ReadableInstant) dateTime43);
        int int46 = duration34.compareTo((org.joda.time.ReadableDuration) duration39);
        boolean boolean47 = duration26.isEqual((org.joda.time.ReadableDuration) duration39);
        org.joda.time.Duration duration49 = org.joda.time.Duration.standardHours((long) 39221019);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(0L, dateTimeZone51);
        mutableDateTime52.addMillis(50);
        org.joda.time.Period period55 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration49, (org.joda.time.ReadableInstant) mutableDateTime52);
        org.joda.time.Duration duration57 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) (short) 1, chronology59);
        org.joda.time.DateTime dateTime61 = dateTime60.toDateTime();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) (short) 1, chronology63);
        org.joda.time.DateTime dateTime65 = dateTime64.toDateTime();
        int int66 = dateTime61.compareTo((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.Duration duration68 = org.joda.time.Duration.standardSeconds(10L);
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime64, (org.joda.time.ReadableDuration) duration68);
        org.joda.time.Duration duration71 = duration57.withDurationAdded((org.joda.time.ReadableDuration) duration68, 10);
        org.joda.time.Duration duration72 = duration71.toDuration();
        boolean boolean73 = duration49.isLongerThan((org.joda.time.ReadableDuration) duration71);
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration77 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime75.add((org.joda.time.ReadableDuration) duration77, (int) (short) 100);
        org.joda.time.Period period80 = duration77.toPeriod();
        int int81 = duration49.compareTo((org.joda.time.ReadableDuration) duration77);
        int int82 = duration26.compareTo((org.joda.time.ReadableDuration) duration77);
        long long83 = duration26.getStandardHours();
        org.joda.time.Period period84 = duration26.toPeriod();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration26);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 34 + "'", int29 == 34);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 22 + "'", int44 == 22);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(duration77);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 457071L + "'", long83 == 457071L);
        org.junit.Assert.assertNotNull(period84);
    }

    @Test
    public void test17126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17126");
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.eras();
        java.util.Locale locale6 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology4, locale6, (java.lang.Integer) 39221019);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.util.Locale locale12 = java.util.Locale.CANADA;
        java.lang.String str13 = locale11.getDisplayVariant(locale12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology10, locale12);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeParserBucket14.getZone();
        org.joda.time.Chronology chronology16 = chronology4.withZone(dateTimeZone15);
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.now(chronology16);
        org.joda.time.LocalTime localTime19 = localTime17.plusMillis((int) (byte) -1);
        org.joda.time.LocalTime.Property property20 = localTime17.millisOfDay();
        org.joda.time.LocalTime.Property property21 = localTime17.millisOfSecond();
        org.joda.time.LocalTime localTime23 = localTime17.plusMinutes(613);
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.era();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
    }

    @Test
    public void test17127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17127");
        java.lang.Object obj0 = null;
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.hourOfDay();
        int int5 = localDateTime1.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekyear();
        int int7 = localDateTime1.get(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.minusHours(39443128);
        org.joda.time.Chronology chronology10 = localDateTime1.getChronology();
        org.joda.time.Period period11 = new org.joda.time.Period(obj0, chronology10);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test17128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17128");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime.Property property2 = dateTime1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        org.joda.time.DateTime dateTime4 = property2.withMinimumValue();
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str6 = property2.getAsShortText(locale5);
        org.joda.time.DateTime dateTime8 = property2.setCopy(53700016);
        java.lang.String str9 = property2.getAsText();
        int int10 = property2.get();
        org.joda.time.DateTime dateTime11 = property2.withMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "54214139" + "'", str6, "54214139");
        org.junit.Assert.assertNotNull(dateTime8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "54214139" + "'", str9, "54214139");
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 54214139 + "'", int10 == 54214139);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test17129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17129");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, 1L, periodType2);
        org.joda.time.Period period5 = period3.minusSeconds((-1));
        java.lang.String str6 = period3.toString();
        org.joda.time.Period period7 = period3.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod8 = period7.toMutablePeriod();
        org.joda.time.Period period10 = period7.minusDays(40);
        org.joda.time.Period period11 = period7.normalizedStandard();
        org.joda.time.Period period13 = period7.withMillis(29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType15 = period7.getFieldType((-52));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0.099S" + "'", str6, "PT0.099S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test17130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17130");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        int int3 = localDate0.size();
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        org.joda.time.LocalDate localDate6 = localDate0.withYearOfCentury(0);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) 100, 1L, periodType11);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 100, 1L, periodType15);
        org.joda.time.Period period17 = period12.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Instant instant18 = new org.joda.time.Instant();
        org.joda.time.Instant instant20 = instant18.withMillis(0L);
        org.joda.time.Duration duration21 = period16.toDurationTo((org.joda.time.ReadableInstant) instant20);
        mutableDateTime8.add((org.joda.time.ReadableDuration) duration21, 39);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime8.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime8.setZone(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = localDate0.toDateTimeAtMidnight(dateTimeZone25);
        boolean boolean29 = dateTime27.isAfter(315532800097L);
        org.joda.time.DateTime.Property property30 = dateTime27.era();
        boolean boolean31 = dateTime27.isAfterNow();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test17131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17131");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 100, 1L, periodType5);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) 100, 1L, periodType9);
        org.joda.time.Period period11 = period6.plus((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.Instant instant14 = instant12.withMillis(0L);
        org.joda.time.Duration duration15 = period10.toDurationTo((org.joda.time.ReadableInstant) instant14);
        mutableDateTime2.add((org.joda.time.ReadableDuration) duration15, 39);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime2.yearOfEra();
        mutableDateTime2.setWeekOfWeekyear(14);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate23 = localDate21.minusMonths((int) ' ');
        org.joda.time.Chronology chronology24 = localDate21.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.minuteOfDay();
        mutableDateTime2.setChronology(chronology24);
        org.joda.time.DateTimeZone dateTimeZone27 = chronology24.getZone();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) 100, 1L, periodType31);
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((long) 100, 1L, periodType35);
        org.joda.time.Period period37 = period32.plus((org.joda.time.ReadablePeriod) period36);
        org.joda.time.Instant instant38 = new org.joda.time.Instant();
        org.joda.time.Instant instant40 = instant38.withMillis(0L);
        org.joda.time.Duration duration41 = period36.toDurationTo((org.joda.time.ReadableInstant) instant40);
        org.joda.time.Instant instant43 = instant40.plus((long) (byte) -1);
        org.joda.time.Instant instant46 = instant43.withDurationAdded(1L, (int) (short) -1);
        org.joda.time.Chronology chronology47 = instant43.getChronology();
        org.joda.time.Chronology chronology49 = null;
        java.util.Locale locale50 = java.util.Locale.GERMAN;
        java.util.Locale locale51 = locale50.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology49, locale50, (java.lang.Integer) 45, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket(0L, chronology47, locale50, (java.lang.Integer) 1970);
        java.util.Locale locale57 = java.util.Locale.ITALY;
        java.lang.String str58 = locale50.getDisplayScript(locale57);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket((long) 16, chronology24, locale50, (java.lang.Integer) 2022);
        org.joda.time.DurationField durationField61 = chronology24.years();
        long long64 = durationField61.getDifferenceAsLong((long) 75596, (long) 552);
        long long65 = durationField61.getUnitMillis();
        long long67 = durationField61.getMillis(21600000);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(instant40);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(instant43);
        org.junit.Assert.assertNotNull(instant46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "de");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "de");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(durationField61);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 31556952000L + "'", long65 == 31556952000L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 681630163200000000L + "'", long67 == 681630163200000000L);
    }

    @Test
    public void test17132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17132");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean18 = mutableDateTime1.isSupported(dateTimeFieldType17);
        mutableDateTime1.addMillis(265);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime1.yearOfEra();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate24 = localDate22.plusMonths(43);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.halfdays();
        boolean boolean26 = localDate24.isSupported(durationFieldType25);
        org.joda.time.LocalDate localDate28 = localDate24.plusMonths(52);
        int int29 = localDate28.getCenturyOfEra();
        int int30 = localDate28.size();
        org.joda.time.Chronology chronology31 = localDate28.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.weekyearOfCentury();
        mutableDateTime1.setChronology(chronology31);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setSecondOfMinute(53818065);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53818065 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20 + "'", int29 == 20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
    }

    @Test
    public void test17133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17133");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(91);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test17134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17134");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration3, (int) (short) 100);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getYearOfCentury();
        org.joda.time.Interval interval9 = duration3.toIntervalTo((org.joda.time.ReadableInstant) dateTime7);
        int int10 = dateTime7.getDayOfMonth();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (short) 1, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.LocalDate localDate15 = dateTime13.toLocalDate();
        int int16 = dateTime7.compareTo((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime18 = dateTime7.plusMonths(39266896);
        org.joda.time.DateTime dateTime20 = dateTime7.plusHours((-625));
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 22 + "'", int8 == 22);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 21 + "'", int10 == 21);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test17135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17135");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        int int17 = mutableDateTime1.getDayOfMonth();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate20 = localDate18.minusMonths((int) ' ');
        int int21 = localDate18.size();
        org.joda.time.LocalDate.Property property22 = localDate18.era();
        org.joda.time.LocalDate localDate23 = property22.roundCeilingCopy();
        org.joda.time.LocalDate.Property property24 = localDate23.weekyear();
        org.joda.time.LocalDate localDate26 = property24.addWrapFieldToCopy(31);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean28 = property24.equals((java.lang.Object) dateTimeFieldType27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime1.property(dateTimeFieldType27);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime1.hourOfDay();
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 31 + "'", int17 == 31);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
    }

    @Test
    public void test17136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17136");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period2 = duration1.toPeriod();
        org.joda.time.Duration duration5 = duration1.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration5, readableInstant6);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) 100, 1L, periodType12);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) 100, 1L, periodType16);
        org.joda.time.Period period18 = period13.plus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Instant instant19 = new org.joda.time.Instant();
        org.joda.time.Instant instant21 = instant19.withMillis(0L);
        org.joda.time.Duration duration22 = period17.toDurationTo((org.joda.time.ReadableInstant) instant21);
        mutableDateTime9.add((org.joda.time.ReadableDuration) duration22, 39);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime9.yearOfEra();
        mutableDateTime9.setWeekOfWeekyear(14);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime9.minuteOfDay();
        java.util.Date date29 = mutableDateTime9.toDate();
        org.joda.time.Interval interval30 = duration5.toIntervalFrom((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period33 = duration32.toPeriod();
        org.joda.time.Duration duration36 = duration32.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((long) 100, 1L, periodType39);
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((long) 100, 1L, periodType43);
        org.joda.time.Period period45 = period40.plus((org.joda.time.ReadablePeriod) period44);
        org.joda.time.Instant instant46 = new org.joda.time.Instant();
        org.joda.time.Instant instant48 = instant46.withMillis(0L);
        org.joda.time.Duration duration49 = period44.toDurationTo((org.joda.time.ReadableInstant) instant48);
        org.joda.time.Instant instant51 = instant48.plus((long) (byte) -1);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) (short) 1, chronology53);
        org.joda.time.Instant instant55 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType56 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime54, (org.joda.time.ReadableInstant) instant55, periodType56);
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration32, (org.joda.time.ReadableInstant) instant48, periodType56);
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period((long) 100, 1L, periodType63);
        org.joda.time.PeriodType periodType67 = null;
        org.joda.time.Period period68 = new org.joda.time.Period((long) 100, 1L, periodType67);
        org.joda.time.Period period69 = period64.plus((org.joda.time.ReadablePeriod) period68);
        org.joda.time.Instant instant70 = new org.joda.time.Instant();
        org.joda.time.Instant instant72 = instant70.withMillis(0L);
        org.joda.time.Duration duration73 = period68.toDurationTo((org.joda.time.ReadableInstant) instant72);
        mutableDateTime60.add((org.joda.time.ReadableDuration) duration73, 39);
        org.joda.time.MutableDateTime.Property property76 = mutableDateTime60.secondOfMinute();
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime60.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime78 = org.joda.time.LocalDateTime.now();
        org.joda.time.PeriodType periodType81 = null;
        org.joda.time.Period period82 = new org.joda.time.Period((long) 100, 1L, periodType81);
        org.joda.time.Period period84 = period82.minusSeconds((-1));
        org.joda.time.Duration duration86 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period87 = duration86.toPeriod();
        org.joda.time.DurationFieldType durationFieldType88 = org.joda.time.DurationFieldType.centuries();
        int int89 = period87.get(durationFieldType88);
        boolean boolean90 = period82.isSupported(durationFieldType88);
        org.joda.time.LocalDateTime localDateTime92 = localDateTime78.withFieldAdded(durationFieldType88, 52);
        mutableDateTime60.add(durationFieldType88, (int) (byte) 100);
        boolean boolean95 = periodType56.isSupported(durationFieldType88);
        mutableDateTime9.add(durationFieldType88, 100);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Thu Apr 02 10:59:37 GMT+10:59 1970");
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(instant48);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(instant51);
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(instant72);
        org.junit.Assert.assertNotNull(duration73);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(duration86);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(durationFieldType88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(localDateTime92);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test17137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17137");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (short) 10, 100, (int) 'a', 21);
        mutablePeriod4.addYears(59);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.withMillis(0L);
        org.joda.time.Chronology chronology12 = instant11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.eras();
        java.util.Locale locale14 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology12, locale14, (java.lang.Integer) 39221019);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 53, chronology12);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableDuration18, readableInstant19);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) 100, 1L, periodType23);
        org.joda.time.Period period26 = period24.minusSeconds((-1));
        java.lang.String str27 = period24.toString();
        org.joda.time.Period period28 = period24.toPeriod();
        org.joda.time.PeriodType periodType29 = period24.getPeriodType();
        org.joda.time.Period period30 = period20.normalizedStandard(periodType29);
        boolean boolean31 = localDate17.equals((java.lang.Object) period20);
        org.joda.time.Interval interval32 = localDate17.toInterval();
        mutablePeriod4.add((org.joda.time.ReadableInterval) interval32);
        org.joda.time.Duration duration35 = org.joda.time.Duration.standardDays((long) (byte) 1);
        java.lang.String str36 = duration35.toString();
        mutablePeriod4.setPeriod((org.joda.time.ReadableDuration) duration35);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(chronology38);
        int int40 = dateTime39.getYearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = dateTime39.toString(dateTimeFormatter41);
        org.joda.time.DateTime dateTime44 = dateTime39.plusMonths(86396191);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(chronology47);
        int int49 = dateTime48.getSecondOfMinute();
        boolean boolean50 = dateTime48.isEqualNow();
        int int51 = dateTime48.getDayOfYear();
        org.joda.time.Chronology chronology52 = dateTime48.getChronology();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology52);
        org.joda.time.DateTime dateTime54 = dateTime44.toDateTime(chronology52);
        org.joda.time.DateTime.Property property55 = dateTime44.hourOfDay();
        org.joda.time.Period period56 = duration35.toPeriodTo((org.joda.time.ReadableInstant) dateTime44);
        int int57 = dateTime44.getMillisOfSecond();
        int int58 = dateTime44.getCenturyOfEra();
        org.joda.time.DateTime.Property property59 = dateTime44.weekOfWeekyear();
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_GB");
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PT0.099S" + "'", str27, "PT0.099S");
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PT86400S" + "'", str36, "PT86400S");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 22 + "'", int40 == 22);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2022-02-21T15:03:34.300Z" + "'", str42, "2022-02-21T15:03:34.300Z");
        org.junit.Assert.assertNotNull(dateTime44);
// flaky:         org.junit.Assert.assertTrue("'" + int49 + "' != '" + 34 + "'", int49 == 34);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 52 + "'", int51 == 52);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(period56);
// flaky:         org.junit.Assert.assertTrue("'" + int57 + "' != '" + 300 + "'", int57 == 300);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 72017 + "'", int58 == 72017);
        org.junit.Assert.assertNotNull(property59);
    }

    @Test
    public void test17138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17138");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableDuration0, readableInstant1);
        org.joda.time.Period period4 = period2.withDays((int) (byte) 1);
        org.joda.time.Period period6 = period4.withMinutes(39);
        org.joda.time.Period period8 = period6.plusMinutes(39221019);
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.Instant instant12 = instant10.withMillis(0L);
        org.joda.time.Chronology chronology13 = instant12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.eras();
        java.util.Locale locale15 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology13, locale15, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property21 = localDateTime18.hourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        int int23 = property21.get();
        org.joda.time.LocalDateTime localDateTime24 = property21.roundHalfFloorCopy();
        long long26 = chronology13.set((org.joda.time.ReadablePartial) localDateTime24, (long) 2022);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now(chronology13);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DurationField durationField29 = chronology13.eras();
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        org.joda.time.Duration duration32 = period8.toDurationFrom((org.joda.time.ReadableInstant) mutableDateTime30);
        org.joda.time.Chronology chronology33 = mutableDateTime30.getChronology();
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(chronology33);
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((long) 100, 1L, periodType37);
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) 100, 1L, periodType41);
        org.joda.time.Period period43 = period38.plus((org.joda.time.ReadablePeriod) period42);
        org.joda.time.Period period45 = period43.minusMinutes(906);
        org.joda.time.Period period47 = period43.plusDays(24);
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableDuration48, readableInstant49);
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((long) 100, 1L, periodType53);
        org.joda.time.Period period56 = period54.minusSeconds((-1));
        java.lang.String str57 = period54.toString();
        org.joda.time.Period period58 = period54.toPeriod();
        org.joda.time.PeriodType periodType59 = period54.getPeriodType();
        org.joda.time.Period period60 = period50.normalizedStandard(periodType59);
        java.lang.String str61 = period50.toString();
        int int62 = period50.getMinutes();
        org.joda.time.Period period63 = period47.withFields((org.joda.time.ReadablePeriod) period50);
        int[] intArray65 = chronology33.get((org.joda.time.ReadablePeriod) period47, (long) 53803364);
        org.joda.time.DateTimeField dateTimeField66 = chronology33.secondOfDay();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1645455600000L + "'", long26 == 1645455600000L);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "PT0.099S" + "'", str57, "PT0.099S");
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "PT0S" + "'", str61, "PT0S");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[0, 0, 0, 0, 14, 56, 43, 364]");
        org.junit.Assert.assertNotNull(dateTimeField66);
    }

    @Test
    public void test17139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17139");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, 1L, periodType2);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 100, 1L, periodType6);
        org.joda.time.Period period8 = period3.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period10 = period8.withMillis(39251693);
        org.joda.time.Period period12 = period8.plusMinutes((int) (short) 100);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardHours((long) (short) 1);
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period17 = duration16.toPeriod();
        org.joda.time.Duration duration20 = duration16.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration20, readableInstant21);
        org.joda.time.Duration duration23 = duration20.toDuration();
        int int24 = duration14.compareTo((org.joda.time.ReadableDuration) duration23);
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardHours((long) 39221019);
        org.joda.time.Period period27 = duration26.toPeriod();
        org.joda.time.Duration duration29 = duration26.withMillis(10L);
        boolean boolean30 = duration14.isEqual((org.joda.time.ReadableDuration) duration29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(chronology32);
        int int34 = dateTime33.getSecondOfMinute();
        boolean boolean35 = dateTime33.isEqualNow();
        int int36 = dateTime33.getDayOfYear();
        org.joda.time.Chronology chronology37 = dateTime33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) (-3268332), chronology37);
        org.joda.time.DateTimeField dateTimeField39 = chronology37.dayOfYear();
        long long43 = chronology37.add(82800004L, (long) (byte) 0, 86399999);
        org.joda.time.Period period44 = duration14.toPeriod(chronology37);
        org.joda.time.Period period45 = period12.withFields((org.joda.time.ReadablePeriod) period44);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 34 + "'", int34 == 34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 82800004L + "'", long43 == 82800004L);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period45);
    }

    @Test
    public void test17140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17140");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("10:55:45.479");
        java.lang.String str2 = timeZone1.getID();
        java.lang.Object obj3 = timeZone1.clone();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GMT" + "'", str2, "GMT");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test17141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17141");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.monthOfYear();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 1, chronology3);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) instant5, periodType6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int9 = instant5.get(dateTimeFieldType8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime0.withField(dateTimeFieldType8, 39);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusSeconds(52);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property18 = localDateTime15.hourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str22 = dateTimeFieldType21.getName();
        int int23 = localDateTime15.indexOf(dateTimeFieldType21);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime15.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime15.minusSeconds((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str29 = dateTimeFieldType28.getName();
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.property(dateTimeFieldType28);
        int int31 = localDateTime27.getMinuteOfHour();
        int int32 = localDateTime27.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property33 = localDateTime27.millisOfSecond();
        org.joda.time.LocalDateTime.Property property34 = localDateTime27.dayOfMonth();
        int int35 = localDateTime27.getSecondOfMinute();
        int int36 = property14.compareTo((org.joda.time.ReadablePartial) localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 903 + "'", int9 == 903);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "clockhourOfDay" + "'", str22, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "dayOfMonth" + "'", str29, "dayOfMonth");
        org.junit.Assert.assertNotNull(property30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 54179381 + "'", int32 == 54179381);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property34);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 59 + "'", int35 == 59);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test17142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17142");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime1.minuteOfHour();
        java.lang.String str19 = property18.getAsShortText();
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = locale20.stripExtensions();
        int int22 = property18.getMaximumTextLength(locale21);
        org.joda.time.MutableDateTime mutableDateTime23 = property18.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime24 = property18.roundHalfCeiling();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.hourOfDay();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (short) 1, chronology27);
        org.joda.time.Instant instant29 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableInstant) instant29, periodType30);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int33 = instant29.get(dateTimeFieldType32);
        java.lang.String str34 = dateTimeFieldType32.getName();
        org.joda.time.Instant instant37 = new org.joda.time.Instant();
        org.joda.time.Instant instant39 = instant37.withMillis(0L);
        org.joda.time.Chronology chronology40 = instant39.getChronology();
        org.joda.time.DurationField durationField41 = chronology40.eras();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) (short) 10, (long) '#', chronology40);
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType32.getField(chronology40);
        org.joda.time.DateTimeField dateTimeField44 = chronology40.millisOfSecond();
        mutableDateTime24.setChronology(chronology40);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "59" + "'", str19, "59");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 903 + "'", int33 == 903);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "minuteOfDay" + "'", str34, "minuteOfDay");
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
    }

    @Test
    public void test17143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17143");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        boolean boolean5 = property3.isLeap();
        boolean boolean6 = property3.isLeap();
        int int7 = property3.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime8 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime9 = property3.roundCeilingCopy();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 23 + "'", int7 == 23);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test17144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17144");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(readableInstant1, readableInstant2, periodType3);
        org.joda.time.PeriodType periodType5 = periodType3.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(86400L, periodType3);
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutablePeriod6.setPeriod(readableDuration7);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod6.add(39719122, 291, 747, 54151265, 401, 2000, 271, 182);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test17145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17145");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis((int) (byte) 0);
        int int11 = localDateTime4.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.millis();
        boolean boolean13 = localDateTime4.isSupported(durationFieldType12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime4.withYearOfEra(10);
        org.joda.time.Period period17 = org.joda.time.Period.millis(100);
        org.joda.time.Period period18 = period17.negated();
        org.joda.time.Period period20 = period17.plusSeconds(50);
        org.joda.time.Period period22 = period17.minusMonths(0);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime15.withPeriodAdded((org.joda.time.ReadablePeriod) period22, 41);
        int int25 = localDateTime24.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.minusDays(39387577);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusMonths(53750257);
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.yearOfCentury();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(localDateTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 38 + "'", int25 == 38);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
    }

    @Test
    public void test17146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17146");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, 1L, periodType2);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 100, 1L, periodType6);
        org.joda.time.Period period8 = period3.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period10 = period8.minusMinutes(906);
        org.joda.time.Period period12 = period10.plusYears(39316455);
        org.joda.time.Period period14 = period12.minusMinutes(250);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test17147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17147");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(54214139, 588, 22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 588 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17148");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.plusMonths(43);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(12);
        java.lang.String str5 = localDate4.toString();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2025-01-12" + "'", str5, "2025-01-12");
    }

    @Test
    public void test17149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17149");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime1.minuteOfHour();
        java.lang.String str19 = property18.getAsShortText();
        java.lang.String str20 = property18.getAsString();
        org.joda.time.MutableDateTime mutableDateTime21 = property18.roundFloor();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime21, readableDuration22);
        mutableDateTime21.addMonths(53670254);
        mutableDateTime21.addMinutes(39251167);
        mutableDateTime21.addDays(86399999);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "59" + "'", str19, "59");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "59" + "'", str20, "59");
        org.junit.Assert.assertNotNull(mutableDateTime21);
    }

    @Test
    public void test17150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17150");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(901, 17, 846, 12, 274);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 274 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17151");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears(1);
        org.joda.time.LocalDate localDate5 = localDate3.plusYears((int) (short) -1);
        org.joda.time.Chronology chronology6 = localDate3.getChronology();
        org.joda.time.DateTime dateTime7 = localDate3.toDateTimeAtStartOfDay();
        int int8 = dateTime7.getDayOfWeek();
        org.joda.time.DateTime dateTime9 = dateTime7.toDateTimeISO();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test17152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17152");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        org.joda.time.Chronology chronology3 = localDate0.getChronology();
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate6 = localDate0.withFieldAdded(durationFieldType4, (int) (byte) 100);
        org.joda.time.LocalDate localDate8 = localDate6.minusMonths(55);
        int int9 = localDate6.getWeekyear();
        org.joda.time.LocalDate localDate11 = localDate6.withCenturyOfEra(21);
        int[] intArray12 = localDate11.getValues();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12022 + "'", int9 == 12022);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[2122, 2, 21]");
    }

    @Test
    public void test17153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17153");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Calendar calendar4 = mutableDateTime1.toCalendar(locale2);
        mutableDateTime1.addMonths(20);
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period9 = duration8.toPeriod();
        org.joda.time.Duration duration12 = duration8.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration12, readableInstant13);
        org.joda.time.Duration duration15 = duration12.toDuration();
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period18 = duration17.toPeriod();
        org.joda.time.Duration duration21 = duration17.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) 100, 1L, periodType24);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) 100, 1L, periodType28);
        org.joda.time.Period period30 = period25.plus((org.joda.time.ReadablePeriod) period29);
        org.joda.time.Instant instant31 = new org.joda.time.Instant();
        org.joda.time.Instant instant33 = instant31.withMillis(0L);
        org.joda.time.Duration duration34 = period29.toDurationTo((org.joda.time.ReadableInstant) instant33);
        org.joda.time.Instant instant36 = instant33.plus((long) (byte) -1);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (short) 1, chronology38);
        org.joda.time.Instant instant40 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType41 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime39, (org.joda.time.ReadableInstant) instant40, periodType41);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration17, (org.joda.time.ReadableInstant) instant33, periodType41);
        int int44 = duration12.compareTo((org.joda.time.ReadableDuration) duration17);
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.monthOfYear();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (short) 1, chronology48);
        org.joda.time.Instant instant50 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType51 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime49, (org.joda.time.ReadableInstant) instant50, periodType51);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int54 = instant50.get(dateTimeFieldType53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime45.withField(dateTimeFieldType53, 39);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.minusSeconds(52);
        int int59 = localDateTime58.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.plusWeeks(22);
        org.joda.time.ReadableDuration readableDuration62 = null;
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period(readableDuration62, readableInstant63);
        org.joda.time.PeriodType periodType67 = null;
        org.joda.time.Period period68 = new org.joda.time.Period((long) 100, 1L, periodType67);
        org.joda.time.Period period70 = period68.minusSeconds((-1));
        java.lang.String str71 = period68.toString();
        org.joda.time.Period period72 = period68.toPeriod();
        org.joda.time.PeriodType periodType73 = period68.getPeriodType();
        org.joda.time.Period period74 = period64.normalizedStandard(periodType73);
        org.joda.time.Period period76 = period74.withSeconds(10);
        int int77 = period74.size();
        org.joda.time.LocalDateTime localDateTime78 = localDateTime58.plus((org.joda.time.ReadablePeriod) period74);
        org.joda.time.PeriodType periodType79 = period74.getPeriodType();
        org.joda.time.PeriodType periodType80 = periodType79.withMonthsRemoved();
        org.joda.time.Period period81 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, (org.joda.time.ReadableDuration) duration12, periodType80);
        mutableDateTime1.add(100L);
        org.joda.time.Instant instant87 = new org.joda.time.Instant();
        org.joda.time.Instant instant89 = instant87.withMillis(0L);
        org.joda.time.Chronology chronology90 = instant89.getChronology();
        org.joda.time.DurationField durationField91 = chronology90.eras();
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod((long) (short) 10, (long) '#', chronology90);
        org.joda.time.DurationField durationField93 = chronology90.eras();
        org.joda.time.LocalDateTime localDateTime94 = new org.joda.time.LocalDateTime(0L, chronology90);
        org.joda.time.MutableDateTime mutableDateTime95 = mutableDateTime1.toMutableDateTime(chronology90);
        mutableDateTime95.setYear(39527091);
        mutableDateTime95.addWeekyears(26728959);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "German" + "'", str3, "German");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
// flaky:         org.junit.Assert.assertTrue("'" + int54 + "' != '" + 903 + "'", int54 == 903);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 22 + "'", int59 == 22);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "PT0.099S" + "'", str71, "PT0.099S");
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(periodType73);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 8 + "'", int77 == 8);
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertNotNull(periodType79);
        org.junit.Assert.assertNotNull(periodType80);
        org.junit.Assert.assertNotNull(instant89);
        org.junit.Assert.assertNotNull(chronology90);
        org.junit.Assert.assertNotNull(durationField91);
        org.junit.Assert.assertNotNull(durationField93);
        org.junit.Assert.assertNotNull(mutableDateTime95);
    }

    @Test
    public void test17154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17154");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        org.joda.time.Chronology chronology3 = localDate0.getChronology();
        org.joda.time.LocalDate.Property property4 = localDate0.weekOfWeekyear();
        org.joda.time.LocalDate localDate5 = property4.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate5.withEra(39524414);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39524414 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test17155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17155");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        int int3 = localDate0.size();
        org.joda.time.LocalDate.Property property4 = localDate0.era();
        java.lang.String str5 = localDate0.toString();
        org.joda.time.LocalDate.Property property6 = localDate0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022-02-21" + "'", str5, "2022-02-21");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test17156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17156");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis((int) (byte) 100);
        int int6 = localTime5.getMillisOfDay();
        org.joda.time.LocalTime localTime8 = localTime5.plusMillis(2022);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) 100, 1L, periodType11);
        org.joda.time.Period period14 = period12.minusSeconds((-1));
        java.lang.String str15 = period12.toString();
        org.joda.time.Period period16 = period12.toPeriod();
        org.joda.time.LocalTime localTime18 = localTime5.withPeriodAdded((org.joda.time.ReadablePeriod) period16, (int) (byte) -1);
        org.joda.time.LocalTime.Property property19 = localTime5.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        java.lang.String str21 = dateTimeFieldType20.toString();
        boolean boolean22 = localTime5.isSupported(dateTimeFieldType20);
        org.joda.time.LocalTime localTime24 = localTime5.plusMinutes(706);
        int int25 = localTime5.size();
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 39814686 + "'", int6 == 39814686);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT0.099S" + "'", str15, "PT0.099S");
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hourOfHalfday" + "'", str21, "hourOfHalfday");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test17157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17157");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) 100, 1L, periodType11);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 100, 1L, periodType15);
        org.joda.time.Period period17 = period12.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Instant instant18 = new org.joda.time.Instant();
        org.joda.time.Instant instant20 = instant18.withMillis(0L);
        org.joda.time.Duration duration21 = period16.toDurationTo((org.joda.time.ReadableInstant) instant20);
        mutableDateTime8.add((org.joda.time.ReadableDuration) duration21, 39);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime8.secondOfMinute();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime8.minuteOfHour();
        java.lang.String str26 = property25.getAsShortText();
        java.util.Locale locale27 = java.util.Locale.GERMAN;
        java.util.Locale locale28 = locale27.stripExtensions();
        int int29 = property25.getMaximumTextLength(locale28);
        java.lang.String str30 = dateTimeZone1.getShortName((long) (short) 1, locale28);
        java.lang.String str33 = nameProvider0.getShortName(locale28, "PT86400S", "P90YT0.198S");
        java.util.Locale locale34 = java.util.Locale.GERMAN;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleAttributes();
        java.lang.String str39 = nameProvider0.getName(locale35, "secondOfMinute", "");
        java.lang.String str40 = locale35.getScript();
        java.lang.String str41 = locale35.getDisplayLanguage();
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "59" + "'", str26, "59");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "de");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "de");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "de");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "de");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "German" + "'", str41, "German");
    }

    @Test
    public void test17158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17158");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime9 = localTime7.plusMillis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.eras();
        boolean boolean11 = localTime7.isSupported(durationFieldType10);
        boolean boolean12 = mutablePeriod3.isSupported(durationFieldType10);
        org.joda.time.Period period13 = mutablePeriod3.toPeriod();
        int[] intArray14 = mutablePeriod3.getValues();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        int int17 = dateTime16.getSecondOfMinute();
        boolean boolean18 = dateTime16.isEqualNow();
        int int19 = dateTime16.getDayOfYear();
        org.joda.time.LocalTime localTime20 = dateTime16.toLocalTime();
        org.joda.time.DateTime dateTime22 = dateTime16.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTime dateTime24 = dateTime16.minusHours(46);
        org.joda.time.DateTime.Property property25 = dateTime24.minuteOfDay();
        org.joda.time.DateTime dateTime27 = dateTime24.withMillis((-61851600000000L));
        org.joda.time.Duration duration28 = mutablePeriod3.toDurationFrom((org.joda.time.ReadableInstant) dateTime24);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 0, 0]");
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 34 + "'", int17 == 34);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(duration28);
    }

    @Test
    public void test17159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17159");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField8 = localDateTime6.getField((int) (byte) 0);
        long long10 = dateTimeField8.roundHalfEven((long) 1);
        int int11 = dateTime1.get(dateTimeField8);
        boolean boolean12 = dateTime1.isBeforeNow();
        org.joda.time.DateTime.Property property13 = dateTime1.weekOfWeekyear();
        int int14 = dateTime1.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime1.weekyear();
        org.joda.time.DateTime dateTime17 = dateTime1.minusHours(10);
        org.joda.time.DateTime dateTime19 = dateTime1.plusMonths(46);
        org.joda.time.DateTime dateTime21 = dateTime19.withYearOfEra(897);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) 100, 1L, periodType26);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) 100, 1L, periodType30);
        org.joda.time.Period period32 = period27.plus((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Instant instant33 = new org.joda.time.Instant();
        org.joda.time.Instant instant35 = instant33.withMillis(0L);
        org.joda.time.Duration duration36 = period31.toDurationTo((org.joda.time.ReadableInstant) instant35);
        mutableDateTime23.add((org.joda.time.ReadableDuration) duration36, 39);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime23.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime23.setZone(dateTimeZone40);
        int int42 = mutableDateTime23.getYearOfEra();
        mutableDateTime23.addMonths(41);
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime23.toMutableDateTimeISO();
        mutableDateTime23.addHours(4);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period((long) 100, 1L, periodType52);
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((long) 100, 1L, periodType56);
        org.joda.time.Period period58 = period53.plus((org.joda.time.ReadablePeriod) period57);
        org.joda.time.Instant instant59 = new org.joda.time.Instant();
        org.joda.time.Instant instant61 = instant59.withMillis(0L);
        org.joda.time.Duration duration62 = period57.toDurationTo((org.joda.time.ReadableInstant) instant61);
        mutableDateTime49.add((org.joda.time.ReadableDuration) duration62, 39);
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime49.secondOfMinute();
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime49.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime68 = property66.addWrapField(6);
        mutableDateTime23.setDate((org.joda.time.ReadableInstant) mutableDateTime68);
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime23.dayOfMonth();
        org.joda.time.Chronology chronology72 = null;
        java.util.Locale locale73 = java.util.Locale.GERMAN;
        java.util.Locale locale74 = java.util.Locale.CANADA;
        java.lang.String str75 = locale73.getDisplayVariant(locale74);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket76 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology72, locale74);
        org.joda.time.DateTimeZone dateTimeZone77 = dateTimeParserBucket76.getZone();
        org.joda.time.LocalDateTime localDateTime78 = org.joda.time.LocalDateTime.now(dateTimeZone77);
        org.joda.time.MutableDateTime mutableDateTime79 = org.joda.time.MutableDateTime.now(dateTimeZone77);
        org.joda.time.MutableDateTime mutableDateTime80 = mutableDateTime23.toMutableDateTime(dateTimeZone77);
        org.joda.time.MutableDateTime mutableDateTime81 = dateTime21.toMutableDateTime(dateTimeZone77);
        java.lang.String str83 = dateTimeZone77.getNameKey((long) (byte) 0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1969 + "'", int42 == 1969);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(instant61);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(mutableDateTime68);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "de");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(dateTimeZone77);
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertNotNull(mutableDateTime79);
        org.junit.Assert.assertNotNull(mutableDateTime80);
        org.junit.Assert.assertNotNull(mutableDateTime81);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "UTC" + "'", str83, "UTC");
    }

    @Test
    public void test17160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17160");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        int int4 = dateTime3.getSecondOfMinute();
        boolean boolean5 = dateTime3.isEqualNow();
        int int6 = dateTime3.getDayOfYear();
        org.joda.time.Chronology chronology7 = dateTime3.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.year();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(chronology7);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now(chronology7);
        org.joda.time.DateTimeField dateTimeField13 = chronology7.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone14 = chronology7.getZone();
        org.joda.time.DurationField durationField15 = chronology7.days();
        long long16 = durationField15.getUnitMillis();
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 34 + "'", int4 == 34);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 86400000L + "'", long16 == 86400000L);
    }

    @Test
    public void test17161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17161");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 21);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        int int4 = dateTime3.getSecondOfMinute();
        org.joda.time.DateTime dateTime7 = dateTime3.withDurationAdded((long) 6, 12);
        boolean boolean8 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.DateTime.Property property9 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime11 = property9.addWrapFieldToCopy(39441072);
        org.joda.time.DateTime dateTime12 = dateTime11.withTimeAtStartOfDay();
        java.lang.String str14 = dateTime12.toString("54146356");
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 34 + "'", int4 == 34);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "54146356" + "'", str14, "54146356");
    }

    @Test
    public void test17162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17162");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(53960273);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        int int6 = dateTime5.getSecondOfMinute();
        boolean boolean7 = dateTime5.isEqualNow();
        int int8 = dateTime5.getDayOfYear();
        org.joda.time.Chronology chronology9 = dateTime5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology9.getZone();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.util.Locale locale16 = java.util.Locale.CANADA;
        java.lang.String str17 = locale15.getDisplayVariant(locale16);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale16);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeParserBucket18.getZone();
        long long21 = dateTimeZone12.getMillisKeepLocal(dateTimeZone19, (long) 56);
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone19, (long) 53833716);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 56L + "'", long21 == 56L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 107793989L + "'", long23 == 107793989L);
    }

    @Test
    public void test17163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17163");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getSecondOfMinute();
        int int3 = dateTime1.getYearOfEra();
        org.joda.time.LocalTime localTime4 = dateTime1.toLocalTime();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime1.plus(readableDuration5);
        org.joda.time.DateTime.Property property7 = dateTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime localTime11 = localTime9.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime13 = localTime11.plusMillis((int) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) 100, 1L, periodType18);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) 100, 1L, periodType22);
        org.joda.time.Period period24 = period19.plus((org.joda.time.ReadablePeriod) period23);
        org.joda.time.Instant instant25 = new org.joda.time.Instant();
        org.joda.time.Instant instant27 = instant25.withMillis(0L);
        org.joda.time.Duration duration28 = period23.toDurationTo((org.joda.time.ReadableInstant) instant27);
        mutableDateTime15.add((org.joda.time.ReadableDuration) duration28, 39);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime15.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime15.setZone(dateTimeZone32);
        int int34 = mutableDateTime15.getYearOfEra();
        int int35 = mutableDateTime15.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime15.year();
        org.joda.time.MutableDateTime mutableDateTime37 = property36.roundHalfEven();
        org.joda.time.DateTime dateTime38 = localTime13.toDateTime((org.joda.time.ReadableInstant) mutableDateTime37);
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (short) 1, chronology42);
        org.joda.time.DateTime dateTime44 = dateTime43.toDateTime();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (short) 1, chronology46);
        org.joda.time.DateTime dateTime48 = dateTime47.toDateTime();
        int int49 = dateTime44.compareTo((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Duration duration51 = org.joda.time.Duration.standardSeconds(10L);
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime47, (org.joda.time.ReadableDuration) duration51);
        org.joda.time.Duration duration54 = duration40.withDurationAdded((org.joda.time.ReadableDuration) duration51, 10);
        long long55 = duration54.getMillis();
        org.joda.time.Duration duration57 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period58 = duration57.toPeriod();
        org.joda.time.Duration duration61 = duration57.withDurationAdded((long) 38, (int) 'a');
        int int62 = duration54.compareTo((org.joda.time.ReadableDuration) duration61);
        org.joda.time.PeriodType periodType63 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.PeriodType periodType64 = periodType63.withSecondsRemoved();
        org.joda.time.Period period65 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime37, (org.joda.time.ReadableDuration) duration54, periodType64);
        int int66 = mutableDateTime37.getRoundingMode();
        mutableDateTime37.setMillisOfDay(163);
        boolean boolean69 = dateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime37);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1969 + "'", int34 == 1969);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 59 + "'", int35 == 59);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 86500000L + "'", long55 == 86500000L);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test17164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17164");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getSecondOfMinute();
        boolean boolean3 = dateTime1.isEqualNow();
        int int4 = dateTime1.getDayOfYear();
        org.joda.time.Chronology chronology5 = dateTime1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime1.toMutableDateTime();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardDays(7200128L);
        mutableDateTime6.add((org.joda.time.ReadableDuration) duration8);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(duration8);
    }

    @Test
    public void test17165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17165");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("54");
        org.joda.time.LocalDate.Property property2 = localDate1.year();
        org.joda.time.LocalDate localDate4 = property2.addWrapFieldToCopy(457071);
        org.joda.time.LocalDate localDate5 = property2.withMaximumValue();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test17166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17166");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getSecondOfMinute();
        int int3 = dateTime1.getYearOfEra();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) 10, 100, (int) 'a', 21);
        java.lang.String str9 = mutablePeriod8.toString();
        org.joda.time.DateTime dateTime10 = dateTime1.plus((org.joda.time.ReadablePeriod) mutablePeriod8);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 100, 1L, periodType15);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 100, 1L, periodType19);
        org.joda.time.Period period21 = period16.plus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Instant instant22 = new org.joda.time.Instant();
        org.joda.time.Instant instant24 = instant22.withMillis(0L);
        org.joda.time.Duration duration25 = period20.toDurationTo((org.joda.time.ReadableInstant) instant24);
        mutableDateTime12.add((org.joda.time.ReadableDuration) duration25, 39);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime12.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime12.setZone(dateTimeZone29);
        int int31 = mutableDateTime12.getYearOfEra();
        int int32 = mutableDateTime12.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime12.year();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate36 = localDate34.minusMonths((int) ' ');
        org.joda.time.Chronology chronology37 = localDate34.getChronology();
        mutableDateTime12.setChronology(chronology37);
        boolean boolean39 = dateTime1.isBefore((org.joda.time.ReadableInstant) mutableDateTime12);
        int int40 = dateTime1.getEra();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate43 = localDate41.plusMonths(43);
        int int44 = localDate41.getYear();
        org.joda.time.DateTime dateTime45 = dateTime1.withFields((org.joda.time.ReadablePartial) localDate41);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) 31);
        org.joda.time.DateTime dateTime48 = localDate47.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period(readableDuration49, readableInstant50);
        int int52 = period51.getMinutes();
        org.joda.time.Period period54 = period51.plusSeconds(39221019);
        org.joda.time.DateTime dateTime55 = dateTime48.plus((org.joda.time.ReadablePeriod) period54);
        org.joda.time.DateTime dateTime56 = localDate41.toDateTime((org.joda.time.ReadableInstant) dateTime48);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate58 = localDate41.withDayOfYear(21784000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 21784000 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT10H100M97.021S" + "'", str9, "PT10H100M97.021S");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1969 + "'", int31 == 1969);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 59 + "'", int32 == 59);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2022 + "'", int44 == 2022);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime56);
    }

    @Test
    public void test17167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17167");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getSecondOfMinute();
        boolean boolean3 = dateTime1.isEqualNow();
        int int4 = dateTime1.getDayOfYear();
        org.joda.time.Chronology chronology5 = dateTime1.getChronology();
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardSeconds(10L);
        org.joda.time.DateTime dateTime8 = dateTime1.plus((org.joda.time.ReadableDuration) duration7);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime10.add((org.joda.time.ReadableDuration) duration12, (int) (short) 100);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        int int17 = dateTime16.getYearOfCentury();
        org.joda.time.Interval interval18 = duration12.toIntervalTo((org.joda.time.ReadableInstant) dateTime16);
        int int19 = duration7.compareTo((org.joda.time.ReadableDuration) duration12);
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period22 = duration21.toPeriod();
        org.joda.time.Period period23 = duration21.toPeriod();
        int int24 = duration7.compareTo((org.joda.time.ReadableDuration) duration21);
        org.joda.time.Period period25 = duration7.toPeriod();
        org.joda.time.Period period27 = period25.minusHours(6748930);
        java.lang.String str28 = period25.toString();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PT10S" + "'", str28, "PT10S");
    }

    @Test
    public void test17168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17168");
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) '4');
        mutableDateTime3.addWeeks((int) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime7.add((org.joda.time.ReadableDuration) duration9, (int) (short) 100);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(readableInstant12, readableInstant13, periodType14);
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime3, (org.joda.time.ReadableInstant) mutableDateTime7, periodType14);
        java.lang.Object obj17 = null;
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableDuration18, readableInstant19);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) 100, 1L, periodType23);
        org.joda.time.Period period26 = period24.minusSeconds((-1));
        java.lang.String str27 = period24.toString();
        org.joda.time.Period period28 = period24.toPeriod();
        org.joda.time.PeriodType periodType29 = period24.getPeriodType();
        org.joda.time.Period period30 = period20.normalizedStandard(periodType29);
        org.joda.time.Period period31 = new org.joda.time.Period(obj17, periodType29);
        org.joda.time.Period period32 = period16.withPeriodType(periodType29);
        org.joda.time.Instant instant34 = new org.joda.time.Instant();
        org.joda.time.Instant instant36 = instant34.withMillis(0L);
        org.joda.time.Chronology chronology37 = instant36.getChronology();
        org.joda.time.DurationField durationField38 = chronology37.eras();
        java.util.Locale locale39 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology37, locale39, (java.lang.Integer) 39221019);
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale44 = java.util.Locale.GERMAN;
        java.util.Locale locale45 = java.util.Locale.CANADA;
        java.lang.String str46 = locale44.getDisplayVariant(locale45);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology43, locale45);
        org.joda.time.DateTimeZone dateTimeZone48 = dateTimeParserBucket47.getZone();
        org.joda.time.Chronology chronology49 = chronology37.withZone(dateTimeZone48);
        org.joda.time.DateTimeField dateTimeField50 = chronology49.hourOfDay();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(20199L, (long) 69, periodType29, chronology49);
        org.joda.time.DateTimeField dateTimeField52 = chronology49.weekyear();
        long long54 = dateTimeField52.roundHalfEven((long) 39801542);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PT0.099S" + "'", str27, "PT0.099S");
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "de");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-259200000L) + "'", long54 == (-259200000L));
    }

    @Test
    public void test17169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17169");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getSecondOfMinute();
        int int3 = dateTime1.getYearOfEra();
        org.joda.time.LocalTime localTime4 = dateTime1.toLocalTime();
        org.joda.time.LocalTime.Property property5 = localTime4.millisOfSecond();
        org.joda.time.LocalTime localTime6 = property5.roundFloorCopy();
        org.joda.time.LocalTime localTime8 = localTime6.minusMinutes(38);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType10 = dateTimeFieldType9.getRangeDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        int int15 = dateTime14.getSecondOfMinute();
        boolean boolean16 = dateTime14.isEqualNow();
        int int17 = dateTime14.getDayOfYear();
        org.joda.time.Chronology chronology18 = dateTime14.getChronology();
        java.util.Locale locale19 = java.util.Locale.SIMPLIFIED_CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(315532800097L, chronology18, locale19);
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType11.getField(chronology18);
        org.joda.time.DurationField durationField22 = durationFieldType10.getField(chronology18);
        boolean boolean23 = localTime6.isSupported(durationFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test17170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17170");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter3.getParser();
        java.lang.Integer int5 = dateTimeFormatter3.getPivotYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter3.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter3.getZone();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) 100, 1L, periodType12);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) 100, 1L, periodType16);
        org.joda.time.Period period18 = period13.plus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Instant instant19 = new org.joda.time.Instant();
        org.joda.time.Instant instant21 = instant19.withMillis(0L);
        org.joda.time.Duration duration22 = period17.toDurationTo((org.joda.time.ReadableInstant) instant21);
        mutableDateTime9.add((org.joda.time.ReadableDuration) duration22, 39);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime9.secondOfMinute();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime9.minuteOfHour();
        java.lang.String str27 = property26.getAsShortText();
        java.util.Locale locale28 = java.util.Locale.GERMAN;
        java.util.Locale locale29 = locale28.stripExtensions();
        int int30 = property26.getMaximumTextLength(locale29);
        java.lang.String str31 = locale29.getDisplayLanguage();
        java.lang.String str32 = locale29.getCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter3.withLocale(locale29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter33.withDefaultYear(41);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.parse("54152329", dateTimeFormatter35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "59" + "'", str27, "59");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "de");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "de");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "German" + "'", str31, "German");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
    }

    @Test
    public void test17171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17171");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(920);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test17172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17172");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis(1645455600000L);
        org.joda.time.Minutes minutes2 = duration1.toStandardMinutes();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period5 = duration4.toPeriod();
        org.joda.time.Duration duration8 = duration4.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime10.add((org.joda.time.ReadableDuration) duration12, (int) (short) 100);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        int int17 = dateTime16.getYearOfCentury();
        org.joda.time.Interval interval18 = duration12.toIntervalTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.Duration duration19 = duration8.minus((org.joda.time.ReadableDuration) duration12);
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period22 = duration21.toPeriod();
        org.joda.time.Duration duration24 = duration8.withDurationAdded((org.joda.time.ReadableDuration) duration21, 54);
        org.joda.time.Duration duration25 = duration1.minus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Duration duration27 = duration25.minus(93294675L);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration27);
    }

    @Test
    public void test17173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17173");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str7 = dateTimeFieldType6.getName();
        int int8 = localDateTime0.indexOf(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime0.minusSeconds((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str14 = dateTimeFieldType13.getName();
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.property(dateTimeFieldType13);
        int int16 = localDateTime12.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withMillisOfDay(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = localDateTime18.toString(dateTimeFormatter19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.plusMonths(53600069);
        org.joda.time.LocalDateTime.Property property23 = localDateTime18.dayOfWeek();
        org.joda.time.LocalDateTime.Property property24 = localDateTime18.dayOfMonth();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "clockhourOfDay" + "'", str7, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "dayOfMonth" + "'", str14, "dayOfMonth");
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2022-02-21T00:00:00.001" + "'", str20, "2022-02-21T00:00:00.001");
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test17174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17174");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022-02-21T15:00:44.199Z");
        org.joda.time.Duration duration4 = new org.joda.time.Duration(59997L, (-7391L));
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration4, 493);
        boolean boolean8 = mutableDateTime1.isAfter(227201683071677754L);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test17175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17175");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 58);
    }

    @Test
    public void test17176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17176");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime1.minuteOfHour();
        mutableDateTime1.setWeekyear(0);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(0L, dateTimeZone22);
        long long26 = dateTimeZone22.convertLocalToUTC((long) 3, true);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone22);
        java.lang.String str28 = dateTimeZone22.toString();
        mutableDateTime1.setZone(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) 100, 1L, periodType34);
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((long) 100, 1L, periodType38);
        org.joda.time.Period period40 = period35.plus((org.joda.time.ReadablePeriod) period39);
        org.joda.time.Instant instant41 = new org.joda.time.Instant();
        org.joda.time.Instant instant43 = instant41.withMillis(0L);
        org.joda.time.Duration duration44 = period39.toDurationTo((org.joda.time.ReadableInstant) instant43);
        mutableDateTime31.add((org.joda.time.ReadableDuration) duration44, 39);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime31.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime31.setZone(dateTimeZone48);
        int int50 = mutableDateTime31.getYearOfEra();
        mutableDateTime31.addMonths(41);
        org.joda.time.MutableDateTime mutableDateTime53 = mutableDateTime31.toMutableDateTimeISO();
        mutableDateTime31.addHours(4);
        mutableDateTime31.add((long) 2023);
        boolean boolean58 = mutableDateTime1.isEqual((org.joda.time.ReadableInstant) mutableDateTime31);
        mutableDateTime31.setMillisOfDay(964);
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod(259200000L, (long) 206);
        mutableDateTime31.add((org.joda.time.ReadablePeriod) mutablePeriod63, 53833716);
        boolean boolean66 = mutableDateTime31.isBeforeNow();
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3L + "'", long26 == 3L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(instant43);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1969 + "'", int50 == 1969);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test17177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17177");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(8L);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test17178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17178");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.lang.Integer int4 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        boolean boolean6 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withPivotYear(646);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((java.lang.Integer) 163);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear((java.lang.Integer) 39600000);
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test17179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17179");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(19249747200000L);
        java.lang.String str2 = mutableDateTime1.toString();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) 859);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.withMillis(0L);
        org.joda.time.Chronology chronology12 = instant11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.eras();
        java.util.Locale locale14 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology12, locale14, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = property20.getField();
        int int22 = property20.get();
        org.joda.time.LocalDateTime localDateTime23 = property20.roundHalfFloorCopy();
        long long25 = chronology12.set((org.joda.time.ReadablePartial) localDateTime23, (long) 2022);
        org.joda.time.DateTime dateTime26 = dateTime7.toDateTime(chronology12);
        org.joda.time.DateTime dateTime28 = dateTime7.plusDays(22);
        int int29 = dateTime7.getYearOfEra();
        org.joda.time.Duration duration31 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (short) 1, chronology33);
        org.joda.time.DateTime dateTime35 = dateTime34.toDateTime();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) 1, chronology37);
        org.joda.time.DateTime dateTime39 = dateTime38.toDateTime();
        int int40 = dateTime35.compareTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Duration duration42 = org.joda.time.Duration.standardSeconds(10L);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime38, (org.joda.time.ReadableDuration) duration42);
        org.joda.time.Duration duration45 = duration31.withDurationAdded((org.joda.time.ReadableDuration) duration42, 10);
        java.lang.String str46 = duration31.toString();
        org.joda.time.Period period47 = duration31.toPeriod();
        org.joda.time.Duration duration49 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period50 = duration49.toPeriod();
        org.joda.time.Duration duration53 = duration49.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration57 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime55.add((org.joda.time.ReadableDuration) duration57, (int) (short) 100);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime(chronology60);
        int int62 = dateTime61.getYearOfCentury();
        org.joda.time.Interval interval63 = duration57.toIntervalTo((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.Duration duration64 = duration53.minus((org.joda.time.ReadableDuration) duration57);
        org.joda.time.Hours hours65 = duration53.toStandardHours();
        boolean boolean66 = duration31.isEqual((org.joda.time.ReadableDuration) duration53);
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableDuration) duration31);
        org.joda.time.Duration duration68 = duration31.toDuration();
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime1, (org.joda.time.ReadableDuration) duration68);
        int int70 = mutablePeriod69.getWeeks();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2580-01-01T00:00:00.000Z" + "'", str2, "2580-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1645455600000L + "'", long25 == 1645455600000L);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "PT86400S" + "'", str46, "PT86400S");
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 22 + "'", int62 == 22);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertNotNull(hours65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test17180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17180");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("January");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'January' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17181");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, 1L, periodType2);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 100, 1L, periodType6);
        org.joda.time.Period period8 = period3.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.withMillis(0L);
        org.joda.time.Duration duration12 = period7.toDurationTo((org.joda.time.ReadableInstant) instant11);
        long long13 = instant11.getMillis();
        org.joda.time.Instant instant15 = instant11.minus((long) (byte) 1);
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardSeconds((long) 49);
        org.joda.time.Instant instant19 = instant15.withDurationAdded((org.joda.time.ReadableDuration) duration17, 16);
        org.joda.time.Chronology chronology20 = instant19.getChronology();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableDuration21, readableInstant22);
        org.joda.time.Period period25 = period23.withDays((int) (byte) 1);
        org.joda.time.Duration duration26 = period25.toStandardDuration();
        long long27 = duration26.getStandardHours();
        long long28 = duration26.getStandardDays();
        org.joda.time.Instant instant29 = instant19.plus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Instant instant32 = instant29.withDurationAdded((long) 51, 39326483);
        org.joda.time.Instant instant35 = instant29.withDurationAdded((long) 39537705, 413);
        org.joda.time.MutableDateTime mutableDateTime36 = instant29.toMutableDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime36.setMonthOfYear(825);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 825 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 24L + "'", long27 == 24L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertNotNull(mutableDateTime36);
    }

    @Test
    public void test17182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17182");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.lang.Integer int4 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        boolean boolean6 = dateTimeFormatter2.isParser();
        boolean boolean7 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter2.getParser();
        int int9 = dateTimeFormatter2.getDefaultYear();
        java.lang.Integer int10 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology12 = dateTimeFormatter2.getChronology();
        boolean boolean13 = dateTimeFormatter2.isPrinter();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(dateTimeParser11);
        org.junit.Assert.assertNull(chronology12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test17183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17183");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime1.minuteOfHour();
        java.lang.String str19 = property18.getAsShortText();
        java.lang.String str20 = property18.getAsString();
        org.joda.time.MutableDateTime mutableDateTime21 = property18.roundFloor();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime21, readableDuration22);
        mutableDateTime21.addMonths(53670254);
        org.joda.time.format.DateTimePrinter dateTimePrinter27 = null;
        org.joda.time.format.DateTimeParser dateTimeParser28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter27, dateTimeParser28);
        org.joda.time.format.DateTimeParser dateTimeParser30 = dateTimeFormatter29.getParser();
        java.lang.Integer int31 = dateTimeFormatter29.getPivotYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter32 = dateTimeFormatter29.getPrinter();
        boolean boolean33 = dateTimeFormatter29.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter29.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone35 = dateTimeFormatter34.getZone();
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(10L, dateTimeZone35);
        mutableDateTime21.setZoneRetainFields(dateTimeZone35);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime21.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField39 = property38.getField();
        org.joda.time.MutableDateTime mutableDateTime40 = property38.roundHalfEven();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration41 = new org.joda.time.Duration((java.lang.Object) property38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.MutableDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "59" + "'", str19, "59");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "59" + "'", str20, "59");
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNull(dateTimeParser30);
        org.junit.Assert.assertNull(int31);
        org.junit.Assert.assertNull(dateTimePrinter32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(mutableDateTime40);
    }

    @Test
    public void test17184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17184");
        org.joda.time.Period period1 = new org.joda.time.Period(0L);
        int int2 = period1.size();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.monthOfYear();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (short) 1, chronology6);
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) instant8, periodType9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int12 = instant8.get(dateTimeFieldType11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime3.withField(dateTimeFieldType11, 39);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusSeconds(52);
        int int17 = localDateTime16.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.plusWeeks(22);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableDuration20, readableInstant21);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) 100, 1L, periodType25);
        org.joda.time.Period period28 = period26.minusSeconds((-1));
        java.lang.String str29 = period26.toString();
        org.joda.time.Period period30 = period26.toPeriod();
        org.joda.time.PeriodType periodType31 = period26.getPeriodType();
        org.joda.time.Period period32 = period22.normalizedStandard(periodType31);
        org.joda.time.Period period34 = period32.withSeconds(10);
        int int35 = period32.size();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime16.plus((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Duration duration37 = period32.toStandardDuration();
        org.joda.time.Period period38 = period32.toPeriod();
        int int39 = period32.getMonths();
        org.joda.time.Period period40 = period1.minus((org.joda.time.ReadablePeriod) period32);
        int int41 = period32.getWeeks();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 903 + "'", int12 == 903);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PT0.099S" + "'", str29, "PT0.099S");
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 8 + "'", int35 == 8);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test17185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17185");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.lang.Integer int4 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        boolean boolean6 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withPivotYear(646);
        boolean boolean9 = dateTimeFormatter8.isParser();
        java.lang.Appendable appendable10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        long long14 = dateTimeZone11.adjustOffset(0L, true);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, dateTimeZone16);
        int int18 = dateTimeZone11.getOffset((org.joda.time.ReadableInstant) mutableDateTime17);
        mutableDateTime17.addMillis((int) '#');
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime17.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.minuteOfHour();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime17.centuryOfEra();
        mutableDateTime17.addMinutes(797);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(appendable10, (org.joda.time.ReadableInstant) mutableDateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test17186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17186");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean18 = mutableDateTime1.isSupported(dateTimeFieldType17);
        boolean boolean19 = mutableDateTime1.isBeforeNow();
        int int20 = mutableDateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) 100);
        org.joda.time.DateTime.Property property23 = dateTime22.monthOfYear();
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTimeISO();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime27 = dateTime22.withMillisOfDay(0);
        org.joda.time.DateTime dateTime29 = dateTime27.minusHours(53670254);
        org.joda.time.DateTime dateTime31 = dateTime29.minus(53838181L);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 86396 + "'", int20 == 86396);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
    }

    @Test
    public void test17187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17187");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        org.joda.time.Chronology chronology3 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = chronology3.minuteOfHour();
        org.joda.time.DurationField durationField6 = chronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.minuteOfDay();
        org.joda.time.DurationField durationField8 = chronology3.hours();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        int int13 = dateTime12.getSecondOfMinute();
        boolean boolean14 = dateTime12.isEqualNow();
        int int15 = dateTime12.getDayOfYear();
        org.joda.time.Chronology chronology16 = dateTime12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology16);
        org.joda.time.DurationField durationField18 = chronology16.hours();
        int int19 = durationField8.compareTo(durationField18);
        long long22 = durationField18.subtract((long) 86396191, (long) (short) 100);
        long long24 = durationField18.getMillis(116);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology27);
        int int29 = dateTime28.getSecondOfMinute();
        boolean boolean30 = dateTime28.isEqualNow();
        int int31 = dateTime28.getDayOfYear();
        org.joda.time.Chronology chronology32 = dateTime28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology32);
        org.joda.time.DateTimeField dateTimeField34 = chronology32.year();
        org.joda.time.DateTimeField dateTimeField35 = chronology32.dayOfMonth();
        org.joda.time.DurationField durationField36 = chronology32.halfdays();
        long long39 = durationField36.getMillis(0L, (long) 6);
        long long42 = durationField36.add((long) 26, 53600069);
        java.lang.String str43 = durationField36.toString();
        boolean boolean44 = durationField36.isSupported();
        int int45 = durationField18.compareTo(durationField36);
        boolean boolean46 = durationField36.isPrecise();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-273603809L) + "'", long22 == (-273603809L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 417600000L + "'", long24 == 417600000L);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 2315522980800026L + "'", long42 == 2315522980800026L);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "DurationField[halfdays]" + "'", str43, "DurationField[halfdays]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test17188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17188");
        org.joda.time.Period period2 = new org.joda.time.Period((-61820064000001L), (long) 53677371);
        org.joda.time.Period period4 = period2.minusHours(39321381);
        org.joda.time.Period period6 = period2.withMinutes(2712);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test17189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17189");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (short) 1, chronology6);
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) instant8, periodType9);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate13 = localDate11.minusMonths((int) ' ');
        org.joda.time.Chronology chronology14 = localDate11.getChronology();
        org.joda.time.Period period15 = new org.joda.time.Period((long) (byte) 1, periodType9, chronology14);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate18 = localDate16.minusMonths((int) ' ');
        org.joda.time.Chronology chronology19 = localDate16.getChronology();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate22 = localDate16.withFieldAdded(durationFieldType20, (int) (byte) 100);
        boolean boolean23 = periodType9.isSupported(durationFieldType20);
        org.joda.time.PeriodType periodType24 = periodType9.withDaysRemoved();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property26 = localDate25.dayOfMonth();
        org.joda.time.Chronology chronology27 = localDate25.getChronology();
        org.joda.time.Period period28 = new org.joda.time.Period((long) 43, periodType9, chronology27);
        org.joda.time.Duration duration30 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period31 = duration30.toPeriod();
        org.joda.time.Duration duration34 = duration30.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Instant instant38 = new org.joda.time.Instant();
        org.joda.time.Instant instant40 = instant38.withMillis(0L);
        org.joda.time.Chronology chronology41 = instant40.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.eras();
        java.util.Locale locale43 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology41, locale43, (java.lang.Integer) 39221019);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) 53, chronology41);
        org.joda.time.DateTimeField dateTimeField47 = chronology41.dayOfYear();
        org.joda.time.DateTimeField dateTimeField48 = chronology41.monthOfYear();
        org.joda.time.Period period49 = duration30.toPeriod(periodType35, chronology41);
        org.joda.time.Period period50 = new org.joda.time.Period((long) '#', periodType9, chronology41);
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate(chronology41);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(35L, chronology41);
        org.joda.time.DateTimeZone dateTimeZone53 = chronology41.getZone();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) 53670306, chronology41);
        mutablePeriod54.addSeconds(0);
        int int57 = mutablePeriod54.getHours();
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(instant40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 14 + "'", int57 == 14);
    }

    @Test
    public void test17190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17190");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean1 = instant0.isEqualNow();
        org.joda.time.Instant instant4 = instant0.withDurationAdded(12L, 457070);
        org.joda.time.Instant instant6 = instant0.withMillis((long) 964);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(instant6);
    }

    @Test
    public void test17191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17191");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean18 = mutableDateTime1.isSupported(dateTimeFieldType17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime1.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundFloor();
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.monthOfYear();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (short) 1, chronology24);
        org.joda.time.Instant instant26 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) instant26, periodType27);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int30 = instant26.get(dateTimeFieldType29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime21.withField(dateTimeFieldType29, 39);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minusSeconds(52);
        int int35 = localDateTime34.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.plusWeeks(22);
        org.joda.time.DateTime dateTime38 = localDateTime34.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((long) 100, 1L, periodType43);
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((long) 100, 1L, periodType47);
        org.joda.time.Period period49 = period44.plus((org.joda.time.ReadablePeriod) period48);
        org.joda.time.Instant instant50 = new org.joda.time.Instant();
        org.joda.time.Instant instant52 = instant50.withMillis(0L);
        org.joda.time.Duration duration53 = period48.toDurationTo((org.joda.time.ReadableInstant) instant52);
        mutableDateTime40.add((org.joda.time.ReadableDuration) duration53, 39);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime40.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime40.setZone(dateTimeZone57);
        org.joda.time.DateTime dateTime59 = dateTime38.withZone(dateTimeZone57);
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period((long) 100, 1L, periodType64);
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period((long) 100, 1L, periodType68);
        org.joda.time.Period period70 = period65.plus((org.joda.time.ReadablePeriod) period69);
        org.joda.time.Instant instant71 = new org.joda.time.Instant();
        org.joda.time.Instant instant73 = instant71.withMillis(0L);
        org.joda.time.Duration duration74 = period69.toDurationTo((org.joda.time.ReadableInstant) instant73);
        mutableDateTime61.add((org.joda.time.ReadableDuration) duration74, 39);
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime61.yearOfEra();
        mutableDateTime61.setDayOfYear((int) ' ');
        mutableDateTime61.add((long) 53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter82 = null;
        java.lang.String str83 = mutableDateTime61.toString(dateTimeFormatter82);
        org.joda.time.DateTimeZone dateTimeZone84 = org.joda.time.DateTimeZone.UTC;
        int int86 = dateTimeZone84.getStandardOffset((long) 894);
        mutableDateTime61.setZoneRetainFields(dateTimeZone84);
        org.joda.time.DateTime dateTime88 = dateTime38.withZoneRetainFields(dateTimeZone84);
        mutableDateTime20.setTime((org.joda.time.ReadableInstant) dateTime88);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 903 + "'", int30 == 903);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 22 + "'", int35 == 22);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(instant52);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(instant73);
        org.junit.Assert.assertNotNull(duration74);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "1969-02-01T23:59:56.244Z" + "'", str83, "1969-02-01T23:59:56.244Z");
        org.junit.Assert.assertNotNull(dateTimeZone84);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(dateTime88);
    }

    @Test
    public void test17192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17192");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2022-02-21T14:55:10.169");
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.Duration duration4 = org.joda.time.Duration.millis(1645455600000L);
        org.joda.time.Minutes minutes5 = duration4.toStandardMinutes();
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period8 = duration7.toPeriod();
        org.joda.time.Duration duration11 = duration7.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime13.add((org.joda.time.ReadableDuration) duration15, (int) (short) 100);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        int int20 = dateTime19.getYearOfCentury();
        org.joda.time.Interval interval21 = duration15.toIntervalTo((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Duration duration22 = duration11.minus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period25 = duration24.toPeriod();
        org.joda.time.Duration duration27 = duration11.withDurationAdded((org.joda.time.ReadableDuration) duration24, 54);
        org.joda.time.Duration duration28 = duration4.minus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Duration duration29 = duration4.toDuration();
        org.joda.time.Duration duration32 = duration4.withDurationAdded(24L, 2019);
        org.joda.time.Instant instant33 = instant1.plus((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Instant instant35 = instant33.plus(20201L);
        org.joda.time.Instant instant37 = instant33.minus((long) 2760);
        org.joda.time.Chronology chronology38 = instant33.getChronology();
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 22 + "'", int20 == 22);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertNotNull(chronology38);
    }
}
