import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest29 {

    public static boolean debug = false;

    @Test
    public void test14501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14501");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodPrinter periodPrinter3 = periodFormatter2.getPrinter();
        org.joda.time.PeriodType periodType4 = periodFormatter2.getParseType();
        java.util.Locale locale5 = periodFormatter2.getLocale();
        java.io.Writer writer6 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 100, (long) 10, periodType9);
        mutablePeriod10.setMonths((int) (byte) -1);
        mutablePeriod10.addMillis(100);
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
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone47);
        int int49 = dateTime48.getMillisOfDay();
        org.joda.time.DateTime dateTime51 = dateTime48.plusMillis((int) '#');
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval58 = mutableInterval57.toInterval();
        org.joda.time.Chronology chronology59 = interval58.getChronology();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) 1, periodType54, chronology59);
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) '4', chronology59);
        org.joda.time.DateTime dateTime62 = dateTime51.withChronology(chronology59);
        org.joda.time.Interval interval63 = duration15.toIntervalFrom((org.joda.time.ReadableInstant) dateTime51);
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration15);
        mutablePeriod10.addWeeks((-66839380));
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer6, (org.joda.time.ReadablePeriod) mutablePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodPrinter3);
        org.junit.Assert.assertNull(periodType4);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(period45);
// flaky:         org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3600010 + "'", int49 == 3600010);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(interval63);
    }

    @Test
    public void test14502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14502");
        org.joda.time.Days days1 = org.joda.time.Days.TWO;
        org.joda.time.Days days2 = org.joda.time.Days.ONE;
        int int3 = days2.getDays();
        int int4 = days2.size();
        org.joda.time.Days days6 = days2.dividedBy((int) (short) -1);
        org.joda.time.Days days7 = org.joda.time.Days.THREE;
        boolean boolean8 = days6.isLessThan(days7);
        boolean boolean9 = days1.isLessThan(days6);
        org.joda.time.Days days11 = days6.plus(366);
        org.joda.time.Days days12 = days6.negated();
        org.joda.time.Days days14 = days6.dividedBy(349200000);
        org.joda.time.PeriodType periodType15 = days14.getPeriodType();
        org.joda.time.PeriodType periodType16 = periodType15.withMinutesRemoved();
        org.joda.time.PeriodType periodType17 = periodType16.withMillisRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period18 = new org.joda.time.Period((java.lang.Object) 5896L, periodType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
    }

    @Test
    public void test14503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14503");
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
        org.joda.time.DateTimeField dateTimeField37 = chronology21.clockhourOfDay();
        java.util.Locale locale39 = null;
        java.lang.String str40 = dateTimeField37.getAsText((long) 2022, locale39);
        int int43 = dateTimeField37.getDifference((long) 887, 28800010L);
        long long45 = dateTimeField37.roundFloor(31885200000L);
        long long48 = dateTimeField37.add(678L, (-623L));
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
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
        org.junit.Assert.assertNotNull(dateTimeField37);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1" + "'", str40, "1");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-7) + "'", int43 == (-7));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 31885200000L + "'", long45 == 31885200000L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-2242799322L) + "'", long48 == (-2242799322L));
    }

    @Test
    public void test14504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14504");
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
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone24);
        int int26 = dateTime25.getSecondOfMinute();
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(periodType27);
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadablePeriod) mutablePeriod28);
        org.joda.time.Hours hours30 = org.joda.time.Hours.EIGHT;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period41 = org.joda.time.Period.days((-1));
        org.joda.time.Period period43 = period41.withWeeks((int) 'a');
        java.lang.String str44 = period41.toString();
        mutablePeriod39.setPeriod((org.joda.time.ReadablePeriod) period41);
        int int46 = mutablePeriod39.getMillis();
        org.joda.time.DurationFieldType durationFieldType48 = mutablePeriod39.getFieldType(0);
        int int49 = hours30.get(durationFieldType48);
        mutablePeriod28.set(durationFieldType48, (int) (short) 0);
        org.joda.time.Period period52 = period15.plus((org.joda.time.ReadablePeriod) mutablePeriod28);
        org.joda.time.MutablePeriod mutablePeriod53 = mutablePeriod28.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod28.add(531, 187201970, 463, 3600000, (int) (byte) 1, 282, 120, 599);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(hours30);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "P-1D" + "'", str44, "P-1D");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(durationFieldType48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(mutablePeriod53);
    }

    @Test
    public void test14505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14505");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(187200000);
        long long5 = dateTimeZone3.previousTransition(4L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval6 = new org.joda.time.Interval((long) 42, (-349199900L), dateTimeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 4L + "'", long5 == 4L);
    }

    @Test
    public void test14506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14506");
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        org.joda.time.Chronology chronology12 = interval11.getChronology();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 1, periodType7, chronology12);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) '4', chronology12);
        org.joda.time.DurationField durationField15 = chronology12.centuries();
        org.joda.time.DurationField durationField16 = chronology12.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(956, 97, 138, 736, 57339, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 736 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test14507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14507");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
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
        org.joda.time.Interval interval27 = duration0.toIntervalTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period30 = duration0.toPeriodFrom((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Duration duration32 = duration0.withMillis(100L);
        long long33 = duration0.getStandardDays();
        long long34 = duration0.getMillis();
        org.joda.time.Instant instant35 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        org.joda.time.Chronology chronology43 = interval42.getChronology();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 1, periodType38, chronology43);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) '4', chronology43);
        org.joda.time.ReadablePartial readablePartial46 = null;
        org.joda.time.DateTime dateTime47 = dateTime45.withFields(readablePartial46);
        boolean boolean48 = instant35.isAfter((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTime.Property property49 = dateTime45.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField50 = property49.getField();
        org.joda.time.Interval interval51 = property49.toInterval();
        org.joda.time.Duration duration53 = org.joda.time.Duration.standardHours((long) 'a');
        org.joda.time.Duration duration55 = duration53.minus((-2496683648L));
        org.joda.time.Duration duration56 = duration55.toDuration();
        org.joda.time.Interval interval57 = interval51.withDurationAfterStart((org.joda.time.ReadableDuration) duration55);
        boolean boolean58 = duration0.isLongerThan((org.joda.time.ReadableDuration) duration55);
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test14508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14508");
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        org.joda.time.Chronology chronology9 = interval8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 1, periodType4, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '4', chronology9);
        org.joda.time.ReadablePartial readablePartial12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.withFields(readablePartial12);
        org.joda.time.DateTime.Property property14 = dateTime13.millisOfDay();
        org.joda.time.DateTime dateTime16 = dateTime13.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime18 = dateTime13.withCenturyOfEra((int) (short) 1);
        org.joda.time.Hours hours19 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours20 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours21 = hours19.minus(hours20);
        org.joda.time.Duration duration22 = hours20.toStandardDuration();
        org.joda.time.DateTime dateTime23 = dateTime13.plus((org.joda.time.ReadableDuration) duration22);
        org.joda.time.Duration duration24 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration25 = duration24.toDuration();
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.DateTimeZone dateTimeZone31 = chronology30.getZone();
        org.joda.time.Period period32 = duration24.toPeriod(chronology30);
        boolean boolean33 = duration22.isShorterThan((org.joda.time.ReadableDuration) duration24);
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.days();
        org.joda.time.Period period35 = duration24.toPeriod(periodType34);
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 1, periodType37, chronology42);
        org.joda.time.DateTimeField dateTimeField44 = chronology42.yearOfCentury();
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        org.joda.time.DateTimeZone dateTimeZone51 = chronology50.getZone();
        java.lang.String str53 = dateTimeZone51.getName(100L);
        org.joda.time.DateTime dateTime54 = dateTime45.withZoneRetainFields(dateTimeZone51);
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval58 = mutableInterval57.toInterval();
        org.joda.time.Chronology chronology59 = interval58.getChronology();
        org.joda.time.DateTimeZone dateTimeZone60 = chronology59.getZone();
        java.lang.String str62 = dateTimeZone60.getName(100L);
        org.joda.time.DateTime dateTime63 = dateTime54.withZoneRetainFields(dateTimeZone60);
        org.joda.time.Chronology chronology64 = chronology42.withZone(dateTimeZone60);
        org.joda.time.Period period65 = new org.joda.time.Period(0L, 10L, periodType34, chronology42);
        org.joda.time.PeriodType periodType66 = periodType34.withWeeksRemoved();
        org.joda.time.PeriodType periodType67 = periodType66.withMillisRemoved();
        org.joda.time.PeriodType periodType68 = periodType67.withSecondsRemoved();
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeZone51);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+97:00" + "'", str53, "+97:00");
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTimeZone60);
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "+97:00" + "'", str62, "+97:00");
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(periodType66);
        org.junit.Assert.assertNotNull(periodType67);
        org.junit.Assert.assertNotNull(periodType68);
    }

    @Test
    public void test14509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14509");
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
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone17);
        int int19 = dateTime18.getMillisOfDay();
        org.joda.time.DateTime dateTime21 = dateTime18.plusMillis((int) '#');
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        org.joda.time.Chronology chronology29 = interval28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 1, periodType24, chronology29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) '4', chronology29);
        org.joda.time.DateTime dateTime32 = dateTime21.withChronology(chronology29);
        int int33 = dateTime32.getYearOfEra();
        org.joda.time.Chronology chronology34 = dateTime32.getChronology();
        org.joda.time.DateTime dateTime36 = dateTime32.minusWeeks(55);
        int int37 = property14.compareTo((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTime dateTime39 = dateTime36.minusWeeks(12);
        org.joda.time.DateTime.Property property40 = dateTime39.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        java.lang.String str42 = dateTimeFieldType41.toString();
        java.lang.String str43 = dateTimeFieldType41.toString();
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        org.joda.time.Chronology chronology48 = interval47.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField50 = dateTimeFieldType41.getField(chronology48);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = dateTimeField50.getType();
        org.joda.time.DurationFieldType durationFieldType52 = dateTimeFieldType51.getRangeDurationType();
        int int53 = dateTime39.get(dateTimeFieldType51);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3600010 + "'", int19 == 3600010);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1970 + "'", int33 == 1970);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "halfdayOfDay" + "'", str42, "halfdayOfDay");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "halfdayOfDay" + "'", str43, "halfdayOfDay");
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertNotNull(durationFieldType52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test14510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14510");
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
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone36);
        int int38 = dateTime37.getSecondOfMinute();
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(periodType39);
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadablePeriod) mutablePeriod40);
        boolean boolean42 = interval30.abuts((org.joda.time.ReadableInterval) mutableInterval41);
        org.joda.time.DateTime dateTime43 = interval30.getStart();
        org.joda.time.DateTime.Property property44 = dateTime43.monthOfYear();
        java.lang.String str45 = property44.toString();
        java.util.Locale locale46 = null;
        java.lang.String str47 = property44.getAsText(locale46);
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Property[monthOfYear]" + "'", str45, "Property[monthOfYear]");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "January" + "'", str47, "January");
    }

    @Test
    public void test14511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14511");
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
        org.joda.time.Period period36 = period34.minusHours(1970);
        org.joda.time.Seconds seconds37 = period34.toStandardSeconds();
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
        boolean boolean64 = interval56.contains((long) (-1));
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval68 = mutableInterval67.toInterval();
        org.joda.time.Chronology chronology69 = interval68.getChronology();
        org.joda.time.MutableInterval mutableInterval70 = interval68.toMutableInterval();
        boolean boolean71 = interval56.contains((org.joda.time.ReadableInterval) interval68);
        org.joda.time.Period period72 = interval68.toPeriod();
        org.joda.time.Period period74 = period72.minusHours(1970);
        org.joda.time.Seconds seconds75 = period72.toStandardSeconds();
        org.joda.time.Seconds seconds76 = seconds37.minus(seconds75);
        org.joda.time.Seconds seconds78 = seconds37.multipliedBy(948);
        org.joda.time.MutableInterval mutableInterval81 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval82 = mutableInterval81.toInterval();
        org.joda.time.Chronology chronology83 = interval82.getChronology();
        long long84 = interval82.toDurationMillis();
        org.joda.time.Interval interval86 = interval82.withEndMillis((long) (short) 100);
        long long87 = interval82.toDurationMillis();
        org.joda.time.Seconds seconds88 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval82);
        org.joda.time.Seconds seconds90 = seconds88.dividedBy((-3600000));
        org.joda.time.Seconds seconds92 = seconds88.plus(999);
        org.joda.time.Seconds seconds94 = seconds88.plus(70);
        org.joda.time.Seconds seconds95 = seconds78.plus(seconds88);
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
        org.junit.Assert.assertNotNull(seconds37);
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
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(interval68);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(mutableInterval70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(seconds75);
        org.junit.Assert.assertNotNull(seconds76);
        org.junit.Assert.assertNotNull(seconds78);
        org.junit.Assert.assertNotNull(interval82);
        org.junit.Assert.assertNotNull(chronology83);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 53L + "'", long84 == 53L);
        org.junit.Assert.assertNotNull(interval86);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 53L + "'", long87 == 53L);
        org.junit.Assert.assertNotNull(seconds88);
        org.junit.Assert.assertNotNull(seconds90);
        org.junit.Assert.assertNotNull(seconds92);
        org.junit.Assert.assertNotNull(seconds94);
        org.junit.Assert.assertNotNull(seconds95);
    }

    @Test
    public void test14512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14512");
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
        org.joda.time.DateTime dateTime27 = mutableInterval23.getStart();
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
        org.joda.time.DateTime dateTime41 = dateTime27.withZone(dateTimeZone34);
        int int43 = dateTimeZone34.getOffsetFromLocal((long) 20);
        long long45 = dateTimeZone34.previousTransition((long) 31);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone47);
        int int49 = dateTime48.getDayOfMonth();
        org.joda.time.DateTime dateTime51 = dateTime48.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property52 = dateTime51.dayOfYear();
        org.joda.time.DateTime dateTime53 = property52.roundHalfFloorCopy();
        java.util.Locale locale54 = null;
        int int55 = property52.getMaximumTextLength(locale54);
        java.lang.String str56 = property52.getAsShortText();
        org.joda.time.DateTime dateTime57 = property52.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime58 = dateTime57.toDateTime();
        boolean boolean59 = dateTimeZone34.equals((java.lang.Object) dateTime58);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval64 = mutableInterval63.toInterval();
        org.joda.time.Chronology chronology65 = interval64.getChronology();
        org.joda.time.DateTimeZone dateTimeZone66 = chronology65.getZone();
        java.lang.String str68 = dateTimeZone66.getName(100L);
        org.joda.time.DateTime dateTime69 = dateTime60.withZoneRetainFields(dateTimeZone66);
        int int70 = dateTime69.getMinuteOfDay();
        int int71 = dateTime69.getEra();
        org.joda.time.DateTime dateTime73 = dateTime69.minusMillis(0);
        int int74 = dateTime73.getMillisOfSecond();
        org.joda.time.DateTime dateTime76 = dateTime73.minusMillis(15);
        org.joda.time.LocalTime localTime77 = dateTime73.toLocalTime();
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.Duration duration79 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime73, readableInstant78);
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime58, (org.joda.time.ReadableDuration) duration79);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime82 = dateTime58.withEra((-168));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -168 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+97:00" + "'", str36, "+97:00");
        org.junit.Assert.assertNotNull(dateTime37);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+97:00" + "'", str38, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dateTime41);
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 349200000 + "'", int43 == 349200000);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 31L + "'", long45 == 31L);
// flaky:         org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "5" + "'", str56, "5");
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(dateTimeZone66);
// flaky:         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "+97:00" + "'", str68, "+97:00");
        org.junit.Assert.assertNotNull(dateTime69);
// flaky:         org.junit.Assert.assertTrue("'" + int70 + "' != '" + 957 + "'", int70 == 957);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(dateTime73);
// flaky:         org.junit.Assert.assertTrue("'" + int74 + "' != '" + 183 + "'", int74 == 183);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(localTime77);
    }

    @Test
    public void test14513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14513");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillisOfDay(0);
        org.joda.time.DateTime dateTime11 = dateTime7.plus(29916082802456L);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMinutes(10);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test14514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14514");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis((-933698109L));
        org.joda.time.Instant instant2 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval9 = mutableInterval8.toInterval();
        org.joda.time.Chronology chronology10 = interval9.getChronology();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 1, periodType5, chronology10);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) '4', chronology10);
        org.joda.time.ReadablePartial readablePartial13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withFields(readablePartial13);
        boolean boolean15 = instant2.isAfter((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime.Property property16 = dateTime12.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone18);
        int int20 = dateTime19.getDayOfMonth();
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        org.joda.time.Chronology chronology27 = interval26.getChronology();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 1, periodType22, chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone30 = chronology27.getZone();
        org.joda.time.DateTime dateTime31 = dateTime19.withZoneRetainFields(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = dateTime12.withZone(dateTimeZone30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = dateTime12.toString(dateTimeFormatter33);
        org.joda.time.DateTime.Property property35 = dateTime12.yearOfCentury();
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        org.joda.time.Chronology chronology43 = interval42.getChronology();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 1, periodType38, chronology43);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) '4', chronology43);
        org.joda.time.ReadablePartial readablePartial46 = null;
        org.joda.time.DateTime dateTime47 = dateTime45.withFields(readablePartial46);
        org.joda.time.DateTime.Property property48 = dateTime47.millisOfDay();
        org.joda.time.DateTime dateTime49 = dateTime47.withEarlierOffsetAtOverlap();
        int int50 = dateTime47.getDayOfWeek();
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval56 = mutableInterval55.toInterval();
        org.joda.time.Chronology chronology57 = interval56.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 1, periodType52, chronology57);
        org.joda.time.DateTimeField dateTimeField59 = chronology57.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone60 = chronology57.getZone();
        org.joda.time.DateTime dateTime61 = dateTime47.withChronology(chronology57);
        org.joda.time.DateTime dateTime62 = dateTime47.withEarlierOffsetAtOverlap();
        org.joda.time.Period period63 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType64 = period63.getPeriodType();
        org.joda.time.Period period66 = period63.withMonths((int) (byte) 0);
        org.joda.time.Period period67 = period63.toPeriod();
        org.joda.time.DateTime dateTime69 = dateTime62.withPeriodAdded((org.joda.time.ReadablePeriod) period67, (int) (byte) 0);
        boolean boolean70 = property35.equals((java.lang.Object) dateTime69);
        org.joda.time.Period period71 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateTime69);
        java.lang.String str72 = dateTime69.toString();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(property16);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970-01-05T01:00:00.052+97:00" + "'", str34, "1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTime49);
// flaky:         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(period71);
// flaky:         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "1970-01-05T01:00:00.052+97:00" + "'", str72, "1970-01-05T01:00:00.052+97:00");
    }

    @Test
    public void test14515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14515");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds(47);
        org.joda.time.Seconds seconds2 = seconds1.negated();
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval9 = mutableInterval8.toInterval();
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean13 = mutableInterval8.isBefore((org.joda.time.ReadableInterval) mutableInterval12);
        boolean boolean14 = mutableInterval5.contains((org.joda.time.ReadableInterval) mutableInterval12);
        mutableInterval5.setDurationAfterStart(0L);
        boolean boolean17 = mutableInterval5.containsNow();
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        long long23 = interval21.toDurationMillis();
        org.joda.time.Interval interval25 = interval21.withEndMillis((long) (short) 100);
        long long26 = interval21.toDurationMillis();
        boolean boolean27 = mutableInterval5.overlaps((org.joda.time.ReadableInterval) interval21);
        boolean boolean29 = interval21.contains((long) (-1));
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.MutableInterval mutableInterval35 = interval33.toMutableInterval();
        boolean boolean36 = interval21.contains((org.joda.time.ReadableInterval) interval33);
        org.joda.time.Period period37 = interval33.toPeriod();
        org.joda.time.Period period39 = period37.minusHours(1970);
        org.joda.time.Seconds seconds40 = period37.toStandardSeconds();
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean51 = mutableInterval46.isBefore((org.joda.time.ReadableInterval) mutableInterval50);
        boolean boolean52 = mutableInterval43.contains((org.joda.time.ReadableInterval) mutableInterval50);
        mutableInterval43.setDurationAfterStart(0L);
        boolean boolean55 = mutableInterval43.containsNow();
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval59 = mutableInterval58.toInterval();
        org.joda.time.Chronology chronology60 = interval59.getChronology();
        long long61 = interval59.toDurationMillis();
        org.joda.time.Interval interval63 = interval59.withEndMillis((long) (short) 100);
        long long64 = interval59.toDurationMillis();
        boolean boolean65 = mutableInterval43.overlaps((org.joda.time.ReadableInterval) interval59);
        boolean boolean67 = interval59.contains((long) (-1));
        org.joda.time.MutableInterval mutableInterval70 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval71 = mutableInterval70.toInterval();
        org.joda.time.Chronology chronology72 = interval71.getChronology();
        org.joda.time.MutableInterval mutableInterval73 = interval71.toMutableInterval();
        boolean boolean74 = interval59.contains((org.joda.time.ReadableInterval) interval71);
        org.joda.time.Period period75 = interval71.toPeriod();
        org.joda.time.Period period77 = period75.minusHours(1970);
        org.joda.time.Seconds seconds78 = period75.toStandardSeconds();
        org.joda.time.Seconds seconds79 = seconds40.minus(seconds78);
        org.joda.time.Seconds seconds81 = seconds78.multipliedBy(947);
        org.joda.time.Seconds seconds82 = org.joda.time.Seconds.MIN_VALUE;
        org.joda.time.Duration duration83 = seconds82.toStandardDuration();
        org.joda.time.Seconds seconds85 = seconds82.dividedBy(1);
        org.joda.time.Seconds seconds86 = seconds78.plus(seconds82);
        java.lang.String str87 = seconds78.toString();
        boolean boolean88 = seconds2.isGreaterThan(seconds78);
        org.joda.time.Duration duration89 = seconds2.toStandardDuration();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 53L + "'", long23 == 53L);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 53L + "'", long26 == 53L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(mutableInterval35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(seconds40);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 53L + "'", long61 == 53L);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 53L + "'", long64 == 53L);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(interval71);
        org.junit.Assert.assertNotNull(chronology72);
        org.junit.Assert.assertNotNull(mutableInterval73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(seconds78);
        org.junit.Assert.assertNotNull(seconds79);
        org.junit.Assert.assertNotNull(seconds81);
        org.junit.Assert.assertNotNull(seconds82);
        org.junit.Assert.assertNotNull(duration83);
        org.junit.Assert.assertNotNull(seconds85);
        org.junit.Assert.assertNotNull(seconds86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "PT0S" + "'", str87, "PT0S");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(duration89);
    }

    @Test
    public void test14516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14516");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 100, (long) 10, periodType2);
        mutablePeriod3.setMonths((int) (byte) -1);
        int int6 = mutablePeriod3.getMinutes();
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 1, periodType12, chronology17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '4', chronology17);
        org.joda.time.ReadablePartial readablePartial20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withFields(readablePartial20);
        org.joda.time.DateTime.Property property22 = dateTime21.millisOfDay();
        org.joda.time.DateTime dateTime24 = dateTime21.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime26 = dateTime21.withCenturyOfEra((int) (short) 1);
        org.joda.time.Hours hours27 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours28 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours29 = hours27.minus(hours28);
        org.joda.time.Duration duration30 = hours28.toStandardDuration();
        org.joda.time.DateTime dateTime31 = dateTime21.plus((org.joda.time.ReadableDuration) duration30);
        org.joda.time.Duration duration32 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration33 = duration32.toDuration();
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        org.joda.time.DateTimeZone dateTimeZone39 = chronology38.getZone();
        org.joda.time.Period period40 = duration32.toPeriod(chronology38);
        boolean boolean41 = duration30.isShorterThan((org.joda.time.ReadableDuration) duration32);
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.days();
        org.joda.time.Period period43 = duration32.toPeriod(periodType42);
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 1, periodType45, chronology50);
        org.joda.time.DateTimeField dateTimeField52 = chronology50.yearOfCentury();
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval57 = mutableInterval56.toInterval();
        org.joda.time.Chronology chronology58 = interval57.getChronology();
        org.joda.time.DateTimeZone dateTimeZone59 = chronology58.getZone();
        java.lang.String str61 = dateTimeZone59.getName(100L);
        org.joda.time.DateTime dateTime62 = dateTime53.withZoneRetainFields(dateTimeZone59);
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval66 = mutableInterval65.toInterval();
        org.joda.time.Chronology chronology67 = interval66.getChronology();
        org.joda.time.DateTimeZone dateTimeZone68 = chronology67.getZone();
        java.lang.String str70 = dateTimeZone68.getName(100L);
        org.joda.time.DateTime dateTime71 = dateTime62.withZoneRetainFields(dateTimeZone68);
        org.joda.time.Chronology chronology72 = chronology50.withZone(dateTimeZone68);
        org.joda.time.Period period73 = new org.joda.time.Period(0L, 10L, periodType42, chronology50);
        mutablePeriod3.setPeriod((-61394288400000L), chronology50);
        mutablePeriod3.setSeconds(21);
        int int77 = mutablePeriod3.getMonths();
        mutablePeriod3.setDays(40);
        java.lang.String str80 = mutablePeriod3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(hours27);
        org.junit.Assert.assertNotNull(hours28);
        org.junit.Assert.assertNotNull(hours29);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(dateTimeZone59);
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "+97:00" + "'", str61, "+97:00");
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(dateTimeZone68);
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "+97:00" + "'", str70, "+97:00");
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(chronology72);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "P-101511W40DT-1H21S" + "'", str80, "P-101511W40DT-1H21S");
    }

    @Test
    public void test14517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14517");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        int int15 = mutablePeriod8.getMillis();
        mutablePeriod8.setSeconds((-86459));
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P-1D" + "'", str13, "P-1D");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test14518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14518");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.MutableInterval mutableInterval5 = interval3.toMutableInterval();
        org.joda.time.Interval interval7 = interval3.withEndMillis(53L);
        org.joda.time.Chronology chronology8 = interval3.getChronology();
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean19 = mutableInterval14.isBefore((org.joda.time.ReadableInterval) mutableInterval18);
        boolean boolean20 = mutableInterval11.contains((org.joda.time.ReadableInterval) mutableInterval18);
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        long long26 = interval24.toDurationMillis();
        org.joda.time.Interval interval28 = interval24.withEndMillis((long) (short) 100);
        mutableInterval18.setInterval((org.joda.time.ReadableInterval) interval24);
        boolean boolean30 = mutableInterval18.containsNow();
        boolean boolean31 = interval3.contains((org.joda.time.ReadableInterval) mutableInterval18);
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(periodType32);
        org.joda.time.Period period34 = mutableInterval18.toPeriod(periodType32);
        org.joda.time.Duration duration35 = mutableInterval18.toDuration();
        java.lang.String str36 = duration35.toString();
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(mutableInterval5);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 53L + "'", long26 == 53L);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PT0.053S" + "'", str36, "PT0.053S");
    }

    @Test
    public void test14519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14519");
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
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean41 = mutableInterval36.isBefore((org.joda.time.ReadableInterval) mutableInterval40);
        boolean boolean42 = mutableInterval33.contains((org.joda.time.ReadableInterval) mutableInterval40);
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval46 = mutableInterval45.toInterval();
        org.joda.time.Chronology chronology47 = interval46.getChronology();
        long long48 = interval46.toDurationMillis();
        org.joda.time.Interval interval50 = interval46.withEndMillis((long) (short) 100);
        mutableInterval40.setInterval((org.joda.time.ReadableInterval) interval46);
        boolean boolean52 = mutableInterval40.containsNow();
        org.joda.time.Period period53 = mutableInterval40.toPeriod();
        long long54 = mutableInterval40.getEndMillis();
        mutableInterval40.setDurationBeforeEnd(53035L);
        boolean boolean57 = mutableInterval17.overlaps((org.joda.time.ReadableInterval) mutableInterval40);
        boolean boolean58 = mutableInterval17.isAfterNow();
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 53L + "'", long48 == 53L);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 52L + "'", long54 == 52L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test14520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14520");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(periodType4);
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadablePeriod) mutablePeriod5);
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) mutableInterval6);
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.minutes(1969);
        org.joda.time.Minutes minutes11 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType12 = null;
        int int13 = minutes11.get(durationFieldType12);
        int int15 = minutes11.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod16 = minutes11.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType18 = minutes11.getFieldType(0);
        org.joda.time.DurationFieldType durationFieldType19 = minutes11.getFieldType();
        int int20 = minutes11.size();
        org.joda.time.Minutes minutes21 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes23 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType24 = null;
        int int25 = minutes23.get(durationFieldType24);
        org.joda.time.DurationFieldType durationFieldType26 = minutes23.getFieldType();
        boolean boolean27 = minutes21.isGreaterThan(minutes23);
        org.joda.time.Minutes minutes29 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType30 = null;
        int int31 = minutes29.get(durationFieldType30);
        org.joda.time.DurationFieldType durationFieldType32 = minutes29.getFieldType();
        boolean boolean33 = minutes21.isLessThan(minutes29);
        org.joda.time.DurationFieldType durationFieldType34 = minutes21.getFieldType();
        org.joda.time.Minutes minutes35 = minutes11.plus(minutes21);
        boolean boolean36 = minutes9.isGreaterThan(minutes11);
        org.joda.time.Minutes minutes37 = minutes7.plus(minutes11);
        org.joda.time.Minutes minutes39 = minutes7.multipliedBy(736);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(mutablePeriod16);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertNotNull(minutes35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(minutes37);
        org.junit.Assert.assertNotNull(minutes39);
    }

    @Test
    public void test14521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14521");
        org.joda.time.Days days1 = org.joda.time.Days.days((int) (short) 10);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.hourOfHalfday();
        long long13 = dateTimeField10.getDifferenceAsLong((long) 10, (long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone15);
        int int17 = dateTime16.getSecondOfMinute();
        org.joda.time.DateTime dateTime19 = dateTime16.withMinuteOfHour(10);
        org.joda.time.TimeOfDay timeOfDay20 = dateTime19.toTimeOfDay();
        int[] intArray27 = new int[] { '4', 1970, 10, (byte) 10, 24, 50 };
        int int28 = dateTimeField10.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay20, intArray27);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.Chronology chronology35 = interval34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 1, periodType30, chronology35);
        org.joda.time.DateTimeField dateTimeField37 = chronology35.hourOfHalfday();
        long long40 = dateTimeField37.getDifferenceAsLong((long) 10, (long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone42);
        int int44 = dateTime43.getSecondOfMinute();
        org.joda.time.DateTime dateTime46 = dateTime43.withMinuteOfHour(10);
        org.joda.time.TimeOfDay timeOfDay47 = dateTime46.toTimeOfDay();
        int[] intArray54 = new int[] { '4', 1970, 10, (byte) 10, 24, 50 };
        int int55 = dateTimeField37.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay47, intArray54);
        org.joda.time.Days days56 = org.joda.time.Days.daysBetween((org.joda.time.ReadablePartial) timeOfDay20, (org.joda.time.ReadablePartial) timeOfDay47);
        org.joda.time.Days days58 = days56.dividedBy(60);
        org.joda.time.Duration duration59 = days58.toStandardDuration();
        boolean boolean60 = days1.isGreaterThan(days58);
        org.joda.time.Days days62 = days1.minus(531);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[52, 1970, 10, 10, 24, 50]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 11 + "'", int28 == 11);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[52, 1970, 10, 10, 24, 50]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 11 + "'", int55 == 11);
        org.junit.Assert.assertNotNull(days56);
        org.junit.Assert.assertNotNull(days58);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(days62);
    }

    @Test
    public void test14522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14522");
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
        org.joda.time.DateTime dateTime25 = mutableInterval2.getEnd();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period36 = org.joda.time.Period.days((-1));
        org.joda.time.Period period38 = period36.withWeeks((int) 'a');
        java.lang.String str39 = period36.toString();
        mutablePeriod34.setPeriod((org.joda.time.ReadablePeriod) period36);
        int int41 = mutablePeriod34.getMillis();
        org.joda.time.DurationFieldType durationFieldType43 = mutablePeriod34.getFieldType(0);
        org.joda.time.Period period44 = new org.joda.time.Period((java.lang.Object) mutablePeriod34);
        org.joda.time.Period period46 = period44.minusHours((-1870));
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval53 = mutableInterval52.toInterval();
        org.joda.time.Chronology chronology54 = interval53.getChronology();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) 1, periodType49, chronology54);
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) '4', chronology54);
        org.joda.time.DurationField durationField57 = chronology54.centuries();
        org.joda.time.DateTimeField dateTimeField58 = chronology54.secondOfDay();
        org.joda.time.Period period59 = new org.joda.time.Period((java.lang.Object) period44, chronology54);
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((java.lang.Object) mutableInterval2, chronology54);
        org.joda.time.DateTimeField dateTimeField61 = chronology54.era();
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(chronology54);
        org.joda.time.DateTimeField dateTimeField63 = chronology54.hourOfDay();
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
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "P-1D" + "'", str39, "P-1D");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(dateTimeField63);
    }

    @Test
    public void test14523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14523");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        java.util.Locale locale8 = null;
        int int9 = property6.getMaximumTextLength(locale8);
        java.lang.String str10 = property6.getAsShortText();
        org.joda.time.DateTime dateTime11 = property6.withMaximumValue();
        org.joda.time.DateTime dateTime12 = property6.getDateTime();
        org.joda.time.DateTime dateTime14 = dateTime12.minusMillis(0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "5" + "'", str10, "5");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test14524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14524");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Interval interval4 = interval3.toInterval();
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean15 = mutableInterval10.isBefore((org.joda.time.ReadableInterval) mutableInterval14);
        boolean boolean16 = mutableInterval7.contains((org.joda.time.ReadableInterval) mutableInterval14);
        org.joda.time.Weeks weeks17 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval14);
        boolean boolean18 = interval3.overlaps((org.joda.time.ReadableInterval) mutableInterval14);
        org.joda.time.Weeks weeks19 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval14);
        org.joda.time.PeriodType periodType20 = weeks19.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType21 = weeks19.getFieldType();
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(durationFieldType21);
    }

    @Test
    public void test14525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14525");
        org.joda.time.Period period1 = org.joda.time.Period.days((-1));
        org.joda.time.Period period3 = period1.withHours((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period14 = org.joda.time.Period.days((-1));
        org.joda.time.Period period16 = period14.withWeeks((int) 'a');
        java.lang.String str17 = period14.toString();
        mutablePeriod12.setPeriod((org.joda.time.ReadablePeriod) period14);
        int int19 = mutablePeriod12.getMillis();
        org.joda.time.DurationFieldType durationFieldType21 = mutablePeriod12.getFieldType(0);
        int int22 = period3.get(durationFieldType21);
        org.joda.time.Period period24 = period3.withDays(23);
        org.joda.time.Period period26 = period3.plusYears(18404);
        int int27 = period3.getHours();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        java.lang.String str29 = dateTimeFieldType28.toString();
        java.lang.String str30 = dateTimeFieldType28.toString();
        org.joda.time.DurationFieldType durationFieldType31 = dateTimeFieldType28.getDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period33 = period3.withFieldAdded(durationFieldType31, (-324000000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'halfdays'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "P-1D" + "'", str17, "P-1D");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "halfdayOfDay" + "'", str29, "halfdayOfDay");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "halfdayOfDay" + "'", str30, "halfdayOfDay");
        org.junit.Assert.assertNotNull(durationFieldType31);
    }

    @Test
    public void test14526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14526");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.MutableInterval mutableInterval12 = mutableInterval2.copy();
        org.joda.time.Duration duration13 = mutableInterval2.toDuration();
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean24 = mutableInterval19.isBefore((org.joda.time.ReadableInterval) mutableInterval23);
        boolean boolean25 = mutableInterval16.contains((org.joda.time.ReadableInterval) mutableInterval23);
        boolean boolean27 = mutableInterval16.isBefore(0L);
        mutableInterval16.setDurationBeforeEnd(6000035L);
        boolean boolean30 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval16);
        org.joda.time.MutableInterval mutableInterval31 = mutableInterval2.copy();
        org.joda.time.Weeks weeks32 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval31);
        int int33 = weeks32.getWeeks();
        org.joda.time.MutablePeriod mutablePeriod34 = weeks32.toMutablePeriod();
        org.joda.time.Weeks weeks35 = weeks32.negated();
        org.joda.time.DurationFieldType durationFieldType36 = weeks35.getFieldType();
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(mutableInterval12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(mutableInterval31);
        org.junit.Assert.assertNotNull(weeks32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod34);
        org.junit.Assert.assertNotNull(weeks35);
        org.junit.Assert.assertNotNull(durationFieldType36);
    }

    @Test
    public void test14527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14527");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = dateTime10.toString(dateTimeFormatter31);
        org.joda.time.DateTime.Property property33 = dateTime10.yearOfCentury();
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        org.joda.time.Chronology chronology41 = interval40.getChronology();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 1, periodType36, chronology41);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) '4', chronology41);
        org.joda.time.ReadablePartial readablePartial44 = null;
        org.joda.time.DateTime dateTime45 = dateTime43.withFields(readablePartial44);
        org.joda.time.DateTime.Property property46 = dateTime45.millisOfDay();
        org.joda.time.DateTime dateTime47 = dateTime45.withEarlierOffsetAtOverlap();
        int int48 = dateTime45.getDayOfWeek();
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.Chronology chronology55 = interval54.getChronology();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) 1, periodType50, chronology55);
        org.joda.time.DateTimeField dateTimeField57 = chronology55.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone58 = chronology55.getZone();
        org.joda.time.DateTime dateTime59 = dateTime45.withChronology(chronology55);
        org.joda.time.DateTime dateTime60 = dateTime45.withEarlierOffsetAtOverlap();
        org.joda.time.Period period61 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType62 = period61.getPeriodType();
        org.joda.time.Period period64 = period61.withMonths((int) (byte) 0);
        org.joda.time.Period period65 = period61.toPeriod();
        org.joda.time.DateTime dateTime67 = dateTime60.withPeriodAdded((org.joda.time.ReadablePeriod) period65, (int) (byte) 0);
        boolean boolean68 = property33.equals((java.lang.Object) dateTime67);
        org.joda.time.DateTime dateTime70 = property33.setCopy(7);
        org.joda.time.DateTime dateTime71 = property33.roundFloorCopy();
        org.joda.time.DateTimeField dateTimeField72 = property33.getField();
        org.joda.time.DateTime dateTime74 = property33.addWrapFieldToCopy(11);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-05T01:00:00.052+97:00" + "'", str32, "1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTime47);
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(dateTime74);
    }

    @Test
    public void test14528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14528");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(59, 54, 59, 702, 198969, (-2147483648));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 702 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14529");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfEra();
        java.lang.String str7 = dateTimeField6.getName();
        long long10 = dateTimeField6.add(1645455187225L, (-22));
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "yearOfEra" + "'", str7, "yearOfEra");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 951144787225L + "'", long10 == 951144787225L);
    }

    @Test
    public void test14530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14530");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        mutableInterval2.setDurationAfterStart(0L);
        org.joda.time.MutableInterval mutableInterval14 = mutableInterval2.copy();
        org.joda.time.MutableInterval mutableInterval15 = mutableInterval14.toMutableInterval();
        org.joda.time.Period period16 = mutableInterval15.toPeriod();
        int int17 = period16.getMonths();
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(mutableInterval14);
        org.junit.Assert.assertNotNull(mutableInterval15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test14531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14531");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getSecondOfMinute();
        int int4 = dateTime2.getMillisOfDay();
        org.joda.time.DateTime dateTime6 = dateTime2.withYear((int) (byte) 100);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.Duration duration8 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 1, periodType11, chronology16);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) '4', chronology16);
        org.joda.time.ReadablePartial readablePartial19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.withFields(readablePartial19);
        org.joda.time.DateTime.Property property21 = dateTime20.millisOfDay();
        org.joda.time.DateTime dateTime22 = dateTime20.withEarlierOffsetAtOverlap();
        int int23 = dateTime20.getDayOfWeek();
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 1, periodType25, chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone33 = chronology30.getZone();
        org.joda.time.DateTime dateTime34 = dateTime20.withChronology(chronology30);
        org.joda.time.Interval interval35 = duration8.toIntervalTo((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period38 = duration8.toPeriodFrom((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone40);
        int int42 = dateTime41.getMillisOfDay();
        org.joda.time.DateTime dateTime44 = dateTime41.plusMillis((int) '#');
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        org.joda.time.Chronology chronology52 = interval51.getChronology();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 1, periodType47, chronology52);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) '4', chronology52);
        org.joda.time.DateTime dateTime55 = dateTime44.withChronology(chronology52);
        org.joda.time.Interval interval56 = duration8.toIntervalFrom((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime58 = dateTime44.minusWeeks(21);
        boolean boolean59 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime.Property property60 = dateTime6.dayOfWeek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3600010 + "'", int4 == 3600010);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(period38);
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3600010 + "'", int42 == 3600010);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(property60);
    }

    @Test
    public void test14532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14532");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) (short) -1);
        org.joda.time.Hours hours10 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours11 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours12 = hours10.minus(hours11);
        org.joda.time.Duration duration13 = hours11.toStandardDuration();
        org.joda.time.Duration duration14 = duration13.toDuration();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableDuration) duration13);
        org.joda.time.DateTime.Property property16 = dateTime7.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property16.getFieldType();
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
    }

    @Test
    public void test14533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14533");
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
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = dateTime30.toDateTime(dateTimeZone31);
        java.lang.String str33 = dateTime30.toString();
        org.joda.time.DateTime dateTime34 = dateTime30.toDateTimeISO();
        org.joda.time.DateTime dateTime36 = dateTime30.plusMonths(1970);
        org.joda.time.DateTimeZone dateTimeZone37 = dateTime36.getZone();
        org.joda.time.YearMonthDay yearMonthDay38 = dateTime36.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone40);
        int int42 = dateTime41.getDayOfMonth();
        org.joda.time.DateTime dateTime44 = dateTime41.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property45 = dateTime44.dayOfYear();
        int int46 = dateTime44.getWeekOfWeekyear();
        org.joda.time.Period period47 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime36, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime49 = dateTime36.minus((long) 57432992);
        java.lang.String str51 = dateTime36.toString("2022");
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-05T01:00:00.052+97:00" + "'", str33, "1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(yearMonthDay38);
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5 + "'", int42 == 5);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "2022" + "'", str51, "2022");
    }

    @Test
    public void test14534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14534");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((-40));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test14535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14535");
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
        org.joda.time.MutableInterval mutableInterval16 = mutableInterval9.toMutableInterval();
        org.joda.time.Interval interval17 = mutableInterval9.toInterval();
        org.joda.time.MutableInterval mutableInterval18 = mutableInterval9.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval19 = mutableInterval9.copy();
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(mutableInterval16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(mutableInterval18);
        org.junit.Assert.assertNotNull(mutableInterval19);
    }

    @Test
    public void test14536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14536");
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType6 = periodType5.withMonthsRemoved();
        org.joda.time.Period period7 = new org.joda.time.Period((long) 3600010, (long) (byte) 100, periodType5);
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean18 = mutableInterval13.isBefore((org.joda.time.ReadableInterval) mutableInterval17);
        boolean boolean19 = mutableInterval10.contains((org.joda.time.ReadableInterval) mutableInterval17);
        mutableInterval10.setDurationAfterStart(0L);
        boolean boolean22 = mutableInterval10.containsNow();
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean33 = mutableInterval28.isBefore((org.joda.time.ReadableInterval) mutableInterval32);
        boolean boolean34 = mutableInterval25.contains((org.joda.time.ReadableInterval) mutableInterval32);
        mutableInterval25.setDurationAfterStart(0L);
        boolean boolean37 = mutableInterval25.containsNow();
        boolean boolean38 = mutableInterval10.isAfter((org.joda.time.ReadableInterval) mutableInterval25);
        org.joda.time.Duration duration39 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration40 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        org.joda.time.Chronology chronology48 = interval47.getChronology();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) 1, periodType43, chronology48);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) '4', chronology48);
        org.joda.time.ReadablePartial readablePartial51 = null;
        org.joda.time.DateTime dateTime52 = dateTime50.withFields(readablePartial51);
        org.joda.time.DateTime.Property property53 = dateTime52.millisOfDay();
        org.joda.time.DateTime dateTime54 = dateTime52.withEarlierOffsetAtOverlap();
        int int55 = dateTime52.getDayOfWeek();
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval61 = mutableInterval60.toInterval();
        org.joda.time.Chronology chronology62 = interval61.getChronology();
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((long) 1, periodType57, chronology62);
        org.joda.time.DateTimeField dateTimeField64 = chronology62.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone65 = chronology62.getZone();
        org.joda.time.DateTime dateTime66 = dateTime52.withChronology(chronology62);
        org.joda.time.Interval interval67 = duration40.toIntervalTo((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period70 = duration40.toPeriodFrom((org.joda.time.ReadableInstant) dateTime69);
        boolean boolean71 = duration39.isShorterThan((org.joda.time.ReadableDuration) duration40);
        mutableInterval10.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration40);
        org.joda.time.Chronology chronology73 = mutableInterval10.getChronology();
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((-6380816000400000L), 52L, periodType5, chronology73);
        org.joda.time.Period period75 = new org.joda.time.Period(624L, periodType5);
        int int76 = period75.size();
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(dateTime54);
// flaky:         org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(chronology73);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 5 + "'", int76 == 5);
    }

    @Test
    public void test14537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14537");
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        org.joda.time.Chronology chronology9 = interval8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 1, periodType4, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '4', chronology9);
        org.joda.time.ReadablePartial readablePartial12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.withFields(readablePartial12);
        org.joda.time.DateTime.Property property14 = dateTime13.millisOfDay();
        org.joda.time.DateTime dateTime15 = dateTime13.withEarlierOffsetAtOverlap();
        int int16 = dateTime13.getDayOfWeek();
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 1, periodType18, chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone26 = chronology23.getZone();
        org.joda.time.DateTime dateTime27 = dateTime13.withChronology(chronology23);
        int int28 = dateTime27.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        int int30 = dateTime27.get(dateTimeFieldType29);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 1, periodType33, chronology38);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) '4', chronology38);
        org.joda.time.Instant instant41 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        org.joda.time.Chronology chronology49 = interval48.getChronology();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 1, periodType44, chronology49);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) '4', chronology49);
        org.joda.time.ReadablePartial readablePartial52 = null;
        org.joda.time.DateTime dateTime53 = dateTime51.withFields(readablePartial52);
        boolean boolean54 = instant41.isAfter((org.joda.time.ReadableInstant) dateTime51);
        boolean boolean55 = dateTime40.isAfter((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.Chronology chronology56 = dateTime40.getChronology();
        org.joda.time.DateTimeField dateTimeField57 = dateTimeFieldType29.getField(chronology56);
        org.joda.time.Interval interval58 = new org.joda.time.Interval(0L, 30236400000L, chronology56);
        org.joda.time.Seconds seconds59 = org.joda.time.Seconds.ZERO;
        org.joda.time.Seconds seconds61 = seconds59.multipliedBy(2);
        org.joda.time.Seconds seconds63 = seconds59.plus(0);
        org.joda.time.Interval interval64 = interval58.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) seconds59);
        org.joda.time.Seconds seconds66 = seconds59.multipliedBy(723345);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1970 + "'", int28 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(instant41);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(seconds59);
        org.junit.Assert.assertNotNull(seconds61);
        org.junit.Assert.assertNotNull(seconds63);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(seconds66);
    }

    @Test
    public void test14538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14538");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.Chronology chronology5 = interval4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology5.getZone();
        java.lang.String str8 = dateTimeZone6.getName(100L);
        org.joda.time.DateTime dateTime9 = dateTime0.withZoneRetainFields(dateTimeZone6);
        org.joda.time.DateTime dateTime12 = dateTime9.withDurationAdded((long) 52, (int) (short) 1);
        org.joda.time.DateTime dateTime14 = dateTime12.withYearOfCentury(1);
        int int15 = dateTime12.getHourOfDay();
        org.joda.time.DateTime.Property property16 = dateTime12.minuteOfHour();
        org.joda.time.DateTime dateTime18 = property16.addToCopy(7200104);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test14539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14539");
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
        boolean boolean20 = dateTime18.isBefore((long) 1970);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DateTime.Property property22 = dateTime18.property(dateTimeFieldType21);
        java.lang.String str23 = dateTimeFieldType21.toString();
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType21.getRangeDurationType();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "secondOfMinute" + "'", str23, "secondOfMinute");
        org.junit.Assert.assertNotNull(durationFieldType24);
    }

    @Test
    public void test14540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14540");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime7 = dateTime5.withYear(0);
        java.util.Date date8 = dateTime7.toDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime7.withDayOfWeek(173);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 173 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Dec 27 00:00:00 UTC 1");
    }

    @Test
    public void test14541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14541");
        org.joda.time.Period period1 = org.joda.time.Period.millis(60);
        int int2 = period1.getMinutes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14542");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 20, periodType1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period15 = org.joda.time.Period.days((-1));
        org.joda.time.Period period17 = period15.withWeeks((int) 'a');
        java.lang.String str18 = period15.toString();
        mutablePeriod13.setPeriod((org.joda.time.ReadablePeriod) period15);
        int int20 = mutablePeriod13.getMillis();
        org.joda.time.MutablePeriod mutablePeriod21 = mutablePeriod13.toMutablePeriod();
        mutablePeriod21.add((int) '4', (int) (short) 0, (int) (byte) 0, (int) (short) 10, 1, (int) 'a', (int) (short) 100, (int) (short) -1);
        mutablePeriod21.addMinutes(100);
        int int33 = mutablePeriod21.getYears();
        org.joda.time.DurationFieldType durationFieldType34 = null;
        int int35 = mutablePeriod21.get(durationFieldType34);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval43 = mutableInterval42.toInterval();
        org.joda.time.Chronology chronology44 = interval43.getChronology();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 1, periodType39, chronology44);
        org.joda.time.Chronology chronology46 = chronology44.withUTC();
        org.joda.time.DateTimeField dateTimeField47 = chronology44.secondOfMinute();
        org.joda.time.DurationField durationField48 = chronology44.eras();
        mutablePeriod21.setPeriod(1645454952491L, 0L, chronology44);
        org.joda.time.Hours hours50 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours52 = hours50.minus((int) '#');
        org.joda.time.Hours hours54 = org.joda.time.Hours.hours((int) (byte) 100);
        org.joda.time.Hours hours55 = hours50.plus(hours54);
        org.joda.time.Hours hours56 = org.joda.time.Hours.EIGHT;
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period67 = org.joda.time.Period.days((-1));
        org.joda.time.Period period69 = period67.withWeeks((int) 'a');
        java.lang.String str70 = period67.toString();
        mutablePeriod65.setPeriod((org.joda.time.ReadablePeriod) period67);
        int int72 = mutablePeriod65.getMillis();
        org.joda.time.DurationFieldType durationFieldType74 = mutablePeriod65.getFieldType(0);
        int int75 = hours56.get(durationFieldType74);
        org.joda.time.Hours hours77 = hours56.multipliedBy(100);
        org.joda.time.Hours hours79 = hours77.dividedBy(50);
        org.joda.time.Hours hours81 = hours77.dividedBy((int) (byte) 1);
        boolean boolean82 = hours50.isGreaterThan(hours77);
        java.lang.String str83 = hours50.toString();
        int[] intArray86 = chronology44.get((org.joda.time.ReadablePeriod) hours50, 16756760995200L, (long) 33);
        org.joda.time.DateTimeField dateTimeField87 = chronology44.clockhourOfDay();
        mutablePeriod3.add(41169600000L, chronology44);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "P-1D" + "'", str18, "P-1D");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod21);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(hours50);
        org.junit.Assert.assertNotNull(hours52);
        org.junit.Assert.assertNotNull(hours54);
        org.junit.Assert.assertNotNull(hours55);
        org.junit.Assert.assertNotNull(hours56);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "P-1D" + "'", str70, "P-1D");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(durationFieldType74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(hours77);
        org.junit.Assert.assertNotNull(hours79);
        org.junit.Assert.assertNotNull(hours81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "PT3H" + "'", str83, "PT3H");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[-4654655]");
        org.junit.Assert.assertNotNull(dateTimeField87);
    }

    @Test
    public void test14543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14543");
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
        org.joda.time.DateTime dateTime16 = dateTime11.withCenturyOfEra((int) (short) 1);
        org.joda.time.DateTime dateTime18 = dateTime16.withSecondOfMinute(24);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone20);
        int int22 = dateTime21.getDayOfMonth();
        org.joda.time.DateTime dateTime24 = dateTime21.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property25 = dateTime24.dayOfYear();
        org.joda.time.TimeOfDay timeOfDay26 = dateTime24.toTimeOfDay();
        int int27 = dateTime24.getMillisOfSecond();
        org.joda.time.Days days28 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime30 = dateTime18.minusWeeks(40);
        org.joda.time.DateTime dateTime32 = dateTime30.plusYears(910);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
    }

    @Test
    public void test14544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14544");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 17, 0L);
        org.joda.time.Period period3 = duration2.toPeriod();
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test14545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14545");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, periodType1, chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfCentury();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology14.getZone();
        java.lang.String str17 = dateTimeZone15.getName(100L);
        org.joda.time.DateTime dateTime18 = dateTime9.withZoneRetainFields(dateTimeZone15);
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateTimeZone dateTimeZone24 = chronology23.getZone();
        java.lang.String str26 = dateTimeZone24.getName(100L);
        org.joda.time.DateTime dateTime27 = dateTime18.withZoneRetainFields(dateTimeZone24);
        org.joda.time.Chronology chronology28 = chronology6.withZone(dateTimeZone24);
        org.joda.time.DurationField durationField29 = chronology6.centuries();
        org.joda.time.DateTimeField dateTimeField30 = chronology6.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField31 = chronology6.millisOfSecond();
        org.joda.time.DurationField durationField32 = chronology6.weekyears();
        org.joda.time.DurationField durationField33 = chronology6.weekyears();
        org.joda.time.DurationField durationField34 = chronology6.weekyears();
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+97:00" + "'", str26, "+97:00");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(durationField34);
    }

    @Test
    public void test14546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14546");
        org.joda.time.Period period1 = org.joda.time.Period.days((-1));
        org.joda.time.Period period3 = period1.withWeeks((int) 'a');
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
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.hours();
        boolean boolean31 = period26.isSupported(durationFieldType30);
        org.joda.time.Period period33 = period26.minusSeconds((int) (byte) 0);
        org.joda.time.Period period34 = period1.withFields((org.joda.time.ReadablePeriod) period33);
        org.joda.time.Period period36 = period1.withSeconds(459069);
        org.joda.time.MutablePeriod mutablePeriod37 = period1.toMutablePeriod();
        mutablePeriod37.addDays(10);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "P-1D" + "'", str17, "P-1D");
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(mutablePeriod37);
    }

    @Test
    public void test14547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14547");
        org.joda.time.Period period3 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType4 = period3.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) '#', 100L, periodType4);
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval9 = mutableInterval8.toInterval();
        org.joda.time.Chronology chronology10 = interval9.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology10.getZone();
        org.joda.time.Period period12 = new org.joda.time.Period(10L, periodType4, chronology10);
        org.joda.time.Period period14 = period12.minusYears((int) '4');
        org.joda.time.Period period16 = period14.plusWeeks(3600010);
        org.joda.time.DurationFieldType[] durationFieldTypeArray17 = period16.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = period16.minusYears(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -52 + -2147483647");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(durationFieldTypeArray17);
    }

    @Test
    public void test14548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14548");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime7 = dateTime2.withMillisOfDay((int) (byte) 1);
        org.joda.time.DateTime.Property property8 = dateTime2.weekyear();
        org.joda.time.DateTime dateTime9 = property8.withMinimumValue();
        java.lang.String str10 = property8.getAsString();
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval17 = mutableInterval16.toInterval();
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 1, periodType13, chronology18);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) '4', chronology18);
        org.joda.time.DateTime.Property property21 = dateTime20.era();
        org.joda.time.DateTime dateTime23 = dateTime20.minusYears((int) '#');
        org.joda.time.DateTime dateTime25 = dateTime23.minusMinutes(4);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.Chronology chronology33 = interval32.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 1, periodType28, chronology33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) '4', chronology33);
        org.joda.time.ReadablePartial readablePartial36 = null;
        org.joda.time.DateTime dateTime37 = dateTime35.withFields(readablePartial36);
        org.joda.time.DateTime.Property property38 = dateTime37.millisOfDay();
        org.joda.time.DateTime dateTime39 = dateTime37.withEarlierOffsetAtOverlap();
        int int40 = dateTime37.getDayOfWeek();
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval46 = mutableInterval45.toInterval();
        org.joda.time.Chronology chronology47 = interval46.getChronology();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) 1, periodType42, chronology47);
        org.joda.time.DateTimeField dateTimeField49 = chronology47.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone50 = chronology47.getZone();
        org.joda.time.DateTime dateTime51 = dateTime37.withChronology(chronology47);
        org.joda.time.DateTime dateTime53 = dateTime51.plusDays((int) (byte) 1);
        org.joda.time.Seconds seconds54 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTime dateTime56 = dateTime25.minusHours((int) (byte) 1);
        org.joda.time.DateTime dateTime57 = dateTime25.toDateTimeISO();
        int int58 = dateTime57.getMinuteOfHour();
        int int59 = property8.getDifference((org.joda.time.ReadableInstant) dateTime57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970" + "'", str10, "1970");
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTime39);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(seconds54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 56 + "'", int58 == 56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 35 + "'", int59 == 35);
    }

    @Test
    public void test14549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14549");
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean11 = mutableInterval6.isBefore((org.joda.time.ReadableInterval) mutableInterval10);
        boolean boolean12 = mutableInterval3.contains((org.joda.time.ReadableInterval) mutableInterval10);
        org.joda.time.Weeks weeks13 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval10);
        org.joda.time.Weeks weeks14 = weeks13.negated();
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean25 = mutableInterval20.isBefore((org.joda.time.ReadableInterval) mutableInterval24);
        boolean boolean26 = mutableInterval17.contains((org.joda.time.ReadableInterval) mutableInterval24);
        org.joda.time.Weeks weeks27 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval24);
        org.joda.time.Weeks weeks28 = weeks27.negated();
        boolean boolean29 = weeks14.isGreaterThan(weeks28);
        int int30 = weeks28.size();
        org.joda.time.PeriodType periodType31 = weeks28.getPeriodType();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.Weeks weeks33 = org.joda.time.Weeks.weeksIn(readableInterval32);
        boolean boolean34 = weeks28.isLessThan(weeks33);
        org.joda.time.PeriodType periodType35 = weeks33.getPeriodType();
        org.joda.time.PeriodType periodType36 = weeks33.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval44 = mutableInterval43.toInterval();
        org.joda.time.Chronology chronology45 = interval44.getChronology();
        org.joda.time.DateTimeZone dateTimeZone46 = chronology45.getZone();
        java.lang.String str48 = dateTimeZone46.getName(100L);
        org.joda.time.DateTime dateTime49 = dateTime40.withZoneRetainFields(dateTimeZone46);
        long long51 = dateTimeZone39.getMillisKeepLocal(dateTimeZone46, 6000035L);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((-100982246399976L), 1672531200000L);
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval61 = mutableInterval60.toInterval();
        org.joda.time.Chronology chronology62 = interval61.getChronology();
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((long) 1, periodType57, chronology62);
        org.joda.time.DateTimeField dateTimeField64 = chronology62.yearOfCentury();
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval69 = mutableInterval68.toInterval();
        org.joda.time.Chronology chronology70 = interval69.getChronology();
        org.joda.time.DateTimeZone dateTimeZone71 = chronology70.getZone();
        java.lang.String str73 = dateTimeZone71.getName(100L);
        org.joda.time.DateTime dateTime74 = dateTime65.withZoneRetainFields(dateTimeZone71);
        org.joda.time.MutableInterval mutableInterval77 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval78 = mutableInterval77.toInterval();
        org.joda.time.Chronology chronology79 = interval78.getChronology();
        org.joda.time.DateTimeZone dateTimeZone80 = chronology79.getZone();
        java.lang.String str82 = dateTimeZone80.getName(100L);
        org.joda.time.DateTime dateTime83 = dateTime74.withZoneRetainFields(dateTimeZone80);
        org.joda.time.Chronology chronology84 = chronology62.withZone(dateTimeZone80);
        org.joda.time.DurationField durationField85 = chronology62.centuries();
        mutablePeriod54.setPeriod((long) 3, chronology62);
        boolean boolean87 = dateTimeZone46.equals((java.lang.Object) chronology62);
        org.joda.time.DateTimeField dateTimeField88 = chronology62.millisOfSecond();
        org.joda.time.Period period89 = new org.joda.time.Period((long) (byte) -1, periodType36, chronology62);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTimeZone46);
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+97:00" + "'", str48, "+97:00");
        org.junit.Assert.assertNotNull(dateTime49);
// flaky:         org.junit.Assert.assertTrue("'" + long51 + "' != '" + 6000035L + "'", long51 == 6000035L);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(interval69);
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertNotNull(dateTimeZone71);
// flaky:         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "+97:00" + "'", str73, "+97:00");
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(interval78);
        org.junit.Assert.assertNotNull(chronology79);
        org.junit.Assert.assertNotNull(dateTimeZone80);
// flaky:         org.junit.Assert.assertEquals("'" + str82 + "' != '" + "+97:00" + "'", str82, "+97:00");
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertNotNull(chronology84);
        org.junit.Assert.assertNotNull(durationField85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(dateTimeField88);
    }

    @Test
    public void test14550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14550");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone9 = chronology8.getZone();
        java.lang.String str11 = dateTimeZone9.getName(100L);
        org.joda.time.DateTime dateTime12 = dateTime3.withZoneRetainFields(dateTimeZone9);
        long long14 = dateTimeZone2.getMillisKeepLocal(dateTimeZone9, 6000035L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean27 = mutableInterval22.isBefore((org.joda.time.ReadableInterval) mutableInterval26);
        boolean boolean28 = mutableInterval19.contains((org.joda.time.ReadableInterval) mutableInterval26);
        org.joda.time.Weeks weeks29 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval26);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period40 = org.joda.time.Period.days((-1));
        org.joda.time.Period period42 = period40.withWeeks((int) 'a');
        java.lang.String str43 = period40.toString();
        mutablePeriod38.setPeriod((org.joda.time.ReadablePeriod) period40);
        int int45 = mutablePeriod38.getMillis();
        org.joda.time.MutablePeriod mutablePeriod46 = mutablePeriod38.toMutablePeriod();
        mutablePeriod38.addHours((int) (short) 100);
        mutablePeriod38.setMillis(3600010);
        org.joda.time.DurationFieldType durationFieldType52 = mutablePeriod38.getFieldType(2);
        boolean boolean53 = weeks29.isSupported(durationFieldType52);
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval60 = mutableInterval59.toInterval();
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean64 = mutableInterval59.isBefore((org.joda.time.ReadableInterval) mutableInterval63);
        boolean boolean65 = mutableInterval56.contains((org.joda.time.ReadableInterval) mutableInterval63);
        org.joda.time.Weeks weeks66 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval63);
        org.joda.time.Weeks weeks67 = weeks66.negated();
        org.joda.time.MutableInterval mutableInterval70 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval73 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval74 = mutableInterval73.toInterval();
        org.joda.time.MutableInterval mutableInterval77 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean78 = mutableInterval73.isBefore((org.joda.time.ReadableInterval) mutableInterval77);
        boolean boolean79 = mutableInterval70.contains((org.joda.time.ReadableInterval) mutableInterval77);
        org.joda.time.Weeks weeks80 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval77);
        org.joda.time.Weeks weeks81 = weeks80.negated();
        boolean boolean82 = weeks67.isGreaterThan(weeks81);
        org.joda.time.Weeks weeks83 = weeks29.plus(weeks67);
        java.lang.String str84 = weeks29.toString();
        boolean boolean85 = dateTimeZone2.equals((java.lang.Object) weeks29);
        int int87 = dateTimeZone2.getOffsetFromLocal(6278855182488000L);
        java.lang.String str89 = dateTimeZone2.getNameKey((-5901149980799992L));
        long long91 = dateTimeZone2.previousTransition(41024119659887L);
        boolean boolean93 = dateTimeZone2.isStandardOffset(349200049L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
        org.junit.Assert.assertNotNull(dateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 6000035L + "'", long14 == 6000035L);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(weeks29);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "P-1D" + "'", str43, "P-1D");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod46);
        org.junit.Assert.assertNotNull(durationFieldType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(weeks66);
        org.junit.Assert.assertNotNull(weeks67);
        org.junit.Assert.assertNotNull(interval74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(weeks80);
        org.junit.Assert.assertNotNull(weeks81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(weeks83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "P0W" + "'", str84, "P0W");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 349200000 + "'", int87 == 349200000);
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 41024119659887L + "'", long91 == 41024119659887L);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test14551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14551");
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 1, periodType12, chronology17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '4', chronology17);
        org.joda.time.ReadablePartial readablePartial20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withFields(readablePartial20);
        org.joda.time.DateTime.Property property22 = dateTime21.millisOfDay();
        org.joda.time.DateTime dateTime23 = dateTime21.withEarlierOffsetAtOverlap();
        int int24 = dateTime21.getDayOfWeek();
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 1, periodType26, chronology31);
        org.joda.time.DateTimeField dateTimeField33 = chronology31.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone34 = chronology31.getZone();
        org.joda.time.DateTime dateTime35 = dateTime21.withChronology(chronology31);
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        org.joda.time.Chronology chronology43 = interval42.getChronology();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 1, periodType38, chronology43);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) '4', chronology43);
        org.joda.time.ReadablePartial readablePartial46 = null;
        org.joda.time.DateTime dateTime47 = dateTime45.withFields(readablePartial46);
        org.joda.time.DateTime.Property property48 = dateTime47.millisOfDay();
        org.joda.time.DateTime dateTime50 = dateTime47.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime52 = dateTime47.withCenturyOfEra((int) (short) 1);
        org.joda.time.Hours hours53 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours54 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours55 = hours53.minus(hours54);
        org.joda.time.Duration duration56 = hours54.toStandardDuration();
        org.joda.time.DateTime dateTime57 = dateTime47.plus((org.joda.time.ReadableDuration) duration56);
        org.joda.time.Duration duration58 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration59 = duration58.toDuration();
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval63 = mutableInterval62.toInterval();
        org.joda.time.Chronology chronology64 = interval63.getChronology();
        org.joda.time.DateTimeZone dateTimeZone65 = chronology64.getZone();
        org.joda.time.Period period66 = duration58.toPeriod(chronology64);
        boolean boolean67 = duration56.isShorterThan((org.joda.time.ReadableDuration) duration58);
        long long68 = duration56.getStandardHours();
        org.joda.time.Duration duration69 = duration56.toDuration();
        org.joda.time.Period period72 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType73 = period72.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((long) '#', 100L, periodType73);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableDuration) duration69, periodType73);
        org.joda.time.Period period76 = new org.joda.time.Period((long) (short) 1, 52L, periodType73);
        org.joda.time.PeriodType periodType77 = periodType73.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod(820, (-457070), 32, 170, 0, 736, 4200, 4, periodType73);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(hours53);
        org.junit.Assert.assertNotNull(hours54);
        org.junit.Assert.assertNotNull(hours55);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertNotNull(periodType73);
        org.junit.Assert.assertNotNull(periodType77);
    }

    @Test
    public void test14552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14552");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType2 = null;
        int int3 = minutes1.get(durationFieldType2);
        int int5 = minutes1.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod6 = minutes1.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType8 = minutes1.getFieldType(0);
        org.joda.time.Duration duration9 = minutes1.toStandardDuration();
        org.joda.time.Minutes minutes11 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType12 = null;
        int int13 = minutes11.get(durationFieldType12);
        int int15 = minutes11.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod16 = minutes11.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType18 = minutes11.getFieldType(0);
        org.joda.time.Duration duration19 = minutes11.toStandardDuration();
        org.joda.time.Minutes minutes21 = minutes11.minus(24);
        boolean boolean23 = minutes11.equals((java.lang.Object) 12);
        boolean boolean24 = minutes1.isGreaterThan(minutes11);
        org.joda.time.MutablePeriod mutablePeriod25 = minutes11.toMutablePeriod();
        org.joda.time.Minutes minutes27 = minutes11.minus(129);
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
        org.joda.time.Minutes minutes42 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType43 = null;
        int int44 = minutes42.get(durationFieldType43);
        int int46 = minutes42.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod47 = minutes42.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType49 = minutes42.getFieldType(0);
        org.joda.time.Duration duration50 = minutes42.toStandardDuration();
        org.joda.time.Minutes minutes52 = minutes42.minus(24);
        org.joda.time.Minutes minutes53 = minutes36.minus(minutes52);
        org.joda.time.Minutes minutes55 = minutes52.minus((int) (short) -1);
        boolean boolean56 = minutes27.isGreaterThan(minutes52);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(mutablePeriod16);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(mutablePeriod25);
        org.junit.Assert.assertNotNull(minutes27);
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(mutablePeriod47);
        org.junit.Assert.assertNotNull(durationFieldType49);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(minutes52);
        org.junit.Assert.assertNotNull(minutes53);
        org.junit.Assert.assertNotNull(minutes55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test14553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14553");
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
        org.joda.time.DateTimeField dateTimeField26 = chronology21.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField27 = chronology21.year();
        org.joda.time.DateTimeField dateTimeField28 = chronology21.era();
        long long30 = dateTimeField28.roundFloor(187200000L);
        long long32 = dateTimeField28.roundHalfCeiling(15L);
        int int34 = dateTimeField28.getMaximumValue(6216719842800000L);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = dateTimeField28.getType();
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
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-62135946000000L) + "'", long30 == (-62135946000000L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-62135946000000L) + "'", long32 == (-62135946000000L));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
    }

    @Test
    public void test14554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14554");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes(86400007L);
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval9 = mutableInterval8.toInterval();
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean13 = mutableInterval8.isBefore((org.joda.time.ReadableInterval) mutableInterval12);
        boolean boolean14 = mutableInterval5.contains((org.joda.time.ReadableInterval) mutableInterval12);
        org.joda.time.Weeks weeks15 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval12);
        long long16 = mutableInterval12.getEndMillis();
        org.joda.time.DateTime dateTime17 = mutableInterval12.getEnd();
        boolean boolean18 = dateTime17.isBeforeNow();
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
        org.joda.time.DateTimeField dateTimeField45 = chronology40.weekOfWeekyear();
        int int46 = dateTime17.get(dateTimeField45);
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        org.joda.time.Chronology chronology53 = interval52.getChronology();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) 1, periodType48, chronology53);
        org.joda.time.DateTimeField dateTimeField55 = chronology53.yearOfCentury();
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval60 = mutableInterval59.toInterval();
        org.joda.time.Chronology chronology61 = interval60.getChronology();
        org.joda.time.DateTimeZone dateTimeZone62 = chronology61.getZone();
        java.lang.String str64 = dateTimeZone62.getName(100L);
        org.joda.time.DateTime dateTime65 = dateTime56.withZoneRetainFields(dateTimeZone62);
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval69 = mutableInterval68.toInterval();
        org.joda.time.Chronology chronology70 = interval69.getChronology();
        org.joda.time.DateTimeZone dateTimeZone71 = chronology70.getZone();
        java.lang.String str73 = dateTimeZone71.getName(100L);
        org.joda.time.DateTime dateTime74 = dateTime65.withZoneRetainFields(dateTimeZone71);
        org.joda.time.Chronology chronology75 = chronology53.withZone(dateTimeZone71);
        org.joda.time.DateTime dateTime76 = dateTime17.toDateTime(chronology75);
        org.joda.time.DurationField durationField77 = chronology75.months();
        org.joda.time.Period period78 = duration1.toPeriod(periodType2, chronology75);
        org.joda.time.PeriodType periodType79 = periodType2.withWeeksRemoved();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
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
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "+97:00" + "'", str64, "+97:00");
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(interval69);
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertNotNull(dateTimeZone71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "+97:00" + "'", str73, "+97:00");
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(durationField77);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(periodType79);
    }

    @Test
    public void test14555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14555");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType2 = null;
        int int3 = minutes1.get(durationFieldType2);
        org.joda.time.Minutes minutes5 = minutes1.minus(3);
        int int6 = minutes1.getMinutes();
        org.joda.time.Duration duration7 = minutes1.toStandardDuration();
        org.joda.time.Duration duration9 = duration7.minus(31207752000L);
        org.joda.time.Duration duration10 = org.joda.time.Duration.ZERO;
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
        org.joda.time.Interval interval37 = duration10.toIntervalTo((org.joda.time.ReadableInstant) dateTime22);
        int int38 = duration9.compareTo((org.joda.time.ReadableDuration) duration10);
        long long39 = duration9.getStandardHours();
        org.joda.time.Period period40 = duration9.toPeriod();
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration10);
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
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-8668L) + "'", long39 == (-8668L));
        org.junit.Assert.assertNotNull(period40);
    }

    @Test
    public void test14556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14556");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.Duration duration4 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration5 = duration4.toDuration();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableDuration) duration4);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone8);
        java.util.Locale locale10 = null;
        java.util.Calendar calendar11 = dateTime9.toCalendar(locale10);
        org.joda.time.DateTime dateTime13 = dateTime9.minus((long) 56);
        org.joda.time.DateTime.Property property14 = dateTime9.hourOfDay();
        org.joda.time.Days days15 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period26 = org.joda.time.Period.days((-1));
        org.joda.time.Period period28 = period26.withWeeks((int) 'a');
        java.lang.String str29 = period26.toString();
        mutablePeriod24.setPeriod((org.joda.time.ReadablePeriod) period26);
        int int31 = mutablePeriod24.getMillis();
        org.joda.time.MutablePeriod mutablePeriod32 = mutablePeriod24.toMutablePeriod();
        mutablePeriod32.add((int) '4', (int) (short) 0, (int) (byte) 0, (int) (short) 10, 1, (int) 'a', (int) (short) 100, (int) (short) -1);
        mutablePeriod32.addMinutes(100);
        mutablePeriod32.setPeriod((long) 366);
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean53 = mutableInterval48.isBefore((org.joda.time.ReadableInterval) mutableInterval52);
        java.lang.Object obj54 = mutableInterval48.clone();
        long long55 = mutableInterval48.getStartMillis();
        org.joda.time.Duration duration56 = mutableInterval48.toDuration();
        mutablePeriod32.add((org.joda.time.ReadableDuration) duration56);
        org.joda.time.Period period58 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableDuration) duration56);
        org.joda.time.DateTime dateTime60 = dateTime2.plusMinutes(620);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime62 = dateTime60.withDayOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "P-1D" + "'", str29, "P-1D");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod32);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals(obj54.toString(), "1970-01-05T00:59:59.999+97:00/1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj54), "1970-01-05T00:59:59.999+97:00/1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj54), "1970-01-05T00:59:59.999+97:00/1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(dateTime60);
    }

    @Test
    public void test14557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14557");
        org.joda.time.Period period0 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType1 = period0.getPeriodType();
        org.joda.time.Period period3 = period0.plusMillis((-7));
        org.joda.time.Hours hours4 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Hours hours5 = org.joda.time.Hours.SIX;
        org.joda.time.Hours hours6 = org.joda.time.Hours.MIN_VALUE;
        org.joda.time.Hours hours7 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours8 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours9 = hours7.minus(hours8);
        org.joda.time.Duration duration10 = hours8.toStandardDuration();
        org.joda.time.Hours hours11 = org.joda.time.Hours.EIGHT;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period22 = org.joda.time.Period.days((-1));
        org.joda.time.Period period24 = period22.withWeeks((int) 'a');
        java.lang.String str25 = period22.toString();
        mutablePeriod20.setPeriod((org.joda.time.ReadablePeriod) period22);
        int int27 = mutablePeriod20.getMillis();
        org.joda.time.DurationFieldType durationFieldType29 = mutablePeriod20.getFieldType(0);
        int int30 = hours11.get(durationFieldType29);
        org.joda.time.Hours hours32 = hours11.multipliedBy(100);
        org.joda.time.Hours hours33 = hours11.negated();
        boolean boolean34 = hours8.isGreaterThan(hours11);
        org.joda.time.Hours hours35 = hours6.plus(hours8);
        org.joda.time.Hours hours36 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours37 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours38 = hours36.minus(hours37);
        org.joda.time.Hours hours39 = hours8.minus(hours38);
        boolean boolean40 = hours5.isLessThan(hours39);
        org.joda.time.Hours hours41 = org.joda.time.Hours.TWO;
        org.joda.time.Hours hours42 = org.joda.time.Hours.EIGHT;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period53 = org.joda.time.Period.days((-1));
        org.joda.time.Period period55 = period53.withWeeks((int) 'a');
        java.lang.String str56 = period53.toString();
        mutablePeriod51.setPeriod((org.joda.time.ReadablePeriod) period53);
        int int58 = mutablePeriod51.getMillis();
        org.joda.time.DurationFieldType durationFieldType60 = mutablePeriod51.getFieldType(0);
        int int61 = hours42.get(durationFieldType60);
        java.lang.String str62 = durationFieldType60.toString();
        java.lang.String str63 = durationFieldType60.getName();
        int int64 = hours41.get(durationFieldType60);
        boolean boolean65 = hours39.isLessThan(hours41);
        org.joda.time.Hours hours66 = hours4.plus(hours39);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "P-1D" + "'", str25, "P-1D");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(hours32);
        org.junit.Assert.assertNotNull(hours33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(hours35);
        org.junit.Assert.assertNotNull(hours36);
        org.junit.Assert.assertNotNull(hours37);
        org.junit.Assert.assertNotNull(hours38);
        org.junit.Assert.assertNotNull(hours39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(hours41);
        org.junit.Assert.assertNotNull(hours42);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "P-1D" + "'", str56, "P-1D");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(durationFieldType60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "years" + "'", str62, "years");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "years" + "'", str63, "years");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(hours66);
    }

    @Test
    public void test14558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14558");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, periodType1, chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = chronology6.getZone();
        org.joda.time.DurationField durationField10 = chronology6.hours();
        org.joda.time.DateTimeField dateTimeField11 = chronology6.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology6.secondOfDay();
        int int13 = dateTimeField12.getMinimumValue();
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test14559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14559");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.Interval interval5 = interval3.toInterval();
        org.joda.time.Duration duration7 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Interval interval8 = interval5.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration7);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        long long23 = interval21.toDurationMillis();
        mutablePeriod17.setPeriod((org.joda.time.ReadableInterval) interval21);
        boolean boolean25 = interval5.isBefore((org.joda.time.ReadableInterval) interval21);
        long long26 = interval5.toDurationMillis();
        long long27 = interval5.getStartMillis();
        org.joda.time.MutableInterval mutableInterval28 = interval5.toMutableInterval();
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 53L + "'", long23 == 53L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 53L + "'", long26 == 53L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNotNull(mutableInterval28);
    }

    @Test
    public void test14560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14560");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.DurationField durationField10 = chronology7.centuries();
        org.joda.time.DurationField durationField11 = chronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = chronology7.minuteOfHour();
        org.joda.time.DurationField durationField13 = chronology7.seconds();
        long long16 = durationField13.subtract(7032568100052L, 1645048800000L);
        long long19 = durationField13.add(0L, 45L);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1638016231899948L) + "'", long16 == (-1638016231899948L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 45000L + "'", long19 == 45000L);
    }

    @Test
    public void test14561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14561");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours(173);
        org.junit.Assert.assertNotNull(hours1);
    }

    @Test
    public void test14562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14562");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period25 = org.joda.time.Period.days((-1));
        org.joda.time.Period period27 = period25.withWeeks((int) 'a');
        java.lang.String str28 = period25.toString();
        mutablePeriod23.setPeriod((org.joda.time.ReadablePeriod) period25);
        mutablePeriod23.addMonths((int) (short) -1);
        org.joda.time.Period period33 = org.joda.time.Period.days((-1));
        org.joda.time.Period period35 = period33.withWeeks((int) 'a');
        org.joda.time.Period period37 = period33.plusMonths((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType38 = null;
        boolean boolean39 = period37.isSupported(durationFieldType38);
        mutablePeriod23.add((org.joda.time.ReadablePeriod) period37);
        boolean boolean41 = mutablePeriod8.equals((java.lang.Object) mutablePeriod23);
        int int42 = mutablePeriod8.getDays();
        mutablePeriod8.setPeriod(3686399L, 514800000L);
        mutablePeriod8.addHours(173);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P-1D" + "'", str13, "P-1D");
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "P-1D" + "'", str28, "P-1D");
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test14563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14563");
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval9 = mutableInterval8.toInterval();
        org.joda.time.Chronology chronology10 = interval9.getChronology();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 1, periodType5, chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.yearOfCentury();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval17 = mutableInterval16.toInterval();
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.DateTimeZone dateTimeZone19 = chronology18.getZone();
        java.lang.String str21 = dateTimeZone19.getName(100L);
        org.joda.time.DateTime dateTime22 = dateTime13.withZoneRetainFields(dateTimeZone19);
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        org.joda.time.Chronology chronology27 = interval26.getChronology();
        org.joda.time.DateTimeZone dateTimeZone28 = chronology27.getZone();
        java.lang.String str30 = dateTimeZone28.getName(100L);
        org.joda.time.DateTime dateTime31 = dateTime22.withZoneRetainFields(dateTimeZone28);
        org.joda.time.Chronology chronology32 = chronology10.withZone(dateTimeZone28);
        org.joda.time.Period period33 = new org.joda.time.Period((-10L), 0L, chronology10);
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((-6216719237999948L), (long) 53, chronology10);
        org.joda.time.DateTimeField dateTimeField35 = chronology10.minuteOfHour();
        long long37 = dateTimeField35.roundCeiling(0L);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+97:00" + "'", str30, "+97:00");
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    }

    @Test
    public void test14564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14564");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours1 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours2 = hours0.minus(hours1);
        org.joda.time.Duration duration3 = hours1.toStandardDuration();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone5);
        int int7 = dateTime6.getMillisOfDay();
        org.joda.time.DateTime dateTime9 = dateTime6.plusMillis((int) '#');
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 1, periodType12, chronology17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '4', chronology17);
        org.joda.time.DateTime dateTime20 = dateTime9.withChronology(chronology17);
        boolean boolean22 = dateTime20.isEqual(187200000L);
        org.joda.time.Interval interval23 = duration3.toIntervalFrom((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 1, periodType25, chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.hourOfHalfday();
        long long35 = dateTimeField32.getDifferenceAsLong((long) 10, (long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone37);
        int int39 = dateTime38.getSecondOfMinute();
        org.joda.time.DateTime dateTime41 = dateTime38.withMinuteOfHour(10);
        org.joda.time.TimeOfDay timeOfDay42 = dateTime41.toTimeOfDay();
        int[] intArray49 = new int[] { '4', 1970, 10, (byte) 10, 24, 50 };
        int int50 = dateTimeField32.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay42, intArray49);
        org.joda.time.DateTime dateTime51 = dateTime20.withFields((org.joda.time.ReadablePartial) timeOfDay42);
        org.joda.time.DateTime.Property property52 = dateTime51.secondOfDay();
        int int53 = dateTime51.getWeekyear();
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime();
        org.joda.time.Duration duration55 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval62 = mutableInterval61.toInterval();
        org.joda.time.Chronology chronology63 = interval62.getChronology();
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((long) 1, periodType58, chronology63);
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((long) '4', chronology63);
        org.joda.time.ReadablePartial readablePartial66 = null;
        org.joda.time.DateTime dateTime67 = dateTime65.withFields(readablePartial66);
        org.joda.time.DateTime.Property property68 = dateTime67.millisOfDay();
        org.joda.time.DateTime dateTime69 = dateTime67.withEarlierOffsetAtOverlap();
        int int70 = dateTime67.getDayOfWeek();
        org.joda.time.PeriodType periodType72 = null;
        org.joda.time.MutableInterval mutableInterval75 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval76 = mutableInterval75.toInterval();
        org.joda.time.Chronology chronology77 = interval76.getChronology();
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((long) 1, periodType72, chronology77);
        org.joda.time.DateTimeField dateTimeField79 = chronology77.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone80 = chronology77.getZone();
        org.joda.time.DateTime dateTime81 = dateTime67.withChronology(chronology77);
        org.joda.time.Interval interval82 = duration55.toIntervalTo((org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.DateTime dateTime84 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period85 = duration55.toPeriodFrom((org.joda.time.ReadableInstant) dateTime84);
        org.joda.time.MutableInterval mutableInterval86 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime54, (org.joda.time.ReadablePeriod) period85);
        boolean boolean87 = dateTime51.isEqual((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.DateTime dateTime89 = dateTime51.minusMinutes(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter90 = null;
        java.lang.String str91 = dateTime51.toString(dateTimeFormatter90);
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600010 + "'", int7 == 3600010);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[52, 1970, 10, 10, 24, 50]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 11 + "'", int50 == 11);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1970 + "'", int53 == 1970);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(interval76);
        org.junit.Assert.assertNotNull(chronology77);
        org.junit.Assert.assertNotNull(dateTimeField79);
        org.junit.Assert.assertNotNull(dateTimeZone80);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(interval82);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(dateTime89);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "1970-01-05T01:10:00.010+97:00" + "'", str91, "1970-01-05T01:10:00.010+97:00");
    }

    @Test
    public void test14565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14565");
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
        boolean boolean20 = dateTime18.isBefore((long) 1970);
        org.joda.time.DateTime.Property property21 = dateTime18.weekyear();
        org.joda.time.DateTime dateTime23 = property21.addToCopy(9);
        org.joda.time.DateTime dateTime25 = property21.addWrapFieldToCopy(2031);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test14566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14566");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1439, 94);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 94");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14567");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime9 = property6.addWrapFieldToCopy(1);
        org.joda.time.Period period11 = new org.joda.time.Period(164096150400000L);
        org.joda.time.DateTime dateTime12 = dateTime9.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusHours(50);
        org.joda.time.DateTime dateTime16 = dateTime12.minusMillis((-948));
        org.joda.time.DateTime dateTime18 = dateTime12.withWeekOfWeekyear(23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test14568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14568");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(4999, 2031);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 2031");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14569");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.yearOfCentury();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.DateTimeZone dateTimeZone16 = chronology15.getZone();
        java.lang.String str18 = dateTimeZone16.getName(100L);
        org.joda.time.DateTime dateTime19 = dateTime10.withZoneRetainFields(dateTimeZone16);
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.DateTimeZone dateTimeZone25 = chronology24.getZone();
        java.lang.String str27 = dateTimeZone25.getName(100L);
        org.joda.time.DateTime dateTime28 = dateTime19.withZoneRetainFields(dateTimeZone25);
        org.joda.time.Chronology chronology29 = chronology7.withZone(dateTimeZone25);
        org.joda.time.DurationField durationField30 = chronology7.millis();
        long long34 = chronology7.add(947000L, 221388524946L, 15);
        org.joda.time.DateTimeField dateTimeField35 = chronology7.minuteOfHour();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) (-12705931), chronology7);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+97:00" + "'", str18, "+97:00");
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+97:00" + "'", str27, "+97:00");
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 3320828821190L + "'", long34 == 3320828821190L);
        org.junit.Assert.assertNotNull(dateTimeField35);
    }

    @Test
    public void test14570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14570");
        org.joda.time.Period period1 = new org.joda.time.Period(1645455367047L);
    }

    @Test
    public void test14571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14571");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.MIN_VALUE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = seconds0.negated();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Integer.MIN_VALUE cannot be negated");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
    }

    @Test
    public void test14572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14572");
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
        long long27 = mutableInterval23.getEndMillis();
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean38 = mutableInterval33.isBefore((org.joda.time.ReadableInterval) mutableInterval37);
        boolean boolean39 = mutableInterval30.contains((org.joda.time.ReadableInterval) mutableInterval37);
        org.joda.time.Weeks weeks40 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval37);
        long long41 = mutableInterval37.getEndMillis();
        org.joda.time.DateTime dateTime42 = mutableInterval37.getEnd();
        mutableInterval23.setStart((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.MutableInterval mutableInterval44 = mutableInterval23.copy();
        org.joda.time.Duration duration45 = mutableInterval23.toDuration();
        org.joda.time.Chronology chronology46 = mutableInterval23.getChronology();
        org.joda.time.DurationField durationField47 = chronology46.weeks();
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 52L + "'", long27 == 52L);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(weeks40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 52L + "'", long41 == 52L);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(mutableInterval44);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(durationField47);
    }

    @Test
    public void test14573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14573");
        org.joda.time.Period period4 = new org.joda.time.Period(24, 954, 925, (int) (short) 100);
    }

    @Test
    public void test14574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14574");
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
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean23 = mutableInterval18.isBefore((org.joda.time.ReadableInterval) mutableInterval22);
        boolean boolean24 = mutableInterval15.contains((org.joda.time.ReadableInterval) mutableInterval22);
        mutableInterval15.setDurationAfterStart(0L);
        boolean boolean27 = mutableInterval15.containsNow();
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean38 = mutableInterval33.isBefore((org.joda.time.ReadableInterval) mutableInterval37);
        boolean boolean39 = mutableInterval30.contains((org.joda.time.ReadableInterval) mutableInterval37);
        mutableInterval30.setDurationAfterStart(0L);
        boolean boolean42 = mutableInterval30.containsNow();
        boolean boolean43 = mutableInterval15.isAfter((org.joda.time.ReadableInterval) mutableInterval30);
        boolean boolean44 = interval7.contains((org.joda.time.ReadableInterval) mutableInterval15);
        org.joda.time.Interval interval46 = interval7.withEndMillis(0L);
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType48 = periodType47.withWeeksRemoved();
        org.joda.time.Period period49 = interval7.toPeriod(periodType47);
        int[] intArray50 = period49.getValues();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod(56, (-6), 3600, 10);
        mutablePeriod55.setMinutes((int) (short) 10);
        mutablePeriod55.setWeeks(29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period60 = period49.withFields((org.joda.time.ReadablePeriod) mutablePeriod55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 53L + "'", long5 == 53L);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[0, 0, 0, 0, 0, 0, 101]");
    }

    @Test
    public void test14575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14575");
        org.joda.time.Hours hours2 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours3 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours4 = hours2.minus(hours3);
        org.joda.time.Duration duration5 = hours3.toStandardDuration();
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
        boolean boolean24 = dateTime22.isEqual(187200000L);
        org.joda.time.Interval interval25 = duration5.toIntervalFrom((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone27);
        int int29 = dateTime28.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime28.getZone();
        long long33 = dateTimeZone30.convertLocalToUTC(0L, true);
        org.joda.time.DateTime dateTime34 = dateTime22.withZoneRetainFields(dateTimeZone30);
        java.lang.String str36 = dateTimeZone30.getShortName((long) 12);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) 2022, dateTimeZone30);
        long long39 = dateTimeZone30.nextTransition(1645398000000L);
        long long41 = dateTimeZone30.previousTransition((long) 20);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone43);
        int int45 = dateTime44.getSecondOfMinute();
        org.joda.time.DateTime dateTime47 = dateTime44.withMinuteOfHour(10);
        int int48 = dateTimeZone30.getOffset((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(942L, dateTimeZone30);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3600010 + "'", int9 == 3600010);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-349200000L) + "'", long33 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+97:00" + "'", str36, "+97:00");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1645398000000L + "'", long39 == 1645398000000L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 20L + "'", long41 == 20L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 349200000 + "'", int48 == 349200000);
    }

    @Test
    public void test14576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14576");
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
        org.joda.time.Chronology chronology15 = dateTime14.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.millis();
        org.joda.time.DurationField durationField17 = chronology15.weeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period18 = new org.joda.time.Period((java.lang.Object) durationField17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDurationField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test14577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14577");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.Interval interval5 = interval3.toInterval();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone7);
        int int9 = dateTime8.getSecondOfMinute();
        int int10 = dateTime8.getMillisOfDay();
        org.joda.time.DateTime dateTime12 = dateTime8.withYear((int) (byte) 100);
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int15 = dateTime12.get(dateTimeFieldType14);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 100, (long) 10, periodType18);
        mutablePeriod19.setMonths((int) (byte) -1);
        mutablePeriod19.setPeriod(366, (int) (short) 0, 48, 0, (int) (byte) 0, 21, (int) (short) 0, 3600010);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone34);
        int int36 = dateTime35.getSecondOfMinute();
        int int37 = dateTime35.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone39);
        int int41 = dateTime40.getMillisOfDay();
        org.joda.time.DateTime dateTime43 = dateTime40.plusMillis((int) '#');
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) 1, periodType46, chronology51);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) '4', chronology51);
        org.joda.time.DateTime dateTime54 = dateTime43.withChronology(chronology51);
        org.joda.time.MutableDateTime mutableDateTime55 = dateTime35.toMutableDateTime(chronology51);
        mutablePeriod19.setPeriod(100L, (long) 48, chronology51);
        org.joda.time.DateTime dateTime57 = dateTime12.toDateTime(chronology51);
        long long63 = chronology51.getDateTimeMillis(15L, 17, (int) (byte) 10, 50, 99);
        long long67 = chronology51.add(1645447142686L, 946634L, 292278993);
        org.joda.time.DateTimeField dateTimeField68 = chronology51.minuteOfDay();
        org.joda.time.Interval interval69 = interval3.withChronology(chronology51);
        boolean boolean71 = interval69.isAfter((long) 2031);
        org.joda.time.MutableInterval mutableInterval72 = interval69.toMutableInterval();
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3600010 + "'", int10 == 3600010);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3600010 + "'", int37 == 3600010);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3600010 + "'", int41 == 3600010);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 58250099L + "'", long63 == 58250099L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 278326679402248L + "'", long67 == 278326679402248L);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(interval69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(mutableInterval72);
    }

    @Test
    public void test14578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14578");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration1 = duration0.toDuration();
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = chronology6.getZone();
        org.joda.time.Period period8 = duration0.toPeriod(chronology6);
        org.joda.time.DurationField durationField9 = chronology6.seconds();
        org.joda.time.DateTimeField dateTimeField10 = chronology6.weekOfWeekyear();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeField10.getAsText(1645455122339L, locale12);
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "8" + "'", str13, "8");
    }

    @Test
    public void test14579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14579");
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
        org.joda.time.Period period36 = period34.minusHours(1970);
        org.joda.time.Seconds seconds37 = period34.toStandardSeconds();
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
        boolean boolean64 = interval56.contains((long) (-1));
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval68 = mutableInterval67.toInterval();
        org.joda.time.Chronology chronology69 = interval68.getChronology();
        org.joda.time.MutableInterval mutableInterval70 = interval68.toMutableInterval();
        boolean boolean71 = interval56.contains((org.joda.time.ReadableInterval) interval68);
        org.joda.time.Period period72 = interval68.toPeriod();
        org.joda.time.Period period74 = period72.minusHours(1970);
        org.joda.time.Seconds seconds75 = period72.toStandardSeconds();
        org.joda.time.Seconds seconds76 = seconds37.minus(seconds75);
        org.joda.time.Seconds seconds78 = seconds37.multipliedBy(948);
        org.joda.time.Seconds seconds80 = seconds37.dividedBy(10);
        org.joda.time.DurationFieldType durationFieldType81 = seconds37.getFieldType();
        org.joda.time.Duration duration82 = seconds37.toStandardDuration();
        org.joda.time.DurationFieldType durationFieldType83 = seconds37.getFieldType();
        org.joda.time.Period period85 = new org.joda.time.Period((long) 100);
        org.joda.time.Period period87 = period85.plusDays((-1));
        org.joda.time.Period period89 = period87.withYears(48);
        org.joda.time.Seconds seconds90 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) period87);
        org.joda.time.Seconds seconds92 = seconds90.minus(60);
        org.joda.time.Seconds seconds93 = seconds90.negated();
        org.joda.time.Seconds seconds94 = seconds37.plus(seconds90);
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
        org.junit.Assert.assertNotNull(seconds37);
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
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(interval68);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(mutableInterval70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(seconds75);
        org.junit.Assert.assertNotNull(seconds76);
        org.junit.Assert.assertNotNull(seconds78);
        org.junit.Assert.assertNotNull(seconds80);
        org.junit.Assert.assertNotNull(durationFieldType81);
        org.junit.Assert.assertNotNull(duration82);
        org.junit.Assert.assertNotNull(durationFieldType83);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertNotNull(seconds90);
        org.junit.Assert.assertNotNull(seconds92);
        org.junit.Assert.assertNotNull(seconds93);
        org.junit.Assert.assertNotNull(seconds94);
    }

    @Test
    public void test14580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14580");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period16 = period10.plusSeconds(2022);
        org.joda.time.Period period18 = period10.plusMonths(0);
        org.joda.time.format.PeriodFormatter periodFormatter19 = null;
        java.lang.String str20 = period18.toString(periodFormatter19);
        org.joda.time.Period period22 = period18.withDays(50);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P-1D" + "'", str13, "P-1D");
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "P-1D" + "'", str20, "P-1D");
        org.junit.Assert.assertNotNull(period22);
    }

    @Test
    public void test14581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14581");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusSeconds((int) (short) 0);
        org.joda.time.DateTime dateTime7 = dateTime5.minusDays(60);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 1, periodType9, chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.yearOfCentury();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.DateTimeZone dateTimeZone23 = chronology22.getZone();
        java.lang.String str25 = dateTimeZone23.getName(100L);
        org.joda.time.DateTime dateTime26 = dateTime17.withZoneRetainFields(dateTimeZone23);
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.DateTimeZone dateTimeZone32 = chronology31.getZone();
        java.lang.String str34 = dateTimeZone32.getName(100L);
        org.joda.time.DateTime dateTime35 = dateTime26.withZoneRetainFields(dateTimeZone32);
        org.joda.time.Chronology chronology36 = chronology14.withZone(dateTimeZone32);
        long long40 = chronology36.add((long) 0, (long) 12, (int) '4');
        org.joda.time.DateTime dateTime41 = dateTime7.withChronology(chronology36);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(1645454891212L, chronology36);
        org.joda.time.DateTimeField dateTimeField43 = chronology36.clockhourOfDay();
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+97:00" + "'", str25, "+97:00");
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+97:00" + "'", str34, "+97:00");
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 624L + "'", long40 == 624L);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTimeField43);
    }

    @Test
    public void test14582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14582");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getMillisOfDay();
        org.joda.time.DateTime dateTime5 = dateTime2.plusMillis((int) '#');
        int int6 = dateTime2.getYearOfEra();
        org.joda.time.DateTime.Property property7 = dateTime2.secondOfMinute();
        long long8 = property7.remainder();
        org.joda.time.DateTime dateTime10 = property7.addWrapFieldToCopy(121);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone12);
        int int14 = dateTime13.getMillisOfDay();
        org.joda.time.DateTime dateTime16 = dateTime13.plusMillis((int) '#');
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 1, periodType19, chronology24);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) '4', chronology24);
        org.joda.time.DateTime dateTime27 = dateTime16.withChronology(chronology24);
        org.joda.time.DateTimeField dateTimeField28 = chronology24.monthOfYear();
        org.joda.time.DateTime dateTime29 = dateTime10.withChronology(chronology24);
        org.joda.time.DateTimeField dateTimeField30 = chronology24.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField31 = chronology24.year();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3600010 + "'", int3 == 3600010);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3600010 + "'", int14 == 3600010);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
    }

    @Test
    public void test14583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14583");
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
        org.joda.time.DateTime dateTime20 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval27 = mutableInterval26.toInterval();
        org.joda.time.Chronology chronology28 = interval27.getChronology();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 1, periodType23, chronology28);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) '4', chronology28);
        org.joda.time.ReadablePartial readablePartial31 = null;
        org.joda.time.DateTime dateTime32 = dateTime30.withFields(readablePartial31);
        org.joda.time.DateTime.Property property33 = dateTime32.millisOfDay();
        org.joda.time.DateTime dateTime35 = dateTime32.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property36 = dateTime32.era();
        org.joda.time.Duration duration38 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime40 = dateTime32.withDurationAdded((org.joda.time.ReadableDuration) duration38, 0);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableDuration) duration38);
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        org.joda.time.Chronology chronology48 = interval47.getChronology();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) 1, periodType43, chronology48);
        org.joda.time.DateTimeField dateTimeField50 = chronology48.yearOfCentury();
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval55 = mutableInterval54.toInterval();
        org.joda.time.Chronology chronology56 = interval55.getChronology();
        org.joda.time.DateTimeZone dateTimeZone57 = chronology56.getZone();
        java.lang.String str59 = dateTimeZone57.getName(100L);
        org.joda.time.DateTime dateTime60 = dateTime51.withZoneRetainFields(dateTimeZone57);
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval64 = mutableInterval63.toInterval();
        org.joda.time.Chronology chronology65 = interval64.getChronology();
        org.joda.time.DateTimeZone dateTimeZone66 = chronology65.getZone();
        java.lang.String str68 = dateTimeZone66.getName(100L);
        org.joda.time.DateTime dateTime69 = dateTime60.withZoneRetainFields(dateTimeZone66);
        org.joda.time.Chronology chronology70 = chronology48.withZone(dateTimeZone66);
        org.joda.time.Period period71 = duration38.toPeriod(chronology70);
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime(4838400100L, chronology70);
        org.joda.time.DateTime dateTime74 = dateTime72.plusMillis(26);
        org.joda.time.DateMidnight dateMidnight75 = dateTime74.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone76 = dateMidnight75.getZone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "+97:00" + "'", str59, "+97:00");
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(dateTimeZone66);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "+97:00" + "'", str68, "+97:00");
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateMidnight75);
        org.junit.Assert.assertNotNull(dateTimeZone76);
    }

    @Test
    public void test14584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14584");
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
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean36 = mutableInterval31.isBefore((org.joda.time.ReadableInterval) mutableInterval35);
        boolean boolean37 = mutableInterval28.contains((org.joda.time.ReadableInterval) mutableInterval35);
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        long long43 = interval41.toDurationMillis();
        org.joda.time.Interval interval45 = interval41.withEndMillis((long) (short) 100);
        mutableInterval35.setInterval((org.joda.time.ReadableInterval) interval41);
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        long long52 = interval50.toDurationMillis();
        boolean boolean53 = interval41.isAfter((org.joda.time.ReadableInterval) interval50);
        org.joda.time.Interval interval55 = interval41.withEndMillis(100L);
        boolean boolean56 = interval41.containsNow();
        mutablePeriod8.setPeriod((org.joda.time.ReadableInterval) interval41);
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval61 = mutableInterval60.toInterval();
        org.joda.time.Chronology chronology62 = interval61.getChronology();
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(chronology62);
        int int64 = dateTime63.getSecondOfMinute();
        org.joda.time.DateTime dateTime66 = dateTime63.withWeekyear(3);
        boolean boolean68 = dateTime66.isAfter(9223372036505575807L);
        boolean boolean69 = interval41.contains((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime.Property property70 = dateTime66.millisOfSecond();
        org.joda.time.LocalTime localTime71 = dateTime66.toLocalTime();
        boolean boolean73 = dateTime66.isAfter(1652306400000L);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P-1D" + "'", str13, "P-1D");
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 53L + "'", long43 == 53L);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 53L + "'", long52 == 53L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(chronology62);
// flaky:         org.junit.Assert.assertTrue("'" + int64 + "' != '" + 38 + "'", int64 == 38);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(localTime71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test14585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14585");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("PT-2011M");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PT-2011M\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14586");
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
        org.joda.time.DateTimeField dateTimeField26 = chronology21.dayOfMonth();
        org.joda.time.DurationField durationField27 = chronology21.seconds();
        org.joda.time.DurationField durationField28 = chronology21.seconds();
        long long31 = durationField28.add(216000000L, 0);
        long long34 = durationField28.add(0L, 99);
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
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 216000000L + "'", long31 == 216000000L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 99000L + "'", long34 == 99000L);
    }

    @Test
    public void test14587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14587");
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean11 = mutableInterval6.isBefore((org.joda.time.ReadableInterval) mutableInterval10);
        boolean boolean12 = mutableInterval3.contains((org.joda.time.ReadableInterval) mutableInterval10);
        org.joda.time.Weeks weeks13 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval10);
        long long14 = mutableInterval10.getEndMillis();
        org.joda.time.DateTime dateTime15 = mutableInterval10.getEnd();
        org.joda.time.Interval interval16 = mutableInterval10.toInterval();
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 1, periodType18, chronology23);
        long long28 = chronology23.add(52L, 6216719238000000L, (int) (byte) -1);
        org.joda.time.DurationField durationField29 = chronology23.days();
        org.joda.time.DateTimeField dateTimeField30 = chronology23.millisOfSecond();
        mutableInterval10.setChronology(chronology23);
        java.lang.String str32 = chronology23.toString();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(3600045L, chronology23);
        org.joda.time.DurationField durationField34 = chronology23.years();
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-6216719237999948L) + "'", long28 == (-6216719237999948L));
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ISOChronology[+97:00]" + "'", str32, "ISOChronology[+97:00]");
        org.junit.Assert.assertNotNull(durationField34);
    }

    @Test
    public void test14588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14588");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
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
        org.joda.time.Interval interval27 = duration0.toIntervalTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period30 = duration0.toPeriodFrom((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime.Property property31 = dateTime29.era();
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(periodType32);
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.Duration duration35 = mutableInterval34.toDuration();
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval34.setStartMillis(2147483647L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration0);
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
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(duration35);
    }

    @Test
    public void test14589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14589");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 100, (long) 10, periodType2);
        mutablePeriod3.setMonths((int) (byte) -1);
        mutablePeriod3.setPeriod(366, (int) (short) 0, 48, 0, (int) (byte) 0, 21, (int) (short) 0, 3600010);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone18);
        int int20 = dateTime19.getSecondOfMinute();
        int int21 = dateTime19.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone23);
        int int25 = dateTime24.getMillisOfDay();
        org.joda.time.DateTime dateTime27 = dateTime24.plusMillis((int) '#');
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.Chronology chronology35 = interval34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 1, periodType30, chronology35);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) '4', chronology35);
        org.joda.time.DateTime dateTime38 = dateTime27.withChronology(chronology35);
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime19.toMutableDateTime(chronology35);
        mutablePeriod3.setPeriod(100L, (long) 48, chronology35);
        int int41 = mutablePeriod3.getMinutes();
        int int42 = mutablePeriod3.getHours();
        mutablePeriod3.addMillis(349200000);
        int int45 = mutablePeriod3.getYears();
        mutablePeriod3.setPeriod((long) (-11));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3600010 + "'", int21 == 3600010);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3600010 + "'", int25 == 3600010);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test14590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14590");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property4 = dateTime3.minuteOfDay();
        long long5 = property4.remainder();
        int int6 = property4.get();
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 1, periodType9, chronology14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) '4', chronology14);
        org.joda.time.ReadablePartial readablePartial17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.withFields(readablePartial17);
        org.joda.time.DateTime.Property property19 = dateTime18.millisOfDay();
        org.joda.time.DateTime dateTime20 = dateTime18.withEarlierOffsetAtOverlap();
        int int21 = dateTime18.getDayOfWeek();
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval27 = mutableInterval26.toInterval();
        org.joda.time.Chronology chronology28 = interval27.getChronology();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 1, periodType23, chronology28);
        org.joda.time.DateTimeField dateTimeField30 = chronology28.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone31 = chronology28.getZone();
        org.joda.time.DateTime dateTime32 = dateTime18.withChronology(chronology28);
        org.joda.time.DateTime dateTime33 = dateTime18.withEarlierOffsetAtOverlap();
        org.joda.time.Period period34 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType35 = period34.getPeriodType();
        org.joda.time.Period period37 = period34.withMonths((int) (byte) 0);
        org.joda.time.Period period38 = period34.toPeriod();
        org.joda.time.DateTime dateTime40 = dateTime33.withPeriodAdded((org.joda.time.ReadablePeriod) period38, (int) (byte) 0);
        int int41 = dateTime33.getEra();
        int int42 = property4.compareTo((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(1970);
        org.joda.time.DateTime dateTime45 = dateTime33.withZoneRetainFields(dateTimeZone44);
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(chronology50);
        org.joda.time.DateTime dateTime53 = dateTime51.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime55 = dateTime53.plus((long) (short) -1);
        org.joda.time.DateTime dateTime58 = dateTime55.withDurationAdded((long) 100, (int) (short) 100);
        org.joda.time.Chronology chronology59 = dateTime58.getChronology();
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval63 = mutableInterval62.toInterval();
        org.joda.time.Chronology chronology64 = interval63.getChronology();
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime(chronology64);
        int int66 = dateTime65.getSecondOfMinute();
        org.joda.time.DateTime dateTime68 = dateTime65.withWeekyear(3);
        boolean boolean69 = dateTime58.isBefore((org.joda.time.ReadableInstant) dateTime68);
        java.lang.String str70 = dateTime68.toString();
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime45, (org.joda.time.ReadableInstant) dateTime68);
        mutablePeriod71.add(3, (-43), (-457070), 360000000, (-19043), 2007, (-17259432), 620);
        mutablePeriod71.setMillis(0);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(chronology64);
// flaky:         org.junit.Assert.assertTrue("'" + int66 + "' != '" + 38 + "'", int66 == 38);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "0003-02-21T15:57:38.784+97:00" + "'", str70, "0003-02-21T15:57:38.784+97:00");
    }

    @Test
    public void test14591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14591");
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
        org.joda.time.Hours hours23 = period15.toStandardHours();
        org.joda.time.Period period25 = period15.minusHours((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod26 = period15.toMutablePeriod();
        org.joda.time.Period period28 = period15.plusMinutes(802202);
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
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(mutablePeriod26);
        org.junit.Assert.assertNotNull(period28);
    }

    @Test
    public void test14592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14592");
        org.joda.time.Period period3 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType4 = period3.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) '#', 100L, periodType4);
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval9 = mutableInterval8.toInterval();
        org.joda.time.Chronology chronology10 = interval9.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology10.getZone();
        org.joda.time.Period period12 = new org.joda.time.Period(10L, periodType4, chronology10);
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.MutableInterval mutableInterval18 = interval16.toMutableInterval();
        org.joda.time.Interval interval20 = interval16.withEndMillis(53L);
        org.joda.time.Chronology chronology21 = interval16.getChronology();
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean32 = mutableInterval27.isBefore((org.joda.time.ReadableInterval) mutableInterval31);
        boolean boolean33 = mutableInterval24.contains((org.joda.time.ReadableInterval) mutableInterval31);
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        long long39 = interval37.toDurationMillis();
        org.joda.time.Interval interval41 = interval37.withEndMillis((long) (short) 100);
        mutableInterval31.setInterval((org.joda.time.ReadableInterval) interval37);
        boolean boolean43 = mutableInterval31.containsNow();
        boolean boolean44 = interval16.contains((org.joda.time.ReadableInterval) mutableInterval31);
        org.joda.time.PeriodType periodType45 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(periodType45);
        org.joda.time.Period period47 = mutableInterval31.toPeriod(periodType45);
        org.joda.time.MutablePeriod mutablePeriod48 = period47.toMutablePeriod();
        org.joda.time.Period period49 = period12.minus((org.joda.time.ReadablePeriod) mutablePeriod48);
        int int50 = mutablePeriod48.getMonths();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod48.addMonths(91);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(mutableInterval18);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 53L + "'", long39 == 53L);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(mutablePeriod48);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test14593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14593");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) 15);
        long long2 = duration1.getStandardSeconds();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15L + "'", long2 == 15L);
    }

    @Test
    public void test14594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14594");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.DateTime.Property property10 = dateTime9.era();
        org.joda.time.DateTime dateTime12 = dateTime9.minusYears((int) '#');
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra(6);
        org.joda.time.DateTime dateTime17 = dateTime15.withHourOfDay(0);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test14595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14595");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 1);
        org.joda.time.Instant instant3 = instant1.minus(863999990L);
        org.joda.time.Instant instant4 = instant1.toInstant();
        boolean boolean6 = instant1.isAfter(1298798109705600L);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test14596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14596");
        org.joda.time.Days days0 = org.joda.time.Days.TWO;
        org.joda.time.Days days1 = org.joda.time.Days.TWO;
        org.joda.time.Days days2 = org.joda.time.Days.ONE;
        int int3 = days2.getDays();
        int int4 = days2.size();
        org.joda.time.Days days6 = days2.dividedBy((int) (short) -1);
        org.joda.time.Days days7 = org.joda.time.Days.THREE;
        boolean boolean8 = days6.isLessThan(days7);
        boolean boolean9 = days1.isLessThan(days6);
        org.joda.time.Days days10 = days0.minus(days6);
        org.joda.time.Days days11 = org.joda.time.Days.THREE;
        org.joda.time.Days days13 = days11.multipliedBy(19);
        org.joda.time.Days days14 = org.joda.time.Days.ONE;
        org.joda.time.Days days15 = org.joda.time.Days.ZERO;
        boolean boolean16 = days14.isLessThan(days15);
        org.joda.time.Duration duration17 = days14.toStandardDuration();
        boolean boolean18 = days11.isGreaterThan(days14);
        org.joda.time.Days days20 = days14.minus(2022);
        org.joda.time.Days days21 = days10.plus(days14);
        org.joda.time.Duration duration22 = days14.toStandardDuration();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(duration22);
    }

    @Test
    public void test14597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14597");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes(1858704537600551L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1858704537600551 * 60000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14598");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Weeks weeks13 = weeks12.negated();
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean24 = mutableInterval19.isBefore((org.joda.time.ReadableInterval) mutableInterval23);
        boolean boolean25 = mutableInterval16.contains((org.joda.time.ReadableInterval) mutableInterval23);
        org.joda.time.Weeks weeks26 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval23);
        org.joda.time.Weeks weeks27 = weeks26.negated();
        boolean boolean28 = weeks13.isGreaterThan(weeks27);
        int int29 = weeks27.size();
        org.joda.time.Weeks weeks30 = org.joda.time.Weeks.ONE;
        org.joda.time.Weeks weeks31 = weeks27.minus(weeks30);
        org.joda.time.Weeks weeks33 = weeks30.minus(4);
        java.lang.String str34 = weeks30.toString();
        int int35 = weeks30.size();
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertNotNull(weeks31);
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "P1W" + "'", str34, "P1W");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test14599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14599");
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
        org.joda.time.Duration duration14 = org.joda.time.Duration.ZERO;
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
        org.joda.time.Interval interval41 = duration14.toIntervalTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Instant instant43 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration14, 48);
        org.joda.time.Duration duration44 = duration14.toDuration();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone46);
        int int48 = dateTime47.getDayOfMonth();
        org.joda.time.DateTime dateTime50 = dateTime47.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property51 = dateTime50.dayOfYear();
        org.joda.time.DateTime dateTime52 = property51.roundHalfFloorCopy();
        org.joda.time.Period period53 = duration14.toPeriodFrom((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.Duration duration55 = org.joda.time.Duration.millis((-604800000L));
        org.joda.time.Duration duration56 = duration14.minus((org.joda.time.ReadableDuration) duration55);
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval63 = mutableInterval62.toInterval();
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean67 = mutableInterval62.isBefore((org.joda.time.ReadableInterval) mutableInterval66);
        boolean boolean68 = mutableInterval59.contains((org.joda.time.ReadableInterval) mutableInterval66);
        org.joda.time.MutableInterval mutableInterval71 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval72 = mutableInterval71.toInterval();
        org.joda.time.Chronology chronology73 = interval72.getChronology();
        long long74 = interval72.toDurationMillis();
        org.joda.time.Interval interval76 = interval72.withEndMillis((long) (short) 100);
        mutableInterval66.setInterval((org.joda.time.ReadableInterval) interval72);
        org.joda.time.MutableInterval mutableInterval80 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval81 = mutableInterval80.toInterval();
        org.joda.time.Chronology chronology82 = interval81.getChronology();
        long long83 = interval81.toDurationMillis();
        boolean boolean84 = interval72.isAfter((org.joda.time.ReadableInterval) interval81);
        org.joda.time.Interval interval86 = interval72.withEndMillis(100L);
        org.joda.time.Duration duration88 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Interval interval89 = interval86.withDurationAfterStart((org.joda.time.ReadableDuration) duration88);
        boolean boolean90 = duration56.isEqual((org.joda.time.ReadableDuration) duration88);
        org.joda.time.ReadableInstant readableInstant91 = null;
        org.joda.time.Period period92 = duration56.toPeriodFrom(readableInstant91);
        long long93 = duration56.getMillis();
        java.lang.String str94 = duration56.toString();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(duration14);
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
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(instant43);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 5 + "'", int48 == 5);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertNotNull(chronology73);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 53L + "'", long74 == 53L);
        org.junit.Assert.assertNotNull(interval76);
        org.junit.Assert.assertNotNull(interval81);
        org.junit.Assert.assertNotNull(chronology82);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 53L + "'", long83 == 53L);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(interval86);
        org.junit.Assert.assertNotNull(interval89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(period92);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 604800000L + "'", long93 == 604800000L);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "PT604800S" + "'", str94, "PT604800S");
    }

    @Test
    public void test14600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14600");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        mutablePeriod8.setYears(0);
        mutablePeriod8.setPeriod((int) (byte) -1, 100, (int) (byte) 100, (-1), 100, (int) (short) 10, 887, 0);
        mutablePeriod8.addWeeks(366);
        int int28 = mutablePeriod8.getMonths();
        mutablePeriod8.setHours(20);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P-1D" + "'", str13, "P-1D");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test14601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14601");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 779, (long) 56891755);
        org.joda.time.Interval interval3 = interval2.toInterval();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period14 = org.joda.time.Period.days((-1));
        org.joda.time.Period period16 = period14.withWeeks((int) 'a');
        java.lang.String str17 = period14.toString();
        mutablePeriod12.setPeriod((org.joda.time.ReadablePeriod) period14);
        int int19 = mutablePeriod12.getMillis();
        org.joda.time.MutablePeriod mutablePeriod20 = mutablePeriod12.toMutablePeriod();
        mutablePeriod20.add((int) '4', (int) (short) 0, (int) (byte) 0, (int) (short) 10, 1, (int) 'a', (int) (short) 100, (int) (short) -1);
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.Chronology chronology37 = interval36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 1, periodType32, chronology37);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) '4', chronology37);
        org.joda.time.ReadablePartial readablePartial40 = null;
        org.joda.time.DateTime dateTime41 = dateTime39.withFields(readablePartial40);
        org.joda.time.DateTime.Property property42 = dateTime39.millisOfDay();
        org.joda.time.DateTime dateTime43 = property42.getDateTime();
        org.joda.time.Duration duration44 = mutablePeriod20.toDurationFrom((org.joda.time.ReadableInstant) dateTime43);
        boolean boolean45 = interval2.contains((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTime dateTime47 = dateTime43.withWeekOfWeekyear(36);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "P-1D" + "'", str17, "P-1D");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod20);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(dateTime47);
    }

    @Test
    public void test14602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14602");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours1 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours2 = hours0.minus(hours1);
        org.joda.time.Duration duration3 = hours1.toStandardDuration();
        org.joda.time.Duration duration5 = duration3.withMillis((long) (short) 1);
        org.joda.time.Duration duration7 = duration5.minus((long) 947);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 1, periodType10, chronology15);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) '4', chronology15);
        org.joda.time.DateTime.Property property18 = dateTime17.era();
        int int19 = property18.getLeapAmount();
        org.joda.time.DateTime dateTime21 = property18.addWrapFieldToCopy(49);
        org.joda.time.DateTime dateTime23 = dateTime21.withMinuteOfHour(10);
        org.joda.time.Period period24 = duration7.toPeriodTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 1, periodType27, chronology32);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) '4', chronology32);
        org.joda.time.DateTime.Property property35 = dateTime34.era();
        int int36 = property35.getLeapAmount();
        org.joda.time.DateTime dateTime38 = property35.addWrapFieldToCopy(49);
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean49 = mutableInterval44.isBefore((org.joda.time.ReadableInterval) mutableInterval48);
        boolean boolean50 = mutableInterval41.contains((org.joda.time.ReadableInterval) mutableInterval48);
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.Chronology chronology55 = interval54.getChronology();
        long long56 = interval54.toDurationMillis();
        org.joda.time.Interval interval58 = interval54.withEndMillis((long) (short) 100);
        mutableInterval48.setInterval((org.joda.time.ReadableInterval) interval54);
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval63 = mutableInterval62.toInterval();
        org.joda.time.Chronology chronology64 = interval63.getChronology();
        long long65 = interval63.toDurationMillis();
        boolean boolean66 = interval54.isAfter((org.joda.time.ReadableInterval) interval63);
        org.joda.time.Hours hours67 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval63);
        org.joda.time.Interval interval68 = interval63.toInterval();
        org.joda.time.Period period69 = interval68.toPeriod();
        org.joda.time.MutableInterval mutableInterval70 = interval68.toMutableInterval();
        org.joda.time.DateTime dateTime71 = interval68.getStart();
        org.joda.time.Duration duration73 = org.joda.time.Duration.standardDays((long) 19);
        org.joda.time.Interval interval74 = interval68.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration73);
        org.joda.time.Chronology chronology75 = interval74.getChronology();
        org.joda.time.DateTime dateTime76 = dateTime38.toDateTime(chronology75);
        boolean boolean77 = duration7.equals((java.lang.Object) chronology75);
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 53L + "'", long56 == 53L);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 53L + "'", long65 == 53L);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(hours67);
        org.junit.Assert.assertNotNull(interval68);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(mutableInterval70);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(duration73);
        org.junit.Assert.assertNotNull(interval74);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test14603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14603");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 100, (long) 10, periodType2);
        mutablePeriod3.setMonths((int) (byte) -1);
        mutablePeriod3.setPeriod(366, (int) (short) 0, 48, 0, (int) (byte) 0, 21, (int) (short) 0, 3600010);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone18);
        int int20 = dateTime19.getSecondOfMinute();
        int int21 = dateTime19.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone23);
        int int25 = dateTime24.getMillisOfDay();
        org.joda.time.DateTime dateTime27 = dateTime24.plusMillis((int) '#');
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.Chronology chronology35 = interval34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 1, periodType30, chronology35);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) '4', chronology35);
        org.joda.time.DateTime dateTime38 = dateTime27.withChronology(chronology35);
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime19.toMutableDateTime(chronology35);
        mutablePeriod3.setPeriod(100L, (long) 48, chronology35);
        int int41 = mutablePeriod3.getMinutes();
        mutablePeriod3.setYears(2022);
        mutablePeriod3.addDays((-43));
        mutablePeriod3.setMillis(0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3600010 + "'", int21 == 3600010);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3600010 + "'", int25 == 3600010);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test14604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14604");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        java.util.Locale locale8 = null;
        int int9 = property6.getMaximumTextLength(locale8);
        java.lang.String str10 = property6.getAsShortText();
        org.joda.time.DateTime dateTime11 = property6.roundCeilingCopy();
        org.joda.time.DateTime dateTime14 = dateTime11.withDurationAdded((long) (-23632), 1133);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "5" + "'", str10, "5");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test14605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14605");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType5 = periodType4.withMinutesRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter2.withParseType(periodType5);
        boolean boolean7 = periodFormatter2.isParser();
        java.util.Locale locale8 = periodFormatter2.getLocale();
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(periodType9);
        org.joda.time.format.PeriodFormatter periodFormatter11 = periodFormatter2.withParseType(periodType9);
        org.joda.time.format.PeriodPrinter periodPrinter12 = periodFormatter11.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod14 = periodFormatter11.parseMutablePeriod("0003-02-21T15:55:49.643+97:00");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodFormatter11);
        org.junit.Assert.assertNull(periodPrinter12);
    }

    @Test
    public void test14606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14606");
        org.joda.time.Days days0 = org.joda.time.Days.TWO;
        org.joda.time.Days days1 = org.joda.time.Days.TWO;
        org.joda.time.Days days2 = org.joda.time.Days.ONE;
        int int3 = days2.getDays();
        int int4 = days2.size();
        org.joda.time.Days days6 = days2.dividedBy((int) (short) -1);
        org.joda.time.Days days7 = org.joda.time.Days.THREE;
        boolean boolean8 = days6.isLessThan(days7);
        boolean boolean9 = days1.isLessThan(days6);
        org.joda.time.Days days10 = days0.minus(days6);
        org.joda.time.Duration duration11 = days6.toStandardDuration();
        org.joda.time.DurationFieldType durationFieldType12 = days6.getFieldType();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(durationFieldType12);
    }

    @Test
    public void test14607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14607");
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
        org.joda.time.Chronology chronology25 = dateTime9.getChronology();
        org.joda.time.DateTime dateTime28 = dateTime9.withDurationAdded((-61394288400000L), 947);
        org.joda.time.DateTime dateTime30 = dateTime28.minusYears(23);
        org.joda.time.Instant instant31 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime32 = instant31.toMutableDateTime();
        boolean boolean33 = dateTime30.isBefore((org.joda.time.ReadableInstant) mutableDateTime32);
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean44 = mutableInterval39.isBefore((org.joda.time.ReadableInterval) mutableInterval43);
        boolean boolean45 = mutableInterval36.contains((org.joda.time.ReadableInterval) mutableInterval43);
        org.joda.time.Weeks weeks46 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval43);
        long long47 = mutableInterval43.getEndMillis();
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean58 = mutableInterval53.isBefore((org.joda.time.ReadableInterval) mutableInterval57);
        boolean boolean59 = mutableInterval50.contains((org.joda.time.ReadableInterval) mutableInterval57);
        mutableInterval43.setInterval((org.joda.time.ReadableInterval) mutableInterval57);
        org.joda.time.DateTime dateTime61 = mutableInterval57.getStart();
        org.joda.time.DateTime dateTime62 = mutableInterval57.getEnd();
        org.joda.time.DateTime.Property property63 = dateTime62.minuteOfHour();
        java.lang.Object obj64 = null;
        boolean boolean65 = dateTime62.equals(obj64);
        boolean boolean66 = mutableDateTime32.isAfter((org.joda.time.ReadableInstant) dateTime62);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(weeks46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 52L + "'", long47 == 52L);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test14608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14608");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (-2147483648), 45L);
        long long3 = mutableInterval2.toDurationMillis();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        mutablePeriod12.addMillis(2022);
        mutablePeriod12.add(56, 10, (int) (short) -1, 56, (int) (short) 1, 1970, (-90), 21);
        int int24 = mutablePeriod12.getHours();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period37 = org.joda.time.Period.days((-1));
        org.joda.time.Period period39 = period37.withWeeks((int) 'a');
        java.lang.String str40 = period37.toString();
        mutablePeriod35.setPeriod((org.joda.time.ReadablePeriod) period37);
        mutablePeriod35.addSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) 1, periodType46, chronology51);
        org.joda.time.Chronology chronology53 = chronology51.withUTC();
        org.joda.time.DateTimeField dateTimeField54 = chronology53.dayOfYear();
        java.lang.String str55 = chronology53.toString();
        mutablePeriod35.add(10L, chronology53);
        mutablePeriod12.setPeriod(355200035L, (long) (-292275054), chronology53);
        mutablePeriod12.setMonths(55);
        mutableInterval2.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) mutablePeriod12);
        mutablePeriod12.clear();
        mutablePeriod12.setYears((-22));
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval67 = mutableInterval66.toInterval();
        org.joda.time.Chronology chronology68 = interval67.getChronology();
        org.joda.time.Interval interval69 = interval67.toInterval();
        org.joda.time.Duration duration71 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Interval interval72 = interval69.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration71);
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.MutableInterval mutableInterval84 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval85 = mutableInterval84.toInterval();
        org.joda.time.Chronology chronology86 = interval85.getChronology();
        long long87 = interval85.toDurationMillis();
        mutablePeriod81.setPeriod((org.joda.time.ReadableInterval) interval85);
        boolean boolean89 = interval69.isBefore((org.joda.time.ReadableInterval) interval85);
        org.joda.time.Interval interval90 = interval85.toInterval();
        org.joda.time.Duration duration91 = interval90.toDuration();
        org.joda.time.Interval interval92 = interval90.toInterval();
        mutablePeriod12.setPeriod((org.joda.time.ReadableInterval) interval90);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2147483693L + "'", long3 == 2147483693L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "P-1D" + "'", str40, "P-1D");
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ISOChronology[UTC]" + "'", str55, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertNotNull(interval69);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertNotNull(interval85);
        org.junit.Assert.assertNotNull(chronology86);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 53L + "'", long87 == 53L);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(interval90);
        org.junit.Assert.assertNotNull(duration91);
        org.junit.Assert.assertNotNull(interval92);
    }

    @Test
    public void test14609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14609");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime8 = dateTime7.toDateTime();
        org.joda.time.TimeOfDay timeOfDay9 = dateTime7.toTimeOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone11);
        int int13 = dateTime12.getDayOfMonth();
        org.joda.time.DateTime dateTime15 = dateTime12.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property16 = dateTime15.dayOfYear();
        org.joda.time.DateTime dateTime17 = property16.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime18 = dateTime17.toDateTime();
        org.joda.time.TimeOfDay timeOfDay19 = dateTime17.toTimeOfDay();
        org.joda.time.Seconds seconds20 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadablePartial) timeOfDay9, (org.joda.time.ReadablePartial) timeOfDay19);
        org.joda.time.DateTimeField dateTimeField22 = timeOfDay19.getField(0);
        long long25 = dateTimeField22.add((long) (-2147483648), 366);
        long long27 = dateTimeField22.roundHalfEven(349200053L);
        java.lang.String str29 = dateTimeField22.getAsText(0L);
        int int31 = dateTimeField22.getMaximumValue((long) 7200000);
        int int32 = dateTimeField22.getMinimumValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-829883648L) + "'", long25 == (-829883648L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 349200000L + "'", long27 == 349200000L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0" + "'", str29, "0");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 23 + "'", int31 == 23);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test14610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14610");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(48);
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.ZERO;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.MIN_VALUE;
        boolean boolean4 = weeks2.isLessThan(weeks3);
        org.joda.time.DurationFieldType durationFieldType5 = weeks3.getFieldType();
        org.joda.time.Period period7 = period1.withField(durationFieldType5, 2);
        org.joda.time.Period period9 = period1.withSeconds((-66839380));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test14611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14611");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) 56);
        org.joda.time.DateTime dateTime8 = dateTime2.withWeekOfWeekyear(5);
        int int9 = dateTime8.getDayOfYear();
        org.joda.time.DateTime dateTime11 = dateTime8.withYearOfCentury(7);
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DateTime dateTime19 = dateTime17.withWeekyear((int) (short) 1);
        org.joda.time.Duration duration20 = org.joda.time.Duration.ZERO;
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
        org.joda.time.Interval interval47 = duration20.toIntervalTo((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period50 = duration20.toPeriodFrom((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Period period51 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType52 = period51.getPeriodType();
        org.joda.time.Period period53 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableDuration) duration20, periodType52);
        int int54 = periodType52.size();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod(periodType52);
        mutablePeriod55.setWeeks(22);
        mutablePeriod55.setDays(4999);
        mutablePeriod55.setMillis(56);
        org.joda.time.ReadableInterval readableInterval62 = null;
        mutablePeriod55.add(readableInterval62);
        org.joda.time.DateTime dateTime65 = dateTime11.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod55, 2922789);
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 26 + "'", int9 == 26);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(duration20);
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
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 8 + "'", int54 == 8);
        org.junit.Assert.assertNotNull(dateTime65);
    }

    @Test
    public void test14612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14612");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.Interval interval5 = interval3.toInterval();
        org.joda.time.Duration duration7 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Interval interval8 = interval5.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration7);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        long long23 = interval21.toDurationMillis();
        mutablePeriod17.setPeriod((org.joda.time.ReadableInterval) interval21);
        boolean boolean25 = interval5.isBefore((org.joda.time.ReadableInterval) interval21);
        long long26 = interval5.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        long long32 = interval30.toDurationMillis();
        org.joda.time.Interval interval34 = interval30.withEndMillis((long) (short) 100);
        boolean boolean36 = interval30.isBefore((long) 1970);
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval43 = mutableInterval42.toInterval();
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean47 = mutableInterval42.isBefore((org.joda.time.ReadableInterval) mutableInterval46);
        boolean boolean48 = mutableInterval39.contains((org.joda.time.ReadableInterval) mutableInterval46);
        mutableInterval39.setDurationAfterStart(0L);
        boolean boolean51 = mutableInterval39.containsNow();
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval55 = mutableInterval54.toInterval();
        org.joda.time.Chronology chronology56 = interval55.getChronology();
        long long57 = interval55.toDurationMillis();
        org.joda.time.Interval interval59 = interval55.withEndMillis((long) (short) 100);
        long long60 = interval55.toDurationMillis();
        boolean boolean61 = mutableInterval39.overlaps((org.joda.time.ReadableInterval) interval55);
        boolean boolean63 = interval55.contains((long) (-1));
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval67 = mutableInterval66.toInterval();
        org.joda.time.Chronology chronology68 = interval67.getChronology();
        org.joda.time.MutableInterval mutableInterval69 = interval67.toMutableInterval();
        boolean boolean70 = interval55.contains((org.joda.time.ReadableInterval) interval67);
        org.joda.time.Period period71 = interval67.toPeriod();
        org.joda.time.MutableInterval mutableInterval74 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval77 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval78 = mutableInterval77.toInterval();
        org.joda.time.MutableInterval mutableInterval81 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean82 = mutableInterval77.isBefore((org.joda.time.ReadableInterval) mutableInterval81);
        boolean boolean83 = mutableInterval74.contains((org.joda.time.ReadableInterval) mutableInterval81);
        org.joda.time.MutableInterval mutableInterval84 = mutableInterval74.copy();
        boolean boolean85 = interval67.contains((org.joda.time.ReadableInterval) mutableInterval74);
        org.joda.time.Interval interval86 = interval30.overlap((org.joda.time.ReadableInterval) mutableInterval74);
        org.joda.time.Interval interval87 = interval5.gap((org.joda.time.ReadableInterval) interval30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Chronology chronology88 = interval87.getChronology();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 53L + "'", long23 == 53L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 53L + "'", long26 == 53L);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 53L + "'", long32 == 53L);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 53L + "'", long57 == 53L);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 53L + "'", long60 == 53L);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertNotNull(mutableInterval69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(interval78);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(mutableInterval84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(interval86);
        org.junit.Assert.assertNull(interval87);
    }

    @Test
    public void test14613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14613");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(0L, (-1638016231899948L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14614");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.DateTime.Property property10 = dateTime9.era();
        org.joda.time.DateTime dateTime12 = dateTime9.minusYears((int) '#');
        int int13 = dateTime9.getCenturyOfEra();
        org.joda.time.DateTime dateTime14 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property15 = dateTime14.weekyear();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = property15.addToCopy(1645455227461L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1645455227461");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 19 + "'", int13 == 19);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test14615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14615");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, periodType1, chronology6);
        org.joda.time.Chronology chronology8 = chronology6.withUTC();
        org.joda.time.DurationField durationField9 = chronology6.weeks();
        org.joda.time.Period period11 = org.joda.time.Period.years(757);
        org.joda.time.Hours hours13 = org.joda.time.Hours.hours((int) (byte) 100);
        org.joda.time.Period period14 = period11.withFields((org.joda.time.ReadablePeriod) hours13);
        long long17 = chronology6.add((org.joda.time.ReadablePeriod) period14, 1645454905496L, 779);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.Chronology chronology19 = chronology6.withZone(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = chronology6.getZone();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone20);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 18611155162105496L + "'", long17 == 18611155162105496L);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
    }

    @Test
    public void test14616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14616");
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
        org.joda.time.Interval interval22 = property20.toInterval();
        org.joda.time.Weeks weeks23 = org.joda.time.Weeks.ZERO;
        org.joda.time.Duration duration24 = weeks23.toStandardDuration();
        org.joda.time.Duration duration26 = duration24.minus((long) 53);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone28);
        org.joda.time.DateTime dateTime30 = dateTime29.withLaterOffsetAtOverlap();
        org.joda.time.Duration duration31 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration32 = duration31.toDuration();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableDuration) duration31);
        org.joda.time.Duration duration34 = duration31.toDuration();
        org.joda.time.Duration duration36 = duration34.plus(4838400100L);
        boolean boolean37 = duration24.isEqual((org.joda.time.ReadableDuration) duration34);
        org.joda.time.Interval interval38 = interval22.withDurationAfterStart((org.joda.time.ReadableDuration) duration34);
        org.joda.time.Interval interval40 = interval38.withStartMillis((-62128976987761L));
        java.lang.String str41 = interval40.toString();
        long long42 = interval40.getEndMillis();
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
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0001-03-22T15:50:12.239+97:00/1970-01-05T00:00:00.000+97:00" + "'", str41, "0001-03-22T15:50:12.239+97:00/1970-01-05T00:00:00.000+97:00");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-3600000L) + "'", long42 == (-3600000L));
    }

    @Test
    public void test14617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14617");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableInstant0, readablePeriod1);
        java.lang.String str3 = mutableInterval2.toString();
        org.joda.time.Days days4 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) mutableInterval2);
        long long5 = mutableInterval2.getStartMillis();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2022-02-25T15:57:39.238+97:00/2022-02-25T15:57:39.238+97:00" + "'", str3, "2022-02-25T15:57:39.238+97:00/2022-02-25T15:57:39.238+97:00");
        org.junit.Assert.assertNotNull(days4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1645455459238L + "'", long5 == 1645455459238L);
    }

    @Test
    public void test14618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14618");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, periodType1, chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfCentury();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology14.getZone();
        java.lang.String str17 = dateTimeZone15.getName(100L);
        org.joda.time.DateTime dateTime18 = dateTime9.withZoneRetainFields(dateTimeZone15);
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateTimeZone dateTimeZone24 = chronology23.getZone();
        java.lang.String str26 = dateTimeZone24.getName(100L);
        org.joda.time.DateTime dateTime27 = dateTime18.withZoneRetainFields(dateTimeZone24);
        org.joda.time.Chronology chronology28 = chronology6.withZone(dateTimeZone24);
        org.joda.time.DurationField durationField29 = chronology6.centuries();
        org.joda.time.DateTimeField dateTimeField30 = chronology6.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField31 = chronology6.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone32 = chronology6.getZone();
        org.joda.time.DateTimeField dateTimeField33 = chronology6.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField34 = chronology6.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField35 = chronology6.secondOfDay();
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+97:00" + "'", str26, "+97:00");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
    }

    @Test
    public void test14619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14619");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone4 = dateTime2.getZone();
        org.joda.time.DateTime dateTime6 = dateTime2.plusSeconds((int) ' ');
        org.joda.time.DateTime dateTime7 = dateTime6.withTimeAtStartOfDay();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test14620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14620");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Chronology chronology13 = mutableInterval9.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology13.secondOfDay();
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test14621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14621");
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
        mutablePeriod8.addWeeks((int) (byte) -1);
        mutablePeriod8.setPeriod(1672531200000L, (long) 23);
        mutablePeriod8.setHours(97);
        org.joda.time.Chronology chronology35 = null;
        mutablePeriod8.setPeriod(6027377831999999L, (long) 893, chronology35);
        mutablePeriod8.addMillis((-9));
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P-1D" + "'", str13, "P-1D");
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test14622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14622");
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
        org.joda.time.Hours hours20 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours21 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours22 = hours20.minus(hours21);
        org.joda.time.Duration duration23 = hours21.toStandardDuration();
        org.joda.time.Duration duration24 = duration17.minus((org.joda.time.ReadableDuration) duration23);
        org.joda.time.Hours hours25 = org.joda.time.Hours.EIGHT;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period36 = org.joda.time.Period.days((-1));
        org.joda.time.Period period38 = period36.withWeeks((int) 'a');
        java.lang.String str39 = period36.toString();
        mutablePeriod34.setPeriod((org.joda.time.ReadablePeriod) period36);
        int int41 = mutablePeriod34.getMillis();
        org.joda.time.DurationFieldType durationFieldType43 = mutablePeriod34.getFieldType(0);
        int int44 = hours25.get(durationFieldType43);
        org.joda.time.Duration duration45 = hours25.toStandardDuration();
        boolean boolean46 = duration17.isEqual((org.joda.time.ReadableDuration) duration45);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "P-1D" + "'", str39, "P-1D");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test14623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14623");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean7 = mutableInterval2.isBefore((org.joda.time.ReadableInterval) mutableInterval6);
        java.lang.Object obj8 = mutableInterval2.clone();
        long long9 = mutableInterval2.getStartMillis();
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        long long15 = interval13.toDurationMillis();
        boolean boolean17 = interval13.isAfter((long) (short) 10);
        org.joda.time.Period period18 = interval13.toPeriod();
        org.joda.time.Period period19 = period18.toPeriod();
        mutableInterval2.setPeriodAfterStart((org.joda.time.ReadablePeriod) period18);
        org.joda.time.MutableInterval mutableInterval21 = mutableInterval2.copy();
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
        org.joda.time.DateTime.Property property36 = dateTime32.dayOfWeek();
        org.joda.time.DateTime dateTime37 = property36.withMaximumValue();
        org.joda.time.DateTime dateTime39 = dateTime37.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime41 = dateTime37.withMillis((long) 5);
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
        org.joda.time.DateTimeField dateTimeField68 = chronology63.dayOfMonth();
        org.joda.time.DurationField durationField69 = chronology63.seconds();
        org.joda.time.DurationField durationField70 = chronology63.seconds();
        org.joda.time.DateTime dateTime71 = dateTime37.toDateTime(chronology63);
        boolean boolean72 = mutableInterval2.isBefore((org.joda.time.ReadableInstant) dateTime71);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "1970-01-05T00:59:59.999+97:00/1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "1970-01-05T00:59:59.999+97:00/1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "1970-01-05T00:59:59.999+97:00/1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 53L + "'", long15 == 53L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(mutableInterval21);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
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
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(durationField69);
        org.junit.Assert.assertNotNull(durationField70);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test14624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14624");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        int int15 = mutablePeriod8.getMillis();
        mutablePeriod8.addMillis(9);
        java.lang.String str18 = mutablePeriod8.toString();
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P-1D" + "'", str13, "P-1D");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "P-1DT0.009S" + "'", str18, "P-1DT0.009S");
    }

    @Test
    public void test14625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14625");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        int int15 = mutablePeriod8.getMillis();
        org.joda.time.MutablePeriod mutablePeriod16 = mutablePeriod8.toMutablePeriod();
        mutablePeriod8.addHours((int) (short) 100);
        mutablePeriod8.setMillis(3600010);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period31 = org.joda.time.Period.days((-1));
        org.joda.time.Period period33 = period31.withWeeks((int) 'a');
        java.lang.String str34 = period31.toString();
        mutablePeriod29.setPeriod((org.joda.time.ReadablePeriod) period31);
        int int36 = mutablePeriod29.getMillis();
        org.joda.time.MutablePeriod mutablePeriod37 = mutablePeriod29.toMutablePeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray38 = mutablePeriod37.getFieldTypes();
        mutablePeriod8.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod37);
        mutablePeriod37.setPeriod(1969, 55, 121, 949, (int) (byte) 10, 121, 4999, 0);
        int int49 = mutablePeriod37.getHours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes50 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) mutablePeriod37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert period to duration as years is not precise in the period P1969Y55M121W949DT10H121M4999S");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P-1D" + "'", str13, "P-1D");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod16);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "P-1D" + "'", str34, "P-1D");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod37);
        org.junit.Assert.assertNotNull(durationFieldTypeArray38);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
    }

    @Test
    public void test14626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14626");
        org.joda.time.Period period4 = new org.joda.time.Period(99, (-57), 25, 47);
    }

    @Test
    public void test14627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14627");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        org.joda.time.DateTime dateTime5 = dateTime2.toDateTime();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval12 = mutableInterval11.toInterval();
        org.joda.time.Chronology chronology13 = interval12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 1, periodType8, chronology13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', chronology13);
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
        boolean boolean30 = dateTime15.isAfter((org.joda.time.ReadableInstant) dateTime26);
        java.lang.String str31 = dateTime15.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType33 = dateTimeFieldType32.getRangeDurationType();
        int int34 = dateTime15.get(dateTimeFieldType32);
        org.joda.time.DurationFieldType durationFieldType35 = dateTimeFieldType32.getRangeDurationType();
        org.joda.time.DateTime dateTime37 = dateTime5.withField(dateTimeFieldType32, 1);
        int int38 = dateTime5.getSecondOfMinute();
        org.joda.time.LocalDate localDate39 = dateTime5.toLocalDate();
        org.joda.time.DateTime dateTime41 = dateTime5.minusHours((-779));
        org.joda.time.Chronology chronology42 = dateTime41.getChronology();
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-05T01:00:00.052+97:00" + "'", str31, "1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(chronology42);
    }

    @Test
    public void test14628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14628");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) 56);
        org.joda.time.DateTime.Property property7 = dateTime2.minuteOfDay();
        org.joda.time.DateTime dateTime8 = property7.withMinimumValue();
        int int9 = property7.get();
        org.joda.time.DurationField durationField10 = property7.getRangeDurationField();
        java.lang.String str11 = property7.getName();
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "minuteOfDay" + "'", str11, "minuteOfDay");
    }

    @Test
    public void test14629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14629");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean7 = mutableInterval2.isBefore((org.joda.time.ReadableInterval) mutableInterval6);
        java.lang.Object obj8 = mutableInterval2.clone();
        long long9 = mutableInterval2.getStartMillis();
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        long long15 = interval13.toDurationMillis();
        boolean boolean17 = interval13.isAfter((long) (short) 10);
        org.joda.time.Period period18 = interval13.toPeriod();
        org.joda.time.Period period19 = period18.toPeriod();
        mutableInterval2.setPeriodAfterStart((org.joda.time.ReadablePeriod) period18);
        org.joda.time.MutableInterval mutableInterval21 = mutableInterval2.copy();
        org.joda.time.Hours hours22 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours23 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours24 = hours22.minus(hours23);
        org.joda.time.Hours hours25 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours26 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours27 = hours25.minus(hours26);
        org.joda.time.Hours hours28 = hours22.minus(hours25);
        org.joda.time.Hours hours29 = hours28.negated();
        mutableInterval2.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) hours29);
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval39 = mutableInterval38.toInterval();
        org.joda.time.Chronology chronology40 = interval39.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 1, periodType35, chronology40);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) '4', chronology40);
        org.joda.time.ReadablePartial readablePartial43 = null;
        org.joda.time.DateTime dateTime44 = dateTime42.withFields(readablePartial43);
        org.joda.time.DateTime.Property property45 = dateTime44.millisOfDay();
        org.joda.time.DateTime dateTime47 = dateTime44.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime49 = dateTime44.withCenturyOfEra((int) (short) 1);
        org.joda.time.Hours hours50 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours51 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours52 = hours50.minus(hours51);
        org.joda.time.Duration duration53 = hours51.toStandardDuration();
        org.joda.time.DateTime dateTime54 = dateTime44.plus((org.joda.time.ReadableDuration) duration53);
        org.joda.time.Duration duration55 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration56 = duration55.toDuration();
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval60 = mutableInterval59.toInterval();
        org.joda.time.Chronology chronology61 = interval60.getChronology();
        org.joda.time.DateTimeZone dateTimeZone62 = chronology61.getZone();
        org.joda.time.Period period63 = duration55.toPeriod(chronology61);
        boolean boolean64 = duration53.isShorterThan((org.joda.time.ReadableDuration) duration55);
        org.joda.time.PeriodType periodType65 = org.joda.time.PeriodType.days();
        org.joda.time.Period period66 = duration55.toPeriod(periodType65);
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.MutableInterval mutableInterval71 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval72 = mutableInterval71.toInterval();
        org.joda.time.Chronology chronology73 = interval72.getChronology();
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((long) 1, periodType68, chronology73);
        org.joda.time.DateTimeField dateTimeField75 = chronology73.yearOfCentury();
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval79 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval80 = mutableInterval79.toInterval();
        org.joda.time.Chronology chronology81 = interval80.getChronology();
        org.joda.time.DateTimeZone dateTimeZone82 = chronology81.getZone();
        java.lang.String str84 = dateTimeZone82.getName(100L);
        org.joda.time.DateTime dateTime85 = dateTime76.withZoneRetainFields(dateTimeZone82);
        org.joda.time.MutableInterval mutableInterval88 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval89 = mutableInterval88.toInterval();
        org.joda.time.Chronology chronology90 = interval89.getChronology();
        org.joda.time.DateTimeZone dateTimeZone91 = chronology90.getZone();
        java.lang.String str93 = dateTimeZone91.getName(100L);
        org.joda.time.DateTime dateTime94 = dateTime85.withZoneRetainFields(dateTimeZone91);
        org.joda.time.Chronology chronology95 = chronology73.withZone(dateTimeZone91);
        org.joda.time.Period period96 = new org.joda.time.Period(0L, 10L, periodType65, chronology73);
        org.joda.time.PeriodType periodType97 = periodType65.withWeeksRemoved();
        org.joda.time.Period period98 = mutableInterval2.toPeriod(periodType65);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "1970-01-05T00:59:59.999+97:00/1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "1970-01-05T00:59:59.999+97:00/1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "1970-01-05T00:59:59.999+97:00/1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 53L + "'", long15 == 53L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(mutableInterval21);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(hours24);
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(hours27);
        org.junit.Assert.assertNotNull(hours28);
        org.junit.Assert.assertNotNull(hours29);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(hours50);
        org.junit.Assert.assertNotNull(hours51);
        org.junit.Assert.assertNotNull(hours52);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(periodType65);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertNotNull(chronology73);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertNotNull(interval80);
        org.junit.Assert.assertNotNull(chronology81);
        org.junit.Assert.assertNotNull(dateTimeZone82);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "+97:00" + "'", str84, "+97:00");
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertNotNull(interval89);
        org.junit.Assert.assertNotNull(chronology90);
        org.junit.Assert.assertNotNull(dateTimeZone91);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "+97:00" + "'", str93, "+97:00");
        org.junit.Assert.assertNotNull(dateTime94);
        org.junit.Assert.assertNotNull(chronology95);
        org.junit.Assert.assertNotNull(periodType97);
        org.junit.Assert.assertNotNull(period98);
    }

    @Test
    public void test14630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14630");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis(1707948000000L);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test14631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14631");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime9 = property6.addWrapFieldToCopy(1);
        org.joda.time.Period period11 = new org.joda.time.Period(164096150400000L);
        org.joda.time.DateTime dateTime12 = dateTime9.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.MutablePeriod mutablePeriod13 = period11.toMutablePeriod();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval18 = mutableInterval17.toInterval();
        org.joda.time.Chronology chronology19 = interval18.getChronology();
        org.joda.time.DateTimeZone dateTimeZone20 = chronology19.getZone();
        java.lang.String str22 = dateTimeZone20.getName(100L);
        org.joda.time.DateTime dateTime23 = dateTime14.withZoneRetainFields(dateTimeZone20);
        boolean boolean25 = dateTime14.isEqual((-124334351997544L));
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology30);
        org.joda.time.DateTime dateTime33 = dateTime31.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime35 = dateTime33.withMillisOfDay(0);
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 1, periodType37, chronology42);
        org.joda.time.DateTimeField dateTimeField44 = chronology42.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone45 = chronology42.getZone();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours(52);
        org.joda.time.Chronology chronology48 = chronology42.withZone(dateTimeZone47);
        org.joda.time.DateTime dateTime49 = dateTime33.toDateTime(chronology48);
        mutablePeriod13.setPeriod((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime dateTime52 = dateTime33.minusMinutes((-965));
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval58 = mutableInterval57.toInterval();
        org.joda.time.Chronology chronology59 = interval58.getChronology();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) 1, periodType54, chronology59);
        org.joda.time.Chronology chronology61 = chronology59.withUTC();
        org.joda.time.DurationField durationField62 = chronology59.weeks();
        org.joda.time.MutableDateTime mutableDateTime63 = dateTime33.toMutableDateTime(chronology59);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime65 = dateTime33.withMonthOfYear(2147483647);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2147483647 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutablePeriod13);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+97:00" + "'", str22, "+97:00");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(durationField62);
        org.junit.Assert.assertNotNull(mutableDateTime63);
    }

    @Test
    public void test14632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14632");
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
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.Interval interval28 = interval18.withPeriodAfterStart(readablePeriod27);
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.Chronology chronology33 = interval32.getChronology();
        long long34 = interval32.toDurationMillis();
        org.joda.time.Interval interval36 = interval32.withEndMillis((long) (short) 100);
        long long37 = interval32.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval44 = mutableInterval43.toInterval();
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean48 = mutableInterval43.isBefore((org.joda.time.ReadableInterval) mutableInterval47);
        boolean boolean49 = mutableInterval40.contains((org.joda.time.ReadableInterval) mutableInterval47);
        org.joda.time.Weeks weeks50 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval47);
        org.joda.time.ReadableDuration readableDuration51 = null;
        mutableInterval47.setDurationBeforeEnd(readableDuration51);
        org.joda.time.Interval interval53 = interval32.gap((org.joda.time.ReadableInterval) mutableInterval47);
        long long54 = mutableInterval47.getStartMillis();
        mutableInterval47.setInterval(1672531199993L, 22089866400000L);
        org.joda.time.DateTime dateTime58 = mutableInterval47.getEnd();
        boolean boolean59 = interval28.overlaps((org.joda.time.ReadableInterval) mutableInterval47);
        org.joda.time.Duration duration60 = mutableInterval47.toDuration();
        long long61 = duration60.getStandardMinutes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds62 = duration60.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 20417335200");
        } catch (java.lang.ArithmeticException e) {
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
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 53L + "'", long34 == 53L);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 53L + "'", long37 == 53L);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(weeks50);
        org.junit.Assert.assertNull(interval53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 52L + "'", long54 == 52L);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 340288920L + "'", long61 == 340288920L);
    }

    @Test
    public void test14633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14633");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        long long5 = interval3.toDurationMillis();
        org.joda.time.Interval interval7 = interval3.withEndMillis((long) (short) 100);
        long long8 = interval3.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean19 = mutableInterval14.isBefore((org.joda.time.ReadableInterval) mutableInterval18);
        boolean boolean20 = mutableInterval11.contains((org.joda.time.ReadableInterval) mutableInterval18);
        org.joda.time.Weeks weeks21 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval18);
        org.joda.time.ReadableDuration readableDuration22 = null;
        mutableInterval18.setDurationBeforeEnd(readableDuration22);
        org.joda.time.Interval interval24 = interval3.gap((org.joda.time.ReadableInterval) mutableInterval18);
        long long25 = mutableInterval18.getStartMillis();
        org.joda.time.MutableInterval mutableInterval26 = mutableInterval18.copy();
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 1, periodType29, chronology34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) '4', chronology34);
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
        boolean boolean51 = dateTime36.isAfter((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Chronology chronology52 = dateTime36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval65 = mutableInterval64.toInterval();
        org.joda.time.Chronology chronology66 = interval65.getChronology();
        long long67 = interval65.toDurationMillis();
        mutablePeriod61.setPeriod((org.joda.time.ReadableInterval) interval65);
        org.joda.time.DateTime dateTime69 = interval65.getEnd();
        mutableInterval26.setInterval((org.joda.time.ReadableInstant) dateTime36, (org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.DateTime.Property property71 = dateTime36.millisOfSecond();
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 53L + "'", long5 == 53L);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 53L + "'", long8 == 53L);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertNull(interval24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 52L + "'", long25 == 52L);
        org.junit.Assert.assertNotNull(mutableInterval26);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 53L + "'", long67 == 53L);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(property71);
    }

    @Test
    public void test14634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14634");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(6216719587200001L, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone5);
        int int7 = dateTime6.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTime6.getZone();
        int int9 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime dateTime12 = dateTime6.withField(dateTimeFieldType10, 1);
        org.joda.time.Hours hours13 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours14 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours15 = hours13.minus(hours14);
        org.joda.time.Duration duration16 = hours14.toStandardDuration();
        org.joda.time.Duration duration18 = duration16.withMillis((long) (short) 1);
        org.joda.time.DateTime dateTime20 = dateTime6.withDurationAdded((org.joda.time.ReadableDuration) duration18, 50);
        org.joda.time.ReadableDuration readableDuration21 = null;
        boolean boolean22 = duration18.isLongerThan(readableDuration21);
        org.joda.time.Duration duration23 = duration18.toDuration();
        org.joda.time.Duration duration24 = duration23.toDuration();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration24);
    }

    @Test
    public void test14635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14635");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-3599903L), 3L);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval9 = mutableInterval8.toInterval();
        org.joda.time.Chronology chronology10 = interval9.getChronology();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 1, periodType5, chronology10);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) '4', chronology10);
        org.joda.time.ReadablePartial readablePartial13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withFields(readablePartial13);
        org.joda.time.DateTime.Property property15 = dateTime14.millisOfDay();
        org.joda.time.DateTime dateTime17 = dateTime14.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime19 = dateTime14.withCenturyOfEra((int) (short) 1);
        org.joda.time.Hours hours20 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours21 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours22 = hours20.minus(hours21);
        org.joda.time.Duration duration23 = hours21.toStandardDuration();
        org.joda.time.DateTime dateTime24 = dateTime14.plus((org.joda.time.ReadableDuration) duration23);
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 1, periodType27, chronology32);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) '4', chronology32);
        org.joda.time.ReadablePartial readablePartial35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.withFields(readablePartial35);
        org.joda.time.DateTime dateTime38 = dateTime34.plusMillis((int) ' ');
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration23, (org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Hours hours40 = org.joda.time.Hours.MIN_VALUE;
        org.joda.time.PeriodType periodType41 = hours40.getPeriodType();
        org.joda.time.PeriodType periodType42 = hours40.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, (org.joda.time.ReadableInstant) dateTime38, periodType42);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone45);
        int int47 = dateTime46.getDayOfMonth();
        org.joda.time.DateTime dateTime49 = dateTime46.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property50 = dateTime49.dayOfYear();
        int int51 = property50.getMinimumValue();
        java.util.Locale locale52 = null;
        int int53 = property50.getMaximumTextLength(locale52);
        org.joda.time.DateTime dateTime54 = property50.withMinimumValue();
        int int55 = property50.getMaximumValue();
        java.util.Locale locale56 = null;
        int int57 = property50.getMaximumShortTextLength(locale56);
        org.joda.time.DateTime dateTime58 = property50.roundCeilingCopy();
        org.joda.time.Period period60 = org.joda.time.Period.minutes(4200010);
        org.joda.time.Period period62 = period60.withMonths(25915807);
        java.lang.String str63 = period62.toString();
        org.joda.time.DateTime dateTime64 = dateTime58.minus((org.joda.time.ReadablePeriod) period62);
        org.joda.time.Interval interval65 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration2, (org.joda.time.ReadableInstant) dateTime58);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(hours40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 365 + "'", int55 == 365);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "P25915807MT4200010M" + "'", str63, "P25915807MT4200010M");
        org.junit.Assert.assertNotNull(dateTime64);
    }

    @Test
    public void test14636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14636");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean7 = mutableInterval2.isBefore((org.joda.time.ReadableInterval) mutableInterval6);
        mutableInterval6.setEndMillis((long) 887);
        boolean boolean10 = mutableInterval6.isBeforeNow();
        java.lang.String str11 = mutableInterval6.toString();
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-05T00:59:59.999+97:00/1970-01-05T01:00:00.887+97:00" + "'", str11, "1970-01-05T00:59:59.999+97:00/1970-01-05T01:00:00.887+97:00");
    }

    @Test
    public void test14637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14637");
        org.joda.time.Period period3 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType4 = period3.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) '#', 100L, periodType4);
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval9 = mutableInterval8.toInterval();
        org.joda.time.Chronology chronology10 = interval9.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology10.getZone();
        org.joda.time.Period period12 = new org.joda.time.Period(10L, periodType4, chronology10);
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.MutableInterval mutableInterval18 = interval16.toMutableInterval();
        org.joda.time.Interval interval20 = interval16.withEndMillis(53L);
        org.joda.time.Chronology chronology21 = interval16.getChronology();
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean32 = mutableInterval27.isBefore((org.joda.time.ReadableInterval) mutableInterval31);
        boolean boolean33 = mutableInterval24.contains((org.joda.time.ReadableInterval) mutableInterval31);
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        long long39 = interval37.toDurationMillis();
        org.joda.time.Interval interval41 = interval37.withEndMillis((long) (short) 100);
        mutableInterval31.setInterval((org.joda.time.ReadableInterval) interval37);
        boolean boolean43 = mutableInterval31.containsNow();
        boolean boolean44 = interval16.contains((org.joda.time.ReadableInterval) mutableInterval31);
        org.joda.time.PeriodType periodType45 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(periodType45);
        org.joda.time.Period period47 = mutableInterval31.toPeriod(periodType45);
        org.joda.time.MutablePeriod mutablePeriod48 = period47.toMutablePeriod();
        org.joda.time.Period period49 = period12.minus((org.joda.time.ReadablePeriod) mutablePeriod48);
        org.joda.time.Period period50 = mutablePeriod48.toPeriod();
        org.joda.time.Duration duration52 = org.joda.time.Duration.millis((long) 5);
        org.joda.time.Duration duration54 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval59 = mutableInterval58.toInterval();
        org.joda.time.Chronology chronology60 = interval59.getChronology();
        org.joda.time.DateTimeZone dateTimeZone61 = chronology60.getZone();
        java.lang.String str63 = dateTimeZone61.getName(100L);
        org.joda.time.DateTime dateTime64 = dateTime55.withZoneRetainFields(dateTimeZone61);
        int int65 = dateTime64.getMinuteOfDay();
        int int66 = dateTime64.getEra();
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone68);
        org.joda.time.DateTime dateTime70 = dateTime69.withLaterOffsetAtOverlap();
        org.joda.time.Hours hours71 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) dateTime64, (org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.Period period72 = duration54.toPeriodTo((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.Interval interval73 = duration52.toIntervalFrom((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.Duration duration74 = period50.toDurationFrom((org.joda.time.ReadableInstant) dateTime64);
        java.lang.String str75 = duration74.toString();
        long long76 = duration74.getStandardDays();
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(mutableInterval18);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 53L + "'", long39 == 53L);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(mutablePeriod48);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "+97:00" + "'", str63, "+97:00");
        org.junit.Assert.assertNotNull(dateTime64);
// flaky:         org.junit.Assert.assertTrue("'" + int65 + "' != '" + 957 + "'", int65 == 957);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(hours71);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(interval73);
        org.junit.Assert.assertNotNull(duration74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "PT0.053S" + "'", str75, "PT0.053S");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
    }

    @Test
    public void test14638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14638");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        long long5 = interval3.toDurationMillis();
        org.joda.time.Interval interval7 = interval3.withEndMillis((long) (short) 100);
        long long8 = interval3.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean19 = mutableInterval14.isBefore((org.joda.time.ReadableInterval) mutableInterval18);
        boolean boolean20 = mutableInterval11.contains((org.joda.time.ReadableInterval) mutableInterval18);
        org.joda.time.Weeks weeks21 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval18);
        org.joda.time.ReadableDuration readableDuration22 = null;
        mutableInterval18.setDurationBeforeEnd(readableDuration22);
        org.joda.time.Interval interval24 = interval3.gap((org.joda.time.ReadableInterval) mutableInterval18);
        long long25 = mutableInterval18.getStartMillis();
        mutableInterval18.setInterval(1672531199993L, 22089866400000L);
        org.joda.time.DateTime dateTime29 = mutableInterval18.getEnd();
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) 5);
        org.joda.time.Instant instant33 = instant31.plus((-2209338000000L));
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        org.joda.time.Chronology chronology41 = interval40.getChronology();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 1, periodType36, chronology41);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) '4', chronology41);
        org.joda.time.DateTime dateTime45 = dateTime43.withCenturyOfEra(12);
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        org.joda.time.Chronology chronology52 = interval51.getChronology();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 1, periodType47, chronology52);
        org.joda.time.DateTimeField dateTimeField54 = chronology52.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone55 = chronology52.getZone();
        java.lang.String str56 = dateTimeZone55.toString();
        org.joda.time.DateTime dateTime57 = dateTime43.toDateTime(dateTimeZone55);
        org.joda.time.DateTime dateTime58 = dateTime43.toDateTime();
        org.joda.time.DateTime dateTime61 = dateTime43.withDurationAdded(0L, 11);
        boolean boolean62 = instant33.isEqual((org.joda.time.ReadableInstant) dateTime61);
        int int63 = dateTime61.getDayOfWeek();
        boolean boolean64 = mutableInterval18.contains((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.DateTime.Property property65 = dateTime61.weekyear();
        org.joda.time.DateTime dateTime66 = property65.roundHalfEvenCopy();
        java.lang.String str67 = property65.getAsText();
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 53L + "'", long5 == 53L);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 53L + "'", long8 == 53L);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertNull(interval24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 52L + "'", long25 == 52L);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+97:00" + "'", str56, "+97:00");
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "1970" + "'", str67, "1970");
    }

    @Test
    public void test14639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14639");
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.MutableInterval mutableInterval15 = interval13.toMutableInterval();
        org.joda.time.Interval interval17 = interval13.withEndMillis(53L);
        org.joda.time.Chronology chronology18 = interval13.getChronology();
        org.joda.time.Instant instant19 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology20 = instant19.getChronology();
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        org.joda.time.Duration duration26 = interval24.toDuration();
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.Interval interval32 = interval30.toInterval();
        org.joda.time.Duration duration34 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Interval interval35 = interval32.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration34);
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        org.joda.time.Chronology chronology43 = interval42.getChronology();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 1, periodType38, chronology43);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) '4', chronology43);
        org.joda.time.ReadablePartial readablePartial46 = null;
        org.joda.time.DateTime dateTime47 = dateTime45.withFields(readablePartial46);
        org.joda.time.DateTime.Property property48 = dateTime47.millisOfDay();
        org.joda.time.DateTime dateTime50 = dateTime47.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property51 = dateTime47.era();
        org.joda.time.Duration duration53 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime55 = dateTime47.withDurationAdded((org.joda.time.ReadableDuration) duration53, 0);
        long long56 = duration53.getStandardHours();
        org.joda.time.Duration duration57 = duration34.plus((org.joda.time.ReadableDuration) duration53);
        boolean boolean58 = duration26.isLongerThan((org.joda.time.ReadableDuration) duration34);
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval65 = mutableInterval64.toInterval();
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean69 = mutableInterval64.isBefore((org.joda.time.ReadableInterval) mutableInterval68);
        boolean boolean70 = mutableInterval61.contains((org.joda.time.ReadableInterval) mutableInterval68);
        org.joda.time.Period period73 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType74 = period73.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((long) '#', 100L, periodType74);
        org.joda.time.Period period76 = mutableInterval68.toPeriod(periodType74);
        org.joda.time.Period period77 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant19, (org.joda.time.ReadableDuration) duration26, periodType74);
        org.joda.time.Period period78 = interval13.toPeriod(periodType74);
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod(periodType74);
        org.joda.time.MutableInterval mutableInterval82 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval85 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval86 = mutableInterval85.toInterval();
        org.joda.time.MutableInterval mutableInterval89 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean90 = mutableInterval85.isBefore((org.joda.time.ReadableInterval) mutableInterval89);
        boolean boolean91 = mutableInterval82.contains((org.joda.time.ReadableInterval) mutableInterval89);
        org.joda.time.MutableInterval mutableInterval92 = mutableInterval82.copy();
        org.joda.time.Chronology chronology93 = mutableInterval82.getChronology();
        org.joda.time.DurationField durationField94 = chronology93.hours();
        org.joda.time.MutablePeriod mutablePeriod95 = new org.joda.time.MutablePeriod(754885716352L, (long) (-1), periodType74, chronology93);
        org.joda.time.PeriodType periodType96 = periodType74.withMillisRemoved();
        org.joda.time.PeriodType periodType97 = periodType74.withMinutesRemoved();
        org.joda.time.PeriodType periodType98 = periodType97.withSecondsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod99 = new org.joda.time.MutablePeriod(872, 34, (int) (byte) 1, 4200010, 57292988, 25, 349, 57402, periodType98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(mutableInterval15);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(periodType74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(interval86);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(mutableInterval92);
        org.junit.Assert.assertNotNull(chronology93);
        org.junit.Assert.assertNotNull(durationField94);
        org.junit.Assert.assertNotNull(periodType96);
        org.junit.Assert.assertNotNull(periodType97);
        org.junit.Assert.assertNotNull(periodType98);
    }

    @Test
    public void test14640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14640");
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
        org.joda.time.DateTime dateTime16 = dateTime11.withCenturyOfEra((int) (short) 1);
        org.joda.time.Hours hours17 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours18 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours19 = hours17.minus(hours18);
        org.joda.time.Duration duration20 = hours18.toStandardDuration();
        org.joda.time.DateTime dateTime21 = dateTime11.plus((org.joda.time.ReadableDuration) duration20);
        org.joda.time.Duration duration22 = org.joda.time.Duration.ZERO;
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
        int int37 = dateTime34.getDayOfWeek();
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval43 = mutableInterval42.toInterval();
        org.joda.time.Chronology chronology44 = interval43.getChronology();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 1, periodType39, chronology44);
        org.joda.time.DateTimeField dateTimeField46 = chronology44.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone47 = chronology44.getZone();
        org.joda.time.DateTime dateTime48 = dateTime34.withChronology(chronology44);
        org.joda.time.Interval interval49 = duration22.toIntervalTo((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period52 = duration22.toPeriodFrom((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTime.Property property53 = dateTime51.era();
        boolean boolean54 = dateTime51.isBeforeNow();
        org.joda.time.DateTime dateTime55 = dateTime51.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime57 = dateTime55.minus(52L);
        org.joda.time.Interval interval58 = duration20.toIntervalTo((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval65 = mutableInterval64.toInterval();
        org.joda.time.Chronology chronology66 = interval65.getChronology();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) 1, periodType61, chronology66);
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime((long) '4', chronology66);
        org.joda.time.ReadablePartial readablePartial69 = null;
        org.joda.time.DateTime dateTime70 = dateTime68.withFields(readablePartial69);
        org.joda.time.DateTime dateTime72 = dateTime68.plusMillis((int) ' ');
        org.joda.time.DateTime dateTime74 = dateTime68.minusMinutes((int) '#');
        boolean boolean76 = dateTime68.isBefore((long) (-1));
        org.joda.time.DateTime dateTime78 = dateTime68.minusMinutes(59);
        boolean boolean79 = duration20.equals((java.lang.Object) 59);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test14641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14641");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime7 = dateTime5.withYear(0);
        org.joda.time.DateTime.Property property8 = dateTime7.era();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone10);
        int int12 = dateTime11.getSecondOfMinute();
        int int13 = dateTime11.getMillisOfDay();
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
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime11.toMutableDateTime(chronology27);
        org.joda.time.DateTime dateTime32 = dateTime7.toDateTime(chronology27);
        org.joda.time.DurationField durationField33 = chronology27.months();
        org.joda.time.DateTimeField dateTimeField34 = chronology27.secondOfMinute();
        org.joda.time.DurationField durationField35 = chronology27.weeks();
        org.joda.time.DateTimeField dateTimeField36 = chronology27.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField37 = chronology27.clockhourOfHalfday();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3600010 + "'", int13 == 3600010);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3600010 + "'", int17 == 3600010);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
    }

    @Test
    public void test14642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14642");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        org.joda.time.Chronology chronology12 = interval11.getChronology();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 1, periodType7, chronology12);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) '4', chronology12);
        org.joda.time.ReadablePartial readablePartial15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.withFields(readablePartial15);
        org.joda.time.DateTime.Property property17 = dateTime16.millisOfDay();
        org.joda.time.DateTime dateTime18 = dateTime16.withEarlierOffsetAtOverlap();
        int int19 = dateTime16.getDayOfWeek();
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        org.joda.time.Chronology chronology26 = interval25.getChronology();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 1, periodType21, chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone29 = chronology26.getZone();
        org.joda.time.DateTime dateTime30 = dateTime16.withChronology(chronology26);
        org.joda.time.DateTimeField dateTimeField31 = chronology26.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField32 = chronology26.year();
        org.joda.time.DateTimeField dateTimeField33 = chronology26.era();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((-86399948L), (long) 56891755, chronology26);
        org.joda.time.DurationField durationField35 = chronology26.years();
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        long long39 = dateTimeZone37.convertUTCToLocal((long) 3);
        org.joda.time.Chronology chronology40 = chronology26.withZone(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField41 = chronology26.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField42 = chronology26.yearOfEra();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 55, 1960987781434L, periodType2, chronology26);
        int int44 = mutablePeriod43.getDays();
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 349200003L + "'", long39 == 349200003L);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 6 + "'", int44 == 6);
    }

    @Test
    public void test14643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14643");
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
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean29 = mutableInterval24.isBefore((org.joda.time.ReadableInterval) mutableInterval28);
        boolean boolean30 = mutableInterval21.contains((org.joda.time.ReadableInterval) mutableInterval28);
        org.joda.time.Period period31 = mutableInterval21.toPeriod();
        int[] intArray33 = chronology18.get((org.joda.time.ReadablePeriod) period31, (-6380815651200000L));
        org.joda.time.DurationField durationField34 = chronology18.halfdays();
        org.joda.time.DurationField durationField35 = chronology18.millis();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3600010 + "'", int3 == 3600010);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, -10550290, -3, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(durationField35);
    }

    @Test
    public void test14644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14644");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        int int15 = mutablePeriod8.getMillis();
        org.joda.time.MutablePeriod mutablePeriod16 = mutablePeriod8.toMutablePeriod();
        mutablePeriod8.setMillis((int) (byte) 10);
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        long long24 = interval22.toDurationMillis();
        org.joda.time.Interval interval26 = interval22.withEndMillis((long) (short) 100);
        long long27 = interval22.toDurationMillis();
        mutablePeriod8.setPeriod((org.joda.time.ReadableInterval) interval22);
        mutablePeriod8.setMonths(1970);
        mutablePeriod8.setMillis(55);
        org.joda.time.Hours hours33 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours34 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours35 = hours33.minus(hours34);
        org.joda.time.Duration duration36 = hours34.toStandardDuration();
        org.joda.time.Duration duration37 = duration36.toDuration();
        org.joda.time.Duration duration38 = duration37.toDuration();
        org.joda.time.Duration duration41 = duration38.withDurationAdded((-3155695200000L), 19);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        org.joda.time.Chronology chronology49 = interval48.getChronology();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 1, periodType44, chronology49);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) '4', chronology49);
        org.joda.time.ReadablePartial readablePartial52 = null;
        org.joda.time.DateTime dateTime53 = dateTime51.withFields(readablePartial52);
        org.joda.time.DateTime dateTime55 = dateTime51.plusMillis((int) ' ');
        org.joda.time.DateTime dateTime57 = dateTime51.minusMinutes((int) '#');
        boolean boolean59 = dateTime51.isBefore((long) (-1));
        org.joda.time.DateTime dateTime61 = dateTime51.minusMinutes(59);
        org.joda.time.Interval interval62 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration38, (org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.Hours hours64 = org.joda.time.Hours.hours((int) (byte) 100);
        org.joda.time.Hours hours66 = hours64.plus(3600052);
        org.joda.time.Hours hours68 = hours64.minus(11);
        org.joda.time.Duration duration69 = hours64.toStandardDuration();
        org.joda.time.Interval interval70 = interval62.withDurationAfterStart((org.joda.time.ReadableDuration) duration69);
        mutablePeriod8.add((org.joda.time.ReadableDuration) duration69);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P-1D" + "'", str13, "P-1D");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod16);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 53L + "'", long24 == 53L);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 53L + "'", long27 == 53L);
        org.junit.Assert.assertNotNull(hours33);
        org.junit.Assert.assertNotNull(hours34);
        org.junit.Assert.assertNotNull(hours35);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(hours64);
        org.junit.Assert.assertNotNull(hours66);
        org.junit.Assert.assertNotNull(hours68);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertNotNull(interval70);
    }

    @Test
    public void test14645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14645");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekyear((int) (short) 1);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        int int9 = dateTime7.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime7.withYearOfEra((-876582));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -876582 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test14646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14646");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds(27);
        org.junit.Assert.assertNotNull(seconds1);
    }

    @Test
    public void test14647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14647");
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
        org.joda.time.Period period36 = period34.minusHours(1970);
        org.joda.time.Seconds seconds37 = period34.toStandardSeconds();
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
        boolean boolean64 = interval56.contains((long) (-1));
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval68 = mutableInterval67.toInterval();
        org.joda.time.Chronology chronology69 = interval68.getChronology();
        org.joda.time.MutableInterval mutableInterval70 = interval68.toMutableInterval();
        boolean boolean71 = interval56.contains((org.joda.time.ReadableInterval) interval68);
        org.joda.time.Period period72 = interval68.toPeriod();
        org.joda.time.Period period74 = period72.minusHours(1970);
        org.joda.time.Seconds seconds75 = period72.toStandardSeconds();
        org.joda.time.Seconds seconds76 = seconds37.minus(seconds75);
        org.joda.time.Seconds seconds78 = seconds37.multipliedBy(948);
        org.joda.time.Seconds seconds80 = seconds78.minus(11);
        org.joda.time.Seconds seconds82 = seconds78.dividedBy(121);
        org.joda.time.Seconds seconds84 = seconds82.minus(12);
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
        org.junit.Assert.assertNotNull(seconds37);
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
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(interval68);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(mutableInterval70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(seconds75);
        org.junit.Assert.assertNotNull(seconds76);
        org.junit.Assert.assertNotNull(seconds78);
        org.junit.Assert.assertNotNull(seconds80);
        org.junit.Assert.assertNotNull(seconds82);
        org.junit.Assert.assertNotNull(seconds84);
    }

    @Test
    public void test14648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14648");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.MIN_VALUE;
        org.joda.time.Duration duration1 = seconds0.toStandardDuration();
        org.joda.time.Seconds seconds3 = seconds0.dividedBy(1);
        org.joda.time.Seconds seconds5 = seconds0.dividedBy(55);
        org.joda.time.MutablePeriod mutablePeriod6 = seconds0.toMutablePeriod();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
    }

    @Test
    public void test14649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14649");
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        org.joda.time.Chronology chronology9 = interval8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 1, periodType4, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '4', chronology9);
        org.joda.time.ReadablePartial readablePartial12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.withFields(readablePartial12);
        org.joda.time.DateTime.Property property14 = dateTime13.millisOfDay();
        org.joda.time.DateTime dateTime15 = dateTime13.withEarlierOffsetAtOverlap();
        int int16 = dateTime13.getDayOfWeek();
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 1, periodType18, chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone26 = chronology23.getZone();
        org.joda.time.DateTime dateTime27 = dateTime13.withChronology(chronology23);
        int int28 = dateTime27.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        int int30 = dateTime27.get(dateTimeFieldType29);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 1, periodType33, chronology38);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) '4', chronology38);
        org.joda.time.Instant instant41 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        org.joda.time.Chronology chronology49 = interval48.getChronology();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 1, periodType44, chronology49);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) '4', chronology49);
        org.joda.time.ReadablePartial readablePartial52 = null;
        org.joda.time.DateTime dateTime53 = dateTime51.withFields(readablePartial52);
        boolean boolean54 = instant41.isAfter((org.joda.time.ReadableInstant) dateTime51);
        boolean boolean55 = dateTime40.isAfter((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.Chronology chronology56 = dateTime40.getChronology();
        org.joda.time.DateTimeField dateTimeField57 = dateTimeFieldType29.getField(chronology56);
        org.joda.time.Interval interval58 = new org.joda.time.Interval(0L, 30236400000L, chronology56);
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval64 = mutableInterval63.toInterval();
        org.joda.time.Chronology chronology65 = interval64.getChronology();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((long) 1, periodType60, chronology65);
        org.joda.time.DateTimeField dateTimeField67 = chronology65.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone68 = chronology65.getZone();
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forOffsetHours(52);
        org.joda.time.Chronology chronology71 = chronology65.withZone(dateTimeZone70);
        long long74 = dateTimeZone70.adjustOffset((long) 972, false);
        org.joda.time.Chronology chronology75 = chronology56.withZone(dateTimeZone70);
        org.joda.time.DateTimeField dateTimeField76 = chronology56.minuteOfDay();
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1970 + "'", int28 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(instant41);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(dateTimeZone68);
        org.junit.Assert.assertNotNull(dateTimeZone70);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 972L + "'", long74 == 972L);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertNotNull(dateTimeField76);
    }

    @Test
    public void test14650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14650");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        java.util.Locale locale8 = null;
        int int9 = property6.getMaximumTextLength(locale8);
        java.lang.String str10 = property6.getAsText();
        org.joda.time.DateTime dateTime11 = property6.roundHalfCeilingCopy();
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval17 = mutableInterval16.toInterval();
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 1, periodType13, chronology18);
        org.joda.time.DateTimeField dateTimeField20 = chronology18.yearOfCentury();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        org.joda.time.Chronology chronology26 = interval25.getChronology();
        org.joda.time.DateTimeZone dateTimeZone27 = chronology26.getZone();
        java.lang.String str29 = dateTimeZone27.getName(100L);
        org.joda.time.DateTime dateTime30 = dateTime21.withZoneRetainFields(dateTimeZone27);
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.Chronology chronology35 = interval34.getChronology();
        org.joda.time.DateTimeZone dateTimeZone36 = chronology35.getZone();
        java.lang.String str38 = dateTimeZone36.getName(100L);
        org.joda.time.DateTime dateTime39 = dateTime30.withZoneRetainFields(dateTimeZone36);
        org.joda.time.Chronology chronology40 = chronology18.withZone(dateTimeZone36);
        org.joda.time.DateTime dateTime41 = dateTime11.withZoneRetainFields(dateTimeZone36);
        org.joda.time.DateTime.Property property42 = dateTime11.millisOfDay();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "5" + "'", str10, "5");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+97:00" + "'", str29, "+97:00");
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+97:00" + "'", str38, "+97:00");
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property42);
    }

    @Test
    public void test14651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14651");
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
        org.joda.time.DateTime dateTime26 = dateTime11.withEarlierOffsetAtOverlap();
        org.joda.time.Period period27 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType28 = period27.getPeriodType();
        org.joda.time.Period period30 = period27.withMonths((int) (byte) 0);
        org.joda.time.Period period31 = period27.toPeriod();
        org.joda.time.DateTime dateTime33 = dateTime26.withPeriodAdded((org.joda.time.ReadablePeriod) period31, (int) (byte) 0);
        int int34 = dateTime26.getEra();
        org.joda.time.Duration duration36 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval43 = mutableInterval42.toInterval();
        org.joda.time.Chronology chronology44 = interval43.getChronology();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 1, periodType39, chronology44);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) '4', chronology44);
        org.joda.time.ReadablePartial readablePartial47 = null;
        org.joda.time.DateTime dateTime48 = dateTime46.withFields(readablePartial47);
        org.joda.time.DateTime.Property property49 = dateTime48.millisOfDay();
        org.joda.time.DateTime dateTime51 = dateTime48.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property52 = dateTime48.era();
        org.joda.time.Duration duration54 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime56 = dateTime48.withDurationAdded((org.joda.time.ReadableDuration) duration54, 0);
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval63 = mutableInterval62.toInterval();
        org.joda.time.Chronology chronology64 = interval63.getChronology();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((long) 1, periodType59, chronology64);
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) '4', chronology64);
        org.joda.time.ReadablePartial readablePartial67 = null;
        org.joda.time.DateTime dateTime68 = dateTime66.withFields(readablePartial67);
        org.joda.time.DateTime.Property property69 = dateTime68.millisOfDay();
        org.joda.time.DateTime dateTime70 = dateTime68.withEarlierOffsetAtOverlap();
        int int71 = dateTime68.getDayOfWeek();
        org.joda.time.PeriodType periodType73 = null;
        org.joda.time.MutableInterval mutableInterval76 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval77 = mutableInterval76.toInterval();
        org.joda.time.Chronology chronology78 = interval77.getChronology();
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((long) 1, periodType73, chronology78);
        org.joda.time.DateTimeField dateTimeField80 = chronology78.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone81 = chronology78.getZone();
        org.joda.time.DateTime dateTime82 = dateTime68.withChronology(chronology78);
        org.joda.time.DateTimeField dateTimeField83 = chronology78.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField84 = chronology78.year();
        org.joda.time.DateTimeField dateTimeField85 = chronology78.era();
        org.joda.time.DateTime dateTime86 = dateTime56.withChronology(chronology78);
        org.joda.time.Period period87 = duration36.toPeriodTo((org.joda.time.ReadableInstant) dateTime86);
        int int88 = dateTime26.compareTo((org.joda.time.ReadableInstant) dateTime86);
        org.joda.time.LocalDate localDate89 = dateTime86.toLocalDate();
        org.joda.time.DateTime dateTime91 = dateTime86.plus(29908224000021L);
        int int92 = dateTime91.getWeekOfWeekyear();
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
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(interval77);
        org.junit.Assert.assertNotNull(chronology78);
        org.junit.Assert.assertNotNull(dateTimeField80);
        org.junit.Assert.assertNotNull(dateTimeZone81);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(dateTimeField83);
        org.junit.Assert.assertNotNull(dateTimeField84);
        org.junit.Assert.assertNotNull(dateTimeField85);
        org.junit.Assert.assertNotNull(dateTime86);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(localDate89);
        org.junit.Assert.assertNotNull(dateTime91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 40 + "'", int92 == 40);
    }

    @Test
    public void test14652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14652");
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
        org.joda.time.Instant instant41 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        org.joda.time.Chronology chronology49 = interval48.getChronology();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 1, periodType44, chronology49);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) '4', chronology49);
        org.joda.time.ReadablePartial readablePartial52 = null;
        org.joda.time.DateTime dateTime53 = dateTime51.withFields(readablePartial52);
        boolean boolean54 = instant41.isAfter((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.Period period56 = org.joda.time.Period.days((-1));
        org.joda.time.Period period58 = period56.withWeeks((int) 'a');
        org.joda.time.Period period60 = period56.plusMonths((int) (short) -1);
        org.joda.time.Period period62 = period56.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime63 = dateTime51.plus((org.joda.time.ReadablePeriod) period56);
        org.joda.time.PeriodType periodType66 = null;
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval70 = mutableInterval69.toInterval();
        org.joda.time.Chronology chronology71 = interval70.getChronology();
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((long) 1, periodType66, chronology71);
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime((long) '4', chronology71);
        org.joda.time.ReadablePartial readablePartial74 = null;
        org.joda.time.DateTime dateTime75 = dateTime73.withFields(readablePartial74);
        org.joda.time.DateTime.Property property76 = dateTime75.millisOfDay();
        org.joda.time.DateTime dateTime78 = dateTime75.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime80 = dateTime75.withCenturyOfEra((int) (short) 1);
        org.joda.time.Weeks weeks81 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateTime51, (org.joda.time.ReadableInstant) dateTime75);
        org.joda.time.PeriodType periodType82 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period83 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime75, periodType82);
        org.joda.time.DateTime dateTime85 = dateTime75.withMonthOfYear(3);
        org.joda.time.Period period87 = org.joda.time.Period.days((-1));
        org.joda.time.Period period89 = period87.withWeeks((int) 'a');
        org.joda.time.Period period91 = period89.withSeconds(0);
        org.joda.time.ReadableInstant readableInstant92 = null;
        org.joda.time.Duration duration93 = period89.toDurationFrom(readableInstant92);
        org.joda.time.DateTime dateTime94 = dateTime75.minus((org.joda.time.ReadableDuration) duration93);
        org.joda.time.Instant instant95 = dateTime75.toInstant();
        org.joda.time.MutableDateTime mutableDateTime96 = instant95.toMutableDateTime();
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
        org.junit.Assert.assertNotNull(instant41);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(interval70);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(weeks81);
        org.junit.Assert.assertNotNull(periodType82);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertNotNull(period91);
        org.junit.Assert.assertNotNull(duration93);
        org.junit.Assert.assertNotNull(dateTime94);
        org.junit.Assert.assertNotNull(instant95);
        org.junit.Assert.assertNotNull(mutableDateTime96);
    }

    @Test
    public void test14653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14653");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval1 = org.joda.time.MutableInterval.parse("DateTimeField[era]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format requires a '/' separator: DateTimeField[era]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14654");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime9 = property6.addWrapFieldToCopy(1);
        org.joda.time.Period period11 = new org.joda.time.Period(164096150400000L);
        org.joda.time.DateTime dateTime12 = dateTime9.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.DateTime dateTime14 = dateTime9.withHourOfDay(17);
        org.joda.time.DateTime dateTime16 = dateTime14.withEra(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test14655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14655");
        org.joda.time.Period period2 = new org.joda.time.Period((-61315145999903L), 150758810L);
    }

    @Test
    public void test14656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14656");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours1 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours2 = hours0.minus(hours1);
        org.joda.time.Hours hours3 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours4 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours5 = hours3.minus(hours4);
        org.joda.time.Hours hours6 = hours0.minus(hours3);
        org.joda.time.Hours hours7 = org.joda.time.Hours.TWO;
        boolean boolean8 = hours6.isGreaterThan(hours7);
        org.joda.time.Hours hours10 = hours6.multipliedBy(4);
        java.lang.String str11 = hours6.toString();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT0H" + "'", str11, "PT0H");
    }

    @Test
    public void test14657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14657");
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.Chronology chronology5 = interval4.getChronology();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTime dateTime8 = dateTime6.withWeekyear((int) (short) 1);
        org.joda.time.Duration duration9 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 1, periodType12, chronology17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '4', chronology17);
        org.joda.time.ReadablePartial readablePartial20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withFields(readablePartial20);
        org.joda.time.DateTime.Property property22 = dateTime21.millisOfDay();
        org.joda.time.DateTime dateTime23 = dateTime21.withEarlierOffsetAtOverlap();
        int int24 = dateTime21.getDayOfWeek();
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 1, periodType26, chronology31);
        org.joda.time.DateTimeField dateTimeField33 = chronology31.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone34 = chronology31.getZone();
        org.joda.time.DateTime dateTime35 = dateTime21.withChronology(chronology31);
        org.joda.time.Interval interval36 = duration9.toIntervalTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period39 = duration9.toPeriodFrom((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Period period40 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType41 = period40.getPeriodType();
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableDuration) duration9, periodType41);
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) 1, periodType46, chronology51);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) '4', chronology51);
        org.joda.time.ReadablePartial readablePartial54 = null;
        org.joda.time.DateTime dateTime55 = dateTime53.withFields(readablePartial54);
        org.joda.time.DateTime.Property property56 = dateTime55.millisOfDay();
        org.joda.time.DateTime dateTime57 = dateTime55.withEarlierOffsetAtOverlap();
        int int58 = dateTime55.getDayOfWeek();
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval64 = mutableInterval63.toInterval();
        org.joda.time.Chronology chronology65 = interval64.getChronology();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((long) 1, periodType60, chronology65);
        org.joda.time.DateTimeField dateTimeField67 = chronology65.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone68 = chronology65.getZone();
        org.joda.time.DateTime dateTime69 = dateTime55.withChronology(chronology65);
        org.joda.time.Minutes minutes71 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType72 = null;
        int int73 = minutes71.get(durationFieldType72);
        int int75 = minutes71.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod76 = minutes71.toMutablePeriod();
        long long79 = chronology65.add((org.joda.time.ReadablePeriod) mutablePeriod76, (long) '#', (int) (short) 10);
        org.joda.time.Period period80 = duration9.toPeriod(periodType43, chronology65);
        org.joda.time.PeriodType periodType82 = null;
        org.joda.time.MutableInterval mutableInterval85 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval86 = mutableInterval85.toInterval();
        org.joda.time.Chronology chronology87 = interval86.getChronology();
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod((long) 1, periodType82, chronology87);
        org.joda.time.DateTimeField dateTimeField89 = chronology87.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField90 = chronology87.weekOfWeekyear();
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod((long) 'a', periodType43, chronology87);
        org.joda.time.DateTimeField dateTimeField92 = chronology87.secondOfDay();
        java.lang.String str93 = chronology87.toString();
        java.lang.String str94 = chronology87.toString();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(dateTimeZone68);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(minutes71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 10 + "'", int75 == 10);
        org.junit.Assert.assertNotNull(mutablePeriod76);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 6000035L + "'", long79 == 6000035L);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(interval86);
        org.junit.Assert.assertNotNull(chronology87);
        org.junit.Assert.assertNotNull(dateTimeField89);
        org.junit.Assert.assertNotNull(dateTimeField90);
        org.junit.Assert.assertNotNull(dateTimeField92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "ISOChronology[+97:00]" + "'", str93, "ISOChronology[+97:00]");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "ISOChronology[+97:00]" + "'", str94, "ISOChronology[+97:00]");
    }

    @Test
    public void test14658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14658");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(12, 31, 24, 1969);
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean19 = mutableInterval14.isBefore((org.joda.time.ReadableInterval) mutableInterval18);
        boolean boolean20 = mutableInterval11.contains((org.joda.time.ReadableInterval) mutableInterval18);
        org.joda.time.Weeks weeks21 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval18);
        org.joda.time.Weeks weeks23 = weeks21.multipliedBy(0);
        org.joda.time.PeriodType periodType24 = weeks23.getPeriodType();
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
        org.joda.time.DurationField durationField41 = chronology40.months();
        org.joda.time.DurationField durationField42 = chronology40.hours();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(1645454905496L, 1652655600000L, periodType24, chronology40);
        org.joda.time.DateTimeField dateTimeField44 = chronology40.clockhourOfHalfday();
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) 1, periodType46, chronology51);
        org.joda.time.Chronology chronology53 = chronology51.withUTC();
        org.joda.time.DateTimeField dateTimeField54 = chronology51.weekOfWeekyear();
        java.lang.Object obj57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType59 = period58.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod(obj57, periodType59);
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval66 = mutableInterval65.toInterval();
        org.joda.time.Chronology chronology67 = interval66.getChronology();
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((long) 1, periodType62, chronology67);
        org.joda.time.DateTimeField dateTimeField69 = chronology67.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone70 = chronology67.getZone();
        org.joda.time.DateTimeField dateTimeField71 = chronology67.minuteOfHour();
        org.joda.time.Chronology chronology72 = chronology67.withUTC();
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((long) 50, (-10L), periodType59, chronology72);
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone75);
        int int77 = dateTime76.getSecondOfMinute();
        org.joda.time.LocalDate localDate78 = dateTime76.toLocalDate();
        int[] intArray80 = chronology72.get((org.joda.time.ReadablePartial) localDate78, (-6380816000400000L));
        org.joda.time.Chronology chronology81 = localDate78.getChronology();
        java.util.Locale locale83 = null;
        java.lang.String str84 = dateTimeField54.getAsText((org.joda.time.ReadablePartial) localDate78, (-292275054), locale83);
        int int85 = dateTimeField44.getMinimumValue((org.joda.time.ReadablePartial) localDate78);
        org.joda.time.Chronology chronology86 = localDate78.getChronology();
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod((long) 20, chronology86);
        org.joda.time.DurationField durationField88 = chronology86.halfdays();
        org.joda.time.DateTimeField dateTimeField89 = chronology86.millisOfSecond();
        mutablePeriod4.setPeriod((-272648909519999469L), chronology86);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(weeks37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 52L + "'", long38 == 52L);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(dateTimeZone70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(chronology72);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(localDate78);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-200231, 12, 27]");
        org.junit.Assert.assertNotNull(chronology81);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "-292275054" + "'", str84, "-292275054");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertNotNull(chronology86);
        org.junit.Assert.assertNotNull(durationField88);
        org.junit.Assert.assertNotNull(dateTimeField89);
    }

    @Test
    public void test14659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14659");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        int int2 = mutableDateTime1.getMonthOfYear();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test14660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14660");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(665, 57191, 27424250, (int) '4', 170);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14661");
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
        org.joda.time.Duration duration34 = interval30.toDuration();
        org.joda.time.Period period35 = interval30.toPeriod();
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 1, periodType37, chronology42);
        org.joda.time.DateTimeField dateTimeField44 = chronology42.yearOfCentury();
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        org.joda.time.DateTimeZone dateTimeZone51 = chronology50.getZone();
        java.lang.String str53 = dateTimeZone51.getName(100L);
        org.joda.time.DateTime dateTime54 = dateTime45.withZoneRetainFields(dateTimeZone51);
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval58 = mutableInterval57.toInterval();
        org.joda.time.Chronology chronology59 = interval58.getChronology();
        org.joda.time.DateTimeZone dateTimeZone60 = chronology59.getZone();
        java.lang.String str62 = dateTimeZone60.getName(100L);
        org.joda.time.DateTime dateTime63 = dateTime54.withZoneRetainFields(dateTimeZone60);
        org.joda.time.Chronology chronology64 = chronology42.withZone(dateTimeZone60);
        long long68 = chronology64.add((long) 0, (long) 12, (int) '4');
        org.joda.time.DurationField durationField69 = chronology64.seconds();
        int int71 = durationField69.getValue((long) 5897);
        org.joda.time.DurationFieldType durationFieldType72 = durationField69.getType();
        org.joda.time.Period period74 = period35.withField(durationFieldType72, 69790092);
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
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+97:00" + "'", str53, "+97:00");
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "+97:00" + "'", str62, "+97:00");
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 624L + "'", long68 == 624L);
        org.junit.Assert.assertNotNull(durationField69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 5 + "'", int71 == 5);
        org.junit.Assert.assertNotNull(durationFieldType72);
        org.junit.Assert.assertNotNull(period74);
    }

    @Test
    public void test14662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14662");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone5 = chronology4.getZone();
        java.lang.String str7 = dateTimeZone5.getName(100L);
        int int9 = dateTimeZone5.getOffsetFromLocal(45L);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone5.getShortName(1645454964755L, locale11);
        java.util.TimeZone timeZone13 = dateTimeZone5.toTimeZone();
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 349200000 + "'", int9 == 349200000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test14663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14663");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime7 = dateTime5.minus(349200757L);
        java.util.Date date8 = dateTime5.toDate();
        boolean boolean9 = dateTime5.isAfterNow();
        org.joda.time.DateTime dateTime11 = dateTime5.minusWeeks(16);
        org.joda.time.DateTime.Property property12 = dateTime5.dayOfYear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:10:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test14664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14664");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.MutableInterval mutableInterval5 = interval3.toMutableInterval();
        org.joda.time.Interval interval7 = interval3.withEndMillis(53L);
        org.joda.time.Chronology chronology8 = interval3.getChronology();
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean19 = mutableInterval14.isBefore((org.joda.time.ReadableInterval) mutableInterval18);
        boolean boolean20 = mutableInterval11.contains((org.joda.time.ReadableInterval) mutableInterval18);
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        long long26 = interval24.toDurationMillis();
        org.joda.time.Interval interval28 = interval24.withEndMillis((long) (short) 100);
        mutableInterval18.setInterval((org.joda.time.ReadableInterval) interval24);
        boolean boolean30 = mutableInterval18.containsNow();
        boolean boolean31 = interval3.contains((org.joda.time.ReadableInterval) mutableInterval18);
        java.lang.String str32 = mutableInterval18.toString();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period43 = org.joda.time.Period.days((-1));
        org.joda.time.Period period45 = period43.withWeeks((int) 'a');
        java.lang.String str46 = period43.toString();
        mutablePeriod41.setPeriod((org.joda.time.ReadablePeriod) period43);
        int int48 = mutablePeriod41.getMillis();
        org.joda.time.MutablePeriod mutablePeriod49 = mutablePeriod41.toMutablePeriod();
        mutablePeriod49.add((int) '4', (int) (short) 0, (int) (byte) 0, (int) (short) 10, 1, (int) 'a', (int) (short) 100, (int) (short) -1);
        org.joda.time.MutablePeriod mutablePeriod59 = mutablePeriod49.copy();
        org.joda.time.Minutes minutes61 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType62 = null;
        int int63 = minutes61.get(durationFieldType62);
        int int65 = minutes61.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod66 = minutes61.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType68 = minutes61.getFieldType(0);
        org.joda.time.DurationFieldType durationFieldType69 = minutes61.getFieldType();
        mutablePeriod49.set(durationFieldType69, (int) (short) 100);
        org.joda.time.PeriodType periodType76 = null;
        org.joda.time.MutableInterval mutableInterval79 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval80 = mutableInterval79.toInterval();
        org.joda.time.Chronology chronology81 = interval80.getChronology();
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((long) 1, periodType76, chronology81);
        org.joda.time.DateTime dateTime83 = new org.joda.time.DateTime((long) '4', chronology81);
        org.joda.time.DateTime.Property property84 = dateTime83.era();
        int int85 = property84.getLeapAmount();
        org.joda.time.DateTime dateTime86 = property84.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology87 = dateTime86.getChronology();
        mutablePeriod49.setPeriod((-2147483616L), 0L, chronology87);
        mutableInterval18.setChronology(chronology87);
        org.joda.time.DateTimeField dateTimeField90 = chronology87.weekOfWeekyear();
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(mutableInterval5);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 53L + "'", long26 == 53L);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-05T00:59:59.999+97:00/1970-01-05T01:00:00.052+97:00" + "'", str32, "1970-01-05T00:59:59.999+97:00/1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "P-1D" + "'", str46, "P-1D");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod49);
        org.junit.Assert.assertNotNull(mutablePeriod59);
        org.junit.Assert.assertNotNull(minutes61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10 + "'", int65 == 10);
        org.junit.Assert.assertNotNull(mutablePeriod66);
        org.junit.Assert.assertNotNull(durationFieldType68);
        org.junit.Assert.assertNotNull(durationFieldType69);
        org.junit.Assert.assertNotNull(interval80);
        org.junit.Assert.assertNotNull(chronology81);
        org.junit.Assert.assertNotNull(property84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(dateTime86);
        org.junit.Assert.assertNotNull(chronology87);
        org.junit.Assert.assertNotNull(dateTimeField90);
    }

    @Test
    public void test14665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14665");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        mutablePeriod8.addMonths((int) (short) -1);
        mutablePeriod8.clear();
        mutablePeriod8.setMinutes((-948));
        org.joda.time.Period period20 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType21 = period20.getPeriodType();
        org.joda.time.Period period23 = period20.withMonths((int) (byte) 0);
        org.joda.time.Period period25 = period23.plusWeeks(1);
        org.joda.time.Period period27 = period25.minusHours((-3600000));
        org.joda.time.Minutes minutes29 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.Minutes minutes30 = minutes29.negated();
        org.joda.time.Minutes minutes32 = minutes30.multipliedBy((-1));
        org.joda.time.Period period33 = period27.plus((org.joda.time.ReadablePeriod) minutes32);
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period33);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P-1D" + "'", str13, "P-1D");
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertNotNull(period33);
    }

    @Test
    public void test14666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14666");
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
        org.joda.time.Hours hours20 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours21 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours22 = hours20.minus(hours21);
        org.joda.time.Duration duration23 = hours21.toStandardDuration();
        org.joda.time.Duration duration24 = duration17.minus((org.joda.time.ReadableDuration) duration23);
        org.joda.time.Period period25 = duration24.toPeriod();
        org.joda.time.Period period27 = period25.plusHours((int) '4');
        org.joda.time.Period period29 = period25.plusMinutes(56);
        org.joda.time.Period period30 = new org.joda.time.Period((java.lang.Object) period29);
        int int31 = period29.getWeeks();
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test14667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14667");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.MutableInterval mutableInterval5 = interval3.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval9 = mutableInterval8.toInterval();
        org.joda.time.Chronology chronology10 = interval9.getChronology();
        long long11 = interval9.toDurationMillis();
        org.joda.time.Interval interval13 = interval9.withEndMillis((long) (short) 100);
        org.joda.time.Instant instant14 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Instant instant17 = instant14.withDurationAdded(readableDuration15, 10);
        org.joda.time.Interval interval18 = interval13.withEnd((org.joda.time.ReadableInstant) instant14);
        org.joda.time.Interval interval20 = interval18.withEndMillis(0L);
        boolean boolean21 = interval3.abuts((org.joda.time.ReadableInterval) interval20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone23);
        int int25 = dateTime24.getDayOfMonth();
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean36 = mutableInterval31.isBefore((org.joda.time.ReadableInterval) mutableInterval35);
        boolean boolean37 = mutableInterval28.contains((org.joda.time.ReadableInterval) mutableInterval35);
        org.joda.time.Weeks weeks38 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval35);
        org.joda.time.DateTime dateTime39 = dateTime24.plus((org.joda.time.ReadablePeriod) weeks38);
        org.joda.time.DateTime dateTime41 = dateTime24.minusDays((int) (byte) 1);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        org.joda.time.Chronology chronology49 = interval48.getChronology();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 1, periodType44, chronology49);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) '4', chronology49);
        org.joda.time.ReadablePartial readablePartial52 = null;
        org.joda.time.DateTime dateTime53 = dateTime51.withFields(readablePartial52);
        org.joda.time.DateTime.Property property54 = dateTime53.millisOfDay();
        org.joda.time.DateTime dateTime56 = dateTime53.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property57 = dateTime53.era();
        org.joda.time.Duration duration59 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime61 = dateTime53.withDurationAdded((org.joda.time.ReadableDuration) duration59, 0);
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableDuration) duration59);
        long long63 = duration59.getMillis();
        org.joda.time.Duration duration64 = duration59.toDuration();
        org.joda.time.Interval interval65 = interval20.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration64);
        long long66 = interval20.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval72 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval73 = mutableInterval72.toInterval();
        org.joda.time.MutableInterval mutableInterval76 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean77 = mutableInterval72.isBefore((org.joda.time.ReadableInterval) mutableInterval76);
        boolean boolean78 = mutableInterval69.contains((org.joda.time.ReadableInterval) mutableInterval76);
        org.joda.time.Weeks weeks79 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval76);
        long long80 = mutableInterval76.getEndMillis();
        org.joda.time.DateTime dateTime81 = mutableInterval76.getEnd();
        boolean boolean82 = dateTime81.isBeforeNow();
        org.joda.time.DateTime dateTime84 = dateTime81.withMillisOfSecond(94);
        boolean boolean85 = interval20.contains((org.joda.time.ReadableInstant) dateTime81);
        long long86 = interval20.getEndMillis();
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(mutableInterval5);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 53L + "'", long11 == 53L);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(weeks38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 10000L + "'", long63 == 10000L);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertNotNull(interval73);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(weeks79);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 52L + "'", long80 == 52L);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
    }

    @Test
    public void test14668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14668");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType2 = null;
        int int3 = minutes1.get(durationFieldType2);
        java.lang.Object obj4 = null;
        boolean boolean5 = minutes1.equals(obj4);
        org.joda.time.Duration duration6 = minutes1.toStandardDuration();
        org.joda.time.Period period7 = duration6.toPeriod();
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test14669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14669");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime7 = dateTime5.withYear(0);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getHourOfDay();
        boolean boolean11 = dateTime7.isBefore((long) 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14670");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.DateTime.Property property10 = dateTime9.era();
        org.joda.time.DateTime dateTime12 = dateTime9.minusYears((int) '#');
        int int13 = dateTime12.getWeekyear();
        org.joda.time.DateTime.Property property14 = dateTime12.era();
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1935 + "'", int13 == 1935);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test14671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14671");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, periodType1, chronology6);
        long long11 = chronology6.add(52L, 6216719238000000L, (int) (byte) -1);
        org.joda.time.DurationField durationField12 = chronology6.days();
        org.joda.time.DateTimeField dateTimeField13 = chronology6.millisOfSecond();
        long long17 = chronology6.add((-3599903L), 99L, 70);
        org.joda.time.DurationField durationField18 = chronology6.seconds();
        org.joda.time.DurationFieldType durationFieldType19 = durationField18.getType();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = durationField18.getValue(31529832501920L, 1645454903993L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 31529832501");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-6216719237999948L) + "'", long11 == (-6216719237999948L));
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-3592973L) + "'", long17 == (-3592973L));
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationFieldType19);
    }

    @Test
    public void test14672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14672");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        int int15 = mutablePeriod8.getMillis();
        org.joda.time.MutablePeriod mutablePeriod16 = mutablePeriod8.toMutablePeriod();
        mutablePeriod8.setMillis((-1));
        org.joda.time.MutablePeriod mutablePeriod19 = mutablePeriod8.copy();
        org.joda.time.Weeks weeks21 = org.joda.time.Weeks.weeks(844);
        org.joda.time.DurationFieldType durationFieldType22 = weeks21.getFieldType();
        int int23 = mutablePeriod8.get(durationFieldType22);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P-1D" + "'", str13, "P-1D");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod16);
        org.junit.Assert.assertNotNull(mutablePeriod19);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test14673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14673");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-464966));
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test14674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14674");
        org.joda.time.Period period1 = org.joda.time.Period.years(757);
        org.joda.time.Hours hours3 = org.joda.time.Hours.hours((int) (byte) 100);
        org.joda.time.Period period4 = period1.withFields((org.joda.time.ReadablePeriod) hours3);
        org.joda.time.Period period6 = period4.minusMonths(779);
        int int7 = period6.getMonths();
        org.joda.time.Period period9 = period6.plusMonths((int) (byte) 1);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 100, (long) 10, periodType12);
        mutablePeriod13.setMonths((int) (byte) -1);
        int int16 = mutablePeriod13.getMinutes();
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
        org.joda.time.DateTime dateTime36 = dateTime31.withCenturyOfEra((int) (short) 1);
        org.joda.time.Hours hours37 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours38 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours39 = hours37.minus(hours38);
        org.joda.time.Duration duration40 = hours38.toStandardDuration();
        org.joda.time.DateTime dateTime41 = dateTime31.plus((org.joda.time.ReadableDuration) duration40);
        org.joda.time.Duration duration42 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration43 = duration42.toDuration();
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        org.joda.time.Chronology chronology48 = interval47.getChronology();
        org.joda.time.DateTimeZone dateTimeZone49 = chronology48.getZone();
        org.joda.time.Period period50 = duration42.toPeriod(chronology48);
        boolean boolean51 = duration40.isShorterThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.PeriodType periodType52 = org.joda.time.PeriodType.days();
        org.joda.time.Period period53 = duration42.toPeriod(periodType52);
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval59 = mutableInterval58.toInterval();
        org.joda.time.Chronology chronology60 = interval59.getChronology();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) 1, periodType55, chronology60);
        org.joda.time.DateTimeField dateTimeField62 = chronology60.yearOfCentury();
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval67 = mutableInterval66.toInterval();
        org.joda.time.Chronology chronology68 = interval67.getChronology();
        org.joda.time.DateTimeZone dateTimeZone69 = chronology68.getZone();
        java.lang.String str71 = dateTimeZone69.getName(100L);
        org.joda.time.DateTime dateTime72 = dateTime63.withZoneRetainFields(dateTimeZone69);
        org.joda.time.MutableInterval mutableInterval75 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval76 = mutableInterval75.toInterval();
        org.joda.time.Chronology chronology77 = interval76.getChronology();
        org.joda.time.DateTimeZone dateTimeZone78 = chronology77.getZone();
        java.lang.String str80 = dateTimeZone78.getName(100L);
        org.joda.time.DateTime dateTime81 = dateTime72.withZoneRetainFields(dateTimeZone78);
        org.joda.time.Chronology chronology82 = chronology60.withZone(dateTimeZone78);
        org.joda.time.Period period83 = new org.joda.time.Period(0L, 10L, periodType52, chronology60);
        mutablePeriod13.setPeriod((-61394288400000L), chronology60);
        int int85 = mutablePeriod13.getYears();
        org.joda.time.DurationFieldType durationFieldType87 = mutablePeriod13.getFieldType((int) (short) 1);
        boolean boolean88 = period9.isSupported(durationFieldType87);
        org.joda.time.Period period89 = period9.normalizedStandard();
        int int90 = period9.getMillis();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-779) + "'", int7 == (-779));
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(hours37);
        org.junit.Assert.assertNotNull(hours38);
        org.junit.Assert.assertNotNull(hours39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "+97:00" + "'", str71, "+97:00");
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(interval76);
        org.junit.Assert.assertNotNull(chronology77);
        org.junit.Assert.assertNotNull(dateTimeZone78);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "+97:00" + "'", str80, "+97:00");
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(chronology82);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(durationFieldType87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
    }

    @Test
    public void test14675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14675");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType5 = periodType4.withMinutesRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter2.withParseType(periodType5);
        java.util.Locale locale7 = periodFormatter6.getLocale();
        boolean boolean8 = periodFormatter6.isPrinter();
        org.joda.time.format.PeriodPrinter periodPrinter9 = periodFormatter6.getPrinter();
        org.joda.time.PeriodType periodType10 = periodFormatter6.getParseType();
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(periodPrinter9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test14676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14676");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 100, (long) 10, periodType2);
        mutablePeriod3.setMonths((int) (byte) -1);
        mutablePeriod3.addMillis(100);
        org.joda.time.Duration duration8 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 1, periodType11, chronology16);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) '4', chronology16);
        org.joda.time.ReadablePartial readablePartial19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.withFields(readablePartial19);
        org.joda.time.DateTime.Property property21 = dateTime20.millisOfDay();
        org.joda.time.DateTime dateTime22 = dateTime20.withEarlierOffsetAtOverlap();
        int int23 = dateTime20.getDayOfWeek();
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 1, periodType25, chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone33 = chronology30.getZone();
        org.joda.time.DateTime dateTime34 = dateTime20.withChronology(chronology30);
        org.joda.time.Interval interval35 = duration8.toIntervalTo((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period38 = duration8.toPeriodFrom((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone40);
        int int42 = dateTime41.getMillisOfDay();
        org.joda.time.DateTime dateTime44 = dateTime41.plusMillis((int) '#');
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        org.joda.time.Chronology chronology52 = interval51.getChronology();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 1, periodType47, chronology52);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) '4', chronology52);
        org.joda.time.DateTime dateTime55 = dateTime44.withChronology(chronology52);
        org.joda.time.Interval interval56 = duration8.toIntervalFrom((org.joda.time.ReadableInstant) dateTime44);
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration8);
        int int58 = mutablePeriod3.getMonths();
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval65 = mutableInterval64.toInterval();
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean69 = mutableInterval64.isBefore((org.joda.time.ReadableInterval) mutableInterval68);
        boolean boolean70 = mutableInterval61.contains((org.joda.time.ReadableInterval) mutableInterval68);
        mutableInterval61.setDurationAfterStart(0L);
        mutablePeriod3.add((org.joda.time.ReadableInterval) mutableInterval61);
        mutablePeriod3.setMillis(8);
        int int76 = mutablePeriod3.getMillis();
        mutablePeriod3.addDays((-5));
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3600010 + "'", int42 == 3600010);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 8 + "'", int76 == 8);
    }

    @Test
    public void test14677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14677");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.DateTime.Property property10 = dateTime9.era();
        int int11 = property10.getLeapAmount();
        org.joda.time.DateTime dateTime12 = property10.roundHalfCeilingCopy();
        java.lang.String str13 = property10.toString();
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Property[era]" + "'", str13, "Property[era]");
    }

    @Test
    public void test14678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14678");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodPrinter periodPrinter3 = periodFormatter2.getPrinter();
        org.joda.time.PeriodType periodType4 = periodFormatter2.getParseType();
        org.joda.time.PeriodType periodType5 = periodFormatter2.getParseType();
        org.joda.time.format.PeriodPrinter periodPrinter6 = periodFormatter2.getPrinter();
        org.joda.time.format.PeriodPrinter periodPrinter7 = periodFormatter2.getPrinter();
        org.joda.time.PeriodType periodType8 = periodFormatter2.getParseType();
        org.joda.time.format.PeriodPrinter periodPrinter11 = null;
        org.joda.time.format.PeriodParser periodParser12 = null;
        org.joda.time.format.PeriodFormatter periodFormatter13 = new org.joda.time.format.PeriodFormatter(periodPrinter11, periodParser12);
        org.joda.time.format.PeriodParser periodParser14 = periodFormatter13.getParser();
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType16 = periodType15.withMinutesRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter13.withParseType(periodType16);
        org.joda.time.PeriodType periodType18 = periodType16.withWeeksRemoved();
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        org.joda.time.Chronology chronology26 = interval25.getChronology();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 1, periodType21, chronology26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) '4', chronology26);
        org.joda.time.ReadablePartial readablePartial29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.withFields(readablePartial29);
        org.joda.time.DateTime dateTime32 = dateTime28.plusMillis((int) ' ');
        org.joda.time.DateTime dateTime34 = dateTime28.minusMinutes((int) '#');
        boolean boolean36 = dateTime28.isBefore((long) (-1));
        org.joda.time.Chronology chronology37 = dateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.weekyearOfCentury();
        org.joda.time.DurationField durationField39 = chronology37.minutes();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(31885200000L, 15L, periodType16, chronology37);
        java.lang.String str41 = periodType16.getName();
        org.joda.time.format.PeriodFormatter periodFormatter42 = periodFormatter2.withParseType(periodType16);
        org.junit.Assert.assertNull(periodPrinter3);
        org.junit.Assert.assertNull(periodType4);
        org.junit.Assert.assertNull(periodType5);
        org.junit.Assert.assertNull(periodPrinter6);
        org.junit.Assert.assertNull(periodPrinter7);
        org.junit.Assert.assertNull(periodType8);
        org.junit.Assert.assertNull(periodParser14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Weeks" + "'", str41, "Weeks");
        org.junit.Assert.assertNotNull(periodFormatter42);
    }

    @Test
    public void test14679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14679");
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
        org.joda.time.DateTime dateTime17 = dateTime15.withWeekyear((int) (short) 100);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((java.lang.Object) dateTime15);
        org.joda.time.DateTime.Property property19 = dateTime15.dayOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = dateTime15.toString(dateTimeFormatter20);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        org.joda.time.Chronology chronology29 = interval28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 1, periodType24, chronology29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) '4', chronology29);
        org.joda.time.ReadablePartial readablePartial32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.withFields(readablePartial32);
        org.joda.time.DateTime.Property property34 = dateTime33.millisOfDay();
        org.joda.time.DateTime dateTime35 = dateTime33.withEarlierOffsetAtOverlap();
        int int36 = dateTime33.getDayOfWeek();
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        org.joda.time.Chronology chronology43 = interval42.getChronology();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 1, periodType38, chronology43);
        org.joda.time.DateTimeField dateTimeField45 = chronology43.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone46 = chronology43.getZone();
        org.joda.time.DateTime dateTime47 = dateTime33.withChronology(chronology43);
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.Chronology chronology55 = interval54.getChronology();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) 1, periodType50, chronology55);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) '4', chronology55);
        org.joda.time.Instant instant58 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval65 = mutableInterval64.toInterval();
        org.joda.time.Chronology chronology66 = interval65.getChronology();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) 1, periodType61, chronology66);
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime((long) '4', chronology66);
        org.joda.time.ReadablePartial readablePartial69 = null;
        org.joda.time.DateTime dateTime70 = dateTime68.withFields(readablePartial69);
        boolean boolean71 = instant58.isAfter((org.joda.time.ReadableInstant) dateTime68);
        boolean boolean72 = dateTime57.isAfter((org.joda.time.ReadableInstant) dateTime68);
        java.lang.String str73 = dateTime57.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType75 = dateTimeFieldType74.getRangeDurationType();
        int int76 = dateTime57.get(dateTimeFieldType74);
        boolean boolean77 = dateTime57.isBeforeNow();
        org.joda.time.DateTime dateTime78 = dateTime57.toDateTimeISO();
        org.joda.time.DateMidnight dateMidnight79 = dateTime78.toDateMidnight();
        boolean boolean80 = dateTime33.isAfter((org.joda.time.ReadableInstant) dateTime78);
        org.joda.time.DateTime dateTime82 = dateTime33.minusWeeks(3600010);
        org.joda.time.DateTime dateTime84 = dateTime33.minusWeeks(94);
        org.joda.time.DateTime dateTime86 = dateTime84.plusMonths((int) ' ');
        org.joda.time.DateTime.Property property87 = dateTime86.minuteOfDay();
        boolean boolean88 = dateTime15.isBefore((org.joda.time.ReadableInstant) dateTime86);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-11T01:00:00.052+97:00" + "'", str21, "1970-01-11T01:00:00.052+97:00");
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(instant58);
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "1970-01-05T01:00:00.052+97:00" + "'", str73, "1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertNotNull(dateTimeFieldType74);
        org.junit.Assert.assertNotNull(durationFieldType75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2 + "'", int76 == 2);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(dateMidnight79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(dateTime86);
        org.junit.Assert.assertNotNull(property87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test14680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14680");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone2);
        int int4 = dateTime3.getSecondOfMinute();
        org.joda.time.DateTime dateTime6 = dateTime3.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime8 = dateTime6.minus(349200757L);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.DateTime dateTime13 = dateTime6.withZone(dateTimeZone11);
        long long15 = dateTimeZone11.nextTransition(221064524946L);
        boolean boolean17 = dateTimeZone11.isStandardOffset(25245561600000L);
        boolean boolean19 = dateTimeZone11.isStandardOffset(1645455044546L);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((-604800000L), dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 221064524946L + "'", long15 == 221064524946L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test14681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14681");
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.DurationField durationField11 = chronology8.centuries();
        org.joda.time.DurationField durationField12 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.dayOfMonth();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) (-284256000), chronology8);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test14682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14682");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes((-292275054));
        org.joda.time.Minutes minutes3 = minutes1.dividedBy(3938);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(minutes3);
    }

    @Test
    public void test14683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14683");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone4 = dateTime2.getZone();
        long long6 = dateTimeZone4.convertUTCToLocal((long) 0);
        int int8 = dateTimeZone4.getOffset((long) (short) 0);
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval12 = mutableInterval11.toInterval();
        org.joda.time.Chronology chronology13 = interval12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone14 = chronology13.getZone();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        long long17 = dateTimeZone4.getMillisKeepLocal(dateTimeZone14, (long) 1970);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 349200000L + "'", long6 == 349200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1970L + "'", long17 == 1970L);
    }

    @Test
    public void test14684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14684");
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
        org.joda.time.Period period18 = mutableInterval9.toPeriod();
        org.joda.time.Period period20 = period18.minusHours(15);
        org.joda.time.Hours hours21 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours22 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours23 = hours21.minus(hours22);
        org.joda.time.Duration duration24 = hours22.toStandardDuration();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone26);
        int int28 = dateTime27.getMillisOfDay();
        org.joda.time.DateTime dateTime30 = dateTime27.plusMillis((int) '#');
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 1, periodType33, chronology38);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) '4', chronology38);
        org.joda.time.DateTime dateTime41 = dateTime30.withChronology(chronology38);
        boolean boolean43 = dateTime41.isEqual(187200000L);
        org.joda.time.Interval interval44 = duration24.toIntervalFrom((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone46);
        int int48 = dateTime47.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone49 = dateTime47.getZone();
        long long52 = dateTimeZone49.convertLocalToUTC(0L, true);
        org.joda.time.DateTime dateTime53 = dateTime41.withZoneRetainFields(dateTimeZone49);
        org.joda.time.DateTime dateTime55 = dateTime53.minusWeeks(4);
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval59 = mutableInterval58.toInterval();
        org.joda.time.Chronology chronology60 = interval59.getChronology();
        org.joda.time.Interval interval61 = interval59.toInterval();
        org.joda.time.Duration duration63 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Interval interval64 = interval61.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration63);
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.MutableInterval mutableInterval76 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval77 = mutableInterval76.toInterval();
        org.joda.time.Chronology chronology78 = interval77.getChronology();
        long long79 = interval77.toDurationMillis();
        mutablePeriod73.setPeriod((org.joda.time.ReadableInterval) interval77);
        boolean boolean81 = interval61.isBefore((org.joda.time.ReadableInterval) interval77);
        org.joda.time.Interval interval82 = interval77.toInterval();
        org.joda.time.Duration duration83 = interval82.toDuration();
        org.joda.time.DateTime dateTime84 = dateTime53.plus((org.joda.time.ReadableDuration) duration83);
        org.joda.time.Duration duration85 = period18.toDurationFrom((org.joda.time.ReadableInstant) dateTime53);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3600010 + "'", int28 == 3600010);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 5 + "'", int48 == 5);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-349200000L) + "'", long52 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(interval77);
        org.junit.Assert.assertNotNull(chronology78);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 53L + "'", long79 == 53L);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(interval82);
        org.junit.Assert.assertNotNull(duration83);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(duration85);
    }

    @Test
    public void test14685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14685");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Chronology chronology13 = mutableInterval9.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.era();
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 1, periodType19, chronology24);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) '4', chronology24);
        org.joda.time.Instant instant27 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.Chronology chronology35 = interval34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 1, periodType30, chronology35);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) '4', chronology35);
        org.joda.time.ReadablePartial readablePartial38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.withFields(readablePartial38);
        boolean boolean40 = instant27.isAfter((org.joda.time.ReadableInstant) dateTime37);
        boolean boolean41 = dateTime26.isAfter((org.joda.time.ReadableInstant) dateTime37);
        java.lang.String str42 = dateTime26.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType44 = dateTimeFieldType43.getRangeDurationType();
        int int45 = dateTime26.get(dateTimeFieldType43);
        boolean boolean46 = dateTime26.isBeforeNow();
        org.joda.time.DateTime dateTime47 = dateTime26.toDateTimeISO();
        org.joda.time.DateTime dateTime49 = dateTime26.withYear(947);
        org.joda.time.YearMonthDay yearMonthDay50 = dateTime49.toYearMonthDay();
        int[] intArray52 = chronology13.get((org.joda.time.ReadablePartial) yearMonthDay50, 1726866623L);
        int int53 = yearMonthDay50.size();
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1970-01-05T01:00:00.052+97:00" + "'", str42, "1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(yearMonthDay50);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1970, 1, 25]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
    }

    @Test
    public void test14686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14686");
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
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean45 = mutableInterval40.isBefore((org.joda.time.ReadableInterval) mutableInterval44);
        boolean boolean46 = mutableInterval37.contains((org.joda.time.ReadableInterval) mutableInterval44);
        org.joda.time.MutableInterval mutableInterval47 = mutableInterval37.copy();
        boolean boolean48 = interval30.contains((org.joda.time.ReadableInterval) mutableInterval37);
        org.joda.time.MutableInterval mutableInterval49 = mutableInterval37.copy();
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval53 = mutableInterval52.toInterval();
        org.joda.time.Chronology chronology54 = interval53.getChronology();
        long long55 = interval53.toDurationMillis();
        org.joda.time.Interval interval57 = interval53.withEndMillis((long) (short) 100);
        org.joda.time.Instant instant58 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.Instant instant61 = instant58.withDurationAdded(readableDuration59, 10);
        org.joda.time.Interval interval62 = interval57.withEnd((org.joda.time.ReadableInstant) instant58);
        boolean boolean63 = mutableInterval49.isBefore((org.joda.time.ReadableInterval) interval62);
        org.joda.time.Period period67 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType68 = period67.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) '#', 100L, periodType68);
        org.joda.time.MutableInterval mutableInterval72 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval73 = mutableInterval72.toInterval();
        org.joda.time.Chronology chronology74 = interval73.getChronology();
        org.joda.time.DateTimeZone dateTimeZone75 = chronology74.getZone();
        org.joda.time.Period period76 = new org.joda.time.Period(10L, periodType68, chronology74);
        org.joda.time.PeriodType periodType77 = period76.getPeriodType();
        org.joda.time.PeriodType periodType78 = periodType77.withYearsRemoved();
        org.joda.time.PeriodType periodType79 = periodType78.withMonthsRemoved();
        org.joda.time.Period period80 = mutableInterval49.toPeriod(periodType79);
        org.joda.time.Period period81 = period80.normalizedStandard();
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
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(mutableInterval47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(mutableInterval49);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 53L + "'", long55 == 53L);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(instant58);
        org.junit.Assert.assertNotNull(instant61);
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertNotNull(interval73);
        org.junit.Assert.assertNotNull(chronology74);
        org.junit.Assert.assertNotNull(dateTimeZone75);
        org.junit.Assert.assertNotNull(periodType77);
        org.junit.Assert.assertNotNull(periodType78);
        org.junit.Assert.assertNotNull(periodType79);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(period81);
    }

    @Test
    public void test14687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14687");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval10 = mutableInterval9.toInterval();
        org.joda.time.Chronology chronology11 = interval10.getChronology();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 1, periodType6, chronology11);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) '4', chronology11);
        org.joda.time.ReadablePartial readablePartial14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.withFields(readablePartial14);
        org.joda.time.DateTime.Property property16 = dateTime13.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime13.getZone();
        org.joda.time.DateTime dateTime19 = dateTime13.minusYears((int) '#');
        boolean boolean20 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime22 = dateTime2.plusMillis(365);
        org.joda.time.Duration duration24 = new org.joda.time.Duration((long) 19);
        org.joda.time.Interval interval25 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableDuration) duration24);
        org.joda.time.Hours hours26 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours27 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours28 = hours26.minus(hours27);
        org.joda.time.Duration duration29 = hours27.toStandardDuration();
        org.joda.time.Duration duration30 = duration29.toDuration();
        org.joda.time.Duration duration31 = duration30.toDuration();
        org.joda.time.Duration duration34 = duration31.withDurationAdded((-3155695200000L), 19);
        org.joda.time.Duration duration36 = duration34.plus(8640000000L);
        boolean boolean37 = duration24.isLongerThan((org.joda.time.ReadableDuration) duration36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(hours27);
        org.junit.Assert.assertNotNull(hours28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test14688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14688");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        long long5 = interval3.toDurationMillis();
        boolean boolean7 = interval3.isAfter((long) (short) 10);
        org.joda.time.Period period8 = interval3.toPeriod();
        org.joda.time.DateTime dateTime9 = interval3.getStart();
        boolean boolean10 = dateTime9.isAfterNow();
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 53L + "'", long5 == 53L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test14689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14689");
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
        org.joda.time.DateTime.Property property29 = dateTime25.monthOfYear();
        org.joda.time.ReadablePartial readablePartial30 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = property29.compareTo(readablePartial30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(property29);
    }

    @Test
    public void test14690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14690");
        org.joda.time.Period period1 = new org.joda.time.Period(6216719587200001L);
    }

    @Test
    public void test14691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14691");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter3.withLocale(locale4);
        org.joda.time.Days days6 = org.joda.time.Days.FOUR;
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean17 = mutableInterval12.isBefore((org.joda.time.ReadableInterval) mutableInterval16);
        boolean boolean18 = mutableInterval9.contains((org.joda.time.ReadableInterval) mutableInterval16);
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        long long24 = interval22.toDurationMillis();
        org.joda.time.Interval interval26 = interval22.withEndMillis((long) (short) 100);
        mutableInterval16.setInterval((org.joda.time.ReadableInterval) interval22);
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        long long33 = interval31.toDurationMillis();
        boolean boolean34 = interval22.isAfter((org.joda.time.ReadableInterval) interval31);
        org.joda.time.Interval interval36 = interval22.withEndMillis(100L);
        org.joda.time.Days days37 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval36);
        org.joda.time.Days days38 = days6.plus(days37);
        org.joda.time.PeriodType periodType39 = days38.getPeriodType();
        org.joda.time.PeriodType periodType40 = periodType39.withYearsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter41 = periodFormatter3.withParseType(periodType39);
        org.joda.time.Period period42 = new org.joda.time.Period((-2012L), periodType39);
        org.joda.time.PeriodType periodType43 = periodType39.withMillisRemoved();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        java.lang.String str45 = dateTimeFieldType44.toString();
        java.lang.String str46 = dateTimeFieldType44.toString();
        org.joda.time.DurationFieldType durationFieldType47 = dateTimeFieldType44.getRangeDurationType();
        int int48 = periodType43.indexOf(durationFieldType47);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 53L + "'", long24 == 53L);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 53L + "'", long33 == 53L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(days37);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodFormatter41);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "halfdayOfDay" + "'", str45, "halfdayOfDay");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "halfdayOfDay" + "'", str46, "halfdayOfDay");
        org.junit.Assert.assertNotNull(durationFieldType47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test14692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14692");
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
        long long20 = duration17.getStandardHours();
        org.joda.time.Duration duration23 = new org.joda.time.Duration(349200000L, (long) 50);
        boolean boolean24 = duration17.isLongerThan((org.joda.time.ReadableDuration) duration23);
        long long25 = duration17.getStandardMinutes();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone27);
        int int29 = dateTime28.getMillisOfDay();
        org.joda.time.DateTime dateTime31 = dateTime28.plusMillis((int) '#');
        int int32 = dateTime28.getYearOfEra();
        org.joda.time.DateTime.Property property33 = dateTime28.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone35);
        int int37 = dateTime36.getSecondOfMinute();
        org.joda.time.LocalDate localDate38 = dateTime36.toLocalDate();
        org.joda.time.DateTime dateTime39 = dateTime28.withFields((org.joda.time.ReadablePartial) localDate38);
        org.joda.time.DateTime.Property property40 = dateTime39.dayOfYear();
        org.joda.time.Interval interval41 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration17, (org.joda.time.ReadableInstant) dateTime39);
        int int42 = dateTime39.getWeekyear();
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval46 = mutableInterval45.toInterval();
        org.joda.time.Chronology chronology47 = interval46.getChronology();
        org.joda.time.DateTimeZone dateTimeZone48 = chronology47.getZone();
        org.joda.time.DateTime dateTime49 = dateTime39.toDateTime(dateTimeZone48);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3600010 + "'", int29 == 3600010);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1970 + "'", int32 == 1970);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1970 + "'", int42 == 1970);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(dateTime49);
    }

    @Test
    public void test14693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14693");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
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
        org.joda.time.Interval interval27 = duration0.toIntervalTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period30 = duration0.toPeriodFrom((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Duration duration31 = duration0.toDuration();
        org.joda.time.Instant instant32 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology33 = instant32.getChronology();
        org.joda.time.Instant instant36 = instant32.withDurationAdded((long) 24, 23);
        org.joda.time.Duration duration39 = new org.joda.time.Duration(86400007L, 0L);
        org.joda.time.Instant instant41 = instant36.withDurationAdded((org.joda.time.ReadableDuration) duration39, 2022);
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration31, (org.joda.time.ReadableInstant) instant41);
        boolean boolean44 = mutableInterval42.isAfter(7199948L);
        org.junit.Assert.assertNotNull(duration0);
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
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertNotNull(instant41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test14694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14694");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1970);
        boolean boolean2 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertLocalToUTC(1645454930557L, true, (long) 3);
        long long8 = dateTimeZone1.nextTransition((-19085423181075054L));
        java.lang.String str10 = dateTimeZone1.getName(349200002L);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.Instant instant14 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 1, periodType17, chronology22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) '4', chronology22);
        org.joda.time.ReadablePartial readablePartial25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.withFields(readablePartial25);
        boolean boolean27 = instant14.isAfter((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime.Property property28 = dateTime24.dayOfWeek();
        boolean boolean29 = dateTimeZone13.equals((java.lang.Object) dateTime24);
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.Chronology chronology37 = interval36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 1, periodType32, chronology37);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) '4', chronology37);
        org.joda.time.ReadablePartial readablePartial40 = null;
        org.joda.time.DateTime dateTime41 = dateTime39.withFields(readablePartial40);
        org.joda.time.DateTime.Property property42 = dateTime41.millisOfDay();
        org.joda.time.DateTime dateTime43 = dateTime41.withEarlierOffsetAtOverlap();
        int int44 = dateTime41.getDayOfWeek();
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) 1, periodType46, chronology51);
        org.joda.time.DateTimeField dateTimeField53 = chronology51.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone54 = chronology51.getZone();
        org.joda.time.DateTime dateTime55 = dateTime41.withChronology(chronology51);
        org.joda.time.Minutes minutes57 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType58 = null;
        int int59 = minutes57.get(durationFieldType58);
        int int61 = minutes57.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod62 = minutes57.toMutablePeriod();
        long long65 = chronology51.add((org.joda.time.ReadablePeriod) mutablePeriod62, (long) '#', (int) (short) 10);
        org.joda.time.Period period66 = mutablePeriod62.toPeriod();
        boolean boolean67 = dateTimeZone13.equals((java.lang.Object) mutablePeriod62);
        java.lang.String str69 = dateTimeZone13.getShortName(30236400000L);
        long long71 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, 1645455082846L);
        int int73 = dateTimeZone13.getOffsetFromLocal(1609728748462L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645454928587L + "'", long6 == 1645454928587L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-19085423181075054L) + "'", long8 == (-19085423181075054L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:01.970" + "'", str10, "+00:00:01.970");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(minutes57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
        org.junit.Assert.assertNotNull(mutablePeriod62);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 6000035L + "'", long65 == 6000035L);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "+97:00" + "'", str69, "+97:00");
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 1645105884816L + "'", long71 == 1645105884816L);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 349200000 + "'", int73 == 349200000);
    }

    @Test
    public void test14695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14695");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        mutablePeriod8.setYears(0);
        mutablePeriod8.add((long) 4);
        mutablePeriod8.setYears((int) (byte) 0);
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval27 = mutableInterval26.toInterval();
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean31 = mutableInterval26.isBefore((org.joda.time.ReadableInterval) mutableInterval30);
        boolean boolean32 = mutableInterval23.contains((org.joda.time.ReadableInterval) mutableInterval30);
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.Chronology chronology37 = interval36.getChronology();
        long long38 = interval36.toDurationMillis();
        org.joda.time.Interval interval40 = interval36.withEndMillis((long) (short) 100);
        mutableInterval30.setInterval((org.joda.time.ReadableInterval) interval36);
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        org.joda.time.Chronology chronology46 = interval45.getChronology();
        long long47 = interval45.toDurationMillis();
        boolean boolean48 = interval36.isAfter((org.joda.time.ReadableInterval) interval45);
        mutablePeriod8.add((org.joda.time.ReadableInterval) interval45);
        int int50 = mutablePeriod8.getSeconds();
        mutablePeriod8.setPeriod((int) (short) -1, (-71952772), 41, 0, 282, 2032, 1935, 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P-1D" + "'", str13, "P-1D");
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 53L + "'", long38 == 53L);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 53L + "'", long47 == 53L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test14696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14696");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        int int15 = mutablePeriod8.getMillis();
        org.joda.time.MutablePeriod mutablePeriod16 = mutablePeriod8.toMutablePeriod();
        mutablePeriod8.addDays(0);
        mutablePeriod8.add(58000L);
        mutablePeriod8.setPeriod(57339, 16, 88, 23, 3600, 19, 260936, (-51));
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P-1D" + "'", str13, "P-1D");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod16);
    }

    @Test
    public void test14697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14697");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours1 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours2 = hours0.minus(hours1);
        org.joda.time.Duration duration3 = hours1.toStandardDuration();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone5);
        int int7 = dateTime6.getMillisOfDay();
        org.joda.time.DateTime dateTime9 = dateTime6.plusMillis((int) '#');
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 1, periodType12, chronology17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '4', chronology17);
        org.joda.time.DateTime dateTime20 = dateTime9.withChronology(chronology17);
        boolean boolean22 = dateTime20.isEqual(187200000L);
        org.joda.time.Interval interval23 = duration3.toIntervalFrom((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime24 = dateTime20.toDateTime();
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 1, periodType27, chronology32);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) '4', chronology32);
        org.joda.time.ReadablePartial readablePartial35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.withFields(readablePartial35);
        org.joda.time.DateTime.Property property37 = dateTime36.millisOfDay();
        org.joda.time.DateTime dateTime39 = dateTime36.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime41 = dateTime36.withCenturyOfEra((int) (short) 1);
        org.joda.time.Hours hours42 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours43 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours44 = hours42.minus(hours43);
        org.joda.time.Duration duration45 = hours43.toStandardDuration();
        org.joda.time.DateTime dateTime46 = dateTime36.plus((org.joda.time.ReadableDuration) duration45);
        org.joda.time.DateTime.Property property47 = dateTime36.hourOfDay();
        int int48 = dateTime36.getMinuteOfHour();
        java.util.GregorianCalendar gregorianCalendar49 = dateTime36.toGregorianCalendar();
        boolean boolean50 = dateTime20.isBefore((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.TimeOfDay timeOfDay51 = dateTime36.toTimeOfDay();
        org.joda.time.DateTime dateTime53 = dateTime36.withMillisOfDay((int) (short) 0);
        org.joda.time.DateTime.Property property54 = dateTime53.centuryOfEra();
        org.joda.time.Interval interval55 = property54.toInterval();
        org.joda.time.Duration duration56 = interval55.toDuration();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600010 + "'", int7 == 3600010);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(hours42);
        org.junit.Assert.assertNotNull(hours43);
        org.junit.Assert.assertNotNull(hours44);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(gregorianCalendar49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(timeOfDay51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(duration56);
    }

    @Test
    public void test14698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14698");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("0000-12-29T00:58:00.010+97:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"0000-12-29T00:58:00.010+97:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14699");
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
        long long27 = mutableInterval23.getEndMillis();
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean38 = mutableInterval33.isBefore((org.joda.time.ReadableInterval) mutableInterval37);
        boolean boolean39 = mutableInterval30.contains((org.joda.time.ReadableInterval) mutableInterval37);
        org.joda.time.Weeks weeks40 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval37);
        long long41 = mutableInterval37.getEndMillis();
        org.joda.time.DateTime dateTime42 = mutableInterval37.getEnd();
        mutableInterval23.setStart((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.MutableInterval mutableInterval44 = mutableInterval23.copy();
        org.joda.time.Duration duration45 = mutableInterval23.toDuration();
        java.lang.String str46 = mutableInterval23.toString();
        boolean boolean47 = mutableInterval23.containsNow();
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 52L + "'", long27 == 52L);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(weeks40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 52L + "'", long41 == 52L);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(mutableInterval44);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1970-01-05T01:00:00.052+97:00/1970-01-05T01:00:00.052+97:00" + "'", str46, "1970-01-05T01:00:00.052+97:00/1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test14700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14700");
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        org.joda.time.Chronology chronology9 = interval8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 1, periodType4, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '4', chronology9);
        org.joda.time.ReadablePartial readablePartial12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.withFields(readablePartial12);
        org.joda.time.DateTime.Property property14 = dateTime13.millisOfDay();
        org.joda.time.DateTime dateTime15 = dateTime13.withEarlierOffsetAtOverlap();
        int int16 = dateTime13.getDayOfWeek();
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 1, periodType18, chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone26 = chronology23.getZone();
        org.joda.time.DateTime dateTime27 = dateTime13.withChronology(chronology23);
        org.joda.time.DateTimeField dateTimeField28 = chronology23.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField29 = chronology23.year();
        org.joda.time.DateTimeField dateTimeField30 = chronology23.era();
        org.joda.time.Interval interval31 = new org.joda.time.Interval((-86399948L), (long) 56891755, chronology23);
        org.joda.time.DurationField durationField32 = chronology23.years();
        java.util.TimeZone timeZone33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        long long36 = dateTimeZone34.convertUTCToLocal((long) 3);
        org.joda.time.Chronology chronology37 = chronology23.withZone(dateTimeZone34);
        org.joda.time.DurationField durationField38 = chronology37.weeks();
        org.joda.time.DateTimeField dateTimeField39 = chronology37.minuteOfDay();
        long long42 = dateTimeField39.add((-90L), (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            long long45 = dateTimeField39.set(28424995200L, "2022-02-25T15:53:05.725+97:00");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-25T15:53:05.725+97:00\" for minuteOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 349200003L + "'", long36 == 349200003L);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1919910L + "'", long42 == 1919910L);
    }

    @Test
    public void test14701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14701");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) (byte) 100);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test14702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14702");
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
        org.joda.time.DateTime dateTime20 = dateTime9.plusMonths(1);
        org.joda.time.DateTime dateTime22 = dateTime9.minus(0L);
        org.joda.time.DateTime dateTime24 = dateTime9.plusDays(7);
        org.joda.time.DateTime dateTime25 = dateTime24.toDateTimeISO();
        org.joda.time.DateTime dateTime27 = dateTime24.minusMillis((int) (byte) 10);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.Chronology chronology35 = interval34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 1, periodType30, chronology35);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) '4', chronology35);
        org.joda.time.ReadablePartial readablePartial38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.withFields(readablePartial38);
        org.joda.time.DateTime.Property property40 = dateTime39.millisOfDay();
        org.joda.time.DateTime dateTime42 = dateTime39.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property43 = dateTime39.era();
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        org.joda.time.Chronology chronology48 = interval47.getChronology();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(chronology48);
        int int50 = property43.compareTo((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTime.Property property51 = dateTime49.dayOfWeek();
        org.joda.time.DateTime dateTime53 = dateTime49.plusMillis((-90));
        boolean boolean55 = dateTime53.isEqual((long) (-2147483648));
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval63 = mutableInterval62.toInterval();
        org.joda.time.Chronology chronology64 = interval63.getChronology();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((long) 1, periodType59, chronology64);
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) '4', chronology64);
        org.joda.time.ReadablePartial readablePartial67 = null;
        org.joda.time.DateTime dateTime68 = dateTime66.withFields(readablePartial67);
        org.joda.time.DateTime.Property property69 = dateTime68.millisOfDay();
        org.joda.time.DateTime dateTime70 = dateTime68.withEarlierOffsetAtOverlap();
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod(readableDuration56, (org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.YearMonthDay yearMonthDay72 = dateTime68.toYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.lang.String str74 = dateTimeFieldType73.getName();
        int int75 = dateTime68.get(dateTimeFieldType73);
        java.lang.String str76 = dateTimeFieldType73.getName();
        java.lang.String str77 = dateTimeFieldType73.getName();
        org.joda.time.DateTime.Property property78 = dateTime53.property(dateTimeFieldType73);
        boolean boolean79 = dateTime24.isSupported(dateTimeFieldType73);
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
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(yearMonthDay72);
        org.junit.Assert.assertNotNull(dateTimeFieldType73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "weekyearOfCentury" + "'", str74, "weekyearOfCentury");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 70 + "'", int75 == 70);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "weekyearOfCentury" + "'", str76, "weekyearOfCentury");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "weekyearOfCentury" + "'", str77, "weekyearOfCentury");
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test14703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14703");
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
        org.joda.time.DateTimeField dateTimeField26 = chronology21.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField27 = chronology21.year();
        org.joda.time.DurationField durationField28 = chronology21.hours();
        org.joda.time.DateTimeField dateTimeField29 = chronology21.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology21.dayOfMonth();
        org.joda.time.DurationField durationField31 = dateTimeField30.getLeapDurationField();
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
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNull(durationField31);
    }

    @Test
    public void test14704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14704");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime2.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone8);
        int int10 = dateTime9.getDayOfMonth();
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval17 = mutableInterval16.toInterval();
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean21 = mutableInterval16.isBefore((org.joda.time.ReadableInterval) mutableInterval20);
        boolean boolean22 = mutableInterval13.contains((org.joda.time.ReadableInterval) mutableInterval20);
        org.joda.time.Weeks weeks23 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval20);
        org.joda.time.DateTime dateTime24 = dateTime9.plus((org.joda.time.ReadablePeriod) weeks23);
        org.joda.time.DateTime dateTime26 = dateTime9.minusDays((int) (byte) 1);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 1, periodType29, chronology34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) '4', chronology34);
        org.joda.time.ReadablePartial readablePartial37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.withFields(readablePartial37);
        org.joda.time.DateTime.Property property39 = dateTime38.millisOfDay();
        org.joda.time.DateTime dateTime41 = dateTime38.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property42 = dateTime38.era();
        org.joda.time.Duration duration44 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime46 = dateTime38.withDurationAdded((org.joda.time.ReadableDuration) duration44, 0);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableDuration) duration44);
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval53 = mutableInterval52.toInterval();
        org.joda.time.Chronology chronology54 = interval53.getChronology();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) 1, periodType49, chronology54);
        org.joda.time.DateTimeField dateTimeField56 = chronology54.yearOfCentury();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval61 = mutableInterval60.toInterval();
        org.joda.time.Chronology chronology62 = interval61.getChronology();
        org.joda.time.DateTimeZone dateTimeZone63 = chronology62.getZone();
        java.lang.String str65 = dateTimeZone63.getName(100L);
        org.joda.time.DateTime dateTime66 = dateTime57.withZoneRetainFields(dateTimeZone63);
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval70 = mutableInterval69.toInterval();
        org.joda.time.Chronology chronology71 = interval70.getChronology();
        org.joda.time.DateTimeZone dateTimeZone72 = chronology71.getZone();
        java.lang.String str74 = dateTimeZone72.getName(100L);
        org.joda.time.DateTime dateTime75 = dateTime66.withZoneRetainFields(dateTimeZone72);
        org.joda.time.Chronology chronology76 = chronology54.withZone(dateTimeZone72);
        org.joda.time.Period period77 = duration44.toPeriod(chronology76);
        org.joda.time.Period period78 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableDuration) duration44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "+97:00" + "'", str65, "+97:00");
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(interval70);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertNotNull(dateTimeZone72);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "+97:00" + "'", str74, "+97:00");
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(chronology76);
        org.junit.Assert.assertNotNull(period77);
    }

    @Test
    public void test14705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14705");
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
        long long20 = duration17.getStandardHours();
        org.joda.time.Duration duration23 = new org.joda.time.Duration(349200000L, (long) 50);
        boolean boolean24 = duration17.isLongerThan((org.joda.time.ReadableDuration) duration23);
        long long25 = duration17.getStandardMinutes();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone27);
        int int29 = dateTime28.getMillisOfDay();
        org.joda.time.DateTime dateTime31 = dateTime28.plusMillis((int) '#');
        int int32 = dateTime28.getYearOfEra();
        org.joda.time.DateTime.Property property33 = dateTime28.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone35);
        int int37 = dateTime36.getSecondOfMinute();
        org.joda.time.LocalDate localDate38 = dateTime36.toLocalDate();
        org.joda.time.DateTime dateTime39 = dateTime28.withFields((org.joda.time.ReadablePartial) localDate38);
        org.joda.time.DateTime.Property property40 = dateTime39.dayOfYear();
        org.joda.time.Interval interval41 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration17, (org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        org.joda.time.Chronology chronology49 = interval48.getChronology();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 1, periodType44, chronology49);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) '4', chronology49);
        org.joda.time.ReadablePartial readablePartial52 = null;
        org.joda.time.DateTime dateTime53 = dateTime51.withFields(readablePartial52);
        org.joda.time.DateTime.Property property54 = dateTime53.millisOfDay();
        org.joda.time.DateTime dateTime56 = dateTime53.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property57 = dateTime53.era();
        org.joda.time.Duration duration59 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime61 = dateTime53.withDurationAdded((org.joda.time.ReadableDuration) duration59, 0);
        org.joda.time.Hours hours62 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours63 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours64 = hours62.minus(hours63);
        org.joda.time.Duration duration65 = hours63.toStandardDuration();
        org.joda.time.Duration duration66 = duration59.minus((org.joda.time.ReadableDuration) duration65);
        org.joda.time.Hours hours67 = org.joda.time.Hours.MIN_VALUE;
        org.joda.time.PeriodType periodType68 = hours67.getPeriodType();
        org.joda.time.PeriodType periodType69 = hours67.getPeriodType();
        org.joda.time.Period period70 = duration65.toPeriod(periodType69);
        org.joda.time.DateTime dateTime72 = dateTime39.withDurationAdded((org.joda.time.ReadableDuration) duration65, 33);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3600010 + "'", int29 == 3600010);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1970 + "'", int32 == 1970);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(hours62);
        org.junit.Assert.assertNotNull(hours63);
        org.junit.Assert.assertNotNull(hours64);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(hours67);
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertNotNull(periodType69);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(dateTime72);
    }

    @Test
    public void test14706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14706");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        long long5 = interval3.toDurationMillis();
        org.joda.time.Interval interval7 = interval3.withEndMillis((long) (short) 100);
        boolean boolean9 = interval3.isBefore((long) 1970);
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
        org.joda.time.Period period25 = org.joda.time.Period.days((-1));
        org.joda.time.Period period27 = period25.withWeeks((int) 'a');
        org.joda.time.Period period29 = period25.plusMonths((int) (short) -1);
        org.joda.time.Period period31 = period25.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime32 = dateTime20.plus((org.joda.time.ReadablePeriod) period25);
        org.joda.time.DateTime dateTime34 = dateTime20.plusMinutes(3600010);
        org.joda.time.Period period36 = org.joda.time.Period.days((-1));
        org.joda.time.Period period38 = period36.withWeeks((int) 'a');
        org.joda.time.DateTime dateTime39 = dateTime34.plus((org.joda.time.ReadablePeriod) period38);
        boolean boolean40 = interval3.equals((java.lang.Object) dateTime39);
        org.joda.time.Period period41 = interval3.toPeriod();
        long long42 = interval3.getStartMillis();
        org.joda.time.Days days44 = org.joda.time.Days.days((int) (byte) 100);
        org.joda.time.Interval interval45 = interval3.withPeriodAfterStart((org.joda.time.ReadablePeriod) days44);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 53L + "'", long5 == 53L);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertNotNull(days44);
        org.junit.Assert.assertNotNull(interval45);
    }

    @Test
    public void test14707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14707");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType3 = periodType2.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((-10L));
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval12 = mutableInterval11.toInterval();
        org.joda.time.Chronology chronology13 = interval12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 1, periodType8, chronology13);
        org.joda.time.Chronology chronology15 = chronology13.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.halfdayOfDay();
        mutablePeriod5.add((long) (-1036799773), chronology15);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(1154984486400032L, 1645657200000L, periodType3, chronology15);
        org.joda.time.DurationField durationField20 = chronology15.halfdays();
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test14708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14708");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(55);
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = chronology6.getZone();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval12 = mutableInterval11.toInterval();
        org.joda.time.Chronology chronology13 = interval12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone14 = chronology13.getZone();
        java.lang.String str16 = dateTimeZone14.getName(100L);
        org.joda.time.DateTime dateTime17 = dateTime8.withZoneRetainFields(dateTimeZone14);
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.DateTimeZone dateTimeZone23 = chronology22.getZone();
        java.lang.String str25 = dateTimeZone23.getName(100L);
        org.joda.time.DateTime dateTime26 = dateTime17.withZoneRetainFields(dateTimeZone23);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        long long29 = dateTimeZone7.getMillisKeepLocal(dateTimeZone23, (long) 11);
        java.lang.String str30 = dateTimeZone23.toString();
        org.joda.time.Hours hours31 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours32 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours33 = hours31.minus(hours32);
        org.joda.time.Duration duration34 = hours32.toStandardDuration();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone36);
        int int38 = dateTime37.getMillisOfDay();
        org.joda.time.DateTime dateTime40 = dateTime37.plusMillis((int) '#');
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        org.joda.time.Chronology chronology48 = interval47.getChronology();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) 1, periodType43, chronology48);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) '4', chronology48);
        org.joda.time.DateTime dateTime51 = dateTime40.withChronology(chronology48);
        boolean boolean53 = dateTime51.isEqual(187200000L);
        org.joda.time.Interval interval54 = duration34.toIntervalFrom((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone56);
        int int58 = dateTime57.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone59 = dateTime57.getZone();
        long long62 = dateTimeZone59.convertLocalToUTC(0L, true);
        org.joda.time.DateTime dateTime63 = dateTime51.withZoneRetainFields(dateTimeZone59);
        org.joda.time.DateTime dateTime65 = dateTime63.minusWeeks(4);
        org.joda.time.DateTime dateTime67 = dateTime65.minusHours((-5));
        int int68 = dateTimeZone23.getOffset((org.joda.time.ReadableInstant) dateTime67);
        long long70 = dateTimeZone1.getMillisKeepLocal(dateTimeZone23, 0L);
        int int72 = dateTimeZone1.getStandardOffset(48273422L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+97:00" + "'", str25, "+97:00");
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 11L + "'", long29 == 11L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+97:00" + "'", str30, "+97:00");
        org.junit.Assert.assertNotNull(hours31);
        org.junit.Assert.assertNotNull(hours32);
        org.junit.Assert.assertNotNull(hours33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3600010 + "'", int38 == 3600010);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 5 + "'", int58 == 5);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-349200000L) + "'", long62 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 349200000 + "'", int68 == 349200000);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-349199945L) + "'", long70 == (-349199945L));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 55 + "'", int72 == 55);
    }

    @Test
    public void test14709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14709");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval((-360000000L), 7686192556801935L, dateTimeZone2);
    }

    @Test
    public void test14710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14710");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval10 = mutableInterval9.toInterval();
        org.joda.time.Chronology chronology11 = interval10.getChronology();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 1, periodType6, chronology11);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) '4', chronology11);
        org.joda.time.ReadablePartial readablePartial14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.withFields(readablePartial14);
        org.joda.time.DateTime.Property property16 = dateTime15.millisOfDay();
        org.joda.time.DateTime dateTime18 = dateTime15.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime20 = dateTime15.withCenturyOfEra((int) (short) 1);
        org.joda.time.Hours hours21 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours22 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours23 = hours21.minus(hours22);
        org.joda.time.Duration duration24 = hours22.toStandardDuration();
        org.joda.time.DateTime dateTime25 = dateTime15.plus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Duration duration26 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration27 = duration26.toDuration();
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.DateTimeZone dateTimeZone33 = chronology32.getZone();
        org.joda.time.Period period34 = duration26.toPeriod(chronology32);
        boolean boolean35 = duration24.isShorterThan((org.joda.time.ReadableDuration) duration26);
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.days();
        org.joda.time.Period period37 = duration26.toPeriod(periodType36);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval43 = mutableInterval42.toInterval();
        org.joda.time.Chronology chronology44 = interval43.getChronology();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 1, periodType39, chronology44);
        org.joda.time.DateTimeField dateTimeField46 = chronology44.yearOfCentury();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        org.joda.time.Chronology chronology52 = interval51.getChronology();
        org.joda.time.DateTimeZone dateTimeZone53 = chronology52.getZone();
        java.lang.String str55 = dateTimeZone53.getName(100L);
        org.joda.time.DateTime dateTime56 = dateTime47.withZoneRetainFields(dateTimeZone53);
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval60 = mutableInterval59.toInterval();
        org.joda.time.Chronology chronology61 = interval60.getChronology();
        org.joda.time.DateTimeZone dateTimeZone62 = chronology61.getZone();
        java.lang.String str64 = dateTimeZone62.getName(100L);
        org.joda.time.DateTime dateTime65 = dateTime56.withZoneRetainFields(dateTimeZone62);
        org.joda.time.Chronology chronology66 = chronology44.withZone(dateTimeZone62);
        org.joda.time.Period period67 = new org.joda.time.Period(0L, 10L, periodType36, chronology44);
        boolean boolean68 = dateTimeFieldType0.isSupported(chronology44);
        org.joda.time.DateTimeField dateTimeField69 = chronology44.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField70 = chronology44.secondOfMinute();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+97:00" + "'", str55, "+97:00");
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "+97:00" + "'", str64, "+97:00");
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(dateTimeField70);
    }

    @Test
    public void test14711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14711");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.DateTime.Property property10 = dateTime9.era();
        org.joda.time.DateTime dateTime11 = property10.roundCeilingCopy();
        int int12 = dateTime11.getMinuteOfHour();
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = chronology17.getZone();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.DateTimeZone dateTimeZone25 = chronology24.getZone();
        java.lang.String str27 = dateTimeZone25.getName(100L);
        org.joda.time.DateTime dateTime28 = dateTime19.withZoneRetainFields(dateTimeZone25);
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.Chronology chronology33 = interval32.getChronology();
        org.joda.time.DateTimeZone dateTimeZone34 = chronology33.getZone();
        java.lang.String str36 = dateTimeZone34.getName(100L);
        org.joda.time.DateTime dateTime37 = dateTime28.withZoneRetainFields(dateTimeZone34);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone34);
        long long40 = dateTimeZone18.getMillisKeepLocal(dateTimeZone34, (long) 11);
        org.joda.time.DateTime dateTime41 = dateTime11.toDateTime(dateTimeZone34);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime43 = dateTime11.plus(1645455420331L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 9223372036505575807 + 1645455420331");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+97:00" + "'", str27, "+97:00");
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+97:00" + "'", str36, "+97:00");
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 11L + "'", long40 == 11L);
        org.junit.Assert.assertNotNull(dateTime41);
    }

    @Test
    public void test14712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14712");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime8 = dateTime7.toDateTime();
        org.joda.time.DateTime.Property property9 = dateTime8.dayOfYear();
        org.joda.time.DateTime dateTime11 = property9.addWrapFieldToCopy(100);
        org.joda.time.DateTime.Property property12 = dateTime11.secondOfDay();
        int int13 = property12.getMaximumValue();
        boolean boolean14 = property12.isLeap();
        org.joda.time.DateTime dateTime16 = property12.addWrapFieldToCopy(957);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 86399 + "'", int13 == 86399);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test14713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14713");
        org.joda.time.Period period1 = new org.joda.time.Period(29915990496000L);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        org.joda.time.Chronology chronology9 = interval8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 1, periodType4, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '4', chronology9);
        org.joda.time.ReadablePartial readablePartial12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.withFields(readablePartial12);
        org.joda.time.DateTime.Property property14 = dateTime13.millisOfDay();
        org.joda.time.DateTime dateTime16 = dateTime13.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime18 = dateTime16.minusDays(94);
        org.joda.time.Duration duration19 = period1.toDurationFrom((org.joda.time.ReadableInstant) dateTime16);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(duration19);
    }

    @Test
    public void test14714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14714");
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
        org.joda.time.DateTime dateTime16 = dateTime11.withCenturyOfEra((int) (short) 1);
        org.joda.time.Hours hours17 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours18 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours19 = hours17.minus(hours18);
        org.joda.time.Duration duration20 = hours18.toStandardDuration();
        org.joda.time.DateTime dateTime21 = dateTime11.plus((org.joda.time.ReadableDuration) duration20);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        org.joda.time.Chronology chronology29 = interval28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 1, periodType24, chronology29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) '4', chronology29);
        org.joda.time.ReadablePartial readablePartial32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.withFields(readablePartial32);
        org.joda.time.DateTime dateTime35 = dateTime31.plusMillis((int) ' ');
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration20, (org.joda.time.ReadableInstant) dateTime35);
        int int37 = dateTime35.getCenturyOfEra();
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
        org.joda.time.Period period53 = org.joda.time.Period.days((-1));
        org.joda.time.Period period55 = period53.withWeeks((int) 'a');
        org.joda.time.Period period57 = period53.plusMonths((int) (short) -1);
        org.joda.time.Period period59 = period53.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime60 = dateTime48.plus((org.joda.time.ReadablePeriod) period53);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateTime dateTime62 = dateTime48.toDateTime(dateTimeZone61);
        org.joda.time.DateTime dateTime64 = dateTime62.plusHours(0);
        org.joda.time.DateTime dateTime65 = dateTime62.toDateTime();
        org.joda.time.DateTime dateTime67 = dateTime62.plusYears((-70));
        org.joda.time.Hours hours68 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.DateTime dateTime69 = dateTime35.toDateTimeISO();
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 19 + "'", int37 == 19);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(hours68);
        org.junit.Assert.assertNotNull(dateTime69);
    }

    @Test
    public void test14715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14715");
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
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone24);
        int int26 = dateTime25.getMillisOfDay();
        org.joda.time.DateTime dateTime28 = dateTime25.plusMillis((int) '#');
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.Chronology chronology36 = interval35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 1, periodType31, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) '4', chronology36);
        org.joda.time.DateTime dateTime39 = dateTime28.withChronology(chronology36);
        int int40 = dateTime39.getYearOfEra();
        org.joda.time.Chronology chronology41 = dateTime39.getChronology();
        boolean boolean42 = dateTime22.isAfter((org.joda.time.ReadableInstant) dateTime39);
        int int43 = dateTime22.getDayOfMonth();
        java.util.GregorianCalendar gregorianCalendar44 = dateTime22.toGregorianCalendar();
        org.joda.time.DateTime dateTime46 = dateTime22.minusMinutes(16);
        boolean boolean47 = dateTime22.isAfterNow();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3600010 + "'", int26 == 3600010);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1970 + "'", int40 == 1970);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(gregorianCalendar44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test14716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14716");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-3599903L), 3L);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval9 = mutableInterval8.toInterval();
        org.joda.time.Chronology chronology10 = interval9.getChronology();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 1, periodType5, chronology10);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) '4', chronology10);
        org.joda.time.ReadablePartial readablePartial13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withFields(readablePartial13);
        org.joda.time.DateTime.Property property15 = dateTime14.millisOfDay();
        org.joda.time.DateTime dateTime17 = dateTime14.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime19 = dateTime14.withCenturyOfEra((int) (short) 1);
        org.joda.time.Hours hours20 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours21 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours22 = hours20.minus(hours21);
        org.joda.time.Duration duration23 = hours21.toStandardDuration();
        org.joda.time.DateTime dateTime24 = dateTime14.plus((org.joda.time.ReadableDuration) duration23);
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 1, periodType27, chronology32);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) '4', chronology32);
        org.joda.time.ReadablePartial readablePartial35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.withFields(readablePartial35);
        org.joda.time.DateTime dateTime38 = dateTime34.plusMillis((int) ' ');
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration23, (org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Hours hours40 = org.joda.time.Hours.MIN_VALUE;
        org.joda.time.PeriodType periodType41 = hours40.getPeriodType();
        org.joda.time.PeriodType periodType42 = hours40.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, (org.joda.time.ReadableInstant) dateTime38, periodType42);
        org.joda.time.DateTime dateTime45 = dateTime38.plusMonths(70);
        org.joda.time.DateTime dateTime47 = dateTime45.plusYears(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = null;
        java.lang.String str49 = dateTime45.toString(dateTimeFormatter48);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(hours40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1975-11-05T01:00:00.084+97:00" + "'", str49, "1975-11-05T01:00:00.084+97:00");
    }

    @Test
    public void test14717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14717");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
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
        org.joda.time.Interval interval27 = duration0.toIntervalTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period30 = duration0.toPeriodFrom((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime.Property property31 = dateTime29.era();
        boolean boolean32 = dateTime29.isBeforeNow();
        org.joda.time.DateTime dateTime33 = dateTime29.withLaterOffsetAtOverlap();
        org.joda.time.TimeOfDay timeOfDay34 = dateTime29.toTimeOfDay();
        org.joda.time.Chronology chronology35 = timeOfDay34.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.minutes();
        org.junit.Assert.assertNotNull(duration0);
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
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(durationField36);
    }

    @Test
    public void test14718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14718");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
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
        org.joda.time.Interval interval27 = duration0.toIntervalTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period30 = duration0.toPeriodFrom((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime.Property property31 = dateTime29.era();
        org.joda.time.DateTime dateTime33 = dateTime29.plusWeeks(560);
        org.joda.time.DateTime dateTime35 = dateTime33.plusHours(0);
        org.junit.Assert.assertNotNull(duration0);
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
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    public void test14719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14719");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        mutablePeriod8.addSeconds((int) (byte) 100);
        int int17 = mutablePeriod8.getDays();
        int int18 = mutablePeriod8.getMillis();
        int int19 = mutablePeriod8.getDays();
        mutablePeriod8.addHours(0);
        mutablePeriod8.setWeeks((-89));
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P-1D" + "'", str13, "P-1D");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test14720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14720");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getSecondOfMinute();
        int int4 = dateTime2.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone6);
        int int8 = dateTime7.getMillisOfDay();
        org.joda.time.DateTime dateTime10 = dateTime7.plusMillis((int) '#');
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval17 = mutableInterval16.toInterval();
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 1, periodType13, chronology18);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) '4', chronology18);
        org.joda.time.DateTime dateTime21 = dateTime10.withChronology(chronology18);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime2.toMutableDateTime(chronology18);
        org.joda.time.DurationField durationField23 = chronology18.halfdays();
        org.joda.time.DateTimeField dateTimeField24 = chronology18.millisOfSecond();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3600010 + "'", int4 == 3600010);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3600010 + "'", int8 == 3600010);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test14721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14721");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.DateTime.Property property10 = dateTime9.era();
        org.joda.time.DateTime dateTime12 = dateTime9.minusYears((int) '#');
        org.joda.time.DateTime dateTime14 = dateTime12.minusMinutes(4);
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
        org.joda.time.DateTime dateTime42 = dateTime40.plusDays((int) (byte) 1);
        org.joda.time.Seconds seconds43 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone45);
        int int47 = dateTime46.getMillisOfDay();
        org.joda.time.DateTime dateTime49 = dateTime46.plusMillis((int) '#');
        boolean boolean51 = dateTime49.isAfter((-1L));
        int int52 = dateTime49.getCenturyOfEra();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = dateTime49.toDateTime(chronology53);
        boolean boolean55 = dateTime42.isAfter((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.DateTime dateTime57 = dateTime42.withSecondOfMinute((int) (byte) 1);
        org.joda.time.DateTime dateTime59 = dateTime57.minus((long) 49);
        org.joda.time.DateTime.Property property60 = dateTime57.yearOfEra();
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
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
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(seconds43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3600010 + "'", int47 == 3600010);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 19 + "'", int52 == 19);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(property60);
    }

    @Test
    public void test14722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14722");
        org.joda.time.Period period1 = org.joda.time.Period.days((-1));
        org.joda.time.Period period3 = period1.withWeeks((int) 'a');
        org.joda.time.Period period5 = period1.plusMonths((int) (short) -1);
        org.joda.time.Period period7 = period5.minusMonths((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone9);
        int int11 = dateTime10.getMillisOfDay();
        org.joda.time.DateTime dateTime13 = dateTime10.plusMillis((int) '#');
        boolean boolean15 = dateTime13.isAfter((-1L));
        int int16 = dateTime13.getCenturyOfEra();
        org.joda.time.Duration duration17 = period7.toDurationTo((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period28 = org.joda.time.Period.days((-1));
        org.joda.time.Period period30 = period28.withWeeks((int) 'a');
        java.lang.String str31 = period28.toString();
        mutablePeriod26.setPeriod((org.joda.time.ReadablePeriod) period28);
        mutablePeriod26.addMonths((int) (short) -1);
        org.joda.time.Minutes minutes36 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType37 = null;
        int int38 = minutes36.get(durationFieldType37);
        int int40 = minutes36.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod41 = minutes36.toMutablePeriod();
        mutablePeriod26.add((org.joda.time.ReadablePeriod) mutablePeriod41);
        org.joda.time.PeriodType periodType43 = mutablePeriod41.getPeriodType();
        org.joda.time.DateTime dateTime44 = dateTime13.minus((org.joda.time.ReadablePeriod) mutablePeriod41);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        org.joda.time.DateTimeZone dateTimeZone51 = chronology50.getZone();
        java.lang.String str53 = dateTimeZone51.getName(100L);
        org.joda.time.DateTime dateTime54 = dateTime45.withZoneRetainFields(dateTimeZone51);
        java.lang.String str55 = dateTimeZone51.getID();
        java.util.Locale locale57 = null;
        java.lang.String str58 = dateTimeZone51.getShortName((long) '4', locale57);
        org.joda.time.DateTime dateTime59 = org.joda.time.DateTime.now(dateTimeZone51);
        org.joda.time.DateTime dateTime60 = dateTime44.withZone(dateTimeZone51);
        org.joda.time.DateTime dateTime62 = dateTime60.minusMinutes(881);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3600010 + "'", int11 == 3600010);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 19 + "'", int16 == 19);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "P-1D" + "'", str31, "P-1D");
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(mutablePeriod41);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+97:00" + "'", str53, "+97:00");
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+97:00" + "'", str55, "+97:00");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "+97:00" + "'", str58, "+97:00");
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTime62);
    }

    @Test
    public void test14723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14723");
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
        org.joda.time.DateTimeField dateTimeField15 = property14.getField();
        org.joda.time.Interval interval16 = property14.toInterval();
        org.joda.time.DateTime dateTime17 = property14.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test14724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14724");
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
        org.joda.time.ReadableInterval readableInterval65 = null;
        boolean boolean66 = mutableInterval2.isBefore(readableInterval65);
        boolean boolean67 = mutableInterval2.isAfterNow();
        long long68 = mutableInterval2.getStartMillis();
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
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-1L) + "'", long68 == (-1L));
    }

    @Test
    public void test14725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14725");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, periodType1, chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = chronology6.getZone();
        org.joda.time.DurationField durationField10 = chronology6.hours();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology6.getZone();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone11.getName((long) (-596), locale13);
        int int16 = dateTimeZone11.getStandardOffset(1960283647L);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+97:00" + "'", str14, "+97:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 349200000 + "'", int16 == 349200000);
    }

    @Test
    public void test14726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14726");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.MutableInterval mutableInterval5 = interval3.toMutableInterval();
        org.joda.time.Interval interval7 = interval3.withEndMillis(53L);
        org.joda.time.Chronology chronology8 = interval3.getChronology();
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean19 = mutableInterval14.isBefore((org.joda.time.ReadableInterval) mutableInterval18);
        boolean boolean20 = mutableInterval11.contains((org.joda.time.ReadableInterval) mutableInterval18);
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        long long26 = interval24.toDurationMillis();
        org.joda.time.Interval interval28 = interval24.withEndMillis((long) (short) 100);
        mutableInterval18.setInterval((org.joda.time.ReadableInterval) interval24);
        boolean boolean30 = mutableInterval18.containsNow();
        boolean boolean31 = interval3.contains((org.joda.time.ReadableInterval) mutableInterval18);
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(periodType32);
        org.joda.time.Period period34 = mutableInterval18.toPeriod(periodType32);
        long long35 = mutableInterval18.toDurationMillis();
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(mutableInterval5);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 53L + "'", long26 == 53L);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 53L + "'", long35 == 53L);
    }

    @Test
    public void test14727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14727");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType9 = periodType8.withHoursRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(843, (-3600000), 2147483647, 82, 20, 104, 972, (int) (byte) 1, periodType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test14728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14728");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        mutablePeriod8.setSeconds((int) (short) -1);
        mutablePeriod8.addDays(55);
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
        org.joda.time.Duration duration27 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.Chronology chronology35 = interval34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 1, periodType30, chronology35);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) '4', chronology35);
        org.joda.time.ReadablePartial readablePartial38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.withFields(readablePartial38);
        org.joda.time.DateTime.Property property40 = dateTime39.millisOfDay();
        org.joda.time.DateTime dateTime41 = dateTime39.withEarlierOffsetAtOverlap();
        int int42 = dateTime39.getDayOfWeek();
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        org.joda.time.Chronology chronology49 = interval48.getChronology();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 1, periodType44, chronology49);
        org.joda.time.DateTimeField dateTimeField51 = chronology49.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone52 = chronology49.getZone();
        org.joda.time.DateTime dateTime53 = dateTime39.withChronology(chronology49);
        org.joda.time.Interval interval54 = duration27.toIntervalTo((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Instant instant56 = instant13.withDurationAdded((org.joda.time.ReadableDuration) duration27, 48);
        org.joda.time.Duration duration57 = duration27.toDuration();
        org.joda.time.Duration duration58 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration59 = duration58.toDuration();
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval63 = mutableInterval62.toInterval();
        org.joda.time.Chronology chronology64 = interval63.getChronology();
        org.joda.time.DateTimeZone dateTimeZone65 = chronology64.getZone();
        org.joda.time.Period period66 = duration58.toPeriod(chronology64);
        boolean boolean67 = duration27.isShorterThan((org.joda.time.ReadableDuration) duration58);
        long long68 = duration27.getStandardSeconds();
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone70);
        int int72 = dateTime71.getDayOfMonth();
        org.joda.time.DateTime dateTime74 = dateTime71.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property75 = dateTime74.dayOfYear();
        org.joda.time.MutableInterval mutableInterval76 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration27, (org.joda.time.ReadableInstant) dateTime74);
        org.joda.time.PeriodType periodType78 = null;
        org.joda.time.MutableInterval mutableInterval81 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval82 = mutableInterval81.toInterval();
        org.joda.time.Chronology chronology83 = interval82.getChronology();
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((long) 1, periodType78, chronology83);
        long long88 = chronology83.add(52L, 6216719238000000L, (int) (byte) -1);
        mutablePeriod8.setPeriod((org.joda.time.ReadableDuration) duration27, chronology83);
        mutablePeriod8.addHours(1);
        org.joda.time.Seconds seconds92 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) mutablePeriod8);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(instant56);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 5 + "'", int72 == 5);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertNotNull(interval82);
        org.junit.Assert.assertNotNull(chronology83);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + (-6216719237999948L) + "'", long88 == (-6216719237999948L));
        org.junit.Assert.assertNotNull(seconds92);
    }

    @Test
    public void test14729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14729");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.dayOfMonth();
        java.lang.String str8 = dateTimeField7.toString();
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DateTimeField[dayOfMonth]" + "'", str8, "DateTimeField[dayOfMonth]");
    }

    @Test
    public void test14730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14730");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        int int21 = dateTimeZone15.getStandardOffset((long) 52);
        java.lang.String str22 = dateTimeZone15.toString();
        long long24 = dateTimeZone15.previousTransition(360000053L);
        boolean boolean25 = dateTimeZone15.isFixed();
        int int27 = dateTimeZone15.getOffsetFromLocal((long) 672);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 349200000 + "'", int21 == 349200000);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+97:00" + "'", str22, "+97:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 360000053L + "'", long24 == 360000053L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 349200000 + "'", int27 == 349200000);
    }

    @Test
    public void test14731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14731");
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval9 = mutableInterval8.toInterval();
        org.joda.time.Chronology chronology10 = interval9.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology10.getZone();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        int int15 = dateTimeZone13.getOffset(3600L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 1, periodType19, chronology24);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) '4', chronology24);
        org.joda.time.ReadablePartial readablePartial27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.withFields(readablePartial27);
        org.joda.time.DateTime.Property property29 = dateTime28.millisOfDay();
        org.joda.time.DateTime dateTime31 = dateTime28.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime33 = dateTime28.withCenturyOfEra((int) (short) 1);
        org.joda.time.Hours hours34 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours35 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours36 = hours34.minus(hours35);
        org.joda.time.Duration duration37 = hours35.toStandardDuration();
        org.joda.time.DateTime dateTime38 = dateTime28.plus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.LocalDateTime localDateTime39 = dateTime38.toLocalDateTime();
        boolean boolean40 = dateTimeZone13.isLocalDateTimeGap(localDateTime39);
        boolean boolean41 = dateTimeZone11.isLocalDateTimeGap(localDateTime39);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(16, 954, 40, 0, 187201970, 57183577, dateTimeZone11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 187201970 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 349200000 + "'", int15 == 349200000);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(hours34);
        org.junit.Assert.assertNotNull(hours35);
        org.junit.Assert.assertNotNull(hours36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test14732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14732");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
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
        org.joda.time.Interval interval27 = duration0.toIntervalTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period30 = duration0.toPeriodFrom((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Duration duration32 = duration0.withMillis(100L);
        long long33 = duration0.getMillis();
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        org.joda.time.Chronology chronology41 = interval40.getChronology();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 1, periodType36, chronology41);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) '4', chronology41);
        org.joda.time.ReadablePartial readablePartial44 = null;
        org.joda.time.DateTime dateTime45 = dateTime43.withFields(readablePartial44);
        org.joda.time.DateTime.Property property46 = dateTime45.millisOfDay();
        org.joda.time.DateTime dateTime48 = dateTime45.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property49 = dateTime45.era();
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval53 = mutableInterval52.toInterval();
        org.joda.time.Chronology chronology54 = interval53.getChronology();
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(chronology54);
        int int56 = property49.compareTo((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Period period57 = duration0.toPeriodFrom((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Period period58 = period57.negated();
        org.junit.Assert.assertNotNull(duration0);
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
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period58);
    }

    @Test
    public void test14733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14733");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 100);
        org.joda.time.Period period3 = period1.plusMillis(29);
        org.joda.time.Weeks weeks4 = period1.toStandardWeeks();
        org.joda.time.Weeks weeks6 = weeks4.multipliedBy((-71952772));
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks6);
    }

    @Test
    public void test14734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14734");
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
        org.joda.time.Period period36 = period34.minusHours(1970);
        org.joda.time.Period period38 = period36.minusHours(947);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period49 = org.joda.time.Period.days((-1));
        org.joda.time.Period period51 = period49.withWeeks((int) 'a');
        java.lang.String str52 = period49.toString();
        mutablePeriod47.setPeriod((org.joda.time.ReadablePeriod) period49);
        mutablePeriod47.setYears(0);
        mutablePeriod47.setPeriod((int) (byte) -1, 100, (int) (byte) 100, (-1), 100, (int) (short) 10, 887, 0);
        org.joda.time.Period period65 = period38.minus((org.joda.time.ReadablePeriod) mutablePeriod47);
        int int66 = mutablePeriod47.getMillis();
        int int67 = mutablePeriod47.getMillis();
        org.joda.time.Hours hours68 = org.joda.time.Hours.EIGHT;
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period79 = org.joda.time.Period.days((-1));
        org.joda.time.Period period81 = period79.withWeeks((int) 'a');
        java.lang.String str82 = period79.toString();
        mutablePeriod77.setPeriod((org.joda.time.ReadablePeriod) period79);
        int int84 = mutablePeriod77.getMillis();
        org.joda.time.DurationFieldType durationFieldType86 = mutablePeriod77.getFieldType(0);
        int int87 = hours68.get(durationFieldType86);
        java.lang.String str88 = durationFieldType86.toString();
        java.lang.String str89 = durationFieldType86.getName();
        java.lang.String str90 = durationFieldType86.toString();
        mutablePeriod47.set(durationFieldType86, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period93 = new org.joda.time.Period((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Short");
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
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "P-1D" + "'", str52, "P-1D");
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(hours68);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "P-1D" + "'", str82, "P-1D");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(durationFieldType86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "years" + "'", str88, "years");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "years" + "'", str89, "years");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "years" + "'", str90, "years");
    }

    @Test
    public void test14735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14735");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(221356800000L);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test14736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14736");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType2 = null;
        int int3 = minutes1.get(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType4 = minutes1.getFieldType();
        org.joda.time.Minutes minutes6 = minutes1.minus((int) '4');
        org.joda.time.Minutes minutes8 = minutes6.minus(24);
        org.joda.time.Minutes minutes10 = minutes8.minus(55);
        org.joda.time.Minutes minutes11 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes12 = null;
        org.joda.time.Minutes minutes13 = minutes11.plus(minutes12);
        org.joda.time.DurationFieldType durationFieldType14 = minutes13.getFieldType();
        org.joda.time.Minutes minutes16 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType17 = null;
        int int18 = minutes16.get(durationFieldType17);
        int int20 = minutes16.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod21 = minutes16.toMutablePeriod();
        org.joda.time.Minutes minutes22 = minutes13.plus(minutes16);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone24);
        int int26 = dateTime25.getDayOfMonth();
        org.joda.time.DateTime dateTime28 = dateTime25.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property29 = dateTime28.dayOfYear();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.Chronology chronology35 = interval34.getChronology();
        org.joda.time.DateTimeZone dateTimeZone36 = chronology35.getZone();
        java.lang.String str38 = dateTimeZone36.getName(100L);
        org.joda.time.DateTime dateTime39 = dateTime30.withZoneRetainFields(dateTimeZone36);
        int int40 = dateTime39.getMinuteOfDay();
        int int41 = dateTime39.getEra();
        org.joda.time.DateMidnight dateMidnight42 = dateTime39.toDateMidnight();
        int int43 = dateMidnight42.getHourOfDay();
        long long44 = dateMidnight42.getMillis();
        org.joda.time.Duration duration45 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableInstant) dateMidnight42);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone47);
        int int49 = dateTime48.getMillisOfDay();
        org.joda.time.DateTime dateTime51 = dateTime48.plusMillis((int) '#');
        int int52 = dateTime48.getYearOfEra();
        org.joda.time.DateTime.Property property53 = dateTime48.secondOfMinute();
        org.joda.time.DurationField durationField54 = property53.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.era();
        boolean boolean56 = property53.equals((java.lang.Object) dateTimeFieldType55);
        org.joda.time.DurationFieldType durationFieldType57 = dateTimeFieldType55.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType58 = dateTimeFieldType55.getDurationType();
        boolean boolean59 = dateMidnight42.isSupported(dateTimeFieldType55);
        boolean boolean60 = minutes16.equals((java.lang.Object) dateMidnight42);
        org.joda.time.Minutes minutes61 = minutes10.plus(minutes16);
        org.joda.time.Minutes minutes63 = minutes61.minus((-31));
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(mutablePeriod21);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+97:00" + "'", str38, "+97:00");
        org.junit.Assert.assertNotNull(dateTime39);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 957 + "'", int40 == 957);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1645398000000L + "'", long44 == 1645398000000L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3600010 + "'", int49 == 3600010);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1970 + "'", int52 == 1970);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(durationFieldType57);
        org.junit.Assert.assertNotNull(durationFieldType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(minutes61);
        org.junit.Assert.assertNotNull(minutes63);
    }

    @Test
    public void test14737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14737");
        java.lang.Object obj0 = null;
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(6216719587200001L, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusWeeks(19);
        org.joda.time.DateTime dateTime18 = dateTime14.withWeekOfWeekyear(19);
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean29 = mutableInterval24.isBefore((org.joda.time.ReadableInterval) mutableInterval28);
        boolean boolean30 = mutableInterval21.contains((org.joda.time.ReadableInterval) mutableInterval28);
        mutableInterval21.setDurationAfterStart(0L);
        boolean boolean33 = mutableInterval21.containsNow();
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        long long39 = interval37.toDurationMillis();
        org.joda.time.Interval interval41 = interval37.withEndMillis((long) (short) 100);
        long long42 = interval37.toDurationMillis();
        boolean boolean43 = mutableInterval21.overlaps((org.joda.time.ReadableInterval) interval37);
        boolean boolean45 = interval37.contains((long) (-1));
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        org.joda.time.MutableInterval mutableInterval51 = interval49.toMutableInterval();
        boolean boolean52 = interval37.contains((org.joda.time.ReadableInterval) interval49);
        org.joda.time.Duration duration53 = interval49.toDuration();
        org.joda.time.Period period55 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType56 = period55.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) (-90), periodType56);
        org.joda.time.Period period58 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableDuration) duration53, periodType56);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((int) (byte) 100, 24, 8, 23, 947, (-2147483648), 19, 366, periodType56);
        org.joda.time.PeriodType periodType60 = mutablePeriod59.getPeriodType();
        org.joda.time.Period period61 = new org.joda.time.Period(25245561600000L, (long) 5, periodType60);
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod(obj0, periodType60);
        org.joda.time.PeriodType periodType63 = periodType60.withSecondsRemoved();
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 53L + "'", long39 == 53L);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 53L + "'", long42 == 53L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(mutableInterval51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(periodType63);
    }

    @Test
    public void test14738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14738");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        mutablePeriod8.addMillis(2022);
        mutablePeriod8.addMonths(21);
        mutablePeriod8.setPeriod((-52), 2, 2, 60, 1439, 366, 947, 48);
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) 23, 1672531199993L);
        java.lang.String str25 = mutableInterval24.toString();
        long long26 = mutableInterval24.getEndMillis();
        mutableInterval24.setDurationAfterStart((long) 8);
        mutablePeriod8.setPeriod((org.joda.time.ReadableInterval) mutableInterval24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-05T01:00:00.023+97:00/2023-01-05T00:59:59.993+97:00" + "'", str25, "1970-01-05T01:00:00.023+97:00/2023-01-05T00:59:59.993+97:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1672531199993L + "'", long26 == 1672531199993L);
    }

    @Test
    public void test14739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14739");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone5);
        int int7 = dateTime6.getMillisOfDay();
        org.joda.time.DateTime dateTime9 = dateTime6.plusMillis((int) '#');
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 1, periodType12, chronology17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '4', chronology17);
        org.joda.time.DateTime dateTime20 = dateTime9.withChronology(chronology17);
        int int21 = dateTime20.getYearOfEra();
        org.joda.time.Chronology chronology22 = dateTime20.getChronology();
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean33 = mutableInterval28.isBefore((org.joda.time.ReadableInterval) mutableInterval32);
        boolean boolean34 = mutableInterval25.contains((org.joda.time.ReadableInterval) mutableInterval32);
        org.joda.time.Period period35 = mutableInterval25.toPeriod();
        int[] intArray37 = chronology22.get((org.joda.time.ReadablePeriod) period35, (-6380815651200000L));
        org.joda.time.DurationField durationField38 = chronology22.halfdays();
        org.joda.time.Interval interval39 = interval3.withChronology(chronology22);
        org.joda.time.DateTimeField dateTimeField40 = chronology22.weekyear();
        org.joda.time.DurationField durationField41 = chronology22.halfdays();
        int int43 = durationField41.getValue((long) 3600001);
        int int46 = durationField41.getValue(1645455069341L, 1645455041086L);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600010 + "'", int7 == 3600010);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1970 + "'", int21 == 1970);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 0, -10550290, -3, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 38089 + "'", int46 == 38089);
    }

    @Test
    public void test14740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14740");
        org.joda.time.Days days0 = org.joda.time.Days.SEVEN;
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
        boolean boolean51 = days0.isLessThan(days50);
        org.joda.time.PeriodType periodType52 = days50.getPeriodType();
        int int53 = days50.getDays();
        org.joda.time.PeriodType periodType54 = days50.getPeriodType();
        int int55 = days50.getDays();
        org.junit.Assert.assertNotNull(days0);
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
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-6) + "'", int53 == (-6));
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-6) + "'", int55 == (-6));
    }

    @Test
    public void test14741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14741");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) 60);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        org.joda.time.Chronology chronology9 = interval8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 1, periodType4, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '4', chronology9);
        org.joda.time.ReadablePartial readablePartial12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.withFields(readablePartial12);
        org.joda.time.DateTime.Property property14 = dateTime11.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime11.getZone();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period26 = org.joda.time.Period.days((-1));
        org.joda.time.Period period28 = period26.withWeeks((int) 'a');
        java.lang.String str29 = period26.toString();
        mutablePeriod24.setPeriod((org.joda.time.ReadablePeriod) period26);
        int int31 = mutablePeriod24.getMillis();
        org.joda.time.DurationFieldType durationFieldType33 = mutablePeriod24.getFieldType(0);
        org.joda.time.Period period34 = new org.joda.time.Period((java.lang.Object) mutablePeriod24);
        org.joda.time.Period period36 = period34.minusHours((-1870));
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval43 = mutableInterval42.toInterval();
        org.joda.time.Chronology chronology44 = interval43.getChronology();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 1, periodType39, chronology44);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) '4', chronology44);
        org.joda.time.DurationField durationField47 = chronology44.centuries();
        org.joda.time.DateTimeField dateTimeField48 = chronology44.secondOfDay();
        org.joda.time.Period period49 = new org.joda.time.Period((java.lang.Object) period34, chronology44);
        org.joda.time.DateTime dateTime50 = dateTime11.minus((org.joda.time.ReadablePeriod) period49);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.MutablePeriod mutablePeriod52 = mutablePeriod51.copy();
        org.joda.time.Seconds seconds54 = org.joda.time.Seconds.seconds(1969);
        org.joda.time.Seconds seconds56 = seconds54.minus(18404);
        org.joda.time.DurationFieldType durationFieldType57 = seconds54.getFieldType();
        int int58 = mutablePeriod51.get(durationFieldType57);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "P-1D" + "'", str29, "P-1D");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(durationField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(mutablePeriod52);
        org.junit.Assert.assertNotNull(seconds54);
        org.junit.Assert.assertNotNull(seconds56);
        org.junit.Assert.assertNotNull(durationFieldType57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test14742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14742");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval9);
        long long13 = mutableInterval9.getEndMillis();
        org.joda.time.DateTime dateTime14 = mutableInterval9.getEnd();
        boolean boolean15 = dateTime14.isBeforeNow();
        org.joda.time.DateTime dateTime17 = dateTime14.withMillisOfSecond(94);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone19);
        java.util.Locale locale21 = null;
        java.util.Calendar calendar22 = dateTime20.toCalendar(locale21);
        org.joda.time.DateTime dateTime24 = dateTime20.minus((long) 56);
        org.joda.time.DateTime.Property property25 = dateTime20.minuteOfDay();
        org.joda.time.DateTime.Property property26 = dateTime20.year();
        org.joda.time.Instant instant27 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.Chronology chronology35 = interval34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 1, periodType30, chronology35);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) '4', chronology35);
        org.joda.time.ReadablePartial readablePartial38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.withFields(readablePartial38);
        boolean boolean40 = instant27.isAfter((org.joda.time.ReadableInstant) dateTime37);
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
        org.joda.time.Instant instant70 = instant27.withDurationAdded((org.joda.time.ReadableDuration) duration41, 48);
        long long71 = instant27.getMillis();
        org.joda.time.Chronology chronology72 = instant27.getChronology();
        int int73 = dateTime20.compareTo((org.joda.time.ReadableInstant) instant27);
        boolean boolean74 = dateTime14.isBefore((org.joda.time.ReadableInstant) instant27);
        long long75 = dateTime14.getMillis();
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(calendar22);
        org.junit.Assert.assertEquals(calendar22.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
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
        org.junit.Assert.assertNotNull(instant70);
// flaky:         org.junit.Assert.assertTrue("'" + long71 + "' != '" + 1645455461605L + "'", long71 == 1645455461605L);
        org.junit.Assert.assertNotNull(chronology72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 52L + "'", long75 == 52L);
    }

    @Test
    public void test14743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14743");
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.Chronology chronology5 = interval4.getChronology();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTime dateTime8 = dateTime6.withWeekyear((int) (short) 1);
        org.joda.time.Duration duration9 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 1, periodType12, chronology17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '4', chronology17);
        org.joda.time.ReadablePartial readablePartial20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withFields(readablePartial20);
        org.joda.time.DateTime.Property property22 = dateTime21.millisOfDay();
        org.joda.time.DateTime dateTime23 = dateTime21.withEarlierOffsetAtOverlap();
        int int24 = dateTime21.getDayOfWeek();
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 1, periodType26, chronology31);
        org.joda.time.DateTimeField dateTimeField33 = chronology31.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone34 = chronology31.getZone();
        org.joda.time.DateTime dateTime35 = dateTime21.withChronology(chronology31);
        org.joda.time.Interval interval36 = duration9.toIntervalTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period39 = duration9.toPeriodFrom((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Period period40 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType41 = period40.getPeriodType();
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableDuration) duration9, periodType41);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 1, periodType41);
        mutablePeriod43.setMillis((int) (short) 10);
        mutablePeriod43.setHours(5);
        mutablePeriod43.setMonths(97);
        mutablePeriod43.setMillis(99);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(periodType41);
    }

    @Test
    public void test14744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14744");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone4 = dateTime2.getZone();
        org.joda.time.DateTime dateTime6 = dateTime2.plusSeconds((int) ' ');
        org.joda.time.DateTime dateTime7 = dateTime2.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean9 = dateTime7.isSupported(dateTimeFieldType8);
        org.joda.time.DateTime dateTime11 = dateTime7.plusYears(531);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone13);
        java.util.Locale locale15 = null;
        java.util.Calendar calendar16 = dateTime14.toCalendar(locale15);
        org.joda.time.DateTime dateTime18 = dateTime14.minus((long) 56);
        org.joda.time.Period period22 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType23 = period22.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) '#', 100L, periodType23);
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        org.joda.time.Chronology chronology29 = interval28.getChronology();
        org.joda.time.DateTimeZone dateTimeZone30 = chronology29.getZone();
        org.joda.time.Period period31 = new org.joda.time.Period(10L, periodType23, chronology29);
        org.joda.time.PeriodType periodType32 = period31.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime14, periodType32);
        java.lang.Object obj34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(obj34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DateTime.Property property37 = dateTime35.property(dateTimeFieldType36);
        org.joda.time.DateTime dateTime39 = dateTime7.withField(dateTimeFieldType36, 26);
        org.joda.time.DateTime.Property property40 = dateTime7.era();
        java.util.Locale locale41 = null;
        int int42 = property40.getMaximumTextLength(locale41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(calendar16);
        org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
    }

    @Test
    public void test14745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14745");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        long long17 = interval15.toDurationMillis();
        org.joda.time.Interval interval19 = interval15.withEndMillis((long) (short) 100);
        mutableInterval9.setInterval((org.joda.time.ReadableInterval) interval15);
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        long long26 = interval24.toDurationMillis();
        boolean boolean27 = interval15.isAfter((org.joda.time.ReadableInterval) interval24);
        org.joda.time.Interval interval29 = interval15.withEndMillis(100L);
        org.joda.time.Duration duration31 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Interval interval32 = interval29.withDurationAfterStart((org.joda.time.ReadableDuration) duration31);
        org.joda.time.DateTime dateTime33 = interval32.getEnd();
        java.lang.String str34 = interval32.toString();
        long long35 = interval32.getStartMillis();
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 53L + "'", long17 == 53L);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 53L + "'", long26 == 53L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970-01-05T00:59:59.999+97:00/1970-01-05T01:00:00.099+97:00" + "'", str34, "1970-01-05T00:59:59.999+97:00/1970-01-05T01:00:00.099+97:00");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
    }

    @Test
    public void test14746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14746");
        org.joda.time.Hours hours8 = org.joda.time.Hours.EIGHT;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period19 = org.joda.time.Period.days((-1));
        org.joda.time.Period period21 = period19.withWeeks((int) 'a');
        java.lang.String str22 = period19.toString();
        mutablePeriod17.setPeriod((org.joda.time.ReadablePeriod) period19);
        int int24 = mutablePeriod17.getMillis();
        org.joda.time.DurationFieldType durationFieldType26 = mutablePeriod17.getFieldType(0);
        int int27 = hours8.get(durationFieldType26);
        org.joda.time.Hours hours29 = hours8.multipliedBy(100);
        org.joda.time.Hours hours31 = hours29.dividedBy(50);
        org.joda.time.Hours hours33 = hours29.dividedBy((int) (byte) 1);
        org.joda.time.Period period35 = org.joda.time.Period.days((-1));
        org.joda.time.Hours hours36 = org.joda.time.Hours.FIVE;
        org.joda.time.PeriodType periodType37 = hours36.getPeriodType();
        org.joda.time.Period period38 = period35.withFields((org.joda.time.ReadablePeriod) hours36);
        org.joda.time.Hours hours39 = hours29.plus(hours36);
        org.joda.time.Hours hours41 = hours39.minus(24);
        org.joda.time.PeriodType periodType42 = hours39.getPeriodType();
        org.joda.time.PeriodType periodType43 = periodType42.withSecondsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period44 = new org.joda.time.Period((-597), (-10), 260936, 93600000, 47, 3600010, (-6), 41, periodType43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "P-1D" + "'", str22, "P-1D");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(hours29);
        org.junit.Assert.assertNotNull(hours31);
        org.junit.Assert.assertNotNull(hours33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(hours36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(hours39);
        org.junit.Assert.assertNotNull(hours41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType43);
    }

    @Test
    public void test14747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14747");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Duration duration1 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        org.joda.time.Chronology chronology9 = interval8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 1, periodType4, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '4', chronology9);
        org.joda.time.ReadablePartial readablePartial12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.withFields(readablePartial12);
        org.joda.time.DateTime.Property property14 = dateTime13.millisOfDay();
        org.joda.time.DateTime dateTime15 = dateTime13.withEarlierOffsetAtOverlap();
        int int16 = dateTime13.getDayOfWeek();
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 1, periodType18, chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone26 = chronology23.getZone();
        org.joda.time.DateTime dateTime27 = dateTime13.withChronology(chronology23);
        org.joda.time.Interval interval28 = duration1.toIntervalTo((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period31 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadablePeriod) period31);
        org.joda.time.Days days33 = org.joda.time.Days.FOUR;
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean44 = mutableInterval39.isBefore((org.joda.time.ReadableInterval) mutableInterval43);
        boolean boolean45 = mutableInterval36.contains((org.joda.time.ReadableInterval) mutableInterval43);
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        long long51 = interval49.toDurationMillis();
        org.joda.time.Interval interval53 = interval49.withEndMillis((long) (short) 100);
        mutableInterval43.setInterval((org.joda.time.ReadableInterval) interval49);
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval58 = mutableInterval57.toInterval();
        org.joda.time.Chronology chronology59 = interval58.getChronology();
        long long60 = interval58.toDurationMillis();
        boolean boolean61 = interval49.isAfter((org.joda.time.ReadableInterval) interval58);
        org.joda.time.Interval interval63 = interval49.withEndMillis(100L);
        org.joda.time.Days days64 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval63);
        org.joda.time.Days days65 = days33.plus(days64);
        org.joda.time.PeriodType periodType66 = days65.getPeriodType();
        org.joda.time.Period period67 = mutableInterval32.toPeriod(periodType66);
        org.joda.time.DateTime dateTime68 = mutableInterval32.getStart();
        org.joda.time.MutableInterval mutableInterval71 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval72 = mutableInterval71.toInterval();
        org.joda.time.Chronology chronology73 = interval72.getChronology();
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime(chronology73);
        org.joda.time.LocalDateTime localDateTime75 = dateTime74.toLocalDateTime();
        org.joda.time.DateTime dateTime77 = dateTime74.minusSeconds(3600010);
        boolean boolean78 = mutableInterval32.isAfter((org.joda.time.ReadableInstant) dateTime74);
        org.joda.time.Duration duration80 = org.joda.time.Duration.standardHours((long) 349200000);
        org.joda.time.DateTime dateTime82 = new org.joda.time.DateTime((-6L));
        org.joda.time.Period period83 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration80, (org.joda.time.ReadableInstant) dateTime82);
        mutableInterval32.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration80);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 53L + "'", long51 == 53L);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 53L + "'", long60 == 53L);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(days64);
        org.junit.Assert.assertNotNull(days65);
        org.junit.Assert.assertNotNull(periodType66);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertNotNull(chronology73);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(duration80);
    }

    @Test
    public void test14748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14748");
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
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone36);
        int int38 = dateTime37.getSecondOfMinute();
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(periodType39);
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadablePeriod) mutablePeriod40);
        boolean boolean42 = interval30.abuts((org.joda.time.ReadableInterval) mutableInterval41);
        org.joda.time.DateTime dateTime43 = interval30.getStart();
        org.joda.time.DateTime dateTime45 = dateTime43.withMillisOfDay((int) (byte) 1);
        org.joda.time.DateTime dateTime47 = dateTime45.minusDays(59);
        java.lang.String str48 = dateTime47.toString();
        java.util.Locale locale49 = null;
        java.util.Calendar calendar50 = dateTime47.toCalendar(locale49);
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1969-11-07T00:00:00.001+97:00" + "'", str48, "1969-11-07T00:00:00.001+97:00");
        org.junit.Assert.assertNotNull(calendar50);
        org.junit.Assert.assertEquals(calendar50.toString(), "java.util.GregorianCalendar[time=-5101199999,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=10,WEEK_OF_YEAR=45,WEEK_OF_MONTH=2,DAY_OF_MONTH=2,DAY_OF_YEAR=306,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test14749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14749");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.MIN_VALUE;
        org.joda.time.Duration duration1 = seconds0.toStandardDuration();
        org.joda.time.Seconds seconds3 = seconds0.minus((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds4 = seconds0.negated();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Integer.MIN_VALUE cannot be negated");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds3);
    }

    @Test
    public void test14750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14750");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.Minutes minutes2 = minutes1.negated();
        java.lang.String str3 = minutes1.toString();
        org.joda.time.Minutes minutes5 = minutes1.minus(26);
        org.joda.time.PeriodType periodType6 = minutes1.getPeriodType();
        org.joda.time.Minutes minutes8 = minutes1.multipliedBy(22);
        org.joda.time.Minutes minutes10 = minutes8.plus(117);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT10M" + "'", str3, "PT10M");
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes10);
    }

    @Test
    public void test14751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14751");
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        org.joda.time.Chronology chronology9 = interval8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 1, periodType4, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '4', chronology9);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 1, periodType15, chronology20);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) '4', chronology20);
        org.joda.time.ReadablePartial readablePartial23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.withFields(readablePartial23);
        boolean boolean25 = instant12.isAfter((org.joda.time.ReadableInstant) dateTime22);
        boolean boolean26 = dateTime11.isAfter((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Chronology chronology27 = dateTime11.getChronology();
        org.joda.time.DateTime dateTime30 = dateTime11.withDurationAdded((-61394288400000L), 947);
        org.joda.time.DateTime dateTime32 = dateTime30.minusWeeks(21);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period43 = org.joda.time.Period.days((-1));
        org.joda.time.Period period45 = period43.withWeeks((int) 'a');
        java.lang.String str46 = period43.toString();
        mutablePeriod41.setPeriod((org.joda.time.ReadablePeriod) period43);
        mutablePeriod41.addMonths((int) (short) -1);
        org.joda.time.Period period51 = org.joda.time.Period.days((-1));
        org.joda.time.Period period53 = period51.withWeeks((int) 'a');
        org.joda.time.Period period55 = period51.plusMonths((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType56 = null;
        boolean boolean57 = period55.isSupported(durationFieldType56);
        mutablePeriod41.add((org.joda.time.ReadablePeriod) period55);
        org.joda.time.Period period60 = period55.withMonths(1);
        org.joda.time.Period period62 = period60.withSeconds(0);
        org.joda.time.Period period63 = period60.toPeriod();
        org.joda.time.PeriodType periodType66 = null;
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval70 = mutableInterval69.toInterval();
        org.joda.time.Chronology chronology71 = interval70.getChronology();
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((long) 1, periodType66, chronology71);
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime((long) '4', chronology71);
        org.joda.time.DurationField durationField74 = chronology71.centuries();
        long long77 = durationField74.add((long) (byte) 1, (int) (short) 100);
        org.joda.time.DurationFieldType durationFieldType78 = durationField74.getType();
        long long80 = durationField74.getMillis(52L);
        long long83 = durationField74.getValueAsLong((long) '4', 53L);
        org.joda.time.DurationFieldType durationFieldType84 = durationField74.getType();
        int int85 = period60.get(durationFieldType84);
        org.joda.time.DateTime dateTime87 = dateTime32.withFieldAdded(durationFieldType84, (int) (byte) 100);
        org.joda.time.Chronology chronology88 = dateTime32.getChronology();
        org.joda.time.MutableInterval mutableInterval89 = new org.joda.time.MutableInterval(0L, (long) 365, chronology88);
        org.joda.time.DateTime dateTime90 = org.joda.time.DateTime.now(chronology88);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime92 = dateTime90.withMinuteOfHour((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "P-1D" + "'", str46, "P-1D");
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(interval70);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertNotNull(durationField74);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 315569520000001L + "'", long77 == 315569520000001L);
        org.junit.Assert.assertNotNull(durationFieldType78);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 164096150400000L + "'", long80 == 164096150400000L);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(dateTime87);
        org.junit.Assert.assertNotNull(chronology88);
        org.junit.Assert.assertNotNull(dateTime90);
    }

    @Test
    public void test14752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14752");
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
        org.joda.time.DateTime dateTime15 = dateTime10.toDateTimeISO();
        java.lang.String str16 = dateTime15.toString();
        org.joda.time.DateTime.Property property17 = dateTime15.secondOfDay();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-05T01:00:00.052+97:00" + "'", str16, "1970-01-05T01:00:00.052+97:00");
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test14753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14753");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime7 = dateTime2.withMillisOfDay((int) (byte) 1);
        org.joda.time.DateTime.Property property8 = dateTime2.weekyear();
        org.joda.time.Interval interval9 = property8.toInterval();
        java.util.Locale locale10 = null;
        int int11 = property8.getMaximumTextLength(locale10);
        org.joda.time.Interval interval12 = property8.toInterval();
        org.joda.time.DateTimeField dateTimeField13 = property8.getField();
        org.joda.time.DateTime dateTime14 = property8.withMaximumValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTime14);
    }
}
