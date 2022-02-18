import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours2 = hours0.minus((int) (byte) 10);
        org.joda.time.Duration duration3 = hours2.toStandardDuration();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(duration3);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType3 = minutes2.getPeriodType();
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType6);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.weekyears();
        int int9 = period7.get(durationFieldType8);
        boolean boolean10 = periodType3.isSupported(durationFieldType8);
        org.joda.time.PeriodType periodType11 = periodType3.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType11);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod12.setPeriod(4, 7, 13, (int) (byte) 0, (int) (byte) 100, (int) 'a', (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter2.getPrinter();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter2.withLocale(locale5);
        java.util.Locale locale7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter6.withLocale(locale7);
        java.util.Locale locale9 = null;
        org.joda.time.format.PeriodFormatter periodFormatter10 = periodFormatter8.withLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod12 = periodFormatter10.parseMutablePeriod("Minutes");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(periodFormatter10);
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant7, periodType8);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(readableInstant11, readableDuration12);
        mutablePeriod13.setHours((int) (short) 100);
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology18 = null;
        mutablePeriod13.setPeriod((org.joda.time.ReadableDuration) duration17, chronology18);
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds22 = duration21.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType23 = seconds22.getFieldType();
        mutablePeriod13.add(durationFieldType23, (int) (short) 0);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(readableInstant26, readableDuration27);
        mutablePeriod28.setHours((int) (short) 100);
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology33 = null;
        mutablePeriod28.setPeriod((org.joda.time.ReadableDuration) duration32, chronology33);
        org.joda.time.Chronology chronology35 = null;
        mutablePeriod13.setPeriod((org.joda.time.ReadableDuration) duration32, chronology35);
        int int37 = duration4.compareTo((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Duration duration39 = duration32.minus(1L);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Period period41 = duration32.toPeriodTo(readableInstant40);
        org.joda.time.Period period43 = period41.plusHours((int) '#');
        int int44 = period43.getMillis();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(0L);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearDayTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType2 = periodType0.getFieldType((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        org.joda.time.Days days0 = org.joda.time.Days.ZERO;
        org.joda.time.Period period2 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period2);
        org.joda.time.Days days5 = days3.minus(10);
        boolean boolean6 = days0.isGreaterThan(days3);
        org.joda.time.Days days7 = org.joda.time.Days.ZERO;
        org.joda.time.Days days8 = org.joda.time.Days.ZERO;
        org.joda.time.Period period10 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days11 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Days days13 = days11.minus(10);
        boolean boolean14 = days8.isGreaterThan(days11);
        org.joda.time.Days days15 = days7.minus(days8);
        org.joda.time.Days days16 = days0.plus(days7);
        org.joda.time.Days days17 = org.joda.time.Days.ZERO;
        org.joda.time.Period period19 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days20 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period19);
        org.joda.time.Days days22 = days20.minus(10);
        boolean boolean23 = days17.isGreaterThan(days20);
        org.joda.time.Days days25 = days20.minus(0);
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
        org.joda.time.Days days37 = duration36.toStandardDays();
        boolean boolean38 = days20.isGreaterThan(days37);
        boolean boolean39 = days0.isGreaterThan(days37);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(days37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        org.joda.time.Period period1 = org.joda.time.Period.hours((-1));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds3 = duration2.toStandardSeconds();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        boolean boolean7 = duration2.isLongerThan((org.joda.time.ReadableDuration) duration5);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType10 = periodType9.withMinutesRemoved();
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant8, periodType9);
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration5);
        org.joda.time.Duration duration14 = duration5.plus(540000L);
        long long15 = duration14.getStandardSeconds();
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 600L + "'", long15 == 600L);
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
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
        org.joda.time.Weeks weeks18 = weeks0.multipliedBy((int) (short) 1);
        org.joda.time.ReadableInterval readableInterval19 = null;
        org.joda.time.Weeks weeks20 = org.joda.time.Weeks.weeksIn(readableInterval19);
        org.joda.time.Weeks weeks22 = weeks20.multipliedBy((int) (short) 10);
        org.joda.time.Weeks weeks23 = weeks18.plus(weeks20);
        org.joda.time.Weeks weeks24 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks26 = weeks24.dividedBy(52);
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DurationField durationField29 = durationFieldType27.getField(chronology28);
        boolean boolean30 = weeks24.isSupported(durationFieldType27);
        org.joda.time.DurationFieldType durationFieldType31 = weeks24.getFieldType();
        org.joda.time.Weeks weeks32 = weeks18.plus(weeks24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType34 = weeks32.getFieldType((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertNotNull(weeks32);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
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
        org.joda.time.ReadableInstant readableInstant16 = null;
        mutablePeriod2.setPeriod(readableInstant15, readableInstant16);
        mutablePeriod2.setPeriod((long) 2147483647, 0L);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(durationFieldType12);
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        org.joda.time.Hours hours0 = org.joda.time.Hours.ZERO;
        org.joda.time.Minutes minutes1 = hours0.toStandardMinutes();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(minutes1);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        org.joda.time.Period period9 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days10 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Days days11 = days5.minus(days10);
        int int12 = days5.size();
        org.joda.time.Days days13 = org.joda.time.Days.ZERO;
        org.joda.time.Period period15 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days16 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Days days18 = days16.minus(10);
        boolean boolean19 = days13.isGreaterThan(days16);
        org.joda.time.Days days20 = days5.minus(days16);
        org.joda.time.Duration duration21 = days20.toStandardDuration();
        org.joda.time.DurationFieldType durationFieldType22 = days20.getFieldType();
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((java.lang.Object) days20, periodType23, chronology24);
        int int26 = periodType23.size();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 7 + "'", int26 == 7);
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        org.joda.time.Period period1 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period3 = period1.withHours(32);
        org.joda.time.Period period4 = period1.normalizedStandard();
        java.lang.String str5 = period4.toString();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period7 = period4.normalizedStandard(periodType6);
        org.joda.time.Period period9 = period4.minusHours(3);
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds12 = duration11.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType13 = seconds12.getFieldType();
        org.joda.time.Seconds seconds15 = org.joda.time.Seconds.parseSeconds("P0W");
        org.joda.time.Seconds seconds16 = seconds12.minus(seconds15);
        org.joda.time.Seconds seconds17 = seconds12.negated();
        org.joda.time.Seconds seconds19 = org.joda.time.Seconds.seconds((int) (short) 0);
        org.joda.time.Seconds seconds20 = seconds17.minus(seconds19);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.weekyears();
        java.lang.String str22 = durationFieldType21.getName();
        int int23 = seconds19.get(durationFieldType21);
        org.joda.time.Period period25 = period9.withFieldAdded(durationFieldType21, 0);
        int int26 = period25.getDays();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT0.052S" + "'", str5, "PT0.052S");
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "weekyears" + "'", str22, "weekyears");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter2.getPrinter();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter2.withLocale(locale5);
        java.util.Locale locale7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter6.withLocale(locale7);
        java.util.Locale locale9 = null;
        org.joda.time.format.PeriodFormatter periodFormatter10 = periodFormatter8.withLocale(locale9);
        java.util.Locale locale11 = null;
        org.joda.time.format.PeriodFormatter periodFormatter12 = periodFormatter10.withLocale(locale11);
        java.io.Writer writer13 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod16.addYears((int) '4');
        org.joda.time.Chronology chronology20 = null;
        mutablePeriod16.add((long) 100, chronology20);
        mutablePeriod16.add(1, 10, (int) 'a', 52, (int) (short) 100, 0, (int) (byte) 0, (int) (byte) 10);
        org.joda.time.Seconds seconds32 = org.joda.time.Seconds.seconds(0);
        mutablePeriod16.mergePeriod((org.joda.time.ReadablePeriod) seconds32);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter10.printTo(writer13, (org.joda.time.ReadablePeriod) seconds32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(periodFormatter10);
        org.junit.Assert.assertNotNull(periodFormatter12);
        org.junit.Assert.assertNotNull(seconds32);
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) 0, (long) (byte) 10, periodType2, chronology3);
        org.joda.time.Duration duration5 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = duration5.toPeriod(chronology6);
        org.joda.time.Period period8 = period4.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Hours hours9 = period7.toStandardHours();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hours9.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours9);
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeks(1);
        java.lang.String str4 = weeks3.toString();
        org.joda.time.PeriodType periodType5 = weeks3.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType5);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod6.addMillis(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P1W" + "'", str4, "P1W");
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod1.setDays((-672));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period7 = period4.withSeconds((int) ' ');
        org.joda.time.Period period8 = period1.minus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType10 = periodType9.withMonthsRemoved();
        org.joda.time.Period period11 = period8.withPeriodType(periodType9);
        org.joda.time.Period period13 = period11.plusWeeks((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = period13.getValue(13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        boolean boolean4 = weeks1.isLessThan(weeks3);
        org.joda.time.Weeks weeks5 = weeks1.negated();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) weeks1, chronology6);
        org.joda.time.Weeks weeks9 = weeks1.multipliedBy((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = weeks9.getValue(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks9);
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds3 = duration2.toStandardSeconds();
        java.lang.String str4 = seconds3.toString();
        org.joda.time.PeriodType periodType5 = seconds3.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withDaysRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 52, periodType8, chronology9);
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod10.copy();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod11.setMinutes(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT60S" + "'", str4, "PT60S");
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(mutablePeriod11);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("PT14400S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 3, chronology1);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod2.addYears((int) '4');
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod2.add((long) 100, chronology6);
        mutablePeriod2.setMillis((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        mutablePeriod2.setPeriod(readableInstant10, readableInstant11);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) (short) -1, (int) '#', (int) ' ', 100);
        mutablePeriod2.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.Chronology chronology20 = null;
        mutablePeriod2.setPeriod((long) 54, chronology20);
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(readableInstant6, readableDuration7);
        mutablePeriod8.setHours((int) (short) 100);
        boolean boolean11 = periodType5.equals((java.lang.Object) mutablePeriod8);
        org.joda.time.PeriodType periodType12 = periodType5.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 60, (long) (short) 1, periodType12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        mutablePeriod13.setPeriod(readableInstant14, readableInstant15);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod13.setMillis((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType7 = seconds6.getFieldType();
        org.joda.time.Seconds seconds9 = seconds6.plus(25);
        org.joda.time.Seconds seconds10 = seconds6.negated();
        org.joda.time.PeriodType periodType11 = seconds10.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter12 = periodFormatter2.withParseType(periodType11);
        org.joda.time.format.PeriodPrinter periodPrinter13 = periodFormatter12.getPrinter();
        org.joda.time.format.PeriodParser periodParser14 = periodFormatter12.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter15 = periodFormatter12.getPrinter();
        org.joda.time.PeriodType periodType16 = periodFormatter12.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period18 = periodFormatter12.parsePeriod("P-1DT1M");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodFormatter12);
        org.junit.Assert.assertNull(periodPrinter13);
        org.junit.Assert.assertNull(periodParser14);
        org.junit.Assert.assertNull(periodPrinter15);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        mutablePeriod2.setPeriod((long) ' ', (long) 52);
        org.joda.time.format.PeriodPrinter periodPrinter6 = null;
        org.joda.time.format.PeriodParser periodParser7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = new org.joda.time.format.PeriodFormatter(periodPrinter6, periodParser7);
        org.joda.time.format.PeriodParser periodParser9 = periodFormatter8.getParser();
        java.util.Locale locale10 = null;
        org.joda.time.format.PeriodFormatter periodFormatter11 = periodFormatter8.withLocale(locale10);
        java.util.Locale locale12 = periodFormatter8.getLocale();
        java.util.Locale locale13 = null;
        org.joda.time.format.PeriodFormatter periodFormatter14 = periodFormatter8.withLocale(locale13);
        java.util.Locale locale15 = periodFormatter14.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = mutablePeriod2.toString(periodFormatter14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser9);
        org.junit.Assert.assertNotNull(periodFormatter11);
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(periodFormatter14);
        org.junit.Assert.assertNull(locale15);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        org.joda.time.Period period4 = new org.joda.time.Period(0, (int) '4', (int) (short) 100, (int) (byte) -1);
        org.joda.time.Period period6 = period4.withDays((int) 'a');
        org.joda.time.Period period8 = period6.minusHours((int) (byte) 1);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType6 = minutes5.getPeriodType();
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes8 = minutes5.plus(minutes7);
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.ZERO;
        boolean boolean11 = minutes9.isLessThan(minutes10);
        boolean boolean12 = minutes5.isLessThan(minutes9);
        org.joda.time.PeriodType periodType13 = minutes5.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter14 = periodFormatter2.withParseType(periodType13);
        java.io.Writer writer15 = null;
        org.joda.time.Period period17 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days18 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Period period20 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days21 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period20);
        org.joda.time.PeriodType periodType22 = days21.getPeriodType();
        boolean boolean23 = days18.isGreaterThan(days21);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter14.printTo(writer15, (org.joda.time.ReadablePeriod) days18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodFormatter14);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) (-1));
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period6 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days7 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period9 = period6.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period11 = period9.normalizedStandard(periodType10);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableInstant3, readableInstant4, periodType10);
        org.joda.time.PeriodType periodType13 = periodType10.withYearsRemoved();
        org.joda.time.Period period14 = duration1.toPeriodTo(readableInstant2, periodType13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = duration1.toPeriodFrom(readableInstant15);
        org.joda.time.Duration duration18 = duration1.withMillis((long) ' ');
        java.lang.String str19 = duration18.toString();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT0.032S" + "'", str19, "PT0.032S");
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        org.joda.time.Days days0 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.Days days2 = days0.minus(25);
        org.joda.time.Days days3 = days2.negated();
        org.joda.time.Duration duration4 = days2.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes5 = days2.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2147483622 * 1440");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType3 = seconds2.getFieldType();
        org.joda.time.Seconds seconds5 = seconds2.plus(25);
        org.joda.time.Seconds seconds6 = seconds2.negated();
        org.joda.time.Seconds seconds8 = seconds2.dividedBy(10);
        org.joda.time.DurationFieldType durationFieldType9 = seconds2.getFieldType();
        org.joda.time.Chronology chronology10 = null;
        boolean boolean11 = durationFieldType9.isSupported(chronology10);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        org.joda.time.Period period1 = org.joda.time.Period.parse("P1W");
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) 0, (-2), (-2), (int) (byte) -1, 600, 0, 25, (-2147483648));
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) (short) -1);
        org.joda.time.DurationFieldType durationFieldType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod1.add(durationFieldType2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'null'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 25);
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) mutablePeriod1);
        org.joda.time.Minutes minutes4 = minutes2.multipliedBy(3);
        org.joda.time.Minutes minutes6 = minutes4.multipliedBy(4);
        org.joda.time.Minutes minutes8 = minutes6.minus(8);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes8);
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Period period7 = duration1.toPeriod();
        org.joda.time.Period period8 = period7.negated();
        org.joda.time.Seconds seconds9 = period8.toStandardSeconds();
        org.joda.time.Period period11 = period8.minusDays(0);
        java.lang.Class<?> wildcardClass12 = period8.getClass();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT0.052S");
        org.joda.time.ReadableDuration readableDuration2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = duration1.compareTo(readableDuration2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        org.joda.time.Days days9 = days2.minus(1);
        org.joda.time.Days days11 = days9.dividedBy(60);
        org.joda.time.Days days12 = days9.negated();
        java.lang.String str13 = days12.toString();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P1D" + "'", str13, "P1D");
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
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
        int int13 = seconds10.size();
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT0S" + "'", str8, "PT0S");
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        org.joda.time.Period period2 = new org.joda.time.Period(600000L, (long) (byte) -1);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("YearMonthDayTime");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"YearMonthDayTime\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.format.PeriodParser periodParser4 = periodFormatter3.getParser();
        java.util.Locale locale5 = periodFormatter3.getLocale();
        org.joda.time.Minutes minutes6 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType7 = minutes6.getPeriodType();
        org.joda.time.Minutes minutes8 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes9 = minutes6.plus(minutes8);
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes11 = org.joda.time.Minutes.ZERO;
        boolean boolean12 = minutes10.isLessThan(minutes11);
        boolean boolean13 = minutes6.isLessThan(minutes10);
        org.joda.time.PeriodType periodType14 = minutes6.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter15 = periodFormatter3.withParseType(periodType14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(readableInstant16, readableDuration17);
        org.joda.time.Period period19 = mutablePeriod18.toPeriod();
        org.joda.time.Period period21 = period19.withHours(0);
        int int22 = period19.getWeeks();
        org.joda.time.Period period24 = period19.plusSeconds((int) (byte) 100);
        org.joda.time.Period period26 = period19.withWeeks((int) '#');
        org.joda.time.PeriodType periodType27 = period19.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter28 = periodFormatter3.withParseType(periodType27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period29 = org.joda.time.Period.parse("P1D", periodFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser4);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodFormatter15);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodFormatter28);
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds4 = duration3.toStandardSeconds();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds7 = duration6.toStandardSeconds();
        boolean boolean8 = duration3.isLongerThan((org.joda.time.ReadableDuration) duration6);
        org.joda.time.Period period9 = duration3.toPeriod();
        org.joda.time.Period period10 = period9.negated();
        org.joda.time.Seconds seconds11 = period10.toStandardSeconds();
        org.joda.time.Period period12 = period10.negated();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period10.toDurationTo(readableInstant13);
        org.joda.time.DurationFieldType[] durationFieldTypeArray15 = period10.getFieldTypes();
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.forFields(durationFieldTypeArray15);
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType16);
        org.joda.time.Period period18 = new org.joda.time.Period((java.lang.Object) period17);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(durationFieldTypeArray15);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((-3600L));
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours(25);
        org.joda.time.DurationFieldType durationFieldType2 = hours1.getFieldType();
        org.joda.time.Duration duration3 = org.joda.time.Duration.ZERO;
        long long4 = duration3.getStandardDays();
        org.joda.time.Hours hours5 = duration3.toStandardHours();
        boolean boolean6 = hours1.isLessThan(hours5);
        org.joda.time.Hours hours8 = hours1.dividedBy((int) (byte) 10);
        org.joda.time.Hours hours10 = hours8.dividedBy(32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration11 = new org.joda.time.Duration((java.lang.Object) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(hours10);
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((-2147483648));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(readableInstant6, readableDuration7);
        mutablePeriod8.setHours((int) (short) 100);
        boolean boolean11 = periodType5.equals((java.lang.Object) mutablePeriod8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((java.lang.Object) duration1, periodType5, chronology12);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod13.addMonths(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType10 = periodType9.withMonthsRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withMinutesRemoved();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) (short) 0, periodType10, chronology12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period14 = new org.joda.time.Period((int) '#', 10, (-32), 7, (int) ' ', (-2147483648), 32, 0, periodType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis((long) 25);
        org.joda.time.Duration duration2 = duration1.toDuration();
        org.joda.time.Minutes minutes3 = duration1.toStandardMinutes();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(minutes3);
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        org.joda.time.Days days0 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.Days days2 = days0.minus(25);
        org.joda.time.Days days3 = days2.negated();
        org.joda.time.Days days4 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.Days days6 = days4.minus(25);
        org.joda.time.Days days7 = days6.negated();
        org.joda.time.Days days8 = days2.plus(days7);
        java.lang.String str9 = days8.toString();
        int int10 = days8.getDays();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P0D" + "'", str9, "P0D");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        java.lang.String str4 = periodType3.getName();
        java.lang.String str5 = periodType3.toString();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Days" + "'", str4, "Days");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PeriodType[Days]" + "'", str5, "PeriodType[Days]");
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod2.addYears((int) '4');
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod2.add((long) (byte) 1, chronology6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        mutablePeriod2.setPeriod(readableDuration8);
        org.joda.time.Chronology chronology12 = null;
        mutablePeriod2.setPeriod((long) (short) 10, (long) (short) 10, chronology12);
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod2.add((long) (short) 100, chronology15);
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period18 = new org.joda.time.Period((java.lang.Object) mutablePeriod2, periodType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType17);
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableInstant4, readableDuration5);
        mutablePeriod6.setHours((int) (short) 100);
        boolean boolean9 = periodType3.equals((java.lang.Object) mutablePeriod6);
        org.joda.time.PeriodType periodType10 = periodType3.withMonthsRemoved();
        org.joda.time.Duration duration12 = new org.joda.time.Duration((long) (-1));
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = duration12.toPeriodFrom(readableInstant13);
        org.joda.time.DurationFieldType[] durationFieldTypeArray15 = period14.getFieldTypes();
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.forFields(durationFieldTypeArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period17 = new org.joda.time.Period((java.lang.Object) periodType3, periodType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(durationFieldTypeArray15);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, (long) '#');
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        java.lang.String str6 = seconds5.toString();
        org.joda.time.PeriodType periodType7 = seconds5.getPeriodType();
        org.joda.time.PeriodType periodType8 = seconds5.getPeriodType();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = duration10.toPeriod(chronology11);
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant9, (org.joda.time.ReadableDuration) duration10);
        boolean boolean14 = periodType8.equals((java.lang.Object) duration10);
        org.joda.time.Chronology chronology15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((java.lang.Object) 100, periodType8, chronology15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT60S" + "'", str6, "PT60S");
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("days");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"days\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        org.joda.time.Period period2 = new org.joda.time.Period(540000L, (long) (byte) 1);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.PeriodType periodType4 = periodFormatter3.getParseType();
        org.joda.time.format.PeriodParser periodParser5 = periodFormatter3.getParser();
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardMinutes((long) 10);
        java.lang.String str10 = duration9.toString();
        org.joda.time.Duration duration12 = duration9.minus((long) (byte) 10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Minutes minutes14 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType15 = minutes14.getPeriodType();
        org.joda.time.PeriodType periodType16 = periodType15.withSecondsRemoved();
        org.joda.time.Period period17 = duration12.toPeriodFrom(readableInstant13, periodType15);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 0, (long) 3, periodType15);
        org.joda.time.PeriodType periodType19 = periodType15.withMonthsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter20 = periodFormatter3.withParseType(periodType19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period21 = org.joda.time.Period.parse("P2147483647D", periodFormatter20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodType4);
        org.junit.Assert.assertNull(periodParser5);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT600S" + "'", str10, "PT600S");
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodFormatter20);
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        org.joda.time.Period period3 = mutablePeriod2.toPeriod();
        org.joda.time.Period period5 = period3.withHours(0);
        int int6 = period3.getWeeks();
        org.joda.time.Period period8 = period3.withMillis((int) 'a');
        org.joda.time.Period period10 = period8.plusYears(7);
        org.joda.time.Period period12 = period10.minusWeeks(600);
        java.lang.String str13 = period12.toString();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P7Y-600WT0.097S" + "'", str13, "P7Y-600WT0.097S");
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        mutablePeriod2.setPeriod((long) ' ', (long) 52);
        mutablePeriod2.setPeriod((long) (short) -1);
        int int8 = mutablePeriod2.getHours();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds(100);
        org.joda.time.Period period2 = seconds1.toPeriod();
        org.joda.time.Days days3 = seconds1.toStandardDays();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(days3);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("P-1D");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        org.joda.time.Hours hours0 = org.joda.time.Hours.SEVEN;
        org.joda.time.Hours hours2 = hours0.multipliedBy((int) (byte) 0);
        org.joda.time.Duration duration3 = hours0.toStandardDuration();
        long long4 = duration3.getMillis();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 25200000L + "'", long4 == 25200000L);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = duration1.toPeriod(periodType2, chronology4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType8 = periodType7.withMonthsRemoved();
        org.joda.time.Period period9 = duration1.toPeriodTo(readableInstant6, periodType8);
        org.joda.time.Duration duration10 = duration1.toDuration();
        org.joda.time.Period period12 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days13 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period12);
        org.joda.time.PeriodType periodType14 = days13.getPeriodType();
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(readableInstant15, readableDuration16);
        mutablePeriod17.setHours((int) (short) 100);
        boolean boolean20 = periodType14.equals((java.lang.Object) mutablePeriod17);
        org.joda.time.Duration duration21 = org.joda.time.Duration.ZERO;
        long long22 = duration21.getStandardDays();
        mutablePeriod17.add((org.joda.time.ReadableDuration) duration21);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType26 = periodType25.withWeeksRemoved();
        org.joda.time.PeriodType periodType27 = periodType26.withDaysRemoved();
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration21, readableInstant24, periodType26);
        boolean boolean29 = duration1.isEqual((org.joda.time.ReadableDuration) duration21);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = duration21.toPeriod(chronology30);
        org.joda.time.Period period33 = period31.withMonths((-1));
        org.joda.time.Period period35 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days36 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period35);
        org.joda.time.PeriodType periodType37 = days36.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType38 = null;
        int int39 = periodType37.indexOf(durationFieldType38);
        org.joda.time.PeriodType periodType40 = periodType37.withWeeksRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period41 = period33.normalizedStandard(periodType37);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(periodType40);
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType7 = seconds6.getFieldType();
        org.joda.time.Seconds seconds9 = seconds6.plus(25);
        org.joda.time.Seconds seconds10 = seconds6.negated();
        org.joda.time.PeriodType periodType11 = seconds10.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter12 = periodFormatter2.withParseType(periodType11);
        boolean boolean13 = periodFormatter2.isParser();
        java.util.Locale locale14 = null;
        org.joda.time.format.PeriodFormatter periodFormatter15 = periodFormatter2.withLocale(locale14);
        org.joda.time.format.PeriodParser periodParser16 = periodFormatter2.getParser();
        java.lang.StringBuffer stringBuffer17 = null;
        org.joda.time.Minutes minutes19 = org.joda.time.Minutes.parseMinutes("P0D");
        org.joda.time.Minutes minutes21 = minutes19.dividedBy((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer17, (org.joda.time.ReadablePeriod) minutes21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(periodFormatter15);
        org.junit.Assert.assertNull(periodParser16);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(minutes21);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        long long1 = duration0.getStandardDays();
        org.joda.time.Hours hours2 = duration0.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType3 = hours2.getFieldType();
        org.joda.time.MutablePeriod mutablePeriod4 = hours2.toMutablePeriod();
        org.joda.time.Hours hours5 = org.joda.time.Hours.THREE;
        org.joda.time.DurationFieldType durationFieldType6 = hours5.getFieldType();
        org.joda.time.Hours hours7 = hours2.plus(hours5);
        java.lang.String str8 = hours2.toString();
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT0H" + "'", str8, "PT0H");
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        boolean boolean4 = weeks1.isLessThan(weeks3);
        org.joda.time.Weeks weeks6 = weeks3.minus((int) (short) -1);
        org.joda.time.Weeks weeks8 = weeks6.multipliedBy(0);
        org.joda.time.Weeks weeks9 = null;
        boolean boolean10 = weeks6.isLessThan(weeks9);
        int int12 = weeks6.getValue((int) (byte) 0);
        org.joda.time.ReadableInterval readableInterval13 = null;
        org.joda.time.Weeks weeks14 = org.joda.time.Weeks.weeksIn(readableInterval13);
        org.joda.time.Weeks weeks16 = weeks14.multipliedBy((int) (short) 10);
        org.joda.time.Weeks weeks17 = weeks6.minus(weeks16);
        org.joda.time.DurationFieldType durationFieldType18 = weeks17.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((java.lang.Object) durationFieldType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DurationFieldType$StandardDurationFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(durationFieldType18);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        org.joda.time.Period period9 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days10 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Days days11 = days5.minus(days10);
        org.joda.time.Period period13 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days14 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Days days16 = days14.minus(10);
        org.joda.time.Days days17 = days5.plus(days14);
        org.joda.time.Days days19 = days17.dividedBy(100);
        org.joda.time.Days days21 = days19.multipliedBy(13);
        org.joda.time.Days days22 = days21.negated();
        org.joda.time.DurationFieldType durationFieldType23 = days21.getFieldType();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(durationFieldType23);
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("days");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"days\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) (-1));
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period6 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days7 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period9 = period6.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period11 = period9.normalizedStandard(periodType10);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableInstant3, readableInstant4, periodType10);
        org.joda.time.PeriodType periodType13 = periodType10.withYearsRemoved();
        org.joda.time.Period period14 = duration1.toPeriodTo(readableInstant2, periodType13);
        java.lang.Class<?> wildcardClass15 = periodType13.getClass();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType19 = periodType18.withWeeksRemoved();
        org.joda.time.PeriodType periodType20 = periodType19.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(readableInstant16, readableInstant17, periodType20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period22 = new org.joda.time.Period((java.lang.Object) periodType13, periodType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        org.joda.time.Period period9 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days10 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Days days11 = days5.minus(days10);
        org.joda.time.Period period13 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days14 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Days days16 = days14.minus(10);
        org.joda.time.Days days17 = days5.plus(days14);
        org.joda.time.Days days19 = days14.plus(32);
        org.joda.time.Days days20 = days19.negated();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days20);
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) (-1));
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Period period5 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period5);
        org.joda.time.PeriodType periodType7 = days6.getPeriodType();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableInstant8, readableDuration9);
        mutablePeriod10.setHours((int) (short) 100);
        boolean boolean13 = periodType7.equals((java.lang.Object) mutablePeriod10);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((java.lang.Object) duration3, periodType7, chronology14);
        boolean boolean16 = duration1.isEqual((org.joda.time.ReadableDuration) duration3);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        java.lang.Object obj19 = null;
        org.joda.time.Duration duration20 = new org.joda.time.Duration(obj19);
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant18, (org.joda.time.ReadableDuration) duration20);
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant17, (org.joda.time.ReadableDuration) duration20);
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType26 = periodType25.withWeeksRemoved();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = duration24.toPeriod(periodType25, chronology27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType31 = periodType30.withMonthsRemoved();
        org.joda.time.Period period32 = duration24.toPeriodTo(readableInstant29, periodType31);
        org.joda.time.Period period33 = duration24.toPeriod();
        org.joda.time.Duration duration34 = duration20.plus((org.joda.time.ReadableDuration) duration24);
        boolean boolean35 = duration3.isShorterThan((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Duration duration36 = duration24.toDuration();
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration24, readableInstant37);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(duration36);
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period3 = period1.plusYears((int) ' ');
        org.joda.time.Period period5 = period1.plusDays((int) (byte) -1);
        java.lang.String str6 = period5.toString();
        org.joda.time.Period period8 = period5.minusWeeks((-1));
        org.joda.time.Period period10 = period5.multipliedBy(32);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = period10.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P-1DT1M" + "'", str6, "P-1DT1M");
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType3 = seconds2.getFieldType();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.parseSeconds("P0W");
        org.joda.time.Seconds seconds6 = seconds2.minus(seconds5);
        org.joda.time.Seconds seconds7 = seconds2.negated();
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.seconds((int) (short) 0);
        org.joda.time.Seconds seconds10 = seconds7.minus(seconds9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration11 = new org.joda.time.Duration((java.lang.Object) seconds9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.Seconds");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
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
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds18 = duration17.toStandardSeconds();
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = duration17.toPeriodTo(readableInstant19);
        org.joda.time.Duration duration21 = period20.toStandardDuration();
        org.joda.time.Period period22 = duration21.toPeriod();
        org.joda.time.Duration duration23 = duration8.minus((org.joda.time.ReadableDuration) duration21);
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.Period period25 = duration23.toPeriod(periodType24);
        org.joda.time.Duration duration27 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds28 = duration27.toStandardSeconds();
        org.joda.time.Duration duration30 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds31 = duration30.toStandardSeconds();
        boolean boolean32 = duration27.isLongerThan((org.joda.time.ReadableDuration) duration30);
        org.joda.time.Period period33 = duration27.toPeriod();
        org.joda.time.Period period34 = period33.negated();
        org.joda.time.Seconds seconds35 = period34.toStandardSeconds();
        org.joda.time.Period period36 = period34.negated();
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period34.toDurationTo(readableInstant37);
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardMinutes((long) 10);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = duration40.toPeriod(chronology41);
        boolean boolean43 = duration38.isShorterThan((org.joda.time.ReadableDuration) duration40);
        boolean boolean44 = duration23.isEqual((org.joda.time.ReadableDuration) duration40);
        java.lang.String str45 = duration40.toString();
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Interval interval47 = duration40.toIntervalFrom(readableInstant46);
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
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(seconds35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "PT600S" + "'", str45, "PT600S");
        org.junit.Assert.assertNotNull(interval47);
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        org.joda.time.Period period9 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days10 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Days days11 = days5.minus(days10);
        org.joda.time.Period period13 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days14 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period16 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days17 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period16);
        org.joda.time.PeriodType periodType18 = days17.getPeriodType();
        boolean boolean19 = days14.isGreaterThan(days17);
        org.joda.time.Days days21 = days14.minus(1);
        boolean boolean22 = days5.isGreaterThan(days21);
        int int23 = days5.getDays();
        org.joda.time.Period period25 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days26 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Period period28 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days29 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period28);
        org.joda.time.PeriodType periodType30 = days29.getPeriodType();
        boolean boolean31 = days26.isGreaterThan(days29);
        int int32 = days26.size();
        org.joda.time.Days days33 = days26.negated();
        org.joda.time.Days days35 = days33.minus(3);
        org.joda.time.Days days36 = days35.negated();
        boolean boolean37 = days5.isLessThan(days36);
        org.joda.time.DurationFieldType durationFieldType38 = days5.getFieldType();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertNotNull(days35);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(durationFieldType38);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 32, (long) 25);
        long long3 = duration2.getMillis();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-7L) + "'", long3 == (-7L));
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
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
        org.joda.time.Weeks weeks40 = weeks25.dividedBy(3);
        org.joda.time.Weeks weeks41 = weeks40.negated();
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(readableInstant42, readableDuration43);
        org.joda.time.Period period45 = mutablePeriod44.toPeriod();
        org.joda.time.Period period47 = period45.withHours(0);
        org.joda.time.Period period49 = org.joda.time.Period.hours(0);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod(readableInstant50, readableDuration51);
        org.joda.time.Period period53 = mutablePeriod52.toPeriod();
        org.joda.time.Period period55 = period53.withHours(0);
        org.joda.time.DurationFieldType durationFieldType56 = org.joda.time.DurationFieldType.days();
        int int57 = period53.indexOf(durationFieldType56);
        int int58 = period49.indexOf(durationFieldType56);
        int int59 = period45.get(durationFieldType56);
        boolean boolean60 = weeks41.isSupported(durationFieldType56);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType62 = weeks41.getFieldType((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(weeks41);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(durationFieldType56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod2.addYears((int) '4');
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod2.add((long) 100, chronology6);
        mutablePeriod2.add(1, 10, (int) 'a', 52, (int) (short) 100, 0, (int) (byte) 0, (int) (byte) 10);
        org.joda.time.Seconds seconds18 = org.joda.time.Seconds.seconds(0);
        mutablePeriod2.mergePeriod((org.joda.time.ReadablePeriod) seconds18);
        org.joda.time.Minutes minutes20 = seconds18.toStandardMinutes();
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(minutes20);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant7, periodType8);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(readableInstant11, readableDuration12);
        mutablePeriod13.setHours((int) (short) 100);
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology18 = null;
        mutablePeriod13.setPeriod((org.joda.time.ReadableDuration) duration17, chronology18);
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds22 = duration21.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType23 = seconds22.getFieldType();
        mutablePeriod13.add(durationFieldType23, (int) (short) 0);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(readableInstant26, readableDuration27);
        mutablePeriod28.setHours((int) (short) 100);
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology33 = null;
        mutablePeriod28.setPeriod((org.joda.time.ReadableDuration) duration32, chronology33);
        org.joda.time.Chronology chronology35 = null;
        mutablePeriod13.setPeriod((org.joda.time.ReadableDuration) duration32, chronology35);
        int int37 = duration4.compareTo((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Duration duration39 = duration32.minus(1L);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Period period41 = duration32.toPeriodTo(readableInstant40);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(readableInstant42, readableDuration43);
        org.joda.time.Period period45 = mutablePeriod44.toPeriod();
        org.joda.time.Period period47 = period45.withHours(0);
        org.joda.time.DurationFieldType durationFieldType48 = org.joda.time.DurationFieldType.days();
        int int49 = period45.indexOf(durationFieldType48);
        org.joda.time.Period period51 = period41.withFieldAdded(durationFieldType48, 60);
        org.joda.time.Period period53 = period51.minusSeconds(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration54 = new org.joda.time.Duration((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(durationFieldType48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.Duration duration3 = duration1.plus((long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(readableInstant9, readableDuration10);
        mutablePeriod11.setPeriod((long) ' ', (long) 52);
        mutablePeriod11.addDays(100);
        org.joda.time.PeriodType periodType17 = mutablePeriod11.getPeriodType();
        org.joda.time.Period period18 = new org.joda.time.Period((long) (short) 0, periodType17);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableInstant6, readableInstant7, periodType17);
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType17);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = duration3.toPeriod(periodType17, chronology21);
        int int23 = period22.getMillis();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = duration0.toPeriod(chronology1);
        org.joda.time.Hours hours3 = duration0.toStandardHours();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableInstant4, readableInstant5);
        boolean boolean7 = duration0.equals((java.lang.Object) readableInstant4);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Duration duration9 = duration0.plus(readableDuration8);
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(duration9);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = duration0.toPeriod(chronology1);
        int int3 = period2.size();
        org.joda.time.Period period5 = period2.plusHours((int) (short) 1);
        org.joda.time.Period period7 = period5.plusDays((int) ' ');
        int int8 = period5.getSeconds();
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds3 = duration2.toStandardSeconds();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        boolean boolean7 = duration2.isLongerThan((org.joda.time.ReadableDuration) duration5);
        org.joda.time.Period period8 = duration2.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration2);
        mutablePeriod9.clear();
        mutablePeriod9.add(60, 40, (int) (short) 0, (-2), (int) '4', (-672), 13, 4);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        org.joda.time.Seconds seconds7 = seconds5.dividedBy(32);
        org.joda.time.PeriodType periodType8 = seconds5.getPeriodType();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) (byte) 10, periodType8, chronology9);
        org.joda.time.DurationFieldType durationFieldType12 = periodType8.getFieldType(0);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType8);
        int int14 = mutablePeriod13.getMonths();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) 0, (long) (byte) 10, periodType2, chronology3);
        org.joda.time.Duration duration5 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = duration5.toPeriod(chronology6);
        org.joda.time.Period period8 = period4.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Hours hours9 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours11 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean12 = hours9.isGreaterThan(hours11);
        org.joda.time.Period period13 = period7.withFields((org.joda.time.ReadablePeriod) hours11);
        org.joda.time.Period period15 = period7.plusYears((int) '4');
        org.joda.time.Period period17 = period15.plusDays(60);
        org.joda.time.Period period19 = period15.plusMinutes((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days20 = period15.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
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
        mutablePeriod25.add(52, 2147483647, 3, 13, 0, (int) (byte) 100, 2, 0);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.format.PeriodParser periodParser4 = periodFormatter3.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter5 = periodFormatter3.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod6 = org.joda.time.MutablePeriod.parse("seconds", periodFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser4);
        org.junit.Assert.assertNull(periodPrinter5);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType3 = minutes2.getPeriodType();
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes5 = minutes2.plus(minutes4);
        org.joda.time.Minutes minutes6 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.ZERO;
        boolean boolean8 = minutes6.isLessThan(minutes7);
        boolean boolean9 = minutes2.isLessThan(minutes6);
        org.joda.time.PeriodType periodType10 = minutes2.getPeriodType();
        org.joda.time.PeriodType periodType11 = periodType10.withSecondsRemoved();
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period14 = period12.withHours(3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PeriodType[StandardNoYears]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[StandardNoYears]\" is malformed at \"eriodType[StandardNoYears]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (byte) 0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
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
        org.joda.time.Seconds seconds13 = org.joda.time.Seconds.MIN_VALUE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds14 = seconds10.minus(seconds13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Integer.MIN_VALUE cannot be negated");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT0S" + "'", str8, "PT0S");
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(seconds13);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        mutablePeriod2.setPeriod((long) ' ', (long) 52);
        mutablePeriod2.setPeriod((long) (short) -1);
        mutablePeriod2.setDays(25);
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.weeks(1);
        java.lang.String str6 = weeks5.toString();
        org.joda.time.PeriodType periodType7 = weeks5.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(readableInstant2, readableInstant3, periodType7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P1W" + "'", str6, "P1W");
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType6 = minutes5.getPeriodType();
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes8 = minutes5.plus(minutes7);
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.ZERO;
        boolean boolean11 = minutes9.isLessThan(minutes10);
        boolean boolean12 = minutes5.isLessThan(minutes9);
        org.joda.time.PeriodType periodType13 = minutes5.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter14 = periodFormatter2.withParseType(periodType13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(readableInstant15, readableDuration16);
        org.joda.time.Period period18 = mutablePeriod17.toPeriod();
        org.joda.time.Period period20 = period18.withHours(0);
        int int21 = period18.getWeeks();
        org.joda.time.Period period23 = period18.plusSeconds((int) (byte) 100);
        org.joda.time.Period period25 = period18.withWeeks((int) '#');
        org.joda.time.PeriodType periodType26 = period18.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter27 = periodFormatter2.withParseType(periodType26);
        java.util.Locale locale28 = periodFormatter2.getLocale();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((int) '#', (int) ' ', (-32), (int) (short) 1, (int) (byte) -1, (int) 'a', (int) (short) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod37, "P1D", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodFormatter14);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodFormatter27);
        org.junit.Assert.assertNull(locale28);
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        org.joda.time.Period period4 = new org.joda.time.Period(0, (int) '4', (int) (short) 100, (int) (byte) -1);
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Days days6 = seconds5.toStandardDays();
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(days6);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (byte) 1, 0, (-32), 52);
        mutablePeriod4.setHours((-32));
        mutablePeriod4.setMinutes(0);
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType3 = periodType2.withHoursRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType3);
        mutablePeriod5.addWeeks((int) (short) 10);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType1 = periodType0.withMinutesRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withDaysRemoved();
        org.joda.time.PeriodType periodType4 = periodType2.withWeeksRemoved();
        org.joda.time.PeriodType periodType5 = periodType2.withYearsRemoved();
        int int6 = periodType5.size();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("PT600S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.Weeks weeks3 = weeks1.multipliedBy(8);
        org.joda.time.Weeks weeks5 = weeks3.minus(0);
        int int6 = weeks5.getWeeks();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds((int) 'a');
        org.joda.time.Weeks weeks2 = seconds1.toStandardWeeks();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(weeks2);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration2 = new org.joda.time.Duration((java.lang.Object) period1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType7 = seconds6.getFieldType();
        org.joda.time.Seconds seconds9 = seconds6.plus(25);
        org.joda.time.Seconds seconds10 = seconds6.negated();
        org.joda.time.PeriodType periodType11 = seconds10.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter12 = periodFormatter2.withParseType(periodType11);
        boolean boolean13 = periodFormatter2.isParser();
        java.util.Locale locale14 = null;
        org.joda.time.format.PeriodFormatter periodFormatter15 = periodFormatter2.withLocale(locale14);
        org.joda.time.Hours hours16 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours18 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean19 = hours16.isGreaterThan(hours18);
        org.joda.time.Duration duration20 = hours18.toStandardDuration();
        org.joda.time.Duration duration21 = duration20.toDuration();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((java.lang.Object) duration21);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod22, "PT3600S", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(periodFormatter15);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration21);
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period3 = period1.plusYears((int) ' ');
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.weeksIn(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.weeksIn(readableInterval6);
        boolean boolean8 = weeks5.isLessThan(weeks7);
        org.joda.time.Weeks weeks9 = weeks5.negated();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) weeks5, chronology10);
        boolean boolean12 = period3.equals((java.lang.Object) period11);
        org.joda.time.Period period14 = period3.plusYears(10);
        org.joda.time.Period period16 = period3.plusMonths((int) (byte) 100);
        org.joda.time.Period period18 = period16.withHours((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((java.lang.Object) period16);
        mutablePeriod19.setDays((int) (byte) 1);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period7 = period4.withSeconds((int) ' ');
        org.joda.time.Period period8 = period1.minus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType10 = periodType9.withMonthsRemoved();
        org.joda.time.Period period11 = period8.withPeriodType(periodType9);
        org.joda.time.Period period13 = period11.plusWeeks((int) (byte) 0);
        org.joda.time.Period period15 = period11.multipliedBy((int) (short) 0);
        int int16 = period15.getYears();
        org.joda.time.Days days17 = org.joda.time.Days.ZERO;
        int int18 = days17.getDays();
        org.joda.time.Period period20 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days21 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Period period23 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days24 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period23);
        org.joda.time.PeriodType periodType25 = days24.getPeriodType();
        boolean boolean26 = days21.isGreaterThan(days24);
        org.joda.time.Period period28 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days29 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Days days30 = days24.minus(days29);
        org.joda.time.Days days31 = days17.minus(days24);
        boolean boolean32 = period15.equals((java.lang.Object) days24);
        org.joda.time.Period period34 = period15.withWeeks(2);
        int int35 = period34.getSeconds();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.hours();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(periodType8);
        org.joda.time.PeriodType periodType10 = periodType8.withMinutesRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = new org.joda.time.Period((int) (short) 100, (-1), 40, 25, 2, 8, 3, (int) (short) -1, periodType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType2 = periodType1.withDaysRemoved();
        org.joda.time.Period period3 = new org.joda.time.Period((-60L), periodType2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration4 = new org.joda.time.Duration((java.lang.Object) periodType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ZERO;
        org.joda.time.PeriodType periodType1 = seconds0.getPeriodType();
        java.lang.String str2 = seconds0.toString();
        java.lang.String str3 = seconds0.toString();
        org.joda.time.Seconds seconds4 = null;
        org.joda.time.Seconds seconds5 = seconds0.minus(seconds4);
        org.joda.time.Seconds seconds7 = seconds5.plus((-672));
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds10 = duration9.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType11 = seconds10.getFieldType();
        org.joda.time.Seconds seconds13 = seconds10.plus(25);
        org.joda.time.Seconds seconds14 = seconds10.negated();
        org.joda.time.Seconds seconds15 = org.joda.time.Seconds.MIN_VALUE;
        org.joda.time.Seconds seconds16 = seconds10.plus(seconds15);
        org.joda.time.Duration duration17 = seconds15.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds18 = seconds7.minus(seconds15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Integer.MIN_VALUE cannot be negated");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0S" + "'", str2, "PT0S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0S" + "'", str3, "PT0S");
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(duration17);
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.weeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType2 = periodType0.getFieldType((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) (byte) 1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 25);
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) mutablePeriod1);
        int int3 = minutes2.getMinutes();
        org.joda.time.Weeks weeks4 = minutes2.toStandardWeeks();
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(weeks4);
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 7, chronology1);
        org.joda.time.MutablePeriod mutablePeriod3 = mutablePeriod2.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType5 = mutablePeriod2.getFieldType((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod3);
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks2 = weeks0.dividedBy(52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks4 = weeks0.multipliedBy((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2147483648 * 10");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutesIn(readableInterval0);
        java.lang.String str2 = minutes1.toString();
        org.joda.time.Days days3 = minutes1.toStandardDays();
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0M" + "'", str2, "PT0M");
        org.junit.Assert.assertNotNull(days3);
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
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
        org.joda.time.PeriodType periodType15 = days0.getPeriodType();
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
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("days");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"days\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = new org.joda.time.Duration((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = period1.withSeconds((int) ' ');
        java.lang.String str5 = period1.toString();
        org.joda.time.Period period7 = period1.minusWeeks((int) (byte) 10);
        org.joda.time.Period period9 = period1.plusDays((int) (byte) 10);
        org.joda.time.Period period11 = period1.plusMonths((-1));
        int int12 = period1.getMillis();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT1M" + "'", str5, "PT1M");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
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
        org.joda.time.Minutes minutes11 = duration2.toStandardMinutes();
        java.lang.String str12 = duration2.toString();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration2);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((java.lang.Object) readableInstant0, chronology14);
        mutablePeriod15.setPeriod(600, 0, 60, 52, (int) ' ', 32, 52, 60);
        int int25 = mutablePeriod15.getDays();
        org.joda.time.Seconds seconds26 = org.joda.time.Seconds.ZERO;
        org.joda.time.PeriodType periodType27 = seconds26.getPeriodType();
        org.joda.time.Chronology chronology28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period29 = new org.joda.time.Period((java.lang.Object) int25, periodType27, chronology28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT-60S" + "'", str12, "PT-60S");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertNotNull(periodType27);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        org.joda.time.Days days0 = org.joda.time.Days.ZERO;
        org.joda.time.Days days1 = org.joda.time.Days.ZERO;
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Days days6 = days4.minus(10);
        boolean boolean7 = days1.isGreaterThan(days4);
        org.joda.time.Days days8 = days0.minus(days1);
        org.joda.time.Days days9 = org.joda.time.Days.THREE;
        org.joda.time.Days days11 = days9.minus((-32));
        boolean boolean12 = days0.isLessThan(days11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType14 = days0.getFieldType(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 8");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) -1);
        org.joda.time.Period period5 = period1.withMillis(0);
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.weeksIn(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.Weeks weeks9 = org.joda.time.Weeks.weeksIn(readableInterval8);
        boolean boolean10 = weeks7.isLessThan(weeks9);
        org.joda.time.Weeks weeks12 = weeks9.minus((int) (short) -1);
        org.joda.time.Weeks weeks14 = weeks12.multipliedBy(0);
        boolean boolean15 = period1.equals((java.lang.Object) weeks14);
        org.joda.time.Weeks weeks17 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Period period19 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period21 = period19.withMillis((int) (byte) -1);
        org.joda.time.Weeks weeks22 = period21.toStandardWeeks();
        org.joda.time.Weeks weeks23 = weeks17.plus(weeks22);
        org.joda.time.Weeks weeks24 = weeks14.minus(weeks22);
        org.joda.time.DurationFieldType durationFieldType25 = weeks22.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks27 = weeks22.minus((-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Integer.MIN_VALUE cannot be negated");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(durationFieldType25);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.parse("PT0.052S");
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType4 = periodType3.withMinutesRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withYearsRemoved();
        java.lang.String str6 = periodType5.toString();
        org.joda.time.PeriodType periodType7 = periodType5.withWeeksRemoved();
        org.joda.time.PeriodType periodType8 = periodType5.withMillisRemoved();
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType11 = minutes10.getPeriodType();
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType14);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.weekyears();
        int int17 = period15.get(durationFieldType16);
        boolean boolean18 = periodType11.isSupported(durationFieldType16);
        org.joda.time.PeriodType periodType19 = periodType11.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 3, periodType11);
        boolean boolean21 = periodType5.equals((java.lang.Object) 3);
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2, periodType5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period24 = period22.withWeeks((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PeriodType[Millis]" + "'", str6, "PeriodType[Millis]");
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        org.joda.time.Days days1 = org.joda.time.Days.days((int) (byte) 1);
        org.joda.time.PeriodType periodType2 = days1.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = days1.getValue(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 2147483647");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 13, (-60L), chronology2);
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType5 = minutes4.getFieldType();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DurationField durationField7 = durationFieldType5.getField(chronology6);
        org.joda.time.Period period9 = period3.withField(durationFieldType5, (int) (byte) -1);
        org.joda.time.Period period11 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period13 = period11.withHours(32);
        org.joda.time.Period period14 = period11.normalizedStandard();
        java.lang.String str15 = period14.toString();
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period17 = period14.normalizedStandard(periodType16);
        org.joda.time.Period period19 = period14.minusHours(3);
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds22 = duration21.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType23 = seconds22.getFieldType();
        org.joda.time.Seconds seconds25 = org.joda.time.Seconds.parseSeconds("P0W");
        org.joda.time.Seconds seconds26 = seconds22.minus(seconds25);
        org.joda.time.Seconds seconds27 = seconds22.negated();
        org.joda.time.Seconds seconds29 = org.joda.time.Seconds.seconds((int) (short) 0);
        org.joda.time.Seconds seconds30 = seconds27.minus(seconds29);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.weekyears();
        java.lang.String str32 = durationFieldType31.getName();
        int int33 = seconds29.get(durationFieldType31);
        org.joda.time.Period period35 = period19.withFieldAdded(durationFieldType31, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period37 = period3.withFieldAdded(durationFieldType31, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weekyears'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT0.052S" + "'", str15, "PT0.052S");
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "weekyears" + "'", str32, "weekyears");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(period35);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT3H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PeriodType[Minutes]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[Minutes]\" is malformed at \"eriodType[Minutes]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period7 = period4.withSeconds((int) ' ');
        org.joda.time.Period period8 = period1.minus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period10 = period1.plusHours((-1));
        org.joda.time.Period period12 = period1.minusMonths(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType14 = period1.getFieldType(600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (short) -1, (int) '#', (int) ' ', 100);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.days();
        int int6 = mutablePeriod4.get(durationFieldType5);
        org.joda.time.Hours hours7 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType11 = periodType10.withWeeksRemoved();
        org.joda.time.PeriodType periodType12 = periodType11.withDaysRemoved();
        org.joda.time.Period period13 = new org.joda.time.Period((long) 'a', (long) (short) 0, periodType12);
        mutablePeriod4.add((org.joda.time.ReadablePeriod) period13);
        int int15 = mutablePeriod4.getWeeks();
        int int16 = mutablePeriod4.getDays();
        mutablePeriod4.addYears(52);
        mutablePeriod4.addMinutes(25);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        java.util.Locale locale3 = periodFormatter2.getLocale();
        org.joda.time.format.PeriodParser periodParser4 = periodFormatter2.getParser();
        java.io.Writer writer5 = null;
        org.joda.time.Duration duration6 = org.joda.time.Duration.ZERO;
        long long7 = duration6.getStandardDays();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Interval interval9 = duration6.toIntervalFrom(readableInstant8);
        org.joda.time.Duration duration10 = duration6.toDuration();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardMinutes((long) 10);
        java.lang.String str16 = duration15.toString();
        org.joda.time.Duration duration18 = duration15.minus((long) (byte) 10);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Minutes minutes20 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType21 = minutes20.getPeriodType();
        org.joda.time.PeriodType periodType22 = periodType21.withSecondsRemoved();
        org.joda.time.Period period23 = duration18.toPeriodFrom(readableInstant19, periodType21);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 0, (long) 3, periodType21);
        org.joda.time.PeriodType periodType25 = periodType21.withMonthsRemoved();
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration10, readableInstant11, periodType25);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer5, (org.joda.time.ReadablePeriod) period26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNull(periodParser4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PT600S" + "'", str16, "PT600S");
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(periodType25);
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) 10);
        java.lang.String str2 = duration1.toString();
        org.joda.time.Duration duration4 = duration1.minus((long) (byte) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Minutes minutes6 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType7 = minutes6.getPeriodType();
        org.joda.time.PeriodType periodType8 = periodType7.withSecondsRemoved();
        org.joda.time.Period period9 = duration4.toPeriodFrom(readableInstant5, periodType7);
        long long10 = duration4.getStandardMinutes();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT600S" + "'", str2, "PT600S");
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9L + "'", long10 == 9L);
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period10 = org.joda.time.Period.hours(0);
        org.joda.time.DurationFieldType durationFieldType12 = period10.getFieldType((int) (short) 1);
        org.joda.time.Period period14 = period10.plusDays(10);
        boolean boolean15 = periodType8.equals((java.lang.Object) 10);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod18.addYears((int) '4');
        boolean boolean21 = periodType8.equals((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period22 = new org.joda.time.Period((int) (short) 0, (-1), (int) (short) -1, (-2), 3, (int) 'a', (int) ' ', 7, periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) -1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        org.joda.time.Duration duration1 = new org.joda.time.Duration(60000L);
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        java.lang.String str3 = seconds2.toString();
        org.joda.time.PeriodType periodType4 = seconds2.getPeriodType();
        org.joda.time.PeriodType periodType5 = seconds2.getPeriodType();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = duration7.toPeriod(chronology8);
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant6, (org.joda.time.ReadableDuration) duration7);
        boolean boolean11 = periodType5.equals((java.lang.Object) duration7);
        org.joda.time.PeriodType periodType12 = periodType5.withMonthsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration13 = new org.joda.time.Duration((java.lang.Object) periodType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT60S" + "'", str3, "PT60S");
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType3 = seconds2.getFieldType();
        org.joda.time.Seconds seconds5 = seconds2.plus(25);
        org.joda.time.Seconds seconds6 = seconds2.negated();
        org.joda.time.Seconds seconds8 = seconds2.dividedBy(10);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds11 = duration10.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType12 = seconds11.getFieldType();
        org.joda.time.Seconds seconds14 = seconds11.plus(25);
        org.joda.time.Seconds seconds15 = seconds8.plus(seconds11);
        org.joda.time.DurationFieldType durationFieldType16 = seconds11.getFieldType();
        org.joda.time.Chronology chronology17 = null;
        boolean boolean18 = durationFieldType16.isSupported(chronology17);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType6 = minutes5.getPeriodType();
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes8 = minutes5.plus(minutes7);
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.ZERO;
        boolean boolean11 = minutes9.isLessThan(minutes10);
        boolean boolean12 = minutes5.isLessThan(minutes9);
        org.joda.time.PeriodType periodType13 = minutes5.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter14 = periodFormatter2.withParseType(periodType13);
        org.joda.time.format.PeriodParser periodParser15 = periodFormatter2.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod17 = periodFormatter2.parseMutablePeriod("PT4H");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodFormatter14);
        org.junit.Assert.assertNull(periodParser15);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        org.joda.time.Period period1 = org.joda.time.Period.months(25);
        org.joda.time.PeriodType periodType2 = period1.getPeriodType();
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType5);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.weekyears();
        int int8 = period6.get(durationFieldType7);
        org.joda.time.Period period10 = period6.withMillis((int) (byte) -1);
        org.joda.time.Period period12 = period6.plusMinutes(52);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType16 = periodType15.withHoursRemoved();
        org.joda.time.PeriodType periodType17 = periodType16.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(readableDuration13, readableInstant14, periodType16);
        org.joda.time.Period period19 = period6.normalizedStandard(periodType16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = period1.normalizedStandard(periodType16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("PT-1073741824M");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
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
        org.joda.time.Duration duration32 = weeks31.toStandardDuration();
        org.joda.time.ReadableInterval readableInterval33 = null;
        org.joda.time.Weeks weeks34 = org.joda.time.Weeks.weeksIn(readableInterval33);
        org.joda.time.ReadableInterval readableInterval35 = null;
        org.joda.time.Weeks weeks36 = org.joda.time.Weeks.weeksIn(readableInterval35);
        boolean boolean37 = weeks34.isLessThan(weeks36);
        org.joda.time.Weeks weeks39 = weeks36.minus((int) (short) -1);
        org.joda.time.Weeks weeks41 = weeks39.multipliedBy(0);
        org.joda.time.Weeks weeks42 = null;
        boolean boolean43 = weeks39.isLessThan(weeks42);
        int int45 = weeks39.getValue((int) (byte) 0);
        org.joda.time.ReadableInterval readableInterval46 = null;
        org.joda.time.Weeks weeks47 = org.joda.time.Weeks.weeksIn(readableInterval46);
        org.joda.time.Weeks weeks49 = weeks47.multipliedBy((int) (short) 10);
        org.joda.time.Weeks weeks50 = weeks39.minus(weeks49);
        org.joda.time.MutablePeriod mutablePeriod51 = weeks50.toMutablePeriod();
        org.joda.time.Weeks weeks52 = weeks31.plus(weeks50);
        org.joda.time.Period period57 = new org.joda.time.Period(0, (int) '4', (int) (short) 100, (int) (byte) -1);
        org.joda.time.Period period59 = period57.withDays((int) 'a');
        org.joda.time.Weeks weeks60 = period59.toStandardWeeks();
        int int61 = weeks60.getWeeks();
        org.joda.time.Weeks weeks63 = weeks60.plus((int) '4');
        boolean boolean64 = weeks31.isLessThan(weeks63);
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
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(weeks34);
        org.junit.Assert.assertNotNull(weeks36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(weeks39);
        org.junit.Assert.assertNotNull(weeks41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(weeks47);
        org.junit.Assert.assertNotNull(weeks49);
        org.junit.Assert.assertNotNull(weeks50);
        org.junit.Assert.assertNotNull(mutablePeriod51);
        org.junit.Assert.assertNotNull(weeks52);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(weeks60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 13 + "'", int61 == 13);
        org.junit.Assert.assertNotNull(weeks63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType3 = seconds2.getFieldType();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.parseSeconds("P0W");
        org.joda.time.Seconds seconds6 = seconds2.minus(seconds5);
        org.joda.time.Seconds seconds7 = seconds2.negated();
        java.lang.String str8 = seconds2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds10 = seconds2.multipliedBy((-1073741824));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 60 * -1073741824");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT60S" + "'", str8, "PT60S");
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.THREE;
        org.joda.time.Minutes minutes2 = minutes0.multipliedBy((int) ' ');
        java.lang.String str3 = minutes0.toString();
        int int4 = minutes0.size();
        org.joda.time.Period period5 = minutes0.toPeriod();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT3M" + "'", str3, "PT3M");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        org.joda.time.Days days9 = days2.minus(1);
        org.joda.time.Days days11 = days9.dividedBy(60);
        org.joda.time.Duration duration12 = days9.toStandardDuration();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(0L);
        mutablePeriod14.addMonths((int) (byte) -1);
        mutablePeriod14.addYears(8);
        boolean boolean19 = duration12.equals((java.lang.Object) mutablePeriod14);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period22 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days23 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period22);
        org.joda.time.PeriodType periodType24 = days23.getPeriodType();
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(readableInstant25, readableDuration26);
        mutablePeriod27.setHours((int) (short) 100);
        boolean boolean30 = periodType24.equals((java.lang.Object) mutablePeriod27);
        org.joda.time.Duration duration31 = org.joda.time.Duration.ZERO;
        long long32 = duration31.getStandardDays();
        mutablePeriod27.add((org.joda.time.ReadableDuration) duration31);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.PeriodType periodType35 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType36 = periodType35.withWeeksRemoved();
        org.joda.time.PeriodType periodType37 = periodType36.withDaysRemoved();
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration31, readableInstant34, periodType36);
        org.joda.time.PeriodType periodType39 = periodType36.withMonthsRemoved();
        org.joda.time.Period period40 = duration12.toPeriodTo(readableInstant20, periodType39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period42 = period40.minusDays(2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(period40);
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((java.lang.Object) "days");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"days\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("PT60S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        org.joda.time.Period period1 = org.joda.time.Period.millis(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration2 = new org.joda.time.Duration((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        java.lang.Object obj2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType4 = periodType3.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(obj2, periodType3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds10 = duration9.toStandardSeconds();
        org.joda.time.Seconds seconds12 = seconds10.plus(100);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = days2.compareTo((org.joda.time.base.BaseSingleFieldPeriod) seconds10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Days cannot be compared to class org.joda.time.Seconds");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds12);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableInstant4, readableDuration5);
        mutablePeriod6.setHours((int) (short) 100);
        boolean boolean9 = periodType3.equals((java.lang.Object) mutablePeriod6);
        org.joda.time.Duration duration10 = org.joda.time.Duration.ZERO;
        long long11 = duration10.getStandardDays();
        mutablePeriod6.add((org.joda.time.ReadableDuration) duration10);
        org.joda.time.Period period14 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days15 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period14);
        org.joda.time.PeriodType periodType16 = days15.getPeriodType();
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableInstant17, readableDuration18);
        mutablePeriod19.setHours((int) (short) 100);
        boolean boolean22 = periodType16.equals((java.lang.Object) mutablePeriod19);
        org.joda.time.Duration duration23 = org.joda.time.Duration.ZERO;
        long long24 = duration23.getStandardDays();
        mutablePeriod19.add((org.joda.time.ReadableDuration) duration23);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType28);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.weekyears();
        int int31 = period29.get(durationFieldType30);
        int int32 = mutablePeriod19.get(durationFieldType30);
        int int33 = mutablePeriod6.get(durationFieldType30);
        mutablePeriod6.addMinutes((int) '4');
        int int36 = mutablePeriod6.getMonths();
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(readableInstant37, readableDuration38);
        org.joda.time.Period period40 = mutablePeriod39.toPeriod();
        int int41 = period40.size();
        org.joda.time.Period period42 = period40.toPeriod();
        org.joda.time.Period period44 = period42.minusDays((int) (short) -1);
        mutablePeriod6.mergePeriod((org.joda.time.ReadablePeriod) period44);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration46 = new org.joda.time.Duration((java.lang.Object) mutablePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.MutablePeriod");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 8 + "'", int41 == 8);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.MAX_VALUE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds2 = seconds0.multipliedBy((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2147483647 * 10");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType6 = minutes5.getPeriodType();
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes8 = minutes5.plus(minutes7);
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.ZERO;
        boolean boolean11 = minutes9.isLessThan(minutes10);
        boolean boolean12 = minutes5.isLessThan(minutes9);
        org.joda.time.PeriodType periodType13 = minutes5.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter14 = periodFormatter2.withParseType(periodType13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(readableInstant15, readableDuration16);
        org.joda.time.Period period18 = mutablePeriod17.toPeriod();
        org.joda.time.Period period20 = period18.withHours(0);
        int int21 = period18.getWeeks();
        org.joda.time.Period period23 = period18.plusSeconds((int) (byte) 100);
        org.joda.time.Period period25 = period18.withWeeks((int) '#');
        org.joda.time.PeriodType periodType26 = period18.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter27 = periodFormatter2.withParseType(periodType26);
        org.joda.time.PeriodType periodType28 = periodFormatter2.getParseType();
        java.lang.StringBuffer stringBuffer29 = null;
        org.joda.time.Duration duration31 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType33 = periodType32.withWeeksRemoved();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = duration31.toPeriod(periodType32, chronology34);
        org.joda.time.Days days36 = org.joda.time.Days.ZERO;
        int int37 = days36.getDays();
        org.joda.time.Period period39 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days40 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period39);
        org.joda.time.Period period42 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days43 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period42);
        org.joda.time.PeriodType periodType44 = days43.getPeriodType();
        boolean boolean45 = days40.isGreaterThan(days43);
        org.joda.time.Period period47 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days48 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period47);
        org.joda.time.Days days49 = days43.minus(days48);
        org.joda.time.Days days50 = days36.minus(days43);
        boolean boolean51 = duration31.equals((java.lang.Object) days43);
        org.joda.time.Period period52 = duration31.toPeriod();
        org.joda.time.Duration duration53 = duration31.toDuration();
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Period period55 = duration31.toPeriodTo(readableInstant54);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer29, (org.joda.time.ReadablePeriod) period55);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodFormatter14);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodFormatter27);
        org.junit.Assert.assertNull(periodType28);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(days40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(days43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(days48);
        org.junit.Assert.assertNotNull(days49);
        org.junit.Assert.assertNotNull(days50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(period55);
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        org.joda.time.Duration duration1 = org.joda.time.Duration.ZERO;
        long long2 = duration1.getStandardDays();
        org.joda.time.Hours hours3 = duration1.toStandardHours();
        org.joda.time.PeriodType periodType4 = hours3.getPeriodType();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) 13, periodType4, chronology5);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod6.addWeeks((-32));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, (long) '#');
        org.joda.time.Period period4 = period2.plusWeeks((int) ' ');
        int int5 = period4.getDays();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.Duration duration3 = duration1.plus((long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = duration3.toPeriodTo(readableInstant4);
        org.joda.time.Period period7 = period5.withYears((int) '#');
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableInstant8, readableDuration9);
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds13 = duration12.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType14 = seconds13.getFieldType();
        mutablePeriod10.add(durationFieldType14, 52);
        org.joda.time.Period period18 = period5.withFieldAdded(durationFieldType14, 7);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours((int) 'a');
        org.joda.time.Days days2 = org.joda.time.Days.ZERO;
        int int3 = days2.getDays();
        org.joda.time.Period period5 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Period period8 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period8);
        org.joda.time.PeriodType periodType10 = days9.getPeriodType();
        boolean boolean11 = days6.isGreaterThan(days9);
        org.joda.time.Period period13 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days14 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Days days15 = days9.minus(days14);
        org.joda.time.Days days16 = days2.minus(days9);
        org.joda.time.Period period18 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days19 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period21 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days22 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period21);
        org.joda.time.PeriodType periodType23 = days22.getPeriodType();
        boolean boolean24 = days19.isGreaterThan(days22);
        org.joda.time.Period period26 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days27 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period26);
        org.joda.time.Days days28 = days22.minus(days27);
        org.joda.time.Period period30 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days31 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Days days33 = days31.minus(10);
        org.joda.time.Days days34 = days22.plus(days31);
        org.joda.time.Days days36 = days34.dividedBy(100);
        org.joda.time.Days days37 = null;
        org.joda.time.Days days38 = days36.plus(days37);
        org.joda.time.Days days39 = days36.negated();
        org.joda.time.Days days40 = days2.minus(days36);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = hours1.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days36);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Hours cannot be compared to class org.joda.time.Days");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertNotNull(days39);
        org.junit.Assert.assertNotNull(days40);
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        org.joda.time.Days days0 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.Days days2 = days0.minus(25);
        org.joda.time.Days days4 = days2.multipliedBy(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes5 = days2.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2147483622 * 1440");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days4);
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = duration1.toPeriod(periodType2, chronology4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType8 = periodType7.withMonthsRemoved();
        org.joda.time.Period period9 = duration1.toPeriodTo(readableInstant6, periodType8);
        org.joda.time.Duration duration10 = duration1.toDuration();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period13 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days14 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period13);
        org.joda.time.PeriodType periodType15 = days14.getPeriodType();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(readableInstant16, readableDuration17);
        mutablePeriod18.setHours((int) (short) 100);
        boolean boolean21 = periodType15.equals((java.lang.Object) mutablePeriod18);
        org.joda.time.PeriodType periodType22 = periodType15.withMonthsRemoved();
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration1, readableInstant11, periodType15);
        java.lang.String str24 = duration1.toString();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT-60S" + "'", str24, "PT-60S");
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        org.joda.time.Seconds seconds8 = org.joda.time.Seconds.TWO;
        org.joda.time.Duration duration9 = seconds8.toStandardDuration();
        org.joda.time.DurationFieldType durationFieldType10 = seconds8.getFieldType();
        org.joda.time.PeriodType periodType11 = seconds8.getPeriodType();
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds14 = duration13.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType15 = seconds14.getFieldType();
        org.joda.time.Seconds seconds17 = org.joda.time.Seconds.parseSeconds("P0W");
        org.joda.time.Seconds seconds18 = seconds14.minus(seconds17);
        boolean boolean19 = seconds8.isLessThan(seconds18);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = days2.compareTo((org.joda.time.base.BaseSingleFieldPeriod) seconds8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Days cannot be compared to class org.joda.time.Seconds");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType3 = seconds2.getFieldType();
        org.joda.time.Period period4 = seconds2.toPeriod();
        org.joda.time.Days days5 = seconds2.toStandardDays();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds7 = seconds2.multipliedBy((-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 60 * -2147483648");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        boolean boolean4 = weeks1.isLessThan(weeks3);
        org.joda.time.Weeks weeks6 = weeks3.minus((int) (short) -1);
        org.joda.time.Weeks weeks7 = weeks6.negated();
        org.joda.time.Duration duration8 = weeks6.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType10 = weeks6.getFieldType((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(duration8);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        org.joda.time.Days days1 = org.joda.time.Days.days(8);
        org.joda.time.Hours hours2 = days1.toStandardHours();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(hours2);
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        int int2 = minutes0.getMinutes();
        java.lang.String str3 = minutes0.toString();
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType5 = minutes4.getFieldType();
        java.lang.String str6 = minutes4.toString();
        boolean boolean7 = minutes0.isLessThan(minutes4);
        org.joda.time.Minutes minutes8 = minutes0.negated();
        org.joda.time.DurationFieldType durationFieldType9 = minutes0.getFieldType();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DurationField durationField11 = durationFieldType9.getField(chronology10);
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0M" + "'", str3, "PT0M");
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT-2147483648M" + "'", str6, "PT-2147483648M");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.format.PeriodParser periodParser4 = periodFormatter3.getParser();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter3.withLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod7 = org.joda.time.MutablePeriod.parse("hi!", periodFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser4);
        org.junit.Assert.assertNotNull(periodFormatter6);
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = period1.withSeconds((int) ' ');
        int int5 = period4.getSeconds();
        org.joda.time.Period period7 = period4.withHours((int) '#');
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod10.addYears((int) '4');
        org.joda.time.Chronology chronology14 = null;
        mutablePeriod10.add((long) 100, chronology14);
        mutablePeriod10.setMillis((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        mutablePeriod10.setPeriod(readableInstant18, readableInstant19);
        mutablePeriod10.clear();
        org.joda.time.Period period22 = period4.plus((org.joda.time.ReadablePeriod) mutablePeriod10);
        int int23 = period4.getYears();
        org.joda.time.Period period25 = period4.withMonths(4);
        int int26 = period25.getMillis();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (short) -1);
        org.joda.time.Period period3 = period1.plusMinutes(7);
        int int4 = period3.getMonths();
        org.joda.time.Period period6 = period3.minusWeeks((int) (byte) 100);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        mutablePeriod2.setHours((int) (short) 100);
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration6, chronology7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant9, periodType10);
        org.joda.time.Period period13 = period11.withYears(40);
        int int14 = period13.getDays();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("PT0M");
        org.junit.Assert.assertNotNull(minutes1);
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = period1.withSeconds((int) ' ');
        int int5 = period4.getSeconds();
        org.joda.time.Period period7 = period4.withHours((int) '#');
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod10.addYears((int) '4');
        org.joda.time.Chronology chronology14 = null;
        mutablePeriod10.add((long) 100, chronology14);
        mutablePeriod10.setMillis((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        mutablePeriod10.setPeriod(readableInstant18, readableInstant19);
        mutablePeriod10.clear();
        org.joda.time.Period period22 = period4.plus((org.joda.time.ReadablePeriod) mutablePeriod10);
        int int23 = period4.getYears();
        org.joda.time.Period period25 = period4.withMonths(4);
        org.joda.time.Period period27 = period4.withDays(25);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration4);
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType10 = periodType9.withWeeksRemoved();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = duration8.toPeriod(periodType9, chronology11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType15 = periodType14.withMonthsRemoved();
        org.joda.time.Period period16 = duration8.toPeriodTo(readableInstant13, periodType15);
        org.joda.time.Period period17 = duration8.toPeriod();
        org.joda.time.Duration duration18 = duration4.plus((org.joda.time.ReadableDuration) duration8);
        org.joda.time.Duration duration19 = duration4.toDuration();
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType21 = periodType20.withMonthsRemoved();
        org.joda.time.PeriodType periodType22 = periodType21.withMinutesRemoved();
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration4, periodType22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period25 = period23.minusHours((-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType3 = seconds2.getFieldType();
        org.joda.time.Seconds seconds5 = seconds2.plus(25);
        org.joda.time.Seconds seconds6 = seconds2.negated();
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.MIN_VALUE;
        org.joda.time.Seconds seconds8 = seconds2.plus(seconds7);
        int int9 = seconds7.size();
        org.joda.time.Period period11 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days12 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period11);
        org.joda.time.PeriodType periodType13 = days12.getPeriodType();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(readableInstant14, readableDuration15);
        mutablePeriod16.setHours((int) (short) 100);
        boolean boolean19 = periodType13.equals((java.lang.Object) mutablePeriod16);
        org.joda.time.PeriodType periodType20 = periodType13.withYearsRemoved();
        int int21 = periodType20.size();
        java.lang.String str22 = periodType20.toString();
        org.joda.time.Chronology chronology23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period24 = new org.joda.time.Period((java.lang.Object) int9, periodType20, chronology23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PeriodType[Days]" + "'", str22, "PeriodType[Days]");
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        java.util.Locale locale6 = periodFormatter2.getLocale();
        java.util.Locale locale7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter2.withLocale(locale7);
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(readableInstant12, readableDuration13);
        mutablePeriod14.setHours((int) (short) 100);
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology19 = null;
        mutablePeriod14.setPeriod((org.joda.time.ReadableDuration) duration18, chronology19);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType22 = periodType21.withWeeksRemoved();
        org.joda.time.PeriodType periodType23 = periodType22.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(readableInstant11, (org.joda.time.ReadableDuration) duration18, periodType22);
        org.joda.time.Duration duration26 = duration18.withMillis((long) 10);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(readableInstant10, (org.joda.time.ReadableDuration) duration18);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer9, (org.joda.time.ReadablePeriod) mutablePeriod27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(duration26);
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType2 = minutes1.getPeriodType();
        org.joda.time.PeriodType periodType3 = periodType2.withMinutesRemoved();
        java.lang.String str4 = periodType2.toString();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) 10, periodType2);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod5.addWeeks((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PeriodType[Minutes]" + "'", str4, "PeriodType[Minutes]");
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(0L);
        mutablePeriod1.addMonths((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = mutablePeriod1.toDurationTo(readableInstant4);
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds8 = duration7.toStandardSeconds();
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds11 = duration10.toStandardSeconds();
        boolean boolean12 = duration7.isLongerThan((org.joda.time.ReadableDuration) duration10);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds15 = duration14.toStandardSeconds();
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds18 = duration17.toStandardSeconds();
        boolean boolean19 = duration14.isLongerThan((org.joda.time.ReadableDuration) duration17);
        org.joda.time.Period period20 = duration14.toPeriod();
        boolean boolean21 = duration10.isLongerThan((org.joda.time.ReadableDuration) duration14);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = duration10.toPeriodTo(readableInstant22);
        long long24 = duration10.getStandardDays();
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.Period period27 = duration26.toPeriod();
        long long28 = duration26.getStandardSeconds();
        boolean boolean29 = duration10.isEqual((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration31 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds32 = duration31.toStandardSeconds();
        org.joda.time.Duration duration34 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds35 = duration34.toStandardSeconds();
        boolean boolean36 = duration31.isLongerThan((org.joda.time.ReadableDuration) duration34);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType39 = periodType38.withMinutesRemoved();
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration34, readableInstant37, periodType38);
        boolean boolean41 = duration10.isLongerThan((org.joda.time.ReadableDuration) duration34);
        org.joda.time.Seconds seconds42 = duration34.toStandardSeconds();
        boolean boolean43 = duration5.isLongerThan((org.joda.time.ReadableDuration) duration34);
        long long44 = duration5.getStandardSeconds();
        org.joda.time.ReadableInstant readableInstant45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval46 = duration5.toIntervalFrom(readableInstant45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-60L) + "'", long28 == (-60L));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(seconds35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(seconds42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-2419200L) + "'", long44 == (-2419200L));
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DurationField durationField2 = durationFieldType0.getField(chronology1);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType6 = minutes5.getPeriodType();
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes8 = minutes5.plus(minutes7);
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.ZERO;
        boolean boolean11 = minutes9.isLessThan(minutes10);
        boolean boolean12 = minutes5.isLessThan(minutes9);
        org.joda.time.PeriodType periodType13 = minutes5.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter14 = periodFormatter2.withParseType(periodType13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(readableInstant15, readableDuration16);
        org.joda.time.Period period18 = mutablePeriod17.toPeriod();
        org.joda.time.Period period20 = period18.withHours(0);
        int int21 = period18.getWeeks();
        org.joda.time.Period period23 = period18.plusSeconds((int) (byte) 100);
        org.joda.time.Period period25 = period18.withWeeks((int) '#');
        org.joda.time.PeriodType periodType26 = period18.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter27 = periodFormatter2.withParseType(periodType26);
        java.util.Locale locale28 = periodFormatter2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod30 = periodFormatter2.parseMutablePeriod("PT-1M");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodFormatter14);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodFormatter27);
        org.junit.Assert.assertNull(locale28);
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (short) -1);
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) weeks2);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(days3);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        java.lang.String str3 = seconds2.toString();
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.days();
        boolean boolean5 = seconds2.isSupported(durationFieldType4);
        org.joda.time.Weeks weeks6 = seconds2.toStandardWeeks();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT60S" + "'", str3, "PT60S");
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(weeks6);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        org.joda.time.Period period5 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Period period8 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period11 = period8.withSeconds((int) ' ');
        org.joda.time.Period period12 = period5.minus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType14 = periodType13.withMonthsRemoved();
        org.joda.time.Period period15 = period12.withPeriodType(periodType13);
        org.joda.time.Period period16 = new org.joda.time.Period((long) (short) 0, (-1L), periodType13);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) (short) -1, (long) (-32), periodType13);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
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
        org.joda.time.PeriodType periodType19 = weeks18.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType21 = periodType19.getFieldType((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        mutablePeriod2.setHours((int) (short) 100);
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration6, chronology7);
        org.joda.time.Period period9 = duration6.toPeriod();
        org.joda.time.Period period11 = period9.plusWeeks(0);
        org.joda.time.Period period12 = period11.toPeriod();
        org.joda.time.Period period14 = period12.plusMinutes(52);
        org.joda.time.format.PeriodPrinter periodPrinter15 = null;
        org.joda.time.format.PeriodParser periodParser16 = null;
        org.joda.time.format.PeriodFormatter periodFormatter17 = new org.joda.time.format.PeriodFormatter(periodPrinter15, periodParser16);
        org.joda.time.format.PeriodParser periodParser18 = periodFormatter17.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter19 = periodFormatter17.getPrinter();
        java.util.Locale locale20 = null;
        org.joda.time.format.PeriodFormatter periodFormatter21 = periodFormatter17.withLocale(locale20);
        java.util.Locale locale22 = periodFormatter17.getLocale();
        boolean boolean23 = periodFormatter17.isParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = period14.toString(periodFormatter17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNull(periodParser18);
        org.junit.Assert.assertNull(periodPrinter19);
        org.junit.Assert.assertNotNull(periodFormatter21);
        org.junit.Assert.assertNull(locale22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
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
        org.joda.time.Period period14 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days15 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period14);
        org.joda.time.PeriodType periodType16 = days15.getPeriodType();
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableInstant17, readableDuration18);
        mutablePeriod19.setHours((int) (short) 100);
        boolean boolean22 = periodType16.equals((java.lang.Object) mutablePeriod19);
        org.joda.time.Duration duration23 = org.joda.time.Duration.ZERO;
        long long24 = duration23.getStandardDays();
        mutablePeriod19.add((org.joda.time.ReadableDuration) duration23);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType28 = periodType27.withWeeksRemoved();
        org.joda.time.PeriodType periodType29 = periodType28.withDaysRemoved();
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration23, readableInstant26, periodType28);
        boolean boolean31 = duration3.isEqual((org.joda.time.ReadableDuration) duration23);
        long long32 = duration3.getStandardSeconds();
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.hours();
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration3, periodType33);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) (-32), periodType33);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod35.add((int) '#', 2, 10, 100, (int) (short) -1, 60, 54, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-60L) + "'", long32 == (-60L));
        org.junit.Assert.assertNotNull(periodType33);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
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
        org.joda.time.Duration duration35 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds36 = duration35.toStandardSeconds();
        org.joda.time.Duration duration38 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds39 = duration38.toStandardSeconds();
        boolean boolean40 = duration35.isLongerThan((org.joda.time.ReadableDuration) duration38);
        org.joda.time.Duration duration42 = duration35.minus((long) 3);
        org.joda.time.Duration duration43 = duration35.toDuration();
        boolean boolean44 = duration33.isLongerThan((org.joda.time.ReadableDuration) duration35);
        org.joda.time.Duration duration47 = duration35.withDurationAdded(540000L, 32);
        org.joda.time.Chronology chronology48 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((java.lang.Object) 540000L, chronology48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(seconds36);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(seconds39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(duration47);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '4', chronology1);
        int int3 = mutablePeriod2.getMillis();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) ' ', (int) (byte) 10, 1, (int) (byte) 10, (int) (short) 100, (int) (short) 100, 52, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType10 = mutablePeriod8.getFieldType(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("PeriodType[MinutesNoMinutes]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[MinutesNoMinutes]\" is malformed at \"eriodType[MinutesNoMinutes]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (-8), (long) (byte) -1, chronology2);
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardMinutes((long) 10);
        java.lang.String str8 = duration7.toString();
        org.joda.time.Duration duration10 = duration7.minus((long) (byte) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Minutes minutes12 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType13 = minutes12.getPeriodType();
        org.joda.time.PeriodType periodType14 = periodType13.withSecondsRemoved();
        org.joda.time.Period period15 = duration10.toPeriodFrom(readableInstant11, periodType13);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 0, (long) 3, periodType13);
        org.joda.time.PeriodType periodType17 = periodType13.withMonthsRemoved();
        org.joda.time.PeriodType periodType18 = periodType13.withYearsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = period3.withPeriodType(periodType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT600S" + "'", str8, "PT600S");
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Duration duration8 = duration1.minus((long) 3);
        long long9 = duration1.getStandardSeconds();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60L + "'", long9 == 60L);
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType6 = minutes5.getPeriodType();
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes8 = minutes5.plus(minutes7);
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.ZERO;
        boolean boolean11 = minutes9.isLessThan(minutes10);
        boolean boolean12 = minutes5.isLessThan(minutes9);
        org.joda.time.PeriodType periodType13 = minutes5.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter14 = periodFormatter2.withParseType(periodType13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(readableInstant15, readableDuration16);
        org.joda.time.Period period18 = mutablePeriod17.toPeriod();
        org.joda.time.Period period20 = period18.withHours(0);
        int int21 = period18.getWeeks();
        org.joda.time.Period period23 = period18.plusSeconds((int) (byte) 100);
        org.joda.time.Period period25 = period18.withWeeks((int) '#');
        org.joda.time.PeriodType periodType26 = period18.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter27 = periodFormatter2.withParseType(periodType26);
        java.lang.StringBuffer stringBuffer28 = null;
        org.joda.time.Period period30 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days31 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Period period33 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days34 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period33);
        org.joda.time.PeriodType periodType35 = days34.getPeriodType();
        boolean boolean36 = days31.isGreaterThan(days34);
        int int37 = days31.size();
        org.joda.time.Days days38 = days31.negated();
        org.joda.time.Days days40 = days38.minus(3);
        org.joda.time.Days days41 = days40.negated();
        java.lang.String str42 = days41.toString();
        org.joda.time.Period period44 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days45 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period44);
        org.joda.time.Period period47 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days48 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period47);
        org.joda.time.PeriodType periodType49 = days48.getPeriodType();
        boolean boolean50 = days45.isGreaterThan(days48);
        org.joda.time.Days days52 = days45.minus(1);
        org.joda.time.Days days54 = days52.dividedBy(60);
        org.joda.time.Days days55 = days41.plus(days52);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer28, (org.joda.time.ReadablePeriod) days52);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodFormatter14);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodFormatter27);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertNotNull(days40);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "P3D" + "'", str42, "P3D");
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(days45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(days48);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(days52);
        org.junit.Assert.assertNotNull(days54);
        org.junit.Assert.assertNotNull(days55);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("P0W");
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType3 = minutes2.getFieldType();
        org.joda.time.Duration duration4 = minutes2.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes5 = minutes1.minus(minutes2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Integer.MIN_VALUE cannot be negated");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours((int) (short) 1);
        org.joda.time.Weeks weeks2 = hours1.toStandardWeeks();
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(weeks2);
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableInstant4, readableDuration5);
        mutablePeriod6.setHours((int) (short) 100);
        boolean boolean9 = periodType3.equals((java.lang.Object) mutablePeriod6);
        org.joda.time.Duration duration10 = org.joda.time.Duration.ZERO;
        long long11 = duration10.getStandardDays();
        mutablePeriod6.add((org.joda.time.ReadableDuration) duration10);
        mutablePeriod6.clear();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod16.addYears((int) '4');
        int int19 = mutablePeriod16.getYears();
        mutablePeriod6.add((org.joda.time.ReadablePeriod) mutablePeriod16);
        mutablePeriod16.setValue(0, (-2));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds3 = duration2.toStandardSeconds();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        boolean boolean7 = duration2.isLongerThan((org.joda.time.ReadableDuration) duration5);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType10 = periodType9.withMinutesRemoved();
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant8, periodType9);
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration5);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period14 = duration5.toPeriod(periodType13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(readableInstant16, readableDuration17);
        mutablePeriod18.setHours((int) (short) 100);
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology23 = null;
        mutablePeriod18.setPeriod((org.joda.time.ReadableDuration) duration22, chronology23);
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType26 = periodType25.withWeeksRemoved();
        org.joda.time.PeriodType periodType27 = periodType26.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(readableInstant15, (org.joda.time.ReadableDuration) duration22, periodType26);
        org.joda.time.Period period29 = duration5.toPeriod(periodType26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period31 = period29.withWeeks(6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(period29);
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        boolean boolean4 = weeks1.isLessThan(weeks3);
        org.joda.time.Weeks weeks5 = weeks1.negated();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) weeks1, chronology6);
        int int8 = period7.getYears();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        java.util.Locale locale6 = periodFormatter2.getLocale();
        java.util.Locale locale7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter2.withLocale(locale7);
        java.util.Locale locale9 = periodFormatter8.getLocale();
        java.lang.StringBuffer stringBuffer10 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, (long) ' ');
        mutablePeriod13.setHours(0);
        org.joda.time.MutablePeriod mutablePeriod16 = mutablePeriod13.copy();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter8.printTo(stringBuffer10, (org.joda.time.ReadablePeriod) mutablePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNotNull(mutablePeriod16);
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        java.lang.Object obj0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType2 = periodType1.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(obj0, periodType1);
        org.joda.time.Period period5 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period5);
        org.joda.time.PeriodType periodType7 = days6.getPeriodType();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableInstant8, readableDuration9);
        mutablePeriod10.setHours((int) (short) 100);
        boolean boolean13 = periodType7.equals((java.lang.Object) mutablePeriod10);
        org.joda.time.PeriodType periodType14 = periodType7.withMonthsRemoved();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((java.lang.Object) mutablePeriod3, periodType7, chronology15);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.addMinutes(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(periodType14);
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("P-1D");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        boolean boolean4 = weeks1.isLessThan(weeks3);
        org.joda.time.Weeks weeks6 = weeks3.minus((int) (short) -1);
        org.joda.time.Weeks weeks8 = weeks6.multipliedBy(0);
        org.joda.time.Weeks weeks9 = null;
        boolean boolean10 = weeks6.isLessThan(weeks9);
        int int12 = weeks6.getValue((int) (byte) 0);
        org.joda.time.ReadableInterval readableInterval13 = null;
        org.joda.time.Weeks weeks14 = org.joda.time.Weeks.weeksIn(readableInterval13);
        org.joda.time.Weeks weeks16 = weeks14.multipliedBy((int) (short) 10);
        org.joda.time.Weeks weeks17 = weeks6.minus(weeks16);
        org.joda.time.DurationFieldType durationFieldType18 = weeks17.getFieldType();
        java.lang.String str19 = durationFieldType18.toString();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "weeks" + "'", str19, "weeks");
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) 'a');
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        long long1 = duration0.getStandardDays();
        org.joda.time.Hours hours2 = duration0.toStandardHours();
        long long3 = duration0.getStandardMinutes();
        org.joda.time.Hours hours4 = duration0.toStandardHours();
        java.lang.String str5 = duration0.toString();
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT0S" + "'", str5, "PT0S");
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("Millis");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Millis\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("P1W");
        mutablePeriod1.setMonths(7);
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType2 = periodType1.withDaysRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withMonthsRemoved();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(600L, periodType3, chronology4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType7 = periodType3.getFieldType(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) (byte) 100);
        mutablePeriod1.setMillis(100);
        mutablePeriod1.addYears(40);
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = duration0.toPeriod(chronology1);
        int int3 = period2.size();
        org.joda.time.Period period5 = period2.plusHours((int) (short) 1);
        org.joda.time.Period period6 = period2.toPeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray7 = period2.getFieldTypes();
        org.joda.time.format.PeriodPrinter periodPrinter8 = null;
        org.joda.time.format.PeriodParser periodParser9 = null;
        org.joda.time.format.PeriodFormatter periodFormatter10 = new org.joda.time.format.PeriodFormatter(periodPrinter8, periodParser9);
        org.joda.time.format.PeriodParser periodParser11 = periodFormatter10.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter12 = periodFormatter10.getPrinter();
        boolean boolean13 = periodFormatter10.isParser();
        boolean boolean14 = periodFormatter10.isParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = period2.toString(periodFormatter10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(durationFieldTypeArray7);
        org.junit.Assert.assertNull(periodParser11);
        org.junit.Assert.assertNull(periodPrinter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("PT1H");
        org.joda.time.Days days2 = hours1.toStandardDays();
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(days2);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        boolean boolean4 = weeks1.isLessThan(weeks3);
        org.joda.time.Weeks weeks6 = weeks3.minus((int) (short) -1);
        org.joda.time.Weeks weeks7 = weeks6.negated();
        org.joda.time.Weeks weeks9 = weeks6.multipliedBy(0);
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.Weeks weeks11 = org.joda.time.Weeks.weeksIn(readableInterval10);
        org.joda.time.ReadableInterval readableInterval12 = null;
        org.joda.time.Weeks weeks13 = org.joda.time.Weeks.weeksIn(readableInterval12);
        boolean boolean14 = weeks11.isLessThan(weeks13);
        org.joda.time.Weeks weeks15 = weeks11.negated();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.Weeks weeks17 = org.joda.time.Weeks.weeksIn(readableInterval16);
        org.joda.time.ReadableInterval readableInterval18 = null;
        org.joda.time.Weeks weeks19 = org.joda.time.Weeks.weeksIn(readableInterval18);
        boolean boolean20 = weeks17.isLessThan(weeks19);
        org.joda.time.Weeks weeks21 = weeks17.negated();
        org.joda.time.Weeks weeks23 = weeks21.minus((int) (byte) 100);
        org.joda.time.Weeks weeks24 = weeks15.plus(weeks21);
        org.joda.time.ReadableInterval readableInterval25 = null;
        org.joda.time.Weeks weeks26 = org.joda.time.Weeks.weeksIn(readableInterval25);
        org.joda.time.ReadableInterval readableInterval27 = null;
        org.joda.time.Weeks weeks28 = org.joda.time.Weeks.weeksIn(readableInterval27);
        boolean boolean29 = weeks26.isLessThan(weeks28);
        org.joda.time.Weeks weeks30 = weeks26.negated();
        org.joda.time.ReadableInterval readableInterval31 = null;
        org.joda.time.Weeks weeks32 = org.joda.time.Weeks.weeksIn(readableInterval31);
        org.joda.time.ReadableInterval readableInterval33 = null;
        org.joda.time.Weeks weeks34 = org.joda.time.Weeks.weeksIn(readableInterval33);
        boolean boolean35 = weeks32.isLessThan(weeks34);
        org.joda.time.Weeks weeks36 = weeks32.negated();
        org.joda.time.Weeks weeks38 = weeks36.minus((int) (byte) 100);
        org.joda.time.Weeks weeks39 = weeks30.plus(weeks36);
        org.joda.time.DurationFieldType durationFieldType40 = weeks36.getFieldType();
        org.joda.time.Weeks weeks41 = weeks21.plus(weeks36);
        org.joda.time.Duration duration42 = weeks41.toStandardDuration();
        org.joda.time.ReadableInterval readableInterval43 = null;
        org.joda.time.Weeks weeks44 = org.joda.time.Weeks.weeksIn(readableInterval43);
        org.joda.time.ReadableInterval readableInterval45 = null;
        org.joda.time.Weeks weeks46 = org.joda.time.Weeks.weeksIn(readableInterval45);
        boolean boolean47 = weeks44.isLessThan(weeks46);
        org.joda.time.Weeks weeks49 = weeks46.minus((int) (short) -1);
        org.joda.time.Weeks weeks51 = weeks49.multipliedBy(0);
        org.joda.time.Weeks weeks52 = null;
        boolean boolean53 = weeks49.isLessThan(weeks52);
        int int55 = weeks49.getValue((int) (byte) 0);
        org.joda.time.ReadableInterval readableInterval56 = null;
        org.joda.time.Weeks weeks57 = org.joda.time.Weeks.weeksIn(readableInterval56);
        org.joda.time.Weeks weeks59 = weeks57.multipliedBy((int) (short) 10);
        org.joda.time.Weeks weeks60 = weeks49.minus(weeks59);
        org.joda.time.MutablePeriod mutablePeriod61 = weeks60.toMutablePeriod();
        org.joda.time.Weeks weeks62 = weeks41.plus(weeks60);
        org.joda.time.Weeks weeks63 = weeks9.minus(weeks41);
        java.lang.String str64 = weeks9.toString();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertNotNull(weeks32);
        org.junit.Assert.assertNotNull(weeks34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(weeks36);
        org.junit.Assert.assertNotNull(weeks38);
        org.junit.Assert.assertNotNull(weeks39);
        org.junit.Assert.assertNotNull(durationFieldType40);
        org.junit.Assert.assertNotNull(weeks41);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(weeks44);
        org.junit.Assert.assertNotNull(weeks46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(weeks49);
        org.junit.Assert.assertNotNull(weeks51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(weeks57);
        org.junit.Assert.assertNotNull(weeks59);
        org.junit.Assert.assertNotNull(weeks60);
        org.junit.Assert.assertNotNull(mutablePeriod61);
        org.junit.Assert.assertNotNull(weeks62);
        org.junit.Assert.assertNotNull(weeks63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "P0W" + "'", str64, "P0W");
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) 0, (long) (byte) 10, periodType2, chronology3);
        org.joda.time.Duration duration5 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = duration5.toPeriod(chronology6);
        org.joda.time.Period period8 = period4.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Weeks weeks9 = period8.toStandardWeeks();
        org.joda.time.PeriodType periodType10 = period8.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType12 = periodType10.getFieldType((-32));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period7 = period4.withSeconds((int) ' ');
        org.joda.time.Period period8 = period1.minus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period10 = period1.plusHours((-1));
        org.joda.time.Period period14 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days15 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Period period17 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days18 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Period period20 = period17.withSeconds((int) ' ');
        org.joda.time.Period period21 = period14.minus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType23 = periodType22.withMonthsRemoved();
        org.joda.time.Period period24 = period21.withPeriodType(periodType22);
        org.joda.time.Period period25 = new org.joda.time.Period((long) (short) 0, (-1L), periodType22);
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.millis();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) (short) 1, periodType27, chronology28);
        boolean boolean30 = periodType22.equals((java.lang.Object) chronology28);
        org.joda.time.PeriodType periodType31 = periodType22.withMillisRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period32 = period1.withPeriodType(periodType31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(periodType31);
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = duration0.toPeriod(chronology1);
        org.joda.time.Period period4 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period6 = period4.withHours(32);
        org.joda.time.Period period7 = period4.normalizedStandard();
        java.lang.String str8 = period7.toString();
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period10 = period7.normalizedStandard(periodType9);
        org.joda.time.Period period12 = period7.minusHours(3);
        int int13 = period12.getYears();
        org.joda.time.Period period14 = period2.withFields((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Period period16 = period12.withSeconds((int) (short) -1);
        org.joda.time.Period period18 = period16.withMillis((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = period16.plusSeconds((-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -1 + -2147483648");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT0.052S" + "'", str8, "PT0.052S");
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
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
        int int17 = days7.getDays();
        int int18 = days7.getDays();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        org.joda.time.Period period3 = mutablePeriod2.toPeriod();
        int int4 = period3.size();
        org.joda.time.Period period5 = period3.toPeriod();
        org.joda.time.Period period7 = period5.minusDays((int) (short) -1);
        org.joda.time.Period period9 = period7.minusSeconds(3);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period7.toDurationFrom(readableInstant10);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter2.getPrinter();
        boolean boolean5 = periodFormatter2.isParser();
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType11 = periodType10.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration8, readableInstant9, periodType10);
        int int13 = mutablePeriod12.getWeeks();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((java.lang.Object) mutablePeriod12, chronology14);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer6, (org.joda.time.ReadablePeriod) period15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) ' ');
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Duration duration1 = seconds0.toStandardDuration();
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds4 = duration3.toStandardSeconds();
        java.lang.String str5 = seconds4.toString();
        org.joda.time.Seconds seconds6 = seconds0.minus(seconds4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = seconds6.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT60S" + "'", str5, "PT60S");
        org.junit.Assert.assertNotNull(seconds6);
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.hours();
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((-32), (int) (short) 10, (int) '#', 0, (-2147483648), 4, 8, (int) (short) 100);
        int int11 = mutablePeriod10.getMinutes();
        java.lang.Object obj12 = mutablePeriod10.clone();
        boolean boolean13 = mutablePeriod1.equals(obj12);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "P-32Y10M35WT-2147483648H4M8.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "P-32Y10M35WT-2147483648H4M8.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "P-32Y10M35WT-2147483648H4M8.100S");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType6 = minutes5.getFieldType();
        org.joda.time.PeriodType periodType7 = minutes5.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter2.withParseType(periodType7);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardMinutes((long) 0);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType15 = periodType14.withWeeksRemoved();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = duration13.toPeriod(periodType14, chronology16);
        org.joda.time.ReadableInterval readableInterval18 = null;
        org.joda.time.Weeks weeks19 = org.joda.time.Weeks.weeksIn(readableInterval18);
        org.joda.time.ReadableInterval readableInterval20 = null;
        org.joda.time.Weeks weeks21 = org.joda.time.Weeks.weeksIn(readableInterval20);
        boolean boolean22 = weeks19.isLessThan(weeks21);
        org.joda.time.Weeks weeks24 = weeks21.minus((int) (short) -1);
        org.joda.time.Weeks weeks26 = weeks24.multipliedBy(0);
        org.joda.time.Weeks weeks27 = null;
        boolean boolean28 = weeks24.isLessThan(weeks27);
        int int30 = weeks24.getValue((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Chronology chronology32 = null;
        boolean boolean33 = durationFieldType31.isSupported(chronology32);
        boolean boolean34 = weeks24.isSupported(durationFieldType31);
        org.joda.time.DurationFieldType durationFieldType35 = weeks24.getFieldType();
        boolean boolean36 = periodType14.isSupported(durationFieldType35);
        org.joda.time.PeriodType periodType37 = periodType14.withSecondsRemoved();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration10, readableInstant11, periodType37);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = periodFormatter8.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod38, "PT-1073741824M", 2);
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
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(periodType37);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        org.joda.time.Period period4 = new org.joda.time.Period(0, (int) (byte) 1, (int) (byte) 0, (-1));
        org.joda.time.Period period6 = period4.minusWeeks((-2));
        // The following exception was thrown during execution in test generation
        try {
            int int8 = period4.getValue(60);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 60");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period4 = period2.withHours((int) (byte) 100);
        int int5 = period2.getMinutes();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds(2);
        org.joda.time.Weeks weeks2 = seconds1.toStandardWeeks();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(weeks2);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("PT-1H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (byte) 10);
        org.joda.time.Hours hours2 = period1.toStandardHours();
        org.joda.time.Period period4 = period1.withMillis(4);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
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
        long long11 = duration1.getMillis();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-60000L) + "'", long11 == (-60000L));
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.parse("PT0.052S");
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType4 = periodType3.withMinutesRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withYearsRemoved();
        java.lang.String str6 = periodType5.toString();
        org.joda.time.PeriodType periodType7 = periodType5.withWeeksRemoved();
        org.joda.time.PeriodType periodType8 = periodType5.withMillisRemoved();
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType11 = minutes10.getPeriodType();
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType14);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.weekyears();
        int int17 = period15.get(durationFieldType16);
        boolean boolean18 = periodType11.isSupported(durationFieldType16);
        org.joda.time.PeriodType periodType19 = periodType11.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 3, periodType11);
        boolean boolean21 = periodType5.equals((java.lang.Object) 3);
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2, periodType5);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod25.addYears((int) '4');
        org.joda.time.Chronology chronology29 = null;
        mutablePeriod25.add((long) 100, chronology29);
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds33 = duration32.toStandardSeconds();
        java.lang.String str34 = seconds33.toString();
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.days();
        boolean boolean36 = seconds33.isSupported(durationFieldType35);
        int int37 = mutablePeriod25.get(durationFieldType35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period39 = period22.withFieldAdded(durationFieldType35, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PeriodType[Millis]" + "'", str6, "PeriodType[Millis]");
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PT60S" + "'", str34, "PT60S");
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        org.joda.time.Hours hours0 = org.joda.time.Hours.ONE;
        org.joda.time.Days days1 = hours0.toStandardDays();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType3 = days1.getFieldType(600);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 600");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds7 = duration6.toStandardSeconds();
        org.joda.time.Seconds seconds9 = seconds7.dividedBy(32);
        org.joda.time.PeriodType periodType10 = seconds7.getPeriodType();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) (byte) 10, periodType10, chronology11);
        org.joda.time.DurationFieldType durationFieldType14 = periodType10.getFieldType(0);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(readableInstant2, readableInstant3, periodType10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(durationFieldType14);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) 0, periodType1, chronology2);
        mutablePeriod3.setMonths((int) (byte) 100);
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType8 = periodType6.getFieldType(2);
        int int9 = mutablePeriod3.indexOf(durationFieldType8);
        int int10 = mutablePeriod3.getMinutes();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
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
        org.joda.time.Period period13 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days14 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period13);
        org.joda.time.PeriodType periodType15 = days14.getPeriodType();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(readableInstant16, readableDuration17);
        mutablePeriod18.setHours((int) (short) 100);
        boolean boolean21 = periodType15.equals((java.lang.Object) mutablePeriod18);
        org.joda.time.Duration duration22 = org.joda.time.Duration.ZERO;
        long long23 = duration22.getStandardDays();
        mutablePeriod18.add((org.joda.time.ReadableDuration) duration22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType27 = periodType26.withWeeksRemoved();
        org.joda.time.PeriodType periodType28 = periodType27.withDaysRemoved();
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration22, readableInstant25, periodType27);
        boolean boolean30 = duration2.isEqual((org.joda.time.ReadableDuration) duration22);
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2);
        int int32 = period31.getHours();
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = duration1.toPeriod(periodType2, chronology4);
        org.joda.time.PeriodType periodType6 = periodType2.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(periodType6);
        org.joda.time.format.PeriodPrinter periodPrinter8 = null;
        org.joda.time.format.PeriodParser periodParser9 = null;
        org.joda.time.format.PeriodFormatter periodFormatter10 = new org.joda.time.format.PeriodFormatter(periodPrinter8, periodParser9);
        org.joda.time.format.PeriodParser periodParser11 = periodFormatter10.getParser();
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds14 = duration13.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType15 = seconds14.getFieldType();
        org.joda.time.Seconds seconds17 = seconds14.plus(25);
        org.joda.time.Seconds seconds18 = seconds14.negated();
        org.joda.time.PeriodType periodType19 = seconds18.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter20 = periodFormatter10.withParseType(periodType19);
        boolean boolean21 = periodFormatter10.isParser();
        java.util.Locale locale22 = null;
        org.joda.time.format.PeriodFormatter periodFormatter23 = periodFormatter10.withLocale(locale22);
        boolean boolean24 = periodFormatter10.isPrinter();
        java.util.Locale locale25 = null;
        org.joda.time.format.PeriodFormatter periodFormatter26 = periodFormatter10.withLocale(locale25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = mutablePeriod7.toString(periodFormatter10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNull(periodParser11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodFormatter20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(periodFormatter23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(periodFormatter26);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        org.joda.time.PeriodType periodType6 = periodFormatter5.getParseType();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) (-1), periodType9);
        int int11 = mutablePeriod10.getSeconds();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((int) ' ', (int) (byte) 10, 1, (int) (byte) 10, (int) (short) 100, (int) (short) 100, 52, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        mutablePeriod20.setPeriod(readableInstant21, readableInstant22);
        mutablePeriod10.add((org.joda.time.ReadablePeriod) mutablePeriod20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = periodFormatter5.print((org.joda.time.ReadablePeriod) mutablePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(periodType6);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod2.addYears((int) '4');
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod2.add((long) 100, chronology6);
        mutablePeriod2.setMillis((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        mutablePeriod2.setPeriod(readableInstant10, readableInstant11);
        int int13 = mutablePeriod2.getMillis();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod2.setValue((int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
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
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(readableInstant14, readableDuration15);
        mutablePeriod16.setHours((int) (short) 100);
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology21 = null;
        mutablePeriod16.setPeriod((org.joda.time.ReadableDuration) duration20, chronology21);
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds25 = duration24.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType26 = seconds25.getFieldType();
        mutablePeriod16.add(durationFieldType26, (int) (short) 0);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(readableInstant29, readableDuration30);
        mutablePeriod31.setHours((int) (short) 100);
        org.joda.time.Duration duration35 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology36 = null;
        mutablePeriod31.setPeriod((org.joda.time.ReadableDuration) duration35, chronology36);
        org.joda.time.Chronology chronology38 = null;
        mutablePeriod16.setPeriod((org.joda.time.ReadableDuration) duration35, chronology38);
        org.joda.time.ReadableDuration readableDuration40 = null;
        boolean boolean41 = duration35.isEqual(readableDuration40);
        boolean boolean42 = duration13.isEqual((org.joda.time.ReadableDuration) duration35);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((java.lang.Object) period1);
        org.joda.time.Minutes minutes3 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType4 = minutes3.getPeriodType();
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes6 = minutes3.plus(minutes5);
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes8 = org.joda.time.Minutes.ZERO;
        boolean boolean9 = minutes7.isLessThan(minutes8);
        boolean boolean10 = minutes3.isLessThan(minutes7);
        org.joda.time.DurationFieldType durationFieldType11 = minutes7.getFieldType();
        mutablePeriod2.set(durationFieldType11, (-2147483648));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration14 = new org.joda.time.Duration((java.lang.Object) mutablePeriod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.MutablePeriod");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(durationFieldType11);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableInstant4, readableDuration5);
        mutablePeriod6.setHours((int) (short) 100);
        boolean boolean9 = periodType3.equals((java.lang.Object) mutablePeriod6);
        org.joda.time.Duration duration10 = org.joda.time.Duration.ZERO;
        long long11 = duration10.getStandardDays();
        mutablePeriod6.add((org.joda.time.ReadableDuration) duration10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType15 = periodType14.withWeeksRemoved();
        org.joda.time.PeriodType periodType16 = periodType15.withDaysRemoved();
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration10, readableInstant13, periodType15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = period17.plusHours(40);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        int int2 = minutes0.getMinutes();
        java.lang.String str3 = minutes0.toString();
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType5 = minutes4.getFieldType();
        java.lang.String str6 = minutes4.toString();
        boolean boolean7 = minutes0.isLessThan(minutes4);
        org.joda.time.Minutes minutes8 = minutes0.negated();
        org.joda.time.DurationFieldType durationFieldType9 = minutes0.getFieldType();
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.Minutes minutes11 = org.joda.time.Minutes.minutesIn(readableInterval10);
        java.lang.String str12 = minutes11.toString();
        boolean boolean13 = minutes0.isLessThan(minutes11);
        org.joda.time.Minutes minutes14 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) minutes11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType16 = minutes11.getFieldType((-32));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0M" + "'", str3, "PT0M");
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT-2147483648M" + "'", str6, "PT-2147483648M");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT0M" + "'", str12, "PT0M");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(minutes14);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.THREE;
        org.joda.time.Minutes minutes2 = minutes0.multipliedBy((int) ' ');
        java.lang.String str3 = minutes0.toString();
        org.joda.time.Minutes minutes5 = minutes0.dividedBy((int) (byte) 10);
        java.lang.Class<?> wildcardClass6 = minutes5.getClass();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT3M" + "'", str3, "PT3M");
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 25);
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) mutablePeriod1);
        org.joda.time.Days days3 = minutes2.toStandardDays();
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(days3);
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period6 = period3.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period8 = period6.normalizedStandard(periodType7);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType7);
        org.joda.time.DurationFieldType[] durationFieldTypeArray10 = mutablePeriod9.getFieldTypes();
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod9.copy();
        mutablePeriod9.add((long) (short) 1);
        java.lang.Object obj14 = mutablePeriod9.clone();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = mutablePeriod9.getValue((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(durationFieldTypeArray10);
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "PT0.001S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "PT0.001S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "PT0.001S");
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) (short) 100);
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("PT1H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration1.toPeriodTo(readableInstant3);
        org.joda.time.Duration duration5 = period4.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableInstant10, readableDuration11);
        mutablePeriod12.setPeriod((long) ' ', (long) 52);
        mutablePeriod12.addDays(100);
        org.joda.time.PeriodType periodType18 = mutablePeriod12.getPeriodType();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(10L, (long) 13, periodType18, chronology19);
        org.joda.time.Period period21 = new org.joda.time.Period(540000L, (long) (short) 100, periodType18);
        org.joda.time.PeriodType periodType22 = periodType18.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((java.lang.Object) duration5, periodType18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType25 = periodType18.getFieldType(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod15 = org.joda.time.MutablePeriod.parse("PT3M", periodFormatter3);
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
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        java.util.Locale locale6 = periodFormatter2.getLocale();
        java.util.Locale locale7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter2.withLocale(locale7);
        org.joda.time.format.PeriodPrinter periodPrinter9 = periodFormatter2.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod11 = periodFormatter2.parseMutablePeriod("P8M");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNull(periodPrinter9);
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) 0, (long) (byte) 10, periodType2, chronology3);
        org.joda.time.Duration duration5 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = duration5.toPeriod(chronology6);
        org.joda.time.Period period8 = period4.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Hours hours9 = period7.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType10 = hours9.getFieldType();
        org.joda.time.Seconds seconds11 = org.joda.time.Seconds.MAX_VALUE;
        org.joda.time.PeriodType periodType12 = seconds11.getPeriodType();
        int int13 = seconds11.getSeconds();
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds16 = duration15.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType17 = seconds16.getFieldType();
        org.joda.time.Seconds seconds19 = seconds16.dividedBy(3);
        org.joda.time.Seconds seconds20 = seconds11.minus(seconds19);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = hours9.compareTo((org.joda.time.base.BaseSingleFieldPeriod) seconds19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Hours cannot be compared to class org.joda.time.Seconds");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(seconds20);
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
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
        org.joda.time.Chronology chronology18 = null;
        mutablePeriod16.add(8L, chronology18);
        org.joda.time.format.PeriodPrinter periodPrinter20 = null;
        org.joda.time.format.PeriodParser periodParser21 = null;
        org.joda.time.format.PeriodFormatter periodFormatter22 = new org.joda.time.format.PeriodFormatter(periodPrinter20, periodParser21);
        org.joda.time.format.PeriodParser periodParser23 = periodFormatter22.getParser();
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds26 = duration25.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType27 = seconds26.getFieldType();
        org.joda.time.Seconds seconds29 = seconds26.plus(25);
        org.joda.time.Seconds seconds30 = seconds26.negated();
        org.joda.time.PeriodType periodType31 = seconds30.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter32 = periodFormatter22.withParseType(periodType31);
        org.joda.time.format.PeriodPrinter periodPrinter33 = periodFormatter32.getPrinter();
        org.joda.time.format.PeriodParser periodParser34 = periodFormatter32.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter35 = periodFormatter32.getPrinter();
        boolean boolean36 = periodFormatter32.isParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = mutablePeriod16.toString(periodFormatter32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNull(periodParser23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(periodFormatter32);
        org.junit.Assert.assertNull(periodPrinter33);
        org.junit.Assert.assertNull(periodParser34);
        org.junit.Assert.assertNull(periodPrinter35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType6 = seconds5.getFieldType();
        mutablePeriod2.add(durationFieldType6, 52);
        org.joda.time.ReadableInterval readableInterval9 = null;
        mutablePeriod2.add(readableInterval9);
        mutablePeriod2.setYears(0);
        mutablePeriod2.addMonths((int) 'a');
        java.lang.String str15 = mutablePeriod2.toString();
        java.lang.Object obj16 = null;
        boolean boolean17 = mutablePeriod2.equals(obj16);
        int int18 = mutablePeriod2.getWeeks();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P97MT52S" + "'", str15, "P97MT52S");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
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
        org.joda.time.Minutes minutes13 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes14 = org.joda.time.Minutes.ZERO;
        boolean boolean15 = minutes13.isLessThan(minutes14);
        org.joda.time.Minutes minutes17 = minutes14.multipliedBy((int) (short) 10);
        org.joda.time.Minutes minutes18 = minutes3.plus(minutes17);
        org.joda.time.Minutes minutes20 = minutes3.plus(2147483647);
        org.joda.time.Days days21 = org.joda.time.Days.ZERO;
        org.joda.time.Weeks weeks22 = days21.toStandardWeeks();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = minutes20.compareTo((org.joda.time.base.BaseSingleFieldPeriod) weeks22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Minutes cannot be compared to class org.joda.time.Weeks");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(weeks22);
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '4', chronology1);
        mutablePeriod2.setHours((int) (byte) 1);
        mutablePeriod2.setPeriod((long) (short) 100, (long) '4');
        org.joda.time.MutablePeriod mutablePeriod8 = mutablePeriod2.copy();
        mutablePeriod2.setPeriod((long) 25);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = mutablePeriod2.toDurationFrom(readableInstant11);
        mutablePeriod2.addMonths((-672));
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(duration12);
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        org.joda.time.PeriodType periodType10 = periodType8.withYearsRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withDaysRemoved();
        org.joda.time.PeriodType periodType12 = periodType10.withWeeksRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((-32), (-2147483648), (int) '4', 0, (int) (byte) 10, (int) (short) 1, (-2147483648), 0, periodType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        org.joda.time.Minutes minutes8 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.ZERO;
        boolean boolean10 = minutes8.isLessThan(minutes9);
        org.joda.time.Minutes minutes11 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType12 = minutes11.getPeriodType();
        int int13 = minutes11.getMinutes();
        java.lang.String str14 = minutes11.toString();
        org.joda.time.Minutes minutes15 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType16 = minutes15.getFieldType();
        java.lang.String str17 = minutes15.toString();
        boolean boolean18 = minutes11.isLessThan(minutes15);
        org.joda.time.Minutes minutes20 = minutes15.minus(0);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 25);
        org.joda.time.Minutes minutes23 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) mutablePeriod22);
        boolean boolean24 = minutes15.isGreaterThan(minutes23);
        org.joda.time.Minutes minutes25 = minutes8.minus(minutes23);
        org.joda.time.PeriodType periodType26 = minutes23.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((-2), 25, (-1073741824), 1, (int) (byte) -1, 25, (-60), (int) (short) 10, periodType26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT0M" + "'", str14, "PT0M");
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT-2147483648M" + "'", str17, "PT-2147483648M");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(periodType26);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks2 = weeks0.dividedBy(52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes3 = weeks2.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -41297762 * 10080");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.millis();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) (short) 1, periodType9, chronology10);
        org.joda.time.PeriodType periodType12 = mutablePeriod11.getPeriodType();
        org.joda.time.PeriodType periodType13 = periodType12.withMillisRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(6, (-32), 13, 40, 60, (-8), 25, (-60), periodType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks2 = weeks0.dividedBy(52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks4 = weeks2.multipliedBy((-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -41297762 * -2147483648");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        org.joda.time.Period period0 = new org.joda.time.Period();
        boolean boolean2 = period0.equals((java.lang.Object) "PT0.052S");
        int int3 = period0.getMonths();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod2.addYears((int) '4');
        mutablePeriod2.addDays((int) (byte) 100);
        org.joda.time.Period period8 = org.joda.time.Period.hours(0);
        org.joda.time.DurationFieldType durationFieldType10 = period8.getFieldType((int) (short) 1);
        org.joda.time.Period period12 = period8.plusDays(10);
        mutablePeriod2.setPeriod((org.joda.time.ReadablePeriod) period8);
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType16 = periodType15.withDaysRemoved();
        org.joda.time.Period period17 = new org.joda.time.Period((-60L), periodType16);
        org.joda.time.Duration duration18 = org.joda.time.Duration.ZERO;
        long long19 = duration18.getStandardDays();
        org.joda.time.Hours hours20 = duration18.toStandardHours();
        org.joda.time.PeriodType periodType21 = hours20.getPeriodType();
        int int23 = hours20.getValue(0);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.weekyears();
        java.lang.String str25 = durationFieldType24.getName();
        java.lang.String str26 = durationFieldType24.getName();
        java.lang.String str27 = durationFieldType24.toString();
        boolean boolean28 = hours20.isSupported(durationFieldType24);
        boolean boolean29 = period17.isSupported(durationFieldType24);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod2.add(durationFieldType24, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weekyears'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "weekyears" + "'", str25, "weekyears");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "weekyears" + "'", str26, "weekyears");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "weekyears" + "'", str27, "weekyears");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds10 = duration9.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType11 = seconds10.getFieldType();
        org.joda.time.Seconds seconds13 = seconds10.plus(25);
        org.joda.time.Seconds seconds14 = seconds10.negated();
        org.joda.time.PeriodType periodType15 = seconds14.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = new org.joda.time.Period(32, 3, 0, 54, 7, (int) '#', (-8), 600, periodType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Period period7 = duration1.toPeriod();
        org.joda.time.Period period8 = period7.negated();
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds11 = duration10.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType12 = seconds11.getFieldType();
        org.joda.time.Seconds seconds14 = seconds11.plus(25);
        org.joda.time.Seconds seconds15 = seconds11.negated();
        org.joda.time.Seconds seconds17 = seconds11.dividedBy(10);
        org.joda.time.Period period18 = period7.plus((org.joda.time.ReadablePeriod) seconds17);
        int int19 = period18.getWeeks();
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period23 = org.joda.time.Period.hours(0);
        org.joda.time.DurationFieldType durationFieldType25 = period23.getFieldType((int) (short) 1);
        org.joda.time.Period period27 = period23.plusDays(10);
        boolean boolean28 = periodType21.equals((java.lang.Object) 10);
        org.joda.time.Period period29 = new org.joda.time.Period((long) ' ', periodType21);
        org.joda.time.PeriodType periodType30 = periodType21.withDaysRemoved();
        org.joda.time.Period period31 = period18.normalizedStandard(periodType30);
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.Weeks weeks33 = org.joda.time.Weeks.weeksIn(readableInterval32);
        org.joda.time.ReadableInterval readableInterval34 = null;
        org.joda.time.Weeks weeks35 = org.joda.time.Weeks.weeksIn(readableInterval34);
        boolean boolean36 = weeks33.isLessThan(weeks35);
        org.joda.time.Weeks weeks37 = weeks33.negated();
        org.joda.time.Weeks weeks39 = weeks37.minus((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType40 = weeks39.getFieldType();
        org.joda.time.Chronology chronology41 = null;
        boolean boolean42 = durationFieldType40.isSupported(chronology41);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period44 = period31.withFieldAdded(durationFieldType40, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertNotNull(weeks35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(weeks37);
        org.junit.Assert.assertNotNull(weeks39);
        org.junit.Assert.assertNotNull(durationFieldType40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.format.PeriodParser periodParser4 = periodFormatter3.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter5 = periodFormatter3.getPrinter();
        java.util.Locale locale6 = null;
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter3.withLocale(locale6);
        java.util.Locale locale8 = null;
        org.joda.time.format.PeriodFormatter periodFormatter9 = periodFormatter7.withLocale(locale8);
        java.util.Locale locale10 = null;
        org.joda.time.format.PeriodFormatter periodFormatter11 = periodFormatter9.withLocale(locale10);
        java.util.Locale locale12 = null;
        org.joda.time.format.PeriodFormatter periodFormatter13 = periodFormatter11.withLocale(locale12);
        org.joda.time.Minutes minutes14 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType15 = minutes14.getPeriodType();
        org.joda.time.Minutes minutes16 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes17 = minutes14.plus(minutes16);
        org.joda.time.Minutes minutes18 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes19 = org.joda.time.Minutes.ZERO;
        boolean boolean20 = minutes18.isLessThan(minutes19);
        boolean boolean21 = minutes14.isLessThan(minutes18);
        org.joda.time.Minutes minutes23 = minutes18.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes24 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType25 = minutes24.getFieldType();
        org.joda.time.PeriodType periodType26 = minutes24.getPeriodType();
        org.joda.time.Minutes minutes27 = minutes23.plus(minutes24);
        org.joda.time.PeriodType periodType28 = minutes23.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter29 = periodFormatter11.withParseType(periodType28);
        java.util.Locale locale30 = null;
        org.joda.time.format.PeriodFormatter periodFormatter31 = periodFormatter11.withLocale(locale30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod32 = org.joda.time.MutablePeriod.parse("PT480S", periodFormatter31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser4);
        org.junit.Assert.assertNull(periodPrinter5);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNotNull(periodFormatter9);
        org.junit.Assert.assertNotNull(periodFormatter11);
        org.junit.Assert.assertNotNull(periodFormatter13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodFormatter29);
        org.junit.Assert.assertNotNull(periodFormatter31);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod6 = periodFormatter2.parseMutablePeriod("PT2S");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        java.util.Locale locale6 = periodFormatter2.getLocale();
        java.util.Locale locale7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter2.withLocale(locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = periodFormatter2.parsePeriod("P3W");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(periodFormatter8);
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("seconds");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"seconds\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        int int2 = minutes0.getMinutes();
        java.lang.String str3 = minutes0.toString();
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType5 = minutes4.getFieldType();
        java.lang.String str6 = minutes4.toString();
        boolean boolean7 = minutes0.isLessThan(minutes4);
        org.joda.time.Minutes minutes9 = minutes4.minus(0);
        org.joda.time.Minutes minutes11 = minutes9.dividedBy(2);
        org.joda.time.PeriodType periodType12 = minutes11.getPeriodType();
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
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType3 = periodType2.withMinutesRemoved();
        org.joda.time.PeriodType periodType4 = periodType2.withYearsRemoved();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = duration6.toPeriod(periodType7, chronology9);
        org.joda.time.Days days11 = org.joda.time.Days.ZERO;
        int int12 = days11.getDays();
        org.joda.time.Period period14 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days15 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Period period17 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days18 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period17);
        org.joda.time.PeriodType periodType19 = days18.getPeriodType();
        boolean boolean20 = days15.isGreaterThan(days18);
        org.joda.time.Period period22 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days23 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Days days24 = days18.minus(days23);
        org.joda.time.Days days25 = days11.minus(days18);
        boolean boolean26 = duration6.equals((java.lang.Object) days18);
        org.joda.time.DurationFieldType durationFieldType27 = days18.getFieldType();
        boolean boolean28 = periodType2.isSupported(durationFieldType27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period29 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType7 = seconds6.getFieldType();
        org.joda.time.Seconds seconds9 = seconds6.plus(25);
        org.joda.time.Seconds seconds10 = seconds6.negated();
        org.joda.time.PeriodType periodType11 = seconds10.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter12 = periodFormatter2.withParseType(periodType11);
        org.joda.time.format.PeriodPrinter periodPrinter13 = periodFormatter12.getPrinter();
        org.joda.time.format.PeriodParser periodParser14 = periodFormatter12.getParser();
        boolean boolean15 = periodFormatter12.isPrinter();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) (short) 0, 52, (int) (short) -1, 52, (-1), (int) ' ', (int) '4', 8);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod24);
        java.lang.Object obj26 = mutablePeriod25.clone();
        // The following exception was thrown during execution in test generation
        try {
            int int29 = periodFormatter12.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod25, "PT0H", 8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodFormatter12);
        org.junit.Assert.assertNull(periodPrinter13);
        org.junit.Assert.assertNull(periodParser14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "P52M-1W52DT-1H32M52.008S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "P52M-1W52DT-1H32M52.008S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "P52M-1W52DT-1H32M52.008S");
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(readableInstant6, readableDuration7);
        mutablePeriod8.setPeriod((long) ' ', (long) 52);
        mutablePeriod8.addDays(100);
        org.joda.time.PeriodType periodType14 = mutablePeriod8.getPeriodType();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(10L, (long) 13, periodType14, chronology15);
        org.joda.time.Period period17 = new org.joda.time.Period(540000L, (long) (short) 100, periodType14);
        org.joda.time.PeriodType periodType18 = periodType14.withYearsRemoved();
        org.joda.time.PeriodType periodType19 = periodType18.withDaysRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT-2147483648M");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant7, periodType8);
        org.joda.time.Duration duration11 = period10.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = period10.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(duration11);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        long long1 = duration0.getStandardDays();
        org.joda.time.Hours hours2 = duration0.toStandardHours();
        org.joda.time.PeriodType periodType3 = hours2.getPeriodType();
        int int5 = hours2.getValue(0);
        org.joda.time.Days days6 = hours2.toStandardDays();
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(days6);
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        long long1 = duration0.getStandardDays();
        org.joda.time.Hours hours2 = duration0.toStandardHours();
        org.joda.time.Duration duration4 = duration0.withMillis(0L);
        org.joda.time.Duration duration5 = duration0.toDuration();
        long long6 = duration5.getStandardDays();
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType7 = seconds6.getFieldType();
        org.joda.time.Seconds seconds9 = seconds6.plus(25);
        org.joda.time.Seconds seconds10 = seconds6.negated();
        org.joda.time.PeriodType periodType11 = seconds10.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter12 = periodFormatter2.withParseType(periodType11);
        org.joda.time.format.PeriodPrinter periodPrinter13 = periodFormatter12.getPrinter();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(readableInstant15, readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds21 = duration20.toStandardSeconds();
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds24 = duration23.toStandardSeconds();
        boolean boolean25 = duration20.isLongerThan((org.joda.time.ReadableDuration) duration23);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType28 = periodType27.withMinutesRemoved();
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration23, readableInstant26, periodType27);
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant18, (org.joda.time.ReadableDuration) duration23);
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period32 = duration23.toPeriod(periodType31);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(readableInstant14, (org.joda.time.ReadableDuration) duration17, periodType31);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = periodFormatter12.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod33, "PT0.033S", (-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodFormatter12);
        org.junit.Assert.assertNull(periodPrinter13);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(period32);
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        org.joda.time.MutablePeriod mutablePeriod8 = days2.toMutablePeriod();
        int int9 = mutablePeriod8.getMonths();
        mutablePeriod8.addMillis((-2147483648));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        java.lang.Object obj2 = null;
        org.joda.time.Duration duration3 = new org.joda.time.Duration(obj2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType9 = periodType8.withWeeksRemoved();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = duration7.toPeriod(periodType8, chronology10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType14 = periodType13.withMonthsRemoved();
        org.joda.time.Period period15 = duration7.toPeriodTo(readableInstant12, periodType14);
        org.joda.time.Period period16 = duration7.toPeriod();
        org.joda.time.Duration duration17 = duration3.plus((org.joda.time.ReadableDuration) duration7);
        org.joda.time.Duration duration18 = duration3.toDuration();
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.hours();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(periodType19);
        org.joda.time.PeriodType periodType21 = periodType19.withMinutesRemoved();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = duration3.toPeriod(periodType19, chronology22);
        int int24 = period23.getMillis();
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
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
        mutablePeriod4.setPeriod(10, (-672), 8, (int) (short) 0, (int) '4', (int) ' ', (int) (byte) 10, 52);
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
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
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
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = duration4.toPeriodTo(readableInstant19);
        int int21 = period20.getYears();
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
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("PeriodType[Millis]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[Millis]\" is malformed at \"eriodType[Millis]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        org.joda.time.Hours hours0 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours1 = hours0.negated();
        org.joda.time.Hours hours2 = org.joda.time.Hours.ONE;
        boolean boolean3 = hours1.isLessThan(hours2);
        org.joda.time.DurationFieldType durationFieldType4 = hours1.getFieldType();
        org.joda.time.Period period6 = org.joda.time.Period.millis((int) (short) 1);
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.Seconds seconds8 = org.joda.time.Seconds.secondsIn(readableInterval7);
        int int9 = seconds8.getSeconds();
        org.joda.time.PeriodType periodType10 = seconds8.getPeriodType();
        org.joda.time.Period period11 = period6.normalizedStandard(periodType10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((java.lang.Object) hours1, periodType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType3 = minutes2.getPeriodType();
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes5 = minutes2.plus(minutes4);
        org.joda.time.Minutes minutes6 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.ZERO;
        boolean boolean8 = minutes6.isLessThan(minutes7);
        boolean boolean9 = minutes2.isLessThan(minutes6);
        org.joda.time.Minutes minutes11 = minutes6.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes12 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType13 = minutes12.getFieldType();
        org.joda.time.PeriodType periodType14 = minutes12.getPeriodType();
        org.joda.time.Minutes minutes15 = minutes11.plus(minutes12);
        org.joda.time.PeriodType periodType16 = minutes11.getPeriodType();
        org.joda.time.PeriodType periodType17 = minutes11.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period18 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds(100);
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.DurationFieldType durationFieldType3 = seconds2.getFieldType();
        boolean boolean4 = seconds1.isGreaterThan(seconds2);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod7.addYears((int) '4');
        org.joda.time.Chronology chronology11 = null;
        mutablePeriod7.add((long) 100, chronology11);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds15 = duration14.toStandardSeconds();
        java.lang.String str16 = seconds15.toString();
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.days();
        boolean boolean18 = seconds15.isSupported(durationFieldType17);
        int int19 = mutablePeriod7.get(durationFieldType17);
        boolean boolean20 = seconds2.isSupported(durationFieldType17);
        org.joda.time.Hours hours21 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours23 = hours21.minus((int) (byte) 10);
        org.joda.time.PeriodType periodType24 = hours21.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((java.lang.Object) seconds2, periodType24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PT60S" + "'", str16, "PT60S");
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(periodType24);
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("weekyears");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"weekyears\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = period1.withSeconds((int) ' ');
        org.joda.time.Period period6 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days7 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period6);
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(readableInstant9, readableDuration10);
        mutablePeriod11.setHours((int) (short) 100);
        boolean boolean14 = periodType8.equals((java.lang.Object) mutablePeriod11);
        org.joda.time.PeriodType periodType15 = periodType8.withYearsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = period4.withPeriodType(periodType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.format.PeriodParser periodParser4 = periodFormatter3.getParser();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter3.withLocale(locale5);
        boolean boolean7 = periodFormatter3.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod8 = org.joda.time.MutablePeriod.parse("P-1D", periodFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser4);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds3 = duration2.toStandardSeconds();
        java.lang.String str4 = seconds3.toString();
        org.joda.time.PeriodType periodType5 = seconds3.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withDaysRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 52, periodType8, chronology9);
        int int11 = mutablePeriod10.getMonths();
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT60S" + "'", str4, "PT60S");
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        org.joda.time.Hours hours0 = org.joda.time.Hours.SIX;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.Minutes minutes2 = hours0.toStandardMinutes();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(minutes2);
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds3 = duration2.toStandardSeconds();
        java.lang.String str4 = seconds3.toString();
        org.joda.time.PeriodType periodType5 = seconds3.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withDaysRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.PeriodType periodType9 = periodType7.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 2, periodType7);
        mutablePeriod10.setPeriod(0L, (long) (byte) 1);
        mutablePeriod10.setPeriod((long) (short) 10, (long) 2147483647);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(readableInstant19, readableDuration20);
        mutablePeriod21.setHours((int) (short) 100);
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology26 = null;
        mutablePeriod21.setPeriod((org.joda.time.ReadableDuration) duration25, chronology26);
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType29 = periodType28.withWeeksRemoved();
        org.joda.time.PeriodType periodType30 = periodType29.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(readableInstant18, (org.joda.time.ReadableDuration) duration25, periodType29);
        org.joda.time.Duration duration33 = duration25.withMillis((long) 10);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(readableInstant17, (org.joda.time.ReadableDuration) duration25);
        org.joda.time.Duration duration36 = duration25.minus(100L);
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration25);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT60S" + "'", str4, "PT60S");
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(duration36);
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        org.joda.time.Period period1 = org.joda.time.Period.days(2147483647);
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds4 = duration3.toStandardSeconds();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds7 = duration6.toStandardSeconds();
        boolean boolean8 = duration3.isLongerThan((org.joda.time.ReadableDuration) duration6);
        org.joda.time.Period period9 = duration3.toPeriod();
        org.joda.time.Period period10 = period9.negated();
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds13 = duration12.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType14 = seconds13.getFieldType();
        org.joda.time.Seconds seconds16 = seconds13.plus(25);
        org.joda.time.Seconds seconds17 = seconds13.negated();
        org.joda.time.Seconds seconds19 = seconds13.dividedBy(10);
        org.joda.time.Period period20 = period9.plus((org.joda.time.ReadablePeriod) seconds19);
        int int21 = period20.getWeeks();
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period25 = org.joda.time.Period.hours(0);
        org.joda.time.DurationFieldType durationFieldType27 = period25.getFieldType((int) (short) 1);
        org.joda.time.Period period29 = period25.plusDays(10);
        boolean boolean30 = periodType23.equals((java.lang.Object) 10);
        org.joda.time.Period period31 = new org.joda.time.Period((long) ' ', periodType23);
        org.joda.time.PeriodType periodType32 = periodType23.withDaysRemoved();
        org.joda.time.Period period33 = period20.normalizedStandard(periodType32);
        org.joda.time.Duration duration35 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.Period period36 = duration35.toPeriod();
        org.joda.time.Period period37 = period36.toPeriod();
        org.joda.time.Period period39 = period36.withWeeks(0);
        boolean boolean40 = periodType32.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period42 = new org.joda.time.Period((java.lang.Object) period1, periodType32, chronology41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod2.addYears((int) '4');
        mutablePeriod2.addDays((int) (byte) 100);
        org.joda.time.Period period8 = org.joda.time.Period.hours(0);
        org.joda.time.DurationFieldType durationFieldType10 = period8.getFieldType((int) (short) 1);
        org.joda.time.Period period12 = period8.plusDays(10);
        mutablePeriod2.setPeriod((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType18 = periodType17.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration15, readableInstant16, periodType17);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        mutablePeriod19.setPeriod(readableInstant20, readableInstant21);
        org.joda.time.Duration duration23 = new org.joda.time.Duration((java.lang.Object) readableInstant21);
        boolean boolean24 = mutablePeriod2.equals((java.lang.Object) readableInstant21);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 25);
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) mutablePeriod1);
        org.joda.time.Minutes minutes4 = minutes2.minus((int) '4');
        java.lang.String str5 = minutes2.toString();
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT0M" + "'", str5, "PT0M");
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(0L);
        mutablePeriod1.addMinutes(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType5 = mutablePeriod1.getFieldType((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) '4', 9L, chronology2);
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.PeriodType periodType3 = periodFormatter2.getParseType();
        java.io.Writer writer4 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = org.joda.time.MutablePeriod.parse("PT1M");
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer4, (org.joda.time.ReadablePeriod) mutablePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodType3);
        org.junit.Assert.assertNotNull(mutablePeriod6);
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        org.joda.time.Hours hours0 = org.joda.time.Hours.ONE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = hours0.getValue(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 2147483647");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType3 = minutes2.getPeriodType();
        org.joda.time.PeriodType periodType4 = periodType3.withMinutesRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withSecondsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = duration1.toPeriod(periodType2, chronology4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType8 = periodType7.withMonthsRemoved();
        org.joda.time.Period period9 = duration1.toPeriodTo(readableInstant6, periodType8);
        org.joda.time.Duration duration10 = duration1.toDuration();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration10, readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        java.lang.Object obj15 = null;
        org.joda.time.Duration duration16 = new org.joda.time.Duration(obj15);
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, (org.joda.time.ReadableDuration) duration16);
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant13, (org.joda.time.ReadableDuration) duration16);
        org.joda.time.Duration duration19 = duration16.toDuration();
        int int20 = duration10.compareTo((org.joda.time.ReadableDuration) duration19);
        org.joda.time.Hours hours21 = duration19.toStandardHours();
        org.joda.time.Days days22 = hours21.toStandardDays();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(days22);
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (short) -1, (int) '#', (int) ' ', 100);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.days();
        int int6 = mutablePeriod4.get(durationFieldType5);
        org.joda.time.Hours hours7 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Hours hours9 = hours7.dividedBy((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableInstant10, readableDuration11);
        org.joda.time.Period period13 = mutablePeriod12.toPeriod();
        org.joda.time.Period period15 = period13.withHours(0);
        org.joda.time.Hours hours16 = period15.toStandardHours();
        org.joda.time.Hours hours17 = hours9.minus(hours16);
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType21 = periodType20.withWeeksRemoved();
        org.joda.time.PeriodType periodType22 = periodType21.withDaysRemoved();
        org.joda.time.Period period23 = new org.joda.time.Period((long) 'a', (long) (short) 0, periodType22);
        org.joda.time.Hours hours24 = period23.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType25 = hours24.getFieldType();
        boolean boolean26 = hours16.isLessThan(hours24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours28 = hours24.dividedBy(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(hours24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds3 = duration2.toStandardSeconds();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        boolean boolean7 = duration2.isLongerThan((org.joda.time.ReadableDuration) duration5);
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds10 = duration9.toStandardSeconds();
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds13 = duration12.toStandardSeconds();
        boolean boolean14 = duration9.isLongerThan((org.joda.time.ReadableDuration) duration12);
        org.joda.time.Period period15 = duration9.toPeriod();
        boolean boolean16 = duration5.isLongerThan((org.joda.time.ReadableDuration) duration9);
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds19 = duration18.toStandardSeconds();
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = duration18.toPeriodTo(readableInstant20);
        org.joda.time.Duration duration22 = period21.toStandardDuration();
        org.joda.time.Period period23 = duration22.toPeriod();
        org.joda.time.Duration duration24 = duration9.minus((org.joda.time.ReadableDuration) duration22);
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType27);
        int int29 = period28.getMillis();
        org.joda.time.Period period31 = period28.plusDays((int) 'a');
        org.joda.time.Duration duration33 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds34 = duration33.toStandardSeconds();
        java.lang.String str35 = seconds34.toString();
        org.joda.time.PeriodType periodType36 = seconds34.getPeriodType();
        org.joda.time.PeriodType periodType37 = periodType36.withSecondsRemoved();
        org.joda.time.PeriodType periodType38 = periodType37.withDaysRemoved();
        org.joda.time.Period period39 = period31.normalizedStandard(periodType38);
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration9, periodType38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period42 = period40.withMonths((-32));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 25 + "'", int29 == 25);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PT60S" + "'", str35, "PT60S");
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(period39);
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableInstant4, readableDuration5);
        mutablePeriod6.setHours((int) (short) 100);
        boolean boolean9 = periodType3.equals((java.lang.Object) mutablePeriod6);
        org.joda.time.PeriodType periodType10 = periodType3.withYearsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType12 = periodType10.getFieldType(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) (-1));
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period6 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days7 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period9 = period6.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period11 = period9.normalizedStandard(periodType10);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableInstant3, readableInstant4, periodType10);
        org.joda.time.PeriodType periodType13 = periodType10.withYearsRemoved();
        org.joda.time.Period period14 = duration1.toPeriodTo(readableInstant2, periodType13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = duration1.toPeriodFrom(readableInstant15);
        org.joda.time.Duration duration18 = duration1.withMillis((long) ' ');
        org.joda.time.Duration duration20 = duration1.minus(9L);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration20);
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT1M0.100S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours2 = hours0.minus(0);
        org.joda.time.Hours hours3 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours5 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean6 = hours3.isGreaterThan(hours5);
        boolean boolean7 = hours2.isLessThan(hours5);
        org.joda.time.Hours hours8 = hours2.negated();
        org.joda.time.Hours hours10 = hours2.plus((int) ' ');
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(hours10);
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.format.PeriodParser periodParser4 = periodFormatter3.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter5 = periodFormatter3.getPrinter();
        java.util.Locale locale6 = null;
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter3.withLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = org.joda.time.Period.parse("Minutes", periodFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser4);
        org.junit.Assert.assertNull(periodPrinter5);
        org.junit.Assert.assertNotNull(periodFormatter7);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) 0, 52, (int) (short) -1, 52, (-1), (int) ' ', (int) '4', 8);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod8);
        org.joda.time.Chronology chronology12 = null;
        mutablePeriod9.setPeriod(1L, (long) (short) 10, chronology12);
        java.lang.Class<?> wildcardClass14 = mutablePeriod9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant7, periodType8);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(readableInstant11, readableDuration12);
        mutablePeriod13.setHours((int) (short) 100);
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology18 = null;
        mutablePeriod13.setPeriod((org.joda.time.ReadableDuration) duration17, chronology18);
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds22 = duration21.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType23 = seconds22.getFieldType();
        mutablePeriod13.add(durationFieldType23, (int) (short) 0);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(readableInstant26, readableDuration27);
        mutablePeriod28.setHours((int) (short) 100);
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology33 = null;
        mutablePeriod28.setPeriod((org.joda.time.ReadableDuration) duration32, chronology33);
        org.joda.time.Chronology chronology35 = null;
        mutablePeriod13.setPeriod((org.joda.time.ReadableDuration) duration32, chronology35);
        int int37 = duration4.compareTo((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Duration duration38 = duration32.toDuration();
        org.joda.time.Duration duration39 = duration38.toDuration();
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration38, readableInstant40);
        org.joda.time.Duration duration43 = duration38.minus((long) (-1));
        org.joda.time.PeriodType periodType45 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType46 = periodType45.withDaysRemoved();
        org.joda.time.Period period47 = new org.joda.time.Period((-60L), periodType46);
        boolean boolean48 = duration43.equals((java.lang.Object) period47);
        org.joda.time.Duration duration50 = org.joda.time.Duration.standardMinutes((long) 10);
        java.lang.String str51 = duration50.toString();
        boolean boolean53 = duration50.equals((java.lang.Object) 100.0d);
        org.joda.time.Duration duration55 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds56 = duration55.toStandardSeconds();
        org.joda.time.Duration duration58 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds59 = duration58.toStandardSeconds();
        boolean boolean60 = duration55.isLongerThan((org.joda.time.ReadableDuration) duration58);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Interval interval62 = duration58.toIntervalTo(readableInstant61);
        org.joda.time.Seconds seconds63 = duration58.toStandardSeconds();
        boolean boolean64 = duration50.isShorterThan((org.joda.time.ReadableDuration) duration58);
        boolean boolean65 = duration43.isLongerThan((org.joda.time.ReadableDuration) duration58);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "PT600S" + "'", str51, "PT600S");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(seconds56);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(seconds59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertNotNull(seconds63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("P-1D");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"P-1D\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis((long) 25);
        org.joda.time.Duration duration2 = duration1.toDuration();
        org.joda.time.ReadableDuration readableDuration3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = duration1.compareTo(readableDuration3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration2);
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.PeriodType periodType5 = periodFormatter2.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod7 = periodFormatter2.parseMutablePeriod("PT480S");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNull(periodType5);
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period5 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Period period8 = period5.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period10 = period8.normalizedStandard(periodType9);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(readableInstant2, readableInstant3, periodType9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(600L, (long) (short) -1, periodType9, chronology12);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod13.addWeeks((-672));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 4, 600L);
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((-1L));
        mutablePeriod1.addSeconds(100);
        java.lang.Object obj4 = null;
        org.joda.time.Duration duration5 = new org.joda.time.Duration(obj4);
        org.joda.time.Duration duration6 = duration5.toDuration();
        mutablePeriod1.add((org.joda.time.ReadableDuration) duration6);
        org.joda.time.DurationFieldType durationFieldType9 = mutablePeriod1.getFieldType((int) (short) 1);
        org.joda.time.Chronology chronology10 = null;
        boolean boolean11 = durationFieldType9.isSupported(chronology10);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
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
        int int36 = period3.getYears();
        org.joda.time.Period period38 = period3.minusSeconds((-2));
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(period38);
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration1 = org.joda.time.Duration.ZERO;
        long long2 = duration1.getStandardDays();
        org.joda.time.Hours hours3 = duration1.toStandardHours();
        org.joda.time.Duration duration5 = duration1.withMillis(0L);
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration1);
        org.joda.time.Period period8 = period6.multipliedBy((int) (short) 100);
        int int9 = period8.getMinutes();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("PeriodType[Days]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[Days]\" is malformed at \"eriodType[Days]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period5 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Period period8 = period5.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period10 = period8.normalizedStandard(periodType9);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(readableInstant2, readableInstant3, periodType9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(600L, (long) (short) -1, periodType9, chronology12);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod13.setWeeks(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        int int8 = days2.size();
        org.joda.time.Days days9 = days2.negated();
        org.joda.time.Days days11 = days9.minus(3);
        org.joda.time.Days days12 = days11.negated();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((java.lang.Object) days11);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days12);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant7, periodType8);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(readableInstant11, readableDuration12);
        mutablePeriod13.setHours((int) (short) 100);
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology18 = null;
        mutablePeriod13.setPeriod((org.joda.time.ReadableDuration) duration17, chronology18);
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds22 = duration21.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType23 = seconds22.getFieldType();
        mutablePeriod13.add(durationFieldType23, (int) (short) 0);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(readableInstant26, readableDuration27);
        mutablePeriod28.setHours((int) (short) 100);
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology33 = null;
        mutablePeriod28.setPeriod((org.joda.time.ReadableDuration) duration32, chronology33);
        org.joda.time.Chronology chronology35 = null;
        mutablePeriod13.setPeriod((org.joda.time.ReadableDuration) duration32, chronology35);
        int int37 = duration4.compareTo((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Duration duration38 = duration32.toDuration();
        org.joda.time.Duration duration39 = duration38.toDuration();
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration38, readableInstant40);
        org.joda.time.MutablePeriod mutablePeriod42 = mutablePeriod41.toMutablePeriod();
        org.joda.time.Chronology chronology44 = null;
        mutablePeriod41.setPeriod((long) '#', chronology44);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(mutablePeriod42);
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        org.joda.time.Seconds seconds7 = seconds5.dividedBy(32);
        org.joda.time.PeriodType periodType8 = seconds5.getPeriodType();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) (byte) 10, periodType8, chronology9);
        org.joda.time.DurationFieldType durationFieldType12 = periodType8.getFieldType(0);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType15 = periodType8.getFieldType(40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 40");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(durationFieldType12);
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        java.lang.String str2 = weeks1.toString();
        org.joda.time.PeriodType periodType3 = weeks1.getPeriodType();
        org.joda.time.Seconds seconds4 = weeks1.toStandardSeconds();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P1W" + "'", str2, "P1W");
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(seconds4);
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ZERO;
        org.joda.time.PeriodType periodType1 = seconds0.getPeriodType();
        org.joda.time.Hours hours2 = seconds0.toStandardHours();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(hours2);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter2.getPrinter();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter2.withLocale(locale5);
        java.util.Locale locale7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter6.withLocale(locale7);
        java.util.Locale locale9 = null;
        org.joda.time.format.PeriodFormatter periodFormatter10 = periodFormatter8.withLocale(locale9);
        boolean boolean11 = periodFormatter10.isPrinter();
        org.joda.time.Period period13 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days14 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period13);
        org.joda.time.PeriodType periodType15 = days14.getPeriodType();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(readableInstant16, readableDuration17);
        mutablePeriod18.setHours((int) (short) 100);
        boolean boolean21 = periodType15.equals((java.lang.Object) mutablePeriod18);
        org.joda.time.Duration duration22 = org.joda.time.Duration.ZERO;
        long long23 = duration22.getStandardDays();
        mutablePeriod18.add((org.joda.time.ReadableDuration) duration22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType27 = periodType26.withWeeksRemoved();
        org.joda.time.PeriodType periodType28 = periodType27.withDaysRemoved();
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration22, readableInstant25, periodType27);
        java.lang.String str30 = periodType27.getName();
        org.joda.time.PeriodType periodType31 = periodType27.withMinutesRemoved();
        org.joda.time.PeriodType periodType32 = periodType31.withHoursRemoved();
        org.joda.time.PeriodType periodType33 = periodType31.withYearsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period34 = new org.joda.time.Period((java.lang.Object) boolean11, periodType31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(periodFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Millis" + "'", str30, "Millis");
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType33);
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        org.joda.time.Hours hours0 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours2 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean3 = hours0.isGreaterThan(hours2);
        org.joda.time.Duration duration4 = hours2.toStandardDuration();
        org.joda.time.Period period5 = duration4.toPeriod();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) '4', chronology7);
        org.joda.time.Duration duration9 = org.joda.time.Duration.ZERO;
        long long10 = duration9.getStandardDays();
        org.joda.time.Hours hours11 = duration9.toStandardHours();
        long long12 = duration9.getStandardMinutes();
        long long13 = duration9.getStandardDays();
        mutablePeriod8.setPeriod((org.joda.time.ReadableDuration) duration9);
        org.joda.time.Duration duration15 = duration4.plus((org.joda.time.ReadableDuration) duration9);
        boolean boolean17 = duration4.equals((java.lang.Object) 10.0d);
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = period1.withSeconds((int) ' ');
        java.lang.String str5 = period1.toString();
        int int6 = period1.getMinutes();
        org.joda.time.Period period7 = period1.toPeriod();
        org.joda.time.Period period9 = period7.plusMonths(0);
        org.joda.time.Period period11 = period9.withYears((int) (short) 0);
        int int12 = period11.getMillis();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT1M" + "'", str5, "PT1M");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        org.joda.time.Duration duration9 = new org.joda.time.Duration((long) (-1));
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period14 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days15 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Period period17 = period14.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period19 = period17.normalizedStandard(periodType18);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(readableInstant11, readableInstant12, periodType18);
        org.joda.time.PeriodType periodType21 = periodType18.withYearsRemoved();
        org.joda.time.Period period22 = duration9.toPeriodTo(readableInstant10, periodType21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period24 = duration9.toPeriodFrom(readableInstant23);
        org.joda.time.Duration duration26 = duration9.withMillis((long) ' ');
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType31 = periodType30.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) (-1), periodType31);
        org.joda.time.PeriodType periodType33 = periodType31.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(0L, periodType33);
        org.joda.time.Period period35 = duration9.toPeriodTo(readableInstant27, periodType33);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period36 = new org.joda.time.Period(0, (int) '#', 40, 8, 7, 60, (int) (short) 10, (-1), periodType33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(period35);
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(3, 35, 100, 25);
        mutablePeriod4.addWeeks(35);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("P0D");
        org.joda.time.Minutes minutes3 = minutes1.dividedBy((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType5 = minutes1.getFieldType(60);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 60");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(minutes3);
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period7 = period4.withSeconds((int) ' ');
        org.joda.time.Period period8 = period1.minus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period10 = period1.plusHours((-1));
        org.joda.time.Period period12 = period1.withMillis(3);
        org.joda.time.Period period14 = period1.withSeconds(0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        org.joda.time.Period period4 = new org.joda.time.Period(10, 0, (int) (byte) 10, (int) (byte) 10);
        int int5 = period4.getHours();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period11 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days12 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period11);
        org.joda.time.PeriodType periodType13 = days12.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType14 = null;
        int int15 = periodType13.indexOf(durationFieldType14);
        org.joda.time.PeriodType periodType16 = periodType13.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) '4', (long) 'a', periodType16);
        java.lang.String str18 = periodType16.getName();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableInstant6, readableInstant7, periodType16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = period4.withPeriodType(periodType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Days" + "'", str18, "Days");
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter2.getPrinter();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter2.withLocale(locale5);
        java.util.Locale locale7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter6.withLocale(locale7);
        org.joda.time.format.PeriodPrinter periodPrinter9 = periodFormatter6.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = periodFormatter6.parsePeriod("P1W");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNull(periodPrinter9);
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        org.joda.time.Minutes minutes8 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType9 = minutes8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withMinutesRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = new org.joda.time.Period((int) ' ', (int) (short) 0, 4, 0, (int) (short) 100, (-8), (-1073741824), (-1073741824), periodType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        org.joda.time.Period period4 = new org.joda.time.Period(0, (int) '4', (int) (short) 100, (int) (byte) -1);
        org.joda.time.Period period6 = period4.withDays((int) 'a');
        org.joda.time.Weeks weeks7 = period6.toStandardWeeks();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period13 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days14 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period16 = period13.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period18 = period16.normalizedStandard(periodType17);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableInstant10, readableInstant11, periodType17);
        org.joda.time.PeriodType periodType20 = periodType17.withYearsRemoved();
        org.joda.time.Period period21 = new org.joda.time.Period((-1L), 60000L, periodType20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((java.lang.Object) period6, periodType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(periodType20);
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = duration1.toPeriod(periodType2, chronology4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType8 = periodType7.withMonthsRemoved();
        org.joda.time.Period period9 = duration1.toPeriodTo(readableInstant6, periodType8);
        org.joda.time.Period period11 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days12 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period11);
        org.joda.time.PeriodType periodType13 = days12.getPeriodType();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(readableInstant14, readableDuration15);
        mutablePeriod16.setHours((int) (short) 100);
        boolean boolean19 = periodType13.equals((java.lang.Object) mutablePeriod16);
        org.joda.time.Duration duration20 = org.joda.time.Duration.ZERO;
        long long21 = duration20.getStandardDays();
        mutablePeriod16.add((org.joda.time.ReadableDuration) duration20);
        mutablePeriod16.clear();
        org.joda.time.Period period25 = org.joda.time.Period.hours(0);
        org.joda.time.DurationFieldType durationFieldType27 = period25.getFieldType((int) (short) 1);
        mutablePeriod16.set(durationFieldType27, (int) (short) -1);
        org.joda.time.Period period31 = period9.withField(durationFieldType27, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period33 = period9.plusMonths((-32));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertNotNull(period31);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        java.lang.String str3 = seconds2.toString();
        org.joda.time.PeriodType periodType4 = seconds2.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withSecondsRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withDaysRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(periodType7);
        org.joda.time.MutablePeriod mutablePeriod9 = mutablePeriod8.copy();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod9.setDays((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT60S" + "'", str3, "PT60S");
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(mutablePeriod9);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType6 = seconds5.getFieldType();
        mutablePeriod2.add(durationFieldType6, 52);
        mutablePeriod2.add((long) (short) 1);
        int int11 = mutablePeriod2.size();
        org.joda.time.Chronology chronology13 = null;
        mutablePeriod2.setPeriod((long) (-1), chronology13);
        int int15 = mutablePeriod2.getWeeks();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType9 = periodType8.withSecondsRemoved();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableInstant6, readableInstant7, periodType8);
        int int11 = mutablePeriod10.getMinutes();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod10, "P97MT52S", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.PeriodType periodType5 = periodFormatter2.getParseType();
        java.util.Locale locale6 = null;
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withLocale(locale6);
        org.joda.time.Days days8 = org.joda.time.Days.ZERO;
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((java.lang.Object) days8, periodType9, chronology10);
        org.joda.time.Period period13 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days14 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period16 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days17 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period16);
        org.joda.time.PeriodType periodType18 = days17.getPeriodType();
        boolean boolean19 = days14.isGreaterThan(days17);
        int int20 = days14.size();
        org.joda.time.Days days21 = days14.negated();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((java.lang.Object) days21, chronology22);
        org.joda.time.MutablePeriod mutablePeriod24 = period23.toMutablePeriod();
        org.joda.time.Period period25 = period23.normalizedStandard();
        org.joda.time.Days days26 = org.joda.time.Days.ZERO;
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((java.lang.Object) days26, periodType27, chronology28);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.hours();
        int int31 = mutablePeriod29.get(durationFieldType30);
        java.lang.String str32 = durationFieldType30.toString();
        int int33 = period23.indexOf(durationFieldType30);
        int int34 = days8.get(durationFieldType30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = periodFormatter7.print((org.joda.time.ReadablePeriod) days8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNull(periodType5);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(mutablePeriod24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hours" + "'", str32, "hours");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (byte) 100);
        int int2 = period1.getWeeks();
        org.joda.time.Hours hours3 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours5 = hours3.minus(0);
        org.joda.time.Hours hours6 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours8 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean9 = hours6.isGreaterThan(hours8);
        boolean boolean10 = hours5.isLessThan(hours8);
        java.lang.String str11 = hours5.toString();
        java.lang.String str12 = hours5.toString();
        org.joda.time.Hours hours14 = hours5.plus(13);
        org.joda.time.Period period15 = period1.minus((org.joda.time.ReadablePeriod) hours5);
        org.joda.time.Period period17 = period1.minusMinutes(8);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((long) (-1));
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period24 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days25 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Period period27 = period24.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period29 = period27.normalizedStandard(periodType28);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(readableInstant21, readableInstant22, periodType28);
        org.joda.time.PeriodType periodType31 = periodType28.withYearsRemoved();
        org.joda.time.Period period32 = duration19.toPeriodTo(readableInstant20, periodType31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period33 = period1.normalizedStandard(periodType31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 8640000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT4H" + "'", str11, "PT4H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT4H" + "'", str12, "PT4H");
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(period32);
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1);
        org.joda.time.format.PeriodFormatter periodFormatter3 = null;
        java.lang.String str4 = mutablePeriod2.toString(periodFormatter3);
        int int5 = mutablePeriod2.getMillis();
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.minutesIn(readableInterval6);
        org.joda.time.Minutes minutes9 = minutes7.dividedBy((int) (byte) -1);
        mutablePeriod2.mergePeriod((org.joda.time.ReadablePeriod) minutes7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType12 = mutablePeriod2.getFieldType((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0S" + "'", str4, "PT0S");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(minutes9);
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes3 = minutes0.plus(minutes2);
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.ZERO;
        boolean boolean6 = minutes4.isLessThan(minutes5);
        boolean boolean7 = minutes0.isLessThan(minutes4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = minutes0.getValue(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("PT100H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        org.joda.time.Period period4 = new org.joda.time.Period(25, (int) '4', (-2147483648), 3);
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        org.joda.time.Hours hours0 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours2 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean3 = hours0.isGreaterThan(hours2);
        org.joda.time.Duration duration4 = hours2.toStandardDuration();
        org.joda.time.Duration duration5 = duration4.toDuration();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = duration4.toPeriod(chronology6);
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds13 = duration12.toStandardSeconds();
        org.joda.time.Seconds seconds15 = seconds13.dividedBy(32);
        org.joda.time.PeriodType periodType16 = seconds13.getPeriodType();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) (byte) 10, periodType16, chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(8L, (long) (short) 10, periodType16, chronology19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((-32), 100, (int) '#', 25, 100, (-2147483648), 32, 3, periodType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        org.joda.time.Period period3 = mutablePeriod2.toPeriod();
        org.joda.time.Period period5 = period3.withHours(0);
        int int6 = period3.getWeeks();
        org.joda.time.Period period8 = period3.plusSeconds((int) (byte) 100);
        org.joda.time.Period period10 = period3.minusYears(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days11 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert period to duration as years is not precise in the period P-100Y");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod2.addYears((int) '4');
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod2.add((long) (byte) 1, chronology6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        mutablePeriod2.setPeriod(readableDuration8);
        mutablePeriod2.setValue(2, (int) (byte) 0);
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType7 = seconds6.getFieldType();
        org.joda.time.Seconds seconds9 = seconds6.plus(25);
        org.joda.time.Seconds seconds10 = seconds6.negated();
        org.joda.time.PeriodType periodType11 = seconds10.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter12 = periodFormatter2.withParseType(periodType11);
        boolean boolean13 = periodFormatter2.isPrinter();
        org.joda.time.PeriodType periodType14 = periodFormatter2.getParseType();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod17.addYears((int) '4');
        org.joda.time.Chronology chronology21 = null;
        mutablePeriod17.add((long) 100, chronology21);
        mutablePeriod17.setMillis((int) (byte) 10);
        mutablePeriod17.setPeriod((long) '#');
        org.joda.time.Duration duration27 = org.joda.time.Duration.ZERO;
        long long28 = duration27.getStandardDays();
        org.joda.time.Hours hours29 = duration27.toStandardHours();
        org.joda.time.Hours hours30 = hours29.negated();
        mutablePeriod17.mergePeriod((org.joda.time.ReadablePeriod) hours30);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod17, "P-13W", 32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(periodType14);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(hours29);
        org.junit.Assert.assertNotNull(hours30);
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType2);
        int int4 = period3.getMillis();
        org.joda.time.Period period6 = period3.plusDays((int) 'a');
        org.joda.time.Period period8 = period3.minusMillis((-32));
        org.joda.time.Period period9 = period3.toPeriod();
        org.joda.time.Hours hours10 = period3.toStandardHours();
        org.joda.time.Days days11 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) hours10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 25 + "'", int4 == 25);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(days11);
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) 'a');
        int int2 = period1.getHours();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (-2147483648), (long) (short) 10, chronology2);
        mutablePeriod3.addWeeks((int) 'a');
        int int6 = mutablePeriod3.getMillis();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 658 + "'", int6 == 658);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        long long1 = duration0.getStandardDays();
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Interval interval3 = duration0.toIntervalFrom(readableInstant2);
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval3);
        org.joda.time.Hours hours5 = weeks4.toStandardHours();
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(hours5);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.secondsIn(readableInterval0);
        int int2 = seconds1.getSeconds();
        org.joda.time.Days days3 = seconds1.toStandardDays();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(days3);
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter2.getPrinter();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter2.withLocale(locale5);
        java.util.Locale locale7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter6.withLocale(locale7);
        java.io.Writer writer9 = null;
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.Weeks weeks11 = org.joda.time.Weeks.weeksIn(readableInterval10);
        org.joda.time.ReadableInterval readableInterval12 = null;
        org.joda.time.Weeks weeks13 = org.joda.time.Weeks.weeksIn(readableInterval12);
        boolean boolean14 = weeks11.isLessThan(weeks13);
        org.joda.time.Weeks weeks15 = weeks11.negated();
        org.joda.time.Weeks weeks17 = weeks15.minus((int) (byte) 100);
        org.joda.time.ReadableInterval readableInterval18 = null;
        org.joda.time.Weeks weeks19 = org.joda.time.Weeks.weeksIn(readableInterval18);
        org.joda.time.ReadableInterval readableInterval20 = null;
        org.joda.time.Weeks weeks21 = org.joda.time.Weeks.weeksIn(readableInterval20);
        boolean boolean22 = weeks19.isLessThan(weeks21);
        org.joda.time.Weeks weeks24 = weeks21.minus((int) (short) -1);
        org.joda.time.Weeks weeks26 = weeks24.multipliedBy(0);
        boolean boolean27 = weeks17.isGreaterThan(weeks26);
        org.joda.time.Period period32 = new org.joda.time.Period(0, (int) '4', (int) (short) 100, (int) (byte) -1);
        org.joda.time.Period period34 = period32.withDays((int) 'a');
        org.joda.time.Weeks weeks35 = period34.toStandardWeeks();
        int int36 = weeks35.getWeeks();
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.Weeks weeks38 = org.joda.time.Weeks.weeksIn(readableInterval37);
        org.joda.time.ReadableInterval readableInterval39 = null;
        org.joda.time.Weeks weeks40 = org.joda.time.Weeks.weeksIn(readableInterval39);
        boolean boolean41 = weeks38.isLessThan(weeks40);
        org.joda.time.Weeks weeks43 = weeks40.minus((int) (short) -1);
        org.joda.time.Weeks weeks44 = weeks43.negated();
        org.joda.time.Weeks weeks46 = weeks43.multipliedBy(0);
        boolean boolean47 = weeks35.isGreaterThan(weeks46);
        org.joda.time.Weeks weeks48 = weeks26.minus(weeks35);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter6.printTo(writer9, (org.joda.time.ReadablePeriod) weeks35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(weeks35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 13 + "'", int36 == 13);
        org.junit.Assert.assertNotNull(weeks38);
        org.junit.Assert.assertNotNull(weeks40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(weeks43);
        org.junit.Assert.assertNotNull(weeks44);
        org.junit.Assert.assertNotNull(weeks46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(weeks48);
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        int int8 = days2.size();
        org.joda.time.Days days9 = days2.negated();
        org.joda.time.Days days11 = days9.minus(3);
        org.joda.time.Days days12 = org.joda.time.Days.ZERO;
        int int13 = days12.getDays();
        org.joda.time.Period period15 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days16 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Period period18 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days19 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period18);
        org.joda.time.PeriodType periodType20 = days19.getPeriodType();
        boolean boolean21 = days16.isGreaterThan(days19);
        org.joda.time.Period period23 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days24 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period23);
        org.joda.time.Days days25 = days19.minus(days24);
        org.joda.time.Days days26 = days12.minus(days19);
        org.joda.time.Days days28 = days19.plus((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType30 = days28.getFieldType((int) (short) 0);
        boolean boolean31 = days11.isLessThan(days28);
        org.joda.time.Period period33 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period35 = period33.minusWeeks(52);
        org.joda.time.Days days36 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period33);
        org.joda.time.Duration duration37 = days36.toStandardDuration();
        org.joda.time.Days days38 = days11.plus(days36);
        org.joda.time.ReadableInterval readableInterval39 = null;
        org.joda.time.Seconds seconds40 = org.joda.time.Seconds.secondsIn(readableInterval39);
        org.joda.time.Minutes minutes41 = seconds40.toStandardMinutes();
        // The following exception was thrown during execution in test generation
        try {
            int int42 = days36.compareTo((org.joda.time.base.BaseSingleFieldPeriod) seconds40);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Days cannot be compared to class org.joda.time.Seconds");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertNotNull(seconds40);
        org.junit.Assert.assertNotNull(minutes41);
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds4 = duration3.toStandardSeconds();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds7 = duration6.toStandardSeconds();
        boolean boolean8 = duration3.isLongerThan((org.joda.time.ReadableDuration) duration6);
        org.joda.time.Period period9 = duration3.toPeriod();
        org.joda.time.Period period10 = period9.negated();
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds13 = duration12.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType14 = seconds13.getFieldType();
        org.joda.time.Seconds seconds16 = seconds13.plus(25);
        org.joda.time.Seconds seconds17 = seconds13.negated();
        org.joda.time.Seconds seconds19 = seconds13.dividedBy(10);
        org.joda.time.Period period20 = period9.plus((org.joda.time.ReadablePeriod) seconds19);
        int int21 = period20.getWeeks();
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period25 = org.joda.time.Period.hours(0);
        org.joda.time.DurationFieldType durationFieldType27 = period25.getFieldType((int) (short) 1);
        org.joda.time.Period period29 = period25.plusDays(10);
        boolean boolean30 = periodType23.equals((java.lang.Object) 10);
        org.joda.time.Period period31 = new org.joda.time.Period((long) ' ', periodType23);
        org.joda.time.PeriodType periodType32 = periodType23.withDaysRemoved();
        org.joda.time.Period period33 = period20.normalizedStandard(periodType32);
        org.joda.time.Period period34 = new org.joda.time.Period((long) (short) 1, 4L, periodType32);
        int int35 = period34.getMillis();
        org.joda.time.Period period37 = org.joda.time.Period.minutes(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period38 = period34.minus((org.joda.time.ReadablePeriod) period37);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(period37);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PeriodType[YearWeekDayTime]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[YearWeekDayTime]\" is malformed at \"eriodType[YearWeekDayTime]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod2.addYears((int) '4');
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod2.add((long) 100, chronology6);
        mutablePeriod2.setMillis((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        mutablePeriod2.setPeriod(readableInstant10, readableInstant11);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) (short) -1, (int) '#', (int) ' ', 100);
        mutablePeriod2.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds21 = duration20.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType22 = seconds21.getFieldType();
        org.joda.time.Seconds seconds24 = seconds21.plus(25);
        boolean boolean25 = mutablePeriod17.equals((java.lang.Object) seconds24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType27 = seconds24.getFieldType((-1073741824));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1073741824");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter2.getPrinter();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter2.withLocale(locale5);
        java.util.Locale locale7 = periodFormatter2.getLocale();
        org.joda.time.PeriodType periodType8 = periodFormatter2.getParseType();
        org.joda.time.Period period10 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days11 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period13 = period10.minusMonths(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = periodFormatter2.print((org.joda.time.ReadablePeriod) period10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNull(periodType8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant7, periodType8);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(readableInstant11, readableDuration12);
        mutablePeriod13.setHours((int) (short) 100);
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology18 = null;
        mutablePeriod13.setPeriod((org.joda.time.ReadableDuration) duration17, chronology18);
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds22 = duration21.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType23 = seconds22.getFieldType();
        mutablePeriod13.add(durationFieldType23, (int) (short) 0);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(readableInstant26, readableDuration27);
        mutablePeriod28.setHours((int) (short) 100);
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology33 = null;
        mutablePeriod28.setPeriod((org.joda.time.ReadableDuration) duration32, chronology33);
        org.joda.time.Chronology chronology35 = null;
        mutablePeriod13.setPeriod((org.joda.time.ReadableDuration) duration32, chronology35);
        int int37 = duration4.compareTo((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Duration duration39 = duration32.minus(1L);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Period period41 = duration32.toPeriodTo(readableInstant40);
        org.joda.time.Period period43 = period41.plusHours((int) '#');
        org.joda.time.Duration duration47 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds48 = duration47.toStandardSeconds();
        java.lang.String str49 = seconds48.toString();
        org.joda.time.PeriodType periodType50 = seconds48.getPeriodType();
        org.joda.time.PeriodType periodType51 = periodType50.withSecondsRemoved();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) (-1), (long) 100, periodType51, chronology52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period54 = period41.withPeriodType(periodType51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(seconds48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PT60S" + "'", str49, "PT60S");
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(periodType51);
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod2.addYears((int) '4');
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod2.add((long) 100, chronology6);
        mutablePeriod2.setMillis((int) (byte) 10);
        mutablePeriod2.setPeriod((long) '#');
        org.joda.time.Duration duration12 = org.joda.time.Duration.ZERO;
        long long13 = duration12.getStandardDays();
        org.joda.time.Hours hours14 = duration12.toStandardHours();
        org.joda.time.Hours hours15 = hours14.negated();
        mutablePeriod2.mergePeriod((org.joda.time.ReadablePeriod) hours15);
        org.joda.time.Hours hours18 = hours15.minus((int) (byte) 100);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(hours18);
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(periodType3);
        org.joda.time.Minutes minutes6 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType7 = minutes6.getPeriodType();
        org.joda.time.PeriodType periodType8 = periodType7.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) (byte) 0, periodType8);
        org.joda.time.PeriodType periodType10 = periodType8.withDaysRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) periodType3, periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("PT1M0.100S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
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
        org.joda.time.Days days15 = org.joda.time.Days.ZERO;
        org.joda.time.Period period17 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days18 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Days days20 = days18.minus(10);
        boolean boolean21 = days15.isGreaterThan(days18);
        org.joda.time.Days days22 = days7.minus(days15);
        java.lang.Object obj23 = null;
        boolean boolean24 = days22.equals(obj23);
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
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = duration1.toPeriod(periodType2, chronology4);
        org.joda.time.Days days6 = org.joda.time.Days.ZERO;
        int int7 = days6.getDays();
        org.joda.time.Period period9 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days10 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period12 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days13 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period12);
        org.joda.time.PeriodType periodType14 = days13.getPeriodType();
        boolean boolean15 = days10.isGreaterThan(days13);
        org.joda.time.Period period17 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days18 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Days days19 = days13.minus(days18);
        org.joda.time.Days days20 = days6.minus(days13);
        boolean boolean21 = duration1.equals((java.lang.Object) days13);
        org.joda.time.Period period23 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days24 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period23);
        org.joda.time.Days days26 = days24.minus(10);
        org.joda.time.Days days28 = days26.plus((int) (short) -1);
        org.joda.time.Days days29 = days13.plus(days26);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(readableInstant33, readableDuration34);
        mutablePeriod35.setPeriod((long) ' ', (long) 52);
        mutablePeriod35.addDays(100);
        org.joda.time.PeriodType periodType41 = mutablePeriod35.getPeriodType();
        org.joda.time.Period period42 = new org.joda.time.Period((long) (short) 0, periodType41);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(readableInstant30, readableInstant31, periodType41);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((java.lang.Object) days13, periodType41);
        java.lang.String str45 = mutablePeriod44.toString();
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Duration duration47 = mutablePeriod44.toDurationFrom(readableInstant46);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "PT0S" + "'", str45, "PT0S");
        org.junit.Assert.assertNotNull(duration47);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        org.joda.time.Period period1 = org.joda.time.Period.hours(0);
        org.joda.time.DurationFieldType durationFieldType3 = period1.getFieldType((int) (short) 1);
        org.joda.time.Period period5 = period1.withSeconds((-1));
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        java.lang.String str7 = period1.toString();
        org.joda.time.Period period9 = period1.plusHours(10);
        org.joda.time.Period period11 = period1.minusWeeks((int) (byte) 1);
        org.joda.time.Period period12 = period1.negated();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT0S" + "'", str7, "PT0S");
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        org.joda.time.Hours hours0 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours2 = hours0.minus(10);
        org.joda.time.Hours hours3 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours5 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean6 = hours3.isGreaterThan(hours5);
        org.joda.time.Hours hours8 = hours3.minus((int) (byte) 0);
        org.joda.time.Hours hours10 = hours8.minus((int) '#');
        org.joda.time.Duration duration11 = hours10.toStandardDuration();
        org.joda.time.Hours hours12 = hours2.minus(hours10);
        org.joda.time.Hours hours14 = hours2.dividedBy((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType16 = hours2.getFieldType(600);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 600");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(hours14);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType4 = periodType3.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) (-1), periodType4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(10L, (long) 8, periodType4, chronology6);
        org.joda.time.PeriodType periodType8 = mutablePeriod7.getPeriodType();
        mutablePeriod7.setWeeks((int) (byte) 0);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        org.joda.time.Period period9 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days10 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Days days11 = days5.minus(days10);
        org.joda.time.Period period13 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days14 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Days days16 = days14.minus(10);
        org.joda.time.Days days17 = days5.plus(days14);
        org.joda.time.Days days19 = days14.plus(32);
        int int20 = days14.getDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.PeriodType periodType5 = periodFormatter2.getParseType();
        java.util.Locale locale6 = null;
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withLocale(locale6);
        java.io.Writer writer8 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType11);
        int int13 = period12.getMillis();
        org.joda.time.Period period15 = period12.plusYears(13);
        org.joda.time.Period period16 = period15.negated();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer8, (org.joda.time.ReadablePeriod) period15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNull(periodType5);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 25 + "'", int13 == 25);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours2 = hours0.minus(0);
        org.joda.time.Hours hours3 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours5 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean6 = hours3.isGreaterThan(hours5);
        boolean boolean7 = hours2.isLessThan(hours5);
        java.lang.String str8 = hours2.toString();
        java.lang.String str9 = hours2.toString();
        org.joda.time.Hours hours11 = hours2.plus(13);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hours2.getValue(600);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 600");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT4H" + "'", str8, "PT4H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT4H" + "'", str9, "PT4H");
        org.junit.Assert.assertNotNull(hours11);
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        org.joda.time.Period period1 = org.joda.time.Period.months(1);
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType3 = minutes2.getFieldType();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DurationField durationField5 = durationFieldType3.getField(chronology4);
        org.joda.time.Period period7 = period1.withField(durationFieldType3, 0);
        org.joda.time.Period period9 = period1.withMillis((int) (short) 0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period7 = period4.withSeconds((int) ' ');
        org.joda.time.Period period8 = period1.minus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType10 = periodType9.withMonthsRemoved();
        org.joda.time.Period period11 = period8.withPeriodType(periodType9);
        org.joda.time.Period period13 = period11.plusWeeks((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period15 = period11.withMonths((-1073741824));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT0.032S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds10 = duration9.toStandardSeconds();
        java.lang.String str11 = seconds10.toString();
        org.joda.time.PeriodType periodType12 = seconds10.getPeriodType();
        org.joda.time.PeriodType periodType13 = periodType12.withSecondsRemoved();
        org.joda.time.PeriodType periodType14 = periodType13.withDaysRemoved();
        org.joda.time.PeriodType periodType15 = periodType14.withWeeksRemoved();
        org.joda.time.PeriodType periodType16 = periodType14.withMonthsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(658, 2, 100, (int) (byte) 100, (-60), 100, 40, (-2), periodType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT60S" + "'", str11, "PT60S");
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.format.PeriodParser periodParser4 = periodFormatter3.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter5 = periodFormatter3.getPrinter();
        java.util.Locale locale6 = null;
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter3.withLocale(locale6);
        java.util.Locale locale8 = null;
        org.joda.time.format.PeriodFormatter periodFormatter9 = periodFormatter7.withLocale(locale8);
        java.util.Locale locale10 = null;
        org.joda.time.format.PeriodFormatter periodFormatter11 = periodFormatter9.withLocale(locale10);
        java.util.Locale locale12 = null;
        org.joda.time.format.PeriodFormatter periodFormatter13 = periodFormatter11.withLocale(locale12);
        org.joda.time.PeriodType periodType14 = periodFormatter11.getParseType();
        java.util.Locale locale15 = periodFormatter11.getLocale();
        boolean boolean16 = periodFormatter11.isParser();
        java.util.Locale locale17 = null;
        org.joda.time.format.PeriodFormatter periodFormatter18 = periodFormatter11.withLocale(locale17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = org.joda.time.Period.parse("PT480S", periodFormatter18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser4);
        org.junit.Assert.assertNull(periodPrinter5);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNotNull(periodFormatter9);
        org.junit.Assert.assertNotNull(periodFormatter11);
        org.junit.Assert.assertNotNull(periodFormatter13);
        org.junit.Assert.assertNull(periodType14);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(periodFormatter18);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        boolean boolean4 = weeks1.isLessThan(weeks3);
        org.joda.time.Weeks weeks6 = weeks3.minus((int) (short) -1);
        org.joda.time.Weeks weeks8 = weeks6.multipliedBy(0);
        org.joda.time.Weeks weeks9 = null;
        boolean boolean10 = weeks6.isLessThan(weeks9);
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn(readableInterval11);
        org.joda.time.ReadableInterval readableInterval13 = null;
        org.joda.time.Weeks weeks14 = org.joda.time.Weeks.weeksIn(readableInterval13);
        boolean boolean15 = weeks12.isLessThan(weeks14);
        org.joda.time.Weeks weeks16 = weeks12.negated();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((java.lang.Object) weeks12, chronology17);
        int[] intArray19 = period18.getValues();
        org.joda.time.DurationFieldType[] durationFieldTypeArray20 = period18.getFieldTypes();
        boolean boolean21 = weeks6.equals((java.lang.Object) durationFieldTypeArray20);
        int int22 = weeks6.size();
        org.joda.time.Weeks weeks24 = weeks6.multipliedBy(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType26 = weeks24.getFieldType(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(durationFieldTypeArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(weeks24);
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        long long9 = duration4.getStandardMinutes();
        org.joda.time.Duration duration10 = duration4.toDuration();
        org.joda.time.Duration duration12 = duration10.plus(60000L);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration12);
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("P1D");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"P1D\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period7 = period4.withSeconds((int) ' ');
        org.joda.time.Period period8 = period1.minus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType10 = periodType9.withMonthsRemoved();
        org.joda.time.Period period11 = period8.withPeriodType(periodType9);
        org.joda.time.Period period13 = period11.plusWeeks((int) (byte) 0);
        org.joda.time.Period period15 = period11.multipliedBy((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period17 = period15.plusDays(1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        boolean boolean4 = weeks1.isLessThan(weeks3);
        org.joda.time.Weeks weeks5 = weeks1.negated();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) weeks1, chronology6);
        org.joda.time.Weeks weeks9 = weeks1.multipliedBy((int) (byte) 1);
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.Weeks weeks11 = org.joda.time.Weeks.weeksIn(readableInterval10);
        org.joda.time.ReadableInterval readableInterval12 = null;
        org.joda.time.Weeks weeks13 = org.joda.time.Weeks.weeksIn(readableInterval12);
        boolean boolean14 = weeks11.isLessThan(weeks13);
        org.joda.time.Weeks weeks15 = weeks11.negated();
        org.joda.time.MutablePeriod mutablePeriod16 = weeks15.toMutablePeriod();
        org.joda.time.Weeks weeks17 = weeks1.minus(weeks15);
        org.joda.time.ReadableInterval readableInterval18 = null;
        org.joda.time.Weeks weeks19 = org.joda.time.Weeks.weeksIn(readableInterval18);
        org.joda.time.ReadableInterval readableInterval20 = null;
        org.joda.time.Weeks weeks21 = org.joda.time.Weeks.weeksIn(readableInterval20);
        boolean boolean22 = weeks19.isLessThan(weeks21);
        org.joda.time.Weeks weeks24 = weeks21.minus((int) (short) -1);
        org.joda.time.Weeks weeks26 = weeks24.multipliedBy(0);
        org.joda.time.Weeks weeks27 = null;
        boolean boolean28 = weeks24.isLessThan(weeks27);
        org.joda.time.ReadableInterval readableInterval29 = null;
        org.joda.time.Weeks weeks30 = org.joda.time.Weeks.weeksIn(readableInterval29);
        org.joda.time.ReadableInterval readableInterval31 = null;
        org.joda.time.Weeks weeks32 = org.joda.time.Weeks.weeksIn(readableInterval31);
        boolean boolean33 = weeks30.isLessThan(weeks32);
        org.joda.time.Weeks weeks34 = weeks30.negated();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((java.lang.Object) weeks30, chronology35);
        int[] intArray37 = period36.getValues();
        org.joda.time.DurationFieldType[] durationFieldTypeArray38 = period36.getFieldTypes();
        boolean boolean39 = weeks24.equals((java.lang.Object) durationFieldTypeArray38);
        org.joda.time.Weeks weeks40 = weeks17.minus(weeks24);
        org.joda.time.Weeks weeks41 = org.joda.time.Weeks.TWO;
        org.joda.time.ReadableInterval readableInterval42 = null;
        org.joda.time.Weeks weeks43 = org.joda.time.Weeks.weeksIn(readableInterval42);
        org.joda.time.ReadableInterval readableInterval44 = null;
        org.joda.time.Weeks weeks45 = org.joda.time.Weeks.weeksIn(readableInterval44);
        boolean boolean46 = weeks43.isLessThan(weeks45);
        org.joda.time.Weeks weeks47 = weeks43.negated();
        org.joda.time.ReadableInterval readableInterval48 = null;
        org.joda.time.Weeks weeks49 = org.joda.time.Weeks.weeksIn(readableInterval48);
        org.joda.time.ReadableInterval readableInterval50 = null;
        org.joda.time.Weeks weeks51 = org.joda.time.Weeks.weeksIn(readableInterval50);
        boolean boolean52 = weeks49.isLessThan(weeks51);
        org.joda.time.Weeks weeks53 = weeks49.negated();
        org.joda.time.Weeks weeks55 = weeks53.minus((int) (byte) 100);
        org.joda.time.Weeks weeks56 = weeks47.plus(weeks53);
        boolean boolean57 = weeks41.isLessThan(weeks53);
        org.joda.time.Weeks weeks59 = weeks41.multipliedBy((int) (short) 1);
        org.joda.time.ReadableInterval readableInterval60 = null;
        org.joda.time.Weeks weeks61 = org.joda.time.Weeks.weeksIn(readableInterval60);
        org.joda.time.Weeks weeks63 = weeks61.multipliedBy((int) (short) 10);
        org.joda.time.Weeks weeks64 = weeks59.plus(weeks61);
        org.joda.time.Weeks weeks65 = weeks40.plus(weeks64);
        org.joda.time.Weeks weeks67 = weeks64.multipliedBy((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType68 = weeks67.getFieldType();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(mutablePeriod16);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertNotNull(weeks32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(weeks34);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0]");
        org.junit.Assert.assertNotNull(durationFieldTypeArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(weeks40);
        org.junit.Assert.assertNotNull(weeks41);
        org.junit.Assert.assertNotNull(weeks43);
        org.junit.Assert.assertNotNull(weeks45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(weeks47);
        org.junit.Assert.assertNotNull(weeks49);
        org.junit.Assert.assertNotNull(weeks51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(weeks53);
        org.junit.Assert.assertNotNull(weeks55);
        org.junit.Assert.assertNotNull(weeks56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(weeks59);
        org.junit.Assert.assertNotNull(weeks61);
        org.junit.Assert.assertNotNull(weeks63);
        org.junit.Assert.assertNotNull(weeks64);
        org.junit.Assert.assertNotNull(weeks65);
        org.junit.Assert.assertNotNull(weeks67);
        org.junit.Assert.assertNotNull(durationFieldType68);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 7, (-1L), chronology2);
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        org.joda.time.Days days1 = org.joda.time.Days.days((-8));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration2 = new org.joda.time.Duration((java.lang.Object) days1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.Days");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        org.joda.time.Period period1 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period3 = period1.withHours(32);
        org.joda.time.Period period5 = period1.plusMonths(52);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter2.getPrinter();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter2.withLocale(locale5);
        java.util.Locale locale7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter6.withLocale(locale7);
        java.util.Locale locale9 = null;
        org.joda.time.format.PeriodFormatter periodFormatter10 = periodFormatter8.withLocale(locale9);
        java.util.Locale locale11 = null;
        org.joda.time.format.PeriodFormatter periodFormatter12 = periodFormatter10.withLocale(locale11);
        org.joda.time.Minutes minutes13 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType14 = minutes13.getPeriodType();
        org.joda.time.Minutes minutes15 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes16 = minutes13.plus(minutes15);
        org.joda.time.Minutes minutes17 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes18 = org.joda.time.Minutes.ZERO;
        boolean boolean19 = minutes17.isLessThan(minutes18);
        boolean boolean20 = minutes13.isLessThan(minutes17);
        org.joda.time.Minutes minutes22 = minutes17.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes23 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType24 = minutes23.getFieldType();
        org.joda.time.PeriodType periodType25 = minutes23.getPeriodType();
        org.joda.time.Minutes minutes26 = minutes22.plus(minutes23);
        org.joda.time.PeriodType periodType27 = minutes22.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter28 = periodFormatter10.withParseType(periodType27);
        java.util.Locale locale29 = null;
        org.joda.time.format.PeriodFormatter periodFormatter30 = periodFormatter10.withLocale(locale29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType34 = periodType33.withSecondsRemoved();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(readableInstant31, readableInstant32, periodType33);
        int int36 = mutablePeriod35.getMinutes();
        // The following exception was thrown during execution in test generation
        try {
            int int39 = periodFormatter10.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod35, "PT100H", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(periodFormatter10);
        org.junit.Assert.assertNotNull(periodFormatter12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodFormatter28);
        org.junit.Assert.assertNotNull(periodFormatter30);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours2 = hours0.minus(0);
        org.joda.time.Hours hours3 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours5 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean6 = hours3.isGreaterThan(hours5);
        boolean boolean7 = hours2.isLessThan(hours5);
        java.lang.String str8 = hours2.toString();
        org.joda.time.Hours hours10 = hours2.dividedBy((int) (short) 10);
        org.joda.time.PeriodType periodType11 = hours10.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType13 = periodType11.getFieldType(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT4H" + "'", str8, "PT4H");
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType7 = periodType6.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) (-1), periodType7);
        java.lang.String str9 = mutablePeriod8.toString();
        org.joda.time.Period period10 = mutablePeriod8.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod4.add((org.joda.time.ReadablePeriod) period10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT0.001S" + "'", str9, "PT0.001S");
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes((int) (short) 0);
        org.joda.time.Seconds seconds2 = minutes1.toStandardSeconds();
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(seconds2);
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter2.getPrinter();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter2.withLocale(locale5);
        java.util.Locale locale7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter6.withLocale(locale7);
        java.util.Locale locale9 = null;
        org.joda.time.format.PeriodFormatter periodFormatter10 = periodFormatter8.withLocale(locale9);
        java.util.Locale locale11 = null;
        org.joda.time.format.PeriodFormatter periodFormatter12 = periodFormatter10.withLocale(locale11);
        org.joda.time.format.PeriodPrinter periodPrinter13 = periodFormatter12.getPrinter();
        java.lang.StringBuffer stringBuffer14 = null;
        org.joda.time.Minutes minutes15 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes16 = org.joda.time.Minutes.ZERO;
        boolean boolean17 = minutes15.isLessThan(minutes16);
        org.joda.time.Minutes minutes18 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType19 = minutes18.getPeriodType();
        int int20 = minutes18.getMinutes();
        java.lang.String str21 = minutes18.toString();
        org.joda.time.Minutes minutes22 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType23 = minutes22.getFieldType();
        java.lang.String str24 = minutes22.toString();
        boolean boolean25 = minutes18.isLessThan(minutes22);
        org.joda.time.Minutes minutes27 = minutes22.minus(0);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 25);
        org.joda.time.Minutes minutes30 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) mutablePeriod29);
        boolean boolean31 = minutes22.isGreaterThan(minutes30);
        org.joda.time.Minutes minutes32 = minutes15.minus(minutes30);
        org.joda.time.PeriodType periodType33 = minutes30.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter12.printTo(stringBuffer14, (org.joda.time.ReadablePeriod) minutes30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(periodFormatter10);
        org.junit.Assert.assertNotNull(periodFormatter12);
        org.junit.Assert.assertNull(periodPrinter13);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PT0M" + "'", str21, "PT0M");
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT-2147483648M" + "'", str24, "PT-2147483648M");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertNotNull(periodType33);
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
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
        org.joda.time.Weeks weeks33 = weeks11.minus(0);
        org.joda.time.Weeks weeks35 = weeks11.dividedBy((int) '#');
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
        org.junit.Assert.assertNotNull(weeks35);
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        org.joda.time.Period period3 = mutablePeriod2.toPeriod();
        org.joda.time.Period period5 = period3.withHours(0);
        org.joda.time.Period period7 = org.joda.time.Period.hours(0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableInstant8, readableDuration9);
        org.joda.time.Period period11 = mutablePeriod10.toPeriod();
        org.joda.time.Period period13 = period11.withHours(0);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.days();
        int int15 = period11.indexOf(durationFieldType14);
        int int16 = period7.indexOf(durationFieldType14);
        int int17 = period3.get(durationFieldType14);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period21 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days22 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period24 = period21.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period26 = period24.normalizedStandard(periodType25);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(readableInstant18, readableInstant19, periodType25);
        org.joda.time.DurationFieldType[] durationFieldTypeArray28 = mutablePeriod27.getFieldTypes();
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.forFields(durationFieldTypeArray28);
        org.joda.time.Period period30 = period3.withPeriodType(periodType29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period32 = period30.withYears((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(durationFieldTypeArray28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(period30);
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("PT1M");
        org.junit.Assert.assertNotNull(minutes1);
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = period1.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period6 = period4.normalizedStandard(periodType5);
        org.joda.time.Period period11 = new org.joda.time.Period(0, (int) '4', (int) (short) 100, (int) (byte) -1);
        org.joda.time.Period period13 = period11.withDays((int) 'a');
        org.joda.time.Weeks weeks14 = period13.toStandardWeeks();
        int int15 = weeks14.getWeeks();
        org.joda.time.Weeks weeks17 = weeks14.multipliedBy((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period18 = period6.plus((org.joda.time.ReadablePeriod) weeks17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13 + "'", int15 == 13);
        org.junit.Assert.assertNotNull(weeks17);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (byte) 0);
        org.joda.time.Period period3 = period1.withWeeks(600);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(0L);
        mutablePeriod1.addMonths((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = mutablePeriod1.toDurationTo(readableInstant4);
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds8 = duration7.toStandardSeconds();
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds11 = duration10.toStandardSeconds();
        boolean boolean12 = duration7.isLongerThan((org.joda.time.ReadableDuration) duration10);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds15 = duration14.toStandardSeconds();
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds18 = duration17.toStandardSeconds();
        boolean boolean19 = duration14.isLongerThan((org.joda.time.ReadableDuration) duration17);
        org.joda.time.Period period20 = duration14.toPeriod();
        boolean boolean21 = duration10.isLongerThan((org.joda.time.ReadableDuration) duration14);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = duration10.toPeriodTo(readableInstant22);
        long long24 = duration10.getStandardDays();
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.Period period27 = duration26.toPeriod();
        long long28 = duration26.getStandardSeconds();
        boolean boolean29 = duration10.isEqual((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration31 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds32 = duration31.toStandardSeconds();
        org.joda.time.Duration duration34 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds35 = duration34.toStandardSeconds();
        boolean boolean36 = duration31.isLongerThan((org.joda.time.ReadableDuration) duration34);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType39 = periodType38.withMinutesRemoved();
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration34, readableInstant37, periodType38);
        boolean boolean41 = duration10.isLongerThan((org.joda.time.ReadableDuration) duration34);
        org.joda.time.Seconds seconds42 = duration34.toStandardSeconds();
        boolean boolean43 = duration5.isLongerThan((org.joda.time.ReadableDuration) duration34);
        java.lang.String str44 = duration5.toString();
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-60L) + "'", long28 == (-60L));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(seconds35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(seconds42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "PT-2419200S" + "'", str44, "PT-2419200S");
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = new org.joda.time.Duration(readableInstant3, readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds9 = duration8.toStandardSeconds();
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds12 = duration11.toStandardSeconds();
        boolean boolean13 = duration8.isLongerThan((org.joda.time.ReadableDuration) duration11);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType16 = periodType15.withMinutesRemoved();
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration11, readableInstant14, periodType15);
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant6, (org.joda.time.ReadableDuration) duration11);
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period20 = duration11.toPeriod(periodType19);
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(readableInstant2, (org.joda.time.ReadableDuration) duration5, periodType19);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(periodType19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period23 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(0L, (long) ' ');
        mutablePeriod2.setHours(0);
        org.joda.time.MutablePeriod mutablePeriod5 = mutablePeriod2.copy();
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod5.add(60000L, chronology7);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod5.setValue((int) (short) 100, 54);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod5);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        org.joda.time.Period period3 = mutablePeriod2.toPeriod();
        org.joda.time.Duration duration4 = period3.toStandardDuration();
        org.joda.time.format.PeriodPrinter periodPrinter5 = null;
        org.joda.time.format.PeriodParser periodParser6 = null;
        org.joda.time.format.PeriodFormatter periodFormatter7 = new org.joda.time.format.PeriodFormatter(periodPrinter5, periodParser6);
        org.joda.time.format.PeriodParser periodParser8 = periodFormatter7.getParser();
        java.util.Locale locale9 = periodFormatter7.getLocale();
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType11 = minutes10.getPeriodType();
        org.joda.time.Minutes minutes12 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes13 = minutes10.plus(minutes12);
        org.joda.time.Minutes minutes14 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes15 = org.joda.time.Minutes.ZERO;
        boolean boolean16 = minutes14.isLessThan(minutes15);
        boolean boolean17 = minutes10.isLessThan(minutes14);
        org.joda.time.PeriodType periodType18 = minutes10.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter19 = periodFormatter7.withParseType(periodType18);
        boolean boolean20 = duration4.equals((java.lang.Object) periodType18);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) '4', chronology22);
        int int24 = mutablePeriod23.getHours();
        org.joda.time.Duration duration25 = org.joda.time.Duration.ZERO;
        long long26 = duration25.getStandardDays();
        org.joda.time.Hours hours27 = duration25.toStandardHours();
        long long28 = duration25.getStandardMinutes();
        mutablePeriod23.add((org.joda.time.ReadableDuration) duration25);
        org.joda.time.Duration duration31 = org.joda.time.Duration.standardHours((long) 25);
        mutablePeriod23.setPeriod((org.joda.time.ReadableDuration) duration31);
        org.joda.time.Duration duration33 = new org.joda.time.Duration((java.lang.Object) duration31);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType37 = periodType36.withDaysRemoved();
        org.joda.time.Period period38 = new org.joda.time.Period((-60L), periodType37);
        org.joda.time.Period period39 = duration33.toPeriodFrom(readableInstant34, periodType37);
        org.joda.time.Chronology chronology40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((java.lang.Object) periodType18, periodType37, chronology40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNull(periodParser8);
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodFormatter19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(hours27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(period39);
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
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
        org.joda.time.PeriodType periodType15 = periodFormatter14.getParseType();
        org.joda.time.PeriodType periodType16 = periodType15.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) (-2147483648), 25200000L, periodType16);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod17.setMillis((-60));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
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
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes((-1));
        int int2 = minutes1.getMinutes();
        org.joda.time.Minutes minutes4 = minutes1.dividedBy((-2147483648));
        org.joda.time.DurationFieldType durationFieldType5 = minutes4.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = minutes4.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(durationFieldType5);
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("PT-2H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant7, periodType8);
        org.joda.time.Duration duration11 = period10.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = period10.minusWeeks((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(duration11);
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
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
        org.joda.time.Weeks weeks40 = weeks25.dividedBy(3);
        org.joda.time.Weeks weeks41 = weeks40.negated();
        org.joda.time.Weeks weeks43 = weeks41.plus((int) (short) 1);
        org.joda.time.Weeks weeks45 = weeks41.dividedBy((-60));
        org.joda.time.DurationFieldType durationFieldType46 = weeks45.getFieldType();
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
        org.junit.Assert.assertNotNull(weeks41);
        org.junit.Assert.assertNotNull(weeks43);
        org.junit.Assert.assertNotNull(weeks45);
        org.junit.Assert.assertNotNull(durationFieldType46);
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType7 = seconds6.getFieldType();
        org.joda.time.Seconds seconds9 = seconds6.plus(25);
        org.joda.time.Seconds seconds10 = seconds6.negated();
        org.joda.time.PeriodType periodType11 = seconds10.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter12 = periodFormatter2.withParseType(periodType11);
        boolean boolean13 = periodFormatter2.isParser();
        java.util.Locale locale14 = null;
        org.joda.time.format.PeriodFormatter periodFormatter15 = periodFormatter2.withLocale(locale14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod17 = periodFormatter2.parseMutablePeriod("PeriodType[Years]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(periodFormatter15);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        org.joda.time.Hours hours0 = org.joda.time.Hours.SIX;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours2 = hours0.dividedBy(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        org.joda.time.Period period4 = new org.joda.time.Period(0, (int) '4', (int) (short) 100, (int) (byte) -1);
        org.joda.time.Period period6 = period4.withDays((int) 'a');
        org.joda.time.Weeks weeks7 = period6.toStandardWeeks();
        int int8 = weeks7.getWeeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration9 = new org.joda.time.Duration((java.lang.Object) weeks7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.Weeks");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 13 + "'", int8 == 13);
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        org.joda.time.Period period8 = new org.joda.time.Period((-2147483648), 600, (int) '4', 60, (int) (short) 10, (-1073741824), (int) (byte) 1, (-2147483648));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes9 = period8.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        org.joda.time.Period period1 = org.joda.time.Period.days((-672));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType3 = seconds2.getFieldType();
        org.joda.time.Days days4 = seconds2.toStandardDays();
        org.joda.time.Hours hours5 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours7 = hours5.minus((int) (byte) 10);
        org.joda.time.PeriodType periodType8 = hours5.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = days4.compareTo((org.joda.time.base.BaseSingleFieldPeriod) hours5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Days cannot be compared to class org.joda.time.Hours");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType8 = minutes7.getPeriodType();
        int int9 = minutes7.getMinutes();
        java.lang.String str10 = minutes7.toString();
        org.joda.time.Minutes minutes11 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType12 = minutes11.getFieldType();
        java.lang.String str13 = minutes11.toString();
        boolean boolean14 = minutes7.isLessThan(minutes11);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer6, (org.joda.time.ReadablePeriod) minutes7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT0M" + "'", str10, "PT0M");
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT-2147483648M" + "'", str13, "PT-2147483648M");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutesIn(readableInterval0);
        java.lang.String str2 = minutes1.toString();
        org.joda.time.Weeks weeks3 = minutes1.toStandardWeeks();
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0M" + "'", str2, "PT0M");
        org.junit.Assert.assertNotNull(weeks3);
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("YearMonthDayTime");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"YearMonthDayTime\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType3 = seconds2.getFieldType();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.parseSeconds("P0W");
        org.joda.time.Seconds seconds6 = seconds2.minus(seconds5);
        org.joda.time.Seconds seconds7 = seconds2.negated();
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.seconds((int) (short) 0);
        org.joda.time.Seconds seconds10 = seconds7.minus(seconds9);
        int int11 = seconds9.size();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType4 = null;
        int int5 = periodType3.indexOf(durationFieldType4);
        java.lang.String str6 = periodType3.toString();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PeriodType[Days]" + "'", str6, "PeriodType[Days]");
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(0L, chronology1);
        mutablePeriod2.setWeeks((int) (byte) 100);
        org.joda.time.format.PeriodPrinter periodPrinter5 = null;
        org.joda.time.format.PeriodParser periodParser6 = null;
        org.joda.time.format.PeriodFormatter periodFormatter7 = new org.joda.time.format.PeriodFormatter(periodPrinter5, periodParser6);
        org.joda.time.format.PeriodParser periodParser8 = periodFormatter7.getParser();
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds11 = duration10.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType12 = seconds11.getFieldType();
        org.joda.time.Seconds seconds14 = seconds11.plus(25);
        org.joda.time.Seconds seconds15 = seconds11.negated();
        org.joda.time.PeriodType periodType16 = seconds15.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter7.withParseType(periodType16);
        org.joda.time.format.PeriodPrinter periodPrinter18 = periodFormatter17.getPrinter();
        org.joda.time.format.PeriodParser periodParser19 = periodFormatter17.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter20 = periodFormatter17.getPrinter();
        org.joda.time.PeriodType periodType21 = periodFormatter17.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = mutablePeriod2.toString(periodFormatter17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertNull(periodPrinter18);
        org.junit.Assert.assertNull(periodParser19);
        org.junit.Assert.assertNull(periodPrinter20);
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis((long) 3);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT0S");
        org.joda.time.Chronology chronology4 = null;
        mutablePeriod1.setPeriod((long) 25, (long) (byte) 100, chronology4);
        mutablePeriod1.setWeeks((int) '4');
        int int8 = mutablePeriod1.size();
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod1.setPeriod((long) 100, chronology10);
        java.lang.Class<?> wildcardClass12 = mutablePeriod1.getClass();
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds4 = duration3.toStandardSeconds();
        java.lang.String str5 = seconds4.toString();
        org.joda.time.PeriodType periodType6 = seconds4.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withSecondsRemoved();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) (-1), (long) 100, periodType7, chronology8);
        mutablePeriod9.setYears((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.weeks();
        int int13 = mutablePeriod9.indexOf(durationFieldType12);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod9.addYears(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT60S" + "'", str5, "PT60S");
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType7 = seconds6.getFieldType();
        org.joda.time.Seconds seconds9 = seconds6.plus(25);
        org.joda.time.Seconds seconds10 = seconds6.negated();
        org.joda.time.PeriodType periodType11 = seconds10.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter12 = periodFormatter2.withParseType(periodType11);
        boolean boolean13 = periodFormatter2.isPrinter();
        java.util.Locale locale14 = periodFormatter2.getLocale();
        org.joda.time.format.PeriodPrinter periodPrinter15 = periodFormatter2.getPrinter();
        java.lang.StringBuffer stringBuffer16 = null;
        org.joda.time.Period period18 = org.joda.time.Period.days((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer16, (org.joda.time.ReadablePeriod) period18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertNull(periodPrinter15);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod2.addYears((int) '4');
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod2.add((long) 100, chronology6);
        mutablePeriod2.add(1, 10, (int) 'a', 52, (int) (short) 100, 0, (int) (byte) 0, (int) (byte) 10);
        org.joda.time.Seconds seconds18 = org.joda.time.Seconds.seconds(0);
        mutablePeriod2.mergePeriod((org.joda.time.ReadablePeriod) seconds18);
        org.joda.time.Seconds seconds21 = seconds18.minus(2);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(seconds21);
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds3 = duration2.toStandardSeconds();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        boolean boolean7 = duration2.isLongerThan((org.joda.time.ReadableDuration) duration5);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType10 = periodType9.withMinutesRemoved();
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant8, periodType9);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(readableInstant12, readableDuration13);
        mutablePeriod14.setHours((int) (short) 100);
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology19 = null;
        mutablePeriod14.setPeriod((org.joda.time.ReadableDuration) duration18, chronology19);
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds23 = duration22.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType24 = seconds23.getFieldType();
        mutablePeriod14.add(durationFieldType24, (int) (short) 0);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(readableInstant27, readableDuration28);
        mutablePeriod29.setHours((int) (short) 100);
        org.joda.time.Duration duration33 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology34 = null;
        mutablePeriod29.setPeriod((org.joda.time.ReadableDuration) duration33, chronology34);
        org.joda.time.Chronology chronology36 = null;
        mutablePeriod14.setPeriod((org.joda.time.ReadableDuration) duration33, chronology36);
        int int38 = duration5.compareTo((org.joda.time.ReadableDuration) duration33);
        org.joda.time.Duration duration39 = duration33.toDuration();
        org.joda.time.Duration duration41 = org.joda.time.Duration.standardDays(0L);
        boolean boolean42 = duration33.isLongerThan((org.joda.time.ReadableDuration) duration41);
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration33);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
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
        org.joda.time.Period period34 = duration1.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int36 = period34.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(period34);
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT3M");
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.Period period2 = duration1.toPeriod();
        org.joda.time.Period period3 = period2.toPeriod();
        org.joda.time.Period period5 = period2.withWeeks(0);
        org.joda.time.Period period7 = period2.plusDays(658);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = duration1.toPeriod(periodType2, chronology4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType8 = periodType7.withMonthsRemoved();
        org.joda.time.Period period9 = duration1.toPeriodTo(readableInstant6, periodType8);
        org.joda.time.Duration duration10 = duration1.toDuration();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period13 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days14 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period13);
        org.joda.time.PeriodType periodType15 = days14.getPeriodType();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(readableInstant16, readableDuration17);
        mutablePeriod18.setHours((int) (short) 100);
        boolean boolean21 = periodType15.equals((java.lang.Object) mutablePeriod18);
        org.joda.time.PeriodType periodType22 = periodType15.withMonthsRemoved();
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration1, readableInstant11, periodType15);
        org.joda.time.PeriodType periodType24 = periodType15.withMonthsRemoved();
        java.lang.String str25 = periodType24.toString();
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration30 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds31 = duration30.toStandardSeconds();
        java.lang.String str32 = seconds31.toString();
        org.joda.time.PeriodType periodType33 = seconds31.getPeriodType();
        org.joda.time.PeriodType periodType34 = periodType33.withSecondsRemoved();
        org.joda.time.PeriodType periodType35 = periodType34.withDaysRemoved();
        org.joda.time.PeriodType periodType36 = periodType35.withWeeksRemoved();
        org.joda.time.PeriodType periodType37 = periodType35.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 2, periodType35);
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant26, readableInstant27, periodType35);
        org.joda.time.PeriodType periodType40 = periodType35.withSecondsRemoved();
        org.joda.time.Chronology chronology41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((java.lang.Object) str25, periodType40, chronology41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[Days]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PeriodType[Days]" + "'", str25, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PT60S" + "'", str32, "PT60S");
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(periodType40);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) -1);
        org.joda.time.Weeks weeks4 = period3.toStandardWeeks();
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.weeksIn(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.Weeks weeks8 = org.joda.time.Weeks.weeksIn(readableInterval7);
        boolean boolean9 = weeks6.isLessThan(weeks8);
        org.joda.time.Weeks weeks10 = weeks6.negated();
        org.joda.time.Weeks weeks12 = weeks10.minus((int) (byte) 100);
        org.joda.time.ReadableInterval readableInterval13 = null;
        org.joda.time.Weeks weeks14 = org.joda.time.Weeks.weeksIn(readableInterval13);
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.Weeks weeks16 = org.joda.time.Weeks.weeksIn(readableInterval15);
        boolean boolean17 = weeks14.isLessThan(weeks16);
        org.joda.time.Weeks weeks19 = weeks16.minus((int) (short) -1);
        org.joda.time.Weeks weeks21 = weeks19.multipliedBy(0);
        boolean boolean22 = weeks12.isGreaterThan(weeks21);
        org.joda.time.Period period27 = new org.joda.time.Period(0, (int) '4', (int) (short) 100, (int) (byte) -1);
        org.joda.time.Period period29 = period27.withDays((int) 'a');
        org.joda.time.Weeks weeks30 = period29.toStandardWeeks();
        int int31 = weeks30.getWeeks();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.Weeks weeks33 = org.joda.time.Weeks.weeksIn(readableInterval32);
        org.joda.time.ReadableInterval readableInterval34 = null;
        org.joda.time.Weeks weeks35 = org.joda.time.Weeks.weeksIn(readableInterval34);
        boolean boolean36 = weeks33.isLessThan(weeks35);
        org.joda.time.Weeks weeks38 = weeks35.minus((int) (short) -1);
        org.joda.time.Weeks weeks39 = weeks38.negated();
        org.joda.time.Weeks weeks41 = weeks38.multipliedBy(0);
        boolean boolean42 = weeks30.isGreaterThan(weeks41);
        org.joda.time.Weeks weeks43 = weeks21.minus(weeks30);
        org.joda.time.Weeks weeks45 = weeks30.dividedBy(3);
        org.joda.time.Period period46 = period3.withFields((org.joda.time.ReadablePeriod) weeks45);
        org.joda.time.PeriodType periodType49 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType50 = periodType49.withMonthsRemoved();
        org.joda.time.PeriodType periodType51 = periodType50.withMinutesRemoved();
        org.joda.time.Period period52 = new org.joda.time.Period((long) 54, (long) (-2147483648), periodType50);
        org.joda.time.Chronology chronology53 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period54 = new org.joda.time.Period((java.lang.Object) period3, periodType50, chronology53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 13 + "'", int31 == 13);
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertNotNull(weeks35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(weeks38);
        org.junit.Assert.assertNotNull(weeks39);
        org.junit.Assert.assertNotNull(weeks41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(weeks43);
        org.junit.Assert.assertNotNull(weeks45);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(periodType51);
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType5 = periodType4.withWeeksRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withDaysRemoved();
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', (long) (short) 0, periodType6);
        org.joda.time.Period period8 = new org.joda.time.Period((long) ' ', (long) '#', periodType6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = period8.plusYears(1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Seconds seconds4 = seconds2.dividedBy(32);
        org.joda.time.Seconds seconds5 = seconds4.negated();
        int int6 = seconds5.getSeconds();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (byte) 0, (-2147483648), 100, 60);
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType7 = seconds6.getFieldType();
        org.joda.time.Seconds seconds9 = seconds6.plus(25);
        org.joda.time.Seconds seconds10 = seconds6.negated();
        org.joda.time.PeriodType periodType11 = seconds10.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter12 = periodFormatter2.withParseType(periodType11);
        boolean boolean13 = periodFormatter2.isParser();
        java.util.Locale locale14 = null;
        org.joda.time.format.PeriodFormatter periodFormatter15 = periodFormatter2.withLocale(locale14);
        boolean boolean16 = periodFormatter2.isPrinter();
        java.util.Locale locale17 = null;
        org.joda.time.format.PeriodFormatter periodFormatter18 = periodFormatter2.withLocale(locale17);
        org.joda.time.format.PeriodParser periodParser19 = periodFormatter2.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period21 = periodFormatter2.parsePeriod("PT4H");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(periodFormatter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(periodFormatter18);
        org.junit.Assert.assertNull(periodParser19);
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        org.joda.time.Period period1 = org.joda.time.Period.hours(35);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType33 = weeks11.getFieldType(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period7 = periodFormatter2.parsePeriod("hours");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType2 = periodType1.withMonthsRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withMinutesRemoved();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) (short) 0, periodType2, chronology4);
        org.joda.time.Period period6 = mutablePeriod5.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = period6.plusYears((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = period1.withSeconds((int) ' ');
        int int5 = period4.getSeconds();
        org.joda.time.Period period7 = period4.minusMillis(0);
        org.joda.time.Period period9 = period4.minusHours((int) (byte) 100);
        java.lang.String str10 = period4.toString();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT1M32S" + "'", str10, "PT1M32S");
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("PT1M32S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        org.joda.time.Period period3 = mutablePeriod2.toPeriod();
        int int4 = period3.size();
        org.joda.time.Period period5 = period3.toPeriod();
        org.joda.time.Period period7 = period5.minusDays((int) (short) -1);
        org.joda.time.Period period9 = period7.minusSeconds(3);
        org.joda.time.Period period11 = period9.minusHours(52);
        org.joda.time.format.PeriodPrinter periodPrinter12 = null;
        org.joda.time.format.PeriodParser periodParser13 = null;
        org.joda.time.format.PeriodFormatter periodFormatter14 = new org.joda.time.format.PeriodFormatter(periodPrinter12, periodParser13);
        org.joda.time.format.PeriodParser periodParser15 = periodFormatter14.getParser();
        java.util.Locale locale16 = periodFormatter14.getLocale();
        org.joda.time.PeriodType periodType17 = periodFormatter14.getParseType();
        org.joda.time.Days days18 = org.joda.time.Days.ZERO;
        int int19 = days18.getDays();
        org.joda.time.Period period21 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days22 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period24 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days25 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period24);
        org.joda.time.PeriodType periodType26 = days25.getPeriodType();
        boolean boolean27 = days22.isGreaterThan(days25);
        org.joda.time.Period period29 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days30 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period29);
        org.joda.time.Days days31 = days25.minus(days30);
        org.joda.time.Days days32 = days18.minus(days25);
        org.joda.time.Days days34 = days25.plus((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType36 = days34.getFieldType((int) (short) 0);
        org.joda.time.PeriodType periodType37 = days34.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter38 = periodFormatter14.withParseType(periodType37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = period11.toString(periodFormatter14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNull(periodParser15);
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertNull(periodType17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(periodFormatter38);
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 1, chronology1);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        int int5 = period3.get(durationFieldType4);
        org.joda.time.Period period7 = period3.withMillis((int) (byte) -1);
        org.joda.time.Period period9 = period3.plusMinutes(52);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType13 = periodType12.withHoursRemoved();
        org.joda.time.PeriodType periodType14 = periodType13.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(readableDuration10, readableInstant11, periodType13);
        org.joda.time.Period period16 = period3.normalizedStandard(periodType13);
        org.joda.time.Period period18 = period3.minusHours((int) (byte) -1);
        org.joda.time.Days days22 = org.joda.time.Days.ZERO;
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((java.lang.Object) days22, periodType23, chronology24);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 52, periodType23);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 7, (-60L), periodType23);
        org.joda.time.PeriodType periodType28 = periodType23.withDaysRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period29 = period18.withPeriodType(periodType28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType28);
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Period period7 = duration1.toPeriod();
        org.joda.time.Period period8 = period7.negated();
        org.joda.time.Period period10 = period7.withMillis(100);
        org.joda.time.Period period12 = period10.plusMonths(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes13 = period12.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period6 = period3.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period8 = period6.normalizedStandard(periodType7);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType7);
        org.joda.time.DurationFieldType[] durationFieldTypeArray10 = mutablePeriod9.getFieldTypes();
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod9.copy();
        org.joda.time.DurationFieldType[] durationFieldTypeArray12 = mutablePeriod11.getFieldTypes();
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.forFields(durationFieldTypeArray12);
        org.joda.time.Chronology chronology14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period15 = new org.joda.time.Period((java.lang.Object) periodType13, chronology14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(durationFieldTypeArray10);
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(durationFieldTypeArray12);
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis((long) '#');
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("weeks");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"weeks\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.THREE;
        java.lang.String str1 = weeks0.toString();
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) weeks0);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P3W" + "'", str1, "P3W");
        org.junit.Assert.assertNotNull(minutes2);
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter2.getPrinter();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter2.withLocale(locale5);
        java.util.Locale locale7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter6.withLocale(locale7);
        java.util.Locale locale9 = null;
        org.joda.time.format.PeriodFormatter periodFormatter10 = periodFormatter8.withLocale(locale9);
        boolean boolean11 = periodFormatter10.isPrinter();
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType15 = periodType14.withWeeksRemoved();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = duration13.toPeriod(periodType14, chronology16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType20 = periodType19.withMonthsRemoved();
        org.joda.time.Period period21 = duration13.toPeriodTo(readableInstant18, periodType20);
        org.joda.time.Minutes minutes22 = duration13.toStandardMinutes();
        org.joda.time.Minutes minutes24 = minutes22.multipliedBy((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = periodFormatter10.print((org.joda.time.ReadablePeriod) minutes22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(periodFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(minutes24);
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) 10);
        java.lang.String str5 = duration4.toString();
        org.joda.time.Duration duration7 = duration4.minus((long) (byte) 10);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType10 = minutes9.getPeriodType();
        org.joda.time.PeriodType periodType11 = periodType10.withSecondsRemoved();
        org.joda.time.Period period12 = duration7.toPeriodFrom(readableInstant8, periodType10);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 0, (long) 3, periodType10);
        org.joda.time.PeriodType periodType14 = periodType10.withMonthsRemoved();
        org.joda.time.PeriodType periodType15 = periodType10.withYearsRemoved();
        org.joda.time.Chronology chronology16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period17 = new org.joda.time.Period((java.lang.Object) '4', periodType10, chronology16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT600S" + "'", str5, "PT600S");
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) (short) -1);
        org.joda.time.Period period3 = period1.plusMonths(60);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType2 = minutes1.getPeriodType();
        org.joda.time.PeriodType periodType3 = periodType2.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) 0, periodType3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration5 = new org.joda.time.Duration((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod21 = periodFormatter19.parseMutablePeriod("PT1M");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
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
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (byte) -1);
        int int2 = period1.getSeconds();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter2.getPrinter();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter2.withLocale(locale5);
        java.util.Locale locale7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter6.withLocale(locale7);
        java.util.Locale locale9 = null;
        org.joda.time.format.PeriodFormatter periodFormatter10 = periodFormatter8.withLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod12 = periodFormatter8.parseMutablePeriod("PT0.001S");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(periodFormatter10);
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("weekyears");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"weekyears\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        org.joda.time.Hours hours0 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours2 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean3 = hours0.isGreaterThan(hours2);
        org.joda.time.Duration duration4 = hours2.toStandardDuration();
        org.joda.time.Period period5 = duration4.toPeriod();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) '4', chronology7);
        org.joda.time.Duration duration9 = org.joda.time.Duration.ZERO;
        long long10 = duration9.getStandardDays();
        org.joda.time.Hours hours11 = duration9.toStandardHours();
        long long12 = duration9.getStandardMinutes();
        long long13 = duration9.getStandardDays();
        mutablePeriod8.setPeriod((org.joda.time.ReadableDuration) duration9);
        org.joda.time.Duration duration15 = duration4.plus((org.joda.time.ReadableDuration) duration9);
        org.joda.time.ReadableInstant readableInstant16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval17 = duration15.toIntervalFrom(readableInstant16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(duration15);
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (byte) 100);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType11 = periodType10.withWeeksRemoved();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = duration9.toPeriod(periodType10, chronology12);
        org.joda.time.ReadableInterval readableInterval14 = null;
        org.joda.time.Weeks weeks15 = org.joda.time.Weeks.weeksIn(readableInterval14);
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.Weeks weeks17 = org.joda.time.Weeks.weeksIn(readableInterval16);
        boolean boolean18 = weeks15.isLessThan(weeks17);
        org.joda.time.Weeks weeks20 = weeks17.minus((int) (short) -1);
        org.joda.time.Weeks weeks22 = weeks20.multipliedBy(0);
        org.joda.time.Weeks weeks23 = null;
        boolean boolean24 = weeks20.isLessThan(weeks23);
        int int26 = weeks20.getValue((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Chronology chronology28 = null;
        boolean boolean29 = durationFieldType27.isSupported(chronology28);
        boolean boolean30 = weeks20.isSupported(durationFieldType27);
        org.joda.time.DurationFieldType durationFieldType31 = weeks20.getFieldType();
        boolean boolean32 = periodType10.isSupported(durationFieldType31);
        org.joda.time.PeriodType periodType33 = periodType10.withSecondsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(32, (int) (short) 0, 7, 0, (int) (byte) 100, 0, (int) (short) 0, 600, periodType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(periodType33);
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Period period7 = duration1.toPeriod();
        org.joda.time.Period period8 = period7.negated();
        org.joda.time.Seconds seconds9 = period8.toStandardSeconds();
        org.joda.time.Period period10 = period8.negated();
        int int11 = period10.getHours();
        org.joda.time.Period period13 = period10.minusWeeks(0);
        org.joda.time.Period period14 = period10.normalizedStandard();
        org.joda.time.Period period16 = period14.minusYears((-1073741824));
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.format.PeriodParser periodParser4 = periodFormatter3.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter5 = periodFormatter3.getPrinter();
        boolean boolean6 = periodFormatter3.isParser();
        java.util.Locale locale7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter3.withLocale(locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = org.joda.time.Period.parse("PeriodType[StandardNoYears]", periodFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser4);
        org.junit.Assert.assertNull(periodPrinter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodFormatter8);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds(100);
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.DurationFieldType durationFieldType3 = seconds2.getFieldType();
        boolean boolean4 = seconds1.isGreaterThan(seconds2);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod7.addYears((int) '4');
        org.joda.time.Chronology chronology11 = null;
        mutablePeriod7.add((long) 100, chronology11);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds15 = duration14.toStandardSeconds();
        java.lang.String str16 = seconds15.toString();
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.days();
        boolean boolean18 = seconds15.isSupported(durationFieldType17);
        int int19 = mutablePeriod7.get(durationFieldType17);
        boolean boolean20 = seconds2.isSupported(durationFieldType17);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((java.lang.Object) seconds2, chronology21);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod22.addMillis(658);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PT60S" + "'", str16, "PT60S");
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("YearWeekDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"YearWeekDay\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours((int) (byte) -1);
        org.joda.time.Hours hours3 = hours1.multipliedBy((-1));
        org.joda.time.Hours hours5 = hours3.minus((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType6 = hours5.getFieldType();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableInstant7, readableDuration8);
        mutablePeriod9.setSeconds(8);
        mutablePeriod9.setValue(1, 2);
        org.joda.time.Duration duration17 = new org.joda.time.Duration((-1L), (long) ' ');
        mutablePeriod9.add((org.joda.time.ReadableDuration) duration17);
        mutablePeriod9.clear();
        boolean boolean20 = hours5.equals((java.lang.Object) mutablePeriod9);
        mutablePeriod9.addMinutes(52);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = mutablePeriod9.toDurationFrom(readableInstant23);
        int int25 = mutablePeriod9.getHours();
        mutablePeriod9.addSeconds(5);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType3 = seconds2.getFieldType();
        org.joda.time.Seconds seconds5 = seconds2.plus(25);
        org.joda.time.Seconds seconds6 = null;
        boolean boolean7 = seconds2.isGreaterThan(seconds6);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        org.joda.time.format.PeriodPrinter periodPrinter6 = periodFormatter5.getPrinter();
        org.joda.time.PeriodType periodType7 = periodFormatter5.getParseType();
        java.io.Writer writer8 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period12 = period10.withHours(32);
        org.joda.time.Period period13 = period10.normalizedStandard();
        java.lang.String str14 = period13.toString();
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period16 = period13.normalizedStandard(periodType15);
        org.joda.time.Period period18 = period13.minusHours(3);
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds21 = duration20.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType22 = seconds21.getFieldType();
        org.joda.time.Seconds seconds24 = org.joda.time.Seconds.parseSeconds("P0W");
        org.joda.time.Seconds seconds25 = seconds21.minus(seconds24);
        org.joda.time.Seconds seconds26 = seconds21.negated();
        org.joda.time.Seconds seconds28 = org.joda.time.Seconds.seconds((int) (short) 0);
        org.joda.time.Seconds seconds29 = seconds26.minus(seconds28);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.weekyears();
        java.lang.String str31 = durationFieldType30.getName();
        int int32 = seconds28.get(durationFieldType30);
        org.joda.time.Period period34 = period18.withFieldAdded(durationFieldType30, 0);
        org.joda.time.Seconds seconds35 = period34.toStandardSeconds();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter5.printTo(writer8, (org.joda.time.ReadablePeriod) seconds35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(periodPrinter6);
        org.junit.Assert.assertNull(periodType7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT0.052S" + "'", str14, "PT0.052S");
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "weekyears" + "'", str31, "weekyears");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(seconds35);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        mutablePeriod1.addMinutes(54);
        mutablePeriod1.clear();
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-60), 60L);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType5 = periodType2.getFieldType((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        org.joda.time.Period period1 = org.joda.time.Period.millis(13);
        int int2 = period1.getDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.Period period2 = duration1.toPeriod();
        org.joda.time.Period period3 = period2.toPeriod();
        java.lang.Class<?> wildcardClass4 = period3.getClass();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        org.joda.time.ReadableInstant readableInstant0 = null;
        java.lang.Object obj1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(obj1);
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2);
        org.joda.time.Duration duration4 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = duration4.toPeriod(chronology5);
        org.joda.time.Hours hours7 = duration4.toStandardHours();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType10 = periodType9.withMinutesRemoved();
        org.joda.time.Period period11 = duration4.toPeriodFrom(readableInstant8, periodType9);
        int int12 = duration2.compareTo((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardMinutes((long) 8);
        long long15 = duration14.getStandardMinutes();
        boolean boolean16 = duration4.equals((java.lang.Object) long15);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 8L + "'", long15 == 8L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) (short) 0, periodType3, chronology4);
        java.lang.String str6 = periodType3.toString();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(0L, 0L, periodType3, chronology7);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod8.setMinutes(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PeriodType[YearMonthDay]" + "'", str6, "PeriodType[YearMonthDay]");
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("Minutes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Minutes\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
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
        org.joda.time.Weeks weeks47 = weeks42.minus(60);
        org.joda.time.Weeks weeks49 = weeks47.plus(600);
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
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        org.joda.time.Period period3 = mutablePeriod2.toPeriod();
        int int4 = period3.size();
        org.joda.time.Period period5 = period3.toPeriod();
        org.joda.time.Period period6 = period5.toPeriod();
        org.joda.time.Period period8 = period5.minusWeeks((int) '4');
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.format.PeriodParser periodParser4 = periodFormatter3.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter5 = periodFormatter3.getPrinter();
        java.util.Locale locale6 = null;
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter3.withLocale(locale6);
        java.util.Locale locale8 = periodFormatter3.getLocale();
        boolean boolean9 = periodFormatter3.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod10 = org.joda.time.MutablePeriod.parse("", periodFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser4);
        org.junit.Assert.assertNull(periodPrinter5);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 1, (long) (byte) 100);
        mutablePeriod2.addWeeks(32);
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period3 = period1.plusYears((int) ' ');
        org.joda.time.Period period5 = period1.plusDays((int) (byte) -1);
        org.joda.time.Hours hours6 = org.joda.time.Hours.ONE;
        org.joda.time.DurationFieldType durationFieldType7 = hours6.getFieldType();
        org.joda.time.Period period9 = period1.withField(durationFieldType7, 0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds4 = duration3.toStandardSeconds();
        java.lang.String str5 = seconds4.toString();
        org.joda.time.PeriodType periodType6 = seconds4.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withSecondsRemoved();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) (-1), (long) 100, periodType7, chronology8);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod9.setPeriod((int) (short) 100, 2, (int) (short) -1, 0, 658, (-1073741824), (-60), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT60S" + "'", str5, "PT60S");
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        org.joda.time.Period period2 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period2);
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(readableInstant5, readableDuration6);
        mutablePeriod7.setHours((int) (short) 100);
        boolean boolean10 = periodType4.equals((java.lang.Object) mutablePeriod7);
        org.joda.time.PeriodType periodType11 = periodType4.withYearsRemoved();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 60, periodType11, chronology12);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod13.addHours((-672));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period6 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days7 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period9 = period6.withSeconds((int) ' ');
        org.joda.time.Period period10 = period3.minus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType12 = periodType11.withMonthsRemoved();
        org.joda.time.Period period13 = period10.withPeriodType(periodType11);
        org.joda.time.Period period14 = new org.joda.time.Period((long) (short) 0, (-1L), periodType11);
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.millis();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) (short) 1, periodType16, chronology17);
        boolean boolean19 = periodType11.equals((java.lang.Object) chronology17);
        org.joda.time.PeriodType periodType20 = periodType11.withMillisRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType22 = periodType11.getFieldType((-32));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(periodType20);
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        org.joda.time.Period period1 = org.joda.time.Period.months(25);
        org.joda.time.PeriodType periodType2 = period1.getPeriodType();
        org.joda.time.Period period4 = period1.plusHours((-2));
        int int5 = period4.getMonths();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 25 + "'", int5 == 25);
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod2.addYears((int) '4');
        int int5 = mutablePeriod2.getYears();
        org.joda.time.format.PeriodPrinter periodPrinter6 = null;
        org.joda.time.format.PeriodParser periodParser7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = new org.joda.time.format.PeriodFormatter(periodPrinter6, periodParser7);
        org.joda.time.format.PeriodParser periodParser9 = periodFormatter8.getParser();
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds12 = duration11.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType13 = seconds12.getFieldType();
        org.joda.time.Seconds seconds15 = seconds12.plus(25);
        org.joda.time.Seconds seconds16 = seconds12.negated();
        org.joda.time.PeriodType periodType17 = seconds16.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter18 = periodFormatter8.withParseType(periodType17);
        org.joda.time.format.PeriodPrinter periodPrinter19 = periodFormatter18.getPrinter();
        org.joda.time.format.PeriodParser periodParser20 = periodFormatter18.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter21 = periodFormatter18.getPrinter();
        org.joda.time.PeriodType periodType22 = periodFormatter18.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = mutablePeriod2.toString(periodFormatter18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNull(periodParser9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodFormatter18);
        org.junit.Assert.assertNull(periodPrinter19);
        org.junit.Assert.assertNull(periodParser20);
        org.junit.Assert.assertNull(periodPrinter21);
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        org.joda.time.Period period3 = mutablePeriod2.toPeriod();
        int int4 = period3.size();
        org.joda.time.Period period5 = period3.toPeriod();
        int int6 = period5.getYears();
        org.joda.time.Period period8 = period5.plusWeeks((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(readableInstant9, readableDuration10);
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds14 = duration13.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType15 = seconds14.getFieldType();
        mutablePeriod11.add(durationFieldType15, 52);
        int int18 = period8.get(durationFieldType15);
        org.joda.time.DurationFieldType[] durationFieldTypeArray19 = period8.getFieldTypes();
        org.joda.time.Period period21 = period8.withMinutes(7);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray19);
        org.junit.Assert.assertNotNull(period21);
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
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
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((java.lang.Object) period11);
        mutablePeriod13.addSeconds(0);
        org.joda.time.Hours hours17 = org.joda.time.Hours.hours(25);
        org.joda.time.DurationFieldType durationFieldType18 = hours17.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod13.mergePeriod((org.joda.time.ReadablePeriod) hours17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertNotNull(durationFieldType18);
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 0, (long) 2, chronology2);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType5 = periodType4.withWeeksRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withDaysRemoved();
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.TWO;
        org.joda.time.Duration duration8 = seconds7.toStandardDuration();
        org.joda.time.DurationFieldType durationFieldType9 = seconds7.getFieldType();
        org.joda.time.Chronology chronology10 = null;
        boolean boolean11 = durationFieldType9.isSupported(chronology10);
        int int12 = periodType6.indexOf(durationFieldType9);
        mutablePeriod3.set(durationFieldType9, 10);
        mutablePeriod3.addMinutes((int) (short) 100);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period5 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period5);
        org.joda.time.PeriodType periodType7 = days6.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType8 = null;
        int int9 = periodType7.indexOf(durationFieldType8);
        org.joda.time.PeriodType periodType10 = periodType7.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) '4', (long) 'a', periodType10);
        java.lang.String str12 = periodType10.getName();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType10);
        int int14 = mutablePeriod13.size();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod13.addHours((-672));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Days" + "'", str12, "Days");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) 658);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        int int5 = period3.get(durationFieldType4);
        org.joda.time.Period period7 = period3.withMillis((int) (byte) -1);
        org.joda.time.Period period9 = period3.plusMinutes(52);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType13 = periodType12.withHoursRemoved();
        org.joda.time.PeriodType periodType14 = periodType13.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(readableDuration10, readableInstant11, periodType13);
        org.joda.time.Period period16 = period3.normalizedStandard(periodType13);
        org.joda.time.Period period18 = period3.minusHours((int) (byte) -1);
        org.joda.time.Period period20 = period3.withWeeks((int) (byte) -1);
        int int21 = period3.getSeconds();
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
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
        org.joda.time.Period period16 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days17 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Period period19 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days20 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period19);
        org.joda.time.PeriodType periodType21 = days20.getPeriodType();
        boolean boolean22 = days17.isGreaterThan(days20);
        org.joda.time.Period period24 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days25 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Days days26 = days20.minus(days25);
        org.joda.time.Period period28 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days29 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Days days31 = days29.minus(10);
        org.joda.time.Days days32 = days20.plus(days29);
        org.joda.time.Days days34 = days32.dividedBy(100);
        org.joda.time.Days days35 = null;
        org.joda.time.Days days36 = days34.plus(days35);
        org.joda.time.Days days37 = days34.negated();
        org.joda.time.Days days38 = days0.minus(days34);
        int int39 = days0.getDays();
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
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertNotNull(days37);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        org.joda.time.Period period9 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days10 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Days days11 = days5.minus(days10);
        org.joda.time.Period period13 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days14 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period16 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days17 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period16);
        org.joda.time.PeriodType periodType18 = days17.getPeriodType();
        boolean boolean19 = days14.isGreaterThan(days17);
        org.joda.time.Days days21 = days14.minus(1);
        boolean boolean22 = days5.isGreaterThan(days21);
        int int23 = days5.getDays();
        org.joda.time.Period period25 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days26 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Period period28 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days29 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period28);
        org.joda.time.PeriodType periodType30 = days29.getPeriodType();
        boolean boolean31 = days26.isGreaterThan(days29);
        int int32 = days26.size();
        org.joda.time.Days days33 = days26.negated();
        org.joda.time.Days days35 = days33.minus(3);
        org.joda.time.Days days36 = days35.negated();
        boolean boolean37 = days5.isLessThan(days36);
        org.joda.time.Period period39 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days40 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period39);
        org.joda.time.Period period42 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days43 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period42);
        org.joda.time.PeriodType periodType44 = days43.getPeriodType();
        boolean boolean45 = days40.isGreaterThan(days43);
        org.joda.time.Period period47 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days48 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period47);
        org.joda.time.Days days49 = days43.minus(days48);
        int int50 = days43.size();
        org.joda.time.Days days51 = org.joda.time.Days.ZERO;
        org.joda.time.Period period53 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days54 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period53);
        org.joda.time.Days days56 = days54.minus(10);
        boolean boolean57 = days51.isGreaterThan(days54);
        org.joda.time.Days days58 = days43.minus(days54);
        org.joda.time.Days days59 = days36.plus(days54);
        org.joda.time.Duration duration61 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds62 = duration61.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType63 = seconds62.getFieldType();
        org.joda.time.Seconds seconds65 = seconds62.plus(25);
        org.joda.time.Seconds seconds66 = seconds62.negated();
        org.joda.time.Seconds seconds68 = seconds62.dividedBy(10);
        org.joda.time.DurationFieldType durationFieldType69 = seconds62.getFieldType();
        org.joda.time.PeriodType periodType70 = seconds62.getPeriodType();
        org.joda.time.Chronology chronology71 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period72 = new org.joda.time.Period((java.lang.Object) days59, periodType70, chronology71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertNotNull(days35);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(days40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(days43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(days48);
        org.junit.Assert.assertNotNull(days49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(days51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(days54);
        org.junit.Assert.assertNotNull(days56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(days58);
        org.junit.Assert.assertNotNull(days59);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(seconds62);
        org.junit.Assert.assertNotNull(durationFieldType63);
        org.junit.Assert.assertNotNull(seconds65);
        org.junit.Assert.assertNotNull(seconds66);
        org.junit.Assert.assertNotNull(seconds68);
        org.junit.Assert.assertNotNull(durationFieldType69);
        org.junit.Assert.assertNotNull(periodType70);
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
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
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.days();
        int int16 = weeks14.get(durationFieldType15);
        org.joda.time.Duration duration17 = weeks14.toStandardDuration();
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
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(duration17);
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
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
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        java.lang.Object obj28 = null;
        org.joda.time.Duration duration29 = new org.joda.time.Duration(obj28);
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant27, (org.joda.time.ReadableDuration) duration29);
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant26, (org.joda.time.ReadableDuration) duration29);
        boolean boolean32 = duration25.isLongerThan((org.joda.time.ReadableDuration) duration29);
        long long33 = duration25.getStandardSeconds();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 84326400L + "'", long33 == 84326400L);
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period7 = period4.withSeconds((int) ' ');
        org.joda.time.Period period8 = period1.minus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType10 = periodType9.withMonthsRemoved();
        org.joda.time.Period period11 = period8.withPeriodType(periodType9);
        org.joda.time.Period period13 = period11.plusWeeks((int) (byte) 0);
        org.joda.time.Period period15 = period11.multipliedBy((int) (short) 0);
        int int16 = period15.getYears();
        org.joda.time.Days days17 = org.joda.time.Days.ZERO;
        int int18 = days17.getDays();
        org.joda.time.Period period20 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days21 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Period period23 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days24 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period23);
        org.joda.time.PeriodType periodType25 = days24.getPeriodType();
        boolean boolean26 = days21.isGreaterThan(days24);
        org.joda.time.Period period28 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days29 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Days days30 = days24.minus(days29);
        org.joda.time.Days days31 = days17.minus(days24);
        boolean boolean32 = period15.equals((java.lang.Object) days24);
        java.lang.Class<?> wildcardClass33 = days24.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        org.joda.time.Days days9 = days2.minus(1);
        org.joda.time.Days days11 = days9.dividedBy(60);
        org.joda.time.Duration duration12 = days9.toStandardDuration();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(0L);
        mutablePeriod14.addMonths((int) (byte) -1);
        mutablePeriod14.addYears(8);
        boolean boolean19 = duration12.equals((java.lang.Object) mutablePeriod14);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period22 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days23 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period22);
        org.joda.time.PeriodType periodType24 = days23.getPeriodType();
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(readableInstant25, readableDuration26);
        mutablePeriod27.setHours((int) (short) 100);
        boolean boolean30 = periodType24.equals((java.lang.Object) mutablePeriod27);
        org.joda.time.Duration duration31 = org.joda.time.Duration.ZERO;
        long long32 = duration31.getStandardDays();
        mutablePeriod27.add((org.joda.time.ReadableDuration) duration31);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.PeriodType periodType35 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType36 = periodType35.withWeeksRemoved();
        org.joda.time.PeriodType periodType37 = periodType36.withDaysRemoved();
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration31, readableInstant34, periodType36);
        org.joda.time.PeriodType periodType39 = periodType36.withMonthsRemoved();
        org.joda.time.Period period40 = duration12.toPeriodTo(readableInstant20, periodType39);
        int int41 = periodType39.size();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds3 = duration2.toStandardSeconds();
        java.lang.String str4 = seconds3.toString();
        org.joda.time.PeriodType periodType5 = seconds3.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withDaysRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 52, periodType8, chronology9);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod10.setWeeks((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT60S" + "'", str4, "PT60S");
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period7 = period4.withSeconds((int) ' ');
        org.joda.time.Period period8 = period1.minus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType10 = periodType9.withMonthsRemoved();
        org.joda.time.Period period11 = period8.withPeriodType(periodType9);
        org.joda.time.Days days12 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period14 = period8.plusMonths((-32));
        org.joda.time.Period period16 = period14.minusMillis((int) (short) 0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.millis();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) 1, periodType1, chronology2);
        java.lang.Object obj4 = mutablePeriod3.clone();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "PT0.001S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "PT0.001S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "PT0.001S");
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
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
        org.joda.time.Period period16 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days17 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Period period19 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days20 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period19);
        org.joda.time.PeriodType periodType21 = days20.getPeriodType();
        boolean boolean22 = days17.isGreaterThan(days20);
        org.joda.time.Period period24 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days25 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Days days26 = days20.minus(days25);
        org.joda.time.Days days27 = days0.plus(days26);
        org.joda.time.DurationFieldType durationFieldType28 = days26.getFieldType();
        int int30 = days26.getValue(0);
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
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType7 = seconds6.getFieldType();
        org.joda.time.Seconds seconds9 = seconds6.plus(25);
        org.joda.time.Seconds seconds10 = seconds6.negated();
        org.joda.time.PeriodType periodType11 = seconds10.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter12 = periodFormatter2.withParseType(periodType11);
        org.joda.time.format.PeriodPrinter periodPrinter13 = periodFormatter12.getPrinter();
        org.joda.time.format.PeriodParser periodParser14 = periodFormatter12.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter15 = periodFormatter12.getPrinter();
        org.joda.time.PeriodType periodType16 = periodFormatter12.getParseType();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 13);
        mutablePeriod18.addMonths((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = periodFormatter12.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod18, "PT-52M", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodFormatter12);
        org.junit.Assert.assertNull(periodPrinter13);
        org.junit.Assert.assertNull(periodParser14);
        org.junit.Assert.assertNull(periodPrinter15);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) 0, (long) (byte) 10, periodType2, chronology3);
        org.joda.time.Duration duration5 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = duration5.toPeriod(chronology6);
        org.joda.time.Period period8 = period4.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Weeks weeks9 = period8.toStandardWeeks();
        org.joda.time.PeriodType periodType10 = period8.getPeriodType();
        int int11 = period8.getMonths();
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        org.joda.time.Days days1 = org.joda.time.Days.ZERO;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((java.lang.Object) days1, periodType2, chronology3);
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) 52, periodType2);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod5.setPeriod(3, (-60), (int) (short) 1, 5, (int) ' ', 0, 60, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableInstant4, readableDuration5);
        mutablePeriod6.setHours((int) (short) 100);
        boolean boolean9 = periodType3.equals((java.lang.Object) mutablePeriod6);
        mutablePeriod6.setMillis(32);
        int int12 = mutablePeriod6.getMonths();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter2.getPrinter();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter2.withLocale(locale5);
        java.util.Locale locale7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter6.withLocale(locale7);
        java.util.Locale locale9 = null;
        org.joda.time.format.PeriodFormatter periodFormatter10 = periodFormatter8.withLocale(locale9);
        java.util.Locale locale11 = null;
        org.joda.time.format.PeriodFormatter periodFormatter12 = periodFormatter10.withLocale(locale11);
        org.joda.time.PeriodType periodType13 = periodFormatter10.getParseType();
        java.util.Locale locale14 = periodFormatter10.getLocale();
        boolean boolean15 = periodFormatter10.isParser();
        org.joda.time.Period period17 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days18 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Period period20 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days21 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period20);
        org.joda.time.PeriodType periodType22 = days21.getPeriodType();
        boolean boolean23 = days18.isGreaterThan(days21);
        org.joda.time.MutablePeriod mutablePeriod24 = days18.toMutablePeriod();
        int int25 = mutablePeriod24.getMinutes();
        mutablePeriod24.addMonths((-32));
        mutablePeriod24.setWeeks(25);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = periodFormatter10.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod24, "PT-8H", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(periodFormatter10);
        org.junit.Assert.assertNotNull(periodFormatter12);
        org.junit.Assert.assertNull(periodType13);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(mutablePeriod24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        java.util.Locale locale5 = periodFormatter2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod7 = periodFormatter2.parseMutablePeriod("days");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNull(locale5);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) '#');
        org.junit.Assert.assertNotNull(period1);
    }
}

