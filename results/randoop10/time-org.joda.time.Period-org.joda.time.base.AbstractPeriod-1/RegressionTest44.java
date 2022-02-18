import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest44 {

    public static boolean debug = false;

    @Test
    public void test22001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22001");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.ZERO;
        boolean boolean2 = minutes0.isLessThan(minutes1);
        org.joda.time.Minutes minutes4 = minutes1.plus((int) (byte) 0);
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = duration6.toPeriod(periodType7, chronology9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType13 = periodType12.withMonthsRemoved();
        org.joda.time.Period period14 = duration6.toPeriodTo(readableInstant11, periodType13);
        org.joda.time.Minutes minutes15 = duration6.toStandardMinutes();
        org.joda.time.Minutes minutes17 = minutes15.multipliedBy((int) (short) -1);
        org.joda.time.Minutes minutes18 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType19 = minutes18.getPeriodType();
        org.joda.time.Minutes minutes20 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes21 = minutes18.plus(minutes20);
        org.joda.time.Minutes minutes22 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes23 = org.joda.time.Minutes.ZERO;
        boolean boolean24 = minutes22.isLessThan(minutes23);
        boolean boolean25 = minutes18.isLessThan(minutes22);
        org.joda.time.Minutes minutes27 = minutes22.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes28 = minutes27.negated();
        org.joda.time.Minutes minutes29 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType30 = minutes29.getPeriodType();
        org.joda.time.Minutes minutes31 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes32 = minutes29.plus(minutes31);
        org.joda.time.Minutes minutes33 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes34 = org.joda.time.Minutes.ZERO;
        boolean boolean35 = minutes33.isLessThan(minutes34);
        boolean boolean36 = minutes29.isLessThan(minutes33);
        org.joda.time.Duration duration37 = minutes29.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        java.lang.Object obj40 = null;
        org.joda.time.Duration duration41 = new org.joda.time.Duration(obj40);
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant39, (org.joda.time.ReadableDuration) duration41);
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant38, (org.joda.time.ReadableDuration) duration41);
        org.joda.time.Duration duration45 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType47 = periodType46.withWeeksRemoved();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Period period49 = duration45.toPeriod(periodType46, chronology48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.PeriodType periodType51 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType52 = periodType51.withMonthsRemoved();
        org.joda.time.Period period53 = duration45.toPeriodTo(readableInstant50, periodType52);
        org.joda.time.Period period54 = duration45.toPeriod();
        org.joda.time.Duration duration55 = duration41.plus((org.joda.time.ReadableDuration) duration45);
        org.joda.time.Duration duration57 = duration37.withDurationAdded((org.joda.time.ReadableDuration) duration45, 25);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.Interval interval59 = duration37.toIntervalFrom(readableInstant58);
        org.joda.time.Minutes minutes60 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval59);
        org.joda.time.Minutes minutes61 = minutes27.plus(minutes60);
        org.joda.time.Minutes minutes62 = minutes15.plus(minutes60);
        org.joda.time.Minutes minutes63 = minutes1.minus(minutes15);
        int int64 = minutes15.size();
        org.joda.time.DurationFieldType durationFieldType65 = minutes15.getFieldType();
        org.joda.time.Period period66 = new org.joda.time.Period((java.lang.Object) minutes15);
        org.joda.time.Minutes minutes68 = minutes15.plus(20);
        org.joda.time.Minutes minutes70 = minutes15.plus(107);
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(minutes60);
        org.junit.Assert.assertNotNull(minutes61);
        org.junit.Assert.assertNotNull(minutes62);
        org.junit.Assert.assertNotNull(minutes63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(durationFieldType65);
        org.junit.Assert.assertNotNull(minutes68);
        org.junit.Assert.assertNotNull(minutes70);
    }

    @Test
    public void test22002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22002");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 1, (long) (byte) 100);
        int int3 = mutablePeriod2.size();
        org.joda.time.MutablePeriod mutablePeriod4 = mutablePeriod2.copy();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(readableInstant5, readableDuration6);
        mutablePeriod7.setPeriod((long) ' ', (long) 52);
        mutablePeriod7.addDays(100);
        org.joda.time.PeriodType periodType13 = mutablePeriod7.getPeriodType();
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds16 = duration15.toStandardSeconds();
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds19 = duration18.toStandardSeconds();
        boolean boolean20 = duration15.isLongerThan((org.joda.time.ReadableDuration) duration18);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType23 = periodType22.withMinutesRemoved();
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration18, readableInstant21, periodType22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Interval interval26 = duration18.toIntervalFrom(readableInstant25);
        mutablePeriod7.add((org.joda.time.ReadableInterval) interval26);
        mutablePeriod4.add((org.joda.time.ReadableInterval) interval26);
        org.joda.time.Duration duration30 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds31 = duration30.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType32 = seconds31.getFieldType();
        org.joda.time.Seconds seconds34 = seconds31.plus(25);
        org.joda.time.Seconds seconds35 = seconds31.negated();
        org.joda.time.PeriodType periodType36 = seconds35.getPeriodType();
        org.joda.time.Period period37 = new org.joda.time.Period((java.lang.Object) interval26, periodType36);
        org.joda.time.PeriodType periodType38 = periodType36.withMinutesRemoved();
        org.joda.time.PeriodType periodType39 = periodType36.withHoursRemoved();
        java.lang.String str40 = periodType39.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertNotNull(seconds35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PeriodType[Seconds]" + "'", str40, "PeriodType[Seconds]");
    }

    @Test
    public void test22003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22003");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.standard();
        org.joda.time.Period period2 = new org.joda.time.Period((long) 8, periodType1);
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType5 = minutes4.getPeriodType();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType8);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.weekyears();
        int int11 = period9.get(durationFieldType10);
        boolean boolean12 = periodType5.isSupported(durationFieldType10);
        org.joda.time.PeriodType periodType13 = periodType5.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 3, periodType5);
        org.joda.time.Period period15 = period2.normalizedStandard(periodType5);
        int int16 = period15.getMinutes();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test22004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22004");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        org.joda.time.Period period3 = mutablePeriod2.toPeriod();
        org.joda.time.Period period5 = period3.withHours(0);
        int int6 = period3.getWeeks();
        org.joda.time.Period period8 = period3.plusSeconds((int) (byte) 100);
        org.joda.time.Period period10 = period3.minusYears(100);
        org.joda.time.PeriodType periodType11 = period3.getPeriodType();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test22005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22005");
        org.joda.time.Period period1 = org.joda.time.Period.years(107);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period7 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days8 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period10 = period7.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period12 = period10.normalizedStandard(periodType11);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(readableInstant4, readableInstant5, periodType11);
        org.joda.time.PeriodType periodType14 = periodType11.withYearsRemoved();
        org.joda.time.Period period15 = new org.joda.time.Period((-1L), 60000L, periodType14);
        org.joda.time.PeriodType periodType16 = periodType14.withHoursRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period17 = new org.joda.time.Period((java.lang.Object) 107, periodType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test22006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22006");
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period6 = period3.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period8 = period6.normalizedStandard(periodType7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(1L, 1L, periodType7, chronology9);
        org.joda.time.Period period12 = org.joda.time.Period.months((-2147483648));
        org.joda.time.Period period14 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period16 = period14.withHours(32);
        org.joda.time.PeriodType periodType17 = period14.getPeriodType();
        org.joda.time.Period period18 = period12.plus((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Period period20 = period18.plusMonths(10);
        org.joda.time.Minutes minutes22 = org.joda.time.Minutes.minutes((-1));
        int int23 = minutes22.getMinutes();
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.weekyears();
        java.lang.String str25 = durationFieldType24.getName();
        java.lang.String str26 = durationFieldType24.getName();
        java.lang.String str27 = durationFieldType24.toString();
        boolean boolean28 = minutes22.isSupported(durationFieldType24);
        java.lang.String str29 = durationFieldType24.toString();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DurationField durationField31 = durationFieldType24.getField(chronology30);
        int int32 = period20.get(durationFieldType24);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod10.add(durationFieldType24, 793);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weekyears'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "weekyears" + "'", str25, "weekyears");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "weekyears" + "'", str26, "weekyears");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "weekyears" + "'", str27, "weekyears");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "weekyears" + "'", str29, "weekyears");
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test22007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22007");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (-637));
        org.joda.time.MutablePeriod mutablePeriod2 = period1.toMutablePeriod();
        org.joda.time.Period period3 = period1.toPeriod();
        org.joda.time.format.PeriodPrinter periodPrinter4 = null;
        org.joda.time.format.PeriodParser periodParser5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = new org.joda.time.format.PeriodFormatter(periodPrinter4, periodParser5);
        org.joda.time.PeriodType periodType7 = periodFormatter6.getParseType();
        org.joda.time.format.PeriodParser periodParser8 = periodFormatter6.getParser();
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardMinutes((long) 10);
        java.lang.String str13 = duration12.toString();
        org.joda.time.Duration duration15 = duration12.minus((long) (byte) 10);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Minutes minutes17 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType18 = minutes17.getPeriodType();
        org.joda.time.PeriodType periodType19 = periodType18.withSecondsRemoved();
        org.joda.time.Period period20 = duration15.toPeriodFrom(readableInstant16, periodType18);
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 0, (long) 3, periodType18);
        org.joda.time.PeriodType periodType22 = periodType18.withMonthsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter23 = periodFormatter6.withParseType(periodType22);
        java.util.Locale locale24 = null;
        org.joda.time.format.PeriodFormatter periodFormatter25 = periodFormatter6.withLocale(locale24);
        org.joda.time.PeriodType periodType26 = periodFormatter6.getParseType();
        java.util.Locale locale27 = null;
        org.joda.time.format.PeriodFormatter periodFormatter28 = periodFormatter6.withLocale(locale27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = period1.toString(periodFormatter28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNull(periodType7);
        org.junit.Assert.assertNull(periodParser8);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT600S" + "'", str13, "PT600S");
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodFormatter23);
        org.junit.Assert.assertNotNull(periodFormatter25);
        org.junit.Assert.assertNull(periodType26);
        org.junit.Assert.assertNotNull(periodFormatter28);
    }

    @Test
    public void test22008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22008");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Duration duration8 = duration1.minus((long) 3);
        org.joda.time.Duration duration9 = duration1.toDuration();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Interval interval11 = duration9.toIntervalFrom(readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds15 = duration14.toStandardSeconds();
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds18 = duration17.toStandardSeconds();
        boolean boolean19 = duration14.isLongerThan((org.joda.time.ReadableDuration) duration17);
        org.joda.time.Period period20 = duration14.toPeriod();
        org.joda.time.Period period21 = period20.negated();
        org.joda.time.Seconds seconds22 = period21.toStandardSeconds();
        org.joda.time.Period period23 = period21.negated();
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period21.toDurationTo(readableInstant24);
        org.joda.time.DurationFieldType[] durationFieldTypeArray26 = period21.getFieldTypes();
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.forFields(durationFieldTypeArray26);
        org.joda.time.PeriodType periodType28 = periodType27.withDaysRemoved();
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration9, readableInstant12, periodType27);
        org.joda.time.Duration duration32 = duration9.withDurationAdded(41L, (int) (short) -1);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = duration32.toPeriod(chronology33);
        org.joda.time.Duration duration36 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds37 = duration36.toStandardSeconds();
        java.lang.String str38 = seconds37.toString();
        org.joda.time.DurationFieldType durationFieldType39 = org.joda.time.DurationFieldType.days();
        boolean boolean40 = seconds37.isSupported(durationFieldType39);
        org.joda.time.DurationFieldType durationFieldType41 = seconds37.getFieldType();
        org.joda.time.Period period43 = period34.withFieldAdded(durationFieldType41, 75);
        org.joda.time.Period period44 = period34.negated();
        org.joda.time.Period period46 = period44.plusYears(4);
        int int47 = period46.getMinutes();
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.Period period49 = period46.plus(readablePeriod48);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours50 = period49.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(durationFieldTypeArray26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(seconds37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PT60S" + "'", str38, "PT60S");
        org.junit.Assert.assertNotNull(durationFieldType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(period49);
    }

    @Test
    public void test22009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22009");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 32, (long) 3, chronology2);
        org.joda.time.Period period5 = period3.withSeconds(0);
        org.joda.time.Period period7 = period3.plusMillis((int) '4');
        int int8 = period3.getMillis();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) (short) -1, (int) '#', (int) ' ', 100);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.days();
        int int15 = mutablePeriod13.get(durationFieldType14);
        org.joda.time.Hours hours16 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.Hours hours18 = hours16.dividedBy((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(readableInstant19, readableDuration20);
        org.joda.time.Period period22 = mutablePeriod21.toPeriod();
        org.joda.time.Period period24 = period22.withHours(0);
        org.joda.time.Hours hours25 = period24.toStandardHours();
        org.joda.time.Hours hours26 = hours18.minus(hours25);
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType30 = periodType29.withWeeksRemoved();
        org.joda.time.PeriodType periodType31 = periodType30.withDaysRemoved();
        org.joda.time.Period period32 = new org.joda.time.Period((long) 'a', (long) (short) 0, periodType31);
        org.joda.time.Hours hours33 = period32.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType34 = hours33.getFieldType();
        boolean boolean35 = hours25.isLessThan(hours33);
        org.joda.time.PeriodType periodType36 = hours25.getPeriodType();
        org.joda.time.PeriodType periodType37 = periodType36.withMinutesRemoved();
        org.joda.time.PeriodType periodType38 = periodType37.withMinutesRemoved();
        org.joda.time.Chronology chronology39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period40 = new org.joda.time.Period((java.lang.Object) int8, periodType38, chronology39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-29) + "'", int8 == (-29));
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(hours33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(periodType38);
    }

    @Test
    public void test22010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22010");
        org.joda.time.Days days5 = org.joda.time.Days.ZERO;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((java.lang.Object) days5, periodType6, chronology7);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 52, periodType6);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 7, (-60L), periodType6);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 6, (long) (-2), periodType6, chronology11);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod12.setHours((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test22011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22011");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1);
        mutablePeriod2.setPeriod(1L, (long) (byte) 100);
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.ZERO;
        org.joda.time.PeriodType periodType7 = seconds6.getPeriodType();
        java.lang.String str8 = seconds6.toString();
        org.joda.time.Seconds seconds10 = seconds6.plus((int) (short) 1);
        int int11 = seconds10.getSeconds();
        mutablePeriod2.add((org.joda.time.ReadablePeriod) seconds10);
        mutablePeriod2.setMinutes(8);
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds17 = duration16.toStandardSeconds();
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds20 = duration19.toStandardSeconds();
        boolean boolean21 = duration16.isLongerThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds24 = duration23.toStandardSeconds();
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds27 = duration26.toStandardSeconds();
        boolean boolean28 = duration23.isLongerThan((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Period period29 = duration23.toPeriod();
        boolean boolean30 = duration19.isLongerThan((org.joda.time.ReadableDuration) duration23);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = duration19.toPeriodTo(readableInstant31);
        long long33 = duration19.getStandardDays();
        org.joda.time.format.PeriodPrinter periodPrinter34 = null;
        org.joda.time.format.PeriodParser periodParser35 = null;
        org.joda.time.format.PeriodFormatter periodFormatter36 = new org.joda.time.format.PeriodFormatter(periodPrinter34, periodParser35);
        org.joda.time.format.PeriodParser periodParser37 = periodFormatter36.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter38 = periodFormatter36.getPrinter();
        java.util.Locale locale39 = null;
        org.joda.time.format.PeriodFormatter periodFormatter40 = periodFormatter36.withLocale(locale39);
        java.util.Locale locale41 = null;
        org.joda.time.format.PeriodFormatter periodFormatter42 = periodFormatter40.withLocale(locale41);
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.hours();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(periodType43);
        org.joda.time.format.PeriodFormatter periodFormatter45 = periodFormatter40.withParseType(periodType43);
        org.joda.time.Period period46 = duration19.toPeriod(periodType43);
        long long47 = duration19.getStandardMinutes();
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration19);
        long long49 = duration19.getStandardHours();
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration52 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds53 = duration52.toStandardSeconds();
        org.joda.time.Duration duration55 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds56 = duration55.toStandardSeconds();
        boolean boolean57 = duration52.isLongerThan((org.joda.time.ReadableDuration) duration55);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.PeriodType periodType59 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType60 = periodType59.withMinutesRemoved();
        org.joda.time.Period period61 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration55, readableInstant58, periodType59);
        org.joda.time.Period period62 = new org.joda.time.Period(readableInstant50, (org.joda.time.ReadableDuration) duration55);
        org.joda.time.Duration duration63 = duration55.toDuration();
        org.joda.time.Duration duration64 = duration63.toDuration();
        int int65 = duration19.compareTo((org.joda.time.ReadableDuration) duration63);
        org.joda.time.Duration duration67 = org.joda.time.Duration.standardMinutes((long) 25);
        java.lang.String str68 = duration67.toString();
        org.joda.time.Duration duration69 = duration67.toDuration();
        int int70 = duration63.compareTo((org.joda.time.ReadableDuration) duration69);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT0S" + "'", str8, "PT0S");
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNull(periodParser37);
        org.junit.Assert.assertNull(periodPrinter38);
        org.junit.Assert.assertNotNull(periodFormatter40);
        org.junit.Assert.assertNotNull(periodFormatter42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(periodFormatter45);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(seconds53);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(seconds56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "PT1500S" + "'", str68, "PT1500S");
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
    }

    @Test
    public void test22012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22012");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = duration1.toPeriod(periodType2, chronology4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType8 = periodType7.withMonthsRemoved();
        org.joda.time.Period period9 = duration1.toPeriodTo(readableInstant6, periodType8);
        org.joda.time.Minutes minutes10 = duration1.toStandardMinutes();
        org.joda.time.Minutes minutes12 = minutes10.multipliedBy((int) (short) -1);
        org.joda.time.Minutes minutes13 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType14 = minutes13.getPeriodType();
        org.joda.time.Minutes minutes15 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes16 = minutes13.plus(minutes15);
        org.joda.time.Minutes minutes17 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes18 = org.joda.time.Minutes.ZERO;
        boolean boolean19 = minutes17.isLessThan(minutes18);
        boolean boolean20 = minutes13.isLessThan(minutes17);
        org.joda.time.Minutes minutes22 = minutes17.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes24 = minutes22.multipliedBy(54);
        org.joda.time.Minutes minutes25 = null;
        boolean boolean26 = minutes24.isGreaterThan(minutes25);
        org.joda.time.Duration duration27 = minutes24.toStandardDuration();
        boolean boolean28 = minutes10.isLessThan(minutes24);
        int int29 = minutes24.size();
        org.joda.time.PeriodType periodType30 = minutes24.getPeriodType();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(periodType30);
    }

    @Test
    public void test22013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22013");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType3 = periodType2.withDaysRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withMonthsRemoved();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(600L, periodType4, chronology5);
        org.joda.time.PeriodType periodType7 = periodType4.withSecondsRemoved();
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.weekyears();
        java.lang.String str9 = durationFieldType8.toString();
        int int10 = periodType7.indexOf(durationFieldType8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(25200000L, periodType7, chronology11);
        org.joda.time.Duration duration13 = new org.joda.time.Duration((java.lang.Object) 25200000L);
        org.joda.time.Period period14 = duration13.toPeriod();
        int int15 = period14.getWeeks();
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds18 = duration17.toStandardSeconds();
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds21 = duration20.toStandardSeconds();
        boolean boolean22 = duration17.isLongerThan((org.joda.time.ReadableDuration) duration20);
        org.joda.time.Duration duration24 = duration17.minus((long) 3);
        org.joda.time.Duration duration25 = duration17.toDuration();
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Interval interval27 = duration25.toIntervalFrom(readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration30 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds31 = duration30.toStandardSeconds();
        org.joda.time.Duration duration33 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds34 = duration33.toStandardSeconds();
        boolean boolean35 = duration30.isLongerThan((org.joda.time.ReadableDuration) duration33);
        org.joda.time.Period period36 = duration30.toPeriod();
        org.joda.time.Period period37 = period36.negated();
        org.joda.time.Seconds seconds38 = period37.toStandardSeconds();
        org.joda.time.Period period39 = period37.negated();
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = period37.toDurationTo(readableInstant40);
        org.joda.time.DurationFieldType[] durationFieldTypeArray42 = period37.getFieldTypes();
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.forFields(durationFieldTypeArray42);
        org.joda.time.PeriodType periodType44 = periodType43.withDaysRemoved();
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration25, readableInstant28, periodType43);
        org.joda.time.Seconds seconds46 = duration25.toStandardSeconds();
        org.joda.time.MutablePeriod mutablePeriod47 = seconds46.toMutablePeriod();
        mutablePeriod47.addHours(6);
        mutablePeriod47.setPeriod((-7L));
        org.joda.time.Period period52 = period14.minus((org.joda.time.ReadablePeriod) mutablePeriod47);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "weekyears" + "'", str9, "weekyears");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(seconds38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(durationFieldTypeArray42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(seconds46);
        org.junit.Assert.assertNotNull(mutablePeriod47);
        org.junit.Assert.assertNotNull(period52);
    }

    @Test
    public void test22014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22014");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.TWO;
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeksIn(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.weeksIn(readableInterval3);
        boolean boolean5 = weeks2.isLessThan(weeks4);
        org.joda.time.Weeks weeks6 = weeks2.negated();
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.Weeks weeks8 = org.joda.time.Weeks.weeksIn(readableInterval7);
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Weeks weeks10 = org.joda.time.Weeks.weeksIn(readableInterval9);
        boolean boolean11 = weeks8.isLessThan(weeks10);
        org.joda.time.Weeks weeks12 = weeks8.negated();
        org.joda.time.Weeks weeks14 = weeks12.minus((int) (byte) 100);
        org.joda.time.Weeks weeks15 = weeks6.plus(weeks12);
        boolean boolean16 = weeks0.isLessThan(weeks12);
        org.joda.time.Weeks weeks18 = weeks0.plus(25);
        org.joda.time.DurationFieldType durationFieldType19 = weeks18.getFieldType();
        org.joda.time.Weeks weeks21 = weeks18.multipliedBy((int) (short) 100);
        org.joda.time.DurationFieldType durationFieldType22 = weeks21.getFieldType();
        java.lang.String str23 = durationFieldType22.toString();
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "weeks" + "'", str23, "weeks");
    }

    @Test
    public void test22015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22015");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(600, (-2), 60, 10);
        mutablePeriod4.addMonths((-637));
    }

    @Test
    public void test22016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22016");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.PeriodType periodType5 = periodFormatter2.getParseType();
        java.util.Locale locale6 = null;
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withLocale(locale6);
        org.joda.time.Period period9 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days10 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period9);
        org.joda.time.PeriodType periodType11 = days10.getPeriodType();
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(readableInstant12, readableDuration13);
        mutablePeriod14.setHours((int) (short) 100);
        boolean boolean17 = periodType11.equals((java.lang.Object) mutablePeriod14);
        org.joda.time.PeriodType periodType18 = periodType11.withYearsRemoved();
        int int19 = periodType18.size();
        org.joda.time.format.PeriodFormatter periodFormatter20 = periodFormatter7.withParseType(periodType18);
        org.joda.time.PeriodType periodType21 = periodFormatter20.getParseType();
        boolean boolean22 = periodFormatter20.isParser();
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNull(periodType5);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(periodFormatter20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test22017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22017");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        mutablePeriod2.setPeriod((long) ' ', (long) 52);
        mutablePeriod2.addDays(100);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType10 = periodType8.getFieldType(2);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DurationField durationField12 = durationFieldType10.getField(chronology11);
        mutablePeriod2.add(durationFieldType10, (-32));
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = mutablePeriod2.toDurationFrom(readableInstant15);
        org.joda.time.ReadableInterval readableInterval17 = null;
        org.joda.time.Weeks weeks18 = org.joda.time.Weeks.weeksIn(readableInterval17);
        org.joda.time.ReadableInterval readableInterval19 = null;
        org.joda.time.Weeks weeks20 = org.joda.time.Weeks.weeksIn(readableInterval19);
        boolean boolean21 = weeks18.isLessThan(weeks20);
        org.joda.time.Weeks weeks22 = weeks18.negated();
        org.joda.time.Weeks weeks24 = weeks22.minus((int) (byte) 100);
        org.joda.time.ReadableInterval readableInterval25 = null;
        org.joda.time.Weeks weeks26 = org.joda.time.Weeks.weeksIn(readableInterval25);
        org.joda.time.ReadableInterval readableInterval27 = null;
        org.joda.time.Weeks weeks28 = org.joda.time.Weeks.weeksIn(readableInterval27);
        boolean boolean29 = weeks26.isLessThan(weeks28);
        org.joda.time.Weeks weeks31 = weeks28.minus((int) (short) -1);
        org.joda.time.Weeks weeks33 = weeks31.multipliedBy(0);
        boolean boolean34 = weeks24.isGreaterThan(weeks33);
        org.joda.time.Period period39 = new org.joda.time.Period(0, (int) '4', (int) (short) 100, (int) (byte) -1);
        org.joda.time.Period period41 = period39.withDays((int) 'a');
        org.joda.time.Weeks weeks42 = period41.toStandardWeeks();
        int int43 = weeks42.getWeeks();
        org.joda.time.ReadableInterval readableInterval44 = null;
        org.joda.time.Weeks weeks45 = org.joda.time.Weeks.weeksIn(readableInterval44);
        org.joda.time.ReadableInterval readableInterval46 = null;
        org.joda.time.Weeks weeks47 = org.joda.time.Weeks.weeksIn(readableInterval46);
        boolean boolean48 = weeks45.isLessThan(weeks47);
        org.joda.time.Weeks weeks50 = weeks47.minus((int) (short) -1);
        org.joda.time.Weeks weeks51 = weeks50.negated();
        org.joda.time.Weeks weeks53 = weeks50.multipliedBy(0);
        boolean boolean54 = weeks42.isGreaterThan(weeks53);
        org.joda.time.Weeks weeks55 = weeks33.minus(weeks42);
        org.joda.time.ReadableInterval readableInterval56 = null;
        org.joda.time.Weeks weeks57 = org.joda.time.Weeks.weeksIn(readableInterval56);
        org.joda.time.Weeks weeks59 = weeks57.multipliedBy((int) (byte) 100);
        org.joda.time.Weeks weeks60 = weeks42.plus(weeks59);
        org.joda.time.Weeks weeks62 = weeks59.multipliedBy((int) 'a');
        org.joda.time.Duration duration63 = weeks62.toStandardDuration();
        boolean boolean64 = duration16.equals((java.lang.Object) duration63);
        org.joda.time.PeriodType periodType68 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType69 = periodType68.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) (-1), periodType69);
        org.joda.time.PeriodType periodType71 = periodType69.withWeeksRemoved();
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((long) (byte) -1, 0L, periodType71, chronology72);
        boolean boolean74 = duration63.equals((java.lang.Object) chronology72);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(weeks31);
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(weeks42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 13 + "'", int43 == 13);
        org.junit.Assert.assertNotNull(weeks45);
        org.junit.Assert.assertNotNull(weeks47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(weeks50);
        org.junit.Assert.assertNotNull(weeks51);
        org.junit.Assert.assertNotNull(weeks53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(weeks55);
        org.junit.Assert.assertNotNull(weeks57);
        org.junit.Assert.assertNotNull(weeks59);
        org.junit.Assert.assertNotNull(weeks60);
        org.junit.Assert.assertNotNull(weeks62);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertNotNull(periodType69);
        org.junit.Assert.assertNotNull(periodType71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test22018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22018");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT0.001S");
        org.joda.time.Period period3 = period1.withMillis((-609));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test22019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22019");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period3 = period1.minusWeeks(52);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period5 = period1.toPeriod();
        java.lang.String str6 = period5.toString();
        org.joda.time.Period period8 = period5.minusSeconds(54);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.Period period11 = duration10.toPeriod();
        org.joda.time.Seconds seconds12 = duration10.toStandardSeconds();
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds15 = duration14.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType16 = seconds15.getFieldType();
        org.joda.time.Seconds seconds18 = seconds15.plus(25);
        boolean boolean19 = seconds12.isLessThan(seconds18);
        org.joda.time.Seconds seconds20 = seconds18.negated();
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds23 = duration22.toStandardSeconds();
        java.lang.String str24 = seconds23.toString();
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds27 = duration26.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType28 = seconds27.getFieldType();
        org.joda.time.Seconds seconds30 = org.joda.time.Seconds.parseSeconds("P0W");
        org.joda.time.Seconds seconds31 = seconds27.minus(seconds30);
        org.joda.time.Seconds seconds32 = seconds27.negated();
        java.lang.String str33 = seconds32.toString();
        org.joda.time.Seconds seconds34 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) seconds32);
        org.joda.time.Duration duration35 = seconds34.toStandardDuration();
        boolean boolean36 = seconds23.isGreaterThan(seconds34);
        org.joda.time.Seconds seconds37 = seconds20.minus(seconds23);
        org.joda.time.Seconds seconds38 = org.joda.time.Seconds.ZERO;
        org.joda.time.PeriodType periodType39 = seconds38.getPeriodType();
        java.lang.String str40 = seconds38.toString();
        org.joda.time.Seconds seconds42 = seconds38.plus((int) (short) 1);
        org.joda.time.Seconds seconds44 = org.joda.time.Seconds.seconds(100);
        org.joda.time.Seconds seconds45 = org.joda.time.Seconds.TWO;
        org.joda.time.DurationFieldType durationFieldType46 = seconds45.getFieldType();
        boolean boolean47 = seconds44.isGreaterThan(seconds45);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod50.addYears((int) '4');
        org.joda.time.Chronology chronology54 = null;
        mutablePeriod50.add((long) 100, chronology54);
        org.joda.time.Duration duration57 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds58 = duration57.toStandardSeconds();
        java.lang.String str59 = seconds58.toString();
        org.joda.time.DurationFieldType durationFieldType60 = org.joda.time.DurationFieldType.days();
        boolean boolean61 = seconds58.isSupported(durationFieldType60);
        int int62 = mutablePeriod50.get(durationFieldType60);
        boolean boolean63 = seconds45.isSupported(durationFieldType60);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((java.lang.Object) seconds45, chronology64);
        boolean boolean66 = seconds38.isLessThan(seconds45);
        org.joda.time.PeriodType periodType67 = seconds38.getPeriodType();
        org.joda.time.Seconds seconds68 = org.joda.time.Seconds.TWO;
        org.joda.time.Duration duration69 = seconds68.toStandardDuration();
        boolean boolean70 = seconds38.isLessThan(seconds68);
        org.joda.time.Seconds seconds71 = seconds23.plus(seconds38);
        org.joda.time.PeriodType periodType72 = seconds38.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period73 = period5.withPeriodType(periodType72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT1M" + "'", str6, "PT1M");
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT60S" + "'", str24, "PT60S");
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PT-60S" + "'", str33, "PT-60S");
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(seconds37);
        org.junit.Assert.assertNotNull(seconds38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PT0S" + "'", str40, "PT0S");
        org.junit.Assert.assertNotNull(seconds42);
        org.junit.Assert.assertNotNull(seconds44);
        org.junit.Assert.assertNotNull(seconds45);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(seconds58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "PT60S" + "'", str59, "PT60S");
        org.junit.Assert.assertNotNull(durationFieldType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(periodType67);
        org.junit.Assert.assertNotNull(seconds68);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(seconds71);
        org.junit.Assert.assertNotNull(periodType72);
    }

    @Test
    public void test22020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22020");
        java.lang.Object obj2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType4 = periodType3.withWeeksRemoved();
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.weeksIn(readableInterval5);
        org.joda.time.Weeks weeks8 = weeks6.multipliedBy((int) (short) 10);
        org.joda.time.Weeks weeks10 = weeks6.dividedBy((int) 'a');
        java.lang.String str11 = weeks6.toString();
        boolean boolean12 = periodType3.equals((java.lang.Object) str11);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(obj2, periodType3);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 32, (-539000L), periodType3, chronology14);
        org.joda.time.PeriodType periodType16 = periodType3.withDaysRemoved();
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0W" + "'", str11, "P0W");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test22021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22021");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, readableInstant2, periodType3);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        mutablePeriod5.setPeriod(readableInstant6, readableInstant7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((java.lang.Object) mutablePeriod5, chronology9);
        mutablePeriod5.setPeriod(0L);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test22022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22022");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        int int8 = days2.size();
        org.joda.time.Days days9 = days2.negated();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) days9, chronology10);
        org.joda.time.Period period13 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days14 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period16 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days17 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period16);
        org.joda.time.PeriodType periodType18 = days17.getPeriodType();
        boolean boolean19 = days14.isGreaterThan(days17);
        org.joda.time.MutablePeriod mutablePeriod20 = days14.toMutablePeriod();
        org.joda.time.Days days21 = days14.negated();
        boolean boolean22 = days9.isLessThan(days14);
        org.joda.time.MutablePeriod mutablePeriod23 = days9.toMutablePeriod();
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardDays(0L);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Interval interval27 = duration25.toIntervalFrom(readableInstant26);
        mutablePeriod23.setPeriod((org.joda.time.ReadableInterval) interval27);
        int int29 = mutablePeriod23.getDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(mutablePeriod20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(mutablePeriod23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test22023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22023");
        org.joda.time.Days days1 = org.joda.time.Days.days((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.ZERO;
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Days days7 = days5.minus(10);
        boolean boolean8 = days2.isGreaterThan(days5);
        boolean boolean9 = days1.isLessThan(days2);
        org.joda.time.MutablePeriod mutablePeriod10 = days2.toMutablePeriod();
        java.lang.String str11 = days2.toString();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0D" + "'", str11, "P0D");
    }

    @Test
    public void test22024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22024");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period5 = period3.withHours(32);
        org.joda.time.Period period6 = period3.normalizedStandard();
        java.lang.String str7 = period6.toString();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period9 = period6.normalizedStandard(periodType8);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType8);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod10.addMinutes((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT0.052S" + "'", str7, "PT0.052S");
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test22025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22025");
        org.joda.time.Period period1 = org.joda.time.Period.hours((-32));
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        long long4 = duration3.getMillis();
        long long5 = duration3.getStandardMinutes();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        java.lang.Object obj9 = null;
        org.joda.time.Duration duration10 = new org.joda.time.Duration(obj9);
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant8, (org.joda.time.ReadableDuration) duration10);
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant7, (org.joda.time.ReadableDuration) duration10);
        org.joda.time.Duration duration13 = duration10.toDuration();
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant6, (org.joda.time.ReadableDuration) duration13);
        org.joda.time.Duration duration16 = duration3.withDurationAdded((org.joda.time.ReadableDuration) duration13, 10);
        org.joda.time.Days days17 = duration16.toStandardDays();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((java.lang.Object) days17, chronology18);
        org.joda.time.Period period21 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days22 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period21);
        org.joda.time.PeriodType periodType23 = days22.getPeriodType();
        org.joda.time.Period period25 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days26 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Period period28 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days29 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period28);
        org.joda.time.PeriodType periodType30 = days29.getPeriodType();
        boolean boolean31 = days26.isGreaterThan(days29);
        org.joda.time.Period period33 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days34 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period33);
        org.joda.time.Days days35 = days29.minus(days34);
        org.joda.time.Period period37 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days38 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period37);
        org.joda.time.Days days40 = days38.minus(10);
        org.joda.time.Days days41 = days29.plus(days38);
        org.joda.time.Days days43 = days41.dividedBy(100);
        org.joda.time.Days days44 = null;
        org.joda.time.Days days45 = days43.plus(days44);
        org.joda.time.Days days46 = days43.negated();
        boolean boolean47 = days22.isGreaterThan(days46);
        org.joda.time.Days days49 = days46.minus((int) (byte) 10);
        org.joda.time.Duration duration51 = org.joda.time.Duration.millis(0L);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        java.lang.Object obj54 = null;
        org.joda.time.Duration duration55 = new org.joda.time.Duration(obj54);
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant53, (org.joda.time.ReadableDuration) duration55);
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant52, (org.joda.time.ReadableDuration) duration55);
        long long58 = duration55.getMillis();
        boolean boolean59 = duration51.isLongerThan((org.joda.time.ReadableDuration) duration55);
        org.joda.time.Days days60 = duration51.toStandardDays();
        org.joda.time.Days days61 = days49.plus(days60);
        org.joda.time.DurationFieldType durationFieldType62 = days60.getFieldType();
        int int63 = period19.indexOf(durationFieldType62);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115200000L) + "'", long4 == (-115200000L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1920L) + "'", long5 == (-1920L));
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertNotNull(days35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertNotNull(days40);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertNotNull(days43);
        org.junit.Assert.assertNotNull(days45);
        org.junit.Assert.assertNotNull(days46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(days49);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(days60);
        org.junit.Assert.assertNotNull(days61);
        org.junit.Assert.assertNotNull(durationFieldType62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test22026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22026");
        org.joda.time.Period period1 = org.joda.time.Period.hours(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(readableInstant2, readableDuration3);
        org.joda.time.Period period5 = mutablePeriod4.toPeriod();
        org.joda.time.Period period7 = period5.withHours(0);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.days();
        int int9 = period5.indexOf(durationFieldType8);
        int int10 = period1.indexOf(durationFieldType8);
        org.joda.time.Period period12 = period1.withMillis(5);
        org.joda.time.ReadableInterval readableInterval13 = null;
        org.joda.time.Weeks weeks14 = org.joda.time.Weeks.weeksIn(readableInterval13);
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.Weeks weeks16 = org.joda.time.Weeks.weeksIn(readableInterval15);
        boolean boolean17 = weeks14.isLessThan(weeks16);
        org.joda.time.Weeks weeks19 = weeks16.minus((int) (short) -1);
        org.joda.time.Weeks weeks20 = weeks19.negated();
        org.joda.time.Weeks weeks22 = weeks19.multipliedBy(0);
        org.joda.time.Weeks weeks24 = weeks22.multipliedBy(0);
        org.joda.time.Weeks weeks26 = weeks22.plus((int) '4');
        int int27 = weeks26.size();
        java.lang.String str28 = weeks26.toString();
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType31 = periodType30.withMonthsRemoved();
        org.joda.time.PeriodType periodType32 = periodType31.withMinutesRemoved();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) (short) 0, periodType31, chronology33);
        org.joda.time.PeriodType periodType35 = periodType31.withMinutesRemoved();
        org.joda.time.Period period36 = new org.joda.time.Period((java.lang.Object) str28, periodType35);
        org.joda.time.PeriodType periodType37 = periodType35.withMillisRemoved();
        org.joda.time.Period period38 = period1.normalizedStandard(periodType37);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "P52W" + "'", str28, "P52W");
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(period38);
    }

    @Test
    public void test22027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22027");
        org.joda.time.format.PeriodPrinter periodPrinter2 = null;
        org.joda.time.format.PeriodParser periodParser3 = null;
        org.joda.time.format.PeriodFormatter periodFormatter4 = new org.joda.time.format.PeriodFormatter(periodPrinter2, periodParser3);
        org.joda.time.format.PeriodParser periodParser5 = periodFormatter4.getParser();
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds8 = duration7.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType9 = seconds8.getFieldType();
        org.joda.time.Seconds seconds11 = seconds8.plus(25);
        org.joda.time.Seconds seconds12 = seconds8.negated();
        org.joda.time.PeriodType periodType13 = seconds12.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter14 = periodFormatter4.withParseType(periodType13);
        org.joda.time.PeriodType periodType15 = periodType13.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) (byte) 1, (-60L), periodType13);
        int int17 = mutablePeriod16.getMinutes();
        org.joda.time.Period period19 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period21 = period19.withMillis((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 25);
        org.joda.time.Minutes minutes24 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) mutablePeriod23);
        org.joda.time.Minutes minutes26 = minutes24.multipliedBy(3);
        org.joda.time.DurationFieldType durationFieldType27 = minutes26.getFieldType();
        org.joda.time.Period period29 = period21.withField(durationFieldType27, 40);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod16.mergePeriod((org.joda.time.ReadablePeriod) period21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodFormatter14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertNotNull(period29);
    }

    @Test
    public void test22028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22028");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        boolean boolean4 = weeks1.isLessThan(weeks3);
        org.joda.time.Weeks weeks5 = weeks1.negated();
        org.joda.time.Weeks weeks7 = weeks5.minus((int) (byte) 100);
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.Weeks weeks9 = org.joda.time.Weeks.weeksIn(readableInterval8);
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.Weeks weeks11 = org.joda.time.Weeks.weeksIn(readableInterval10);
        boolean boolean12 = weeks9.isLessThan(weeks11);
        org.joda.time.Weeks weeks14 = weeks11.minus((int) (short) -1);
        org.joda.time.Weeks weeks16 = weeks14.multipliedBy(0);
        boolean boolean17 = weeks7.isGreaterThan(weeks16);
        org.joda.time.Period period22 = new org.joda.time.Period(0, (int) '4', (int) (short) 100, (int) (byte) -1);
        org.joda.time.Period period24 = period22.withDays((int) 'a');
        org.joda.time.Weeks weeks25 = period24.toStandardWeeks();
        int int26 = weeks25.getWeeks();
        org.joda.time.ReadableInterval readableInterval27 = null;
        org.joda.time.Weeks weeks28 = org.joda.time.Weeks.weeksIn(readableInterval27);
        org.joda.time.ReadableInterval readableInterval29 = null;
        org.joda.time.Weeks weeks30 = org.joda.time.Weeks.weeksIn(readableInterval29);
        boolean boolean31 = weeks28.isLessThan(weeks30);
        org.joda.time.Weeks weeks33 = weeks30.minus((int) (short) -1);
        org.joda.time.Weeks weeks34 = weeks33.negated();
        org.joda.time.Weeks weeks36 = weeks33.multipliedBy(0);
        boolean boolean37 = weeks25.isGreaterThan(weeks36);
        org.joda.time.Weeks weeks38 = weeks16.minus(weeks25);
        org.joda.time.ReadableInterval readableInterval39 = null;
        org.joda.time.Weeks weeks40 = org.joda.time.Weeks.weeksIn(readableInterval39);
        org.joda.time.Weeks weeks42 = weeks40.multipliedBy((int) (byte) 100);
        org.joda.time.Weeks weeks43 = weeks25.plus(weeks42);
        org.joda.time.Weeks weeks45 = weeks42.multipliedBy((int) 'a');
        org.joda.time.ReadableInterval readableInterval46 = null;
        org.joda.time.Weeks weeks47 = org.joda.time.Weeks.weeksIn(readableInterval46);
        org.joda.time.ReadableInterval readableInterval48 = null;
        org.joda.time.Weeks weeks49 = org.joda.time.Weeks.weeksIn(readableInterval48);
        boolean boolean50 = weeks47.isLessThan(weeks49);
        org.joda.time.Weeks weeks51 = weeks47.negated();
        org.joda.time.ReadableInterval readableInterval52 = null;
        org.joda.time.Weeks weeks53 = org.joda.time.Weeks.weeksIn(readableInterval52);
        org.joda.time.ReadableInterval readableInterval54 = null;
        org.joda.time.Weeks weeks55 = org.joda.time.Weeks.weeksIn(readableInterval54);
        boolean boolean56 = weeks53.isLessThan(weeks55);
        org.joda.time.Weeks weeks57 = weeks53.negated();
        org.joda.time.Weeks weeks59 = weeks57.minus((int) (byte) 100);
        org.joda.time.Weeks weeks60 = weeks51.plus(weeks57);
        org.joda.time.Weeks weeks61 = null;
        org.joda.time.Weeks weeks62 = weeks51.plus(weeks61);
        org.joda.time.Weeks weeks64 = weeks62.multipliedBy((int) ' ');
        org.joda.time.ReadableInterval readableInterval65 = null;
        org.joda.time.Weeks weeks66 = org.joda.time.Weeks.weeksIn(readableInterval65);
        org.joda.time.Weeks weeks68 = weeks66.multipliedBy(8);
        org.joda.time.Weeks weeks70 = weeks68.plus((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType71 = null;
        int int72 = weeks70.get(durationFieldType71);
        org.joda.time.DurationFieldType durationFieldType73 = weeks70.getFieldType();
        org.joda.time.ReadableInterval readableInterval74 = null;
        org.joda.time.Weeks weeks75 = org.joda.time.Weeks.weeksIn(readableInterval74);
        org.joda.time.Weeks weeks77 = weeks75.multipliedBy((int) (short) 10);
        org.joda.time.Weeks weeks79 = weeks75.dividedBy((int) 'a');
        org.joda.time.Weeks weeks81 = weeks79.multipliedBy((-60));
        org.joda.time.MutablePeriod mutablePeriod82 = weeks81.toMutablePeriod();
        org.joda.time.PeriodType periodType83 = weeks81.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((java.lang.Object) weeks70, periodType83);
        boolean boolean85 = weeks62.isGreaterThan(weeks70);
        boolean boolean86 = weeks42.isGreaterThan(weeks62);
        org.joda.time.Weeks weeks88 = weeks42.dividedBy(107);
        org.joda.time.Period period89 = weeks42.toPeriod();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 13 + "'", int26 == 13);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertNotNull(weeks34);
        org.junit.Assert.assertNotNull(weeks36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(weeks38);
        org.junit.Assert.assertNotNull(weeks40);
        org.junit.Assert.assertNotNull(weeks42);
        org.junit.Assert.assertNotNull(weeks43);
        org.junit.Assert.assertNotNull(weeks45);
        org.junit.Assert.assertNotNull(weeks47);
        org.junit.Assert.assertNotNull(weeks49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(weeks51);
        org.junit.Assert.assertNotNull(weeks53);
        org.junit.Assert.assertNotNull(weeks55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(weeks57);
        org.junit.Assert.assertNotNull(weeks59);
        org.junit.Assert.assertNotNull(weeks60);
        org.junit.Assert.assertNotNull(weeks62);
        org.junit.Assert.assertNotNull(weeks64);
        org.junit.Assert.assertNotNull(weeks66);
        org.junit.Assert.assertNotNull(weeks68);
        org.junit.Assert.assertNotNull(weeks70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(durationFieldType73);
        org.junit.Assert.assertNotNull(weeks75);
        org.junit.Assert.assertNotNull(weeks77);
        org.junit.Assert.assertNotNull(weeks79);
        org.junit.Assert.assertNotNull(weeks81);
        org.junit.Assert.assertNotNull(mutablePeriod82);
        org.junit.Assert.assertNotNull(periodType83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(weeks88);
        org.junit.Assert.assertNotNull(period89);
    }

    @Test
    public void test22029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22029");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 1, (long) (byte) 1, chronology2);
        org.joda.time.Minutes minutes4 = period3.toStandardMinutes();
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes6 = org.joda.time.Minutes.ZERO;
        boolean boolean7 = minutes5.isLessThan(minutes6);
        org.joda.time.Minutes minutes8 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType9 = minutes8.getPeriodType();
        int int10 = minutes8.getMinutes();
        java.lang.String str11 = minutes8.toString();
        org.joda.time.Minutes minutes12 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType13 = minutes12.getFieldType();
        java.lang.String str14 = minutes12.toString();
        boolean boolean15 = minutes8.isLessThan(minutes12);
        int int16 = minutes8.size();
        org.joda.time.Minutes minutes17 = minutes5.plus(minutes8);
        org.joda.time.Minutes minutes18 = minutes5.negated();
        org.joda.time.Minutes minutes19 = minutes4.plus(minutes18);
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 25);
        org.joda.time.Minutes minutes22 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) mutablePeriod21);
        boolean boolean23 = minutes18.isLessThan(minutes22);
        int int24 = minutes18.getMinutes();
        org.joda.time.Minutes minutes26 = minutes18.minus((-596526));
        org.joda.time.DurationFieldType durationFieldType27 = minutes26.getFieldType();
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT0M" + "'", str11, "PT0M");
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT-2147483648M" + "'", str14, "PT-2147483648M");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(durationFieldType27);
    }

    @Test
    public void test22030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22030");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Period period7 = duration1.toPeriod();
        org.joda.time.Period period8 = period7.negated();
        org.joda.time.Seconds seconds9 = period8.toStandardSeconds();
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds12 = duration11.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType13 = seconds12.getFieldType();
        org.joda.time.Seconds seconds15 = seconds12.plus(25);
        org.joda.time.Seconds seconds16 = seconds12.negated();
        org.joda.time.Seconds seconds17 = seconds9.minus(seconds12);
        org.joda.time.Seconds seconds19 = seconds12.dividedBy((-2147483648));
        org.joda.time.Seconds seconds21 = org.joda.time.Seconds.parseSeconds("PT25S");
        boolean boolean22 = seconds19.isLessThan(seconds21);
        org.joda.time.Period period24 = org.joda.time.Period.seconds((int) (short) 100);
        org.joda.time.Seconds seconds25 = period24.toStandardSeconds();
        org.joda.time.Seconds seconds27 = seconds25.minus(1);
        java.lang.String str28 = seconds27.toString();
        org.joda.time.Duration duration30 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds31 = duration30.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType32 = seconds31.getFieldType();
        org.joda.time.Seconds seconds34 = seconds31.plus(25);
        org.joda.time.Seconds seconds35 = seconds31.negated();
        org.joda.time.Seconds seconds37 = seconds31.dividedBy(10);
        org.joda.time.Seconds seconds38 = org.joda.time.Seconds.ZERO;
        org.joda.time.PeriodType periodType39 = seconds38.getPeriodType();
        java.lang.String str40 = seconds38.toString();
        org.joda.time.Seconds seconds42 = seconds38.plus((int) (short) 1);
        int int43 = seconds42.getSeconds();
        org.joda.time.Seconds seconds44 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) seconds42);
        boolean boolean45 = seconds37.isLessThan(seconds42);
        org.joda.time.Seconds seconds46 = seconds27.minus(seconds37);
        org.joda.time.Duration duration48 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds49 = duration48.toStandardSeconds();
        java.lang.String str50 = seconds49.toString();
        org.joda.time.DurationFieldType durationFieldType51 = org.joda.time.DurationFieldType.days();
        boolean boolean52 = seconds49.isSupported(durationFieldType51);
        org.joda.time.Seconds seconds53 = null;
        org.joda.time.Seconds seconds54 = seconds49.minus(seconds53);
        org.joda.time.Seconds seconds55 = seconds49.negated();
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod(readableInstant56, readableDuration57);
        mutablePeriod58.setHours((int) (short) 100);
        org.joda.time.Duration duration62 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology63 = null;
        mutablePeriod58.setPeriod((org.joda.time.ReadableDuration) duration62, chronology63);
        org.joda.time.Duration duration66 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds67 = duration66.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType68 = seconds67.getFieldType();
        mutablePeriod58.add(durationFieldType68, (int) (short) 0);
        java.lang.String str71 = durationFieldType68.toString();
        java.lang.String str72 = durationFieldType68.toString();
        boolean boolean73 = seconds55.isSupported(durationFieldType68);
        boolean boolean74 = seconds27.isGreaterThan(seconds55);
        boolean boolean75 = seconds19.isLessThan(seconds27);
        org.joda.time.Seconds seconds76 = seconds27.negated();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PT99S" + "'", str28, "PT99S");
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertNotNull(seconds35);
        org.junit.Assert.assertNotNull(seconds37);
        org.junit.Assert.assertNotNull(seconds38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PT0S" + "'", str40, "PT0S");
        org.junit.Assert.assertNotNull(seconds42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(seconds44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(seconds46);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(seconds49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PT60S" + "'", str50, "PT60S");
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(seconds54);
        org.junit.Assert.assertNotNull(seconds55);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(seconds67);
        org.junit.Assert.assertNotNull(durationFieldType68);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "seconds" + "'", str71, "seconds");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "seconds" + "'", str72, "seconds");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(seconds76);
    }

    @Test
    public void test22031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22031");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.format.PeriodParser periodParser4 = periodFormatter3.getParser();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds7 = duration6.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType8 = seconds7.getFieldType();
        org.joda.time.Seconds seconds10 = seconds7.plus(25);
        org.joda.time.Seconds seconds11 = seconds7.negated();
        org.joda.time.PeriodType periodType12 = seconds11.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter13 = periodFormatter3.withParseType(periodType12);
        boolean boolean14 = periodFormatter3.isPrinter();
        java.util.Locale locale15 = periodFormatter3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = org.joda.time.Period.parse("PT-0.007S", periodFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodFormatter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(locale15);
    }

    @Test
    public void test22032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22032");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays(599903L);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test22033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22033");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Period period7 = duration1.toPeriod();
        org.joda.time.Period period8 = period7.negated();
        org.joda.time.Period period10 = period8.plusSeconds(0);
        int int11 = period10.getWeeks();
        org.joda.time.Seconds seconds12 = period10.toStandardSeconds();
        org.joda.time.Seconds seconds14 = seconds12.dividedBy((-637));
        org.joda.time.PeriodType periodType15 = seconds12.getPeriodType();
        org.joda.time.PeriodType periodType16 = seconds12.getPeriodType();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test22034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22034");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = period1.withSeconds((int) ' ');
        int int5 = period4.getSeconds();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.Period period7 = period4.minus(readablePeriod6);
        org.joda.time.Period period9 = period4.minusDays(10);
        org.joda.time.Period period11 = period4.withMillis(6);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test22035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22035");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.ZERO;
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Days days6 = days4.minus(10);
        boolean boolean7 = days1.isGreaterThan(days4);
        org.joda.time.Days days8 = org.joda.time.Days.ZERO;
        org.joda.time.Days days9 = org.joda.time.Days.ZERO;
        org.joda.time.Period period11 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days12 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Days days14 = days12.minus(10);
        boolean boolean15 = days9.isGreaterThan(days12);
        org.joda.time.Days days16 = days8.minus(days9);
        org.joda.time.Days days17 = days1.plus(days8);
        org.joda.time.Duration duration18 = days1.toStandardDuration();
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration18, periodType19);
        org.joda.time.Period period22 = period20.withDays(0);
        int int23 = period20.getMillis();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test22036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22036");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', (long) (short) 0, periodType4);
        org.joda.time.Hours hours6 = period5.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType7 = hours6.getFieldType();
        org.joda.time.Hours hours9 = hours6.minus(0);
        java.lang.String str10 = hours6.toString();
        org.joda.time.Hours hours12 = hours6.minus((int) (short) 100);
        org.joda.time.Hours hours13 = hours12.negated();
        org.joda.time.Hours hours15 = hours13.minus((int) (short) 0);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT0H" + "'", str10, "PT0H");
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(hours15);
    }

    @Test
    public void test22037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22037");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration1 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = duration1.toPeriod(chronology2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType8);
        int int10 = period9.getMillis();
        org.joda.time.Period period12 = period9.plusDays((int) 'a');
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds15 = duration14.toStandardSeconds();
        java.lang.String str16 = seconds15.toString();
        org.joda.time.PeriodType periodType17 = seconds15.getPeriodType();
        org.joda.time.PeriodType periodType18 = periodType17.withSecondsRemoved();
        org.joda.time.PeriodType periodType19 = periodType18.withDaysRemoved();
        org.joda.time.Period period20 = period12.normalizedStandard(periodType19);
        org.joda.time.PeriodType periodType21 = periodType19.withMonthsRemoved();
        org.joda.time.PeriodType periodType22 = periodType21.withMinutesRemoved();
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds25 = duration24.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType26 = seconds25.getFieldType();
        org.joda.time.Seconds seconds28 = seconds25.dividedBy(2);
        org.joda.time.PeriodType periodType29 = seconds28.getPeriodType();
        boolean boolean30 = periodType22.equals((java.lang.Object) periodType29);
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration1, readableInstant5, periodType29);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PT60S" + "'", str16, "PT60S");
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test22038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22038");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((-7));
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableInstant4, readableDuration5);
        mutablePeriod6.setPeriod((long) ' ', (long) 52);
        mutablePeriod6.addDays(100);
        org.joda.time.PeriodType periodType12 = mutablePeriod6.getPeriodType();
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType12);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((java.lang.Object) period1, periodType12);
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds17 = duration16.toStandardSeconds();
        java.lang.String str18 = seconds17.toString();
        org.joda.time.PeriodType periodType19 = seconds17.getPeriodType();
        org.joda.time.PeriodType periodType20 = periodType19.withSecondsRemoved();
        org.joda.time.PeriodType periodType21 = periodType20.withDaysRemoved();
        org.joda.time.PeriodType periodType22 = periodType21.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(periodType22);
        org.joda.time.MutablePeriod mutablePeriod24 = mutablePeriod23.copy();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 0, (long) 2, chronology27);
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType30 = periodType29.withWeeksRemoved();
        org.joda.time.PeriodType periodType31 = periodType30.withDaysRemoved();
        org.joda.time.Seconds seconds32 = org.joda.time.Seconds.TWO;
        org.joda.time.Duration duration33 = seconds32.toStandardDuration();
        org.joda.time.DurationFieldType durationFieldType34 = seconds32.getFieldType();
        org.joda.time.Chronology chronology35 = null;
        boolean boolean36 = durationFieldType34.isSupported(chronology35);
        int int37 = periodType31.indexOf(durationFieldType34);
        mutablePeriod28.set(durationFieldType34, 10);
        mutablePeriod28.addMinutes(10);
        mutablePeriod28.setMonths((int) (short) 0);
        mutablePeriod28.addWeeks(1);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 13);
        mutablePeriod47.addMonths((int) (byte) -1);
        mutablePeriod47.setWeeks(54);
        org.joda.time.Duration duration53 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds54 = duration53.toStandardSeconds();
        org.joda.time.Duration duration56 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds57 = duration56.toStandardSeconds();
        boolean boolean58 = duration53.isLongerThan((org.joda.time.ReadableDuration) duration56);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Interval interval60 = duration56.toIntervalTo(readableInstant59);
        org.joda.time.Seconds seconds61 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval60);
        org.joda.time.Seconds seconds62 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval60);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((java.lang.Object) interval60, chronology63);
        org.joda.time.Seconds seconds65 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval60);
        mutablePeriod47.setPeriod((org.joda.time.ReadableInterval) interval60);
        mutablePeriod28.setPeriod((org.joda.time.ReadableInterval) interval60);
        mutablePeriod24.add((org.joda.time.ReadableInterval) interval60);
        org.joda.time.Seconds seconds69 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval60);
        org.joda.time.Seconds seconds71 = seconds69.minus((-91));
        mutablePeriod14.mergePeriod((org.joda.time.ReadablePeriod) seconds69);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT60S" + "'", str18, "PT60S");
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(mutablePeriod24);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(seconds54);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(seconds57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(seconds61);
        org.junit.Assert.assertNotNull(seconds62);
        org.junit.Assert.assertNotNull(seconds65);
        org.junit.Assert.assertNotNull(seconds69);
        org.junit.Assert.assertNotNull(seconds71);
    }

    @Test
    public void test22039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22039");
        org.joda.time.Period period4 = new org.joda.time.Period((-27), (-596828), (-3), 108);
        org.joda.time.Period period6 = period4.minusMinutes(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType8 = period4.getFieldType(194);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 194");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test22040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22040");
        org.joda.time.Days days0 = org.joda.time.Days.ZERO;
        int int1 = days0.getDays();
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period6 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days7 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period6);
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        boolean boolean9 = days4.isGreaterThan(days7);
        org.joda.time.Period period11 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days12 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Days days13 = days7.minus(days12);
        org.joda.time.Days days14 = days0.minus(days7);
        org.joda.time.Days days15 = days0.negated();
        int int16 = days0.getDays();
        int int17 = days0.getDays();
        java.lang.String str18 = days0.toString();
        org.joda.time.Days days20 = days0.multipliedBy(21168000);
        int int21 = days0.getDays();
        org.joda.time.Days days23 = days0.multipliedBy(27);
        org.joda.time.Days days25 = days23.plus((-58));
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "P0D" + "'", str18, "P0D");
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(days25);
    }

    @Test
    public void test22041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22041");
        org.joda.time.Period period4 = new org.joda.time.Period(96, (-565), (-10), (-565));
    }

    @Test
    public void test22042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22042");
        java.lang.Object obj0 = null;
        org.joda.time.Duration duration1 = new org.joda.time.Duration(obj0);
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds4 = duration3.toStandardSeconds();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds7 = duration6.toStandardSeconds();
        boolean boolean8 = duration3.isLongerThan((org.joda.time.ReadableDuration) duration6);
        org.joda.time.Period period9 = duration3.toPeriod();
        int int10 = duration1.compareTo((org.joda.time.ReadableDuration) duration3);
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds13 = duration12.toStandardSeconds();
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds16 = duration15.toStandardSeconds();
        boolean boolean17 = duration12.isLongerThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Duration duration19 = duration12.minus((long) 3);
        boolean boolean20 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Interval interval22 = duration1.toIntervalFrom(readableInstant21);
        org.joda.time.Seconds seconds23 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval22);
        int int24 = seconds23.size();
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test22043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22043");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod2.addYears((int) '4');
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod2.add((long) 100, chronology6);
        mutablePeriod2.add(1, 10, (int) 'a', 52, (int) (short) 100, 0, (int) (byte) 0, (int) (byte) 10);
        org.joda.time.Seconds seconds18 = org.joda.time.Seconds.seconds(0);
        mutablePeriod2.mergePeriod((org.joda.time.ReadablePeriod) seconds18);
        mutablePeriod2.setPeriod((long) ' ', (long) 13);
        mutablePeriod2.setYears(1);
        mutablePeriod2.clear();
        mutablePeriod2.setPeriod((long) 6, (long) 600);
        mutablePeriod2.setHours((-1073741824));
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration33 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.Period period34 = duration33.toPeriod();
        long long35 = duration33.getStandardSeconds();
        org.joda.time.Duration duration37 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds38 = duration37.toStandardSeconds();
        java.lang.String str39 = seconds38.toString();
        org.joda.time.PeriodType periodType40 = seconds38.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(readableInstant31, (org.joda.time.ReadableDuration) duration33, periodType40);
        long long42 = duration33.getStandardMinutes();
        long long43 = duration33.getStandardHours();
        org.joda.time.Duration duration45 = duration33.withMillis((long) (-672));
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration45);
        mutablePeriod2.setPeriod((long) 120000);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-60L) + "'", long35 == (-60L));
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(seconds38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "PT60S" + "'", str39, "PT60S");
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(duration45);
    }

    @Test
    public void test22044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22044");
        org.joda.time.Period period1 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period3 = period1.withHours(32);
        org.joda.time.Period period4 = period1.normalizedStandard();
        org.joda.time.DurationFieldType[] durationFieldTypeArray5 = period1.getFieldTypes();
        org.joda.time.Period period7 = period1.plusMillis((int) (short) 0);
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds10 = duration9.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType11 = seconds10.getFieldType();
        org.joda.time.Seconds seconds13 = org.joda.time.Seconds.parseSeconds("P0W");
        org.joda.time.Seconds seconds14 = seconds10.minus(seconds13);
        org.joda.time.Seconds seconds15 = seconds10.negated();
        org.joda.time.Seconds seconds17 = org.joda.time.Seconds.seconds((int) (short) 0);
        org.joda.time.Seconds seconds18 = seconds15.minus(seconds17);
        java.lang.String str19 = seconds17.toString();
        org.joda.time.Seconds seconds20 = org.joda.time.Seconds.ZERO;
        org.joda.time.PeriodType periodType21 = seconds20.getPeriodType();
        java.lang.String str22 = seconds20.toString();
        org.joda.time.Seconds seconds24 = seconds20.plus((int) (short) 1);
        boolean boolean25 = seconds17.isGreaterThan(seconds20);
        org.joda.time.DurationFieldType durationFieldType26 = seconds17.getFieldType();
        java.lang.String str27 = durationFieldType26.getName();
        int int28 = period7.get(durationFieldType26);
        org.joda.time.Period period30 = period7.withSeconds((-22));
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(durationFieldTypeArray5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT0S" + "'", str19, "PT0S");
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PT0S" + "'", str22, "PT0S");
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "seconds" + "'", str27, "seconds");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(period30);
    }

    @Test
    public void test22045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22045");
        org.joda.time.Period period1 = org.joda.time.Period.months((-2147483648));
        org.joda.time.Period period3 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period5 = period3.withHours(32);
        org.joda.time.PeriodType periodType6 = period3.getPeriodType();
        org.joda.time.Period period7 = period1.plus((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period9 = period7.plusDays(4);
        org.joda.time.Period period11 = period7.plusMinutes(52);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test22046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22046");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) (byte) 0);
        mutablePeriod1.setPeriod(3600000L);
    }

    @Test
    public void test22047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22047");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 10, chronology1);
        mutablePeriod2.setPeriod((long) (byte) 0, (long) ' ');
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(readableInstant6, readableDuration7);
        mutablePeriod8.setPeriod((long) ' ', (long) 52);
        mutablePeriod8.addDays(100);
        org.joda.time.PeriodType periodType14 = mutablePeriod8.getPeriodType();
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds17 = duration16.toStandardSeconds();
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds20 = duration19.toStandardSeconds();
        boolean boolean21 = duration16.isLongerThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType24 = periodType23.withMinutesRemoved();
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration19, readableInstant22, periodType23);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Interval interval27 = duration19.toIntervalFrom(readableInstant26);
        mutablePeriod8.add((org.joda.time.ReadableInterval) interval27);
        mutablePeriod2.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod8);
        int int30 = mutablePeriod2.getWeeks();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod2, chronology31);
        org.joda.time.format.PeriodFormatter periodFormatter33 = null;
        java.lang.String str34 = mutablePeriod2.toString(periodFormatter33);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "P100DT1M0.020S" + "'", str34, "P100DT1M0.020S");
    }

    @Test
    public void test22048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22048");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.PeriodType periodType3 = periodFormatter2.getParseType();
        org.joda.time.format.PeriodParser periodParser4 = periodFormatter2.getParser();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardMinutes((long) 10);
        java.lang.String str9 = duration8.toString();
        org.joda.time.Duration duration11 = duration8.minus((long) (byte) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Minutes minutes13 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType14 = minutes13.getPeriodType();
        org.joda.time.PeriodType periodType15 = periodType14.withSecondsRemoved();
        org.joda.time.Period period16 = duration11.toPeriodFrom(readableInstant12, periodType14);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 0, (long) 3, periodType14);
        org.joda.time.PeriodType periodType18 = periodType14.withMonthsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter19 = periodFormatter2.withParseType(periodType18);
        boolean boolean20 = periodFormatter2.isPrinter();
        java.util.Locale locale21 = periodFormatter2.getLocale();
        java.lang.StringBuffer stringBuffer22 = null;
        org.joda.time.Hours hours23 = org.joda.time.Hours.SEVEN;
        org.joda.time.Hours hours25 = hours23.multipliedBy((int) (byte) 0);
        org.joda.time.Hours hours27 = hours25.dividedBy((-2147483648));
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer22, (org.joda.time.ReadablePeriod) hours25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodType3);
        org.junit.Assert.assertNull(periodParser4);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT600S" + "'", str9, "PT600S");
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodFormatter19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(locale21);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertNotNull(hours27);
    }

    @Test
    public void test22049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22049");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Period period7 = duration1.toPeriod();
        org.joda.time.Period period8 = period7.negated();
        org.joda.time.Seconds seconds9 = period8.toStandardSeconds();
        org.joda.time.Period period10 = period8.negated();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period8.toDurationTo(readableInstant11);
        org.joda.time.DurationFieldType[] durationFieldTypeArray13 = period8.getFieldTypes();
        java.lang.String str14 = period8.toString();
        org.joda.time.Period period16 = period8.plusYears(20);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(durationFieldTypeArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT-1M" + "'", str14, "PT-1M");
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test22050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22050");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 97, (long) '#');
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.format.PeriodPrinter periodPrinter4 = null;
        org.joda.time.format.PeriodParser periodParser5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = new org.joda.time.format.PeriodFormatter(periodPrinter4, periodParser5);
        org.joda.time.format.PeriodParser periodParser7 = periodFormatter6.getParser();
        java.util.Locale locale8 = periodFormatter6.getLocale();
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType10 = minutes9.getPeriodType();
        org.joda.time.Minutes minutes11 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes12 = minutes9.plus(minutes11);
        org.joda.time.Minutes minutes13 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes14 = org.joda.time.Minutes.ZERO;
        boolean boolean15 = minutes13.isLessThan(minutes14);
        boolean boolean16 = minutes9.isLessThan(minutes13);
        org.joda.time.PeriodType periodType17 = minutes9.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter18 = periodFormatter6.withParseType(periodType17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(readableInstant19, readableDuration20);
        org.joda.time.Period period22 = mutablePeriod21.toPeriod();
        org.joda.time.Period period24 = period22.withHours(0);
        int int25 = period22.getWeeks();
        org.joda.time.Period period27 = period22.plusSeconds((int) (byte) 100);
        org.joda.time.Period period29 = period22.withWeeks((int) '#');
        org.joda.time.PeriodType periodType30 = period22.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter31 = periodFormatter6.withParseType(periodType30);
        boolean boolean32 = periodFormatter31.isParser();
        org.joda.time.PeriodType periodType33 = periodFormatter31.getParseType();
        org.joda.time.PeriodType periodType34 = periodType33.withWeeksRemoved();
        org.joda.time.PeriodType periodType35 = periodType33.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, readableInstant3, periodType33);
        org.joda.time.Chronology chronology38 = null;
        mutablePeriod36.add((long) 39, chronology38);
        org.junit.Assert.assertNull(periodParser7);
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodFormatter18);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodFormatter31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(periodType35);
    }

    @Test
    public void test22051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22051");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT0.023S");
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test22052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22052");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) (-1));
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = duration1.toPeriodFrom(readableInstant2);
        org.joda.time.DurationFieldType[] durationFieldTypeArray4 = period3.getFieldTypes();
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.forFields(durationFieldTypeArray4);
        org.joda.time.PeriodType periodType6 = periodType5.withMonthsRemoved();
        org.joda.time.PeriodType periodType7 = periodType5.withMinutesRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withDaysRemoved();
        org.joda.time.PeriodType periodType9 = periodType7.withDaysRemoved();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(durationFieldTypeArray4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test22053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22053");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        java.lang.Object obj4 = null;
        org.joda.time.Duration duration5 = new org.joda.time.Duration(obj4);
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, (org.joda.time.ReadableDuration) duration5);
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration5);
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType11 = periodType10.withWeeksRemoved();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = duration9.toPeriod(periodType10, chronology12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType16 = periodType15.withMonthsRemoved();
        org.joda.time.Period period17 = duration9.toPeriodTo(readableInstant14, periodType16);
        org.joda.time.Period period18 = duration9.toPeriod();
        org.joda.time.Duration duration19 = duration5.plus((org.joda.time.ReadableDuration) duration9);
        org.joda.time.Duration duration20 = duration5.toDuration();
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType22 = periodType21.withMonthsRemoved();
        org.joda.time.PeriodType periodType23 = periodType22.withMinutesRemoved();
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration5, periodType23);
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration5);
        org.joda.time.Duration duration27 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType29 = periodType28.withWeeksRemoved();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = duration27.toPeriod(periodType28, chronology30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType34 = periodType33.withMonthsRemoved();
        org.joda.time.Period period35 = duration27.toPeriodTo(readableInstant32, periodType34);
        org.joda.time.Duration duration36 = duration27.toDuration();
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Period period39 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days40 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period39);
        org.joda.time.PeriodType periodType41 = days40.getPeriodType();
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(readableInstant42, readableDuration43);
        mutablePeriod44.setHours((int) (short) 100);
        boolean boolean47 = periodType41.equals((java.lang.Object) mutablePeriod44);
        org.joda.time.PeriodType periodType48 = periodType41.withMonthsRemoved();
        org.joda.time.Period period49 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration27, readableInstant37, periodType41);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.PeriodType periodType51 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType52 = periodType51.withMinutesRemoved();
        org.joda.time.PeriodType periodType53 = periodType51.withYearsRemoved();
        org.joda.time.PeriodType periodType54 = periodType53.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration27, readableInstant50, periodType54);
        org.joda.time.Duration duration56 = duration5.minus((org.joda.time.ReadableDuration) duration27);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(days40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(duration56);
    }

    @Test
    public void test22054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22054");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period3 = org.joda.time.Period.hours(0);
        org.joda.time.DurationFieldType durationFieldType5 = period3.getFieldType((int) (short) 1);
        org.joda.time.Period period7 = period3.plusDays(10);
        boolean boolean8 = periodType1.equals((java.lang.Object) 10);
        org.joda.time.Period period9 = new org.joda.time.Period((long) ' ', periodType1);
        org.joda.time.PeriodType periodType10 = periodType1.withDaysRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withSecondsRemoved();
        org.joda.time.PeriodType periodType12 = periodType11.withDaysRemoved();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test22055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22055");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        int int2 = minutes0.getMinutes();
        java.lang.String str3 = minutes0.toString();
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType5 = minutes4.getFieldType();
        java.lang.String str6 = minutes4.toString();
        boolean boolean7 = minutes0.isLessThan(minutes4);
        org.joda.time.Minutes minutes9 = minutes4.minus(0);
        org.joda.time.Minutes minutes11 = minutes4.dividedBy((int) (short) 100);
        org.joda.time.Minutes minutes12 = org.joda.time.Minutes.ZERO;
        org.joda.time.Minutes minutes14 = minutes12.plus((int) (byte) 0);
        java.lang.String str15 = minutes12.toString();
        boolean boolean16 = minutes4.isLessThan(minutes12);
        org.joda.time.Minutes minutes17 = null;
        boolean boolean18 = minutes12.isGreaterThan(minutes17);
        java.lang.String str19 = minutes12.toString();
        org.joda.time.Minutes minutes20 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType21 = minutes20.getPeriodType();
        int int22 = minutes20.getMinutes();
        java.lang.String str23 = minutes20.toString();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.Minutes minutes25 = org.joda.time.Minutes.standardMinutesIn(readablePeriod24);
        int int26 = minutes25.size();
        org.joda.time.Minutes minutes27 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType28 = minutes27.getPeriodType();
        org.joda.time.Minutes minutes29 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes30 = minutes27.plus(minutes29);
        org.joda.time.Minutes minutes31 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes32 = org.joda.time.Minutes.ZERO;
        boolean boolean33 = minutes31.isLessThan(minutes32);
        boolean boolean34 = minutes27.isLessThan(minutes31);
        org.joda.time.Minutes minutes36 = minutes31.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes37 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType38 = minutes37.getFieldType();
        org.joda.time.PeriodType periodType39 = minutes37.getPeriodType();
        org.joda.time.Minutes minutes40 = minutes36.plus(minutes37);
        org.joda.time.PeriodType periodType41 = minutes36.getPeriodType();
        org.joda.time.PeriodType periodType42 = minutes36.getPeriodType();
        org.joda.time.Minutes minutes43 = minutes25.plus(minutes36);
        boolean boolean44 = minutes20.isLessThan(minutes36);
        org.joda.time.DurationFieldType durationFieldType45 = minutes36.getFieldType();
        org.joda.time.Minutes minutes46 = minutes12.minus(minutes36);
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0M" + "'", str3, "PT0M");
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT-2147483648M" + "'", str6, "PT-2147483648M");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT0M" + "'", str15, "PT0M");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT0M" + "'", str19, "PT0M");
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PT0M" + "'", str23, "PT0M");
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertNotNull(minutes37);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(minutes43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertNotNull(minutes46);
    }

    @Test
    public void test22056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22056");
        org.joda.time.Days days0 = org.joda.time.Days.ONE;
        org.joda.time.Days days1 = org.joda.time.Days.ZERO;
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Days days6 = days4.minus(10);
        boolean boolean7 = days1.isGreaterThan(days4);
        org.joda.time.Days days8 = org.joda.time.Days.ZERO;
        org.joda.time.Days days9 = org.joda.time.Days.ZERO;
        org.joda.time.Period period11 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days12 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Days days14 = days12.minus(10);
        boolean boolean15 = days9.isGreaterThan(days12);
        org.joda.time.Days days16 = days8.minus(days9);
        org.joda.time.Days days17 = days1.plus(days8);
        org.joda.time.Days days18 = days0.minus(days1);
        int int19 = days0.getDays();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((java.lang.Object) days0, chronology20);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test22057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22057");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(1040400L, 779L, chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) '4', chronology5);
        org.joda.time.Duration duration7 = org.joda.time.Duration.ZERO;
        long long8 = duration7.getStandardDays();
        org.joda.time.Hours hours9 = duration7.toStandardHours();
        long long10 = duration7.getStandardMinutes();
        long long11 = duration7.getStandardDays();
        mutablePeriod6.setPeriod((org.joda.time.ReadableDuration) duration7);
        long long13 = duration7.getStandardMinutes();
        org.joda.time.Chronology chronology14 = null;
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration7, chronology14);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test22058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22058");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType3 = seconds2.getFieldType();
        org.joda.time.Seconds seconds5 = seconds2.plus(25);
        org.joda.time.Seconds seconds6 = seconds2.negated();
        org.joda.time.Seconds seconds8 = seconds2.dividedBy(10);
        org.joda.time.DurationFieldType durationFieldType9 = seconds2.getFieldType();
        org.joda.time.PeriodType periodType10 = seconds2.getPeriodType();
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds13 = duration12.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType14 = seconds13.getFieldType();
        org.joda.time.Seconds seconds16 = seconds13.plus(25);
        org.joda.time.Seconds seconds17 = seconds13.negated();
        org.joda.time.Seconds seconds19 = seconds13.dividedBy(10);
        org.joda.time.DurationFieldType durationFieldType20 = seconds13.getFieldType();
        org.joda.time.DurationFieldType durationFieldType21 = seconds13.getFieldType();
        org.joda.time.Chronology chronology22 = null;
        boolean boolean23 = durationFieldType21.isSupported(chronology22);
        boolean boolean24 = seconds2.isSupported(durationFieldType21);
        org.joda.time.Seconds seconds26 = seconds2.minus((int) (short) 0);
        org.joda.time.PeriodType periodType27 = seconds26.getPeriodType();
        org.joda.time.Seconds seconds29 = seconds26.plus((-1073741764));
        org.joda.time.DurationFieldType durationFieldType30 = seconds26.getFieldType();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertNotNull(durationFieldType30);
    }

    @Test
    public void test22059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22059");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) (-12));
    }

    @Test
    public void test22060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22060");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.Period period2 = duration1.toPeriod();
        org.joda.time.Seconds seconds3 = duration1.toStandardSeconds();
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) seconds3);
        org.joda.time.Seconds seconds6 = seconds3.plus(5940);
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.Seconds seconds8 = org.joda.time.Seconds.secondsIn(readableInterval7);
        int int9 = seconds8.getSeconds();
        org.joda.time.Seconds seconds11 = seconds8.dividedBy(32);
        org.joda.time.Period period12 = seconds11.toPeriod();
        org.joda.time.Seconds seconds13 = seconds6.minus(seconds11);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(seconds13);
    }

    @Test
    public void test22061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22061");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType5 = periodType4.withWeeksRemoved();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = duration3.toPeriod(periodType4, chronology6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType10 = periodType9.withMonthsRemoved();
        org.joda.time.Period period11 = duration3.toPeriodTo(readableInstant8, periodType10);
        org.joda.time.Period period12 = duration3.toPeriod();
        boolean boolean13 = duration1.equals((java.lang.Object) period12);
        org.joda.time.Seconds seconds14 = duration1.toStandardSeconds();
        org.joda.time.Duration duration17 = duration1.withDurationAdded((long) (-1073741824), (-2147483648));
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType20);
        int int22 = period21.getMillis();
        org.joda.time.Period period24 = period21.plusDays((int) 'a');
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds27 = duration26.toStandardSeconds();
        java.lang.String str28 = seconds27.toString();
        org.joda.time.PeriodType periodType29 = seconds27.getPeriodType();
        org.joda.time.PeriodType periodType30 = periodType29.withSecondsRemoved();
        org.joda.time.PeriodType periodType31 = periodType30.withDaysRemoved();
        org.joda.time.Period period32 = period24.normalizedStandard(periodType31);
        org.joda.time.PeriodType periodType33 = periodType31.withMonthsRemoved();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = duration17.toPeriod(periodType33, chronology34);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 25 + "'", int22 == 25);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PT60S" + "'", str28, "PT60S");
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(period35);
    }

    @Test
    public void test22062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22062");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(32);
        org.joda.time.Period period3 = period1.minusYears(194);
        org.joda.time.Hours hours4 = org.joda.time.Hours.TWO;
        org.joda.time.Duration duration5 = hours4.toStandardDuration();
        org.joda.time.Duration duration6 = duration5.toDuration();
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = duration6.toPeriod(periodType7, chronology8);
        int int10 = period9.getYears();
        boolean boolean11 = period1.equals((java.lang.Object) period9);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test22063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22063");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds((int) (short) 10);
        org.joda.time.Seconds seconds3 = seconds1.multipliedBy((-29));
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds3);
    }

    @Test
    public void test22064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22064");
        org.joda.time.Period period1 = org.joda.time.Period.years((-87));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test22065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22065");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) (byte) 0);
        org.joda.time.Days days2 = duration1.toStandardDays();
        org.joda.time.Days days3 = org.joda.time.Days.ZERO;
        org.joda.time.Period period5 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Days days8 = days6.minus(10);
        boolean boolean9 = days3.isGreaterThan(days6);
        org.joda.time.Period period11 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days12 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period14 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days15 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period14);
        org.joda.time.PeriodType periodType16 = days15.getPeriodType();
        boolean boolean17 = days12.isGreaterThan(days15);
        org.joda.time.Period period19 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days20 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period19);
        org.joda.time.Days days21 = days15.minus(days20);
        int int22 = days15.size();
        org.joda.time.Days days23 = org.joda.time.Days.ZERO;
        org.joda.time.Period period25 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days26 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Days days28 = days26.minus(10);
        boolean boolean29 = days23.isGreaterThan(days26);
        org.joda.time.Days days30 = days15.minus(days26);
        org.joda.time.Days days31 = days3.minus(days26);
        boolean boolean32 = days2.isGreaterThan(days31);
        org.joda.time.Days days34 = days2.dividedBy((int) 'a');
        org.joda.time.Days days35 = org.joda.time.Days.SEVEN;
        org.joda.time.Days days37 = days35.dividedBy((int) (short) -1);
        org.joda.time.Days days39 = days37.minus(0);
        org.joda.time.Days days40 = days2.plus(days39);
        org.joda.time.Days days42 = days2.minus(100);
        org.joda.time.Days days43 = days2.negated();
        org.joda.time.Days days44 = days2.negated();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertNotNull(days35);
        org.junit.Assert.assertNotNull(days37);
        org.junit.Assert.assertNotNull(days39);
        org.junit.Assert.assertNotNull(days40);
        org.junit.Assert.assertNotNull(days42);
        org.junit.Assert.assertNotNull(days43);
        org.junit.Assert.assertNotNull(days44);
    }

    @Test
    public void test22066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22066");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter2.getPrinter();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter2.withLocale(locale5);
        org.joda.time.format.PeriodParser periodParser7 = periodFormatter6.getParser();
        org.joda.time.Hours hours8 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours10 = hours8.minus(0);
        org.joda.time.Hours hours11 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours13 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean14 = hours11.isGreaterThan(hours13);
        boolean boolean15 = hours10.isLessThan(hours13);
        java.lang.String str16 = hours10.toString();
        org.joda.time.Hours hours18 = hours10.dividedBy((int) (short) 10);
        org.joda.time.PeriodType periodType19 = hours18.getPeriodType();
        org.joda.time.PeriodType periodType20 = periodType19.withMinutesRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter21 = periodFormatter6.withParseType(periodType20);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(readableInstant26, readableDuration27);
        mutablePeriod28.setPeriod((long) ' ', (long) 52);
        mutablePeriod28.addDays(100);
        org.joda.time.PeriodType periodType34 = mutablePeriod28.getPeriodType();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(10L, (long) 13, periodType34, chronology35);
        org.joda.time.Period period37 = new org.joda.time.Period(540000L, (long) (short) 100, periodType34);
        org.joda.time.PeriodType periodType38 = periodType34.withYearsRemoved();
        org.joda.time.PeriodType periodType39 = periodType38.withDaysRemoved();
        org.joda.time.PeriodType periodType40 = periodType39.withYearsRemoved();
        int int41 = periodType39.size();
        org.joda.time.format.PeriodFormatter periodFormatter42 = periodFormatter21.withParseType(periodType39);
        java.util.Locale locale43 = null;
        org.joda.time.format.PeriodFormatter periodFormatter44 = periodFormatter21.withLocale(locale43);
        boolean boolean45 = periodFormatter44.isPrinter();
        org.joda.time.PeriodType periodType46 = periodFormatter44.getParseType();
        boolean boolean47 = periodFormatter44.isPrinter();
        org.joda.time.format.PeriodParser periodParser48 = periodFormatter44.getParser();
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertNull(periodParser7);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PT4H" + "'", str16, "PT4H");
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodFormatter21);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 6 + "'", int41 == 6);
        org.junit.Assert.assertNotNull(periodFormatter42);
        org.junit.Assert.assertNotNull(periodFormatter44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(periodParser48);
    }

    @Test
    public void test22067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22067");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType4 = periodType3.withWeeksRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withDaysRemoved();
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant1, readableInstant2, periodType5);
        org.joda.time.PeriodType periodType7 = periodType5.withWeeksRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withSecondsRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withSecondsRemoved();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(2L, periodType8, chronology10);
        int int12 = mutablePeriod11.getMinutes();
        mutablePeriod11.setPeriod((-84326300L));
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test22068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22068");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) (-1));
        org.joda.time.Duration duration4 = duration1.withDurationAdded((long) 3, (int) '#');
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.ZERO;
        org.joda.time.Duration duration6 = seconds5.toStandardDuration();
        boolean boolean7 = duration4.isEqual((org.joda.time.ReadableDuration) duration6);
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardHours((long) 13);
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds12 = duration11.toStandardSeconds();
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds15 = duration14.toStandardSeconds();
        boolean boolean16 = duration11.isLongerThan((org.joda.time.ReadableDuration) duration14);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType19 = periodType18.withMinutesRemoved();
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration14, readableInstant17, periodType18);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(readableInstant21, readableDuration22);
        mutablePeriod23.setHours((int) (short) 100);
        org.joda.time.Duration duration27 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology28 = null;
        mutablePeriod23.setPeriod((org.joda.time.ReadableDuration) duration27, chronology28);
        org.joda.time.Duration duration31 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds32 = duration31.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType33 = seconds32.getFieldType();
        mutablePeriod23.add(durationFieldType33, (int) (short) 0);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(readableInstant36, readableDuration37);
        mutablePeriod38.setHours((int) (short) 100);
        org.joda.time.Duration duration42 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology43 = null;
        mutablePeriod38.setPeriod((org.joda.time.ReadableDuration) duration42, chronology43);
        org.joda.time.Chronology chronology45 = null;
        mutablePeriod23.setPeriod((org.joda.time.ReadableDuration) duration42, chronology45);
        int int47 = duration14.compareTo((org.joda.time.ReadableDuration) duration42);
        org.joda.time.Duration duration49 = duration42.minus(1L);
        long long50 = duration49.getStandardDays();
        org.joda.time.PeriodType periodType51 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.PeriodType periodType52 = periodType51.withMillisRemoved();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = duration49.toPeriod(periodType51, chronology53);
        org.joda.time.Duration duration55 = duration9.minus((org.joda.time.ReadableDuration) duration49);
        boolean boolean56 = duration6.isLongerThan((org.joda.time.ReadableDuration) duration55);
        org.joda.time.Duration duration59 = new org.joda.time.Duration((long) 0, 100L);
        boolean boolean60 = duration6.isLongerThan((org.joda.time.ReadableDuration) duration59);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration59, readableInstant61);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test22069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22069");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(readableInstant3, readableDuration4);
        mutablePeriod5.setHours((int) (short) 100);
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod5.setPeriod((org.joda.time.ReadableDuration) duration9, chronology10);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType13 = periodType12.withWeeksRemoved();
        org.joda.time.PeriodType periodType14 = periodType13.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(readableInstant2, (org.joda.time.ReadableDuration) duration9, periodType13);
        org.joda.time.Duration duration17 = duration9.withMillis((long) 10);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(readableInstant1, (org.joda.time.ReadableDuration) duration9);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.millis();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) (short) 1, periodType21, chronology22);
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration9, readableInstant19, periodType21);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration9);
        mutablePeriod25.setDays((int) (short) -1);
        org.joda.time.Chronology chronology29 = null;
        mutablePeriod25.add(599990L, chronology29);
        org.joda.time.Days days31 = org.joda.time.Days.ZERO;
        org.joda.time.Days days32 = org.joda.time.Days.ZERO;
        org.joda.time.Period period34 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days35 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period34);
        org.joda.time.Days days37 = days35.minus(10);
        boolean boolean38 = days32.isGreaterThan(days35);
        org.joda.time.Days days39 = days31.minus(days32);
        org.joda.time.Days days41 = days39.plus(658);
        mutablePeriod25.setPeriod((org.joda.time.ReadablePeriod) days41);
        org.joda.time.Days days44 = days41.multipliedBy(27);
        org.joda.time.Duration duration45 = days44.toStandardDuration();
        org.joda.time.Duration duration47 = duration45.withMillis(97L);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(days35);
        org.junit.Assert.assertNotNull(days37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(days39);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertNotNull(days44);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(duration47);
    }

    @Test
    public void test22070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22070");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType5 = periodType4.withWeeksRemoved();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = duration3.toPeriod(periodType4, chronology6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType10 = periodType9.withMonthsRemoved();
        org.joda.time.Period period11 = duration3.toPeriodTo(readableInstant8, periodType10);
        org.joda.time.Duration duration12 = duration3.toDuration();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period15 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days16 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period15);
        org.joda.time.PeriodType periodType17 = days16.getPeriodType();
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(readableInstant18, readableDuration19);
        mutablePeriod20.setHours((int) (short) 100);
        boolean boolean23 = periodType17.equals((java.lang.Object) mutablePeriod20);
        org.joda.time.PeriodType periodType24 = periodType17.withMonthsRemoved();
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration3, readableInstant13, periodType17);
        org.joda.time.PeriodType periodType26 = periodType17.withMonthsRemoved();
        java.lang.String str27 = periodType17.toString();
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType17);
        org.joda.time.PeriodType periodType29 = periodType17.withMonthsRemoved();
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PeriodType[Days]" + "'", str27, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodType29);
    }

    @Test
    public void test22071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22071");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((int) 'a');
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Chronology chronology3 = null;
        boolean boolean4 = durationFieldType2.isSupported(chronology3);
        boolean boolean5 = weeks1.isSupported(durationFieldType2);
        org.joda.time.Weeks weeks7 = weeks1.plus(4);
        org.joda.time.MutablePeriod mutablePeriod8 = weeks7.toMutablePeriod();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(mutablePeriod8);
    }

    @Test
    public void test22072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22072");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType6 = minutes5.getFieldType();
        org.joda.time.PeriodType periodType7 = minutes5.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter2.withParseType(periodType7);
        boolean boolean9 = periodFormatter2.isPrinter();
        boolean boolean10 = periodFormatter2.isParser();
        java.util.Locale locale11 = null;
        org.joda.time.format.PeriodFormatter periodFormatter12 = periodFormatter2.withLocale(locale11);
        boolean boolean13 = periodFormatter12.isPrinter();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(readableInstant14, readableDuration15);
        mutablePeriod16.setSeconds(8);
        org.joda.time.MutablePeriod mutablePeriod19 = mutablePeriod16.toMutablePeriod();
        int int20 = mutablePeriod19.getDays();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = periodFormatter12.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod19, "PT8640000S", (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(periodFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(mutablePeriod19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test22073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22073");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        boolean boolean4 = weeks1.isLessThan(weeks3);
        org.joda.time.Weeks weeks5 = weeks1.negated();
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.weeksIn(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.Weeks weeks9 = org.joda.time.Weeks.weeksIn(readableInterval8);
        boolean boolean10 = weeks7.isLessThan(weeks9);
        org.joda.time.Weeks weeks11 = weeks7.negated();
        org.joda.time.Weeks weeks13 = weeks11.minus((int) (byte) 100);
        org.joda.time.Weeks weeks14 = weeks5.plus(weeks11);
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.Weeks weeks16 = org.joda.time.Weeks.weeksIn(readableInterval15);
        org.joda.time.ReadableInterval readableInterval17 = null;
        org.joda.time.Weeks weeks18 = org.joda.time.Weeks.weeksIn(readableInterval17);
        boolean boolean19 = weeks16.isLessThan(weeks18);
        org.joda.time.Weeks weeks20 = weeks16.negated();
        org.joda.time.ReadableInterval readableInterval21 = null;
        org.joda.time.Weeks weeks22 = org.joda.time.Weeks.weeksIn(readableInterval21);
        org.joda.time.ReadableInterval readableInterval23 = null;
        org.joda.time.Weeks weeks24 = org.joda.time.Weeks.weeksIn(readableInterval23);
        boolean boolean25 = weeks22.isLessThan(weeks24);
        org.joda.time.Weeks weeks26 = weeks22.negated();
        org.joda.time.Weeks weeks28 = weeks26.minus((int) (byte) 100);
        org.joda.time.Weeks weeks29 = weeks20.plus(weeks26);
        org.joda.time.DurationFieldType durationFieldType30 = weeks26.getFieldType();
        org.joda.time.Weeks weeks31 = weeks11.plus(weeks26);
        org.joda.time.Weeks weeks33 = weeks11.plus(10);
        int int34 = weeks33.size();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertNotNull(weeks29);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertNotNull(weeks31);
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test22074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22074");
        org.joda.time.Period period1 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period3 = period1.withHours(32);
        org.joda.time.Period period4 = period1.normalizedStandard();
        org.joda.time.Period period6 = period1.plusHours((int) (short) 1);
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds9 = duration8.toStandardSeconds();
        java.lang.String str10 = seconds9.toString();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.days();
        boolean boolean12 = seconds9.isSupported(durationFieldType11);
        org.joda.time.Seconds seconds13 = null;
        org.joda.time.Seconds seconds14 = seconds9.minus(seconds13);
        org.joda.time.Period period15 = period1.withFields((org.joda.time.ReadablePeriod) seconds13);
        org.joda.time.PeriodType periodType16 = period15.getPeriodType();
        org.joda.time.Period period18 = period15.multipliedBy(600);
        org.joda.time.Period period20 = period15.plusMinutes(67);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT60S" + "'", str10, "PT60S");
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test22075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22075");
        org.joda.time.Period period1 = org.joda.time.Period.hours((-596526));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test22076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22076");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) (short) 0);
        mutablePeriod1.addWeeks((int) (byte) 0);
        int int4 = mutablePeriod1.getWeeks();
        mutablePeriod1.addHours((-2147483648));
        int int7 = mutablePeriod1.getMillis();
        org.joda.time.Period period9 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period11 = period9.withMillis((int) (byte) -1);
        org.joda.time.Weeks weeks12 = period11.toStandardWeeks();
        org.joda.time.Duration duration13 = weeks12.toStandardDuration();
        org.joda.time.Period period14 = duration13.toPeriod();
        org.joda.time.Weeks weeks15 = period14.toStandardWeeks();
        org.joda.time.Duration duration16 = weeks15.toStandardDuration();
        mutablePeriod1.add((org.joda.time.ReadablePeriod) weeks15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(duration16);
    }

    @Test
    public void test22077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22077");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds4 = duration3.toStandardSeconds();
        java.lang.String str5 = seconds4.toString();
        org.joda.time.PeriodType periodType6 = seconds4.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withSecondsRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withDaysRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withWeeksRemoved();
        org.joda.time.PeriodType periodType10 = periodType8.withMinutesRemoved();
        org.joda.time.Period period11 = new org.joda.time.Period((-126000000L), (-2378880000L), periodType10);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT60S" + "'", str5, "PT60S");
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test22078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22078");
        org.joda.time.Seconds seconds11 = org.joda.time.Seconds.ZERO;
        org.joda.time.PeriodType periodType12 = seconds11.getPeriodType();
        java.lang.String str13 = seconds11.toString();
        java.lang.String str14 = seconds11.toString();
        org.joda.time.Seconds seconds15 = null;
        org.joda.time.Seconds seconds16 = seconds11.minus(seconds15);
        org.joda.time.Seconds seconds18 = seconds16.plus((-672));
        org.joda.time.Seconds seconds19 = seconds18.negated();
        org.joda.time.PeriodType periodType20 = seconds19.getPeriodType();
        org.joda.time.Period period21 = new org.joda.time.Period(6000000L, periodType20);
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType24 = periodType23.withMonthsRemoved();
        org.joda.time.PeriodType periodType25 = periodType24.withMinutesRemoved();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) (short) 0, periodType24, chronology26);
        org.joda.time.Duration duration29 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds30 = duration29.toStandardSeconds();
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds33 = duration32.toStandardSeconds();
        boolean boolean34 = duration29.isLongerThan((org.joda.time.ReadableDuration) duration32);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType37 = periodType36.withMinutesRemoved();
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration32, readableInstant35, periodType36);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(readableInstant39, readableDuration40);
        mutablePeriod41.setHours((int) (short) 100);
        org.joda.time.Duration duration45 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology46 = null;
        mutablePeriod41.setPeriod((org.joda.time.ReadableDuration) duration45, chronology46);
        org.joda.time.Duration duration49 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds50 = duration49.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType51 = seconds50.getFieldType();
        mutablePeriod41.add(durationFieldType51, (int) (short) 0);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod(readableInstant54, readableDuration55);
        mutablePeriod56.setHours((int) (short) 100);
        org.joda.time.Duration duration60 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology61 = null;
        mutablePeriod56.setPeriod((org.joda.time.ReadableDuration) duration60, chronology61);
        org.joda.time.Chronology chronology63 = null;
        mutablePeriod41.setPeriod((org.joda.time.ReadableDuration) duration60, chronology63);
        int int65 = duration32.compareTo((org.joda.time.ReadableDuration) duration60);
        java.lang.Object obj66 = null;
        boolean boolean67 = duration32.equals(obj66);
        org.joda.time.Seconds seconds69 = org.joda.time.Seconds.seconds(2);
        org.joda.time.Duration duration70 = seconds69.toStandardDuration();
        boolean boolean71 = duration32.equals((java.lang.Object) seconds69);
        int int72 = seconds69.getSeconds();
        org.joda.time.DurationFieldType durationFieldType73 = seconds69.getFieldType();
        boolean boolean74 = periodType24.isSupported(durationFieldType73);
        int int75 = periodType20.indexOf(durationFieldType73);
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod(1L, 6000000L, periodType20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period77 = new org.joda.time.Period(40, (-7), (int) (byte) 100, 96, (-160), (-596828), (-112), 7, periodType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT0S" + "'", str13, "PT0S");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT0S" + "'", str14, "PT0S");
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(seconds50);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(seconds69);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2 + "'", int72 == 2);
        org.junit.Assert.assertNotNull(durationFieldType73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test22079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22079");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        org.joda.time.Period period3 = mutablePeriod2.toPeriod();
        org.joda.time.Period period5 = period3.withHours(0);
        int int6 = period3.getWeeks();
        org.joda.time.Period period8 = period3.withMillis((int) 'a');
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Weeks weeks10 = org.joda.time.Weeks.weeksIn(readableInterval9);
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn(readableInterval11);
        boolean boolean13 = weeks10.isLessThan(weeks12);
        org.joda.time.Weeks weeks15 = weeks12.minus((int) (short) -1);
        org.joda.time.Weeks weeks17 = weeks15.multipliedBy(0);
        org.joda.time.Weeks weeks18 = null;
        boolean boolean19 = weeks15.isLessThan(weeks18);
        int int21 = weeks15.getValue((int) (byte) 0);
        org.joda.time.ReadableInterval readableInterval22 = null;
        org.joda.time.Weeks weeks23 = org.joda.time.Weeks.weeksIn(readableInterval22);
        org.joda.time.Weeks weeks25 = weeks23.multipliedBy((int) (short) 10);
        org.joda.time.Weeks weeks26 = weeks15.minus(weeks25);
        org.joda.time.Weeks weeks27 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks29 = weeks27.dividedBy(52);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DurationField durationField32 = durationFieldType30.getField(chronology31);
        boolean boolean33 = weeks27.isSupported(durationFieldType30);
        org.joda.time.Weeks weeks34 = weeks26.plus(weeks27);
        org.joda.time.Period period35 = period3.minus((org.joda.time.ReadablePeriod) weeks26);
        org.joda.time.Period period37 = period3.plusMonths((-1));
        org.joda.time.DurationFieldType[] durationFieldTypeArray38 = period37.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            int int40 = period37.getValue((-58));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -58");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertNotNull(weeks29);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(weeks34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(durationFieldTypeArray38);
    }

    @Test
    public void test22080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22080");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        java.lang.String str3 = seconds2.toString();
        org.joda.time.PeriodType periodType4 = seconds2.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withYearsRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withDaysRemoved();
        org.joda.time.PeriodType periodType7 = periodType4.withSecondsRemoved();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(periodType7);
        org.joda.time.PeriodType periodType9 = mutablePeriod8.getPeriodType();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT60S" + "'", str3, "PT60S");
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test22081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22081");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds9 = duration8.toStandardSeconds();
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds12 = duration11.toStandardSeconds();
        boolean boolean13 = duration8.isLongerThan((org.joda.time.ReadableDuration) duration11);
        org.joda.time.Period period14 = duration8.toPeriod();
        boolean boolean15 = duration4.isLongerThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = duration4.toPeriodTo(readableInstant16);
        long long18 = duration4.getStandardDays();
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.Period period21 = duration20.toPeriod();
        long long22 = duration20.getStandardSeconds();
        boolean boolean23 = duration4.isEqual((org.joda.time.ReadableDuration) duration20);
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds26 = duration25.toStandardSeconds();
        java.lang.String str27 = seconds26.toString();
        org.joda.time.PeriodType periodType28 = seconds26.getPeriodType();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((java.lang.Object) duration4, periodType28, chronology29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(readableInstant31, readableDuration32);
        org.joda.time.Period period34 = mutablePeriod33.toPeriod();
        org.joda.time.Duration duration35 = period34.toStandardDuration();
        org.joda.time.Duration duration38 = duration35.withDurationAdded((long) 2, (int) (short) 10);
        mutablePeriod30.setPeriod((org.joda.time.ReadableDuration) duration38);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((java.lang.Object) mutablePeriod30, chronology40);
        mutablePeriod30.add(0L);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((-1L));
        mutablePeriod45.addHours((int) (byte) 10);
        int int48 = mutablePeriod45.getYears();
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        mutablePeriod45.setPeriod(readableInstant49, readableInstant50);
        mutablePeriod45.setHours(6);
        org.joda.time.Period period55 = org.joda.time.Period.hours(0);
        org.joda.time.DurationFieldType durationFieldType57 = period55.getFieldType((int) (short) 1);
        org.joda.time.Period period59 = period55.withSeconds((-1));
        org.joda.time.DurationFieldType durationFieldType61 = period55.getFieldType(0);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DurationField durationField63 = durationFieldType61.getField(chronology62);
        int int64 = mutablePeriod45.get(durationFieldType61);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod30.add(durationFieldType61, (-52));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-60L) + "'", long22 == (-60L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PT60S" + "'", str27, "PT60S");
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(durationFieldType57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(durationFieldType61);
        org.junit.Assert.assertNotNull(durationField63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test22082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22082");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant1, readableDuration2);
        mutablePeriod3.setHours((int) (short) 100);
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration7, chronology8);
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType11 = periodType10.withWeeksRemoved();
        org.joda.time.PeriodType periodType12 = periodType11.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration7, periodType11);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration7, readableInstant14);
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds18 = duration17.toStandardSeconds();
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds21 = duration20.toStandardSeconds();
        boolean boolean22 = duration17.isLongerThan((org.joda.time.ReadableDuration) duration20);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType25 = periodType24.withMinutesRemoved();
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration20, readableInstant23, periodType24);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(readableInstant27, readableDuration28);
        mutablePeriod29.setHours((int) (short) 100);
        org.joda.time.Duration duration33 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology34 = null;
        mutablePeriod29.setPeriod((org.joda.time.ReadableDuration) duration33, chronology34);
        org.joda.time.Duration duration37 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds38 = duration37.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType39 = seconds38.getFieldType();
        mutablePeriod29.add(durationFieldType39, (int) (short) 0);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(readableInstant42, readableDuration43);
        mutablePeriod44.setHours((int) (short) 100);
        org.joda.time.Duration duration48 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology49 = null;
        mutablePeriod44.setPeriod((org.joda.time.ReadableDuration) duration48, chronology49);
        org.joda.time.Chronology chronology51 = null;
        mutablePeriod29.setPeriod((org.joda.time.ReadableDuration) duration48, chronology51);
        int int53 = duration20.compareTo((org.joda.time.ReadableDuration) duration48);
        org.joda.time.Duration duration54 = duration48.toDuration();
        org.joda.time.Duration duration56 = org.joda.time.Duration.standardDays(0L);
        boolean boolean57 = duration48.isLongerThan((org.joda.time.ReadableDuration) duration56);
        java.lang.String str58 = duration56.toString();
        int int59 = duration7.compareTo((org.joda.time.ReadableDuration) duration56);
        org.joda.time.Duration duration61 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.Duration duration63 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType64 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType65 = periodType64.withWeeksRemoved();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.Period period67 = duration63.toPeriod(periodType64, chronology66);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.PeriodType periodType69 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType70 = periodType69.withMonthsRemoved();
        org.joda.time.Period period71 = duration63.toPeriodTo(readableInstant68, periodType70);
        org.joda.time.Period period72 = duration63.toPeriod();
        boolean boolean73 = duration61.equals((java.lang.Object) period72);
        boolean boolean74 = duration7.isLongerThan((org.joda.time.ReadableDuration) duration61);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(seconds38);
        org.junit.Assert.assertNotNull(durationFieldType39);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "PT0S" + "'", str58, "PT0S");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(periodType65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(periodType69);
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test22083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22083");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((-141), 671, (int) (byte) 1, (-112), (-1073741764), (-60), (-8), 600);
        mutablePeriod8.setPeriod((-2147483588), 194, 100, (-575), 59, (-20), 0, (int) (short) -1);
    }

    @Test
    public void test22084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22084");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = duration1.toPeriod(periodType2, chronology4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType8 = periodType7.withMonthsRemoved();
        org.joda.time.Period period9 = duration1.toPeriodTo(readableInstant6, periodType8);
        org.joda.time.Minutes minutes10 = duration1.toStandardMinutes();
        org.joda.time.Minutes minutes12 = minutes10.multipliedBy((int) (short) -1);
        org.joda.time.Minutes minutes14 = minutes10.minus((int) (short) 0);
        org.joda.time.Minutes minutes15 = minutes14.negated();
        org.joda.time.Minutes minutes17 = org.joda.time.Minutes.minutes(54);
        org.joda.time.Minutes minutes18 = minutes15.minus(minutes17);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((java.lang.Object) minutes15);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(minutes18);
    }

    @Test
    public void test22085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22085");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = duration1.toPeriod(periodType2, chronology4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType8 = periodType7.withMonthsRemoved();
        org.joda.time.Period period9 = duration1.toPeriodTo(readableInstant6, periodType8);
        org.joda.time.DurationFieldType durationFieldType11 = period9.getFieldType((int) (byte) 0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period9.toDurationFrom(readableInstant12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = duration13.toPeriod(chronology14);
        org.joda.time.Duration duration16 = period15.toStandardDuration();
        org.joda.time.Duration duration17 = duration16.toDuration();
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = duration17.toPeriodTo(readableInstant18);
        org.joda.time.Days days20 = org.joda.time.Days.ZERO;
        int int21 = days20.getDays();
        org.joda.time.Period period23 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days24 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period23);
        org.joda.time.Period period26 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days27 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period26);
        org.joda.time.PeriodType periodType28 = days27.getPeriodType();
        boolean boolean29 = days24.isGreaterThan(days27);
        org.joda.time.Period period31 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days32 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Days days33 = days27.minus(days32);
        org.joda.time.Days days34 = days20.minus(days27);
        org.joda.time.Period period36 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days37 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period36);
        org.joda.time.Period period39 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days40 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period39);
        org.joda.time.PeriodType periodType41 = days40.getPeriodType();
        boolean boolean42 = days37.isGreaterThan(days40);
        org.joda.time.Period period44 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days45 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period44);
        org.joda.time.Days days46 = days40.minus(days45);
        org.joda.time.Days days47 = days20.plus(days46);
        org.joda.time.Days days49 = days46.minus(0);
        org.joda.time.Duration duration51 = org.joda.time.Duration.standardDays((-1L));
        org.joda.time.Days days52 = duration51.toStandardDays();
        java.lang.String str53 = days52.toString();
        org.joda.time.Days days54 = days46.plus(days52);
        org.joda.time.Days days55 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.Days days57 = days55.minus(25);
        org.joda.time.Days days58 = days57.negated();
        org.joda.time.Days days59 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.Days days61 = days59.minus(25);
        org.joda.time.Days days62 = days61.negated();
        org.joda.time.Days days63 = days57.plus(days62);
        java.lang.String str64 = days57.toString();
        boolean boolean65 = days54.isGreaterThan(days57);
        boolean boolean66 = duration17.equals((java.lang.Object) days54);
        org.joda.time.Days days68 = days54.minus(8744033);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(days37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(days40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(days45);
        org.junit.Assert.assertNotNull(days46);
        org.junit.Assert.assertNotNull(days47);
        org.junit.Assert.assertNotNull(days49);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(days52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "P-1D" + "'", str53, "P-1D");
        org.junit.Assert.assertNotNull(days54);
        org.junit.Assert.assertNotNull(days55);
        org.junit.Assert.assertNotNull(days57);
        org.junit.Assert.assertNotNull(days58);
        org.junit.Assert.assertNotNull(days59);
        org.junit.Assert.assertNotNull(days61);
        org.junit.Assert.assertNotNull(days62);
        org.junit.Assert.assertNotNull(days63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "P2147483622D" + "'", str64, "P2147483622D");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(days68);
    }

    @Test
    public void test22086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22086");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(52);
        org.joda.time.Period period3 = period1.withHours(0);
        org.joda.time.Period period5 = period1.minusMonths((int) (short) 10);
        org.joda.time.Period period7 = period5.minusMinutes(32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks8 = period5.toStandardWeeks();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Weeks as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test22087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22087");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = duration1.toPeriodTo(readableInstant2);
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.weeksIn(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.weeksIn(readableInterval6);
        boolean boolean8 = weeks5.isLessThan(weeks7);
        org.joda.time.Weeks weeks9 = weeks5.negated();
        org.joda.time.Weeks weeks11 = weeks9.minus((int) (byte) 100);
        org.joda.time.Period period12 = period3.withFields((org.joda.time.ReadablePeriod) weeks9);
        org.joda.time.ReadableInterval readableInterval13 = null;
        org.joda.time.Weeks weeks14 = org.joda.time.Weeks.weeksIn(readableInterval13);
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.Weeks weeks16 = org.joda.time.Weeks.weeksIn(readableInterval15);
        boolean boolean17 = weeks14.isLessThan(weeks16);
        org.joda.time.Weeks weeks18 = weeks14.negated();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((java.lang.Object) weeks14, chronology19);
        org.joda.time.Weeks weeks22 = weeks14.multipliedBy((int) (byte) 1);
        org.joda.time.ReadableInterval readableInterval23 = null;
        org.joda.time.Weeks weeks24 = org.joda.time.Weeks.weeksIn(readableInterval23);
        org.joda.time.Weeks weeks26 = weeks24.multipliedBy(8);
        java.lang.String str27 = weeks26.toString();
        boolean boolean28 = weeks22.isLessThan(weeks26);
        boolean boolean29 = weeks9.isLessThan(weeks22);
        org.joda.time.Weeks weeks31 = weeks22.multipliedBy((-8));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period32 = new org.joda.time.Period((java.lang.Object) (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "P0W" + "'", str27, "P0W");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(weeks31);
    }

    @Test
    public void test22088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22088");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType4 = periodType3.withWeeksRemoved();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = duration2.toPeriod(periodType3, chronology5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType9 = periodType8.withMonthsRemoved();
        org.joda.time.Period period10 = duration2.toPeriodTo(readableInstant7, periodType9);
        org.joda.time.Duration duration11 = duration2.toDuration();
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration11, readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        java.lang.Object obj16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(obj16);
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant15, (org.joda.time.ReadableDuration) duration17);
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant14, (org.joda.time.ReadableDuration) duration17);
        org.joda.time.Duration duration20 = duration17.toDuration();
        int int21 = duration11.compareTo((org.joda.time.ReadableDuration) duration20);
        org.joda.time.Hours hours22 = duration20.toStandardHours();
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period24 = duration20.toPeriodFrom(readableInstant23);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration20);
        org.joda.time.Period period26 = duration20.toPeriod();
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Interval interval28 = duration20.toIntervalFrom(readableInstant27);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(interval28);
    }

    @Test
    public void test22089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22089");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds9 = duration8.toStandardSeconds();
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds12 = duration11.toStandardSeconds();
        boolean boolean13 = duration8.isLongerThan((org.joda.time.ReadableDuration) duration11);
        org.joda.time.Period period14 = duration8.toPeriod();
        boolean boolean15 = duration4.isLongerThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = duration4.toPeriodTo(readableInstant16);
        int int18 = period17.getMonths();
        org.joda.time.Period period20 = period17.minusMinutes(54);
        org.joda.time.Period period22 = period17.withSeconds((-2147483648));
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period17.toDurationTo(readableInstant23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period26 = duration24.toPeriodFrom(readableInstant25);
        org.joda.time.Period period28 = period26.plusHours((int) (short) -1);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
    }

    @Test
    public void test22090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22090");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds(54);
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds4 = duration3.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType5 = seconds4.getFieldType();
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.parseSeconds("P0W");
        org.joda.time.Seconds seconds8 = seconds4.minus(seconds7);
        org.joda.time.Seconds seconds9 = seconds4.negated();
        org.joda.time.Seconds seconds11 = org.joda.time.Seconds.seconds((int) (short) 0);
        org.joda.time.Seconds seconds12 = seconds9.minus(seconds11);
        org.joda.time.Seconds seconds13 = seconds1.minus(seconds9);
        org.joda.time.Seconds seconds15 = seconds9.minus(0);
        java.lang.String str16 = seconds9.toString();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PT-60S" + "'", str16, "PT-60S");
    }

    @Test
    public void test22091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22091");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardSeconds((long) 2147483647);
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType6 = periodType5.withMonthsRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withMinutesRemoved();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) (short) 0, periodType6, chronology8);
        org.joda.time.PeriodType periodType10 = periodType6.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(readableInstant1, (org.joda.time.ReadableDuration) duration3, periodType10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((-2147483648000L), periodType10, chronology12);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test22092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22092");
        org.joda.time.Days days0 = org.joda.time.Days.ZERO;
        int int1 = days0.getDays();
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period6 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days7 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period6);
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        boolean boolean9 = days4.isGreaterThan(days7);
        org.joda.time.Period period11 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days12 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Days days13 = days7.minus(days12);
        org.joda.time.Days days14 = days0.minus(days7);
        org.joda.time.Duration duration15 = days7.toStandardDuration();
        java.lang.String str16 = duration15.toString();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PT0S" + "'", str16, "PT0S");
    }

    @Test
    public void test22093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22093");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        boolean boolean4 = weeks1.isLessThan(weeks3);
        org.joda.time.Weeks weeks6 = weeks3.minus((int) (short) -1);
        org.joda.time.Duration duration7 = weeks3.toStandardDuration();
        org.joda.time.PeriodType periodType8 = weeks3.getPeriodType();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test22094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22094");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (short) -1, (int) '#', (int) ' ', 100);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.days();
        int int6 = mutablePeriod4.get(durationFieldType5);
        org.joda.time.Hours hours7 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        mutablePeriod4.setPeriod(readableInstant8, readableInstant9);
        mutablePeriod4.add((-2147483648), 40, (-160), 27, 1, 515, 7, 54);
        mutablePeriod4.setMinutes(2400);
        mutablePeriod4.setWeeks((-73));
        mutablePeriod4.setMinutes(38);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(hours7);
    }

    @Test
    public void test22095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22095");
        org.joda.time.Hours hours0 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours2 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean3 = hours0.isGreaterThan(hours2);
        org.joda.time.Hours hours5 = hours0.minus((int) (byte) 0);
        org.joda.time.Hours hours7 = org.joda.time.Hours.hours((int) (byte) 0);
        boolean boolean8 = hours5.isGreaterThan(hours7);
        org.joda.time.Duration duration9 = hours7.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType18 = periodType17.withWeeksRemoved();
        org.joda.time.PeriodType periodType19 = periodType18.withDaysRemoved();
        org.joda.time.Period period20 = new org.joda.time.Period((long) 'a', (long) (short) 0, periodType19);
        org.joda.time.Period period21 = new org.joda.time.Period((long) ' ', (long) '#', periodType19);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(readableInstant11, readableInstant12, periodType19);
        org.joda.time.Period period23 = duration9.toPeriodTo(readableInstant10, periodType19);
        org.joda.time.PeriodType periodType24 = periodType19.withHoursRemoved();
        org.joda.time.PeriodType periodType25 = periodType19.withMinutesRemoved();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
    }

    @Test
    public void test22096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22096");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) (byte) 0);
        org.joda.time.Days days2 = duration1.toStandardDays();
        org.joda.time.Days days3 = org.joda.time.Days.ZERO;
        org.joda.time.Period period5 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Days days8 = days6.minus(10);
        boolean boolean9 = days3.isGreaterThan(days6);
        org.joda.time.Period period11 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days12 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period14 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days15 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period14);
        org.joda.time.PeriodType periodType16 = days15.getPeriodType();
        boolean boolean17 = days12.isGreaterThan(days15);
        org.joda.time.Period period19 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days20 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period19);
        org.joda.time.Days days21 = days15.minus(days20);
        int int22 = days15.size();
        org.joda.time.Days days23 = org.joda.time.Days.ZERO;
        org.joda.time.Period period25 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days26 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Days days28 = days26.minus(10);
        boolean boolean29 = days23.isGreaterThan(days26);
        org.joda.time.Days days30 = days15.minus(days26);
        org.joda.time.Days days31 = days3.minus(days26);
        boolean boolean32 = days2.isGreaterThan(days31);
        org.joda.time.Days days33 = days2.negated();
        org.joda.time.Duration duration35 = new org.joda.time.Duration((long) (-1));
        org.joda.time.Duration duration37 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Period period39 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days40 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period39);
        org.joda.time.PeriodType periodType41 = days40.getPeriodType();
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(readableInstant42, readableDuration43);
        mutablePeriod44.setHours((int) (short) 100);
        boolean boolean47 = periodType41.equals((java.lang.Object) mutablePeriod44);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((java.lang.Object) duration37, periodType41, chronology48);
        boolean boolean50 = duration35.isEqual((org.joda.time.ReadableDuration) duration37);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Interval interval52 = duration37.toIntervalTo(readableInstant51);
        org.joda.time.Days days53 = duration37.toStandardDays();
        boolean boolean54 = days2.isGreaterThan(days53);
        org.joda.time.Days days56 = days2.plus(0);
        org.joda.time.Days days58 = days2.plus((-2147483638));
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(days40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(days53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(days56);
        org.junit.Assert.assertNotNull(days58);
    }

    @Test
    public void test22097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22097");
        org.joda.time.Period period4 = new org.joda.time.Period((int) 'a', 5940, 31, 0);
    }

    @Test
    public void test22098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22098");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        mutablePeriod2.setHours((int) (short) 100);
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration6, chronology7);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds11 = duration10.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType12 = seconds11.getFieldType();
        mutablePeriod2.add(durationFieldType12, (int) (short) 0);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(readableInstant15, readableDuration16);
        mutablePeriod17.setHours((int) (short) 100);
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology22 = null;
        mutablePeriod17.setPeriod((org.joda.time.ReadableDuration) duration21, chronology22);
        org.joda.time.Chronology chronology24 = null;
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration21, chronology24);
        org.joda.time.Duration duration27 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds28 = duration27.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType29 = seconds28.getFieldType();
        org.joda.time.Seconds seconds31 = seconds28.plus(25);
        org.joda.time.Seconds seconds32 = seconds28.negated();
        org.joda.time.PeriodType periodType33 = seconds32.getPeriodType();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = duration21.toPeriod(periodType33, chronology34);
        org.joda.time.Duration duration36 = duration21.toDuration();
        org.joda.time.Seconds seconds37 = duration36.toStandardSeconds();
        org.joda.time.MutablePeriod mutablePeriod38 = seconds37.toMutablePeriod();
        mutablePeriod38.addYears((int) 'a');
        int int41 = mutablePeriod38.getSeconds();
        mutablePeriod38.add((long) (-10));
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(seconds37);
        org.junit.Assert.assertNotNull(mutablePeriod38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 60 + "'", int41 == 60);
    }

    @Test
    public void test22099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22099");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(1040400L);
        org.joda.time.Duration duration3 = duration1.minus((long) (-8));
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
    }

    @Test
    public void test22100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22100");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("PT671S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22101");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        boolean boolean4 = weeks1.isLessThan(weeks3);
        org.joda.time.Weeks weeks6 = weeks3.minus((int) (short) -1);
        org.joda.time.MutablePeriod mutablePeriod7 = weeks3.toMutablePeriod();
        java.lang.Object obj8 = mutablePeriod7.clone();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((java.lang.Object) mutablePeriod7, chronology9);
        int int11 = mutablePeriod7.getMillis();
        org.joda.time.Period period12 = mutablePeriod7.toPeriod();
        org.joda.time.Period period14 = period12.withMonths(96);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "PT0S");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test22102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22102");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-22), chronology1);
    }

    @Test
    public void test22103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22103");
        org.joda.time.Days days0 = org.joda.time.Days.ZERO;
        int int1 = days0.getDays();
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period6 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days7 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period6);
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        boolean boolean9 = days4.isGreaterThan(days7);
        org.joda.time.Period period11 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days12 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Days days13 = days7.minus(days12);
        org.joda.time.Days days14 = days0.minus(days7);
        org.joda.time.Days days16 = days7.plus((int) (byte) 1);
        org.joda.time.Days days18 = days7.dividedBy((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType19 = days7.getFieldType();
        org.joda.time.DurationFieldType durationFieldType20 = days7.getFieldType();
        int int21 = days7.size();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test22104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22104");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        boolean boolean4 = weeks1.isLessThan(weeks3);
        org.joda.time.Weeks weeks5 = weeks1.negated();
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.weeksIn(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.Weeks weeks9 = org.joda.time.Weeks.weeksIn(readableInterval8);
        boolean boolean10 = weeks7.isLessThan(weeks9);
        org.joda.time.Weeks weeks11 = weeks7.negated();
        org.joda.time.Weeks weeks13 = weeks11.minus((int) (byte) 100);
        org.joda.time.Weeks weeks14 = weeks5.plus(weeks11);
        org.joda.time.Weeks weeks15 = null;
        org.joda.time.Weeks weeks16 = weeks5.plus(weeks15);
        org.joda.time.Weeks weeks18 = weeks16.multipliedBy((int) ' ');
        org.joda.time.Weeks weeks19 = weeks18.negated();
        org.joda.time.DurationFieldType durationFieldType20 = weeks19.getFieldType();
        org.joda.time.Chronology chronology21 = null;
        boolean boolean22 = durationFieldType20.isSupported(chronology21);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test22105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22105");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter2.getPrinter();
        boolean boolean5 = periodFormatter2.isParser();
        java.util.Locale locale6 = null;
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withLocale(locale6);
        java.util.Locale locale8 = null;
        org.joda.time.format.PeriodFormatter periodFormatter9 = periodFormatter7.withLocale(locale8);
        java.util.Locale locale10 = periodFormatter9.getLocale();
        org.joda.time.format.PeriodParser periodParser11 = periodFormatter9.getParser();
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNotNull(periodFormatter9);
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNull(periodParser11);
    }

    @Test
    public void test22106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22106");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType3 = periodType2.withSecondsRemoved();
        org.joda.time.Hours hours5 = org.joda.time.Hours.hours(25);
        org.joda.time.DurationFieldType durationFieldType6 = hours5.getFieldType();
        org.joda.time.Duration duration7 = org.joda.time.Duration.ZERO;
        long long8 = duration7.getStandardDays();
        org.joda.time.Hours hours9 = duration7.toStandardHours();
        boolean boolean10 = hours5.isLessThan(hours9);
        boolean boolean11 = periodType2.equals((java.lang.Object) boolean10);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(0L, 120L, periodType2);
        org.joda.time.Period period13 = mutablePeriod12.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod12.setMillis(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test22107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22107");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.ZERO;
        boolean boolean2 = minutes0.isLessThan(minutes1);
        org.joda.time.Minutes minutes3 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType4 = minutes3.getPeriodType();
        int int5 = minutes3.getMinutes();
        java.lang.String str6 = minutes3.toString();
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType8 = minutes7.getFieldType();
        java.lang.String str9 = minutes7.toString();
        boolean boolean10 = minutes3.isLessThan(minutes7);
        int int11 = minutes3.size();
        org.joda.time.Minutes minutes12 = minutes0.plus(minutes3);
        org.joda.time.Minutes minutes14 = minutes0.dividedBy((int) (short) -1);
        org.joda.time.Minutes minutes15 = minutes14.negated();
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType19 = periodType18.withWeeksRemoved();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = duration17.toPeriod(periodType18, chronology20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType24 = periodType23.withMonthsRemoved();
        org.joda.time.Period period25 = duration17.toPeriodTo(readableInstant22, periodType24);
        org.joda.time.Minutes minutes26 = duration17.toStandardMinutes();
        org.joda.time.Minutes minutes28 = minutes26.multipliedBy((int) (short) -1);
        org.joda.time.Minutes minutes29 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType30 = minutes29.getPeriodType();
        org.joda.time.Minutes minutes31 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes32 = minutes29.plus(minutes31);
        org.joda.time.Minutes minutes33 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes34 = org.joda.time.Minutes.ZERO;
        boolean boolean35 = minutes33.isLessThan(minutes34);
        boolean boolean36 = minutes29.isLessThan(minutes33);
        org.joda.time.Minutes minutes38 = minutes33.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes39 = minutes38.negated();
        org.joda.time.Minutes minutes40 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType41 = minutes40.getPeriodType();
        org.joda.time.Minutes minutes42 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes43 = minutes40.plus(minutes42);
        org.joda.time.Minutes minutes44 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes45 = org.joda.time.Minutes.ZERO;
        boolean boolean46 = minutes44.isLessThan(minutes45);
        boolean boolean47 = minutes40.isLessThan(minutes44);
        org.joda.time.Duration duration48 = minutes40.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        java.lang.Object obj51 = null;
        org.joda.time.Duration duration52 = new org.joda.time.Duration(obj51);
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant50, (org.joda.time.ReadableDuration) duration52);
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant49, (org.joda.time.ReadableDuration) duration52);
        org.joda.time.Duration duration56 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType57 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType58 = periodType57.withWeeksRemoved();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.Period period60 = duration56.toPeriod(periodType57, chronology59);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.PeriodType periodType62 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType63 = periodType62.withMonthsRemoved();
        org.joda.time.Period period64 = duration56.toPeriodTo(readableInstant61, periodType63);
        org.joda.time.Period period65 = duration56.toPeriod();
        org.joda.time.Duration duration66 = duration52.plus((org.joda.time.ReadableDuration) duration56);
        org.joda.time.Duration duration68 = duration48.withDurationAdded((org.joda.time.ReadableDuration) duration56, 25);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Interval interval70 = duration48.toIntervalFrom(readableInstant69);
        org.joda.time.Minutes minutes71 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval70);
        org.joda.time.Minutes minutes72 = minutes38.plus(minutes71);
        org.joda.time.Minutes minutes73 = minutes26.plus(minutes71);
        org.joda.time.Minutes minutes75 = minutes26.dividedBy((int) 'a');
        org.joda.time.PeriodType periodType76 = minutes26.getPeriodType();
        boolean boolean77 = minutes15.isLessThan(minutes26);
        org.joda.time.Minutes minutes79 = minutes26.minus(6);
        org.joda.time.PeriodType periodType80 = minutes79.getPeriodType();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0M" + "'", str6, "PT0M");
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT-2147483648M" + "'", str9, "PT-2147483648M");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(minutes38);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertNotNull(minutes43);
        org.junit.Assert.assertNotNull(minutes44);
        org.junit.Assert.assertNotNull(minutes45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertNotNull(interval70);
        org.junit.Assert.assertNotNull(minutes71);
        org.junit.Assert.assertNotNull(minutes72);
        org.junit.Assert.assertNotNull(minutes73);
        org.junit.Assert.assertNotNull(minutes75);
        org.junit.Assert.assertNotNull(periodType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(minutes79);
        org.junit.Assert.assertNotNull(periodType80);
    }

    @Test
    public void test22108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22108");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(0L);
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(readableInstant6, readableDuration7);
        mutablePeriod8.setHours((int) (short) 100);
        boolean boolean11 = periodType5.equals((java.lang.Object) mutablePeriod8);
        org.joda.time.Duration duration12 = org.joda.time.Duration.ZERO;
        long long13 = duration12.getStandardDays();
        mutablePeriod8.add((org.joda.time.ReadableDuration) duration12);
        mutablePeriod8.clear();
        org.joda.time.Period period17 = org.joda.time.Period.hours(0);
        org.joda.time.DurationFieldType durationFieldType19 = period17.getFieldType((int) (short) 1);
        mutablePeriod8.set(durationFieldType19, (int) (short) -1);
        mutablePeriod1.set(durationFieldType19, 32);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = mutablePeriod1.toDurationTo(readableInstant24);
        mutablePeriod1.addMinutes((-7));
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(duration25);
    }

    @Test
    public void test22109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22109");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(7, 8, 3, 4);
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.weeksIn(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.Weeks weeks8 = org.joda.time.Weeks.weeksIn(readableInterval7);
        boolean boolean9 = weeks6.isLessThan(weeks8);
        org.joda.time.Weeks weeks11 = weeks8.minus((int) (short) -1);
        org.joda.time.Weeks weeks12 = weeks11.negated();
        org.joda.time.Weeks weeks14 = weeks11.multipliedBy(0);
        org.joda.time.Weeks weeks16 = weeks14.multipliedBy(0);
        org.joda.time.Weeks weeks18 = weeks14.plus((int) '4');
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((java.lang.Object) weeks14, chronology19);
        org.joda.time.Weeks weeks22 = weeks14.multipliedBy((int) (short) -1);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) weeks22);
        mutablePeriod4.addMonths(8);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = mutablePeriod4.toDurationFrom(readableInstant26);
        org.joda.time.Duration duration29 = duration27.withMillis((long) 6);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration29);
    }

    @Test
    public void test22110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22110");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.seconds(100);
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.DurationFieldType durationFieldType4 = seconds3.getFieldType();
        boolean boolean5 = seconds2.isGreaterThan(seconds3);
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod8.addYears((int) '4');
        org.joda.time.Chronology chronology12 = null;
        mutablePeriod8.add((long) 100, chronology12);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds16 = duration15.toStandardSeconds();
        java.lang.String str17 = seconds16.toString();
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.days();
        boolean boolean19 = seconds16.isSupported(durationFieldType18);
        int int20 = mutablePeriod8.get(durationFieldType18);
        boolean boolean21 = seconds3.isSupported(durationFieldType18);
        org.joda.time.Seconds seconds23 = seconds3.dividedBy((int) ' ');
        org.joda.time.Duration duration24 = seconds3.toStandardDuration();
        org.joda.time.Seconds seconds25 = duration24.toStandardSeconds();
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration24);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT60S" + "'", str17, "PT60S");
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(seconds25);
    }

    @Test
    public void test22111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22111");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = period1.withSeconds((int) ' ');
        java.lang.String str5 = period1.toString();
        int int6 = period1.getMinutes();
        org.joda.time.Period period7 = period1.toPeriod();
        org.joda.time.Period period9 = period7.plusMonths(0);
        org.joda.time.Period period11 = period9.withYears((int) (short) 0);
        org.joda.time.Period period13 = period11.multipliedBy((int) (short) 10);
        org.joda.time.Period period15 = period13.plusMinutes(0);
        org.joda.time.Period period16 = period15.normalizedStandard();
        org.joda.time.Period period18 = period16.minusDays(60);
        org.joda.time.Period period20 = period18.withMonths(54);
        org.joda.time.Period period22 = period18.withYears(8);
        org.joda.time.Period period24 = period18.plusMillis(54);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT1M" + "'", str5, "PT1M");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
    }

    @Test
    public void test22112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22112");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        int int2 = minutes0.getMinutes();
        java.lang.String str3 = minutes0.toString();
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType5 = minutes4.getFieldType();
        java.lang.String str6 = minutes4.toString();
        boolean boolean7 = minutes0.isLessThan(minutes4);
        org.joda.time.Minutes minutes9 = minutes4.minus(0);
        int int10 = minutes9.getMinutes();
        org.joda.time.Minutes minutes12 = minutes9.dividedBy(596);
        org.joda.time.Minutes minutes14 = minutes12.minus(18);
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0M" + "'", str3, "PT0M");
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT-2147483648M" + "'", str6, "PT-2147483648M");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2147483648) + "'", int10 == (-2147483648));
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes14);
    }

    @Test
    public void test22113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22113");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) 10);
        java.lang.String str2 = duration1.toString();
        org.joda.time.Duration duration4 = duration1.minus((long) (byte) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(readableInstant5, readableDuration6);
        mutablePeriod7.setHours((int) (short) 100);
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology12 = null;
        mutablePeriod7.setPeriod((org.joda.time.ReadableDuration) duration11, chronology12);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds16 = duration15.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType17 = seconds16.getFieldType();
        mutablePeriod7.add(durationFieldType17, (int) (short) 0);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(readableInstant20, readableDuration21);
        mutablePeriod22.setHours((int) (short) 100);
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology27 = null;
        mutablePeriod22.setPeriod((org.joda.time.ReadableDuration) duration26, chronology27);
        org.joda.time.Chronology chronology29 = null;
        mutablePeriod7.setPeriod((org.joda.time.ReadableDuration) duration26, chronology29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        boolean boolean32 = duration26.isEqual(readableDuration31);
        org.joda.time.Duration duration33 = duration1.minus((org.joda.time.ReadableDuration) duration26);
        long long34 = duration26.getMillis();
        java.lang.String str35 = duration26.toString();
        org.joda.time.Duration duration37 = duration26.withMillis((long) (-1073741764));
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT600S" + "'", str2, "PT600S");
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 60000L + "'", long34 == 60000L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PT60S" + "'", str35, "PT60S");
        org.junit.Assert.assertNotNull(duration37);
    }

    @Test
    public void test22114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22114");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod2.addYears((int) '4');
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod2.add((long) 100, chronology6);
        mutablePeriod2.add(1, 10, (int) 'a', 52, (int) (short) 100, 0, (int) (byte) 0, (int) (byte) 10);
        org.joda.time.Seconds seconds18 = org.joda.time.Seconds.seconds(0);
        mutablePeriod2.mergePeriod((org.joda.time.ReadablePeriod) seconds18);
        int int20 = mutablePeriod2.getMonths();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod2);
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period29 = org.joda.time.Period.hours(0);
        org.joda.time.DurationFieldType durationFieldType31 = period29.getFieldType((int) (short) 1);
        org.joda.time.Period period33 = period29.plusDays(10);
        boolean boolean34 = periodType27.equals((java.lang.Object) 10);
        org.joda.time.Period period35 = new org.joda.time.Period((long) ' ', periodType27);
        org.joda.time.PeriodType periodType36 = periodType27.withDaysRemoved();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 2, (long) 32, periodType36, chronology37);
        org.joda.time.DurationFieldType durationFieldType39 = null;
        int int40 = periodType36.indexOf(durationFieldType39);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(540000L, (long) 600, periodType36);
        boolean boolean42 = mutablePeriod21.equals((java.lang.Object) 540000L);
        org.joda.time.ReadableDuration readableDuration43 = null;
        mutablePeriod21.add(readableDuration43);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test22115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22115");
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(864000000L, chronology9);
        org.joda.time.PeriodType periodType11 = period10.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(5940, 88500, 120, (-672), (-565), (-596526), (-87), 990, periodType11);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test22116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22116");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration1 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = duration1.toPeriod(chronology2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration1);
        org.joda.time.Seconds seconds5 = duration1.toStandardSeconds();
        org.joda.time.Seconds seconds7 = seconds5.minus(15120008);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds7);
    }

    @Test
    public void test22117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22117");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.millis((long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) '4', chronology6);
        org.joda.time.Duration duration8 = org.joda.time.Duration.ZERO;
        long long9 = duration8.getStandardDays();
        org.joda.time.Hours hours10 = duration8.toStandardHours();
        long long11 = duration8.getStandardMinutes();
        long long12 = duration8.getStandardDays();
        mutablePeriod7.setPeriod((org.joda.time.ReadableDuration) duration8);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = duration8.toPeriod(chronology14);
        boolean boolean16 = duration2.isLongerThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.Duration duration18 = duration2.withMillis((long) (-1073741824));
        org.joda.time.Duration duration19 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = duration19.toPeriod(chronology20);
        org.joda.time.Hours hours22 = duration19.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType23 = hours22.getFieldType();
        org.joda.time.Hours hours24 = org.joda.time.Hours.ONE;
        org.joda.time.DurationFieldType durationFieldType25 = hours24.getFieldType();
        org.joda.time.Hours hours26 = hours22.plus(hours24);
        org.joda.time.Hours hours28 = org.joda.time.Hours.hours(25);
        org.joda.time.DurationFieldType durationFieldType29 = hours28.getFieldType();
        org.joda.time.Duration duration30 = org.joda.time.Duration.ZERO;
        long long31 = duration30.getStandardDays();
        org.joda.time.Hours hours32 = duration30.toStandardHours();
        boolean boolean33 = hours28.isLessThan(hours32);
        org.joda.time.Hours hours35 = hours28.dividedBy((int) (byte) 10);
        org.joda.time.Hours hours36 = hours22.minus(hours35);
        org.joda.time.Hours hours37 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours39 = hours37.minus((int) (byte) 10);
        org.joda.time.PeriodType periodType40 = hours37.getPeriodType();
        org.joda.time.Hours hours41 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours42 = hours41.negated();
        java.lang.String str43 = hours42.toString();
        java.lang.String str44 = hours42.toString();
        org.joda.time.Hours hours45 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours47 = hours45.minus(10);
        org.joda.time.Hours hours48 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours50 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean51 = hours48.isGreaterThan(hours50);
        org.joda.time.Hours hours53 = hours48.minus((int) (byte) 0);
        org.joda.time.Hours hours55 = hours53.minus((int) '#');
        org.joda.time.Duration duration56 = hours55.toStandardDuration();
        org.joda.time.Hours hours57 = hours47.minus(hours55);
        org.joda.time.Hours hours58 = hours42.minus(hours47);
        org.joda.time.Hours hours59 = hours37.minus(hours47);
        org.joda.time.Hours hours61 = hours37.plus((int) (short) 1);
        boolean boolean62 = hours22.isGreaterThan(hours37);
        org.joda.time.PeriodType periodType63 = hours37.getPeriodType();
        java.lang.String str64 = periodType63.toString();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration2, periodType63);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(hours24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(hours28);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(hours32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(hours35);
        org.junit.Assert.assertNotNull(hours36);
        org.junit.Assert.assertNotNull(hours37);
        org.junit.Assert.assertNotNull(hours39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(hours41);
        org.junit.Assert.assertNotNull(hours42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "PT-8H" + "'", str43, "PT-8H");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "PT-8H" + "'", str44, "PT-8H");
        org.junit.Assert.assertNotNull(hours45);
        org.junit.Assert.assertNotNull(hours47);
        org.junit.Assert.assertNotNull(hours48);
        org.junit.Assert.assertNotNull(hours50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(hours53);
        org.junit.Assert.assertNotNull(hours55);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(hours57);
        org.junit.Assert.assertNotNull(hours58);
        org.junit.Assert.assertNotNull(hours59);
        org.junit.Assert.assertNotNull(hours61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "PeriodType[Hours]" + "'", str64, "PeriodType[Hours]");
    }

    @Test
    public void test22118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22118");
        org.joda.time.Period period1 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period3 = period1.withHours(32);
        org.joda.time.Period period5 = period3.minusYears(3);
        int int6 = period5.getWeeks();
        org.joda.time.Period period8 = period5.plusHours((-940));
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test22119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22119");
        org.joda.time.Period period1 = org.joda.time.Period.months((-20));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours2 = period1.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test22120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22120");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period7 = period4.withSeconds((int) ' ');
        org.joda.time.Period period8 = period1.minus((org.joda.time.ReadablePeriod) period4);
        int int9 = period4.getDays();
        org.joda.time.Duration duration10 = period4.toStandardDuration();
        long long11 = duration10.getStandardMinutes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test22121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22121");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.format.PeriodParser periodParser4 = periodFormatter3.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter5 = periodFormatter3.getPrinter();
        boolean boolean6 = periodFormatter3.isParser();
        java.util.Locale locale7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter3.withLocale(locale7);
        java.util.Locale locale9 = null;
        org.joda.time.format.PeriodFormatter periodFormatter10 = periodFormatter8.withLocale(locale9);
        boolean boolean11 = periodFormatter8.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = org.joda.time.Period.parse("PT-2400S", periodFormatter8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser4);
        org.junit.Assert.assertNull(periodPrinter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(periodFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test22122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22122");
        org.joda.time.Days days1 = org.joda.time.Days.days(0);
        org.joda.time.Days days3 = days1.dividedBy(7);
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType7 = periodType6.withWeeksRemoved();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = duration5.toPeriod(periodType6, chronology8);
        org.joda.time.Days days10 = org.joda.time.Days.ZERO;
        int int11 = days10.getDays();
        org.joda.time.Period period13 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days14 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period16 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days17 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period16);
        org.joda.time.PeriodType periodType18 = days17.getPeriodType();
        boolean boolean19 = days14.isGreaterThan(days17);
        org.joda.time.Period period21 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days22 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Days days23 = days17.minus(days22);
        org.joda.time.Days days24 = days10.minus(days17);
        boolean boolean25 = duration5.equals((java.lang.Object) days17);
        org.joda.time.Period period27 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days28 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period27);
        org.joda.time.Days days30 = days28.minus(10);
        org.joda.time.Days days32 = days30.plus((int) (short) -1);
        org.joda.time.Days days33 = days17.plus(days30);
        org.joda.time.Days days34 = days1.plus(days33);
        org.joda.time.PeriodType periodType35 = days1.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((int) (short) -1, (int) '#', (int) ' ', 100);
        org.joda.time.DurationFieldType durationFieldType41 = org.joda.time.DurationFieldType.days();
        int int42 = mutablePeriod40.get(durationFieldType41);
        mutablePeriod40.setPeriod((long) (-32));
        org.joda.time.MutablePeriod mutablePeriod45 = mutablePeriod40.toMutablePeriod();
        mutablePeriod45.addDays(59);
        boolean boolean48 = periodType35.equals((java.lang.Object) mutablePeriod45);
        mutablePeriod45.add((long) ' ');
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test22123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22123");
        org.joda.time.Period period1 = org.joda.time.Period.hours((-32));
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        long long4 = duration3.getMillis();
        long long5 = duration3.getStandardMinutes();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        java.lang.Object obj9 = null;
        org.joda.time.Duration duration10 = new org.joda.time.Duration(obj9);
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant8, (org.joda.time.ReadableDuration) duration10);
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant7, (org.joda.time.ReadableDuration) duration10);
        org.joda.time.Duration duration13 = duration10.toDuration();
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant6, (org.joda.time.ReadableDuration) duration13);
        org.joda.time.Duration duration16 = duration3.withDurationAdded((org.joda.time.ReadableDuration) duration13, 10);
        java.lang.String str17 = duration3.toString();
        long long18 = duration3.getStandardDays();
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration21 = org.joda.time.Duration.millis(101L);
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant19, (org.joda.time.ReadableDuration) duration21);
        boolean boolean23 = duration3.equals((java.lang.Object) period22);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115200000L) + "'", long4 == (-115200000L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1920L) + "'", long5 == (-1920L));
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT-115200S" + "'", str17, "PT-115200S");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test22124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22124");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((-1), 0, (int) (byte) 1, (int) 'a', 10, (int) (byte) 1, (int) (short) -1, (-1));
        org.joda.time.Period period10 = org.joda.time.Period.months(1);
        org.joda.time.Minutes minutes11 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType12 = minutes11.getFieldType();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DurationField durationField14 = durationFieldType12.getField(chronology13);
        org.joda.time.Period period16 = period10.withField(durationFieldType12, 0);
        int int17 = mutablePeriod8.get(durationFieldType12);
        org.joda.time.Period period18 = mutablePeriod8.toPeriod();
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        mutablePeriod8.setPeriod(readableInstant19, readableInstant20);
        mutablePeriod8.addMonths((int) (byte) 1);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test22125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22125");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 8, 17340L, chronology2);
        org.joda.time.Minutes minutes4 = period3.toStandardMinutes();
        org.joda.time.Minutes minutes5 = minutes4.negated();
        org.joda.time.Duration duration6 = minutes4.toStandardDuration();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.Duration duration10 = duration8.plus((long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Interval interval12 = duration8.toIntervalFrom(readableInstant11);
        int int13 = duration6.compareTo((org.joda.time.ReadableDuration) duration8);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test22126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22126");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        int int8 = days2.size();
        org.joda.time.Days days9 = days2.negated();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) days9, chronology10);
        org.joda.time.Days days13 = days9.multipliedBy(200);
        int int14 = days13.getDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test22127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22127");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes(17340L);
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period6 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days7 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period6);
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        boolean boolean9 = days4.isGreaterThan(days7);
        org.joda.time.Days days11 = days4.minus(1);
        org.joda.time.Days days13 = days11.dividedBy(60);
        org.joda.time.Days days14 = org.joda.time.Days.ZERO;
        int int15 = days14.getDays();
        org.joda.time.Period period17 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days18 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Period period20 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days21 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period20);
        org.joda.time.PeriodType periodType22 = days21.getPeriodType();
        boolean boolean23 = days18.isGreaterThan(days21);
        org.joda.time.Period period25 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days26 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Days days27 = days21.minus(days26);
        org.joda.time.Days days28 = days14.minus(days21);
        org.joda.time.Period period30 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days31 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Period period33 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days34 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period33);
        org.joda.time.PeriodType periodType35 = days34.getPeriodType();
        boolean boolean36 = days31.isGreaterThan(days34);
        org.joda.time.Period period38 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days39 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period38);
        org.joda.time.Days days40 = days34.minus(days39);
        org.joda.time.Days days41 = days14.plus(days40);
        boolean boolean42 = days13.isGreaterThan(days41);
        org.joda.time.Duration duration43 = days13.toStandardDuration();
        org.joda.time.Duration duration45 = duration43.withMillis((long) 6);
        java.lang.String str46 = duration43.toString();
        org.joda.time.Duration duration47 = duration43.toDuration();
        boolean boolean48 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration43);
        org.joda.time.Period period49 = duration1.toPeriod();
        org.joda.time.Period period51 = period49.withYears(70);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(days39);
        org.junit.Assert.assertNotNull(days40);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "PT0S" + "'", str46, "PT0S");
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
    }

    @Test
    public void test22128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22128");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(600000L);
        java.lang.String str3 = duration2.toString();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds9 = duration8.toStandardSeconds();
        boolean boolean10 = duration5.isLongerThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Interval interval12 = duration8.toIntervalTo(readableInstant11);
        org.joda.time.Seconds seconds13 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval12);
        org.joda.time.Duration duration14 = seconds13.toStandardDuration();
        org.joda.time.Period period15 = duration14.toPeriod();
        boolean boolean16 = duration2.isShorterThan((org.joda.time.ReadableDuration) duration14);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType23);
        int int25 = period24.getMillis();
        org.joda.time.Period period27 = period24.plusDays((int) 'a');
        org.joda.time.Duration duration29 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds30 = duration29.toStandardSeconds();
        java.lang.String str31 = seconds30.toString();
        org.joda.time.PeriodType periodType32 = seconds30.getPeriodType();
        org.joda.time.PeriodType periodType33 = periodType32.withSecondsRemoved();
        org.joda.time.PeriodType periodType34 = periodType33.withDaysRemoved();
        org.joda.time.Period period35 = period27.normalizedStandard(periodType34);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(readableInstant19, readableInstant20, periodType34);
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant17, readableInstant18, periodType34);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration14, periodType34);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = mutablePeriod38.toDurationFrom(readableInstant39);
        org.joda.time.Duration duration41 = duration40.toDuration();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT600S" + "'", str3, "PT600S");
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 25 + "'", int25 == 25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PT60S" + "'", str31, "PT60S");
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(duration41);
    }

    @Test
    public void test22129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22129");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period3 = period1.plusYears((int) ' ');
        org.joda.time.Period period5 = period1.plusDays((int) (byte) -1);
        java.lang.String str6 = period5.toString();
        org.joda.time.Period period8 = period5.minusWeeks((-1));
        int int9 = period5.getMonths();
        org.joda.time.Period period11 = period5.minusMinutes(20);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        org.joda.time.Period period14 = period11.withHours(515);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P-1DT1M" + "'", str6, "P-1DT1M");
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test22130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22130");
        java.lang.Object obj1 = null;
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes((long) 10);
        java.lang.String str4 = duration3.toString();
        org.joda.time.Duration duration6 = duration3.minus((long) (byte) 10);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableInstant7, readableDuration8);
        mutablePeriod9.setHours((int) (short) 100);
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology14 = null;
        mutablePeriod9.setPeriod((org.joda.time.ReadableDuration) duration13, chronology14);
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds18 = duration17.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType19 = seconds18.getFieldType();
        mutablePeriod9.add(durationFieldType19, (int) (short) 0);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(readableInstant22, readableDuration23);
        mutablePeriod24.setHours((int) (short) 100);
        org.joda.time.Duration duration28 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology29 = null;
        mutablePeriod24.setPeriod((org.joda.time.ReadableDuration) duration28, chronology29);
        org.joda.time.Chronology chronology31 = null;
        mutablePeriod9.setPeriod((org.joda.time.ReadableDuration) duration28, chronology31);
        org.joda.time.ReadableDuration readableDuration33 = null;
        boolean boolean34 = duration28.isEqual(readableDuration33);
        org.joda.time.Duration duration35 = duration3.minus((org.joda.time.ReadableDuration) duration28);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Duration duration42 = org.joda.time.Duration.standardDays(0L);
        long long43 = duration42.getStandardHours();
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant45, readableInstant46, periodType47);
        org.joda.time.PeriodType periodType49 = periodType47.withWeeksRemoved();
        org.joda.time.Period period50 = duration42.toPeriodFrom(readableInstant44, periodType47);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod(0L, (long) 52, periodType47, chronology51);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) 40, (long) (-2147483648), periodType47, chronology53);
        org.joda.time.Duration duration56 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds57 = duration56.toStandardSeconds();
        org.joda.time.Duration duration59 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds60 = duration59.toStandardSeconds();
        boolean boolean61 = duration56.isLongerThan((org.joda.time.ReadableDuration) duration59);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.Interval interval63 = duration59.toIntervalTo(readableInstant62);
        org.joda.time.Seconds seconds64 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval63);
        org.joda.time.Duration duration65 = seconds64.toStandardDuration();
        org.joda.time.Seconds seconds66 = seconds64.negated();
        org.joda.time.DurationFieldType durationFieldType67 = seconds66.getFieldType();
        boolean boolean68 = periodType47.equals((java.lang.Object) durationFieldType67);
        org.joda.time.Period period69 = duration35.toPeriodFrom(readableInstant36, periodType47);
        org.joda.time.PeriodType periodType70 = periodType47.withHoursRemoved();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.Period period72 = new org.joda.time.Period(obj1, periodType47, chronology71);
        org.joda.time.Period period73 = new org.joda.time.Period(1500000L, periodType47);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT600S" + "'", str4, "PT600S");
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(seconds57);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(seconds60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(seconds64);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(seconds66);
        org.junit.Assert.assertNotNull(durationFieldType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(periodType70);
    }

    @Test
    public void test22131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22131");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) (-7));
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test22132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22132");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.DurationFieldType durationFieldType11 = seconds10.getFieldType();
        org.joda.time.Period period12 = seconds10.toPeriod();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(readableInstant13, readableDuration14);
        mutablePeriod15.setHours((int) (short) 100);
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology20 = null;
        mutablePeriod15.setPeriod((org.joda.time.ReadableDuration) duration19, chronology20);
        org.joda.time.Period period22 = duration19.toPeriod();
        org.joda.time.Period period24 = period22.plusWeeks(0);
        org.joda.time.Period period25 = period24.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod26 = period24.toMutablePeriod();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((java.lang.Object) mutablePeriod26, chronology27);
        java.lang.String str29 = period28.toString();
        org.joda.time.Period period31 = period28.plusMonths((-60));
        org.joda.time.Seconds seconds32 = period28.toStandardSeconds();
        boolean boolean33 = seconds10.isLessThan(seconds32);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(mutablePeriod26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PT1M" + "'", str29, "PT1M");
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test22133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22133");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod2.addYears((int) '4');
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod2.add((long) 100, chronology6);
        mutablePeriod2.add(1, 10, (int) 'a', 52, (int) (short) 100, 0, (int) (byte) 0, (int) (byte) 10);
        org.joda.time.Seconds seconds18 = org.joda.time.Seconds.seconds(0);
        mutablePeriod2.mergePeriod((org.joda.time.ReadablePeriod) seconds18);
        mutablePeriod2.setPeriod((long) ' ', (long) 13);
        mutablePeriod2.addSeconds((int) (byte) 1);
        int int25 = mutablePeriod2.getSeconds();
        mutablePeriod2.clear();
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test22134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22134");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.Period period4 = new org.joda.time.Period((long) 3, (long) 97, periodType3);
        int int5 = period4.getMillis();
        org.joda.time.Period period7 = period4.multipliedBy(600);
        org.joda.time.Period period8 = new org.joda.time.Period((java.lang.Object) period7);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test22135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22135");
        org.joda.time.Hours hours0 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours2 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean3 = hours0.isGreaterThan(hours2);
        org.joda.time.Duration duration4 = hours2.toStandardDuration();
        org.joda.time.Period period5 = duration4.toPeriod();
        org.joda.time.Period period7 = period5.minusSeconds((int) (byte) 100);
        org.joda.time.Period period9 = period5.plusMinutes((int) ' ');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        org.joda.time.Duration duration12 = org.joda.time.Duration.ZERO;
        long long13 = duration12.getStandardDays();
        org.joda.time.Hours hours14 = duration12.toStandardHours();
        org.joda.time.Duration duration16 = duration12.withMillis(0L);
        org.joda.time.Duration duration17 = duration12.toDuration();
        org.joda.time.Duration duration18 = org.joda.time.Duration.ZERO;
        long long19 = duration18.getStandardDays();
        org.joda.time.Hours hours20 = duration18.toStandardHours();
        long long21 = duration18.getStandardMinutes();
        org.joda.time.Duration duration22 = duration18.toDuration();
        org.joda.time.Duration duration24 = duration12.withDurationAdded((org.joda.time.ReadableDuration) duration22, 600);
        org.joda.time.Duration duration26 = duration11.withDurationAdded((org.joda.time.ReadableDuration) duration22, (int) (short) 1);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Period period28 = duration22.toPeriodFrom(readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration31 = new org.joda.time.Duration((long) (-1));
        org.joda.time.Period period32 = duration31.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(readableInstant29, (org.joda.time.ReadableDuration) duration31);
        boolean boolean34 = duration22.isShorterThan((org.joda.time.ReadableDuration) duration31);
        long long35 = duration31.getStandardDays();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test22136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22136");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 1, chronology1);
        org.joda.time.Chronology chronology4 = null;
        mutablePeriod2.setPeriod((long) (-2147483638), chronology4);
        org.joda.time.MutablePeriod mutablePeriod6 = mutablePeriod2.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableInstant8, readableDuration9);
        mutablePeriod10.setHours((int) (short) 100);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration14, chronology15);
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds19 = duration18.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType20 = seconds19.getFieldType();
        mutablePeriod10.add(durationFieldType20, (int) (short) 0);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(readableInstant23, readableDuration24);
        mutablePeriod25.setHours((int) (short) 100);
        org.joda.time.Duration duration29 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology30 = null;
        mutablePeriod25.setPeriod((org.joda.time.ReadableDuration) duration29, chronology30);
        org.joda.time.Chronology chronology32 = null;
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration29, chronology32);
        org.joda.time.ReadableDuration readableDuration34 = null;
        boolean boolean35 = duration29.isEqual(readableDuration34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration29, readableInstant36);
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds40 = duration39.toStandardSeconds();
        org.joda.time.Duration duration42 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds43 = duration42.toStandardSeconds();
        boolean boolean44 = duration39.isLongerThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType47 = periodType46.withMinutesRemoved();
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration42, readableInstant45, periodType46);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Interval interval50 = duration42.toIntervalFrom(readableInstant49);
        org.joda.time.Duration duration51 = duration29.plus((org.joda.time.ReadableDuration) duration42);
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant7, (org.joda.time.ReadableDuration) duration29);
        org.joda.time.Duration duration54 = org.joda.time.Duration.standardHours((long) (byte) -1);
        org.joda.time.Period period56 = org.joda.time.Period.seconds((int) (short) 100);
        org.joda.time.Seconds seconds57 = period56.toStandardSeconds();
        org.joda.time.Seconds seconds59 = seconds57.minus(1);
        org.joda.time.Period period60 = new org.joda.time.Period((java.lang.Object) seconds57);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Duration duration62 = period60.toDurationFrom(readableInstant61);
        int int63 = duration54.compareTo((org.joda.time.ReadableDuration) duration62);
        boolean boolean64 = duration29.isShorterThan((org.joda.time.ReadableDuration) duration54);
        long long65 = duration54.getStandardDays();
        mutablePeriod2.add((org.joda.time.ReadableDuration) duration54);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(seconds40);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(seconds43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(seconds57);
        org.junit.Assert.assertNotNull(seconds59);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
    }

    @Test
    public void test22137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22137");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-97), (long) 10);
        org.joda.time.Period period4 = period2.plusMonths(8);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test22138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22138");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.format.PeriodPrinter periodPrinter2 = null;
        org.joda.time.format.PeriodParser periodParser3 = null;
        org.joda.time.format.PeriodFormatter periodFormatter4 = new org.joda.time.format.PeriodFormatter(periodPrinter2, periodParser3);
        org.joda.time.format.PeriodParser periodParser5 = periodFormatter4.getParser();
        java.util.Locale locale6 = periodFormatter4.getLocale();
        org.joda.time.PeriodType periodType7 = periodFormatter4.getParseType();
        org.joda.time.Days days8 = org.joda.time.Days.ZERO;
        int int9 = days8.getDays();
        org.joda.time.Period period11 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days12 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period14 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days15 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period14);
        org.joda.time.PeriodType periodType16 = days15.getPeriodType();
        boolean boolean17 = days12.isGreaterThan(days15);
        org.joda.time.Period period19 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days20 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period19);
        org.joda.time.Days days21 = days15.minus(days20);
        org.joda.time.Days days22 = days8.minus(days15);
        org.joda.time.Days days24 = days15.plus((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType26 = days24.getFieldType((int) (short) 0);
        org.joda.time.PeriodType periodType27 = days24.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter28 = periodFormatter4.withParseType(periodType27);
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType31 = periodType30.withMinutesRemoved();
        org.joda.time.PeriodType periodType32 = periodType30.withYearsRemoved();
        org.joda.time.PeriodType periodType33 = periodType32.withDaysRemoved();
        org.joda.time.PeriodType periodType34 = periodType32.withWeeksRemoved();
        org.joda.time.Period period35 = new org.joda.time.Period((-60000L), periodType32);
        org.joda.time.format.PeriodFormatter periodFormatter36 = periodFormatter4.withParseType(periodType32);
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant0, readableDuration1, periodType32);
        org.joda.time.PeriodType periodType38 = periodType32.withHoursRemoved();
        org.junit.Assert.assertNull(periodParser5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNull(periodType7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodFormatter28);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(periodFormatter36);
        org.junit.Assert.assertNotNull(periodType38);
    }

    @Test
    public void test22139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22139");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) ' ');
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.Duration duration3 = seconds2.toStandardDuration();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        java.lang.String str7 = seconds6.toString();
        org.joda.time.Seconds seconds8 = seconds2.minus(seconds6);
        org.joda.time.Seconds seconds9 = seconds2.negated();
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds12 = duration11.toStandardSeconds();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = duration11.toPeriodTo(readableInstant13);
        org.joda.time.Duration duration15 = period14.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(readableInstant20, readableDuration21);
        mutablePeriod22.setPeriod((long) ' ', (long) 52);
        mutablePeriod22.addDays(100);
        org.joda.time.PeriodType periodType28 = mutablePeriod22.getPeriodType();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(10L, (long) 13, periodType28, chronology29);
        org.joda.time.Period period31 = new org.joda.time.Period(540000L, (long) (short) 100, periodType28);
        org.joda.time.PeriodType periodType32 = periodType28.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((java.lang.Object) duration15, periodType28);
        long long34 = duration15.getStandardDays();
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Interval interval36 = duration15.toIntervalFrom(readableInstant35);
        boolean boolean37 = seconds9.equals((java.lang.Object) interval36);
        org.joda.time.Period period38 = period1.plus((org.joda.time.ReadablePeriod) seconds9);
        org.joda.time.Seconds seconds39 = seconds9.negated();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT60S" + "'", str7, "PT60S");
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(seconds39);
    }

    @Test
    public void test22140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22140");
        org.joda.time.Days days5 = org.joda.time.Days.ZERO;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((java.lang.Object) days5, periodType6, chronology7);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 52, periodType6);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 7, (-60L), periodType6);
        org.joda.time.PeriodType periodType11 = periodType6.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) (short) 1, 75L, periodType6);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test22141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22141");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) '4');
        org.joda.time.Period period3 = period1.withMillis((-609));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test22142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22142");
        org.joda.time.Period period4 = new org.joda.time.Period(10, 0, (int) (byte) 10, (int) (byte) 10);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.DurationFieldType durationFieldType6 = minutes5.getFieldType();
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes8 = org.joda.time.Minutes.ZERO;
        boolean boolean9 = minutes7.isLessThan(minutes8);
        org.joda.time.Minutes minutes11 = minutes7.plus(52);
        boolean boolean12 = minutes5.isGreaterThan(minutes7);
        org.joda.time.Minutes minutes14 = minutes7.plus(6);
        org.joda.time.Minutes minutes16 = minutes7.dividedBy(60);
        org.joda.time.Minutes minutes18 = minutes7.multipliedBy(4);
        org.joda.time.Minutes minutes20 = minutes7.dividedBy(4);
        org.joda.time.Minutes minutes22 = minutes20.multipliedBy(600);
        org.joda.time.PeriodType periodType23 = minutes20.getPeriodType();
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(periodType23);
    }

    @Test
    public void test22143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22143");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) 10);
        java.lang.String str2 = duration1.toString();
        boolean boolean4 = duration1.equals((java.lang.Object) 100.0d);
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds7 = duration6.toStandardSeconds();
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds10 = duration9.toStandardSeconds();
        boolean boolean11 = duration6.isLongerThan((org.joda.time.ReadableDuration) duration9);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Interval interval13 = duration9.toIntervalTo(readableInstant12);
        org.joda.time.Seconds seconds14 = duration9.toStandardSeconds();
        boolean boolean15 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration9);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType19 = periodType18.withWeeksRemoved();
        org.joda.time.PeriodType periodType20 = periodType19.withDaysRemoved();
        org.joda.time.Period period21 = new org.joda.time.Period((long) 'a', (long) (short) 0, periodType20);
        org.joda.time.PeriodType periodType22 = periodType20.withYearsRemoved();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = duration1.toPeriod(periodType20, chronology23);
        long long25 = duration1.getStandardDays();
        org.joda.time.Period period26 = duration1.toPeriod();
        java.lang.Object obj27 = null;
        boolean boolean28 = duration1.equals(obj27);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT600S" + "'", str2, "PT600S");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test22144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22144");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.TWO;
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeksIn(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.weeksIn(readableInterval3);
        boolean boolean5 = weeks2.isLessThan(weeks4);
        org.joda.time.Weeks weeks6 = weeks2.negated();
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.Weeks weeks8 = org.joda.time.Weeks.weeksIn(readableInterval7);
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Weeks weeks10 = org.joda.time.Weeks.weeksIn(readableInterval9);
        boolean boolean11 = weeks8.isLessThan(weeks10);
        org.joda.time.Weeks weeks12 = weeks8.negated();
        org.joda.time.Weeks weeks14 = weeks12.minus((int) (byte) 100);
        org.joda.time.Weeks weeks15 = weeks6.plus(weeks12);
        boolean boolean16 = weeks0.isLessThan(weeks12);
        org.joda.time.Weeks weeks18 = weeks0.plus(25);
        org.joda.time.Weeks weeks20 = weeks18.multipliedBy(13);
        int int21 = weeks20.size();
        org.joda.time.Weeks weeks23 = weeks20.multipliedBy(515);
        org.joda.time.Weeks weeks25 = weeks20.dividedBy(99);
        org.joda.time.Weeks weeks27 = weeks25.dividedBy((-73));
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertNotNull(weeks27);
    }

    @Test
    public void test22145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22145");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        int int8 = days2.size();
        org.joda.time.Days days9 = days2.negated();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) days9, chronology10);
        org.joda.time.Period period13 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days14 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period16 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days17 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period16);
        org.joda.time.PeriodType periodType18 = days17.getPeriodType();
        boolean boolean19 = days14.isGreaterThan(days17);
        org.joda.time.MutablePeriod mutablePeriod20 = days14.toMutablePeriod();
        org.joda.time.Days days21 = days14.negated();
        boolean boolean22 = days9.isLessThan(days14);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((java.lang.Object) days9);
        org.joda.time.Period period25 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days26 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Period period28 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days29 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period28);
        org.joda.time.PeriodType periodType30 = days29.getPeriodType();
        boolean boolean31 = days26.isGreaterThan(days29);
        org.joda.time.Period period33 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days34 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period33);
        org.joda.time.Days days35 = days29.minus(days34);
        org.joda.time.Days days36 = null;
        boolean boolean37 = days35.isGreaterThan(days36);
        int int38 = days35.getDays();
        org.joda.time.Days days40 = days35.dividedBy(2);
        org.joda.time.Days days41 = days9.plus(days35);
        org.joda.time.Duration duration43 = org.joda.time.Duration.standardDays((-1L));
        org.joda.time.Days days44 = duration43.toStandardDays();
        java.lang.String str45 = days44.toString();
        org.joda.time.Days days46 = org.joda.time.Days.ZERO;
        int int47 = days46.getDays();
        org.joda.time.Period period49 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days50 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period49);
        org.joda.time.Period period52 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days53 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period52);
        org.joda.time.PeriodType periodType54 = days53.getPeriodType();
        boolean boolean55 = days50.isGreaterThan(days53);
        org.joda.time.Period period57 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days58 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period57);
        org.joda.time.Days days59 = days53.minus(days58);
        org.joda.time.Days days60 = days46.minus(days53);
        org.joda.time.Days days62 = days53.plus((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType64 = days62.getFieldType((int) (short) 0);
        org.joda.time.Period period65 = days62.toPeriod();
        org.joda.time.Days days66 = days44.plus(days62);
        boolean boolean67 = days35.isLessThan(days44);
        // The following exception was thrown during execution in test generation
        try {
            int int69 = days44.getValue(30);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 30");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(mutablePeriod20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertNotNull(days35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(days40);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(days44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "P-1D" + "'", str45, "P-1D");
        org.junit.Assert.assertNotNull(days46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(days50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(days53);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(days58);
        org.junit.Assert.assertNotNull(days59);
        org.junit.Assert.assertNotNull(days60);
        org.junit.Assert.assertNotNull(days62);
        org.junit.Assert.assertNotNull(durationFieldType64);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(days66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test22146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22146");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType3 = seconds2.getFieldType();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.parseSeconds("P0W");
        org.joda.time.Seconds seconds6 = seconds2.minus(seconds5);
        org.joda.time.Seconds seconds7 = seconds2.negated();
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType13 = periodType12.withWeeksRemoved();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = duration11.toPeriod(periodType12, chronology14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType18 = periodType17.withMonthsRemoved();
        org.joda.time.Period period19 = duration11.toPeriodTo(readableInstant16, periodType18);
        org.joda.time.Period period20 = duration11.toPeriod();
        boolean boolean21 = duration9.equals((java.lang.Object) period20);
        org.joda.time.Seconds seconds22 = duration9.toStandardSeconds();
        org.joda.time.Seconds seconds23 = seconds2.minus(seconds22);
        java.lang.String str24 = seconds23.toString();
        org.joda.time.PeriodType periodType25 = seconds23.getPeriodType();
        org.joda.time.Seconds seconds26 = org.joda.time.Seconds.ONE;
        org.joda.time.Duration duration28 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds29 = duration28.toStandardSeconds();
        java.lang.String str30 = seconds29.toString();
        org.joda.time.PeriodType periodType31 = seconds29.getPeriodType();
        org.joda.time.PeriodType periodType32 = seconds29.getPeriodType();
        org.joda.time.Seconds seconds33 = seconds26.minus(seconds29);
        org.joda.time.Seconds seconds35 = seconds29.plus(0);
        org.joda.time.Seconds seconds37 = seconds29.multipliedBy((int) (byte) 0);
        org.joda.time.Seconds seconds39 = seconds37.plus((-13));
        org.joda.time.Period period41 = org.joda.time.Period.hours(0);
        org.joda.time.DurationFieldType durationFieldType43 = period41.getFieldType((int) (short) 1);
        org.joda.time.Period period45 = period41.plusDays(10);
        org.joda.time.Seconds seconds46 = period41.toStandardSeconds();
        org.joda.time.Seconds seconds48 = seconds46.minus(13);
        boolean boolean49 = seconds39.isLessThan(seconds46);
        org.joda.time.Seconds seconds50 = seconds23.minus(seconds46);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT-40S" + "'", str24, "PT-40S");
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PT60S" + "'", str30, "PT60S");
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertNotNull(seconds35);
        org.junit.Assert.assertNotNull(seconds37);
        org.junit.Assert.assertNotNull(seconds39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(seconds46);
        org.junit.Assert.assertNotNull(seconds48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(seconds50);
    }

    @Test
    public void test22147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22147");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((-1L));
        long long2 = duration1.getMillis();
        org.joda.time.Duration duration5 = new org.joda.time.Duration((long) 8, (long) 10);
        org.joda.time.Duration duration8 = duration5.withDurationAdded(540000L, (int) (byte) 10);
        org.joda.time.Period period9 = duration5.toPeriod();
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Duration duration13 = new org.joda.time.Duration((long) (-1));
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period18 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days19 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period21 = period18.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period23 = period21.normalizedStandard(periodType22);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(readableInstant15, readableInstant16, periodType22);
        org.joda.time.PeriodType periodType25 = periodType22.withYearsRemoved();
        org.joda.time.Period period26 = duration13.toPeriodTo(readableInstant14, periodType25);
        boolean boolean27 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration13);
        boolean boolean28 = duration5.isShorterThan((org.joda.time.ReadableDuration) duration11);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(readableInstant34, readableDuration35);
        mutablePeriod36.setPeriod((long) ' ', (long) 52);
        mutablePeriod36.addDays(100);
        org.joda.time.PeriodType periodType42 = mutablePeriod36.getPeriodType();
        org.joda.time.Period period43 = new org.joda.time.Period((long) (short) 0, periodType42);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(readableInstant31, readableInstant32, periodType42);
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant29, readableInstant30, periodType42);
        org.joda.time.Period period47 = period45.plusMonths(13);
        org.joda.time.Duration duration48 = period45.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Interval interval50 = duration48.toIntervalFrom(readableInstant49);
        org.joda.time.Duration duration52 = duration11.withDurationAdded((org.joda.time.ReadableDuration) duration48, 4);
        org.joda.time.Duration duration54 = duration52.withMillis((long) 97);
        boolean boolean55 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration54);
        org.joda.time.Period period57 = org.joda.time.Period.millis(600);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.Duration duration59 = period57.toDurationFrom(readableInstant58);
        boolean boolean60 = duration54.isEqual((org.joda.time.ReadableDuration) duration59);
        org.joda.time.Duration duration63 = duration59.withDurationAdded(599990L, 5940);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.PeriodType periodType65 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType66 = periodType65.withMinutesRemoved();
        org.joda.time.PeriodType periodType67 = periodType65.withYearsRemoved();
        org.joda.time.PeriodType periodType68 = periodType67.withDaysRemoved();
        org.joda.time.PeriodType periodType69 = periodType68.withHoursRemoved();
        org.joda.time.Period period70 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration59, readableInstant64, periodType69);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-86400000L) + "'", long2 == (-86400000L));
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertNotNull(periodType65);
        org.junit.Assert.assertNotNull(periodType66);
        org.junit.Assert.assertNotNull(periodType67);
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertNotNull(periodType69);
    }

    @Test
    public void test22148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22148");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-91));
        org.joda.time.Hours hours2 = org.joda.time.Hours.FOUR;
        org.joda.time.Duration duration3 = hours2.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration3, readableInstant4);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (short) -1, (int) '#', (int) ' ', 100);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.days();
        int int12 = mutablePeriod10.get(durationFieldType11);
        org.joda.time.Hours hours13 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.Hours hours15 = hours13.dividedBy((int) (short) -1);
        org.joda.time.Hours hours17 = hours15.plus((int) (short) 10);
        org.joda.time.Hours hours18 = hours15.negated();
        org.joda.time.Duration duration19 = hours15.toStandardDuration();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) (short) -1, (int) '#', (int) ' ', 100);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.days();
        int int26 = mutablePeriod24.get(durationFieldType25);
        org.joda.time.Hours hours27 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) mutablePeriod24);
        org.joda.time.Hours hours29 = hours27.dividedBy((int) (short) -1);
        org.joda.time.Hours hours30 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours32 = hours30.minus(0);
        org.joda.time.Hours hours33 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours35 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean36 = hours33.isGreaterThan(hours35);
        boolean boolean37 = hours32.isLessThan(hours35);
        java.lang.String str38 = hours32.toString();
        org.joda.time.Hours hours39 = org.joda.time.Hours.ZERO;
        org.joda.time.Hours hours40 = hours32.plus(hours39);
        org.joda.time.Hours hours41 = hours27.minus(hours32);
        boolean boolean42 = hours15.isGreaterThan(hours27);
        org.joda.time.Period period43 = period5.plus((org.joda.time.ReadablePeriod) hours15);
        org.joda.time.Period period44 = period1.withFields((org.joda.time.ReadablePeriod) hours15);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(hours27);
        org.junit.Assert.assertNotNull(hours29);
        org.junit.Assert.assertNotNull(hours30);
        org.junit.Assert.assertNotNull(hours32);
        org.junit.Assert.assertNotNull(hours33);
        org.junit.Assert.assertNotNull(hours35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PT4H" + "'", str38, "PT4H");
        org.junit.Assert.assertNotNull(hours39);
        org.junit.Assert.assertNotNull(hours40);
        org.junit.Assert.assertNotNull(hours41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period44);
    }

    @Test
    public void test22149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22149");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds8 = duration7.toStandardSeconds();
        boolean boolean9 = duration4.isLongerThan((org.joda.time.ReadableDuration) duration7);
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds12 = duration11.toStandardSeconds();
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds15 = duration14.toStandardSeconds();
        boolean boolean16 = duration11.isLongerThan((org.joda.time.ReadableDuration) duration14);
        org.joda.time.Period period17 = duration11.toPeriod();
        boolean boolean18 = duration7.isLongerThan((org.joda.time.ReadableDuration) duration11);
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds21 = duration20.toStandardSeconds();
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = duration20.toPeriodTo(readableInstant22);
        org.joda.time.Duration duration24 = period23.toStandardDuration();
        org.joda.time.Period period25 = duration24.toPeriod();
        org.joda.time.Duration duration26 = duration11.minus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType29);
        int int31 = period30.getMillis();
        org.joda.time.Period period33 = period30.plusDays((int) 'a');
        org.joda.time.Duration duration35 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds36 = duration35.toStandardSeconds();
        java.lang.String str37 = seconds36.toString();
        org.joda.time.PeriodType periodType38 = seconds36.getPeriodType();
        org.joda.time.PeriodType periodType39 = periodType38.withSecondsRemoved();
        org.joda.time.PeriodType periodType40 = periodType39.withDaysRemoved();
        org.joda.time.Period period41 = period33.normalizedStandard(periodType40);
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration11, periodType40);
        boolean boolean43 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration11);
        org.joda.time.Duration duration45 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds46 = duration45.toStandardSeconds();
        org.joda.time.Period period47 = duration45.toPeriod();
        org.joda.time.Duration duration48 = duration1.plus((org.joda.time.ReadableDuration) duration45);
        org.joda.time.Duration duration50 = duration1.minus((long) 132);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 25 + "'", int31 == 25);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(seconds36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PT60S" + "'", str37, "PT60S");
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(seconds46);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(duration50);
    }
}

