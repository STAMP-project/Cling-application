import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest33 {

    public static boolean debug = false;

    @Test
    public void test16501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16501");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) ' ', chronology1);
        mutablePeriod2.addMinutes(19);
        org.joda.time.MutablePeriod mutablePeriod5 = mutablePeriod2.copy();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType9 = dateTimeFieldType8.getRangeDurationType();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period20 = org.joda.time.Period.days((-1));
        org.joda.time.Period period22 = period20.withWeeks((int) 'a');
        java.lang.String str23 = period20.toString();
        mutablePeriod18.setPeriod((org.joda.time.ReadablePeriod) period20);
        mutablePeriod18.addMonths((int) (short) -1);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.Chronology chronology36 = interval35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 1, periodType31, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) '4', chronology36);
        org.joda.time.ReadablePartial readablePartial39 = null;
        org.joda.time.DateTime dateTime40 = dateTime38.withFields(readablePartial39);
        org.joda.time.DateTime.Property property41 = dateTime40.millisOfDay();
        org.joda.time.DateTime dateTime42 = dateTime40.withEarlierOffsetAtOverlap();
        int int43 = dateTime40.getDayOfWeek();
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 1, periodType45, chronology50);
        org.joda.time.DateTimeField dateTimeField52 = chronology50.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone53 = chronology50.getZone();
        org.joda.time.DateTime dateTime54 = dateTime40.withChronology(chronology50);
        org.joda.time.Minutes minutes56 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType57 = null;
        int int58 = minutes56.get(durationFieldType57);
        int int60 = minutes56.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod61 = minutes56.toMutablePeriod();
        long long64 = chronology50.add((org.joda.time.ReadablePeriod) mutablePeriod61, (long) '#', (int) (short) 10);
        mutablePeriod18.setPeriod((long) (short) 100, (long) 2, chronology50);
        org.joda.time.DurationField durationField66 = durationFieldType9.getField(chronology50);
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod(2726489113199990L, chronology50);
        org.joda.time.DateTimeField dateTimeField68 = chronology50.clockhourOfHalfday();
        mutablePeriod2.setPeriod(6218697936780800L, chronology50);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "P-1D" + "'", str23, "P-1D");
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime42);
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(minutes56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertNotNull(mutablePeriod61);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 6000035L + "'", long64 == 6000035L);
        org.junit.Assert.assertNotNull(durationField66);
        org.junit.Assert.assertNotNull(dateTimeField68);
    }

    @Test
    public void test16502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16502");
        org.joda.time.Period period0 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType1 = period0.getPeriodType();
        org.joda.time.Period period3 = period0.withMonths((int) (byte) 0);
        org.joda.time.Period period5 = period0.plusMonths((int) (byte) 10);
        org.joda.time.Period period7 = period5.minusMillis(100);
        org.joda.time.Period period9 = period7.plusHours(57449179);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test16503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16503");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        int int7 = property6.getMinimumValue();
        java.lang.String str8 = property6.getName();
        org.joda.time.DateTime dateTime9 = property6.getDateTime();
        org.joda.time.DateTime dateTime10 = property6.roundFloorCopy();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval(readableInstant11, readableDuration12);
        boolean boolean14 = mutableInterval13.isAfterNow();
        org.joda.time.DateTime dateTime15 = mutableInterval13.getStart();
        org.joda.time.Period period16 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType17 = period16.getPeriodType();
        int int18 = period16.getMillis();
        org.joda.time.Duration duration19 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration20 = duration19.toDuration();
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        org.joda.time.DateTimeZone dateTimeZone26 = chronology25.getZone();
        org.joda.time.Period period27 = duration19.toPeriod(chronology25);
        org.joda.time.DateTimeField dateTimeField28 = chronology25.clockhourOfDay();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((java.lang.Object) period16, chronology25);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime15.toMutableDateTime(chronology25);
        long long31 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime30);
        java.util.Locale locale32 = null;
        int int33 = property6.getMaximumShortTextLength(locale32);
        java.util.Locale locale34 = null;
        int int35 = property6.getMaximumTextLength(locale34);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "dayOfYear" + "'", str8, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-19044L) + "'", long31 == (-19044L));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
    }

    @Test
    public void test16504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16504");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 16);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType4 = periodType3.withMonthsRemoved();
        org.joda.time.Minutes minutes6 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType7 = null;
        int int8 = minutes6.get(durationFieldType7);
        int int10 = minutes6.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod11 = minutes6.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType13 = minutes6.getFieldType(0);
        boolean boolean14 = periodType4.equals((java.lang.Object) minutes6);
        org.joda.time.MutablePeriod mutablePeriod15 = minutes6.toMutablePeriod();
        org.joda.time.Duration duration16 = minutes6.toStandardDuration();
        org.joda.time.Instant instant17 = instant1.plus((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Duration duration19 = duration16.minus((long) 365);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(mutablePeriod15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(duration19);
    }

    @Test
    public void test16505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16505");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(1645455242640L, dateTimeZone1);
    }

    @Test
    public void test16506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16506");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType2 = null;
        int int3 = minutes1.get(durationFieldType2);
        java.lang.Object obj4 = null;
        boolean boolean5 = minutes1.equals(obj4);
        org.joda.time.DurationFieldType durationFieldType6 = minutes1.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone8);
        int int10 = dateTime9.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime9.getZone();
        org.joda.time.DateTime.Property property12 = dateTime9.weekyear();
        java.lang.String str13 = dateTime9.toString();
        org.joda.time.DateTime dateTime15 = dateTime9.minusWeeks(8);
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) minutes1, (org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime17 = dateTime15.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone19);
        int int21 = dateTime20.getSecondOfMinute();
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(periodType22);
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadablePeriod) mutablePeriod23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.Duration duration26 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 1, periodType29, chronology34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) '4', chronology34);
        org.joda.time.ReadablePartial readablePartial37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.withFields(readablePartial37);
        org.joda.time.DateTime.Property property39 = dateTime38.millisOfDay();
        org.joda.time.DateTime dateTime40 = dateTime38.withEarlierOffsetAtOverlap();
        int int41 = dateTime38.getDayOfWeek();
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        org.joda.time.Chronology chronology48 = interval47.getChronology();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) 1, periodType43, chronology48);
        org.joda.time.DateTimeField dateTimeField50 = chronology48.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone51 = chronology48.getZone();
        org.joda.time.DateTime dateTime52 = dateTime38.withChronology(chronology48);
        org.joda.time.Interval interval53 = duration26.toIntervalTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period56 = duration26.toPeriodFrom((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadablePeriod) period56);
        org.joda.time.Period period59 = period56.withDays(19);
        org.joda.time.Duration duration60 = period56.toStandardDuration();
        org.joda.time.DateTime dateTime61 = dateTime20.minus((org.joda.time.ReadableDuration) duration60);
        org.joda.time.DateTime dateTime63 = dateTime61.plusSeconds(25);
        boolean boolean64 = dateTime17.isAfter((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.DateTime dateTime66 = dateTime17.withWeekyear(99);
        java.lang.String str67 = dateTime17.toString();
        org.joda.time.DateTime.Property property68 = dateTime17.centuryOfEra();
        int int69 = dateTime17.getEra();
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationFieldType6);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-05T01:00:00.010+97:00" + "'", str13, "1970-01-05T01:00:00.010+97:00");
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTime40);
// flaky:         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(dateTime66);
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "1969-11-10T00:00:00.000+97:00" + "'", str67, "1969-11-10T00:00:00.000+97:00");
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
    }

    @Test
    public void test16507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16507");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval17 = mutableInterval16.toInterval();
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 1, periodType13, chronology18);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) '4', chronology18);
        org.joda.time.ReadablePartial readablePartial21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.withFields(readablePartial21);
        boolean boolean23 = instant10.isAfter((org.joda.time.ReadableInstant) dateTime20);
        boolean boolean24 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime20);
        java.lang.String str25 = dateTime9.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType27 = dateTimeFieldType26.getRangeDurationType();
        int int28 = dateTime9.get(dateTimeFieldType26);
        org.joda.time.DateTime.Property property29 = dateTime9.weekyear();
        org.joda.time.DateTime dateTime30 = property29.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-05T01:00:00.052+97:00" + "'", str25, "1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(durationFieldType27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test16508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16508");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval9);
        long long13 = mutableInterval9.getEndMillis();
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean24 = mutableInterval19.isBefore((org.joda.time.ReadableInterval) mutableInterval23);
        boolean boolean25 = mutableInterval16.contains((org.joda.time.ReadableInterval) mutableInterval23);
        mutableInterval9.setInterval((org.joda.time.ReadableInterval) mutableInterval23);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 1, periodType29, chronology34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) '4', chronology34);
        org.joda.time.ReadablePartial readablePartial37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.withFields(readablePartial37);
        org.joda.time.DateTime.Property property39 = dateTime38.millisOfDay();
        boolean boolean40 = mutableInterval9.isBefore((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTime dateTime42 = dateTime38.minusWeeks(893);
        long long43 = dateTime42.getMillis();
        org.joda.time.DateTime.Property property44 = dateTime42.yearOfCentury();
        org.joda.time.DateTime dateTime45 = property44.withMinimumValue();
        org.joda.time.DateTime dateTime46 = property44.withMaximumValue();
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-540086399948L) + "'", long43 == (-540086399948L));
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime46);
    }

    @Test
    public void test16509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16509");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        long long5 = interval3.toDurationMillis();
        org.joda.time.Interval interval7 = interval3.withEndMillis((long) (short) 100);
        org.joda.time.Weeks weeks8 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval3);
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval12 = mutableInterval11.toInterval();
        org.joda.time.Chronology chronology13 = interval12.getChronology();
        long long14 = interval12.toDurationMillis();
        org.joda.time.Interval interval16 = interval12.withEndMillis((long) (short) 100);
        long long17 = interval12.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean28 = mutableInterval23.isBefore((org.joda.time.ReadableInterval) mutableInterval27);
        boolean boolean29 = mutableInterval20.contains((org.joda.time.ReadableInterval) mutableInterval27);
        org.joda.time.Weeks weeks30 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval27);
        org.joda.time.ReadableDuration readableDuration31 = null;
        mutableInterval27.setDurationBeforeEnd(readableDuration31);
        org.joda.time.Interval interval33 = interval12.gap((org.joda.time.ReadableInterval) mutableInterval27);
        long long34 = mutableInterval27.getStartMillis();
        org.joda.time.MutableInterval mutableInterval35 = mutableInterval27.copy();
        boolean boolean36 = interval3.isBefore((org.joda.time.ReadableInterval) mutableInterval35);
        org.joda.time.Instant instant37 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval44 = mutableInterval43.toInterval();
        org.joda.time.Chronology chronology45 = interval44.getChronology();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) 1, periodType40, chronology45);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) '4', chronology45);
        org.joda.time.ReadablePartial readablePartial48 = null;
        org.joda.time.DateTime dateTime49 = dateTime47.withFields(readablePartial48);
        boolean boolean50 = instant37.isAfter((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime.Property property51 = dateTime47.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone53);
        int int55 = dateTime54.getDayOfMonth();
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval61 = mutableInterval60.toInterval();
        org.joda.time.Chronology chronology62 = interval61.getChronology();
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((long) 1, periodType57, chronology62);
        org.joda.time.DateTimeField dateTimeField64 = chronology62.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone65 = chronology62.getZone();
        org.joda.time.DateTime dateTime66 = dateTime54.withZoneRetainFields(dateTimeZone65);
        org.joda.time.DateTime dateTime67 = dateTime47.withZone(dateTimeZone65);
        int int68 = dateTime47.getSecondOfDay();
        org.joda.time.Interval interval69 = interval3.withStart((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Instant instant72 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration73 = null;
        org.joda.time.Instant instant75 = instant72.withDurationAdded(readableDuration73, 10);
        org.joda.time.Chronology chronology76 = instant75.getChronology();
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((long) 893, 191400000L, chronology76);
        org.joda.time.Interval interval78 = interval3.withChronology(chronology76);
        org.joda.time.Interval interval79 = interval3.toInterval();
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 53L + "'", long5 == 53L);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 53L + "'", long14 == 53L);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 53L + "'", long17 == 53L);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertNull(interval33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 52L + "'", long34 == 52L);
        org.junit.Assert.assertNotNull(mutableInterval35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(property51);
// flaky:         org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5 + "'", int55 == 5);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTime67);
// flaky:         org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3600 + "'", int68 == 3600);
        org.junit.Assert.assertNotNull(interval69);
        org.junit.Assert.assertNotNull(instant72);
        org.junit.Assert.assertNotNull(instant75);
        org.junit.Assert.assertNotNull(chronology76);
        org.junit.Assert.assertNotNull(interval78);
        org.junit.Assert.assertNotNull(interval79);
    }

    @Test
    public void test16510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16510");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("P11687D");
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test16511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16511");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("T15:59:11.671");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"T15:59:11.671\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16512");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        mutablePeriod8.addMonths((int) (short) -1);
        org.joda.time.Period period18 = org.joda.time.Period.days((-1));
        org.joda.time.Period period20 = period18.withWeeks((int) 'a');
        org.joda.time.Period period22 = period18.plusMonths((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType23 = null;
        boolean boolean24 = period22.isSupported(durationFieldType23);
        mutablePeriod8.add((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Period period27 = period22.withMonths(1);
        org.joda.time.Minutes minutes28 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes30 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType31 = null;
        int int32 = minutes30.get(durationFieldType31);
        org.joda.time.DurationFieldType durationFieldType33 = minutes30.getFieldType();
        boolean boolean34 = minutes28.isGreaterThan(minutes30);
        org.joda.time.Minutes minutes36 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType37 = null;
        int int38 = minutes36.get(durationFieldType37);
        org.joda.time.DurationFieldType durationFieldType39 = minutes36.getFieldType();
        boolean boolean40 = minutes28.isLessThan(minutes36);
        org.joda.time.Minutes minutes42 = minutes28.multipliedBy(0);
        org.joda.time.Minutes minutes44 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType45 = null;
        int int46 = minutes44.get(durationFieldType45);
        int int48 = minutes44.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod49 = minutes44.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType51 = minutes44.getFieldType(0);
        org.joda.time.Duration duration52 = minutes44.toStandardDuration();
        org.joda.time.Minutes minutes54 = minutes44.multipliedBy(3);
        boolean boolean55 = minutes42.isLessThan(minutes44);
        org.joda.time.Period period56 = period22.plus((org.joda.time.ReadablePeriod) minutes44);
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Period period58 = period22.withPeriodType(periodType57);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P-1D" + "'", str13, "P-1D");
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(durationFieldType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertNotNull(minutes44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertNotNull(mutablePeriod49);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(minutes54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period58);
    }

    @Test
    public void test16513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16513");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getMonthOfYear();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        int int3 = dateTime2.getMonthOfYear();
        boolean boolean4 = dateTime0.isAfter((org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.DateTime dateTime6 = dateTime0.minusSeconds(3);
        org.joda.time.LocalDate localDate7 = dateTime0.toLocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType9 = dateTimeFieldType8.getRangeDurationType();
        int int10 = localDate7.get(dateTimeFieldType8);
        java.lang.String str11 = dateTimeFieldType8.toString();
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType8.getDurationType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "weekOfWeekyear" + "'", str11, "weekOfWeekyear");
        org.junit.Assert.assertNotNull(durationFieldType12);
    }

    @Test
    public void test16514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16514");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone2);
        int int4 = dateTime3.getDayOfMonth();
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean15 = mutableInterval10.isBefore((org.joda.time.ReadableInterval) mutableInterval14);
        boolean boolean16 = mutableInterval7.contains((org.joda.time.ReadableInterval) mutableInterval14);
        org.joda.time.Weeks weeks17 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval14);
        org.joda.time.DateTime dateTime18 = dateTime3.plus((org.joda.time.ReadablePeriod) weeks17);
        org.joda.time.LocalDateTime localDateTime19 = dateTime3.toLocalDateTime();
        int int20 = dateTime3.getCenturyOfEra();
        org.joda.time.DateTime dateTime22 = dateTime3.plusMinutes((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone24);
        int int26 = dateTime25.getDayOfMonth();
        org.joda.time.DateTime dateTime28 = dateTime25.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property29 = dateTime28.dayOfYear();
        org.joda.time.DateTime dateTime30 = property29.roundHalfFloorCopy();
        boolean boolean31 = dateTime30.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval39 = mutableInterval38.toInterval();
        org.joda.time.Chronology chronology40 = interval39.getChronology();
        org.joda.time.DateTimeZone dateTimeZone41 = chronology40.getZone();
        java.lang.String str43 = dateTimeZone41.getName(100L);
        org.joda.time.DateTime dateTime44 = dateTime35.withZoneRetainFields(dateTimeZone41);
        long long46 = dateTimeZone34.getMillisKeepLocal(dateTimeZone41, 6000035L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone34);
        org.joda.time.DateTime dateTime48 = dateTime30.toDateTime(dateTimeZone34);
        org.joda.time.Chronology chronology49 = dateTime48.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.monthOfYear();
        int int51 = dateTime48.get(dateTimeFieldType50);
        org.joda.time.DateTime.Property property52 = dateTime22.property(dateTimeFieldType50);
        org.joda.time.PeriodType periodType53 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType54 = periodType53.withWeeksRemoved();
        java.lang.String str55 = periodType53.toString();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod(periodType53);
        org.joda.time.Period period57 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateTime22, periodType53);
        org.joda.time.DateTime dateTime59 = dateTime22.withMillis(1482159442987L);
        org.joda.time.Period period68 = new org.joda.time.Period(24, 57300593, 893, (-20), (-90), 15, 11, 0);
        org.joda.time.Interval interval69 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime59, (org.joda.time.ReadablePeriod) period68);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 19 + "'", int20 == 19);
        org.junit.Assert.assertNotNull(dateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+97:00" + "'", str43, "+97:00");
        org.junit.Assert.assertNotNull(dateTime44);
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 6000035L + "'", long46 == 6000035L);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "PeriodType[Years]" + "'", str55, "PeriodType[Years]");
        org.junit.Assert.assertNotNull(dateTime59);
    }

    @Test
    public void test16515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16515");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, periodType1, chronology6);
        mutablePeriod7.addHours(100);
        org.joda.time.MutablePeriod mutablePeriod10 = mutablePeriod7.copy();
        mutablePeriod10.addMillis(50);
        java.lang.Object obj13 = mutablePeriod10.clone();
        mutablePeriod10.addHours(953);
        mutablePeriod10.setPeriod((long) 100, 44L);
        mutablePeriod10.setMonths(365);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone22);
        int int24 = dateTime23.getSecondOfMinute();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.DateTimeZone dateTimeZone31 = chronology30.getZone();
        java.lang.String str33 = dateTimeZone31.getName(100L);
        org.joda.time.DateTime dateTime34 = dateTime25.withZoneRetainFields(dateTimeZone31);
        java.lang.String str35 = dateTimeZone31.getID();
        org.joda.time.LocalDateTime localDateTime36 = null;
        boolean boolean37 = dateTimeZone31.isLocalDateTimeGap(localDateTime36);
        org.joda.time.DateTime dateTime38 = dateTime23.withZone(dateTimeZone31);
        org.joda.time.DateTime dateTime40 = dateTime23.plus(1L);
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean51 = mutableInterval46.isBefore((org.joda.time.ReadableInterval) mutableInterval50);
        boolean boolean52 = mutableInterval43.contains((org.joda.time.ReadableInterval) mutableInterval50);
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval56 = mutableInterval55.toInterval();
        org.joda.time.Chronology chronology57 = interval56.getChronology();
        long long58 = interval56.toDurationMillis();
        org.joda.time.Interval interval60 = interval56.withEndMillis((long) (short) 100);
        mutableInterval50.setInterval((org.joda.time.ReadableInterval) interval56);
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval65 = mutableInterval64.toInterval();
        org.joda.time.Chronology chronology66 = interval65.getChronology();
        long long67 = interval65.toDurationMillis();
        boolean boolean68 = interval56.isAfter((org.joda.time.ReadableInterval) interval65);
        org.joda.time.Chronology chronology69 = interval56.getChronology();
        org.joda.time.DateTime dateTime70 = interval56.getEnd();
        org.joda.time.DateTime dateTime72 = dateTime70.minus((-2077200000L));
        org.joda.time.Duration duration73 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration74 = duration73.toDuration();
        org.joda.time.MutableInterval mutableInterval77 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval78 = mutableInterval77.toInterval();
        org.joda.time.Chronology chronology79 = interval78.getChronology();
        org.joda.time.DateTimeZone dateTimeZone80 = chronology79.getZone();
        org.joda.time.Period period81 = duration73.toPeriod(chronology79);
        org.joda.time.DateTimeField dateTimeField82 = chronology79.clockhourOfDay();
        int int83 = dateTime70.get(dateTimeField82);
        org.joda.time.DateTime dateTime85 = dateTime70.withMillisOfSecond(41);
        mutablePeriod10.setPeriod((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableInstant) dateTime70);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration87 = new org.joda.time.Duration((java.lang.Object) dateTime70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.DateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0.041S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0.041S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0.041S");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+97:00" + "'", str33, "+97:00");
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+97:00" + "'", str35, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 53L + "'", long58 == 53L);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 53L + "'", long67 == 53L);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(duration73);
        org.junit.Assert.assertNotNull(duration74);
        org.junit.Assert.assertNotNull(interval78);
        org.junit.Assert.assertNotNull(chronology79);
        org.junit.Assert.assertNotNull(dateTimeZone80);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(dateTimeField82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertNotNull(dateTime85);
    }

    @Test
    public void test16516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16516");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 9, (-113605342811999990L));
        mutablePeriod2.addMillis((-3939));
    }

    @Test
    public void test16517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16517");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime.Property property14 = dateTime10.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone16);
        int int18 = dateTime17.getDayOfMonth();
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 1, periodType20, chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone28 = chronology25.getZone();
        org.joda.time.DateTime dateTime29 = dateTime17.withZoneRetainFields(dateTimeZone28);
        org.joda.time.DateTime dateTime30 = dateTime10.withZone(dateTimeZone28);
        org.joda.time.DateTime dateTime32 = dateTime10.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((java.lang.Object) dateTime10);
        org.joda.time.DateTime dateTime35 = dateTime33.minusWeeks(954);
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 1, periodType37, chronology42);
        mutablePeriod43.addHours(100);
        org.joda.time.MutablePeriod mutablePeriod46 = mutablePeriod43.copy();
        org.joda.time.MutablePeriod mutablePeriod47 = mutablePeriod43.copy();
        java.lang.Object obj48 = mutablePeriod43.clone();
        boolean boolean49 = dateTime35.equals(obj48);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(mutablePeriod46);
        org.junit.Assert.assertNotNull(mutablePeriod47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "PT100H0.001S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "PT100H0.001S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "PT100H0.001S");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test16518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16518");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        org.joda.time.Chronology chronology9 = interval8.getChronology();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology9.getZone();
        java.lang.String str12 = dateTimeZone10.getName(100L);
        org.joda.time.DateTime dateTime13 = dateTime4.withZoneRetainFields(dateTimeZone10);
        java.lang.String str14 = dateTimeZone10.getID();
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone10.isLocalDateTimeGap(localDateTime15);
        org.joda.time.DateTime dateTime17 = dateTime2.withZone(dateTimeZone10);
        long long19 = dateTimeZone10.previousTransition(75736684800000L);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone21);
        int int23 = dateTime22.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone25);
        int int27 = dateTime26.getSecondOfMinute();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.Chronology chronology33 = interval32.getChronology();
        org.joda.time.DateTimeZone dateTimeZone34 = chronology33.getZone();
        java.lang.String str36 = dateTimeZone34.getName(100L);
        org.joda.time.DateTime dateTime37 = dateTime28.withZoneRetainFields(dateTimeZone34);
        java.lang.String str38 = dateTimeZone34.getID();
        org.joda.time.LocalDateTime localDateTime39 = null;
        boolean boolean40 = dateTimeZone34.isLocalDateTimeGap(localDateTime39);
        org.joda.time.DateTime dateTime41 = dateTime26.withZone(dateTimeZone34);
        org.joda.time.MutableDateTime mutableDateTime42 = dateTime22.toMutableDateTime(dateTimeZone34);
        int int43 = dateTimeZone10.getOffset((org.joda.time.ReadableInstant) dateTime22);
        long long46 = dateTimeZone10.convertLocalToUTC((-38399L), true);
        int int48 = dateTimeZone10.getStandardOffset(946335600000L);
        java.lang.String str50 = dateTimeZone10.getShortName((long) (-292275054));
        boolean boolean52 = dateTimeZone10.isStandardOffset(0L);
        int int54 = dateTimeZone10.getStandardOffset(53737922L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+97:00" + "'", str14, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 75736684800000L + "'", long19 == 75736684800000L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3600010 + "'", int23 == 3600010);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+97:00" + "'", str36, "+97:00");
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+97:00" + "'", str38, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 349200000 + "'", int43 == 349200000);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-349238399L) + "'", long46 == (-349238399L));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 349200000 + "'", int48 == 349200000);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+97:00" + "'", str50, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 349200000 + "'", int54 == 349200000);
    }

    @Test
    public void test16519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16519");
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.hourOfHalfday();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 0);
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period23 = org.joda.time.Period.days((-1));
        org.joda.time.Period period25 = period23.withWeeks((int) 'a');
        java.lang.String str26 = period23.toString();
        mutablePeriod21.setPeriod((org.joda.time.ReadablePeriod) period23);
        mutablePeriod21.addMonths((int) (short) -1);
        org.joda.time.Period period31 = org.joda.time.Period.days((-1));
        org.joda.time.Period period33 = period31.withWeeks((int) 'a');
        org.joda.time.Period period35 = period31.plusMonths((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType36 = null;
        boolean boolean37 = period35.isSupported(durationFieldType36);
        mutablePeriod21.add((org.joda.time.ReadablePeriod) period35);
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval46 = mutableInterval45.toInterval();
        org.joda.time.Chronology chronology47 = interval46.getChronology();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) 1, periodType42, chronology47);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) '4', chronology47);
        org.joda.time.DurationField durationField50 = chronology47.centuries();
        mutablePeriod21.add((long) (short) 10, chronology47);
        org.joda.time.DateTimeField dateTimeField52 = chronology47.clockhourOfDay();
        int int53 = dateTime12.get(dateTimeField52);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone55);
        int int57 = dateTime56.getSecondOfMinute();
        org.joda.time.DateTime dateTime59 = dateTime56.withMinuteOfHour(10);
        org.joda.time.TimeOfDay timeOfDay60 = dateTime59.toTimeOfDay();
        int[] intArray63 = new int[] { 4, 2 };
        int int64 = dateTimeField52.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay60, intArray63);
        int int65 = dateTimeField10.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay60);
        org.joda.time.Chronology chronology66 = timeOfDay60.getChronology();
        org.joda.time.Period period67 = new org.joda.time.Period(473703480000L, (long) 1970, chronology66);
        int int68 = period67.getDays();
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "P-1D" + "'", str26, "P-1D");
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(timeOfDay60);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[4, 2]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 11 + "'", int65 == 11);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-3) + "'", int68 == (-3));
    }

    @Test
    public void test16520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16520");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        mutableInterval2.setDurationAfterStart(0L);
        boolean boolean14 = mutableInterval2.containsNow();
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval18 = mutableInterval17.toInterval();
        org.joda.time.Chronology chronology19 = interval18.getChronology();
        long long20 = interval18.toDurationMillis();
        org.joda.time.Interval interval22 = interval18.withEndMillis((long) (short) 100);
        long long23 = interval18.toDurationMillis();
        boolean boolean24 = mutableInterval2.overlaps((org.joda.time.ReadableInterval) interval18);
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean35 = mutableInterval30.isBefore((org.joda.time.ReadableInterval) mutableInterval34);
        boolean boolean36 = mutableInterval27.contains((org.joda.time.ReadableInterval) mutableInterval34);
        org.joda.time.Weeks weeks37 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval34);
        long long38 = mutableInterval34.getEndMillis();
        org.joda.time.DateTime dateTime39 = mutableInterval34.getEnd();
        org.joda.time.Chronology chronology40 = mutableInterval34.getChronology();
        mutableInterval2.setChronology(chronology40);
        org.joda.time.MutableInterval mutableInterval42 = mutableInterval2.toMutableInterval();
        org.joda.time.Period period43 = mutableInterval2.toPeriod();
        org.joda.time.Period period44 = period43.toPeriod();
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 53L + "'", long20 == 53L);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 53L + "'", long23 == 53L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(weeks37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 52L + "'", long38 == 52L);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(mutableInterval42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period44);
    }

    @Test
    public void test16521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16521");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone2);
        int int4 = dateTime3.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone5 = dateTime3.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone7);
        int int9 = dateTime8.getMillisOfDay();
        org.joda.time.DateTime dateTime11 = dateTime8.plusMillis((int) '#');
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval18 = mutableInterval17.toInterval();
        org.joda.time.Chronology chronology19 = interval18.getChronology();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 1, periodType14, chronology19);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) '4', chronology19);
        org.joda.time.DateTime dateTime22 = dateTime11.withChronology(chronology19);
        int int23 = dateTime22.getYearOfEra();
        org.joda.time.Chronology chronology24 = dateTime22.getChronology();
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        org.joda.time.Chronology chronology29 = interval28.getChronology();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology29);
        int int31 = dateTime30.getSecondOfMinute();
        java.lang.String str33 = dateTime30.toString("+00:00");
        org.joda.time.Hours hours34 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours35 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours36 = hours34.minus(hours35);
        org.joda.time.Duration duration37 = hours35.toStandardDuration();
        org.joda.time.Duration duration39 = duration37.withMillis((long) (short) 1);
        org.joda.time.Duration duration40 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration41 = duration40.toDuration();
        org.joda.time.Duration duration43 = duration41.minus(3600L);
        boolean boolean44 = duration37.isLongerThan((org.joda.time.ReadableDuration) duration41);
        org.joda.time.PeriodType periodType45 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType46 = periodType45.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableDuration) duration41, periodType45);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime22, periodType45);
        java.lang.Object obj53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType55 = period54.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod(obj53, periodType55);
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval62 = mutableInterval61.toInterval();
        org.joda.time.Chronology chronology63 = interval62.getChronology();
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((long) 1, periodType58, chronology63);
        org.joda.time.DateTimeField dateTimeField65 = chronology63.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone66 = chronology63.getZone();
        org.joda.time.DateTimeField dateTimeField67 = chronology63.minuteOfHour();
        org.joda.time.Chronology chronology68 = chronology63.withUTC();
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) 44, (-10L), periodType55, chronology68);
        mutablePeriod48.setPeriod((long) 53, (long) 3600052, chronology68);
        org.joda.time.DateTimeField dateTimeField71 = chronology68.millisOfDay();
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime((long) 521775, chronology68);
        org.joda.time.DateTime.Property property73 = dateTime72.hourOfDay();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3600010 + "'", int9 == 3600010);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1970 + "'", int23 == 1970);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(chronology29);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
        org.junit.Assert.assertNotNull(hours34);
        org.junit.Assert.assertNotNull(hours35);
        org.junit.Assert.assertNotNull(hours36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(dateTimeZone66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(property73);
    }

    @Test
    public void test16522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16522");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 100);
        org.joda.time.Period period3 = period1.plusDays((-1));
        int int4 = period3.getSeconds();
        org.joda.time.Hours hours5 = period3.toStandardHours();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(hours5);
    }

    @Test
    public void test16523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16523");
        org.joda.time.Hours hours0 = org.joda.time.Hours.THREE;
        org.joda.time.Duration duration1 = hours0.toStandardDuration();
        org.joda.time.Hours hours3 = hours0.plus((int) ' ');
        org.joda.time.Hours hours5 = org.joda.time.Hours.hours((int) (byte) 100);
        org.joda.time.Hours hours7 = hours5.plus((int) ' ');
        org.joda.time.Hours hours8 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours9 = null;
        boolean boolean10 = hours8.isLessThan(hours9);
        org.joda.time.Hours hours11 = hours7.minus(hours8);
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval18 = mutableInterval17.toInterval();
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean22 = mutableInterval17.isBefore((org.joda.time.ReadableInterval) mutableInterval21);
        boolean boolean23 = mutableInterval14.contains((org.joda.time.ReadableInterval) mutableInterval21);
        org.joda.time.MutableInterval mutableInterval24 = mutableInterval14.copy();
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 1, periodType27, chronology32);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) '4', chronology32);
        org.joda.time.ReadablePartial readablePartial35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.withFields(readablePartial35);
        org.joda.time.DateTime dateTime38 = dateTime34.plusMillis((int) ' ');
        org.joda.time.DateTime dateTime40 = dateTime34.minusMinutes((int) '#');
        boolean boolean41 = mutableInterval24.isAfter((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.YearMonthDay yearMonthDay42 = dateTime40.toYearMonthDay();
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 1, periodType45, chronology50);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) '4', chronology50);
        org.joda.time.ReadablePartial readablePartial53 = null;
        org.joda.time.DateTime dateTime54 = dateTime52.withFields(readablePartial53);
        org.joda.time.DateTime.Property property55 = dateTime54.millisOfDay();
        org.joda.time.DateTime dateTime56 = dateTime54.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property57 = dateTime56.minuteOfHour();
        org.joda.time.DateTime.Property property58 = dateTime56.minuteOfHour();
        org.joda.time.DateTime dateTime59 = property58.roundHalfFloorCopy();
        org.joda.time.Hours hours60 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableInstant) dateTime59);
        boolean boolean61 = hours8.isGreaterThan(hours60);
        org.joda.time.Hours hours62 = hours3.plus(hours8);
        org.joda.time.DurationFieldType durationFieldType63 = hours62.getFieldType();
        org.joda.time.Hours hours65 = org.joda.time.Hours.hours(954);
        org.joda.time.Hours hours67 = hours65.minus(22);
        org.joda.time.PeriodType periodType68 = hours65.getPeriodType();
        org.joda.time.Hours hours69 = hours62.plus(hours65);
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(mutableInterval24);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(yearMonthDay42);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(hours60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(hours62);
        org.junit.Assert.assertNotNull(durationFieldType63);
        org.junit.Assert.assertNotNull(hours65);
        org.junit.Assert.assertNotNull(hours67);
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertNotNull(hours69);
    }

    @Test
    public void test16524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16524");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ONE;
        org.joda.time.Weeks weeks2 = weeks0.plus((int) (byte) 1);
        int int3 = weeks0.getWeeks();
        org.joda.time.Weeks weeks5 = weeks0.dividedBy(1968);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone7);
        int int9 = dateTime8.getDayOfMonth();
        org.joda.time.DateTime dateTime11 = dateTime8.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime13 = dateTime11.withYear(0);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 1, periodType16, chronology21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) '4', chronology21);
        org.joda.time.Instant instant24 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 1, periodType27, chronology32);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) '4', chronology32);
        org.joda.time.ReadablePartial readablePartial35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.withFields(readablePartial35);
        boolean boolean37 = instant24.isAfter((org.joda.time.ReadableInstant) dateTime34);
        boolean boolean38 = dateTime23.isAfter((org.joda.time.ReadableInstant) dateTime34);
        java.lang.String str39 = dateTime23.toString();
        boolean boolean40 = dateTime13.isAfter((org.joda.time.ReadableInstant) dateTime23);
        int int41 = dateTime23.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone43);
        int int45 = dateTime44.getSecondOfMinute();
        int int46 = dateTime44.getMillisOfDay();
        org.joda.time.DateTime dateTime48 = dateTime44.withYear((int) (byte) 100);
        org.joda.time.Weeks weeks49 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.Weeks weeks50 = weeks0.minus(weeks49);
        java.lang.String str51 = weeks50.toString();
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970-01-05T01:00:00.052+97:00" + "'", str39, "1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 5 + "'", int41 == 5);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3600010 + "'", int46 == 3600010);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(weeks49);
        org.junit.Assert.assertNotNull(weeks50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "P97572W" + "'", str51, "P97572W");
    }

    @Test
    public void test16525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16525");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval10 = mutableInterval9.toInterval();
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean14 = mutableInterval9.isBefore((org.joda.time.ReadableInterval) mutableInterval13);
        boolean boolean15 = mutableInterval6.contains((org.joda.time.ReadableInterval) mutableInterval13);
        org.joda.time.Weeks weeks16 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval13);
        org.joda.time.DateTime dateTime17 = dateTime2.plus((org.joda.time.ReadablePeriod) weeks16);
        org.joda.time.DateTime dateTime19 = dateTime2.minusDays((int) (byte) 1);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        org.joda.time.Chronology chronology27 = interval26.getChronology();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 1, periodType22, chronology27);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) '4', chronology27);
        org.joda.time.ReadablePartial readablePartial30 = null;
        org.joda.time.DateTime dateTime31 = dateTime29.withFields(readablePartial30);
        org.joda.time.DateTime.Property property32 = dateTime31.millisOfDay();
        org.joda.time.DateTime dateTime34 = dateTime31.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property35 = dateTime31.era();
        org.joda.time.Duration duration37 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime39 = dateTime31.withDurationAdded((org.joda.time.ReadableDuration) duration37, 0);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableDuration) duration37);
        org.joda.time.Duration duration41 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        org.joda.time.Chronology chronology49 = interval48.getChronology();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 1, periodType44, chronology49);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) '4', chronology49);
        org.joda.time.ReadablePartial readablePartial52 = null;
        org.joda.time.DateTime dateTime53 = dateTime51.withFields(readablePartial52);
        org.joda.time.DateTime.Property property54 = dateTime53.millisOfDay();
        org.joda.time.DateTime dateTime55 = dateTime53.withEarlierOffsetAtOverlap();
        int int56 = dateTime53.getDayOfWeek();
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval62 = mutableInterval61.toInterval();
        org.joda.time.Chronology chronology63 = interval62.getChronology();
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((long) 1, periodType58, chronology63);
        org.joda.time.DateTimeField dateTimeField65 = chronology63.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone66 = chronology63.getZone();
        org.joda.time.DateTime dateTime67 = dateTime53.withChronology(chronology63);
        org.joda.time.Interval interval68 = duration41.toIntervalTo((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period71 = duration41.toPeriodFrom((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.Duration duration73 = duration41.withMillis(100L);
        boolean boolean74 = duration37.isLongerThan((org.joda.time.ReadableDuration) duration41);
        org.joda.time.Instant instant75 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType78 = null;
        org.joda.time.MutableInterval mutableInterval81 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval82 = mutableInterval81.toInterval();
        org.joda.time.Chronology chronology83 = interval82.getChronology();
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((long) 1, periodType78, chronology83);
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime((long) '4', chronology83);
        org.joda.time.ReadablePartial readablePartial86 = null;
        org.joda.time.DateTime dateTime87 = dateTime85.withFields(readablePartial86);
        boolean boolean88 = instant75.isAfter((org.joda.time.ReadableInstant) dateTime85);
        org.joda.time.DateTime.Property property89 = dateTime85.dayOfWeek();
        org.joda.time.DateTime dateTime90 = property89.withMaximumValue();
        org.joda.time.DateTime dateTime92 = dateTime90.withWeekyear((int) (short) 100);
        org.joda.time.PeriodType periodType94 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.MutablePeriod mutablePeriod95 = new org.joda.time.MutablePeriod((long) 20, periodType94);
        org.joda.time.MutablePeriod mutablePeriod96 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration41, (org.joda.time.ReadableInstant) dateTime92, periodType94);
        mutablePeriod96.setMillis(6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration99 = new org.joda.time.Duration((java.lang.Object) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(dateTimeZone66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(interval68);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(duration73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(instant75);
        org.junit.Assert.assertNotNull(interval82);
        org.junit.Assert.assertNotNull(chronology83);
        org.junit.Assert.assertNotNull(dateTime87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(property89);
        org.junit.Assert.assertNotNull(dateTime90);
        org.junit.Assert.assertNotNull(dateTime92);
        org.junit.Assert.assertNotNull(periodType94);
    }

    @Test
    public void test16526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16526");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        java.util.Locale locale8 = null;
        int int9 = property6.getMaximumTextLength(locale8);
        java.lang.String str10 = property6.getName();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone12);
        java.util.Locale locale14 = null;
        java.util.Calendar calendar15 = dateTime13.toCalendar(locale14);
        boolean boolean17 = dateTime13.isEqual((long) 3);
        boolean boolean19 = dateTime13.equals((java.lang.Object) 56L);
        org.joda.time.DateTime dateTime21 = dateTime13.plusWeeks(100);
        org.joda.time.DateTime dateTime23 = dateTime21.minusWeeks(4);
        org.joda.time.DateTime dateTime25 = dateTime21.plusHours(1439);
        int int26 = property6.compareTo((org.joda.time.ReadableInstant) dateTime21);
        boolean boolean27 = property6.isLeap();
        org.joda.time.DurationField durationField28 = property6.getLeapDurationField();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "dayOfYear" + "'", str10, "dayOfYear");
        org.junit.Assert.assertNotNull(calendar15);
        org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(durationField28);
    }

    @Test
    public void test16527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16527");
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) 100, (long) 10, periodType3);
        mutablePeriod4.addMonths(0);
        org.joda.time.DurationFieldType[] durationFieldTypeArray7 = mutablePeriod4.getFieldTypes();
        org.joda.time.DurationFieldType[] durationFieldTypeArray8 = mutablePeriod4.getFieldTypes();
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.forFields(durationFieldTypeArray8);
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(19L, periodType9, chronology14);
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((java.lang.Object) interval19);
        mutablePeriod15.setPeriod((org.joda.time.ReadableInterval) mutableInterval20);
        mutablePeriod15.add(75159692521206L);
        org.joda.time.DurationFieldType[] durationFieldTypeArray24 = mutablePeriod15.getFieldTypes();
        org.junit.Assert.assertNotNull(durationFieldTypeArray7);
        org.junit.Assert.assertNotNull(durationFieldTypeArray8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(durationFieldTypeArray24);
    }

    @Test
    public void test16528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16528");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekyear((int) (short) 1);
        int int8 = dateTime7.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone10);
        java.util.Locale locale12 = null;
        java.util.Calendar calendar13 = dateTime11.toCalendar(locale12);
        org.joda.time.LocalDateTime localDateTime14 = dateTime11.toLocalDateTime();
        org.joda.time.DateTime dateTime15 = dateTime7.withFields((org.joda.time.ReadablePartial) localDateTime14);
        java.util.Date date16 = dateTime7.toDate();
        boolean boolean18 = dateTime7.isBefore(11360502720000000L);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(calendar13);
        org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Mon Feb 21 15:03:32 UTC 1");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test16529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16529");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone6);
        int int8 = dateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology14.getZone();
        java.lang.String str17 = dateTimeZone15.getName(100L);
        org.joda.time.DateTime dateTime18 = dateTime9.withZoneRetainFields(dateTimeZone15);
        java.lang.String str19 = dateTimeZone15.getID();
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone15.isLocalDateTimeGap(localDateTime20);
        org.joda.time.DateTime dateTime22 = dateTime7.withZone(dateTimeZone15);
        long long24 = dateTimeZone15.previousTransition(75736684800000L);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone26);
        int int28 = dateTime27.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone30);
        int int32 = dateTime31.getSecondOfMinute();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        org.joda.time.DateTimeZone dateTimeZone39 = chronology38.getZone();
        java.lang.String str41 = dateTimeZone39.getName(100L);
        org.joda.time.DateTime dateTime42 = dateTime33.withZoneRetainFields(dateTimeZone39);
        java.lang.String str43 = dateTimeZone39.getID();
        org.joda.time.LocalDateTime localDateTime44 = null;
        boolean boolean45 = dateTimeZone39.isLocalDateTimeGap(localDateTime44);
        org.joda.time.DateTime dateTime46 = dateTime31.withZone(dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime47 = dateTime27.toMutableDateTime(dateTimeZone39);
        int int48 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime27);
        long long52 = dateTimeZone15.convertLocalToUTC(6216719587200001L, true, (-10L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((int) (byte) 100, 991, (-360000), 44, 41159243, dateTimeZone15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 44 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+97:00" + "'", str19, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 75736684800000L + "'", long24 == 75736684800000L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3600010 + "'", int28 == 3600010);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+97:00" + "'", str41, "+97:00");
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+97:00" + "'", str43, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 349200000 + "'", int48 == 349200000);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 6216719238000001L + "'", long52 == 6216719238000001L);
    }

    @Test
    public void test16530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16530");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours1 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours2 = hours0.minus(hours1);
        org.joda.time.Duration duration3 = hours1.toStandardDuration();
        org.joda.time.Duration duration5 = duration3.withMillis((long) (short) 1);
        org.joda.time.Duration duration8 = duration3.withDurationAdded((long) 42, 49);
        org.joda.time.Duration duration9 = duration3.toDuration();
        org.joda.time.Hours hours10 = duration9.toStandardHours();
        org.joda.time.Hours hours12 = hours10.plus(0);
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(hours12);
    }

    @Test
    public void test16531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16531");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        java.util.Locale locale8 = null;
        int int9 = property6.getMaximumTextLength(locale8);
        org.joda.time.DateTime dateTime10 = property6.roundCeilingCopy();
        int int11 = property6.getMinimumValueOverall();
        java.lang.String str12 = property6.toString();
        org.joda.time.DateTime dateTime14 = property6.addToCopy((long) 2078571);
        org.joda.time.DateTime.Property property15 = dateTime14.millisOfSecond();
        org.joda.time.DateTime dateTime17 = property15.setCopy("21");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[dayOfYear]" + "'", str12, "Property[dayOfYear]");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test16532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16532");
        org.joda.time.Period period8 = new org.joda.time.Period(18, 1967, 0, 3, (-200230), 2147483647, (-3598), 0);
    }

    @Test
    public void test16533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16533");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        boolean boolean6 = dateTime2.isEqual((long) 3);
        boolean boolean8 = dateTime2.equals((java.lang.Object) 56L);
        org.joda.time.DateTime dateTime10 = dateTime2.plusWeeks(100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusWeeks(4);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int14 = dateTime10.get(dateTimeFieldType13);
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType13.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType13.getDurationType();
        org.joda.time.DurationFieldType durationFieldType17 = dateTimeFieldType13.getRangeDurationType();
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(durationFieldType17);
    }

    @Test
    public void test16534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16534");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 100, (long) 10, periodType2);
        mutablePeriod3.setMonths((int) (byte) -1);
        mutablePeriod3.clear();
        org.joda.time.Duration duration9 = new org.joda.time.Duration(187200000L, 3155695200000L);
        org.joda.time.Duration duration11 = duration9.plus((-100982246399976L));
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration11);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 1, periodType15, chronology20);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) '4', chronology20);
        org.joda.time.DateTime.Property property23 = dateTime22.era();
        org.joda.time.Period period24 = duration11.toPeriodFrom((org.joda.time.ReadableInstant) dateTime22);
        long long25 = duration11.getStandardDays();
        org.joda.time.Period period26 = duration11.toPeriod();
        org.joda.time.Period period28 = period26.withMillis(894);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1132253L) + "'", long25 == (-1132253L));
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
    }

    @Test
    public void test16535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16535");
        org.joda.time.Days days1 = org.joda.time.Days.days((-11));
        org.joda.time.Days days3 = days1.dividedBy(2147483647);
        java.lang.String str4 = days3.toString();
        org.joda.time.Days days5 = org.joda.time.Days.ONE;
        org.joda.time.Days days6 = org.joda.time.Days.ZERO;
        boolean boolean7 = days5.isLessThan(days6);
        org.joda.time.Days days8 = org.joda.time.Days.ONE;
        int int9 = days8.getDays();
        int int10 = days8.size();
        java.lang.String str11 = days8.toString();
        org.joda.time.Days days12 = days5.minus(days8);
        org.joda.time.PeriodType periodType13 = days12.getPeriodType();
        org.joda.time.Days days15 = days12.minus((-59));
        org.joda.time.PeriodType periodType16 = days15.getPeriodType();
        org.joda.time.Days days17 = days15.negated();
        boolean boolean18 = days3.isLessThan(days17);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P0D" + "'", str4, "P0D");
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P1D" + "'", str11, "P1D");
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test16536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16536");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays(56L);
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekyear((int) (short) 1);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.toDateTime(chronology10);
        org.joda.time.DateTime.Property property12 = dateTime7.minuteOfHour();
        org.joda.time.Period period13 = duration1.toPeriodTo((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.Minutes minutes15 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType16 = null;
        int int17 = minutes15.get(durationFieldType16);
        int int19 = minutes15.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod20 = minutes15.toMutablePeriod();
        org.joda.time.Minutes minutes22 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType23 = null;
        int int24 = minutes22.get(durationFieldType23);
        java.lang.Object obj25 = null;
        boolean boolean26 = minutes22.equals(obj25);
        org.joda.time.Minutes minutes28 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType29 = null;
        int int30 = minutes28.get(durationFieldType29);
        int int32 = minutes28.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod33 = minutes28.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType35 = minutes28.getFieldType(0);
        org.joda.time.DurationFieldType durationFieldType36 = minutes28.getFieldType();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period47 = org.joda.time.Period.days((-1));
        org.joda.time.Period period49 = period47.withWeeks((int) 'a');
        java.lang.String str50 = period47.toString();
        mutablePeriod45.setPeriod((org.joda.time.ReadablePeriod) period47);
        mutablePeriod45.addMonths((int) (short) -1);
        org.joda.time.Period period55 = org.joda.time.Period.days((-1));
        org.joda.time.Period period57 = period55.withWeeks((int) 'a');
        org.joda.time.Period period59 = period55.plusMonths((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType60 = null;
        boolean boolean61 = period59.isSupported(durationFieldType60);
        mutablePeriod45.add((org.joda.time.ReadablePeriod) period59);
        org.joda.time.DurationFieldType durationFieldType63 = org.joda.time.DurationFieldType.hours();
        boolean boolean64 = period59.isSupported(durationFieldType63);
        boolean boolean65 = minutes28.isSupported(durationFieldType63);
        boolean boolean66 = minutes22.isSupported(durationFieldType63);
        org.joda.time.Minutes minutes67 = minutes15.minus(minutes22);
        org.joda.time.DateTime dateTime69 = dateTime7.withPeriodAdded((org.joda.time.ReadablePeriod) minutes15, 57292823);
        org.joda.time.DateTime.Property property70 = dateTime7.weekOfWeekyear();
        java.lang.String str71 = property70.getAsShortText();
        int int72 = property70.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(mutablePeriod20);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(mutablePeriod33);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "P-1D" + "'", str50, "P-1D");
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(durationFieldType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(minutes67);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "8" + "'", str71, "8");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 53 + "'", int72 == 53);
    }

    @Test
    public void test16537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16537");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        int int15 = mutablePeriod8.getMillis();
        org.joda.time.MutablePeriod mutablePeriod16 = mutablePeriod8.toMutablePeriod();
        mutablePeriod16.add((int) '4', (int) (short) 0, (int) (byte) 0, (int) (short) 10, 1, (int) 'a', (int) (short) 100, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone28);
        int int30 = dateTime29.getMillisOfDay();
        org.joda.time.DateTime dateTime32 = dateTime29.plusMillis((int) '#');
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval39 = mutableInterval38.toInterval();
        org.joda.time.Chronology chronology40 = interval39.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 1, periodType35, chronology40);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) '4', chronology40);
        org.joda.time.DateTime dateTime43 = dateTime32.withChronology(chronology40);
        mutablePeriod16.setPeriod((long) (short) 100, chronology40);
        org.joda.time.DateTimeField dateTimeField45 = chronology40.era();
        org.joda.time.DateTimeField dateTimeField46 = chronology40.centuryOfEra();
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P-1D" + "'", str13, "P-1D");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod16);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3600010 + "'", int30 == 3600010);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
    }

    @Test
    public void test16538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16538");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.Chronology chronology5 = interval4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology5.getZone();
        java.lang.String str8 = dateTimeZone6.getName(100L);
        org.joda.time.DateTime dateTime9 = dateTime0.withZoneRetainFields(dateTimeZone6);
        org.joda.time.DateTime dateTime12 = dateTime9.withDurationAdded((long) 52, (int) (short) 1);
        org.joda.time.TimeOfDay timeOfDay13 = dateTime12.toTimeOfDay();
        java.lang.String str14 = timeOfDay13.toString();
        org.joda.time.Duration duration15 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 1, periodType18, chronology23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) '4', chronology23);
        org.joda.time.ReadablePartial readablePartial26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.withFields(readablePartial26);
        org.joda.time.DateTime.Property property28 = dateTime27.millisOfDay();
        org.joda.time.DateTime dateTime29 = dateTime27.withEarlierOffsetAtOverlap();
        int int30 = dateTime27.getDayOfWeek();
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.Chronology chronology37 = interval36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 1, periodType32, chronology37);
        org.joda.time.DateTimeField dateTimeField39 = chronology37.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone40 = chronology37.getZone();
        org.joda.time.DateTime dateTime41 = dateTime27.withChronology(chronology37);
        org.joda.time.Interval interval42 = duration15.toIntervalTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 1, periodType45, chronology50);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) '4', chronology50);
        org.joda.time.ReadablePartial readablePartial53 = null;
        org.joda.time.DateTime dateTime54 = dateTime52.withFields(readablePartial53);
        org.joda.time.DateTime dateTime56 = dateTime52.plusHours(24);
        org.joda.time.TimeOfDay timeOfDay57 = dateTime56.toTimeOfDay();
        org.joda.time.DateTime dateTime58 = dateTime27.withFields((org.joda.time.ReadablePartial) timeOfDay57);
        org.joda.time.Seconds seconds59 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadablePartial) timeOfDay13, (org.joda.time.ReadablePartial) timeOfDay57);
        org.joda.time.PeriodType periodType60 = org.joda.time.PeriodType.standard();
        java.lang.String str61 = periodType60.toString();
        org.joda.time.format.PeriodPrinter periodPrinter62 = null;
        org.joda.time.format.PeriodParser periodParser63 = null;
        org.joda.time.format.PeriodFormatter periodFormatter64 = new org.joda.time.format.PeriodFormatter(periodPrinter62, periodParser63);
        boolean boolean65 = periodFormatter64.isPrinter();
        org.joda.time.format.PeriodParser periodParser66 = periodFormatter64.getParser();
        java.util.Locale locale67 = periodFormatter64.getLocale();
        boolean boolean68 = periodType60.equals((java.lang.Object) locale67);
        java.lang.String str69 = periodType60.toString();
        org.joda.time.PeriodType periodType70 = periodType60.withYearsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period71 = new org.joda.time.Period((java.lang.Object) timeOfDay57, periodType60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.TimeOfDay");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "T16:03:32.682" + "'", str14, "T16:03:32.682");
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(timeOfDay57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(seconds59);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "PeriodType[Standard]" + "'", str61, "PeriodType[Standard]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(periodParser66);
        org.junit.Assert.assertNull(locale67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "PeriodType[Standard]" + "'", str69, "PeriodType[Standard]");
        org.junit.Assert.assertNotNull(periodType70);
    }

    @Test
    public void test16539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16539");
        org.joda.time.Period period8 = new org.joda.time.Period(7, 10, 9, 52, (int) (byte) 100, 15, 2, 7200010);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period19 = org.joda.time.Period.days((-1));
        org.joda.time.Period period21 = period19.withWeeks((int) 'a');
        java.lang.String str22 = period19.toString();
        mutablePeriod17.setPeriod((org.joda.time.ReadablePeriod) period19);
        int int24 = mutablePeriod17.getMillis();
        org.joda.time.MutablePeriod mutablePeriod25 = mutablePeriod17.toMutablePeriod();
        mutablePeriod17.addHours((int) (short) 100);
        mutablePeriod17.setPeriod(11, 0, (int) (byte) 0, 0, 59, (int) '4', (int) '4', 3600010);
        org.joda.time.Period period37 = period8.withFields((org.joda.time.ReadablePeriod) mutablePeriod17);
        java.lang.Object obj41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType43 = period42.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(obj41, periodType43);
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) 1, periodType46, chronology51);
        org.joda.time.DateTimeField dateTimeField53 = chronology51.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone54 = chronology51.getZone();
        org.joda.time.DateTimeField dateTimeField55 = chronology51.minuteOfHour();
        org.joda.time.Chronology chronology56 = chronology51.withUTC();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 44, (-10L), periodType43, chronology56);
        org.joda.time.DateTimeField dateTimeField58 = chronology56.dayOfYear();
        org.joda.time.DateTimeField dateTimeField59 = chronology56.clockhourOfHalfday();
        mutablePeriod17.setPeriod((long) 12, chronology56);
        org.joda.time.DateTimeField dateTimeField61 = chronology56.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField62 = chronology56.yearOfEra();
        long long64 = dateTimeField62.roundFloor(1180587538124946L);
        long long66 = dateTimeField62.roundCeiling((-1005246806398561L));
        java.util.Locale locale68 = null;
        java.lang.String str69 = dateTimeField62.getAsShortText(53, locale68);
        long long72 = dateTimeField62.set((-2494L), 2078571);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "P-1D" + "'", str22, "P-1D");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod25);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1180577203200000L + "'", long64 == 1180577203200000L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-1005246720000000L) + "'", long66 == (-1005246720000000L));
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "53" + "'", str69, "53");
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 65531229638397506L + "'", long72 == 65531229638397506L);
    }

    @Test
    public void test16540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16540");
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.yearOfCentury();
        org.joda.time.Period period11 = new org.joda.time.Period(0L, 1645455288112L, chronology8);
        org.joda.time.DateTimeField dateTimeField12 = chronology8.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.Instant instant16 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 1, periodType19, chronology24);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) '4', chronology24);
        org.joda.time.ReadablePartial readablePartial27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.withFields(readablePartial27);
        boolean boolean29 = instant16.isAfter((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime.Property property30 = dateTime26.dayOfWeek();
        boolean boolean31 = dateTimeZone15.equals((java.lang.Object) dateTime26);
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval38 = mutableInterval37.toInterval();
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) 1, periodType34, chronology39);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) '4', chronology39);
        org.joda.time.ReadablePartial readablePartial42 = null;
        org.joda.time.DateTime dateTime43 = dateTime41.withFields(readablePartial42);
        org.joda.time.DateTime.Property property44 = dateTime43.millisOfDay();
        org.joda.time.DateTime dateTime45 = dateTime43.withEarlierOffsetAtOverlap();
        int int46 = dateTime43.getDayOfWeek();
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        org.joda.time.Chronology chronology53 = interval52.getChronology();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) 1, periodType48, chronology53);
        org.joda.time.DateTimeField dateTimeField55 = chronology53.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone56 = chronology53.getZone();
        org.joda.time.DateTime dateTime57 = dateTime43.withChronology(chronology53);
        org.joda.time.Minutes minutes59 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType60 = null;
        int int61 = minutes59.get(durationFieldType60);
        int int63 = minutes59.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod64 = minutes59.toMutablePeriod();
        long long67 = chronology53.add((org.joda.time.ReadablePeriod) mutablePeriod64, (long) '#', (int) (short) 10);
        org.joda.time.Period period68 = mutablePeriod64.toPeriod();
        boolean boolean69 = dateTimeZone15.equals((java.lang.Object) mutablePeriod64);
        mutablePeriod64.setMillis((-2147483648));
        long long74 = chronology8.add((org.joda.time.ReadablePeriod) mutablePeriod64, 1482159715681L, 133920);
        org.joda.time.DurationField durationField75 = chronology8.centuries();
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(minutes59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertNotNull(mutablePeriod64);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 6000035L + "'", long67 == 6000035L);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + (-286028498424479L) + "'", long74 == (-286028498424479L));
        org.junit.Assert.assertNotNull(durationField75);
    }

    @Test
    public void test16541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16541");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Period period15 = org.joda.time.Period.days((-1));
        org.joda.time.Period period17 = period15.withWeeks((int) 'a');
        org.joda.time.Period period19 = period15.plusMonths((int) (short) -1);
        org.joda.time.Period period21 = period15.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime22 = dateTime10.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Instant instant23 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 1, periodType26, chronology31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) '4', chronology31);
        org.joda.time.ReadablePartial readablePartial34 = null;
        org.joda.time.DateTime dateTime35 = dateTime33.withFields(readablePartial34);
        boolean boolean36 = instant23.isAfter((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Duration duration37 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval44 = mutableInterval43.toInterval();
        org.joda.time.Chronology chronology45 = interval44.getChronology();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) 1, periodType40, chronology45);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) '4', chronology45);
        org.joda.time.ReadablePartial readablePartial48 = null;
        org.joda.time.DateTime dateTime49 = dateTime47.withFields(readablePartial48);
        org.joda.time.DateTime.Property property50 = dateTime49.millisOfDay();
        org.joda.time.DateTime dateTime51 = dateTime49.withEarlierOffsetAtOverlap();
        int int52 = dateTime49.getDayOfWeek();
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval58 = mutableInterval57.toInterval();
        org.joda.time.Chronology chronology59 = interval58.getChronology();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) 1, periodType54, chronology59);
        org.joda.time.DateTimeField dateTimeField61 = chronology59.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone62 = chronology59.getZone();
        org.joda.time.DateTime dateTime63 = dateTime49.withChronology(chronology59);
        org.joda.time.Interval interval64 = duration37.toIntervalTo((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Instant instant66 = instant23.withDurationAdded((org.joda.time.ReadableDuration) duration37, 42);
        org.joda.time.Duration duration67 = duration37.toDuration();
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableDuration) duration37);
        org.joda.time.Seconds seconds69 = duration37.toStandardSeconds();
        org.joda.time.Seconds seconds71 = seconds69.multipliedBy((int) (byte) 100);
        org.joda.time.Seconds seconds73 = org.joda.time.Seconds.seconds(0);
        org.joda.time.Seconds seconds74 = seconds71.plus(seconds73);
        org.joda.time.Seconds seconds76 = seconds74.dividedBy(36);
        java.lang.String str77 = seconds76.toString();
        org.joda.time.Seconds seconds78 = org.joda.time.Seconds.MIN_VALUE;
        java.lang.String str79 = seconds78.toString();
        org.joda.time.Seconds seconds80 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) seconds78);
        org.joda.time.Seconds seconds82 = seconds78.multipliedBy(0);
        boolean boolean83 = seconds76.isGreaterThan(seconds82);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(instant66);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(seconds69);
        org.junit.Assert.assertNotNull(seconds71);
        org.junit.Assert.assertNotNull(seconds73);
        org.junit.Assert.assertNotNull(seconds74);
        org.junit.Assert.assertNotNull(seconds76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "PT0S" + "'", str77, "PT0S");
        org.junit.Assert.assertNotNull(seconds78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "PT-2147483648S" + "'", str79, "PT-2147483648S");
        org.junit.Assert.assertNotNull(seconds80);
        org.junit.Assert.assertNotNull(seconds82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test16542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16542");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(954, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16543");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getMillisOfDay();
        org.joda.time.DateTime dateTime5 = dateTime2.plusMillis((int) '#');
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval12 = mutableInterval11.toInterval();
        org.joda.time.Chronology chronology13 = interval12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 1, periodType8, chronology13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', chronology13);
        org.joda.time.DateTime dateTime16 = dateTime5.withChronology(chronology13);
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(chronology13);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.millis();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period30 = org.joda.time.Period.days((-1));
        org.joda.time.Period period32 = period30.withWeeks((int) 'a');
        java.lang.String str33 = period30.toString();
        mutablePeriod28.setPeriod((org.joda.time.ReadablePeriod) period30);
        mutablePeriod28.addMonths((int) (short) -1);
        org.joda.time.Period period38 = org.joda.time.Period.days((-1));
        org.joda.time.Period period40 = period38.withWeeks((int) 'a');
        org.joda.time.Period period42 = period38.plusMonths((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType43 = null;
        boolean boolean44 = period42.isSupported(durationFieldType43);
        mutablePeriod28.add((org.joda.time.ReadablePeriod) period42);
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval53 = mutableInterval52.toInterval();
        org.joda.time.Chronology chronology54 = interval53.getChronology();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) 1, periodType49, chronology54);
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) '4', chronology54);
        org.joda.time.DurationField durationField57 = chronology54.centuries();
        mutablePeriod28.add((long) (short) 10, chronology54);
        org.joda.time.DateTimeField dateTimeField59 = chronology54.clockhourOfDay();
        org.joda.time.DurationField durationField60 = durationFieldType19.getField(chronology54);
        org.joda.time.DateTimeField dateTimeField61 = chronology54.yearOfEra();
        org.joda.time.DurationField durationField62 = chronology54.days();
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((long) 2022, chronology54);
        org.joda.time.DateTimeZone dateTimeZone64 = chronology54.getZone();
        org.joda.time.DateTimeField dateTimeField65 = chronology54.millisOfDay();
        org.joda.time.DateTime dateTime66 = dateTime17.toDateTime(chronology54);
        org.joda.time.DateTime dateTime69 = dateTime17.withDurationAdded((long) (-3600010), 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3600010 + "'", int3 == 3600010);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "P-1D" + "'", str33, "P-1D");
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(durationField60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(durationField62);
        org.junit.Assert.assertNotNull(dateTimeZone64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTime69);
    }

    @Test
    public void test16544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16544");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval9);
        long long13 = mutableInterval9.getEndMillis();
        org.joda.time.DateTime dateTime14 = mutableInterval9.getEnd();
        org.joda.time.Chronology chronology15 = mutableInterval9.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.dayOfWeek();
        org.joda.time.DurationField durationField19 = chronology15.hours();
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test16545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16545");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours(57574);
        org.junit.Assert.assertNotNull(hours1);
    }

    @Test
    public void test16546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16546");
        java.lang.Object obj0 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        org.joda.time.Chronology chronology9 = interval8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 1, periodType4, chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.yearOfCentury();
        org.joda.time.Period period12 = new org.joda.time.Period((long) (byte) 100, (-6380815651200000L), chronology9);
        org.joda.time.DateTimeField dateTimeField13 = chronology9.era();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj0, chronology9);
        org.joda.time.DurationField durationField15 = chronology9.weekyears();
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test16547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16547");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        java.util.Locale locale8 = null;
        int int9 = property6.getMaximumTextLength(locale8);
        org.joda.time.DateTime dateTime10 = property6.roundCeilingCopy();
        int int11 = property6.getMinimumValueOverall();
        java.lang.String str12 = property6.toString();
        org.joda.time.DateTime dateTime14 = property6.addToCopy((long) 2078571);
        org.joda.time.DateTime dateTime16 = property6.addToCopy((long) 1969);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime16.getZone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[dayOfYear]" + "'", str12, "Property[dayOfYear]");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test16548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16548");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType2 = null;
        int int3 = minutes1.get(durationFieldType2);
        int int5 = minutes1.getValue(0);
        org.joda.time.Minutes minutes6 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes8 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType9 = null;
        int int10 = minutes8.get(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType11 = minutes8.getFieldType();
        boolean boolean12 = minutes6.isGreaterThan(minutes8);
        org.joda.time.Minutes minutes14 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType15 = null;
        int int16 = minutes14.get(durationFieldType15);
        org.joda.time.DurationFieldType durationFieldType17 = minutes14.getFieldType();
        boolean boolean18 = minutes6.isLessThan(minutes14);
        org.joda.time.Minutes minutes20 = minutes6.multipliedBy(0);
        org.joda.time.Minutes minutes22 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType23 = null;
        int int24 = minutes22.get(durationFieldType23);
        int int26 = minutes22.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod27 = minutes22.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType29 = minutes22.getFieldType(0);
        org.joda.time.Duration duration30 = minutes22.toStandardDuration();
        org.joda.time.Minutes minutes32 = minutes22.multipliedBy(3);
        boolean boolean33 = minutes20.isLessThan(minutes22);
        boolean boolean34 = minutes1.isLessThan(minutes20);
        org.joda.time.Minutes minutes35 = minutes1.negated();
        org.joda.time.Minutes minutes37 = minutes35.plus((-59));
        org.joda.time.Minutes minutes39 = minutes37.minus(40);
        org.joda.time.Minutes minutes40 = minutes37.negated();
        org.joda.time.DurationFieldType durationFieldType41 = minutes37.getFieldType();
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(mutablePeriod27);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(minutes35);
        org.junit.Assert.assertNotNull(minutes37);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(durationFieldType41);
    }

    @Test
    public void test16549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16549");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours(94);
        org.joda.time.Duration duration2 = hours1.toStandardDuration();
        int int3 = hours1.getHours();
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test16550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16550");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withFields(readablePartial10);
        org.joda.time.DateTime.Property property12 = dateTime11.millisOfDay();
        org.joda.time.DateTime dateTime13 = dateTime11.withEarlierOffsetAtOverlap();
        int int14 = dateTime11.getDayOfWeek();
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 1, periodType16, chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone24 = chronology21.getZone();
        org.joda.time.DateTime dateTime25 = dateTime11.withChronology(chronology21);
        int int26 = dateTime25.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        int int28 = dateTime25.get(dateTimeFieldType27);
        org.joda.time.DateTime dateTime30 = dateTime25.withYear((int) '#');
        org.joda.time.DateTime dateTime32 = dateTime30.plusMillis((-28050623));
        org.joda.time.DateTime.Property property33 = dateTime30.year();
        java.util.Locale locale34 = null;
        java.lang.String str35 = property33.getAsShortText(locale34);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1970 + "'", int26 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "35" + "'", str35, "35");
    }

    @Test
    public void test16551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16551");
        org.joda.time.Period period0 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType1 = period0.getPeriodType();
        org.joda.time.Period period3 = period0.minusMonths(10);
        org.joda.time.Instant instant4 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant7 = instant4.withDurationAdded(readableDuration5, 10);
        org.joda.time.Instant instant10 = instant4.withDurationAdded((-54432000000L), 3);
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) period0, (org.joda.time.ReadableInstant) instant10);
        org.joda.time.DateTime dateTime12 = mutableInterval11.getEnd();
        org.joda.time.DateTime dateTime14 = dateTime12.minus(55L);
        org.joda.time.DateTime dateTime16 = dateTime12.minusMonths((-3598));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime12.withSecondOfMinute(1956);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1956 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test16552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16552");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes(55);
        int int2 = minutes1.getMinutes();
        org.joda.time.DurationFieldType durationFieldType3 = minutes1.getFieldType();
        org.joda.time.Hours hours4 = minutes1.toStandardHours();
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 55 + "'", int2 == 55);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(hours4);
    }

    @Test
    public void test16553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16553");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) 'a');
        org.joda.time.Period period2 = period1.normalizedStandard();
        int int3 = period2.getMinutes();
        int int4 = period2.getMillis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds5 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) period2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert period to duration as years is not precise in the period P97Y");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test16554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16554");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours1 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours2 = hours0.minus(hours1);
        org.joda.time.Hours hours3 = org.joda.time.Hours.ONE;
        boolean boolean4 = hours0.isLessThan(hours3);
        org.joda.time.Duration duration5 = hours3.toStandardDuration();
        org.joda.time.DurationFieldType durationFieldType6 = hours3.getFieldType();
        java.lang.String str7 = hours3.toString();
        java.lang.String str8 = hours3.toString();
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Hours hours11 = org.joda.time.Hours.FIVE;
        org.joda.time.PeriodType periodType12 = hours11.getPeriodType();
        org.joda.time.Period period13 = period10.withFields((org.joda.time.ReadablePeriod) hours11);
        org.joda.time.Hours hours14 = org.joda.time.Hours.EIGHT;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period25 = org.joda.time.Period.days((-1));
        org.joda.time.Period period27 = period25.withWeeks((int) 'a');
        java.lang.String str28 = period25.toString();
        mutablePeriod23.setPeriod((org.joda.time.ReadablePeriod) period25);
        int int30 = mutablePeriod23.getMillis();
        org.joda.time.DurationFieldType durationFieldType32 = mutablePeriod23.getFieldType(0);
        int int33 = hours14.get(durationFieldType32);
        org.joda.time.Hours hours34 = hours11.minus(hours14);
        org.joda.time.Hours hours35 = hours34.negated();
        java.lang.String str36 = hours35.toString();
        org.joda.time.Hours hours37 = org.joda.time.Hours.EIGHT;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period48 = org.joda.time.Period.days((-1));
        org.joda.time.Period period50 = period48.withWeeks((int) 'a');
        java.lang.String str51 = period48.toString();
        mutablePeriod46.setPeriod((org.joda.time.ReadablePeriod) period48);
        int int53 = mutablePeriod46.getMillis();
        org.joda.time.DurationFieldType durationFieldType55 = mutablePeriod46.getFieldType(0);
        int int56 = hours37.get(durationFieldType55);
        org.joda.time.Duration duration57 = hours37.toStandardDuration();
        org.joda.time.Hours hours59 = hours37.minus(1439);
        org.joda.time.Period period60 = hours37.toPeriod();
        org.joda.time.Hours hours61 = hours35.minus(hours37);
        boolean boolean62 = hours3.isLessThan(hours37);
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval66 = mutableInterval65.toInterval();
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean70 = mutableInterval65.isBefore((org.joda.time.ReadableInterval) mutableInterval69);
        mutableInterval69.setEndMillis((long) 893);
        org.joda.time.Hours hours73 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) mutableInterval69);
        int int74 = hours73.getHours();
        org.joda.time.Hours hours76 = hours73.multipliedBy(3600);
        org.joda.time.Hours hours77 = hours3.minus(hours76);
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT1H" + "'", str7, "PT1H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT1H" + "'", str8, "PT1H");
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "P-1D" + "'", str28, "P-1D");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(hours34);
        org.junit.Assert.assertNotNull(hours35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PT3H" + "'", str36, "PT3H");
        org.junit.Assert.assertNotNull(hours37);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "P-1D" + "'", str51, "P-1D");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(durationFieldType55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(hours59);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(hours61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(hours73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(hours76);
        org.junit.Assert.assertNotNull(hours77);
    }

    @Test
    public void test16555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16555");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.Chronology chronology5 = interval4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology5.getZone();
        java.lang.String str8 = dateTimeZone6.getName(100L);
        org.joda.time.DateTime dateTime9 = dateTime0.withZoneRetainFields(dateTimeZone6);
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology14.getZone();
        java.lang.String str17 = dateTimeZone15.getName(100L);
        org.joda.time.DateTime dateTime18 = dateTime9.withZoneRetainFields(dateTimeZone15);
        org.joda.time.Minutes minutes19 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes21 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType22 = null;
        int int23 = minutes21.get(durationFieldType22);
        org.joda.time.DurationFieldType durationFieldType24 = minutes21.getFieldType();
        boolean boolean25 = minutes19.isGreaterThan(minutes21);
        org.joda.time.Minutes minutes27 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType28 = null;
        int int29 = minutes27.get(durationFieldType28);
        org.joda.time.DurationFieldType durationFieldType30 = minutes27.getFieldType();
        boolean boolean31 = minutes19.isLessThan(minutes27);
        org.joda.time.Minutes minutes33 = minutes19.multipliedBy(0);
        org.joda.time.DateTime dateTime34 = dateTime9.plus((org.joda.time.ReadablePeriod) minutes33);
        org.joda.time.Minutes minutes36 = minutes33.minus(7);
        org.joda.time.Duration duration37 = minutes33.toStandardDuration();
        org.joda.time.Minutes minutes39 = minutes33.plus((int) 'a');
        org.joda.time.Minutes minutes41 = minutes33.dividedBy(21);
        org.joda.time.Minutes minutes43 = minutes33.multipliedBy(3599999);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertNotNull(minutes43);
    }

    @Test
    public void test16556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16556");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval10 = mutableInterval9.toInterval();
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean14 = mutableInterval9.isBefore((org.joda.time.ReadableInterval) mutableInterval13);
        boolean boolean15 = mutableInterval6.contains((org.joda.time.ReadableInterval) mutableInterval13);
        org.joda.time.Weeks weeks16 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval13);
        org.joda.time.DateTime dateTime17 = dateTime2.plus((org.joda.time.ReadablePeriod) weeks16);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period28 = org.joda.time.Period.days((-1));
        org.joda.time.Period period30 = period28.withWeeks((int) 'a');
        java.lang.String str31 = period28.toString();
        mutablePeriod26.setPeriod((org.joda.time.ReadablePeriod) period28);
        int int33 = mutablePeriod26.getMillis();
        org.joda.time.MutablePeriod mutablePeriod34 = mutablePeriod26.toMutablePeriod();
        mutablePeriod26.addHours((int) (short) 100);
        mutablePeriod26.setPeriod(11, 0, (int) (byte) 0, 0, 59, (int) '4', (int) '4', 3600010);
        mutablePeriod26.setMillis(3600052);
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadablePeriod) mutablePeriod26);
        int int49 = dateTime2.getSecondOfDay();
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval55 = mutableInterval54.toInterval();
        org.joda.time.Chronology chronology56 = interval55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 1, periodType51, chronology56);
        org.joda.time.DateTime dateTime58 = dateTime2.toDateTime(chronology56);
        org.joda.time.DateTimeField dateTimeField59 = chronology56.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField60 = chronology56.dayOfMonth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "P-1D" + "'", str31, "P-1D");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod34);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3600 + "'", int49 == 3600);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(dateTimeField60);
    }

    @Test
    public void test16557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16557");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        mutableInterval2.setDurationAfterStart(0L);
        boolean boolean14 = mutableInterval2.containsNow();
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean25 = mutableInterval20.isBefore((org.joda.time.ReadableInterval) mutableInterval24);
        boolean boolean26 = mutableInterval17.contains((org.joda.time.ReadableInterval) mutableInterval24);
        mutableInterval17.setDurationAfterStart(0L);
        boolean boolean29 = mutableInterval17.containsNow();
        boolean boolean30 = mutableInterval2.isAfter((org.joda.time.ReadableInterval) mutableInterval17);
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean38 = mutableInterval33.isBefore((org.joda.time.ReadableInterval) mutableInterval37);
        mutableInterval37.setEndMillis((long) 893);
        org.joda.time.Hours hours41 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) mutableInterval37);
        boolean boolean42 = mutableInterval17.contains((org.joda.time.ReadableInterval) mutableInterval37);
        org.joda.time.Interval interval43 = mutableInterval17.toInterval();
        org.joda.time.Interval interval44 = mutableInterval17.toInterval();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(dateTimeZone47);
        org.joda.time.DateTime dateTime50 = dateTime48.withDayOfMonth(22);
        boolean boolean51 = mutableInterval17.isBefore((org.joda.time.ReadableInstant) dateTime50);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(hours41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test16558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16558");
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearMonthDayTime();
        java.lang.String str4 = periodType3.getName();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) (short) -1, periodType3);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period16 = org.joda.time.Period.days((-1));
        org.joda.time.Period period18 = period16.withWeeks((int) 'a');
        java.lang.String str19 = period16.toString();
        mutablePeriod14.setPeriod((org.joda.time.ReadablePeriod) period16);
        int int21 = mutablePeriod14.getMillis();
        org.joda.time.DurationFieldType durationFieldType23 = mutablePeriod14.getFieldType(0);
        int int24 = periodType3.indexOf(durationFieldType23);
        org.joda.time.PeriodType periodType25 = periodType3.withMinutesRemoved();
        org.joda.time.PeriodType periodType26 = periodType3.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period37 = org.joda.time.Period.days((-1));
        org.joda.time.Period period39 = period37.withWeeks((int) 'a');
        java.lang.String str40 = period37.toString();
        mutablePeriod35.setPeriod((org.joda.time.ReadablePeriod) period37);
        mutablePeriod35.addMonths((int) (short) -1);
        org.joda.time.Period period45 = org.joda.time.Period.days((-1));
        org.joda.time.Period period47 = period45.withWeeks((int) 'a');
        org.joda.time.Period period49 = period45.plusMonths((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType50 = null;
        boolean boolean51 = period49.isSupported(durationFieldType50);
        mutablePeriod35.add((org.joda.time.ReadablePeriod) period49);
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval60 = mutableInterval59.toInterval();
        org.joda.time.Chronology chronology61 = interval60.getChronology();
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((long) 1, periodType56, chronology61);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) '4', chronology61);
        org.joda.time.DurationField durationField64 = chronology61.centuries();
        mutablePeriod35.add((long) (short) 10, chronology61);
        org.joda.time.DateTimeField dateTimeField66 = chronology61.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone67 = chronology61.getZone();
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod(1645455251215L, 6048000049L, periodType3, chronology61);
        org.joda.time.PeriodType periodType69 = periodType3.withHoursRemoved();
        org.joda.time.Minutes minutes70 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes72 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType73 = null;
        int int74 = minutes72.get(durationFieldType73);
        int int76 = minutes72.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod77 = minutes72.toMutablePeriod();
        boolean boolean78 = minutes70.isLessThan(minutes72);
        org.joda.time.DateTimeZone dateTimeZone80 = null;
        org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone80);
        int int82 = dateTime81.getDayOfMonth();
        org.joda.time.DateTime dateTime84 = dateTime81.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime86 = dateTime84.withYear(0);
        org.joda.time.Interval interval87 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) minutes70, (org.joda.time.ReadableInstant) dateTime84);
        org.joda.time.DateTime.Property property88 = dateTime84.weekOfWeekyear();
        org.joda.time.DurationField durationField89 = property88.getRangeDurationField();
        boolean boolean90 = periodType69.equals((java.lang.Object) durationField89);
        org.joda.time.PeriodType periodType91 = periodType69.withMillisRemoved();
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "YearMonthDayTime" + "'", str4, "YearMonthDayTime");
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "P-1D" + "'", str19, "P-1D");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "P-1D" + "'", str40, "P-1D");
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(durationField64);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(dateTimeZone67);
        org.junit.Assert.assertNotNull(periodType69);
        org.junit.Assert.assertNotNull(minutes70);
        org.junit.Assert.assertNotNull(minutes72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 10 + "'", int76 == 10);
        org.junit.Assert.assertNotNull(mutablePeriod77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 5 + "'", int82 == 5);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(dateTime86);
        org.junit.Assert.assertNotNull(property88);
        org.junit.Assert.assertNotNull(durationField89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(periodType91);
    }

    @Test
    public void test16559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16559");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        java.util.Locale locale8 = null;
        int int9 = property6.getMaximumTextLength(locale8);
        java.lang.String str10 = property6.getAsText();
        org.joda.time.DateTime dateTime11 = property6.roundHalfEvenCopy();
        org.joda.time.Interval interval12 = property6.toInterval();
        int int13 = property6.getLeapAmount();
        java.util.Locale locale14 = null;
        int int15 = property6.getMaximumShortTextLength(locale14);
        int int16 = property6.getMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property6.getFieldType();
        org.joda.time.DateTime dateTime18 = property6.getDateTime();
        org.joda.time.DateTime dateTime19 = property6.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "5" + "'", str10, "5");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test16560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16560");
        org.joda.time.Interval interval2 = new org.joda.time.Interval(0L, (long) 100);
        org.joda.time.DateTime dateTime3 = interval2.getStart();
        int int4 = dateTime3.getMinuteOfDay();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
    }

    @Test
    public void test16561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16561");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((-100982246399976L));
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean9 = mutableInterval4.isBefore((org.joda.time.ReadableInterval) mutableInterval8);
        mutableInterval8.setEndMillis((long) 893);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean23 = mutableInterval18.isBefore((org.joda.time.ReadableInterval) mutableInterval22);
        boolean boolean24 = mutableInterval15.contains((org.joda.time.ReadableInterval) mutableInterval22);
        org.joda.time.Weeks weeks25 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval22);
        org.joda.time.Chronology chronology26 = mutableInterval22.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType12.getField(chronology26);
        mutableInterval8.setChronology(chronology26);
        org.joda.time.DateTimeField dateTimeField29 = chronology26.halfdayOfDay();
        org.joda.time.DateTime dateTime30 = dateTime1.withChronology(chronology26);
        org.joda.time.DateTime.Property property31 = dateTime30.centuryOfEra();
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
    }

    @Test
    public void test16562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16562");
        java.lang.Object obj0 = null;
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.millis();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period12 = org.joda.time.Period.days((-1));
        org.joda.time.Period period14 = period12.withWeeks((int) 'a');
        java.lang.String str15 = period12.toString();
        mutablePeriod10.setPeriod((org.joda.time.ReadablePeriod) period12);
        mutablePeriod10.addMonths((int) (short) -1);
        org.joda.time.Period period20 = org.joda.time.Period.days((-1));
        org.joda.time.Period period22 = period20.withWeeks((int) 'a');
        org.joda.time.Period period24 = period20.plusMonths((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType25 = null;
        boolean boolean26 = period24.isSupported(durationFieldType25);
        mutablePeriod10.add((org.joda.time.ReadablePeriod) period24);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.Chronology chronology36 = interval35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 1, periodType31, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) '4', chronology36);
        org.joda.time.DurationField durationField39 = chronology36.centuries();
        mutablePeriod10.add((long) (short) 10, chronology36);
        org.joda.time.DateTimeField dateTimeField41 = chronology36.clockhourOfDay();
        org.joda.time.DurationField durationField42 = durationFieldType1.getField(chronology36);
        org.joda.time.DateTimeField dateTimeField43 = chronology36.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone44 = chronology36.getZone();
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(dateTimeZone44);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(obj0, dateTimeZone44);
        int int48 = dateTime47.getYear();
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval55 = mutableInterval54.toInterval();
        org.joda.time.Chronology chronology56 = interval55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 1, periodType51, chronology56);
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) '4', chronology56);
        org.joda.time.ReadablePartial readablePartial59 = null;
        org.joda.time.DateTime dateTime60 = dateTime58.withFields(readablePartial59);
        org.joda.time.DateTime.Property property61 = dateTime60.millisOfDay();
        org.joda.time.DateTime dateTime63 = dateTime60.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property64 = dateTime60.era();
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval68 = mutableInterval67.toInterval();
        org.joda.time.Chronology chronology69 = interval68.getChronology();
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime(chronology69);
        int int71 = property64.compareTo((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.Interval interval72 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime47, (org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.Chronology chronology73 = interval72.getChronology();
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P-1D" + "'", str15, "P-1D");
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2022 + "'", int48 == 2022);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(interval68);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(chronology73);
    }

    @Test
    public void test16563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16563");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 26);
    }

    @Test
    public void test16564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16564");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone2);
        int int4 = dateTime3.getMillisOfDay();
        org.joda.time.DateTime dateTime6 = dateTime3.plusMillis((int) '#');
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 1, periodType9, chronology14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) '4', chronology14);
        org.joda.time.DateTime dateTime17 = dateTime6.withChronology(chronology14);
        java.lang.String str18 = chronology14.toString();
        org.joda.time.DateTimeField dateTimeField19 = chronology14.secondOfDay();
        org.joda.time.Period period20 = new org.joda.time.Period(17366400052L, chronology14);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3600010 + "'", int4 == 3600010);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ISOChronology[+97:00]" + "'", str18, "ISOChronology[+97:00]");
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test16565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16565");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(7, 9, 25, (int) (short) 1, 52, 4);
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval10 = mutableInterval9.toInterval();
        org.joda.time.Chronology chronology11 = interval10.getChronology();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekyear((int) (short) 1);
        org.joda.time.Duration duration15 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 1, periodType18, chronology23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) '4', chronology23);
        org.joda.time.ReadablePartial readablePartial26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.withFields(readablePartial26);
        org.joda.time.DateTime.Property property28 = dateTime27.millisOfDay();
        org.joda.time.DateTime dateTime29 = dateTime27.withEarlierOffsetAtOverlap();
        int int30 = dateTime27.getDayOfWeek();
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.Chronology chronology37 = interval36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 1, periodType32, chronology37);
        org.joda.time.DateTimeField dateTimeField39 = chronology37.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone40 = chronology37.getZone();
        org.joda.time.DateTime dateTime41 = dateTime27.withChronology(chronology37);
        org.joda.time.Interval interval42 = duration15.toIntervalTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period45 = duration15.toPeriodFrom((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Period period46 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType47 = period46.getPeriodType();
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableDuration) duration15, periodType47);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone50);
        int int52 = dateTime51.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone53 = dateTime51.getZone();
        org.joda.time.DateTime dateTime54 = dateTime12.withZone(dateTimeZone53);
        org.joda.time.Days days55 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval62 = mutableInterval61.toInterval();
        org.joda.time.Chronology chronology63 = interval62.getChronology();
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((long) 1, periodType58, chronology63);
        org.joda.time.Chronology chronology65 = chronology63.withUTC();
        org.joda.time.Period period66 = new org.joda.time.Period((long) (short) 100, chronology65);
        org.joda.time.DateTimeField dateTimeField67 = chronology65.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField68 = chronology65.millisOfDay();
        org.joda.time.DateTime dateTime69 = dateTime54.toDateTime(chronology65);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5 + "'", int52 == 5);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(days55);
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(dateTime69);
    }

    @Test
    public void test16566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16566");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime.Property property14 = dateTime10.dayOfWeek();
        org.joda.time.DateTime dateTime15 = property14.withMaximumValue();
        org.joda.time.Instant instant16 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 1, periodType19, chronology24);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) '4', chronology24);
        org.joda.time.ReadablePartial readablePartial27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.withFields(readablePartial27);
        boolean boolean29 = instant16.isAfter((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime.Property property30 = dateTime26.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone32);
        int int34 = dateTime33.getDayOfMonth();
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        org.joda.time.Chronology chronology41 = interval40.getChronology();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 1, periodType36, chronology41);
        org.joda.time.DateTimeField dateTimeField43 = chronology41.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone44 = chronology41.getZone();
        org.joda.time.DateTime dateTime45 = dateTime33.withZoneRetainFields(dateTimeZone44);
        org.joda.time.DateTime dateTime46 = dateTime26.withZone(dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = dateTime46.toDateTime(dateTimeZone47);
        org.joda.time.Days days49 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.Days days50 = org.joda.time.Days.TWO;
        org.joda.time.Days days52 = days50.multipliedBy(5);
        boolean boolean53 = days49.isLessThan(days50);
        org.joda.time.PeriodType periodType54 = days50.getPeriodType();
        org.joda.time.PeriodType periodType55 = periodType54.withMonthsRemoved();
        org.joda.time.PeriodType periodType56 = periodType54.withYearsRemoved();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 5 + "'", int34 == 5);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(days49);
        org.junit.Assert.assertNotNull(days50);
        org.junit.Assert.assertNotNull(days52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertNotNull(periodType56);
    }

    @Test
    public void test16567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16567");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone2);
        int int4 = dateTime3.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime3.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfYear();
        org.joda.time.DateTime dateTime8 = property7.roundHalfFloorCopy();
        boolean boolean9 = dateTime8.isAfterNow();
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.Minutes minutes11 = org.joda.time.Minutes.minutesIn(readableInterval10);
        org.joda.time.Minutes minutes13 = minutes11.multipliedBy((int) (byte) 10);
        org.joda.time.Minutes minutes15 = minutes13.dividedBy(3);
        org.joda.time.Minutes minutes16 = minutes15.negated();
        org.joda.time.DateTime dateTime17 = dateTime8.minus((org.joda.time.ReadablePeriod) minutes16);
        org.joda.time.DateTime.Property property18 = dateTime17.hourOfDay();
        org.joda.time.DateTime dateTime19 = property18.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight20 = dateTime19.toDateMidnight();
        org.joda.time.DateTime dateTime22 = dateTime19.plusDays((-59));
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone24);
        org.joda.time.DateTime dateTime26 = dateTime25.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property27 = dateTime26.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime26.getZone();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.DateTimeZone dateTimeZone35 = chronology34.getZone();
        java.lang.String str37 = dateTimeZone35.getName(100L);
        org.joda.time.DateTime dateTime38 = dateTime29.withZoneRetainFields(dateTimeZone35);
        org.joda.time.DateTime dateTime41 = dateTime38.withDurationAdded((long) 52, (int) (short) 1);
        int int42 = dateTimeZone28.getOffset((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTime dateTime43 = dateTime22.withZoneRetainFields(dateTimeZone28);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(480L, dateTimeZone28);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+97:00" + "'", str37, "+97:00");
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 349200000 + "'", int42 == 349200000);
        org.junit.Assert.assertNotNull(dateTime43);
    }

    @Test
    public void test16568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16568");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Period period15 = org.joda.time.Period.days((-1));
        org.joda.time.Period period17 = period15.withWeeks((int) 'a');
        org.joda.time.Period period19 = period15.plusMonths((int) (short) -1);
        org.joda.time.Period period21 = period15.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime22 = dateTime10.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 1, periodType25, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) '4', chronology30);
        org.joda.time.ReadablePartial readablePartial33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.withFields(readablePartial33);
        org.joda.time.DateTime.Property property35 = dateTime34.millisOfDay();
        org.joda.time.DateTime dateTime37 = dateTime34.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime39 = dateTime34.withCenturyOfEra((int) (short) 1);
        org.joda.time.Weeks weeks40 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int42 = dateTime34.get(dateTimeFieldType41);
        org.joda.time.DateTime dateTime44 = dateTime34.withYear((int) '4');
        int int45 = dateTime44.getCenturyOfEra();
        boolean boolean46 = dateTime44.isEqualNow();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(weeks40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5 + "'", int42 == 5);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test16569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16569");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = minutes2.get(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType5 = minutes2.getFieldType();
        boolean boolean6 = minutes0.isGreaterThan(minutes2);
        org.joda.time.Minutes minutes8 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType9 = null;
        int int10 = minutes8.get(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType11 = minutes8.getFieldType();
        boolean boolean12 = minutes0.isLessThan(minutes8);
        org.joda.time.Minutes minutes14 = minutes0.multipliedBy(0);
        org.joda.time.Minutes minutes16 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType17 = null;
        int int18 = minutes16.get(durationFieldType17);
        int int20 = minutes16.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod21 = minutes16.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType23 = minutes16.getFieldType(0);
        org.joda.time.Duration duration24 = minutes16.toStandardDuration();
        org.joda.time.Minutes minutes26 = minutes16.multipliedBy(3);
        boolean boolean27 = minutes14.isLessThan(minutes16);
        org.joda.time.Minutes minutes28 = minutes14.negated();
        org.joda.time.PeriodType periodType29 = minutes14.getPeriodType();
        org.joda.time.Minutes minutes30 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes32 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType33 = null;
        int int34 = minutes32.get(durationFieldType33);
        org.joda.time.DurationFieldType durationFieldType35 = minutes32.getFieldType();
        boolean boolean36 = minutes30.isGreaterThan(minutes32);
        org.joda.time.Minutes minutes38 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType39 = null;
        int int40 = minutes38.get(durationFieldType39);
        org.joda.time.DurationFieldType durationFieldType41 = minutes38.getFieldType();
        boolean boolean42 = minutes30.isLessThan(minutes38);
        org.joda.time.Minutes minutes44 = minutes30.multipliedBy(0);
        org.joda.time.Minutes minutes46 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType47 = null;
        int int48 = minutes46.get(durationFieldType47);
        int int50 = minutes46.getValue(0);
        org.joda.time.Minutes minutes51 = minutes30.minus(minutes46);
        boolean boolean52 = minutes14.isLessThan(minutes30);
        org.joda.time.Duration duration53 = minutes14.toStandardDuration();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(mutablePeriod21);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(minutes38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(minutes44);
        org.junit.Assert.assertNotNull(minutes46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertNotNull(minutes51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(duration53);
    }

    @Test
    public void test16570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16570");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withFields(readablePartial10);
        org.joda.time.DateTime.Property property12 = dateTime11.millisOfDay();
        org.joda.time.DateTime dateTime14 = dateTime11.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property15 = dateTime11.era();
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime19 = dateTime11.withDurationAdded((org.joda.time.ReadableDuration) duration17, 0);
        long long20 = duration17.getMillis();
        org.joda.time.Instant instant21 = org.joda.time.Instant.now();
        org.joda.time.Instant instant23 = instant21.minus(100L);
        org.joda.time.Instant instant25 = instant21.plus(5907461414400000042L);
        org.joda.time.Chronology chronology26 = instant21.getChronology();
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration17, (org.joda.time.ReadableInstant) instant21);
        org.joda.time.Duration duration28 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration29 = duration28.toDuration();
        org.joda.time.Minutes minutes30 = duration29.toStandardMinutes();
        org.joda.time.Duration duration32 = duration29.minus((-268234070400000L));
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 100, (long) 10, periodType35);
        mutablePeriod36.clear();
        org.joda.time.Instant instant38 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        org.joda.time.Chronology chronology46 = interval45.getChronology();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 1, periodType41, chronology46);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) '4', chronology46);
        org.joda.time.ReadablePartial readablePartial49 = null;
        org.joda.time.DateTime dateTime50 = dateTime48.withFields(readablePartial49);
        boolean boolean51 = instant38.isAfter((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.Duration duration52 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval59 = mutableInterval58.toInterval();
        org.joda.time.Chronology chronology60 = interval59.getChronology();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) 1, periodType55, chronology60);
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((long) '4', chronology60);
        org.joda.time.ReadablePartial readablePartial63 = null;
        org.joda.time.DateTime dateTime64 = dateTime62.withFields(readablePartial63);
        org.joda.time.DateTime.Property property65 = dateTime64.millisOfDay();
        org.joda.time.DateTime dateTime66 = dateTime64.withEarlierOffsetAtOverlap();
        int int67 = dateTime64.getDayOfWeek();
        org.joda.time.PeriodType periodType69 = null;
        org.joda.time.MutableInterval mutableInterval72 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval73 = mutableInterval72.toInterval();
        org.joda.time.Chronology chronology74 = interval73.getChronology();
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((long) 1, periodType69, chronology74);
        org.joda.time.DateTimeField dateTimeField76 = chronology74.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone77 = chronology74.getZone();
        org.joda.time.DateTime dateTime78 = dateTime64.withChronology(chronology74);
        org.joda.time.Interval interval79 = duration52.toIntervalTo((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.Instant instant81 = instant38.withDurationAdded((org.joda.time.ReadableDuration) duration52, 42);
        org.joda.time.Duration duration82 = duration52.toDuration();
        mutablePeriod36.add((org.joda.time.ReadableDuration) duration52);
        int int84 = duration29.compareTo((org.joda.time.ReadableDuration) duration52);
        long long85 = duration29.getMillis();
        long long86 = duration29.getMillis();
        org.joda.time.Duration duration87 = duration17.plus((org.joda.time.ReadableDuration) duration29);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10000L + "'", long20 == 10000L);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(interval73);
        org.junit.Assert.assertNotNull(chronology74);
        org.junit.Assert.assertNotNull(dateTimeField76);
        org.junit.Assert.assertNotNull(dateTimeZone77);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(interval79);
        org.junit.Assert.assertNotNull(instant81);
        org.junit.Assert.assertNotNull(duration82);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
        org.junit.Assert.assertNotNull(duration87);
    }

    @Test
    public void test16571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16571");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.yearOfEra();
        org.joda.time.DurationField durationField7 = chronology4.days();
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test16572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16572");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 1439, (long) (-20), periodType2);
        org.joda.time.Hours hours4 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours5 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours6 = hours4.minus(hours5);
        org.joda.time.Duration duration7 = hours5.toStandardDuration();
        org.joda.time.Duration duration9 = duration7.withMillis((long) (short) 1);
        org.joda.time.Duration duration10 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration11 = duration10.toDuration();
        org.joda.time.Duration duration13 = duration11.minus(3600L);
        boolean boolean14 = duration7.isLongerThan((org.joda.time.ReadableDuration) duration11);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 1, periodType17, chronology22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) '4', chronology22);
        org.joda.time.ReadablePartial readablePartial25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.withFields(readablePartial25);
        org.joda.time.DateTime.Property property27 = dateTime26.millisOfDay();
        org.joda.time.DateTime dateTime29 = dateTime26.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property30 = dateTime26.era();
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime34 = dateTime26.withDurationAdded((org.joda.time.ReadableDuration) duration32, 0);
        org.joda.time.Hours hours35 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours36 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours37 = hours35.minus(hours36);
        org.joda.time.Duration duration38 = hours36.toStandardDuration();
        org.joda.time.Duration duration39 = duration32.minus((org.joda.time.ReadableDuration) duration38);
        boolean boolean40 = duration7.isShorterThan((org.joda.time.ReadableDuration) duration38);
        org.joda.time.Duration duration42 = org.joda.time.Duration.millis((-31540579168L));
        org.joda.time.Period period44 = org.joda.time.Period.hours(0);
        org.joda.time.Duration duration45 = period44.toStandardDuration();
        int int46 = duration42.compareTo((org.joda.time.ReadableDuration) duration45);
        int int47 = duration38.compareTo((org.joda.time.ReadableDuration) duration45);
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration38);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(hours35);
        org.junit.Assert.assertNotNull(hours36);
        org.junit.Assert.assertNotNull(hours37);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test16573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16573");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = minutes2.get(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType5 = minutes2.getFieldType();
        boolean boolean6 = minutes0.isGreaterThan(minutes2);
        org.joda.time.Minutes minutes8 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType9 = null;
        int int10 = minutes8.get(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType11 = minutes8.getFieldType();
        boolean boolean12 = minutes0.isLessThan(minutes8);
        org.joda.time.Minutes minutes14 = minutes0.multipliedBy(0);
        org.joda.time.Minutes minutes16 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType17 = null;
        int int18 = minutes16.get(durationFieldType17);
        java.lang.Object obj19 = null;
        boolean boolean20 = minutes16.equals(obj19);
        org.joda.time.DurationFieldType durationFieldType21 = minutes16.getFieldType();
        org.joda.time.Minutes minutes23 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType24 = null;
        int int25 = minutes23.get(durationFieldType24);
        java.lang.Object obj26 = null;
        boolean boolean27 = minutes23.equals(obj26);
        org.joda.time.DurationFieldType durationFieldType28 = minutes23.getFieldType();
        boolean boolean29 = minutes16.isGreaterThan(minutes23);
        org.joda.time.Minutes minutes31 = minutes16.plus((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType32 = minutes16.getFieldType();
        boolean boolean33 = minutes0.isLessThan(minutes16);
        org.joda.time.Minutes minutes35 = minutes16.minus((int) 'a');
        org.joda.time.PeriodType periodType36 = minutes35.getPeriodType();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(minutes35);
        org.junit.Assert.assertNotNull(periodType36);
    }

    @Test
    public void test16574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16574");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes(1970);
        org.joda.time.DateTime dateTime13 = dateTime11.plusYears((int) '#');
        int int14 = dateTime11.getSecondOfMinute();
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test16575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16575");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Period period15 = org.joda.time.Period.days((-1));
        org.joda.time.Period period17 = period15.withWeeks((int) 'a');
        org.joda.time.Period period19 = period15.plusMonths((int) (short) -1);
        org.joda.time.Period period21 = period15.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime22 = dateTime10.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 1, periodType25, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) '4', chronology30);
        org.joda.time.ReadablePartial readablePartial33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.withFields(readablePartial33);
        org.joda.time.DateTime.Property property35 = dateTime34.millisOfDay();
        org.joda.time.DateTime dateTime36 = dateTime34.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone38);
        int int40 = dateTime39.getMillisOfDay();
        org.joda.time.DateTime dateTime42 = dateTime39.plusMillis((int) '#');
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 1, periodType45, chronology50);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) '4', chronology50);
        org.joda.time.DateTime dateTime53 = dateTime42.withChronology(chronology50);
        int int54 = dateTime53.getYearOfEra();
        int int55 = dateTime36.compareTo((org.joda.time.ReadableInstant) dateTime53);
        boolean boolean56 = dateTime22.isBefore((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTime dateTime58 = dateTime53.plusMinutes(2922789);
        org.joda.time.DateTime dateTime60 = dateTime58.plusMinutes((int) '4');
        org.joda.time.YearMonthDay yearMonthDay61 = dateTime60.toYearMonthDay();
        org.joda.time.Chronology chronology62 = yearMonthDay61.getChronology();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3600010 + "'", int40 == 3600010);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1970 + "'", int54 == 1970);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(yearMonthDay61);
        org.junit.Assert.assertNotNull(chronology62);
    }

    @Test
    public void test16576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16576");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withFields(readablePartial10);
        org.joda.time.DateTime.Property property12 = dateTime11.millisOfDay();
        org.joda.time.DateTime dateTime13 = dateTime11.withEarlierOffsetAtOverlap();
        int int14 = dateTime11.getDayOfWeek();
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 1, periodType16, chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone24 = chronology21.getZone();
        org.joda.time.DateTime dateTime25 = dateTime11.withChronology(chronology21);
        org.joda.time.Minutes minutes27 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType28 = null;
        int int29 = minutes27.get(durationFieldType28);
        int int31 = minutes27.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod32 = minutes27.toMutablePeriod();
        long long35 = chronology21.add((org.joda.time.ReadablePeriod) mutablePeriod32, (long) '#', (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField36 = chronology21.minuteOfDay();
        java.lang.String str38 = dateTimeField36.getAsShortText((long) 365);
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeField36.getAsShortText((-36001L), locale40);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(mutablePeriod32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 6000035L + "'", long35 == 6000035L);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "60" + "'", str38, "60");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "59" + "'", str41, "59");
    }

    @Test
    public void test16577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16577");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(57658006, 23, 31, 366, (-343), (-41), 57574);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 366 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16578");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withFields(readablePartial10);
        org.joda.time.DateTime.Property property12 = dateTime11.weekyear();
        org.joda.time.DateTime dateTime13 = property12.roundHalfCeilingCopy();
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardHours(0L);
        org.joda.time.DateTime dateTime17 = dateTime13.withDurationAdded((org.joda.time.ReadableDuration) duration15, (int) 'a');
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateTimeZone dateTimeZone24 = chronology23.getZone();
        java.lang.String str26 = dateTimeZone24.getName(100L);
        org.joda.time.DateTime dateTime27 = dateTime18.withZoneRetainFields(dateTimeZone24);
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.DateTimeZone dateTimeZone33 = chronology32.getZone();
        java.lang.String str35 = dateTimeZone33.getName(100L);
        org.joda.time.DateTime dateTime36 = dateTime27.withZoneRetainFields(dateTimeZone33);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        mutablePeriod45.add((long) 3);
        org.joda.time.DateTime dateTime48 = dateTime27.minus((org.joda.time.ReadablePeriod) mutablePeriod45);
        org.joda.time.DateTime.Property property49 = dateTime48.millisOfSecond();
        org.joda.time.Period period50 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType51 = period50.getPeriodType();
        int int52 = periodType51.size();
        org.joda.time.PeriodType periodType53 = periodType51.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime48, periodType51);
        org.joda.time.DateTime dateTime56 = dateTime48.plusDays((int) (byte) 0);
        org.joda.time.DateTime dateTime57 = dateTime48.withTimeAtStartOfDay();
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+97:00" + "'", str26, "+97:00");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+97:00" + "'", str35, "+97:00");
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 8 + "'", int52 == 8);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime57);
    }

    @Test
    public void test16579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16579");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        boolean boolean6 = dateTime2.isEqual((long) 3);
        boolean boolean8 = dateTime2.equals((java.lang.Object) 56L);
        org.joda.time.DateTime dateTime10 = dateTime2.plusWeeks(100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusWeeks(4);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int14 = dateTime10.get(dateTimeFieldType13);
        org.joda.time.DateTime dateTime16 = dateTime10.withMillisOfSecond((int) (short) 100);
        int int17 = dateTime16.getMinuteOfDay();
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(6216719587200001L, dateTimeZone20);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        org.joda.time.Chronology chronology27 = interval26.getChronology();
        org.joda.time.DateTimeZone dateTimeZone28 = chronology27.getZone();
        java.lang.String str30 = dateTimeZone28.getName(100L);
        org.joda.time.DateTime dateTime31 = dateTime22.withZoneRetainFields(dateTimeZone28);
        java.lang.String str32 = dateTimeZone28.getID();
        long long34 = dateTimeZone20.getMillisKeepLocal(dateTimeZone28, (-10L));
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime16.toMutableDateTime(dateTimeZone20);
        org.joda.time.Instant instant36 = mutableDateTime35.toInstant();
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+97:00" + "'", str30, "+97:00");
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+97:00" + "'", str32, "+97:00");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-10L) + "'", long34 == (-10L));
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(instant36);
    }

    @Test
    public void test16580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16580");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Period period15 = org.joda.time.Period.days((-1));
        org.joda.time.Period period17 = period15.withWeeks((int) 'a');
        org.joda.time.Period period19 = period15.plusMonths((int) (short) -1);
        org.joda.time.Period period21 = period15.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime22 = dateTime10.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 1, periodType25, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) '4', chronology30);
        org.joda.time.ReadablePartial readablePartial33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.withFields(readablePartial33);
        org.joda.time.DateTime.Property property35 = dateTime34.millisOfDay();
        org.joda.time.DateTime dateTime37 = dateTime34.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime39 = dateTime34.withCenturyOfEra((int) (short) 1);
        org.joda.time.Weeks weeks40 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime.Property property41 = dateTime10.centuryOfEra();
        org.joda.time.DateTime dateTime42 = dateTime10.withLaterOffsetAtOverlap();
        int int43 = dateTime10.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime45 = dateTime10.minusDays(3599);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(weeks40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(dateTime45);
    }

    @Test
    public void test16581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16581");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MIN_VALUE;
        org.joda.time.PeriodType periodType1 = hours0.getPeriodType();
        int int2 = periodType1.size();
        org.joda.time.PeriodType periodType3 = periodType1.withMinutesRemoved();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test16582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16582");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours1 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours2 = hours0.minus(hours1);
        org.joda.time.Duration duration3 = hours1.toStandardDuration();
        org.joda.time.Duration duration4 = duration3.toDuration();
        org.joda.time.Duration duration6 = duration3.minus(1180587538124946L);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.Instant instant9 = instant7.minus(100L);
        org.joda.time.Instant instant11 = instant7.plus(5907461414400000042L);
        org.joda.time.Chronology chronology12 = instant7.getChronology();
        org.joda.time.Instant instant14 = instant7.minus(1645541753832L);
        org.joda.time.Period period15 = duration6.toPeriodFrom((org.joda.time.ReadableInstant) instant7);
        org.joda.time.MutableDateTime mutableDateTime16 = instant7.toMutableDateTime();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
    }

    @Test
    public void test16583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16583");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((-600));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test16584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16584");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (-86400));
        java.lang.String str2 = instant1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1969-12-31T23:58:33.600Z" + "'", str2, "1969-12-31T23:58:33.600Z");
    }

    @Test
    public void test16585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16585");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Period period14 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType15 = period14.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) '#', 100L, periodType15);
        org.joda.time.Period period17 = mutableInterval9.toPeriod(periodType15);
        org.joda.time.Period period19 = period17.withMinutes(3600);
        org.joda.time.Period period21 = period19.minusHours(954);
        org.joda.time.Period period23 = period21.plusMonths(0);
        int int24 = period21.getMonths();
        int[] intArray25 = period21.getValues();
        java.lang.String str26 = period21.toString();
        org.joda.time.Period period28 = period21.minusSeconds((-9));
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 0, 0, -954, 3600, 0, 53]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PT-954H3600M0.053S" + "'", str26, "PT-954H3600M0.053S");
        org.junit.Assert.assertNotNull(period28);
    }

    @Test
    public void test16586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16586");
        org.joda.time.Hours hours0 = org.joda.time.Hours.EIGHT;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period11 = org.joda.time.Period.days((-1));
        org.joda.time.Period period13 = period11.withWeeks((int) 'a');
        java.lang.String str14 = period11.toString();
        mutablePeriod9.setPeriod((org.joda.time.ReadablePeriod) period11);
        int int16 = mutablePeriod9.getMillis();
        org.joda.time.DurationFieldType durationFieldType18 = mutablePeriod9.getFieldType(0);
        int int19 = hours0.get(durationFieldType18);
        org.joda.time.Hours hours21 = hours0.multipliedBy(100);
        org.joda.time.Hours hours22 = hours0.negated();
        org.joda.time.Hours hours24 = hours22.minus((int) '4');
        org.joda.time.Hours hours25 = hours24.negated();
        org.joda.time.PeriodType periodType26 = hours24.getPeriodType();
        org.joda.time.Hours hours28 = hours24.multipliedBy((-1440));
        org.joda.time.PeriodType periodType29 = hours24.getPeriodType();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "P-1D" + "'", str14, "P-1D");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(hours24);
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(hours28);
        org.junit.Assert.assertNotNull(periodType29);
    }

    @Test
    public void test16587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16587");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        mutablePeriod8.add((long) 3);
        mutablePeriod8.setYears((int) (byte) 0);
        java.lang.Object obj13 = mutablePeriod8.clone();
        int int14 = mutablePeriod8.getMonths();
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean25 = mutableInterval20.isBefore((org.joda.time.ReadableInterval) mutableInterval24);
        boolean boolean26 = mutableInterval17.contains((org.joda.time.ReadableInterval) mutableInterval24);
        mutableInterval17.setDurationAfterStart(0L);
        boolean boolean29 = mutableInterval17.containsNow();
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean40 = mutableInterval35.isBefore((org.joda.time.ReadableInterval) mutableInterval39);
        boolean boolean41 = mutableInterval32.contains((org.joda.time.ReadableInterval) mutableInterval39);
        mutableInterval32.setDurationAfterStart(0L);
        boolean boolean44 = mutableInterval32.containsNow();
        boolean boolean45 = mutableInterval17.isAfter((org.joda.time.ReadableInterval) mutableInterval32);
        org.joda.time.Duration duration46 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration47 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.Chronology chronology55 = interval54.getChronology();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) 1, periodType50, chronology55);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) '4', chronology55);
        org.joda.time.ReadablePartial readablePartial58 = null;
        org.joda.time.DateTime dateTime59 = dateTime57.withFields(readablePartial58);
        org.joda.time.DateTime.Property property60 = dateTime59.millisOfDay();
        org.joda.time.DateTime dateTime61 = dateTime59.withEarlierOffsetAtOverlap();
        int int62 = dateTime59.getDayOfWeek();
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval68 = mutableInterval67.toInterval();
        org.joda.time.Chronology chronology69 = interval68.getChronology();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) 1, periodType64, chronology69);
        org.joda.time.DateTimeField dateTimeField71 = chronology69.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone72 = chronology69.getZone();
        org.joda.time.DateTime dateTime73 = dateTime59.withChronology(chronology69);
        org.joda.time.Interval interval74 = duration47.toIntervalTo((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period77 = duration47.toPeriodFrom((org.joda.time.ReadableInstant) dateTime76);
        boolean boolean78 = duration46.isShorterThan((org.joda.time.ReadableDuration) duration47);
        mutableInterval17.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration47);
        org.joda.time.ReadableInterval readableInterval80 = null;
        boolean boolean81 = mutableInterval17.isBefore(readableInterval80);
        mutableInterval17.setEndMillis((long) 10);
        boolean boolean84 = mutableInterval17.isBeforeNow();
        mutablePeriod8.add((org.joda.time.ReadableInterval) mutableInterval17);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "P100M10WT1H10.013S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "P100M10WT1H10.013S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "P100M10WT1H10.013S");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(interval68);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(dateTimeZone72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(interval74);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test16588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16588");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 16);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType4 = periodType3.withMonthsRemoved();
        org.joda.time.Minutes minutes6 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType7 = null;
        int int8 = minutes6.get(durationFieldType7);
        int int10 = minutes6.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod11 = minutes6.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType13 = minutes6.getFieldType(0);
        boolean boolean14 = periodType4.equals((java.lang.Object) minutes6);
        org.joda.time.MutablePeriod mutablePeriod15 = minutes6.toMutablePeriod();
        org.joda.time.Duration duration16 = minutes6.toStandardDuration();
        org.joda.time.Instant instant17 = instant1.plus((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Instant instant18 = instant1.toInstant();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(mutablePeriod15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(instant18);
    }

    @Test
    public void test16589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16589");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds((int) (short) 100);
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds4 = seconds2.plus(954);
        org.joda.time.Seconds seconds5 = seconds2.negated();
        boolean boolean6 = seconds1.isLessThan(seconds2);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test16590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16590");
        org.joda.time.Period period0 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType1 = period0.getPeriodType();
        org.joda.time.Period period3 = period0.minusMonths(10);
        org.joda.time.Period period5 = period3.minusMillis(3600010);
        int int6 = period3.getYears();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test16591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16591");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.DateTime dateTime3 = mutableInterval2.getEnd();
        org.joda.time.DateTimeZone dateTimeZone4 = dateTime3.getZone();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone6);
        int int8 = dateTime7.getDayOfMonth();
        org.joda.time.DateTime dateTime10 = dateTime7.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime12 = dateTime10.withYear(0);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 1, periodType15, chronology20);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) '4', chronology20);
        org.joda.time.Instant instant23 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 1, periodType26, chronology31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) '4', chronology31);
        org.joda.time.ReadablePartial readablePartial34 = null;
        org.joda.time.DateTime dateTime35 = dateTime33.withFields(readablePartial34);
        boolean boolean36 = instant23.isAfter((org.joda.time.ReadableInstant) dateTime33);
        boolean boolean37 = dateTime22.isAfter((org.joda.time.ReadableInstant) dateTime33);
        java.lang.String str38 = dateTime22.toString();
        boolean boolean39 = dateTime12.isAfter((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.ReadableInstant readableInstant41 = null;
        boolean boolean42 = dateTime3.isBefore(readableInstant41);
        org.joda.time.DateTime dateTime44 = dateTime3.minusDays(23);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-05T01:00:00.052+97:00" + "'", str38, "1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(dateTime44);
    }

    @Test
    public void test16592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16592");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = minutes2.get(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType5 = minutes2.getFieldType();
        boolean boolean6 = minutes0.isGreaterThan(minutes2);
        org.joda.time.Minutes minutes8 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType9 = null;
        int int10 = minutes8.get(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType11 = minutes8.getFieldType();
        boolean boolean12 = minutes0.isLessThan(minutes8);
        org.joda.time.Minutes minutes14 = minutes0.multipliedBy(0);
        org.joda.time.Minutes minutes16 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType17 = null;
        int int18 = minutes16.get(durationFieldType17);
        int int20 = minutes16.getValue(0);
        org.joda.time.Minutes minutes21 = minutes0.minus(minutes16);
        java.lang.String str22 = minutes16.toString();
        org.joda.time.MutablePeriod mutablePeriod23 = minutes16.toMutablePeriod();
        int int24 = mutablePeriod23.getHours();
        mutablePeriod23.addWeeks(25975807);
        mutablePeriod23.setMillis(1645455581);
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PT10M" + "'", str22, "PT10M");
        org.junit.Assert.assertNotNull(mutablePeriod23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test16593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16593");
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfDay();
        org.joda.time.DateTime dateTime14 = dateTime12.withEarlierOffsetAtOverlap();
        int int15 = dateTime12.getDayOfWeek();
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 1, periodType17, chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone25 = chronology22.getZone();
        org.joda.time.DateTime dateTime26 = dateTime12.withChronology(chronology22);
        org.joda.time.DateTimeField dateTimeField27 = chronology22.weekOfWeekyear();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) 52, chronology22);
        org.joda.time.DateTimeField dateTimeField29 = chronology22.hourOfDay();
        org.joda.time.DurationField durationField30 = chronology22.days();
        int int32 = durationField30.getValue((-99656870399976L));
        long long33 = durationField30.getUnitMillis();
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1153435) + "'", int32 == (-1153435));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 86400000L + "'", long33 == 86400000L);
    }

    @Test
    public void test16594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16594");
        org.joda.time.Days days1 = org.joda.time.Days.days(43);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test16595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16595");
        org.joda.time.Days days1 = org.joda.time.Days.days(19);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test16596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16596");
        org.joda.time.Period period1 = org.joda.time.Period.days((-1));
        org.joda.time.Period period3 = period1.withWeeks((int) 'a');
        org.joda.time.Period period5 = period3.withDays(100);
        org.joda.time.Instant instant6 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 1, periodType9, chronology14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) '4', chronology14);
        org.joda.time.ReadablePartial readablePartial17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.withFields(readablePartial17);
        boolean boolean19 = instant6.isAfter((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property20 = dateTime16.dayOfWeek();
        boolean boolean21 = period5.equals((java.lang.Object) property20);
        org.joda.time.Period period22 = period5.toPeriod();
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = period22.withPeriodType(periodType23);
        org.joda.time.Period period26 = period22.withYears(57292823);
        org.joda.time.Period period28 = period26.plusSeconds(99);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
    }

    @Test
    public void test16597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16597");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval1 = org.joda.time.MutableInterval.parse("PT1645455247.947S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format requires a '/' separator: PT1645455247.947S");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16598");
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.yearOfCentury();
        org.joda.time.Period period11 = new org.joda.time.Period((long) (byte) 100, (-6380815651200000L), chronology8);
        org.joda.time.Period period13 = period11.withHours(21);
        org.joda.time.Period period15 = period13.plusHours(13);
        org.joda.time.Period period17 = period15.plusMonths(957);
        org.joda.time.Period period19 = period15.withYears(953);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test16599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16599");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime7 = dateTime5.withYear(0);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 1, periodType10, chronology15);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) '4', chronology15);
        org.joda.time.Instant instant18 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        org.joda.time.Chronology chronology26 = interval25.getChronology();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 1, periodType21, chronology26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) '4', chronology26);
        org.joda.time.ReadablePartial readablePartial29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.withFields(readablePartial29);
        boolean boolean31 = instant18.isAfter((org.joda.time.ReadableInstant) dateTime28);
        boolean boolean32 = dateTime17.isAfter((org.joda.time.ReadableInstant) dateTime28);
        java.lang.String str33 = dateTime17.toString();
        boolean boolean34 = dateTime7.isAfter((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) 100, (long) 10, periodType39);
        mutablePeriod40.addMonths(0);
        mutablePeriod40.setSeconds((int) (byte) 0);
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval53 = mutableInterval52.toInterval();
        org.joda.time.Chronology chronology54 = interval53.getChronology();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) 1, periodType49, chronology54);
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) '4', chronology54);
        org.joda.time.DurationField durationField57 = chronology54.centuries();
        org.joda.time.DateTimeField dateTimeField58 = chronology54.secondOfDay();
        mutablePeriod40.setPeriod(1L, 355200035L, chronology54);
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) 44, 349200000L, chronology54);
        org.joda.time.DateTimeField dateTimeField61 = chronology54.clockhourOfHalfday();
        org.joda.time.DateTime dateTime62 = dateTime7.toDateTime(chronology54);
        org.joda.time.DateTime dateTime64 = dateTime62.withDayOfYear(11);
        org.joda.time.DateTime dateTime65 = dateTime62.toDateTimeISO();
        org.joda.time.DateTime dateTime67 = dateTime65.minus((long) 8);
        int int68 = dateTime67.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone70);
        int int72 = dateTime71.getMillisOfDay();
        org.joda.time.DateTime dateTime74 = dateTime71.plusMillis((int) '#');
        int int75 = dateTime71.getYearOfEra();
        int int76 = dateTime71.getYear();
        long long77 = dateTime71.getMillis();
        org.joda.time.Hours hours78 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) dateTime67, (org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.Hours hours80 = hours78.minus(307);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-05T01:00:00.052+97:00" + "'", str33, "1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3600002 + "'", int68 == 3600002);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 3600010 + "'", int72 == 3600010);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1970 + "'", int75 == 1970);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1970 + "'", int76 == 1970);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 10L + "'", long77 == 10L);
        org.junit.Assert.assertNotNull(hours78);
        org.junit.Assert.assertNotNull(hours80);
    }

    @Test
    public void test16600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16600");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Period period15 = org.joda.time.Period.days((-1));
        org.joda.time.Period period17 = period15.withWeeks((int) 'a');
        org.joda.time.Period period19 = period15.plusMonths((int) (short) -1);
        org.joda.time.Period period21 = period15.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime22 = dateTime10.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 1, periodType25, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) '4', chronology30);
        org.joda.time.ReadablePartial readablePartial33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.withFields(readablePartial33);
        org.joda.time.DateTime.Property property35 = dateTime34.millisOfDay();
        org.joda.time.DateTime dateTime37 = dateTime34.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime39 = dateTime34.withCenturyOfEra((int) (short) 1);
        org.joda.time.Weeks weeks40 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime42 = dateTime10.minusYears(20);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType44 = dateTimeFieldType43.getRangeDurationType();
        boolean boolean45 = dateTime42.isSupported(dateTimeFieldType43);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType47 = dateTimeFieldType46.getRangeDurationType();
        java.lang.String str48 = durationFieldType47.getName();
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        org.joda.time.Chronology chronology53 = interval52.getChronology();
        org.joda.time.DurationField durationField54 = durationFieldType47.getField(chronology53);
        org.joda.time.DateTimeField dateTimeField55 = dateTimeFieldType43.getField(chronology53);
        org.joda.time.DateTimeField dateTimeField56 = chronology53.year();
        org.joda.time.DurationField durationField57 = chronology53.weeks();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(weeks40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertNotNull(durationFieldType47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "weekyears" + "'", str48, "weekyears");
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(durationField57);
    }

    @Test
    public void test16601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16601");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval10 = mutableInterval9.toInterval();
        org.joda.time.Chronology chronology11 = interval10.getChronology();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 1, periodType6, chronology11);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) '4', chronology11);
        org.joda.time.ReadablePartial readablePartial14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.withFields(readablePartial14);
        boolean boolean16 = instant3.isAfter((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime.Property property17 = dateTime13.dayOfWeek();
        boolean boolean18 = dateTimeZone2.equals((java.lang.Object) dateTime13);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        org.joda.time.Chronology chronology26 = interval25.getChronology();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 1, periodType21, chronology26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) '4', chronology26);
        org.joda.time.ReadablePartial readablePartial29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.withFields(readablePartial29);
        org.joda.time.DateTime.Property property31 = dateTime30.millisOfDay();
        org.joda.time.DateTime dateTime32 = dateTime30.withEarlierOffsetAtOverlap();
        int int33 = dateTime30.getDayOfWeek();
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval39 = mutableInterval38.toInterval();
        org.joda.time.Chronology chronology40 = interval39.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 1, periodType35, chronology40);
        org.joda.time.DateTimeField dateTimeField42 = chronology40.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone43 = chronology40.getZone();
        org.joda.time.DateTime dateTime44 = dateTime30.withChronology(chronology40);
        org.joda.time.Minutes minutes46 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType47 = null;
        int int48 = minutes46.get(durationFieldType47);
        int int50 = minutes46.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod51 = minutes46.toMutablePeriod();
        long long54 = chronology40.add((org.joda.time.ReadablePeriod) mutablePeriod51, (long) '#', (int) (short) 10);
        org.joda.time.Period period55 = mutablePeriod51.toPeriod();
        boolean boolean56 = dateTimeZone2.equals((java.lang.Object) mutablePeriod51);
        mutablePeriod51.addMillis(0);
        mutablePeriod51.setPeriod(3599999, (int) (byte) 10, 894, 57423, 133920, 53, (-954), (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds68 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) mutablePeriod51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert period to duration as years is not precise in the period P3599999Y10M894W57423DT133920H53M-954.001S");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(minutes46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertNotNull(mutablePeriod51);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 6000035L + "'", long54 == 6000035L);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test16602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16602");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 100, (long) 10, periodType2);
        mutablePeriod3.setMonths((int) (byte) -1);
        mutablePeriod3.clear();
        mutablePeriod3.setHours(69);
    }

    @Test
    public void test16603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16603");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 6, 1944000000L);
        long long3 = duration2.getStandardHours();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 539L + "'", long3 == 539L);
    }

    @Test
    public void test16604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16604");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withFields(readablePartial10);
        org.joda.time.DateTime.Property property12 = dateTime11.millisOfDay();
        org.joda.time.DateTime dateTime13 = dateTime11.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone15);
        int int17 = dateTime16.getMillisOfDay();
        org.joda.time.DateTime dateTime19 = dateTime16.plusMillis((int) '#');
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        org.joda.time.Chronology chronology27 = interval26.getChronology();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 1, periodType22, chronology27);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) '4', chronology27);
        org.joda.time.DateTime dateTime30 = dateTime19.withChronology(chronology27);
        int int31 = dateTime30.getYearOfEra();
        int int32 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = dateTime30.toString(dateTimeFormatter33);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval35 = new org.joda.time.Interval((java.lang.Object) str34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format requires a '/' separator: 1970-01-05T01:00:00.045+97:00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3600010 + "'", int17 == 3600010);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1970 + "'", int31 == 1970);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970-01-05T01:00:00.045+97:00" + "'", str34, "1970-01-05T01:00:00.045+97:00");
    }

    @Test
    public void test16605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16605");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval9);
        long long13 = mutableInterval9.getEndMillis();
        java.lang.Object obj14 = mutableInterval9.clone();
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 1, periodType16, chronology21);
        mutablePeriod22.addHours(100);
        org.joda.time.MutablePeriod mutablePeriod25 = mutablePeriod22.copy();
        org.joda.time.MutablePeriod mutablePeriod26 = mutablePeriod22.copy();
        boolean boolean27 = mutableInterval9.equals((java.lang.Object) mutablePeriod26);
        mutablePeriod26.addSeconds(954);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone31);
        org.joda.time.DateTime dateTime33 = dateTime32.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime36 = dateTime33.withDurationAdded((long) 954, (int) (short) 10);
        org.joda.time.DateTime.Property property37 = dateTime33.dayOfMonth();
        org.joda.time.DateTime dateTime38 = dateTime33.withLaterOffsetAtOverlap();
        org.joda.time.PeriodType periodType40 = org.joda.time.PeriodType.yearMonthDayTime();
        java.lang.String str41 = periodType40.getName();
        org.joda.time.PeriodType periodType42 = periodType40.withSecondsRemoved();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) '#', periodType40);
        mutablePeriod43.setMillis(3600052);
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime38, (org.joda.time.ReadablePeriod) mutablePeriod43);
        mutablePeriod26.setPeriod((org.joda.time.ReadableInterval) mutableInterval46);
        org.joda.time.Weeks weeks48 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval46);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "1970-01-05T00:59:59.999+97:00/1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "1970-01-05T00:59:59.999+97:00/1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "1970-01-05T00:59:59.999+97:00/1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(mutablePeriod25);
        org.junit.Assert.assertNotNull(mutablePeriod26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "YearMonthDayTime" + "'", str41, "YearMonthDayTime");
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(weeks48);
    }

    @Test
    public void test16606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16606");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, periodType1, chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = chronology6.getZone();
        org.joda.time.Instant instant9 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 1, periodType12, chronology17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '4', chronology17);
        org.joda.time.ReadablePartial readablePartial20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withFields(readablePartial20);
        boolean boolean22 = instant9.isAfter((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime.Property property23 = dateTime19.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone25);
        int int27 = dateTime26.getDayOfMonth();
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 1, periodType29, chronology34);
        org.joda.time.DateTimeField dateTimeField36 = chronology34.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone37 = chronology34.getZone();
        org.joda.time.DateTime dateTime38 = dateTime26.withZoneRetainFields(dateTimeZone37);
        org.joda.time.DateTime dateTime39 = dateTime19.withZone(dateTimeZone37);
        boolean boolean40 = dateTimeZone37.isFixed();
        org.joda.time.Chronology chronology41 = chronology6.withZone(dateTimeZone37);
        org.joda.time.DurationField durationField42 = chronology6.minutes();
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(durationField42);
    }

    @Test
    public void test16607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16607");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.millis();
        int int2 = periodType1.size();
        org.joda.time.PeriodType periodType3 = periodType1.withMonthsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(4597956002599L, periodType1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 4597956002599");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test16608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16608");
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.yearMonthDayTime();
        java.lang.String str6 = periodType5.getName();
        org.joda.time.PeriodType periodType7 = periodType5.withSecondsRemoved();
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 1, periodType9, chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone17 = chronology14.getZone();
        org.joda.time.DateTimeField dateTimeField18 = chronology14.minuteOfHour();
        org.joda.time.Chronology chronology19 = chronology14.withUTC();
        java.lang.String str20 = chronology14.toString();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 100, 0L, periodType7, chronology14);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval27 = mutableInterval26.toInterval();
        org.joda.time.Chronology chronology28 = interval27.getChronology();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 1, periodType23, chronology28);
        org.joda.time.DateTimeField dateTimeField30 = chronology28.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone31 = chronology28.getZone();
        org.joda.time.DateTimeField dateTimeField32 = chronology28.weekOfWeekyear();
        org.joda.time.Period period33 = new org.joda.time.Period((long) (short) 100, periodType7, chronology28);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((long) 3600, 7776000053L, chronology28);
        org.joda.time.Period period36 = org.joda.time.Period.days((-1));
        org.joda.time.Period period38 = period36.withHours((int) (short) 0);
        org.joda.time.Period period40 = period36.minusWeeks((-1));
        int[] intArray42 = chronology28.get((org.joda.time.ReadablePeriod) period36, 0L);
        org.joda.time.Seconds seconds43 = period36.toStandardSeconds();
        org.joda.time.Hours hours44 = seconds43.toStandardHours();
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "YearMonthDayTime" + "'", str6, "YearMonthDayTime");
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ISOChronology[+97:00]" + "'", str20, "ISOChronology[+97:00]");
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(seconds43);
        org.junit.Assert.assertNotNull(hours44);
    }

    @Test
    public void test16609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16609");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.Interval interval5 = interval3.toInterval();
        long long6 = interval5.getEndMillis();
        org.joda.time.MutableInterval mutableInterval7 = interval5.toMutableInterval();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Interval interval9 = interval5.withDurationBeforeEnd(readableDuration8);
        long long10 = interval9.toDurationMillis();
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertNotNull(mutableInterval7);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test16610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16610");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval9);
        long long13 = mutableInterval9.getEndMillis();
        org.joda.time.DateTime dateTime14 = mutableInterval9.getEnd();
        org.joda.time.Chronology chronology15 = mutableInterval9.getChronology();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone17);
        int int19 = dateTime18.getSecondOfMinute();
        org.joda.time.DateTime dateTime21 = dateTime18.withMinuteOfHour(10);
        org.joda.time.TimeOfDay timeOfDay22 = dateTime21.toTimeOfDay();
        org.joda.time.Instant instant23 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant26 = instant23.withDurationAdded(readableDuration24, 10);
        org.joda.time.Instant instant29 = instant23.withDurationAdded((-54432000000L), 3);
        org.joda.time.DateTime dateTime30 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant23);
        int[] intArray32 = chronology15.get((org.joda.time.ReadablePartial) timeOfDay22, 604800000L);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.DateTime dateTime34 = timeOfDay22.toDateTime(readableInstant33);
        org.joda.time.DateTimeZone dateTimeZone35 = dateTime34.getZone();
        org.joda.time.DateTime dateTime37 = dateTime34.minus(3534465695L);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 0, 0, 0]");
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTime37);
    }

    @Test
    public void test16611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16611");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Period period15 = org.joda.time.Period.days((-1));
        org.joda.time.Period period17 = period15.withWeeks((int) 'a');
        org.joda.time.Period period19 = period15.plusMonths((int) (short) -1);
        org.joda.time.Period period21 = period15.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime22 = dateTime10.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 1, periodType25, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) '4', chronology30);
        org.joda.time.ReadablePartial readablePartial33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.withFields(readablePartial33);
        org.joda.time.DateTime.Property property35 = dateTime34.millisOfDay();
        org.joda.time.DateTime dateTime37 = dateTime34.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime39 = dateTime34.withCenturyOfEra((int) (short) 1);
        org.joda.time.Weeks weeks40 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int42 = dateTime34.get(dateTimeFieldType41);
        org.joda.time.DateTime dateTime44 = dateTime34.withYear((int) '4');
        int int45 = dateTime34.getSecondOfDay();
        org.joda.time.DateTime.Property property46 = dateTime34.dayOfYear();
        org.joda.time.DurationField durationField47 = property46.getLeapDurationField();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(weeks40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5 + "'", int42 == 5);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3600 + "'", int45 == 3600);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNull(durationField47);
    }

    @Test
    public void test16612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16612");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds(1968);
        org.junit.Assert.assertNotNull(seconds1);
    }

    @Test
    public void test16613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16613");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(6000035L);
        java.lang.Object obj6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType8 = period7.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(obj6, periodType8);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 1, periodType11, chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone19 = chronology16.getZone();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.minuteOfHour();
        org.joda.time.Chronology chronology21 = chronology16.withUTC();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 44, (-10L), periodType8, chronology21);
        org.joda.time.Chronology chronology23 = chronology21.withUTC();
        mutablePeriod1.setPeriod(58665600044L, (long) 'a', chronology23);
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(chronology23);
        org.joda.time.DateTime dateTime27 = dateTime25.plusWeeks(9);
        org.joda.time.DateTime dateTime29 = dateTime27.plusDays(45);
        org.joda.time.DateTime dateTime30 = dateTime29.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime32 = dateTime30.plusMonths((-459));
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
    }

    @Test
    public void test16614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16614");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period12 = org.joda.time.Period.days((-1));
        org.joda.time.Period period14 = period12.withWeeks((int) 'a');
        java.lang.String str15 = period12.toString();
        mutablePeriod10.setPeriod((org.joda.time.ReadablePeriod) period12);
        mutablePeriod10.addMonths((int) (short) -1);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval27 = mutableInterval26.toInterval();
        org.joda.time.Chronology chronology28 = interval27.getChronology();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 1, periodType23, chronology28);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) '4', chronology28);
        org.joda.time.ReadablePartial readablePartial31 = null;
        org.joda.time.DateTime dateTime32 = dateTime30.withFields(readablePartial31);
        org.joda.time.DateTime.Property property33 = dateTime32.millisOfDay();
        org.joda.time.DateTime dateTime34 = dateTime32.withEarlierOffsetAtOverlap();
        int int35 = dateTime32.getDayOfWeek();
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 1, periodType37, chronology42);
        org.joda.time.DateTimeField dateTimeField44 = chronology42.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone45 = chronology42.getZone();
        org.joda.time.DateTime dateTime46 = dateTime32.withChronology(chronology42);
        org.joda.time.Minutes minutes48 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType49 = null;
        int int50 = minutes48.get(durationFieldType49);
        int int52 = minutes48.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod53 = minutes48.toMutablePeriod();
        long long56 = chronology42.add((org.joda.time.ReadablePeriod) mutablePeriod53, (long) '#', (int) (short) 10);
        mutablePeriod10.setPeriod((long) (short) 100, (long) 2, chronology42);
        org.joda.time.DurationField durationField58 = durationFieldType1.getField(chronology42);
        long long59 = durationField58.getUnitMillis();
        boolean boolean60 = durationField58.isPrecise();
        long long62 = durationField58.getMillis((-2147483648));
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P-1D" + "'", str15, "P-1D");
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(minutes48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertNotNull(mutablePeriod53);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 6000035L + "'", long56 == 6000035L);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 31556952000L + "'", long59 == 31556952000L);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 6018937894117310464L + "'", long62 == 6018937894117310464L);
    }

    @Test
    public void test16615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16615");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.millis();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period11 = org.joda.time.Period.days((-1));
        org.joda.time.Period period13 = period11.withWeeks((int) 'a');
        java.lang.String str14 = period11.toString();
        mutablePeriod9.setPeriod((org.joda.time.ReadablePeriod) period11);
        mutablePeriod9.addMonths((int) (short) -1);
        org.joda.time.Period period19 = org.joda.time.Period.days((-1));
        org.joda.time.Period period21 = period19.withWeeks((int) 'a');
        org.joda.time.Period period23 = period19.plusMonths((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType24 = null;
        boolean boolean25 = period23.isSupported(durationFieldType24);
        mutablePeriod9.add((org.joda.time.ReadablePeriod) period23);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.Chronology chronology35 = interval34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 1, periodType30, chronology35);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) '4', chronology35);
        org.joda.time.DurationField durationField38 = chronology35.centuries();
        mutablePeriod9.add((long) (short) 10, chronology35);
        org.joda.time.DateTimeField dateTimeField40 = chronology35.clockhourOfDay();
        org.joda.time.DurationField durationField41 = durationFieldType0.getField(chronology35);
        org.joda.time.DateTimeField dateTimeField42 = chronology35.yearOfEra();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(chronology35);
        org.joda.time.DateTime.Property property44 = dateTime43.secondOfDay();
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration47 = duration46.toDuration();
        org.joda.time.Duration duration50 = duration47.withDurationAdded(0L, 1970);
        org.joda.time.PeriodType periodType51 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType52 = periodType51.withMonthsRemoved();
        org.joda.time.Period period53 = duration50.toPeriod(periodType51);
        org.joda.time.PeriodType periodType54 = periodType51.withSecondsRemoved();
        org.joda.time.PeriodType periodType55 = periodType51.withMonthsRemoved();
        org.joda.time.PeriodType periodType56 = periodType55.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime43, readableInstant45, periodType55);
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval64 = mutableInterval63.toInterval();
        org.joda.time.Chronology chronology65 = interval64.getChronology();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((long) 1, periodType60, chronology65);
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((long) '4', chronology65);
        org.joda.time.DurationField durationField68 = chronology65.centuries();
        long long71 = durationField68.add((long) (byte) 1, 1970);
        long long74 = durationField68.subtract((long) 24, (int) ' ');
        org.joda.time.DurationFieldType durationFieldType75 = durationField68.getType();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod57.add(durationFieldType75, 34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'centuries'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "P-1D" + "'", str14, "P-1D");
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(durationField68);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 6216719587200001L + "'", long71 == 6216719587200001L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + (-100982246399976L) + "'", long74 == (-100982246399976L));
        org.junit.Assert.assertNotNull(durationFieldType75);
    }

    @Test
    public void test16616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16616");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withMonthsRemoved();
        org.joda.time.Minutes minutes3 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType4 = null;
        int int5 = minutes3.get(durationFieldType4);
        int int7 = minutes3.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod8 = minutes3.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType10 = minutes3.getFieldType(0);
        boolean boolean11 = periodType1.equals((java.lang.Object) minutes3);
        org.joda.time.MutablePeriod mutablePeriod12 = minutes3.toMutablePeriod();
        int int13 = mutablePeriod12.getHours();
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 1, periodType16, chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.yearOfCentury();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        org.joda.time.Chronology chronology29 = interval28.getChronology();
        org.joda.time.DateTimeZone dateTimeZone30 = chronology29.getZone();
        java.lang.String str32 = dateTimeZone30.getName(100L);
        org.joda.time.DateTime dateTime33 = dateTime24.withZoneRetainFields(dateTimeZone30);
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        org.joda.time.DateTimeZone dateTimeZone39 = chronology38.getZone();
        java.lang.String str41 = dateTimeZone39.getName(100L);
        org.joda.time.DateTime dateTime42 = dateTime33.withZoneRetainFields(dateTimeZone39);
        org.joda.time.Chronology chronology43 = chronology21.withZone(dateTimeZone39);
        org.joda.time.DurationField durationField44 = chronology21.millis();
        org.joda.time.DurationField durationField45 = chronology21.months();
        org.joda.time.DateTimeField dateTimeField46 = chronology21.hourOfHalfday();
        mutablePeriod12.add((-54431999941L), chronology21);
        org.joda.time.DateTimeField dateTimeField48 = chronology21.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField49 = chronology21.minuteOfHour();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+97:00" + "'", str32, "+97:00");
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+97:00" + "'", str41, "+97:00");
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
    }

    @Test
    public void test16617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16617");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        mutablePeriod8.addMonths((int) (short) -1);
        org.joda.time.Period period18 = org.joda.time.Period.days((-1));
        org.joda.time.Period period20 = period18.withWeeks((int) 'a');
        org.joda.time.Period period22 = period18.plusMonths((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType23 = null;
        boolean boolean24 = period22.isSupported(durationFieldType23);
        mutablePeriod8.add((org.joda.time.ReadablePeriod) period22);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 1, periodType29, chronology34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) '4', chronology34);
        org.joda.time.DurationField durationField37 = chronology34.centuries();
        mutablePeriod8.add((long) (short) 10, chronology34);
        org.joda.time.DurationField durationField39 = chronology34.millis();
        org.joda.time.DurationField durationField40 = chronology34.weeks();
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        org.joda.time.Chronology chronology48 = interval47.getChronology();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) 1, periodType43, chronology48);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) '4', chronology48);
        org.joda.time.ReadablePartial readablePartial51 = null;
        org.joda.time.DateTime dateTime52 = dateTime50.withFields(readablePartial51);
        org.joda.time.DateTime.Property property53 = dateTime52.millisOfDay();
        org.joda.time.DateTime dateTime55 = dateTime52.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property56 = dateTime52.era();
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval60 = mutableInterval59.toInterval();
        org.joda.time.Chronology chronology61 = interval60.getChronology();
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(chronology61);
        int int63 = property56.compareTo((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.DateTime.Property property64 = dateTime62.dayOfWeek();
        org.joda.time.PeriodType periodType67 = null;
        org.joda.time.MutableInterval mutableInterval70 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval71 = mutableInterval70.toInterval();
        org.joda.time.Chronology chronology72 = interval71.getChronology();
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((long) 1, periodType67, chronology72);
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime((long) '4', chronology72);
        org.joda.time.ReadablePartial readablePartial75 = null;
        org.joda.time.DateTime dateTime76 = dateTime74.withFields(readablePartial75);
        org.joda.time.DateTime.Property property77 = dateTime76.millisOfDay();
        org.joda.time.DateTime dateTime79 = dateTime76.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property80 = dateTime76.era();
        org.joda.time.MutableInterval mutableInterval83 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval84 = mutableInterval83.toInterval();
        org.joda.time.Chronology chronology85 = interval84.getChronology();
        org.joda.time.DateTime dateTime86 = new org.joda.time.DateTime(chronology85);
        int int87 = property80.compareTo((org.joda.time.ReadableInstant) dateTime86);
        org.joda.time.DateTime.Property property88 = dateTime86.minuteOfDay();
        long long89 = property64.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime86);
        org.joda.time.DurationField durationField90 = property64.getRangeDurationField();
        int int91 = durationField40.compareTo(durationField90);
        long long94 = durationField40.getMillis(195, (-48642069599977L));
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P-1D" + "'", str13, "P-1D");
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(interval71);
        org.junit.Assert.assertNotNull(chronology72);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertNotNull(interval84);
        org.junit.Assert.assertNotNull(chronology85);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(property88);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 0L + "'", long89 == 0L);
        org.junit.Assert.assertNotNull(durationField90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 117936000000L + "'", long94 == 117936000000L);
    }

    @Test
    public void test16618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16618");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Period period15 = org.joda.time.Period.days((-1));
        org.joda.time.Period period17 = period15.withWeeks((int) 'a');
        org.joda.time.Period period19 = period15.plusMonths((int) (short) -1);
        org.joda.time.Period period21 = period15.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime22 = dateTime10.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 1, periodType25, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) '4', chronology30);
        org.joda.time.ReadablePartial readablePartial33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.withFields(readablePartial33);
        org.joda.time.DateTime.Property property35 = dateTime34.millisOfDay();
        org.joda.time.DateTime dateTime37 = dateTime34.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime39 = dateTime34.withCenturyOfEra((int) (short) 1);
        org.joda.time.Weeks weeks40 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime34);
        int int41 = dateTime34.getHourOfDay();
        java.lang.String str42 = dateTime34.toString();
        org.joda.time.DateTime.Property property43 = dateTime34.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime45 = property43.setCopy("T15:59:19.562");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"T15:59:19.562\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(weeks40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1970-01-05T01:00:00.052+97:00" + "'", str42, "1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertNotNull(property43);
    }

    @Test
    public void test16619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16619");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Weeks weeks13 = weeks12.negated();
        org.joda.time.DurationFieldType durationFieldType14 = weeks13.getFieldType();
        org.joda.time.Weeks weeks16 = weeks13.multipliedBy(45);
        org.joda.time.Weeks weeks18 = weeks13.minus(7);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone20);
        int int22 = dateTime21.getDayOfMonth();
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean33 = mutableInterval28.isBefore((org.joda.time.ReadableInterval) mutableInterval32);
        boolean boolean34 = mutableInterval25.contains((org.joda.time.ReadableInterval) mutableInterval32);
        org.joda.time.Weeks weeks35 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval32);
        org.joda.time.DateTime dateTime36 = dateTime21.plus((org.joda.time.ReadablePeriod) weeks35);
        org.joda.time.Weeks weeks37 = weeks13.plus(weeks35);
        org.joda.time.Weeks weeks39 = weeks37.multipliedBy(0);
        org.joda.time.Instant instant40 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology41 = instant40.getChronology();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((-3600010L), 53L, chronology44);
        org.joda.time.Weeks weeks46 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) mutablePeriod45);
        int[] intArray49 = chronology41.get((org.joda.time.ReadablePeriod) weeks46, 0L, 494895600600L);
        boolean boolean50 = weeks39.isGreaterThan(weeks46);
        org.joda.time.Instant instant51 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.Instant instant54 = instant51.withDurationAdded(readableDuration52, 10);
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval61 = mutableInterval60.toInterval();
        org.joda.time.Chronology chronology62 = interval61.getChronology();
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((long) 1, periodType57, chronology62);
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) '4', chronology62);
        org.joda.time.ReadablePartial readablePartial65 = null;
        org.joda.time.DateTime dateTime66 = dateTime64.withFields(readablePartial65);
        org.joda.time.DateTime.Property property67 = dateTime66.millisOfDay();
        org.joda.time.DateTime dateTime68 = dateTime66.withEarlierOffsetAtOverlap();
        int int69 = dateTime66.getDayOfWeek();
        org.joda.time.PeriodType periodType71 = null;
        org.joda.time.MutableInterval mutableInterval74 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval75 = mutableInterval74.toInterval();
        org.joda.time.Chronology chronology76 = interval75.getChronology();
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((long) 1, periodType71, chronology76);
        org.joda.time.DateTimeField dateTimeField78 = chronology76.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone79 = chronology76.getZone();
        org.joda.time.DateTime dateTime80 = dateTime66.withChronology(chronology76);
        org.joda.time.DateTime dateTime81 = dateTime66.withEarlierOffsetAtOverlap();
        org.joda.time.Period period82 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType83 = period82.getPeriodType();
        org.joda.time.Period period85 = period82.withMonths((int) (byte) 0);
        org.joda.time.Period period86 = period82.toPeriod();
        org.joda.time.DateTime dateTime88 = dateTime81.withPeriodAdded((org.joda.time.ReadablePeriod) period86, (int) (byte) 0);
        org.joda.time.ReadableInstant readableInstant89 = null;
        boolean boolean90 = dateTime88.isEqual(readableInstant89);
        org.joda.time.Weeks weeks91 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) instant54, (org.joda.time.ReadableInstant) dateTime88);
        org.joda.time.Weeks weeks93 = weeks91.plus((int) (short) 10);
        org.joda.time.PeriodType periodType94 = weeks91.getPeriodType();
        boolean boolean95 = weeks46.isLessThan(weeks91);
        org.joda.time.Weeks weeks97 = weeks46.multipliedBy(13);
        org.joda.time.Weeks weeks99 = weeks97.minus((-53));
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(weeks35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(weeks37);
        org.junit.Assert.assertNotNull(weeks39);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(weeks46);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[818]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(instant51);
        org.junit.Assert.assertNotNull(instant54);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(interval75);
        org.junit.Assert.assertNotNull(chronology76);
        org.junit.Assert.assertNotNull(dateTimeField78);
        org.junit.Assert.assertNotNull(dateTimeZone79);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(periodType83);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(dateTime88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(weeks91);
        org.junit.Assert.assertNotNull(weeks93);
        org.junit.Assert.assertNotNull(periodType94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(weeks97);
        org.junit.Assert.assertNotNull(weeks99);
    }

    @Test
    public void test16620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16620");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, periodType1, chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = chronology6.getZone();
        org.joda.time.DateTimeField dateTimeField10 = chronology6.minuteOfHour();
        org.joda.time.Chronology chronology11 = chronology6.withUTC();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology6.getZone();
        org.joda.time.Period period13 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType14 = period13.getPeriodType();
        org.joda.time.Period period16 = period13.withMonths((int) (byte) 0);
        org.joda.time.Period period18 = period13.plusMonths((int) (byte) 10);
        int int19 = period13.size();
        org.joda.time.Period period21 = period13.minusDays(13);
        int[] intArray24 = chronology6.get((org.joda.time.ReadablePeriod) period21, (-349238399L), (-54431999941L));
        org.joda.time.Period period25 = period21.negated();
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -8, -2, -1, -22, -59, -21, -542]");
        org.junit.Assert.assertNotNull(period25);
    }

    @Test
    public void test16621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16621");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, periodType1, chronology6);
        mutablePeriod7.addHours(100);
        org.joda.time.MutablePeriod mutablePeriod10 = mutablePeriod7.copy();
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod7.copy();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period22 = org.joda.time.Period.days((-1));
        org.joda.time.Period period24 = period22.withWeeks((int) 'a');
        java.lang.String str25 = period22.toString();
        mutablePeriod20.setPeriod((org.joda.time.ReadablePeriod) period22);
        int int27 = mutablePeriod20.getMillis();
        org.joda.time.MutablePeriod mutablePeriod28 = mutablePeriod20.toMutablePeriod();
        mutablePeriod20.addHours((int) (short) 100);
        mutablePeriod7.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod20);
        java.lang.Object obj32 = mutablePeriod7.clone();
        mutablePeriod7.addHours(0);
        int int35 = mutablePeriod7.getSeconds();
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "P-1D" + "'", str25, "P-1D");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod28);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "P-1DT100H");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "P-1DT100H");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "P-1DT100H");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test16622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16622");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, periodType1, chronology6);
        mutablePeriod7.addHours(100);
        org.joda.time.MutablePeriod mutablePeriod10 = mutablePeriod7.copy();
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod7.copy();
        mutablePeriod7.setMinutes((int) (short) 100);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(mutablePeriod11);
    }

    @Test
    public void test16623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16623");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((-113606668630800000L), (long) 975);
        mutablePeriod2.addDays(7200052);
    }

    @Test
    public void test16624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16624");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Period period14 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType15 = period14.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) '#', 100L, periodType15);
        org.joda.time.Period period17 = mutableInterval9.toPeriod(periodType15);
        org.joda.time.Days days18 = org.joda.time.Days.ONE;
        int int19 = days18.getDays();
        int int20 = days18.size();
        org.joda.time.DurationFieldType durationFieldType21 = days18.getFieldType();
        int int22 = period17.indexOf(durationFieldType21);
        org.joda.time.Period period24 = period17.minusMillis((int) (short) 10);
        org.joda.time.Period period25 = period17.toPeriod();
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
    }

    @Test
    public void test16625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16625");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        mutablePeriod8.addMonths((int) (short) -1);
        org.joda.time.Period period18 = org.joda.time.Period.days((-1));
        org.joda.time.Period period20 = period18.withWeeks((int) 'a');
        org.joda.time.Period period22 = period18.plusMonths((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType23 = null;
        boolean boolean24 = period22.isSupported(durationFieldType23);
        mutablePeriod8.add((org.joda.time.ReadablePeriod) period22);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 1, periodType29, chronology34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) '4', chronology34);
        org.joda.time.DurationField durationField37 = chronology34.centuries();
        mutablePeriod8.add((long) (short) 10, chronology34);
        org.joda.time.DateTimeField dateTimeField39 = chronology34.clockhourOfDay();
        org.joda.time.DurationField durationField40 = chronology34.years();
        org.joda.time.DateTimeField dateTimeField41 = chronology34.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = dateTimeField41.getType();
        java.lang.String str43 = dateTimeFieldType42.getName();
        org.joda.time.DurationFieldType durationFieldType44 = dateTimeFieldType42.getDurationType();
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime();
        org.joda.time.Duration duration46 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval53 = mutableInterval52.toInterval();
        org.joda.time.Chronology chronology54 = interval53.getChronology();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) 1, periodType49, chronology54);
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) '4', chronology54);
        org.joda.time.ReadablePartial readablePartial57 = null;
        org.joda.time.DateTime dateTime58 = dateTime56.withFields(readablePartial57);
        org.joda.time.DateTime.Property property59 = dateTime58.millisOfDay();
        org.joda.time.DateTime dateTime60 = dateTime58.withEarlierOffsetAtOverlap();
        int int61 = dateTime58.getDayOfWeek();
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval67 = mutableInterval66.toInterval();
        org.joda.time.Chronology chronology68 = interval67.getChronology();
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) 1, periodType63, chronology68);
        org.joda.time.DateTimeField dateTimeField70 = chronology68.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone71 = chronology68.getZone();
        org.joda.time.DateTime dateTime72 = dateTime58.withChronology(chronology68);
        org.joda.time.Interval interval73 = duration46.toIntervalTo((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period76 = duration46.toPeriodFrom((org.joda.time.ReadableInstant) dateTime75);
        org.joda.time.MutableInterval mutableInterval77 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime45, (org.joda.time.ReadablePeriod) period76);
        org.joda.time.MutableInterval mutableInterval78 = mutableInterval77.copy();
        org.joda.time.Chronology chronology79 = mutableInterval78.getChronology();
        boolean boolean80 = durationFieldType44.isSupported(chronology79);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P-1D" + "'", str13, "P-1D");
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "dayOfMonth" + "'", str43, "dayOfMonth");
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertNotNull(dateTimeZone71);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(interval73);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(mutableInterval78);
        org.junit.Assert.assertNotNull(chronology79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test16626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16626");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 100, (long) 10, periodType2);
        mutablePeriod3.addMonths(0);
        int int6 = mutablePeriod3.getMillis();
        org.joda.time.PeriodType periodType7 = mutablePeriod3.getPeriodType();
        mutablePeriod3.addMonths((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone12);
        int int14 = dateTime13.getSecondOfMinute();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology20.getZone();
        java.lang.String str23 = dateTimeZone21.getName(100L);
        org.joda.time.DateTime dateTime24 = dateTime15.withZoneRetainFields(dateTimeZone21);
        java.lang.String str25 = dateTimeZone21.getID();
        org.joda.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = dateTimeZone21.isLocalDateTimeGap(localDateTime26);
        org.joda.time.DateTime dateTime28 = dateTime13.withZone(dateTimeZone21);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (byte) 100, dateTimeZone21);
        org.joda.time.Duration duration30 = mutablePeriod3.toDurationFrom((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.Chronology chronology35 = interval34.getChronology();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(chronology35);
        org.joda.time.DateTime dateTime38 = dateTime36.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime40 = dateTime38.plus((long) (short) -1);
        int int41 = dateTime40.getMinuteOfHour();
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration30, (org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone44);
        int int46 = dateTime45.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean58 = mutableInterval53.isBefore((org.joda.time.ReadableInterval) mutableInterval57);
        boolean boolean59 = mutableInterval50.contains((org.joda.time.ReadableInterval) mutableInterval57);
        org.joda.time.Weeks weeks60 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval57);
        org.joda.time.Chronology chronology61 = mutableInterval57.getChronology();
        org.joda.time.DateTimeField dateTimeField62 = dateTimeFieldType47.getField(chronology61);
        int int63 = dateTime45.get(dateTimeFieldType47);
        org.joda.time.DateTimeZone dateTimeZone64 = dateTime45.getZone();
        org.joda.time.PeriodType periodType67 = null;
        org.joda.time.MutableInterval mutableInterval70 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval71 = mutableInterval70.toInterval();
        org.joda.time.Chronology chronology72 = interval71.getChronology();
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((long) 1, periodType67, chronology72);
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime((long) '4', chronology72);
        org.joda.time.ReadablePartial readablePartial75 = null;
        org.joda.time.DateTime dateTime76 = dateTime74.withFields(readablePartial75);
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = org.joda.time.DateTimeFieldType.year();
        boolean boolean78 = dateTime74.isSupported(dateTimeFieldType77);
        org.joda.time.DurationFieldType durationFieldType79 = dateTimeFieldType77.getDurationType();
        boolean boolean80 = dateTime45.isSupported(dateTimeFieldType77);
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration30, (org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTime.Property property82 = dateTime45.dayOfMonth();
        org.joda.time.DateTime.Property property83 = dateTime45.dayOfMonth();
        java.util.Locale locale85 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime86 = property83.setCopy("1950-01-05T01:00:00.052+97:00/1950-01-05T01:00:00.052+97:00", locale85);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1950-01-05T01:00:00.052+97:00/1950-01-05T01:00:00.052+97:00\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-90) + "'", int6 == (-90));
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+97:00" + "'", str23, "+97:00");
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+97:00" + "'", str25, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
// flaky:         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(weeks60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone64);
        org.junit.Assert.assertNotNull(interval71);
        org.junit.Assert.assertNotNull(chronology72);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(dateTimeFieldType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(durationFieldType79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(property82);
        org.junit.Assert.assertNotNull(property83);
    }

    @Test
    public void test16627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16627");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withFields(readablePartial10);
        org.joda.time.DateTime.Property property12 = dateTime11.millisOfDay();
        org.joda.time.DateTime dateTime13 = dateTime11.withEarlierOffsetAtOverlap();
        int int14 = dateTime11.getDayOfWeek();
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 1, periodType16, chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone24 = chronology21.getZone();
        org.joda.time.DateTime dateTime25 = dateTime11.withChronology(chronology21);
        org.joda.time.DateTime dateTime27 = dateTime25.plusDays((int) (byte) 1);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.Chronology chronology36 = interval35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 1, periodType31, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) '4', chronology36);
        org.joda.time.ReadablePartial readablePartial39 = null;
        org.joda.time.DateTime dateTime40 = dateTime38.withFields(readablePartial39);
        org.joda.time.DateTime.Property property41 = dateTime40.millisOfDay();
        org.joda.time.DateTime dateTime42 = dateTime40.withEarlierOffsetAtOverlap();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(readableDuration28, (org.joda.time.ReadableInstant) dateTime40);
        int int44 = dateTime27.compareTo((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTime dateTime46 = dateTime40.withYearOfCentury(13);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone48);
        int int50 = dateTime49.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone51 = dateTime49.getZone();
        long long53 = dateTimeZone51.convertUTCToLocal((long) 0);
        java.util.Locale locale55 = null;
        java.lang.String str56 = dateTimeZone51.getShortName((long) (-1), locale55);
        org.joda.time.DateTime dateTime57 = dateTime40.withZoneRetainFields(dateTimeZone51);
        org.joda.time.DateTime.Property property58 = dateTime40.dayOfYear();
        boolean boolean60 = dateTime40.isAfter((-1L));
        int int61 = dateTime40.getMillisOfDay();
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 5 + "'", int50 == 5);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 349200000L + "'", long53 == 349200000L);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+97:00" + "'", str56, "+97:00");
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3600052 + "'", int61 == 3600052);
    }

    @Test
    public void test16628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16628");
        org.joda.time.Period period1 = org.joda.time.Period.days(1358);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test16629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16629");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        org.joda.time.Chronology chronology9 = interval8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 1, periodType4, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '4', chronology9);
        org.joda.time.ReadablePartial readablePartial12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.withFields(readablePartial12);
        boolean boolean14 = instant1.isAfter((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime.Property property15 = dateTime11.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone17);
        int int19 = dateTime18.getDayOfMonth();
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        org.joda.time.Chronology chronology26 = interval25.getChronology();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 1, periodType21, chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone29 = chronology26.getZone();
        org.joda.time.DateTime dateTime30 = dateTime18.withZoneRetainFields(dateTimeZone29);
        org.joda.time.DateTime dateTime31 = dateTime11.withZone(dateTimeZone29);
        int int32 = dateTime11.getSecondOfDay();
        int int33 = dateTime11.getSecondOfMinute();
        boolean boolean34 = dateTime11.isEqualNow();
        org.joda.time.Duration duration35 = new org.joda.time.Duration(readableInstant0, (org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(periodType36);
        mutablePeriod37.addWeeks((-1));
        org.joda.time.DurationFieldType durationFieldType41 = mutablePeriod37.getFieldType((int) (short) 1);
        boolean boolean42 = dateTime11.equals((java.lang.Object) (short) 1);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3600 + "'", int32 == 3600);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test16630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16630");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.Chronology chronology5 = interval4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology5.getZone();
        java.lang.String str8 = dateTimeZone6.getName(100L);
        org.joda.time.DateTime dateTime9 = dateTime0.withZoneRetainFields(dateTimeZone6);
        int int10 = dateTime9.getMinuteOfDay();
        int int11 = dateTime9.getEra();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone13);
        org.joda.time.DateTime dateTime15 = dateTime14.withLaterOffsetAtOverlap();
        org.joda.time.Hours hours16 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Hours hours18 = hours16.minus(52);
        org.joda.time.Hours hours20 = hours16.multipliedBy(893);
        org.joda.time.PeriodType periodType21 = hours16.getPeriodType();
        org.joda.time.PeriodType periodType22 = hours16.getPeriodType();
        org.joda.time.Hours hours23 = org.joda.time.Hours.MIN_VALUE;
        boolean boolean24 = hours16.isGreaterThan(hours23);
        org.joda.time.Period period25 = hours16.toPeriod();
        org.joda.time.Period period27 = period25.minusMillis((int) (byte) 1);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertNotNull(dateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 963 + "'", int10 == 963);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
    }

    @Test
    public void test16631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16631");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        org.joda.time.Chronology chronology9 = interval8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 1, periodType4, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '4', chronology9);
        org.joda.time.ReadablePartial readablePartial12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.withFields(readablePartial12);
        boolean boolean14 = instant1.isAfter((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime.Property property15 = dateTime11.dayOfWeek();
        org.joda.time.DateTime dateTime16 = property15.withMaximumValue();
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 1, periodType20, chronology25);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) '4', chronology25);
        org.joda.time.ReadablePartial readablePartial28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.withFields(readablePartial28);
        boolean boolean30 = instant17.isAfter((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime.Property property31 = dateTime27.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone33);
        int int35 = dateTime34.getDayOfMonth();
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 1, periodType37, chronology42);
        org.joda.time.DateTimeField dateTimeField44 = chronology42.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone45 = chronology42.getZone();
        org.joda.time.DateTime dateTime46 = dateTime34.withZoneRetainFields(dateTimeZone45);
        org.joda.time.DateTime dateTime47 = dateTime27.withZone(dateTimeZone45);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTime dateTime49 = dateTime47.toDateTime(dateTimeZone48);
        org.joda.time.Days days50 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTime dateTime51 = dateTime49.toDateTime();
        org.joda.time.Period period53 = org.joda.time.Period.days((-1));
        org.joda.time.Period period55 = period53.withHours((int) (short) 0);
        org.joda.time.Period period57 = period53.plusMillis(1);
        org.joda.time.Period period59 = period57.plusMinutes(24);
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period70 = org.joda.time.Period.days((-1));
        org.joda.time.Period period72 = period70.withWeeks((int) 'a');
        java.lang.String str73 = period70.toString();
        mutablePeriod68.setPeriod((org.joda.time.ReadablePeriod) period70);
        int int75 = mutablePeriod68.getMillis();
        org.joda.time.MutablePeriod mutablePeriod76 = mutablePeriod68.toMutablePeriod();
        mutablePeriod76.add((int) '4', (int) (short) 0, (int) (byte) 0, (int) (short) 10, 1, (int) 'a', (int) (short) 100, (int) (short) -1);
        mutablePeriod76.addMonths(953);
        org.joda.time.Period period88 = period57.plus((org.joda.time.ReadablePeriod) mutablePeriod76);
        org.joda.time.Period period90 = period88.withWeeks(3600);
        org.joda.time.PeriodType periodType91 = period88.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableInstant) dateTime49, periodType91);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(days50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "P-1D" + "'", str73, "P-1D");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod76);
        org.junit.Assert.assertNotNull(period88);
        org.junit.Assert.assertNotNull(period90);
        org.junit.Assert.assertNotNull(periodType91);
    }

    @Test
    public void test16632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16632");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        java.util.Locale locale8 = null;
        int int9 = property6.getMaximumTextLength(locale8);
        org.joda.time.Interval interval10 = property6.toInterval();
        org.joda.time.Period period11 = interval10.toPeriod();
        org.joda.time.Interval interval12 = interval10.toInterval();
        org.joda.time.Instant instant13 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 1, periodType16, chronology21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) '4', chronology21);
        org.joda.time.ReadablePartial readablePartial24 = null;
        org.joda.time.DateTime dateTime25 = dateTime23.withFields(readablePartial24);
        boolean boolean26 = instant13.isAfter((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime.Property property27 = dateTime23.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone29);
        int int31 = dateTime30.getDayOfMonth();
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 1, periodType33, chronology38);
        org.joda.time.DateTimeField dateTimeField40 = chronology38.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone41 = chronology38.getZone();
        org.joda.time.DateTime dateTime42 = dateTime30.withZoneRetainFields(dateTimeZone41);
        org.joda.time.DateTime dateTime43 = dateTime23.withZone(dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = dateTime43.toDateTime(dateTimeZone44);
        java.lang.String str46 = dateTime43.toString();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period57 = org.joda.time.Period.days((-1));
        org.joda.time.Period period59 = period57.withWeeks((int) 'a');
        java.lang.String str60 = period57.toString();
        mutablePeriod55.setPeriod((org.joda.time.ReadablePeriod) period57);
        mutablePeriod55.setYears(0);
        mutablePeriod55.setPeriod((int) (byte) -1, 100, (int) (byte) 100, (-1), 100, (int) (short) 10, 893, 0);
        mutablePeriod55.addYears(893);
        mutablePeriod55.setMillis(3);
        mutablePeriod55.setSeconds(44);
        org.joda.time.Interval interval79 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadablePeriod) mutablePeriod55);
        java.lang.String str80 = interval79.toString();
        boolean boolean81 = interval79.isBeforeNow();
        org.joda.time.Interval interval83 = interval79.withEndMillis(17366400052L);
        long long84 = interval79.toDurationMillis();
        boolean boolean85 = interval12.contains((org.joda.time.ReadableInterval) interval79);
        org.joda.time.ReadableInstant readableInstant86 = null;
        boolean boolean87 = interval79.isBefore(readableInstant86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1970-01-05T01:00:00.052+97:00" + "'", str46, "1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "P-1D" + "'", str60, "P-1D");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "1970-01-05T01:00:00.052+97:00/2872-04-07T05:10:44.055+97:00" + "'", str80, "1970-01-05T01:00:00.052+97:00/2872-04-07T05:10:44.055+97:00");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(interval83);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 28472443844003L + "'", long84 == 28472443844003L);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test16633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16633");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(349200000);
        org.joda.time.PeriodType periodType2 = weeks1.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.millis();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period14 = org.joda.time.Period.days((-1));
        org.joda.time.Period period16 = period14.withWeeks((int) 'a');
        java.lang.String str17 = period14.toString();
        mutablePeriod12.setPeriod((org.joda.time.ReadablePeriod) period14);
        mutablePeriod12.addMonths((int) (short) -1);
        org.joda.time.Period period22 = org.joda.time.Period.days((-1));
        org.joda.time.Period period24 = period22.withWeeks((int) 'a');
        org.joda.time.Period period26 = period22.plusMonths((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType27 = null;
        boolean boolean28 = period26.isSupported(durationFieldType27);
        mutablePeriod12.add((org.joda.time.ReadablePeriod) period26);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 1, periodType33, chronology38);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) '4', chronology38);
        org.joda.time.DurationField durationField41 = chronology38.centuries();
        mutablePeriod12.add((long) (short) 10, chronology38);
        org.joda.time.DateTimeField dateTimeField43 = chronology38.clockhourOfDay();
        org.joda.time.DurationField durationField44 = durationFieldType3.getField(chronology38);
        org.joda.time.DurationFieldType durationFieldType45 = durationField44.getType();
        int int46 = periodType2.indexOf(durationFieldType45);
        org.joda.time.PeriodType periodType47 = periodType2.withYearsRemoved();
        org.joda.time.PeriodType periodType48 = periodType2.withYearsRemoved();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "P-1D" + "'", str17, "P-1D");
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(periodType48);
    }

    @Test
    public void test16634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16634");
        java.lang.Object obj2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType4 = period3.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(obj2, periodType4);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        org.joda.time.Chronology chronology12 = interval11.getChronology();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 1, periodType7, chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology12.getZone();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.minuteOfHour();
        org.joda.time.Chronology chronology17 = chronology12.withUTC();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 44, (-10L), periodType4, chronology17);
        org.joda.time.Chronology chronology19 = chronology17.withUTC();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.weekOfWeekyear();
        org.joda.time.DurationField durationField21 = chronology19.months();
        org.joda.time.DurationField durationField22 = chronology19.weeks();
        org.joda.time.DateTimeField dateTimeField23 = chronology19.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test16635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16635");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean7 = mutableInterval2.isBefore((org.joda.time.ReadableInterval) mutableInterval6);
        mutableInterval6.setEndMillis((long) 893);
        org.joda.time.Hours hours10 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) mutableInterval6);
        org.joda.time.Hours hours12 = hours10.dividedBy(3600010);
        org.joda.time.Hours hours13 = hours10.negated();
        org.joda.time.Hours hours15 = hours10.minus((int) (short) 100);
        java.lang.String str16 = hours10.toString();
        org.joda.time.Duration duration17 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 1, periodType20, chronology25);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) '4', chronology25);
        org.joda.time.ReadablePartial readablePartial28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.withFields(readablePartial28);
        org.joda.time.DateTime.Property property30 = dateTime29.millisOfDay();
        org.joda.time.DateTime dateTime31 = dateTime29.withEarlierOffsetAtOverlap();
        int int32 = dateTime29.getDayOfWeek();
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval38 = mutableInterval37.toInterval();
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) 1, periodType34, chronology39);
        org.joda.time.DateTimeField dateTimeField41 = chronology39.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone42 = chronology39.getZone();
        org.joda.time.DateTime dateTime43 = dateTime29.withChronology(chronology39);
        org.joda.time.Interval interval44 = duration17.toIntervalTo((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period47 = duration17.toPeriodFrom((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone49);
        int int51 = dateTime50.getMillisOfDay();
        org.joda.time.DateTime dateTime53 = dateTime50.plusMillis((int) '#');
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval60 = mutableInterval59.toInterval();
        org.joda.time.Chronology chronology61 = interval60.getChronology();
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((long) 1, periodType56, chronology61);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) '4', chronology61);
        org.joda.time.DateTime dateTime64 = dateTime53.withChronology(chronology61);
        org.joda.time.Interval interval65 = duration17.toIntervalFrom((org.joda.time.ReadableInstant) dateTime53);
        long long66 = duration17.getStandardSeconds();
        org.joda.time.Hours hours67 = duration17.toStandardHours();
        org.joda.time.Hours hours68 = hours10.minus(hours67);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PT0H" + "'", str16, "PT0H");
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3600010 + "'", int51 == 3600010);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertNotNull(hours67);
        org.junit.Assert.assertNotNull(hours68);
    }

    @Test
    public void test16636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16636");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime7 = dateTime5.withYear(0);
        org.joda.time.DateTime.Property property8 = dateTime7.era();
        org.joda.time.DateTime.Property property9 = dateTime7.year();
        org.joda.time.DurationField durationField10 = property9.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone12);
        int int14 = dateTime13.getDayOfMonth();
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean25 = mutableInterval20.isBefore((org.joda.time.ReadableInterval) mutableInterval24);
        boolean boolean26 = mutableInterval17.contains((org.joda.time.ReadableInterval) mutableInterval24);
        org.joda.time.Weeks weeks27 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval24);
        org.joda.time.DateTime dateTime28 = dateTime13.plus((org.joda.time.ReadablePeriod) weeks27);
        org.joda.time.LocalDateTime localDateTime29 = dateTime13.toLocalDateTime();
        java.lang.String str30 = localDateTime29.toString();
        int int31 = property9.compareTo((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period42 = org.joda.time.Period.days((-1));
        org.joda.time.Period period44 = period42.withWeeks((int) 'a');
        java.lang.String str45 = period42.toString();
        mutablePeriod40.setPeriod((org.joda.time.ReadablePeriod) period42);
        mutablePeriod40.addMonths((int) (short) -1);
        org.joda.time.Period period50 = org.joda.time.Period.days((-1));
        org.joda.time.Period period52 = period50.withWeeks((int) 'a');
        org.joda.time.Period period54 = period50.plusMonths((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType55 = null;
        boolean boolean56 = period54.isSupported(durationFieldType55);
        mutablePeriod40.add((org.joda.time.ReadablePeriod) period54);
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval65 = mutableInterval64.toInterval();
        org.joda.time.Chronology chronology66 = interval65.getChronology();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) 1, periodType61, chronology66);
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime((long) '4', chronology66);
        org.joda.time.DurationField durationField69 = chronology66.centuries();
        mutablePeriod40.add((long) (short) 10, chronology66);
        org.joda.time.DateTimeField dateTimeField71 = chronology66.clockhourOfDay();
        long long74 = dateTimeField71.add((long) (short) 0, (int) '4');
        int int76 = dateTimeField71.getMaximumValue((long) 52);
        java.lang.String str78 = dateTimeField71.getAsShortText((long) (-20));
        boolean boolean79 = property9.equals((java.lang.Object) dateTimeField71);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-05T01:00:00.010" + "'", str30, "1970-01-05T01:00:00.010");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "P-1D" + "'", str45, "P-1D");
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(durationField69);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 187200000L + "'", long74 == 187200000L);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 24 + "'", int76 == 24);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "24" + "'", str78, "24");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test16637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16637");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getMillisOfDay();
        org.joda.time.DateTime dateTime5 = dateTime2.plusMillis((int) '#');
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval12 = mutableInterval11.toInterval();
        org.joda.time.Chronology chronology13 = interval12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 1, periodType8, chronology13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', chronology13);
        org.joda.time.DateTime dateTime16 = dateTime5.withChronology(chronology13);
        int int17 = dateTime16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateTime16.getChronology();
        org.joda.time.DateTime dateTime20 = dateTime16.minusWeeks(50);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone22);
        int int24 = dateTime23.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone25 = dateTime23.getZone();
        long long27 = dateTimeZone25.convertUTCToLocal((long) 0);
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone25.getShortName((long) (-1), locale29);
        org.joda.time.DateTime dateTime31 = dateTime16.toDateTime(dateTimeZone25);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(dateTimeZone25);
        boolean boolean34 = dateTime32.isAfter(1672444800000L);
        org.joda.time.DateTime dateTime35 = dateTime32.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property36 = dateTime32.year();
        org.joda.time.DateTime dateTime37 = property36.withMinimumValue();
        long long38 = property36.remainder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3600010 + "'", int3 == 3600010);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 349200000L + "'", long27 == 349200000L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+97:00" + "'", str30, "+97:00");
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTime37);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 4809814402L + "'", long38 == 4809814402L);
    }

    @Test
    public void test16638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16638");
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean12 = mutableInterval7.isBefore((org.joda.time.ReadableInterval) mutableInterval11);
        boolean boolean13 = mutableInterval4.contains((org.joda.time.ReadableInterval) mutableInterval11);
        mutableInterval4.setDurationAfterStart(0L);
        boolean boolean16 = mutableInterval4.containsNow();
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        long long22 = interval20.toDurationMillis();
        org.joda.time.Interval interval24 = interval20.withEndMillis((long) (short) 100);
        long long25 = interval20.toDurationMillis();
        boolean boolean26 = mutableInterval4.overlaps((org.joda.time.ReadableInterval) interval20);
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean37 = mutableInterval32.isBefore((org.joda.time.ReadableInterval) mutableInterval36);
        boolean boolean38 = mutableInterval29.contains((org.joda.time.ReadableInterval) mutableInterval36);
        org.joda.time.Weeks weeks39 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval36);
        long long40 = mutableInterval36.getEndMillis();
        org.joda.time.DateTime dateTime41 = mutableInterval36.getEnd();
        org.joda.time.Chronology chronology42 = mutableInterval36.getChronology();
        mutableInterval4.setChronology(chronology42);
        org.joda.time.Period period44 = new org.joda.time.Period((-31540579168L), 1362852086400000L, chronology42);
        org.joda.time.DateTimeField dateTimeField45 = chronology42.era();
        org.joda.time.DateTimeField dateTimeField46 = chronology42.yearOfEra();
        java.util.Locale locale49 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long50 = dateTimeField46.set((long) 86340, "P-1Y114M10WT1H10.002S", locale49);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"P-1Y114M10WT1H10.002S\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 53L + "'", long22 == 53L);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 53L + "'", long25 == 53L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(weeks39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 52L + "'", long40 == 52L);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
    }

    @Test
    public void test16639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16639");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Period period15 = org.joda.time.Period.days((-1));
        org.joda.time.Period period17 = period15.withWeeks((int) 'a');
        org.joda.time.Period period19 = period15.plusMonths((int) (short) -1);
        org.joda.time.Period period21 = period15.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime22 = dateTime10.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 1, periodType25, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) '4', chronology30);
        org.joda.time.ReadablePartial readablePartial33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.withFields(readablePartial33);
        org.joda.time.DateTime.Property property35 = dateTime34.millisOfDay();
        org.joda.time.DateTime dateTime37 = dateTime34.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime39 = dateTime34.withCenturyOfEra((int) (short) 1);
        org.joda.time.Weeks weeks40 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime34);
        int int41 = dateTime10.getHourOfDay();
        int int42 = dateTime10.getYearOfEra();
        java.util.Date date43 = dateTime10.toDate();
        java.lang.String str44 = dateTime10.toString();
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) 100, (long) 10, periodType47);
        mutablePeriod48.setMonths((int) (byte) -1);
        mutablePeriod48.clear();
        org.joda.time.Duration duration54 = new org.joda.time.Duration(187200000L, 3155695200000L);
        org.joda.time.Duration duration56 = duration54.plus((-100982246399976L));
        mutablePeriod48.setPeriod((org.joda.time.ReadableDuration) duration56);
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval64 = mutableInterval63.toInterval();
        org.joda.time.Chronology chronology65 = interval64.getChronology();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((long) 1, periodType60, chronology65);
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((long) '4', chronology65);
        org.joda.time.DateTime.Property property68 = dateTime67.era();
        org.joda.time.Period period69 = duration56.toPeriodFrom((org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.DateTime dateTime71 = dateTime67.withMonthOfYear((int) (short) 1);
        org.joda.time.DateTime dateTime73 = dateTime67.withHourOfDay(2);
        int int74 = dateTime10.compareTo((org.joda.time.ReadableInstant) dateTime73);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(weeks40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1970 + "'", int42 == 1970);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1970-01-05T01:00:00.052+97:00" + "'", str44, "1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test16640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16640");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 15);
        org.joda.time.DateTimeZone dateTimeZone2 = dateTime1.getZone();
        org.joda.time.Chronology chronology3 = dateTime1.getChronology();
        java.lang.String str4 = chronology3.toString();
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfMinute();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ISOChronology[+97:00]" + "'", str4, "ISOChronology[+97:00]");
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test16641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16641");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval9);
        long long13 = mutableInterval9.getEndMillis();
        java.lang.Object obj14 = mutableInterval9.clone();
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean25 = mutableInterval20.isBefore((org.joda.time.ReadableInterval) mutableInterval24);
        boolean boolean26 = mutableInterval17.contains((org.joda.time.ReadableInterval) mutableInterval24);
        org.joda.time.Weeks weeks27 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval24);
        long long28 = mutableInterval24.getEndMillis();
        org.joda.time.DateTime dateTime29 = mutableInterval24.getEnd();
        boolean boolean30 = dateTime29.isBeforeNow();
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 1, periodType33, chronology38);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) '4', chronology38);
        org.joda.time.ReadablePartial readablePartial41 = null;
        org.joda.time.DateTime dateTime42 = dateTime40.withFields(readablePartial41);
        org.joda.time.DateTime.Property property43 = dateTime42.millisOfDay();
        org.joda.time.DateTime dateTime44 = dateTime42.withEarlierOffsetAtOverlap();
        int int45 = dateTime42.getDayOfWeek();
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        org.joda.time.Chronology chronology52 = interval51.getChronology();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 1, periodType47, chronology52);
        org.joda.time.DateTimeField dateTimeField54 = chronology52.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone55 = chronology52.getZone();
        org.joda.time.DateTime dateTime56 = dateTime42.withChronology(chronology52);
        org.joda.time.DateTimeField dateTimeField57 = chronology52.weekOfWeekyear();
        int int58 = dateTime29.get(dateTimeField57);
        boolean boolean59 = mutableInterval9.isAfter((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime.Property property60 = dateTime29.dayOfWeek();
        org.joda.time.DateTime dateTime62 = dateTime29.withWeekyear((-38235488));
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "1970-01-05T00:59:59.999+97:00/1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "1970-01-05T00:59:59.999+97:00/1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "1970-01-05T00:59:59.999+97:00/1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 52L + "'", long28 == 52L);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(dateTime62);
    }

    @Test
    public void test16642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16642");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant3 = instant0.withDurationAdded(readableDuration1, 10);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval10 = mutableInterval9.toInterval();
        org.joda.time.Chronology chronology11 = interval10.getChronology();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 1, periodType6, chronology11);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) '4', chronology11);
        org.joda.time.ReadablePartial readablePartial14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.withFields(readablePartial14);
        org.joda.time.DateTime.Property property16 = dateTime15.millisOfDay();
        org.joda.time.DateTime dateTime17 = dateTime15.withEarlierOffsetAtOverlap();
        int int18 = dateTime15.getDayOfWeek();
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 1, periodType20, chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone28 = chronology25.getZone();
        org.joda.time.DateTime dateTime29 = dateTime15.withChronology(chronology25);
        org.joda.time.DateTime dateTime30 = dateTime15.withEarlierOffsetAtOverlap();
        org.joda.time.Period period31 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType32 = period31.getPeriodType();
        org.joda.time.Period period34 = period31.withMonths((int) (byte) 0);
        org.joda.time.Period period35 = period31.toPeriod();
        org.joda.time.DateTime dateTime37 = dateTime30.withPeriodAdded((org.joda.time.ReadablePeriod) period35, (int) (byte) 0);
        org.joda.time.ReadableInstant readableInstant38 = null;
        boolean boolean39 = dateTime37.isEqual(readableInstant38);
        org.joda.time.Weeks weeks40 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) instant3, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Weeks weeks42 = weeks40.plus((int) (short) 10);
        org.joda.time.Weeks weeks43 = org.joda.time.Weeks.ONE;
        org.joda.time.Weeks weeks44 = weeks40.minus(weeks43);
        org.joda.time.Weeks weeks45 = org.joda.time.Weeks.THREE;
        int int46 = weeks45.getWeeks();
        org.joda.time.Weeks weeks47 = weeks44.minus(weeks45);
        org.joda.time.Weeks weeks49 = weeks47.multipliedBy(2022);
        org.joda.time.MutablePeriod mutablePeriod50 = weeks49.toMutablePeriod();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(weeks40);
        org.junit.Assert.assertNotNull(weeks42);
        org.junit.Assert.assertNotNull(weeks43);
        org.junit.Assert.assertNotNull(weeks44);
        org.junit.Assert.assertNotNull(weeks45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertNotNull(weeks47);
        org.junit.Assert.assertNotNull(weeks49);
        org.junit.Assert.assertNotNull(mutablePeriod50);
    }

    @Test
    public void test16643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16643");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours(892);
        org.joda.time.Hours hours3 = hours1.multipliedBy((int) (byte) 10);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours3);
    }

    @Test
    public void test16644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16644");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) 1, (int) (byte) -1, 8, (int) 'a', (-292275054), 42, (int) (byte) 100, 27);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval17 = mutableInterval16.toInterval();
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 1, periodType13, chronology18);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) '4', chronology18);
        org.joda.time.ReadablePartial readablePartial21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.withFields(readablePartial21);
        org.joda.time.DateTime.Property property23 = dateTime22.millisOfDay();
        org.joda.time.DateTime dateTime24 = dateTime22.withEarlierOffsetAtOverlap();
        int int25 = dateTime22.getDayOfWeek();
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 1, periodType27, chronology32);
        org.joda.time.DateTimeField dateTimeField34 = chronology32.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone35 = chronology32.getZone();
        org.joda.time.DateTime dateTime36 = dateTime22.withChronology(chronology32);
        org.joda.time.DateTimeField dateTimeField37 = chronology32.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField38 = chronology32.year();
        org.joda.time.DateTimeField dateTimeField39 = chronology32.era();
        org.joda.time.DateTimeField dateTimeField40 = chronology32.clockhourOfHalfday();
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(1180587538124946L, chronology32);
        mutablePeriod8.setPeriod((long) 5, chronology32);
        mutablePeriod8.addYears(2078571);
        mutablePeriod8.addSeconds(0);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
    }

    @Test
    public void test16645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16645");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        mutableInterval2.setDurationAfterStart(0L);
        boolean boolean14 = mutableInterval2.containsNow();
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean25 = mutableInterval20.isBefore((org.joda.time.ReadableInterval) mutableInterval24);
        boolean boolean26 = mutableInterval17.contains((org.joda.time.ReadableInterval) mutableInterval24);
        mutableInterval17.setDurationAfterStart(0L);
        boolean boolean29 = mutableInterval17.containsNow();
        boolean boolean30 = mutableInterval2.isAfter((org.joda.time.ReadableInterval) mutableInterval17);
        mutableInterval17.setDurationBeforeEnd(355200035L);
        org.joda.time.Chronology chronology33 = mutableInterval17.getChronology();
        org.joda.time.ReadableInstant readableInstant34 = null;
        boolean boolean35 = mutableInterval17.isAfter(readableInstant34);
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval44 = mutableInterval43.toInterval();
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean48 = mutableInterval43.isBefore((org.joda.time.ReadableInterval) mutableInterval47);
        boolean boolean49 = mutableInterval40.contains((org.joda.time.ReadableInterval) mutableInterval47);
        mutableInterval40.setDurationAfterStart(0L);
        boolean boolean52 = mutableInterval40.containsNow();
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval56 = mutableInterval55.toInterval();
        org.joda.time.Chronology chronology57 = interval56.getChronology();
        long long58 = interval56.toDurationMillis();
        org.joda.time.Interval interval60 = interval56.withEndMillis((long) (short) 100);
        long long61 = interval56.toDurationMillis();
        boolean boolean62 = mutableInterval40.overlaps((org.joda.time.ReadableInterval) interval56);
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval69 = mutableInterval68.toInterval();
        org.joda.time.MutableInterval mutableInterval72 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean73 = mutableInterval68.isBefore((org.joda.time.ReadableInterval) mutableInterval72);
        boolean boolean74 = mutableInterval65.contains((org.joda.time.ReadableInterval) mutableInterval72);
        org.joda.time.Weeks weeks75 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval72);
        long long76 = mutableInterval72.getEndMillis();
        org.joda.time.DateTime dateTime77 = mutableInterval72.getEnd();
        org.joda.time.Chronology chronology78 = mutableInterval72.getChronology();
        mutableInterval40.setChronology(chronology78);
        org.joda.time.Interval interval80 = new org.joda.time.Interval((long) (byte) 1, (long) 44, chronology78);
        boolean boolean81 = mutableInterval17.overlaps((org.joda.time.ReadableInterval) interval80);
        java.lang.String str82 = mutableInterval17.toString();
        org.joda.time.Period period83 = mutableInterval17.toPeriod();
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 53L + "'", long58 == 53L);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 53L + "'", long61 == 53L);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(interval69);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(weeks75);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 52L + "'", long76 == 52L);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(chronology78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "1969-12-31T22:19:59.964+97:00/1970-01-05T00:59:59.999+97:00" + "'", str82, "1969-12-31T22:19:59.964+97:00/1970-01-05T00:59:59.999+97:00");
        org.junit.Assert.assertNotNull(period83);
    }

    @Test
    public void test16646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16646");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, periodType1, chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = chronology6.getZone();
        org.joda.time.DateTimeField dateTimeField10 = chronology6.minuteOfHour();
        org.joda.time.Chronology chronology11 = chronology6.withUTC();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology6.getZone();
        org.joda.time.Period period13 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType14 = period13.getPeriodType();
        org.joda.time.Period period16 = period13.withMonths((int) (byte) 0);
        org.joda.time.Period period18 = period13.plusMonths((int) (byte) 10);
        int int19 = period13.size();
        org.joda.time.Period period21 = period13.minusDays(13);
        int[] intArray24 = chronology6.get((org.joda.time.ReadablePeriod) period21, (-349238399L), (-54431999941L));
        org.joda.time.DurationField durationField25 = chronology6.minutes();
        // The following exception was thrown during execution in test generation
        try {
            int int28 = durationField25.getDifference((-5226094079650800000L), 4492800000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -87101568069060");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -8, -2, -1, -22, -59, -21, -542]");
        org.junit.Assert.assertNotNull(durationField25);
    }

    @Test
    public void test16647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16647");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        long long5 = interval3.toDurationMillis();
        org.joda.time.Interval interval7 = interval3.withEndMillis((long) (short) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant8.withDurationAdded(readableDuration9, 10);
        org.joda.time.Interval interval12 = interval7.withEnd((org.joda.time.ReadableInstant) instant8);
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.MutableInterval mutableInterval18 = interval16.toMutableInterval();
        org.joda.time.Interval interval20 = interval16.withEndMillis(53L);
        boolean boolean21 = interval7.isBefore((org.joda.time.ReadableInterval) interval16);
        org.joda.time.Instant instant22 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 1, periodType25, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) '4', chronology30);
        org.joda.time.ReadablePartial readablePartial33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.withFields(readablePartial33);
        boolean boolean35 = instant22.isAfter((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.Period period37 = org.joda.time.Period.days((-1));
        org.joda.time.Period period39 = period37.withWeeks((int) 'a');
        org.joda.time.Period period41 = period37.plusMonths((int) (short) -1);
        org.joda.time.Period period43 = period37.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime44 = dateTime32.plus((org.joda.time.ReadablePeriod) period37);
        org.joda.time.Instant instant45 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        org.joda.time.Chronology chronology53 = interval52.getChronology();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) 1, periodType48, chronology53);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) '4', chronology53);
        org.joda.time.ReadablePartial readablePartial56 = null;
        org.joda.time.DateTime dateTime57 = dateTime55.withFields(readablePartial56);
        boolean boolean58 = instant45.isAfter((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Duration duration59 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval66 = mutableInterval65.toInterval();
        org.joda.time.Chronology chronology67 = interval66.getChronology();
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((long) 1, periodType62, chronology67);
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((long) '4', chronology67);
        org.joda.time.ReadablePartial readablePartial70 = null;
        org.joda.time.DateTime dateTime71 = dateTime69.withFields(readablePartial70);
        org.joda.time.DateTime.Property property72 = dateTime71.millisOfDay();
        org.joda.time.DateTime dateTime73 = dateTime71.withEarlierOffsetAtOverlap();
        int int74 = dateTime71.getDayOfWeek();
        org.joda.time.PeriodType periodType76 = null;
        org.joda.time.MutableInterval mutableInterval79 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval80 = mutableInterval79.toInterval();
        org.joda.time.Chronology chronology81 = interval80.getChronology();
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((long) 1, periodType76, chronology81);
        org.joda.time.DateTimeField dateTimeField83 = chronology81.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone84 = chronology81.getZone();
        org.joda.time.DateTime dateTime85 = dateTime71.withChronology(chronology81);
        org.joda.time.Interval interval86 = duration59.toIntervalTo((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.Instant instant88 = instant45.withDurationAdded((org.joda.time.ReadableDuration) duration59, 42);
        org.joda.time.Duration duration89 = duration59.toDuration();
        org.joda.time.MutablePeriod mutablePeriod90 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableDuration) duration59);
        org.joda.time.Interval interval91 = interval7.withDurationAfterStart((org.joda.time.ReadableDuration) duration59);
        org.joda.time.Duration duration92 = interval91.toDuration();
        org.joda.time.Duration duration93 = interval91.toDuration();
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 53L + "'", long5 == 53L);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(mutableInterval18);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(instant45);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNotNull(interval80);
        org.junit.Assert.assertNotNull(chronology81);
        org.junit.Assert.assertNotNull(dateTimeField83);
        org.junit.Assert.assertNotNull(dateTimeZone84);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertNotNull(interval86);
        org.junit.Assert.assertNotNull(instant88);
        org.junit.Assert.assertNotNull(duration89);
        org.junit.Assert.assertNotNull(interval91);
        org.junit.Assert.assertNotNull(duration92);
        org.junit.Assert.assertNotNull(duration93);
    }

    @Test
    public void test16648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16648");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        mutableInterval2.setDurationAfterStart(0L);
        boolean boolean14 = mutableInterval2.containsNow();
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval18 = mutableInterval17.toInterval();
        org.joda.time.Chronology chronology19 = interval18.getChronology();
        long long20 = interval18.toDurationMillis();
        org.joda.time.Interval interval22 = interval18.withEndMillis((long) (short) 100);
        long long23 = interval18.toDurationMillis();
        boolean boolean24 = mutableInterval2.overlaps((org.joda.time.ReadableInterval) interval18);
        boolean boolean26 = interval18.contains((long) (-1));
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.MutableInterval mutableInterval32 = interval30.toMutableInterval();
        boolean boolean33 = interval18.contains((org.joda.time.ReadableInterval) interval30);
        org.joda.time.Period period34 = interval30.toPeriod();
        org.joda.time.Period period36 = period34.withDays((-11));
        org.joda.time.Period period38 = period34.plusDays(51);
        org.joda.time.DurationFieldType durationFieldType39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period41 = period38.withField(durationFieldType39, 1358);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 53L + "'", long20 == 53L);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 53L + "'", long23 == 53L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(mutableInterval32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
    }

    @Test
    public void test16649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16649");
        org.joda.time.Period period8 = new org.joda.time.Period(7, 10, 9, 52, (int) (byte) 100, 15, 2, 7200010);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period19 = org.joda.time.Period.days((-1));
        org.joda.time.Period period21 = period19.withWeeks((int) 'a');
        java.lang.String str22 = period19.toString();
        mutablePeriod17.setPeriod((org.joda.time.ReadablePeriod) period19);
        int int24 = mutablePeriod17.getMillis();
        org.joda.time.MutablePeriod mutablePeriod25 = mutablePeriod17.toMutablePeriod();
        mutablePeriod17.addHours((int) (short) 100);
        mutablePeriod17.setPeriod(11, 0, (int) (byte) 0, 0, 59, (int) '4', (int) '4', 3600010);
        org.joda.time.Period period37 = period8.withFields((org.joda.time.ReadablePeriod) mutablePeriod17);
        java.lang.Object obj41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType43 = period42.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(obj41, periodType43);
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) 1, periodType46, chronology51);
        org.joda.time.DateTimeField dateTimeField53 = chronology51.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone54 = chronology51.getZone();
        org.joda.time.DateTimeField dateTimeField55 = chronology51.minuteOfHour();
        org.joda.time.Chronology chronology56 = chronology51.withUTC();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 44, (-10L), periodType43, chronology56);
        org.joda.time.DateTimeField dateTimeField58 = chronology56.dayOfYear();
        org.joda.time.DateTimeField dateTimeField59 = chronology56.clockhourOfHalfday();
        mutablePeriod17.setPeriod((long) 12, chronology56);
        mutablePeriod17.setMillis(21);
        mutablePeriod17.addDays(64);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "P-1D" + "'", str22, "P-1D");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod25);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(dateTimeField59);
    }

    @Test
    public void test16650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16650");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getMillisOfDay();
        org.joda.time.DateTime dateTime5 = dateTime2.plusMillis((int) '#');
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval12 = mutableInterval11.toInterval();
        org.joda.time.Chronology chronology13 = interval12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 1, periodType8, chronology13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', chronology13);
        org.joda.time.DateTime dateTime16 = dateTime5.withChronology(chronology13);
        int int17 = dateTime16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateTime16.getChronology();
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime16, readableInstant19);
        org.joda.time.MutablePeriod mutablePeriod21 = mutablePeriod20.copy();
        org.joda.time.Period period30 = new org.joda.time.Period(32, 0, 0, 57300593, 60, 11, 3985625, (int) (byte) 100);
        org.joda.time.Period period32 = period30.minusWeeks((-41));
        int int33 = period30.getMonths();
        org.joda.time.Period period35 = period30.minusSeconds(3600010);
        org.joda.time.Hours hours36 = org.joda.time.Hours.MIN_VALUE;
        org.joda.time.Hours hours38 = hours36.dividedBy((-1));
        java.lang.String str39 = hours36.toString();
        org.joda.time.DurationFieldType durationFieldType40 = hours36.getFieldType();
        int int41 = period35.indexOf(durationFieldType40);
        int int42 = mutablePeriod20.get(durationFieldType40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3600010 + "'", int3 == 3600010);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(mutablePeriod21);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(hours36);
        org.junit.Assert.assertNotNull(hours38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "PT-2147483648H" + "'", str39, "PT-2147483648H");
        org.junit.Assert.assertNotNull(durationFieldType40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 15 + "'", int42 == 15);
    }

    @Test
    public void test16651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16651");
        org.joda.time.Hours hours1 = org.joda.time.Hours.SIX;
        org.joda.time.PeriodType periodType2 = hours1.getPeriodType();
        org.joda.time.Period period3 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType4 = period3.getPeriodType();
        org.joda.time.Period period6 = period3.minusMonths(10);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant7.withDurationAdded(readableDuration8, 10);
        org.joda.time.Instant instant13 = instant7.withDurationAdded((-54432000000L), 3);
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) period3, (org.joda.time.ReadableInstant) instant13);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 1, periodType17, chronology22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) '4', chronology22);
        org.joda.time.ReadablePartial readablePartial25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.withFields(readablePartial25);
        org.joda.time.DateTime.Property property27 = dateTime26.millisOfDay();
        org.joda.time.DateTime dateTime28 = dateTime26.withEarlierOffsetAtOverlap();
        int int29 = dateTime26.getDayOfWeek();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.Chronology chronology36 = interval35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 1, periodType31, chronology36);
        org.joda.time.DateTimeField dateTimeField38 = chronology36.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone39 = chronology36.getZone();
        org.joda.time.DateTime dateTime40 = dateTime26.withChronology(chronology36);
        org.joda.time.DateTimeField dateTimeField41 = chronology36.weekOfWeekyear();
        org.joda.time.DurationField durationField42 = dateTimeField41.getRangeDurationField();
        long long44 = durationField42.getValueAsLong((long) 11);
        org.joda.time.DurationFieldType durationFieldType45 = durationField42.getType();
        boolean boolean46 = period3.isSupported(durationFieldType45);
        boolean boolean47 = periodType2.isSupported(durationFieldType45);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(4769326800000L, periodType2);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test16652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16652");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        mutableInterval2.setDurationAfterStart(0L);
        boolean boolean14 = mutableInterval2.containsNow();
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean25 = mutableInterval20.isBefore((org.joda.time.ReadableInterval) mutableInterval24);
        boolean boolean26 = mutableInterval17.contains((org.joda.time.ReadableInterval) mutableInterval24);
        mutableInterval17.setDurationAfterStart(0L);
        boolean boolean29 = mutableInterval17.containsNow();
        boolean boolean30 = mutableInterval2.isAfter((org.joda.time.ReadableInterval) mutableInterval17);
        org.joda.time.Duration duration31 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration32 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval39 = mutableInterval38.toInterval();
        org.joda.time.Chronology chronology40 = interval39.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 1, periodType35, chronology40);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) '4', chronology40);
        org.joda.time.ReadablePartial readablePartial43 = null;
        org.joda.time.DateTime dateTime44 = dateTime42.withFields(readablePartial43);
        org.joda.time.DateTime.Property property45 = dateTime44.millisOfDay();
        org.joda.time.DateTime dateTime46 = dateTime44.withEarlierOffsetAtOverlap();
        int int47 = dateTime44.getDayOfWeek();
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval53 = mutableInterval52.toInterval();
        org.joda.time.Chronology chronology54 = interval53.getChronology();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) 1, periodType49, chronology54);
        org.joda.time.DateTimeField dateTimeField56 = chronology54.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone57 = chronology54.getZone();
        org.joda.time.DateTime dateTime58 = dateTime44.withChronology(chronology54);
        org.joda.time.Interval interval59 = duration32.toIntervalTo((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period62 = duration32.toPeriodFrom((org.joda.time.ReadableInstant) dateTime61);
        boolean boolean63 = duration31.isShorterThan((org.joda.time.ReadableDuration) duration32);
        mutableInterval2.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Duration duration65 = duration32.toDuration();
        org.joda.time.Duration duration67 = org.joda.time.Duration.millis(1645455261573L);
        org.joda.time.PeriodType periodType69 = org.joda.time.PeriodType.yearMonthDayTime();
        java.lang.String str70 = periodType69.getName();
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((long) (short) -1, periodType69);
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period82 = org.joda.time.Period.days((-1));
        org.joda.time.Period period84 = period82.withWeeks((int) 'a');
        java.lang.String str85 = period82.toString();
        mutablePeriod80.setPeriod((org.joda.time.ReadablePeriod) period82);
        int int87 = mutablePeriod80.getMillis();
        org.joda.time.DurationFieldType durationFieldType89 = mutablePeriod80.getFieldType(0);
        int int90 = periodType69.indexOf(durationFieldType89);
        org.joda.time.PeriodType periodType91 = periodType69.withMinutesRemoved();
        org.joda.time.PeriodType periodType92 = periodType91.withHoursRemoved();
        org.joda.time.Period period93 = duration67.toPeriod(periodType91);
        org.joda.time.Period period94 = duration32.toPeriod(periodType91);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(periodType69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "YearMonthDayTime" + "'", str70, "YearMonthDayTime");
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "P-1D" + "'", str85, "P-1D");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(durationFieldType89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNotNull(periodType91);
        org.junit.Assert.assertNotNull(periodType92);
        org.junit.Assert.assertNotNull(period93);
        org.junit.Assert.assertNotNull(period94);
    }

    @Test
    public void test16653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16653");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean13 = mutableInterval2.isBefore(0L);
        long long14 = mutableInterval2.toDurationMillis();
        java.lang.String str15 = mutableInterval2.toString();
        org.joda.time.Instant instant16 = org.joda.time.Instant.now();
        org.joda.time.Instant instant18 = instant16.withMillis((-10L));
        boolean boolean19 = mutableInterval2.contains((org.joda.time.ReadableInstant) instant18);
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardDays(56L);
        org.joda.time.Instant instant23 = instant18.withDurationAdded((org.joda.time.ReadableDuration) duration21, (int) '4');
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 53L + "'", long14 == 53L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-05T00:59:59.999+97:00/1970-01-05T01:00:00.052+97:00" + "'", str15, "1970-01-05T00:59:59.999+97:00/1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(instant23);
    }

    @Test
    public void test16654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16654");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withFields(readablePartial10);
        org.joda.time.DateTime.Property property12 = dateTime11.millisOfDay();
        org.joda.time.DateTime dateTime14 = dateTime11.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property15 = dateTime11.era();
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        int int22 = property15.compareTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime.Property property23 = dateTime21.dayOfWeek();
        org.joda.time.DateTime dateTime24 = property23.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime25 = dateTime24.toLocalDateTime();
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
    }
}
