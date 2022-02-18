import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test01001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01001");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) 0, (long) (byte) 10, periodType2, chronology3);
        org.joda.time.Duration duration5 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = duration5.toPeriod(chronology6);
        org.joda.time.Period period8 = period4.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period9 = period4.normalizedStandard();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = period4.withWeeks((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test01002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01002");
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
        org.joda.time.Seconds seconds14 = org.joda.time.Seconds.ZERO;
        org.joda.time.Duration duration15 = seconds14.toStandardDuration();
        org.joda.time.Duration duration18 = new org.joda.time.Duration((-1L), (long) ' ');
        boolean boolean19 = duration15.isLongerThan((org.joda.time.ReadableDuration) duration18);
        org.joda.time.Chronology chronology20 = null;
        mutablePeriod13.setPeriod((org.joda.time.ReadableDuration) duration18, chronology20);
        int int22 = mutablePeriod13.getSeconds();
        mutablePeriod13.clear();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod13.addMonths((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test01003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01003");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 1, periodType1);
    }

    @Test
    public void test01004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01004");
        org.joda.time.Hours hours8 = org.joda.time.Hours.FOUR;
        org.joda.time.Duration duration9 = hours8.toStandardDuration();
        org.joda.time.Hours hours11 = hours8.dividedBy((int) ' ');
        org.joda.time.PeriodType periodType12 = hours11.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = new org.joda.time.Period(0, (int) (byte) 100, (int) (byte) 0, (int) (byte) 10, (int) ' ', 54, 0, (-1), periodType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test01005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01005");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (short) -1, (int) '#', (int) ' ', 100);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.days();
        int int6 = mutablePeriod4.get(durationFieldType5);
        org.joda.time.Chronology chronology7 = null;
        boolean boolean8 = durationFieldType5.isSupported(chronology7);
        java.lang.Class<?> wildcardClass9 = durationFieldType5.getClass();
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01006");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("PT3M");
        org.junit.Assert.assertNotNull(minutes1);
    }

    @Test
    public void test01007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01007");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MIN_VALUE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours2 = hours0.minus((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -2147483648 + -52");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
    }

    @Test
    public void test01008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01008");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (short) -1, (int) '#', (int) ' ', 100);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.days();
        int int6 = mutablePeriod4.get(durationFieldType5);
        org.joda.time.Chronology chronology7 = null;
        boolean boolean8 = durationFieldType5.isSupported(chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DurationField durationField10 = durationFieldType5.getField(chronology9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DurationField durationField12 = durationFieldType5.getField(chronology11);
        java.lang.String str13 = durationFieldType5.toString();
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "days" + "'", str13, "days");
    }

    @Test
    public void test01009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01009");
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
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType10);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod12.setMonths(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
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
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test01010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01010");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((java.lang.Object) interval8, chronology11);
        org.joda.time.Seconds seconds13 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.Seconds seconds15 = seconds13.minus(7);
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds18 = duration17.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType19 = seconds18.getFieldType();
        org.joda.time.Seconds seconds21 = org.joda.time.Seconds.parseSeconds("P0W");
        org.joda.time.Seconds seconds22 = seconds18.minus(seconds21);
        int int23 = seconds22.getSeconds();
        org.joda.time.Seconds seconds25 = seconds22.multipliedBy((int) (byte) 0);
        org.joda.time.Seconds seconds26 = seconds15.plus(seconds25);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = seconds26.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(seconds26);
    }

    @Test
    public void test01011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01011");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = period1.withSeconds((int) ' ');
        int int5 = period4.getSeconds();
        org.joda.time.Period period7 = period4.withHours((int) '#');
        org.joda.time.Period period8 = period4.toPeriod();
        org.joda.time.format.PeriodPrinter periodPrinter9 = null;
        org.joda.time.format.PeriodParser periodParser10 = null;
        org.joda.time.format.PeriodFormatter periodFormatter11 = new org.joda.time.format.PeriodFormatter(periodPrinter9, periodParser10);
        org.joda.time.format.PeriodParser periodParser12 = periodFormatter11.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter13 = periodFormatter11.getPrinter();
        java.util.Locale locale14 = null;
        org.joda.time.format.PeriodFormatter periodFormatter15 = periodFormatter11.withLocale(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = period8.toString(periodFormatter11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNull(periodParser12);
        org.junit.Assert.assertNull(periodPrinter13);
        org.junit.Assert.assertNotNull(periodFormatter15);
    }

    @Test
    public void test01012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01012");
        org.joda.time.Days days1 = org.joda.time.Days.days(1);
        org.joda.time.Days days3 = days1.minus(600);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType5 = days1.getFieldType(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
    }

    @Test
    public void test01013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01013");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType2 = periodType1.withDaysRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withMonthsRemoved();
        org.joda.time.Period period4 = new org.joda.time.Period(4L, periodType2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = period4.minusSeconds((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test01014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01014");
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
        java.lang.String str31 = periodType28.toString();
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.weekyears();
        java.lang.String str33 = durationFieldType32.getName();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DurationField durationField35 = durationFieldType32.getField(chronology34);
        int int36 = periodType28.indexOf(durationFieldType32);
        org.joda.time.PeriodType periodType37 = periodType28.withSecondsRemoved();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PeriodType[Seconds]" + "'", str31, "PeriodType[Seconds]");
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "weekyears" + "'", str33, "weekyears");
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(periodType37);
    }

    @Test
    public void test01015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01015");
        java.lang.Object obj0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType2 = periodType1.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(obj0, periodType1);
        org.joda.time.MutablePeriod mutablePeriod4 = mutablePeriod3.copy();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod4.setDays(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(mutablePeriod4);
    }

    @Test
    public void test01016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01016");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Minutes minutes3 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period2);
        org.joda.time.Duration duration6 = new org.joda.time.Duration(0L, 1L);
        org.joda.time.Minutes minutes7 = duration6.toStandardMinutes();
        org.joda.time.Minutes minutes8 = minutes3.plus(minutes7);
        org.joda.time.Minutes minutes10 = minutes8.plus((int) (byte) -1);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes10);
    }

    @Test
    public void test01017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01017");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (byte) 1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01018");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PeriodType[YearWeekDay]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[YearWeekDay]\" is malformed at \"eriodType[YearWeekDay]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01019");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType2 = periodType1.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (-1), periodType2);
        java.lang.String str4 = mutablePeriod3.toString();
        org.joda.time.Hours hours6 = org.joda.time.Hours.hours((int) (byte) -1);
        org.joda.time.Hours hours8 = hours6.multipliedBy((-1));
        org.joda.time.Hours hours10 = hours8.minus((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType11 = hours10.getFieldType();
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(readableInstant12, readableDuration13);
        mutablePeriod14.setSeconds(8);
        mutablePeriod14.setValue(1, 2);
        org.joda.time.Duration duration22 = new org.joda.time.Duration((-1L), (long) ' ');
        mutablePeriod14.add((org.joda.time.ReadableDuration) duration22);
        mutablePeriod14.clear();
        boolean boolean25 = hours10.equals((java.lang.Object) mutablePeriod14);
        mutablePeriod14.addMinutes(52);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = mutablePeriod14.toDurationFrom(readableInstant28);
        mutablePeriod3.add((org.joda.time.ReadableDuration) duration29);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.setPeriod((-1), 8, 7, 60, (-672), (-1073741824), 2147483647, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.001S" + "'", str4, "PT0.001S");
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(duration29);
    }

    @Test
    public void test01020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01020");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.Duration duration3 = duration1.plus((long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        java.lang.Object obj7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(obj7);
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant6, (org.joda.time.ReadableDuration) duration8);
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant5, (org.joda.time.ReadableDuration) duration8);
        org.joda.time.Duration duration11 = duration8.toDuration();
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant4, (org.joda.time.ReadableDuration) duration11);
        boolean boolean13 = duration1.equals((java.lang.Object) readableInstant4);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Seconds seconds15 = org.joda.time.Seconds.TWO;
        org.joda.time.Duration duration16 = seconds15.toStandardDuration();
        org.joda.time.DurationFieldType durationFieldType17 = seconds15.getFieldType();
        org.joda.time.PeriodType periodType18 = seconds15.getPeriodType();
        org.joda.time.Period period19 = duration1.toPeriodTo(readableInstant14, periodType18);
        org.joda.time.Seconds seconds20 = duration1.toStandardSeconds();
        org.joda.time.Duration duration22 = duration1.plus(41L);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(duration22);
    }

    @Test
    public void test01021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01021");
        org.joda.time.Period period1 = org.joda.time.Period.millis(40);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01022");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.ZERO;
        boolean boolean2 = minutes0.isLessThan(minutes1);
        org.joda.time.Minutes minutes4 = minutes1.plus((int) (byte) 0);
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType6 = minutes5.getPeriodType();
        org.joda.time.Minutes minutes7 = minutes4.plus(minutes5);
        int int8 = minutes7.getMinutes();
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType10 = minutes9.getPeriodType();
        int int11 = minutes9.getMinutes();
        java.lang.String str12 = minutes9.toString();
        org.joda.time.Minutes minutes13 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType14 = minutes13.getFieldType();
        java.lang.String str15 = minutes13.toString();
        boolean boolean16 = minutes9.isLessThan(minutes13);
        org.joda.time.Minutes minutes17 = minutes9.negated();
        org.joda.time.Minutes minutes19 = org.joda.time.Minutes.parseMinutes("P0D");
        org.joda.time.Minutes minutes21 = minutes19.dividedBy((int) '#');
        org.joda.time.Minutes minutes22 = minutes9.minus(minutes19);
        boolean boolean23 = minutes7.isGreaterThan(minutes9);
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT0M" + "'", str12, "PT0M");
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT-2147483648M" + "'", str15, "PT-2147483648M");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test01023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01023");
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
        java.util.Locale locale15 = periodFormatter2.getLocale();
        java.io.Writer writer16 = null;
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds19 = duration18.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType20 = seconds19.getFieldType();
        org.joda.time.Seconds seconds22 = seconds19.plus(25);
        org.joda.time.Seconds seconds23 = seconds19.negated();
        org.joda.time.Seconds seconds25 = seconds19.dividedBy(10);
        org.joda.time.Duration duration27 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds28 = duration27.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType29 = seconds28.getFieldType();
        org.joda.time.Seconds seconds31 = seconds28.plus(25);
        org.joda.time.Seconds seconds32 = seconds25.plus(seconds28);
        org.joda.time.Seconds seconds33 = org.joda.time.Seconds.ZERO;
        org.joda.time.PeriodType periodType34 = seconds33.getPeriodType();
        java.lang.String str35 = seconds33.toString();
        org.joda.time.Seconds seconds36 = seconds32.plus(seconds33);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer16, (org.joda.time.ReadablePeriod) seconds36);
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
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PT0S" + "'", str35, "PT0S");
        org.junit.Assert.assertNotNull(seconds36);
    }

    @Test
    public void test01024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01024");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration1 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = duration1.toPeriod(chronology2);
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        java.lang.String str7 = seconds6.toString();
        org.joda.time.PeriodType periodType8 = seconds6.getPeriodType();
        org.joda.time.PeriodType periodType9 = seconds6.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration1, periodType9);
        int int11 = mutablePeriod10.getDays();
        int int12 = mutablePeriod10.getSeconds();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod10.addMonths((-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT60S" + "'", str7, "PT60S");
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test01025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01025");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) 0, (int) (short) -1, (int) ' ', 3, 2, 25, (int) ' ', (int) (short) 100);
        int int9 = mutablePeriod8.getHours();
        mutablePeriod8.setMillis((int) 'a');
        mutablePeriod8.setPeriod((long) 25, (long) (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test01026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01026");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 35, (long) (short) -1);
    }

    @Test
    public void test01027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01027");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("YearMonthDayTime");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"YearMonthDayTime\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01028");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((java.lang.Object) interval8, chronology11);
        org.joda.time.Seconds seconds13 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.Seconds seconds15 = seconds13.minus(7);
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds18 = duration17.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType19 = seconds18.getFieldType();
        org.joda.time.Seconds seconds21 = org.joda.time.Seconds.parseSeconds("P0W");
        org.joda.time.Seconds seconds22 = seconds18.minus(seconds21);
        int int23 = seconds22.getSeconds();
        org.joda.time.Seconds seconds25 = seconds22.multipliedBy((int) (byte) 0);
        org.joda.time.Seconds seconds26 = seconds15.plus(seconds25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType28 = seconds26.getFieldType(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(seconds26);
    }

    @Test
    public void test01029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01029");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes(2147483647);
        org.junit.Assert.assertNotNull(minutes1);
    }

    @Test
    public void test01030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01030");
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.years();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 0, (long) (byte) 10, periodType3, chronology4);
        org.joda.time.Minutes minutes6 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType7 = minutes6.getFieldType();
        boolean boolean8 = periodType3.isSupported(durationFieldType7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(9L, periodType3, chronology9);
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn(readableInterval11);
        org.joda.time.ReadableInterval readableInterval13 = null;
        org.joda.time.Weeks weeks14 = org.joda.time.Weeks.weeksIn(readableInterval13);
        boolean boolean15 = weeks12.isLessThan(weeks14);
        org.joda.time.Weeks weeks16 = weeks12.negated();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((java.lang.Object) weeks12, chronology17);
        org.joda.time.Weeks weeks20 = weeks12.multipliedBy((int) (byte) 1);
        org.joda.time.ReadableInterval readableInterval21 = null;
        org.joda.time.Weeks weeks22 = org.joda.time.Weeks.weeksIn(readableInterval21);
        org.joda.time.ReadableInterval readableInterval23 = null;
        org.joda.time.Weeks weeks24 = org.joda.time.Weeks.weeksIn(readableInterval23);
        boolean boolean25 = weeks22.isLessThan(weeks24);
        org.joda.time.Weeks weeks26 = weeks22.negated();
        org.joda.time.MutablePeriod mutablePeriod27 = weeks26.toMutablePeriod();
        org.joda.time.Weeks weeks28 = weeks12.minus(weeks26);
        org.joda.time.ReadableInterval readableInterval29 = null;
        org.joda.time.Weeks weeks30 = org.joda.time.Weeks.weeksIn(readableInterval29);
        org.joda.time.ReadableInterval readableInterval31 = null;
        org.joda.time.Weeks weeks32 = org.joda.time.Weeks.weeksIn(readableInterval31);
        boolean boolean33 = weeks30.isLessThan(weeks32);
        org.joda.time.Weeks weeks35 = weeks32.minus((int) (short) -1);
        org.joda.time.Weeks weeks37 = weeks35.multipliedBy(0);
        org.joda.time.Weeks weeks38 = null;
        boolean boolean39 = weeks35.isLessThan(weeks38);
        org.joda.time.ReadableInterval readableInterval40 = null;
        org.joda.time.Weeks weeks41 = org.joda.time.Weeks.weeksIn(readableInterval40);
        org.joda.time.ReadableInterval readableInterval42 = null;
        org.joda.time.Weeks weeks43 = org.joda.time.Weeks.weeksIn(readableInterval42);
        boolean boolean44 = weeks41.isLessThan(weeks43);
        org.joda.time.Weeks weeks45 = weeks41.negated();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((java.lang.Object) weeks41, chronology46);
        int[] intArray48 = period47.getValues();
        org.joda.time.DurationFieldType[] durationFieldTypeArray49 = period47.getFieldTypes();
        boolean boolean50 = weeks35.equals((java.lang.Object) durationFieldTypeArray49);
        org.joda.time.Weeks weeks51 = weeks28.minus(weeks35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period52 = period10.plus((org.joda.time.ReadablePeriod) weeks35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(mutablePeriod27);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertNotNull(weeks32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(weeks35);
        org.junit.Assert.assertNotNull(weeks37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(weeks41);
        org.junit.Assert.assertNotNull(weeks43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(weeks45);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[0]");
        org.junit.Assert.assertNotNull(durationFieldTypeArray49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(weeks51);
    }

    @Test
    public void test01031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01031");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ZERO;
        org.joda.time.PeriodType periodType1 = seconds0.getPeriodType();
        java.lang.String str2 = seconds0.toString();
        org.joda.time.Seconds seconds4 = seconds0.plus((int) (short) 1);
        java.lang.String str5 = seconds0.toString();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0S" + "'", str2, "PT0S");
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT0S" + "'", str5, "PT0S");
    }

    @Test
    public void test01032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01032");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(84326400000L);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test01033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01033");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(100L, (long) 7);
    }

    @Test
    public void test01034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01034");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(540000L, (long) '4');
        java.lang.String str3 = mutablePeriod2.toString();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = mutablePeriod2.toDurationTo(readableInstant4);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = mutablePeriod2.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT-8M-59.948S" + "'", str3, "PT-8M-59.948S");
        org.junit.Assert.assertNotNull(duration5);
    }

    @Test
    public void test01035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01035");
        org.joda.time.Period period8 = new org.joda.time.Period((-672), (-2), (-1073741824), (-1073741824), 3, 600, 0, (int) (short) 10);
    }

    @Test
    public void test01036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01036");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((-60L), chronology1);
    }

    @Test
    public void test01037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01037");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod2.addYears((int) '4');
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod2.add((long) 100, chronology6);
        mutablePeriod2.add(1, 10, (int) 'a', 52, (int) (short) 100, 0, (int) (byte) 0, (int) (byte) 10);
        org.joda.time.Seconds seconds18 = org.joda.time.Seconds.seconds(0);
        mutablePeriod2.mergePeriod((org.joda.time.ReadablePeriod) seconds18);
        int int20 = mutablePeriod2.getMonths();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod2);
        mutablePeriod2.addDays((int) (byte) 10);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test01038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01038");
        org.joda.time.Period period1 = org.joda.time.Period.months(1);
        org.joda.time.Period period2 = period1.normalizedStandard();
        org.joda.time.Period period4 = period1.minusYears(13);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test01039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01039");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = period1.withSeconds((int) ' ');
        java.lang.String str5 = period1.toString();
        org.joda.time.Period period7 = period1.withYears(0);
        org.joda.time.Period period9 = period1.withYears((int) (byte) -1);
        org.joda.time.Period period11 = period9.plusMinutes(60);
        int int12 = period11.getYears();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT1M" + "'", str5, "PT1M");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test01040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01040");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period4 = org.joda.time.Period.parse("PT-8M-59.948S", periodFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01041");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) 0, periodType1, chronology2);
        mutablePeriod3.setMonths((int) (byte) 100);
        int[] intArray6 = mutablePeriod3.getValues();
        org.joda.time.Hours hours7 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.PeriodType periodType8 = hours7.getPeriodType();
        int int9 = periodType8.size();
        org.joda.time.Chronology chronology10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((java.lang.Object) intArray6, periodType8, chronology10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: [I");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, 0]");
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test01042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01042");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (short) -1, (int) '#', (int) ' ', 100);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.days();
        int int6 = mutablePeriod4.get(durationFieldType5);
        org.joda.time.Hours hours7 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Hours hours9 = hours7.dividedBy((int) (short) -1);
        org.joda.time.Hours hours10 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours12 = hours10.minus(0);
        org.joda.time.Hours hours13 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours15 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean16 = hours13.isGreaterThan(hours15);
        boolean boolean17 = hours12.isLessThan(hours15);
        java.lang.String str18 = hours12.toString();
        org.joda.time.Hours hours19 = org.joda.time.Hours.ZERO;
        org.joda.time.Hours hours20 = hours12.plus(hours19);
        org.joda.time.Hours hours21 = hours7.minus(hours12);
        org.joda.time.Hours hours23 = hours12.dividedBy(1);
        org.joda.time.Hours hours24 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours25 = hours24.negated();
        org.joda.time.Hours hours26 = org.joda.time.Hours.ONE;
        boolean boolean27 = hours25.isLessThan(hours26);
        org.joda.time.DurationFieldType durationFieldType28 = hours25.getFieldType();
        org.joda.time.Duration duration29 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = duration29.toPeriod(chronology30);
        org.joda.time.Hours hours32 = duration29.toStandardHours();
        org.joda.time.Hours hours33 = hours25.minus(hours32);
        boolean boolean34 = hours12.isGreaterThan(hours25);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) (short) -1, (int) '#', (int) ' ', 100);
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.days();
        int int41 = mutablePeriod39.get(durationFieldType40);
        org.joda.time.Hours hours42 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) mutablePeriod39);
        org.joda.time.Hours hours44 = hours42.dividedBy(3);
        org.joda.time.Hours hours45 = hours44.negated();
        org.joda.time.Duration duration46 = hours45.toStandardDuration();
        boolean boolean47 = hours25.equals((java.lang.Object) hours45);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType49 = hours45.getFieldType((-32));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT4H" + "'", str18, "PT4H");
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(hours24);
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(hours32);
        org.junit.Assert.assertNotNull(hours33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(durationFieldType40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(hours42);
        org.junit.Assert.assertNotNull(hours44);
        org.junit.Assert.assertNotNull(hours45);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test01043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01043");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        org.joda.time.format.PeriodPrinter periodPrinter6 = periodFormatter5.getPrinter();
        org.joda.time.PeriodType periodType7 = periodFormatter5.getParseType();
        boolean boolean8 = periodFormatter5.isPrinter();
        org.joda.time.PeriodType periodType9 = periodFormatter5.getParseType();
        boolean boolean10 = periodFormatter5.isParser();
        org.joda.time.Period period12 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days13 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Period period15 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days16 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period15);
        org.joda.time.PeriodType periodType17 = days16.getPeriodType();
        boolean boolean18 = days13.isGreaterThan(days16);
        org.joda.time.Period period20 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days21 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Days days22 = days16.minus(days21);
        int int23 = days16.size();
        org.joda.time.Days days24 = org.joda.time.Days.ZERO;
        org.joda.time.Period period26 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days27 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period26);
        org.joda.time.Days days29 = days27.minus(10);
        boolean boolean30 = days24.isGreaterThan(days27);
        org.joda.time.Days days31 = days16.minus(days27);
        org.joda.time.Period period33 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period35 = period33.minusWeeks(52);
        org.joda.time.Days days36 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period33);
        org.joda.time.Duration duration37 = days36.toStandardDuration();
        boolean boolean38 = days16.isGreaterThan(days36);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((java.lang.Object) days36);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = periodFormatter5.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod39, "PeriodType[Years]", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(periodPrinter6);
        org.junit.Assert.assertNull(periodType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(periodType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test01044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01044");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = period1.withSeconds((int) ' ');
        java.lang.String str5 = period1.toString();
        org.joda.time.Period period7 = period1.withYears(0);
        org.joda.time.Period period9 = period1.withYears((int) (byte) -1);
        org.joda.time.Period period11 = period9.plusMinutes(60);
        org.joda.time.Period period13 = period11.plusDays(1);
        org.joda.time.Period period14 = period11.normalizedStandard();
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds18 = duration17.toStandardSeconds();
        java.lang.String str19 = seconds18.toString();
        org.joda.time.PeriodType periodType20 = seconds18.getPeriodType();
        org.joda.time.PeriodType periodType21 = seconds18.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 3, periodType21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period23 = period14.normalizedStandard(periodType21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT1M" + "'", str5, "PT1M");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT60S" + "'", str19, "PT60S");
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test01045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01045");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("seconds");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"seconds\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01046");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 8, (long) (-32));
        mutablePeriod2.setYears(40);
    }

    @Test
    public void test01047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01047");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        java.lang.String str7 = duration1.toString();
        long long8 = duration1.getStandardDays();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT60S" + "'", str7, "PT60S");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test01048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01048");
        org.joda.time.Period period8 = new org.joda.time.Period((-1073741824), 60, (-32), (int) '#', (int) (byte) 10, 35, (int) (short) -1, (int) (short) 1);
        org.joda.time.Period period10 = period8.plusHours((int) (short) 100);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test01049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01049");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType2 = periodType1.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (-1), periodType2);
        int int4 = mutablePeriod3.getMinutes();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds7 = duration6.toStandardSeconds();
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds10 = duration9.toStandardSeconds();
        boolean boolean11 = duration6.isLongerThan((org.joda.time.ReadableDuration) duration9);
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds14 = duration13.toStandardSeconds();
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds17 = duration16.toStandardSeconds();
        boolean boolean18 = duration13.isLongerThan((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Period period19 = duration13.toPeriod();
        boolean boolean20 = duration9.isLongerThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = duration9.toPeriodTo(readableInstant21);
        long long23 = duration9.getStandardDays();
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.Period period26 = duration25.toPeriod();
        long long27 = duration25.getStandardSeconds();
        boolean boolean28 = duration9.isEqual((org.joda.time.ReadableDuration) duration25);
        org.joda.time.Duration duration30 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds31 = duration30.toStandardSeconds();
        java.lang.String str32 = seconds31.toString();
        org.joda.time.PeriodType periodType33 = seconds31.getPeriodType();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((java.lang.Object) duration9, periodType33, chronology34);
        org.joda.time.Duration duration37 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds38 = duration37.toStandardSeconds();
        java.lang.String str39 = seconds38.toString();
        org.joda.time.PeriodType periodType40 = seconds38.getPeriodType();
        org.joda.time.PeriodType periodType41 = periodType40.withSecondsRemoved();
        org.joda.time.PeriodType periodType42 = periodType41.withDaysRemoved();
        org.joda.time.Period period43 = duration9.toPeriod(periodType41);
        mutablePeriod3.add((org.joda.time.ReadableDuration) duration9);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.setWeeks(60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-60L) + "'", long27 == (-60L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PT60S" + "'", str32, "PT60S");
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(seconds38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "PT60S" + "'", str39, "PT60S");
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(period43);
    }

    @Test
    public void test01050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01050");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours2 = hours0.minus(0);
        org.joda.time.Hours hours3 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours5 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean6 = hours3.isGreaterThan(hours5);
        boolean boolean7 = hours2.isLessThan(hours5);
        java.lang.String str8 = hours2.toString();
        org.joda.time.Hours hours10 = hours2.dividedBy((int) (short) 10);
        org.joda.time.PeriodType periodType11 = hours10.getPeriodType();
        org.joda.time.Chronology chronology12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((java.lang.Object) periodType11, chronology12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test01051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01051");
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
        org.joda.time.format.PeriodParser periodParser15 = periodFormatter2.getParser();
        java.io.Writer writer16 = null;
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType21 = periodType20.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration18, readableInstant19, periodType20);
        org.joda.time.MutablePeriod mutablePeriod23 = mutablePeriod22.copy();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer16, (org.joda.time.ReadablePeriod) mutablePeriod23);
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
        org.junit.Assert.assertNull(periodType14);
        org.junit.Assert.assertNull(periodParser15);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(mutablePeriod23);
    }

    @Test
    public void test01052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01052");
        org.joda.time.Days days0 = org.joda.time.Days.ZERO;
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((java.lang.Object) days0, periodType1, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.hours();
        int int5 = mutablePeriod3.get(durationFieldType4);
        java.lang.Class<?> wildcardClass6 = durationFieldType4.getClass();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test01053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01053");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis((long) (-60));
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test01054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01054");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(readableInstant5, readableDuration6);
        mutablePeriod7.setPeriod((long) ' ', (long) 52);
        mutablePeriod7.addDays(100);
        org.joda.time.PeriodType periodType13 = mutablePeriod7.getPeriodType();
        org.joda.time.Period period14 = new org.joda.time.Period((long) (short) 0, periodType13);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(readableInstant2, readableInstant3, periodType13);
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType13);
        org.joda.time.Period period18 = period16.plusMonths(13);
        org.joda.time.Duration duration19 = period16.toStandardDuration();
        org.joda.time.Period period20 = period16.negated();
        int int21 = period20.getWeeks();
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test01055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01055");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 7, chronology1);
    }

    @Test
    public void test01056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01056");
        org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT0S");
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
        org.joda.time.Period period24 = new org.joda.time.Period((long) (short) 0, 1L, periodType22);
        boolean boolean25 = duration1.equals((java.lang.Object) 1L);
        org.junit.Assert.assertNotNull(duration1);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test01057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01057");
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
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod10.setDays(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
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
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test01058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01058");
        org.joda.time.Period period4 = new org.joda.time.Period(10, 0, (int) (byte) 10, (int) (byte) 10);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Period period7 = period4.withHours((int) '#');
        org.joda.time.Period period9 = period4.minusMinutes(100);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test01059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01059");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Seconds seconds4 = seconds2.dividedBy(32);
        org.joda.time.Duration duration5 = seconds4.toStandardDuration();
        org.joda.time.Seconds seconds7 = seconds4.dividedBy(13);
        org.joda.time.Seconds seconds9 = seconds4.dividedBy(60);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
    }

    @Test
    public void test01060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01060");
        org.joda.time.Period period2 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period2);
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(readableInstant5, readableDuration6);
        mutablePeriod7.setHours((int) (short) 100);
        boolean boolean10 = periodType4.equals((java.lang.Object) mutablePeriod7);
        org.joda.time.Duration duration11 = org.joda.time.Duration.ZERO;
        long long12 = duration11.getStandardDays();
        mutablePeriod7.add((org.joda.time.ReadableDuration) duration11);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType16 = periodType15.withWeeksRemoved();
        org.joda.time.PeriodType periodType17 = periodType16.withDaysRemoved();
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration11, readableInstant14, periodType16);
        java.lang.String str19 = periodType16.getName();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) (short) -1, periodType16, chronology20);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod21.setValue(7, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Millis" + "'", str19, "Millis");
    }

    @Test
    public void test01061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01061");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter2.getPrinter();
        boolean boolean5 = periodFormatter2.isParser();
        boolean boolean6 = periodFormatter2.isParser();
        org.joda.time.MutablePeriod mutablePeriod8 = org.joda.time.MutablePeriod.parse("PT0S");
        mutablePeriod8.setDays((int) (byte) 100);
        org.joda.time.Chronology chronology12 = null;
        mutablePeriod8.add((-7L), chronology12);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod8, "P-1DT1M", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(mutablePeriod8);
    }

    @Test
    public void test01062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01062");
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
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(readableInstant19, readableDuration20);
        mutablePeriod21.setPeriod((long) ' ', (long) 52);
        mutablePeriod21.setPeriod((long) (short) -1);
        org.joda.time.Days days27 = org.joda.time.Days.ZERO;
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((java.lang.Object) days27, periodType28, chronology29);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((int) (short) -1, (int) '#', (int) ' ', 100);
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.days();
        int int37 = mutablePeriod35.get(durationFieldType36);
        org.joda.time.Chronology chronology38 = null;
        boolean boolean39 = durationFieldType36.isSupported(chronology38);
        mutablePeriod30.add(durationFieldType36, (int) (short) -1);
        mutablePeriod21.add(durationFieldType36, 8);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = periodFormatter18.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod21, "Years", (-672));
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
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test01063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01063");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        java.util.Locale locale3 = periodFormatter2.getLocale();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType6 = minutes5.getPeriodType();
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes8 = minutes5.plus(minutes7);
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.ZERO;
        boolean boolean11 = minutes9.isLessThan(minutes10);
        boolean boolean12 = minutes5.isLessThan(minutes9);
        int int13 = minutes5.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 25);
        org.joda.time.Minutes minutes16 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) mutablePeriod15);
        int int17 = minutes16.getMinutes();
        boolean boolean18 = minutes5.isGreaterThan(minutes16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = periodFormatter2.print((org.joda.time.ReadablePeriod) minutes16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test01064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01064");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("PeriodType[Millis]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[Millis]\" is malformed at \"eriodType[Millis]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01065");
        org.joda.time.Hours hours0 = org.joda.time.Hours.TWO;
        int int1 = hours0.getHours();
        org.joda.time.Hours hours2 = hours0.negated();
        org.joda.time.Minutes minutes3 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType4 = minutes3.getPeriodType();
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes6 = minutes3.plus(minutes5);
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes8 = org.joda.time.Minutes.ZERO;
        boolean boolean9 = minutes7.isLessThan(minutes8);
        boolean boolean10 = minutes3.isLessThan(minutes7);
        org.joda.time.Minutes minutes12 = minutes7.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes13 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType14 = minutes13.getFieldType();
        org.joda.time.PeriodType periodType15 = minutes13.getPeriodType();
        org.joda.time.Minutes minutes16 = minutes12.plus(minutes13);
        org.joda.time.PeriodType periodType17 = minutes12.getPeriodType();
        org.joda.time.PeriodType periodType18 = minutes12.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = new org.joda.time.Period((java.lang.Object) hours0, periodType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
    }

    @Test
    public void test01066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01066");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(0L);
        mutablePeriod1.addMillis((int) (short) 10);
        mutablePeriod1.setWeeks(2);
    }

    @Test
    public void test01067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01067");
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
        org.joda.time.Weeks weeks14 = weeks6.dividedBy((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType16 = weeks14.getFieldType(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test01068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01068");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.secondsIn(readableInterval0);
        int int2 = seconds1.getSeconds();
        org.joda.time.Seconds seconds4 = seconds1.dividedBy(32);
        int int5 = seconds4.getSeconds();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test01069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01069");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.TWO;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = new org.joda.time.Duration((java.lang.Object) minutes0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.Minutes");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
    }

    @Test
    public void test01070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01070");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType2 = periodType1.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (-1), periodType2);
        org.joda.time.MutablePeriod mutablePeriod4 = mutablePeriod3.copy();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod4.addHours(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(mutablePeriod4);
    }

    @Test
    public void test01071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01071");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("Minutes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Minutes\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01072");
        org.joda.time.Duration duration1 = new org.joda.time.Duration(600000L);
        java.lang.String str2 = duration1.toString();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType9 = periodType8.withWeeksRemoved();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = duration7.toPeriod(periodType8, chronology10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType14 = periodType13.withMonthsRemoved();
        org.joda.time.Period period15 = duration7.toPeriodTo(readableInstant12, periodType14);
        org.joda.time.Duration duration16 = duration7.toDuration();
        org.joda.time.Period period18 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days19 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period18);
        org.joda.time.PeriodType periodType20 = days19.getPeriodType();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(readableInstant21, readableDuration22);
        mutablePeriod23.setHours((int) (short) 100);
        boolean boolean26 = periodType20.equals((java.lang.Object) mutablePeriod23);
        org.joda.time.Duration duration27 = org.joda.time.Duration.ZERO;
        long long28 = duration27.getStandardDays();
        mutablePeriod23.add((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType32 = periodType31.withWeeksRemoved();
        org.joda.time.PeriodType periodType33 = periodType32.withDaysRemoved();
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration27, readableInstant30, periodType32);
        boolean boolean35 = duration7.isEqual((org.joda.time.ReadableDuration) duration27);
        long long36 = duration7.getStandardSeconds();
        org.joda.time.PeriodType periodType37 = org.joda.time.PeriodType.hours();
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant5, (org.joda.time.ReadableDuration) duration7, periodType37);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) (-32), periodType37);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, readableInstant3, periodType37);
        org.joda.time.PeriodType periodType41 = periodType37.withSecondsRemoved();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT600S" + "'", str2, "PT600S");
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-60L) + "'", long36 == (-60L));
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(periodType41);
    }

    @Test
    public void test01073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01073");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT2H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PT2H\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01074");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.ZERO;
        org.joda.time.PeriodType periodType4 = seconds3.getPeriodType();
        int int5 = periodType4.size();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableInstant1, readableInstant2, periodType4);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((-3600000L), periodType4);
        mutablePeriod7.add((long) 2);
        int[] intArray10 = mutablePeriod7.getValues();
        org.joda.time.Period period12 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (short) -1, (-1L), chronology15);
        org.joda.time.Days days17 = org.joda.time.Days.ZERO;
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((java.lang.Object) days17, periodType18, chronology19);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((int) (short) -1, (int) '#', (int) ' ', 100);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.days();
        int int27 = mutablePeriod25.get(durationFieldType26);
        org.joda.time.Chronology chronology28 = null;
        boolean boolean29 = durationFieldType26.isSupported(chronology28);
        mutablePeriod20.add(durationFieldType26, (int) (short) -1);
        java.lang.String str32 = durationFieldType26.getName();
        java.lang.String str33 = durationFieldType26.toString();
        boolean boolean34 = period16.isSupported(durationFieldType26);
        int int35 = period12.indexOf(durationFieldType26);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod7.add(durationFieldType26, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-3600]");
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "days" + "'", str32, "days");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "days" + "'", str33, "days");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
    }

    @Test
    public void test01075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01075");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((-1L), (long) ' ');
        org.joda.time.Minutes minutes3 = duration2.toStandardMinutes();
        org.junit.Assert.assertNotNull(minutes3);
    }

    @Test
    public void test01076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01076");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("P-2147483648W");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01077");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.PeriodType periodType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period3 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01078");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds4 = duration3.toStandardSeconds();
        java.lang.String str5 = seconds4.toString();
        org.joda.time.PeriodType periodType6 = seconds4.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withSecondsRemoved();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) '4', (-60L), periodType6);
        mutablePeriod8.setSeconds(600);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT60S" + "'", str5, "PT60S");
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test01079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01079");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType2);
        int int4 = period3.getMillis();
        org.joda.time.Period period6 = period3.plusDays((int) 'a');
        org.joda.time.Period period8 = period3.minusMillis((-32));
        org.joda.time.Period period9 = period3.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod10 = period9.toMutablePeriod();
        org.joda.time.Period period12 = period9.minusMinutes((-1073741824));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 25 + "'", int4 == 25);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test01080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01080");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        org.joda.time.Period period3 = mutablePeriod2.toPeriod();
        mutablePeriod2.addMinutes(25);
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod2.add((long) 32, chronology7);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = mutablePeriod2.getValue((-672));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -672");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test01081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01081");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (-672), (long) (-2147483648));
        mutablePeriod2.setPeriod(2147483647, (int) (short) 0, (-672), 8, 32, 60, (-32), (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = mutablePeriod2.getValue(13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01082");
        org.joda.time.Days days0 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.Days days2 = days0.minus(25);
        org.joda.time.Days days3 = days2.negated();
        org.joda.time.Duration duration4 = days2.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes5 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) days2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 3092376415680");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test01083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01083");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter2.getPrinter();
        boolean boolean5 = periodFormatter2.isParser();
        java.util.Locale locale6 = null;
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withLocale(locale6);
        java.util.Locale locale8 = periodFormatter2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod10 = periodFormatter2.parseMutablePeriod("weekyears");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNull(locale8);
    }

    @Test
    public void test01084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01084");
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
        org.joda.time.Weeks weeks17 = weeks14.plus((int) (byte) -1);
        org.joda.time.Weeks weeks18 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks20 = weeks18.dividedBy(52);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DurationField durationField23 = durationFieldType21.getField(chronology22);
        boolean boolean24 = weeks18.isSupported(durationFieldType21);
        org.joda.time.DurationFieldType durationFieldType25 = weeks18.getFieldType();
        boolean boolean26 = weeks14.isGreaterThan(weeks18);
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
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test01085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01085");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Period period7 = duration1.toPeriod();
        org.joda.time.Period period8 = period7.negated();
        org.joda.time.Period period10 = period7.withMillis(100);
        org.joda.time.Period period12 = period7.minusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationFrom(readableInstant13);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration14);
    }

    @Test
    public void test01086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01086");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = period1.withSeconds((int) ' ');
        java.lang.String str5 = period1.toString();
        int int6 = period1.getMinutes();
        int int7 = period1.getDays();
        int[] intArray8 = period1.getValues();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT1M" + "'", str5, "PT1M");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 0, 0, 1, 0, 0]");
    }

    @Test
    public void test01087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01087");
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
        org.joda.time.PeriodType periodType20 = periodType18.withYearsRemoved();
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
        org.junit.Assert.assertNotNull(periodType20);
    }

    @Test
    public void test01088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01088");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("P3D");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01089");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        boolean boolean4 = weeks1.isLessThan(weeks3);
        org.joda.time.Weeks weeks5 = weeks1.negated();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) weeks1, chronology6);
        org.joda.time.Period period8 = weeks1.toPeriod();
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Weeks weeks10 = org.joda.time.Weeks.weeksIn(readableInterval9);
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn(readableInterval11);
        boolean boolean13 = weeks10.isLessThan(weeks12);
        org.joda.time.Weeks weeks14 = weeks10.negated();
        org.joda.time.Weeks weeks16 = weeks14.minus((int) (byte) 100);
        org.joda.time.ReadableInterval readableInterval17 = null;
        org.joda.time.Weeks weeks18 = org.joda.time.Weeks.weeksIn(readableInterval17);
        org.joda.time.ReadableInterval readableInterval19 = null;
        org.joda.time.Weeks weeks20 = org.joda.time.Weeks.weeksIn(readableInterval19);
        boolean boolean21 = weeks18.isLessThan(weeks20);
        org.joda.time.Weeks weeks23 = weeks20.minus((int) (short) -1);
        org.joda.time.Weeks weeks25 = weeks23.multipliedBy(0);
        boolean boolean26 = weeks16.isGreaterThan(weeks25);
        org.joda.time.Period period31 = new org.joda.time.Period(0, (int) '4', (int) (short) 100, (int) (byte) -1);
        org.joda.time.Period period33 = period31.withDays((int) 'a');
        org.joda.time.Weeks weeks34 = period33.toStandardWeeks();
        int int35 = weeks34.getWeeks();
        org.joda.time.ReadableInterval readableInterval36 = null;
        org.joda.time.Weeks weeks37 = org.joda.time.Weeks.weeksIn(readableInterval36);
        org.joda.time.ReadableInterval readableInterval38 = null;
        org.joda.time.Weeks weeks39 = org.joda.time.Weeks.weeksIn(readableInterval38);
        boolean boolean40 = weeks37.isLessThan(weeks39);
        org.joda.time.Weeks weeks42 = weeks39.minus((int) (short) -1);
        org.joda.time.Weeks weeks43 = weeks42.negated();
        org.joda.time.Weeks weeks45 = weeks42.multipliedBy(0);
        boolean boolean46 = weeks34.isGreaterThan(weeks45);
        org.joda.time.Weeks weeks47 = weeks25.minus(weeks34);
        org.joda.time.ReadableInterval readableInterval48 = null;
        org.joda.time.Weeks weeks49 = org.joda.time.Weeks.weeksIn(readableInterval48);
        org.joda.time.Weeks weeks51 = weeks49.multipliedBy((int) (byte) 100);
        org.joda.time.Weeks weeks52 = weeks34.plus(weeks51);
        org.joda.time.Weeks weeks54 = weeks51.multipliedBy((int) 'a');
        org.joda.time.ReadableInterval readableInterval55 = null;
        org.joda.time.Weeks weeks56 = org.joda.time.Weeks.weeksIn(readableInterval55);
        org.joda.time.ReadableInterval readableInterval57 = null;
        org.joda.time.Weeks weeks58 = org.joda.time.Weeks.weeksIn(readableInterval57);
        boolean boolean59 = weeks56.isLessThan(weeks58);
        org.joda.time.Weeks weeks60 = weeks56.negated();
        org.joda.time.Weeks weeks62 = weeks60.minus((int) (byte) 100);
        org.joda.time.Weeks weeks63 = weeks54.minus(weeks60);
        org.joda.time.Weeks weeks65 = weeks60.plus(13);
        org.joda.time.Duration duration66 = weeks60.toStandardDuration();
        org.joda.time.Weeks weeks67 = weeks1.minus(weeks60);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(weeks34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 13 + "'", int35 == 13);
        org.junit.Assert.assertNotNull(weeks37);
        org.junit.Assert.assertNotNull(weeks39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(weeks42);
        org.junit.Assert.assertNotNull(weeks43);
        org.junit.Assert.assertNotNull(weeks45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(weeks47);
        org.junit.Assert.assertNotNull(weeks49);
        org.junit.Assert.assertNotNull(weeks51);
        org.junit.Assert.assertNotNull(weeks52);
        org.junit.Assert.assertNotNull(weeks54);
        org.junit.Assert.assertNotNull(weeks56);
        org.junit.Assert.assertNotNull(weeks58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(weeks60);
        org.junit.Assert.assertNotNull(weeks62);
        org.junit.Assert.assertNotNull(weeks63);
        org.junit.Assert.assertNotNull(weeks65);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(weeks67);
    }

    @Test
    public void test01090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01090");
        org.joda.time.Days days1 = org.joda.time.Days.days((-1073741824));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours2 = days1.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1073741824 * 24");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test01091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01091");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ZERO;
        org.joda.time.PeriodType periodType1 = seconds0.getPeriodType();
        java.lang.String str2 = seconds0.toString();
        org.joda.time.Seconds seconds4 = seconds0.plus((int) (short) 1);
        org.joda.time.Seconds seconds6 = seconds4.dividedBy((int) '4');
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0S" + "'", str2, "PT0S");
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
    }

    @Test
    public void test01092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01092");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes(600000L);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test01093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01093");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 32, 600000L);
        org.joda.time.Chronology chronology4 = null;
        mutablePeriod2.add((long) 35, chronology4);
    }

    @Test
    public void test01094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01094");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period7 = period4.withSeconds((int) ' ');
        org.joda.time.Period period8 = period1.minus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period10 = period1.plusHours((-1));
        org.joda.time.Period period12 = period1.withDays((int) 'a');
        org.joda.time.Period period14 = period12.withSeconds(52);
        int int15 = period12.getMillis();
        org.joda.time.Period period17 = period12.minusYears(0);
        int int18 = period12.getYears();
        org.joda.time.Period period20 = period12.plusMinutes(60);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod23.addYears((int) '4');
        int int26 = mutablePeriod23.getYears();
        org.joda.time.Chronology chronology28 = null;
        mutablePeriod23.add(1L, chronology28);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.weekyears();
        java.lang.String str31 = durationFieldType30.getName();
        java.lang.String str32 = durationFieldType30.getName();
        mutablePeriod23.set(durationFieldType30, 0);
        boolean boolean35 = period20.isSupported(durationFieldType30);
        int int37 = period20.getValue(0);
        int int38 = period20.getDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "weekyears" + "'", str31, "weekyears");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "weekyears" + "'", str32, "weekyears");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
    }

    @Test
    public void test01095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01095");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.Duration duration3 = duration1.plus((long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = duration3.toPeriodTo(readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Hours hours7 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours9 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean10 = hours7.isGreaterThan(hours9);
        org.joda.time.Duration duration11 = hours9.toStandardDuration();
        org.joda.time.Duration duration12 = duration11.toDuration();
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.hours();
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant6, (org.joda.time.ReadableDuration) duration11, periodType13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = duration3.toPeriod(periodType13, chronology15);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test01096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01096");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType6 = minutes5.getFieldType();
        org.joda.time.PeriodType periodType7 = minutes5.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter2.withParseType(periodType7);
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.ZERO;
        org.joda.time.Seconds seconds11 = seconds9.dividedBy((int) (byte) 1);
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds14 = duration13.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType15 = seconds14.getFieldType();
        org.joda.time.Seconds seconds17 = seconds14.plus(25);
        org.joda.time.Seconds seconds18 = seconds14.negated();
        org.joda.time.Seconds seconds19 = org.joda.time.Seconds.MIN_VALUE;
        org.joda.time.Seconds seconds20 = seconds14.plus(seconds19);
        org.joda.time.Duration duration21 = seconds19.toStandardDuration();
        org.joda.time.Seconds seconds22 = seconds9.plus(seconds19);
        org.joda.time.Seconds seconds24 = seconds19.plus((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = periodFormatter8.print((org.joda.time.ReadablePeriod) seconds24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(seconds24);
    }

    @Test
    public void test01097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01097");
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
        java.util.Locale locale13 = periodFormatter12.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period15 = periodFormatter12.parsePeriod("PT1S");
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
        org.junit.Assert.assertNull(locale13);
    }

    @Test
    public void test01098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01098");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationTo(readableInstant6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = period5.minusSeconds((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(duration7);
    }

    @Test
    public void test01099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01099");
        org.joda.time.Period period1 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period3 = period1.withHours(32);
        org.joda.time.Hours hours4 = period1.toStandardHours();
        org.joda.time.Hours hours5 = hours4.negated();
        org.joda.time.Hours hours6 = hours5.negated();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours6);
    }

    @Test
    public void test01100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01100");
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
        long long13 = duration12.getStandardSeconds();
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-60L) + "'", long13 == (-60L));
    }

    @Test
    public void test01101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01101");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, readableInstant2, periodType3);
        org.joda.time.MutablePeriod mutablePeriod6 = mutablePeriod5.copy();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds9 = duration8.toStandardSeconds();
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds12 = duration11.toStandardSeconds();
        boolean boolean13 = duration8.isLongerThan((org.joda.time.ReadableDuration) duration11);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType16 = periodType15.withMinutesRemoved();
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration11, readableInstant14, periodType15);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Interval interval19 = duration11.toIntervalFrom(readableInstant18);
        mutablePeriod6.add((org.joda.time.ReadableInterval) interval19);
        int int21 = mutablePeriod6.size();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod6.setMinutes(13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test01102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01102");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT1H");
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01103");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) -1);
        org.joda.time.format.PeriodPrinter periodPrinter4 = null;
        org.joda.time.format.PeriodParser periodParser5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = new org.joda.time.format.PeriodFormatter(periodPrinter4, periodParser5);
        org.joda.time.format.PeriodParser periodParser7 = periodFormatter6.getParser();
        java.util.Locale locale8 = null;
        org.joda.time.format.PeriodFormatter periodFormatter9 = periodFormatter6.withLocale(locale8);
        java.util.Locale locale10 = periodFormatter6.getLocale();
        java.util.Locale locale11 = null;
        org.joda.time.format.PeriodFormatter periodFormatter12 = periodFormatter6.withLocale(locale11);
        org.joda.time.format.PeriodPrinter periodPrinter13 = periodFormatter6.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = period1.toString(periodFormatter6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNull(periodParser7);
        org.junit.Assert.assertNotNull(periodFormatter9);
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(periodFormatter12);
        org.junit.Assert.assertNull(periodPrinter13);
    }

    @Test
    public void test01104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01104");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter2.getPrinter();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter2.withLocale(locale5);
        java.util.Locale locale7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter6.withLocale(locale7);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.hours();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(periodType9);
        org.joda.time.format.PeriodFormatter periodFormatter11 = periodFormatter6.withParseType(periodType9);
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.Period period14 = org.joda.time.Period.weeks((-1073741824));
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter6.printTo(stringBuffer12, (org.joda.time.ReadablePeriod) period14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodFormatter11);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test01105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01105");
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
        java.lang.String str14 = seconds13.toString();
        org.joda.time.PeriodType periodType15 = seconds13.getPeriodType();
        org.joda.time.PeriodType periodType16 = periodType15.withSecondsRemoved();
        org.joda.time.PeriodType periodType17 = periodType16.withDaysRemoved();
        org.joda.time.PeriodType periodType18 = periodType17.withWeeksRemoved();
        org.joda.time.PeriodType periodType19 = periodType17.withWeeksRemoved();
        org.joda.time.Chronology chronology20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((java.lang.Object) int10, periodType17, chronology20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT60S" + "'", str14, "PT60S");
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test01106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01106");
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
        org.joda.time.Period period45 = period43.plusMinutes(8);
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
        org.junit.Assert.assertNotNull(period45);
    }

    @Test
    public void test01107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01107");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period3 = period1.plusYears((int) ' ');
        org.joda.time.Period period5 = period1.plusDays((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.Period period11 = duration10.toPeriod();
        long long12 = duration10.getStandardSeconds();
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds15 = duration14.toStandardSeconds();
        java.lang.String str16 = seconds15.toString();
        org.joda.time.PeriodType periodType17 = seconds15.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(readableInstant8, (org.joda.time.ReadableDuration) duration10, periodType17);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableInstant6, readableInstant7, periodType17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = period1.withPeriodType(periodType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-60L) + "'", long12 == (-60L));
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PT60S" + "'", str16, "PT60S");
        org.junit.Assert.assertNotNull(periodType17);
    }

    @Test
    public void test01108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01108");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        org.joda.time.Period period3 = mutablePeriod2.toPeriod();
        org.joda.time.Period period5 = period3.withHours(0);
        int int6 = period3.getWeeks();
        org.joda.time.Period period8 = period3.plusSeconds((int) (byte) 100);
        org.joda.time.Weeks weeks9 = period3.toStandardWeeks();
        int int10 = period3.getMillis();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test01109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01109");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType2 = periodType1.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (-1), periodType2);
        int int4 = mutablePeriod3.getSeconds();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) ' ', (int) (byte) 10, 1, (int) (byte) 10, (int) (short) 100, (int) (short) 100, 52, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        mutablePeriod13.setPeriod(readableInstant14, readableInstant15);
        mutablePeriod3.add((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.Period period19 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period21 = period19.plusYears((int) ' ');
        org.joda.time.ReadableInterval readableInterval22 = null;
        org.joda.time.Weeks weeks23 = org.joda.time.Weeks.weeksIn(readableInterval22);
        org.joda.time.ReadableInterval readableInterval24 = null;
        org.joda.time.Weeks weeks25 = org.joda.time.Weeks.weeksIn(readableInterval24);
        boolean boolean26 = weeks23.isLessThan(weeks25);
        org.joda.time.Weeks weeks27 = weeks23.negated();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((java.lang.Object) weeks23, chronology28);
        boolean boolean30 = period21.equals((java.lang.Object) period29);
        org.joda.time.Period period32 = period21.plusYears(10);
        org.joda.time.Period period34 = period21.plusMonths((int) (byte) 100);
        org.joda.time.Period period36 = period34.withHours((int) (short) 0);
        org.joda.time.Period period38 = period34.withSeconds(3);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.mergePeriod((org.joda.time.ReadablePeriod) period38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
    }

    @Test
    public void test01110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01110");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType1 = minutes0.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds2 = minutes0.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2147483648 * 60");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(durationFieldType1);
    }

    @Test
    public void test01111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01111");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(4);
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
    public void test01112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01112");
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
        mutablePeriod2.setDays((int) (short) -1);
        mutablePeriod2.addYears((int) (short) 1);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(durationFieldType12);
    }

    @Test
    public void test01113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01113");
        org.joda.time.Period period4 = new org.joda.time.Period(7, 1, 600, 7);
        int int5 = period4.getMonths();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(periodType7);
        org.joda.time.Period period9 = new org.joda.time.Period((long) 2147483647, periodType7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = period4.withPeriodType(periodType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test01114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01114");
        org.joda.time.Period period1 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period3 = period1.withHours(32);
        org.joda.time.Period period5 = period3.minusYears(3);
        org.joda.time.Period period7 = period5.minusMillis(100);
        org.joda.time.Period period9 = period7.withWeeks((-2147483648));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration10 = new org.joda.time.Duration((java.lang.Object) period9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test01115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01115");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1);
        org.joda.time.format.PeriodFormatter periodFormatter3 = null;
        java.lang.String str4 = mutablePeriod2.toString(periodFormatter3);
        int int5 = mutablePeriod2.getMillis();
        int int6 = mutablePeriod2.getYears();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0S" + "'", str4, "PT0S");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test01116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01116");
        org.joda.time.Period period4 = new org.joda.time.Period((int) 'a', (int) (byte) 10, (-1), 60);
    }

    @Test
    public void test01117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01117");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("PT1M32S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01118");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        java.lang.Object obj2 = null;
        org.joda.time.Duration duration3 = new org.joda.time.Duration(obj2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Duration duration6 = duration3.toDuration();
        java.lang.Class<?> wildcardClass7 = duration3.getClass();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01119");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType26 = weeks14.getFieldType(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test01120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01120");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = new org.joda.time.Period(2147483647, 32, (-672), 54, (int) (byte) 1, 32, (int) (short) 1, (int) (byte) 100, periodType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test01121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01121");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        boolean boolean6 = periodFormatter2.isPrinter();
        java.io.Writer writer7 = null;
        org.joda.time.Period period9 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days10 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period12 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days13 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period12);
        org.joda.time.PeriodType periodType14 = days13.getPeriodType();
        boolean boolean15 = days10.isGreaterThan(days13);
        int int16 = days10.size();
        org.joda.time.Days days17 = days10.negated();
        org.joda.time.Days days19 = days17.minus(3);
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
        org.joda.time.Days days36 = days27.plus((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType38 = days36.getFieldType((int) (short) 0);
        boolean boolean39 = days19.isLessThan(days36);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer7, (org.joda.time.ReadablePeriod) days36);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days19);
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
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test01122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01122");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType1 = periodType0.withDaysRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withMonthsRemoved();
        org.joda.time.Days days5 = org.joda.time.Days.ZERO;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((java.lang.Object) days5, periodType6, chronology7);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 60, (long) (byte) 100, periodType6);
        org.joda.time.PeriodType periodType10 = periodType6.withMonthsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) periodType1, periodType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test01123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01123");
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
        java.lang.StringBuffer stringBuffer13 = null;
        org.joda.time.Period period15 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days16 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period15);
        org.joda.time.PeriodType periodType17 = days16.getPeriodType();
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(readableInstant18, readableDuration19);
        mutablePeriod20.setHours((int) (short) 100);
        boolean boolean23 = periodType17.equals((java.lang.Object) mutablePeriod20);
        org.joda.time.Duration duration24 = org.joda.time.Duration.ZERO;
        long long25 = duration24.getStandardDays();
        mutablePeriod20.add((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Period period28 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days29 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period28);
        org.joda.time.PeriodType periodType30 = days29.getPeriodType();
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(readableInstant31, readableDuration32);
        mutablePeriod33.setHours((int) (short) 100);
        boolean boolean36 = periodType30.equals((java.lang.Object) mutablePeriod33);
        org.joda.time.Duration duration37 = org.joda.time.Duration.ZERO;
        long long38 = duration37.getStandardDays();
        mutablePeriod33.add((org.joda.time.ReadableDuration) duration37);
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType42);
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.weekyears();
        int int45 = period43.get(durationFieldType44);
        int int46 = mutablePeriod33.get(durationFieldType44);
        int int47 = mutablePeriod20.get(durationFieldType44);
        mutablePeriod20.setSeconds(100);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter10.printTo(stringBuffer13, (org.joda.time.ReadablePeriod) mutablePeriod20);
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
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test01124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01124");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(35);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01125");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT97H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01126");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration1 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = duration1.toPeriod(chronology2);
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        java.lang.String str7 = seconds6.toString();
        org.joda.time.PeriodType periodType8 = seconds6.getPeriodType();
        org.joda.time.PeriodType periodType9 = seconds6.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration1, periodType9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutablePeriod10.setPeriod(readablePeriod11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = mutablePeriod10.toDurationFrom(readableInstant13);
        org.joda.time.Chronology chronology16 = null;
        mutablePeriod10.setPeriod(84326400000L, chronology16);
        org.joda.time.Period period19 = org.joda.time.Period.hours(0);
        org.joda.time.DurationFieldType durationFieldType21 = period19.getFieldType((int) (short) 1);
        org.joda.time.Period period23 = period19.plusDays(10);
        org.joda.time.Period period25 = period23.minusDays((int) (short) 10);
        org.joda.time.Seconds seconds26 = period23.toStandardSeconds();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod10.mergePeriod((org.joda.time.ReadablePeriod) period23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT60S" + "'", str7, "PT60S");
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(seconds26);
    }

    @Test
    public void test01127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01127");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((-1L));
        org.joda.time.Duration duration3 = duration1.withMillis(0L);
        org.joda.time.Period period4 = duration1.toPeriod();
        org.joda.time.Period period6 = period4.withSeconds(1);
        org.joda.time.Period period8 = period6.withMonths(3);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test01128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01128");
        org.joda.time.Period period1 = org.joda.time.Period.hours((-672));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01129");
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
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds12 = duration11.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType13 = seconds12.getFieldType();
        org.joda.time.Seconds seconds15 = org.joda.time.Seconds.parseSeconds("P0W");
        org.joda.time.Seconds seconds16 = seconds12.minus(seconds15);
        int int17 = seconds16.getSeconds();
        org.joda.time.Seconds seconds19 = seconds16.multipliedBy((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = periodFormatter6.print((org.joda.time.ReadablePeriod) seconds19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNull(periodPrinter9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertNotNull(seconds19);
    }

    @Test
    public void test01130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01130");
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
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType11 = periodType10.withMinutesRemoved();
        org.joda.time.PeriodType periodType12 = periodType10.withYearsRemoved();
        java.lang.String str13 = periodType12.toString();
        org.joda.time.PeriodType periodType14 = periodType12.withWeeksRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter15 = periodFormatter2.withParseType(periodType12);
        java.io.Writer writer16 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(0, (int) '4', (int) (short) 100, (int) (byte) -1);
        int int22 = period21.size();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer16, (org.joda.time.ReadablePeriod) period21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
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
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PeriodType[Millis]" + "'", str13, "PeriodType[Millis]");
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodFormatter15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
    }

    @Test
    public void test01131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01131");
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
        java.lang.String str18 = periodType15.getName();
        org.joda.time.PeriodType periodType19 = periodType15.withWeeksRemoved();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Millis" + "'", str18, "Millis");
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test01132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01132");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks2 = weeks0.dividedBy(52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks4 = weeks0.minus(6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -2147483648 + -6");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
    }

    @Test
    public void test01133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01133");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod2.addYears((int) '4');
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod2.add((long) 100, chronology6);
        mutablePeriod2.setMillis((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        mutablePeriod2.setPeriod(readableInstant10, readableInstant11);
        org.joda.time.Period period14 = org.joda.time.Period.months(1);
        org.joda.time.Minutes minutes15 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType16 = minutes15.getFieldType();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DurationField durationField18 = durationFieldType16.getField(chronology17);
        org.joda.time.Period period20 = period14.withField(durationFieldType16, 0);
        int int21 = mutablePeriod2.get(durationFieldType16);
        mutablePeriod2.addWeeks(10);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test01134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01134");
        org.joda.time.Period period1 = org.joda.time.Period.hours(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType3 = period1.getFieldType(60);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01135");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT-1H");
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test01136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01136");
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period6 = period3.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period8 = period6.normalizedStandard(periodType7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(1L, 1L, periodType7, chronology9);
        int int11 = mutablePeriod10.getWeeks();
        int[] intArray12 = mutablePeriod10.getValues();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType14 = mutablePeriod10.getFieldType((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
    }

    @Test
    public void test01137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01137");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("PeriodType[StandardNoYears]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[StandardNoYears]\" is malformed at \"eriodType[StandardNoYears]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01138");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period7 = period4.withSeconds((int) ' ');
        org.joda.time.Period period8 = period1.minus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((java.lang.Object) period4);
        org.joda.time.Period period11 = period4.plusMonths((-32));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test01139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01139");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ZERO;
        org.joda.time.PeriodType periodType1 = seconds0.getPeriodType();
        java.lang.String str2 = seconds0.toString();
        org.joda.time.Seconds seconds4 = seconds0.plus((int) (short) 1);
        org.joda.time.PeriodType periodType5 = seconds0.getPeriodType();
        int int6 = periodType5.size();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0S" + "'", str2, "PT0S");
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test01140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01140");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (short) -1, (int) '#', (int) ' ', 100);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.days();
        int int6 = mutablePeriod4.get(durationFieldType5);
        org.joda.time.Hours hours7 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Hours hours9 = hours7.dividedBy((int) (short) -1);
        org.joda.time.Hours hours11 = hours9.plus((int) (short) 10);
        org.joda.time.Hours hours12 = hours9.negated();
        org.joda.time.Duration duration13 = hours9.toStandardDuration();
        org.joda.time.DurationFieldType durationFieldType14 = hours9.getFieldType();
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(durationFieldType14);
    }

    @Test
    public void test01141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01141");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("P0W");
        org.joda.time.Seconds seconds2 = minutes1.toStandardSeconds();
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(seconds2);
    }

    @Test
    public void test01142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01142");
        org.joda.time.Days days1 = org.joda.time.Days.days(0);
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) days1);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(weeks2);
    }

    @Test
    public void test01143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01143");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        boolean boolean4 = weeks1.isLessThan(weeks3);
        org.joda.time.Weeks weeks6 = weeks3.minus((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType7 = weeks6.getFieldType();
        org.joda.time.Hours hours9 = org.joda.time.Hours.hours(25);
        org.joda.time.DurationFieldType durationFieldType10 = hours9.getFieldType();
        org.joda.time.Duration duration11 = org.joda.time.Duration.ZERO;
        long long12 = duration11.getStandardDays();
        org.joda.time.Hours hours13 = duration11.toStandardHours();
        boolean boolean14 = hours9.isLessThan(hours13);
        org.joda.time.PeriodType periodType15 = hours13.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = new org.joda.time.Period((java.lang.Object) weeks6, periodType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test01144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01144");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType4 = null;
        int int5 = periodType3.indexOf(durationFieldType4);
        org.joda.time.PeriodType periodType6 = periodType3.withWeeksRemoved();
        org.joda.time.PeriodType periodType7 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType8 = periodType3.withYearsRemoved();
        org.joda.time.Period period10 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days11 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period13 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days14 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period16 = period13.withSeconds((int) ' ');
        org.joda.time.Period period17 = period10.minus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period19 = period10.plusHours((-1));
        org.joda.time.Period period21 = period10.withDays((int) 'a');
        org.joda.time.MutablePeriod mutablePeriod23 = org.joda.time.MutablePeriod.parse("PT60S");
        org.joda.time.Period period24 = period10.plus((org.joda.time.ReadablePeriod) mutablePeriod23);
        org.joda.time.Period period26 = period24.withMinutes(3);
        int int27 = period24.getWeeks();
        org.joda.time.Days days28 = org.joda.time.Days.ZERO;
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((java.lang.Object) days28, periodType29, chronology30);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((int) (short) -1, (int) '#', (int) ' ', 100);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.days();
        int int38 = mutablePeriod36.get(durationFieldType37);
        org.joda.time.Chronology chronology39 = null;
        boolean boolean40 = durationFieldType37.isSupported(chronology39);
        mutablePeriod31.add(durationFieldType37, (int) (short) -1);
        boolean boolean43 = period24.isSupported(durationFieldType37);
        int int44 = periodType3.indexOf(durationFieldType37);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((java.lang.Object) periodType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(mutablePeriod23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test01145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01145");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) (short) 100);
        org.joda.time.Seconds seconds2 = period1.toStandardSeconds();
        org.joda.time.Period period4 = period1.withMonths(0);
        int int5 = period4.getHours();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test01146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01146");
        org.joda.time.Period period1 = org.joda.time.Period.months(25);
        org.joda.time.PeriodType periodType2 = period1.getPeriodType();
        org.joda.time.Period period4 = period1.plusHours((-2));
        int int5 = period1.size();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test01147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01147");
        org.joda.time.Days days1 = org.joda.time.Days.days(7);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test01148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01148");
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
        org.joda.time.Period period22 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days23 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Period period25 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days26 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period25);
        org.joda.time.PeriodType periodType27 = days26.getPeriodType();
        boolean boolean28 = days23.isGreaterThan(days26);
        org.joda.time.Period period30 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days31 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Days days32 = days26.minus(days31);
        org.joda.time.Period period34 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days35 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period34);
        org.joda.time.Days days37 = days35.minus(10);
        org.joda.time.Days days38 = days26.plus(days35);
        mutablePeriod16.add((org.joda.time.ReadablePeriod) days38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType41 = mutablePeriod16.getFieldType((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(days35);
        org.junit.Assert.assertNotNull(days37);
        org.junit.Assert.assertNotNull(days38);
    }

    @Test
    public void test01149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01149");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 7, periodType1, chronology2);
    }

    @Test
    public void test01150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01150");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        java.lang.String str3 = seconds2.toString();
        org.joda.time.PeriodType periodType4 = seconds2.getPeriodType();
        org.joda.time.PeriodType periodType5 = seconds2.getPeriodType();
        java.lang.Object obj6 = null;
        boolean boolean7 = seconds2.equals(obj6);
        org.joda.time.Weeks weeks8 = seconds2.toStandardWeeks();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT60S" + "'", str3, "PT60S");
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(weeks8);
    }

    @Test
    public void test01151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01151");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("PT-21474836M");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01152");
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType12 = periodType11.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration9, readableInstant10, periodType11);
        java.lang.String str14 = periodType11.toString();
        org.joda.time.PeriodType periodType15 = periodType11.withSecondsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = new org.joda.time.Period((int) '#', (int) (short) 100, 25, 35, (int) (byte) 10, (int) (short) 0, (int) '#', (int) (short) -1, periodType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PeriodType[YearWeekDay]" + "'", str14, "PeriodType[YearWeekDay]");
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test01153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01153");
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
        // The following exception was thrown during execution in test generation
        try {
            int int22 = days5.getValue(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(days20);
    }

    @Test
    public void test01154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01154");
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
        org.joda.time.Period period14 = period12.withYears(10);
        org.joda.time.Period period16 = period12.plusMillis(100);
        org.joda.time.Period period18 = period12.withYears((int) (short) 100);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test01155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01155");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 1, (long) (byte) 1, chronology2);
        org.joda.time.Minutes minutes4 = period3.toStandardMinutes();
        org.joda.time.Seconds seconds5 = minutes4.toStandardSeconds();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes7 = minutes4.dividedBy((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(seconds5);
    }

    @Test
    public void test01156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01156");
        org.joda.time.Days days1 = org.joda.time.Days.days((int) (short) 0);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test01157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01157");
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
        mutablePeriod13.addDays((int) (short) 0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT-60S" + "'", str12, "PT-60S");
    }

    @Test
    public void test01158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01158");
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
    public void test01159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01159");
        org.joda.time.Period period1 = org.joda.time.Period.days(4);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01160");
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
        org.joda.time.PeriodType periodType27 = hours16.getPeriodType();
        org.joda.time.Hours hours29 = hours16.dividedBy((-672));
        // The following exception was thrown during execution in test generation
        try {
            int int31 = hours16.getValue(40);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 40");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(hours29);
    }

    @Test
    public void test01161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01161");
        org.joda.time.DurationFieldType[] durationFieldTypeArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.forFields(durationFieldTypeArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Types array must not be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01162");
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
        mutablePeriod6.setYears(8);
        mutablePeriod6.setPeriod((long) (byte) 1, 0L);
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
    }

    @Test
    public void test01163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01163");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("P8M");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01164");
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
            org.joda.time.MutablePeriod mutablePeriod10 = org.joda.time.MutablePeriod.parse("Days", periodFormatter3);
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
    public void test01165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01165");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(84326400L);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test01166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01166");
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
        org.joda.time.Chronology chronology19 = null;
        mutablePeriod16.setPeriod((long) 2147483647, (long) 25, chronology19);
        org.junit.Assert.assertNull(periodParser5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodFormatter14);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test01167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01167");
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
        org.joda.time.DurationFieldType durationFieldType18 = days16.getFieldType((int) (short) 0);
        org.joda.time.PeriodType periodType19 = days16.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days21 = days16.dividedBy(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test01168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01168");
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
        int int13 = mutablePeriod12.getYears();
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType15 = periodType14.withMinutesRemoved();
        boolean boolean16 = mutablePeriod12.equals((java.lang.Object) periodType15);
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds19 = duration18.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType20 = seconds19.getFieldType();
        org.joda.time.Seconds seconds22 = seconds19.plus(25);
        org.joda.time.Seconds seconds23 = seconds19.negated();
        org.joda.time.Seconds seconds25 = seconds19.dividedBy(10);
        org.joda.time.Duration duration27 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds28 = duration27.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType29 = seconds28.getFieldType();
        org.joda.time.Seconds seconds31 = seconds28.plus(25);
        org.joda.time.Seconds seconds32 = seconds25.plus(seconds28);
        org.joda.time.DurationFieldType durationFieldType33 = seconds28.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod12.set(durationFieldType33, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(durationFieldType33);
    }

    @Test
    public void test01169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01169");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PeriodType[YearMonthDay]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[YearMonthDay]\" is malformed at \"eriodType[YearMonthDay]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01170");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.Minutes minutes2 = minutes0.dividedBy(7);
        org.joda.time.Period period7 = new org.joda.time.Period(10, 0, (int) (byte) 10, (int) (byte) 10);
        org.joda.time.Minutes minutes8 = period7.toStandardMinutes();
        org.joda.time.DurationFieldType durationFieldType9 = minutes8.getFieldType();
        boolean boolean10 = minutes0.isGreaterThan(minutes8);
        org.joda.time.Minutes minutes11 = org.joda.time.Minutes.MIN_VALUE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes12 = minutes0.minus(minutes11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Integer.MIN_VALUE cannot be negated");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(minutes11);
    }

    @Test
    public void test01171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01171");
        org.joda.time.Period period8 = new org.joda.time.Period(0, (int) (byte) -1, (-8), 0, (int) '4', (int) (byte) 10, 600, (int) '#');
    }

    @Test
    public void test01172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01172");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        int int2 = minutes0.getMinutes();
        java.lang.String str3 = minutes0.toString();
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType5 = minutes4.getFieldType();
        java.lang.String str6 = minutes4.toString();
        boolean boolean7 = minutes0.isLessThan(minutes4);
        org.joda.time.Minutes minutes8 = minutes0.negated();
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.parseMinutes("P0D");
        org.joda.time.Minutes minutes12 = minutes10.dividedBy((int) '#');
        org.joda.time.Minutes minutes13 = minutes0.minus(minutes10);
        java.lang.String str14 = minutes13.toString();
        java.lang.String str15 = minutes13.toString();
        int int16 = minutes13.getMinutes();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0M" + "'", str3, "PT0M");
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT-2147483648M" + "'", str6, "PT-2147483648M");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT0M" + "'", str14, "PT0M");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT0M" + "'", str15, "PT0M");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test01173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01173");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
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
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.millis();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) (short) 1, periodType18, chronology19);
        boolean boolean21 = periodType13.equals((java.lang.Object) chronology19);
        org.joda.time.PeriodType periodType22 = periodType13.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType13);
        java.lang.String str24 = periodType13.getName();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Weeks" + "'", str24, "Weeks");
    }

    @Test
    public void test01174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01174");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("PT0.001S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01175");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.hours();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(periodType4);
        org.joda.time.PeriodType periodType6 = periodType4.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(readableInstant2, readableInstant3, periodType4);
        org.joda.time.PeriodType periodType8 = periodType4.withMillisRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test01176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01176");
        org.joda.time.Period period1 = org.joda.time.Period.months(1);
        org.joda.time.Period period2 = period1.normalizedStandard();
        org.joda.time.Period period4 = period1.minusDays(4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days5 = period1.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test01177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01177");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((java.lang.Object) period1);
        int int3 = mutablePeriod2.getMillis();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01178");
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
        int int14 = minutes12.getValue((int) (byte) 0);
        org.joda.time.Minutes minutes16 = minutes12.minus(7);
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType20 = periodType19.withWeeksRemoved();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = duration18.toPeriod(periodType19, chronology21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType25 = periodType24.withMonthsRemoved();
        org.joda.time.Period period26 = duration18.toPeriodTo(readableInstant23, periodType25);
        org.joda.time.Minutes minutes27 = duration18.toStandardMinutes();
        org.joda.time.Minutes minutes29 = minutes27.multipliedBy((int) (short) -1);
        org.joda.time.Minutes minutes30 = minutes27.negated();
        org.joda.time.DurationFieldType durationFieldType31 = minutes30.getFieldType();
        int int32 = minutes30.size();
        boolean boolean33 = minutes12.isLessThan(minutes30);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod36.addYears((int) '4');
        org.joda.time.Chronology chronology40 = null;
        mutablePeriod36.add((long) 100, chronology40);
        mutablePeriod36.setMillis((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        mutablePeriod36.setPeriod(readableInstant44, readableInstant45);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((int) (short) -1, (int) '#', (int) ' ', 100);
        mutablePeriod36.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod51);
        boolean boolean53 = minutes12.equals((java.lang.Object) mutablePeriod36);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test01179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01179");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (short) 1);
        int[] intArray2 = period1.getValues();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 0, 0, 0, 1]");
    }

    @Test
    public void test01180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01180");
        org.joda.time.Period period4 = new org.joda.time.Period((-2), 10, (int) (short) 1, 60);
    }

    @Test
    public void test01181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01181");
        org.joda.time.format.PeriodPrinter periodPrinter8 = null;
        org.joda.time.format.PeriodParser periodParser9 = null;
        org.joda.time.format.PeriodFormatter periodFormatter10 = new org.joda.time.format.PeriodFormatter(periodPrinter8, periodParser9);
        org.joda.time.format.PeriodParser periodParser11 = periodFormatter10.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter12 = periodFormatter10.getPrinter();
        java.util.Locale locale13 = null;
        org.joda.time.format.PeriodFormatter periodFormatter14 = periodFormatter10.withLocale(locale13);
        java.util.Locale locale15 = null;
        org.joda.time.format.PeriodFormatter periodFormatter16 = periodFormatter14.withLocale(locale15);
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.hours();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(periodType17);
        org.joda.time.format.PeriodFormatter periodFormatter19 = periodFormatter14.withParseType(periodType17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = new org.joda.time.Period(25, 0, 0, 97, 600, (int) (byte) 10, (int) (byte) -1, 658, periodType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser11);
        org.junit.Assert.assertNull(periodPrinter12);
        org.junit.Assert.assertNotNull(periodFormatter14);
        org.junit.Assert.assertNotNull(periodFormatter16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodFormatter19);
    }

    @Test
    public void test01182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01182");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = period1.minusMonths(0);
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = duration6.toPeriod(periodType7, chronology9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType13 = periodType12.withMonthsRemoved();
        org.joda.time.Period period14 = duration6.toPeriodTo(readableInstant11, periodType13);
        org.joda.time.Period period16 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days17 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period16);
        org.joda.time.PeriodType periodType18 = days17.getPeriodType();
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(readableInstant19, readableDuration20);
        mutablePeriod21.setHours((int) (short) 100);
        boolean boolean24 = periodType18.equals((java.lang.Object) mutablePeriod21);
        org.joda.time.Duration duration25 = org.joda.time.Duration.ZERO;
        long long26 = duration25.getStandardDays();
        mutablePeriod21.add((org.joda.time.ReadableDuration) duration25);
        mutablePeriod21.clear();
        org.joda.time.Period period30 = org.joda.time.Period.hours(0);
        org.joda.time.DurationFieldType durationFieldType32 = period30.getFieldType((int) (short) 1);
        mutablePeriod21.set(durationFieldType32, (int) (short) -1);
        org.joda.time.Period period36 = period14.withField(durationFieldType32, (int) (short) 0);
        int int37 = period1.get(durationFieldType32);
        java.lang.String str38 = durationFieldType32.toString();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "months" + "'", str38, "months");
    }

    @Test
    public void test01183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01183");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) (-1073741824));
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test01184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01184");
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
        java.util.Locale locale20 = null;
        org.joda.time.format.PeriodFormatter periodFormatter21 = periodFormatter2.withLocale(locale20);
        java.lang.StringBuffer stringBuffer22 = null;
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter21.printTo(stringBuffer22, readablePeriod23);
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
        org.junit.Assert.assertNotNull(periodFormatter21);
    }

    @Test
    public void test01185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01185");
        org.joda.time.Period period4 = new org.joda.time.Period(60, (-32), 32, 2);
        int int5 = period4.getYears();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test01186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01186");
        org.joda.time.Days days0 = org.joda.time.Days.ZERO;
        org.joda.time.Days days2 = days0.plus(54);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days2);
    }

    @Test
    public void test01187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01187");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter2.getPrinter();
        boolean boolean5 = periodFormatter2.isParser();
        boolean boolean6 = periodFormatter2.isParser();
        org.joda.time.Period period9 = new org.joda.time.Period((long) (short) -1, 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = periodFormatter2.print((org.joda.time.ReadablePeriod) period9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01188");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (byte) 10);
        org.joda.time.Hours hours2 = period1.toStandardHours();
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) hours2);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(weeks3);
    }

    @Test
    public void test01189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01189");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("YearWeekDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"YearWeekDay\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01190");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '4', chronology1);
        int int3 = mutablePeriod2.getHours();
        org.joda.time.Duration duration4 = org.joda.time.Duration.ZERO;
        long long5 = duration4.getStandardDays();
        org.joda.time.Hours hours6 = duration4.toStandardHours();
        long long7 = duration4.getStandardMinutes();
        mutablePeriod2.add((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardHours((long) 25);
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration10);
        mutablePeriod2.addDays(0);
        mutablePeriod2.addMillis((-2));
        int int16 = mutablePeriod2.getMonths();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test01191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01191");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period7 = period4.withSeconds((int) ' ');
        org.joda.time.Period period8 = period1.minus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period10 = period1.plusHours((-1));
        org.joda.time.Period period12 = period1.withDays((int) 'a');
        org.joda.time.MutablePeriod mutablePeriod14 = org.joda.time.MutablePeriod.parse("PT60S");
        org.joda.time.Period period15 = period1.plus((org.joda.time.ReadablePeriod) mutablePeriod14);
        org.joda.time.Period period17 = period15.withMinutes(3);
        org.joda.time.Period period19 = period17.plusMinutes((int) (byte) 100);
        java.lang.Class<?> wildcardClass20 = period19.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(mutablePeriod14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01192");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) 0, (long) (byte) 10, periodType2, chronology3);
        org.joda.time.Duration duration5 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = duration5.toPeriod(chronology6);
        org.joda.time.Period period8 = period4.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Weeks weeks9 = period8.toStandardWeeks();
        org.joda.time.DurationFieldType durationFieldType10 = null;
        boolean boolean11 = weeks9.isSupported(durationFieldType10);
        org.joda.time.Period period13 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period15 = period13.withMillis((int) (byte) -1);
        org.joda.time.Weeks weeks16 = period15.toStandardWeeks();
        org.joda.time.Duration duration17 = weeks16.toStandardDuration();
        org.joda.time.Weeks weeks18 = weeks9.plus(weeks16);
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds21 = duration20.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType22 = seconds21.getFieldType();
        org.joda.time.Seconds seconds24 = seconds21.dividedBy(2);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = weeks9.compareTo((org.joda.time.base.BaseSingleFieldPeriod) seconds24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Weeks cannot be compared to class org.joda.time.Seconds");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(seconds24);
    }

    @Test
    public void test01193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01193");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) (byte) 10);
        java.lang.String str2 = duration1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0.010S" + "'", str2, "PT0.010S");
    }

    @Test
    public void test01194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01194");
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
        org.joda.time.Days days23 = org.joda.time.Days.ZERO;
        int int24 = days23.getDays();
        org.joda.time.Period period26 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days27 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period26);
        org.joda.time.Period period29 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days30 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period29);
        org.joda.time.PeriodType periodType31 = days30.getPeriodType();
        boolean boolean32 = days27.isGreaterThan(days30);
        org.joda.time.Period period34 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days35 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period34);
        org.joda.time.Days days36 = days30.minus(days35);
        org.joda.time.Days days37 = days23.minus(days30);
        org.joda.time.Days days39 = days30.plus((int) (byte) 1);
        org.joda.time.Days days41 = days30.multipliedBy((-2147483648));
        org.joda.time.Days days43 = days30.multipliedBy((int) (byte) 0);
        org.joda.time.Days days44 = days14.plus(days30);
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
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(days35);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertNotNull(days37);
        org.junit.Assert.assertNotNull(days39);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertNotNull(days43);
        org.junit.Assert.assertNotNull(days44);
    }

    @Test
    public void test01195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01195");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        java.lang.String str3 = seconds2.toString();
        org.joda.time.PeriodType periodType4 = seconds2.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withSecondsRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withDaysRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withWeeksRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withHoursRemoved();
        int int9 = periodType8.size();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT60S" + "'", str3, "PT60S");
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test01196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01196");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(25, (int) 'a', (int) '4', 40);
        mutablePeriod4.setHours((-60));
    }

    @Test
    public void test01197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01197");
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
        org.joda.time.Seconds seconds28 = org.joda.time.Seconds.ZERO;
        org.joda.time.PeriodType periodType29 = seconds28.getPeriodType();
        org.joda.time.Chronology chronology30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((java.lang.Object) periodType26, periodType29, chronology30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(periodType29);
    }

    @Test
    public void test01198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01198");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '4', chronology1);
        mutablePeriod2.setHours((int) (byte) 1);
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withDaysRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((long) 'a', (long) (short) 0, periodType9);
        org.joda.time.Hours hours11 = period10.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType12 = hours11.getFieldType();
        mutablePeriod2.add(durationFieldType12, (int) (short) -1);
        mutablePeriod2.setPeriod((-672), 7, (-2147483648), (int) (byte) 0, 13, 4, (int) (short) 10, 8);
        org.joda.time.format.PeriodPrinter periodPrinter24 = null;
        org.joda.time.format.PeriodParser periodParser25 = null;
        org.joda.time.format.PeriodFormatter periodFormatter26 = new org.joda.time.format.PeriodFormatter(periodPrinter24, periodParser25);
        org.joda.time.format.PeriodParser periodParser27 = periodFormatter26.getParser();
        org.joda.time.Duration duration29 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds30 = duration29.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType31 = seconds30.getFieldType();
        org.joda.time.Seconds seconds33 = seconds30.plus(25);
        org.joda.time.Seconds seconds34 = seconds30.negated();
        org.joda.time.PeriodType periodType35 = seconds34.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter36 = periodFormatter26.withParseType(periodType35);
        org.joda.time.format.PeriodPrinter periodPrinter37 = periodFormatter36.getPrinter();
        org.joda.time.format.PeriodParser periodParser38 = periodFormatter36.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter39 = periodFormatter36.getPrinter();
        boolean boolean40 = periodFormatter36.isParser();
        org.joda.time.format.PeriodParser periodParser41 = periodFormatter36.getParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = mutablePeriod2.toString(periodFormatter36);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNull(periodParser27);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodFormatter36);
        org.junit.Assert.assertNull(periodPrinter37);
        org.junit.Assert.assertNull(periodParser38);
        org.junit.Assert.assertNull(periodPrinter39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(periodParser41);
    }

    @Test
    public void test01199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01199");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.PeriodType periodType5 = periodFormatter2.getParseType();
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
        org.joda.time.Days days22 = days13.plus((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType24 = days22.getFieldType((int) (short) 0);
        org.joda.time.PeriodType periodType25 = days22.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter26 = periodFormatter2.withParseType(periodType25);
        org.joda.time.Period period28 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days29 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period28);
        org.joda.time.PeriodType periodType30 = days29.getPeriodType();
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(readableInstant31, readableDuration32);
        mutablePeriod33.setHours((int) (short) 100);
        boolean boolean36 = periodType30.equals((java.lang.Object) mutablePeriod33);
        org.joda.time.Duration duration37 = org.joda.time.Duration.ZERO;
        long long38 = duration37.getStandardDays();
        mutablePeriod33.add((org.joda.time.ReadableDuration) duration37);
        mutablePeriod33.clear();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod43.addYears((int) '4');
        int int46 = mutablePeriod43.getYears();
        mutablePeriod33.add((org.joda.time.ReadablePeriod) mutablePeriod43);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod(readableInstant48, readableDuration49);
        mutablePeriod50.setSeconds(8);
        org.joda.time.MutablePeriod mutablePeriod53 = mutablePeriod50.toMutablePeriod();
        mutablePeriod43.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod53);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = periodFormatter26.print((org.joda.time.ReadablePeriod) mutablePeriod43);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNull(periodType5);
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
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodFormatter26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 52 + "'", int46 == 52);
        org.junit.Assert.assertNotNull(mutablePeriod53);
    }

    @Test
    public void test01200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01200");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod1.setYears(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test01201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01201");
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(readableInstant12, readableDuration13);
        mutablePeriod14.setPeriod((long) ' ', (long) 52);
        mutablePeriod14.addDays(100);
        org.joda.time.PeriodType periodType20 = mutablePeriod14.getPeriodType();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(10L, (long) 13, periodType20, chronology21);
        org.joda.time.Period period23 = new org.joda.time.Period(540000L, (long) (short) 100, periodType20);
        org.joda.time.PeriodType periodType24 = periodType20.withYearsRemoved();
        org.joda.time.PeriodType periodType25 = periodType24.withDaysRemoved();
        org.joda.time.PeriodType periodType26 = periodType25.withYearsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((-2), (-2147483648), (-672), 10, (int) (short) -1, 54, 60, 6, periodType25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
    }

    @Test
    public void test01202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01202");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Period period4 = org.joda.time.Period.millis((int) (short) 1);
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.secondsIn(readableInterval5);
        int int7 = seconds6.getSeconds();
        org.joda.time.PeriodType periodType8 = seconds6.getPeriodType();
        org.joda.time.Period period9 = period4.normalizedStandard(periodType8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(0L, periodType8, chronology10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test01203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01203");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.PeriodType periodType5 = periodFormatter2.getParseType();
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
        org.joda.time.Days days22 = days13.plus((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType24 = days22.getFieldType((int) (short) 0);
        org.joda.time.PeriodType periodType25 = days22.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter26 = periodFormatter2.withParseType(periodType25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = periodFormatter2.print(readablePeriod27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNull(periodType5);
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
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodFormatter26);
    }

    @Test
    public void test01204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01204");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours((int) (byte) -1);
        org.joda.time.Hours hours3 = hours1.multipliedBy((-1));
        java.lang.String str4 = hours3.toString();
        org.joda.time.Period period6 = org.joda.time.Period.seconds((int) (short) 100);
        org.joda.time.Period period8 = period6.withHours((int) (byte) 1);
        boolean boolean9 = hours3.equals((java.lang.Object) period8);
        org.joda.time.Period period11 = period8.minusYears((-672));
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT1H" + "'", str4, "PT1H");
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test01205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01205");
        org.joda.time.Hours hours0 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours2 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean3 = hours0.isGreaterThan(hours2);
        org.joda.time.Hours hours5 = hours0.minus((int) (byte) 0);
        org.joda.time.Hours hours7 = hours5.minus((int) '#');
        org.joda.time.Duration duration8 = hours7.toStandardDuration();
        java.lang.String str9 = duration8.toString();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT-115200S" + "'", str9, "PT-115200S");
    }

    @Test
    public void test01206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01206");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 25, 60000L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((java.lang.Object) 25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01207");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = duration0.toPeriod(chronology1);
        org.joda.time.Hours hours3 = duration0.toStandardHours();
        org.joda.time.Duration duration4 = org.joda.time.Duration.ZERO;
        long long5 = duration4.getStandardDays();
        org.joda.time.Hours hours6 = duration4.toStandardHours();
        long long7 = duration4.getStandardMinutes();
        long long8 = duration4.getStandardDays();
        org.joda.time.Hours hours9 = duration4.toStandardHours();
        boolean boolean10 = duration0.isLongerThan((org.joda.time.ReadableDuration) duration4);
        java.lang.String str11 = duration0.toString();
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT0S" + "'", str11, "PT0S");
    }

    @Test
    public void test01208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01208");
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
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds33 = duration32.toStandardSeconds();
        java.lang.String str34 = seconds33.toString();
        org.joda.time.PeriodType periodType35 = seconds33.getPeriodType();
        org.joda.time.PeriodType periodType36 = periodType35.withSecondsRemoved();
        org.joda.time.PeriodType periodType37 = periodType36.withDaysRemoved();
        org.joda.time.Period period38 = duration4.toPeriod(periodType36);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period40 = period38.minusSeconds((-1073741824));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PT60S" + "'", str34, "PT60S");
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(period38);
    }

    @Test
    public void test01209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01209");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.Duration duration3 = duration1.plus((long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = duration3.toPeriodTo(readableInstant4);
        org.joda.time.Duration duration7 = duration3.minus((-60L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration3, readableInstant8);
        mutablePeriod9.setWeeks((-2));
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration7);
    }

    @Test
    public void test01210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01210");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        int int2 = minutes0.getMinutes();
        java.lang.String str3 = minutes0.toString();
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType5 = minutes4.getFieldType();
        java.lang.String str6 = minutes4.toString();
        boolean boolean7 = minutes0.isLessThan(minutes4);
        org.joda.time.Duration duration8 = minutes0.toStandardDuration();
        org.joda.time.Minutes minutes10 = minutes0.dividedBy((-60));
        org.joda.time.Minutes minutes11 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType12 = minutes11.getPeriodType();
        org.joda.time.Minutes minutes13 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes14 = minutes11.plus(minutes13);
        org.joda.time.Minutes minutes15 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes16 = org.joda.time.Minutes.ZERO;
        boolean boolean17 = minutes15.isLessThan(minutes16);
        boolean boolean18 = minutes11.isLessThan(minutes15);
        org.joda.time.Minutes minutes20 = minutes15.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes22 = minutes20.multipliedBy(54);
        org.joda.time.Minutes minutes23 = null;
        boolean boolean24 = minutes22.isGreaterThan(minutes23);
        org.joda.time.PeriodType periodType25 = minutes22.getPeriodType();
        boolean boolean26 = minutes10.isLessThan(minutes22);
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0M" + "'", str3, "PT0M");
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT-2147483648M" + "'", str6, "PT-2147483648M");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test01211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01211");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1);
        org.joda.time.format.PeriodFormatter periodFormatter3 = null;
        java.lang.String str4 = mutablePeriod2.toString(periodFormatter3);
        int int5 = mutablePeriod2.getMillis();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = mutablePeriod2.toDurationFrom(readableInstant6);
        org.joda.time.Seconds seconds8 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) mutablePeriod2);
        mutablePeriod2.clear();
        mutablePeriod2.addDays((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType13 = mutablePeriod2.getFieldType((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0S" + "'", str4, "PT0S");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(seconds8);
    }

    @Test
    public void test01212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01212");
        org.joda.time.Period period4 = new org.joda.time.Period(0, (int) '4', (int) (short) 100, (int) (byte) -1);
        org.joda.time.Period period6 = period4.withDays((int) 'a');
        org.joda.time.Period period8 = period6.plusHours(100);
        int int10 = period6.getValue(2);
        org.joda.time.Period period12 = period6.plusHours((int) 'a');
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test01213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01213");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardMinutes((long) 10);
        java.lang.String str3 = duration2.toString();
        org.joda.time.Duration duration5 = duration2.minus((long) (byte) 10);
        org.joda.time.Duration duration7 = duration2.withMillis((long) (short) -1);
        long long8 = duration2.getStandardMinutes();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType12 = periodType11.withDaysRemoved();
        org.joda.time.Period period13 = new org.joda.time.Period((-60L), periodType12);
        org.joda.time.Period period14 = duration2.toPeriodFrom(readableInstant9, periodType12);
        org.joda.time.Duration duration15 = duration2.toDuration();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration15);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT600S" + "'", str3, "PT600S");
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration15);
    }

    @Test
    public void test01214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01214");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.format.PeriodParser periodParser4 = periodFormatter3.getParser();
        java.util.Locale locale5 = periodFormatter3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = org.joda.time.Period.parse("P7Y-600WT0.097S", periodFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser4);
        org.junit.Assert.assertNull(locale5);
    }

    @Test
    public void test01215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01215");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (short) 1);
        org.joda.time.Chronology chronology2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period3 = new org.joda.time.Period((java.lang.Object) (short) 1, chronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01216");
        org.joda.time.Hours hours0 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours1 = hours0.negated();
        java.lang.String str2 = hours1.toString();
        java.lang.String str3 = hours1.toString();
        org.joda.time.Hours hours4 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours6 = hours4.minus(10);
        org.joda.time.Hours hours7 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours9 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean10 = hours7.isGreaterThan(hours9);
        org.joda.time.Hours hours12 = hours7.minus((int) (byte) 0);
        org.joda.time.Hours hours14 = hours12.minus((int) '#');
        org.joda.time.Duration duration15 = hours14.toStandardDuration();
        org.joda.time.Hours hours16 = hours6.minus(hours14);
        org.joda.time.Hours hours17 = hours1.minus(hours6);
        org.joda.time.Duration duration18 = hours17.toStandardDuration();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT-8H" + "'", str2, "PT-8H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT-8H" + "'", str3, "PT-8H");
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertNotNull(duration18);
    }

    @Test
    public void test01217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01217");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        org.joda.time.format.PeriodPrinter periodPrinter6 = periodFormatter5.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = periodFormatter5.parsePeriod("P-1D");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(periodPrinter6);
    }

    @Test
    public void test01218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01218");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType17 = minutes14.getFieldType((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test01219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01219");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType3 = seconds2.getFieldType();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.parseSeconds("P0W");
        org.joda.time.Seconds seconds6 = seconds2.minus(seconds5);
        org.joda.time.Seconds seconds7 = seconds2.negated();
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.seconds((int) (short) 0);
        org.joda.time.Seconds seconds10 = seconds7.minus(seconds9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.weekyears();
        java.lang.String str12 = durationFieldType11.getName();
        int int13 = seconds9.get(durationFieldType11);
        org.joda.time.Seconds seconds14 = org.joda.time.Seconds.TWO;
        org.joda.time.Duration duration15 = seconds14.toStandardDuration();
        org.joda.time.DurationFieldType durationFieldType16 = seconds14.getFieldType();
        org.joda.time.PeriodType periodType17 = seconds14.getPeriodType();
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds20 = duration19.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType21 = seconds20.getFieldType();
        org.joda.time.Seconds seconds23 = org.joda.time.Seconds.parseSeconds("P0W");
        org.joda.time.Seconds seconds24 = seconds20.minus(seconds23);
        boolean boolean25 = seconds14.isLessThan(seconds24);
        org.joda.time.Seconds seconds26 = seconds9.plus(seconds24);
        org.joda.time.ReadableInterval readableInterval27 = null;
        org.joda.time.Weeks weeks28 = org.joda.time.Weeks.weeksIn(readableInterval27);
        org.joda.time.ReadableInterval readableInterval29 = null;
        org.joda.time.Weeks weeks30 = org.joda.time.Weeks.weeksIn(readableInterval29);
        boolean boolean31 = weeks28.isLessThan(weeks30);
        org.joda.time.Weeks weeks32 = weeks28.negated();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((java.lang.Object) weeks28, chronology33);
        org.joda.time.Weeks weeks36 = weeks28.multipliedBy((int) (byte) 1);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.Weeks weeks38 = org.joda.time.Weeks.weeksIn(readableInterval37);
        org.joda.time.ReadableInterval readableInterval39 = null;
        org.joda.time.Weeks weeks40 = org.joda.time.Weeks.weeksIn(readableInterval39);
        boolean boolean41 = weeks38.isLessThan(weeks40);
        org.joda.time.Weeks weeks42 = weeks38.negated();
        org.joda.time.MutablePeriod mutablePeriod43 = weeks42.toMutablePeriod();
        org.joda.time.Weeks weeks44 = weeks28.minus(weeks42);
        org.joda.time.DurationFieldType durationFieldType45 = weeks42.getFieldType();
        org.joda.time.ReadableInterval readableInterval46 = null;
        org.joda.time.Weeks weeks47 = org.joda.time.Weeks.weeksIn(readableInterval46);
        org.joda.time.ReadableInterval readableInterval48 = null;
        org.joda.time.Weeks weeks49 = org.joda.time.Weeks.weeksIn(readableInterval48);
        boolean boolean50 = weeks47.isLessThan(weeks49);
        org.joda.time.Weeks weeks51 = weeks47.negated();
        org.joda.time.Weeks weeks53 = weeks51.minus((int) (byte) 100);
        org.joda.time.ReadableInterval readableInterval54 = null;
        org.joda.time.Weeks weeks55 = org.joda.time.Weeks.weeksIn(readableInterval54);
        org.joda.time.ReadableInterval readableInterval56 = null;
        org.joda.time.Weeks weeks57 = org.joda.time.Weeks.weeksIn(readableInterval56);
        boolean boolean58 = weeks55.isLessThan(weeks57);
        org.joda.time.Weeks weeks60 = weeks57.minus((int) (short) -1);
        org.joda.time.Weeks weeks62 = weeks60.multipliedBy(0);
        boolean boolean63 = weeks53.isGreaterThan(weeks62);
        org.joda.time.Period period68 = new org.joda.time.Period(0, (int) '4', (int) (short) 100, (int) (byte) -1);
        org.joda.time.Period period70 = period68.withDays((int) 'a');
        org.joda.time.Weeks weeks71 = period70.toStandardWeeks();
        int int72 = weeks71.getWeeks();
        org.joda.time.ReadableInterval readableInterval73 = null;
        org.joda.time.Weeks weeks74 = org.joda.time.Weeks.weeksIn(readableInterval73);
        org.joda.time.ReadableInterval readableInterval75 = null;
        org.joda.time.Weeks weeks76 = org.joda.time.Weeks.weeksIn(readableInterval75);
        boolean boolean77 = weeks74.isLessThan(weeks76);
        org.joda.time.Weeks weeks79 = weeks76.minus((int) (short) -1);
        org.joda.time.Weeks weeks80 = weeks79.negated();
        org.joda.time.Weeks weeks82 = weeks79.multipliedBy(0);
        boolean boolean83 = weeks71.isGreaterThan(weeks82);
        org.joda.time.Weeks weeks84 = weeks62.minus(weeks71);
        boolean boolean85 = weeks42.isLessThan(weeks84);
        // The following exception was thrown during execution in test generation
        try {
            int int86 = seconds26.compareTo((org.joda.time.base.BaseSingleFieldPeriod) weeks84);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Seconds cannot be compared to class org.joda.time.Weeks");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "weekyears" + "'", str12, "weekyears");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(weeks32);
        org.junit.Assert.assertNotNull(weeks36);
        org.junit.Assert.assertNotNull(weeks38);
        org.junit.Assert.assertNotNull(weeks40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(weeks42);
        org.junit.Assert.assertNotNull(mutablePeriod43);
        org.junit.Assert.assertNotNull(weeks44);
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertNotNull(weeks47);
        org.junit.Assert.assertNotNull(weeks49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(weeks51);
        org.junit.Assert.assertNotNull(weeks53);
        org.junit.Assert.assertNotNull(weeks55);
        org.junit.Assert.assertNotNull(weeks57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(weeks60);
        org.junit.Assert.assertNotNull(weeks62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(weeks71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 13 + "'", int72 == 13);
        org.junit.Assert.assertNotNull(weeks74);
        org.junit.Assert.assertNotNull(weeks76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(weeks79);
        org.junit.Assert.assertNotNull(weeks80);
        org.junit.Assert.assertNotNull(weeks82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(weeks84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test01220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01220");
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
        org.joda.time.Duration duration16 = duration8.toDuration();
        org.joda.time.Period period17 = duration16.toPeriod();
        int int18 = period17.getHours();
        org.joda.time.Period period20 = period17.minusDays((-2));
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType22 = periodType21.withHoursRemoved();
        org.joda.time.PeriodType periodType23 = periodType21.withMonthsRemoved();
        org.joda.time.Period period24 = period17.normalizedStandard(periodType23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period26 = period24.plusMinutes((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period24);
    }

    @Test
    public void test01221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01221");
        org.joda.time.Days days0 = org.joda.time.Days.ONE;
        org.joda.time.Weeks weeks1 = days0.toStandardWeeks();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = days0.getValue(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 2147483647");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(weeks1);
    }

    @Test
    public void test01222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01222");
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
        java.util.Locale locale20 = null;
        org.joda.time.format.PeriodFormatter periodFormatter21 = periodFormatter2.withLocale(locale20);
        boolean boolean22 = periodFormatter21.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod24 = periodFormatter21.parseMutablePeriod("P1D");
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
        org.junit.Assert.assertNotNull(periodFormatter21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test01223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01223");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType3 = seconds2.getFieldType();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.parseSeconds("P0W");
        org.joda.time.Seconds seconds6 = seconds2.minus(seconds5);
        org.joda.time.Seconds seconds7 = seconds2.negated();
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.seconds((int) (short) 0);
        org.joda.time.Seconds seconds10 = seconds7.minus(seconds9);
        org.joda.time.DurationFieldType durationFieldType11 = seconds10.getFieldType();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DurationField durationField13 = durationFieldType11.getField(chronology12);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test01224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01224");
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
        mutablePeriod2.setMinutes((int) (short) 0);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(4L, periodType19, chronology20);
        mutablePeriod2.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod21);
        int int23 = mutablePeriod2.getYears();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P97MT52S" + "'", str15, "P97MT52S");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test01225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01225");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        org.joda.time.Period period3 = mutablePeriod2.toPeriod();
        org.joda.time.Period period5 = period3.withHours(0);
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
            java.lang.String str16 = period3.toString(periodFormatter14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNull(periodParser9);
        org.junit.Assert.assertNotNull(periodFormatter11);
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(periodFormatter14);
        org.junit.Assert.assertNull(locale15);
    }

    @Test
    public void test01226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01226");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        long long1 = duration0.getStandardDays();
        org.joda.time.Hours hours2 = duration0.toStandardHours();
        long long3 = duration0.getStandardMinutes();
        org.joda.time.Period period4 = duration0.toPeriod();
        org.joda.time.Duration duration5 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = duration5.toPeriod(chronology6);
        org.joda.time.Hours hours8 = duration5.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType9 = hours8.getFieldType();
        org.joda.time.Period period11 = period4.withField(durationFieldType9, (int) ' ');
        int int12 = period4.getYears();
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test01227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01227");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, readableInstant2, periodType3);
        int int6 = mutablePeriod5.getWeeks();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((java.lang.Object) mutablePeriod5, chronology7);
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Days days11 = days9.plus((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days13 = days11.dividedBy(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days11);
    }

    @Test
    public void test01228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01228");
        org.joda.time.Period period1 = org.joda.time.Period.hours((-32));
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        int int4 = period1.getMonths();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test01229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01229");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(0L, (long) ' ');
        mutablePeriod2.setHours(0);
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
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration26, readableInstant33);
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration26);
        org.joda.time.ReadableDuration readableDuration36 = null;
        mutablePeriod2.add(readableDuration36);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType39 = mutablePeriod2.getFieldType((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test01230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01230");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) 600);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test01231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01231");
        org.joda.time.Period period1 = org.joda.time.Period.days(2147483647);
        int int2 = period1.getWeeks();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01232");
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(readableInstant6, readableDuration7);
        mutablePeriod8.setHours((int) (short) 100);
        boolean boolean11 = periodType5.equals((java.lang.Object) mutablePeriod8);
        org.joda.time.PeriodType periodType12 = periodType5.withMinutesRemoved();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) (short) 10, periodType5, chronology13);
        org.joda.time.PeriodType periodType15 = periodType5.withMinutesRemoved();
        org.joda.time.PeriodType periodType16 = periodType5.withMinutesRemoved();
        org.joda.time.Period period17 = new org.joda.time.Period((long) 97, periodType5);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test01233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01233");
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType4 = periodType3.withMonthsRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withMinutesRemoved();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (short) 0, periodType4, chronology6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(60L, 100L, periodType4, chronology8);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test01234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01234");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
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
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.millis();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) (short) 1, periodType18, chronology19);
        boolean boolean21 = periodType13.equals((java.lang.Object) chronology19);
        org.joda.time.PeriodType periodType22 = periodType13.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType13);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod23.addMinutes(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test01235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01235");
        org.joda.time.Days days2 = org.joda.time.Days.ZERO;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((java.lang.Object) days2, periodType3, chronology4);
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) 60, (long) (byte) 100, periodType3);
        org.joda.time.DurationFieldType[] durationFieldTypeArray7 = mutablePeriod6.getFieldTypes();
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(durationFieldTypeArray7);
    }

    @Test
    public void test01236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01236");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setMonths(100);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.addMinutes(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test01237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01237");
        org.joda.time.Period period1 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period3 = period1.withHours(32);
        org.joda.time.PeriodType periodType4 = period1.getPeriodType();
        org.joda.time.Period period6 = period1.withDays((int) (byte) -1);
        int int7 = period6.getMinutes();
        org.joda.time.Period period9 = period6.plusYears((int) (short) 10);
        int int10 = period9.getMonths();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test01238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01238");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 60, chronology1);
        org.joda.time.Period period4 = period2.withMinutes(35);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = period2.getValue((-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2147483648");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test01239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01239");
        org.joda.time.Period period4 = new org.joda.time.Period(40, 8, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test01240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01240");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 1, (long) 32);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, readableInstant3);
        mutablePeriod4.setYears((int) (short) 100);
    }

    @Test
    public void test01241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01241");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        java.util.Locale locale6 = periodFormatter2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = periodFormatter2.parsePeriod("PT0.032S");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(locale6);
    }

    @Test
    public void test01242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01242");
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
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 3, periodType28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((java.lang.Object) periodType28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test01243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01243");
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
        int int64 = minutes15.getMinutes();
        org.joda.time.DurationFieldType durationFieldType65 = minutes15.getFieldType();
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
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(durationFieldType65);
    }

    @Test
    public void test01244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01244");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        java.util.Locale locale3 = periodFormatter2.getLocale();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period7 = periodFormatter2.parsePeriod("PT480S");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(periodFormatter5);
    }

    @Test
    public void test01245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01245");
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.Period period6 = duration5.toPeriod();
        long long7 = duration5.getStandardSeconds();
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds10 = duration9.toStandardSeconds();
        java.lang.String str11 = seconds10.toString();
        org.joda.time.PeriodType periodType12 = seconds10.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(readableInstant3, (org.joda.time.ReadableDuration) duration5, periodType12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 1, 540000L, periodType12, chronology14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(4L, periodType12, chronology16);
        org.joda.time.Chronology chronology18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((java.lang.Object) periodType12, chronology18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-60L) + "'", long7 == (-60L));
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT60S" + "'", str11, "PT60S");
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test01246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01246");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Days days1 = seconds0.toStandardDays();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test01247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01247");
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
        org.joda.time.Minutes minutes13 = minutes10.negated();
        org.joda.time.Minutes minutes14 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType15 = minutes14.getPeriodType();
        org.joda.time.Minutes minutes16 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes17 = minutes14.plus(minutes16);
        org.joda.time.Minutes minutes18 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes19 = org.joda.time.Minutes.ZERO;
        boolean boolean20 = minutes18.isLessThan(minutes19);
        boolean boolean21 = minutes14.isLessThan(minutes18);
        org.joda.time.Duration duration22 = minutes14.toStandardDuration();
        org.joda.time.Minutes minutes23 = minutes10.minus(minutes14);
        org.joda.time.Duration duration24 = minutes10.toStandardDuration();
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
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(duration24);
    }

    @Test
    public void test01248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01248");
        org.joda.time.Hours hours0 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours1 = hours0.negated();
        org.joda.time.Hours hours2 = org.joda.time.Hours.ONE;
        boolean boolean3 = hours1.isLessThan(hours2);
        org.joda.time.Period period8 = new org.joda.time.Period(0, (int) '4', (int) (short) 100, (int) (byte) -1);
        org.joda.time.Period period10 = period8.withDays((int) 'a');
        org.joda.time.Weeks weeks11 = period10.toStandardWeeks();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hours1.compareTo((org.joda.time.base.BaseSingleFieldPeriod) weeks11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Hours cannot be compared to class org.joda.time.Weeks");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(weeks11);
    }

    @Test
    public void test01249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01249");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("PT-1H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01250");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.PeriodType periodType5 = periodFormatter2.getParseType();
        java.util.Locale locale6 = null;
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withLocale(locale6);
        org.joda.time.MutablePeriod mutablePeriod9 = org.joda.time.MutablePeriod.parse("P97MT52S");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod9, "", 25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNull(periodType5);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNotNull(mutablePeriod9);
    }

    @Test
    public void test01251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01251");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.format.PeriodParser periodParser4 = periodFormatter3.getParser();
        java.util.Locale locale5 = periodFormatter3.getLocale();
        org.joda.time.PeriodType periodType6 = periodFormatter3.getParseType();
        org.joda.time.format.PeriodParser periodParser7 = periodFormatter3.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = org.joda.time.Period.parse("PeriodType[YearWeekDayTime]", periodFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser4);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNull(periodType6);
        org.junit.Assert.assertNull(periodParser7);
    }

    @Test
    public void test01252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01252");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType2 = periodType1.withMinutesRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withYearsRemoved();
        java.lang.String str4 = periodType3.toString();
        org.joda.time.PeriodType periodType5 = periodType3.withWeeksRemoved();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(60000L, periodType3, chronology6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = mutablePeriod7.getValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PeriodType[Millis]" + "'", str4, "PeriodType[Millis]");
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test01253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01253");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType2 = periodType1.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (-1), periodType2);
        org.joda.time.MutablePeriod mutablePeriod4 = mutablePeriod3.copy();
        mutablePeriod4.setPeriod((long) 0, 864000000L);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(mutablePeriod4);
    }

    @Test
    public void test01254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01254");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("PT-2H", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01255");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '4', chronology1);
        int int3 = mutablePeriod2.getHours();
        org.joda.time.Duration duration4 = org.joda.time.Duration.ZERO;
        long long5 = duration4.getStandardDays();
        org.joda.time.Hours hours6 = duration4.toStandardHours();
        long long7 = duration4.getStandardMinutes();
        mutablePeriod2.add((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test01256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01256");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter2.getPrinter();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType9 = periodType8.withWeeksRemoved();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = duration7.toPeriod(periodType8, chronology10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType14 = periodType13.withMonthsRemoved();
        org.joda.time.Period period15 = duration7.toPeriodTo(readableInstant12, periodType14);
        org.joda.time.Minutes minutes16 = duration7.toStandardMinutes();
        java.lang.String str17 = duration7.toString();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(readableInstant5, (org.joda.time.ReadableDuration) duration7);
        mutablePeriod18.setMillis((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod18, "P2147483647D", 32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT-60S" + "'", str17, "PT-60S");
    }

    @Test
    public void test01257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01257");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period3 = period1.minusWeeks(52);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period5 = period1.toPeriod();
        java.lang.String str6 = period5.toString();
        org.joda.time.Period period7 = period5.toPeriod();
        int int8 = period7.getMonths();
        org.joda.time.Period period10 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days11 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period10);
        org.joda.time.PeriodType periodType12 = days11.getPeriodType();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(readableInstant13, readableDuration14);
        mutablePeriod15.setHours((int) (short) 100);
        boolean boolean18 = periodType12.equals((java.lang.Object) mutablePeriod15);
        org.joda.time.PeriodType periodType19 = periodType12.withMonthsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = period7.withPeriodType(periodType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT1M" + "'", str6, "PT1M");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test01258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01258");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Period period7 = duration1.toPeriod();
        org.joda.time.Period period8 = period7.negated();
        org.joda.time.Period period10 = period7.withMillis(100);
        org.joda.time.Period period11 = period10.negated();
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        int int13 = mutablePeriod12.getMonths();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test01259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01259");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((java.lang.Object) interval8, chronology11);
        org.joda.time.Seconds seconds13 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.Seconds seconds15 = seconds13.minus(7);
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds18 = duration17.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType19 = seconds18.getFieldType();
        org.joda.time.Seconds seconds21 = org.joda.time.Seconds.parseSeconds("P0W");
        org.joda.time.Seconds seconds22 = seconds18.minus(seconds21);
        int int23 = seconds22.getSeconds();
        org.joda.time.Seconds seconds25 = seconds22.multipliedBy((int) (byte) 0);
        org.joda.time.Seconds seconds26 = seconds15.plus(seconds25);
        org.joda.time.Duration duration28 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds29 = duration28.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType30 = seconds29.getFieldType();
        org.joda.time.Seconds seconds32 = org.joda.time.Seconds.parseSeconds("P0W");
        org.joda.time.Seconds seconds33 = seconds29.minus(seconds32);
        org.joda.time.Seconds seconds34 = seconds29.negated();
        org.joda.time.Seconds seconds36 = org.joda.time.Seconds.seconds((int) (short) 0);
        org.joda.time.Seconds seconds37 = seconds34.minus(seconds36);
        boolean boolean38 = seconds25.isGreaterThan(seconds37);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds40 = seconds37.dividedBy(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertNotNull(seconds36);
        org.junit.Assert.assertNotNull(seconds37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test01260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01260");
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
        org.joda.time.Period period16 = period14.withWeeks((int) ' ');
        org.joda.time.Period period18 = period16.plusWeeks(25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = period16.plusMillis((-672));
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
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test01261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01261");
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
        java.lang.String str52 = durationFieldType48.getName();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DurationField durationField54 = durationFieldType48.getField(chronology53);
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
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "days" + "'", str52, "days");
        org.junit.Assert.assertNotNull(durationField54);
    }

    @Test
    public void test01262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01262");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(0L, (long) ' ');
        mutablePeriod2.setHours(0);
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
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration26, readableInstant33);
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration26);
        org.joda.time.ReadableDuration readableDuration36 = null;
        mutablePeriod2.add(readableDuration36);
        mutablePeriod2.setMinutes(6);
        org.joda.time.DurationFieldType durationFieldType40 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod2.set(durationFieldType40, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'null'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test01263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01263");
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
        boolean boolean16 = periodFormatter12.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period18 = periodFormatter12.parsePeriod("");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01264");
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
        org.joda.time.Duration duration17 = days0.toStandardDuration();
        org.joda.time.MutablePeriod mutablePeriod18 = days0.toMutablePeriod();
        org.joda.time.PeriodType periodType19 = days0.getPeriodType();
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
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(mutablePeriod18);
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test01265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01265");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT0S");
        org.joda.time.Hours hours2 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) mutablePeriod1);
        org.joda.time.Minutes minutes3 = hours2.toStandardMinutes();
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(minutes3);
    }

    @Test
    public void test01266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01266");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period3 = period1.plusYears((int) ' ');
        org.joda.time.Period period5 = period1.plusDays((int) (byte) -1);
        java.lang.String str6 = period5.toString();
        org.joda.time.Period period8 = period5.minusWeeks((-1));
        org.joda.time.Period period10 = period5.multipliedBy(32);
        org.joda.time.Period period11 = period5.negated();
        int int12 = period5.getYears();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P-1DT1M" + "'", str6, "P-1DT1M");
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test01267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01267");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FOUR;
        org.joda.time.Duration duration1 = hours0.toStandardDuration();
        org.joda.time.Hours hours3 = hours0.dividedBy((int) ' ');
        org.joda.time.PeriodType periodType4 = hours3.getPeriodType();
        org.joda.time.Duration duration6 = org.joda.time.Duration.millis(0L);
        org.joda.time.Hours hours7 = duration6.toStandardHours();
        boolean boolean8 = hours3.isGreaterThan(hours7);
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01268");
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
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType15 = periodType14.withSecondsRemoved();
        org.joda.time.PeriodType periodType16 = periodType14.withMinutesRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period17 = new org.joda.time.Period((java.lang.Object) period13, periodType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test01269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01269");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds11 = duration10.toStandardSeconds();
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds14 = duration13.toStandardSeconds();
        boolean boolean15 = duration10.isLongerThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType18 = periodType17.withMinutesRemoved();
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration13, readableInstant16, periodType17);
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant8, (org.joda.time.ReadableDuration) duration13);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period22 = duration13.toPeriod(periodType21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(readableInstant24, readableDuration25);
        mutablePeriod26.setHours((int) (short) 100);
        org.joda.time.Duration duration30 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology31 = null;
        mutablePeriod26.setPeriod((org.joda.time.ReadableDuration) duration30, chronology31);
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType34 = periodType33.withWeeksRemoved();
        org.joda.time.PeriodType periodType35 = periodType34.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(readableInstant23, (org.joda.time.ReadableDuration) duration30, periodType34);
        org.joda.time.Period period37 = duration13.toPeriod(periodType34);
        org.joda.time.PeriodType periodType38 = periodType34.withDaysRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period39 = new org.joda.time.Period(0, (int) (byte) 1, (-8), 3, (-1), (-2), (-60), 97, periodType38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(periodType38);
    }

    @Test
    public void test01270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01270");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("P8M");
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test01271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01271");
        org.joda.time.Days days0 = org.joda.time.Days.ZERO;
        org.joda.time.Days days1 = days0.negated();
        int int2 = days0.size();
        org.joda.time.Days days4 = days0.minus(0);
        org.joda.time.Duration duration5 = days4.toStandardDuration();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(duration5);
    }

    @Test
    public void test01272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01272");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.PeriodType periodType5 = periodFormatter2.getParseType();
        org.joda.time.format.PeriodParser periodParser6 = periodFormatter2.getParser();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 25);
        int int9 = mutablePeriod8.getMinutes();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod8, "PT-115200S", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNull(periodType5);
        org.junit.Assert.assertNull(periodParser6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test01273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01273");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis(100000L);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test01274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01274");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        org.joda.time.Period period3 = mutablePeriod2.toPeriod();
        org.joda.time.Period period5 = period3.withHours(0);
        int int6 = period3.getWeeks();
        org.joda.time.Period period8 = period3.plusSeconds((int) (byte) 100);
        org.joda.time.Period period10 = period3.withWeeks((int) '#');
        org.joda.time.Period period12 = period10.withDays(54);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test01275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01275");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) (short) 0);
        mutablePeriod1.addWeeks((int) (byte) 0);
        mutablePeriod1.setMinutes(5);
    }

    @Test
    public void test01276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01276");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("P-32DT32M");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"P-32DT32M\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01277");
        java.lang.Object obj0 = null;
        org.joda.time.Period period1 = new org.joda.time.Period(obj0);
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType3 = minutes2.getPeriodType();
        int int4 = minutes2.getMinutes();
        java.lang.String str5 = minutes2.toString();
        org.joda.time.Minutes minutes6 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType7 = minutes6.getFieldType();
        java.lang.String str8 = minutes6.toString();
        boolean boolean9 = minutes2.isLessThan(minutes6);
        org.joda.time.Minutes minutes11 = minutes6.minus(0);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 25);
        org.joda.time.Minutes minutes14 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) mutablePeriod13);
        boolean boolean15 = minutes6.isGreaterThan(minutes14);
        org.joda.time.DurationFieldType durationFieldType16 = minutes14.getFieldType();
        org.joda.time.Period period18 = period1.withField(durationFieldType16, 0);
        java.lang.String str19 = durationFieldType16.getName();
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT0M" + "'", str5, "PT0M");
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT-2147483648M" + "'", str8, "PT-2147483648M");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "minutes" + "'", str19, "minutes");
    }

    @Test
    public void test01278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01278");
        org.joda.time.Duration duration2 = new org.joda.time.Duration(100000L, (-2419200L));
    }

    @Test
    public void test01279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01279");
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
        int int14 = periodType11.size();
        org.joda.time.DurationFieldType durationFieldType16 = periodType11.getFieldType(0);
        org.joda.time.Chronology chronology17 = null;
        boolean boolean18 = durationFieldType16.isSupported(chronology17);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test01280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01280");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        java.util.Locale locale3 = periodFormatter2.getLocale();
        org.joda.time.format.PeriodParser periodParser4 = periodFormatter2.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod6 = periodFormatter2.parseMutablePeriod("PT1M0.100S");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNull(periodParser4);
    }

    @Test
    public void test01281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01281");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 10, (long) 2);
    }

    @Test
    public void test01282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01282");
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.standard();
        org.joda.time.Period period10 = new org.joda.time.Period((long) 8, periodType9);
        org.joda.time.Minutes minutes12 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType13 = minutes12.getPeriodType();
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType16);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.weekyears();
        int int19 = period17.get(durationFieldType18);
        boolean boolean20 = periodType13.isSupported(durationFieldType18);
        org.joda.time.PeriodType periodType21 = periodType13.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 3, periodType13);
        org.joda.time.Period period23 = period10.normalizedStandard(periodType13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((-1), (-1), (int) (short) 10, 4, (int) (short) 100, 4, (-60), (int) (short) 10, periodType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period23);
    }

    @Test
    public void test01283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01283");
        org.joda.time.Days days1 = org.joda.time.Days.days(32);
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardDays((long) (byte) 0);
        org.joda.time.Days days4 = duration3.toStandardDays();
        org.joda.time.Days days5 = days1.minus(days4);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
    }

    @Test
    public void test01284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01284");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period2 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period2);
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(readableInstant5, readableDuration6);
        mutablePeriod7.setHours((int) (short) 100);
        boolean boolean10 = periodType4.equals((java.lang.Object) mutablePeriod7);
        org.joda.time.Duration duration11 = org.joda.time.Duration.ZERO;
        long long12 = duration11.getStandardDays();
        mutablePeriod7.add((org.joda.time.ReadableDuration) duration11);
        long long14 = duration11.getStandardMinutes();
        org.joda.time.Duration duration16 = duration11.withMillis((long) 0);
        long long17 = duration16.getMillis();
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Interval interval19 = duration16.toIntervalTo(readableInstant18);
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration16);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(interval19);
    }

    @Test
    public void test01285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01285");
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
        java.lang.String str22 = periodType20.getName();
        org.joda.time.DurationFieldType durationFieldType23 = null;
        boolean boolean24 = periodType20.isSupported(durationFieldType23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period25 = new org.joda.time.Period((-1), 658, 13, 25, 100, 40, 6, (int) (short) 1, periodType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Millis" + "'", str22, "Millis");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test01286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01286");
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
        java.util.Locale locale20 = null;
        org.joda.time.format.PeriodFormatter periodFormatter21 = periodFormatter2.withLocale(locale20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod23 = periodFormatter2.parseMutablePeriod("days");
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
        org.junit.Assert.assertNotNull(periodFormatter21);
    }

    @Test
    public void test01287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01287");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration1 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = duration1.toPeriod(chronology2);
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        java.lang.String str7 = seconds6.toString();
        org.joda.time.PeriodType periodType8 = seconds6.getPeriodType();
        org.joda.time.PeriodType periodType9 = seconds6.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration1, periodType9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutablePeriod10.setPeriod(readablePeriod11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = mutablePeriod10.toDurationFrom(readableInstant13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType16 = mutablePeriod10.getFieldType((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT60S" + "'", str7, "PT60S");
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(duration14);
    }

    @Test
    public void test01288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01288");
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
        int int14 = mutablePeriod13.getHours();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test01289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01289");
        org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT0.052S");
        org.joda.time.Duration duration3 = duration1.minus((long) 'a');
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType7 = periodType6.withDaysRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withMonthsRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType9);
        org.joda.time.Period period11 = duration1.toPeriod(periodType9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = period11.minusMillis(13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test01290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01290");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter2.getPrinter();
        boolean boolean5 = periodFormatter2.isParser();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((-60L), (long) 32, chronology8);
        org.joda.time.Period period11 = period9.withHours((int) (short) -1);
        org.joda.time.Period period13 = period9.plusSeconds(0);
        org.joda.time.Period period15 = period9.plusHours(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = periodFormatter2.print((org.joda.time.ReadablePeriod) period9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test01291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01291");
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
        boolean boolean14 = periodFormatter3.isParser();
        java.util.Locale locale15 = null;
        org.joda.time.format.PeriodFormatter periodFormatter16 = periodFormatter3.withLocale(locale15);
        boolean boolean17 = periodFormatter3.isPrinter();
        java.util.Locale locale18 = null;
        org.joda.time.format.PeriodFormatter periodFormatter19 = periodFormatter3.withLocale(locale18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = org.joda.time.Period.parse("PeriodType[Days]", periodFormatter19);
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
        org.junit.Assert.assertNotNull(periodFormatter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(periodFormatter19);
    }

    @Test
    public void test01292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01292");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours(25);
        org.joda.time.DurationFieldType durationFieldType2 = hours1.getFieldType();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        java.lang.Object obj5 = null;
        org.joda.time.Duration duration6 = new org.joda.time.Duration(obj5);
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, (org.joda.time.ReadableDuration) duration6);
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant3, (org.joda.time.ReadableDuration) duration6);
        org.joda.time.Duration duration9 = duration6.toDuration();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        java.lang.Object obj12 = null;
        org.joda.time.Duration duration13 = new org.joda.time.Duration(obj12);
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, (org.joda.time.ReadableDuration) duration13);
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant10, (org.joda.time.ReadableDuration) duration13);
        int int16 = duration6.compareTo((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Interval interval18 = duration13.toIntervalTo(readableInstant17);
        org.joda.time.Seconds seconds19 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval18);
        org.joda.time.Seconds seconds21 = org.joda.time.Seconds.seconds(2);
        org.joda.time.Duration duration22 = seconds21.toStandardDuration();
        org.joda.time.Seconds seconds23 = seconds19.minus(seconds21);
        org.joda.time.Seconds seconds25 = seconds19.plus((-1));
        org.joda.time.Seconds seconds27 = seconds25.minus(0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = hours1.compareTo((org.joda.time.base.BaseSingleFieldPeriod) seconds27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Hours cannot be compared to class org.joda.time.Seconds");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(seconds27);
    }

    @Test
    public void test01293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01293");
        org.joda.time.Days days0 = org.joda.time.Days.ZERO;
        org.joda.time.Period period2 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period2);
        org.joda.time.Days days5 = days3.minus(10);
        boolean boolean6 = days0.isGreaterThan(days3);
        org.joda.time.Days days8 = days3.multipliedBy((int) '4');
        int int9 = days3.getDays();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test01294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01294");
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
        boolean boolean16 = periodFormatter12.isPrinter();
        java.lang.StringBuffer stringBuffer17 = null;
        org.joda.time.Days days19 = org.joda.time.Days.days(32);
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
        java.lang.String str35 = days34.toString();
        org.joda.time.Days days36 = days19.minus(days34);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter12.printTo(stringBuffer17, (org.joda.time.ReadablePeriod) days19);
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
        org.junit.Assert.assertNull(periodPrinter13);
        org.junit.Assert.assertNull(periodParser14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(days19);
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "P0D" + "'", str35, "P0D");
        org.junit.Assert.assertNotNull(days36);
    }

    @Test
    public void test01295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01295");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableInstant4, readableDuration5);
        mutablePeriod6.setHours((int) (short) 100);
        boolean boolean9 = periodType3.equals((java.lang.Object) mutablePeriod6);
        org.joda.time.PeriodType periodType10 = periodType3.withYearsRemoved();
        org.joda.time.Minutes minutes11 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType12 = minutes11.getPeriodType();
        org.joda.time.PeriodType periodType13 = periodType12.withMinutesRemoved();
        org.joda.time.Chronology chronology14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period15 = new org.joda.time.Period((java.lang.Object) periodType10, periodType13, chronology14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test01296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01296");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType2);
        int int4 = period3.getMillis();
        org.joda.time.Period period6 = period3.plusDays((int) 'a');
        int[] intArray7 = period3.getValues();
        int int8 = period3.getMillis();
        org.joda.time.Period period10 = period3.minusHours(2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 25 + "'", int4 == 25);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0, 0, 0, 0, 0, 25]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 25 + "'", int8 == 25);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test01297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01297");
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
        org.joda.time.Minutes minutes19 = minutes18.negated();
        org.joda.time.MutablePeriod mutablePeriod20 = minutes18.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType22 = mutablePeriod20.getFieldType(54);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(mutablePeriod20);
    }

    @Test
    public void test01298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01298");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        org.joda.time.Period period3 = mutablePeriod2.toPeriod();
        org.joda.time.Period period5 = period3.withHours(0);
        int int6 = period3.getWeeks();
        org.joda.time.Period period8 = period3.withMillis((int) 'a');
        org.joda.time.Period period10 = period8.plusYears(7);
        org.joda.time.Period period12 = period10.minusWeeks(600);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds13 = period10.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Seconds as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test01299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01299");
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
        long long13 = duration10.getStandardMinutes();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((java.lang.Object) duration10, chronology14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Interval interval17 = duration10.toIntervalFrom(readableInstant16);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(interval17);
    }

    @Test
    public void test01300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01300");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-8), chronology1);
    }

    @Test
    public void test01301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01301");
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
        mutablePeriod9.setPeriod(864000000L);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test01302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01302");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        org.joda.time.MutablePeriod mutablePeriod8 = days2.toMutablePeriod();
        mutablePeriod8.setPeriod((long) (byte) 10, 0L);
        mutablePeriod8.addSeconds((int) (byte) -1);
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod8.add((long) 8, chronology15);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mutablePeriod8);
    }

    @Test
    public void test01303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01303");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds4 = duration3.toStandardSeconds();
        java.lang.String str5 = seconds4.toString();
        org.joda.time.PeriodType periodType6 = seconds4.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withSecondsRemoved();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) (-1), (long) 100, periodType7, chronology8);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(periodType7);
        mutablePeriod10.clear();
        org.joda.time.Period period13 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period15 = period13.plusYears((int) ' ');
        org.joda.time.Period period17 = period13.plusDays((int) (byte) -1);
        java.lang.String str18 = period17.toString();
        org.joda.time.Period period20 = period17.minusWeeks((-1));
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod10.setPeriod((org.joda.time.ReadablePeriod) period17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT60S" + "'", str5, "PT60S");
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "P-1DT1M" + "'", str18, "P-1DT1M");
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test01304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01304");
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
        org.joda.time.Duration duration13 = duration5.toDuration();
        org.joda.time.Duration duration14 = duration13.toDuration();
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardHours((-60L));
        int int17 = duration14.compareTo((org.joda.time.ReadableDuration) duration16);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test01305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01305");
        org.joda.time.Hours hours0 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours2 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean3 = hours0.isGreaterThan(hours2);
        org.joda.time.Duration duration4 = hours2.toStandardDuration();
        org.joda.time.Period period5 = duration4.toPeriod();
        org.joda.time.Period period7 = period5.minusSeconds((int) (byte) 100);
        org.joda.time.Period period9 = period5.withWeeks(52);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) (short) 0);
        mutablePeriod11.addWeeks((int) (byte) 0);
        mutablePeriod11.addHours((-672));
        mutablePeriod11.setPeriod((long) (-32), (long) (short) -1);
        mutablePeriod11.setPeriod((long) (byte) 100);
        org.joda.time.Period period21 = period9.plus((org.joda.time.ReadablePeriod) mutablePeriod11);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = period21.getValue(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period21);
    }

    @Test
    public void test01306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01306");
        org.joda.time.Period period1 = org.joda.time.Period.days(25);
        org.joda.time.Hours hours2 = org.joda.time.Hours.THREE;
        org.joda.time.DurationFieldType durationFieldType3 = hours2.getFieldType();
        org.joda.time.Period period5 = period1.withFieldAdded(durationFieldType3, (-32));
        org.joda.time.Period period7 = period1.plusDays(25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType9 = period1.getFieldType(25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test01307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01307");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '4', chronology1);
        int int3 = mutablePeriod2.getHours();
        org.joda.time.Duration duration4 = org.joda.time.Duration.ZERO;
        long long5 = duration4.getStandardDays();
        org.joda.time.Hours hours6 = duration4.toStandardHours();
        long long7 = duration4.getStandardMinutes();
        mutablePeriod2.add((org.joda.time.ReadableDuration) duration4);
        org.joda.time.format.PeriodPrinter periodPrinter9 = null;
        org.joda.time.format.PeriodParser periodParser10 = null;
        org.joda.time.format.PeriodFormatter periodFormatter11 = new org.joda.time.format.PeriodFormatter(periodPrinter9, periodParser10);
        org.joda.time.format.PeriodParser periodParser12 = periodFormatter11.getParser();
        java.util.Locale locale13 = null;
        org.joda.time.format.PeriodFormatter periodFormatter14 = periodFormatter11.withLocale(locale13);
        org.joda.time.format.PeriodPrinter periodPrinter15 = periodFormatter14.getPrinter();
        org.joda.time.PeriodType periodType16 = periodFormatter14.getParseType();
        boolean boolean17 = periodFormatter14.isPrinter();
        org.joda.time.PeriodType periodType18 = periodFormatter14.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = mutablePeriod2.toString(periodFormatter14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(periodParser12);
        org.junit.Assert.assertNotNull(periodFormatter14);
        org.junit.Assert.assertNull(periodPrinter15);
        org.junit.Assert.assertNull(periodType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(periodType18);
    }

    @Test
    public void test01308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01308");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = period1.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period6 = period4.normalizedStandard(periodType5);
        org.joda.time.Period period7 = period4.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(0L);
        mutablePeriod9.addMonths((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod9.toDurationTo(readableInstant12);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.weekyears();
        int int15 = mutablePeriod9.get(durationFieldType14);
        boolean boolean16 = period7.isSupported(durationFieldType14);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01309");
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
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds18 = duration17.toStandardSeconds();
        java.lang.String str19 = seconds18.toString();
        org.joda.time.PeriodType periodType20 = seconds18.getPeriodType();
        org.joda.time.PeriodType periodType21 = periodType20.withSecondsRemoved();
        org.joda.time.PeriodType periodType22 = periodType21.withDaysRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter23 = periodFormatter15.withParseType(periodType22);
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.PeriodType periodType25 = periodType24.withMillisRemoved();
        org.joda.time.Chronology chronology26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period27 = new org.joda.time.Period((java.lang.Object) periodFormatter23, periodType25, chronology26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.format.PeriodFormatter");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT60S" + "'", str19, "PT60S");
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodFormatter23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
    }

    @Test
    public void test01310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01310");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours(60);
        org.joda.time.Weeks weeks2 = hours1.toStandardWeeks();
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(weeks2);
    }

    @Test
    public void test01311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01311");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period7 = period4.withSeconds((int) ' ');
        org.joda.time.Period period8 = period1.minus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period10 = period1.plusHours((-1));
        org.joda.time.Period period12 = period1.withDays((int) 'a');
        org.joda.time.Period period14 = period12.withSeconds(52);
        int int15 = period12.getMillis();
        int int16 = period12.getHours();
        org.joda.time.Period period18 = period12.minusYears(13);
        org.joda.time.Period period19 = period18.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks20 = period19.toStandardWeeks();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Weeks as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test01312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01312");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.secondsIn(readableInterval0);
        org.joda.time.Minutes minutes2 = seconds1.toStandardMinutes();
        org.joda.time.Hours hours3 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours5 = hours3.minus(0);
        org.joda.time.Hours hours7 = hours5.multipliedBy((int) (byte) 10);
        org.joda.time.Hours hours9 = hours7.dividedBy((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int10 = seconds1.compareTo((org.joda.time.base.BaseSingleFieldPeriod) hours9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Seconds cannot be compared to class org.joda.time.Hours");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(hours9);
    }

    @Test
    public void test01313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01313");
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
        org.joda.time.Period period22 = duration1.toPeriod();
        org.joda.time.Duration duration23 = duration1.toDuration();
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = duration1.toPeriodTo(readableInstant24);
        org.joda.time.Period period27 = period25.minusYears((-1));
        org.joda.time.Period period29 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days30 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period29);
        org.joda.time.PeriodType periodType31 = days30.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType32 = null;
        int int33 = periodType31.indexOf(durationFieldType32);
        org.joda.time.PeriodType periodType34 = periodType31.withWeeksRemoved();
        org.joda.time.PeriodType periodType35 = periodType31.withDaysRemoved();
        org.joda.time.Chronology chronology36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period37 = new org.joda.time.Period((java.lang.Object) period27, periodType31, chronology36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(periodType35);
    }

    @Test
    public void test01314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01314");
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
        java.util.Locale locale20 = null;
        org.joda.time.format.PeriodFormatter periodFormatter21 = periodFormatter2.withLocale(locale20);
        boolean boolean22 = periodFormatter21.isPrinter();
        java.io.Writer writer23 = null;
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter21.printTo(writer23, readablePeriod24);
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
        org.junit.Assert.assertNotNull(periodFormatter21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test01315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01315");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) 0, (long) 2, chronology3);
        mutablePeriod4.add((long) (byte) -1);
        mutablePeriod4.addWeeks((int) (byte) -1);
        org.joda.time.PeriodType periodType9 = mutablePeriod4.getPeriodType();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) (byte) -1, periodType9, chronology10);
        org.joda.time.Period period13 = period11.minusMillis((-672));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType15 = period13.getFieldType((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test01316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01316");
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
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter12.withParseType(periodType16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = periodFormatter17.parsePeriod("");
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
        org.junit.Assert.assertNotNull(periodFormatter17);
    }

    @Test
    public void test01317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01317");
        org.joda.time.Period period1 = org.joda.time.Period.millis((-32));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01318");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("halfdays");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"halfdays\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01319");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("Millis");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Millis\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01320");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ZERO;
        org.joda.time.Seconds seconds2 = seconds0.dividedBy((int) (byte) 1);
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType6 = seconds5.getFieldType();
        org.joda.time.Seconds seconds8 = seconds5.plus(25);
        org.joda.time.Seconds seconds9 = seconds5.negated();
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.MIN_VALUE;
        org.joda.time.Seconds seconds11 = seconds5.plus(seconds10);
        org.joda.time.Duration duration12 = seconds10.toStandardDuration();
        org.joda.time.Seconds seconds13 = seconds0.plus(seconds10);
        org.joda.time.Seconds seconds15 = seconds10.plus((int) (short) 10);
        int int16 = seconds15.getSeconds();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2147483638) + "'", int16 == (-2147483638));
    }

    @Test
    public void test01321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01321");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) 0);
    }

    @Test
    public void test01322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01322");
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
        long long19 = duration1.getMillis();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test01323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01323");
        org.joda.time.Period period8 = new org.joda.time.Period((int) ' ', (int) 'a', 8, 8, (int) (short) 100, 0, 2, 13);
        org.joda.time.Period period10 = period8.minusMinutes(10);
        org.joda.time.format.PeriodPrinter periodPrinter11 = null;
        org.joda.time.format.PeriodParser periodParser12 = null;
        org.joda.time.format.PeriodFormatter periodFormatter13 = new org.joda.time.format.PeriodFormatter(periodPrinter11, periodParser12);
        org.joda.time.format.PeriodParser periodParser14 = periodFormatter13.getParser();
        java.util.Locale locale15 = null;
        org.joda.time.format.PeriodFormatter periodFormatter16 = periodFormatter13.withLocale(locale15);
        java.util.Locale locale17 = periodFormatter16.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = period8.toString(periodFormatter16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNull(periodParser14);
        org.junit.Assert.assertNotNull(periodFormatter16);
        org.junit.Assert.assertNull(locale17);
    }

    @Test
    public void test01324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01324");
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
        int[] intArray32 = period31.getValues();
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
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 0]");
    }

    @Test
    public void test01325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01325");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        org.joda.time.Period period9 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days10 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Days days11 = days5.minus(days10);
        org.joda.time.Days days12 = null;
        boolean boolean13 = days11.isGreaterThan(days12);
        int int14 = days11.getDays();
        org.joda.time.Days days16 = days11.dividedBy(2);
        int int17 = days16.getDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test01326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01326");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType3 = periodType2.withMinutesRemoved();
        org.joda.time.PeriodType periodType4 = periodType2.withYearsRemoved();
        java.lang.String str5 = periodType4.toString();
        org.joda.time.PeriodType periodType6 = periodType4.withWeeksRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period7 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PeriodType[Millis]" + "'", str5, "PeriodType[Millis]");
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test01327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01327");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(540000L, (long) '4');
        java.lang.String str3 = mutablePeriod2.toString();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = mutablePeriod2.toDurationTo(readableInstant4);
        org.joda.time.Period period7 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days8 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period7);
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableInstant10, readableDuration11);
        mutablePeriod12.setHours((int) (short) 100);
        boolean boolean15 = periodType9.equals((java.lang.Object) mutablePeriod12);
        org.joda.time.PeriodType periodType16 = periodType9.withYearsRemoved();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = duration5.toPeriod(periodType9, chronology17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = period18.withMinutes((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT-8M-59.948S" + "'", str3, "PT-8M-59.948S");
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test01328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01328");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        org.joda.time.Period period3 = mutablePeriod2.toPeriod();
        int int4 = period3.size();
        org.joda.time.Period period6 = period3.plusDays(1);
        org.joda.time.Period period8 = period6.plusMillis((int) '#');
        org.joda.time.Period period10 = period8.withDays(1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = period10.getValue(60);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 60");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test01329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01329");
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
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType39 = periodType38.withHoursRemoved();
        boolean boolean40 = duration32.equals((java.lang.Object) periodType38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType42 = periodType38.getFieldType(4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
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
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test01330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01330");
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
        org.joda.time.Minutes minutes12 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType13 = minutes12.getPeriodType();
        int int14 = minutes12.getMinutes();
        java.lang.String str15 = minutes12.toString();
        org.joda.time.Minutes minutes16 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType17 = minutes16.getFieldType();
        java.lang.String str18 = minutes16.toString();
        boolean boolean19 = minutes12.isLessThan(minutes16);
        org.joda.time.Minutes minutes20 = minutes12.negated();
        boolean boolean21 = minutes11.isLessThan(minutes20);
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.Period period24 = duration23.toPeriod();
        org.joda.time.Seconds seconds25 = duration23.toStandardSeconds();
        org.joda.time.Duration duration27 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds28 = duration27.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType29 = seconds28.getFieldType();
        org.joda.time.Seconds seconds31 = seconds28.plus(25);
        boolean boolean32 = seconds25.isLessThan(seconds31);
        org.joda.time.Seconds seconds33 = seconds31.negated();
        org.joda.time.Seconds seconds35 = seconds31.minus(600);
        org.joda.time.Seconds seconds36 = null;
        org.joda.time.Seconds seconds37 = seconds31.minus(seconds36);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = minutes11.compareTo((org.joda.time.base.BaseSingleFieldPeriod) seconds31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Minutes cannot be compared to class org.joda.time.Seconds");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT0M" + "'", str15, "PT0M");
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT-2147483648M" + "'", str18, "PT-2147483648M");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertNotNull(seconds35);
        org.junit.Assert.assertNotNull(seconds37);
    }

    @Test
    public void test01331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01331");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period6 = period3.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period8 = period6.normalizedStandard(periodType7);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType7);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod9.setDays(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test01332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01332");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1);
        org.joda.time.format.PeriodFormatter periodFormatter3 = null;
        java.lang.String str4 = mutablePeriod2.toString(periodFormatter3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        int int6 = mutablePeriod2.indexOf(durationFieldType5);
        org.joda.time.Hours hours7 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) mutablePeriod2);
        mutablePeriod2.setWeeks(6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0S" + "'", str4, "PT0S");
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(hours7);
    }

    @Test
    public void test01333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01333");
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
        org.joda.time.Duration duration12 = duration10.plus((long) (-1));
        org.joda.time.Duration duration14 = duration12.minus(1L);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period17 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days18 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period17);
        org.joda.time.PeriodType periodType19 = days18.getPeriodType();
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(readableInstant20, readableDuration21);
        mutablePeriod22.setHours((int) (short) 100);
        boolean boolean25 = periodType19.equals((java.lang.Object) mutablePeriod22);
        org.joda.time.Duration duration26 = org.joda.time.Duration.ZERO;
        long long27 = duration26.getStandardDays();
        mutablePeriod22.add((org.joda.time.ReadableDuration) duration26);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType31 = periodType30.withWeeksRemoved();
        org.joda.time.PeriodType periodType32 = periodType31.withDaysRemoved();
        org.joda.time.Period period33 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration26, readableInstant29, periodType31);
        org.joda.time.PeriodType periodType34 = periodType31.withMonthsRemoved();
        java.lang.String str35 = periodType34.toString();
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration14, readableInstant15, periodType34);
        org.joda.time.PeriodType periodType37 = periodType34.withDaysRemoved();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PeriodType[Millis]" + "'", str35, "PeriodType[Millis]");
        org.junit.Assert.assertNotNull(periodType37);
    }

    @Test
    public void test01334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01334");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("YearMonthDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"YearMonthDay\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01335");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.format.PeriodParser periodParser4 = periodFormatter3.getParser();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter3.withLocale(locale5);
        org.joda.time.format.PeriodPrinter periodPrinter7 = periodFormatter6.getPrinter();
        org.joda.time.PeriodType periodType8 = periodFormatter6.getParseType();
        org.joda.time.format.PeriodPrinter periodPrinter9 = periodFormatter6.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod10 = org.joda.time.MutablePeriod.parse("PT1M0.100S", periodFormatter6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser4);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertNull(periodPrinter7);
        org.junit.Assert.assertNull(periodType8);
        org.junit.Assert.assertNull(periodPrinter9);
    }

    @Test
    public void test01336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01336");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '4', chronology1);
        mutablePeriod2.setHours((int) (byte) 1);
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withDaysRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((long) 'a', (long) (short) 0, periodType9);
        org.joda.time.Hours hours11 = period10.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType12 = hours11.getFieldType();
        mutablePeriod2.add(durationFieldType12, (int) (short) -1);
        org.joda.time.Chronology chronology16 = null;
        mutablePeriod2.add(0L, chronology16);
        mutablePeriod2.add(0L);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(durationFieldType12);
    }

    @Test
    public void test01337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01337");
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
        boolean boolean16 = periodFormatter12.isPrinter();
        boolean boolean17 = periodFormatter12.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = periodFormatter12.parsePeriod("PeriodType[MinutesNoMinutes]");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01338");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) 0, periodType1, chronology2);
        int int4 = mutablePeriod3.getYears();
        mutablePeriod3.setPeriod((long) 600, (-539L));
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.setMinutes(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test01339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01339");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(9L, (long) (byte) 100);
        mutablePeriod2.addWeeks(2);
        org.joda.time.format.PeriodPrinter periodPrinter5 = null;
        org.joda.time.format.PeriodParser periodParser6 = null;
        org.joda.time.format.PeriodFormatter periodFormatter7 = new org.joda.time.format.PeriodFormatter(periodPrinter5, periodParser6);
        org.joda.time.format.PeriodParser periodParser8 = periodFormatter7.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter9 = periodFormatter7.getPrinter();
        java.util.Locale locale10 = null;
        org.joda.time.format.PeriodFormatter periodFormatter11 = periodFormatter7.withLocale(locale10);
        java.util.Locale locale12 = periodFormatter7.getLocale();
        org.joda.time.PeriodType periodType13 = periodFormatter7.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = mutablePeriod2.toString(periodFormatter7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser8);
        org.junit.Assert.assertNull(periodPrinter9);
        org.junit.Assert.assertNotNull(periodFormatter11);
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNull(periodType13);
    }

    @Test
    public void test01340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01340");
        org.joda.time.Period period1 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period3 = period1.withHours(32);
        org.joda.time.Period period4 = period1.normalizedStandard();
        org.joda.time.Period period6 = period1.plusHours((int) (short) 1);
        org.joda.time.Period period8 = period1.withYears(52);
        org.joda.time.Period period10 = period1.minusHours(25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration11 = new org.joda.time.Duration((java.lang.Object) 25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test01341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01341");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) -1);
        org.joda.time.Period period5 = period1.withMillis(0);
        org.joda.time.Seconds seconds6 = period5.toStandardSeconds();
        org.joda.time.Minutes minutes7 = seconds6.toStandardMinutes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(minutes7);
    }

    @Test
    public void test01342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01342");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("PT0.032S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01343");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ZERO;
        org.joda.time.Seconds seconds2 = seconds0.dividedBy((int) (byte) 1);
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType6 = seconds5.getFieldType();
        org.joda.time.Seconds seconds8 = seconds5.plus(25);
        org.joda.time.Seconds seconds9 = seconds5.negated();
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.MIN_VALUE;
        org.joda.time.Seconds seconds11 = seconds5.plus(seconds10);
        org.joda.time.Duration duration12 = seconds10.toStandardDuration();
        org.joda.time.Seconds seconds13 = seconds0.plus(seconds10);
        org.joda.time.Seconds seconds15 = seconds10.plus((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = seconds10.getValue(40);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 40");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds15);
    }

    @Test
    public void test01344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01344");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Days days3 = org.joda.time.Days.days((int) (byte) 1);
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType4);
        org.joda.time.Period period6 = period5.negated();
        int int7 = period5.getMinutes();
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test01345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01345");
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
        org.joda.time.Days days14 = period12.toStandardDays();
        java.lang.String str15 = days14.toString();
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
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P0D" + "'", str15, "P0D");
    }

    @Test
    public void test01346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01346");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType6 = seconds5.getFieldType();
        mutablePeriod2.add(durationFieldType6, 52);
        org.joda.time.ReadableInterval readableInterval9 = null;
        mutablePeriod2.add(readableInterval9);
        mutablePeriod2.addWeeks((int) ' ');
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        mutablePeriod2.setPeriod(readableInstant13, readableInstant14);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(durationFieldType6);
    }

    @Test
    public void test01347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01347");
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
        long long49 = duration19.getStandardMinutes();
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
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
    }

    @Test
    public void test01348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01348");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.PeriodType periodType4 = periodFormatter2.getParseType();
        boolean boolean5 = periodFormatter2.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period7 = periodFormatter2.parsePeriod("PeriodType[Millis]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test01349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01349");
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
        org.joda.time.Hours hours16 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours18 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean19 = hours16.isGreaterThan(hours18);
        org.joda.time.Hours hours21 = hours16.minus((int) (byte) 0);
        org.joda.time.Hours hours23 = hours21.plus(0);
        org.joda.time.Duration duration24 = hours23.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = periodFormatter2.print((org.joda.time.ReadablePeriod) hours23);
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
        org.junit.Assert.assertNull(periodParser15);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(duration24);
    }

    @Test
    public void test01350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01350");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        long long1 = duration0.getStandardDays();
        org.joda.time.Hours hours2 = duration0.toStandardHours();
        long long3 = duration0.getStandardMinutes();
        org.joda.time.Period period4 = duration0.toPeriod();
        org.joda.time.Duration duration5 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = duration5.toPeriod(chronology6);
        org.joda.time.Hours hours8 = duration5.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType9 = hours8.getFieldType();
        org.joda.time.Period period11 = period4.withField(durationFieldType9, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int13 = period11.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test01351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01351");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.minusWeeks(32);
        int int4 = period3.getDays();
        java.lang.Class<?> wildcardClass5 = period3.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test01352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01352");
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
        org.joda.time.ReadableInterval readableInterval21 = null;
        org.joda.time.Weeks weeks22 = org.joda.time.Weeks.weeksIn(readableInterval21);
        boolean boolean23 = weeks20.isLessThan(weeks22);
        org.joda.time.Weeks weeks24 = weeks20.negated();
        org.joda.time.Weeks weeks26 = weeks24.minus((int) (byte) 100);
        org.joda.time.ReadableInterval readableInterval27 = null;
        org.joda.time.Weeks weeks28 = org.joda.time.Weeks.weeksIn(readableInterval27);
        org.joda.time.ReadableInterval readableInterval29 = null;
        org.joda.time.Weeks weeks30 = org.joda.time.Weeks.weeksIn(readableInterval29);
        boolean boolean31 = weeks28.isLessThan(weeks30);
        org.joda.time.Weeks weeks33 = weeks30.minus((int) (short) -1);
        org.joda.time.Weeks weeks35 = weeks33.multipliedBy(0);
        boolean boolean36 = weeks26.isGreaterThan(weeks35);
        org.joda.time.Period period41 = new org.joda.time.Period(0, (int) '4', (int) (short) 100, (int) (byte) -1);
        org.joda.time.Period period43 = period41.withDays((int) 'a');
        org.joda.time.Weeks weeks44 = period43.toStandardWeeks();
        int int45 = weeks44.getWeeks();
        org.joda.time.ReadableInterval readableInterval46 = null;
        org.joda.time.Weeks weeks47 = org.joda.time.Weeks.weeksIn(readableInterval46);
        org.joda.time.ReadableInterval readableInterval48 = null;
        org.joda.time.Weeks weeks49 = org.joda.time.Weeks.weeksIn(readableInterval48);
        boolean boolean50 = weeks47.isLessThan(weeks49);
        org.joda.time.Weeks weeks52 = weeks49.minus((int) (short) -1);
        org.joda.time.Weeks weeks53 = weeks52.negated();
        org.joda.time.Weeks weeks55 = weeks52.multipliedBy(0);
        boolean boolean56 = weeks44.isGreaterThan(weeks55);
        org.joda.time.Weeks weeks57 = weeks35.minus(weeks44);
        org.joda.time.Weeks weeks58 = weeks18.minus(weeks57);
        org.joda.time.Period period63 = new org.joda.time.Period(0, (int) '4', (int) (short) 100, (int) (byte) -1);
        org.joda.time.Period period65 = period63.withDays((int) 'a');
        org.joda.time.Weeks weeks66 = period65.toStandardWeeks();
        int int67 = weeks66.getWeeks();
        org.joda.time.Weeks weeks69 = weeks66.plus((int) (byte) 0);
        org.joda.time.Duration duration70 = weeks69.toStandardDuration();
        org.joda.time.Weeks weeks71 = weeks69.negated();
        org.joda.time.DurationFieldType durationFieldType72 = weeks71.getFieldType();
        org.joda.time.Weeks weeks73 = weeks58.minus(weeks71);
        org.joda.time.Weeks weeks75 = org.joda.time.Weeks.weeks(1);
        int int76 = weeks75.getWeeks();
        org.joda.time.Weeks weeks77 = org.joda.time.Weeks.TWO;
        org.joda.time.ReadableInterval readableInterval78 = null;
        org.joda.time.Weeks weeks79 = org.joda.time.Weeks.weeksIn(readableInterval78);
        org.joda.time.ReadableInterval readableInterval80 = null;
        org.joda.time.Weeks weeks81 = org.joda.time.Weeks.weeksIn(readableInterval80);
        boolean boolean82 = weeks79.isLessThan(weeks81);
        org.joda.time.Weeks weeks83 = weeks79.negated();
        org.joda.time.ReadableInterval readableInterval84 = null;
        org.joda.time.Weeks weeks85 = org.joda.time.Weeks.weeksIn(readableInterval84);
        org.joda.time.ReadableInterval readableInterval86 = null;
        org.joda.time.Weeks weeks87 = org.joda.time.Weeks.weeksIn(readableInterval86);
        boolean boolean88 = weeks85.isLessThan(weeks87);
        org.joda.time.Weeks weeks89 = weeks85.negated();
        org.joda.time.Weeks weeks91 = weeks89.minus((int) (byte) 100);
        org.joda.time.Weeks weeks92 = weeks83.plus(weeks89);
        boolean boolean93 = weeks77.isLessThan(weeks89);
        org.joda.time.Weeks weeks95 = weeks77.multipliedBy((int) (short) 1);
        org.joda.time.Weeks weeks97 = weeks77.plus((int) '4');
        org.joda.time.Weeks weeks98 = weeks75.plus(weeks77);
        org.joda.time.Weeks weeks99 = weeks73.minus(weeks75);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertNotNull(weeks35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(weeks44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 13 + "'", int45 == 13);
        org.junit.Assert.assertNotNull(weeks47);
        org.junit.Assert.assertNotNull(weeks49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(weeks52);
        org.junit.Assert.assertNotNull(weeks53);
        org.junit.Assert.assertNotNull(weeks55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(weeks57);
        org.junit.Assert.assertNotNull(weeks58);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(weeks66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 13 + "'", int67 == 13);
        org.junit.Assert.assertNotNull(weeks69);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertNotNull(weeks71);
        org.junit.Assert.assertNotNull(durationFieldType72);
        org.junit.Assert.assertNotNull(weeks73);
        org.junit.Assert.assertNotNull(weeks75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(weeks77);
        org.junit.Assert.assertNotNull(weeks79);
        org.junit.Assert.assertNotNull(weeks81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(weeks83);
        org.junit.Assert.assertNotNull(weeks85);
        org.junit.Assert.assertNotNull(weeks87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(weeks89);
        org.junit.Assert.assertNotNull(weeks91);
        org.junit.Assert.assertNotNull(weeks92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(weeks95);
        org.junit.Assert.assertNotNull(weeks97);
        org.junit.Assert.assertNotNull(weeks98);
        org.junit.Assert.assertNotNull(weeks99);
    }

    @Test
    public void test01353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01353");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.Minutes minutes4 = days2.toStandardMinutes();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = minutes4.getValue(658);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 658");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(minutes4);
    }

    @Test
    public void test01354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01354");
        org.joda.time.Period period1 = org.joda.time.Period.hours((-2147483648));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01355");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, readableInstant2, periodType3);
        int int6 = mutablePeriod5.getWeeks();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod5.setHours(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test01356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01356");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 8, (long) (-32));
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableInstant7, readableDuration8);
        mutablePeriod9.setHours((int) (short) 100);
        boolean boolean12 = periodType6.equals((java.lang.Object) mutablePeriod9);
        org.joda.time.Duration duration13 = org.joda.time.Duration.ZERO;
        long long14 = duration13.getStandardDays();
        mutablePeriod9.add((org.joda.time.ReadableDuration) duration13);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType18);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.weekyears();
        int int21 = period19.get(durationFieldType20);
        int int22 = mutablePeriod9.get(durationFieldType20);
        boolean boolean23 = mutablePeriod2.isSupported(durationFieldType20);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test01357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01357");
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
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType17 = periodType16.withWeeksRemoved();
        org.joda.time.PeriodType periodType18 = periodType17.withDaysRemoved();
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration12, readableInstant15, periodType17);
        org.joda.time.PeriodType periodType20 = periodType17.withMonthsRemoved();
        java.lang.String str21 = periodType20.toString();
        org.joda.time.Period period22 = new org.joda.time.Period((long) (byte) 100, (long) 2147483647, periodType20);
        java.lang.String str23 = periodType20.getName();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PeriodType[Millis]" + "'", str21, "PeriodType[Millis]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Millis" + "'", str23, "Millis");
    }

    @Test
    public void test01358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01358");
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
        // The following exception was thrown during execution in test generation
        try {
            int int12 = minutes9.getValue(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 32");
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
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2147483648) + "'", int10 == (-2147483648));
    }

    @Test
    public void test01359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01359");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Period period7 = duration1.toPeriod();
        org.joda.time.Period period8 = period7.negated();
        org.joda.time.Period period10 = period7.withMillis(100);
        org.joda.time.Period period12 = period10.plusMonths(100);
        org.joda.time.Period period14 = period12.plusWeeks(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days15 = period12.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains months and months vary in length");
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
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test01360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01360");
        org.joda.time.Period period1 = org.joda.time.Period.hours(0);
        org.joda.time.DurationFieldType durationFieldType3 = period1.getFieldType((int) (short) 1);
        org.joda.time.Period period5 = period1.plusDays(10);
        org.joda.time.Seconds seconds6 = period1.toStandardSeconds();
        org.joda.time.Duration duration7 = seconds6.toStandardDuration();
        org.joda.time.ReadableDuration readableDuration8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = duration7.compareTo(readableDuration8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(duration7);
    }

    @Test
    public void test01361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01361");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT-21474836M");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01362");
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
            org.joda.time.DurationFieldType durationFieldType13 = periodType11.getFieldType((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
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
    public void test01363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01363");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(0L, (long) ' ');
        mutablePeriod2.setHours(0);
        org.joda.time.MutablePeriod mutablePeriod5 = mutablePeriod2.copy();
        mutablePeriod5.setMonths(600);
        org.junit.Assert.assertNotNull(mutablePeriod5);
    }

    @Test
    public void test01364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01364");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        org.joda.time.PeriodType periodType10 = periodType8.withYearsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((-2147483638), (-1073741824), 658, 1, 7, 100, (int) ' ', 600, periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test01365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01365");
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType11);
        int int13 = period12.getMillis();
        org.joda.time.Period period15 = period12.plusDays((int) 'a');
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds18 = duration17.toStandardSeconds();
        java.lang.String str19 = seconds18.toString();
        org.joda.time.PeriodType periodType20 = seconds18.getPeriodType();
        org.joda.time.PeriodType periodType21 = periodType20.withSecondsRemoved();
        org.joda.time.PeriodType periodType22 = periodType21.withDaysRemoved();
        org.joda.time.Period period23 = period15.normalizedStandard(periodType22);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 32, periodType22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(8, (int) (short) 100, (int) (byte) -1, (int) (byte) 100, 54, (int) 'a', (int) (short) 100, (int) (byte) 10, periodType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 25 + "'", int13 == 25);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT60S" + "'", str19, "PT60S");
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(period23);
    }

    @Test
    public void test01366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01366");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (-1073741824));
    }

    @Test
    public void test01367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01367");
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
        org.joda.time.Minutes minutes23 = minutes22.negated();
        org.joda.time.Minutes minutes24 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType25 = minutes24.getPeriodType();
        org.joda.time.Minutes minutes26 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes27 = minutes24.plus(minutes26);
        org.joda.time.Minutes minutes28 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes29 = org.joda.time.Minutes.ZERO;
        boolean boolean30 = minutes28.isLessThan(minutes29);
        boolean boolean31 = minutes24.isLessThan(minutes28);
        org.joda.time.Duration duration32 = minutes24.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        java.lang.Object obj35 = null;
        org.joda.time.Duration duration36 = new org.joda.time.Duration(obj35);
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant34, (org.joda.time.ReadableDuration) duration36);
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant33, (org.joda.time.ReadableDuration) duration36);
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType41 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType42 = periodType41.withWeeksRemoved();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = duration40.toPeriod(periodType41, chronology43);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType47 = periodType46.withMonthsRemoved();
        org.joda.time.Period period48 = duration40.toPeriodTo(readableInstant45, periodType47);
        org.joda.time.Period period49 = duration40.toPeriod();
        org.joda.time.Duration duration50 = duration36.plus((org.joda.time.ReadableDuration) duration40);
        org.joda.time.Duration duration52 = duration32.withDurationAdded((org.joda.time.ReadableDuration) duration40, 25);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Interval interval54 = duration32.toIntervalFrom(readableInstant53);
        org.joda.time.Minutes minutes55 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval54);
        org.joda.time.Minutes minutes56 = minutes22.plus(minutes55);
        org.joda.time.Minutes minutes57 = minutes10.plus(minutes55);
        org.joda.time.Minutes minutes59 = minutes10.dividedBy((int) 'a');
        org.joda.time.Minutes minutes61 = minutes10.minus((-1073741824));
        java.lang.String str62 = minutes10.toString();
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
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(minutes55);
        org.junit.Assert.assertNotNull(minutes56);
        org.junit.Assert.assertNotNull(minutes57);
        org.junit.Assert.assertNotNull(minutes59);
        org.junit.Assert.assertNotNull(minutes61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "PT-1M" + "'", str62, "PT-1M");
    }

    @Test
    public void test01368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01368");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("PeriodType[Weeks]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[Weeks]\" is malformed at \"eriodType[Weeks]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01369");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        java.lang.String str2 = weeks1.toString();
        org.joda.time.Hours hours3 = weeks1.toStandardHours();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P1W" + "'", str2, "P1W");
        org.junit.Assert.assertNotNull(hours3);
    }

    @Test
    public void test01370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01370");
        org.joda.time.Period period1 = org.joda.time.Period.millis(2);
        org.joda.time.Period period3 = period1.minusYears(0);
        int int4 = period3.getMinutes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test01371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01371");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration1.toPeriodTo(readableInstant3);
        org.joda.time.Duration duration5 = period4.toStandardDuration();
        org.joda.time.Period period6 = duration5.toPeriod();
        int int7 = period6.getDays();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test01372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01372");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("PeriodType[MinutesNoMinutes]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[MinutesNoMinutes]\" is malformed at \"eriodType[MinutesNoMinutes]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01373");
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
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period26 = duration24.toPeriodTo(readableInstant25);
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType28 = periodType27.withHoursRemoved();
        org.joda.time.Chronology chronology29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period30 = new org.joda.time.Period((java.lang.Object) period26, periodType28, chronology29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
    }

    @Test
    public void test01374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01374");
        org.joda.time.Days days1 = org.joda.time.Days.parseDays("P-1D");
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test01375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01375");
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
        org.joda.time.Days days16 = org.joda.time.Days.ZERO;
        org.joda.time.Period period18 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days19 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Days days21 = days19.minus(10);
        boolean boolean22 = days16.isGreaterThan(days19);
        org.joda.time.Days days23 = days15.minus(days16);
        org.joda.time.Days days24 = org.joda.time.Days.ZERO;
        int int25 = days24.getDays();
        org.joda.time.Period period27 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days28 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period27);
        org.joda.time.Period period30 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days31 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period30);
        org.joda.time.PeriodType periodType32 = days31.getPeriodType();
        boolean boolean33 = days28.isGreaterThan(days31);
        org.joda.time.Period period35 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days36 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period35);
        org.joda.time.Days days37 = days31.minus(days36);
        org.joda.time.Days days38 = days24.minus(days31);
        org.joda.time.Period period40 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days41 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period40);
        org.joda.time.Period period43 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days44 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period43);
        org.joda.time.PeriodType periodType45 = days44.getPeriodType();
        boolean boolean46 = days41.isGreaterThan(days44);
        org.joda.time.Period period48 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days49 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period48);
        org.joda.time.Days days50 = days44.minus(days49);
        org.joda.time.Days days51 = days24.plus(days50);
        org.joda.time.Days days52 = days16.minus(days51);
        org.joda.time.Period period54 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days55 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period54);
        org.joda.time.Period period57 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days58 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period57);
        org.joda.time.PeriodType periodType59 = days58.getPeriodType();
        boolean boolean60 = days55.isGreaterThan(days58);
        org.joda.time.Days days62 = days55.minus(1);
        org.joda.time.Days days63 = days16.minus(days62);
        boolean boolean64 = days14.isLessThan(days62);
        org.joda.time.Duration duration65 = days14.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.ReadableDuration readableDuration67 = null;
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod(readableInstant66, readableDuration67);
        org.joda.time.Period period69 = mutablePeriod68.toPeriod();
        int int70 = period69.size();
        org.joda.time.Period period72 = period69.plusDays(1);
        org.joda.time.Days days73 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period72);
        boolean boolean74 = days14.isLessThan(days73);
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
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertNotNull(days37);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(days44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(days49);
        org.junit.Assert.assertNotNull(days50);
        org.junit.Assert.assertNotNull(days51);
        org.junit.Assert.assertNotNull(days52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(days55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(days58);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(days62);
        org.junit.Assert.assertNotNull(days63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 8 + "'", int70 == 8);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(days73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test01376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01376");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("PT3600S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01377");
        org.joda.time.Period period1 = org.joda.time.Period.years(32);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01378");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType4);
        int int6 = period5.getMillis();
        org.joda.time.Period period8 = period5.plusDays((int) 'a');
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds11 = duration10.toStandardSeconds();
        java.lang.String str12 = seconds11.toString();
        org.joda.time.PeriodType periodType13 = seconds11.getPeriodType();
        org.joda.time.PeriodType periodType14 = periodType13.withSecondsRemoved();
        org.joda.time.PeriodType periodType15 = periodType14.withDaysRemoved();
        org.joda.time.Period period16 = period8.normalizedStandard(periodType15);
        org.joda.time.PeriodType periodType17 = periodType15.withMonthsRemoved();
        org.joda.time.PeriodType periodType18 = periodType17.withMinutesRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT60S" + "'", str12, "PT60S");
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
    }

    @Test
    public void test01379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01379");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("P0D");
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType3 = minutes2.getPeriodType();
        int int4 = minutes2.getMinutes();
        java.lang.String str5 = minutes2.toString();
        org.joda.time.Minutes minutes6 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType7 = minutes6.getFieldType();
        java.lang.String str8 = minutes6.toString();
        boolean boolean9 = minutes2.isLessThan(minutes6);
        org.joda.time.Minutes minutes10 = minutes2.negated();
        org.joda.time.Minutes minutes12 = org.joda.time.Minutes.parseMinutes("P0D");
        org.joda.time.Minutes minutes14 = minutes12.dividedBy((int) '#');
        org.joda.time.Minutes minutes15 = minutes2.minus(minutes12);
        boolean boolean16 = minutes1.isGreaterThan(minutes12);
        org.joda.time.Minutes minutes18 = minutes12.plus((-2));
        org.joda.time.Seconds seconds20 = org.joda.time.Seconds.seconds((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = minutes18.compareTo((org.joda.time.base.BaseSingleFieldPeriod) seconds20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Minutes cannot be compared to class org.joda.time.Seconds");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT0M" + "'", str5, "PT0M");
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT-2147483648M" + "'", str8, "PT-2147483648M");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(seconds20);
    }

    @Test
    public void test01380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01380");
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
        org.joda.time.Duration duration17 = days0.toStandardDuration();
        org.joda.time.MutablePeriod mutablePeriod18 = days0.toMutablePeriod();
        mutablePeriod18.setMillis(2147483647);
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
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(mutablePeriod18);
    }

    @Test
    public void test01381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01381");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("PT2H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01382");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration3 = new org.joda.time.Duration(60000L, (-1L));
        org.joda.time.Days days4 = org.joda.time.Days.ZERO;
        int int5 = days4.getDays();
        org.joda.time.Period period7 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days8 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period10 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days11 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period10);
        org.joda.time.PeriodType periodType12 = days11.getPeriodType();
        boolean boolean13 = days8.isGreaterThan(days11);
        org.joda.time.Period period15 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days16 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Days days17 = days11.minus(days16);
        org.joda.time.Days days18 = days4.minus(days11);
        org.joda.time.Days days20 = days11.plus((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType22 = days20.getFieldType((int) (short) 0);
        org.joda.time.PeriodType periodType23 = days20.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration3, periodType23);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod24.setMillis(600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(periodType23);
    }

    @Test
    public void test01383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01383");
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
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period16 = org.joda.time.Period.hours(0);
        org.joda.time.DurationFieldType durationFieldType18 = period16.getFieldType((int) (short) 1);
        org.joda.time.Period period20 = period16.plusDays(10);
        boolean boolean21 = periodType14.equals((java.lang.Object) 10);
        org.joda.time.Period period22 = new org.joda.time.Period((long) ' ', periodType14);
        org.joda.time.PeriodType periodType23 = periodType14.withDaysRemoved();
        org.joda.time.PeriodType periodType24 = periodType14.withMillisRemoved();
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2, periodType24);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT-60S" + "'", str12, "PT-60S");
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
    }

    @Test
    public void test01384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01384");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        boolean boolean4 = weeks1.isLessThan(weeks3);
        org.joda.time.Weeks weeks6 = weeks3.minus((int) (short) -1);
        org.joda.time.Weeks weeks8 = weeks6.multipliedBy(0);
        org.joda.time.Period period10 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days11 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period13 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days14 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period13);
        org.joda.time.PeriodType periodType15 = days14.getPeriodType();
        boolean boolean16 = days11.isGreaterThan(days14);
        org.joda.time.Period period18 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days19 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Days days20 = days14.minus(days19);
        org.joda.time.Period period22 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days23 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Period period25 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days26 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period25);
        org.joda.time.PeriodType periodType27 = days26.getPeriodType();
        boolean boolean28 = days23.isGreaterThan(days26);
        org.joda.time.Days days30 = days23.minus(1);
        boolean boolean31 = days14.isGreaterThan(days30);
        int int32 = days14.getDays();
        org.joda.time.Days days33 = days14.negated();
        org.joda.time.Days days35 = days33.dividedBy(2147483647);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = weeks8.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Weeks cannot be compared to class org.joda.time.Days");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertNotNull(days35);
    }

    @Test
    public void test01385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01385");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType21 = days19.getFieldType((-160));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -160");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days19);
    }

    @Test
    public void test01386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01386");
        org.joda.time.Period period1 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period3 = period1.withHours(32);
        org.joda.time.Period period4 = period1.normalizedStandard();
        org.joda.time.DurationFieldType[] durationFieldTypeArray5 = period1.getFieldTypes();
        org.joda.time.Minutes minutes6 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(durationFieldTypeArray5);
        org.junit.Assert.assertNotNull(minutes6);
    }

    @Test
    public void test01387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01387");
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
        boolean boolean14 = periodFormatter3.isParser();
        java.util.Locale locale15 = null;
        org.joda.time.format.PeriodFormatter periodFormatter16 = periodFormatter3.withLocale(locale15);
        org.joda.time.format.PeriodParser periodParser17 = periodFormatter3.getParser();
        org.joda.time.PeriodType periodType18 = periodFormatter3.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = org.joda.time.Period.parse("PT1M", periodFormatter3);
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
        org.junit.Assert.assertNotNull(periodFormatter16);
        org.junit.Assert.assertNull(periodParser17);
        org.junit.Assert.assertNull(periodType18);
    }

    @Test
    public void test01388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01388");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("Weeks");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Weeks\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01389");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableInstant7, readableDuration8);
        mutablePeriod9.setHours((int) (short) 100);
        boolean boolean12 = periodType6.equals((java.lang.Object) mutablePeriod9);
        org.joda.time.PeriodType periodType13 = periodType6.withYearsRemoved();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 60, periodType13, chronology14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test01390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01390");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        boolean boolean4 = weeks1.isLessThan(weeks3);
        org.joda.time.Weeks weeks6 = weeks3.minus((int) (short) -1);
        org.joda.time.Duration duration7 = weeks3.toStandardDuration();
        java.lang.String str8 = weeks3.toString();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P0W" + "'", str8, "P0W");
    }

    @Test
    public void test01391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01391");
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
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DurationField durationField18 = durationFieldType15.getField(chronology17);
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
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test01392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01392");
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
        org.joda.time.Days days20 = null;
        org.joda.time.Days days21 = days19.plus(days20);
        org.joda.time.Period period23 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days24 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period23);
        org.joda.time.Period period26 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days27 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period26);
        org.joda.time.PeriodType periodType28 = days27.getPeriodType();
        boolean boolean29 = days24.isGreaterThan(days27);
        org.joda.time.Period period31 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days32 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Days days33 = days27.minus(days32);
        org.joda.time.Period period35 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days36 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period35);
        org.joda.time.Days days38 = days36.minus(10);
        org.joda.time.Days days39 = days27.plus(days36);
        org.joda.time.Days days41 = days39.dividedBy(100);
        org.joda.time.Days days42 = null;
        org.joda.time.Days days43 = days41.plus(days42);
        org.joda.time.Days days44 = days41.negated();
        boolean boolean45 = days21.isGreaterThan(days44);
        int int46 = days21.getDays();
        java.lang.String str47 = days21.toString();
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
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertNotNull(days39);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertNotNull(days43);
        org.junit.Assert.assertNotNull(days44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "P0D" + "'", str47, "P0D");
    }

    @Test
    public void test01393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01393");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (byte) 1, 7, 54, 52, 32, (int) (short) 0, (-2), (-32));
    }

    @Test
    public void test01394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01394");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) 10);
    }

    @Test
    public void test01395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01395");
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
        org.joda.time.Duration duration14 = duration11.withDurationAdded((-60L), (int) (short) 100);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds18 = duration17.toStandardSeconds();
        java.lang.String str19 = seconds18.toString();
        org.joda.time.PeriodType periodType20 = seconds18.getPeriodType();
        org.joda.time.PeriodType periodType21 = periodType20.withSecondsRemoved();
        org.joda.time.PeriodType periodType22 = periodType20.withMillisRemoved();
        org.joda.time.Period period23 = duration14.toPeriodFrom(readableInstant15, periodType22);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Period period29 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days30 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period29);
        org.joda.time.Period period32 = period29.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period34 = period32.normalizedStandard(periodType33);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(readableInstant26, readableInstant27, periodType33);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(600L, (long) (short) -1, periodType33, chronology36);
        org.joda.time.Chronology chronology38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period39 = new org.joda.time.Period((java.lang.Object) period23, periodType33, chronology38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
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
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT60S" + "'", str19, "PT60S");
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(period34);
    }

    @Test
    public void test01396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01396");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType18 = period15.getFieldType((-32));
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
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test01397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01397");
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
            int int9 = minutes4.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
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
    public void test01398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01398");
        org.joda.time.Period period4 = new org.joda.time.Period(0, (int) '4', (int) (short) 100, (int) (byte) -1);
        org.joda.time.Period period6 = period4.withDays((int) 'a');
        int int7 = period6.getHours();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test01399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01399");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType2 = minutes1.getPeriodType();
        org.joda.time.PeriodType periodType3 = periodType2.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) 0, periodType3);
        mutablePeriod4.addHours((int) (byte) 0);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4);
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod7.add((long) (short) -1, chronology9);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test01400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01400");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds((-2147483638));
        org.junit.Assert.assertNotNull(seconds1);
    }

    @Test
    public void test01401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01401");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        org.joda.time.Period period3 = mutablePeriod2.toPeriod();
        int int4 = period3.size();
        org.joda.time.Period period5 = period3.toPeriod();
        org.joda.time.Period period7 = period3.plusHours(97);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test01402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01402");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', chronology1);
        org.joda.time.Period period4 = period2.minusYears(6);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test01403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01403");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (-8), periodType1, chronology2);
    }

    @Test
    public void test01404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01404");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (short) -1, (int) '#', (int) ' ', 100);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.days();
        int int6 = mutablePeriod4.get(durationFieldType5);
        org.joda.time.Hours hours7 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Hours hours9 = hours7.dividedBy(3);
        org.joda.time.Hours hours10 = hours9.negated();
        org.joda.time.Duration duration11 = hours10.toStandardDuration();
        org.joda.time.Hours hours12 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours14 = hours12.minus(10);
        int int15 = hours12.size();
        org.joda.time.Hours hours16 = hours10.minus(hours12);
        org.joda.time.Hours hours18 = hours16.plus((int) 'a');
        int int19 = hours16.getHours();
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-3) + "'", int19 == (-3));
    }

    @Test
    public void test01405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01405");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(10);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01406");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Hours hours9 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours11 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean12 = hours9.isGreaterThan(hours11);
        org.joda.time.Duration duration13 = hours11.toStandardDuration();
        org.joda.time.Duration duration14 = duration13.toDuration();
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.hours();
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant8, (org.joda.time.ReadableDuration) duration13, periodType15);
        org.joda.time.PeriodType periodType17 = periodType15.withMillisRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) (short) -1, 60, (int) (byte) 100, (int) (short) 0, 25, 100, 6, 25, periodType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType17);
    }

    @Test
    public void test01407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01407");
        org.joda.time.Hours hours0 = org.joda.time.Hours.SEVEN;
        org.joda.time.PeriodType periodType1 = hours0.getPeriodType();
        org.joda.time.Hours hours3 = hours0.minus(0);
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(hours3);
    }

    @Test
    public void test01408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01408");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType6 = minutes5.getFieldType();
        org.joda.time.PeriodType periodType7 = minutes5.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter2.withParseType(periodType7);
        boolean boolean9 = periodFormatter8.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod11 = periodFormatter8.parseMutablePeriod("PT2H");
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
    }

    @Test
    public void test01409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01409");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("PT-52M");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01410");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT14400S");
        mutablePeriod1.setDays((-2147483638));
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test01411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01411");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter2.getPrinter();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter2.withLocale(locale5);
        org.joda.time.format.PeriodParser periodParser7 = periodFormatter6.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = periodFormatter6.parsePeriod("PT25S");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertNull(periodParser7);
    }

    @Test
    public void test01412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01412");
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
        mutablePeriod2.add(0L);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant19, readableInstant20, periodType21);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.eras();
        int int24 = period22.get(durationFieldType23);
        int int25 = period22.getYears();
        org.joda.time.Days days26 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.Days days28 = days26.minus(25);
        org.joda.time.Days days29 = days28.negated();
        org.joda.time.Days days30 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.Days days32 = days30.minus(25);
        org.joda.time.Days days33 = days32.negated();
        org.joda.time.Days days34 = days28.plus(days33);
        java.lang.String str35 = days34.toString();
        org.joda.time.DurationFieldType durationFieldType36 = days34.getFieldType();
        int int37 = period22.indexOf(durationFieldType36);
        int int38 = period22.getMonths();
        mutablePeriod2.add((org.joda.time.ReadablePeriod) period22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "P0D" + "'", str35, "P0D");
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test01413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01413");
        org.joda.time.Days days0 = org.joda.time.Days.ZERO;
        org.joda.time.Days days1 = org.joda.time.Days.ZERO;
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Days days6 = days4.minus(10);
        boolean boolean7 = days1.isGreaterThan(days4);
        org.joda.time.Days days8 = days0.minus(days1);
        org.joda.time.Days days9 = org.joda.time.Days.ZERO;
        int int10 = days9.getDays();
        org.joda.time.Period period12 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days13 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Period period15 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days16 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period15);
        org.joda.time.PeriodType periodType17 = days16.getPeriodType();
        boolean boolean18 = days13.isGreaterThan(days16);
        org.joda.time.Period period20 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days21 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Days days22 = days16.minus(days21);
        org.joda.time.Days days23 = days9.minus(days16);
        org.joda.time.Period period25 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days26 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Period period28 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days29 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period28);
        org.joda.time.PeriodType periodType30 = days29.getPeriodType();
        boolean boolean31 = days26.isGreaterThan(days29);
        org.joda.time.Period period33 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days34 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period33);
        org.joda.time.Days days35 = days29.minus(days34);
        org.joda.time.Days days36 = days9.plus(days35);
        org.joda.time.Days days37 = days1.minus(days36);
        org.joda.time.Period period39 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days40 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period39);
        org.joda.time.Period period42 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days43 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period42);
        org.joda.time.PeriodType periodType44 = days43.getPeriodType();
        boolean boolean45 = days40.isGreaterThan(days43);
        org.joda.time.Days days47 = days40.minus(1);
        org.joda.time.Days days48 = days1.minus(days47);
        org.joda.time.Period period50 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days51 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period50);
        org.joda.time.Period period53 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days54 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period53);
        org.joda.time.PeriodType periodType55 = days54.getPeriodType();
        boolean boolean56 = days51.isGreaterThan(days54);
        org.joda.time.Period period58 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days59 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period58);
        org.joda.time.Days days60 = days54.minus(days59);
        org.joda.time.Days days61 = null;
        boolean boolean62 = days60.isGreaterThan(days61);
        org.joda.time.Days days63 = days48.plus(days61);
        org.joda.time.Days days64 = days63.negated();
        org.joda.time.Days days65 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days63);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertNotNull(days35);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertNotNull(days37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(days40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(days43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(days47);
        org.junit.Assert.assertNotNull(days48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(days51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(days54);
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(days59);
        org.junit.Assert.assertNotNull(days60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(days63);
        org.junit.Assert.assertNotNull(days64);
        org.junit.Assert.assertNotNull(days65);
    }

    @Test
    public void test01414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01414");
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
        // The following exception was thrown during execution in test generation
        try {
            int int20 = period3.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test01415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01415");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes((-1));
        int int2 = minutes1.getMinutes();
        org.joda.time.Minutes minutes4 = minutes1.dividedBy((-2147483648));
        int int5 = minutes4.size();
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test01416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01416");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(84326400L, (long) 600, chronology2);
    }

    @Test
    public void test01417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01417");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("PT1S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01418");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("P3W");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01419");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT-2147483648M");
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01420");
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
        // The following exception was thrown during execution in test generation
        try {
            int int26 = mutablePeriod15.getValue(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test01421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01421");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.Period period3 = period1.minusWeeks(32);
        org.joda.time.Period period5 = period3.minusSeconds((int) (short) 1);
        org.joda.time.Period period7 = period5.minusSeconds((-1));
        org.joda.time.Period period9 = period5.withYears((-160));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test01422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01422");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.Duration duration5 = duration3.plus((long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        java.lang.Object obj9 = null;
        org.joda.time.Duration duration10 = new org.joda.time.Duration(obj9);
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant8, (org.joda.time.ReadableDuration) duration10);
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant7, (org.joda.time.ReadableDuration) duration10);
        org.joda.time.Duration duration13 = duration10.toDuration();
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant6, (org.joda.time.ReadableDuration) duration13);
        boolean boolean15 = duration3.equals((java.lang.Object) readableInstant6);
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds20 = duration19.toStandardSeconds();
        java.lang.String str21 = seconds20.toString();
        org.joda.time.PeriodType periodType22 = seconds20.getPeriodType();
        org.joda.time.PeriodType periodType23 = periodType22.withSecondsRemoved();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) '4', (-60L), periodType22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((java.lang.Object) duration3, periodType22, chronology25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period27 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PT60S" + "'", str21, "PT60S");
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
    }

    @Test
    public void test01423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01423");
        org.joda.time.Duration duration2 = new org.joda.time.Duration(60000L, (-1L));
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((-1L));
        mutablePeriod4.addSeconds(100);
        java.lang.Object obj7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(obj7);
        org.joda.time.Duration duration9 = duration8.toDuration();
        mutablePeriod4.add((org.joda.time.ReadableDuration) duration9);
        org.joda.time.Duration duration12 = duration2.withDurationAdded((org.joda.time.ReadableDuration) duration9, (int) (byte) 1);
        long long13 = duration12.getMillis();
        long long14 = duration12.getStandardSeconds();
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-60001L) + "'", long13 == (-60001L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-60L) + "'", long14 == (-60L));
    }

    @Test
    public void test01424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01424");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = mutablePeriod1.getValue(7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test01425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01425");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType3 = seconds2.getFieldType();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.parseSeconds("P0W");
        org.joda.time.Seconds seconds6 = seconds2.minus(seconds5);
        org.joda.time.Seconds seconds7 = seconds2.negated();
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.seconds((int) (short) 0);
        org.joda.time.Seconds seconds10 = seconds7.minus(seconds9);
        org.joda.time.Seconds seconds12 = org.joda.time.Seconds.seconds(100);
        org.joda.time.Seconds seconds13 = org.joda.time.Seconds.TWO;
        org.joda.time.DurationFieldType durationFieldType14 = seconds13.getFieldType();
        boolean boolean15 = seconds12.isGreaterThan(seconds13);
        boolean boolean16 = seconds10.isLessThan(seconds12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType18 = seconds10.getFieldType(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test01426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01426");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        long long1 = duration0.getStandardDays();
        org.joda.time.Hours hours2 = duration0.toStandardHours();
        long long3 = duration0.getStandardMinutes();
        org.joda.time.Hours hours4 = duration0.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType5 = hours4.getFieldType();
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(durationFieldType5);
    }

    @Test
    public void test01427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01427");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((-539L));
        long long2 = duration1.getMillis();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-539000L) + "'", long2 == (-539000L));
    }

    @Test
    public void test01428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01428");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds(3);
        java.lang.String str2 = seconds1.toString();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT3S" + "'", str2, "PT3S");
    }

    @Test
    public void test01429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01429");
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
        org.joda.time.ReadableDuration readableDuration26 = null;
        boolean boolean27 = duration21.isEqual(readableDuration26);
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period30 = org.joda.time.Period.hours(0);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(readableInstant31, readableDuration32);
        org.joda.time.Period period34 = mutablePeriod33.toPeriod();
        org.joda.time.Period period36 = period34.withHours(0);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.days();
        int int38 = period34.indexOf(durationFieldType37);
        int int39 = period30.indexOf(durationFieldType37);
        boolean boolean40 = periodType28.isSupported(durationFieldType37);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = duration21.toPeriod(periodType28, chronology41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Interval interval44 = duration21.toIntervalTo(readableInstant43);
        long long45 = duration21.getStandardDays();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
    }

    @Test
    public void test01430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01430");
        org.joda.time.Period period4 = new org.joda.time.Period(0, (int) '4', (int) (short) 100, (int) (byte) -1);
        org.joda.time.Period period6 = period4.withDays((int) 'a');
        org.joda.time.Weeks weeks7 = period6.toStandardWeeks();
        int int8 = weeks7.getWeeks();
        org.joda.time.Weeks weeks10 = weeks7.plus((int) (byte) 0);
        org.joda.time.Weeks weeks12 = weeks7.multipliedBy((int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = weeks7.getClass();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 13 + "'", int8 == 13);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01431");
        org.joda.time.Period period1 = org.joda.time.Period.hours((-32));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType3 = period1.getFieldType((-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01432");
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
        long long50 = duration19.getStandardHours();
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
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
    }

    @Test
    public void test01433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01433");
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
        org.joda.time.Period period13 = period10.plusMonths((-1));
        org.joda.time.Period period15 = period13.plusMillis((-32));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds16 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) period13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert period to duration as months is not precise in the period P-1MT1M");
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
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test01434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01434");
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
        java.io.Writer writer16 = null;
        org.joda.time.Hours hours17 = org.joda.time.Hours.SEVEN;
        org.joda.time.Hours hours18 = org.joda.time.Hours.THREE;
        org.joda.time.DurationFieldType durationFieldType19 = hours18.getFieldType();
        boolean boolean20 = hours17.isGreaterThan(hours18);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(readableInstant21, readableDuration22);
        org.joda.time.Period period24 = mutablePeriod23.toPeriod();
        org.joda.time.Period period26 = period24.withHours(0);
        org.joda.time.Hours hours27 = period26.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType28 = hours27.getFieldType();
        int int29 = hours27.getHours();
        boolean boolean30 = hours18.isLessThan(hours27);
        java.lang.String str31 = hours27.toString();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer16, (org.joda.time.ReadablePeriod) hours27);
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
        org.junit.Assert.assertNull(periodParser15);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(hours27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PT0H" + "'", str31, "PT0H");
    }

    @Test
    public void test01435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01435");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds4 = duration3.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType5 = seconds4.getFieldType();
        org.joda.time.Seconds seconds7 = seconds4.plus(25);
        org.joda.time.Seconds seconds8 = seconds4.negated();
        org.joda.time.Seconds seconds10 = seconds4.dividedBy(10);
        org.joda.time.DurationFieldType durationFieldType11 = seconds4.getFieldType();
        org.joda.time.PeriodType periodType12 = seconds4.getPeriodType();
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType12);
        int int14 = period13.size();
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test01436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01436");
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
        java.util.Locale locale15 = periodFormatter2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod17 = periodFormatter2.parseMutablePeriod("PT-60S");
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
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertNull(locale15);
    }

    @Test
    public void test01437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01437");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType2 = periodType1.withMonthsRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withMinutesRemoved();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) (short) 0, periodType2, chronology4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType7 = periodType2.getFieldType(600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 600");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test01438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01438");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("PT0.033S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01439");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = period1.withSeconds((int) ' ');
        java.lang.String str5 = period1.toString();
        org.joda.time.Period period7 = period1.withYears(0);
        int int8 = period1.size();
        int int9 = period1.getYears();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT1M" + "'", str5, "PT1M");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test01440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01440");
        org.joda.time.Hours hours0 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours2 = hours0.minus(10);
        org.joda.time.Hours hours3 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours5 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean6 = hours3.isGreaterThan(hours5);
        org.joda.time.Hours hours8 = hours3.minus((int) (byte) 0);
        org.joda.time.Hours hours10 = hours8.minus((int) '#');
        org.joda.time.Duration duration11 = hours10.toStandardDuration();
        org.joda.time.Hours hours12 = hours2.minus(hours10);
        org.joda.time.Hours hours14 = hours10.plus((-60));
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
    public void test01441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01441");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (short) -1, (int) '#', (int) ' ', 100);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.days();
        int int6 = mutablePeriod4.get(durationFieldType5);
        org.joda.time.Hours hours7 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Hours hours9 = hours7.dividedBy((int) (short) -1);
        org.joda.time.Hours hours10 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours12 = hours10.minus(0);
        org.joda.time.Hours hours13 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours15 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean16 = hours13.isGreaterThan(hours15);
        boolean boolean17 = hours12.isLessThan(hours15);
        java.lang.String str18 = hours12.toString();
        org.joda.time.Hours hours19 = org.joda.time.Hours.ZERO;
        org.joda.time.Hours hours20 = hours12.plus(hours19);
        org.joda.time.Hours hours21 = hours7.minus(hours12);
        org.joda.time.Hours hours23 = hours12.dividedBy(1);
        org.joda.time.DurationFieldType durationFieldType24 = hours23.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType26 = hours23.getFieldType(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT4H" + "'", str18, "PT4H");
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(durationFieldType24);
    }

    @Test
    public void test01442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01442");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(13);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01443");
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
        java.lang.StringBuffer stringBuffer11 = null;
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer11, readablePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
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
    }

    @Test
    public void test01444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01444");
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
        long long13 = duration10.getStandardMinutes();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = duration10.toPeriodFrom(readableInstant14);
        org.joda.time.Period period17 = period15.plusWeeks((int) (byte) 1);
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardHours((long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period24 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days25 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period24);
        org.joda.time.PeriodType periodType26 = days25.getPeriodType();
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(readableInstant27, readableDuration28);
        mutablePeriod29.setHours((int) (short) 100);
        boolean boolean32 = periodType26.equals((java.lang.Object) mutablePeriod29);
        org.joda.time.Period period33 = new org.joda.time.Period((long) 0, 0L, periodType26);
        org.joda.time.Period period34 = duration19.toPeriodTo(readableInstant20, periodType26);
        org.joda.time.Period period35 = period15.withPeriodType(periodType26);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period35);
    }

    @Test
    public void test01445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01445");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(readableInstant5, readableDuration6);
        mutablePeriod7.setPeriod((long) ' ', (long) 52);
        mutablePeriod7.addDays(100);
        org.joda.time.PeriodType periodType13 = mutablePeriod7.getPeriodType();
        org.joda.time.Period period14 = new org.joda.time.Period((long) (short) 0, periodType13);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(readableInstant2, readableInstant3, periodType13);
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType13);
        org.joda.time.Period period18 = period16.plusMonths(13);
        org.joda.time.DurationFieldType durationFieldType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period21 = period16.withFieldAdded(durationFieldType19, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test01446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01446");
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
        long long14 = duration2.getStandardHours();
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT-60S" + "'", str12, "PT-60S");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test01447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01447");
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
        org.joda.time.Days days41 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.Days days43 = days41.minus(25);
        org.joda.time.Days days44 = days43.negated();
        org.joda.time.Days days45 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.Days days47 = days45.minus(25);
        org.joda.time.Days days48 = days47.negated();
        org.joda.time.Days days49 = days43.plus(days48);
        org.joda.time.Period period51 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days52 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period51);
        org.joda.time.Period period54 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days55 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period54);
        org.joda.time.PeriodType periodType56 = days55.getPeriodType();
        boolean boolean57 = days52.isGreaterThan(days55);
        org.joda.time.Period period59 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days60 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period59);
        org.joda.time.Days days61 = days55.minus(days60);
        org.joda.time.Period period63 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days64 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period63);
        org.joda.time.Days days66 = days64.minus(10);
        org.joda.time.Days days67 = days55.plus(days64);
        org.joda.time.Days days69 = days67.dividedBy(100);
        org.joda.time.Days days70 = null;
        org.joda.time.Days days71 = days69.plus(days70);
        org.joda.time.Period period73 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days74 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period73);
        org.joda.time.Period period76 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days77 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period76);
        org.joda.time.PeriodType periodType78 = days77.getPeriodType();
        boolean boolean79 = days74.isGreaterThan(days77);
        org.joda.time.Period period81 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days82 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period81);
        org.joda.time.Days days83 = days77.minus(days82);
        org.joda.time.Period period85 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days86 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period85);
        org.joda.time.Days days88 = days86.minus(10);
        org.joda.time.Days days89 = days77.plus(days86);
        org.joda.time.Days days91 = days89.dividedBy(100);
        org.joda.time.Days days92 = null;
        org.joda.time.Days days93 = days91.plus(days92);
        org.joda.time.Days days94 = days91.negated();
        boolean boolean95 = days71.isGreaterThan(days94);
        org.joda.time.Days days96 = days43.plus(days71);
        org.joda.time.Days days98 = days71.plus(0);
        boolean boolean99 = duration12.equals((java.lang.Object) days71);
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
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertNotNull(days43);
        org.junit.Assert.assertNotNull(days44);
        org.junit.Assert.assertNotNull(days45);
        org.junit.Assert.assertNotNull(days47);
        org.junit.Assert.assertNotNull(days48);
        org.junit.Assert.assertNotNull(days49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(days52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(days55);
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(days60);
        org.junit.Assert.assertNotNull(days61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(days64);
        org.junit.Assert.assertNotNull(days66);
        org.junit.Assert.assertNotNull(days67);
        org.junit.Assert.assertNotNull(days69);
        org.junit.Assert.assertNotNull(days71);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(days74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(days77);
        org.junit.Assert.assertNotNull(periodType78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(days82);
        org.junit.Assert.assertNotNull(days83);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertNotNull(days86);
        org.junit.Assert.assertNotNull(days88);
        org.junit.Assert.assertNotNull(days89);
        org.junit.Assert.assertNotNull(days91);
        org.junit.Assert.assertNotNull(days93);
        org.junit.Assert.assertNotNull(days94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(days96);
        org.junit.Assert.assertNotNull(days98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test01448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01448");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1);
        org.joda.time.format.PeriodFormatter periodFormatter3 = null;
        java.lang.String str4 = mutablePeriod2.toString(periodFormatter3);
        int int5 = mutablePeriod2.getMillis();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = mutablePeriod2.toDurationFrom(readableInstant6);
        mutablePeriod2.addDays(10);
        org.joda.time.Duration duration10 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = duration10.toPeriod(chronology11);
        org.joda.time.Hours hours13 = duration10.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType14 = hours13.getFieldType();
        org.joda.time.Hours hours15 = org.joda.time.Hours.ONE;
        org.joda.time.DurationFieldType durationFieldType16 = hours15.getFieldType();
        org.joda.time.Hours hours17 = hours13.plus(hours15);
        org.joda.time.MutablePeriod mutablePeriod18 = hours13.toMutablePeriod();
        org.joda.time.PeriodType periodType19 = hours13.getPeriodType();
        org.joda.time.Chronology chronology20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod2, periodType19, chronology20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0S" + "'", str4, "PT0S");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertNotNull(mutablePeriod18);
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test01449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01449");
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
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = duration38.toPeriodTo(readableInstant42, periodType43);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Interval interval46 = duration38.toIntervalTo(readableInstant45);
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
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(interval46);
    }

    @Test
    public void test01450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01450");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT-1073741824M");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01451");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds3 = duration2.toStandardSeconds();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        boolean boolean7 = duration2.isLongerThan((org.joda.time.ReadableDuration) duration5);
        org.joda.time.Duration duration9 = duration2.minus((long) 3);
        org.joda.time.Duration duration10 = duration2.toDuration();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Interval interval12 = duration10.toIntervalFrom(readableInstant11);
        java.lang.String str13 = duration10.toString();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration10);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT60S" + "'", str13, "PT60S");
    }

    @Test
    public void test01452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01452");
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
        org.joda.time.Days days14 = period12.toStandardDays();
        org.joda.time.Hours hours15 = days14.toStandardHours();
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
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(hours15);
    }

    @Test
    public void test01453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01453");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period7 = org.joda.time.Period.hours(0);
        org.joda.time.DurationFieldType durationFieldType9 = period7.getFieldType((int) (short) 1);
        org.joda.time.Period period11 = period7.plusDays(10);
        boolean boolean12 = periodType5.equals((java.lang.Object) 10);
        org.joda.time.Period period13 = new org.joda.time.Period((long) ' ', periodType5);
        org.joda.time.PeriodType periodType14 = periodType5.withDaysRemoved();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 2, (long) 32, periodType14, chronology15);
        org.joda.time.DurationFieldType durationFieldType17 = null;
        int int18 = periodType14.indexOf(durationFieldType17);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType14);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        mutablePeriod19.setPeriod(readableInstant20, readableInstant21);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test01454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01454");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration1 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = duration1.toPeriod(chronology2);
        org.joda.time.Hours hours4 = duration1.toStandardHours();
        org.joda.time.Duration duration5 = org.joda.time.Duration.ZERO;
        long long6 = duration5.getStandardDays();
        org.joda.time.Hours hours7 = duration5.toStandardHours();
        long long8 = duration5.getStandardMinutes();
        long long9 = duration5.getStandardDays();
        org.joda.time.Hours hours10 = duration5.toStandardHours();
        boolean boolean11 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration5);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration5);
        mutablePeriod12.setDays((int) ' ');
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01455");
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
        mutablePeriod12.addYears(0);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod12.addYears((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
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
    }

    @Test
    public void test01456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01456");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes3 = minutes0.plus(minutes2);
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.ZERO;
        boolean boolean6 = minutes4.isLessThan(minutes5);
        boolean boolean7 = minutes0.isLessThan(minutes4);
        org.joda.time.PeriodType periodType8 = minutes0.getPeriodType();
        org.joda.time.Duration duration9 = minutes0.toStandardDuration();
        long long10 = duration9.getStandardHours();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = duration9.toPeriodFrom(readableInstant11);
        org.joda.time.format.PeriodPrinter periodPrinter13 = null;
        org.joda.time.format.PeriodParser periodParser14 = null;
        org.joda.time.format.PeriodFormatter periodFormatter15 = new org.joda.time.format.PeriodFormatter(periodPrinter13, periodParser14);
        org.joda.time.format.PeriodParser periodParser16 = periodFormatter15.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter17 = periodFormatter15.getPrinter();
        java.util.Locale locale18 = null;
        org.joda.time.format.PeriodFormatter periodFormatter19 = periodFormatter15.withLocale(locale18);
        java.util.Locale locale20 = null;
        org.joda.time.format.PeriodFormatter periodFormatter21 = periodFormatter19.withLocale(locale20);
        java.util.Locale locale22 = null;
        org.joda.time.format.PeriodFormatter periodFormatter23 = periodFormatter21.withLocale(locale22);
        java.util.Locale locale24 = periodFormatter21.getLocale();
        org.joda.time.format.PeriodPrinter periodPrinter25 = periodFormatter21.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = period12.toString(periodFormatter21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNull(periodParser16);
        org.junit.Assert.assertNull(periodPrinter17);
        org.junit.Assert.assertNotNull(periodFormatter19);
        org.junit.Assert.assertNotNull(periodFormatter21);
        org.junit.Assert.assertNotNull(periodFormatter23);
        org.junit.Assert.assertNull(locale24);
        org.junit.Assert.assertNull(periodPrinter25);
    }

    @Test
    public void test01457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01457");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        mutablePeriod2.setSeconds(8);
        mutablePeriod2.setValue(1, 2);
        int int8 = mutablePeriod2.getHours();
        int int9 = mutablePeriod2.getSeconds();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test01458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01458");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks2 = weeks0.minus(0);
        org.joda.time.Period period3 = weeks0.toPeriod();
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test01459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01459");
        org.joda.time.Period period8 = new org.joda.time.Period(0, (int) (short) 100, 0, (-672), (int) ' ', 35, (-32), 100);
    }

    @Test
    public void test01460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01460");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = period1.withSeconds((int) ' ');
        int int5 = period4.getSeconds();
        org.joda.time.Period period7 = period4.minusMillis(0);
        int int8 = period4.getWeeks();
        org.joda.time.Period period10 = period4.multipliedBy(4);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType13);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.weekyears();
        int int16 = period14.get(durationFieldType15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period18 = period4.withFieldAdded(durationFieldType15, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weekyears'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test01461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01461");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis((long) 25);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Interval interval3 = duration1.toIntervalTo(readableInstant2);
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval3);
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval3);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks5);
    }

    @Test
    public void test01462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01462");
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
        org.joda.time.Duration duration13 = duration5.toDuration();
        org.joda.time.Duration duration14 = duration13.toDuration();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = duration13.toPeriod(chronology15);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test01463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01463");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.hours();
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        mutablePeriod1.add((long) (byte) 100);
        int int4 = mutablePeriod1.getWeeks();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod1.addMonths((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test01464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01464");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("P53Y10M97W52DT100H0.013S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01465");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period7 = period4.withSeconds((int) ' ');
        org.joda.time.Period period8 = period1.minus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType10 = periodType9.withMonthsRemoved();
        org.joda.time.Period period11 = period8.withPeriodType(periodType9);
        org.joda.time.Period period13 = period11.plusWeeks((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period15 = period13.withMonths((-2147483638));
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
    public void test01466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01466");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) 1, 7, (-8), 10, 8, (-2147483648), (int) 'a', 52);
    }

    @Test
    public void test01467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01467");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (-3));
    }

    @Test
    public void test01468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01468");
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
        org.joda.time.MutablePeriod mutablePeriod19 = mutablePeriod4.copy();
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod19);
    }

    @Test
    public void test01469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01469");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds4 = duration3.toStandardSeconds();
        java.lang.String str5 = seconds4.toString();
        org.joda.time.PeriodType periodType6 = seconds4.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withSecondsRemoved();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) (-1), (long) 100, periodType7, chronology8);
        mutablePeriod9.setYears((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod9.add((int) ' ', (int) (short) 1, (int) (byte) 10, 35, (-2147483638), 1, (int) (short) 0, 60);
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
    public void test01470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01470");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period7 = period4.withSeconds((int) ' ');
        org.joda.time.Period period8 = period1.minus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period10 = period1.plusHours((-1));
        org.joda.time.Period period12 = period1.withDays((int) 'a');
        org.joda.time.Period period14 = period12.withSeconds(52);
        int int15 = period12.getMillis();
        org.joda.time.Period period17 = period12.minusYears(0);
        int int18 = period12.getYears();
        org.joda.time.Period period20 = period12.plusMinutes(60);
        org.joda.time.Period period22 = period20.plusMillis((int) (byte) 10);
        org.joda.time.Duration duration23 = period20.toStandardDuration();
        long long24 = duration23.getMillis();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 8384460000L + "'", long24 == 8384460000L);
    }

    @Test
    public void test01471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01471");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod2.addYears((int) '4');
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod2.add((long) 100, chronology6);
        mutablePeriod2.add(1, 10, (int) 'a', 52, (int) (short) 100, 0, (int) (byte) 0, (int) (byte) 10);
        mutablePeriod2.clear();
        int int18 = mutablePeriod2.getSeconds();
        int int19 = mutablePeriod2.getSeconds();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = mutablePeriod2.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test01472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01472");
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
        mutablePeriod6.setWeeks((int) (byte) 10);
        org.joda.time.MutablePeriod mutablePeriod15 = mutablePeriod6.copy();
        int int16 = mutablePeriod6.getWeeks();
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutablePeriod6.add(readableDuration17);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(mutablePeriod15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test01473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01473");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        org.joda.time.Period period3 = mutablePeriod2.toPeriod();
        int int4 = period3.size();
        org.joda.time.Period period6 = period3.plusDays(1);
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.THREE;
        org.joda.time.Period period8 = period3.withFields((org.joda.time.ReadablePeriod) minutes7);
        java.lang.String str9 = minutes7.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = minutes7.getValue((-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -2147483648");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT3M" + "'", str9, "PT3M");
    }

    @Test
    public void test01474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01474");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(10L, (long) 2, chronology2);
    }

    @Test
    public void test01475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01475");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(600);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationFrom(readableInstant2);
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType7 = periodType6.withWeeksRemoved();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = duration5.toPeriod(periodType6, chronology8);
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.Weeks weeks11 = org.joda.time.Weeks.weeksIn(readableInterval10);
        org.joda.time.ReadableInterval readableInterval12 = null;
        org.joda.time.Weeks weeks13 = org.joda.time.Weeks.weeksIn(readableInterval12);
        boolean boolean14 = weeks11.isLessThan(weeks13);
        org.joda.time.Weeks weeks16 = weeks13.minus((int) (short) -1);
        org.joda.time.Weeks weeks18 = weeks16.multipliedBy(0);
        org.joda.time.Weeks weeks19 = null;
        boolean boolean20 = weeks16.isLessThan(weeks19);
        int int22 = weeks16.getValue((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Chronology chronology24 = null;
        boolean boolean25 = durationFieldType23.isSupported(chronology24);
        boolean boolean26 = weeks16.isSupported(durationFieldType23);
        org.joda.time.DurationFieldType durationFieldType27 = weeks16.getFieldType();
        boolean boolean28 = periodType6.isSupported(durationFieldType27);
        org.joda.time.PeriodType periodType29 = periodType6.withSecondsRemoved();
        org.joda.time.PeriodType periodType30 = periodType6.withMinutesRemoved();
        org.joda.time.PeriodType periodType31 = periodType6.withMonthsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period32 = duration3.toPeriod(periodType31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 362880000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
    }

    @Test
    public void test01476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01476");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = duration1.toPeriod(periodType2, chronology4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType8 = periodType7.withMonthsRemoved();
        org.joda.time.Period period9 = duration1.toPeriodTo(readableInstant6, periodType8);
        int int10 = period9.getHours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = period9.withYears(6);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test01477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01477");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period22 = periodFormatter20.parsePeriod("Weeks");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test01478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01478");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        java.util.Locale locale6 = periodFormatter2.getLocale();
        java.util.Locale locale7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter2.withLocale(locale7);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(540000L, (long) '4');
        java.lang.String str12 = mutablePeriod11.toString();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = mutablePeriod11.toDurationTo(readableInstant13);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod11, "PT-21474836M", 7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT-8M-59.948S" + "'", str12, "PT-8M-59.948S");
        org.junit.Assert.assertNotNull(duration14);
    }

    @Test
    public void test01479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01479");
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
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType13 = periodType12.withDaysRemoved();
        org.joda.time.PeriodType periodType14 = periodType13.withMonthsRemoved();
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType14);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter6.printTo(writer9, (org.joda.time.ReadablePeriod) period15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
    }

    @Test
    public void test01480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01480");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(1L, (long) (byte) -1, chronology2);
        int int4 = period3.getMillis();
        int int5 = period3.getMinutes();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test01481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01481");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Duration duration8 = duration1.minus((long) 3);
        org.joda.time.Duration duration9 = duration1.toDuration();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Interval interval11 = duration9.toIntervalFrom(readableInstant10);
        org.joda.time.Seconds seconds12 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval11);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(seconds12);
    }

    @Test
    public void test01482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01482");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) (-1));
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = duration1.toPeriodFrom(readableInstant2);
        org.joda.time.DurationFieldType[] durationFieldTypeArray4 = period3.getFieldTypes();
        org.joda.time.Period period6 = period3.plusMonths((-1073741824));
        org.joda.time.Days days7 = period3.toStandardDays();
        int int8 = period3.getYears();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(durationFieldTypeArray4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test01483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01483");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period5 = period3.withMillis((int) (byte) -1);
        org.joda.time.Weeks weeks6 = period5.toStandardWeeks();
        org.joda.time.Weeks weeks7 = weeks1.plus(weeks6);
        org.joda.time.Weeks weeks9 = weeks1.plus((int) (byte) 10);
        org.joda.time.Weeks weeks11 = weeks1.multipliedBy((-2147483648));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours12 = weeks11.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2147483648 * 168");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(weeks11);
    }

    @Test
    public void test01484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01484");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        org.joda.time.Period period3 = mutablePeriod2.toPeriod();
        int int4 = period3.size();
        org.joda.time.Period period6 = period3.plusDays(1);
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.THREE;
        org.joda.time.Period period8 = period3.withFields((org.joda.time.ReadablePeriod) minutes7);
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.parseMinutes("P0D");
        org.joda.time.Minutes minutes11 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType12 = minutes11.getPeriodType();
        int int13 = minutes11.getMinutes();
        java.lang.String str14 = minutes11.toString();
        org.joda.time.Minutes minutes15 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType16 = minutes15.getFieldType();
        java.lang.String str17 = minutes15.toString();
        boolean boolean18 = minutes11.isLessThan(minutes15);
        org.joda.time.Minutes minutes19 = minutes11.negated();
        org.joda.time.Minutes minutes21 = org.joda.time.Minutes.parseMinutes("P0D");
        org.joda.time.Minutes minutes23 = minutes21.dividedBy((int) '#');
        org.joda.time.Minutes minutes24 = minutes11.minus(minutes21);
        boolean boolean25 = minutes10.isGreaterThan(minutes21);
        org.joda.time.Minutes minutes26 = minutes7.minus(minutes21);
        org.joda.time.Duration duration27 = minutes7.toStandardDuration();
        org.joda.time.Minutes minutes29 = minutes7.plus((-1073741824));
        java.lang.String str30 = minutes7.toString();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT0M" + "'", str14, "PT0M");
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT-2147483648M" + "'", str17, "PT-2147483648M");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PT3M" + "'", str30, "PT3M");
    }

    @Test
    public void test01485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01485");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(0, (int) (short) 1, 1, 1, (int) (short) -1, (-3), (int) ' ', (int) ' ');
    }

    @Test
    public void test01486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01486");
        org.joda.time.Period period1 = org.joda.time.Period.months(1);
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType3 = minutes2.getFieldType();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DurationField durationField5 = durationFieldType3.getField(chronology4);
        org.joda.time.Period period7 = period1.withField(durationFieldType3, 0);
        int int8 = period1.getMinutes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test01487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01487");
        org.joda.time.Period period1 = org.joda.time.Period.days((-32));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01488");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType4 = null;
        int int5 = periodType3.indexOf(durationFieldType4);
        org.joda.time.PeriodType periodType6 = periodType3.withWeeksRemoved();
        org.joda.time.PeriodType periodType7 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType8 = periodType3.withYearsRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withSecondsRemoved();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType13 = periodType12.withWeeksRemoved();
        org.joda.time.PeriodType periodType14 = periodType13.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(readableInstant10, readableInstant11, periodType14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = new org.joda.time.Period((java.lang.Object) periodType8, periodType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
    }

    @Test
    public void test01489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01489");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) (byte) 100);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test01490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01490");
        org.joda.time.Period period2 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period2);
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(readableInstant5, readableDuration6);
        mutablePeriod7.setHours((int) (short) 100);
        boolean boolean10 = periodType4.equals((java.lang.Object) mutablePeriod7);
        org.joda.time.Duration duration11 = org.joda.time.Duration.ZERO;
        long long12 = duration11.getStandardDays();
        mutablePeriod7.add((org.joda.time.ReadableDuration) duration11);
        org.joda.time.Period period15 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days16 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period15);
        org.joda.time.PeriodType periodType17 = days16.getPeriodType();
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(readableInstant18, readableDuration19);
        mutablePeriod20.setHours((int) (short) 100);
        boolean boolean23 = periodType17.equals((java.lang.Object) mutablePeriod20);
        org.joda.time.Duration duration24 = org.joda.time.Duration.ZERO;
        long long25 = duration24.getStandardDays();
        mutablePeriod20.add((org.joda.time.ReadableDuration) duration24);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType29);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.weekyears();
        int int32 = period30.get(durationFieldType31);
        int int33 = mutablePeriod20.get(durationFieldType31);
        int int34 = mutablePeriod7.get(durationFieldType31);
        mutablePeriod7.setSeconds(100);
        org.joda.time.PeriodType periodType37 = mutablePeriod7.getPeriodType();
        org.joda.time.Period period38 = new org.joda.time.Period((long) 100, periodType37);
        org.joda.time.Chronology chronology39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period40 = new org.joda.time.Period((java.lang.Object) 100, chronology39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(periodType37);
    }

    @Test
    public void test01491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01491");
        org.joda.time.Hours hours0 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours2 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean3 = hours0.isGreaterThan(hours2);
        org.joda.time.Hours hours5 = hours0.minus((int) (byte) 0);
        org.joda.time.Hours hours7 = hours5.plus(0);
        org.joda.time.Hours hours8 = null;
        org.joda.time.Hours hours9 = hours7.plus(hours8);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hours7.getValue(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(hours9);
    }

    @Test
    public void test01492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01492");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("PeriodType[Seconds]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[Seconds]\" is malformed at \"eriodType[Seconds]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01493");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) -1);
        org.joda.time.Period period5 = period1.withMillis(0);
        org.joda.time.Period period7 = period1.minusYears(2);
        org.joda.time.Days days8 = org.joda.time.Days.ZERO;
        org.joda.time.Period period10 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days11 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Days days13 = days11.minus(10);
        boolean boolean14 = days8.isGreaterThan(days11);
        org.joda.time.Period period16 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days17 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Period period19 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days20 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period19);
        org.joda.time.PeriodType periodType21 = days20.getPeriodType();
        boolean boolean22 = days17.isGreaterThan(days20);
        org.joda.time.Period period24 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days25 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Days days26 = days20.minus(days25);
        int int27 = days20.size();
        org.joda.time.Days days28 = org.joda.time.Days.ZERO;
        org.joda.time.Period period30 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days31 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Days days33 = days31.minus(10);
        boolean boolean34 = days28.isGreaterThan(days31);
        org.joda.time.Days days35 = days20.minus(days31);
        org.joda.time.Days days36 = days8.minus(days31);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Chronology chronology38 = null;
        boolean boolean39 = durationFieldType37.isSupported(chronology38);
        int int40 = days8.get(durationFieldType37);
        org.joda.time.Period period42 = period1.withField(durationFieldType37, (int) (byte) 1);
        org.joda.time.Period period44 = period42.minusMinutes((int) ' ');
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(days35);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
    }

    @Test
    public void test01494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01494");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod2.addYears((int) '4');
        int int5 = mutablePeriod2.getYears();
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod2.add(1L, chronology7);
        mutablePeriod2.addYears((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test01495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01495");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes3 = minutes0.plus(minutes2);
        org.joda.time.DurationFieldType durationFieldType4 = minutes0.getFieldType();
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType6 = minutes5.getPeriodType();
        int int7 = minutes5.getMinutes();
        java.lang.String str8 = minutes5.toString();
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType10 = minutes9.getFieldType();
        java.lang.String str11 = minutes9.toString();
        boolean boolean12 = minutes5.isLessThan(minutes9);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 25);
        org.joda.time.Minutes minutes15 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) mutablePeriod14);
        org.joda.time.Minutes minutes17 = minutes15.minus((int) '4');
        org.joda.time.Minutes minutes18 = minutes5.plus(minutes17);
        java.lang.String str19 = minutes18.toString();
        org.joda.time.PeriodType periodType20 = minutes18.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((java.lang.Object) minutes0, periodType20);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod21.setHours(658);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT0M" + "'", str8, "PT0M");
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT-2147483648M" + "'", str11, "PT-2147483648M");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT-52M" + "'", str19, "PT-52M");
        org.junit.Assert.assertNotNull(periodType20);
    }

    @Test
    public void test01496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01496");
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
        org.joda.time.Period period38 = duration32.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod39 = period38.toMutablePeriod();
        mutablePeriod39.addSeconds(0);
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
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(mutablePeriod39);
    }

    @Test
    public void test01497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01497");
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
        java.util.Locale locale11 = periodFormatter8.getLocale();
        org.joda.time.format.PeriodPrinter periodPrinter12 = periodFormatter8.getPrinter();
        java.lang.StringBuffer stringBuffer13 = null;
        org.joda.time.Seconds seconds14 = org.joda.time.Seconds.TWO;
        org.joda.time.Duration duration15 = seconds14.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter8.printTo(stringBuffer13, (org.joda.time.ReadablePeriod) seconds14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(periodFormatter10);
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertNull(periodPrinter12);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(duration15);
    }

    @Test
    public void test01498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01498");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = period1.withSeconds((int) ' ');
        java.lang.String str5 = period1.toString();
        org.joda.time.Period period7 = period1.withYears(0);
        org.joda.time.Period period9 = period1.withYears((int) (byte) -1);
        org.joda.time.Period period11 = period9.withMonths(0);
        org.joda.time.Period period13 = period9.minusMinutes(2147483647);
        int int14 = period9.getMillis();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT1M" + "'", str5, "PT1M");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test01499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01499");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter2.getPrinter();
        boolean boolean5 = periodFormatter2.isParser();
        java.util.Locale locale6 = null;
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = periodFormatter7.parsePeriod("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(periodFormatter7);
    }

    @Test
    public void test01500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01500");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        java.lang.String str3 = seconds2.toString();
        org.joda.time.PeriodType periodType4 = seconds2.getPeriodType();
        org.joda.time.Weeks weeks5 = seconds2.toStandardWeeks();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT60S" + "'", str3, "PT60S");
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(weeks5);
    }
}

